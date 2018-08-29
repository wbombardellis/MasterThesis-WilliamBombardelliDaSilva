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
	public boolean isAppropriate_FWD(Match match, Assignment m, Decision d, While a, Assignment l, While b) {

		Object[] result1_black = deculul2branchububImpl
				.pattern_deculul2branchubub_0_1_initialbindings_blackBBBBBBB(this, match, m, d, a, l, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[m] = " + m + ", " + "[d] = " + d + ", " + "[a] = " + a + ", "
					+ "[l] = " + l + ", " + "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = deculul2branchububImpl
				.pattern_deculul2branchubub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, m, d, a, l, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[m] = " + m + ", " + "[d] = " + d + ", " + "[a] = " + a + ", "
					+ "[l] = " + l + ", " + "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (deculul2branchububImpl.pattern_deculul2branchubub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = deculul2branchububImpl
					.pattern_deculul2branchubub_0_4_collectelementstobetranslated_blackBBBBBB(match, m, d, a, l, b);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[m] = " + m + ", "
								+ "[d] = " + d + ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[b] = " + b + ".");
			}
			deculul2branchububImpl.pattern_deculul2branchubub_0_4_collectelementstobetranslated_greenBBBBBBFFFFFF(match,
					m, d, a, l, b);
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a__l____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge b__m____last = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge b__m____first = (EMoflonEdge) result4_green[11];

			Object[] result5_black = deculul2branchububImpl
					.pattern_deculul2branchubub_0_5_collectcontextelements_blackBBBBBB(match, m, d, a, l, b);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[m] = " + m + ", "
								+ "[d] = " + d + ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[b] = " + b + ".");
			}
			deculul2branchububImpl.pattern_deculul2branchubub_0_5_collectcontextelements_greenBB(match, d);

			// 
			deculul2branchububImpl.pattern_deculul2branchubub_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					m, d, a, l, b);
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
		Assignment m = (Assignment) result1_bindingAndBlack[0];
		Decision d = (Decision) result1_bindingAndBlack[1];
		While a = (While) result1_bindingAndBlack[2];
		Assignment l = (Assignment) result1_bindingAndBlack[3];
		S2B d2c = (S2B) result1_bindingAndBlack[4];
		Branch c = (Branch) result1_bindingAndBlack[5];
		While b = (While) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = deculul2branchububImpl
				.pattern_deculul2branchubub_1_1_performtransformation_greenBFBFFFBFFFFBB(m, a, l, c, b);
		S2N l2z = (S2N) result1_green[1];
		Branch x = (Branch) result1_green[3];
		S2B a2x = (S2B) result1_green[4];
		Command w = (Command) result1_green[5];
		S2N m2w = (S2N) result1_green[7];
		S2B b2y = (S2B) result1_green[8];
		Branch y = (Branch) result1_green[9];
		Command z = (Command) result1_green[10];

		Object[] result2_black = deculul2branchububImpl
				.pattern_deculul2branchubub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(m, l2z, a, x, a2x, w, l,
						m2w, b2y, y, z, b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m] = " + m + ", " + "[l2z] = "
					+ l2z + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[a2x] = " + a2x + ", " + "[w] = " + w
					+ ", " + "[l] = " + l + ", " + "[m2w] = " + m2w + ", " + "[b2y] = " + b2y + ", " + "[y] = " + y
					+ ", " + "[z] = " + z + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = deculul2branchububImpl
				.pattern_deculul2branchubub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(m, l2z, a, x, a2x, w, l,
						m2w, b2y, y, z, b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = deculul2branchububImpl
				.pattern_deculul2branchubub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, m, d, l2z, a, x,
						a2x, w, l, d2c, m2w, b2y, y, z, c, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m] = " + m + ", " + "[d] = " + d + ", " + "[l2z] = " + l2z + ", " + "[a] = " + a + ", "
					+ "[x] = " + x + ", " + "[a2x] = " + a2x + ", " + "[w] = " + w + ", " + "[l] = " + l + ", "
					+ "[d2c] = " + d2c + ", " + "[m2w] = " + m2w + ", " + "[b2y] = " + b2y + ", " + "[y] = " + y + ", "
					+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[b] = " + b + ".");
		}
		deculul2branchububImpl
				.pattern_deculul2branchubub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(ruleresult,
						m, d, l2z, a, x, a2x, w, l, m2w, b2y, y, z, c, b);
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[34];

		// 
		// 
		deculul2branchububImpl.pattern_deculul2branchubub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, m, d, l2z, a, x, a2x, w, l, d2c, m2w, b2y, y, z, c, b);
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
		Assignment m = (Assignment) result2_binding[0];
		Decision d = (Decision) result2_binding[1];
		While a = (While) result2_binding[2];
		Assignment l = (Assignment) result2_binding[3];
		While b = (While) result2_binding[4];
		for (Object[] result2_black : deculul2branchububImpl.pattern_deculul2branchubub_2_2_corematch_blackBBBBFFBB(m,
				d, a, l, b, match)) {
			S2B d2c = (S2B) result2_black[4];
			Branch c = (Branch) result2_black[5];
			// ForEach 
			for (Object[] result3_black : deculul2branchububImpl
					.pattern_deculul2branchubub_2_3_findcontext_blackBBBBBBB(m, d, a, l, d2c, c, b)) {
				Object[] result3_green = deculul2branchububImpl
						.pattern_deculul2branchubub_2_3_findcontext_greenBBBBBBBFFFFFFFFF(m, d, a, l, d2c, c, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = deculul2branchububImpl
						.pattern_deculul2branchubub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, m,
								d, a, l, d2c, c, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[m] = " + m + ", " + "[d] = " + d
							+ ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c
							+ ", " + "[b] = " + b + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Assignment m, Decision d, While a, Assignment l, While b) {
		match.registerObject("m", m);
		match.registerObject("d", d);
		match.registerObject("a", a);
		match.registerObject("l", l);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment m, Decision d, While a, Assignment l, While b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment m, Decision d, While a,
			Assignment l, S2B d2c, Branch c, While b) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("m", m);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject m, EObject d, EObject l2z, EObject a,
			EObject x, EObject a2x, EObject w, EObject l, EObject d2c, EObject m2w, EObject b2y, EObject y, EObject z,
			EObject c, EObject b) {
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("m").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch x, Command w, Branch y, Command z, Branch c) {

		Object[] result1_black = deculul2branchububImpl
				.pattern_deculul2branchubub_10_1_initialbindings_blackBBBBBBB(this, match, x, w, y, z, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[y] = " + y + ", "
					+ "[z] = " + z + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = deculul2branchububImpl
				.pattern_deculul2branchubub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, x, w, y, z, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[y] = " + y + ", "
					+ "[z] = " + z + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (deculul2branchububImpl.pattern_deculul2branchubub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = deculul2branchububImpl
					.pattern_deculul2branchubub_10_4_collectelementstobetranslated_blackBBBBBB(match, x, w, y, z, c);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[x] = " + x + ", "
								+ "[w] = " + w + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[c] = " + c + ".");
			}
			deculul2branchububImpl.pattern_deculul2branchubub_10_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
					match, x, w, y, z, c);
			//nothing EMoflonEdge w__y____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[11];

			Object[] result5_black = deculul2branchububImpl
					.pattern_deculul2branchubub_10_5_collectcontextelements_blackBBBBBB(match, x, w, y, z, c);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[x] = " + x + ", "
								+ "[w] = " + w + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[c] = " + c + ".");
			}
			deculul2branchububImpl.pattern_deculul2branchubub_10_5_collectcontextelements_greenBB(match, c);

			// 
			deculul2branchububImpl.pattern_deculul2branchubub_10_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					x, w, y, z, c);
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
		Decision d = (Decision) result1_bindingAndBlack[0];
		Branch x = (Branch) result1_bindingAndBlack[1];
		Command w = (Command) result1_bindingAndBlack[2];
		S2B d2c = (S2B) result1_bindingAndBlack[3];
		Branch y = (Branch) result1_bindingAndBlack[4];
		Command z = (Command) result1_bindingAndBlack[5];
		Branch c = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = deculul2branchububImpl
				.pattern_deculul2branchubub_11_1_performtransformation_greenFBFFBFBFFFBBF(d, x, w, y, z);
		Assignment m = (Assignment) result1_green[0];
		S2N l2z = (S2N) result1_green[2];
		While a = (While) result1_green[3];
		S2B a2x = (S2B) result1_green[5];
		Assignment l = (Assignment) result1_green[7];
		S2N m2w = (S2N) result1_green[8];
		S2B b2y = (S2B) result1_green[9];
		While b = (While) result1_green[12];

		Object[] result2_black = deculul2branchububImpl
				.pattern_deculul2branchubub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(m, l2z, a, x, a2x, w, l,
						m2w, b2y, y, z, b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m] = " + m + ", " + "[l2z] = "
					+ l2z + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[a2x] = " + a2x + ", " + "[w] = " + w
					+ ", " + "[l] = " + l + ", " + "[m2w] = " + m2w + ", " + "[b2y] = " + b2y + ", " + "[y] = " + y
					+ ", " + "[z] = " + z + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = deculul2branchububImpl
				.pattern_deculul2branchubub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(m, l2z, a, x, a2x, w, l,
						m2w, b2y, y, z, b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = deculul2branchububImpl
				.pattern_deculul2branchubub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, m, d, l2z, a, x,
						a2x, w, l, d2c, m2w, b2y, y, z, c, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m] = " + m + ", " + "[d] = " + d + ", " + "[l2z] = " + l2z + ", " + "[a] = " + a + ", "
					+ "[x] = " + x + ", " + "[a2x] = " + a2x + ", " + "[w] = " + w + ", " + "[l] = " + l + ", "
					+ "[d2c] = " + d2c + ", " + "[m2w] = " + m2w + ", " + "[b2y] = " + b2y + ", " + "[y] = " + y + ", "
					+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[b] = " + b + ".");
		}
		deculul2branchububImpl
				.pattern_deculul2branchubub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, m, d, l2z, a, x, a2x, w, l, m2w, b2y, y, z, c, b);
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge m2w__m____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge m2w__w____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge b__m____last = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge b__m____first = (EMoflonEdge) result3_green[34];

		// 
		// 
		deculul2branchububImpl.pattern_deculul2branchubub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, m, d, l2z, a, x, a2x, w, l, d2c, m2w, b2y, y, z, c, b);
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
		Branch x = (Branch) result2_binding[0];
		Command w = (Command) result2_binding[1];
		Branch y = (Branch) result2_binding[2];
		Command z = (Command) result2_binding[3];
		Branch c = (Branch) result2_binding[4];
		for (Object[] result2_black : deculul2branchububImpl.pattern_deculul2branchubub_12_2_corematch_blackFBBFBBBB(x,
				w, y, z, c, match)) {
			Decision d = (Decision) result2_black[0];
			S2B d2c = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : deculul2branchububImpl
					.pattern_deculul2branchubub_12_3_findcontext_blackBBBBBBB(d, x, w, d2c, y, z, c)) {
				Object[] result3_green = deculul2branchububImpl
						.pattern_deculul2branchubub_12_3_findcontext_greenBBBBBBBFFFFFFFFF(d, x, w, d2c, y, z, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge w__y____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge y__w____positive = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = deculul2branchububImpl
						.pattern_deculul2branchubub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, d,
								x, w, d2c, y, z, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[x] = " + x
							+ ", " + "[w] = " + w + ", " + "[d2c] = " + d2c + ", " + "[y] = " + y + ", " + "[z] = " + z
							+ ", " + "[c] = " + c + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch x, Command w, Branch y, Command z, Branch c) {
		match.registerObject("x", x);
		match.registerObject("w", w);
		match.registerObject("y", y);
		match.registerObject("z", z);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch x, Command w, Branch y, Command z, Branch c) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Decision d, Branch x, Command w, S2B d2c,
			Branch y, Command z, Branch c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("z", z);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject m, EObject d, EObject l2z, EObject a,
			EObject x, EObject a2x, EObject w, EObject l, EObject d2c, EObject m2w, EObject b2y, EObject y, EObject z,
			EObject c, EObject b) {
		ruleresult.registerObject("m", m);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("m2w", m2w);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("w").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_114(EMoflonEdge _edge_next) {

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
				.pattern_deculul2branchubub_20_2_testcorematchandDECs_blackFFFFFB(_edge_next)) {
			Branch x = (Branch) result2_black[0];
			Command w = (Command) result2_black[1];
			Branch y = (Branch) result2_black[2];
			Command z = (Command) result2_black[3];
			Branch c = (Branch) result2_black[4];
			Object[] result2_green = deculul2branchububImpl
					.pattern_deculul2branchubub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (deculul2branchububImpl
					.pattern_deculul2branchubub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, x, w, y, z, c)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_114(EMoflonEdge _edge_negative) {

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
				.pattern_deculul2branchubub_21_2_testcorematchandDECs_blackFFFFFB(_edge_negative)) {
			Assignment m = (Assignment) result2_black[0];
			Decision d = (Decision) result2_black[1];
			While a = (While) result2_black[2];
			Assignment l = (Assignment) result2_black[3];
			While b = (While) result2_black[4];
			Object[] result2_green = deculul2branchububImpl
					.pattern_deculul2branchubub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (deculul2branchububImpl
					.pattern_deculul2branchubub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, m, d, a, l, b)) {
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
		Assignment m = (Assignment) result2_bindingAndBlack[0];
		Decision d = (Decision) result2_bindingAndBlack[1];
		While a = (While) result2_bindingAndBlack[2];
		Branch x = (Branch) result2_bindingAndBlack[3];
		Command w = (Command) result2_bindingAndBlack[4];
		Assignment l = (Assignment) result2_bindingAndBlack[5];
		Branch y = (Branch) result2_bindingAndBlack[6];
		Command z = (Command) result2_bindingAndBlack[7];
		Branch c = (Branch) result2_bindingAndBlack[8];
		While b = (While) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = deculul2branchububImpl
				.pattern_deculul2branchubub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, m, d, a, x, w, l, y, z, c,
						b, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[m] = " + m + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[w] = "
					+ w + ", " + "[l] = " + l + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[c] = " + c + ", "
					+ "[b] = " + b + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (deculul2branchububImpl.pattern_deculul2branchubub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : deculul2branchububImpl
					.pattern_deculul2branchubub_24_5_matchcorrcontext_blackBFBBB(d, c, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[1];
				Object[] result5_green = deculul2branchububImpl
						.pattern_deculul2branchubub_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = deculul2branchububImpl
						.pattern_deculul2branchubub_24_6_createcorrespondence_blackBBBBBBBBBBB(m, d, a, x, w, l, y, z,
								c, b, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m] = " + m + ", "
							+ "[d] = " + d + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[w] = " + w + ", "
							+ "[l] = " + l + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[c] = " + c + ", "
							+ "[b] = " + b + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				deculul2branchububImpl.pattern_deculul2branchubub_24_6_createcorrespondence_greenBFBBFBBFFBBBB(m, a, x,
						w, l, y, z, b, ccMatch);
				//nothing S2N l2z = (S2N) result6_green[1];
				//nothing S2B a2x = (S2B) result6_green[4];
				//nothing S2N m2w = (S2N) result6_green[7];
				//nothing S2B b2y = (S2B) result6_green[8];

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
	public CSP isApplicable_solveCsp_CC(Assignment m, Decision d, While a, Branch x, Command w, Assignment l, Branch y,
			Command z, Branch c, While b, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment m, Decision d, While a, Assignment l, While b) {// 
		Object[] result1_black = deculul2branchububImpl.pattern_deculul2branchubub_27_1_matchtggpattern_blackBBBBB(m, d,
				a, l, b);
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
	public boolean checkDEC_BWD(Branch x, Command w, Branch y, Command z, Branch c) {// 
		Object[] result1_black = deculul2branchububImpl.pattern_deculul2branchubub_28_1_matchtggpattern_blackBBBBB(x, w,
				y, z, c);
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
			Decision d = (Decision) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = deculul2branchububImpl
					.pattern_deculul2branchubub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d, d2c, c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[d2c] = " + d2c
						+ ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (deculul2branchububImpl.pattern_deculul2branchubub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = deculul2branchububImpl.pattern_deculul2branchubub_29_5_checknacs_blackBBB(d,
						d2c, c);
				if (result5_black != null) {

					Object[] result6_black = deculul2branchububImpl.pattern_deculul2branchubub_29_6_perform_blackBBBB(d,
							d2c, c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
								+ "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					deculul2branchububImpl.pattern_deculul2branchubub_29_6_perform_greenFBFFFFFFFFFFBFB(d, c,
							ruleResult);
					//nothing Assignment m = (Assignment) result6_green[0];
					//nothing S2N l2z = (S2N) result6_green[2];
					//nothing While a = (While) result6_green[3];
					//nothing Branch x = (Branch) result6_green[4];
					//nothing S2B a2x = (S2B) result6_green[5];
					//nothing Command w = (Command) result6_green[6];
					//nothing Assignment l = (Assignment) result6_green[7];
					//nothing S2N m2w = (S2N) result6_green[8];
					//nothing S2B b2y = (S2B) result6_green[9];
					//nothing Branch y = (Branch) result6_green[10];
					//nothing Command z = (Command) result6_green[11];
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
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_DECISION_WHILE_ASSIGNMENT_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.DECULUL2BRANCHUBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_DECISION_WHILE_ASSIGNMENT_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5));
			return null;
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_DECISION_WHILE_ASSIGNMENT_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_DECISION_WHILE_ASSIGNMENT_S2B_BRANCH_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(S2B) arguments.get(5), (Branch) arguments.get(6), (While) arguments.get(7));
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
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.DECULUL2BRANCHUBUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_BRANCH_COMMAND_S2B_BRANCH_COMMAND_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (S2B) arguments.get(4),
					(Branch) arguments.get(5), (Command) arguments.get(6), (Branch) arguments.get(7));
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
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_114__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_114((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_114__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_114((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_DECISION_WHILE_BRANCH_COMMAND_ASSIGNMENT_BRANCH_COMMAND_BRANCH_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Decision) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(Assignment) arguments.get(5), (Branch) arguments.get(6), (Command) arguments.get(7),
					(Branch) arguments.get(8), (While) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.DECULUL2BRANCHUBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECULUL2BRANCHUBUB___CHECK_DEC_FWD__ASSIGNMENT_DECISION_WHILE_ASSIGNMENT_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.DECULUL2BRANCHUBUB___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECULUL2BRANCHUBUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECULUL2BRANCHUBUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_S2B_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECULUL2BRANCHUBUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_deculul2branchubub_0_1_initialbindings_blackBBBBBBB(deculul2branchubub _this,
			Match match, Assignment m, Decision d, While a, Assignment l, While b) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				return new Object[] { _this, match, m, d, a, l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_0_2_SolveCSP_bindingFBBBBBBB(deculul2branchubub _this,
			Match match, Assignment m, Decision d, While a, Assignment l, While b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, m, d, a, l, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, m, d, a, l, b };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculul2branchubub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			deculul2branchubub _this, Match match, Assignment m, Decision d, While a, Assignment l, While b) {
		Object[] result_pattern_deculul2branchubub_0_2_SolveCSP_binding = pattern_deculul2branchubub_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, m, d, a, l, b);
		if (result_pattern_deculul2branchubub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculul2branchubub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_deculul2branchubub_0_2_SolveCSP_black = pattern_deculul2branchubub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_deculul2branchubub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, m, d, a, l, b };
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
			Assignment m, Decision d, While a, Assignment l, While b) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				return new Object[] { match, m, d, a, l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_0_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
			Match match, Assignment m, Decision d, While a, Assignment l, While b) {
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(m);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(b);
		String d__b____negative_name_prime = "negative";
		String a__l____first_name_prime = "first";
		String a__l____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		String b__m____last_name_prime = "last";
		String b__m____first_name_prime = "first";
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____first);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____last);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		match.getToBeTranslatedEdges().add(b__m____first);
		d__b____negative.setName(d__b____negative_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		return new Object[] { match, m, d, a, l, b, d__b____negative, a__l____first, a__l____last, d__a____positive,
				b__m____last, b__m____first };
	}

	public static final Object[] pattern_deculul2branchubub_0_5_collectcontextelements_blackBBBBBB(Match match,
			Assignment m, Decision d, While a, Assignment l, While b) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				return new Object[] { match, m, d, a, l, b };
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
			deculul2branchubub _this, Match match, Assignment m, Decision d, While a, Assignment l, While b) {
		_this.registerObjectsToMatch_FWD(match, m, d, a, l, b);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("m");
		EObject _localVariable_1 = isApplicableMatch.getObject("d");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("l");
		EObject _localVariable_4 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("c");
		EObject _localVariable_6 = isApplicableMatch.getObject("b");
		EObject tmpM = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpL = _localVariable_3;
		EObject tmpD2c = _localVariable_4;
		EObject tmpC = _localVariable_5;
		EObject tmpB = _localVariable_6;
		if (tmpM instanceof Assignment) {
			Assignment m = (Assignment) tmpM;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						if (tmpD2c instanceof S2B) {
							S2B d2c = (S2B) tmpD2c;
							if (tmpC instanceof Branch) {
								Branch c = (Branch) tmpC;
								if (tmpB instanceof While) {
									While b = (While) tmpB;
									return new Object[] { m, d, a, l, d2c, c, b, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_1_1_performtransformation_blackBBBBBBBFBB(Assignment m,
			Decision d, While a, Assignment l, S2B d2c, Branch c, While b, deculul2branchubub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { m, d, a, l, d2c, c, b, csp, _this, isApplicableMatch };
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
			Assignment m = (Assignment) result_pattern_deculul2branchubub_1_1_performtransformation_binding[0];
			Decision d = (Decision) result_pattern_deculul2branchubub_1_1_performtransformation_binding[1];
			While a = (While) result_pattern_deculul2branchubub_1_1_performtransformation_binding[2];
			Assignment l = (Assignment) result_pattern_deculul2branchubub_1_1_performtransformation_binding[3];
			S2B d2c = (S2B) result_pattern_deculul2branchubub_1_1_performtransformation_binding[4];
			Branch c = (Branch) result_pattern_deculul2branchubub_1_1_performtransformation_binding[5];
			While b = (While) result_pattern_deculul2branchubub_1_1_performtransformation_binding[6];

			Object[] result_pattern_deculul2branchubub_1_1_performtransformation_black = pattern_deculul2branchubub_1_1_performtransformation_blackBBBBBBBFBB(
					m, d, a, l, d2c, c, b, _this, isApplicableMatch);
			if (result_pattern_deculul2branchubub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_deculul2branchubub_1_1_performtransformation_black[7];

				return new Object[] { m, d, a, l, d2c, c, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_1_1_performtransformation_greenBFBFFFBFFFFBB(Assignment m,
			While a, Assignment l, Branch c, While b) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		l2z.setSource(l);
		c.setPositive(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		m2w.setSource(m);
		m2w.setTarget(w);
		b2y.setSource(b);
		w.setNext(y);
		y.setPositive(w);
		b2y.setTarget(y);
		c.setNegative(y);
		x.setPositive(z);
		z.setNext(x);
		l2z.setTarget(z);
		return new Object[] { m, l2z, a, x, a2x, w, l, m2w, b2y, y, z, c, b };
	}

	public static final Object[] pattern_deculul2branchubub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(
			Assignment m, S2N l2z, While a, Branch x, S2B a2x, Command w, Assignment l, S2N m2w, S2B b2y, Branch y,
			Command z, While b) {
		if (!l2z.equals(m2w)) {
			if (!a.equals(b)) {
				if (!x.equals(y)) {
					if (!a2x.equals(b2y)) {
						if (!w.equals(z)) {
							if (!l.equals(m)) {
								return new Object[] { m, l2z, a, x, a2x, w, l, m2w, b2y, y, z, b };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(
			Assignment m, S2N l2z, While a, Branch x, S2B a2x, Command w, Assignment l, S2N m2w, S2B b2y, Branch y,
			Command z, While b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(m);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(w);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(b);
		return new Object[] { ruleresult, m, l2z, a, x, a2x, w, l, m2w, b2y, y, z, b };
	}

	public static final Object[] pattern_deculul2branchubub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m, EObject d, EObject l2z, EObject a, EObject x, EObject a2x,
			EObject w, EObject l, EObject d2c, EObject m2w, EObject b2y, EObject y, EObject z, EObject c, EObject b) {
		if (!m.equals(x)) {
			if (!m.equals(w)) {
				if (!m.equals(m2w)) {
					if (!m.equals(y)) {
						if (!m.equals(z)) {
							if (!d.equals(m)) {
								if (!d.equals(l2z)) {
									if (!d.equals(x)) {
										if (!d.equals(w)) {
											if (!d.equals(l)) {
												if (!d.equals(d2c)) {
													if (!d.equals(m2w)) {
														if (!d.equals(y)) {
															if (!d.equals(z)) {
																if (!l2z.equals(m)) {
																	if (!l2z.equals(x)) {
																		if (!l2z.equals(w)) {
																			if (!l2z.equals(m2w)) {
																				if (!l2z.equals(y)) {
																					if (!l2z.equals(z)) {
																						if (!a.equals(m)) {
																							if (!a.equals(d)) {
																								if (!a.equals(l2z)) {
																									if (!a.equals(x)) {
																										if (!a.equals(
																												a2x)) {
																											if (!a.equals(
																													w)) {
																												if (!a.equals(
																														l)) {
																													if (!a.equals(
																															d2c)) {
																														if (!a.equals(
																																m2w)) {
																															if (!a.equals(
																																	b2y)) {
																																if (!a.equals(
																																		y)) {
																																	if (!a.equals(
																																			z)) {
																																		if (!a.equals(
																																				c)) {
																																			if (!a.equals(
																																					b)) {
																																				if (!x.equals(
																																						y)) {
																																					if (!x.equals(
																																							z)) {
																																						if (!a2x.equals(
																																								m)) {
																																							if (!a2x.equals(
																																									d)) {
																																								if (!a2x.equals(
																																										l2z)) {
																																									if (!a2x.equals(
																																											x)) {
																																										if (!a2x.equals(
																																												w)) {
																																											if (!a2x.equals(
																																													l)) {
																																												if (!a2x.equals(
																																														d2c)) {
																																													if (!a2x.equals(
																																															m2w)) {
																																														if (!a2x.equals(
																																																b2y)) {
																																															if (!a2x.equals(
																																																	y)) {
																																																if (!a2x.equals(
																																																		z)) {
																																																	if (!a2x.equals(
																																																			c)) {
																																																		if (!a2x.equals(
																																																				b)) {
																																																			if (!w.equals(
																																																					x)) {
																																																				if (!w.equals(
																																																						y)) {
																																																					if (!w.equals(
																																																							z)) {
																																																						if (!l.equals(
																																																								m)) {
																																																							if (!l.equals(
																																																									l2z)) {
																																																								if (!l.equals(
																																																										x)) {
																																																									if (!l.equals(
																																																											w)) {
																																																										if (!l.equals(
																																																												m2w)) {
																																																											if (!l.equals(
																																																													y)) {
																																																												if (!l.equals(
																																																														z)) {
																																																													if (!d2c.equals(
																																																															m)) {
																																																														if (!d2c.equals(
																																																																l2z)) {
																																																															if (!d2c.equals(
																																																																	x)) {
																																																																if (!d2c.equals(
																																																																		w)) {
																																																																	if (!d2c.equals(
																																																																			l)) {
																																																																		if (!d2c.equals(
																																																																				m2w)) {
																																																																			if (!d2c.equals(
																																																																					y)) {
																																																																				if (!d2c.equals(
																																																																						z)) {
																																																																					if (!m2w.equals(
																																																																							x)) {
																																																																						if (!m2w.equals(
																																																																								w)) {
																																																																							if (!m2w.equals(
																																																																									y)) {
																																																																								if (!m2w.equals(
																																																																										z)) {
																																																																									if (!b2y.equals(
																																																																											m)) {
																																																																										if (!b2y.equals(
																																																																												d)) {
																																																																											if (!b2y.equals(
																																																																													l2z)) {
																																																																												if (!b2y.equals(
																																																																														x)) {
																																																																													if (!b2y.equals(
																																																																															w)) {
																																																																														if (!b2y.equals(
																																																																																l)) {
																																																																															if (!b2y.equals(
																																																																																	d2c)) {
																																																																																if (!b2y.equals(
																																																																																		m2w)) {
																																																																																	if (!b2y.equals(
																																																																																			y)) {
																																																																																		if (!b2y.equals(
																																																																																				z)) {
																																																																																			if (!b2y.equals(
																																																																																					c)) {
																																																																																				if (!y.equals(
																																																																																						z)) {
																																																																																					if (!c.equals(
																																																																																							m)) {
																																																																																						if (!c.equals(
																																																																																								d)) {
																																																																																							if (!c.equals(
																																																																																									l2z)) {
																																																																																								if (!c.equals(
																																																																																										x)) {
																																																																																									if (!c.equals(
																																																																																											w)) {
																																																																																										if (!c.equals(
																																																																																												l)) {
																																																																																											if (!c.equals(
																																																																																													d2c)) {
																																																																																												if (!c.equals(
																																																																																														m2w)) {
																																																																																													if (!c.equals(
																																																																																															y)) {
																																																																																														if (!c.equals(
																																																																																																z)) {
																																																																																															if (!b.equals(
																																																																																																	m)) {
																																																																																																if (!b.equals(
																																																																																																		d)) {
																																																																																																	if (!b.equals(
																																																																																																			l2z)) {
																																																																																																		if (!b.equals(
																																																																																																				x)) {
																																																																																																			if (!b.equals(
																																																																																																					w)) {
																																																																																																				if (!b.equals(
																																																																																																						l)) {
																																																																																																					if (!b.equals(
																																																																																																							d2c)) {
																																																																																																						if (!b.equals(
																																																																																																								m2w)) {
																																																																																																							if (!b.equals(
																																																																																																									b2y)) {
																																																																																																								if (!b.equals(
																																																																																																										y)) {
																																																																																																									if (!b.equals(
																																																																																																											z)) {
																																																																																																										if (!b.equals(
																																																																																																												c)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													m,
																																																																																																													d,
																																																																																																													l2z,
																																																																																																													a,
																																																																																																													x,
																																																																																																													a2x,
																																																																																																													w,
																																																																																																													l,
																																																																																																													d2c,
																																																																																																													m2w,
																																																																																																													b2y,
																																																																																																													y,
																																																																																																													z,
																																																																																																													c,
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
			PerformRuleResult ruleresult, EObject m, EObject d, EObject l2z, EObject a, EObject x, EObject a2x,
			EObject w, EObject l, EObject m2w, EObject b2y, EObject y, EObject z, EObject c, EObject b) {
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "deculul2branchubub";
		String d__b____negative_name_prime = "negative";
		String a__l____first_name_prime = "first";
		String a2x__x____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String w__y____next_name_prime = "next";
		String l2z__l____source_name_prime = "source";
		String a2x__a____source_name_prime = "source";
		String x__z____positive_name_prime = "positive";
		String m2w__m____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String y__w____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String m2w__w____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String z__x____next_name_prime = "next";
		String l2z__z____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String b__m____last_name_prime = "last";
		String b__m____first_name_prime = "first";
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____first);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(w__y____next);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getCreatedEdges().add(x__z____positive);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		ruleresult.getCreatedEdges().add(y__w____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____last);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		ruleresult.getTranslatedEdges().add(b__m____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		return new Object[] { ruleresult, m, d, l2z, a, x, a2x, w, l, m2w, b2y, y, z, c, b, d__b____negative,
				a__l____first, a2x__x____target, a__l____last, w__y____next, l2z__l____source, a2x__a____source,
				x__z____positive, m2w__m____source, d__a____positive, y__w____positive, b2y__y____target,
				c__x____positive, m2w__w____target, c__y____negative, z__x____next, l2z__z____target, b2y__b____source,
				b__m____last, b__m____first };
	}

	public static final void pattern_deculul2branchubub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			deculul2branchubub _this, PerformRuleResult ruleresult, EObject m, EObject d, EObject l2z, EObject a,
			EObject x, EObject a2x, EObject w, EObject l, EObject d2c, EObject m2w, EObject b2y, EObject y, EObject z,
			EObject c, EObject b) {
		_this.registerObjects_FWD(ruleresult, m, d, l2z, a, x, a2x, w, l, d2c, m2w, b2y, y, z, c, b);

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
		EObject _localVariable_0 = match.getObject("m");
		EObject _localVariable_1 = match.getObject("d");
		EObject _localVariable_2 = match.getObject("a");
		EObject _localVariable_3 = match.getObject("l");
		EObject _localVariable_4 = match.getObject("b");
		EObject tmpM = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpL = _localVariable_3;
		EObject tmpB = _localVariable_4;
		if (tmpM instanceof Assignment) {
			Assignment m = (Assignment) tmpM;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						if (tmpB instanceof While) {
							While b = (While) tmpB;
							return new Object[] { m, d, a, l, b, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_2_2_corematch_blackBBBBFFBB(Assignment m,
			Decision d, While a, Assignment l, While b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class,
						"source")) {
					Branch c = d2c.getTarget();
					if (c != null) {
						_result.add(new Object[] { m, d, a, l, d2c, c, b, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_2_3_findcontext_blackBBBBBBB(Assignment m,
			Decision d, While a, Assignment l, S2B d2c, Branch c, While b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				if (b.equals(d.getNegative())) {
					if (l.equals(a.getFirst())) {
						if (l.equals(a.getLast())) {
							if (d.equals(d2c.getSource())) {
								if (a.equals(d.getPositive())) {
									if (c.equals(d2c.getTarget())) {
										if (m.equals(b.getLast())) {
											if (m.equals(b.getFirst())) {
												_result.add(new Object[] { m, d, a, l, d2c, c, b });
											}
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

	public static final Object[] pattern_deculul2branchubub_2_3_findcontext_greenBBBBBBBFFFFFFFFF(Assignment m,
			Decision d, While a, Assignment l, S2B d2c, Branch c, While b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d__b____negative_name_prime = "negative";
		String a__l____first_name_prime = "first";
		String a__l____last_name_prime = "last";
		String d2c__d____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String d2c__c____target_name_prime = "target";
		String b__m____last_name_prime = "last";
		String b__m____first_name_prime = "first";
		isApplicableMatch.getAllContextElements().add(m);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(b);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____first);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____last);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		isApplicableMatch.getAllContextElements().add(b__m____first);
		d__b____negative.setName(d__b____negative_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		return new Object[] { m, d, a, l, d2c, c, b, isApplicableMatch, d__b____negative, a__l____first, a__l____last,
				d2c__d____source, d__a____positive, d2c__c____target, b__m____last, b__m____first };
	}

	public static final Object[] pattern_deculul2branchubub_2_4_solveCSP_bindingFBBBBBBBBB(deculul2branchubub _this,
			IsApplicableMatch isApplicableMatch, Assignment m, Decision d, While a, Assignment l, S2B d2c, Branch c,
			While b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, m, d, a, l, d2c, c, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, m, d, a, l, d2c, c, b };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculul2branchubub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			deculul2branchubub _this, IsApplicableMatch isApplicableMatch, Assignment m, Decision d, While a,
			Assignment l, S2B d2c, Branch c, While b) {
		Object[] result_pattern_deculul2branchubub_2_4_solveCSP_binding = pattern_deculul2branchubub_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, m, d, a, l, d2c, c, b);
		if (result_pattern_deculul2branchubub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculul2branchubub_2_4_solveCSP_binding[0];

			Object[] result_pattern_deculul2branchubub_2_4_solveCSP_black = pattern_deculul2branchubub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_deculul2branchubub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, m, d, a, l, d2c, c, b };
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
			Match match, Branch x, Command w, Branch y, Command z, Branch c) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						return new Object[] { _this, match, x, w, y, z, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_10_2_SolveCSP_bindingFBBBBBBB(deculul2branchubub _this,
			Match match, Branch x, Command w, Branch y, Command z, Branch c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, w, y, z, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, w, y, z, c };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculul2branchubub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			deculul2branchubub _this, Match match, Branch x, Command w, Branch y, Command z, Branch c) {
		Object[] result_pattern_deculul2branchubub_10_2_SolveCSP_binding = pattern_deculul2branchubub_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, x, w, y, z, c);
		if (result_pattern_deculul2branchubub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculul2branchubub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_deculul2branchubub_10_2_SolveCSP_black = pattern_deculul2branchubub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_deculul2branchubub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, w, y, z, c };
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
			Branch x, Command w, Branch y, Command z, Branch c) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						return new Object[] { match, x, w, y, z, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_10_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
			Match match, Branch x, Command w, Branch y, Command z, Branch c) {
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(w);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		String w__y____next_name_prime = "next";
		String x__z____positive_name_prime = "positive";
		String y__w____positive_name_prime = "positive";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String z__x____next_name_prime = "next";
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(w__y____next);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		match.getToBeTranslatedEdges().add(x__z____positive);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		match.getToBeTranslatedEdges().add(y__w____positive);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		w__y____next.setName(w__y____next_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		return new Object[] { match, x, w, y, z, c, w__y____next, x__z____positive, y__w____positive, c__x____positive,
				c__y____negative, z__x____next };
	}

	public static final Object[] pattern_deculul2branchubub_10_5_collectcontextelements_blackBBBBBB(Match match,
			Branch x, Command w, Branch y, Command z, Branch c) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						return new Object[] { match, x, w, y, z, c };
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
			deculul2branchubub _this, Match match, Branch x, Command w, Branch y, Command z, Branch c) {
		_this.registerObjectsToMatch_BWD(match, x, w, y, z, c);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("w");
		EObject _localVariable_3 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("y");
		EObject _localVariable_5 = isApplicableMatch.getObject("z");
		EObject _localVariable_6 = isApplicableMatch.getObject("c");
		EObject tmpD = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpD2c = _localVariable_3;
		EObject tmpY = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		EObject tmpC = _localVariable_6;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpW instanceof Command) {
					Command w = (Command) tmpW;
					if (tmpD2c instanceof S2B) {
						S2B d2c = (S2B) tmpD2c;
						if (tmpY instanceof Branch) {
							Branch y = (Branch) tmpY;
							if (tmpZ instanceof Command) {
								Command z = (Command) tmpZ;
								if (tmpC instanceof Branch) {
									Branch c = (Branch) tmpC;
									return new Object[] { d, x, w, d2c, y, z, c, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_11_1_performtransformation_blackBBBBBBBFBB(Decision d,
			Branch x, Command w, S2B d2c, Branch y, Command z, Branch c, deculul2branchubub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { d, x, w, d2c, y, z, c, csp, _this, isApplicableMatch };
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
			Decision d = (Decision) result_pattern_deculul2branchubub_11_1_performtransformation_binding[0];
			Branch x = (Branch) result_pattern_deculul2branchubub_11_1_performtransformation_binding[1];
			Command w = (Command) result_pattern_deculul2branchubub_11_1_performtransformation_binding[2];
			S2B d2c = (S2B) result_pattern_deculul2branchubub_11_1_performtransformation_binding[3];
			Branch y = (Branch) result_pattern_deculul2branchubub_11_1_performtransformation_binding[4];
			Command z = (Command) result_pattern_deculul2branchubub_11_1_performtransformation_binding[5];
			Branch c = (Branch) result_pattern_deculul2branchubub_11_1_performtransformation_binding[6];

			Object[] result_pattern_deculul2branchubub_11_1_performtransformation_black = pattern_deculul2branchubub_11_1_performtransformation_blackBBBBBBBFBB(
					d, x, w, d2c, y, z, c, _this, isApplicableMatch);
			if (result_pattern_deculul2branchubub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_deculul2branchubub_11_1_performtransformation_black[7];

				return new Object[] { d, x, w, d2c, y, z, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_11_1_performtransformation_greenFBFFBFBFFFBBF(Decision d,
			Branch x, Command w, Branch y, Command z) {
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		l2z.setTarget(z);
		d.setPositive(a);
		a2x.setTarget(x);
		a2x.setSource(a);
		a.setFirst(l);
		a.setLast(l);
		l2z.setSource(l);
		m2w.setSource(m);
		m2w.setTarget(w);
		b2y.setTarget(y);
		d.setNegative(b);
		b2y.setSource(b);
		b.setLast(m);
		b.setFirst(m);
		return new Object[] { m, d, l2z, a, x, a2x, w, l, m2w, b2y, y, z, b };
	}

	public static final Object[] pattern_deculul2branchubub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(
			Assignment m, S2N l2z, While a, Branch x, S2B a2x, Command w, Assignment l, S2N m2w, S2B b2y, Branch y,
			Command z, While b) {
		if (!l2z.equals(m2w)) {
			if (!a.equals(b)) {
				if (!x.equals(y)) {
					if (!a2x.equals(b2y)) {
						if (!w.equals(z)) {
							if (!l.equals(m)) {
								return new Object[] { m, l2z, a, x, a2x, w, l, m2w, b2y, y, z, b };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(
			Assignment m, S2N l2z, While a, Branch x, S2B a2x, Command w, Assignment l, S2N m2w, S2B b2y, Branch y,
			Command z, While b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(m);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(w);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(m2w);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(b);
		return new Object[] { ruleresult, m, l2z, a, x, a2x, w, l, m2w, b2y, y, z, b };
	}

	public static final Object[] pattern_deculul2branchubub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m, EObject d, EObject l2z, EObject a, EObject x, EObject a2x,
			EObject w, EObject l, EObject d2c, EObject m2w, EObject b2y, EObject y, EObject z, EObject c, EObject b) {
		if (!m.equals(x)) {
			if (!m.equals(w)) {
				if (!m.equals(m2w)) {
					if (!m.equals(y)) {
						if (!m.equals(z)) {
							if (!d.equals(m)) {
								if (!d.equals(l2z)) {
									if (!d.equals(x)) {
										if (!d.equals(w)) {
											if (!d.equals(l)) {
												if (!d.equals(d2c)) {
													if (!d.equals(m2w)) {
														if (!d.equals(y)) {
															if (!d.equals(z)) {
																if (!l2z.equals(m)) {
																	if (!l2z.equals(x)) {
																		if (!l2z.equals(w)) {
																			if (!l2z.equals(m2w)) {
																				if (!l2z.equals(y)) {
																					if (!l2z.equals(z)) {
																						if (!a.equals(m)) {
																							if (!a.equals(d)) {
																								if (!a.equals(l2z)) {
																									if (!a.equals(x)) {
																										if (!a.equals(
																												a2x)) {
																											if (!a.equals(
																													w)) {
																												if (!a.equals(
																														l)) {
																													if (!a.equals(
																															d2c)) {
																														if (!a.equals(
																																m2w)) {
																															if (!a.equals(
																																	b2y)) {
																																if (!a.equals(
																																		y)) {
																																	if (!a.equals(
																																			z)) {
																																		if (!a.equals(
																																				c)) {
																																			if (!a.equals(
																																					b)) {
																																				if (!x.equals(
																																						y)) {
																																					if (!x.equals(
																																							z)) {
																																						if (!a2x.equals(
																																								m)) {
																																							if (!a2x.equals(
																																									d)) {
																																								if (!a2x.equals(
																																										l2z)) {
																																									if (!a2x.equals(
																																											x)) {
																																										if (!a2x.equals(
																																												w)) {
																																											if (!a2x.equals(
																																													l)) {
																																												if (!a2x.equals(
																																														d2c)) {
																																													if (!a2x.equals(
																																															m2w)) {
																																														if (!a2x.equals(
																																																b2y)) {
																																															if (!a2x.equals(
																																																	y)) {
																																																if (!a2x.equals(
																																																		z)) {
																																																	if (!a2x.equals(
																																																			c)) {
																																																		if (!a2x.equals(
																																																				b)) {
																																																			if (!w.equals(
																																																					x)) {
																																																				if (!w.equals(
																																																						y)) {
																																																					if (!w.equals(
																																																							z)) {
																																																						if (!l.equals(
																																																								m)) {
																																																							if (!l.equals(
																																																									l2z)) {
																																																								if (!l.equals(
																																																										x)) {
																																																									if (!l.equals(
																																																											w)) {
																																																										if (!l.equals(
																																																												m2w)) {
																																																											if (!l.equals(
																																																													y)) {
																																																												if (!l.equals(
																																																														z)) {
																																																													if (!d2c.equals(
																																																															m)) {
																																																														if (!d2c.equals(
																																																																l2z)) {
																																																															if (!d2c.equals(
																																																																	x)) {
																																																																if (!d2c.equals(
																																																																		w)) {
																																																																	if (!d2c.equals(
																																																																			l)) {
																																																																		if (!d2c.equals(
																																																																				m2w)) {
																																																																			if (!d2c.equals(
																																																																					y)) {
																																																																				if (!d2c.equals(
																																																																						z)) {
																																																																					if (!m2w.equals(
																																																																							x)) {
																																																																						if (!m2w.equals(
																																																																								w)) {
																																																																							if (!m2w.equals(
																																																																									y)) {
																																																																								if (!m2w.equals(
																																																																										z)) {
																																																																									if (!b2y.equals(
																																																																											m)) {
																																																																										if (!b2y.equals(
																																																																												d)) {
																																																																											if (!b2y.equals(
																																																																													l2z)) {
																																																																												if (!b2y.equals(
																																																																														x)) {
																																																																													if (!b2y.equals(
																																																																															w)) {
																																																																														if (!b2y.equals(
																																																																																l)) {
																																																																															if (!b2y.equals(
																																																																																	d2c)) {
																																																																																if (!b2y.equals(
																																																																																		m2w)) {
																																																																																	if (!b2y.equals(
																																																																																			y)) {
																																																																																		if (!b2y.equals(
																																																																																				z)) {
																																																																																			if (!b2y.equals(
																																																																																					c)) {
																																																																																				if (!y.equals(
																																																																																						z)) {
																																																																																					if (!c.equals(
																																																																																							m)) {
																																																																																						if (!c.equals(
																																																																																								d)) {
																																																																																							if (!c.equals(
																																																																																									l2z)) {
																																																																																								if (!c.equals(
																																																																																										x)) {
																																																																																									if (!c.equals(
																																																																																											w)) {
																																																																																										if (!c.equals(
																																																																																												l)) {
																																																																																											if (!c.equals(
																																																																																													d2c)) {
																																																																																												if (!c.equals(
																																																																																														m2w)) {
																																																																																													if (!c.equals(
																																																																																															y)) {
																																																																																														if (!c.equals(
																																																																																																z)) {
																																																																																															if (!b.equals(
																																																																																																	m)) {
																																																																																																if (!b.equals(
																																																																																																		d)) {
																																																																																																	if (!b.equals(
																																																																																																			l2z)) {
																																																																																																		if (!b.equals(
																																																																																																				x)) {
																																																																																																			if (!b.equals(
																																																																																																					w)) {
																																																																																																				if (!b.equals(
																																																																																																						l)) {
																																																																																																					if (!b.equals(
																																																																																																							d2c)) {
																																																																																																						if (!b.equals(
																																																																																																								m2w)) {
																																																																																																							if (!b.equals(
																																																																																																									b2y)) {
																																																																																																								if (!b.equals(
																																																																																																										y)) {
																																																																																																									if (!b.equals(
																																																																																																											z)) {
																																																																																																										if (!b.equals(
																																																																																																												c)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													m,
																																																																																																													d,
																																																																																																													l2z,
																																																																																																													a,
																																																																																																													x,
																																																																																																													a2x,
																																																																																																													w,
																																																																																																													l,
																																																																																																													d2c,
																																																																																																													m2w,
																																																																																																													b2y,
																																																																																																													y,
																																																																																																													z,
																																																																																																													c,
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
			PerformRuleResult ruleresult, EObject m, EObject d, EObject l2z, EObject a, EObject x, EObject a2x,
			EObject w, EObject l, EObject m2w, EObject b2y, EObject y, EObject z, EObject c, EObject b) {
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__m____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2w__w____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__m____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "deculul2branchubub";
		String d__b____negative_name_prime = "negative";
		String a__l____first_name_prime = "first";
		String a2x__x____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String w__y____next_name_prime = "next";
		String l2z__l____source_name_prime = "source";
		String a2x__a____source_name_prime = "source";
		String x__z____positive_name_prime = "positive";
		String m2w__m____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String y__w____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String m2w__w____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String z__x____next_name_prime = "next";
		String l2z__z____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String b__m____last_name_prime = "last";
		String b__m____first_name_prime = "first";
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____first);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(w__y____next);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getTranslatedEdges().add(x__z____positive);
		m2w__m____source.setSrc(m2w);
		m2w__m____source.setTrg(m);
		ruleresult.getCreatedEdges().add(m2w__m____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		ruleresult.getTranslatedEdges().add(y__w____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		m2w__w____target.setSrc(m2w);
		m2w__w____target.setTrg(w);
		ruleresult.getCreatedEdges().add(m2w__w____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b__m____last.setSrc(b);
		b__m____last.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____last);
		b__m____first.setSrc(b);
		b__m____first.setTrg(m);
		ruleresult.getCreatedEdges().add(b__m____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		w__y____next.setName(w__y____next_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		m2w__m____source.setName(m2w__m____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		m2w__w____target.setName(m2w__w____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b__m____last.setName(b__m____last_name_prime);
		b__m____first.setName(b__m____first_name_prime);
		return new Object[] { ruleresult, m, d, l2z, a, x, a2x, w, l, m2w, b2y, y, z, c, b, d__b____negative,
				a__l____first, a2x__x____target, a__l____last, w__y____next, l2z__l____source, a2x__a____source,
				x__z____positive, m2w__m____source, d__a____positive, y__w____positive, b2y__y____target,
				c__x____positive, m2w__w____target, c__y____negative, z__x____next, l2z__z____target, b2y__b____source,
				b__m____last, b__m____first };
	}

	public static final void pattern_deculul2branchubub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			deculul2branchubub _this, PerformRuleResult ruleresult, EObject m, EObject d, EObject l2z, EObject a,
			EObject x, EObject a2x, EObject w, EObject l, EObject d2c, EObject m2w, EObject b2y, EObject y, EObject z,
			EObject c, EObject b) {
		_this.registerObjects_BWD(ruleresult, m, d, l2z, a, x, a2x, w, l, d2c, m2w, b2y, y, z, c, b);

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
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("w");
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("z");
		EObject _localVariable_4 = match.getObject("c");
		EObject tmpX = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpC = _localVariable_4;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpW instanceof Command) {
				Command w = (Command) tmpW;
				if (tmpY instanceof Branch) {
					Branch y = (Branch) tmpY;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							return new Object[] { x, w, y, z, c, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_12_2_corematch_blackFBBFBBBB(Branch x, Command w,
			Branch y, Command z, Branch c, Match match) {
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
								_result.add(new Object[] { d, x, w, d2c, y, z, c, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_12_3_findcontext_blackBBBBBBB(Decision d,
			Branch x, Command w, S2B d2c, Branch y, Command z, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						if (y.equals(w.getNext())) {
							if (d.equals(d2c.getSource())) {
								if (z.equals(x.getPositive())) {
									if (w.equals(y.getPositive())) {
										if (c.equals(d2c.getTarget())) {
											if (x.equals(c.getPositive())) {
												if (y.equals(c.getNegative())) {
													if (x.equals(z.getNext())) {
														_result.add(new Object[] { d, x, w, d2c, y, z, c });
													}
												}
											}
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

	public static final Object[] pattern_deculul2branchubub_12_3_findcontext_greenBBBBBBBFFFFFFFFF(Decision d, Branch x,
			Command w, S2B d2c, Branch y, Command z, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__w____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__y____next_name_prime = "next";
		String d2c__d____source_name_prime = "source";
		String x__z____positive_name_prime = "positive";
		String y__w____positive_name_prime = "positive";
		String d2c__c____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String z__x____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(c);
		w__y____next.setSrc(w);
		w__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(w__y____next);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		isApplicableMatch.getAllContextElements().add(x__z____positive);
		y__w____positive.setSrc(y);
		y__w____positive.setTrg(w);
		isApplicableMatch.getAllContextElements().add(y__w____positive);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		w__y____next.setName(w__y____next_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		y__w____positive.setName(y__w____positive_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		return new Object[] { d, x, w, d2c, y, z, c, isApplicableMatch, w__y____next, d2c__d____source,
				x__z____positive, y__w____positive, d2c__c____target, c__x____positive, c__y____negative,
				z__x____next };
	}

	public static final Object[] pattern_deculul2branchubub_12_4_solveCSP_bindingFBBBBBBBBB(deculul2branchubub _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch x, Command w, S2B d2c, Branch y, Command z,
			Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, d, x, w, d2c, y, z, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, x, w, d2c, y, z, c };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculul2branchubub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			deculul2branchubub _this, IsApplicableMatch isApplicableMatch, Decision d, Branch x, Command w, S2B d2c,
			Branch y, Command z, Branch c) {
		Object[] result_pattern_deculul2branchubub_12_4_solveCSP_binding = pattern_deculul2branchubub_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, d, x, w, d2c, y, z, c);
		if (result_pattern_deculul2branchubub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculul2branchubub_12_4_solveCSP_binding[0];

			Object[] result_pattern_deculul2branchubub_12_4_solveCSP_black = pattern_deculul2branchubub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_deculul2branchubub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, x, w, d2c, y, z, c };
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_83656 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_1BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_401777 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_401777)) {
							if (!y.equals(__DEC_x_positive_401777)) {
								if (!c.equals(__DEC_x_positive_401777)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_2BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_797690 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_797690)) {
							if (!y.equals(__DEC_x_negative_797690)) {
								if (!c.equals(__DEC_x_negative_797690)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_3B(Command w) {
		for (Graph __DEC_w_root_151640 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_4BBBB(Command w,
			Branch x, Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_w_positive_971887 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!x.equals(__DEC_w_positive_971887)) {
							if (!y.equals(__DEC_w_positive_971887)) {
								if (!c.equals(__DEC_w_positive_971887)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_5BBBB(Command w,
			Branch x, Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_w_negative_100125 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!x.equals(__DEC_w_negative_100125)) {
							if (!y.equals(__DEC_w_negative_100125)) {
								if (!c.equals(__DEC_w_negative_100125)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_6B(Branch y) {
		for (Graph __DEC_y_root_709629 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_7BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_502748 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_502748)) {
							if (!x.equals(__DEC_y_positive_502748)) {
								if (!c.equals(__DEC_y_positive_502748)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_8BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_741787 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_741787)) {
							if (!x.equals(__DEC_y_negative_741787)) {
								if (!c.equals(__DEC_y_negative_741787)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_9B(Command z) {
		for (Graph __DEC_z_root_644377 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_10BBBB(Command z,
			Branch x, Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_positive_402383 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!x.equals(__DEC_z_positive_402383)) {
							if (!y.equals(__DEC_z_positive_402383)) {
								if (!c.equals(__DEC_z_positive_402383)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_11BBBB(Command z,
			Branch x, Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_negative_970448 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!x.equals(__DEC_z_negative_970448)) {
							if (!y.equals(__DEC_z_negative_970448)) {
								if (!c.equals(__DEC_z_negative_970448)) {
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_12BB(Branch x,
			Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_13BB(Branch c,
			Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
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

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_16BB(Branch c,
			Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_17BB(Branch x,
			Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_18BB(Branch x,
			Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
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
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_21BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_22BB(Branch y,
			Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_23BB(Branch c,
			Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_next.getSrc();
		if (tmpW instanceof Command) {
			Command w = (Command) tmpW;
			EObject tmpY = _edge_next.getTrg();
			if (tmpY instanceof Branch) {
				Branch y = (Branch) tmpY;
				if (y.equals(w.getNext())) {
					if (w.equals(y.getPositive())) {
						if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_3B(w) == null) {
							if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_6B(y) == null) {
								if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_15BB(y, w) == null) {
									for (Branch c : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(y, Branch.class, "negative")) {
										if (!c.equals(y)) {
											Node tmpX = c.getPositive();
											if (tmpX instanceof Branch) {
												Branch x = (Branch) tmpX;
												if (!x.equals(y)) {
													if (!c.equals(x)) {
														Node tmpZ = x.getPositive();
														if (tmpZ instanceof Command) {
															Command z = (Command) tmpZ;
															if (!w.equals(z)) {
																if (x.equals(z.getNext())) {
																	if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_13BB(
																			c, w) == null) {
																		if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_16BB(
																				c, w) == null) {
																			if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_0B(
																					x) == null) {
																				if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_1BBB(
																						x, y, c) == null) {
																					if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_2BBB(
																							x, y, c) == null) {
																						if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_4BBBB(
																								w, x, y, c) == null) {
																							if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_5BBBB(
																									w, x, y,
																									c) == null) {
																								if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_7BBB(
																										y, x,
																										c) == null) {
																									if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_8BBB(
																											y, x,
																											c) == null) {
																										if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_12BB(
																												x,
																												w) == null) {
																											if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_14BB(
																													x,
																													w) == null) {
																												if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_17BB(
																														x,
																														y) == null) {
																													if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_18BB(
																															x,
																															y) == null) {
																														if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_9B(
																																z) == null) {
																															if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_10BBBB(
																																	z,
																																	x,
																																	y,
																																	c) == null) {
																																if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_11BBBB(
																																		z,
																																		x,
																																		y,
																																		c) == null) {
																																	if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_19BB(
																																			y,
																																			z) == null) {
																																		if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_20BB(
																																				c,
																																				z) == null) {
																																			if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_21BB(
																																					x,
																																					z) == null) {
																																				if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_22BB(
																																						y,
																																						z) == null) {
																																					if (pattern_deculul2branchubub_20_2_testcorematchandDECs_black_nac_23BB(
																																							c,
																																							z) == null) {
																																						_result.add(
																																								new Object[] {
																																										x,
																																										w,
																																										y,
																																										z,
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
			deculul2branchubub _this, Match match, Branch x, Command w, Branch y, Command z, Branch c) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, w, y, z, c);
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

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_0BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_652749 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_652749)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_1BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_504676 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_504676)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_2BBB(Assignment m,
			While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_342048 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!a.equals(__DEC_m_last_342048)) {
					if (!b.equals(__DEC_m_last_342048)) {
						return new Object[] { m, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_3B(Assignment m) {
		for (Program __DEC_m_first_674801 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_4BB(While a,
			Decision d) {
		for (Decision __DEC_a_negative_298850 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_298850)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_5BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_503596 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_503596)) {
					if (!b.equals(__DEC_a_first_503596)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_6BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_667636 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_667636)) {
					if (!b.equals(__DEC_a_last_667636)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_7B(While a) {
		for (Program __DEC_a_first_640790 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_8BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_250556 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_250556)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_9BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_353183 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_353183)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_10BBB(Assignment l,
			While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_528093 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!a.equals(__DEC_l_last_528093)) {
					if (!b.equals(__DEC_l_last_528093)) {
						return new Object[] { l, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_11B(Assignment l) {
		for (Program __DEC_l_first_318082 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_12BB(While b,
			Decision d) {
		for (Decision __DEC_b_positive_246215 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_246215)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_13BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_195399 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_195399)) {
					if (!a.equals(__DEC_b_first_195399)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_14BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_988760 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_988760)) {
					if (!a.equals(__DEC_b_last_988760)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_15B(While b) {
		for (Program __DEC_b_first_449832 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_16BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_17BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_18BB(While a,
			Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_19BB(Decision d,
			While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_20BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_21BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_22BB(While b,
			Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
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
			EMoflonEdge _edge_negative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpD = _edge_negative.getSrc();
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			EObject tmpB = _edge_negative.getTrg();
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (b.equals(d.getNegative())) {
					Statement tmpA = d.getPositive();
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (!a.equals(b)) {
							Statement tmpM = b.getLast();
							if (tmpM instanceof Assignment) {
								Assignment m = (Assignment) tmpM;
								if (m.equals(b.getFirst())) {
									Statement tmpL = a.getFirst();
									if (tmpL instanceof Assignment) {
										Assignment l = (Assignment) tmpL;
										if (!l.equals(m)) {
											if (l.equals(a.getLast())) {
												if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_12BB(
														b, d) == null) {
													if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_15B(
															b) == null) {
														if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_23BB(
																d, b) == null) {
															if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_4BB(
																	a, d) == null) {
																if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_5BB(
																		a, b) == null) {
																	if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_6BB(
																			a, b) == null) {
																		if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_7B(
																				a) == null) {
																			if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_13BB(
																					b, a) == null) {
																				if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_14BB(
																						b, a) == null) {
																					if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_19BB(
																							d, a) == null) {
																						if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_24BB(
																								a, b) == null) {
																							if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_25BB(
																									a, b) == null) {
																								if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_0BB(
																										m, d) == null) {
																									if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_1BB(
																											m,
																											d) == null) {
																										if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_2BBB(
																												m, a,
																												b) == null) {
																											if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_3B(
																													m) == null) {
																												if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_16BB(
																														d,
																														m) == null) {
																													if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_17BB(
																															d,
																															m) == null) {
																														if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_18BB(
																																a,
																																m) == null) {
																															if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_8BB(
																																	l,
																																	d) == null) {
																																if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_9BB(
																																		l,
																																		d) == null) {
																																	if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_10BBB(
																																			l,
																																			a,
																																			b) == null) {
																																		if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_11B(
																																				l) == null) {
																																			if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_20BB(
																																					d,
																																					l) == null) {
																																				if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_21BB(
																																						d,
																																						l) == null) {
																																					if (pattern_deculul2branchubub_21_2_testcorematchandDECs_black_nac_22BB(
																																							b,
																																							l) == null) {
																																						_result.add(
																																								new Object[] {
																																										m,
																																										d,
																																										a,
																																										l,
																																										b,
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
			deculul2branchubub _this, Match match, Assignment m, Decision d, While a, Assignment l, While b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, m, d, a, l, b);
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
		EObject _localVariable_0 = sourceMatch.getObject("m");
		EObject _localVariable_1 = sourceMatch.getObject("d");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = targetMatch.getObject("x");
		EObject _localVariable_4 = targetMatch.getObject("w");
		EObject _localVariable_5 = sourceMatch.getObject("l");
		EObject _localVariable_6 = targetMatch.getObject("y");
		EObject _localVariable_7 = targetMatch.getObject("z");
		EObject _localVariable_8 = targetMatch.getObject("c");
		EObject _localVariable_9 = sourceMatch.getObject("b");
		EObject tmpM = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpL = _localVariable_5;
		EObject tmpY = _localVariable_6;
		EObject tmpZ = _localVariable_7;
		EObject tmpC = _localVariable_8;
		EObject tmpB = _localVariable_9;
		if (tmpM instanceof Assignment) {
			Assignment m = (Assignment) tmpM;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpW instanceof Command) {
							Command w = (Command) tmpW;
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								if (tmpY instanceof Branch) {
									Branch y = (Branch) tmpY;
									if (tmpZ instanceof Command) {
										Command z = (Command) tmpZ;
										if (tmpC instanceof Branch) {
											Branch c = (Branch) tmpC;
											if (tmpB instanceof While) {
												While b = (While) tmpB;
												return new Object[] { m, d, a, x, w, l, y, z, c, b, sourceMatch,
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

	public static final Object[] pattern_deculul2branchubub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Assignment m,
			Decision d, While a, Branch x, Command w, Assignment l, Branch y, Command z, Branch c, While b,
			Match sourceMatch, Match targetMatch) {
		if (!a.equals(b)) {
			if (!x.equals(y)) {
				if (!w.equals(z)) {
					if (!l.equals(m)) {
						if (!c.equals(x)) {
							if (!c.equals(y)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { m, d, a, x, w, l, y, z, c, b, sourceMatch, targetMatch };
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
			Assignment m = (Assignment) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[0];
			Decision d = (Decision) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[1];
			While a = (While) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[2];
			Branch x = (Branch) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[3];
			Command w = (Command) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[4];
			Assignment l = (Assignment) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[5];
			Branch y = (Branch) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[6];
			Command z = (Command) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[7];
			Branch c = (Branch) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[8];
			While b = (While) result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_black = pattern_deculul2branchubub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					m, d, a, x, w, l, y, z, c, b, sourceMatch, targetMatch);
			if (result_pattern_deculul2branchubub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { m, d, a, x, w, l, y, z, c, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			deculul2branchubub _this, Assignment m, Decision d, While a, Branch x, Command w, Assignment l, Branch y,
			Command z, Branch c, While b, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(m, d, a, x, w, l, y, z, c, b, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, m, d, a, x, w, l, y, z, c, b, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculul2branchubub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			deculul2branchubub _this, Assignment m, Decision d, While a, Branch x, Command w, Assignment l, Branch y,
			Command z, Branch c, While b, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_deculul2branchubub_24_3_solvecsp_binding = pattern_deculul2branchubub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, m, d, a, x, w, l, y, z, c, b, sourceMatch, targetMatch);
		if (result_pattern_deculul2branchubub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_deculul2branchubub_24_3_solvecsp_binding[0];

			Object[] result_pattern_deculul2branchubub_24_3_solvecsp_black = pattern_deculul2branchubub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_deculul2branchubub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, m, d, a, x, w, l, y, z, c, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_deculul2branchubub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_deculul2branchubub_24_5_matchcorrcontext_blackBFBBB(Decision d,
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

	public static final Object[] pattern_deculul2branchubub_24_6_createcorrespondence_blackBBBBBBBBBBB(Assignment m,
			Decision d, While a, Branch x, Command w, Assignment l, Branch y, Command z, Branch c, While b,
			CCMatch ccMatch) {
		if (!a.equals(b)) {
			if (!x.equals(y)) {
				if (!w.equals(z)) {
					if (!l.equals(m)) {
						if (!c.equals(x)) {
							if (!c.equals(y)) {
								return new Object[] { m, d, a, x, w, l, y, z, c, b, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_24_6_createcorrespondence_greenBFBBFBBFFBBBB(Assignment m,
			While a, Branch x, Command w, Assignment l, Branch y, Command z, While b, CCMatch ccMatch) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		m2w.setSource(m);
		m2w.setTarget(w);
		ccMatch.getCreateCorr().add(m2w);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { m, l2z, a, x, a2x, w, l, m2w, b2y, y, z, b, ccMatch };
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

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_0BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_positive_633287 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_m_positive_633287)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_1BB(Assignment m,
			Decision d) {
		for (Decision __DEC_m_negative_237206 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_m_negative_237206)) {
				return new Object[] { m, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_2BBB(Assignment m, While a,
			While b) {
		if (!a.equals(b)) {
			for (While __DEC_m_last_574354 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
					While.class, "last")) {
				if (!a.equals(__DEC_m_last_574354)) {
					if (!b.equals(__DEC_m_last_574354)) {
						return new Object[] { m, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_3B(Assignment m) {
		for (Program __DEC_m_first_966484 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(m,
				Program.class, "first")) {
			return new Object[] { m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_148594 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_148594)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_5BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_first_565695 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_565695)) {
					if (!b.equals(__DEC_a_first_565695)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_6BB(While a, While b) {
		if (!a.equals(b)) {
			for (While __DEC_a_last_901460 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_901460)) {
					if (!b.equals(__DEC_a_last_901460)) {
						return new Object[] { a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_7B(While a) {
		for (Program __DEC_a_first_142435 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_8BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_278053 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_278053)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_9BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_728505 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_728505)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_10BBB(Assignment l, While a,
			While b) {
		if (!a.equals(b)) {
			for (While __DEC_l_last_490355 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					While.class, "last")) {
				if (!a.equals(__DEC_l_last_490355)) {
					if (!b.equals(__DEC_l_last_490355)) {
						return new Object[] { l, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_11B(Assignment l) {
		for (Program __DEC_l_first_465158 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_12BB(While b, Decision d) {
		for (Decision __DEC_b_positive_533918 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_533918)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_13BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_first_115089 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!b.equals(__DEC_b_first_115089)) {
					if (!a.equals(__DEC_b_first_115089)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_14BB(While b, While a) {
		if (!a.equals(b)) {
			for (While __DEC_b_last_819070 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!b.equals(__DEC_b_last_819070)) {
					if (!a.equals(__DEC_b_last_819070)) {
						return new Object[] { b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_15B(While b) {
		for (Program __DEC_b_first_911860 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_16BB(Decision d,
			Assignment m) {
		if (m.equals(d.getPositive())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_17BB(Decision d,
			Assignment m) {
		if (m.equals(d.getNegative())) {
			return new Object[] { d, m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_18BB(While a, Assignment m) {
		if (m.equals(a.getLast())) {
			return new Object[] { a, m };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_19BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_20BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_21BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_22BB(While b, Assignment l) {
		if (l.equals(b.getLast())) {
			return new Object[] { b, l };
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

	public static final Object[] pattern_deculul2branchubub_27_1_matchtggpattern_blackBBBBB(Assignment m, Decision d,
			While a, Assignment l, While b) {
		if (!a.equals(b)) {
			if (!l.equals(m)) {
				if (b.equals(d.getNegative())) {
					if (l.equals(a.getFirst())) {
						if (l.equals(a.getLast())) {
							if (a.equals(d.getPositive())) {
								if (m.equals(b.getLast())) {
									if (m.equals(b.getFirst())) {
										if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_0BB(m,
												d) == null) {
											if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_1BB(m,
													d) == null) {
												if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_2BBB(m, a,
														b) == null) {
													if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_3B(
															m) == null) {
														if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_4BB(
																a, d) == null) {
															if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_5BB(
																	a, b) == null) {
																if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_6BB(
																		a, b) == null) {
																	if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_7B(
																			a) == null) {
																		if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_8BB(
																				l, d) == null) {
																			if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_9BB(
																					l, d) == null) {
																				if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_10BBB(
																						l, a, b) == null) {
																					if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_11B(
																							l) == null) {
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
																												m) == null) {
																											if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_17BB(
																													d,
																													m) == null) {
																												if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_18BB(
																														a,
																														m) == null) {
																													if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_19BB(
																															d,
																															a) == null) {
																														if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_20BB(
																																d,
																																l) == null) {
																															if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_21BB(
																																	d,
																																	l) == null) {
																																if (pattern_deculul2branchubub_27_1_matchtggpattern_black_nac_22BB(
																																		b,
																																		l) == null) {
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
																																						m,
																																						d,
																																						a,
																																						l,
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_418159 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_1BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_212213 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_212213)) {
							if (!y.equals(__DEC_x_positive_212213)) {
								if (!c.equals(__DEC_x_positive_212213)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_2BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_829056 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_829056)) {
							if (!y.equals(__DEC_x_negative_829056)) {
								if (!c.equals(__DEC_x_negative_829056)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_3B(Command w) {
		for (Graph __DEC_w_root_576089 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w,
				Graph.class, "root")) {
			return new Object[] { w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_4BBBB(Command w, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_w_positive_948486 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "positive")) {
						if (!x.equals(__DEC_w_positive_948486)) {
							if (!y.equals(__DEC_w_positive_948486)) {
								if (!c.equals(__DEC_w_positive_948486)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_5BBBB(Command w, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_w_negative_147047 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(w, Branch.class, "negative")) {
						if (!x.equals(__DEC_w_negative_147047)) {
							if (!y.equals(__DEC_w_negative_147047)) {
								if (!c.equals(__DEC_w_negative_147047)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_6B(Branch y) {
		for (Graph __DEC_y_root_434553 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_7BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_816438 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_816438)) {
							if (!x.equals(__DEC_y_positive_816438)) {
								if (!c.equals(__DEC_y_positive_816438)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_8BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_129517 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_129517)) {
							if (!x.equals(__DEC_y_negative_129517)) {
								if (!c.equals(__DEC_y_negative_129517)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_9B(Command z) {
		for (Graph __DEC_z_root_43289 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_10BBBB(Command z, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_positive_790592 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!x.equals(__DEC_z_positive_790592)) {
							if (!y.equals(__DEC_z_positive_790592)) {
								if (!c.equals(__DEC_z_positive_790592)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_11BBBB(Command z, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_negative_173988 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!x.equals(__DEC_z_negative_173988)) {
							if (!y.equals(__DEC_z_negative_173988)) {
								if (!c.equals(__DEC_z_negative_173988)) {
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

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_12BB(Branch x, Command w) {
		if (w.equals(x.getPositive())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_13BB(Branch c, Command w) {
		if (w.equals(c.getPositive())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_14BB(Branch x, Command w) {
		if (w.equals(x.getNegative())) {
			return new Object[] { x, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_15BB(Branch y, Command w) {
		if (w.equals(y.getNegative())) {
			return new Object[] { y, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_16BB(Branch c, Command w) {
		if (w.equals(c.getNegative())) {
			return new Object[] { c, w };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_17BB(Branch x, Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_18BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
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
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_21BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_22BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_23BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_28_1_matchtggpattern_blackBBBBB(Branch x, Command w,
			Branch y, Command z, Branch c) {
		if (!x.equals(y)) {
			if (!w.equals(z)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						if (y.equals(w.getNext())) {
							if (z.equals(x.getPositive())) {
								if (w.equals(y.getPositive())) {
									if (x.equals(c.getPositive())) {
										if (y.equals(c.getNegative())) {
											if (x.equals(z.getNext())) {
												if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_0B(
														x) == null) {
													if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_1BBB(
															x, y, c) == null) {
														if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_2BBB(
																x, y, c) == null) {
															if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_3B(
																	w) == null) {
																if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_4BBBB(
																		w, x, y, c) == null) {
																	if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_5BBBB(
																			w, x, y, c) == null) {
																		if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_6B(
																				y) == null) {
																			if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_7BBB(
																					y, x, c) == null) {
																				if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_8BBB(
																						y, x, c) == null) {
																					if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_9B(
																							z) == null) {
																						if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_10BBBB(
																								z, x, y, c) == null) {
																							if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_11BBBB(
																									z, x, y,
																									c) == null) {
																								if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_12BB(
																										x, w) == null) {
																									if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_13BB(
																											c,
																											w) == null) {
																										if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_14BB(
																												x,
																												w) == null) {
																											if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_15BB(
																													y,
																													w) == null) {
																												if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_16BB(
																														c,
																														w) == null) {
																													if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_17BB(
																															x,
																															y) == null) {
																														if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_18BB(
																																x,
																																y) == null) {
																															if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_19BB(
																																	y,
																																	z) == null) {
																																if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_20BB(
																																		c,
																																		z) == null) {
																																	if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_21BB(
																																			x,
																																			z) == null) {
																																		if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_22BB(
																																				y,
																																				z) == null) {
																																			if (pattern_deculul2branchubub_28_1_matchtggpattern_black_nac_23BB(
																																					c,
																																					z) == null) {
																																				return new Object[] {
																																						x,
																																						w,
																																						y,
																																						z,
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
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
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
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						Branch c = d2c.getTarget();
						if (c != null) {
							if (pattern_deculul2branchubub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									d2c) == null) {
								if (pattern_deculul2branchubub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										d) == null) {
									if (pattern_deculul2branchubub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_deculul2branchubub_29_3_solveCSP_bindingFBBBBBB(deculul2branchubub _this,
			IsApplicableMatch isApplicableMatch, Decision d, S2B d2c, Branch c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d, d2c, c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, d2c, c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_deculul2branchubub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculul2branchubub_29_3_solveCSP_bindingAndBlackFBBBBBB(
			deculul2branchubub _this, IsApplicableMatch isApplicableMatch, Decision d, S2B d2c, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_deculul2branchubub_29_3_solveCSP_binding = pattern_deculul2branchubub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d, d2c, c, ruleResult);
		if (result_pattern_deculul2branchubub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculul2branchubub_29_3_solveCSP_binding[0];

			Object[] result_pattern_deculul2branchubub_29_3_solveCSP_black = pattern_deculul2branchubub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_deculul2branchubub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, d2c, c, ruleResult };
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

	public static final Object[] pattern_deculul2branchubub_29_5_checknacs_blackBBB(Decision d, S2B d2c, Branch c) {
		return new Object[] { d, d2c, c };
	}

	public static final Object[] pattern_deculul2branchubub_29_6_perform_blackBBBB(Decision d, S2B d2c, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d, d2c, c, ruleResult };
	}

	public static final Object[] pattern_deculul2branchubub_29_6_perform_greenFBFFFFFFFFFFBFB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		Assignment m = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command w = ControlflowFactory.eINSTANCE.createCommand();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N m2w = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(m);
		ruleResult.getCorrObjects().add(l2z);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.getTargetObjects().add(w);
		a.setFirst(l);
		a.setLast(l);
		l2z.setSource(l);
		ruleResult.getSourceObjects().add(l);
		m2w.setSource(m);
		m2w.setTarget(w);
		ruleResult.getCorrObjects().add(m2w);
		ruleResult.getCorrObjects().add(b2y);
		w.setNext(y);
		y.setPositive(w);
		b2y.setTarget(y);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		x.setPositive(z);
		z.setNext(x);
		l2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		d.setNegative(b);
		b2y.setSource(b);
		b.setLast(m);
		b.setFirst(m);
		ruleResult.getSourceObjects().add(b);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { m, d, l2z, a, x, a2x, w, l, m2w, b2y, y, z, c, b, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_deculul2branchubub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //deculul2branchububImpl
