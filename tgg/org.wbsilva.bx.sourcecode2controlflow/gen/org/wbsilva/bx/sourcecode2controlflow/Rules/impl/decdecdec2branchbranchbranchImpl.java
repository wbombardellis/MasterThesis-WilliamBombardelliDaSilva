/**
 */
package org.wbsilva.bx.sourcecode2controlflow.Rules.impl;

import controlflow.Branch;
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
import org.wbsilva.bx.sourcecode2controlflow.Rules.decdecdec2branchbranchbranch;

import org.wbsilva.bx.sourcecode2controlflow.S2B;
import org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowFactory;

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
 * An implementation of the model object '<em><b>decdecdec2branchbranchbranch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class decdecdec2branchbranchbranchImpl extends AbstractRuleImpl implements decdecdec2branchbranchbranch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decdecdec2branchbranchbranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdecdecdec2branchbranchbranch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Decision b, Decision a, Decision d) {

		Object[] result1_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_0_1_initialbindings_blackBBBBB(this, match, b, a, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, b, a, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_0_4_collectelementstobetranslated_blackBBBB(match, b, a, d);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
			}
			decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_0_4_collectelementstobetranslated_greenBBBBFF(match, b, a, d);
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_0_5_collectcontextelements_blackBBBB(match, b, a, d);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
			}
			decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_0_5_collectcontextelements_greenBB(match, d);

			// 
			decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_0_6_registerobjectstomatch_expressionBBBBB(this, match, b, a,
							d);
			return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_0_7_expressionF();
		} else {
			return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2B d2c = (S2B) result1_bindingAndBlack[0];
		Decision b = (Decision) result1_bindingAndBlack[1];
		Branch c = (Branch) result1_bindingAndBlack[2];
		Decision a = (Decision) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_1_1_performtransformation_greenFFFFBBB(b, c, a);
		Branch x = (Branch) result1_green[0];
		S2B a2x = (S2B) result1_green[1];
		S2B b2y = (S2B) result1_green[2];
		Branch y = (Branch) result1_green[3];

		Object[] result2_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_1_2_collecttranslatedelements_blackBBBBBB(x, a2x, b2y, y, b, a);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[a2x] = " + a2x + ", "
							+ "[b2y] = " + b2y + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_1_2_collecttranslatedelements_greenFBBBBBB(x, a2x, b2y, y, b, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, x, d2c, a2x,
						b2y, y, b, c, a, d);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[x] = " + x + ", " + "[d2c] = " + d2c + ", " + "[a2x] = " + a2x + ", " + "[b2y] = " + b2y
					+ ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
					+ "[d] = " + d + ".");
		}
		decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, x, a2x,
						b2y, y, b, c, a, d);
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[16];

		// 
		// 
		decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_1_5_registerobjects_expressionBBBBBBBBBBB(
				this, ruleresult, x, d2c, a2x, b2y, y, b, c, a, d);
		return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Decision b = (Decision) result2_binding[0];
		Decision a = (Decision) result2_binding[1];
		Decision d = (Decision) result2_binding[2];
		for (Object[] result2_black : decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_2_2_corematch_blackFBFBBB(b, a, d, match)) {
			S2B d2c = (S2B) result2_black[0];
			Branch c = (Branch) result2_black[2];
			// ForEach 
			for (Object[] result3_black : decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_2_3_findcontext_blackBBBBB(d2c, b, c, a, d)) {
				Object[] result3_green = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_2_3_findcontext_greenBBBBBFFFFF(d2c, b, c, a, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, d2c, b, c, a, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[b] = "
							+ b + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decdecdec2branchbranchbranchImpl
							.pattern_decdecdec2branchbranchbranch_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decdecdec2branchbranchbranchImpl
							.pattern_decdecdec2branchbranchbranch_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Decision b, Decision a, Decision d) {
		match.registerObject("b", b);
		match.registerObject("a", a);
		match.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision b, Decision a, Decision d) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, S2B d2c, Decision b, Branch c, Decision a,
			Decision d) {// Create CSP
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject x, EObject d2c, EObject a2x, EObject b2y,
			EObject y, EObject b, EObject c, EObject a, EObject d) {
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch x, Branch y, Branch c) {

		Object[] result1_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_10_1_initialbindings_blackBBBBB(this, match, x, y, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, x, y, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_10_4_collectelementstobetranslated_blackBBBB(match, x, y, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[c] = " + c + ".");
			}
			decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_10_4_collectelementstobetranslated_greenBBBBFF(match, x, y,
							c);
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_10_5_collectcontextelements_blackBBBB(match, x, y, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[c] = " + c + ".");
			}
			decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_10_5_collectcontextelements_greenBB(match, c);

			// 
			decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_10_6_registerobjectstomatch_expressionBBBBB(this, match, x, y,
							c);
			return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_10_7_expressionF();
		} else {
			return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch x = (Branch) result1_bindingAndBlack[0];
		S2B d2c = (S2B) result1_bindingAndBlack[1];
		Branch y = (Branch) result1_bindingAndBlack[2];
		Branch c = (Branch) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_11_1_performtransformation_greenBFFBFFB(x, y, d);
		S2B a2x = (S2B) result1_green[1];
		S2B b2y = (S2B) result1_green[2];
		Decision b = (Decision) result1_green[4];
		Decision a = (Decision) result1_green[5];

		Object[] result2_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_11_2_collecttranslatedelements_blackBBBBBB(x, a2x, b2y, y, b, a);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[a2x] = " + a2x + ", "
							+ "[b2y] = " + b2y + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_11_2_collecttranslatedelements_greenFBBBBBB(x, a2x, b2y, y, b, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, x, d2c, a2x,
						b2y, y, b, c, a, d);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[x] = " + x + ", " + "[d2c] = " + d2c + ", " + "[a2x] = " + a2x + ", " + "[b2y] = " + b2y
					+ ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
					+ "[d] = " + d + ".");
		}
		decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, x,
						a2x, b2y, y, b, c, a, d);
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[16];

		// 
		// 
		decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, x,
						d2c, a2x, b2y, y, b, c, a, d);
		return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch x = (Branch) result2_binding[0];
		Branch y = (Branch) result2_binding[1];
		Branch c = (Branch) result2_binding[2];
		for (Object[] result2_black : decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_12_2_corematch_blackBFBBFB(x, y, c, match)) {
			S2B d2c = (S2B) result2_black[1];
			Decision d = (Decision) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_12_3_findcontext_blackBBBBB(x, d2c, y, c, d)) {
				Object[] result3_green = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_12_3_findcontext_greenBBBBBFFFFF(x, d2c, y, c, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, x, d2c, y, c, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[x] = " + x + ", " + "[d2c] = "
							+ d2c + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[d] = " + d + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decdecdec2branchbranchbranchImpl
							.pattern_decdecdec2branchbranchbranch_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decdecdec2branchbranchbranchImpl
							.pattern_decdecdec2branchbranchbranch_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch x, Branch y, Branch c) {
		match.registerObject("x", x);
		match.registerObject("y", y);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch x, Branch y, Branch c) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch x, S2B d2c, Branch y, Branch c,
			Decision d) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject x, EObject d2c, EObject a2x, EObject b2y,
			EObject y, EObject b, EObject c, EObject a, EObject d) {
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_7(EMoflonEdge _edge_negative) {

		Object[] result1_bindingAndBlack = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_blackFFFB(_edge_negative)) {
			Branch x = (Branch) result2_black[0];
			Branch y = (Branch) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Object[] result2_green = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, x, y, c)) {
				// 
				if (decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = decdecdec2branchbranchbranchImpl
							.pattern_decdecdec2branchbranchbranch_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decdecdec2branchbranchbranchImpl
							.pattern_decdecdec2branchbranchbranch_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_7(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_blackFFFB(_edge_positive)) {
			Decision b = (Decision) result2_black[0];
			Decision a = (Decision) result2_black[1];
			Decision d = (Decision) result2_black[2];
			Object[] result2_green = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, b, a, d)) {
				// 
				if (decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = decdecdec2branchbranchbranchImpl
							.pattern_decdecdec2branchbranchbranch_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decdecdec2branchbranchbranchImpl
							.pattern_decdecdec2branchbranchbranch_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("decdecdec2branchbranchbranch");
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
		ruleResult.setRule("decdecdec2branchbranchbranch");
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

		Object[] result1_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Branch x = (Branch) result2_bindingAndBlack[0];
		Branch y = (Branch) result2_bindingAndBlack[1];
		Decision b = (Decision) result2_bindingAndBlack[2];
		Branch c = (Branch) result2_bindingAndBlack[3];
		Decision a = (Decision) result2_bindingAndBlack[4];
		Decision d = (Decision) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, x, y, b, c, a, d,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[a] = "
					+ a + ", " + "[d] = " + d + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_24_5_matchcorrcontext_blackFBBBB(c, d, sourceMatch,
							targetMatch)) {
				S2B d2c = (S2B) result5_black[0];
				Object[] result5_green = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_24_6_createcorrespondence_blackBBBBBBB(x, y, b, c, a, d,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", "
							+ "[y] = " + y + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
							+ "[d] = " + d + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_24_6_createcorrespondence_greenBFFBBBB(x, y, b, a,
								ccMatch);
				//nothing S2B a2x = (S2B) result6_green[1];
				//nothing S2B b2y = (S2B) result6_green[2];

				Object[] result7_black = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Branch x, Branch y, Decision b, Branch c, Decision a, Decision d,
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
	public boolean checkDEC_FWD(Decision b, Decision a, Decision d) {// 
		Object[] result1_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_blackBBB(b, a, d);
		if (result1_black != null) {
			return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_27_2_expressionF();
		} else {
			return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch x, Branch y, Branch c) {// 
		Object[] result1_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_blackBBB(x, y, c);
		if (result1_black != null) {
			return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_28_2_expressionF();
		} else {
			return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			S2B d2c = (S2B) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							d2c, c, d, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_29_5_checknacs_blackBBB(d2c, c, d);
				if (result5_black != null) {

					Object[] result6_black = decdecdec2branchbranchbranchImpl
							.pattern_decdecdec2branchbranchbranch_29_6_perform_blackBBBB(d2c, c, d, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2c] = " + d2c + ", "
								+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_29_6_perform_greenFFFFFBFBB(c,
							d, ruleResult);
					//nothing Branch x = (Branch) result6_green[0];
					//nothing S2B a2x = (S2B) result6_green[1];
					//nothing S2B b2y = (S2B) result6_green[2];
					//nothing Branch y = (Branch) result6_green[3];
					//nothing Decision b = (Decision) result6_green[4];
					//nothing Decision a = (Decision) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_29_7_expressionFB(ruleResult);
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
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPROPRIATE_FWD__MATCH_DECISION_DECISION_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (Decision) arguments.get(2),
					(Decision) arguments.get(3));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_DECISION_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Decision) arguments.get(2), (Decision) arguments.get(3));
			return null;
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_DECISION_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Decision) arguments.get(2), (Decision) arguments.get(3));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2B_DECISION_BRANCH_DECISION_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Decision) arguments.get(2), (Branch) arguments.get(3), (Decision) arguments.get(4),
					(Decision) arguments.get(5));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
			return null;
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_BRANCH_BRANCH_DECISION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Decision) arguments.get(5));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_7((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_7((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_BRANCH_DECISION_BRANCH_DECISION_DECISION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Branch) arguments.get(1),
					(Decision) arguments.get(2), (Branch) arguments.get(3), (Decision) arguments.get(4),
					(Decision) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___CHECK_DEC_FWD__DECISION_DECISION_DECISION:
			return checkDEC_FWD((Decision) arguments.get(0), (Decision) arguments.get(1), (Decision) arguments.get(2));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___CHECK_DEC_BWD__BRANCH_BRANCH_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (Decision) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_1_initialbindings_blackBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Decision b, Decision a, Decision d) {
		if (!b.equals(d)) {
			if (!a.equals(b)) {
				if (!a.equals(d)) {
					return new Object[] { _this, match, b, a, d };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_bindingFBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Decision b, Decision a, Decision d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, a, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, a, d };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_bindingAndBlackFBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Decision b, Decision a, Decision d) {
		Object[] result_pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_binding = pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_bindingFBBBBB(
				_this, match, b, a, d);
		if (result_pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_black = pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, a, d };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecdec2branchbranchbranch_0_3_CheckCSP_expressionFBB(
			decdecdec2branchbranchbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_4_collectelementstobetranslated_blackBBBB(
			Match match, Decision b, Decision a, Decision d) {
		if (!b.equals(d)) {
			if (!a.equals(b)) {
				if (!a.equals(d)) {
					return new Object[] { match, b, a, d };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Decision b, Decision a, Decision d) {
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
		return new Object[] { match, b, a, d, d__a____positive, d__b____negative };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_5_collectcontextelements_blackBBBB(Match match,
			Decision b, Decision a, Decision d) {
		if (!b.equals(d)) {
			if (!a.equals(b)) {
				if (!a.equals(d)) {
					return new Object[] { match, b, a, d };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_5_collectcontextelements_greenBB(Match match,
			Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decdecdec2branchbranchbranch_0_6_registerobjectstomatch_expressionBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Decision b, Decision a, Decision d) {
		_this.registerObjectsToMatch_FWD(match, b, a, d);

	}

	public static final boolean pattern_decdecdec2branchbranchbranch_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdecdec2branchbranchbranch_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject tmpD2c = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpD = _localVariable_4;
		if (tmpD2c instanceof S2B) {
			S2B d2c = (S2B) tmpD2c;
			if (tmpB instanceof Decision) {
				Decision b = (Decision) tmpB;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpA instanceof Decision) {
						Decision a = (Decision) tmpA;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							return new Object[] { d2c, b, c, a, d, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_1_performtransformation_blackBBBBBFBB(S2B d2c,
			Decision b, Branch c, Decision a, Decision d, decdecdec2branchbranchbranch _this,
			IsApplicableMatch isApplicableMatch) {
		if (!b.equals(d)) {
			if (!a.equals(b)) {
				if (!a.equals(d)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { d2c, b, c, a, d, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_binding = pattern_decdecdec2branchbranchbranch_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_binding != null) {
			S2B d2c = (S2B) result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_binding[0];
			Decision b = (Decision) result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_binding[1];
			Branch c = (Branch) result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_binding[2];
			Decision a = (Decision) result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_binding[4];

			Object[] result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_black = pattern_decdecdec2branchbranchbranch_1_1_performtransformation_blackBBBBBFBB(
					d2c, b, c, a, d, _this, isApplicableMatch);
			if (result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_black[5];

				return new Object[] { d2c, b, c, a, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_1_performtransformation_greenFFFFBBB(Decision b,
			Branch c, Decision a) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		c.setPositive(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		b2y.setSource(b);
		b2y.setTarget(y);
		c.setNegative(y);
		return new Object[] { x, a2x, b2y, y, b, c, a };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_2_collecttranslatedelements_blackBBBBBB(
			Branch x, S2B a2x, S2B b2y, Branch y, Decision b, Decision a) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				if (!a.equals(b)) {
					return new Object[] { x, a2x, b2y, y, b, a };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_2_collecttranslatedelements_greenFBBBBBB(
			Branch x, S2B a2x, S2B b2y, Branch y, Decision b, Decision a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(a);
		return new Object[] { ruleresult, x, a2x, b2y, y, b, a };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject x, EObject d2c, EObject a2x, EObject b2y, EObject y, EObject b,
			EObject c, EObject a, EObject d) {
		if (!x.equals(y)) {
			if (!d2c.equals(x)) {
				if (!d2c.equals(y)) {
					if (!a2x.equals(x)) {
						if (!a2x.equals(d2c)) {
							if (!a2x.equals(b2y)) {
								if (!a2x.equals(y)) {
									if (!a2x.equals(b)) {
										if (!a2x.equals(c)) {
											if (!a2x.equals(d)) {
												if (!b2y.equals(x)) {
													if (!b2y.equals(d2c)) {
														if (!b2y.equals(y)) {
															if (!b2y.equals(c)) {
																if (!b2y.equals(d)) {
																	if (!b.equals(x)) {
																		if (!b.equals(d2c)) {
																			if (!b.equals(b2y)) {
																				if (!b.equals(y)) {
																					if (!b.equals(c)) {
																						if (!b.equals(d)) {
																							if (!c.equals(x)) {
																								if (!c.equals(d2c)) {
																									if (!c.equals(y)) {
																										if (!c.equals(
																												d)) {
																											if (!a.equals(
																													x)) {
																												if (!a.equals(
																														d2c)) {
																													if (!a.equals(
																															a2x)) {
																														if (!a.equals(
																																b2y)) {
																															if (!a.equals(
																																	y)) {
																																if (!a.equals(
																																		b)) {
																																	if (!a.equals(
																																			c)) {
																																		if (!a.equals(
																																				d)) {
																																			if (!d.equals(
																																					x)) {
																																				if (!d.equals(
																																						d2c)) {
																																					if (!d.equals(
																																							y)) {
																																						return new Object[] {
																																								ruleresult,
																																								x,
																																								d2c,
																																								a2x,
																																								b2y,
																																								y,
																																								b,
																																								c,
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
											}
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject x, EObject a2x, EObject b2y, EObject y, EObject b, EObject c,
			EObject a, EObject d) {
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdecdec2branchbranchbranch";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { ruleresult, x, a2x, b2y, y, b, c, a, d, b2y__y____target, b2y__b____source,
				a2x__x____target, c__y____negative, c__x____positive, a2x__a____source, d__a____positive,
				d__b____negative };
	}

	public static final void pattern_decdecdec2branchbranchbranch_1_5_registerobjects_expressionBBBBBBBBBBB(
			decdecdec2branchbranchbranch _this, PerformRuleResult ruleresult, EObject x, EObject d2c, EObject a2x,
			EObject b2y, EObject y, EObject b, EObject c, EObject a, EObject d) {
		_this.registerObjects_FWD(ruleresult, x, d2c, a2x, b2y, y, b, c, a, d);

	}

	public static final PerformRuleResult pattern_decdecdec2branchbranchbranch_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_bindingFB(
			decdecdec2branchbranchbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_blackFBB(EClass eClass,
			decdecdec2branchbranchbranch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_bindingAndBlackFFB(
			decdecdec2branchbranchbranch _this) {
		Object[] result_pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_binding = pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_black = pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decdecdec2branchbranchbranch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("d");
		EObject tmpB = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpD = _localVariable_2;
		if (tmpB instanceof Decision) {
			Decision b = (Decision) tmpB;
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					return new Object[] { b, a, d, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_2_2_corematch_blackFBFBBB(Decision b,
			Decision a, Decision d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			if (!a.equals(b)) {
				if (!a.equals(d)) {
					for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class,
							"source")) {
						Branch c = d2c.getTarget();
						if (c != null) {
							_result.add(new Object[] { d2c, b, c, a, d, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_2_3_findcontext_blackBBBBB(S2B d2c,
			Decision b, Branch c, Decision a, Decision d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			if (!a.equals(b)) {
				if (!a.equals(d)) {
					if (c.equals(d2c.getTarget())) {
						if (a.equals(d.getPositive())) {
							if (b.equals(d.getNegative())) {
								if (d.equals(d2c.getSource())) {
									_result.add(new Object[] { d2c, b, c, a, d });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_3_findcontext_greenBBBBBFFFFF(S2B d2c,
			Decision b, Branch c, Decision a, Decision d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { d2c, b, c, a, d, isApplicableMatch, d2c__c____target, d__a____positive, d__b____negative,
				d2c__d____source };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_4_solveCSP_bindingFBBBBBBB(
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch, S2B d2c, Decision b, Branch c,
			Decision a, Decision d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, d2c, b, c, a, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, b, c, a, d };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch, S2B d2c, Decision b, Branch c,
			Decision a, Decision d) {
		Object[] result_pattern_decdecdec2branchbranchbranch_2_4_solveCSP_binding = pattern_decdecdec2branchbranchbranch_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, d2c, b, c, a, d);
		if (result_pattern_decdecdec2branchbranchbranch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_2_4_solveCSP_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_2_4_solveCSP_black = pattern_decdecdec2branchbranchbranch_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdecdec2branchbranchbranch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, b, c, a, d };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecdec2branchbranchbranch_2_5_checkCSP_expressionFBB(
			decdecdec2branchbranchbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decdecdec2branchbranchbranch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decdecdec2branchbranchbranch_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_10_1_initialbindings_blackBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Branch x, Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					return new Object[] { _this, match, x, y, c };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_bindingFBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Branch x, Branch y, Branch c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, y, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, y, c };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_bindingAndBlackFBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Branch x, Branch y, Branch c) {
		Object[] result_pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_binding = pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_bindingFBBBBB(
				_this, match, x, y, c);
		if (result_pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_black = pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, y, c };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecdec2branchbranchbranch_10_3_CheckCSP_expressionFBB(
			decdecdec2branchbranchbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Branch x, Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					return new Object[] { match, x, y, c };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Branch x, Branch y, Branch c) {
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
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
		return new Object[] { match, x, y, c, c__y____negative, c__x____positive };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_10_5_collectcontextelements_blackBBBB(Match match,
			Branch x, Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					return new Object[] { match, x, y, c };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_10_5_collectcontextelements_greenBB(Match match,
			Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decdecdec2branchbranchbranch_10_6_registerobjectstomatch_expressionBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Branch x, Branch y, Branch c) {
		_this.registerObjectsToMatch_BWD(match, x, y, c);

	}

	public static final boolean pattern_decdecdec2branchbranchbranch_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdecdec2branchbranchbranch_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("x");
		EObject _localVariable_1 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("y");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject tmpX = _localVariable_0;
		EObject tmpD2c = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpD = _localVariable_4;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpD2c instanceof S2B) {
				S2B d2c = (S2B) tmpD2c;
				if (tmpY instanceof Branch) {
					Branch y = (Branch) tmpY;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							return new Object[] { x, d2c, y, c, d, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_1_performtransformation_blackBBBBBFBB(Branch x,
			S2B d2c, Branch y, Branch c, Decision d, decdecdec2branchbranchbranch _this,
			IsApplicableMatch isApplicableMatch) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { x, d2c, y, c, d, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_binding = pattern_decdecdec2branchbranchbranch_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_binding != null) {
			Branch x = (Branch) result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_binding[0];
			S2B d2c = (S2B) result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_binding[1];
			Branch y = (Branch) result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_binding[2];
			Branch c = (Branch) result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_binding[4];

			Object[] result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_black = pattern_decdecdec2branchbranchbranch_11_1_performtransformation_blackBBBBBFBB(
					x, d2c, y, c, d, _this, isApplicableMatch);
			if (result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_black[5];

				return new Object[] { x, d2c, y, c, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_1_performtransformation_greenBFFBFFB(Branch x,
			Branch y, Decision d) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision b = SourcecodeFactory.eINSTANCE.createDecision();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		a2x.setTarget(x);
		b2y.setTarget(y);
		b2y.setSource(b);
		d.setNegative(b);
		a2x.setSource(a);
		d.setPositive(a);
		return new Object[] { x, a2x, b2y, y, b, a, d };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_2_collecttranslatedelements_blackBBBBBB(
			Branch x, S2B a2x, S2B b2y, Branch y, Decision b, Decision a) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				if (!a.equals(b)) {
					return new Object[] { x, a2x, b2y, y, b, a };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_2_collecttranslatedelements_greenFBBBBBB(
			Branch x, S2B a2x, S2B b2y, Branch y, Decision b, Decision a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(a);
		return new Object[] { ruleresult, x, a2x, b2y, y, b, a };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject x, EObject d2c, EObject a2x, EObject b2y, EObject y, EObject b,
			EObject c, EObject a, EObject d) {
		if (!x.equals(y)) {
			if (!d2c.equals(x)) {
				if (!d2c.equals(y)) {
					if (!a2x.equals(x)) {
						if (!a2x.equals(d2c)) {
							if (!a2x.equals(b2y)) {
								if (!a2x.equals(y)) {
									if (!a2x.equals(b)) {
										if (!a2x.equals(c)) {
											if (!a2x.equals(d)) {
												if (!b2y.equals(x)) {
													if (!b2y.equals(d2c)) {
														if (!b2y.equals(y)) {
															if (!b2y.equals(c)) {
																if (!b2y.equals(d)) {
																	if (!b.equals(x)) {
																		if (!b.equals(d2c)) {
																			if (!b.equals(b2y)) {
																				if (!b.equals(y)) {
																					if (!b.equals(c)) {
																						if (!b.equals(d)) {
																							if (!c.equals(x)) {
																								if (!c.equals(d2c)) {
																									if (!c.equals(y)) {
																										if (!c.equals(
																												d)) {
																											if (!a.equals(
																													x)) {
																												if (!a.equals(
																														d2c)) {
																													if (!a.equals(
																															a2x)) {
																														if (!a.equals(
																																b2y)) {
																															if (!a.equals(
																																	y)) {
																																if (!a.equals(
																																		b)) {
																																	if (!a.equals(
																																			c)) {
																																		if (!a.equals(
																																				d)) {
																																			if (!d.equals(
																																					x)) {
																																				if (!d.equals(
																																						d2c)) {
																																					if (!d.equals(
																																							y)) {
																																						return new Object[] {
																																								ruleresult,
																																								x,
																																								d2c,
																																								a2x,
																																								b2y,
																																								y,
																																								b,
																																								c,
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
											}
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject x, EObject a2x, EObject b2y, EObject y, EObject b, EObject c,
			EObject a, EObject d) {
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdecdec2branchbranchbranch";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { ruleresult, x, a2x, b2y, y, b, c, a, d, b2y__y____target, b2y__b____source,
				a2x__x____target, c__y____negative, c__x____positive, a2x__a____source, d__a____positive,
				d__b____negative };
	}

	public static final void pattern_decdecdec2branchbranchbranch_11_5_registerobjects_expressionBBBBBBBBBBB(
			decdecdec2branchbranchbranch _this, PerformRuleResult ruleresult, EObject x, EObject d2c, EObject a2x,
			EObject b2y, EObject y, EObject b, EObject c, EObject a, EObject d) {
		_this.registerObjects_BWD(ruleresult, x, d2c, a2x, b2y, y, b, c, a, d);

	}

	public static final PerformRuleResult pattern_decdecdec2branchbranchbranch_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_bindingFB(
			decdecdec2branchbranchbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_blackFBB(EClass eClass,
			decdecdec2branchbranchbranch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_bindingAndBlackFFB(
			decdecdec2branchbranchbranch _this) {
		Object[] result_pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_binding = pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_black = pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decdecdec2branchbranchbranch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("y");
		EObject _localVariable_2 = match.getObject("c");
		EObject tmpX = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpC = _localVariable_2;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpY instanceof Branch) {
				Branch y = (Branch) tmpY;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					return new Object[] { x, y, c, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_12_2_corematch_blackBFBBFB(Branch x,
			Branch y, Branch c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
							"target")) {
						Statement tmpD = d2c.getSource();
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							_result.add(new Object[] { x, d2c, y, c, d, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_12_3_findcontext_blackBBBBB(Branch x,
			S2B d2c, Branch y, Branch c, Decision d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (c.equals(d2c.getTarget())) {
						if (y.equals(c.getNegative())) {
							if (x.equals(c.getPositive())) {
								if (d.equals(d2c.getSource())) {
									_result.add(new Object[] { x, d2c, y, c, d });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_3_findcontext_greenBBBBBFFFFF(Branch x,
			S2B d2c, Branch y, Branch c, Decision d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d2c__c____target.setName(d2c__c____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { x, d2c, y, c, d, isApplicableMatch, d2c__c____target, c__y____negative, c__x____positive,
				d2c__d____source };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_4_solveCSP_bindingFBBBBBBB(
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch, Branch x, S2B d2c, Branch y,
			Branch c, Decision d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, x, d2c, y, c, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, x, d2c, y, c, d };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch, Branch x, S2B d2c, Branch y,
			Branch c, Decision d) {
		Object[] result_pattern_decdecdec2branchbranchbranch_12_4_solveCSP_binding = pattern_decdecdec2branchbranchbranch_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, x, d2c, y, c, d);
		if (result_pattern_decdecdec2branchbranchbranch_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_12_4_solveCSP_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_12_4_solveCSP_black = pattern_decdecdec2branchbranchbranch_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdecdec2branchbranchbranch_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, x, d2c, y, c, d };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecdec2branchbranchbranch_12_5_checkCSP_expressionFBB(
			decdecdec2branchbranchbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decdecdec2branchbranchbranch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decdecdec2branchbranchbranch_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_bindingFB(
			decdecdec2branchbranchbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decdecdec2branchbranchbranch _this) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_bindingAndBlackFFBF(
			decdecdec2branchbranchbranch _this) {
		Object[] result_pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_binding = pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_black = pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_586683 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_1BBB(Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_967508 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_967508)) {
							if (!y.equals(__DEC_x_positive_967508)) {
								if (!c.equals(__DEC_x_positive_967508)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_2BBB(Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_106442 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_106442)) {
							if (!y.equals(__DEC_x_negative_106442)) {
								if (!c.equals(__DEC_x_negative_106442)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_602784 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_4BBB(Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_876700 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_876700)) {
							if (!x.equals(__DEC_y_positive_876700)) {
								if (!c.equals(__DEC_y_positive_876700)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_5BBB(Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_188699 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_188699)) {
							if (!x.equals(__DEC_y_negative_188699)) {
								if (!c.equals(__DEC_y_negative_188699)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_6BB(Branch x,
			Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_7BB(Branch x,
			Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_blackFFFB(
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
							if (!x.equals(y)) {
								if (!c.equals(x)) {
									if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_3B(
											y) == null) {
										if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_0B(
												x) == null) {
											if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_1BBB(
													x, y, c) == null) {
												if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_2BBB(
														x, y, c) == null) {
													if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_4BBB(
															y, x, c) == null) {
														if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_5BBB(
																y, x, c) == null) {
															if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_6BB(
																	x, y) == null) {
																if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_7BB(
																		x, y) == null) {
																	_result.add(
																			new Object[] { x, y, c, _edge_negative });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decdecdec2branchbranchbranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Branch x, Branch y, Branch c) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, y, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decdecdec2branchbranchbranch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decdecdec2branchbranchbranch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decdecdec2branchbranchbranch_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_bindingFB(
			decdecdec2branchbranchbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decdecdec2branchbranchbranch _this) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_bindingAndBlackFFBF(
			decdecdec2branchbranchbranch _this) {
		Object[] result_pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_binding = pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_black = pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_0BBB(
			Decision b, Decision a, Decision d) {
		if (!b.equals(d)) {
			if (!a.equals(b)) {
				if (!a.equals(d)) {
					for (Decision __DEC_b_positive_637911 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, Decision.class, "positive")) {
						if (!b.equals(__DEC_b_positive_637911)) {
							if (!a.equals(__DEC_b_positive_637911)) {
								if (!d.equals(__DEC_b_positive_637911)) {
									return new Object[] { b, a, d };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_1B(
			Decision b) {
		for (While __DEC_b_first_327081 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_2B(
			Decision b) {
		for (While __DEC_b_last_602284 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_3B(
			Decision b) {
		for (Program __DEC_b_first_522837 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_4BBB(
			Decision a, Decision b, Decision d) {
		if (!a.equals(b)) {
			if (!a.equals(d)) {
				if (!b.equals(d)) {
					for (Decision __DEC_a_negative_611710 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, Decision.class, "negative")) {
						if (!a.equals(__DEC_a_negative_611710)) {
							if (!b.equals(__DEC_a_negative_611710)) {
								if (!d.equals(__DEC_a_negative_611710)) {
									return new Object[] { a, b, d };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_5B(
			Decision a) {
		for (While __DEC_a_first_507756 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_6B(
			Decision a) {
		for (While __DEC_a_last_481016 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_7B(
			Decision a) {
		for (Program __DEC_a_first_539619 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_8BB(
			Decision b, Decision a) {
		if (a.equals(b.getNegative())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_blackFFFB(
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
						if (tmpB instanceof Decision) {
							Decision b = (Decision) tmpB;
							if (!b.equals(d)) {
								if (!a.equals(b)) {
									if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_5B(
											a) == null) {
										if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_6B(
												a) == null) {
											if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_7B(
													a) == null) {
												if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_0BBB(
														b, a, d) == null) {
													if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_1B(
															b) == null) {
														if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_2B(
																b) == null) {
															if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_3B(
																	b) == null) {
																if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_4BBB(
																		a, b, d) == null) {
																	if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_8BB(
																			b, a) == null) {
																		_result.add(new Object[] { b, a, d,
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decdecdec2branchbranchbranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Decision b, Decision a, Decision d) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, a, d);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decdecdec2branchbranchbranch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decdecdec2branchbranchbranch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decdecdec2branchbranchbranch_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_1_prepare_blackB(
			decdecdec2branchbranchbranch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("x");
		EObject _localVariable_1 = targetMatch.getObject("y");
		EObject _localVariable_2 = sourceMatch.getObject("b");
		EObject _localVariable_3 = targetMatch.getObject("c");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = sourceMatch.getObject("d");
		EObject tmpX = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpD = _localVariable_5;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpY instanceof Branch) {
				Branch y = (Branch) tmpY;
				if (tmpB instanceof Decision) {
					Decision b = (Decision) tmpB;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpA instanceof Decision) {
							Decision a = (Decision) tmpA;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								return new Object[] { x, y, b, c, a, d, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_blackBBBBBBBB(Branch x,
			Branch y, Decision b, Branch c, Decision a, Decision d, Match sourceMatch, Match targetMatch) {
		if (!x.equals(y)) {
			if (!b.equals(d)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						if (!a.equals(b)) {
							if (!a.equals(d)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { x, y, b, c, a, d, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding = pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding != null) {
			Branch x = (Branch) result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding[0];
			Branch y = (Branch) result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding[1];
			Decision b = (Decision) result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding[2];
			Branch c = (Branch) result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding[3];
			Decision a = (Decision) result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding[4];
			Decision d = (Decision) result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_black = pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_blackBBBBBBBB(
					x, y, b, c, a, d, sourceMatch, targetMatch);
			if (result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { x, y, b, c, a, d, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_3_solvecsp_bindingFBBBBBBBBB(
			decdecdec2branchbranchbranch _this, Branch x, Branch y, Decision b, Branch c, Decision a, Decision d,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(x, y, b, c, a, d, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, x, y, b, c, a, d, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			decdecdec2branchbranchbranch _this, Branch x, Branch y, Decision b, Branch c, Decision a, Decision d,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decdecdec2branchbranchbranch_24_3_solvecsp_binding = pattern_decdecdec2branchbranchbranch_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, x, y, b, c, a, d, sourceMatch, targetMatch);
		if (result_pattern_decdecdec2branchbranchbranch_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_24_3_solvecsp_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_24_3_solvecsp_black = pattern_decdecdec2branchbranchbranch_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decdecdec2branchbranchbranch_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, x, y, b, c, a, d, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecdec2branchbranchbranch_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_24_5_matchcorrcontext_blackFBBBB(
			Branch c, Decision d, Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_5_matchcorrcontext_greenBBBF(S2B d2c,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "decdecdec2branchbranchbranch";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_6_createcorrespondence_blackBBBBBBB(Branch x,
			Branch y, Decision b, Branch c, Decision a, Decision d, CCMatch ccMatch) {
		if (!x.equals(y)) {
			if (!b.equals(d)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						if (!a.equals(b)) {
							if (!a.equals(d)) {
								return new Object[] { x, y, b, c, a, d, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_6_createcorrespondence_greenBFFBBBB(Branch x,
			Branch y, Decision b, Decision a, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { x, a2x, b2y, y, b, a, ccMatch };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "decdecdec2branchbranchbranch";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_decdecdec2branchbranchbranch_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_0BBB(Decision b,
			Decision a, Decision d) {
		if (!b.equals(d)) {
			if (!a.equals(b)) {
				if (!a.equals(d)) {
					for (Decision __DEC_b_positive_759457 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, Decision.class, "positive")) {
						if (!b.equals(__DEC_b_positive_759457)) {
							if (!a.equals(__DEC_b_positive_759457)) {
								if (!d.equals(__DEC_b_positive_759457)) {
									return new Object[] { b, a, d };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_1B(Decision b) {
		for (While __DEC_b_first_197785 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_2B(Decision b) {
		for (While __DEC_b_last_840542 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_3B(Decision b) {
		for (Program __DEC_b_first_702026 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_4BBB(Decision a,
			Decision b, Decision d) {
		if (!a.equals(b)) {
			if (!a.equals(d)) {
				if (!b.equals(d)) {
					for (Decision __DEC_a_negative_398251 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, Decision.class, "negative")) {
						if (!a.equals(__DEC_a_negative_398251)) {
							if (!b.equals(__DEC_a_negative_398251)) {
								if (!d.equals(__DEC_a_negative_398251)) {
									return new Object[] { a, b, d };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_5B(Decision a) {
		for (While __DEC_a_first_197639 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_6B(Decision a) {
		for (While __DEC_a_last_647565 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_7B(Decision a) {
		for (Program __DEC_a_first_650848 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_8BB(Decision b,
			Decision a) {
		if (a.equals(b.getNegative())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_blackBBB(Decision b,
			Decision a, Decision d) {
		if (!b.equals(d)) {
			if (!a.equals(b)) {
				if (!a.equals(d)) {
					if (a.equals(d.getPositive())) {
						if (b.equals(d.getNegative())) {
							if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_0BBB(b, a,
									d) == null) {
								if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_1B(b) == null) {
									if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_2B(
											b) == null) {
										if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_3B(
												b) == null) {
											if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_4BBB(
													a, b, d) == null) {
												if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_5B(
														a) == null) {
													if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_6B(
															a) == null) {
														if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_7B(
																a) == null) {
															if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_8BB(
																	b, a) == null) {
																return new Object[] { b, a, d };
															}
														}
													}
												}
											}
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

	public static final boolean pattern_decdecdec2branchbranchbranch_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdecdec2branchbranchbranch_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_811218 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_1BBB(Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_715094 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_715094)) {
							if (!y.equals(__DEC_x_positive_715094)) {
								if (!c.equals(__DEC_x_positive_715094)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_2BBB(Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_956220 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_956220)) {
							if (!y.equals(__DEC_x_negative_956220)) {
								if (!c.equals(__DEC_x_negative_956220)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_679240 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_4BBB(Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_205030 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_205030)) {
							if (!x.equals(__DEC_y_positive_205030)) {
								if (!c.equals(__DEC_y_positive_205030)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_5BBB(Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_467710 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_467710)) {
							if (!x.equals(__DEC_y_negative_467710)) {
								if (!c.equals(__DEC_y_negative_467710)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_6BB(Branch x,
			Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_7BB(Branch x,
			Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_blackBBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (y.equals(c.getNegative())) {
						if (x.equals(c.getPositive())) {
							if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_0B(x) == null) {
								if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_1BBB(x, y,
										c) == null) {
									if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_2BBB(x, y,
											c) == null) {
										if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_3B(
												y) == null) {
											if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_4BBB(
													y, x, c) == null) {
												if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_5BBB(
														y, x, c) == null) {
													if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_6BB(
															x, y) == null) {
														if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_7BB(
																x, y) == null) {
															return new Object[] { x, y, c };
														}
													}
												}
											}
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

	public static final boolean pattern_decdecdec2branchbranchbranch_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdecdec2branchbranchbranch_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_1_createresult_blackB(
			decdecdec2branchbranchbranch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_decdecdec2branchbranchbranch_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									d2c) == null) {
								if (pattern_decdecdec2branchbranchbranch_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										c) == null) {
									if (pattern_decdecdec2branchbranchbranch_29_2_isapplicablecore_black_nac_2BB(
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_3_solveCSP_bindingFBBBBBB(
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d2c, c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_3_solveCSP_bindingAndBlackFBBBBBB(
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decdecdec2branchbranchbranch_29_3_solveCSP_binding = pattern_decdecdec2branchbranchbranch_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d2c, c, d, ruleResult);
		if (result_pattern_decdecdec2branchbranchbranch_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_29_3_solveCSP_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_29_3_solveCSP_black = pattern_decdecdec2branchbranchbranch_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decdecdec2branchbranchbranch_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecdec2branchbranchbranch_29_4_checkCSP_expressionFBB(
			decdecdec2branchbranchbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_5_checknacs_blackBBB(S2B d2c, Branch c,
			Decision d) {
		return new Object[] { d2c, c, d };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_6_perform_blackBBBB(S2B d2c, Branch c,
			Decision d, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d2c, c, d, ruleResult };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_6_perform_greenFFFFFBFBB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Decision b = SourcecodeFactory.eINSTANCE.createDecision();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.getCorrObjects().add(b2y);
		b2y.setTarget(y);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		b2y.setSource(b);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		a2x.setSource(a);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { x, a2x, b2y, y, b, c, a, d, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decdecdec2branchbranchbranch_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decdecdec2branchbranchbranchImpl
