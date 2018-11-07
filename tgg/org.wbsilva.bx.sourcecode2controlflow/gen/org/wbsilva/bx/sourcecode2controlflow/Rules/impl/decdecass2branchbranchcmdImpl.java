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
	public boolean isAppropriate_FWD(Match match, Assignment b, Decision d, Decision a) {

		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_0_1_initialbindings_blackBBBBB(this, match, b, d, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, b, d, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_0_4_collectelementstobetranslated_blackBBBB(match, b, d, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
			}
			decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_0_4_collectelementstobetranslated_greenBBBBFF(match, b, d, a);
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_0_5_collectcontextelements_blackBBBB(match, b, d, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
			}
			decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_0_5_collectcontextelements_greenBB(match,
					d);

			// 
			decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_0_6_registerobjectstomatch_expressionBBBBB(this, match, b, d, a);
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
		S2B d2c = (S2B) result1_bindingAndBlack[0];
		Assignment b = (Assignment) result1_bindingAndBlack[1];
		Branch c = (Branch) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		Decision a = (Decision) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_1_1_performtransformation_greenBFFBFBF(b, c, a);
		Branch x = (Branch) result1_green[1];
		S2N b2y = (S2N) result1_green[2];
		S2B a2x = (S2B) result1_green[4];
		Command y = (Command) result1_green[6];

		Object[] result2_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_1_2_collecttranslatedelements_blackBBBBBB(b, x, b2y, a2x, a, y);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[b2y] = "
							+ b2y + ", " + "[a2x] = " + a2x + ", " + "[a] = " + a + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_1_2_collecttranslatedelements_greenFBBBBBB(b, x, b2y, a2x, a, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, d2c, b, x, b2y,
						c, d, a2x, a, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d2c] = " + d2c + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[b2y] = " + b2y
					+ ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[a2x] = " + a2x + ", " + "[a] = " + a + ", "
					+ "[y] = " + y + ".");
		}
		decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, b, x, b2y, c, d, a2x, a, y);
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[16];

		// 
		// 
		decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, d2c, b, x, b2y, c, d, a2x, a, y);
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
		Assignment b = (Assignment) result2_binding[0];
		Decision d = (Decision) result2_binding[1];
		Decision a = (Decision) result2_binding[2];
		for (Object[] result2_black : decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_2_2_corematch_blackFBFBBB(b, d, a, match)) {
			S2B d2c = (S2B) result2_black[0];
			Branch c = (Branch) result2_black[2];
			// ForEach 
			for (Object[] result3_black : decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_2_3_findcontext_blackBBBBB(d2c, b, c, d, a)) {
				Object[] result3_green = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_2_3_findcontext_greenBBBBBFFFFF(d2c, b, c, d, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								d2c, b, c, d, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[b] = "
							+ b + ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Assignment b, Decision d, Decision a) {
		match.registerObject("b", b);
		match.registerObject("d", d);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment b, Decision d, Decision a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, S2B d2c, Assignment b, Branch c,
			Decision d, Decision a) {// Create CSP
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
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject d2c, EObject b, EObject x, EObject b2y,
			EObject c, EObject d, EObject a2x, EObject a, EObject y) {
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("y", y);

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
	public boolean isAppropriate_BWD(Match match, Branch x, Branch c, Command y) {

		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_10_1_initialbindings_blackBBBBB(this, match, x, c, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, x, c, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_10_4_collectelementstobetranslated_blackBBBB(match, x, c, y);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
			}
			decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_10_4_collectelementstobetranslated_greenBBBBFF(match, x, c, y);
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_10_5_collectcontextelements_blackBBBB(match, x, c, y);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
			}
			decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_10_5_collectcontextelements_greenBB(match,
					c);

			// 
			decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, x, c, y);
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
		S2B d2c = (S2B) result1_bindingAndBlack[0];
		Branch x = (Branch) result1_bindingAndBlack[1];
		Branch c = (Branch) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		Command y = (Command) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_11_1_performtransformation_greenFBFBFFB(x, d, y);
		Assignment b = (Assignment) result1_green[0];
		S2N b2y = (S2N) result1_green[2];
		S2B a2x = (S2B) result1_green[4];
		Decision a = (Decision) result1_green[5];

		Object[] result2_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_11_2_collecttranslatedelements_blackBBBBBB(b, x, b2y, a2x, a, y);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[b2y] = "
							+ b2y + ", " + "[a2x] = " + a2x + ", " + "[a] = " + a + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_11_2_collecttranslatedelements_greenFBBBBBB(b, x, b2y, a2x, a, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, d2c, b, x, b2y,
						c, d, a2x, a, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d2c] = " + d2c + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[b2y] = " + b2y
					+ ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[a2x] = " + a2x + ", " + "[a] = " + a + ", "
					+ "[y] = " + y + ".");
		}
		decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, b, x, b2y, c, d, a2x, a, y);
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[16];

		// 
		// 
		decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, d2c, b, x, b2y, c, d, a2x, a, y);
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
		Branch x = (Branch) result2_binding[0];
		Branch c = (Branch) result2_binding[1];
		Command y = (Command) result2_binding[2];
		for (Object[] result2_black : decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_12_2_corematch_blackFBBFBB(x, c, y, match)) {
			S2B d2c = (S2B) result2_black[0];
			Decision d = (Decision) result2_black[3];
			// ForEach 
			for (Object[] result3_black : decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_12_3_findcontext_blackBBBBB(d2c, x, c, d, y)) {
				Object[] result3_green = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_12_3_findcontext_greenBBBBBFFFFF(d2c, x, c, d, y);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_12_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, d2c, x, c, d, y);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[x] = "
							+ x + ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[y] = " + y + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch x, Branch c, Command y) {
		match.registerObject("x", x);
		match.registerObject("c", c);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch x, Branch c, Command y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B d2c, Branch x, Branch c, Decision d,
			Command y) {// Create CSP
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
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject d2c, EObject b, EObject x, EObject b2y,
			EObject c, EObject d, EObject a2x, EObject a, EObject y) {
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("a", a);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_100(EMoflonEdge _edge_positive) {

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
				.pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_blackFFFB(_edge_positive)) {
			Branch x = (Branch) result2_black[0];
			Branch c = (Branch) result2_black[1];
			Command y = (Command) result2_black[2];
			Object[] result2_green = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, x, c, y)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_106(EMoflonEdge _edge_positive) {

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
			Assignment b = (Assignment) result2_black[0];
			Decision d = (Decision) result2_black[1];
			Decision a = (Decision) result2_black[2];
			Object[] result2_green = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, b, d, a)) {
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
		Assignment b = (Assignment) result2_bindingAndBlack[0];
		Branch x = (Branch) result2_bindingAndBlack[1];
		Branch c = (Branch) result2_bindingAndBlack[2];
		Decision d = (Decision) result2_bindingAndBlack[3];
		Decision a = (Decision) result2_bindingAndBlack[4];
		Command y = (Command) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, b, x, c, d, a, y,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[b] = " + b + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[a] = "
					+ a + ", " + "[y] = " + y + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_24_5_matchcorrcontext_blackFBBBB(c, d, sourceMatch,
							targetMatch)) {
				S2B d2c = (S2B) result5_black[0];
				Object[] result5_green = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_24_6_createcorrespondence_blackBBBBBBB(b, x, c, d, a, y,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b] = " + b + ", "
							+ "[x] = " + x + ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[a] = " + a + ", "
							+ "[y] = " + y + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_24_6_createcorrespondence_greenBBFFBBB(b, x, a, y, ccMatch);
				//nothing S2N b2y = (S2N) result6_green[2];
				//nothing S2B a2x = (S2B) result6_green[3];

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
	public CSP isApplicable_solveCsp_CC(Assignment b, Branch x, Branch c, Decision d, Decision a, Command y,
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
	public boolean checkDEC_FWD(Assignment b, Decision d, Decision a) {// 
		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_blackBBB(b, d, a);
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
	public boolean checkDEC_BWD(Branch x, Branch c, Command y) {// 
		Object[] result1_black = decdecass2branchbranchcmdImpl
				.pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_blackBBB(x, c, y);
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
			S2B d2c = (S2B) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = decdecass2branchbranchcmdImpl
					.pattern_decdecass2branchbranchcmd_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							d2c, c, d, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = decdecass2branchbranchcmdImpl
						.pattern_decdecass2branchbranchcmd_29_5_checknacs_blackBBB(d2c, c, d);
				if (result5_black != null) {

					Object[] result6_black = decdecass2branchbranchcmdImpl
							.pattern_decdecass2branchbranchcmd_29_6_perform_blackBBBB(d2c, c, d, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2c] = " + d2c + ", "
								+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decdecass2branchbranchcmdImpl.pattern_decdecass2branchbranchcmd_29_6_perform_greenFFFBBFFFB(c, d,
							ruleResult);
					//nothing Assignment b = (Assignment) result6_green[0];
					//nothing Branch x = (Branch) result6_green[1];
					//nothing S2N b2y = (S2N) result6_green[2];
					//nothing S2B a2x = (S2B) result6_green[5];
					//nothing Decision a = (Decision) result6_green[6];
					//nothing Command y = (Command) result6_green[7];

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
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_DECISION_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (Decision) arguments.get(3));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_DECISION_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (Decision) arguments.get(3));
			return null;
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_DECISION_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (Decision) arguments.get(3));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2B_ASSIGNMENT_BRANCH_DECISION_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Assignment) arguments.get(2), (Branch) arguments.get(3), (Decision) arguments.get(4),
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
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
			return null;
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_BRANCH_DECISION_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Decision) arguments.get(4),
					(Command) arguments.get(5));
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
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_BWD_EMOFLON_EDGE_100__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_100((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_106__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_106((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_BRANCH_BRANCH_DECISION_DECISION_COMMAND_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Decision) arguments.get(3), (Decision) arguments.get(4),
					(Command) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_DEC_FWD__ASSIGNMENT_DECISION_DECISION:
			return checkDEC_FWD((Assignment) arguments.get(0), (Decision) arguments.get(1),
					(Decision) arguments.get(2));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___CHECK_DEC_BWD__BRANCH_BRANCH_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (Decision) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_1_initialbindings_blackBBBBB(
			decdecass2branchbranchcmd _this, Match match, Assignment b, Decision d, Decision a) {
		if (!a.equals(d)) {
			return new Object[] { _this, match, b, d, a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_2_SolveCSP_bindingFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Assignment b, Decision d, Decision a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, d, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, d, a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_2_SolveCSP_bindingAndBlackFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Assignment b, Decision d, Decision a) {
		Object[] result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_binding = pattern_decdecass2branchbranchcmd_0_2_SolveCSP_bindingFBBBBB(
				_this, match, b, d, a);
		if (result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_black = pattern_decdecass2branchbranchcmd_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, d, a };
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
			Match match, Assignment b, Decision d, Decision a) {
		if (!a.equals(d)) {
			return new Object[] { match, b, d, a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Assignment b, Decision d, Decision a) {
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
		return new Object[] { match, b, d, a, d__a____positive, d__b____negative };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_5_collectcontextelements_blackBBBB(Match match,
			Assignment b, Decision d, Decision a) {
		if (!a.equals(d)) {
			return new Object[] { match, b, d, a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_0_5_collectcontextelements_greenBB(Match match,
			Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decdecass2branchbranchcmd_0_6_registerobjectstomatch_expressionBBBBB(
			decdecass2branchbranchcmd _this, Match match, Assignment b, Decision d, Decision a) {
		_this.registerObjectsToMatch_FWD(match, b, d, a);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("a");
		EObject tmpD2c = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpA = _localVariable_4;
		if (tmpD2c instanceof S2B) {
			S2B d2c = (S2B) tmpD2c;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpA instanceof Decision) {
							Decision a = (Decision) tmpA;
							return new Object[] { d2c, b, c, d, a, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_1_performtransformation_blackBBBBBFBB(S2B d2c,
			Assignment b, Branch c, Decision d, Decision a, decdecass2branchbranchcmd _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(d)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { d2c, b, c, d, a, csp, _this, isApplicableMatch };
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
			S2B d2c = (S2B) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[0];
			Assignment b = (Assignment) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[1];
			Branch c = (Branch) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[3];
			Decision a = (Decision) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_binding[4];

			Object[] result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_black = pattern_decdecass2branchbranchcmd_1_1_performtransformation_blackBBBBBFBB(
					d2c, b, c, d, a, _this, isApplicableMatch);
			if (result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_1_1_performtransformation_black[5];

				return new Object[] { d2c, b, c, d, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_1_performtransformation_greenBFFBFBF(Assignment b,
			Branch c, Decision a) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		c.setPositive(x);
		b2y.setSource(b);
		a2x.setTarget(x);
		a2x.setSource(a);
		b2y.setTarget(y);
		c.setNegative(y);
		return new Object[] { b, x, b2y, c, a2x, a, y };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_2_collecttranslatedelements_blackBBBBBB(
			Assignment b, Branch x, S2N b2y, S2B a2x, Decision a, Command y) {
		return new Object[] { b, x, b2y, a2x, a, y };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_2_collecttranslatedelements_greenFBBBBBB(
			Assignment b, Branch x, S2N b2y, S2B a2x, Decision a, Command y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(y);
		return new Object[] { ruleresult, b, x, b2y, a2x, a, y };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d2c, EObject b, EObject x, EObject b2y, EObject c, EObject d,
			EObject a2x, EObject a, EObject y) {
		if (!d2c.equals(x)) {
			if (!d2c.equals(y)) {
				if (!b.equals(d2c)) {
					if (!b.equals(x)) {
						if (!b.equals(b2y)) {
							if (!b.equals(c)) {
								if (!b.equals(d)) {
									if (!b.equals(y)) {
										if (!x.equals(y)) {
											if (!b2y.equals(d2c)) {
												if (!b2y.equals(x)) {
													if (!b2y.equals(c)) {
														if (!b2y.equals(d)) {
															if (!b2y.equals(y)) {
																if (!c.equals(d2c)) {
																	if (!c.equals(x)) {
																		if (!c.equals(d)) {
																			if (!c.equals(y)) {
																				if (!d.equals(d2c)) {
																					if (!d.equals(x)) {
																						if (!d.equals(y)) {
																							if (!a2x.equals(d2c)) {
																								if (!a2x.equals(b)) {
																									if (!a2x.equals(
																											x)) {
																										if (!a2x.equals(
																												b2y)) {
																											if (!a2x.equals(
																													c)) {
																												if (!a2x.equals(
																														d)) {
																													if (!a2x.equals(
																															y)) {
																														if (!a.equals(
																																d2c)) {
																															if (!a.equals(
																																	b)) {
																																if (!a.equals(
																																		x)) {
																																	if (!a.equals(
																																			b2y)) {
																																		if (!a.equals(
																																				c)) {
																																			if (!a.equals(
																																					d)) {
																																				if (!a.equals(
																																						a2x)) {
																																					if (!a.equals(
																																							y)) {
																																						return new Object[] {
																																								ruleresult,
																																								d2c,
																																								b,
																																								x,
																																								b2y,
																																								c,
																																								d,
																																								a2x,
																																								a,
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

	public static final Object[] pattern_decdecass2branchbranchcmd_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject b, EObject x, EObject b2y, EObject c, EObject d, EObject a2x,
			EObject a, EObject y) {
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdecass2branchbranchcmd";
		String b2y__b____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String c__y____negative_name_prime = "negative";
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { ruleresult, b, x, b2y, c, d, a2x, a, y, b2y__b____source, a2x__x____target,
				d__a____positive, b2y__y____target, a2x__a____source, c__x____positive, d__b____negative,
				c__y____negative };
	}

	public static final void pattern_decdecass2branchbranchcmd_1_5_registerobjects_expressionBBBBBBBBBBB(
			decdecass2branchbranchcmd _this, PerformRuleResult ruleresult, EObject d2c, EObject b, EObject x,
			EObject b2y, EObject c, EObject d, EObject a2x, EObject a, EObject y) {
		_this.registerObjects_FWD(ruleresult, d2c, b, x, b2y, c, d, a2x, a, y);

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
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("d");
		EObject _localVariable_2 = match.getObject("a");
		EObject tmpB = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpA = _localVariable_2;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (tmpA instanceof Decision) {
					Decision a = (Decision) tmpA;
					return new Object[] { b, d, a, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_2_2_corematch_blackFBFBBB(Assignment b,
			Decision d, Decision a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { d2c, b, c, d, a, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_2_3_findcontext_blackBBBBB(S2B d2c,
			Assignment b, Branch c, Decision d, Decision a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			if (c.equals(d2c.getTarget())) {
				if (d.equals(d2c.getSource())) {
					if (a.equals(d.getPositive())) {
						if (b.equals(d.getNegative())) {
							_result.add(new Object[] { d2c, b, c, d, a });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_3_findcontext_greenBBBBBFFFFF(S2B d2c,
			Assignment b, Branch c, Decision d, Decision a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(a);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { d2c, b, c, d, a, isApplicableMatch, d2c__c____target, d2c__d____source, d__a____positive,
				d__b____negative };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_4_solveCSP_bindingFBBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, S2B d2c, Assignment b, Branch c,
			Decision d, Decision a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, d2c, b, c, d, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, b, c, d, a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, S2B d2c, Assignment b, Branch c,
			Decision d, Decision a) {
		Object[] result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_binding = pattern_decdecass2branchbranchcmd_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, d2c, b, c, d, a);
		if (result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_black = pattern_decdecass2branchbranchcmd_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, b, c, d, a };
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
			decdecass2branchbranchcmd _this, Match match, Branch x, Branch c, Command y) {
		if (!c.equals(x)) {
			return new Object[] { _this, match, x, c, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_2_SolveCSP_bindingFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Branch x, Branch c, Command y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, c, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, c, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_2_SolveCSP_bindingAndBlackFBBBBB(
			decdecass2branchbranchcmd _this, Match match, Branch x, Branch c, Command y) {
		Object[] result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_binding = pattern_decdecass2branchbranchcmd_10_2_SolveCSP_bindingFBBBBB(
				_this, match, x, c, y);
		if (result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_black = pattern_decdecass2branchbranchcmd_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, c, y };
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
			Match match, Branch x, Branch c, Command y) {
		if (!c.equals(x)) {
			return new Object[] { match, x, c, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Branch x, Branch c, Command y) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { match, x, c, y, c__x____positive, c__y____negative };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_5_collectcontextelements_blackBBBB(Match match,
			Branch x, Branch c, Command y) {
		if (!c.equals(x)) {
			return new Object[] { match, x, c, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_10_5_collectcontextelements_greenBB(Match match,
			Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decdecass2branchbranchcmd_10_6_registerobjectstomatch_expressionBBBBB(
			decdecass2branchbranchcmd _this, Match match, Branch x, Branch c, Command y) {
		_this.registerObjectsToMatch_BWD(match, x, c, y);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("y");
		EObject tmpD2c = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpY = _localVariable_4;
		if (tmpD2c instanceof S2B) {
			S2B d2c = (S2B) tmpD2c;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpY instanceof Command) {
							Command y = (Command) tmpY;
							return new Object[] { d2c, x, c, d, y, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_1_performtransformation_blackBBBBBFBB(S2B d2c,
			Branch x, Branch c, Decision d, Command y, decdecass2branchbranchcmd _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(x)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { d2c, x, c, d, y, csp, _this, isApplicableMatch };
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
			S2B d2c = (S2B) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[0];
			Branch x = (Branch) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[1];
			Branch c = (Branch) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[3];
			Command y = (Command) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_binding[4];

			Object[] result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_black = pattern_decdecass2branchbranchcmd_11_1_performtransformation_blackBBBBBFBB(
					d2c, x, c, d, y, _this, isApplicableMatch);
			if (result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_11_1_performtransformation_black[5];

				return new Object[] { d2c, x, c, d, y, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_1_performtransformation_greenFBFBFFB(Branch x,
			Decision d, Command y) {
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		d.setNegative(b);
		b2y.setSource(b);
		b2y.setTarget(y);
		a2x.setTarget(x);
		d.setPositive(a);
		a2x.setSource(a);
		return new Object[] { b, x, b2y, d, a2x, a, y };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_2_collecttranslatedelements_blackBBBBBB(
			Assignment b, Branch x, S2N b2y, S2B a2x, Decision a, Command y) {
		return new Object[] { b, x, b2y, a2x, a, y };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_2_collecttranslatedelements_greenFBBBBBB(
			Assignment b, Branch x, S2N b2y, S2B a2x, Decision a, Command y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(y);
		return new Object[] { ruleresult, b, x, b2y, a2x, a, y };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d2c, EObject b, EObject x, EObject b2y, EObject c, EObject d,
			EObject a2x, EObject a, EObject y) {
		if (!d2c.equals(x)) {
			if (!d2c.equals(y)) {
				if (!b.equals(d2c)) {
					if (!b.equals(x)) {
						if (!b.equals(b2y)) {
							if (!b.equals(c)) {
								if (!b.equals(d)) {
									if (!b.equals(y)) {
										if (!x.equals(y)) {
											if (!b2y.equals(d2c)) {
												if (!b2y.equals(x)) {
													if (!b2y.equals(c)) {
														if (!b2y.equals(d)) {
															if (!b2y.equals(y)) {
																if (!c.equals(d2c)) {
																	if (!c.equals(x)) {
																		if (!c.equals(d)) {
																			if (!c.equals(y)) {
																				if (!d.equals(d2c)) {
																					if (!d.equals(x)) {
																						if (!d.equals(y)) {
																							if (!a2x.equals(d2c)) {
																								if (!a2x.equals(b)) {
																									if (!a2x.equals(
																											x)) {
																										if (!a2x.equals(
																												b2y)) {
																											if (!a2x.equals(
																													c)) {
																												if (!a2x.equals(
																														d)) {
																													if (!a2x.equals(
																															y)) {
																														if (!a.equals(
																																d2c)) {
																															if (!a.equals(
																																	b)) {
																																if (!a.equals(
																																		x)) {
																																	if (!a.equals(
																																			b2y)) {
																																		if (!a.equals(
																																				c)) {
																																			if (!a.equals(
																																					d)) {
																																				if (!a.equals(
																																						a2x)) {
																																					if (!a.equals(
																																							y)) {
																																						return new Object[] {
																																								ruleresult,
																																								d2c,
																																								b,
																																								x,
																																								b2y,
																																								c,
																																								d,
																																								a2x,
																																								a,
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

	public static final Object[] pattern_decdecass2branchbranchcmd_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject b, EObject x, EObject b2y, EObject c, EObject d, EObject a2x,
			EObject a, EObject y) {
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdecass2branchbranchcmd";
		String b2y__b____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String c__y____negative_name_prime = "negative";
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { ruleresult, b, x, b2y, c, d, a2x, a, y, b2y__b____source, a2x__x____target,
				d__a____positive, b2y__y____target, a2x__a____source, c__x____positive, d__b____negative,
				c__y____negative };
	}

	public static final void pattern_decdecass2branchbranchcmd_11_5_registerobjects_expressionBBBBBBBBBBB(
			decdecass2branchbranchcmd _this, PerformRuleResult ruleresult, EObject d2c, EObject b, EObject x,
			EObject b2y, EObject c, EObject d, EObject a2x, EObject a, EObject y) {
		_this.registerObjects_BWD(ruleresult, d2c, b, x, b2y, c, d, a2x, a, y);

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
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("y");
		EObject tmpX = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpY = _localVariable_2;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					return new Object[] { x, c, y, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_12_2_corematch_blackFBBFBB(Branch x,
			Branch c, Command y, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				Statement tmpD = d2c.getSource();
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					_result.add(new Object[] { d2c, x, c, d, y, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_12_3_findcontext_blackBBBBB(S2B d2c,
			Branch x, Branch c, Decision d, Command y) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (c.equals(d2c.getTarget())) {
				if (d.equals(d2c.getSource())) {
					if (x.equals(c.getPositive())) {
						if (y.equals(c.getNegative())) {
							_result.add(new Object[] { d2c, x, c, d, y });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_3_findcontext_greenBBBBBFFFFF(S2B d2c, Branch x,
			Branch c, Decision d, Command y) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(y);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { d2c, x, c, d, y, isApplicableMatch, d2c__c____target, d2c__d____source, c__x____positive,
				c__y____negative };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_4_solveCSP_bindingFBBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, S2B d2c, Branch x, Branch c,
			Decision d, Command y) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, d2c, x, c, d, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, x, c, d, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, S2B d2c, Branch x, Branch c,
			Decision d, Command y) {
		Object[] result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_binding = pattern_decdecass2branchbranchcmd_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, d2c, x, c, d, y);
		if (result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_black = pattern_decdecass2branchbranchcmd_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, x, c, d, y };
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

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_575696 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_1BB(Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_488077 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_488077)) {
					if (!c.equals(__DEC_x_positive_488077)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_2BB(Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_455814 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_455814)) {
					if (!c.equals(__DEC_x_negative_455814)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_741367 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_4BBB(Command y,
			Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_4846 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_y_positive_4846)) {
					if (!c.equals(__DEC_y_positive_4846)) {
						return new Object[] { y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_5BBB(Command y,
			Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_192202 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_y_negative_192202)) {
					if (!c.equals(__DEC_y_negative_192202)) {
						return new Object[] { y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_6BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_7BB(Branch c,
			Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
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

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_blackFFFB(
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
						if (tmpY instanceof Command) {
							Command y = (Command) tmpY;
							if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
								if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_1BB(x,
										c) == null) {
									if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_2BB(x,
											c) == null) {
										if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_3B(
												y) == null) {
											if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_4BBB(
													y, x, c) == null) {
												if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_5BBB(
														y, x, c) == null) {
													if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_6BB(
															x, y) == null) {
														if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_7BB(
																c, y) == null) {
															if (pattern_decdecass2branchbranchcmd_20_2_testcorematchandDECs_black_nac_8BB(
																	x, y) == null) {
																_result.add(new Object[] { x, c, y, _edge_positive });
															}
														}
													}
												}
											}
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
			decdecass2branchbranchcmd _this, Match match, Branch x, Branch c, Command y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, c, y);
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
			for (Decision __DEC_b_positive_175562 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!d.equals(__DEC_b_positive_175562)) {
					if (!a.equals(__DEC_b_positive_175562)) {
						return new Object[] { b, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_1B(
			Assignment b) {
		for (While __DEC_b_first_573933 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_2B(
			Assignment b) {
		for (While __DEC_b_last_68900 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_3B(
			Assignment b) {
		for (Program __DEC_b_first_981351 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_4BB(Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_677223 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_677223)) {
					if (!d.equals(__DEC_a_negative_677223)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_5B(Decision a) {
		for (While __DEC_a_first_966577 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_6B(Decision a) {
		for (While __DEC_a_last_626913 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_21_2_testcorematchandDECs_black_nac_7B(Decision a) {
		for (Program __DEC_a_first_742349 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
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
																		_result.add(new Object[] { b, d, a,
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
			decdecass2branchbranchcmd _this, Match match, Assignment b, Decision d, Decision a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, d, a);
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
		EObject _localVariable_0 = sourceMatch.getObject("b");
		EObject _localVariable_1 = targetMatch.getObject("x");
		EObject _localVariable_2 = targetMatch.getObject("c");
		EObject _localVariable_3 = sourceMatch.getObject("d");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject tmpB = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpY = _localVariable_5;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpA instanceof Decision) {
							Decision a = (Decision) tmpA;
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								return new Object[] { b, x, c, d, a, y, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_blackBBBBBBBB(Assignment b,
			Branch x, Branch c, Decision d, Decision a, Command y, Match sourceMatch, Match targetMatch) {
		if (!c.equals(x)) {
			if (!a.equals(d)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { b, x, c, d, a, y, sourceMatch, targetMatch };
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
			Assignment b = (Assignment) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[0];
			Branch x = (Branch) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[1];
			Branch c = (Branch) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[2];
			Decision d = (Decision) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[3];
			Decision a = (Decision) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[4];
			Command y = (Command) result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_black = pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_blackBBBBBBBB(
					b, x, c, d, a, y, sourceMatch, targetMatch);
			if (result_pattern_decdecass2branchbranchcmd_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { b, x, c, d, a, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_3_solvecsp_bindingFBBBBBBBBB(
			decdecass2branchbranchcmd _this, Assignment b, Branch x, Branch c, Decision d, Decision a, Command y,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(b, x, c, d, a, y, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, b, x, c, d, a, y, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			decdecass2branchbranchcmd _this, Assignment b, Branch x, Branch c, Decision d, Decision a, Command y,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_binding = pattern_decdecass2branchbranchcmd_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, b, x, c, d, a, y, sourceMatch, targetMatch);
		if (result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_black = pattern_decdecass2branchbranchcmd_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, b, x, c, d, a, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecass2branchbranchcmd_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecass2branchbranchcmd_24_5_matchcorrcontext_blackFBBBB(Branch c,
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

	public static final Object[] pattern_decdecass2branchbranchcmd_24_6_createcorrespondence_blackBBBBBBB(Assignment b,
			Branch x, Branch c, Decision d, Decision a, Command y, CCMatch ccMatch) {
		if (!c.equals(x)) {
			if (!a.equals(d)) {
				return new Object[] { b, x, c, d, a, y, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_24_6_createcorrespondence_greenBBFFBBB(Assignment b,
			Branch x, Decision a, Command y, CCMatch ccMatch) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { b, x, b2y, a2x, a, y, ccMatch };
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
			for (Decision __DEC_b_positive_770011 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!d.equals(__DEC_b_positive_770011)) {
					if (!a.equals(__DEC_b_positive_770011)) {
						return new Object[] { b, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_1B(Assignment b) {
		for (While __DEC_b_first_686395 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_2B(Assignment b) {
		for (While __DEC_b_last_112488 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_3B(Assignment b) {
		for (Program __DEC_b_first_375616 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_4BB(Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_23923 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_23923)) {
					if (!d.equals(__DEC_a_negative_23923)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_5B(Decision a) {
		for (While __DEC_a_first_518007 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_6B(Decision a) {
		for (While __DEC_a_last_741471 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_black_nac_7B(Decision a) {
		for (Program __DEC_a_first_203708 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
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

	public static final Object[] pattern_decdecass2branchbranchcmd_27_1_matchtggpattern_blackBBB(Assignment b,
			Decision d, Decision a) {
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
																return new Object[] { b, d, a };
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_974313 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_1BB(Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_200434 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_200434)) {
					if (!c.equals(__DEC_x_positive_200434)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_2BB(Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_38896 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_38896)) {
					if (!c.equals(__DEC_x_negative_38896)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_670169 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_4BBB(Command y,
			Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_627170 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_y_positive_627170)) {
					if (!c.equals(__DEC_y_positive_627170)) {
						return new Object[] { y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_5BBB(Command y,
			Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_163883 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_y_negative_163883)) {
					if (!c.equals(__DEC_y_negative_163883)) {
						return new Object[] { y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_6BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_7BB(Branch c,
			Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
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

	public static final Object[] pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_blackBBB(Branch x, Branch c,
			Command y) {
		if (!c.equals(x)) {
			if (x.equals(c.getPositive())) {
				if (y.equals(c.getNegative())) {
					if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_0B(x) == null) {
						if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_1BB(x, c) == null) {
							if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_2BB(x, c) == null) {
								if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_3B(y) == null) {
									if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_4BBB(y, x,
											c) == null) {
										if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_5BBB(y, x,
												c) == null) {
											if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_6BB(x,
													y) == null) {
												if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_7BB(
														c, y) == null) {
													if (pattern_decdecass2branchbranchcmd_28_1_matchtggpattern_black_nac_8BB(
															x, y) == null) {
														return new Object[] { x, c, y };
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
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
					Branch c = d2c.getTarget();
					if (c != null) {
						Statement tmpD = d2c.getSource();
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (pattern_decdecass2branchbranchcmd_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									d2c) == null) {
								if (pattern_decdecass2branchbranchcmd_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										c) == null) {
									if (pattern_decdecass2branchbranchcmd_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, d) == null) {
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

	public static final Object[] pattern_decdecass2branchbranchcmd_29_3_solveCSP_bindingFBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d2c, c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_3_solveCSP_bindingAndBlackFBBBBBB(
			decdecass2branchbranchcmd _this, IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_binding = pattern_decdecass2branchbranchcmd_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d2c, c, d, ruleResult);
		if (result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_binding[0];

			Object[] result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_black = pattern_decdecass2branchbranchcmd_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decdecass2branchbranchcmd_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
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

	public static final Object[] pattern_decdecass2branchbranchcmd_29_5_checknacs_blackBBB(S2B d2c, Branch c,
			Decision d) {
		return new Object[] { d2c, c, d };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_6_perform_blackBBBB(S2B d2c, Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d2c, c, d, ruleResult };
	}

	public static final Object[] pattern_decdecass2branchbranchcmd_29_6_perform_greenFFFBBFFFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		d.setPositive(a);
		a2x.setSource(a);
		ruleResult.getSourceObjects().add(a);
		b2y.setTarget(y);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { b, x, b2y, c, d, a2x, a, y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decdecass2branchbranchcmd_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decdecass2branchbranchcmdImpl
