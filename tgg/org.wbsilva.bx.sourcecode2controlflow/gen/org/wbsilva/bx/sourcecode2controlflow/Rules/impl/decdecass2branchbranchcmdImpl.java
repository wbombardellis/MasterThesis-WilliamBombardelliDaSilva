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
	public boolean isAppropriate_FWD(Match match, Decision a, Decision d, Assignment b) {

		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_0_1_initialbindings_blackBBBBB(this, match, a, d, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, a, d, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_0_4_collectelementstobetranslated_blackBBBB(match, a, d, b);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
			}
			decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_0_4_collectelementstobetranslated_greenBBBBFF(match, a, d, b);
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_0_5_collectcontextelements_blackBBBB(match, a, d, b);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
			}
			decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_0_5_collectcontextelements_greenBB(match,
					d);

			// 
			decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_0_6_registerobjectstomatch_expressionBBBBB(this, match, a, d, b);
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
		Decision a = (Decision) result1_bindingAndBlack[0];
		Decision d = (Decision) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		Branch c = (Branch) result1_bindingAndBlack[3];
		Assignment b = (Assignment) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_1_1_performtransformation_greenFFFBBFB(a, c, b);
		S2N b2y = (S2N) result1_green[0];
		S2B a2x = (S2B) result1_green[1];
		Command y = (Command) result1_green[2];
		Branch x = (Branch) result1_green[5];

		Object[] result2_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_1_2_collecttranslatedelements_blackBBBBBB(b2y, a2x, y, a, x, b);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", "
							+ "[y] = " + y + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_1_2_collecttranslatedelements_greenFBBBBBB(b2y, a2x, y, a, x, b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, b2y, a2x, y, a,
						d, d2c, c, x, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[a] = " + a
					+ ", " + "[d] = " + d + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[x] = " + x + ", "
					+ "[b] = " + b + ".");
		}
		decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, b2y, a2x, y, a, d, c, x, b);
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[16];

		// 
		// 
		decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, b2y, a2x, y, a, d, d2c, c, x, b);
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
		Decision a = (Decision) result2_binding[0];
		Decision d = (Decision) result2_binding[1];
		Assignment b = (Assignment) result2_binding[2];
		for (Object[] result2_black : decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_2_2_corematch_blackBBFFBB(a, d, b, match)) {
			S2B d2c = (S2B) result2_black[2];
			Branch c = (Branch) result2_black[3];
			// ForEach 
			for (Object[] result3_black : decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_2_3_findcontext_blackBBBBB(a, d, d2c, c, b)) {
				Object[] result3_green = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_2_3_findcontext_greenBBBBBFFFFF(a, d, d2c, c, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								a, d, d2c, c, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[d] = " + d
							+ ", " + "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[b] = " + b + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Decision a, Decision d, Assignment b) {
		match.registerObject("a", a);
		match.registerObject("d", d);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision a, Decision d, Assignment b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Decision a, Decision d, S2B d2c, Branch c,
			Assignment b) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject b2y, EObject a2x, EObject y, EObject a,
			EObject d, EObject d2c, EObject c, EObject x, EObject b) {
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command y, Branch c, Branch x) {

		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_10_1_initialbindings_blackBBBBB(this, match, y, c, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, y, c, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_10_4_collectelementstobetranslated_blackBBBB(match, y, c, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ".");
			}
			decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_10_4_collectelementstobetranslated_greenBBBBFF(match, y, c, x);
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_10_5_collectcontextelements_blackBBBB(match, y, c, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ".");
			}
			decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_10_5_collectcontextelements_greenBB(match,
					c);

			// 
			decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, y, c, x);
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
		Command y = (Command) result1_bindingAndBlack[0];
		Decision d = (Decision) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		Branch c = (Branch) result1_bindingAndBlack[3];
		Branch x = (Branch) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_11_1_performtransformation_greenFFBFBBF(y, d, x);
		S2N b2y = (S2N) result1_green[0];
		S2B a2x = (S2B) result1_green[1];
		Decision a = (Decision) result1_green[3];
		Assignment b = (Assignment) result1_green[6];

		Object[] result2_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_11_2_collecttranslatedelements_blackBBBBBB(b2y, a2x, y, a, x, b);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", "
							+ "[y] = " + y + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_11_2_collecttranslatedelements_greenFBBBBBB(b2y, a2x, y, a, x, b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, b2y, a2x, y, a,
						d, d2c, c, x, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[a] = " + a
					+ ", " + "[d] = " + d + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[x] = " + x + ", "
					+ "[b] = " + b + ".");
		}
		decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, b2y, a2x, y, a, d, c, x, b);
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[16];

		// 
		// 
		decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, b2y, a2x, y, a, d, d2c, c, x, b);
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
		Command y = (Command) result2_binding[0];
		Branch c = (Branch) result2_binding[1];
		Branch x = (Branch) result2_binding[2];
		for (Object[] result2_black : decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_12_2_corematch_blackBFFBBB(y, c, x, match)) {
			Decision d = (Decision) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_12_3_findcontext_blackBBBBB(y, d, d2c, c, x)) {
				Object[] result3_green = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_12_3_findcontext_greenBBBBBFFFFF(y, d, d2c, c, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_12_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, y, d, d2c, c, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[y] = " + y + ", " + "[d] = " + d
							+ ", " + "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[x] = " + x + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Command y, Branch c, Branch x) {
		match.registerObject("y", y);
		match.registerObject("c", c);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command y, Branch c, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command y, Decision d, S2B d2c, Branch c,
			Branch x) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject b2y, EObject a2x, EObject y, EObject a,
			EObject d, EObject d2c, EObject c, EObject x, EObject b) {
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_98(EMoflonEdge _edge_negative) {

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
			Command y = (Command) result2_black[0];
			Branch c = (Branch) result2_black[1];
			Branch x = (Branch) result2_black[2];
			Object[] result2_green = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, y, c, x)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_104(EMoflonEdge _edge_negative) {

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
				.pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_blackFFFB(_edge_negative)) {
			Decision a = (Decision) result2_black[0];
			Decision d = (Decision) result2_black[1];
			Assignment b = (Assignment) result2_black[2];
			Object[] result2_green = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, a, d, b)) {
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
		Command y = (Command) result2_bindingAndBlack[0];
		Decision a = (Decision) result2_bindingAndBlack[1];
		Decision d = (Decision) result2_bindingAndBlack[2];
		Branch c = (Branch) result2_bindingAndBlack[3];
		Branch x = (Branch) result2_bindingAndBlack[4];
		Assignment b = (Assignment) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, y, a, d, c, x, b,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[y] = " + y + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[x] = "
					+ x + ", " + "[b] = " + b + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_24_5_matchcorrcontext_blackBFBBB(d, c, sourceMatch,
							targetMatch)) {
				S2B d2c = (S2B) result5_black[1];
				Object[] result5_green = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_24_6_createcorrespondence_blackBBBBBBB(y, a, d, c, x, b,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", "
							+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[x] = " + x + ", "
							+ "[b] = " + b + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_24_6_createcorrespondence_greenFFBBBBB(y, a, x, b, ccMatch);
				//nothing S2N b2y = (S2N) result6_green[0];
				//nothing S2B a2x = (S2B) result6_green[1];

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
	public CSP isApplicable_solveCsp_CC(Command y, Decision a, Decision d, Branch c, Branch x, Assignment b,
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
	public boolean checkDEC_FWD(Decision a, Decision d, Assignment b) {// 
		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_blackBBB(a, d, b);
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
	public boolean checkDEC_BWD(Command y, Branch c, Branch x) {// 
		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_blackBBB(y, c, x);
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
							d2c, c, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[d2c] = " + d2c
						+ ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_29_5_checknacs_blackBBB(d, d2c, c);
				if (result5_black != null) {

					Object[] result6_black = decdecass2branchbranchcmdImpl
							.pattern_decdecass2branchbranchcmd_29_6_perform_blackBBBB(d, d2c, c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
								+ "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_29_6_perform_greenFFFFBBFFB(d, c,
							ruleResult);
					//nothing S2N b2y = (S2N) result6_green[0];
					//nothing S2B a2x = (S2B) result6_green[1];
					//nothing Command y = (Command) result6_green[2];
					//nothing Decision a = (Decision) result6_green[3];
					//nothing Branch x = (Branch) result6_green[6];
					//nothing Assignment b = (Assignment) result6_green[7];

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
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_FWD__MATCH_DECISION_DECISION_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (Decision) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_DECISION_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Decision) arguments.get(2), (Assignment) arguments.get(3));
			return null;
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_DECISION_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Decision) arguments.get(2), (Assignment) arguments.get(3));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DECISION_DECISION_S2B_BRANCH_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Decision) arguments.get(2), (S2B) arguments.get(3), (Branch) arguments.get(4),
					(Assignment) arguments.get(5));
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
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
			return null;
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_DECISION_S2B_BRANCH_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Decision) arguments.get(2), (S2B) arguments.get(3), (Branch) arguments.get(4),
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
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_BWD_EMOFLON_EDGE_98__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_98((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_104__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_104((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_SOLVE_CSP_CC__COMMAND_DECISION_DECISION_BRANCH_BRANCH_ASSIGNMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Command) arguments.get(0), (Decision) arguments.get(1),
					(Decision) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Assignment) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_DEC_FWD__DECISION_DECISION_ASSIGNMENT:
			return checkDEC_FWD((Decision) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_S2B_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_1_initialbindings_blackBBBBB(
			decdecass2branchbranchcmd _this, Match match, Decision a, Decision d, Assignment b) {
		if (!a.equals(d)) {
			return new Object[] { _this, match, a, d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_2_SolveCSP_bindingFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Decision a, Decision d, Assignment b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, d, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_2_SolveCSP_bindingAndBlackFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Decision a, Decision d, Assignment b) {
		Object[] result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_binding = pattern_decdecass2branchbranchcmd_0_2_SolveCSP_bindingFBBBBB(
				_this, match, a, d, b);
		if (result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_black = pattern_decdecass2branchbranchcmd_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, d, b };
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
			Match match, Decision a, Decision d, Assignment b) {
		if (!a.equals(d)) {
			return new Object[] { match, a, d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Decision a, Decision d, Assignment b) {
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { match, a, d, b, d__b____negative, d__a____positive };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_5_collectcontextelements_blackBBBB(Match match,
			Decision a, Decision d, Assignment b) {
		if (!a.equals(d)) {
			return new Object[] { match, a, d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_5_collectcontextelements_greenBB(Match match,
			Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decdecass2branchbranchcmd_0_6_registerobjectstomatch_expressionBBBBB(
			decdecass2branchbranchcmd _this, Match match, Decision a, Decision d, Assignment b) {
		_this.registerObjectsToMatch_FWD(match, a, d, b);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("a");
		EObject _localVariable_1 = isApplicableMatch.getObject("d");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("b");
		EObject tmpA = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpB = _localVariable_4;
		if (tmpA instanceof Decision) {
			Decision a = (Decision) tmpA;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							return new Object[] { a, d, d2c, c, b, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_1_performtransformation_blackBBBBBFBB(Decision a,
			Decision d, S2B d2c, Branch c, Assignment b, decdecass2branchbranchcmd _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(d)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { a, d, d2c, c, b, csp, _this, isApplicableMatch };
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
			Decision a = (Decision) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[0];
			Decision d = (Decision) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[2];
			Branch c = (Branch) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[3];
			Assignment b = (Assignment) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[4];

			Object[] result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_black = pattern_decdecass2branchbranchcmd_1_1_performtransformation_blackBBBBBFBB(
					a, d, d2c, c, b, _this, isApplicableMatch);
			if (result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_black[5];

				return new Object[] { a, d, d2c, c, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_1_performtransformation_greenFFFBBFB(Decision a,
			Branch c, Assignment b) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		b2y.setSource(b);
		a2x.setSource(a);
		b2y.setTarget(y);
		c.setNegative(y);
		c.setPositive(x);
		a2x.setTarget(x);
		return new Object[] { b2y, a2x, y, a, c, x, b };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_2_collecttranslatedelements_blackBBBBBB(S2N b2y,
			S2B a2x, Command y, Decision a, Branch x, Assignment b) {
		return new Object[] { b2y, a2x, y, a, x, b };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_2_collecttranslatedelements_greenFBBBBBB(S2N b2y,
			S2B a2x, Command y, Decision a, Branch x, Assignment b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(b);
		return new Object[] { ruleresult, b2y, a2x, y, a, x, b };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2y, EObject a2x, EObject y, EObject a, EObject d, EObject d2c,
			EObject c, EObject x, EObject b) {
		if (!b2y.equals(y)) {
			if (!b2y.equals(d)) {
				if (!b2y.equals(d2c)) {
					if (!b2y.equals(c)) {
						if (!b2y.equals(x)) {
							if (!a2x.equals(b2y)) {
								if (!a2x.equals(y)) {
									if (!a2x.equals(d)) {
										if (!a2x.equals(d2c)) {
											if (!a2x.equals(c)) {
												if (!a2x.equals(x)) {
													if (!a2x.equals(b)) {
														if (!a.equals(b2y)) {
															if (!a.equals(a2x)) {
																if (!a.equals(y)) {
																	if (!a.equals(d)) {
																		if (!a.equals(d2c)) {
																			if (!a.equals(c)) {
																				if (!a.equals(x)) {
																					if (!a.equals(b)) {
																						if (!d.equals(y)) {
																							if (!d.equals(d2c)) {
																								if (!d.equals(x)) {
																									if (!d2c.equals(
																											y)) {
																										if (!d2c.equals(
																												x)) {
																											if (!c.equals(
																													y)) {
																												if (!c.equals(
																														d)) {
																													if (!c.equals(
																															d2c)) {
																														if (!c.equals(
																																x)) {
																															if (!x.equals(
																																	y)) {
																																if (!b.equals(
																																		b2y)) {
																																	if (!b.equals(
																																			y)) {
																																		if (!b.equals(
																																				d)) {
																																			if (!b.equals(
																																					d2c)) {
																																				if (!b.equals(
																																						c)) {
																																					if (!b.equals(
																																							x)) {
																																						return new Object[] {
																																								ruleresult,
																																								b2y,
																																								a2x,
																																								y,
																																								a,
																																								d,
																																								d2c,
																																								c,
																																								x,
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
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject b2y, EObject a2x, EObject y, EObject a, EObject d, EObject c,
			EObject x, EObject b) {
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdecass2branchbranchcmd";
		String b2y__y____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String d__a____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, b2y, a2x, y, a, d, c, x, b, b2y__y____target, a2x__a____source,
				d__b____negative, c__y____negative, c__x____positive, d__a____positive, a2x__x____target,
				b2y__b____source };
	}

	public static final void pattern_decdecass2branchbranchcmd_1_5_registerobjects_expressionBBBBBBBBBBB(
			decdecass2branchbranchcmd _this, PerformRuleResult ruleresult, EObject b2y, EObject a2x, EObject y,
			EObject a, EObject d, EObject d2c, EObject c, EObject x, EObject b) {
		_this.registerObjects_FWD(ruleresult, b2y, a2x, y, a, d, d2c, c, x, b);

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
		EObject _localVariable_0 = match.getObject("a");
		EObject _localVariable_1 = match.getObject("d");
		EObject _localVariable_2 = match.getObject("b");
		EObject tmpA = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpB = _localVariable_2;
		if (tmpA instanceof Decision) {
			Decision a = (Decision) tmpA;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					return new Object[] { a, d, b, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_2_2_corematch_blackBBFFBB(Decision a,
			Decision d, Assignment b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { a, d, d2c, c, b, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_2_3_findcontext_blackBBBBB(Decision a,
			Decision d, S2B d2c, Branch c, Assignment b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			if (b.equals(d.getNegative())) {
				if (a.equals(d.getPositive())) {
					if (c.equals(d2c.getTarget())) {
						if (d.equals(d2c.getSource())) {
							_result.add(new Object[] { a, d, d2c, c, b });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_3_findcontext_greenBBBBBFFFFF(Decision a,
			Decision d, S2B d2c, Branch c, Assignment b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(b);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { a, d, d2c, c, b, isApplicableMatch, d__b____negative, d__a____positive, d2c__c____target,
				d2c__d____source };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_4_solveCSP_bindingFBBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, Decision a, Decision d, S2B d2c,
			Branch c, Assignment b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, a, d, d2c, c, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, d, d2c, c, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, Decision a, Decision d, S2B d2c,
			Branch c, Assignment b) {
		Object[] result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_binding = pattern_decdecass2branchbranchcmd_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, a, d, d2c, c, b);
		if (result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_black = pattern_decdecass2branchbranchcmd_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, d, d2c, c, b };
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
			decdecass2branchbranchcmd _this, Match match, Command y, Branch c, Branch x) {
		if (!c.equals(x)) {
			return new Object[] { _this, match, y, c, x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_2_SolveCSP_bindingFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Command y, Branch c, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, c, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, c, x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_2_SolveCSP_bindingAndBlackFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Command y, Branch c, Branch x) {
		Object[] result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_binding = pattern_decdecass2branchbranchcmd_10_2_SolveCSP_bindingFBBBBB(
				_this, match, y, c, x);
		if (result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_black = pattern_decdecass2branchbranchcmd_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, c, x };
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
			Match match, Command y, Branch c, Branch x) {
		if (!c.equals(x)) {
			return new Object[] { match, y, c, x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Command y, Branch c, Branch x) {
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
		return new Object[] { match, y, c, x, c__y____negative, c__x____positive };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_5_collectcontextelements_blackBBBB(Match match,
			Command y, Branch c, Branch x) {
		if (!c.equals(x)) {
			return new Object[] { match, y, c, x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_5_collectcontextelements_greenBB(Match match,
			Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decdecass2branchbranchcmd_10_6_registerobjectstomatch_expressionBBBBB(
			decdecass2branchbranchcmd _this, Match match, Command y, Branch c, Branch x) {
		_this.registerObjectsToMatch_BWD(match, y, c, x);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("y");
		EObject _localVariable_1 = isApplicableMatch.getObject("d");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("x");
		EObject tmpY = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpX = _localVariable_4;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							return new Object[] { y, d, d2c, c, x, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_1_performtransformation_blackBBBBBFBB(Command y,
			Decision d, S2B d2c, Branch c, Branch x, decdecass2branchbranchcmd _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(x)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { y, d, d2c, c, x, csp, _this, isApplicableMatch };
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
			Command y = (Command) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[0];
			Decision d = (Decision) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[2];
			Branch c = (Branch) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[3];
			Branch x = (Branch) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[4];

			Object[] result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_black = pattern_decdecass2branchbranchcmd_11_1_performtransformation_blackBBBBBFBB(
					y, d, d2c, c, x, _this, isApplicableMatch);
			if (result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_black[5];

				return new Object[] { y, d, d2c, c, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_1_performtransformation_greenFFBFBBF(Command y,
			Decision d, Branch x) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		b2y.setTarget(y);
		a2x.setTarget(x);
		a2x.setSource(a);
		d.setPositive(a);
		d.setNegative(b);
		b2y.setSource(b);
		return new Object[] { b2y, a2x, y, a, d, x, b };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_2_collecttranslatedelements_blackBBBBBB(S2N b2y,
			S2B a2x, Command y, Decision a, Branch x, Assignment b) {
		return new Object[] { b2y, a2x, y, a, x, b };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_2_collecttranslatedelements_greenFBBBBBB(S2N b2y,
			S2B a2x, Command y, Decision a, Branch x, Assignment b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(b);
		return new Object[] { ruleresult, b2y, a2x, y, a, x, b };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2y, EObject a2x, EObject y, EObject a, EObject d, EObject d2c,
			EObject c, EObject x, EObject b) {
		if (!b2y.equals(y)) {
			if (!b2y.equals(d)) {
				if (!b2y.equals(d2c)) {
					if (!b2y.equals(c)) {
						if (!b2y.equals(x)) {
							if (!a2x.equals(b2y)) {
								if (!a2x.equals(y)) {
									if (!a2x.equals(d)) {
										if (!a2x.equals(d2c)) {
											if (!a2x.equals(c)) {
												if (!a2x.equals(x)) {
													if (!a2x.equals(b)) {
														if (!a.equals(b2y)) {
															if (!a.equals(a2x)) {
																if (!a.equals(y)) {
																	if (!a.equals(d)) {
																		if (!a.equals(d2c)) {
																			if (!a.equals(c)) {
																				if (!a.equals(x)) {
																					if (!a.equals(b)) {
																						if (!d.equals(y)) {
																							if (!d.equals(d2c)) {
																								if (!d.equals(x)) {
																									if (!d2c.equals(
																											y)) {
																										if (!d2c.equals(
																												x)) {
																											if (!c.equals(
																													y)) {
																												if (!c.equals(
																														d)) {
																													if (!c.equals(
																															d2c)) {
																														if (!c.equals(
																																x)) {
																															if (!x.equals(
																																	y)) {
																																if (!b.equals(
																																		b2y)) {
																																	if (!b.equals(
																																			y)) {
																																		if (!b.equals(
																																				d)) {
																																			if (!b.equals(
																																					d2c)) {
																																				if (!b.equals(
																																						c)) {
																																					if (!b.equals(
																																							x)) {
																																						return new Object[] {
																																								ruleresult,
																																								b2y,
																																								a2x,
																																								y,
																																								a,
																																								d,
																																								d2c,
																																								c,
																																								x,
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
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject b2y, EObject a2x, EObject y, EObject a, EObject d, EObject c,
			EObject x, EObject b) {
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdecass2branchbranchcmd";
		String b2y__y____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String d__a____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, b2y, a2x, y, a, d, c, x, b, b2y__y____target, a2x__a____source,
				d__b____negative, c__y____negative, c__x____positive, d__a____positive, a2x__x____target,
				b2y__b____source };
	}

	public static final void pattern_decdecass2branchbranchcmd_11_5_registerobjects_expressionBBBBBBBBBBB(
			decdecass2branchbranchcmd _this, PerformRuleResult ruleresult, EObject b2y, EObject a2x, EObject y,
			EObject a, EObject d, EObject d2c, EObject c, EObject x, EObject b) {
		_this.registerObjects_BWD(ruleresult, b2y, a2x, y, a, d, d2c, c, x, b);

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
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("x");
		EObject tmpY = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpX = _localVariable_2;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					return new Object[] { y, c, x, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_12_2_corematch_blackBFFBBB(Command y,
			Branch c, Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				Statement tmpD = d2c.getSource();
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					_result.add(new Object[] { y, d, d2c, c, x, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_12_3_findcontext_blackBBBBB(Command y,
			Decision d, S2B d2c, Branch c, Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (y.equals(c.getNegative())) {
				if (x.equals(c.getPositive())) {
					if (c.equals(d2c.getTarget())) {
						if (d.equals(d2c.getSource())) {
							_result.add(new Object[] { y, d, d2c, c, x });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_3_findcontext_greenBBBBBFFFFF(Command y,
			Decision d, S2B d2c, Branch c, Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(x);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { y, d, d2c, c, x, isApplicableMatch, c__y____negative, c__x____positive, d2c__c____target,
				d2c__d____source };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_4_solveCSP_bindingFBBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, Command y, Decision d, S2B d2c,
			Branch c, Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, y, d, d2c, c, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, y, d, d2c, c, x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, Command y, Decision d, S2B d2c,
			Branch c, Branch x) {
		Object[] result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_binding = pattern_decdecass2branchbranchcmd_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, y, d, d2c, c, x);
		if (result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_black = pattern_decdecass2branchbranchcmd_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, y, d, d2c, c, x };
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
		for (Graph __DEC_y_root_69401 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_1BBB(Command y,
			Branch c, Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_672001 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_y_positive_672001)) {
					if (!x.equals(__DEC_y_positive_672001)) {
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
			for (Branch __DEC_y_negative_364913 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_y_negative_364913)) {
					if (!x.equals(__DEC_y_negative_364913)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_194969 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_4BB(Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_408495 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_408495)) {
					if (!c.equals(__DEC_x_positive_408495)) {
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
			for (Branch __DEC_x_negative_965189 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_965189)) {
					if (!c.equals(__DEC_x_negative_965189)) {
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
																			new Object[] { y, c, x, _edge_negative });
																}
															}
														}
													}
												}
											}
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
			decdecass2branchbranchcmd _this, Match match, Command y, Branch c, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, c, x);
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

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_0BB(Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_848502 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_848502)) {
					if (!d.equals(__DEC_a_negative_848502)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_1B(Decision a) {
		for (While __DEC_a_first_70291 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_2B(Decision a) {
		for (While __DEC_a_last_301318 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_3B(Decision a) {
		for (Program __DEC_a_first_995268 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_4BBB(
			Assignment b, Decision a, Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_b_positive_955636 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!a.equals(__DEC_b_positive_955636)) {
					if (!d.equals(__DEC_b_positive_955636)) {
						return new Object[] { b, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_5B(
			Assignment b) {
		for (While __DEC_b_first_893275 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_6B(
			Assignment b) {
		for (While __DEC_b_last_989525 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_7B(
			Assignment b) {
		for (Program __DEC_b_first_802756 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_8BB(Decision a,
			Assignment b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_9BB(Decision d,
			Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_negative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpD = _edge_negative.getSrc();
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			EObject tmpB = _edge_negative.getTrg();
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (b.equals(d.getNegative())) {
					Statement tmpA = d.getPositive();
					if (tmpA instanceof Decision) {
						Decision a = (Decision) tmpA;
						if (!a.equals(d)) {
							if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_5B(b) == null) {
								if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_6B(
										b) == null) {
									if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_7B(
											b) == null) {
										if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_9BB(d,
												b) == null) {
											if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_0BB(
													a, d) == null) {
												if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_1B(
														a) == null) {
													if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_2B(
															a) == null) {
														if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_3B(
																a) == null) {
															if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_4BBB(
																	b, a, d) == null) {
																if (pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_8BB(
																		a, b) == null) {
																	_result.add(
																			new Object[] { a, d, b, _edge_negative });
																}
															}
														}
													}
												}
											}
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
			decdecass2branchbranchcmd _this, Match match, Decision a, Decision d, Assignment b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, d, b);
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
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("y");
		EObject _localVariable_1 = sourceMatch.getObject("a");
		EObject _localVariable_2 = sourceMatch.getObject("d");
		EObject _localVariable_3 = targetMatch.getObject("c");
		EObject _localVariable_4 = targetMatch.getObject("x");
		EObject _localVariable_5 = sourceMatch.getObject("b");
		EObject tmpY = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpB = _localVariable_5;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								return new Object[] { y, a, d, c, x, b, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_blackBBBBBBBB(Command y,
			Decision a, Decision d, Branch c, Branch x, Assignment b, Match sourceMatch, Match targetMatch) {
		if (!a.equals(d)) {
			if (!c.equals(x)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { y, a, d, c, x, b, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding = pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding != null) {
			Command y = (Command) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[0];
			Decision a = (Decision) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[1];
			Decision d = (Decision) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[2];
			Branch c = (Branch) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[3];
			Branch x = (Branch) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[4];
			Assignment b = (Assignment) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_black = pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_blackBBBBBBBB(
					y, a, d, c, x, b, sourceMatch, targetMatch);
			if (result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { y, a, d, c, x, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_3_solvecsp_bindingFBBBBBBBBB(
			decdecass2branchbranchcmd _this, Command y, Decision a, Decision d, Branch c, Branch x, Assignment b,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(y, a, d, c, x, b, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, y, a, d, c, x, b, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			decdecass2branchbranchcmd _this, Command y, Decision a, Decision d, Branch c, Branch x, Assignment b,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_binding = pattern_decdecass2branchbranchcmd_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, y, a, d, c, x, b, sourceMatch, targetMatch);
		if (result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_black = pattern_decdecass2branchbranchcmd_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, y, a, d, c, x, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_24_5_matchcorrcontext_blackBFBBB(
			Decision d, Branch c, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				if (d.equals(d2c.getSource())) {
					_result.add(new Object[] { d, d2c, c, sourceMatch, targetMatch });
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

	public static final Object[] pattern_decdecass2branchbranchcmd_24_6_createcorrespondence_blackBBBBBBB(Command y,
			Decision a, Decision d, Branch c, Branch x, Assignment b, CCMatch ccMatch) {
		if (!a.equals(d)) {
			if (!c.equals(x)) {
				return new Object[] { y, a, d, c, x, b, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_6_createcorrespondence_greenFFBBBBB(Command y,
			Decision a, Branch x, Assignment b, CCMatch ccMatch) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { b2y, a2x, y, a, x, b, ccMatch };
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

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_0BB(Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_854059 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_854059)) {
					if (!d.equals(__DEC_a_negative_854059)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_1B(Decision a) {
		for (While __DEC_a_first_561769 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_2B(Decision a) {
		for (While __DEC_a_last_435517 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_3B(Decision a) {
		for (Program __DEC_a_first_754315 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_4BBB(Assignment b,
			Decision a, Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_b_positive_765607 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!a.equals(__DEC_b_positive_765607)) {
					if (!d.equals(__DEC_b_positive_765607)) {
						return new Object[] { b, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_5B(Assignment b) {
		for (While __DEC_b_first_427915 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_6B(Assignment b) {
		for (While __DEC_b_last_23569 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_235304 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_8BB(Decision a,
			Assignment b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_9BB(Decision d,
			Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_blackBBB(Decision a, Decision d,
			Assignment b) {
		if (!a.equals(d)) {
			if (b.equals(d.getNegative())) {
				if (a.equals(d.getPositive())) {
					if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_0BB(a, d) == null) {
						if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_1B(a) == null) {
							if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_2B(a) == null) {
								if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_3B(a) == null) {
									if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_4BBB(b, a,
											d) == null) {
										if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_5B(
												b) == null) {
											if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_6B(
													b) == null) {
												if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_7B(
														b) == null) {
													if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_8BB(
															a, b) == null) {
														if (pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_9BB(
																d, b) == null) {
															return new Object[] { a, d, b };
														}
													}
												}
											}
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
		for (Graph __DEC_y_root_476916 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_1BBB(Command y,
			Branch c, Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_404318 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_y_positive_404318)) {
					if (!x.equals(__DEC_y_positive_404318)) {
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
			for (Branch __DEC_y_negative_44721 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_y_negative_44721)) {
					if (!x.equals(__DEC_y_negative_44721)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_155927 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_4BB(Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_857381 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_857381)) {
					if (!c.equals(__DEC_x_positive_857381)) {
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
			for (Branch __DEC_x_negative_596979 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_596979)) {
					if (!c.equals(__DEC_x_negative_596979)) {
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

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_blackBBB(Command y, Branch c,
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
															return new Object[] { y, c, x };
														}
													}
												}
											}
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
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, Decision d, S2B d2c, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d, d2c, c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, d2c, c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_3_solveCSP_bindingAndBlackFBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, Decision d, S2B d2c, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_binding = pattern_decdecass2branchbranchcmd_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d, d2c, c, ruleResult);
		if (result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_black = pattern_decdecass2branchbranchcmd_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, d2c, c, ruleResult };
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

	public static final Object[] pattern_decdecass2branchbranchcmd_29_5_checknacs_blackBBB(Decision d, S2B d2c,
			Branch c) {
		return new Object[] { d, d2c, c };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_6_perform_blackBBBB(Decision d, S2B d2c, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d, d2c, c, ruleResult };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_6_perform_greenFFFFBBFFB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(b2y);
		ruleResult.getCorrObjects().add(a2x);
		b2y.setTarget(y);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		a2x.setSource(a);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		c.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		d.setNegative(b);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { b2y, a2x, y, a, d, c, x, b, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decdecass2branchbranchcmd_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decdecass2branchbranchcmdImpl
