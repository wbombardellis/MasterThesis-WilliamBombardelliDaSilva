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
	public boolean isAppropriate_FWD(Match match, Decision a, Decision d, Decision b) {

		Object[] result1_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_0_1_initialbindings_blackBBBBB(this, match, a, d, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, a, d, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_0_4_collectelementstobetranslated_blackBBBB(match, a, d, b);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
			}
			decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_0_4_collectelementstobetranslated_greenBBBBFF(match, a, d, b);
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_0_5_collectcontextelements_blackBBBB(match, a, d, b);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
			}
			decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_0_5_collectcontextelements_greenBB(match, d);

			// 
			decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_0_6_registerobjectstomatch_expressionBBBBB(this, match, a, d,
							b);
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
		Branch c = (Branch) result1_bindingAndBlack[0];
		Decision a = (Decision) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		Decision b = (Decision) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_1_1_performtransformation_greenBBFFFBF(c, a, b);
		S2B b2y = (S2B) result1_green[2];
		S2B a2x = (S2B) result1_green[3];
		Branch x = (Branch) result1_green[4];
		Branch y = (Branch) result1_green[6];

		Object[] result2_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_1_2_collecttranslatedelements_blackBBBBBB(a, b2y, a2x, x, b, y);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", "
							+ "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_1_2_collecttranslatedelements_greenFBBBBBB(a, b2y, a2x, x, b, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, c, a, d2c, d,
						b2y, a2x, x, b, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d + ", "
					+ "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[b] = " + b + ", "
					+ "[y] = " + y + ".");
		}
		decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, c, a,
						d, b2y, a2x, x, b, y);
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[16];

		// 
		// 
		decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_1_5_registerobjects_expressionBBBBBBBBBBB(
				this, ruleresult, c, a, d2c, d, b2y, a2x, x, b, y);
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
		Decision a = (Decision) result2_binding[0];
		Decision d = (Decision) result2_binding[1];
		Decision b = (Decision) result2_binding[2];
		for (Object[] result2_black : decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_2_2_corematch_blackFBFBBB(a, d, b, match)) {
			Branch c = (Branch) result2_black[0];
			S2B d2c = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_2_3_findcontext_blackBBBBB(c, a, d2c, d, b)) {
				Object[] result3_green = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_2_3_findcontext_greenBBBBBFFFFF(c, a, d2c, d, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, c, a, d2c, d, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[a] = " + a
							+ ", " + "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Decision a, Decision d, Decision b) {
		match.registerObject("a", a);
		match.registerObject("d", d);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision a, Decision d, Decision b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch c, Decision a, S2B d2c, Decision d,
			Decision b) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("d2c", d2c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c, EObject a, EObject d2c, EObject d,
			EObject b2y, EObject a2x, EObject x, EObject b, EObject y) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Decision.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch c, Branch x, Branch y) {

		Object[] result1_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_10_1_initialbindings_blackBBBBB(this, match, c, x, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, c, x, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_10_4_collectelementstobetranslated_blackBBBB(match, c, x, y);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_10_4_collectelementstobetranslated_greenBBBBFF(match, c, x,
							y);
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_10_5_collectcontextelements_blackBBBB(match, c, x, y);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_10_5_collectcontextelements_greenBB(match, c);

			// 
			decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_10_6_registerobjectstomatch_expressionBBBBB(this, match, c, x,
							y);
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
		Branch c = (Branch) result1_bindingAndBlack[0];
		S2B d2c = (S2B) result1_bindingAndBlack[1];
		Decision d = (Decision) result1_bindingAndBlack[2];
		Branch x = (Branch) result1_bindingAndBlack[3];
		Branch y = (Branch) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_11_1_performtransformation_greenFBFFBFB(d, x, y);
		Decision a = (Decision) result1_green[0];
		S2B b2y = (S2B) result1_green[2];
		S2B a2x = (S2B) result1_green[3];
		Decision b = (Decision) result1_green[5];

		Object[] result2_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_11_2_collecttranslatedelements_blackBBBBBB(a, b2y, a2x, x, b, y);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", "
							+ "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_11_2_collecttranslatedelements_greenFBBBBBB(a, b2y, a2x, x, b, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, c, a, d2c, d,
						b2y, a2x, x, b, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d + ", "
					+ "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[b] = " + b + ", "
					+ "[y] = " + y + ".");
		}
		decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, c, a,
						d, b2y, a2x, x, b, y);
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[16];

		// 
		// 
		decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, c, a,
						d2c, d, b2y, a2x, x, b, y);
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
		Branch c = (Branch) result2_binding[0];
		Branch x = (Branch) result2_binding[1];
		Branch y = (Branch) result2_binding[2];
		for (Object[] result2_black : decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_12_2_corematch_blackBFFBBB(c, x, y, match)) {
			S2B d2c = (S2B) result2_black[1];
			Decision d = (Decision) result2_black[2];
			// ForEach 
			for (Object[] result3_black : decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_12_3_findcontext_blackBBBBB(c, d2c, d, x, y)) {
				Object[] result3_green = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_12_3_findcontext_greenBBBBBFFFFF(c, d2c, d, x, y);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, c, d2c, d, x, y);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d2c] = "
							+ d2c + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch c, Branch x, Branch y) {
		match.registerObject("c", c);
		match.registerObject("x", x);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch c, Branch x, Branch y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d, Branch x,
			Branch y) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c, EObject a, EObject d2c, EObject d,
			EObject b2y, EObject a2x, EObject x, EObject b, EObject y) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_141(EMoflonEdge _edge_positive) {

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
				.pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_blackFFFB(_edge_positive)) {
			Branch c = (Branch) result2_black[0];
			Branch x = (Branch) result2_black[1];
			Branch y = (Branch) result2_black[2];
			Object[] result2_green = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, c, x, y)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_141(EMoflonEdge _edge_negative) {

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
				.pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_blackFFFB(_edge_negative)) {
			Decision a = (Decision) result2_black[0];
			Decision d = (Decision) result2_black[1];
			Decision b = (Decision) result2_black[2];
			Object[] result2_green = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, a, d, b)) {
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
		Branch c = (Branch) result2_bindingAndBlack[0];
		Decision a = (Decision) result2_bindingAndBlack[1];
		Decision d = (Decision) result2_bindingAndBlack[2];
		Branch x = (Branch) result2_bindingAndBlack[3];
		Decision b = (Decision) result2_bindingAndBlack[4];
		Branch y = (Branch) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, c, a, d, x, b, y,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[b] = "
					+ b + ", " + "[y] = " + y + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_24_5_matchcorrcontext_blackBFBBB(c, d, sourceMatch,
							targetMatch)) {
				S2B d2c = (S2B) result5_black[1];
				Object[] result5_green = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_24_6_createcorrespondence_blackBBBBBBB(c, a, d, x, b, y,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
							+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[b] = " + b + ", "
							+ "[y] = " + y + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_24_6_createcorrespondence_greenBFFBBBB(a, x, b, y,
								ccMatch);
				//nothing S2B b2y = (S2B) result6_green[1];
				//nothing S2B a2x = (S2B) result6_green[2];

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
	public CSP isApplicable_solveCsp_CC(Branch c, Decision a, Decision d, Branch x, Decision b, Branch y,
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
	public boolean checkDEC_FWD(Decision a, Decision d, Decision b) {// 
		Object[] result1_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_blackBBB(a, d, b);
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
	public boolean checkDEC_BWD(Branch c, Branch x, Branch y) {// 
		Object[] result1_black = decdecdec2branchbranchbranchImpl
				.pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_blackBBB(c, x, y);
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
			Branch c = (Branch) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = decdecdec2branchbranchbranchImpl
					.pattern_decdecdec2branchbranchbranch_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							c, d2c, d, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d2c] = " + d2c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = decdecdec2branchbranchbranchImpl
						.pattern_decdecdec2branchbranchbranch_29_5_checknacs_blackBBB(c, d2c, d);
				if (result5_black != null) {

					Object[] result6_black = decdecdec2branchbranchbranchImpl
							.pattern_decdecdec2branchbranchbranch_29_6_perform_blackBBBB(c, d2c, d, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
								+ "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decdecdec2branchbranchbranchImpl.pattern_decdecdec2branchbranchbranch_29_6_perform_greenBFBFFFFFB(c,
							d, ruleResult);
					//nothing Decision a = (Decision) result6_green[1];
					//nothing S2B b2y = (S2B) result6_green[3];
					//nothing S2B a2x = (S2B) result6_green[4];
					//nothing Branch x = (Branch) result6_green[5];
					//nothing Decision b = (Decision) result6_green[6];
					//nothing Branch y = (Branch) result6_green[7];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
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
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_DECISION_S2B_DECISION_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Decision) arguments.get(2), (S2B) arguments.get(3), (Decision) arguments.get(4),
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
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_DECISION_BRANCH_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Decision) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5));
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
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPROPRIATE_BWD_EMOFLON_EDGE_141__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_141((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_141__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_141((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_DECISION_DECISION_BRANCH_DECISION_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Decision) arguments.get(1),
					(Decision) arguments.get(2), (Branch) arguments.get(3), (Decision) arguments.get(4),
					(Branch) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___CHECK_DEC_FWD__DECISION_DECISION_DECISION:
			return checkDEC_FWD((Decision) arguments.get(0), (Decision) arguments.get(1), (Decision) arguments.get(2));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___CHECK_DEC_BWD__BRANCH_BRANCH_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Decision) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_1_initialbindings_blackBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Decision a, Decision d, Decision b) {
		if (!a.equals(d)) {
			if (!a.equals(b)) {
				if (!b.equals(d)) {
					return new Object[] { _this, match, a, d, b };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_bindingFBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Decision a, Decision d, Decision b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, d, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_bindingAndBlackFBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Decision a, Decision d, Decision b) {
		Object[] result_pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_binding = pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_bindingFBBBBB(
				_this, match, a, d, b);
		if (result_pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_black = pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdecdec2branchbranchbranch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, d, b };
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
			Match match, Decision a, Decision d, Decision b) {
		if (!a.equals(d)) {
			if (!a.equals(b)) {
				if (!b.equals(d)) {
					return new Object[] { match, a, d, b };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Decision a, Decision d, Decision b) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_0_5_collectcontextelements_blackBBBB(Match match,
			Decision a, Decision d, Decision b) {
		if (!a.equals(d)) {
			if (!a.equals(b)) {
				if (!b.equals(d)) {
					return new Object[] { match, a, d, b };
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
			decdecdec2branchbranchbranch _this, Match match, Decision a, Decision d, Decision b) {
		_this.registerObjectsToMatch_FWD(match, a, d, b);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("a");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("b");
		EObject tmpC = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpB = _localVariable_4;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpB instanceof Decision) {
							Decision b = (Decision) tmpB;
							return new Object[] { c, a, d2c, d, b, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_1_performtransformation_blackBBBBBFBB(Branch c,
			Decision a, S2B d2c, Decision d, Decision b, decdecdec2branchbranchbranch _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(d)) {
			if (!a.equals(b)) {
				if (!b.equals(d)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { c, a, d2c, d, b, csp, _this, isApplicableMatch };
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
			Branch c = (Branch) result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_binding[0];
			Decision a = (Decision) result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_binding[3];
			Decision b = (Decision) result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_binding[4];

			Object[] result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_black = pattern_decdecdec2branchbranchbranch_1_1_performtransformation_blackBBBBBFBB(
					c, a, d2c, d, b, _this, isApplicableMatch);
			if (result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_1_1_performtransformation_black[5];

				return new Object[] { c, a, d2c, d, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_1_performtransformation_greenBBFFFBF(Branch c,
			Decision a, Decision b) {
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		b2y.setSource(b);
		a2x.setSource(a);
		c.setPositive(x);
		a2x.setTarget(x);
		b2y.setTarget(y);
		c.setNegative(y);
		return new Object[] { c, a, b2y, a2x, x, b, y };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_2_collecttranslatedelements_blackBBBBBB(
			Decision a, S2B b2y, S2B a2x, Branch x, Decision b, Branch y) {
		if (!a.equals(b)) {
			if (!a2x.equals(b2y)) {
				if (!x.equals(y)) {
					return new Object[] { a, b2y, a2x, x, b, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_2_collecttranslatedelements_greenFBBBBBB(
			Decision a, S2B b2y, S2B a2x, Branch x, Decision b, Branch y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(y);
		return new Object[] { ruleresult, a, b2y, a2x, x, b, y };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject a, EObject d2c, EObject d, EObject b2y, EObject a2x,
			EObject x, EObject b, EObject y) {
		if (!c.equals(d2c)) {
			if (!c.equals(d)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						if (!a.equals(c)) {
							if (!a.equals(d2c)) {
								if (!a.equals(d)) {
									if (!a.equals(b2y)) {
										if (!a.equals(a2x)) {
											if (!a.equals(x)) {
												if (!a.equals(b)) {
													if (!a.equals(y)) {
														if (!d2c.equals(x)) {
															if (!d2c.equals(y)) {
																if (!d.equals(d2c)) {
																	if (!d.equals(x)) {
																		if (!d.equals(y)) {
																			if (!b2y.equals(c)) {
																				if (!b2y.equals(d2c)) {
																					if (!b2y.equals(d)) {
																						if (!b2y.equals(x)) {
																							if (!b2y.equals(y)) {
																								if (!a2x.equals(c)) {
																									if (!a2x.equals(
																											d2c)) {
																										if (!a2x.equals(
																												d)) {
																											if (!a2x.equals(
																													b2y)) {
																												if (!a2x.equals(
																														x)) {
																													if (!a2x.equals(
																															b)) {
																														if (!a2x.equals(
																																y)) {
																															if (!x.equals(
																																	y)) {
																																if (!b.equals(
																																		c)) {
																																	if (!b.equals(
																																			d2c)) {
																																		if (!b.equals(
																																				d)) {
																																			if (!b.equals(
																																					b2y)) {
																																				if (!b.equals(
																																						x)) {
																																					if (!b.equals(
																																							y)) {
																																						return new Object[] {
																																								ruleresult,
																																								c,
																																								a,
																																								d2c,
																																								d,
																																								b2y,
																																								a2x,
																																								x,
																																								b,
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject c, EObject a, EObject d, EObject b2y, EObject a2x, EObject x,
			EObject b, EObject y) {
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdecdec2branchbranchbranch";
		String d__b____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String c__y____negative_name_prime = "negative";
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { ruleresult, c, a, d, b2y, a2x, x, b, y, d__b____negative, c__x____positive,
				a2x__x____target, d__a____positive, a2x__a____source, b2y__y____target, b2y__b____source,
				c__y____negative };
	}

	public static final void pattern_decdecdec2branchbranchbranch_1_5_registerobjects_expressionBBBBBBBBBBB(
			decdecdec2branchbranchbranch _this, PerformRuleResult ruleresult, EObject c, EObject a, EObject d2c,
			EObject d, EObject b2y, EObject a2x, EObject x, EObject b, EObject y) {
		_this.registerObjects_FWD(ruleresult, c, a, d2c, d, b2y, a2x, x, b, y);

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
				if (tmpB instanceof Decision) {
					Decision b = (Decision) tmpB;
					return new Object[] { a, d, b, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_2_2_corematch_blackFBFBBB(Decision a,
			Decision d, Decision b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			if (!a.equals(b)) {
				if (!b.equals(d)) {
					for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class,
							"source")) {
						Branch c = d2c.getTarget();
						if (c != null) {
							_result.add(new Object[] { c, a, d2c, d, b, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_2_3_findcontext_blackBBBBB(Branch c,
			Decision a, S2B d2c, Decision d, Decision b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			if (!a.equals(b)) {
				if (!b.equals(d)) {
					if (b.equals(d.getNegative())) {
						if (a.equals(d.getPositive())) {
							if (d.equals(d2c.getSource())) {
								if (c.equals(d2c.getTarget())) {
									_result.add(new Object[] { c, a, d2c, d, b });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_3_findcontext_greenBBBBBFFFFF(Branch c,
			Decision a, S2B d2c, Decision d, Decision b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String d2c__c____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(b);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		return new Object[] { c, a, d2c, d, b, isApplicableMatch, d__b____negative, d__a____positive, d2c__d____source,
				d2c__c____target };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_4_solveCSP_bindingFBBBBBBB(
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch, Branch c, Decision a, S2B d2c,
			Decision d, Decision b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, a, d2c, d, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, a, d2c, d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch, Branch c, Decision a, S2B d2c,
			Decision d, Decision b) {
		Object[] result_pattern_decdecdec2branchbranchbranch_2_4_solveCSP_binding = pattern_decdecdec2branchbranchbranch_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, c, a, d2c, d, b);
		if (result_pattern_decdecdec2branchbranchbranch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_2_4_solveCSP_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_2_4_solveCSP_black = pattern_decdecdec2branchbranchbranch_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdecdec2branchbranchbranch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, a, d2c, d, b };
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
			decdecdec2branchbranchbranch _this, Match match, Branch c, Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					return new Object[] { _this, match, c, x, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_bindingFBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Branch c, Branch x, Branch y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, c, x, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_bindingAndBlackFBBBBB(
			decdecdec2branchbranchbranch _this, Match match, Branch c, Branch x, Branch y) {
		Object[] result_pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_binding = pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_bindingFBBBBB(
				_this, match, c, x, y);
		if (result_pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_black = pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdecdec2branchbranchbranch_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, x, y };
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
			Match match, Branch c, Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					return new Object[] { match, c, x, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Branch c, Branch x, Branch y) {
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
		return new Object[] { match, c, x, y, c__x____positive, c__y____negative };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_10_5_collectcontextelements_blackBBBB(Match match,
			Branch c, Branch x, Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					return new Object[] { match, c, x, y };
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
			decdecdec2branchbranchbranch _this, Match match, Branch c, Branch x, Branch y) {
		_this.registerObjectsToMatch_BWD(match, c, x, y);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("d");
		EObject _localVariable_3 = isApplicableMatch.getObject("x");
		EObject _localVariable_4 = isApplicableMatch.getObject("y");
		EObject tmpC = _localVariable_0;
		EObject tmpD2c = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpY = _localVariable_4;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpD2c instanceof S2B) {
				S2B d2c = (S2B) tmpD2c;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpY instanceof Branch) {
							Branch y = (Branch) tmpY;
							return new Object[] { c, d2c, d, x, y, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_1_performtransformation_blackBBBBBFBB(Branch c,
			S2B d2c, Decision d, Branch x, Branch y, decdecdec2branchbranchbranch _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { c, d2c, d, x, y, csp, _this, isApplicableMatch };
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
			Branch c = (Branch) result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_binding[0];
			S2B d2c = (S2B) result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_binding[1];
			Decision d = (Decision) result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_binding[2];
			Branch x = (Branch) result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_binding[3];
			Branch y = (Branch) result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_binding[4];

			Object[] result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_black = pattern_decdecdec2branchbranchbranch_11_1_performtransformation_blackBBBBBFBB(
					c, d2c, d, x, y, _this, isApplicableMatch);
			if (result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_11_1_performtransformation_black[5];

				return new Object[] { c, d2c, d, x, y, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_1_performtransformation_greenFBFFBFB(
			Decision d, Branch x, Branch y) {
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision b = SourcecodeFactory.eINSTANCE.createDecision();
		d.setPositive(a);
		b2y.setTarget(y);
		a2x.setTarget(x);
		a2x.setSource(a);
		d.setNegative(b);
		b2y.setSource(b);
		return new Object[] { a, d, b2y, a2x, x, b, y };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_2_collecttranslatedelements_blackBBBBBB(
			Decision a, S2B b2y, S2B a2x, Branch x, Decision b, Branch y) {
		if (!a.equals(b)) {
			if (!a2x.equals(b2y)) {
				if (!x.equals(y)) {
					return new Object[] { a, b2y, a2x, x, b, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_2_collecttranslatedelements_greenFBBBBBB(
			Decision a, S2B b2y, S2B a2x, Branch x, Decision b, Branch y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(y);
		return new Object[] { ruleresult, a, b2y, a2x, x, b, y };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject a, EObject d2c, EObject d, EObject b2y, EObject a2x,
			EObject x, EObject b, EObject y) {
		if (!c.equals(d2c)) {
			if (!c.equals(d)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						if (!a.equals(c)) {
							if (!a.equals(d2c)) {
								if (!a.equals(d)) {
									if (!a.equals(b2y)) {
										if (!a.equals(a2x)) {
											if (!a.equals(x)) {
												if (!a.equals(b)) {
													if (!a.equals(y)) {
														if (!d2c.equals(x)) {
															if (!d2c.equals(y)) {
																if (!d.equals(d2c)) {
																	if (!d.equals(x)) {
																		if (!d.equals(y)) {
																			if (!b2y.equals(c)) {
																				if (!b2y.equals(d2c)) {
																					if (!b2y.equals(d)) {
																						if (!b2y.equals(x)) {
																							if (!b2y.equals(y)) {
																								if (!a2x.equals(c)) {
																									if (!a2x.equals(
																											d2c)) {
																										if (!a2x.equals(
																												d)) {
																											if (!a2x.equals(
																													b2y)) {
																												if (!a2x.equals(
																														x)) {
																													if (!a2x.equals(
																															b)) {
																														if (!a2x.equals(
																																y)) {
																															if (!x.equals(
																																	y)) {
																																if (!b.equals(
																																		c)) {
																																	if (!b.equals(
																																			d2c)) {
																																		if (!b.equals(
																																				d)) {
																																			if (!b.equals(
																																					b2y)) {
																																				if (!b.equals(
																																						x)) {
																																					if (!b.equals(
																																							y)) {
																																						return new Object[] {
																																								ruleresult,
																																								c,
																																								a,
																																								d2c,
																																								d,
																																								b2y,
																																								a2x,
																																								x,
																																								b,
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject c, EObject a, EObject d, EObject b2y, EObject a2x, EObject x,
			EObject b, EObject y) {
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdecdec2branchbranchbranch";
		String d__b____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String c__y____negative_name_prime = "negative";
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { ruleresult, c, a, d, b2y, a2x, x, b, y, d__b____negative, c__x____positive,
				a2x__x____target, d__a____positive, a2x__a____source, b2y__y____target, b2y__b____source,
				c__y____negative };
	}

	public static final void pattern_decdecdec2branchbranchbranch_11_5_registerobjects_expressionBBBBBBBBBBB(
			decdecdec2branchbranchbranch _this, PerformRuleResult ruleresult, EObject c, EObject a, EObject d2c,
			EObject d, EObject b2y, EObject a2x, EObject x, EObject b, EObject y) {
		_this.registerObjects_BWD(ruleresult, c, a, d2c, d, b2y, a2x, x, b, y);

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
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("y");
		EObject tmpC = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpY = _localVariable_2;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpY instanceof Branch) {
					Branch y = (Branch) tmpY;
					return new Object[] { c, x, y, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_12_2_corematch_blackBFFBBB(Branch c,
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
							_result.add(new Object[] { c, d2c, d, x, y, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_12_3_findcontext_blackBBBBB(Branch c,
			S2B d2c, Decision d, Branch x, Branch y) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					if (x.equals(c.getPositive())) {
						if (d.equals(d2c.getSource())) {
							if (c.equals(d2c.getTarget())) {
								if (y.equals(c.getNegative())) {
									_result.add(new Object[] { c, d2c, d, x, y });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_3_findcontext_greenBBBBBFFFFF(Branch c,
			S2B d2c, Decision d, Branch x, Branch y) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__x____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String d2c__c____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(y);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		c__x____positive.setName(c__x____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { c, d2c, d, x, y, isApplicableMatch, c__x____positive, d2c__d____source, d2c__c____target,
				c__y____negative };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_4_solveCSP_bindingFBBBBBBB(
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d,
			Branch x, Branch y) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, c, d2c, d, x, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d,
			Branch x, Branch y) {
		Object[] result_pattern_decdecdec2branchbranchbranch_12_4_solveCSP_binding = pattern_decdecdec2branchbranchbranch_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, c, d2c, d, x, y);
		if (result_pattern_decdecdec2branchbranchbranch_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_12_4_solveCSP_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_12_4_solveCSP_black = pattern_decdecdec2branchbranchbranch_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdecdec2branchbranchbranch_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, x, y };
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
		for (Graph __DEC_x_root_893191 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_1BBB(Branch x,
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_848294 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_848294)) {
							if (!c.equals(__DEC_x_positive_848294)) {
								if (!y.equals(__DEC_x_positive_848294)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_2BBB(Branch x,
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_848435 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_848435)) {
							if (!c.equals(__DEC_x_negative_848435)) {
								if (!y.equals(__DEC_x_negative_848435)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_517650 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_4BBB(Branch y,
			Branch c, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_980441 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_980441)) {
							if (!c.equals(__DEC_y_positive_980441)) {
								if (!x.equals(__DEC_y_positive_980441)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_5BBB(Branch y,
			Branch c, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_725755 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_725755)) {
							if (!c.equals(__DEC_y_negative_725755)) {
								if (!x.equals(__DEC_y_negative_725755)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_6BB(Branch c,
			Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_7BB(Branch c,
			Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_8BB(Branch x,
			Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_9BB(Branch x,
			Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_blackFFFB(
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
							if (!c.equals(y)) {
								if (!x.equals(y)) {
									if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_0B(
											x) == null) {
										if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_6BB(
												c, x) == null) {
											if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_1BBB(
													x, c, y) == null) {
												if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_2BBB(
														x, c, y) == null) {
													if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_3B(
															y) == null) {
														if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_4BBB(
																y, c, x) == null) {
															if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_5BBB(
																	y, c, x) == null) {
																if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_7BB(
																		c, y) == null) {
																	if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_8BB(
																			x, y) == null) {
																		if (pattern_decdecdec2branchbranchbranch_20_2_testcorematchandDECs_black_nac_9BB(
																				x, y) == null) {
																			_result.add(new Object[] { c, x, y,
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
			decdecdec2branchbranchbranch _this, Match match, Branch c, Branch x, Branch y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, c, x, y);
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
			Decision a, Decision d, Decision b) {
		if (!a.equals(d)) {
			if (!a.equals(b)) {
				if (!b.equals(d)) {
					for (Decision __DEC_a_negative_66641 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, Decision.class, "negative")) {
						if (!a.equals(__DEC_a_negative_66641)) {
							if (!d.equals(__DEC_a_negative_66641)) {
								if (!b.equals(__DEC_a_negative_66641)) {
									return new Object[] { a, d, b };
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
			Decision a) {
		for (While __DEC_a_first_271846 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_2B(
			Decision a) {
		for (While __DEC_a_last_582606 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_3B(
			Decision a) {
		for (Program __DEC_a_first_942273 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_4BBB(
			Decision b, Decision a, Decision d) {
		if (!b.equals(d)) {
			if (!a.equals(b)) {
				if (!a.equals(d)) {
					for (Decision __DEC_b_positive_212730 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, Decision.class, "positive")) {
						if (!b.equals(__DEC_b_positive_212730)) {
							if (!a.equals(__DEC_b_positive_212730)) {
								if (!d.equals(__DEC_b_positive_212730)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_5B(
			Decision b) {
		for (While __DEC_b_first_435780 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_6B(
			Decision b) {
		for (While __DEC_b_last_901821 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_7B(
			Decision b) {
		for (Program __DEC_b_first_157113 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_8BB(
			Decision a, Decision b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_9BB(
			Decision d, Decision b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_blackFFFB(
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
						if (tmpA instanceof Decision) {
							Decision a = (Decision) tmpA;
							if (!a.equals(d)) {
								if (!a.equals(b)) {
									if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_5B(
											b) == null) {
										if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_6B(
												b) == null) {
											if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_7B(
													b) == null) {
												if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_9BB(
														d, b) == null) {
													if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_0BBB(
															a, d, b) == null) {
														if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_1B(
																a) == null) {
															if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_2B(
																	a) == null) {
																if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_3B(
																		a) == null) {
																	if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_4BBB(
																			b, a, d) == null) {
																		if (pattern_decdecdec2branchbranchbranch_21_2_testcorematchandDECs_black_nac_8BB(
																				a, b) == null) {
																			_result.add(new Object[] { a, d, b,
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
			decdecdec2branchbranchbranch _this, Match match, Decision a, Decision d, Decision b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, d, b);
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
		EObject _localVariable_0 = targetMatch.getObject("c");
		EObject _localVariable_1 = sourceMatch.getObject("a");
		EObject _localVariable_2 = sourceMatch.getObject("d");
		EObject _localVariable_3 = targetMatch.getObject("x");
		EObject _localVariable_4 = sourceMatch.getObject("b");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject tmpC = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpY = _localVariable_5;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpB instanceof Decision) {
							Decision b = (Decision) tmpB;
							if (tmpY instanceof Branch) {
								Branch y = (Branch) tmpY;
								return new Object[] { c, a, d, x, b, y, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_blackBBBBBBBB(Branch c,
			Decision a, Decision d, Branch x, Decision b, Branch y, Match sourceMatch, Match targetMatch) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!a.equals(d)) {
					if (!a.equals(b)) {
						if (!x.equals(y)) {
							if (!b.equals(d)) {
								if (!sourceMatch.equals(targetMatch)) {
									return new Object[] { c, a, d, x, b, y, sourceMatch, targetMatch };
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
			Branch c = (Branch) result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding[0];
			Decision a = (Decision) result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding[1];
			Decision d = (Decision) result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding[2];
			Branch x = (Branch) result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding[3];
			Decision b = (Decision) result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding[4];
			Branch y = (Branch) result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_black = pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_blackBBBBBBBB(
					c, a, d, x, b, y, sourceMatch, targetMatch);
			if (result_pattern_decdecdec2branchbranchbranch_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { c, a, d, x, b, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_3_solvecsp_bindingFBBBBBBBBB(
			decdecdec2branchbranchbranch _this, Branch c, Decision a, Decision d, Branch x, Decision b, Branch y,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(c, a, d, x, b, y, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, c, a, d, x, b, y, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			decdecdec2branchbranchbranch _this, Branch c, Decision a, Decision d, Branch x, Decision b, Branch y,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decdecdec2branchbranchbranch_24_3_solvecsp_binding = pattern_decdecdec2branchbranchbranch_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, c, a, d, x, b, y, sourceMatch, targetMatch);
		if (result_pattern_decdecdec2branchbranchbranch_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_24_3_solvecsp_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_24_3_solvecsp_black = pattern_decdecdec2branchbranchbranch_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decdecdec2branchbranchbranch_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, c, a, d, x, b, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decdecdec2branchbranchbranch_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdecdec2branchbranchbranch_24_5_matchcorrcontext_blackBFBBB(
			Branch c, Decision d, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				if (c.equals(d2c.getTarget())) {
					_result.add(new Object[] { c, d2c, d, sourceMatch, targetMatch });
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_6_createcorrespondence_blackBBBBBBB(Branch c,
			Decision a, Decision d, Branch x, Decision b, Branch y, CCMatch ccMatch) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!a.equals(d)) {
					if (!a.equals(b)) {
						if (!x.equals(y)) {
							if (!b.equals(d)) {
								return new Object[] { c, a, d, x, b, y, ccMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_24_6_createcorrespondence_greenBFFBBBB(Decision a,
			Branch x, Decision b, Branch y, CCMatch ccMatch) {
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { a, b2y, a2x, x, b, y, ccMatch };
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_0BBB(Decision a,
			Decision d, Decision b) {
		if (!a.equals(d)) {
			if (!a.equals(b)) {
				if (!b.equals(d)) {
					for (Decision __DEC_a_negative_816057 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, Decision.class, "negative")) {
						if (!a.equals(__DEC_a_negative_816057)) {
							if (!d.equals(__DEC_a_negative_816057)) {
								if (!b.equals(__DEC_a_negative_816057)) {
									return new Object[] { a, d, b };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_1B(Decision a) {
		for (While __DEC_a_first_607830 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_2B(Decision a) {
		for (While __DEC_a_last_308909 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_3B(Decision a) {
		for (Program __DEC_a_first_196544 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_4BBB(Decision b,
			Decision a, Decision d) {
		if (!b.equals(d)) {
			if (!a.equals(b)) {
				if (!a.equals(d)) {
					for (Decision __DEC_b_positive_536380 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, Decision.class, "positive")) {
						if (!b.equals(__DEC_b_positive_536380)) {
							if (!a.equals(__DEC_b_positive_536380)) {
								if (!d.equals(__DEC_b_positive_536380)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_5B(Decision b) {
		for (While __DEC_b_first_427674 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_6B(Decision b) {
		for (While __DEC_b_last_490192 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_7B(Decision b) {
		for (Program __DEC_b_first_563708 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_8BB(Decision a,
			Decision b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_9BB(Decision d,
			Decision b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_blackBBB(Decision a,
			Decision d, Decision b) {
		if (!a.equals(d)) {
			if (!a.equals(b)) {
				if (!b.equals(d)) {
					if (b.equals(d.getNegative())) {
						if (a.equals(d.getPositive())) {
							if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_0BBB(a, d,
									b) == null) {
								if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_1B(a) == null) {
									if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_2B(
											a) == null) {
										if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_3B(
												a) == null) {
											if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_4BBB(
													b, a, d) == null) {
												if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_5B(
														b) == null) {
													if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_6B(
															b) == null) {
														if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_7B(
																b) == null) {
															if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_8BB(
																	a, b) == null) {
																if (pattern_decdecdec2branchbranchbranch_27_1_matchtggpattern_black_nac_9BB(
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
		for (Graph __DEC_x_root_824375 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_1BBB(Branch x,
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_396887 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_396887)) {
							if (!c.equals(__DEC_x_positive_396887)) {
								if (!y.equals(__DEC_x_positive_396887)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_2BBB(Branch x,
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_914946 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_914946)) {
							if (!c.equals(__DEC_x_negative_914946)) {
								if (!y.equals(__DEC_x_negative_914946)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_312768 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_4BBB(Branch y,
			Branch c, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_positive_695322 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_695322)) {
							if (!c.equals(__DEC_y_positive_695322)) {
								if (!x.equals(__DEC_y_positive_695322)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_5BBB(Branch y,
			Branch c, Branch x) {
		if (!c.equals(y)) {
			if (!c.equals(x)) {
				if (!x.equals(y)) {
					for (Branch __DEC_y_negative_398309 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_398309)) {
							if (!c.equals(__DEC_y_negative_398309)) {
								if (!x.equals(__DEC_y_negative_398309)) {
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_6BB(Branch c,
			Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_7BB(Branch c,
			Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_8BB(Branch x,
			Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_9BB(Branch x,
			Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_blackBBB(Branch c, Branch x,
			Branch y) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!x.equals(y)) {
					if (x.equals(c.getPositive())) {
						if (y.equals(c.getNegative())) {
							if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_0B(x) == null) {
								if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_1BBB(x, c,
										y) == null) {
									if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_2BBB(x, c,
											y) == null) {
										if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_3B(
												y) == null) {
											if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_4BBB(
													y, c, x) == null) {
												if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_5BBB(
														y, c, x) == null) {
													if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_6BB(
															c, x) == null) {
														if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_7BB(
																c, y) == null) {
															if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_8BB(
																	x, y) == null) {
																if (pattern_decdecdec2branchbranchbranch_28_1_matchtggpattern_black_nac_9BB(
																		x, y) == null) {
																	return new Object[] { c, x, y };
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
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
							if (pattern_decdecdec2branchbranchbranch_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									d2c) == null) {
								if (pattern_decdecdec2branchbranchbranch_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										c) == null) {
									if (pattern_decdecdec2branchbranchbranch_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, d) == null) {
										_result.add(
												new Object[] { d2cList, c, d2c, d, ruleEntryContainer, ruleResult });
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
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, c, d2c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_3_solveCSP_bindingAndBlackFBBBBBB(
			decdecdec2branchbranchbranch _this, IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decdecdec2branchbranchbranch_29_3_solveCSP_binding = pattern_decdecdec2branchbranchbranch_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, c, d2c, d, ruleResult);
		if (result_pattern_decdecdec2branchbranchbranch_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdecdec2branchbranchbranch_29_3_solveCSP_binding[0];

			Object[] result_pattern_decdecdec2branchbranchbranch_29_3_solveCSP_black = pattern_decdecdec2branchbranchbranch_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decdecdec2branchbranchbranch_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
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

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_5_checknacs_blackBBB(Branch c, S2B d2c,
			Decision d) {
		return new Object[] { c, d2c, d };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_6_perform_blackBBBB(Branch c, S2B d2c,
			Decision d, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { c, d2c, d, ruleResult };
	}

	public static final Object[] pattern_decdecdec2branchbranchbranch_29_6_perform_greenBFBFFFFFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Decision b = SourcecodeFactory.eINSTANCE.createDecision();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		ruleResult.getCorrObjects().add(b2y);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		c.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		d.setNegative(b);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		b2y.setTarget(y);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c, a, d, b2y, a2x, x, b, y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decdecdec2branchbranchbranch_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decdecdec2branchbranchbranchImpl
