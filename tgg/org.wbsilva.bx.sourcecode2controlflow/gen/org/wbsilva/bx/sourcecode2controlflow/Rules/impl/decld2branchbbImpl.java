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
import org.wbsilva.bx.sourcecode2controlflow.Rules.decld2branchbb;

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
 * An implementation of the model object '<em><b>decld2branchbb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class decld2branchbbImpl extends AbstractRuleImpl implements decld2branchbb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decld2branchbbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdecld2branchbb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Decision b, Assignment l, While a, Decision d) {

		Object[] result1_black = decld2branchbbImpl.pattern_decld2branchbb_0_1_initialbindings_blackBBBBBB(this, match,
				b, l, a, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[a] = " + a + ", "
					+ "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = decld2branchbbImpl
				.pattern_decld2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, b, l, a, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[a] = " + a + ", "
					+ "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decld2branchbbImpl.pattern_decld2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decld2branchbbImpl
					.pattern_decld2branchbb_0_4_collectelementstobetranslated_blackBBBBB(match, b, l, a, d);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
			}
			decld2branchbbImpl.pattern_decld2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(match, b, l, a,
					d);
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decld2branchbbImpl
					.pattern_decld2branchbb_0_5_collectcontextelements_blackBBBBB(match, b, l, a, d);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
			}
			decld2branchbbImpl.pattern_decld2branchbb_0_5_collectcontextelements_greenBB(match, d);

			// 
			decld2branchbbImpl.pattern_decld2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(this, match, b, l, a,
					d);
			return decld2branchbbImpl.pattern_decld2branchbb_0_7_expressionF();
		} else {
			return decld2branchbbImpl.pattern_decld2branchbb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decld2branchbbImpl
				.pattern_decld2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2B d2c = (S2B) result1_bindingAndBlack[0];
		Decision b = (Decision) result1_bindingAndBlack[1];
		Assignment l = (Assignment) result1_bindingAndBlack[2];
		While a = (While) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		Branch c = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decld2branchbbImpl.pattern_decld2branchbb_1_1_performtransformation_greenFFBBBBFFFF(b,
				l, a, c);
		Branch x = (Branch) result1_green[0];
		Command z = (Command) result1_green[1];
		S2B a2x = (S2B) result1_green[6];
		S2B b2y = (S2B) result1_green[7];
		S2N l2z = (S2N) result1_green[8];
		Branch y = (Branch) result1_green[9];

		Object[] result2_black = decld2branchbbImpl
				.pattern_decld2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(x, z, b, l, a, a2x, b2y, l2z, y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[z] = " + z
					+ ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ", "
					+ "[b2y] = " + b2y + ", " + "[l2z] = " + l2z + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = decld2branchbbImpl
				.pattern_decld2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(x, z, b, l, a, a2x, b2y, l2z, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decld2branchbbImpl.pattern_decld2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, d2c, x, z, b, l, a, d, c, a2x, b2y, l2z, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d2c] = " + d2c + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[b] = " + b + ", "
					+ "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[a2x] = "
					+ a2x + ", " + "[b2y] = " + b2y + ", " + "[l2z] = " + l2z + ", " + "[y] = " + y + ".");
		}
		decld2branchbbImpl.pattern_decld2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, x,
				z, b, l, a, d, c, a2x, b2y, l2z, y);
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[23];

		// 
		// 
		decld2branchbbImpl.pattern_decld2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, d2c, x,
				z, b, l, a, d, c, a2x, b2y, l2z, y);
		return decld2branchbbImpl.pattern_decld2branchbb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = decld2branchbbImpl
				.pattern_decld2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decld2branchbbImpl
				.pattern_decld2branchbb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decld2branchbbImpl.pattern_decld2branchbb_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Decision b = (Decision) result2_binding[0];
		Assignment l = (Assignment) result2_binding[1];
		While a = (While) result2_binding[2];
		Decision d = (Decision) result2_binding[3];
		for (Object[] result2_black : decld2branchbbImpl.pattern_decld2branchbb_2_2_corematch_blackFBBBBFB(b, l, a, d,
				match)) {
			S2B d2c = (S2B) result2_black[0];
			Branch c = (Branch) result2_black[5];
			// ForEach 
			for (Object[] result3_black : decld2branchbbImpl.pattern_decld2branchbb_2_3_findcontext_blackBBBBBB(d2c, b,
					l, a, d, c)) {
				Object[] result3_green = decld2branchbbImpl
						.pattern_decld2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(d2c, b, l, a, d, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decld2branchbbImpl
						.pattern_decld2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d2c, b,
								l, a, d, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[b] = "
							+ b + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[c] = " + c
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decld2branchbbImpl.pattern_decld2branchbb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decld2branchbbImpl
							.pattern_decld2branchbb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decld2branchbbImpl.pattern_decld2branchbb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decld2branchbbImpl.pattern_decld2branchbb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Decision b, Assignment l, While a, Decision d) {
		match.registerObject("b", b);
		match.registerObject("l", l);
		match.registerObject("a", a);
		match.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision b, Assignment l, While a, Decision d) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, S2B d2c, Decision b, Assignment l,
			While a, Decision d, Branch c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject d2c, EObject x, EObject z, EObject b,
			EObject l, EObject a, EObject d, EObject c, EObject a2x, EObject b2y, EObject l2z, EObject y) {
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch x, Command z, Branch c, Branch y) {

		Object[] result1_black = decld2branchbbImpl.pattern_decld2branchbb_10_1_initialbindings_blackBBBBBB(this, match,
				x, z, c, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[c] = " + c + ", "
					+ "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = decld2branchbbImpl
				.pattern_decld2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, x, z, c, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[c] = " + c + ", "
					+ "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decld2branchbbImpl.pattern_decld2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decld2branchbbImpl
					.pattern_decld2branchbb_10_4_collectelementstobetranslated_blackBBBBB(match, x, z, c, y);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
			}
			decld2branchbbImpl.pattern_decld2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(match, x, z, c,
					y);
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decld2branchbbImpl
					.pattern_decld2branchbb_10_5_collectcontextelements_blackBBBBB(match, x, z, c, y);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
			}
			decld2branchbbImpl.pattern_decld2branchbb_10_5_collectcontextelements_greenBB(match, c);

			// 
			decld2branchbbImpl.pattern_decld2branchbb_10_6_registerobjectstomatch_expressionBBBBBB(this, match, x, z, c,
					y);
			return decld2branchbbImpl.pattern_decld2branchbb_10_7_expressionF();
		} else {
			return decld2branchbbImpl.pattern_decld2branchbb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decld2branchbbImpl
				.pattern_decld2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2B d2c = (S2B) result1_bindingAndBlack[0];
		Branch x = (Branch) result1_bindingAndBlack[1];
		Command z = (Command) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		Branch c = (Branch) result1_bindingAndBlack[4];
		Branch y = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decld2branchbbImpl.pattern_decld2branchbb_11_1_performtransformation_greenBBFFFBFFFB(x,
				z, d, y);
		Decision b = (Decision) result1_green[2];
		Assignment l = (Assignment) result1_green[3];
		While a = (While) result1_green[4];
		S2B a2x = (S2B) result1_green[6];
		S2B b2y = (S2B) result1_green[7];
		S2N l2z = (S2N) result1_green[8];

		Object[] result2_black = decld2branchbbImpl
				.pattern_decld2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(x, z, b, l, a, a2x, b2y, l2z, y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[z] = " + z
					+ ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ", "
					+ "[b2y] = " + b2y + ", " + "[l2z] = " + l2z + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = decld2branchbbImpl
				.pattern_decld2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(x, z, b, l, a, a2x, b2y, l2z, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decld2branchbbImpl.pattern_decld2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, d2c, x, z, b, l, a, d, c, a2x, b2y, l2z, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d2c] = " + d2c + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[b] = " + b + ", "
					+ "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[a2x] = "
					+ a2x + ", " + "[b2y] = " + b2y + ", " + "[l2z] = " + l2z + ", " + "[y] = " + y + ".");
		}
		decld2branchbbImpl.pattern_decld2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, x,
				z, b, l, a, d, c, a2x, b2y, l2z, y);
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[23];

		// 
		// 
		decld2branchbbImpl.pattern_decld2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, d2c,
				x, z, b, l, a, d, c, a2x, b2y, l2z, y);
		return decld2branchbbImpl.pattern_decld2branchbb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = decld2branchbbImpl
				.pattern_decld2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decld2branchbbImpl
				.pattern_decld2branchbb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decld2branchbbImpl.pattern_decld2branchbb_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch x = (Branch) result2_binding[0];
		Command z = (Command) result2_binding[1];
		Branch c = (Branch) result2_binding[2];
		Branch y = (Branch) result2_binding[3];
		for (Object[] result2_black : decld2branchbbImpl.pattern_decld2branchbb_12_2_corematch_blackFBBFBBB(x, z, c, y,
				match)) {
			S2B d2c = (S2B) result2_black[0];
			Decision d = (Decision) result2_black[3];
			// ForEach 
			for (Object[] result3_black : decld2branchbbImpl.pattern_decld2branchbb_12_3_findcontext_blackBBBBBB(d2c, x,
					z, d, c, y)) {
				Object[] result3_green = decld2branchbbImpl
						.pattern_decld2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(d2c, x, z, d, c, y);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decld2branchbbImpl
						.pattern_decld2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d2c, x,
								z, d, c, y);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[x] = "
							+ x + ", " + "[z] = " + z + ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[y] = " + y
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decld2branchbbImpl.pattern_decld2branchbb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decld2branchbbImpl
							.pattern_decld2branchbb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decld2branchbbImpl.pattern_decld2branchbb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decld2branchbbImpl.pattern_decld2branchbb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch x, Command z, Branch c, Branch y) {
		match.registerObject("x", x);
		match.registerObject("z", z);
		match.registerObject("c", c);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch x, Command z, Branch c, Branch y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B d2c, Branch x, Command z, Decision d,
			Branch c, Branch y) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject d2c, EObject x, EObject z, EObject b,
			EObject l, EObject a, EObject d, EObject c, EObject a2x, EObject b2y, EObject l2z, EObject y) {
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_51(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = decld2branchbbImpl
				.pattern_decld2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decld2branchbbImpl.pattern_decld2branchbb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decld2branchbbImpl
				.pattern_decld2branchbb_20_2_testcorematchandDECs_blackFFFFB(_edge_positive)) {
			Branch x = (Branch) result2_black[0];
			Command z = (Command) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Branch y = (Branch) result2_black[3];
			Object[] result2_green = decld2branchbbImpl
					.pattern_decld2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decld2branchbbImpl
					.pattern_decld2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, x, z, c, y)) {
				// 
				if (decld2branchbbImpl
						.pattern_decld2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decld2branchbbImpl
							.pattern_decld2branchbb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decld2branchbbImpl.pattern_decld2branchbb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decld2branchbbImpl.pattern_decld2branchbb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_51(EMoflonEdge _edge_negative) {

		Object[] result1_bindingAndBlack = decld2branchbbImpl
				.pattern_decld2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decld2branchbbImpl.pattern_decld2branchbb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decld2branchbbImpl
				.pattern_decld2branchbb_21_2_testcorematchandDECs_blackFFFFB(_edge_negative)) {
			Decision b = (Decision) result2_black[0];
			Assignment l = (Assignment) result2_black[1];
			While a = (While) result2_black[2];
			Decision d = (Decision) result2_black[3];
			Object[] result2_green = decld2branchbbImpl
					.pattern_decld2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decld2branchbbImpl
					.pattern_decld2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, b, l, a, d)) {
				// 
				if (decld2branchbbImpl
						.pattern_decld2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decld2branchbbImpl
							.pattern_decld2branchbb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decld2branchbbImpl.pattern_decld2branchbb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decld2branchbbImpl.pattern_decld2branchbb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("decld2branchbb");
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
		ruleResult.setRule("decld2branchbb");
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

		Object[] result1_black = decld2branchbbImpl.pattern_decld2branchbb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decld2branchbbImpl.pattern_decld2branchbb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = decld2branchbbImpl
				.pattern_decld2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Branch x = (Branch) result2_bindingAndBlack[0];
		Command z = (Command) result2_bindingAndBlack[1];
		Decision b = (Decision) result2_bindingAndBlack[2];
		Assignment l = (Assignment) result2_bindingAndBlack[3];
		While a = (While) result2_bindingAndBlack[4];
		Decision d = (Decision) result2_bindingAndBlack[5];
		Branch c = (Branch) result2_bindingAndBlack[6];
		Branch y = (Branch) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decld2branchbbImpl
				.pattern_decld2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, x, z, b, l, a, d, c, y,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[x] = " + x + ", " + "[z] = " + z + ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[a] = "
					+ a + ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decld2branchbbImpl.pattern_decld2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decld2branchbbImpl.pattern_decld2branchbb_24_5_matchcorrcontext_blackFBBBB(d,
					c, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[0];
				Object[] result5_green = decld2branchbbImpl.pattern_decld2branchbb_24_5_matchcorrcontext_greenBBBF(d2c,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decld2branchbbImpl
						.pattern_decld2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(x, z, b, l, a, d, c, y,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", "
							+ "[z] = " + z + ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[a] = " + a + ", "
							+ "[d] = " + d + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decld2branchbbImpl.pattern_decld2branchbb_24_6_createcorrespondence_greenBBBBBFFFBB(x, z, b, l, a, y,
						ccMatch);
				//nothing S2B a2x = (S2B) result6_green[5];
				//nothing S2B b2y = (S2B) result6_green[6];
				//nothing S2N l2z = (S2N) result6_green[7];

				Object[] result7_black = decld2branchbbImpl
						.pattern_decld2branchbb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decld2branchbbImpl.pattern_decld2branchbb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return decld2branchbbImpl.pattern_decld2branchbb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Branch x, Command z, Decision b, Assignment l, While a, Decision d, Branch c,
			Branch y, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Decision b, Assignment l, While a, Decision d) {// 
		Object[] result1_black = decld2branchbbImpl.pattern_decld2branchbb_27_1_matchtggpattern_blackBBBB(b, l, a, d);
		if (result1_black != null) {
			return decld2branchbbImpl.pattern_decld2branchbb_27_2_expressionF();
		} else {
			return decld2branchbbImpl.pattern_decld2branchbb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch x, Command z, Branch c, Branch y) {// 
		Object[] result1_black = decld2branchbbImpl.pattern_decld2branchbb_28_1_matchtggpattern_blackBBBB(x, z, c, y);
		if (result1_black != null) {
			return decld2branchbbImpl.pattern_decld2branchbb_28_2_expressionF();
		} else {
			return decld2branchbbImpl.pattern_decld2branchbb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = decld2branchbbImpl.pattern_decld2branchbb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decld2branchbbImpl.pattern_decld2branchbb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : decld2branchbbImpl
				.pattern_decld2branchbb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			S2B d2c = (S2B) result2_black[1];
			Decision d = (Decision) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = decld2branchbbImpl
					.pattern_decld2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d2c, d, c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d
						+ ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decld2branchbbImpl.pattern_decld2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decld2branchbbImpl.pattern_decld2branchbb_29_5_checknacs_blackBBB(d2c, d, c);
				if (result5_black != null) {

					Object[] result6_black = decld2branchbbImpl.pattern_decld2branchbb_29_6_perform_blackBBBB(d2c, d, c,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2c] = " + d2c + ", "
								+ "[d] = " + d + ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decld2branchbbImpl.pattern_decld2branchbb_29_6_perform_greenFFFFFBBFFFFB(d, c, ruleResult);
					//nothing Branch x = (Branch) result6_green[0];
					//nothing Command z = (Command) result6_green[1];
					//nothing Decision b = (Decision) result6_green[2];
					//nothing Assignment l = (Assignment) result6_green[3];
					//nothing While a = (While) result6_green[4];
					//nothing S2B a2x = (S2B) result6_green[7];
					//nothing S2B b2y = (S2B) result6_green[8];
					//nothing S2N l2z = (S2N) result6_green[9];
					//nothing Branch y = (Branch) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return decld2branchbbImpl.pattern_decld2branchbb_29_7_expressionFB(ruleResult);
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
		case RulesPackage.DECLD2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_DECISION_ASSIGNMENT_WHILE_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECLD2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_ASSIGNMENT_WHILE_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4));
			return null;
		case RulesPackage.DECLD2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_ASSIGNMENT_WHILE_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECLD2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2B_DECISION_ASSIGNMENT_WHILE_DECISION_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Decision) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(Decision) arguments.get(5), (Branch) arguments.get(6));
		case RulesPackage.DECLD2BRANCHBB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECLD2BRANCHBB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECLD2BRANCHBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.DECLD2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECLD2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_COMMAND_DECISION_BRANCH_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Decision) arguments.get(4),
					(Branch) arguments.get(5), (Branch) arguments.get(6));
		case RulesPackage.DECLD2BRANCHBB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECLD2BRANCHBB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_51__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_51((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_51__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_51((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECLD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_COMMAND_DECISION_ASSIGNMENT_WHILE_DECISION_BRANCH_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Command) arguments.get(1),
					(Decision) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(Decision) arguments.get(5), (Branch) arguments.get(6), (Branch) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECLD2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECLD2BRANCHBB___CHECK_DEC_FWD__DECISION_ASSIGNMENT_WHILE_DECISION:
			return checkDEC_FWD((Decision) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3));
		case RulesPackage.DECLD2BRANCHBB___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.DECLD2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECLD2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_DECISION_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Decision) arguments.get(2), (Branch) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECLD2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decld2branchbb_0_1_initialbindings_blackBBBBBB(decld2branchbb _this,
			Match match, Decision b, Assignment l, While a, Decision d) {
		if (!b.equals(d)) {
			return new Object[] { _this, match, b, l, a, d };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_0_2_SolveCSP_bindingFBBBBBB(decld2branchbb _this, Match match,
			Decision b, Assignment l, While a, Decision d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, l, a, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, l, a, d };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decld2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(decld2branchbb _this,
			Match match, Decision b, Assignment l, While a, Decision d) {
		Object[] result_pattern_decld2branchbb_0_2_SolveCSP_binding = pattern_decld2branchbb_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, b, l, a, d);
		if (result_pattern_decld2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decld2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decld2branchbb_0_2_SolveCSP_black = pattern_decld2branchbb_0_2_SolveCSP_blackB(csp);
			if (result_pattern_decld2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, l, a, d };
			}
		}
		return null;
	}

	public static final boolean pattern_decld2branchbb_0_3_CheckCSP_expressionFBB(decld2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Decision b, Assignment l, While a, Decision d) {
		if (!b.equals(d)) {
			return new Object[] { match, b, l, a, d };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Decision b, Assignment l, While a, Decision d) {
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(a);
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		return new Object[] { match, b, l, a, d, d__b____negative, d__a____positive, a__l____last };
	}

	public static final Object[] pattern_decld2branchbb_0_5_collectcontextelements_blackBBBBB(Match match, Decision b,
			Assignment l, While a, Decision d) {
		if (!b.equals(d)) {
			return new Object[] { match, b, l, a, d };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decld2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(decld2branchbb _this,
			Match match, Decision b, Assignment l, While a, Decision d) {
		_this.registerObjectsToMatch_FWD(match, b, l, a, d);

	}

	public static final boolean pattern_decld2branchbb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decld2branchbb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("l");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject _localVariable_5 = isApplicableMatch.getObject("c");
		EObject tmpD2c = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpL = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpC = _localVariable_5;
		if (tmpD2c instanceof S2B) {
			S2B d2c = (S2B) tmpD2c;
			if (tmpB instanceof Decision) {
				Decision b = (Decision) tmpB;
				if (tmpL instanceof Assignment) {
					Assignment l = (Assignment) tmpL;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpC instanceof Branch) {
								Branch c = (Branch) tmpC;
								return new Object[] { d2c, b, l, a, d, c, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_1_1_performtransformation_blackBBBBBBFBB(S2B d2c, Decision b,
			Assignment l, While a, Decision d, Branch c, decld2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!b.equals(d)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { d2c, b, l, a, d, c, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decld2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decld2branchbb_1_1_performtransformation_binding = pattern_decld2branchbb_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decld2branchbb_1_1_performtransformation_binding != null) {
			S2B d2c = (S2B) result_pattern_decld2branchbb_1_1_performtransformation_binding[0];
			Decision b = (Decision) result_pattern_decld2branchbb_1_1_performtransformation_binding[1];
			Assignment l = (Assignment) result_pattern_decld2branchbb_1_1_performtransformation_binding[2];
			While a = (While) result_pattern_decld2branchbb_1_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decld2branchbb_1_1_performtransformation_binding[4];
			Branch c = (Branch) result_pattern_decld2branchbb_1_1_performtransformation_binding[5];

			Object[] result_pattern_decld2branchbb_1_1_performtransformation_black = pattern_decld2branchbb_1_1_performtransformation_blackBBBBBBFBB(
					d2c, b, l, a, d, c, _this, isApplicableMatch);
			if (result_pattern_decld2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decld2branchbb_1_1_performtransformation_black[6];

				return new Object[] { d2c, b, l, a, d, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_1_1_performtransformation_greenFFBBBBFFFF(Decision b,
			Assignment l, While a, Branch c) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		c.setPositive(x);
		z.setNext(x);
		a2x.setSource(a);
		a2x.setTarget(x);
		b2y.setSource(b);
		l2z.setTarget(z);
		l2z.setSource(l);
		c.setNegative(y);
		b2y.setTarget(y);
		return new Object[] { x, z, b, l, a, c, a2x, b2y, l2z, y };
	}

	public static final Object[] pattern_decld2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(Branch x,
			Command z, Decision b, Assignment l, While a, S2B a2x, S2B b2y, S2N l2z, Branch y) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				return new Object[] { x, z, b, l, a, a2x, b2y, l2z, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(Branch x,
			Command z, Decision b, Assignment l, While a, S2B a2x, S2B b2y, S2N l2z, Branch y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(y);
		return new Object[] { ruleresult, x, z, b, l, a, a2x, b2y, l2z, y };
	}

	public static final Object[] pattern_decld2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d2c, EObject x, EObject z, EObject b, EObject l, EObject a, EObject d,
			EObject c, EObject a2x, EObject b2y, EObject l2z, EObject y) {
		if (!d2c.equals(x)) {
			if (!d2c.equals(z)) {
				if (!d2c.equals(l)) {
					if (!d2c.equals(l2z)) {
						if (!d2c.equals(y)) {
							if (!x.equals(z)) {
								if (!x.equals(y)) {
									if (!b.equals(d2c)) {
										if (!b.equals(x)) {
											if (!b.equals(z)) {
												if (!b.equals(l)) {
													if (!b.equals(d)) {
														if (!b.equals(c)) {
															if (!b.equals(b2y)) {
																if (!b.equals(l2z)) {
																	if (!b.equals(y)) {
																		if (!l.equals(x)) {
																			if (!l.equals(z)) {
																				if (!l.equals(l2z)) {
																					if (!l.equals(y)) {
																						if (!a.equals(d2c)) {
																							if (!a.equals(x)) {
																								if (!a.equals(z)) {
																									if (!a.equals(b)) {
																										if (!a.equals(
																												l)) {
																											if (!a.equals(
																													d)) {
																												if (!a.equals(
																														c)) {
																													if (!a.equals(
																															a2x)) {
																														if (!a.equals(
																																b2y)) {
																															if (!a.equals(
																																	l2z)) {
																																if (!a.equals(
																																		y)) {
																																	if (!d.equals(
																																			d2c)) {
																																		if (!d.equals(
																																				x)) {
																																			if (!d.equals(
																																					z)) {
																																				if (!d.equals(
																																						l)) {
																																					if (!d.equals(
																																							l2z)) {
																																						if (!d.equals(
																																								y)) {
																																							if (!c.equals(
																																									d2c)) {
																																								if (!c.equals(
																																										x)) {
																																									if (!c.equals(
																																											z)) {
																																										if (!c.equals(
																																												l)) {
																																											if (!c.equals(
																																													d)) {
																																												if (!c.equals(
																																														l2z)) {
																																													if (!c.equals(
																																															y)) {
																																														if (!a2x.equals(
																																																d2c)) {
																																															if (!a2x.equals(
																																																	x)) {
																																																if (!a2x.equals(
																																																		z)) {
																																																	if (!a2x.equals(
																																																			b)) {
																																																		if (!a2x.equals(
																																																				l)) {
																																																			if (!a2x.equals(
																																																					d)) {
																																																				if (!a2x.equals(
																																																						c)) {
																																																					if (!a2x.equals(
																																																							b2y)) {
																																																						if (!a2x.equals(
																																																								l2z)) {
																																																							if (!a2x.equals(
																																																									y)) {
																																																								if (!b2y.equals(
																																																										d2c)) {
																																																									if (!b2y.equals(
																																																											x)) {
																																																										if (!b2y.equals(
																																																												z)) {
																																																											if (!b2y.equals(
																																																													l)) {
																																																												if (!b2y.equals(
																																																														d)) {
																																																													if (!b2y.equals(
																																																															c)) {
																																																														if (!b2y.equals(
																																																																l2z)) {
																																																															if (!b2y.equals(
																																																																	y)) {
																																																																if (!l2z.equals(
																																																																		x)) {
																																																																	if (!l2z.equals(
																																																																			z)) {
																																																																		if (!l2z.equals(
																																																																				y)) {
																																																																			if (!y.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						d2c,
																																																																						x,
																																																																						z,
																																																																						b,
																																																																						l,
																																																																						a,
																																																																						d,
																																																																						c,
																																																																						a2x,
																																																																						b2y,
																																																																						l2z,
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
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decld2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject x, EObject z, EObject b, EObject l, EObject a, EObject d, EObject c,
			EObject a2x, EObject b2y, EObject l2z, EObject y) {
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decld2branchbb";
		String d__b____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String l2z__z____target_name_prime = "target";
		String l2z__l____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		return new Object[] { ruleresult, x, z, b, l, a, d, c, a2x, b2y, l2z, y, d__b____negative, a2x__a____source,
				b2y__b____source, d__a____positive, a__l____last, c__x____positive, c__y____negative, l2z__z____target,
				l2z__l____source, a2x__x____target, z__x____next, b2y__y____target };
	}

	public static final void pattern_decld2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(decld2branchbb _this,
			PerformRuleResult ruleresult, EObject d2c, EObject x, EObject z, EObject b, EObject l, EObject a, EObject d,
			EObject c, EObject a2x, EObject b2y, EObject l2z, EObject y) {
		_this.registerObjects_FWD(ruleresult, d2c, x, z, b, l, a, d, c, a2x, b2y, l2z, y);

	}

	public static final PerformRuleResult pattern_decld2branchbb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_2_1_preparereturnvalue_bindingFB(decld2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			decld2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(
			decld2branchbb _this) {
		Object[] result_pattern_decld2branchbb_2_1_preparereturnvalue_binding = pattern_decld2branchbb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decld2branchbb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decld2branchbb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decld2branchbb_2_1_preparereturnvalue_black = pattern_decld2branchbb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decld2branchbb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decld2branchbb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decld2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decld2branchbb_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("l");
		EObject _localVariable_2 = match.getObject("a");
		EObject _localVariable_3 = match.getObject("d");
		EObject tmpB = _localVariable_0;
		EObject tmpL = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpD = _localVariable_3;
		if (tmpB instanceof Decision) {
			Decision b = (Decision) tmpB;
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						return new Object[] { b, l, a, d, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decld2branchbb_2_2_corematch_blackFBBBBFB(Decision b, Assignment l,
			While a, Decision d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { d2c, b, l, a, d, c, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decld2branchbb_2_3_findcontext_blackBBBBBB(S2B d2c, Decision b,
			Assignment l, While a, Decision d, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			if (b.equals(d.getNegative())) {
				if (d.equals(d2c.getSource())) {
					if (c.equals(d2c.getTarget())) {
						if (a.equals(d.getPositive())) {
							if (l.equals(a.getLast())) {
								_result.add(new Object[] { d2c, b, l, a, d, c });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(S2B d2c, Decision b,
			Assignment l, While a, Decision d, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d__b____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		String d2c__c____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(c);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		return new Object[] { d2c, b, l, a, d, c, isApplicableMatch, d__b____negative, d2c__d____source,
				d2c__c____target, d__a____positive, a__l____last };
	}

	public static final Object[] pattern_decld2branchbb_2_4_solveCSP_bindingFBBBBBBBB(decld2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Decision b, Assignment l, While a, Decision d, Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, d2c, b, l, a, d, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, b, l, a, d, c };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decld2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decld2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Decision b, Assignment l, While a, Decision d, Branch c) {
		Object[] result_pattern_decld2branchbb_2_4_solveCSP_binding = pattern_decld2branchbb_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d2c, b, l, a, d, c);
		if (result_pattern_decld2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decld2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_decld2branchbb_2_4_solveCSP_black = pattern_decld2branchbb_2_4_solveCSP_blackB(csp);
			if (result_pattern_decld2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, b, l, a, d, c };
			}
		}
		return null;
	}

	public static final boolean pattern_decld2branchbb_2_5_checkCSP_expressionFBB(decld2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decld2branchbb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decld2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decld2branchbb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_10_1_initialbindings_blackBBBBBB(decld2branchbb _this,
			Match match, Branch x, Command z, Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					return new Object[] { _this, match, x, z, c, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_10_2_SolveCSP_bindingFBBBBBB(decld2branchbb _this, Match match,
			Branch x, Command z, Branch c, Branch y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, z, c, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, z, c, y };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decld2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(decld2branchbb _this,
			Match match, Branch x, Command z, Branch c, Branch y) {
		Object[] result_pattern_decld2branchbb_10_2_SolveCSP_binding = pattern_decld2branchbb_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, x, z, c, y);
		if (result_pattern_decld2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decld2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decld2branchbb_10_2_SolveCSP_black = pattern_decld2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decld2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, z, c, y };
			}
		}
		return null;
	}

	public static final boolean pattern_decld2branchbb_10_3_CheckCSP_expressionFBB(decld2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Branch x, Command z, Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					return new Object[] { match, x, z, c, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Branch x, Command z, Branch c, Branch y) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String z__x____next_name_prime = "next";
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		return new Object[] { match, x, z, c, y, c__x____positive, c__y____negative, z__x____next };
	}

	public static final Object[] pattern_decld2branchbb_10_5_collectcontextelements_blackBBBBB(Match match, Branch x,
			Command z, Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					return new Object[] { match, x, z, c, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decld2branchbb_10_6_registerobjectstomatch_expressionBBBBBB(decld2branchbb _this,
			Match match, Branch x, Command z, Branch c, Branch y) {
		_this.registerObjectsToMatch_BWD(match, x, z, c, y);

	}

	public static final boolean pattern_decld2branchbb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decld2branchbb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("z");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("c");
		EObject _localVariable_5 = isApplicableMatch.getObject("y");
		EObject tmpD2c = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpY = _localVariable_5;
		if (tmpD2c instanceof S2B) {
			S2B d2c = (S2B) tmpD2c;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							if (tmpY instanceof Branch) {
								Branch y = (Branch) tmpY;
								return new Object[] { d2c, x, z, d, c, y, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_11_1_performtransformation_blackBBBBBBFBB(S2B d2c, Branch x,
			Command z, Decision d, Branch c, Branch y, decld2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { d2c, x, z, d, c, y, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decld2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decld2branchbb_11_1_performtransformation_binding = pattern_decld2branchbb_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decld2branchbb_11_1_performtransformation_binding != null) {
			S2B d2c = (S2B) result_pattern_decld2branchbb_11_1_performtransformation_binding[0];
			Branch x = (Branch) result_pattern_decld2branchbb_11_1_performtransformation_binding[1];
			Command z = (Command) result_pattern_decld2branchbb_11_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_decld2branchbb_11_1_performtransformation_binding[3];
			Branch c = (Branch) result_pattern_decld2branchbb_11_1_performtransformation_binding[4];
			Branch y = (Branch) result_pattern_decld2branchbb_11_1_performtransformation_binding[5];

			Object[] result_pattern_decld2branchbb_11_1_performtransformation_black = pattern_decld2branchbb_11_1_performtransformation_blackBBBBBBFBB(
					d2c, x, z, d, c, y, _this, isApplicableMatch);
			if (result_pattern_decld2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decld2branchbb_11_1_performtransformation_black[6];

				return new Object[] { d2c, x, z, d, c, y, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_11_1_performtransformation_greenBBFFFBFFFB(Branch x, Command z,
			Decision d, Branch y) {
		Decision b = SourcecodeFactory.eINSTANCE.createDecision();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		d.setNegative(b);
		d.setPositive(a);
		a.setLast(l);
		a2x.setSource(a);
		a2x.setTarget(x);
		b2y.setSource(b);
		b2y.setTarget(y);
		l2z.setTarget(z);
		l2z.setSource(l);
		return new Object[] { x, z, b, l, a, d, a2x, b2y, l2z, y };
	}

	public static final Object[] pattern_decld2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(Branch x,
			Command z, Decision b, Assignment l, While a, S2B a2x, S2B b2y, S2N l2z, Branch y) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				return new Object[] { x, z, b, l, a, a2x, b2y, l2z, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(Branch x,
			Command z, Decision b, Assignment l, While a, S2B a2x, S2B b2y, S2N l2z, Branch y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(y);
		return new Object[] { ruleresult, x, z, b, l, a, a2x, b2y, l2z, y };
	}

	public static final Object[] pattern_decld2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d2c, EObject x, EObject z, EObject b, EObject l, EObject a, EObject d,
			EObject c, EObject a2x, EObject b2y, EObject l2z, EObject y) {
		if (!d2c.equals(x)) {
			if (!d2c.equals(z)) {
				if (!d2c.equals(l)) {
					if (!d2c.equals(l2z)) {
						if (!d2c.equals(y)) {
							if (!x.equals(z)) {
								if (!x.equals(y)) {
									if (!b.equals(d2c)) {
										if (!b.equals(x)) {
											if (!b.equals(z)) {
												if (!b.equals(l)) {
													if (!b.equals(d)) {
														if (!b.equals(c)) {
															if (!b.equals(b2y)) {
																if (!b.equals(l2z)) {
																	if (!b.equals(y)) {
																		if (!l.equals(x)) {
																			if (!l.equals(z)) {
																				if (!l.equals(l2z)) {
																					if (!l.equals(y)) {
																						if (!a.equals(d2c)) {
																							if (!a.equals(x)) {
																								if (!a.equals(z)) {
																									if (!a.equals(b)) {
																										if (!a.equals(
																												l)) {
																											if (!a.equals(
																													d)) {
																												if (!a.equals(
																														c)) {
																													if (!a.equals(
																															a2x)) {
																														if (!a.equals(
																																b2y)) {
																															if (!a.equals(
																																	l2z)) {
																																if (!a.equals(
																																		y)) {
																																	if (!d.equals(
																																			d2c)) {
																																		if (!d.equals(
																																				x)) {
																																			if (!d.equals(
																																					z)) {
																																				if (!d.equals(
																																						l)) {
																																					if (!d.equals(
																																							l2z)) {
																																						if (!d.equals(
																																								y)) {
																																							if (!c.equals(
																																									d2c)) {
																																								if (!c.equals(
																																										x)) {
																																									if (!c.equals(
																																											z)) {
																																										if (!c.equals(
																																												l)) {
																																											if (!c.equals(
																																													d)) {
																																												if (!c.equals(
																																														l2z)) {
																																													if (!c.equals(
																																															y)) {
																																														if (!a2x.equals(
																																																d2c)) {
																																															if (!a2x.equals(
																																																	x)) {
																																																if (!a2x.equals(
																																																		z)) {
																																																	if (!a2x.equals(
																																																			b)) {
																																																		if (!a2x.equals(
																																																				l)) {
																																																			if (!a2x.equals(
																																																					d)) {
																																																				if (!a2x.equals(
																																																						c)) {
																																																					if (!a2x.equals(
																																																							b2y)) {
																																																						if (!a2x.equals(
																																																								l2z)) {
																																																							if (!a2x.equals(
																																																									y)) {
																																																								if (!b2y.equals(
																																																										d2c)) {
																																																									if (!b2y.equals(
																																																											x)) {
																																																										if (!b2y.equals(
																																																												z)) {
																																																											if (!b2y.equals(
																																																													l)) {
																																																												if (!b2y.equals(
																																																														d)) {
																																																													if (!b2y.equals(
																																																															c)) {
																																																														if (!b2y.equals(
																																																																l2z)) {
																																																															if (!b2y.equals(
																																																																	y)) {
																																																																if (!l2z.equals(
																																																																		x)) {
																																																																	if (!l2z.equals(
																																																																			z)) {
																																																																		if (!l2z.equals(
																																																																				y)) {
																																																																			if (!y.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						d2c,
																																																																						x,
																																																																						z,
																																																																						b,
																																																																						l,
																																																																						a,
																																																																						d,
																																																																						c,
																																																																						a2x,
																																																																						b2y,
																																																																						l2z,
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
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decld2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject x, EObject z, EObject b, EObject l, EObject a, EObject d, EObject c,
			EObject a2x, EObject b2y, EObject l2z, EObject y) {
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decld2branchbb";
		String d__b____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String l2z__z____target_name_prime = "target";
		String l2z__l____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		return new Object[] { ruleresult, x, z, b, l, a, d, c, a2x, b2y, l2z, y, d__b____negative, a2x__a____source,
				b2y__b____source, d__a____positive, a__l____last, c__x____positive, c__y____negative, l2z__z____target,
				l2z__l____source, a2x__x____target, z__x____next, b2y__y____target };
	}

	public static final void pattern_decld2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(decld2branchbb _this,
			PerformRuleResult ruleresult, EObject d2c, EObject x, EObject z, EObject b, EObject l, EObject a, EObject d,
			EObject c, EObject a2x, EObject b2y, EObject l2z, EObject y) {
		_this.registerObjects_BWD(ruleresult, d2c, x, z, b, l, a, d, c, a2x, b2y, l2z, y);

	}

	public static final PerformRuleResult pattern_decld2branchbb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_12_1_preparereturnvalue_bindingFB(decld2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			decld2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(
			decld2branchbb _this) {
		Object[] result_pattern_decld2branchbb_12_1_preparereturnvalue_binding = pattern_decld2branchbb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decld2branchbb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decld2branchbb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decld2branchbb_12_1_preparereturnvalue_black = pattern_decld2branchbb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decld2branchbb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decld2branchbb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decld2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decld2branchbb_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("z");
		EObject _localVariable_2 = match.getObject("c");
		EObject _localVariable_3 = match.getObject("y");
		EObject tmpX = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpY = _localVariable_3;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpY instanceof Branch) {
						Branch y = (Branch) tmpY;
						return new Object[] { x, z, c, y, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decld2branchbb_12_2_corematch_blackFBBFBBB(Branch x, Command z,
			Branch c, Branch y, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
							"target")) {
						Statement tmpD = d2c.getSource();
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							_result.add(new Object[] { d2c, x, z, d, c, y, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decld2branchbb_12_3_findcontext_blackBBBBBB(S2B d2c, Branch x,
			Command z, Decision d, Branch c, Branch y) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (d.equals(d2c.getSource())) {
						if (c.equals(d2c.getTarget())) {
							if (x.equals(c.getPositive())) {
								if (y.equals(c.getNegative())) {
									if (x.equals(z.getNext())) {
										_result.add(new Object[] { d2c, x, z, d, c, y });
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

	public static final Object[] pattern_decld2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(S2B d2c, Branch x, Command z,
			Decision d, Branch c, Branch y) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__d____source_name_prime = "source";
		String d2c__c____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String z__x____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(y);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
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
		d2c__d____source.setName(d2c__d____source_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		return new Object[] { d2c, x, z, d, c, y, isApplicableMatch, d2c__d____source, d2c__c____target,
				c__x____positive, c__y____negative, z__x____next };
	}

	public static final Object[] pattern_decld2branchbb_12_4_solveCSP_bindingFBBBBBBBB(decld2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch x, Command z, Decision d, Branch c, Branch y) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, d2c, x, z, d, c, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, x, z, d, c, y };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decld2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(decld2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch x, Command z, Decision d, Branch c, Branch y) {
		Object[] result_pattern_decld2branchbb_12_4_solveCSP_binding = pattern_decld2branchbb_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d2c, x, z, d, c, y);
		if (result_pattern_decld2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decld2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_decld2branchbb_12_4_solveCSP_black = pattern_decld2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decld2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, x, z, d, c, y };
			}
		}
		return null;
	}

	public static final boolean pattern_decld2branchbb_12_5_checkCSP_expressionFBB(decld2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decld2branchbb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decld2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decld2branchbb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_20_1_preparereturnvalue_bindingFB(decld2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decld2branchbb _this) {
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

	public static final Object[] pattern_decld2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			decld2branchbb _this) {
		Object[] result_pattern_decld2branchbb_20_1_preparereturnvalue_binding = pattern_decld2branchbb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decld2branchbb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decld2branchbb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decld2branchbb_20_1_preparereturnvalue_black = pattern_decld2branchbb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decld2branchbb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decld2branchbb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decld2branchbb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_985099 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_39875 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_39875)) {
							if (!c.equals(__DEC_x_positive_39875)) {
								if (!y.equals(__DEC_x_positive_39875)) {
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

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_909771 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_909771)) {
							if (!c.equals(__DEC_x_negative_909771)) {
								if (!y.equals(__DEC_x_negative_909771)) {
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

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_573638 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(Command z, Branch x,
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_positive_129350 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!x.equals(__DEC_z_positive_129350)) {
							if (!c.equals(__DEC_z_positive_129350)) {
								if (!y.equals(__DEC_z_positive_129350)) {
									return new Object[] { z, x, c, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(Command z, Branch x,
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_negative_106774 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!x.equals(__DEC_z_negative_106774)) {
							if (!c.equals(__DEC_z_negative_106774)) {
								if (!y.equals(__DEC_z_negative_106774)) {
									return new Object[] { z, x, c, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_6B(Branch y) {
		for (Graph __DEC_y_root_415045 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_927033 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_927033)) {
							if (!x.equals(__DEC_y_positive_927033)) {
								if (!c.equals(__DEC_y_positive_927033)) {
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

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_504138 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_504138)) {
							if (!x.equals(__DEC_y_negative_504138)) {
								if (!c.equals(__DEC_y_negative_504138)) {
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

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_9BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_10BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_11BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_12BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_13BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_14BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_15BB(Branch x, Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_16BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_17BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decld2branchbb_20_2_testcorematchandDECs_blackFFFFB(
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
							if (!x.equals(y)) {
								if (!c.equals(y)) {
									if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
										if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(x, c,
												y) == null) {
											if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(x, c,
													y) == null) {
												if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_6B(
														y) == null) {
													if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(
															y, x, c) == null) {
														if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(
																y, x, c) == null) {
															if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																	x, y) == null) {
																if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_16BB(
																		c, y) == null) {
																	if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_17BB(
																			x, y) == null) {
																		for (Node tmpZ : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(x,
																						Node.class, "next")) {
																			if (tmpZ instanceof Command) {
																				Command z = (Command) tmpZ;
																				if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_3B(
																						z) == null) {
																					if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(
																							z, x, c, y) == null) {
																						if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(
																								z, x, c, y) == null) {
																							if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_9BB(
																									x, z) == null) {
																								if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_10BB(
																										c, z) == null) {
																									if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_11BB(
																											y,
																											z) == null) {
																										if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_12BB(
																												x,
																												z) == null) {
																											if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_13BB(
																													c,
																													z) == null) {
																												if (pattern_decld2branchbb_20_2_testcorematchandDECs_black_nac_14BB(
																														y,
																														z) == null) {
																													_result.add(
																															new Object[] {
																																	x,
																																	z,
																																	c,
																																	y,
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

		return _result;
	}

	public static final Object[] pattern_decld2branchbb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decld2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decld2branchbb _this, Match match, Branch x, Command z, Branch c, Branch y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, z, c, y);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decld2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decld2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decld2branchbb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_21_1_preparereturnvalue_bindingFB(decld2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decld2branchbb _this) {
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

	public static final Object[] pattern_decld2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			decld2branchbb _this) {
		Object[] result_pattern_decld2branchbb_21_1_preparereturnvalue_binding = pattern_decld2branchbb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decld2branchbb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decld2branchbb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decld2branchbb_21_1_preparereturnvalue_black = pattern_decld2branchbb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decld2branchbb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decld2branchbb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decld2branchbb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_0BB(Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_b_positive_711309 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!b.equals(__DEC_b_positive_711309)) {
					if (!d.equals(__DEC_b_positive_711309)) {
						return new Object[] { b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_1BB(Decision b, While a) {
		for (While __DEC_b_first_887092 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_887092)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_2BB(Decision b, While a) {
		for (While __DEC_b_last_106302 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_106302)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_3B(Decision b) {
		for (Program __DEC_b_first_55746 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_4BBB(Assignment l,
			Decision b, Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_l_positive_700582 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "positive")) {
				if (!b.equals(__DEC_l_positive_700582)) {
					if (!d.equals(__DEC_l_positive_700582)) {
						return new Object[] { l, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_5BBB(Assignment l,
			Decision b, Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_l_negative_946056 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "negative")) {
				if (!b.equals(__DEC_l_negative_946056)) {
					if (!d.equals(__DEC_l_negative_946056)) {
						return new Object[] { l, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_6BB(Assignment l, While a) {
		for (While __DEC_l_first_847049 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!a.equals(__DEC_l_first_847049)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_7BB(Assignment l, While a) {
		for (While __DEC_l_last_346535 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_346535)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_8B(Assignment l) {
		for (Program __DEC_l_first_692955 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_9BBB(While a, Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_a_negative_368967 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!b.equals(__DEC_a_negative_368967)) {
					if (!d.equals(__DEC_a_negative_368967)) {
						return new Object[] { a, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_10B(While a) {
		for (While __DEC_a_first_466746 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_466746)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_11B(While a) {
		for (While __DEC_a_last_326467 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_326467)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_12B(While a) {
		for (Program __DEC_a_first_48996 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_13BB(While a, Decision b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_14BB(While a, Decision b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_15BB(Decision b,
			Assignment l) {
		if (l.equals(b.getPositive())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_16BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_17BB(Decision b,
			Assignment l) {
		if (l.equals(b.getNegative())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_18BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_19BB(While a,
			Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_20BB(Decision b, While a) {
		if (a.equals(b.getNegative())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_21BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decld2branchbb_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_negative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpD = _edge_negative.getSrc();
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			EObject tmpB = _edge_negative.getTrg();
			if (tmpB instanceof Decision) {
				Decision b = (Decision) tmpB;
				if (!b.equals(d)) {
					if (b.equals(d.getNegative())) {
						Statement tmpA = d.getPositive();
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							Statement tmpL = a.getLast();
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_0BB(b, d) == null) {
									if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_3B(b) == null) {
										if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_1BB(b,
												a) == null) {
											if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_2BB(b,
													a) == null) {
												if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_9BBB(a,
														b, d) == null) {
													if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_10B(
															a) == null) {
														if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_11B(
																a) == null) {
															if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_12B(
																	a) == null) {
																if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_13BB(
																		a, b) == null) {
																	if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_14BB(
																			a, b) == null) {
																		if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_20BB(
																				b, a) == null) {
																			if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																					d, a) == null) {
																				if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_4BBB(
																						l, b, d) == null) {
																					if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_5BBB(
																							l, b, d) == null) {
																						if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_6BB(
																								l, a) == null) {
																							if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_7BB(
																									l, a) == null) {
																								if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_8B(
																										l) == null) {
																									if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_15BB(
																											b,
																											l) == null) {
																										if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_16BB(
																												d,
																												l) == null) {
																											if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_17BB(
																													b,
																													l) == null) {
																												if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_18BB(
																														d,
																														l) == null) {
																													if (pattern_decld2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																															a,
																															l) == null) {
																														_result.add(
																																new Object[] {
																																		b,
																																		l,
																																		a,
																																		d,
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

		return _result;
	}

	public static final Object[] pattern_decld2branchbb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decld2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decld2branchbb _this, Match match, Decision b, Assignment l, While a, Decision d) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, l, a, d);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decld2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decld2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decld2branchbb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_24_1_prepare_blackB(decld2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decld2branchbb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_decld2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("x");
		EObject _localVariable_1 = targetMatch.getObject("z");
		EObject _localVariable_2 = sourceMatch.getObject("b");
		EObject _localVariable_3 = sourceMatch.getObject("l");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = sourceMatch.getObject("d");
		EObject _localVariable_6 = targetMatch.getObject("c");
		EObject _localVariable_7 = targetMatch.getObject("y");
		EObject tmpX = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpL = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpD = _localVariable_5;
		EObject tmpC = _localVariable_6;
		EObject tmpY = _localVariable_7;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpB instanceof Decision) {
					Decision b = (Decision) tmpB;
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								if (tmpC instanceof Branch) {
									Branch c = (Branch) tmpC;
									if (tmpY instanceof Branch) {
										Branch y = (Branch) tmpY;
										return new Object[] { x, z, b, l, a, d, c, y, targetMatch, sourceMatch };
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

	public static final Object[] pattern_decld2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Branch x, Command z,
			Decision b, Assignment l, While a, Decision d, Branch c, Branch y, Match sourceMatch, Match targetMatch) {
		if (!x.equals(y)) {
			if (!b.equals(d)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { x, z, b, l, a, d, c, y, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decld2branchbb_24_2_matchsrctrgcontext_binding = pattern_decld2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_decld2branchbb_24_2_matchsrctrgcontext_binding != null) {
			Branch x = (Branch) result_pattern_decld2branchbb_24_2_matchsrctrgcontext_binding[0];
			Command z = (Command) result_pattern_decld2branchbb_24_2_matchsrctrgcontext_binding[1];
			Decision b = (Decision) result_pattern_decld2branchbb_24_2_matchsrctrgcontext_binding[2];
			Assignment l = (Assignment) result_pattern_decld2branchbb_24_2_matchsrctrgcontext_binding[3];
			While a = (While) result_pattern_decld2branchbb_24_2_matchsrctrgcontext_binding[4];
			Decision d = (Decision) result_pattern_decld2branchbb_24_2_matchsrctrgcontext_binding[5];
			Branch c = (Branch) result_pattern_decld2branchbb_24_2_matchsrctrgcontext_binding[6];
			Branch y = (Branch) result_pattern_decld2branchbb_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decld2branchbb_24_2_matchsrctrgcontext_black = pattern_decld2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					x, z, b, l, a, d, c, y, sourceMatch, targetMatch);
			if (result_pattern_decld2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { x, z, b, l, a, d, c, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(decld2branchbb _this,
			Branch x, Command z, Decision b, Assignment l, While a, Decision d, Branch c, Branch y, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(x, z, b, l, a, d, c, y, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, x, z, b, l, a, d, c, y, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decld2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(decld2branchbb _this,
			Branch x, Command z, Decision b, Assignment l, While a, Decision d, Branch c, Branch y, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_decld2branchbb_24_3_solvecsp_binding = pattern_decld2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, x, z, b, l, a, d, c, y, sourceMatch, targetMatch);
		if (result_pattern_decld2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decld2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_decld2branchbb_24_3_solvecsp_black = pattern_decld2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decld2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, x, z, b, l, a, d, c, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decld2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decld2branchbb_24_5_matchcorrcontext_blackFBBBB(Decision d, Branch c,
			Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_decld2branchbb_24_5_matchcorrcontext_greenBBBF(S2B d2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "decld2branchbb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_decld2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(Branch x, Command z,
			Decision b, Assignment l, While a, Decision d, Branch c, Branch y, CCMatch ccMatch) {
		if (!x.equals(y)) {
			if (!b.equals(d)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						return new Object[] { x, z, b, l, a, d, c, y, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_24_6_createcorrespondence_greenBBBBBFFFBB(Branch x, Command z,
			Decision b, Assignment l, While a, Branch y, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		l2z.setTarget(z);
		l2z.setSource(l);
		ccMatch.getCreateCorr().add(l2z);
		return new Object[] { x, z, b, l, a, a2x, b2y, l2z, y, ccMatch };
	}

	public static final Object[] pattern_decld2branchbb_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_decld2branchbb_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "decld2branchbb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_decld2branchbb_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_0BB(Decision b, Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_b_positive_386103 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!b.equals(__DEC_b_positive_386103)) {
					if (!d.equals(__DEC_b_positive_386103)) {
						return new Object[] { b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_1BB(Decision b, While a) {
		for (While __DEC_b_first_272331 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_272331)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_2BB(Decision b, While a) {
		for (While __DEC_b_last_119241 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_119241)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_3B(Decision b) {
		for (Program __DEC_b_first_690710 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_4BBB(Assignment l, Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_l_positive_700537 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "positive")) {
				if (!b.equals(__DEC_l_positive_700537)) {
					if (!d.equals(__DEC_l_positive_700537)) {
						return new Object[] { l, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_5BBB(Assignment l, Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_l_negative_605442 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "negative")) {
				if (!b.equals(__DEC_l_negative_605442)) {
					if (!d.equals(__DEC_l_negative_605442)) {
						return new Object[] { l, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_6BB(Assignment l, While a) {
		for (While __DEC_l_first_110069 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!a.equals(__DEC_l_first_110069)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_7BB(Assignment l, While a) {
		for (While __DEC_l_last_433608 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_433608)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_8B(Assignment l) {
		for (Program __DEC_l_first_720037 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_9BBB(While a, Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_a_negative_647184 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!b.equals(__DEC_a_negative_647184)) {
					if (!d.equals(__DEC_a_negative_647184)) {
						return new Object[] { a, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_10B(While a) {
		for (While __DEC_a_first_893937 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_893937)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_11B(While a) {
		for (While __DEC_a_last_531489 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_531489)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_12B(While a) {
		for (Program __DEC_a_first_955134 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_13BB(While a, Decision b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_14BB(While a, Decision b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_15BB(Decision b, Assignment l) {
		if (l.equals(b.getPositive())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_16BB(Decision d, Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_17BB(Decision b, Assignment l) {
		if (l.equals(b.getNegative())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_18BB(Decision d, Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_19BB(While a, Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_20BB(Decision b, While a) {
		if (a.equals(b.getNegative())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_black_nac_21BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_27_1_matchtggpattern_blackBBBB(Decision b, Assignment l,
			While a, Decision d) {
		if (!b.equals(d)) {
			if (b.equals(d.getNegative())) {
				if (a.equals(d.getPositive())) {
					if (l.equals(a.getLast())) {
						if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_0BB(b, d) == null) {
							if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_1BB(b, a) == null) {
								if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_2BB(b, a) == null) {
									if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_3B(b) == null) {
										if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_4BBB(l, b,
												d) == null) {
											if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_5BBB(l, b,
													d) == null) {
												if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_6BB(l,
														a) == null) {
													if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_7BB(l,
															a) == null) {
														if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_8B(
																l) == null) {
															if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_9BBB(
																	a, b, d) == null) {
																if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_10B(
																		a) == null) {
																	if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_11B(
																			a) == null) {
																		if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_12B(
																				a) == null) {
																			if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_13BB(
																					a, b) == null) {
																				if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_14BB(
																						a, b) == null) {
																					if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_15BB(
																							b, l) == null) {
																						if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_16BB(
																								d, l) == null) {
																							if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_17BB(
																									b, l) == null) {
																								if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_18BB(
																										d, l) == null) {
																									if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_19BB(
																											a,
																											l) == null) {
																										if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_20BB(
																												b,
																												a) == null) {
																											if (pattern_decld2branchbb_27_1_matchtggpattern_black_nac_21BB(
																													d,
																													a) == null) {
																												return new Object[] {
																														b,
																														l,
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
		}
		return null;
	}

	public static final boolean pattern_decld2branchbb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decld2branchbb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_233726 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_1BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_837393 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_837393)) {
							if (!c.equals(__DEC_x_positive_837393)) {
								if (!y.equals(__DEC_x_positive_837393)) {
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

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_2BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_572327 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_572327)) {
							if (!c.equals(__DEC_x_negative_572327)) {
								if (!y.equals(__DEC_x_negative_572327)) {
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

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_362159 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_4BBBB(Command z, Branch x,
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_positive_988024 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!x.equals(__DEC_z_positive_988024)) {
							if (!c.equals(__DEC_z_positive_988024)) {
								if (!y.equals(__DEC_z_positive_988024)) {
									return new Object[] { z, x, c, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_5BBBB(Command z, Branch x,
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_negative_826624 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!x.equals(__DEC_z_negative_826624)) {
							if (!c.equals(__DEC_z_negative_826624)) {
								if (!y.equals(__DEC_z_negative_826624)) {
									return new Object[] { z, x, c, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_6B(Branch y) {
		for (Graph __DEC_y_root_68499 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_7BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_254115 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_254115)) {
							if (!x.equals(__DEC_y_positive_254115)) {
								if (!c.equals(__DEC_y_positive_254115)) {
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

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_8BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_5383 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_5383)) {
							if (!x.equals(__DEC_y_negative_5383)) {
								if (!c.equals(__DEC_y_negative_5383)) {
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

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_9BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_10BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_11BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_12BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_13BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_14BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_15BB(Branch x, Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_16BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_black_nac_17BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_28_1_matchtggpattern_blackBBBB(Branch x, Command z, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (x.equals(c.getPositive())) {
						if (y.equals(c.getNegative())) {
							if (x.equals(z.getNext())) {
								if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_0B(x) == null) {
									if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_1BBB(x, c, y) == null) {
										if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_2BBB(x, c,
												y) == null) {
											if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_3B(z) == null) {
												if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_4BBBB(z, x, c,
														y) == null) {
													if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_5BBBB(z,
															x, c, y) == null) {
														if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_6B(
																y) == null) {
															if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_7BBB(
																	y, x, c) == null) {
																if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_8BBB(
																		y, x, c) == null) {
																	if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_9BB(
																			x, z) == null) {
																		if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_10BB(
																				c, z) == null) {
																			if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_11BB(
																					y, z) == null) {
																				if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_12BB(
																						x, z) == null) {
																					if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_13BB(
																							c, z) == null) {
																						if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_14BB(
																								y, z) == null) {
																							if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_15BB(
																									x, y) == null) {
																								if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_16BB(
																										c, y) == null) {
																									if (pattern_decld2branchbb_28_1_matchtggpattern_black_nac_17BB(
																											x,
																											y) == null) {
																										return new Object[] {
																												x, z, c,
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
		return null;
	}

	public static final boolean pattern_decld2branchbb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decld2branchbb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_29_1_createresult_blackB(decld2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decld2branchbb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_decld2branchbb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decld2branchbb_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_decld2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult, d2c) == null) {
								if (pattern_decld2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult, d) == null) {
									if (pattern_decld2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_decld2branchbb_29_3_solveCSP_bindingFBBBBBB(decld2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Decision d, Branch c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d2c, d, c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, d, c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decld2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decld2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(decld2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Decision d, Branch c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decld2branchbb_29_3_solveCSP_binding = pattern_decld2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d2c, d, c, ruleResult);
		if (result_pattern_decld2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decld2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_decld2branchbb_29_3_solveCSP_black = pattern_decld2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decld2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, d, c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decld2branchbb_29_4_checkCSP_expressionFBB(decld2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decld2branchbb_29_5_checknacs_blackBBB(S2B d2c, Decision d, Branch c) {
		return new Object[] { d2c, d, c };
	}

	public static final Object[] pattern_decld2branchbb_29_6_perform_blackBBBB(S2B d2c, Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d2c, d, c, ruleResult };
	}

	public static final Object[] pattern_decld2branchbb_29_6_perform_greenFFFFFBBFFFFB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Decision b = SourcecodeFactory.eINSTANCE.createDecision();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		z.setNext(x);
		ruleResult.getTargetObjects().add(z);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		ruleResult.getSourceObjects().add(l);
		d.setPositive(a);
		a.setLast(l);
		ruleResult.getSourceObjects().add(a);
		a2x.setSource(a);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		l2z.setTarget(z);
		l2z.setSource(l);
		ruleResult.getCorrObjects().add(l2z);
		c.setNegative(y);
		b2y.setTarget(y);
		ruleResult.getTargetObjects().add(y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { x, z, b, l, a, d, c, a2x, b2y, l2z, y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decld2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decld2branchbbImpl
