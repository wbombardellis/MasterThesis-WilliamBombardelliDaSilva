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
import org.wbsilva.bx.sourcecode2controlflow.Rules.decdecass2branchbranchcmd;

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
 * An implementation of the model object '<em><b>decdecass2branchbranchcmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class decdecass2branchbranchcmdImpl extends AbstractRuleImpl implements decdecass2branchbranchcmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decdecass2branchbranchcmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdecdecass2branchbranchcmd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Decision d, Assignment b, Decision a) {

		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_0_1_initialbindings_blackBBBBB(this, match, d, b, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, d, b, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_0_4_collectelementstobetranslated_blackBBBB(match, d, b, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
			}
			decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_0_4_collectelementstobetranslated_greenBBBBFF(match, d, b, a);
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_0_5_collectcontextelements_blackBBBB(match, d, b, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
			}
			decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_0_5_collectcontextelements_greenBB(match,
					d);

			// 
			decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_0_6_registerobjectstomatch_expressionBBBBB(this, match, d, b, a);
			return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_0_7_expressionF();
		} else {
			return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Decision d = (Decision) result1_bindingAndBlack[0];
		Branch c = (Branch) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		Assignment b = (Assignment) result1_bindingAndBlack[3];
		Decision a = (Decision) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_1_1_performtransformation_greenBFFFBBF(c, b, a);
		Command y = (Command) result1_green[1];
		S2B a2x = (S2B) result1_green[2];
		Branch x = (Branch) result1_green[3];
		S2N b2y = (S2N) result1_green[6];

		Object[] result2_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_1_2_collecttranslatedelements_blackBBBBBB(y, a2x, x, b, a, b2y);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[a2x] = " + a2x + ", "
							+ "[x] = " + x + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_1_2_collecttranslatedelements_greenFBBBBBB(y, a2x, x, b, a, b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, d, c, y, a2x,
						d2c, x, b, a, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[a2x] = " + a2x + ", "
					+ "[d2c] = " + d2c + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[b2y] = " + b2y + ".");
		}
		decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, d, c, y, a2x, x, b, a, b2y);
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[16];

		// 
		// 
		decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, d, c, y, a2x, d2c, x, b, a, b2y);
		return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Decision d = (Decision) result2_binding[0];
		Assignment b = (Assignment) result2_binding[1];
		Decision a = (Decision) result2_binding[2];
		for (Object[] result2_black : decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_2_2_corematch_blackBFFBBB(d, b, a, match)) {
			Branch c = (Branch) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_2_3_findcontext_blackBBBBB(d, c, d2c, b, a)) {
				Object[] result3_green = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_2_3_findcontext_greenBBBBBFFFFF(d, c, d2c, b, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								d, c, d2c, b, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[c] = " + c
							+ ", " + "[d2c] = " + d2c + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = decdecass2branchbranchcmdImpl
							.pattern_decdecass2branchbranchcmd_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Decision d, Assignment b, Decision a) {
		match.registerObject("d", d);
		match.registerObject("b", b);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision d, Assignment b, Decision a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c,
			Assignment b, Decision a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("b", b);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject d, EObject c, EObject y, EObject a2x,
			EObject d2c, EObject x, EObject b, EObject a, EObject b2y) {
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b2y", b2y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch c, Command y, Branch x) {

		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_10_1_initialbindings_blackBBBBB(this, match, c, y, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, c, y, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_10_4_collectelementstobetranslated_blackBBBB(match, c, y, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
			}
			decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_10_4_collectelementstobetranslated_greenBBBBFF(match, c, y, x);
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_10_5_collectcontextelements_blackBBBB(match, c, y, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
			}
			decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_10_5_collectcontextelements_greenBB(match,
					c);

			// 
			decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, c, y, x);
			return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_10_7_expressionF();
		} else {
			return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Decision d = (Decision) result1_bindingAndBlack[0];
		Branch c = (Branch) result1_bindingAndBlack[1];
		Command y = (Command) result1_bindingAndBlack[2];
		S2B d2c = (S2B) result1_bindingAndBlack[3];
		Branch x = (Branch) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_11_1_performtransformation_greenBBFBFFF(d, y, x);
		S2B a2x = (S2B) result1_green[2];
		Assignment b = (Assignment) result1_green[4];
		Decision a = (Decision) result1_green[5];
		S2N b2y = (S2N) result1_green[6];

		Object[] result2_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_11_2_collecttranslatedelements_blackBBBBBB(y, a2x, x, b, a, b2y);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[a2x] = " + a2x + ", "
							+ "[x] = " + x + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_11_2_collecttranslatedelements_greenFBBBBBB(y, a2x, x, b, a, b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, d, c, y, a2x,
						d2c, x, b, a, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[a2x] = " + a2x + ", "
					+ "[d2c] = " + d2c + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[b2y] = " + b2y + ".");
		}
		decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, d, c, y, a2x, x, b, a, b2y);
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[16];

		// 
		// 
		decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, d, c, y, a2x, d2c, x, b, a, b2y);
		return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch c = (Branch) result2_binding[0];
		Command y = (Command) result2_binding[1];
		Branch x = (Branch) result2_binding[2];
		for (Object[] result2_black : decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_12_2_corematch_blackFBBFBB(c, y, x, match)) {
			Decision d = (Decision) result2_black[0];
			S2B d2c = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_12_3_findcontext_blackBBBBB(d, c, y, d2c, x)) {
				Object[] result3_green = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_12_3_findcontext_greenBBBBBFFFFF(d, c, y, d2c, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_12_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, d, c, y, d2c, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[c] = " + c
							+ ", " + "[y] = " + y + ", " + "[d2c] = " + d2c + ", " + "[x] = " + x + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = decdecass2branchbranchcmdImpl
							.pattern_decdecass2branchbranchcmd_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch c, Command y, Branch x) {
		match.registerObject("c", c);
		match.registerObject("y", y);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch c, Command y, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Decision d, Branch c, Command y, S2B d2c,
			Branch x) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("y", y);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject d, EObject c, EObject y, EObject a2x,
			EObject d2c, EObject x, EObject b, EObject a, EObject b2y) {
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b2y", b2y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_145(EMoflonEdge _edge_negative) {

		Object[] result1_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_blackFFFB(_edge_negative)) {
			Branch c = (Branch) result2_black[0];
			Command y = (Command) result2_black[1];
			Branch x = (Branch) result2_black[2];
			Object[] result2_green = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, c, y, x)) {
				// 
				if (decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = decdecass2branchbranchcmdImpl
							.pattern_decdecass2branchbranchcmd_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_145(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_blackFFFB(_edge_positive)) {
			Decision d = (Decision) result2_black[0];
			Assignment b = (Assignment) result2_black[1];
			Decision a = (Decision) result2_black[2];
			Object[] result2_green = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, d, b, a)) {
				// 
				if (decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = decdecass2branchbranchcmdImpl
							.pattern_decdecass2branchbranchcmd_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("decdecass2branchbranchcmd");
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
		ruleResult.setRule("decdecass2branchbranchcmd");
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

		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Decision d = (Decision) result2_bindingAndBlack[0];
		Branch c = (Branch) result2_bindingAndBlack[1];
		Command y = (Command) result2_bindingAndBlack[2];
		Branch x = (Branch) result2_bindingAndBlack[3];
		Assignment b = (Assignment) result2_bindingAndBlack[4];
		Decision a = (Decision) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, d, c, y, x, b, a,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[d] = " + d + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[b] = "
					+ b + ", " + "[a] = " + a + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_24_5_matchcorrcontext_blackBBFBB(d, c, sourceMatch,
							targetMatch)) {
				S2B d2c = (S2B) result5_black[2];
				Object[] result5_green = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_24_6_createcorrespondence_blackBBBBBBB(d, c, y, x, b, a,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
							+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[b] = " + b + ", "
							+ "[a] = " + a + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_24_6_createcorrespondence_greenBFBBBFB(y, x, b, a, ccMatch);
				//nothing S2B a2x = (S2B) result6_green[1];
				//nothing S2N b2y = (S2N) result6_green[5];

				Object[] result7_black = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Decision d, Branch c, Command y, Branch x, Assignment b, Decision a,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Decision d, Assignment b, Decision a) {// 
		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_blackBBB(d, b, a);
		if (result1_black != null) {
			return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_27_2_expressionF();
		} else {
			return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch c, Command y, Branch x) {// 
		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_blackBBB(c, y, x);
		if (result1_black != null) {
			return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_28_2_expressionF();
		} else {
			return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			Decision d = (Decision) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d,
							c, d2c, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[c] = " + c
						+ ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_29_5_checknacs_blackBBB(d, c, d2c);
				if (result5_black != null) {

					Object[] result6_black = decdecass2branchbranchcmdImpl
							.pattern_decdecass2branchbranchcmd_29_6_perform_blackBBBB(d, c, d2c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
								+ "[c] = " + c + ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_29_6_perform_greenBBFFFFFFB(d, c,
							ruleResult);
					//nothing Command y = (Command) result6_green[2];
					//nothing S2B a2x = (S2B) result6_green[3];
					//nothing Branch x = (Branch) result6_green[4];
					//nothing Assignment b = (Assignment) result6_green[5];
					//nothing Decision a = (Decision) result6_green[6];
					//nothing S2N b2y = (S2N) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c,
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
		isApplicableMatch.registerObject("c", c);
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
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_FWD__MATCH_DECISION_ASSIGNMENT_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Decision) arguments.get(3));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_ASSIGNMENT_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Decision) arguments.get(3));
			return null;
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_ASSIGNMENT_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Decision) arguments.get(3));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DECISION_BRANCH_S2B_ASSIGNMENT_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (Assignment) arguments.get(4),
					(Decision) arguments.get(5));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
			return null;
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_BRANCH_COMMAND_S2B_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (S2B) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_BWD_EMOFLON_EDGE_145__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_145((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_145__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_145((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_SOLVE_CSP_CC__DECISION_BRANCH_COMMAND_BRANCH_ASSIGNMENT_DECISION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Decision) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Assignment) arguments.get(4),
					(Decision) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_DEC_FWD__DECISION_ASSIGNMENT_DECISION:
			return checkDEC_FWD((Decision) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_BRANCH_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_1_initialbindings_blackBBBBB(
			decdecass2branchbranchcmd _this, Match match, Decision d, Assignment b, Decision a) {
		if (!a.equals(d)) {
			return new Object[] { _this, match, d, b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_2_SolveCSP_bindingFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Decision d, Assignment b, Decision a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, d, b, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, d, b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_2_SolveCSP_bindingAndBlackFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Decision d, Assignment b, Decision a) {
		Object[] result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_binding = pattern_decdecass2branchbranchcmd_0_2_SolveCSP_bindingFBBBBB(
				_this, match, d, b, a);
		if (result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_black = pattern_decdecass2branchbranchcmd_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, d, b, a };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_0_3_CheckCSP_expressionFBB(
			decdecass2branchbranchcmd _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_4_collectelementstobetranslated_blackBBBB(
			Match match, Decision d, Assignment b, Decision a) {
		if (!a.equals(d)) {
			return new Object[] { match, d, b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Decision d, Assignment b, Decision a) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { match, d, b, a, d__a____positive, d__b____negative };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_5_collectcontextelements_blackBBBB(Match match,
			Decision d, Assignment b, Decision a) {
		if (!a.equals(d)) {
			return new Object[] { match, d, b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_5_collectcontextelements_greenBB(Match match,
			Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decdecass2branchbranchcmd_0_6_registerobjectstomatch_expressionBBBBB(
			decdecass2branchbranchcmd _this, Match match, Decision d, Assignment b, Decision a) {
		_this.registerObjectsToMatch_FWD(match, d, b, a);

	}

	public static final boolean pattern_decdecass2branchbranchcmd_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("b");
		EObject _localVariable_4 = isApplicableMatch.getObject("a");
		EObject tmpD = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpA = _localVariable_4;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpA instanceof Decision) {
							Decision a = (Decision) tmpA;
							return new Object[] { d, c, d2c, b, a, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_1_performtransformation_blackBBBBBFBB(Decision d,
			Branch c, S2B d2c, Assignment b, Decision a, decdecass2branchbranchcmd _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(d)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { d, c, d2c, b, a, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding = pattern_decdecass2branchbranchcmd_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding != null) {
			Decision d = (Decision) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[0];
			Branch c = (Branch) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[2];
			Assignment b = (Assignment) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[3];
			Decision a = (Decision) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[4];

			Object[] result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_black = pattern_decdecass2branchbranchcmd_1_1_performtransformation_blackBBBBBFBB(
					d, c, d2c, b, a, _this, isApplicableMatch);
			if (result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_black[5];

				return new Object[] { d, c, d2c, b, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_1_performtransformation_greenBFFFBBF(Branch c,
			Assignment b, Decision a) {
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		c.setNegative(y);
		a2x.setSource(a);
		a2x.setTarget(x);
		c.setPositive(x);
		b2y.setSource(b);
		b2y.setTarget(y);
		return new Object[] { c, y, a2x, x, b, a, b2y };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_2_collecttranslatedelements_blackBBBBBB(Command y,
			S2B a2x, Branch x, Assignment b, Decision a, S2N b2y) {
		return new Object[] { y, a2x, x, b, a, b2y };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_2_collecttranslatedelements_greenFBBBBBB(Command y,
			S2B a2x, Branch x, Assignment b, Decision a, S2N b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, y, a2x, x, b, a, b2y };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d, EObject c, EObject y, EObject a2x, EObject d2c, EObject x,
			EObject b, EObject a, EObject b2y) {
		if (!d.equals(y)) {
			if (!d.equals(d2c)) {
				if (!d.equals(x)) {
					if (!c.equals(d)) {
						if (!c.equals(y)) {
							if (!c.equals(d2c)) {
								if (!c.equals(x)) {
									if (!a2x.equals(d)) {
										if (!a2x.equals(c)) {
											if (!a2x.equals(y)) {
												if (!a2x.equals(d2c)) {
													if (!a2x.equals(x)) {
														if (!a2x.equals(b)) {
															if (!a2x.equals(b2y)) {
																if (!d2c.equals(y)) {
																	if (!d2c.equals(x)) {
																		if (!x.equals(y)) {
																			if (!b.equals(d)) {
																				if (!b.equals(c)) {
																					if (!b.equals(y)) {
																						if (!b.equals(d2c)) {
																							if (!b.equals(x)) {
																								if (!b.equals(b2y)) {
																									if (!a.equals(d)) {
																										if (!a.equals(
																												c)) {
																											if (!a.equals(
																													y)) {
																												if (!a.equals(
																														a2x)) {
																													if (!a.equals(
																															d2c)) {
																														if (!a.equals(
																																x)) {
																															if (!a.equals(
																																	b)) {
																																if (!a.equals(
																																		b2y)) {
																																	if (!b2y.equals(
																																			d)) {
																																		if (!b2y.equals(
																																				c)) {
																																			if (!b2y.equals(
																																					y)) {
																																				if (!b2y.equals(
																																						d2c)) {
																																					if (!b2y.equals(
																																							x)) {
																																						return new Object[] {
																																								ruleresult,
																																								d,
																																								c,
																																								y,
																																								a2x,
																																								d2c,
																																								x,
																																								b,
																																								a,
																																								b2y };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decdecass2branchbranchcmd_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject d, EObject c, EObject y, EObject a2x, EObject x, EObject b, EObject a,
			EObject b2y) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdecass2branchbranchcmd";
		String d__a____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String d__b____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		return new Object[] { ruleresult, d, c, y, a2x, x, b, a, b2y, d__a____positive, c__y____negative,
				a2x__x____target, d__b____negative, c__x____positive, a2x__a____source, b2y__b____source,
				b2y__y____target };
	}

	public static final void pattern_decdecass2branchbranchcmd_1_5_registerobjects_expressionBBBBBBBBBBB(
			decdecass2branchbranchcmd _this, PerformRuleResult ruleresult, EObject d, EObject c, EObject y, EObject a2x,
			EObject d2c, EObject x, EObject b, EObject a, EObject b2y) {
		_this.registerObjects_FWD(ruleresult, d, c, y, a2x, d2c, x, b, a, b2y);

	}

	public static final PerformRuleResult pattern_decdecass2branchbranchcmd_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_bindingFB(
			decdecass2branchbranchcmd _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_blackFBB(EClass eClass,
			decdecass2branchbranchcmd _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_bindingAndBlackFFB(
			decdecass2branchbranchcmd _this) {
		Object[] result_pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_binding = pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_black = pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decdecass2branchbranchcmd";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("d");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("a");
		EObject tmpD = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpA = _localVariable_2;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpA instanceof Decision) {
					Decision a = (Decision) tmpA;
					return new Object[] { d, b, a, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_2_2_corematch_blackBFFBBB(Decision d,
			Assignment b, Decision a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { d, c, d2c, b, a, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_2_3_findcontext_blackBBBBB(Decision d,
			Branch c, S2B d2c, Assignment b, Decision a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			if (a.equals(d.getPositive())) {
				if (d.equals(d2c.getSource())) {
					if (b.equals(d.getNegative())) {
						if (c.equals(d2c.getTarget())) {
							_result.add(new Object[] { d, c, d2c, b, a });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_3_findcontext_greenBBBBBFFFFF(Decision d, Branch c,
			S2B d2c, Assignment b, Decision a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d__a____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String d2c__c____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(a);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		return new Object[] { d, c, d2c, b, a, isApplicableMatch, d__a____positive, d2c__d____source, d__b____negative,
				d2c__c____target };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_4_solveCSP_bindingFBBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c,
			Assignment b, Decision a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, d, c, d2c, b, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c,
			Assignment b, Decision a) {
		Object[] result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_binding = pattern_decdecass2branchbranchcmd_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, d, c, d2c, b, a);
		if (result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_black = pattern_decdecass2branchbranchcmd_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, b, a };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_2_5_checkCSP_expressionFBB(
			decdecass2branchbranchcmd _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decdecass2branchbranchcmd";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decdecass2branchbranchcmd_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_1_initialbindings_blackBBBBB(
			decdecass2branchbranchcmd _this, Match match, Branch c, Command y, Branch x) {
		if (!c.equals(x)) {
			return new Object[] { _this, match, c, y, x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_2_SolveCSP_bindingFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Branch c, Command y, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, c, y, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, y, x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_2_SolveCSP_bindingAndBlackFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Branch c, Command y, Branch x) {
		Object[] result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_binding = pattern_decdecass2branchbranchcmd_10_2_SolveCSP_bindingFBBBBB(
				_this, match, c, y, x);
		if (result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_black = pattern_decdecass2branchbranchcmd_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, y, x };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_10_3_CheckCSP_expressionFBB(
			decdecass2branchbranchcmd _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Branch c, Command y, Branch x) {
		if (!c.equals(x)) {
			return new Object[] { match, c, y, x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Branch c, Command y, Branch x) {
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		return new Object[] { match, c, y, x, c__y____negative, c__x____positive };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_5_collectcontextelements_blackBBBB(Match match,
			Branch c, Command y, Branch x) {
		if (!c.equals(x)) {
			return new Object[] { match, c, y, x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_5_collectcontextelements_greenBB(Match match,
			Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decdecass2branchbranchcmd_10_6_registerobjectstomatch_expressionBBBBB(
			decdecass2branchbranchcmd _this, Match match, Branch c, Command y, Branch x) {
		_this.registerObjectsToMatch_BWD(match, c, y, x);

	}

	public static final boolean pattern_decdecass2branchbranchcmd_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("y");
		EObject _localVariable_3 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("x");
		EObject tmpD = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpD2c = _localVariable_3;
		EObject tmpX = _localVariable_4;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpD2c instanceof S2B) {
						S2B d2c = (S2B) tmpD2c;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							return new Object[] { d, c, y, d2c, x, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_1_performtransformation_blackBBBBBFBB(Decision d,
			Branch c, Command y, S2B d2c, Branch x, decdecass2branchbranchcmd _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(x)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { d, c, y, d2c, x, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding = pattern_decdecass2branchbranchcmd_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding != null) {
			Decision d = (Decision) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[0];
			Branch c = (Branch) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[1];
			Command y = (Command) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[2];
			S2B d2c = (S2B) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[3];
			Branch x = (Branch) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[4];

			Object[] result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_black = pattern_decdecass2branchbranchcmd_11_1_performtransformation_blackBBBBBFBB(
					d, c, y, d2c, x, _this, isApplicableMatch);
			if (result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_black[5];

				return new Object[] { d, c, y, d2c, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_1_performtransformation_greenBBFBFFF(Decision d,
			Command y, Branch x) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setTarget(x);
		d.setNegative(b);
		d.setPositive(a);
		a2x.setSource(a);
		b2y.setSource(b);
		b2y.setTarget(y);
		return new Object[] { d, y, a2x, x, b, a, b2y };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_2_collecttranslatedelements_blackBBBBBB(Command y,
			S2B a2x, Branch x, Assignment b, Decision a, S2N b2y) {
		return new Object[] { y, a2x, x, b, a, b2y };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_2_collecttranslatedelements_greenFBBBBBB(
			Command y, S2B a2x, Branch x, Assignment b, Decision a, S2N b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, y, a2x, x, b, a, b2y };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d, EObject c, EObject y, EObject a2x, EObject d2c, EObject x,
			EObject b, EObject a, EObject b2y) {
		if (!d.equals(y)) {
			if (!d.equals(d2c)) {
				if (!d.equals(x)) {
					if (!c.equals(d)) {
						if (!c.equals(y)) {
							if (!c.equals(d2c)) {
								if (!c.equals(x)) {
									if (!a2x.equals(d)) {
										if (!a2x.equals(c)) {
											if (!a2x.equals(y)) {
												if (!a2x.equals(d2c)) {
													if (!a2x.equals(x)) {
														if (!a2x.equals(b)) {
															if (!a2x.equals(b2y)) {
																if (!d2c.equals(y)) {
																	if (!d2c.equals(x)) {
																		if (!x.equals(y)) {
																			if (!b.equals(d)) {
																				if (!b.equals(c)) {
																					if (!b.equals(y)) {
																						if (!b.equals(d2c)) {
																							if (!b.equals(x)) {
																								if (!b.equals(b2y)) {
																									if (!a.equals(d)) {
																										if (!a.equals(
																												c)) {
																											if (!a.equals(
																													y)) {
																												if (!a.equals(
																														a2x)) {
																													if (!a.equals(
																															d2c)) {
																														if (!a.equals(
																																x)) {
																															if (!a.equals(
																																	b)) {
																																if (!a.equals(
																																		b2y)) {
																																	if (!b2y.equals(
																																			d)) {
																																		if (!b2y.equals(
																																				c)) {
																																			if (!b2y.equals(
																																					y)) {
																																				if (!b2y.equals(
																																						d2c)) {
																																					if (!b2y.equals(
																																							x)) {
																																						return new Object[] {
																																								ruleresult,
																																								d,
																																								c,
																																								y,
																																								a2x,
																																								d2c,
																																								x,
																																								b,
																																								a,
																																								b2y };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decdecass2branchbranchcmd_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject d, EObject c, EObject y, EObject a2x, EObject x, EObject b, EObject a,
			EObject b2y) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdecass2branchbranchcmd";
		String d__a____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String d__b____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		return new Object[] { ruleresult, d, c, y, a2x, x, b, a, b2y, d__a____positive, c__y____negative,
				a2x__x____target, d__b____negative, c__x____positive, a2x__a____source, b2y__b____source,
				b2y__y____target };
	}

	public static final void pattern_decdecass2branchbranchcmd_11_5_registerobjects_expressionBBBBBBBBBBB(
			decdecass2branchbranchcmd _this, PerformRuleResult ruleresult, EObject d, EObject c, EObject y, EObject a2x,
			EObject d2c, EObject x, EObject b, EObject a, EObject b2y) {
		_this.registerObjects_BWD(ruleresult, d, c, y, a2x, d2c, x, b, a, b2y);

	}

	public static final PerformRuleResult pattern_decdecass2branchbranchcmd_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_bindingFB(
			decdecass2branchbranchcmd _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_blackFBB(EClass eClass,
			decdecass2branchbranchcmd _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_bindingAndBlackFFB(
			decdecass2branchbranchcmd _this) {
		Object[] result_pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_binding = pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_black = pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decdecass2branchbranchcmd";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("y");
		EObject _localVariable_2 = match.getObject("x");
		EObject tmpC = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpX = _localVariable_2;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					return new Object[] { c, y, x, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_12_2_corematch_blackFBBFBB(Branch c,
			Command y, Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				Statement tmpD = d2c.getSource();
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					_result.add(new Object[] { d, c, y, d2c, x, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_12_3_findcontext_blackBBBBB(Decision d,
			Branch c, Command y, S2B d2c, Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (y.equals(c.getNegative())) {
				if (d.equals(d2c.getSource())) {
					if (c.equals(d2c.getTarget())) {
						if (x.equals(c.getPositive())) {
							_result.add(new Object[] { d, c, y, d2c, x });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_3_findcontext_greenBBBBBFFFFF(Decision d,
			Branch c, Command y, S2B d2c, Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__y____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		String d2c__c____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(x);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		c__y____negative.setName(c__y____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		return new Object[] { d, c, y, d2c, x, isApplicableMatch, c__y____negative, d2c__d____source, d2c__c____target,
				c__x____positive };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_4_solveCSP_bindingFBBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, Decision d, Branch c, Command y,
			S2B d2c, Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, d, c, y, d2c, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, c, y, d2c, x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, Decision d, Branch c, Command y,
			S2B d2c, Branch x) {
		Object[] result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_binding = pattern_decdecass2branchbranchcmd_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, d, c, y, d2c, x);
		if (result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_black = pattern_decdecass2branchbranchcmd_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, c, y, d2c, x };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_12_5_checkCSP_expressionFBB(
			decdecass2branchbranchcmd _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decdecass2branchbranchcmd";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decdecass2branchbranchcmd_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_bindingFB(
			decdecass2branchbranchcmd _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decdecass2branchbranchcmd _this) {
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

	public static final Object[] pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_bindingAndBlackFFBF(
			decdecass2branchbranchcmd _this) {
		Object[] result_pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_binding = pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_black = pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_953365 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_1BBB(Command y,
			Branch c, Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_912758 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_y_positive_912758)) {
					if (!x.equals(__DEC_y_positive_912758)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_2BBB(Command y,
			Branch c, Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_499764 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_y_negative_499764)) {
					if (!x.equals(__DEC_y_negative_499764)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_23708 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_4BB(Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_473501 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_473501)) {
					if (!c.equals(__DEC_x_positive_473501)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_5BB(Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_268079 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_268079)) {
					if (!c.equals(__DEC_x_negative_268079)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_6BB(Branch c,
			Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_7BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_8BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_9BB(Branch c,
			Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_negative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_negative.getSrc();
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			EObject tmpY = _edge_negative.getTrg();
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (y.equals(c.getNegative())) {
					Node tmpX = c.getPositive();
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (!c.equals(x)) {
							if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_0B(y) == null) {
								if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_6BB(c,
										y) == null) {
									if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_1BBB(y, c,
											x) == null) {
										if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_2BBB(
												y, c, x) == null) {
											if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_3B(
													x) == null) {
												if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_4BB(
														x, c) == null) {
													if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_5BB(
															x, c) == null) {
														if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_7BB(
																x, y) == null) {
															if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_8BB(
																	x, y) == null) {
																if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_9BB(
																		c, x) == null) {
																	_result.add(
																			new Object[] { c, y, x, _edge_negative });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decdecass2branchbranchcmd_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Branch c, Command y, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, c, y, x);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decdecass2branchbranchcmd _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decdecass2branchbranchcmd_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_bindingFB(
			decdecass2branchbranchcmd _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decdecass2branchbranchcmd _this) {
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

	public static final Object[] pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_bindingAndBlackFFBF(
			decdecass2branchbranchcmd _this) {
		Object[] result_pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_binding = pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_black = pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_0BBB(
			Assignment b, Decision d, Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_b_positive_307713 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!d.equals(__DEC_b_positive_307713)) {
					if (!a.equals(__DEC_b_positive_307713)) {
						return new Object[] { b, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_1B(
			Assignment b) {
		for (While __DEC_b_first_612703 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_2B(
			Assignment b) {
		for (While __DEC_b_last_472825 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_3B(
			Assignment b) {
		for (Program __DEC_b_first_870542 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_4BB(Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_53258 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_53258)) {
					if (!d.equals(__DEC_a_negative_53258)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_5B(Decision a) {
		for (While __DEC_a_first_889562 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_6B(Decision a) {
		for (While __DEC_a_last_59061 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_7B(Decision a) {
		for (Program __DEC_a_first_126567 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_8BB(Decision d,
			Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_9BB(Decision a,
			Assignment b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_10BB(Decision d,
			Decision a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpD = _edge_positive.getSrc();
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			EObject tmpA = _edge_positive.getTrg();
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (!a.equals(d)) {
					if (a.equals(d.getPositive())) {
						Statement tmpB = d.getNegative();
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_4BB(a,
									d) == null) {
								if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_5B(
										a) == null) {
									if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_6B(
											a) == null) {
										if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_7B(
												a) == null) {
											if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_10BB(
													d, a) == null) {
												if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_0BBB(
														b, d, a) == null) {
													if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_1B(
															b) == null) {
														if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_2B(
																b) == null) {
															if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_3B(
																	b) == null) {
																if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_8BB(
																		d, b) == null) {
																	if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_9BB(
																			a, b) == null) {
																		_result.add(new Object[] { d, b, a,
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

		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decdecass2branchbranchcmd_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Decision d, Assignment b, Decision a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, d, b, a);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decdecass2branchbranchcmd _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decdecass2branchbranchcmd_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_1_prepare_blackB(
			decdecass2branchbranchcmd _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("d");
		EObject _localVariable_1 = targetMatch.getObject("c");
		EObject _localVariable_2 = targetMatch.getObject("y");
		EObject _localVariable_3 = targetMatch.getObject("x");
		EObject _localVariable_4 = sourceMatch.getObject("b");
		EObject _localVariable_5 = sourceMatch.getObject("a");
		EObject tmpD = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpA = _localVariable_5;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (tmpA instanceof Decision) {
								Decision a = (Decision) tmpA;
								return new Object[] { d, c, y, x, b, a, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_blackBBBBBBBB(Decision d,
			Branch c, Command y, Branch x, Assignment b, Decision a, Match sourceMatch, Match targetMatch) {
		if (!c.equals(x)) {
			if (!a.equals(d)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { d, c, y, x, b, a, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding = pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding != null) {
			Decision d = (Decision) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[0];
			Branch c = (Branch) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[1];
			Command y = (Command) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[2];
			Branch x = (Branch) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[3];
			Assignment b = (Assignment) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[4];
			Decision a = (Decision) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_black = pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_blackBBBBBBBB(
					d, c, y, x, b, a, sourceMatch, targetMatch);
			if (result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { d, c, y, x, b, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_3_solvecsp_bindingFBBBBBBBBB(
			decdecass2branchbranchcmd _this, Decision d, Branch c, Command y, Branch x, Assignment b, Decision a,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(d, c, y, x, b, a, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, d, c, y, x, b, a, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			decdecass2branchbranchcmd _this, Decision d, Branch c, Command y, Branch x, Assignment b, Decision a,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_binding = pattern_decdecass2branchbranchcmd_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, d, c, y, x, b, a, sourceMatch, targetMatch);
		if (result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_black = pattern_decdecass2branchbranchcmd_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, d, c, y, x, b, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_24_5_matchcorrcontext_blackBBFBB(
			Decision d, Branch c, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				if (c.equals(d2c.getTarget())) {
					_result.add(new Object[] { d, c, d2c, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_5_matchcorrcontext_greenBBBF(S2B d2c,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "decdecass2branchbranchcmd";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_6_createcorrespondence_blackBBBBBBB(Decision d,
			Branch c, Command y, Branch x, Assignment b, Decision a, CCMatch ccMatch) {
		if (!c.equals(x)) {
			if (!a.equals(d)) {
				return new Object[] { d, c, y, x, b, a, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_6_createcorrespondence_greenBFBBBFB(Command y,
			Branch x, Assignment b, Decision a, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { y, a2x, x, b, a, b2y, ccMatch };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "decdecass2branchbranchcmd";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_decdecass2branchbranchcmd_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_0BBB(Assignment b,
			Decision d, Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_b_positive_272691 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!d.equals(__DEC_b_positive_272691)) {
					if (!a.equals(__DEC_b_positive_272691)) {
						return new Object[] { b, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_1B(Assignment b) {
		for (While __DEC_b_first_359038 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_2B(Assignment b) {
		for (While __DEC_b_last_869013 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_3B(Assignment b) {
		for (Program __DEC_b_first_269771 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_4BB(Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_100553 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_100553)) {
					if (!d.equals(__DEC_a_negative_100553)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_5B(Decision a) {
		for (While __DEC_a_first_323113 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_6B(Decision a) {
		for (While __DEC_a_last_898484 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_7B(Decision a) {
		for (Program __DEC_a_first_658058 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_8BB(Decision d,
			Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_9BB(Decision a,
			Assignment b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_10BB(Decision d,
			Decision a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_blackBBB(Decision d,
			Assignment b, Decision a) {
		if (!a.equals(d)) {
			if (a.equals(d.getPositive())) {
				if (b.equals(d.getNegative())) {
					if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_0BBB(b, d, a) == null) {
						if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_1B(b) == null) {
							if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_2B(b) == null) {
								if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_3B(b) == null) {
									if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_4BB(a,
											d) == null) {
										if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_5B(
												a) == null) {
											if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_6B(
													a) == null) {
												if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_7B(
														a) == null) {
													if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_8BB(
															d, b) == null) {
														if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_9BB(
																a, b) == null) {
															if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_10BB(
																	d, a) == null) {
																return new Object[] { d, b, a };
															}
														}
													}
												}
											}
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

	public static final boolean pattern_decdecass2branchbranchcmd_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_47457 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_1BBB(Command y,
			Branch c, Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_593881 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_y_positive_593881)) {
					if (!x.equals(__DEC_y_positive_593881)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_2BBB(Command y,
			Branch c, Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_754829 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_y_negative_754829)) {
					if (!x.equals(__DEC_y_negative_754829)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_372147 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_4BB(Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_294489 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_294489)) {
					if (!c.equals(__DEC_x_positive_294489)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_5BB(Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_447269 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_447269)) {
					if (!c.equals(__DEC_x_negative_447269)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_6BB(Branch c,
			Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_7BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_8BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_9BB(Branch c,
			Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_blackBBB(Branch c, Command y,
			Branch x) {
		if (!c.equals(x)) {
			if (y.equals(c.getNegative())) {
				if (x.equals(c.getPositive())) {
					if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_0B(y) == null) {
						if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_1BBB(y, c, x) == null) {
							if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_2BBB(y, c,
									x) == null) {
								if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_3B(x) == null) {
									if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_4BB(x,
											c) == null) {
										if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_5BB(x,
												c) == null) {
											if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_6BB(c,
													y) == null) {
												if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_7BB(
														x, y) == null) {
													if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_8BB(
															x, y) == null) {
														if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_9BB(
																c, x) == null) {
															return new Object[] { c, y, x };
														}
													}
												}
											}
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

	public static final boolean pattern_decdecass2branchbranchcmd_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_1_createresult_blackB(
			decdecass2branchbranchcmd _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_decdecass2branchbranchcmd_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									d2c) == null) {
								if (pattern_decdecass2branchbranchcmd_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										d) == null) {
									if (pattern_decdecass2branchbranchcmd_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, c) == null) {
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

	public static final Object[] pattern_decdecass2branchbranchcmd_29_3_solveCSP_bindingFBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d, c, d2c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_3_solveCSP_bindingAndBlackFBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_binding = pattern_decdecass2branchbranchcmd_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d, c, d2c, ruleResult);
		if (result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_black = pattern_decdecass2branchbranchcmd_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_29_4_checkCSP_expressionFBB(
			decdecass2branchbranchcmd _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_5_checknacs_blackBBB(Decision d, Branch c,
			S2B d2c) {
		return new Object[] { d, c, d2c };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_6_perform_blackBBBB(Decision d, Branch c, S2B d2c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d, c, d2c, ruleResult };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_6_perform_greenBBFFFFFFB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		ruleResult.getCorrObjects().add(a2x);
		a2x.setTarget(x);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		d.setPositive(a);
		a2x.setSource(a);
		ruleResult.getSourceObjects().add(a);
		b2y.setSource(b);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { d, c, y, a2x, x, b, a, b2y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decdecass2branchbranchcmd_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decdecass2branchbranchcmdImpl
