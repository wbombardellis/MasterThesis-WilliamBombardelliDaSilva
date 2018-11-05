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
import org.wbsilva.bx.sourcecode2controlflow.Rules.deculd2branchubb;

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
 * An implementation of the model object '<em><b>deculd2branchubb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class deculd2branchubbImpl extends AbstractRuleImpl implements deculd2branchubb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected deculd2branchubbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdeculd2branchubb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment l, Decision b, While a, Decision d) {

		Object[] result1_black = deculd2branchubbImpl.pattern_deculd2branchubb_0_1_initialbindings_blackBBBBBB(this,
				match, l, b, a, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = deculd2branchubbImpl
				.pattern_deculd2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, l, b, a, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (deculd2branchubbImpl.pattern_deculd2branchubb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = deculd2branchubbImpl
					.pattern_deculd2branchubb_0_4_collectelementstobetranslated_blackBBBBB(match, l, b, a, d);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[l] = " + l + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
			}
			deculd2branchubbImpl.pattern_deculd2branchubb_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, l, b,
					a, d);
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge a__l____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[8];

			Object[] result5_black = deculd2branchubbImpl
					.pattern_deculd2branchubb_0_5_collectcontextelements_blackBBBBB(match, l, b, a, d);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[l] = " + l + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
			}
			deculd2branchubbImpl.pattern_deculd2branchubb_0_5_collectcontextelements_greenBB(match, d);

			// 
			deculd2branchubbImpl.pattern_deculd2branchubb_0_6_registerobjectstomatch_expressionBBBBBB(this, match, l, b,
					a, d);
			return deculd2branchubbImpl.pattern_deculd2branchubb_0_7_expressionF();
		} else {
			return deculd2branchubbImpl.pattern_deculd2branchubb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = deculd2branchubbImpl
				.pattern_deculd2branchubb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment l = (Assignment) result1_bindingAndBlack[0];
		S2B d2c = (S2B) result1_bindingAndBlack[1];
		Decision b = (Decision) result1_bindingAndBlack[2];
		Branch c = (Branch) result1_bindingAndBlack[3];
		While a = (While) result1_bindingAndBlack[4];
		Decision d = (Decision) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = deculd2branchubbImpl
				.pattern_deculd2branchubb_1_1_performtransformation_greenBFBFFFBBFF(l, b, c, a);
		S2B b2y = (S2B) result1_green[1];
		S2N l2z = (S2N) result1_green[3];
		S2B a2x = (S2B) result1_green[4];
		Command z = (Command) result1_green[5];
		Branch x = (Branch) result1_green[8];
		Branch y = (Branch) result1_green[9];

		Object[] result2_black = deculd2branchubbImpl
				.pattern_deculd2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBB(l, b2y, b, l2z, a2x, z, a, x, y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", " + "[b2y] = "
					+ b2y + ", " + "[b] = " + b + ", " + "[l2z] = " + l2z + ", " + "[a2x] = " + a2x + ", " + "[z] = "
					+ z + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = deculd2branchubbImpl
				.pattern_deculd2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBB(l, b2y, b, l2z, a2x, z, a, x,
						y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = deculd2branchubbImpl
				.pattern_deculd2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, l, b2y, d2c, b, l2z,
						a2x, z, c, a, x, y, d);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l] = " + l + ", " + "[b2y] = " + b2y + ", " + "[d2c] = " + d2c + ", " + "[b] = " + b
					+ ", " + "[l2z] = " + l2z + ", " + "[a2x] = " + a2x + ", " + "[z] = " + z + ", " + "[c] = " + c
					+ ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[d] = " + d + ".");
		}
		deculd2branchubbImpl.pattern_deculd2branchubb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, l, b2y, b, l2z, a2x, z, c, a, x, y, d);
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[25];

		// 
		// 
		deculd2branchubbImpl.pattern_deculd2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, l,
				b2y, d2c, b, l2z, a2x, z, c, a, x, y, d);
		return deculd2branchubbImpl.pattern_deculd2branchubb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = deculd2branchubbImpl
				.pattern_deculd2branchubb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = deculd2branchubbImpl
				.pattern_deculd2branchubb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = deculd2branchubbImpl.pattern_deculd2branchubb_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment l = (Assignment) result2_binding[0];
		Decision b = (Decision) result2_binding[1];
		While a = (While) result2_binding[2];
		Decision d = (Decision) result2_binding[3];
		for (Object[] result2_black : deculd2branchubbImpl.pattern_deculd2branchubb_2_2_corematch_blackBFBFBBB(l, b, a,
				d, match)) {
			S2B d2c = (S2B) result2_black[1];
			Branch c = (Branch) result2_black[3];
			// ForEach 
			for (Object[] result3_black : deculd2branchubbImpl.pattern_deculd2branchubb_2_3_findcontext_blackBBBBBB(l,
					d2c, b, c, a, d)) {
				Object[] result3_green = deculd2branchubbImpl
						.pattern_deculd2branchubb_2_3_findcontext_greenBBBBBBFFFFFFF(l, d2c, b, c, a, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = deculd2branchubbImpl
						.pattern_deculd2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, l, d2c,
								b, c, a, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[l] = " + l + ", " + "[d2c] = "
							+ d2c + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[d] = "
							+ d + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (deculd2branchubbImpl.pattern_deculd2branchubb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = deculd2branchubbImpl
							.pattern_deculd2branchubb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					deculd2branchubbImpl.pattern_deculd2branchubb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return deculd2branchubbImpl.pattern_deculd2branchubb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment l, Decision b, While a, Decision d) {
		match.registerObject("l", l);
		match.registerObject("b", b);
		match.registerObject("a", a);
		match.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment l, Decision b, While a, Decision d) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment l, S2B d2c, Decision b,
			Branch c, While a, Decision d) {// Create CSP
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
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject l, EObject b2y, EObject d2c, EObject b,
			EObject l2z, EObject a2x, EObject z, EObject c, EObject a, EObject x, EObject y, EObject d) {
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command z, Branch c, Branch x, Branch y) {

		Object[] result1_black = deculd2branchubbImpl.pattern_deculd2branchubb_10_1_initialbindings_blackBBBBBB(this,
				match, z, c, x, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", "
					+ "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = deculd2branchubbImpl
				.pattern_deculd2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, z, c, x, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", "
					+ "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (deculd2branchubbImpl.pattern_deculd2branchubb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = deculd2branchubbImpl
					.pattern_deculd2branchubb_10_4_collectelementstobetranslated_blackBBBBB(match, z, c, x, y);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			deculd2branchubbImpl.pattern_deculd2branchubb_10_4_collectelementstobetranslated_greenBBBBBFFFF(match, z, c,
					x, y);
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[8];

			Object[] result5_black = deculd2branchubbImpl
					.pattern_deculd2branchubb_10_5_collectcontextelements_blackBBBBB(match, z, c, x, y);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			deculd2branchubbImpl.pattern_deculd2branchubb_10_5_collectcontextelements_greenBB(match, c);

			// 
			deculd2branchubbImpl.pattern_deculd2branchubb_10_6_registerobjectstomatch_expressionBBBBBB(this, match, z,
					c, x, y);
			return deculd2branchubbImpl.pattern_deculd2branchubb_10_7_expressionF();
		} else {
			return deculd2branchubbImpl.pattern_deculd2branchubb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = deculd2branchubbImpl
				.pattern_deculd2branchubb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2B d2c = (S2B) result1_bindingAndBlack[0];
		Command z = (Command) result1_bindingAndBlack[1];
		Branch c = (Branch) result1_bindingAndBlack[2];
		Branch x = (Branch) result1_bindingAndBlack[3];
		Branch y = (Branch) result1_bindingAndBlack[4];
		Decision d = (Decision) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = deculd2branchubbImpl
				.pattern_deculd2branchubb_11_1_performtransformation_greenFFFFFBFBBB(z, x, y, d);
		Assignment l = (Assignment) result1_green[0];
		S2B b2y = (S2B) result1_green[1];
		Decision b = (Decision) result1_green[2];
		S2N l2z = (S2N) result1_green[3];
		S2B a2x = (S2B) result1_green[4];
		While a = (While) result1_green[6];

		Object[] result2_black = deculd2branchubbImpl
				.pattern_deculd2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBB(l, b2y, b, l2z, a2x, z, a, x,
						y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", " + "[b2y] = "
					+ b2y + ", " + "[b] = " + b + ", " + "[l2z] = " + l2z + ", " + "[a2x] = " + a2x + ", " + "[z] = "
					+ z + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = deculd2branchubbImpl
				.pattern_deculd2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBB(l, b2y, b, l2z, a2x, z, a, x,
						y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = deculd2branchubbImpl
				.pattern_deculd2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, l, b2y, d2c, b, l2z,
						a2x, z, c, a, x, y, d);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l] = " + l + ", " + "[b2y] = " + b2y + ", " + "[d2c] = " + d2c + ", " + "[b] = " + b
					+ ", " + "[l2z] = " + l2z + ", " + "[a2x] = " + a2x + ", " + "[z] = " + z + ", " + "[c] = " + c
					+ ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[d] = " + d + ".");
		}
		deculd2branchubbImpl.pattern_deculd2branchubb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, l, b2y, b, l2z, a2x, z, c, a, x, y, d);
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[25];

		// 
		// 
		deculd2branchubbImpl.pattern_deculd2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, l,
				b2y, d2c, b, l2z, a2x, z, c, a, x, y, d);
		return deculd2branchubbImpl.pattern_deculd2branchubb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = deculd2branchubbImpl
				.pattern_deculd2branchubb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = deculd2branchubbImpl
				.pattern_deculd2branchubb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = deculd2branchubbImpl.pattern_deculd2branchubb_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command z = (Command) result2_binding[0];
		Branch c = (Branch) result2_binding[1];
		Branch x = (Branch) result2_binding[2];
		Branch y = (Branch) result2_binding[3];
		for (Object[] result2_black : deculd2branchubbImpl.pattern_deculd2branchubb_12_2_corematch_blackFBBBBFB(z, c, x,
				y, match)) {
			S2B d2c = (S2B) result2_black[0];
			Decision d = (Decision) result2_black[5];
			// ForEach 
			for (Object[] result3_black : deculd2branchubbImpl
					.pattern_deculd2branchubb_12_3_findcontext_blackBBBBBB(d2c, z, c, x, y, d)) {
				Object[] result3_green = deculd2branchubbImpl
						.pattern_deculd2branchubb_12_3_findcontext_greenBBBBBBFFFFFFF(d2c, z, c, x, y, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = deculd2branchubbImpl
						.pattern_deculd2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d2c,
								z, c, x, y, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[z] = "
							+ z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[d] = " + d
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (deculd2branchubbImpl.pattern_deculd2branchubb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = deculd2branchubbImpl
							.pattern_deculd2branchubb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					deculd2branchubbImpl.pattern_deculd2branchubb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return deculd2branchubbImpl.pattern_deculd2branchubb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command z, Branch c, Branch x, Branch y) {
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
	public CSP isAppropriate_solveCsp_BWD(Match match, Command z, Branch c, Branch x, Branch y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B d2c, Command z, Branch c, Branch x,
			Branch y, Decision d) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("y", y);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject l, EObject b2y, EObject d2c, EObject b,
			EObject l2z, EObject a2x, EObject z, EObject c, EObject a, EObject x, EObject y, EObject d) {
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d", d);

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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_84(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = deculd2branchubbImpl
				.pattern_deculd2branchubb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = deculd2branchubbImpl.pattern_deculd2branchubb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : deculd2branchubbImpl
				.pattern_deculd2branchubb_20_2_testcorematchandDECs_blackFFFFB(_edge_next)) {
			Command z = (Command) result2_black[0];
			Branch c = (Branch) result2_black[1];
			Branch x = (Branch) result2_black[2];
			Branch y = (Branch) result2_black[3];
			Object[] result2_green = deculd2branchubbImpl
					.pattern_deculd2branchubb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (deculd2branchubbImpl
					.pattern_deculd2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, z, c, x, y)) {
				// 
				if (deculd2branchubbImpl
						.pattern_deculd2branchubb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = deculd2branchubbImpl
							.pattern_deculd2branchubb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					deculd2branchubbImpl.pattern_deculd2branchubb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return deculd2branchubbImpl.pattern_deculd2branchubb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_90(EMoflonEdge _edge_last) {

		Object[] result1_bindingAndBlack = deculd2branchubbImpl
				.pattern_deculd2branchubb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = deculd2branchubbImpl.pattern_deculd2branchubb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : deculd2branchubbImpl
				.pattern_deculd2branchubb_21_2_testcorematchandDECs_blackFFFFB(_edge_last)) {
			Assignment l = (Assignment) result2_black[0];
			Decision b = (Decision) result2_black[1];
			While a = (While) result2_black[2];
			Decision d = (Decision) result2_black[3];
			Object[] result2_green = deculd2branchubbImpl
					.pattern_deculd2branchubb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (deculd2branchubbImpl
					.pattern_deculd2branchubb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, l, b, a, d)) {
				// 
				if (deculd2branchubbImpl
						.pattern_deculd2branchubb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = deculd2branchubbImpl
							.pattern_deculd2branchubb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					deculd2branchubbImpl.pattern_deculd2branchubb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return deculd2branchubbImpl.pattern_deculd2branchubb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("deculd2branchubb");
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
		ruleResult.setRule("deculd2branchubb");
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

		Object[] result1_black = deculd2branchubbImpl.pattern_deculd2branchubb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = deculd2branchubbImpl.pattern_deculd2branchubb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = deculd2branchubbImpl
				.pattern_deculd2branchubb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Assignment l = (Assignment) result2_bindingAndBlack[0];
		Decision b = (Decision) result2_bindingAndBlack[1];
		Command z = (Command) result2_bindingAndBlack[2];
		Branch c = (Branch) result2_bindingAndBlack[3];
		While a = (While) result2_bindingAndBlack[4];
		Branch x = (Branch) result2_bindingAndBlack[5];
		Branch y = (Branch) result2_bindingAndBlack[6];
		Decision d = (Decision) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = deculd2branchubbImpl
				.pattern_deculd2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, l, b, z, c, a, x, y, d,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[l] = " + l + ", " + "[b] = " + b + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[a] = "
					+ a + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[d] = " + d + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (deculd2branchubbImpl.pattern_deculd2branchubb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : deculd2branchubbImpl
					.pattern_deculd2branchubb_24_5_matchcorrcontext_blackFBBBB(c, d, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[0];
				Object[] result5_green = deculd2branchubbImpl
						.pattern_deculd2branchubb_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = deculd2branchubbImpl
						.pattern_deculd2branchubb_24_6_createcorrespondence_blackBBBBBBBBB(l, b, z, c, a, x, y, d,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", "
							+ "[b] = " + b + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
							+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[d] = " + d + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				deculd2branchubbImpl.pattern_deculd2branchubb_24_6_createcorrespondence_greenBFBFFBBBBB(l, b, z, a, x,
						y, ccMatch);
				//nothing S2B b2y = (S2B) result6_green[1];
				//nothing S2N l2z = (S2N) result6_green[3];
				//nothing S2B a2x = (S2B) result6_green[4];

				Object[] result7_black = deculd2branchubbImpl
						.pattern_deculd2branchubb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				deculd2branchubbImpl.pattern_deculd2branchubb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return deculd2branchubbImpl.pattern_deculd2branchubb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Assignment l, Decision b, Command z, Branch c, While a, Branch x, Branch y,
			Decision d, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment l, Decision b, While a, Decision d) {// 
		Object[] result1_black = deculd2branchubbImpl.pattern_deculd2branchubb_27_1_matchtggpattern_blackBBBB(l, b, a,
				d);
		if (result1_black != null) {
			return deculd2branchubbImpl.pattern_deculd2branchubb_27_2_expressionF();
		} else {
			return deculd2branchubbImpl.pattern_deculd2branchubb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command z, Branch c, Branch x, Branch y) {// 
		Object[] result1_black = deculd2branchubbImpl.pattern_deculd2branchubb_28_1_matchtggpattern_blackBBBB(z, c, x,
				y);
		if (result1_black != null) {
			return deculd2branchubbImpl.pattern_deculd2branchubb_28_2_expressionF();
		} else {
			return deculd2branchubbImpl.pattern_deculd2branchubb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = deculd2branchubbImpl.pattern_deculd2branchubb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = deculd2branchubbImpl.pattern_deculd2branchubb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : deculd2branchubbImpl
				.pattern_deculd2branchubb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			S2B d2c = (S2B) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = deculd2branchubbImpl
					.pattern_deculd2branchubb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d2c, c, d,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (deculd2branchubbImpl.pattern_deculd2branchubb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = deculd2branchubbImpl.pattern_deculd2branchubb_29_5_checknacs_blackBBB(d2c, c,
						d);
				if (result5_black != null) {

					Object[] result6_black = deculd2branchubbImpl.pattern_deculd2branchubb_29_6_perform_blackBBBB(d2c,
							c, d, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2c] = " + d2c + ", "
								+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					deculd2branchubbImpl.pattern_deculd2branchubb_29_6_perform_greenFFFFFFBFFFBB(c, d, ruleResult);
					//nothing Assignment l = (Assignment) result6_green[0];
					//nothing S2B b2y = (S2B) result6_green[1];
					//nothing Decision b = (Decision) result6_green[2];
					//nothing S2N l2z = (S2N) result6_green[3];
					//nothing S2B a2x = (S2B) result6_green[4];
					//nothing Command z = (Command) result6_green[5];
					//nothing While a = (While) result6_green[7];
					//nothing Branch x = (Branch) result6_green[8];
					//nothing Branch y = (Branch) result6_green[9];

				} else {
				}

			} else {
			}

		}
		return deculd2branchubbImpl.pattern_deculd2branchubb_29_7_expressionFB(ruleResult);
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
		case RulesPackage.DECULD2BRANCHUBB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_DECISION_WHILE_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECULD2BRANCHUBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_DECISION_WHILE_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4));
			return null;
		case RulesPackage.DECULD2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_DECISION_WHILE_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_S2B_DECISION_BRANCH_WHILE_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(S2B) arguments.get(2), (Decision) arguments.get(3), (Branch) arguments.get(4),
					(While) arguments.get(5), (Decision) arguments.get(6));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECULD2BRANCHUBB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECULD2BRANCHUBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.DECULD2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_COMMAND_BRANCH_BRANCH_BRANCH_DECISION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5), (Decision) arguments.get(6));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECULD2BRANCHUBB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_84__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_84((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_90__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_90((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_DECISION_COMMAND_BRANCH_WHILE_BRANCH_BRANCH_DECISION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Decision) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5), (Branch) arguments.get(6), (Decision) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECULD2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECULD2BRANCHUBB___CHECK_DEC_FWD__ASSIGNMENT_DECISION_WHILE_DECISION:
			return checkDEC_FWD((Assignment) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3));
		case RulesPackage.DECULD2BRANCHUBB___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.DECULD2BRANCHUBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECULD2BRANCHUBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (Decision) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECULD2BRANCHUBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_deculd2branchubb_0_1_initialbindings_blackBBBBBB(deculd2branchubb _this,
			Match match, Assignment l, Decision b, While a, Decision d) {
		if (!b.equals(d)) {
			return new Object[] { _this, match, l, b, a, d };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_0_2_SolveCSP_bindingFBBBBBB(deculd2branchubb _this,
			Match match, Assignment l, Decision b, While a, Decision d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, l, b, a, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, l, b, a, d };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculd2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBB(deculd2branchubb _this,
			Match match, Assignment l, Decision b, While a, Decision d) {
		Object[] result_pattern_deculd2branchubb_0_2_SolveCSP_binding = pattern_deculd2branchubb_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, l, b, a, d);
		if (result_pattern_deculd2branchubb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculd2branchubb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_deculd2branchubb_0_2_SolveCSP_black = pattern_deculd2branchubb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_deculd2branchubb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, l, b, a, d };
			}
		}
		return null;
	}

	public static final boolean pattern_deculd2branchubb_0_3_CheckCSP_expressionFBB(deculd2branchubb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Assignment l, Decision b, While a, Decision d) {
		if (!b.equals(d)) {
			return new Object[] { match, l, b, a, d };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_0_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Assignment l, Decision b, While a, Decision d) {
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		String a__l____last_name_prime = "last";
		String a__l____first_name_prime = "first";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____first);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		a__l____last.setName(a__l____last_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { match, l, b, a, d, a__l____last, a__l____first, d__b____negative, d__a____positive };
	}

	public static final Object[] pattern_deculd2branchubb_0_5_collectcontextelements_blackBBBBB(Match match,
			Assignment l, Decision b, While a, Decision d) {
		if (!b.equals(d)) {
			return new Object[] { match, l, b, a, d };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_deculd2branchubb_0_6_registerobjectstomatch_expressionBBBBBB(
			deculd2branchubb _this, Match match, Assignment l, Decision b, While a, Decision d) {
		_this.registerObjectsToMatch_FWD(match, l, b, a, d);

	}

	public static final boolean pattern_deculd2branchubb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_deculd2branchubb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("l");
		EObject _localVariable_1 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("b");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("a");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject tmpL = _localVariable_0;
		EObject tmpD2c = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpD = _localVariable_5;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpD2c instanceof S2B) {
				S2B d2c = (S2B) tmpD2c;
				if (tmpB instanceof Decision) {
					Decision b = (Decision) tmpB;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								return new Object[] { l, d2c, b, c, a, d, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_1_1_performtransformation_blackBBBBBBFBB(Assignment l,
			S2B d2c, Decision b, Branch c, While a, Decision d, deculd2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!b.equals(d)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { l, d2c, b, c, a, d, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			deculd2branchubb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_deculd2branchubb_1_1_performtransformation_binding = pattern_deculd2branchubb_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_deculd2branchubb_1_1_performtransformation_binding != null) {
			Assignment l = (Assignment) result_pattern_deculd2branchubb_1_1_performtransformation_binding[0];
			S2B d2c = (S2B) result_pattern_deculd2branchubb_1_1_performtransformation_binding[1];
			Decision b = (Decision) result_pattern_deculd2branchubb_1_1_performtransformation_binding[2];
			Branch c = (Branch) result_pattern_deculd2branchubb_1_1_performtransformation_binding[3];
			While a = (While) result_pattern_deculd2branchubb_1_1_performtransformation_binding[4];
			Decision d = (Decision) result_pattern_deculd2branchubb_1_1_performtransformation_binding[5];

			Object[] result_pattern_deculd2branchubb_1_1_performtransformation_black = pattern_deculd2branchubb_1_1_performtransformation_blackBBBBBBFBB(
					l, d2c, b, c, a, d, _this, isApplicableMatch);
			if (result_pattern_deculd2branchubb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_deculd2branchubb_1_1_performtransformation_black[6];

				return new Object[] { l, d2c, b, c, a, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_1_1_performtransformation_greenBFBFFFBBFF(Assignment l,
			Decision b, Branch c, While a) {
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		b2y.setSource(b);
		l2z.setSource(l);
		a2x.setSource(a);
		l2z.setTarget(z);
		z.setNext(x);
		x.setPositive(z);
		a2x.setTarget(x);
		c.setPositive(x);
		c.setNegative(y);
		b2y.setTarget(y);
		return new Object[] { l, b2y, b, l2z, a2x, z, c, a, x, y };
	}

	public static final Object[] pattern_deculd2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBB(Assignment l,
			S2B b2y, Decision b, S2N l2z, S2B a2x, Command z, While a, Branch x, Branch y) {
		if (!a2x.equals(b2y)) {
			if (!x.equals(y)) {
				return new Object[] { l, b2y, b, l2z, a2x, z, a, x, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBB(Assignment l,
			S2B b2y, Decision b, S2N l2z, S2B a2x, Command z, While a, Branch x, Branch y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedElements().add(y);
		return new Object[] { ruleresult, l, b2y, b, l2z, a2x, z, a, x, y };
	}

	public static final Object[] pattern_deculd2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l, EObject b2y, EObject d2c, EObject b, EObject l2z, EObject a2x,
			EObject z, EObject c, EObject a, EObject x, EObject y, EObject d) {
		if (!l.equals(l2z)) {
			if (!l.equals(z)) {
				if (!l.equals(x)) {
					if (!l.equals(y)) {
						if (!b2y.equals(l)) {
							if (!b2y.equals(d2c)) {
								if (!b2y.equals(l2z)) {
									if (!b2y.equals(z)) {
										if (!b2y.equals(c)) {
											if (!b2y.equals(x)) {
												if (!b2y.equals(y)) {
													if (!b2y.equals(d)) {
														if (!d2c.equals(l)) {
															if (!d2c.equals(l2z)) {
																if (!d2c.equals(z)) {
																	if (!d2c.equals(x)) {
																		if (!d2c.equals(y)) {
																			if (!b.equals(l)) {
																				if (!b.equals(b2y)) {
																					if (!b.equals(d2c)) {
																						if (!b.equals(l2z)) {
																							if (!b.equals(z)) {
																								if (!b.equals(c)) {
																									if (!b.equals(x)) {
																										if (!b.equals(
																												y)) {
																											if (!b.equals(
																													d)) {
																												if (!l2z.equals(
																														z)) {
																													if (!l2z.equals(
																															x)) {
																														if (!l2z.equals(
																																y)) {
																															if (!a2x.equals(
																																	l)) {
																																if (!a2x.equals(
																																		b2y)) {
																																	if (!a2x.equals(
																																			d2c)) {
																																		if (!a2x.equals(
																																				b)) {
																																			if (!a2x.equals(
																																					l2z)) {
																																				if (!a2x.equals(
																																						z)) {
																																					if (!a2x.equals(
																																							c)) {
																																						if (!a2x.equals(
																																								x)) {
																																							if (!a2x.equals(
																																									y)) {
																																								if (!a2x.equals(
																																										d)) {
																																									if (!c.equals(
																																											l)) {
																																										if (!c.equals(
																																												d2c)) {
																																											if (!c.equals(
																																													l2z)) {
																																												if (!c.equals(
																																														z)) {
																																													if (!c.equals(
																																															x)) {
																																														if (!c.equals(
																																																y)) {
																																															if (!c.equals(
																																																	d)) {
																																																if (!a.equals(
																																																		l)) {
																																																	if (!a.equals(
																																																			b2y)) {
																																																		if (!a.equals(
																																																				d2c)) {
																																																			if (!a.equals(
																																																					b)) {
																																																				if (!a.equals(
																																																						l2z)) {
																																																					if (!a.equals(
																																																							a2x)) {
																																																						if (!a.equals(
																																																								z)) {
																																																							if (!a.equals(
																																																									c)) {
																																																								if (!a.equals(
																																																										x)) {
																																																									if (!a.equals(
																																																											y)) {
																																																										if (!a.equals(
																																																												d)) {
																																																											if (!x.equals(
																																																													z)) {
																																																												if (!x.equals(
																																																														y)) {
																																																													if (!y.equals(
																																																															z)) {
																																																														if (!d.equals(
																																																																l)) {
																																																															if (!d.equals(
																																																																	d2c)) {
																																																																if (!d.equals(
																																																																		l2z)) {
																																																																	if (!d.equals(
																																																																			z)) {
																																																																		if (!d.equals(
																																																																				x)) {
																																																																			if (!d.equals(
																																																																					y)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						l,
																																																																						b2y,
																																																																						d2c,
																																																																						b,
																																																																						l2z,
																																																																						a2x,
																																																																						z,
																																																																						c,
																																																																						a,
																																																																						x,
																																																																						y,
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
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_deculd2branchubb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l, EObject b2y, EObject b, EObject l2z, EObject a2x, EObject z,
			EObject c, EObject a, EObject x, EObject y, EObject d) {
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "deculd2branchubb";
		String l2z__l____source_name_prime = "source";
		String z__x____next_name_prime = "next";
		String l2z__z____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a2x__a____source_name_prime = "source";
		String c__y____negative_name_prime = "negative";
		String x__z____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String a__l____first_name_prime = "first";
		String b2y__y____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getCreatedEdges().add(x__z____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____first);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { ruleresult, l, b2y, b, l2z, a2x, z, c, a, x, y, d, l2z__l____source, z__x____next,
				l2z__z____target, b2y__b____source, a2x__a____source, c__y____negative, x__z____positive,
				a2x__x____target, a__l____last, a__l____first, b2y__y____target, c__x____positive, d__b____negative,
				d__a____positive };
	}

	public static final void pattern_deculd2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			deculd2branchubb _this, PerformRuleResult ruleresult, EObject l, EObject b2y, EObject d2c, EObject b,
			EObject l2z, EObject a2x, EObject z, EObject c, EObject a, EObject x, EObject y, EObject d) {
		_this.registerObjects_FWD(ruleresult, l, b2y, d2c, b, l2z, a2x, z, c, a, x, y, d);

	}

	public static final PerformRuleResult pattern_deculd2branchubb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_2_1_preparereturnvalue_bindingFB(deculd2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			deculd2branchubb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_2_1_preparereturnvalue_bindingAndBlackFFB(
			deculd2branchubb _this) {
		Object[] result_pattern_deculd2branchubb_2_1_preparereturnvalue_binding = pattern_deculd2branchubb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_deculd2branchubb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_deculd2branchubb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_deculd2branchubb_2_1_preparereturnvalue_black = pattern_deculd2branchubb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_deculd2branchubb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_deculd2branchubb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "deculd2branchubb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_deculd2branchubb_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("l");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("a");
		EObject _localVariable_3 = match.getObject("d");
		EObject tmpL = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpD = _localVariable_3;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpB instanceof Decision) {
				Decision b = (Decision) tmpB;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						return new Object[] { l, b, a, d, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_deculd2branchubb_2_2_corematch_blackBFBFBBB(Assignment l, Decision b,
			While a, Decision d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { l, d2c, b, c, a, d, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_deculd2branchubb_2_3_findcontext_blackBBBBBB(Assignment l, S2B d2c,
			Decision b, Branch c, While a, Decision d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			if (c.equals(d2c.getTarget())) {
				if (l.equals(a.getLast())) {
					if (l.equals(a.getFirst())) {
						if (d.equals(d2c.getSource())) {
							if (b.equals(d.getNegative())) {
								if (a.equals(d.getPositive())) {
									_result.add(new Object[] { l, d2c, b, c, a, d });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_2_3_findcontext_greenBBBBBBFFFFFFF(Assignment l, S2B d2c,
			Decision b, Branch c, While a, Decision d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String a__l____first_name_prime = "first";
		String d2c__d____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____first);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__c____target.setName(d2c__c____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { l, d2c, b, c, a, d, isApplicableMatch, d2c__c____target, a__l____last, a__l____first,
				d2c__d____source, d__b____negative, d__a____positive };
	}

	public static final Object[] pattern_deculd2branchubb_2_4_solveCSP_bindingFBBBBBBBB(deculd2branchubb _this,
			IsApplicableMatch isApplicableMatch, Assignment l, S2B d2c, Decision b, Branch c, While a, Decision d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, l, d2c, b, c, a, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, l, d2c, b, c, a, d };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculd2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(deculd2branchubb _this,
			IsApplicableMatch isApplicableMatch, Assignment l, S2B d2c, Decision b, Branch c, While a, Decision d) {
		Object[] result_pattern_deculd2branchubb_2_4_solveCSP_binding = pattern_deculd2branchubb_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, l, d2c, b, c, a, d);
		if (result_pattern_deculd2branchubb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculd2branchubb_2_4_solveCSP_binding[0];

			Object[] result_pattern_deculd2branchubb_2_4_solveCSP_black = pattern_deculd2branchubb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_deculd2branchubb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, l, d2c, b, c, a, d };
			}
		}
		return null;
	}

	public static final boolean pattern_deculd2branchubb_2_5_checkCSP_expressionFBB(deculd2branchubb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_deculd2branchubb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "deculd2branchubb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_deculd2branchubb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_10_1_initialbindings_blackBBBBBB(deculd2branchubb _this,
			Match match, Command z, Branch c, Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					return new Object[] { _this, match, z, c, x, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_10_2_SolveCSP_bindingFBBBBBB(deculd2branchubb _this,
			Match match, Command z, Branch c, Branch x, Branch y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, c, x, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, c, x, y };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculd2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBB(deculd2branchubb _this,
			Match match, Command z, Branch c, Branch x, Branch y) {
		Object[] result_pattern_deculd2branchubb_10_2_SolveCSP_binding = pattern_deculd2branchubb_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, z, c, x, y);
		if (result_pattern_deculd2branchubb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculd2branchubb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_deculd2branchubb_10_2_SolveCSP_black = pattern_deculd2branchubb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_deculd2branchubb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, c, x, y };
			}
		}
		return null;
	}

	public static final boolean pattern_deculd2branchubb_10_3_CheckCSP_expressionFBB(deculd2branchubb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Command z, Branch c, Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					return new Object[] { match, z, c, x, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_10_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Command z, Branch c, Branch x, Branch y) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		String z__x____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		String x__z____positive_name_prime = "positive";
		String c__x____positive_name_prime = "positive";
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		match.getToBeTranslatedEdges().add(x__z____positive);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		z__x____next.setName(z__x____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		return new Object[] { match, z, c, x, y, z__x____next, c__y____negative, x__z____positive, c__x____positive };
	}

	public static final Object[] pattern_deculd2branchubb_10_5_collectcontextelements_blackBBBBB(Match match, Command z,
			Branch c, Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					return new Object[] { match, z, c, x, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_deculd2branchubb_10_6_registerobjectstomatch_expressionBBBBBB(
			deculd2branchubb _this, Match match, Command z, Branch c, Branch x, Branch y) {
		_this.registerObjectsToMatch_BWD(match, z, c, x, y);

	}

	public static final boolean pattern_deculd2branchubb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_deculd2branchubb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_1 = isApplicableMatch.getObject("z");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("x");
		EObject _localVariable_4 = isApplicableMatch.getObject("y");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject tmpD2c = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpY = _localVariable_4;
		EObject tmpD = _localVariable_5;
		if (tmpD2c instanceof S2B) {
			S2B d2c = (S2B) tmpD2c;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpY instanceof Branch) {
							Branch y = (Branch) tmpY;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								return new Object[] { d2c, z, c, x, y, d, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_11_1_performtransformation_blackBBBBBBFBB(S2B d2c, Command z,
			Branch c, Branch x, Branch y, Decision d, deculd2branchubb _this, IsApplicableMatch isApplicableMatch) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { d2c, z, c, x, y, d, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			deculd2branchubb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_deculd2branchubb_11_1_performtransformation_binding = pattern_deculd2branchubb_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_deculd2branchubb_11_1_performtransformation_binding != null) {
			S2B d2c = (S2B) result_pattern_deculd2branchubb_11_1_performtransformation_binding[0];
			Command z = (Command) result_pattern_deculd2branchubb_11_1_performtransformation_binding[1];
			Branch c = (Branch) result_pattern_deculd2branchubb_11_1_performtransformation_binding[2];
			Branch x = (Branch) result_pattern_deculd2branchubb_11_1_performtransformation_binding[3];
			Branch y = (Branch) result_pattern_deculd2branchubb_11_1_performtransformation_binding[4];
			Decision d = (Decision) result_pattern_deculd2branchubb_11_1_performtransformation_binding[5];

			Object[] result_pattern_deculd2branchubb_11_1_performtransformation_black = pattern_deculd2branchubb_11_1_performtransformation_blackBBBBBBFBB(
					d2c, z, c, x, y, d, _this, isApplicableMatch);
			if (result_pattern_deculd2branchubb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_deculd2branchubb_11_1_performtransformation_black[6];

				return new Object[] { d2c, z, c, x, y, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_11_1_performtransformation_greenFFFFFBFBBB(Command z,
			Branch x, Branch y, Decision d) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision b = SourcecodeFactory.eINSTANCE.createDecision();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		b2y.setTarget(y);
		b2y.setSource(b);
		d.setNegative(b);
		l2z.setSource(l);
		l2z.setTarget(z);
		a2x.setTarget(x);
		a2x.setSource(a);
		a.setLast(l);
		a.setFirst(l);
		d.setPositive(a);
		return new Object[] { l, b2y, b, l2z, a2x, z, a, x, y, d };
	}

	public static final Object[] pattern_deculd2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBB(Assignment l,
			S2B b2y, Decision b, S2N l2z, S2B a2x, Command z, While a, Branch x, Branch y) {
		if (!a2x.equals(b2y)) {
			if (!x.equals(y)) {
				return new Object[] { l, b2y, b, l2z, a2x, z, a, x, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBB(Assignment l,
			S2B b2y, Decision b, S2N l2z, S2B a2x, Command z, While a, Branch x, Branch y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getTranslatedElements().add(y);
		return new Object[] { ruleresult, l, b2y, b, l2z, a2x, z, a, x, y };
	}

	public static final Object[] pattern_deculd2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l, EObject b2y, EObject d2c, EObject b, EObject l2z, EObject a2x,
			EObject z, EObject c, EObject a, EObject x, EObject y, EObject d) {
		if (!l.equals(l2z)) {
			if (!l.equals(z)) {
				if (!l.equals(x)) {
					if (!l.equals(y)) {
						if (!b2y.equals(l)) {
							if (!b2y.equals(d2c)) {
								if (!b2y.equals(l2z)) {
									if (!b2y.equals(z)) {
										if (!b2y.equals(c)) {
											if (!b2y.equals(x)) {
												if (!b2y.equals(y)) {
													if (!b2y.equals(d)) {
														if (!d2c.equals(l)) {
															if (!d2c.equals(l2z)) {
																if (!d2c.equals(z)) {
																	if (!d2c.equals(x)) {
																		if (!d2c.equals(y)) {
																			if (!b.equals(l)) {
																				if (!b.equals(b2y)) {
																					if (!b.equals(d2c)) {
																						if (!b.equals(l2z)) {
																							if (!b.equals(z)) {
																								if (!b.equals(c)) {
																									if (!b.equals(x)) {
																										if (!b.equals(
																												y)) {
																											if (!b.equals(
																													d)) {
																												if (!l2z.equals(
																														z)) {
																													if (!l2z.equals(
																															x)) {
																														if (!l2z.equals(
																																y)) {
																															if (!a2x.equals(
																																	l)) {
																																if (!a2x.equals(
																																		b2y)) {
																																	if (!a2x.equals(
																																			d2c)) {
																																		if (!a2x.equals(
																																				b)) {
																																			if (!a2x.equals(
																																					l2z)) {
																																				if (!a2x.equals(
																																						z)) {
																																					if (!a2x.equals(
																																							c)) {
																																						if (!a2x.equals(
																																								x)) {
																																							if (!a2x.equals(
																																									y)) {
																																								if (!a2x.equals(
																																										d)) {
																																									if (!c.equals(
																																											l)) {
																																										if (!c.equals(
																																												d2c)) {
																																											if (!c.equals(
																																													l2z)) {
																																												if (!c.equals(
																																														z)) {
																																													if (!c.equals(
																																															x)) {
																																														if (!c.equals(
																																																y)) {
																																															if (!c.equals(
																																																	d)) {
																																																if (!a.equals(
																																																		l)) {
																																																	if (!a.equals(
																																																			b2y)) {
																																																		if (!a.equals(
																																																				d2c)) {
																																																			if (!a.equals(
																																																					b)) {
																																																				if (!a.equals(
																																																						l2z)) {
																																																					if (!a.equals(
																																																							a2x)) {
																																																						if (!a.equals(
																																																								z)) {
																																																							if (!a.equals(
																																																									c)) {
																																																								if (!a.equals(
																																																										x)) {
																																																									if (!a.equals(
																																																											y)) {
																																																										if (!a.equals(
																																																												d)) {
																																																											if (!x.equals(
																																																													z)) {
																																																												if (!x.equals(
																																																														y)) {
																																																													if (!y.equals(
																																																															z)) {
																																																														if (!d.equals(
																																																																l)) {
																																																															if (!d.equals(
																																																																	d2c)) {
																																																																if (!d.equals(
																																																																		l2z)) {
																																																																	if (!d.equals(
																																																																			z)) {
																																																																		if (!d.equals(
																																																																				x)) {
																																																																			if (!d.equals(
																																																																					y)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						l,
																																																																						b2y,
																																																																						d2c,
																																																																						b,
																																																																						l2z,
																																																																						a2x,
																																																																						z,
																																																																						c,
																																																																						a,
																																																																						x,
																																																																						y,
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
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_deculd2branchubb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l, EObject b2y, EObject b, EObject l2z, EObject a2x, EObject z,
			EObject c, EObject a, EObject x, EObject y, EObject d) {
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "deculd2branchubb";
		String l2z__l____source_name_prime = "source";
		String z__x____next_name_prime = "next";
		String l2z__z____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a2x__a____source_name_prime = "source";
		String c__y____negative_name_prime = "negative";
		String x__z____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String a__l____first_name_prime = "first";
		String b2y__y____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getTranslatedEdges().add(x__z____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____first);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { ruleresult, l, b2y, b, l2z, a2x, z, c, a, x, y, d, l2z__l____source, z__x____next,
				l2z__z____target, b2y__b____source, a2x__a____source, c__y____negative, x__z____positive,
				a2x__x____target, a__l____last, a__l____first, b2y__y____target, c__x____positive, d__b____negative,
				d__a____positive };
	}

	public static final void pattern_deculd2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			deculd2branchubb _this, PerformRuleResult ruleresult, EObject l, EObject b2y, EObject d2c, EObject b,
			EObject l2z, EObject a2x, EObject z, EObject c, EObject a, EObject x, EObject y, EObject d) {
		_this.registerObjects_BWD(ruleresult, l, b2y, d2c, b, l2z, a2x, z, c, a, x, y, d);

	}

	public static final PerformRuleResult pattern_deculd2branchubb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_12_1_preparereturnvalue_bindingFB(deculd2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			deculd2branchubb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_12_1_preparereturnvalue_bindingAndBlackFFB(
			deculd2branchubb _this) {
		Object[] result_pattern_deculd2branchubb_12_1_preparereturnvalue_binding = pattern_deculd2branchubb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_deculd2branchubb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_deculd2branchubb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_deculd2branchubb_12_1_preparereturnvalue_black = pattern_deculd2branchubb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_deculd2branchubb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_deculd2branchubb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "deculd2branchubb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_deculd2branchubb_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("z");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("x");
		EObject _localVariable_3 = match.getObject("y");
		EObject tmpZ = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpY = _localVariable_3;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpY instanceof Branch) {
						Branch y = (Branch) tmpY;
						return new Object[] { z, c, x, y, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_deculd2branchubb_12_2_corematch_blackFBBBBFB(Command z, Branch c,
			Branch x, Branch y, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
							"target")) {
						Statement tmpD = d2c.getSource();
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							_result.add(new Object[] { d2c, z, c, x, y, d, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_deculd2branchubb_12_3_findcontext_blackBBBBBB(S2B d2c, Command z,
			Branch c, Branch x, Branch y, Decision d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					if (x.equals(z.getNext())) {
						if (c.equals(d2c.getTarget())) {
							if (y.equals(c.getNegative())) {
								if (z.equals(x.getPositive())) {
									if (d.equals(d2c.getSource())) {
										if (x.equals(c.getPositive())) {
											_result.add(new Object[] { d2c, z, c, x, y, d });
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

	public static final Object[] pattern_deculd2branchubb_12_3_findcontext_greenBBBBBBFFFFFFF(S2B d2c, Command z,
			Branch c, Branch x, Branch y, Decision d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String z__x____next_name_prime = "next";
		String d2c__c____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String x__z____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(d);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		isApplicableMatch.getAllContextElements().add(x__z____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		z__x____next.setName(z__x____next_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		return new Object[] { d2c, z, c, x, y, d, isApplicableMatch, z__x____next, d2c__c____target, c__y____negative,
				x__z____positive, d2c__d____source, c__x____positive };
	}

	public static final Object[] pattern_deculd2branchubb_12_4_solveCSP_bindingFBBBBBBBB(deculd2branchubb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Command z, Branch c, Branch x, Branch y, Decision d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, d2c, z, c, x, y, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, z, c, x, y, d };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculd2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(deculd2branchubb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Command z, Branch c, Branch x, Branch y, Decision d) {
		Object[] result_pattern_deculd2branchubb_12_4_solveCSP_binding = pattern_deculd2branchubb_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d2c, z, c, x, y, d);
		if (result_pattern_deculd2branchubb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculd2branchubb_12_4_solveCSP_binding[0];

			Object[] result_pattern_deculd2branchubb_12_4_solveCSP_black = pattern_deculd2branchubb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_deculd2branchubb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, z, c, x, y, d };
			}
		}
		return null;
	}

	public static final boolean pattern_deculd2branchubb_12_5_checkCSP_expressionFBB(deculd2branchubb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_deculd2branchubb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "deculd2branchubb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_deculd2branchubb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_20_1_preparereturnvalue_bindingFB(deculd2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			deculd2branchubb _this) {
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

	public static final Object[] pattern_deculd2branchubb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			deculd2branchubb _this) {
		Object[] result_pattern_deculd2branchubb_20_1_preparereturnvalue_binding = pattern_deculd2branchubb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_deculd2branchubb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_deculd2branchubb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_deculd2branchubb_20_1_preparereturnvalue_black = pattern_deculd2branchubb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_deculd2branchubb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_deculd2branchubb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_deculd2branchubb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_715542 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_1BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_554470 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!c.equals(__DEC_z_positive_554470)) {
							if (!x.equals(__DEC_z_positive_554470)) {
								if (!y.equals(__DEC_z_positive_554470)) {
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

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_2BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_252453 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!c.equals(__DEC_z_negative_252453)) {
							if (!x.equals(__DEC_z_negative_252453)) {
								if (!y.equals(__DEC_z_negative_252453)) {
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

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_529933 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_4BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_865746 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_865746)) {
							if (!c.equals(__DEC_x_positive_865746)) {
								if (!y.equals(__DEC_x_positive_865746)) {
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

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_5BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_268820 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_268820)) {
							if (!c.equals(__DEC_x_negative_268820)) {
								if (!y.equals(__DEC_x_negative_268820)) {
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

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_6B(Branch y) {
		for (Graph __DEC_y_root_324037 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_7BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_608215 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_608215)) {
							if (!c.equals(__DEC_y_positive_608215)) {
								if (!x.equals(__DEC_y_positive_608215)) {
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

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_8BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_624235 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_624235)) {
							if (!c.equals(__DEC_y_negative_624235)) {
								if (!x.equals(__DEC_y_negative_624235)) {
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

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_9BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_10BB(Branch y,
			Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_11BB(Branch c,
			Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_12BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_13BB(Branch y,
			Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_14BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_15BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_16BB(Branch x, Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_17BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_deculd2branchubb_20_2_testcorematchandDECs_blackFFFFB(
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
						if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_0B(z) == null) {
							if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_3B(x) == null) {
								if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_12BB(x, z) == null) {
									for (Branch c : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!c.equals(x)) {
											Node tmpY = c.getNegative();
											if (tmpY instanceof Branch) {
												Branch y = (Branch) tmpY;
												if (!c.equals(y)) {
													if (!x.equals(y)) {
														if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_9BB(
																c, z) == null) {
															if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_11BB(
																	c, z) == null) {
																if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_14BB(
																		c, x) == null) {
																	if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_1BBBB(
																			z, c, x, y) == null) {
																		if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_2BBBB(
																				z, c, x, y) == null) {
																			if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_4BBB(
																					x, c, y) == null) {
																				if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_5BBB(
																						x, c, y) == null) {
																					if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_6B(
																							y) == null) {
																						if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_7BBB(
																								y, c, x) == null) {
																							if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_8BBB(
																									y, c, x) == null) {
																								if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_10BB(
																										y, z) == null) {
																									if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_13BB(
																											y,
																											z) == null) {
																										if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_15BB(
																												c,
																												y) == null) {
																											if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_16BB(
																													x,
																													y) == null) {
																												if (pattern_deculd2branchubb_20_2_testcorematchandDECs_black_nac_17BB(
																														x,
																														y) == null) {
																													_result.add(
																															new Object[] {
																																	z,
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

		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_deculd2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			deculd2branchubb _this, Match match, Command z, Branch c, Branch x, Branch y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, c, x, y);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_deculd2branchubb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			deculd2branchubb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_deculd2branchubb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_21_1_preparereturnvalue_bindingFB(deculd2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			deculd2branchubb _this) {
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

	public static final Object[] pattern_deculd2branchubb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			deculd2branchubb _this) {
		Object[] result_pattern_deculd2branchubb_21_1_preparereturnvalue_binding = pattern_deculd2branchubb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_deculd2branchubb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_deculd2branchubb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_deculd2branchubb_21_1_preparereturnvalue_black = pattern_deculd2branchubb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_deculd2branchubb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_deculd2branchubb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_deculd2branchubb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_0BBB(Assignment l,
			Decision b, Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_l_positive_819108 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "positive")) {
				if (!b.equals(__DEC_l_positive_819108)) {
					if (!d.equals(__DEC_l_positive_819108)) {
						return new Object[] { l, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_1BBB(Assignment l,
			Decision b, Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_l_negative_373121 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "negative")) {
				if (!b.equals(__DEC_l_negative_373121)) {
					if (!d.equals(__DEC_l_negative_373121)) {
						return new Object[] { l, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_2BB(Assignment l,
			While a) {
		for (While __DEC_l_last_185658 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_185658)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_299920 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_4BB(Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_b_positive_389715 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!b.equals(__DEC_b_positive_389715)) {
					if (!d.equals(__DEC_b_positive_389715)) {
						return new Object[] { b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_5BB(Decision b, While a) {
		for (While __DEC_b_first_339891 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_339891)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_6BB(Decision b, While a) {
		for (While __DEC_b_last_723537 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_723537)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_7B(Decision b) {
		for (Program __DEC_b_first_166005 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_8BBB(While a, Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_a_negative_638709 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!b.equals(__DEC_a_negative_638709)) {
					if (!d.equals(__DEC_a_negative_638709)) {
						return new Object[] { a, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_9B(While a) {
		for (While __DEC_a_first_519866 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_519866)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_10B(While a) {
		for (While __DEC_a_last_442374 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_442374)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_11B(While a) {
		for (Program __DEC_a_first_47451 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_12BB(Decision b,
			Assignment l) {
		if (l.equals(b.getPositive())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_13BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_14BB(Decision b,
			Assignment l) {
		if (l.equals(b.getNegative())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_15BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_16BB(While a,
			Decision b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_17BB(While a,
			Decision b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_18BB(Decision b,
			While a) {
		if (a.equals(b.getNegative())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_19BB(Decision d,
			While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_deculd2branchubb_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpA = _edge_last.getSrc();
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			EObject tmpL = _edge_last.getTrg();
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (l.equals(a.getLast())) {
					if (l.equals(a.getFirst())) {
						if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_9B(a) == null) {
							if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_10B(a) == null) {
								if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_11B(a) == null) {
									if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_2BB(l,
											a) == null) {
										if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_3B(
												l) == null) {
											for (Decision d : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(a, Decision.class, "positive")) {
												Statement tmpB = d.getNegative();
												if (tmpB instanceof Decision) {
													Decision b = (Decision) tmpB;
													if (!b.equals(d)) {
														if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_13BB(
																d, l) == null) {
															if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_15BB(
																	d, l) == null) {
																if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_19BB(
																		d, a) == null) {
																	if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_0BBB(
																			l, b, d) == null) {
																		if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_1BBB(
																				l, b, d) == null) {
																			if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_4BB(
																					b, d) == null) {
																				if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_5BB(
																						b, a) == null) {
																					if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_6BB(
																							b, a) == null) {
																						if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_7B(
																								b) == null) {
																							if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_8BBB(
																									a, b, d) == null) {
																								if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_12BB(
																										b, l) == null) {
																									if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_14BB(
																											b,
																											l) == null) {
																										if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_16BB(
																												a,
																												b) == null) {
																											if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_17BB(
																													a,
																													b) == null) {
																												if (pattern_deculd2branchubb_21_2_testcorematchandDECs_black_nac_18BB(
																														b,
																														a) == null) {
																													_result.add(
																															new Object[] {
																																	l,
																																	b,
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

		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_deculd2branchubb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			deculd2branchubb _this, Match match, Assignment l, Decision b, While a, Decision d) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, l, b, a, d);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_deculd2branchubb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			deculd2branchubb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_deculd2branchubb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_24_1_prepare_blackB(deculd2branchubb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_deculd2branchubb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_deculd2branchubb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("l");
		EObject _localVariable_1 = sourceMatch.getObject("b");
		EObject _localVariable_2 = targetMatch.getObject("z");
		EObject _localVariable_3 = targetMatch.getObject("c");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = targetMatch.getObject("x");
		EObject _localVariable_6 = targetMatch.getObject("y");
		EObject _localVariable_7 = sourceMatch.getObject("d");
		EObject tmpL = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpX = _localVariable_5;
		EObject tmpY = _localVariable_6;
		EObject tmpD = _localVariable_7;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpB instanceof Decision) {
				Decision b = (Decision) tmpB;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								if (tmpY instanceof Branch) {
									Branch y = (Branch) tmpY;
									if (tmpD instanceof Decision) {
										Decision d = (Decision) tmpD;
										return new Object[] { l, b, z, c, a, x, y, d, sourceMatch, targetMatch };
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

	public static final Object[] pattern_deculd2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Assignment l,
			Decision b, Command z, Branch c, While a, Branch x, Branch y, Decision d, Match sourceMatch,
			Match targetMatch) {
		if (!b.equals(d)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { l, b, z, c, a, x, y, d, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_deculd2branchubb_24_2_matchsrctrgcontext_binding = pattern_deculd2branchubb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_deculd2branchubb_24_2_matchsrctrgcontext_binding != null) {
			Assignment l = (Assignment) result_pattern_deculd2branchubb_24_2_matchsrctrgcontext_binding[0];
			Decision b = (Decision) result_pattern_deculd2branchubb_24_2_matchsrctrgcontext_binding[1];
			Command z = (Command) result_pattern_deculd2branchubb_24_2_matchsrctrgcontext_binding[2];
			Branch c = (Branch) result_pattern_deculd2branchubb_24_2_matchsrctrgcontext_binding[3];
			While a = (While) result_pattern_deculd2branchubb_24_2_matchsrctrgcontext_binding[4];
			Branch x = (Branch) result_pattern_deculd2branchubb_24_2_matchsrctrgcontext_binding[5];
			Branch y = (Branch) result_pattern_deculd2branchubb_24_2_matchsrctrgcontext_binding[6];
			Decision d = (Decision) result_pattern_deculd2branchubb_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_deculd2branchubb_24_2_matchsrctrgcontext_black = pattern_deculd2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					l, b, z, c, a, x, y, d, sourceMatch, targetMatch);
			if (result_pattern_deculd2branchubb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { l, b, z, c, a, x, y, d, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBB(deculd2branchubb _this,
			Assignment l, Decision b, Command z, Branch c, While a, Branch x, Branch y, Decision d, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(l, b, z, c, a, x, y, d, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, l, b, z, c, a, x, y, d, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculd2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			deculd2branchubb _this, Assignment l, Decision b, Command z, Branch c, While a, Branch x, Branch y,
			Decision d, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_deculd2branchubb_24_3_solvecsp_binding = pattern_deculd2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, l, b, z, c, a, x, y, d, sourceMatch, targetMatch);
		if (result_pattern_deculd2branchubb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_deculd2branchubb_24_3_solvecsp_binding[0];

			Object[] result_pattern_deculd2branchubb_24_3_solvecsp_black = pattern_deculd2branchubb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_deculd2branchubb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, l, b, z, c, a, x, y, d, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_deculd2branchubb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_deculd2branchubb_24_5_matchcorrcontext_blackFBBBB(Branch c,
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

	public static final Object[] pattern_deculd2branchubb_24_5_matchcorrcontext_greenBBBF(S2B d2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "deculd2branchubb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_deculd2branchubb_24_6_createcorrespondence_blackBBBBBBBBB(Assignment l,
			Decision b, Command z, Branch c, While a, Branch x, Branch y, Decision d, CCMatch ccMatch) {
		if (!b.equals(d)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!x.equals(y)) {
						return new Object[] { l, b, z, c, a, x, y, d, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_24_6_createcorrespondence_greenBFBFFBBBBB(Assignment l,
			Decision b, Command z, While a, Branch x, Branch y, CCMatch ccMatch) {
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { l, b2y, b, l2z, a2x, z, a, x, y, ccMatch };
	}

	public static final Object[] pattern_deculd2branchubb_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_deculd2branchubb_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "deculd2branchubb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_deculd2branchubb_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_0BBB(Assignment l, Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_l_positive_65940 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					Decision.class, "positive")) {
				if (!b.equals(__DEC_l_positive_65940)) {
					if (!d.equals(__DEC_l_positive_65940)) {
						return new Object[] { l, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_1BBB(Assignment l, Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_l_negative_744825 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "negative")) {
				if (!b.equals(__DEC_l_negative_744825)) {
					if (!d.equals(__DEC_l_negative_744825)) {
						return new Object[] { l, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_2BB(Assignment l, While a) {
		for (While __DEC_l_last_903244 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_903244)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_420342 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_4BB(Decision b, Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_b_positive_385426 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!b.equals(__DEC_b_positive_385426)) {
					if (!d.equals(__DEC_b_positive_385426)) {
						return new Object[] { b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_5BB(Decision b, While a) {
		for (While __DEC_b_first_700347 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_700347)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_6BB(Decision b, While a) {
		for (While __DEC_b_last_614181 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_614181)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_7B(Decision b) {
		for (Program __DEC_b_first_745609 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_8BBB(While a, Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_a_negative_165562 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!b.equals(__DEC_a_negative_165562)) {
					if (!d.equals(__DEC_a_negative_165562)) {
						return new Object[] { a, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_9B(While a) {
		for (While __DEC_a_first_568017 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_568017)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_10B(While a) {
		for (While __DEC_a_last_223536 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_223536)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_11B(While a) {
		for (Program __DEC_a_first_400233 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_12BB(Decision b,
			Assignment l) {
		if (l.equals(b.getPositive())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_13BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_14BB(Decision b,
			Assignment l) {
		if (l.equals(b.getNegative())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_15BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_16BB(While a, Decision b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_17BB(While a, Decision b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_18BB(Decision b, While a) {
		if (a.equals(b.getNegative())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_19BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_27_1_matchtggpattern_blackBBBB(Assignment l, Decision b,
			While a, Decision d) {
		if (!b.equals(d)) {
			if (l.equals(a.getLast())) {
				if (l.equals(a.getFirst())) {
					if (b.equals(d.getNegative())) {
						if (a.equals(d.getPositive())) {
							if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_0BBB(l, b, d) == null) {
								if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_1BBB(l, b, d) == null) {
									if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_2BB(l, a) == null) {
										if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_3B(l) == null) {
											if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_4BB(b,
													d) == null) {
												if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_5BB(b,
														a) == null) {
													if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_6BB(b,
															a) == null) {
														if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_7B(
																b) == null) {
															if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_8BBB(
																	a, b, d) == null) {
																if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_9B(
																		a) == null) {
																	if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_10B(
																			a) == null) {
																		if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_11B(
																				a) == null) {
																			if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_12BB(
																					b, l) == null) {
																				if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_13BB(
																						d, l) == null) {
																					if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_14BB(
																							b, l) == null) {
																						if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_15BB(
																								d, l) == null) {
																							if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_16BB(
																									a, b) == null) {
																								if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_17BB(
																										a, b) == null) {
																									if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_18BB(
																											b,
																											a) == null) {
																										if (pattern_deculd2branchubb_27_1_matchtggpattern_black_nac_19BB(
																												d,
																												a) == null) {
																											return new Object[] {
																													l,
																													b,
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
		return null;
	}

	public static final boolean pattern_deculd2branchubb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_deculd2branchubb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_243412 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_1BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_positive_777374 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!c.equals(__DEC_z_positive_777374)) {
							if (!x.equals(__DEC_z_positive_777374)) {
								if (!y.equals(__DEC_z_positive_777374)) {
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

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_2BBBB(Command z, Branch c,
			Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (Branch __DEC_z_negative_551561 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!c.equals(__DEC_z_negative_551561)) {
							if (!x.equals(__DEC_z_negative_551561)) {
								if (!y.equals(__DEC_z_negative_551561)) {
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

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_914613 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_4BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_380180 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_380180)) {
							if (!c.equals(__DEC_x_positive_380180)) {
								if (!y.equals(__DEC_x_positive_380180)) {
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

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_5BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_77315 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_77315)) {
							if (!c.equals(__DEC_x_negative_77315)) {
								if (!y.equals(__DEC_x_negative_77315)) {
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

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_6B(Branch y) {
		for (Graph __DEC_y_root_357960 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_7BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_32947 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_32947)) {
							if (!c.equals(__DEC_y_positive_32947)) {
								if (!x.equals(__DEC_y_positive_32947)) {
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

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_8BBB(Branch y, Branch c,
			Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_789719 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_789719)) {
							if (!c.equals(__DEC_y_negative_789719)) {
								if (!x.equals(__DEC_y_negative_789719)) {
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

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_9BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_10BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_11BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_12BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_13BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_14BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_15BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_16BB(Branch x, Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_17BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_28_1_matchtggpattern_blackBBBB(Command z, Branch c, Branch x,
			Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					if (x.equals(z.getNext())) {
						if (y.equals(c.getNegative())) {
							if (z.equals(x.getPositive())) {
								if (x.equals(c.getPositive())) {
									if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_0B(z) == null) {
										if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_1BBBB(z, c, x,
												y) == null) {
											if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_2BBBB(z, c, x,
													y) == null) {
												if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_3B(
														x) == null) {
													if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_4BBB(x,
															c, y) == null) {
														if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_5BBB(
																x, c, y) == null) {
															if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_6B(
																	y) == null) {
																if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_7BBB(
																		y, c, x) == null) {
																	if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_8BBB(
																			y, c, x) == null) {
																		if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_9BB(
																				c, z) == null) {
																			if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_10BB(
																					y, z) == null) {
																				if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_11BB(
																						c, z) == null) {
																					if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_12BB(
																							x, z) == null) {
																						if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_13BB(
																								y, z) == null) {
																							if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_14BB(
																									c, x) == null) {
																								if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_15BB(
																										c, y) == null) {
																									if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_16BB(
																											x,
																											y) == null) {
																										if (pattern_deculd2branchubb_28_1_matchtggpattern_black_nac_17BB(
																												x,
																												y) == null) {
																											return new Object[] {
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
		return null;
	}

	public static final boolean pattern_deculd2branchubb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_deculd2branchubb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_29_1_createresult_blackB(deculd2branchubb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_deculd2branchubb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_deculd2branchubb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_deculd2branchubb_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_deculd2branchubb_29_2_isapplicablecore_black_nac_0BB(ruleResult, d2c) == null) {
								if (pattern_deculd2branchubb_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										c) == null) {
									if (pattern_deculd2branchubb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_deculd2branchubb_29_3_solveCSP_bindingFBBBBBB(deculd2branchubb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d2c, c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_deculd2branchubb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_deculd2branchubb_29_3_solveCSP_bindingAndBlackFBBBBBB(deculd2branchubb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_deculd2branchubb_29_3_solveCSP_binding = pattern_deculd2branchubb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d2c, c, d, ruleResult);
		if (result_pattern_deculd2branchubb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_deculd2branchubb_29_3_solveCSP_binding[0];

			Object[] result_pattern_deculd2branchubb_29_3_solveCSP_black = pattern_deculd2branchubb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_deculd2branchubb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_deculd2branchubb_29_4_checkCSP_expressionFBB(deculd2branchubb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_deculd2branchubb_29_5_checknacs_blackBBB(S2B d2c, Branch c, Decision d) {
		return new Object[] { d2c, c, d };
	}

	public static final Object[] pattern_deculd2branchubb_29_6_perform_blackBBBB(S2B d2c, Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d2c, c, d, ruleResult };
	}

	public static final Object[] pattern_deculd2branchubb_29_6_perform_greenFFFFFFBFFFBB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision b = SourcecodeFactory.eINSTANCE.createDecision();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(l);
		ruleResult.getCorrObjects().add(b2y);
		b2y.setSource(b);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		l2z.setSource(l);
		ruleResult.getCorrObjects().add(l2z);
		ruleResult.getCorrObjects().add(a2x);
		l2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		a2x.setSource(a);
		a.setLast(l);
		a.setFirst(l);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		z.setNext(x);
		x.setPositive(z);
		a2x.setTarget(x);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		c.setNegative(y);
		b2y.setTarget(y);
		ruleResult.getTargetObjects().add(y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { l, b2y, b, l2z, a2x, z, c, a, x, y, d, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_deculd2branchubb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //deculd2branchubbImpl
