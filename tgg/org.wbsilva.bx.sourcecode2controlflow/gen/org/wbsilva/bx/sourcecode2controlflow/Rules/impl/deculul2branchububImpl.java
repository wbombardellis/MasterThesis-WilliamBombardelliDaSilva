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
import org.wbsilva.bx.sourcecode2controlflow.Rules.deculul2branchubub;

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
 * An implementation of the model object '<em><b>deculul2branchubub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class deculul2branchububImpl extends AbstractRuleImpl implements deculul2branchubub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected deculul2branchububImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdeculul2branchubub();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment l, Assignment m, While a, Decision d, While b) {

		Object[] result1_black = deculul2branchububImpl
				.pattern_deculul2branchubub_0_1_initialbindings_blackBBBBBBB(this, match, l, m, a, d, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[m] = " + m + ", " + "[a] = " + a + ", "
					+ "[d] = " + d + ", " + "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = deculul2branchububImpl
				.pattern_deculul2branchubub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, l, m, a, d, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[m] = " + m + ", " + "[a] = " + a + ", "
					+ "[d] = " + d + ", " + "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (deculul2branchububImpl.pattern_deculul2branchubub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = deculul2branchububImpl
					.pattern_deculul2branchubub_0_4_collectelementstobetranslated_blackBBBBBB(match, l, m, a, d, b);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[l] = " + l + ", "
								+ "[m] = " + m + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
			}
			deculul2branchububImpl.pattern_deculul2branchubub_0_4_collectelementstobetranslated_greenBBBBBBFFFFFF(match,
					l, m, a, d, b);
			//nothing EMoflonEdge a__l____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge b__m____last = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge b__m____first = (EMoflonEdge) result4_green[11];

			Object[] result5_black = deculul2branchububImpl
					.pattern_deculul2branchubub_0_5_collectcontextelements_blackBBBBBB(match, l, m, a, d, b);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[l] = " + l + ", "
								+ "[m] = " + m + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
			}
			deculul2branchububImpl.pattern_deculul2branchubub_0_5_collectcontextelements_greenBB(match, d);

			// 
			deculul2branchububImpl.pattern_deculul2branchubub_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					l, m, a, d, b);
			return deculul2branchububImpl.pattern_deculul2branchubub_0_7_expressionF();
		} else {
			return deculul2branchububImpl.pattern_deculul2branchubub_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = deculul2branchububImpl
				.pattern_deculul2branchubub_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment l = (Assignment) result1_bindingAndBlack[0];
		S2B d2c = (S2B) result1_bindingAndBlack[1];
		Assignment m = (Assignment) result1_bindingAndBlack[2];
		While a = (While) result1_bindingAndBlack[3];
		Branch c = (Branch) result1_bindingAndBlack[4];
		Decision d = (Decision) result1_bindingAndBlack[5];
		While b = (While) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = deculul2branchububImpl
				.pattern_deculul2branchubub_1_1_performtransformation_greenBBFFBFBFFFFFB(l, m, a, c, b);
		S2N l2z = (S2N) result1_green[2];
		S2N m2w = (S2N) result1_green[3];
		Command w = (Command) result1_green[5];
		Branch y = (Branch) result1_green[7];
		Command z = (Command) result1_green[8];
		S2B a2x = (S2B) result1_green[9];
		Branch x = (Branch) result1_green[10];
		S2B b2y = (S2B) result1_green[11];

		Object[] result2_black = deculul2branchububImpl
				.pattern_deculul2branchubub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(l, m, l2z, m2w, a, w, y, z,
						a2x, x, b2y, b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", " + "[m] = " + m
					+ ", " + "[l2z] = " + l2z + ", " + "[m2w] = " + m2w + ", " + "[a] = " + a + ", " + "[w] = " + w
					+ ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", "
					+ "[b2y] = " + b2y + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = deculul2branchububImpl
				.pattern_deculul2branchubub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(l, m, l2z, m2w, a, w, y, z,
						a2x, x, b2y, b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = deculul2branchububImpl
				.pattern_deculul2branchubub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, l, d2c, m, l2z,
						m2w, a, w, c, y, z, a2x, x, b2y, d, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l] = " + l + ", " + "[d2c] = " + d2c + ", " + "[m] = " + m + ", " + "[l2z] = " + l2z
					+ ", " + "[m2w] = " + m2w + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ", "
					+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", "
					+ "[b2y] = " + b2y + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
		}
		deculul2branchububImpl
				.pattern_deculul2branchubub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(ruleresult,
						l, m, l2z, m2w, a, w, c, y, z, a2x, x, b2y, d, b);
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[34];

		// 
		// 
		deculul2branchububImpl.pattern_deculul2branchubub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, l, d2c, m, l2z, m2w, a, w, c, y, z, a2x, x, b2y, d, b);
		return deculul2branchububImpl.pattern_deculul2branchubub_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = deculul2branchububImpl
				.pattern_deculul2branchubub_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = deculul2branchububImpl
				.pattern_deculul2branchubub_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = deculul2branchububImpl.pattern_deculul2branchubub_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment l = (Assignment) result2_binding[0];
		Assignment m = (Assignment) result2_binding[1];
		While a = (While) result2_binding[2];
		Decision d = (Decision) result2_binding[3];
		While b = (While) result2_binding[4];
		for (Object[] result2_black : deculul2branchububImpl.pattern_deculul2branchubub_2_2_corematch_blackBFBBFBBB(l,
				m, a, d, b, match)) {
			S2B d2c = (S2B) result2_black[1];
			Branch c = (Branch) result2_black[4];
			// ForEach 
			for (Object[] result3_black : deculul2branchububImpl
					.pattern_deculul2branchubub_2_3_findcontext_blackBBBBBBB(l, d2c, m, a, c, d, b)) {
				Object[] result3_green = deculul2branchububImpl
						.pattern_deculul2branchubub_2_3_findcontext_greenBBBBBBBFFFFFFFFF(l, d2c, m, a, c, d, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = deculul2branchububImpl
						.pattern_deculul2branchubub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, l,
								d2c, m, a, c, d, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[l] = " + l + ", " + "[d2c] = "
							+ d2c + ", " + "[m] = " + m + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[d] = "
							+ d + ", " + "[b] = " + b + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (deculul2branchububImpl.pattern_deculul2branchubub_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = deculul2branchububImpl
							.pattern_deculul2branchubub_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					deculul2branchububImpl.pattern_deculul2branchubub_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return deculul2branchububImpl.pattern_deculul2branchubub_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment l, Assignment m, While a, Decision d, While b) {
		match.registerObject("l", l);
		match.registerObject("m", m);
		match.registerObject("a", a);
		match.registerObject("d", d);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment l, Assignment m, While a, Decision d, While b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment l, S2B d2c, Assignment m,
			While a, Branch c, Decision d, While b) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("m", m);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("b", b);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject l, EObject d2c, EObject m, EObject l2z,
			EObject m2w, EObject a, EObject w, EObject c, EObject y, EObject z, EObject a2x, EObject x, EObject b2y,
			EObject d, EObject b) {
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("b", b);

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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command w, Branch c, Branch y, Command z, Branch x) {

		Object[] result1_black = deculul2branchububImpl
				.pattern_deculul2branchubub_10_1_initialbindings_blackBBBBBBB(this, match, w, c, y, z, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[y] = " + y + ", "
					+ "[z] = " + z + ", " + "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = deculul2branchububImpl
				.pattern_deculul2branchubub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, w, c, y, z, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[y] = " + y + ", "
					+ "[z] = " + z + ", " + "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (deculul2branchububImpl.pattern_deculul2branchubub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = deculul2branchububImpl
					.pattern_deculul2branchubub_10_4_collectelementstobetranslated_blackBBBBBB(match, w, c, y, z, x);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[w] = " + w + ", "
								+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			deculul2branchububImpl.pattern_deculul2branchubub_10_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
					match, w, c, y, z, x);
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__y____next = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[11];

			Object[] result5_black = deculul2branchububImpl
					.pattern_deculul2branchubub_10_5_collectcontextelements_blackBBBBBB(match, w, c, y, z, x);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[w] = " + w + ", "
								+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			deculul2branchububImpl.pattern_deculul2branchubub_10_5_collectcontextelements_greenBB(match, c);

			// 
			deculul2branchububImpl.pattern_deculul2branchubub_10_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					w, c, y, z, x);
			return deculul2branchububImpl.pattern_deculul2branchubub_10_7_expressionF();
		} else {
			return deculul2branchububImpl.pattern_deculul2branchubub_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = deculul2branchububImpl
				.pattern_deculul2branchubub_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2B d2c = (S2B) result1_bindingAndBlack[0];
		Command w = (Command) result1_bindingAndBlack[1];
		Branch c = (Branch) result1_bindingAndBlack[2];
		Branch y = (Branch) result1_bindingAndBlack[3];
		Command z = (Command) result1_bindingAndBlack[4];
		Branch x = (Branch) result1_bindingAndBlack[5];
		Decision d = (Decision) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = deculul2branchububImpl
				.pattern_deculul2branchubub_11_1_performtransformation_greenFFFFFBBBFBFBF(w, y, z, x, d);
		Assignment l = (Assignment) result1_green[0];
		Assignment m = (Assignment) result1_green[1];
		S2N l2z = (S2N) result1_green[2];
		S2N m2w = (S2N) result1_green[3];
		While a = (While) result1_green[4];
		S2B a2x = (S2B) result1_green[8];
		S2B b2y = (S2B) result1_green[10];
		While b = (While) result1_green[12];

		Object[] result2_black = deculul2branchububImpl
				.pattern_deculul2branchubub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(l, m, l2z, m2w, a, w, y, z,
						a2x, x, b2y, b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", " + "[m] = " + m
					+ ", " + "[l2z] = " + l2z + ", " + "[m2w] = " + m2w + ", " + "[a] = " + a + ", " + "[w] = " + w
					+ ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", "
					+ "[b2y] = " + b2y + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = deculul2branchububImpl
				.pattern_deculul2branchubub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(l, m, l2z, m2w, a, w, y,
						z, a2x, x, b2y, b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = deculul2branchububImpl
				.pattern_deculul2branchubub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, l, d2c, m, l2z,
						m2w, a, w, c, y, z, a2x, x, b2y, d, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l] = " + l + ", " + "[d2c] = " + d2c + ", " + "[m] = " + m + ", " + "[l2z] = " + l2z
					+ ", " + "[m2w] = " + m2w + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ", "
					+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", "
					+ "[b2y] = " + b2y + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
		}
		deculul2branchububImpl
				.pattern_deculul2branchubub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, l, m, l2z, m2w, a, w, c, y, z, a2x, x, b2y, d, b);
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[34];

		// 
		// 
		deculul2branchububImpl.pattern_deculul2branchubub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, l, d2c, m, l2z, m2w, a, w, c, y, z, a2x, x, b2y, d, b);
		return deculul2branchububImpl.pattern_deculul2branchubub_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = deculul2branchububImpl
				.pattern_deculul2branchubub_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = deculul2branchububImpl
				.pattern_deculul2branchubub_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = deculul2branchububImpl
				.pattern_deculul2branchubub_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command w = (Command) result2_binding[0];
		Branch c = (Branch) result2_binding[1];
		Branch y = (Branch) result2_binding[2];
		Command z = (Command) result2_binding[3];
		Branch x = (Branch) result2_binding[4];
		for (Object[] result2_black : deculul2branchububImpl.pattern_deculul2branchubub_12_2_corematch_blackFBBBBBFB(w,
				c, y, z, x, match)) {
			S2B d2c = (S2B) result2_black[0];
			Decision d = (Decision) result2_black[6];
			// ForEach 
			for (Object[] result3_black : deculul2branchububImpl
					.pattern_deculul2branchubub_12_3_findcontext_blackBBBBBBB(d2c, w, c, y, z, x, d)) {
				Object[] result3_green = deculul2branchububImpl
						.pattern_deculul2branchubub_12_3_findcontext_greenBBBBBBBFFFFFFFFF(d2c, w, c, y, z, x, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = deculul2branchububImpl
						.pattern_deculul2branchubub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								d2c, w, c, y, z, x, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[w] = "
							+ w + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x
							+ ", " + "[d] = " + d + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (deculul2branchububImpl.pattern_deculul2branchubub_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = deculul2branchububImpl
							.pattern_deculul2branchubub_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					deculul2branchububImpl.pattern_deculul2branchubub_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return deculul2branchububImpl.pattern_deculul2branchubub_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command w, Branch c, Branch y, Command z, Branch x) {
		match.registerObject("w", w);
		match.registerObject("c", c);
		match.registerObject("y", y);
		match.registerObject("z", z);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command w, Branch c, Branch y, Command z, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B d2c, Command w, Branch c, Branch y,
			Command z, Branch x, Decision d) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject l, EObject d2c, EObject m, EObject l2z,
			EObject m2w, EObject a, EObject w, EObject c, EObject y, EObject z, EObject a2x, EObject x, EObject b2y,
			EObject d, EObject b) {
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("w").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_35(EMoflonEdge _edge_negative) {

		Object[] result1_bindingAndBlack = deculul2branchububImpl
				.pattern_deculul2branchubub_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = deculul2branchububImpl.pattern_deculul2branchubub_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : deculul2branchububImpl
				.pattern_deculul2branchubub_20_2_testcorematchandDECs_blackFFFFFB(_edge_negative)) {
			Command w = (Command) result2_black[0];
			Branch c = (Branch) result2_black[1];
			Branch y = (Branch) result2_black[2];
			Command z = (Command) result2_black[3];
			Branch x = (Branch) result2_black[4];
			Object[] result2_green = deculul2branchububImpl
					.pattern_deculul2branchubub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (deculul2branchububImpl
					.pattern_deculul2branchubub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, w, c, y, z, x)) {
				// 
				if (deculul2branchububImpl
						.pattern_deculul2branchubub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = deculul2branchububImpl
							.pattern_deculul2branchubub_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					deculul2branchububImpl.pattern_deculul2branchubub_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return deculul2branchububImpl.pattern_deculul2branchubub_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_35(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = deculul2branchububImpl
				.pattern_deculul2branchubub_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = deculul2branchububImpl.pattern_deculul2branchubub_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : deculul2branchububImpl
				.pattern_deculul2branchubub_21_2_testcorematchandDECs_blackFFFFFB(_edge_first)) {
			Assignment l = (Assignment) result2_black[0];
			Assignment m = (Assignment) result2_black[1];
			While a = (While) result2_black[2];
			Decision d = (Decision) result2_black[3];
			While b = (While) result2_black[4];
			Object[] result2_green = deculul2branchububImpl
					.pattern_deculul2branchubub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (deculul2branchububImpl
					.pattern_deculul2branchubub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, l, m, a, d, b)) {
				// 
				if (deculul2branchububImpl
						.pattern_deculul2branchubub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = deculul2branchububImpl
							.pattern_deculul2branchubub_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					deculul2branchububImpl.pattern_deculul2branchubub_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return deculul2branchububImpl.pattern_deculul2branchubub_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("deculul2branchubub");
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
		ruleResult.setRule("deculul2branchubub");
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

		Object[] result1_black = deculul2branchububImpl.pattern_deculul2branchubub_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = deculul2branchububImpl.pattern_deculul2branchubub_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = deculul2branchububImpl
				.pattern_deculul2branchubub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Assignment l = (Assignment) result2_bindingAndBlack[0];
		Assignment m = (Assignment) result2_bindingAndBlack[1];
		While a = (While) result2_bindingAndBlack[2];
		Command w = (Command) result2_bindingAndBlack[3];
		Branch c = (Branch) result2_bindingAndBlack[4];
		Branch y = (Branch) result2_bindingAndBlack[5];
		Command z = (Command) result2_bindingAndBlack[6];
		Branch x = (Branch) result2_bindingAndBlack[7];
		Decision d = (Decision) result2_bindingAndBlack[8];
		While b = (While) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = deculul2branchububImpl
				.pattern_deculul2branchubub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, l, m, a, w, c, y, z, x, d,
						b, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[l] = " + l + ", " + "[m] = " + m + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = "
					+ c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[d] = " + d + ", "
					+ "[b] = " + b + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (deculul2branchububImpl.pattern_deculul2branchubub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : deculul2branchububImpl
					.pattern_deculul2branchubub_24_5_matchcorrcontext_blackFBBBB(c, d, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[0];
				Object[] result5_green = deculul2branchububImpl
						.pattern_deculul2branchubub_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = deculul2branchububImpl
						.pattern_deculul2branchubub_24_6_createcorrespondence_blackBBBBBBBBBBB(l, m, a, w, c, y, z, x,
								d, b, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", "
							+ "[m] = " + m + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ", "
							+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[d] = " + d + ", "
							+ "[b] = " + b + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				deculul2branchububImpl.pattern_deculul2branchubub_24_6_createcorrespondence_greenBBFFBBBBFBFBB(l, m, a,
						w, y, z, x, b, ccMatch);
				//nothing S2N l2z = (S2N) result6_green[2];
				//nothing S2N m2w = (S2N) result6_green[3];
				//nothing S2B a2x = (S2B) result6_green[8];
				//nothing S2B b2y = (S2B) result6_green[10];

				Object[] result7_black = deculul2branchububImpl
						.pattern_deculul2branchubub_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				deculul2branchububImpl.pattern_deculul2branchubub_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return deculul2branchububImpl.pattern_deculul2branchubub_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Assignment l, Assignment m, While a, Command w, Branch c, Branch y, Command z,
			Branch x, Decision d, While b, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment l, Assignment m, While a, Decision d, While b) {// 
		Object[] result1_black = deculul2branchububImpl.pattern_deculul2branchubub_27_1_matchtggpattern_blackBBBBB(l, m,
				a, d, b);
		if (result1_black != null) {
			return deculul2branchububImpl.pattern_deculul2branchubub_27_2_expressionF();
		} else {
			return deculul2branchububImpl.pattern_deculul2branchubub_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command w, Branch c, Branch y, Command z, Branch x) {// 
		Object[] result1_black = deculul2branchububImpl.pattern_deculul2branchubub_28_1_matchtggpattern_blackBBBBB(w, c,
				y, z, x);
		if (result1_black != null) {
			return deculul2branchububImpl.pattern_deculul2branchubub_28_2_expressionF();
		} else {
			return deculul2branchububImpl.pattern_deculul2branchubub_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = deculul2branchububImpl.pattern_deculul2branchubub_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = deculul2branchububImpl.pattern_deculul2branchubub_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : deculul2branchububImpl
				.pattern_deculul2branchubub_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			S2B d2c = (S2B) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = deculul2branchububImpl
					.pattern_deculul2branchubub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d2c, c, d,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (deculul2branchububImpl.pattern_deculul2branchubub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = deculul2branchububImpl.pattern_deculul2branchubub_29_5_checknacs_blackBBB(d2c,
						c, d);
				if (result5_black != null) {

					Object[] result6_black = deculul2branchububImpl
							.pattern_deculul2branchubub_29_6_perform_blackBBBB(d2c, c, d, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2c] = " + d2c + ", "
								+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					deculul2branchububImpl.pattern_deculul2branchubub_29_6_perform_greenFFFFFFBFFFFFBFB(c, d,
							ruleResult);
					//nothing Assignment l = (Assignment) result6_green[0];
					//nothing Assignment m = (Assignment) result6_green[1];
					//nothing S2N l2z = (S2N) result6_green[2];
					//nothing S2N m2w = (S2N) result6_green[3];
					//nothing While a = (While) result6_green[4];
					//nothing Command w = (Command) result6_green[5];
					//nothing Branch y = (Branch) result6_green[7];
					//nothing Command z = (Command) result6_green[8];
					//nothing S2B a2x = (S2B) result6_green[9];
					//nothing Branch x = (Branch) result6_green[10];
					//nothing S2B b2y = (S2B) result6_green[11];
					//nothing While b = (While) result6_green[13];

				} else {
				}

			} else {
			}

		}
		return deculul2branchububImpl.pattern_deculul2branchubub_29_7_expressionFB(ruleResult);
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
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_ASSIGNMENT_WHILE_DECISION_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.DECULUL2BRANCHUBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_ASSIGNMENT_WHILE_DECISION_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5));
			return null;
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_ASSIGNMENT_WHILE_DECISION_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_S2B_ASSIGNMENT_WHILE_BRANCH_DECISION_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(S2B) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5), (Decision) arguments.get(6), (While) arguments.get(7));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.DECULUL2BRANCHUBUB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.DECULUL2BRANCHUBUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_COMMAND_BRANCH_BRANCH_COMMAND_BRANCH_DECISION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Command) arguments.get(5), (Branch) arguments.get(6), (Decision) arguments.get(7));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.DECULUL2BRANCHUBUB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_35__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_35((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_35__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_35((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_ASSIGNMENT_WHILE_COMMAND_BRANCH_BRANCH_COMMAND_BRANCH_DECISION_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5), (Command) arguments.get(6), (Branch) arguments.get(7),
					(Decision) arguments.get(8), (While) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___CHECK_DEC_FWD__ASSIGNMENT_ASSIGNMENT_WHILE_DECISION_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.DECULUL2BRANCHUBUB___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECULUL2BRANCHUBUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECULUL2BRANCHUBUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (Decision) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECULUL2BRANCHUBUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_deculul2branchubub_0_1_initialbindings_blackBBBBBBB(deculul2branchubub _this,
			Match match, Assignment l, Assignment m, While a, Decision d, While b) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { _this, match, l, m, a, d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_0_2_SolveCSP_bindingFBBBBBBB(deculul2branchubub _this,
			Match match, Assignment l, Assignment m, While a, Decision d, While b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, l, m, a, d, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, l, m, a, d, b };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculul2branchubub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			deculul2branchubub _this, Match match, Assignment l, Assignment m, While a, Decision d, While b) {
		Object[] result_pattern_deculul2branchubub_0_2_SolveCSP_binding = pattern_deculul2branchubub_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, l, m, a, d, b);
		if (result_pattern_deculul2branchubub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculul2branchubub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_deculul2branchubub_0_2_SolveCSP_black = pattern_deculul2branchubub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_deculul2branchubub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, l, m, a, d, b };
			}
		}
		return null;
	}

	public static final boolean pattern_deculul2branchubub_0_3_CheckCSP_expressionFBB(deculul2branchubub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			Assignment l, Assignment m, While a, Decision d, While b) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, l, m, a, d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_0_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
			Match match, Assignment l, Assignment m, While a, Decision d, While b) {
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(m);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		String a__l____first_name_prime = "first";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String b__m____last_name_prime = "last";
		String b__m____first_name_prime = "first";
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____first);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____last);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____first);
		a__l____first.setName(a__l____first_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		return new Object[] { match, l, m, a, d, b, a__l____first, a__l____last, d__b____negative, d__a____positive,
				b__m____last, b__m____first };
	}

	public static final Object[] pattern_deculul2branchubub_0_5_collectcontextelements_blackBBBBBB(Match match,
			Assignment l, Assignment m, While a, Decision d, While b) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				return new Object[] { match, l, m, a, d, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_0_5_collectcontextelements_greenBB(Match match,
			Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_deculul2branchubub_0_6_registerobjectstomatch_expressionBBBBBBB(
			deculul2branchubub _this, Match match, Assignment l, Assignment m, While a, Decision d, While b) {
		_this.registerObjectsToMatch_FWD(match, l, m, a, d, b);

	}

	public static final boolean pattern_deculul2branchubub_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_deculul2branchubub_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("l");
		EObject _localVariable_1 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("m");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject _localVariable_4 = isApplicableMatch.getObject("c");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject _localVariable_6 = isApplicableMatch.getObject("b");
		EObject tmpL = _localVariable_0;
		EObject tmpD2c = _localVariable_1;
		EObject tmpM = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpD = _localVariable_5;
		EObject tmpB = _localVariable_6;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpD2c instanceof S2B) {
				S2B d2c = (S2B) tmpD2c;
				if (tmpM instanceof Assignment) {
					Assignment m = (Assignment) tmpM;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								if (tmpB instanceof While) {
									While b = (While) tmpB;
									return new Object[] { l, d2c, m, a, c, d, b, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_1_1_performtransformation_blackBBBBBBBFBB(Assignment l,
			S2B d2c, Assignment m, While a, Branch c, Decision d, While b, deculul2branchubub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { l, d2c, m, a, c, d, b, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			deculul2branchubub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_deculul2branchubub_1_1_performtransformation_binding = pattern_deculul2branchubub_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_deculul2branchubub_1_1_performtransformation_binding != null) {
			Assignment l = (Assignment) result_pattern_deculul2branchubub_1_1_performtransformation_binding[0];
			S2B d2c = (S2B) result_pattern_deculul2branchubub_1_1_performtransformation_binding[1];
			Assignment m = (Assignment) result_pattern_deculul2branchubub_1_1_performtransformation_binding[2];
			While a = (While) result_pattern_deculul2branchubub_1_1_performtransformation_binding[3];
			Branch c = (Branch) result_pattern_deculul2branchubub_1_1_performtransformation_binding[4];
			Decision d = (Decision) result_pattern_deculul2branchubub_1_1_performtransformation_binding[5];
			While b = (While) result_pattern_deculul2branchubub_1_1_performtransformation_binding[6];

			Object[] result_pattern_deculul2branchubub_1_1_performtransformation_black = pattern_deculul2branchubub_1_1_performtransformation_blackBBBBBBBFBB(
					l, d2c, m, a, c, d, b, _this, isApplicableMatch);
			if (result_pattern_deculul2branchubub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_deculul2branchubub_1_1_performtransformation_black[7];

				return new Object[] { l, d2c, m, a, c, d, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_1_1_performtransformation_greenBBFFBFBFFFFFB(Assignment l,
			Assignment m, While a, Branch c, While b) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setSource(l);
		m2w.setSource(m);
		m2w.setTarget(w);
		c.setNegative(y);
		w.setNext(y);
		y.setPositive(w);
		l2z.setTarget(z);
		a2x.setSource(a);
		c.setPositive(x);
		x.setPositive(z);
		a2x.setTarget(x);
		z.setNext(x);
		b2y.setTarget(y);
		b2y.setSource(b);
		return new Object[] { l, m, l2z, m2w, a, w, c, y, z, a2x, x, b2y, b };
	}

	public static final Object[] pattern_deculul2branchubub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(
			Assignment l, Assignment m, S2N l2z, S2N m2w, While a, Command w, Branch y, Command z, S2B a2x, Branch x,
			S2B b2y, While b) {
		if (!l.equals(m)) {
			if (!l2z.equals(m2w)) {
				if (!a.equals(b)) {
					if (!w.equals(z)) {
						if (!a2x.equals(b2y)) {
							if (!x.equals(y)) {
								return new Object[] { l, m, l2z, m2w, a, w, y, z, a2x, x, b2y, b };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(
			Assignment l, Assignment m, S2N l2z, S2N m2w, While a, Command w, Branch y, Command z, S2B a2x, Branch x,
			S2B b2y, While b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getTranslatedElements().add(m);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(w);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(b);
		return new Object[] { ruleresult, l, m, l2z, m2w, a, w, y, z, a2x, x, b2y, b };
	}

	public static final Object[] pattern_deculul2branchubub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l, EObject d2c, EObject m, EObject l2z, EObject m2w, EObject a,
			EObject w, EObject c, EObject y, EObject z, EObject a2x, EObject x, EObject b2y, EObject d, EObject b) {
		if (!l.equals(m)) {
			if (!l.equals(l2z)) {
				if (!l.equals(m2w)) {
					if (!l.equals(w)) {
						if (!l.equals(y)) {
							if (!l.equals(z)) {
								if (!l.equals(x)) {
									if (!d2c.equals(l)) {
										if (!d2c.equals(m)) {
											if (!d2c.equals(l2z)) {
												if (!d2c.equals(m2w)) {
													if (!d2c.equals(w)) {
														if (!d2c.equals(y)) {
															if (!d2c.equals(z)) {
																if (!d2c.equals(x)) {
																	if (!m.equals(m2w)) {
																		if (!m.equals(w)) {
																			if (!m.equals(y)) {
																				if (!m.equals(z)) {
																					if (!m.equals(x)) {
																						if (!l2z.equals(m)) {
																							if (!l2z.equals(m2w)) {
																								if (!l2z.equals(w)) {
																									if (!l2z.equals(
																											y)) {
																										if (!l2z.equals(
																												z)) {
																											if (!l2z.equals(
																													x)) {
																												if (!m2w.equals(
																														w)) {
																													if (!m2w.equals(
																															y)) {
																														if (!m2w.equals(
																																z)) {
																															if (!m2w.equals(
																																	x)) {
																																if (!a.equals(
																																		l)) {
																																	if (!a.equals(
																																			d2c)) {
																																		if (!a.equals(
																																				m)) {
																																			if (!a.equals(
																																					l2z)) {
																																				if (!a.equals(
																																						m2w)) {
																																					if (!a.equals(
																																							w)) {
																																						if (!a.equals(
																																								c)) {
																																							if (!a.equals(
																																									y)) {
																																								if (!a.equals(
																																										z)) {
																																									if (!a.equals(
																																											a2x)) {
																																										if (!a.equals(
																																												x)) {
																																											if (!a.equals(
																																													b2y)) {
																																												if (!a.equals(
																																														d)) {
																																													if (!a.equals(
																																															b)) {
																																														if (!w.equals(
																																																y)) {
																																															if (!w.equals(
																																																	z)) {
																																																if (!w.equals(
																																																		x)) {
																																																	if (!c.equals(
																																																			l)) {
																																																		if (!c.equals(
																																																				d2c)) {
																																																			if (!c.equals(
																																																					m)) {
																																																				if (!c.equals(
																																																						l2z)) {
																																																					if (!c.equals(
																																																							m2w)) {
																																																						if (!c.equals(
																																																								w)) {
																																																							if (!c.equals(
																																																									y)) {
																																																								if (!c.equals(
																																																										z)) {
																																																									if (!c.equals(
																																																											x)) {
																																																										if (!c.equals(
																																																												d)) {
																																																											if (!y.equals(
																																																													z)) {
																																																												if (!a2x.equals(
																																																														l)) {
																																																													if (!a2x.equals(
																																																															d2c)) {
																																																														if (!a2x.equals(
																																																																m)) {
																																																															if (!a2x.equals(
																																																																	l2z)) {
																																																																if (!a2x.equals(
																																																																		m2w)) {
																																																																	if (!a2x.equals(
																																																																			w)) {
																																																																		if (!a2x.equals(
																																																																				c)) {
																																																																			if (!a2x.equals(
																																																																					y)) {
																																																																				if (!a2x.equals(
																																																																						z)) {
																																																																					if (!a2x.equals(
																																																																							x)) {
																																																																						if (!a2x.equals(
																																																																								b2y)) {
																																																																							if (!a2x.equals(
																																																																									d)) {
																																																																								if (!a2x.equals(
																																																																										b)) {
																																																																									if (!x.equals(
																																																																											y)) {
																																																																										if (!x.equals(
																																																																												z)) {
																																																																											if (!b2y.equals(
																																																																													l)) {
																																																																												if (!b2y.equals(
																																																																														d2c)) {
																																																																													if (!b2y.equals(
																																																																															m)) {
																																																																														if (!b2y.equals(
																																																																																l2z)) {
																																																																															if (!b2y.equals(
																																																																																	m2w)) {
																																																																																if (!b2y.equals(
																																																																																		w)) {
																																																																																	if (!b2y.equals(
																																																																																			c)) {
																																																																																		if (!b2y.equals(
																																																																																				y)) {
																																																																																			if (!b2y.equals(
																																																																																					z)) {
																																																																																				if (!b2y.equals(
																																																																																						x)) {
																																																																																					if (!b2y.equals(
																																																																																							d)) {
																																																																																						if (!d.equals(
																																																																																								l)) {
																																																																																							if (!d.equals(
																																																																																									d2c)) {
																																																																																								if (!d.equals(
																																																																																										m)) {
																																																																																									if (!d.equals(
																																																																																											l2z)) {
																																																																																										if (!d.equals(
																																																																																												m2w)) {
																																																																																											if (!d.equals(
																																																																																													w)) {
																																																																																												if (!d.equals(
																																																																																														y)) {
																																																																																													if (!d.equals(
																																																																																															z)) {
																																																																																														if (!d.equals(
																																																																																																x)) {
																																																																																															if (!b.equals(
																																																																																																	l)) {
																																																																																																if (!b.equals(
																																																																																																		d2c)) {
																																																																																																	if (!b.equals(
																																																																																																			m)) {
																																																																																																		if (!b.equals(
																																																																																																				l2z)) {
																																																																																																			if (!b.equals(
																																																																																																					m2w)) {
																																																																																																				if (!b.equals(
																																																																																																						w)) {
																																																																																																					if (!b.equals(
																																																																																																							c)) {
																																																																																																						if (!b.equals(
																																																																																																								y)) {
																																																																																																							if (!b.equals(
																																																																																																									z)) {
																																																																																																								if (!b.equals(
																																																																																																										x)) {
																																																																																																									if (!b.equals(
																																																																																																											b2y)) {
																																																																																																										if (!b.equals(
																																																																																																												d)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													l,
																																																																																																													d2c,
																																																																																																													m,
																																																																																																													l2z,
																																																																																																													m2w,
																																																																																																													a,
																																																																																																													w,
																																																																																																													c,
																																																																																																													y,
																																																																																																													z,
																																																																																																													a2x,
																																																																																																													x,
																																																																																																													b2y,
																																																																																																													d,
																																																																																																													b };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_deculul2branchubub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l, EObject m, EObject l2z, EObject m2w, EObject a, EObject w,
			EObject c, EObject y, EObject z, EObject a2x, EObject x, EObject b2y, EObject d, EObject b) {
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "deculul2branchubub";
		String l2z__l____source_name_prime = "source";
		String m2w__m____source_name_prime = "source";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String m2w__w____target_name_prime = "target";
		String a__l____first_name_prime = "first";
		String w__y____next_name_prime = "next";
		String y__w____positive_name_prime = "positive";
		String l2z__z____target_name_prime = "target";
		String x__z____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String b2y__y____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String b__m____last_name_prime = "last";
		String b2y__b____source_name_prime = "source";
		String z__x____next_name_prime = "next";
		String b__m____first_name_prime = "first";
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____first);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(w__y____next);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		ruleresult.getCreatedEdges().add(y__w____positive);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getCreatedEdges().add(x__z____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____last);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		return new Object[] { ruleresult, l, m, l2z, m2w, a, w, c, y, z, a2x, x, b2y, d, b, l2z__l____source,
				m2w__m____source, c__y____negative, c__x____positive, m2w__w____target, a__l____first, w__y____next,
				y__w____positive, l2z__z____target, x__z____positive, a2x__x____target, a2x__a____source, a__l____last,
				d__b____negative, b2y__y____target, d__a____positive, b__m____last, b2y__b____source, z__x____next,
				b__m____first };
	}

	public static final void pattern_deculul2branchubub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			deculul2branchubub _this, PerformRuleResult ruleresult, EObject l, EObject d2c, EObject m, EObject l2z,
			EObject m2w, EObject a, EObject w, EObject c, EObject y, EObject z, EObject a2x, EObject x, EObject b2y,
			EObject d, EObject b) {
		_this.registerObjects_FWD(ruleresult, l, d2c, m, l2z, m2w, a, w, c, y, z, a2x, x, b2y, d, b);

	}

	public static final PerformRuleResult pattern_deculul2branchubub_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_2_1_preparereturnvalue_bindingFB(deculul2branchubub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_2_1_preparereturnvalue_blackFBB(EClass eClass,
			deculul2branchubub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_2_1_preparereturnvalue_bindingAndBlackFFB(
			deculul2branchubub _this) {
		Object[] result_pattern_deculul2branchubub_2_1_preparereturnvalue_binding = pattern_deculul2branchubub_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_deculul2branchubub_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_deculul2branchubub_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_deculul2branchubub_2_1_preparereturnvalue_black = pattern_deculul2branchubub_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_deculul2branchubub_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_deculul2branchubub_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "deculul2branchubub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_deculul2branchubub_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("l");
		EObject _localVariable_1 = match.getObject("m");
		EObject _localVariable_2 = match.getObject("a");
		EObject _localVariable_3 = match.getObject("d");
		EObject _localVariable_4 = match.getObject("b");
		EObject tmpL = _localVariable_0;
		EObject tmpM = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpB = _localVariable_4;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpM instanceof Assignment) {
				Assignment m = (Assignment) tmpM;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpB instanceof While) {
							While b = (While) tmpB;
							return new Object[] { l, m, a, d, b, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_2_2_corematch_blackBFBBFBBB(Assignment l,
			Assignment m, While a, Decision d, While b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class,
						"source")) {
					Branch c = d2c.getTarget();
					if (c != null) {
						_result.add(new Object[] { l, d2c, m, a, c, d, b, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_2_3_findcontext_blackBBBBBBB(Assignment l,
			S2B d2c, Assignment m, While a, Branch c, Decision d, While b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (c.equals(d2c.getTarget())) {
					if (l.equals(a.getFirst())) {
						if (l.equals(a.getLast())) {
							if (b.equals(d.getNegative())) {
								if (d.equals(d2c.getSource())) {
									if (a.equals(d.getPositive())) {
										if (m.equals(b.getLast())) {
											if (m.equals(b.getFirst())) {
												_result.add(new Object[] { l, d2c, m, a, c, d, b });
											}
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

	public static final Object[] pattern_deculul2branchubub_2_3_findcontext_greenBBBBBBBFFFFFFFFF(Assignment l, S2B d2c,
			Assignment m, While a, Branch c, Decision d, While b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String a__l____first_name_prime = "first";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String b__m____last_name_prime = "last";
		String b__m____first_name_prime = "first";
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(m);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(b);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____first);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____last);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____first);
		d2c__c____target.setName(d2c__c____target_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		return new Object[] { l, d2c, m, a, c, d, b, isApplicableMatch, d2c__c____target, a__l____first, a__l____last,
				d__b____negative, d2c__d____source, d__a____positive, b__m____last, b__m____first };
	}

	public static final Object[] pattern_deculul2branchubub_2_4_solveCSP_bindingFBBBBBBBBB(deculul2branchubub _this,
			IsApplicableMatch isApplicableMatch, Assignment l, S2B d2c, Assignment m, While a, Branch c, Decision d,
			While b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, l, d2c, m, a, c, d, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, l, d2c, m, a, c, d, b };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculul2branchubub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			deculul2branchubub _this, IsApplicableMatch isApplicableMatch, Assignment l, S2B d2c, Assignment m, While a,
			Branch c, Decision d, While b) {
		Object[] result_pattern_deculul2branchubub_2_4_solveCSP_binding = pattern_deculul2branchubub_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, l, d2c, m, a, c, d, b);
		if (result_pattern_deculul2branchubub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculul2branchubub_2_4_solveCSP_binding[0];

			Object[] result_pattern_deculul2branchubub_2_4_solveCSP_black = pattern_deculul2branchubub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_deculul2branchubub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, l, d2c, m, a, c, d, b };
			}
		}
		return null;
	}

	public static final boolean pattern_deculul2branchubub_2_5_checkCSP_expressionFBB(deculul2branchubub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_deculul2branchubub_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "deculul2branchubub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_deculul2branchubub_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_10_1_initialbindings_blackBBBBBBB(deculul2branchubub _this,
			Match match, Command w, Branch c, Branch y, Command z, Branch x) {
		if (!w.equals(z)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					if (!x.equals(y)) {
						return new Object[] { _this, match, w, c, y, z, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_10_2_SolveCSP_bindingFBBBBBBB(deculul2branchubub _this,
			Match match, Command w, Branch c, Branch y, Command z, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, w, c, y, z, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, c, y, z, x };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculul2branchubub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			deculul2branchubub _this, Match match, Command w, Branch c, Branch y, Command z, Branch x) {
		Object[] result_pattern_deculul2branchubub_10_2_SolveCSP_binding = pattern_deculul2branchubub_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, w, c, y, z, x);
		if (result_pattern_deculul2branchubub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculul2branchubub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_deculul2branchubub_10_2_SolveCSP_black = pattern_deculul2branchubub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_deculul2branchubub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, c, y, z, x };
			}
		}
		return null;
	}

	public static final boolean pattern_deculul2branchubub_10_3_CheckCSP_expressionFBB(deculul2branchubub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_10_4_collectelementstobetranslated_blackBBBBBB(Match match,
			Command w, Branch c, Branch y, Command z, Branch x) {
		if (!w.equals(z)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					if (!x.equals(y)) {
						return new Object[] { match, w, c, y, z, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_10_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
			Match match, Command w, Branch c, Branch y, Command z, Branch x) {
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(w);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String w__y____next_name_prime = "next";
		String y__w____positive_name_prime = "positive";
		String x__z____positive_name_prime = "positive";
		String z__x____next_name_prime = "next";
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(w__y____next);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		match.getToBeTranslatedEdges().add(y__w____positive);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		match.getToBeTranslatedEdges().add(x__z____positive);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		return new Object[] { match, w, c, y, z, x, c__y____negative, c__x____positive, w__y____next, y__w____positive,
				x__z____positive, z__x____next };
	}

	public static final Object[] pattern_deculul2branchubub_10_5_collectcontextelements_blackBBBBBB(Match match,
			Command w, Branch c, Branch y, Command z, Branch x) {
		if (!w.equals(z)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					if (!x.equals(y)) {
						return new Object[] { match, w, c, y, z, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_deculul2branchubub_10_6_registerobjectstomatch_expressionBBBBBBB(
			deculul2branchubub _this, Match match, Command w, Branch c, Branch y, Command z, Branch x) {
		_this.registerObjectsToMatch_BWD(match, w, c, y, z, x);

	}

	public static final boolean pattern_deculul2branchubub_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_deculul2branchubub_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("y");
		EObject _localVariable_4 = isApplicableMatch.getObject("z");
		EObject _localVariable_5 = isApplicableMatch.getObject("x");
		EObject _localVariable_6 = isApplicableMatch.getObject("d");
		EObject tmpD2c = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpX = _localVariable_5;
		EObject tmpD = _localVariable_6;
		if (tmpD2c instanceof S2B) {
			S2B d2c = (S2B) tmpD2c;
			if (tmpW instanceof Command) {
				Command w = (Command) tmpW;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpY instanceof Branch) {
						Branch y = (Branch) tmpY;
						if (tmpZ instanceof Command) {
							Command z = (Command) tmpZ;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								if (tmpD instanceof Decision) {
									Decision d = (Decision) tmpD;
									return new Object[] { d2c, w, c, y, z, x, d, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_11_1_performtransformation_blackBBBBBBBFBB(S2B d2c,
			Command w, Branch c, Branch y, Command z, Branch x, Decision d, deculul2branchubub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!w.equals(z)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					if (!x.equals(y)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { d2c, w, c, y, z, x, d, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			deculul2branchubub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_deculul2branchubub_11_1_performtransformation_binding = pattern_deculul2branchubub_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_deculul2branchubub_11_1_performtransformation_binding != null) {
			S2B d2c = (S2B) result_pattern_deculul2branchubub_11_1_performtransformation_binding[0];
			Command w = (Command) result_pattern_deculul2branchubub_11_1_performtransformation_binding[1];
			Branch c = (Branch) result_pattern_deculul2branchubub_11_1_performtransformation_binding[2];
			Branch y = (Branch) result_pattern_deculul2branchubub_11_1_performtransformation_binding[3];
			Command z = (Command) result_pattern_deculul2branchubub_11_1_performtransformation_binding[4];
			Branch x = (Branch) result_pattern_deculul2branchubub_11_1_performtransformation_binding[5];
			Decision d = (Decision) result_pattern_deculul2branchubub_11_1_performtransformation_binding[6];

			Object[] result_pattern_deculul2branchubub_11_1_performtransformation_black = pattern_deculul2branchubub_11_1_performtransformation_blackBBBBBBBFBB(
					d2c, w, c, y, z, x, d, _this, isApplicableMatch);
			if (result_pattern_deculul2branchubub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_deculul2branchubub_11_1_performtransformation_black[7];

				return new Object[] { d2c, w, c, y, z, x, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_11_1_performtransformation_greenFFFFFBBBFBFBF(Command w,
			Branch y, Command z, Branch x, Decision d) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		l2z.setSource(l);
		l2z.setTarget(z);
		m2w.setSource(m);
		m2w.setTarget(w);
		a.setFirst(l);
		a.setLast(l);
		d.setPositive(a);
		a2x.setTarget(x);
		a2x.setSource(a);
		b2y.setTarget(y);
		d.setNegative(b);
		b.setLast(m);
		b2y.setSource(b);
		b.setFirst(m);
		return new Object[] { l, m, l2z, m2w, a, w, y, z, a2x, x, b2y, d, b };
	}

	public static final Object[] pattern_deculul2branchubub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(
			Assignment l, Assignment m, S2N l2z, S2N m2w, While a, Command w, Branch y, Command z, S2B a2x, Branch x,
			S2B b2y, While b) {
		if (!l.equals(m)) {
			if (!l2z.equals(m2w)) {
				if (!a.equals(b)) {
					if (!w.equals(z)) {
						if (!a2x.equals(b2y)) {
							if (!x.equals(y)) {
								return new Object[] { l, m, l2z, m2w, a, w, y, z, a2x, x, b2y, b };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(
			Assignment l, Assignment m, S2N l2z, S2N m2w, While a, Command w, Branch y, Command z, S2B a2x, Branch x,
			S2B b2y, While b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedElements().add(m);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(w);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(b);
		return new Object[] { ruleresult, l, m, l2z, m2w, a, w, y, z, a2x, x, b2y, b };
	}

	public static final Object[] pattern_deculul2branchubub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l, EObject d2c, EObject m, EObject l2z, EObject m2w, EObject a,
			EObject w, EObject c, EObject y, EObject z, EObject a2x, EObject x, EObject b2y, EObject d, EObject b) {
		if (!l.equals(m)) {
			if (!l.equals(l2z)) {
				if (!l.equals(m2w)) {
					if (!l.equals(w)) {
						if (!l.equals(y)) {
							if (!l.equals(z)) {
								if (!l.equals(x)) {
									if (!d2c.equals(l)) {
										if (!d2c.equals(m)) {
											if (!d2c.equals(l2z)) {
												if (!d2c.equals(m2w)) {
													if (!d2c.equals(w)) {
														if (!d2c.equals(y)) {
															if (!d2c.equals(z)) {
																if (!d2c.equals(x)) {
																	if (!m.equals(m2w)) {
																		if (!m.equals(w)) {
																			if (!m.equals(y)) {
																				if (!m.equals(z)) {
																					if (!m.equals(x)) {
																						if (!l2z.equals(m)) {
																							if (!l2z.equals(m2w)) {
																								if (!l2z.equals(w)) {
																									if (!l2z.equals(
																											y)) {
																										if (!l2z.equals(
																												z)) {
																											if (!l2z.equals(
																													x)) {
																												if (!m2w.equals(
																														w)) {
																													if (!m2w.equals(
																															y)) {
																														if (!m2w.equals(
																																z)) {
																															if (!m2w.equals(
																																	x)) {
																																if (!a.equals(
																																		l)) {
																																	if (!a.equals(
																																			d2c)) {
																																		if (!a.equals(
																																				m)) {
																																			if (!a.equals(
																																					l2z)) {
																																				if (!a.equals(
																																						m2w)) {
																																					if (!a.equals(
																																							w)) {
																																						if (!a.equals(
																																								c)) {
																																							if (!a.equals(
																																									y)) {
																																								if (!a.equals(
																																										z)) {
																																									if (!a.equals(
																																											a2x)) {
																																										if (!a.equals(
																																												x)) {
																																											if (!a.equals(
																																													b2y)) {
																																												if (!a.equals(
																																														d)) {
																																													if (!a.equals(
																																															b)) {
																																														if (!w.equals(
																																																y)) {
																																															if (!w.equals(
																																																	z)) {
																																																if (!w.equals(
																																																		x)) {
																																																	if (!c.equals(
																																																			l)) {
																																																		if (!c.equals(
																																																				d2c)) {
																																																			if (!c.equals(
																																																					m)) {
																																																				if (!c.equals(
																																																						l2z)) {
																																																					if (!c.equals(
																																																							m2w)) {
																																																						if (!c.equals(
																																																								w)) {
																																																							if (!c.equals(
																																																									y)) {
																																																								if (!c.equals(
																																																										z)) {
																																																									if (!c.equals(
																																																											x)) {
																																																										if (!c.equals(
																																																												d)) {
																																																											if (!y.equals(
																																																													z)) {
																																																												if (!a2x.equals(
																																																														l)) {
																																																													if (!a2x.equals(
																																																															d2c)) {
																																																														if (!a2x.equals(
																																																																m)) {
																																																															if (!a2x.equals(
																																																																	l2z)) {
																																																																if (!a2x.equals(
																																																																		m2w)) {
																																																																	if (!a2x.equals(
																																																																			w)) {
																																																																		if (!a2x.equals(
																																																																				c)) {
																																																																			if (!a2x.equals(
																																																																					y)) {
																																																																				if (!a2x.equals(
																																																																						z)) {
																																																																					if (!a2x.equals(
																																																																							x)) {
																																																																						if (!a2x.equals(
																																																																								b2y)) {
																																																																							if (!a2x.equals(
																																																																									d)) {
																																																																								if (!a2x.equals(
																																																																										b)) {
																																																																									if (!x.equals(
																																																																											y)) {
																																																																										if (!x.equals(
																																																																												z)) {
																																																																											if (!b2y.equals(
																																																																													l)) {
																																																																												if (!b2y.equals(
																																																																														d2c)) {
																																																																													if (!b2y.equals(
																																																																															m)) {
																																																																														if (!b2y.equals(
																																																																																l2z)) {
																																																																															if (!b2y.equals(
																																																																																	m2w)) {
																																																																																if (!b2y.equals(
																																																																																		w)) {
																																																																																	if (!b2y.equals(
																																																																																			c)) {
																																																																																		if (!b2y.equals(
																																																																																				y)) {
																																																																																			if (!b2y.equals(
																																																																																					z)) {
																																																																																				if (!b2y.equals(
																																																																																						x)) {
																																																																																					if (!b2y.equals(
																																																																																							d)) {
																																																																																						if (!d.equals(
																																																																																								l)) {
																																																																																							if (!d.equals(
																																																																																									d2c)) {
																																																																																								if (!d.equals(
																																																																																										m)) {
																																																																																									if (!d.equals(
																																																																																											l2z)) {
																																																																																										if (!d.equals(
																																																																																												m2w)) {
																																																																																											if (!d.equals(
																																																																																													w)) {
																																																																																												if (!d.equals(
																																																																																														y)) {
																																																																																													if (!d.equals(
																																																																																															z)) {
																																																																																														if (!d.equals(
																																																																																																x)) {
																																																																																															if (!b.equals(
																																																																																																	l)) {
																																																																																																if (!b.equals(
																																																																																																		d2c)) {
																																																																																																	if (!b.equals(
																																																																																																			m)) {
																																																																																																		if (!b.equals(
																																																																																																				l2z)) {
																																																																																																			if (!b.equals(
																																																																																																					m2w)) {
																																																																																																				if (!b.equals(
																																																																																																						w)) {
																																																																																																					if (!b.equals(
																																																																																																							c)) {
																																																																																																						if (!b.equals(
																																																																																																								y)) {
																																																																																																							if (!b.equals(
																																																																																																									z)) {
																																																																																																								if (!b.equals(
																																																																																																										x)) {
																																																																																																									if (!b.equals(
																																																																																																											b2y)) {
																																																																																																										if (!b.equals(
																																																																																																												d)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													l,
																																																																																																													d2c,
																																																																																																													m,
																																																																																																													l2z,
																																																																																																													m2w,
																																																																																																													a,
																																																																																																													w,
																																																																																																													c,
																																																																																																													y,
																																																																																																													z,
																																																																																																													a2x,
																																																																																																													x,
																																																																																																													b2y,
																																																																																																													d,
																																																																																																													b };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_deculul2branchubub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l, EObject m, EObject l2z, EObject m2w, EObject a, EObject w,
			EObject c, EObject y, EObject z, EObject a2x, EObject x, EObject b2y, EObject d, EObject b) {
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "deculul2branchubub";
		String l2z__l____source_name_prime = "source";
		String m2w__m____source_name_prime = "source";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String m2w__w____target_name_prime = "target";
		String a__l____first_name_prime = "first";
		String w__y____next_name_prime = "next";
		String y__w____positive_name_prime = "positive";
		String l2z__z____target_name_prime = "target";
		String x__z____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String b2y__y____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String b__m____last_name_prime = "last";
		String b2y__b____source_name_prime = "source";
		String z__x____next_name_prime = "next";
		String b__m____first_name_prime = "first";
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____first);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(w__y____next);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		ruleresult.getTranslatedEdges().add(y__w____positive);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getTranslatedEdges().add(x__z____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____last);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		return new Object[] { ruleresult, l, m, l2z, m2w, a, w, c, y, z, a2x, x, b2y, d, b, l2z__l____source,
				m2w__m____source, c__y____negative, c__x____positive, m2w__w____target, a__l____first, w__y____next,
				y__w____positive, l2z__z____target, x__z____positive, a2x__x____target, a2x__a____source, a__l____last,
				d__b____negative, b2y__y____target, d__a____positive, b__m____last, b2y__b____source, z__x____next,
				b__m____first };
	}

	public static final void pattern_deculul2branchubub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			deculul2branchubub _this, PerformRuleResult ruleresult, EObject l, EObject d2c, EObject m, EObject l2z,
			EObject m2w, EObject a, EObject w, EObject c, EObject y, EObject z, EObject a2x, EObject x, EObject b2y,
			EObject d, EObject b) {
		_this.registerObjects_BWD(ruleresult, l, d2c, m, l2z, m2w, a, w, c, y, z, a2x, x, b2y, d, b);

	}

	public static final PerformRuleResult pattern_deculul2branchubub_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_12_1_preparereturnvalue_bindingFB(
			deculul2branchubub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_12_1_preparereturnvalue_blackFBB(EClass eClass,
			deculul2branchubub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_12_1_preparereturnvalue_bindingAndBlackFFB(
			deculul2branchubub _this) {
		Object[] result_pattern_deculul2branchubub_12_1_preparereturnvalue_binding = pattern_deculul2branchubub_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_deculul2branchubub_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_deculul2branchubub_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_deculul2branchubub_12_1_preparereturnvalue_black = pattern_deculul2branchubub_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_deculul2branchubub_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_deculul2branchubub_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "deculul2branchubub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_deculul2branchubub_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("w");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("z");
		EObject _localVariable_4 = match.getObject("x");
		EObject tmpW = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpX = _localVariable_4;
		if (tmpW instanceof Command) {
			Command w = (Command) tmpW;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpY instanceof Branch) {
					Branch y = (Branch) tmpY;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							return new Object[] { w, c, y, z, x, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_12_2_corematch_blackFBBBBBFB(Command w, Branch c,
			Branch y, Command z, Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!w.equals(z)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					if (!x.equals(y)) {
						for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
								"target")) {
							Statement tmpD = d2c.getSource();
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								_result.add(new Object[] { d2c, w, c, y, z, x, d, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_12_3_findcontext_blackBBBBBBB(S2B d2c, Command w,
			Branch c, Branch y, Command z, Branch x, Decision d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!w.equals(z)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					if (!x.equals(y)) {
						if (y.equals(c.getNegative())) {
							if (x.equals(c.getPositive())) {
								if (c.equals(d2c.getTarget())) {
									if (y.equals(w.getNext())) {
										if (w.equals(y.getPositive())) {
											if (z.equals(x.getPositive())) {
												if (d.equals(d2c.getSource())) {
													if (x.equals(z.getNext())) {
														_result.add(new Object[] { d2c, w, c, y, z, x, d });
													}
												}
											}
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

	public static final Object[] pattern_deculul2branchubub_12_3_findcontext_greenBBBBBBBFFFFFFFFF(S2B d2c, Command w,
			Branch c, Branch y, Command z, Branch x, Decision d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String d2c__c____target_name_prime = "target";
		String w__y____next_name_prime = "next";
		String y__w____positive_name_prime = "positive";
		String x__z____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String z__x____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(d);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(w__y____next);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		isApplicableMatch.getAllContextElements().add(y__w____positive);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		isApplicableMatch.getAllContextElements().add(x__z____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		return new Object[] { d2c, w, c, y, z, x, d, isApplicableMatch, c__y____negative, c__x____positive,
				d2c__c____target, w__y____next, y__w____positive, x__z____positive, d2c__d____source, z__x____next };
	}

	public static final Object[] pattern_deculul2branchubub_12_4_solveCSP_bindingFBBBBBBBBB(deculul2branchubub _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Command w, Branch c, Branch y, Command z, Branch x,
			Decision d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, d2c, w, c, y, z, x, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, w, c, y, z, x, d };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculul2branchubub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			deculul2branchubub _this, IsApplicableMatch isApplicableMatch, S2B d2c, Command w, Branch c, Branch y,
			Command z, Branch x, Decision d) {
		Object[] result_pattern_deculul2branchubub_12_4_solveCSP_binding = pattern_deculul2branchubub_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, d2c, w, c, y, z, x, d);
		if (result_pattern_deculul2branchubub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculul2branchubub_12_4_solveCSP_binding[0];

			Object[] result_pattern_deculul2branchubub_12_4_solveCSP_black = pattern_deculul2branchubub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_deculul2branchubub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, w, c, y, z, x, d };
			}
		}
		return null;
	}

	public static final boolean pattern_deculul2branchubub_12_5_checkCSP_expressionFBB(deculul2branchubub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_deculul2branchubub_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "deculul2branchubub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_deculul2branchubub_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_20_1_preparereturnvalue_bindingFB(
			deculul2branchubub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			deculul2branchubub _this) {
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

	public static final Object[] pattern_deculul2branchubub_20_1_preparereturnvalue_bindingAndBlackFFBF(
			deculul2branchubub _this) {
		Object[] result_pattern_deculul2branchubub_20_1_preparereturnvalue_binding = pattern_deculul2branchubub_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_deculul2branchubub_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_deculul2branchubub_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_deculul2branchubub_20_1_preparereturnvalue_black = pattern_deculul2branchubub_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_deculul2branchubub_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_deculul2branchubub_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_deculul2branchubub_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_0B(Command w) {
		for (Graph __DEC_w_root_860206 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_1BBBB(Command w,
			Branch c, Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_positive_617431 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!c.equals(__DEC_w_positive_617431)) {
							if (!y.equals(__DEC_w_positive_617431)) {
								if (!x.equals(__DEC_w_positive_617431)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_2BBBB(Command w,
			Branch c, Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_negative_241380 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!c.equals(__DEC_w_negative_241380)) {
							if (!y.equals(__DEC_w_negative_241380)) {
								if (!x.equals(__DEC_w_negative_241380)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_916931 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_4BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_768247 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_768247)) {
							if (!c.equals(__DEC_y_positive_768247)) {
								if (!x.equals(__DEC_y_positive_768247)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_5BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_39863 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_39863)) {
							if (!c.equals(__DEC_y_negative_39863)) {
								if (!x.equals(__DEC_y_negative_39863)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_469532 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_7BBBB(Command z,
			Branch c, Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_676995 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!c.equals(__DEC_z_positive_676995)) {
							if (!y.equals(__DEC_z_positive_676995)) {
								if (!x.equals(__DEC_z_positive_676995)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_8BBBB(Command z,
			Branch c, Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_2029 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!c.equals(__DEC_z_negative_2029)) {
							if (!y.equals(__DEC_z_negative_2029)) {
								if (!x.equals(__DEC_z_negative_2029)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_9B(Branch x) {
		for (Graph __DEC_x_root_872520 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_10BBB(Branch x,
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_877003 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_877003)) {
							if (!c.equals(__DEC_x_positive_877003)) {
								if (!y.equals(__DEC_x_positive_877003)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_11BBB(Branch x,
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_977604 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_977604)) {
							if (!c.equals(__DEC_x_negative_977604)) {
								if (!y.equals(__DEC_x_negative_977604)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_12BB(Branch c,
			Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_13BB(Branch x,
			Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_14BB(Branch c,
			Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_15BB(Branch y,
			Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_16BB(Branch x,
			Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_17BB(Branch c,
			Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_18BB(Branch c,
			Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_19BB(Branch y,
			Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_20BB(Branch c,
			Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_21BB(Branch y,
			Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_22BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_23BB(Branch y,
			Branch x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_24BB(Branch c,
			Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_25BB(Branch y,
			Branch x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_20_2_testcorematchandDECs_blackFFFFFB(
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
											Node tmpZ = x.getPositive();
											if (tmpZ instanceof Command) {
												Command z = (Command) tmpZ;
												if (!w.equals(z)) {
													if (x.equals(z.getNext())) {
														if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_3B(
																y) == null) {
															if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_17BB(
																	c, y) == null) {
																if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_4BBB(
																		y, c, x) == null) {
																	if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_5BBB(
																			y, c, x) == null) {
																		if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_9B(
																				x) == null) {
																			if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_10BBB(
																					x, c, y) == null) {
																				if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_11BBB(
																						x, c, y) == null) {
																					if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_23BB(
																							y, x) == null) {
																						if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_24BB(
																								c, x) == null) {
																							if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_25BB(
																									y, x) == null) {
																								if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_0B(
																										w) == null) {
																									if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_1BBBB(
																											w, c, y,
																											x) == null) {
																										if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_2BBBB(
																												w, c, y,
																												x) == null) {
																											if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_12BB(
																													c,
																													w) == null) {
																												if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_13BB(
																														x,
																														w) == null) {
																													if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_14BB(
																															c,
																															w) == null) {
																														if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_15BB(
																																y,
																																w) == null) {
																															if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_16BB(
																																	x,
																																	w) == null) {
																																if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_6B(
																																		z) == null) {
																																	if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_7BBBB(
																																			z,
																																			c,
																																			y,
																																			x) == null) {
																																		if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_8BBBB(
																																				z,
																																				c,
																																				y,
																																				x) == null) {
																																			if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_18BB(
																																					c,
																																					z) == null) {
																																				if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_19BB(
																																						y,
																																						z) == null) {
																																					if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_20BB(
																																							c,
																																							z) == null) {
																																						if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_21BB(
																																								y,
																																								z) == null) {
																																							if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_22BB(
																																									x,
																																									z) == null) {
																																								_result.add(
																																										new Object[] {
																																												w,
																																												c,
																																												y,
																																												z,
																																												x,
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

		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_deculul2branchubub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			deculul2branchubub _this, Match match, Command w, Branch c, Branch y, Command z, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, w, c, y, z, x);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_deculul2branchubub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			deculul2branchubub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_deculul2branchubub_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_21_1_preparereturnvalue_bindingFB(
			deculul2branchubub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			deculul2branchubub _this) {
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

	public static final Object[] pattern_deculul2branchubub_21_1_preparereturnvalue_bindingAndBlackFFBF(
			deculul2branchubub _this) {
		Object[] result_pattern_deculul2branchubub_21_1_preparereturnvalue_binding = pattern_deculul2branchubub_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_deculul2branchubub_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_deculul2branchubub_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_deculul2branchubub_21_1_preparereturnvalue_black = pattern_deculul2branchubub_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_deculul2branchubub_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_deculul2branchubub_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_deculul2branchubub_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_0BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_46926 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_46926)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_1BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_508008 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_508008)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_2BBB(Assignment l,
			While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_228101 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!a.equals(__DEC_l_last_228101)) {
					if (!b.equals(__DEC_l_last_228101)) {
						return new Object[] { l, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_313067 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_4BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_179230 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_179230)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_5BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_614681 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_614681)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_6BBB(Assignment m,
			While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_559784 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!a.equals(__DEC_m_last_559784)) {
					if (!b.equals(__DEC_m_last_559784)) {
						return new Object[] { m, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_7B(Assignment m) {
		for (Program __DEC_m_first_554572 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_8BB(While a,
			Decision d) {
		for (Decision __DEC_a_negative_265341 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_265341)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_9BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_435645 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_435645)) {
					if (!b.equals(__DEC_a_first_435645)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_10BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_952043 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_952043)) {
					if (!b.equals(__DEC_a_last_952043)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_11B(While a) {
		for (Program __DEC_a_first_784744 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_12BB(While b,
			Decision d) {
		for (Decision __DEC_b_positive_277956 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_277956)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_13BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_540375 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_540375)) {
					if (!a.equals(__DEC_b_first_540375)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_14BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_503605 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_503605)) {
					if (!a.equals(__DEC_b_last_503605)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_15B(While b) {
		for (Program __DEC_b_first_564086 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_16BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_17BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_18BB(While b,
			Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_19BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_20BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_21BB(While a,
			Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_22BB(Decision d,
			While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_23BB(Decision d,
			While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_24BB(While a, While b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_25BB(While a, While b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpA = _edge_first.getSrc();
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			EObject tmpL = _edge_first.getTrg();
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (l.equals(a.getFirst())) {
					if (l.equals(a.getLast())) {
						if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_11B(a) == null) {
							if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_3B(l) == null) {
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
													if (m.equals(b.getFirst())) {
														if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_0BB(
																l, d) == null) {
															if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_1BB(
																	l, d) == null) {
																if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_8BB(
																		a, d) == null) {
																	if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_16BB(
																			d, l) == null) {
																		if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_17BB(
																				d, l) == null) {
																			if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_22BB(
																					d, a) == null) {
																				if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_2BBB(
																						l, a, b) == null) {
																					if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_9BB(
																							a, b) == null) {
																						if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_10BB(
																								a, b) == null) {
																							if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_12BB(
																									b, d) == null) {
																								if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_13BB(
																										b, a) == null) {
																									if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_14BB(
																											b,
																											a) == null) {
																										if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_15B(
																												b) == null) {
																											if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_18BB(
																													b,
																													l) == null) {
																												if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_23BB(
																														d,
																														b) == null) {
																													if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_24BB(
																															a,
																															b) == null) {
																														if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_25BB(
																																a,
																																b) == null) {
																															if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_4BB(
																																	m,
																																	d) == null) {
																																if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_5BB(
																																		m,
																																		d) == null) {
																																	if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_6BBB(
																																			m,
																																			a,
																																			b) == null) {
																																		if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_7B(
																																				m) == null) {
																																			if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_19BB(
																																					d,
																																					m) == null) {
																																				if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_20BB(
																																						d,
																																						m) == null) {
																																					if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_21BB(
																																							a,
																																							m) == null) {
																																						_result.add(
																																								new Object[] {
																																										l,
																																										m,
																																										a,
																																										d,
																																										b,
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

		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_deculul2branchubub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			deculul2branchubub _this, Match match, Assignment l, Assignment m, While a, Decision d, While b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, l, m, a, d, b);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_deculul2branchubub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			deculul2branchubub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_deculul2branchubub_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_24_1_prepare_blackB(deculul2branchubub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_deculul2branchubub_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_deculul2branchubub_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("l");
		EObject _localVariable_1 = sourceMatch.getObject("m");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = targetMatch.getObject("w");
		EObject _localVariable_4 = targetMatch.getObject("c");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject _localVariable_6 = targetMatch.getObject("z");
		EObject _localVariable_7 = targetMatch.getObject("x");
		EObject _localVariable_8 = sourceMatch.getObject("d");
		EObject _localVariable_9 = sourceMatch.getObject("b");
		EObject tmpL = _localVariable_0;
		EObject tmpM = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpZ = _localVariable_6;
		EObject tmpX = _localVariable_7;
		EObject tmpD = _localVariable_8;
		EObject tmpB = _localVariable_9;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpM instanceof Assignment) {
				Assignment m = (Assignment) tmpM;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpW instanceof Command) {
						Command w = (Command) tmpW;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							if (tmpY instanceof Branch) {
								Branch y = (Branch) tmpY;
								if (tmpZ instanceof Command) {
									Command z = (Command) tmpZ;
									if (tmpX instanceof Branch) {
										Branch x = (Branch) tmpX;
										if (tmpD instanceof Decision) {
											Decision d = (Decision) tmpD;
											if (tmpB instanceof While) {
												While b = (While) tmpB;
												return new Object[] { l, m, a, w, c, y, z, x, d, b, sourceMatch,
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

	public static final Object[] pattern_deculul2branchubub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Assignment l,
			Assignment m, While a, Command w, Branch c, Branch y, Command z, Branch x, Decision d, While b,
			Match sourceMatch, Match targetMatch) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (!w.equals(z)) {
					if (!c.equals(y)) {
						if (!c.equals(x)) {
							if (!x.equals(y)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { l, m, a, w, c, y, z, x, d, b, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding = pattern_deculul2branchubub_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding != null) {
			Assignment l = (Assignment) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[0];
			Assignment m = (Assignment) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[1];
			While a = (While) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[2];
			Command w = (Command) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[3];
			Branch c = (Branch) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[4];
			Branch y = (Branch) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[5];
			Command z = (Command) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[6];
			Branch x = (Branch) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[7];
			Decision d = (Decision) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[8];
			While b = (While) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_black = pattern_deculul2branchubub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					l, m, a, w, c, y, z, x, d, b, sourceMatch, targetMatch);
			if (result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { l, m, a, w, c, y, z, x, d, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			deculul2branchubub _this, Assignment l, Assignment m, While a, Command w, Branch c, Branch y, Command z,
			Branch x, Decision d, While b, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(l, m, a, w, c, y, z, x, d, b, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, l, m, a, w, c, y, z, x, d, b, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculul2branchubub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			deculul2branchubub _this, Assignment l, Assignment m, While a, Command w, Branch c, Branch y, Command z,
			Branch x, Decision d, While b, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_deculul2branchubub_24_3_solvecsp_binding = pattern_deculul2branchubub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, l, m, a, w, c, y, z, x, d, b, sourceMatch, targetMatch);
		if (result_pattern_deculul2branchubub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_deculul2branchubub_24_3_solvecsp_binding[0];

			Object[] result_pattern_deculul2branchubub_24_3_solvecsp_black = pattern_deculul2branchubub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_deculul2branchubub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, l, m, a, w, c, y, z, x, d, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_deculul2branchubub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_24_5_matchcorrcontext_blackFBBBB(Branch c,
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

	public static final Object[] pattern_deculul2branchubub_24_5_matchcorrcontext_greenBBBF(S2B d2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "deculul2branchubub";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_deculul2branchubub_24_6_createcorrespondence_blackBBBBBBBBBBB(Assignment l,
			Assignment m, While a, Command w, Branch c, Branch y, Command z, Branch x, Decision d, While b,
			CCMatch ccMatch) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (!w.equals(z)) {
					if (!c.equals(y)) {
						if (!c.equals(x)) {
							if (!x.equals(y)) {
								return new Object[] { l, m, a, w, c, y, z, x, d, b, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_24_6_createcorrespondence_greenBBFFBBBBFBFBB(Assignment l,
			Assignment m, While a, Command w, Branch y, Command z, Branch x, While b, CCMatch ccMatch) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		m2w.setSource(m);
		m2w.setTarget(w);
		ccMatch.getCreateCorr().add(m2w);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { l, m, l2z, m2w, a, w, y, z, a2x, x, b2y, b, ccMatch };
	}

	public static final Object[] pattern_deculul2branchubub_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_deculul2branchubub_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "deculul2branchubub";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_deculul2branchubub_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_0BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_297653 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_297653)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_1BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_218492 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_218492)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_2BBB(Assignment l, While a,
			While b) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_759113 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!a.equals(__DEC_l_last_759113)) {
					if (!b.equals(__DEC_l_last_759113)) {
						return new Object[] { l, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_618353 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_4BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_766618 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_766618)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_5BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_401224 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_401224)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_6BBB(Assignment m, While a,
			While b) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_507699 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!a.equals(__DEC_m_last_507699)) {
					if (!b.equals(__DEC_m_last_507699)) {
						return new Object[] { m, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_7B(Assignment m) {
		for (Program __DEC_m_first_938558 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_8BB(While a, Decision d) {
		for (Decision __DEC_a_negative_781584 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_781584)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_9BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_24761 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_24761)) {
					if (!b.equals(__DEC_a_first_24761)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_10BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_600603 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_600603)) {
					if (!b.equals(__DEC_a_last_600603)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_11B(While a) {
		for (Program __DEC_a_first_832541 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_12BB(While b, Decision d) {
		for (Decision __DEC_b_positive_122505 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_122505)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_13BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_596951 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_596951)) {
					if (!a.equals(__DEC_b_first_596951)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_14BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_165678 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_165678)) {
					if (!a.equals(__DEC_b_last_165678)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_15B(While b) {
		for (Program __DEC_b_first_60091 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_16BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_17BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_18BB(While b, Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_19BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_20BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_21BB(While a, Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_22BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_23BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_24BB(While a, While b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_25BB(While a, While b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_blackBBBBB(Assignment l, Assignment m,
			While a, Decision d, While b) {
		if (!l.equals(m)) {
			if (!a.equals(b)) {
				if (l.equals(a.getFirst())) {
					if (l.equals(a.getLast())) {
						if (b.equals(d.getNegative())) {
							if (a.equals(d.getPositive())) {
								if (m.equals(b.getLast())) {
									if (m.equals(b.getFirst())) {
										if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_0BB(l,
												d) == null) {
											if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_1BB(l,
													d) == null) {
												if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_2BBB(l, a,
														b) == null) {
													if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_3B(
															l) == null) {
														if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_4BB(
																m, d) == null) {
															if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_5BB(
																	m, d) == null) {
																if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_6BBB(
																		m, a, b) == null) {
																	if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_7B(
																			m) == null) {
																		if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_8BB(
																				a, d) == null) {
																			if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_9BB(
																					a, b) == null) {
																				if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_10BB(
																						a, b) == null) {
																					if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_11B(
																							a) == null) {
																						if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_12BB(
																								b, d) == null) {
																							if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_13BB(
																									b, a) == null) {
																								if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_14BB(
																										b, a) == null) {
																									if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_15B(
																											b) == null) {
																										if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_16BB(
																												d,
																												l) == null) {
																											if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_17BB(
																													d,
																													l) == null) {
																												if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_18BB(
																														b,
																														l) == null) {
																													if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_19BB(
																															d,
																															m) == null) {
																														if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_20BB(
																																d,
																																m) == null) {
																															if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_21BB(
																																	a,
																																	m) == null) {
																																if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_22BB(
																																		d,
																																		a) == null) {
																																	if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_23BB(
																																			d,
																																			b) == null) {
																																		if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_24BB(
																																				a,
																																				b) == null) {
																																			if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_25BB(
																																					a,
																																					b) == null) {
																																				return new Object[] {
																																						l,
																																						m,
																																						a,
																																						d,
																																						b };
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_deculul2branchubub_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_deculul2branchubub_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_0B(Command w) {
		for (Graph __DEC_w_root_980047 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_1BBBB(Command w, Branch c,
			Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_positive_168951 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!c.equals(__DEC_w_positive_168951)) {
							if (!y.equals(__DEC_w_positive_168951)) {
								if (!x.equals(__DEC_w_positive_168951)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_2BBBB(Command w, Branch c,
			Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_w_negative_216458 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!c.equals(__DEC_w_negative_216458)) {
							if (!y.equals(__DEC_w_negative_216458)) {
								if (!x.equals(__DEC_w_negative_216458)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_49750 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_4BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_852769 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_852769)) {
							if (!c.equals(__DEC_y_positive_852769)) {
								if (!x.equals(__DEC_y_positive_852769)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_5BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_493739 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_493739)) {
							if (!c.equals(__DEC_y_negative_493739)) {
								if (!x.equals(__DEC_y_negative_493739)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_782783 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_7BBBB(Command z, Branch c,
			Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_207770 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!c.equals(__DEC_z_positive_207770)) {
							if (!y.equals(__DEC_z_positive_207770)) {
								if (!x.equals(__DEC_z_positive_207770)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_8BBBB(Command z, Branch c,
			Branch y, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_581857 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!c.equals(__DEC_z_negative_581857)) {
							if (!y.equals(__DEC_z_negative_581857)) {
								if (!x.equals(__DEC_z_negative_581857)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_9B(Branch x) {
		for (Graph __DEC_x_root_799528 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_10BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_748955 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_748955)) {
							if (!c.equals(__DEC_x_positive_748955)) {
								if (!y.equals(__DEC_x_positive_748955)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_11BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_789480 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_789480)) {
							if (!c.equals(__DEC_x_negative_789480)) {
								if (!y.equals(__DEC_x_negative_789480)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_12BB(Branch c, Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_13BB(Branch x, Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_14BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_15BB(Branch y, Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_16BB(Branch x, Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_17BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_18BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_19BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_20BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_21BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_22BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_23BB(Branch y, Branch x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_24BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_25BB(Branch y, Branch x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_blackBBBBB(Command w, Branch c,
			Branch y, Command z, Branch x) {
		if (!w.equals(z)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					if (!x.equals(y)) {
						if (y.equals(c.getNegative())) {
							if (x.equals(c.getPositive())) {
								if (y.equals(w.getNext())) {
									if (w.equals(y.getPositive())) {
										if (z.equals(x.getPositive())) {
											if (x.equals(z.getNext())) {
												if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_0B(
														w) == null) {
													if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_1BBBB(
															w, c, y, x) == null) {
														if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_2BBBB(
																w, c, y, x) == null) {
															if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_3B(
																	y) == null) {
																if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_4BBB(
																		y, c, x) == null) {
																	if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_5BBB(
																			y, c, x) == null) {
																		if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_6B(
																				z) == null) {
																			if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_7BBBB(
																					z, c, y, x) == null) {
																				if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_8BBBB(
																						z, c, y, x) == null) {
																					if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_9B(
																							x) == null) {
																						if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_10BBB(
																								x, c, y) == null) {
																							if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_11BBB(
																									x, c, y) == null) {
																								if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_12BB(
																										c, w) == null) {
																									if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_13BB(
																											x,
																											w) == null) {
																										if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_14BB(
																												c,
																												w) == null) {
																											if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_15BB(
																													y,
																													w) == null) {
																												if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_16BB(
																														x,
																														w) == null) {
																													if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_17BB(
																															c,
																															y) == null) {
																														if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_18BB(
																																c,
																																z) == null) {
																															if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_19BB(
																																	y,
																																	z) == null) {
																																if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_20BB(
																																		c,
																																		z) == null) {
																																	if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_21BB(
																																			y,
																																			z) == null) {
																																		if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_22BB(
																																				x,
																																				z) == null) {
																																			if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_23BB(
																																					y,
																																					x) == null) {
																																				if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_24BB(
																																						c,
																																						x) == null) {
																																					if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_25BB(
																																							y,
																																							x) == null) {
																																						return new Object[] {
																																								w,
																																								c,
																																								y,
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
		}
		return null;
	}

	public static final boolean pattern_deculul2branchubub_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_deculul2branchubub_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_29_1_createresult_blackB(deculul2branchubub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_deculul2branchubub_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_deculul2branchubub_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_deculul2branchubub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									d2c) == null) {
								if (pattern_deculul2branchubub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										c) == null) {
									if (pattern_deculul2branchubub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_deculul2branchubub_29_3_solveCSP_bindingFBBBBBB(deculul2branchubub _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d2c, c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculul2branchubub_29_3_solveCSP_bindingAndBlackFBBBBBB(
			deculul2branchubub _this, IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_deculul2branchubub_29_3_solveCSP_binding = pattern_deculul2branchubub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d2c, c, d, ruleResult);
		if (result_pattern_deculul2branchubub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculul2branchubub_29_3_solveCSP_binding[0];

			Object[] result_pattern_deculul2branchubub_29_3_solveCSP_black = pattern_deculul2branchubub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_deculul2branchubub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_deculul2branchubub_29_4_checkCSP_expressionFBB(deculul2branchubub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculul2branchubub_29_5_checknacs_blackBBB(S2B d2c, Branch c, Decision d) {
		return new Object[] { d2c, c, d };
	}

	public static final Object[] pattern_deculul2branchubub_29_6_perform_blackBBBB(S2B d2c, Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d2c, c, d, ruleResult };
	}

	public static final Object[] pattern_deculul2branchubub_29_6_perform_greenFFFFFFBFFFFFBFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(l);
		ruleResult.getSourceObjects().add(m);
		l2z.setSource(l);
		ruleResult.getCorrObjects().add(l2z);
		m2w.setSource(m);
		ruleResult.getCorrObjects().add(m2w);
		a.setFirst(l);
		a.setLast(l);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		m2w.setTarget(w);
		ruleResult.getTargetObjects().add(w);
		c.setNegative(y);
		w.setNext(y);
		y.setPositive(w);
		ruleResult.getTargetObjects().add(y);
		l2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		c.setPositive(x);
		x.setPositive(z);
		a2x.setTarget(x);
		z.setNext(x);
		ruleResult.getTargetObjects().add(x);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		d.setNegative(b);
		b.setLast(m);
		b2y.setSource(b);
		b.setFirst(m);
		ruleResult.getSourceObjects().add(b);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { l, m, l2z, m2w, a, w, c, y, z, a2x, x, b2y, d, b, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_deculul2branchubub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //deculul2branchububImpl
