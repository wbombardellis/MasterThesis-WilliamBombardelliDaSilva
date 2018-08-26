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
import org.wbsilva.bx.sourcecode2controlflow.Rules.decassdec2branchcmdbranch;

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
 * An implementation of the model object '<em><b>decassdec2branchcmdbranch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class decassdec2branchcmdbranchImpl extends AbstractRuleImpl implements decassdec2branchcmdbranch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decassdec2branchcmdbranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdecassdec2branchcmdbranch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment a, Decision b, Decision d) {

		Object[] result1_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_0_1_initialbindings_blackBBBBB(this, match, a, b, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, a, b, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_0_4_collectelementstobetranslated_blackBBBB(match, a, b, d);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
			}
			decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_0_4_collectelementstobetranslated_greenBBBBFF(match, a, b, d);
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_0_5_collectcontextelements_blackBBBB(match, a, b, d);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
			}
			decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_0_5_collectcontextelements_greenBB(match,
					d);

			// 
			decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_0_6_registerobjectstomatch_expressionBBBBB(this, match, a, b, d);
			return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_0_7_expressionF();
		} else {
			return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch c = (Branch) result1_bindingAndBlack[0];
		S2B d2c = (S2B) result1_bindingAndBlack[1];
		Assignment a = (Assignment) result1_bindingAndBlack[2];
		Decision b = (Decision) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_1_1_performtransformation_greenFBBBFFF(c, a, b);
		Branch y = (Branch) result1_green[0];
		S2N a2x = (S2N) result1_green[4];
		Command x = (Command) result1_green[5];
		S2B b2y = (S2B) result1_green[6];

		Object[] result2_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_1_2_collecttranslatedelements_blackBBBBBB(y, a, b, a2x, x, b2y);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[a] = " + a + ", " + "[b] = "
							+ b + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_1_2_collecttranslatedelements_greenFBBBBBB(y, a, b, a2x, x, b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, y, c, d2c, a, b,
						a2x, d, x, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[d2c] = " + d2c + ", " + "[a] = " + a + ", "
					+ "[b] = " + b + ", " + "[a2x] = " + a2x + ", " + "[d] = " + d + ", " + "[x] = " + x + ", "
					+ "[b2y] = " + b2y + ".");
		}
		decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, y, c, a, b, a2x, d, x, b2y);
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[16];

		// 
		// 
		decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, y, c, d2c, a, b, a2x, d, x, b2y);
		return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment a = (Assignment) result2_binding[0];
		Decision b = (Decision) result2_binding[1];
		Decision d = (Decision) result2_binding[2];
		for (Object[] result2_black : decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_2_2_corematch_blackFFBBBB(a, b, d, match)) {
			Branch c = (Branch) result2_black[0];
			S2B d2c = (S2B) result2_black[1];
			// ForEach 
			for (Object[] result3_black : decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_2_3_findcontext_blackBBBBB(c, d2c, a, b, d)) {
				Object[] result3_green = decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_2_3_findcontext_greenBBBBBFFFFF(c, d2c, a, b, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								c, d2c, a, b, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d2c] = "
							+ d2c + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = decassdec2branchcmdbranchImpl
							.pattern_decassdec2branchcmdbranch_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment a, Decision b, Decision d) {
		match.registerObject("a", a);
		match.registerObject("b", b);
		match.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment a, Decision b, Decision d) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Assignment a,
			Decision b, Decision d) {// Create CSP
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
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("b", b);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject y, EObject c, EObject d2c, EObject a,
			EObject b, EObject a2x, EObject d, EObject x, EObject b2y) {
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b2y", b2y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Decision.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch y, Branch c, Command x) {

		Object[] result1_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_10_1_initialbindings_blackBBBBB(this, match, y, c, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, y, c, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_10_4_collectelementstobetranslated_blackBBBB(match, y, c, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ".");
			}
			decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_10_4_collectelementstobetranslated_greenBBBBFF(match, y, c, x);
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_10_5_collectcontextelements_blackBBBB(match, y, c, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ".");
			}
			decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_10_5_collectcontextelements_greenBB(match,
					c);

			// 
			decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, y, c, x);
			return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_10_7_expressionF();
		} else {
			return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch y = (Branch) result1_bindingAndBlack[0];
		Branch c = (Branch) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		Command x = (Command) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_11_1_performtransformation_greenBFFFBBF(y, d, x);
		Assignment a = (Assignment) result1_green[1];
		Decision b = (Decision) result1_green[2];
		S2N a2x = (S2N) result1_green[3];
		S2B b2y = (S2B) result1_green[6];

		Object[] result2_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_11_2_collecttranslatedelements_blackBBBBBB(y, a, b, a2x, x, b2y);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[a] = " + a + ", " + "[b] = "
							+ b + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_11_2_collecttranslatedelements_greenFBBBBBB(y, a, b, a2x, x, b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, y, c, d2c, a, b,
						a2x, d, x, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[d2c] = " + d2c + ", " + "[a] = " + a + ", "
					+ "[b] = " + b + ", " + "[a2x] = " + a2x + ", " + "[d] = " + d + ", " + "[x] = " + x + ", "
					+ "[b2y] = " + b2y + ".");
		}
		decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, y, c, a, b, a2x, d, x, b2y);
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[16];

		// 
		// 
		decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, y, c, d2c, a, b, a2x, d, x, b2y);
		return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch y = (Branch) result2_binding[0];
		Branch c = (Branch) result2_binding[1];
		Command x = (Command) result2_binding[2];
		for (Object[] result2_black : decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_12_2_corematch_blackBBFFBB(y, c, x, match)) {
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[3];
			// ForEach 
			for (Object[] result3_black : decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_12_3_findcontext_blackBBBBB(y, c, d2c, d, x)) {
				Object[] result3_green = decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_12_3_findcontext_greenBBBBBFFFFF(y, c, d2c, d, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, y, c, d2c, d, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[y] = " + y + ", " + "[c] = " + c
							+ ", " + "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[x] = " + x + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = decassdec2branchcmdbranchImpl
							.pattern_decassdec2branchcmdbranch_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch y, Branch c, Command x) {
		match.registerObject("y", y);
		match.registerObject("c", c);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch y, Branch c, Command x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch y, Branch c, S2B d2c, Decision d,
			Command x) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject y, EObject c, EObject d2c, EObject a,
			EObject b, EObject a2x, EObject d, EObject x, EObject b2y) {
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b2y", b2y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_153(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_blackFFFB(_edge_positive)) {
			Branch y = (Branch) result2_black[0];
			Branch c = (Branch) result2_black[1];
			Command x = (Command) result2_black[2];
			Object[] result2_green = decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, y, c, x)) {
				// 
				if (decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = decassdec2branchcmdbranchImpl
							.pattern_decassdec2branchcmdbranch_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_153(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_blackFFFB(_edge_positive)) {
			Assignment a = (Assignment) result2_black[0];
			Decision b = (Decision) result2_black[1];
			Decision d = (Decision) result2_black[2];
			Object[] result2_green = decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, a, b, d)) {
				// 
				if (decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = decassdec2branchcmdbranchImpl
							.pattern_decassdec2branchcmdbranch_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("decassdec2branchcmdbranch");
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
		ruleResult.setRule("decassdec2branchcmdbranch");
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

		Object[] result1_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Branch y = (Branch) result2_bindingAndBlack[0];
		Branch c = (Branch) result2_bindingAndBlack[1];
		Assignment a = (Assignment) result2_bindingAndBlack[2];
		Decision b = (Decision) result2_bindingAndBlack[3];
		Decision d = (Decision) result2_bindingAndBlack[4];
		Command x = (Command) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, y, c, a, b, d, x,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[y] = " + y + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = "
					+ d + ", " + "[x] = " + x + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_24_5_matchcorrcontext_blackBFBBB(c, d, sourceMatch,
							targetMatch)) {
				S2B d2c = (S2B) result5_black[1];
				Object[] result5_green = decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_24_6_createcorrespondence_blackBBBBBBB(y, c, a, b, d, x,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", "
							+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ", "
							+ "[x] = " + x + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_24_6_createcorrespondence_greenBBBFBFB(y, a, b, x, ccMatch);
				//nothing S2N a2x = (S2N) result6_green[3];
				//nothing S2B b2y = (S2B) result6_green[5];

				Object[] result7_black = decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Branch y, Branch c, Assignment a, Decision b, Decision d, Command x,
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
	public boolean checkDEC_FWD(Assignment a, Decision b, Decision d) {// 
		Object[] result1_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_blackBBB(a, b, d);
		if (result1_black != null) {
			return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_27_2_expressionF();
		} else {
			return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch y, Branch c, Command x) {// 
		Object[] result1_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_blackBBB(y, c, x);
		if (result1_black != null) {
			return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_28_2_expressionF();
		} else {
			return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			Branch c = (Branch) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, c,
							d2c, d, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d2c] = " + d2c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_29_5_checknacs_blackBBB(c, d2c, d);
				if (result5_black != null) {

					Object[] result6_black = decassdec2branchcmdbranchImpl
							.pattern_decassdec2branchcmdbranch_29_6_perform_blackBBBB(c, d2c, d, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
								+ "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_29_6_perform_greenFBFFFBFFB(c, d,
							ruleResult);
					//nothing Branch y = (Branch) result6_green[0];
					//nothing Assignment a = (Assignment) result6_green[2];
					//nothing Decision b = (Decision) result6_green[3];
					//nothing S2N a2x = (S2N) result6_green[4];
					//nothing Command x = (Command) result6_green[6];
					//nothing S2B b2y = (S2B) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_29_7_expressionFB(ruleResult);
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
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_DECISION_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (Decision) arguments.get(3));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_DECISION_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (Decision) arguments.get(3));
			return null;
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_DECISION_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (Decision) arguments.get(3));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_S2B_ASSIGNMENT_DECISION_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4),
					(Decision) arguments.get(5));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
			return null;
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_BRANCH_S2B_DECISION_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (Decision) arguments.get(4),
					(Command) arguments.get(5));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_BWD_EMOFLON_EDGE_153__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_153((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_153__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_153((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_BRANCH_ASSIGNMENT_DECISION_DECISION_COMMAND_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Branch) arguments.get(1),
					(Assignment) arguments.get(2), (Decision) arguments.get(3), (Decision) arguments.get(4),
					(Command) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___CHECK_DEC_FWD__ASSIGNMENT_DECISION_DECISION:
			return checkDEC_FWD((Assignment) arguments.get(0), (Decision) arguments.get(1),
					(Decision) arguments.get(2));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___CHECK_DEC_BWD__BRANCH_BRANCH_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Decision) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_0_1_initialbindings_blackBBBBB(
			decassdec2branchcmdbranch _this, Match match, Assignment a, Decision b, Decision d) {
		if (!b.equals(d)) {
			return new Object[] { _this, match, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_0_2_SolveCSP_bindingFBBBBB(
			decassdec2branchcmdbranch _this, Match match, Assignment a, Decision b, Decision d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, b, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_0_2_SolveCSP_bindingAndBlackFBBBBB(
			decassdec2branchcmdbranch _this, Match match, Assignment a, Decision b, Decision d) {
		Object[] result_pattern_decassdec2branchcmdbranch_0_2_SolveCSP_binding = pattern_decassdec2branchcmdbranch_0_2_SolveCSP_bindingFBBBBB(
				_this, match, a, b, d);
		if (result_pattern_decassdec2branchcmdbranch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_0_2_SolveCSP_black = pattern_decassdec2branchcmdbranch_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decassdec2branchcmdbranch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, b, d };
			}
		}
		return null;
	}

	public static final boolean pattern_decassdec2branchcmdbranch_0_3_CheckCSP_expressionFBB(
			decassdec2branchcmdbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_0_4_collectelementstobetranslated_blackBBBB(
			Match match, Assignment a, Decision b, Decision d) {
		if (!b.equals(d)) {
			return new Object[] { match, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Assignment a, Decision b, Decision d) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
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
		return new Object[] { match, a, b, d, d__a____positive, d__b____negative };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_0_5_collectcontextelements_blackBBBB(Match match,
			Assignment a, Decision b, Decision d) {
		if (!b.equals(d)) {
			return new Object[] { match, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_0_5_collectcontextelements_greenBB(Match match,
			Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decassdec2branchcmdbranch_0_6_registerobjectstomatch_expressionBBBBB(
			decassdec2branchcmdbranch _this, Match match, Assignment a, Decision b, Decision d) {
		_this.registerObjectsToMatch_FWD(match, a, b, d);

	}

	public static final boolean pattern_decassdec2branchcmdbranch_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decassdec2branchcmdbranch_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("b");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject tmpC = _localVariable_0;
		EObject tmpD2c = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpD = _localVariable_4;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpD2c instanceof S2B) {
				S2B d2c = (S2B) tmpD2c;
				if (tmpA instanceof Assignment) {
					Assignment a = (Assignment) tmpA;
					if (tmpB instanceof Decision) {
						Decision b = (Decision) tmpB;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							return new Object[] { c, d2c, a, b, d, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_1_1_performtransformation_blackBBBBBFBB(Branch c,
			S2B d2c, Assignment a, Decision b, Decision d, decassdec2branchcmdbranch _this,
			IsApplicableMatch isApplicableMatch) {
		if (!b.equals(d)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { c, d2c, a, b, d, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			decassdec2branchcmdbranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_binding = pattern_decassdec2branchcmdbranch_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_binding != null) {
			Branch c = (Branch) result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_binding[0];
			S2B d2c = (S2B) result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_binding[1];
			Assignment a = (Assignment) result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_binding[2];
			Decision b = (Decision) result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_binding[4];

			Object[] result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_black = pattern_decassdec2branchcmdbranch_1_1_performtransformation_blackBBBBBFBB(
					c, d2c, a, b, d, _this, isApplicableMatch);
			if (result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_black[5];

				return new Object[] { c, d2c, a, b, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_1_1_performtransformation_greenFBBBFFF(Branch c,
			Assignment a, Decision b) {
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		c.setNegative(y);
		a2x.setSource(a);
		c.setPositive(x);
		a2x.setTarget(x);
		b2y.setTarget(y);
		b2y.setSource(b);
		return new Object[] { y, c, a, b, a2x, x, b2y };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_1_2_collecttranslatedelements_blackBBBBBB(Branch y,
			Assignment a, Decision b, S2N a2x, Command x, S2B b2y) {
		return new Object[] { y, a, b, a2x, x, b2y };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_1_2_collecttranslatedelements_greenFBBBBBB(Branch y,
			Assignment a, Decision b, S2N a2x, Command x, S2B b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, y, a, b, a2x, x, b2y };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject y, EObject c, EObject d2c, EObject a, EObject b, EObject a2x,
			EObject d, EObject x, EObject b2y) {
		if (!c.equals(y)) {
			if (!c.equals(d2c)) {
				if (!c.equals(d)) {
					if (!c.equals(x)) {
						if (!d2c.equals(y)) {
							if (!d2c.equals(x)) {
								if (!a.equals(y)) {
									if (!a.equals(c)) {
										if (!a.equals(d2c)) {
											if (!a.equals(b)) {
												if (!a.equals(a2x)) {
													if (!a.equals(d)) {
														if (!a.equals(x)) {
															if (!a.equals(b2y)) {
																if (!b.equals(y)) {
																	if (!b.equals(c)) {
																		if (!b.equals(d2c)) {
																			if (!b.equals(d)) {
																				if (!b.equals(x)) {
																					if (!b.equals(b2y)) {
																						if (!a2x.equals(y)) {
																							if (!a2x.equals(c)) {
																								if (!a2x.equals(d2c)) {
																									if (!a2x.equals(
																											b)) {
																										if (!a2x.equals(
																												d)) {
																											if (!a2x.equals(
																													x)) {
																												if (!a2x.equals(
																														b2y)) {
																													if (!d.equals(
																															y)) {
																														if (!d.equals(
																																d2c)) {
																															if (!d.equals(
																																	x)) {
																																if (!x.equals(
																																		y)) {
																																	if (!b2y.equals(
																																			y)) {
																																		if (!b2y.equals(
																																				c)) {
																																			if (!b2y.equals(
																																					d2c)) {
																																				if (!b2y.equals(
																																						d)) {
																																					if (!b2y.equals(
																																							x)) {
																																						return new Object[] {
																																								ruleresult,
																																								y,
																																								c,
																																								d2c,
																																								a,
																																								b,
																																								a2x,
																																								d,
																																								x,
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

	public static final Object[] pattern_decassdec2branchcmdbranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject y, EObject c, EObject a, EObject b, EObject a2x, EObject d, EObject x,
			EObject b2y) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decassdec2branchcmdbranch";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String d__b____negative_name_prime = "negative";
		String b2y__b____source_name_prime = "source";
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, y, c, a, b, a2x, d, x, b2y, c__x____positive, c__y____negative,
				a2x__a____source, d__a____positive, a2x__x____target, b2y__y____target, d__b____negative,
				b2y__b____source };
	}

	public static final void pattern_decassdec2branchcmdbranch_1_5_registerobjects_expressionBBBBBBBBBBB(
			decassdec2branchcmdbranch _this, PerformRuleResult ruleresult, EObject y, EObject c, EObject d2c, EObject a,
			EObject b, EObject a2x, EObject d, EObject x, EObject b2y) {
		_this.registerObjects_FWD(ruleresult, y, c, d2c, a, b, a2x, d, x, b2y);

	}

	public static final PerformRuleResult pattern_decassdec2branchcmdbranch_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_bindingFB(
			decassdec2branchcmdbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_blackFBB(EClass eClass,
			decassdec2branchcmdbranch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_bindingAndBlackFFB(
			decassdec2branchcmdbranch _this) {
		Object[] result_pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_binding = pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_black = pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decassdec2branchcmdbranch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("a");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("d");
		EObject tmpA = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpD = _localVariable_2;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpB instanceof Decision) {
				Decision b = (Decision) tmpB;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					return new Object[] { a, b, d, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decassdec2branchcmdbranch_2_2_corematch_blackFFBBBB(Assignment a,
			Decision b, Decision d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { c, d2c, a, b, d, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decassdec2branchcmdbranch_2_3_findcontext_blackBBBBB(Branch c,
			S2B d2c, Assignment a, Decision b, Decision d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			if (c.equals(d2c.getTarget())) {
				if (a.equals(d.getPositive())) {
					if (d.equals(d2c.getSource())) {
						if (b.equals(d.getNegative())) {
							_result.add(new Object[] { c, d2c, a, b, d });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_3_findcontext_greenBBBBBFFFFF(Branch c, S2B d2c,
			Assignment a, Decision b, Decision d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(d);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { c, d2c, a, b, d, isApplicableMatch, d2c__c____target, d__a____positive, d2c__d____source,
				d__b____negative };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_4_solveCSP_bindingFBBBBBBB(
			decassdec2branchcmdbranch _this, IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Assignment a,
			Decision b, Decision d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, d2c, a, b, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d2c, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			decassdec2branchcmdbranch _this, IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Assignment a,
			Decision b, Decision d) {
		Object[] result_pattern_decassdec2branchcmdbranch_2_4_solveCSP_binding = pattern_decassdec2branchcmdbranch_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, c, d2c, a, b, d);
		if (result_pattern_decassdec2branchcmdbranch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_2_4_solveCSP_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_2_4_solveCSP_black = pattern_decassdec2branchcmdbranch_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decassdec2branchcmdbranch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d2c, a, b, d };
			}
		}
		return null;
	}

	public static final boolean pattern_decassdec2branchcmdbranch_2_5_checkCSP_expressionFBB(
			decassdec2branchcmdbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decassdec2branchcmdbranch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decassdec2branchcmdbranch_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_10_1_initialbindings_blackBBBBB(
			decassdec2branchcmdbranch _this, Match match, Branch y, Branch c, Command x) {
		if (!c.equals(y)) {
			return new Object[] { _this, match, y, c, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_10_2_SolveCSP_bindingFBBBBB(
			decassdec2branchcmdbranch _this, Match match, Branch y, Branch c, Command x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, c, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, c, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_10_2_SolveCSP_bindingAndBlackFBBBBB(
			decassdec2branchcmdbranch _this, Match match, Branch y, Branch c, Command x) {
		Object[] result_pattern_decassdec2branchcmdbranch_10_2_SolveCSP_binding = pattern_decassdec2branchcmdbranch_10_2_SolveCSP_bindingFBBBBB(
				_this, match, y, c, x);
		if (result_pattern_decassdec2branchcmdbranch_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_10_2_SolveCSP_black = pattern_decassdec2branchcmdbranch_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decassdec2branchcmdbranch_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, c, x };
			}
		}
		return null;
	}

	public static final boolean pattern_decassdec2branchcmdbranch_10_3_CheckCSP_expressionFBB(
			decassdec2branchcmdbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Branch y, Branch c, Command x) {
		if (!c.equals(y)) {
			return new Object[] { match, y, c, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Branch y, Branch c, Command x) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
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
		return new Object[] { match, y, c, x, c__x____positive, c__y____negative };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_10_5_collectcontextelements_blackBBBB(Match match,
			Branch y, Branch c, Command x) {
		if (!c.equals(y)) {
			return new Object[] { match, y, c, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_10_5_collectcontextelements_greenBB(Match match,
			Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decassdec2branchcmdbranch_10_6_registerobjectstomatch_expressionBBBBB(
			decassdec2branchcmdbranch _this, Match match, Branch y, Branch c, Command x) {
		_this.registerObjectsToMatch_BWD(match, y, c, x);

	}

	public static final boolean pattern_decassdec2branchcmdbranch_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decassdec2branchcmdbranch_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("y");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("x");
		EObject tmpY = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpX = _localVariable_4;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpX instanceof Command) {
							Command x = (Command) tmpX;
							return new Object[] { y, c, d2c, d, x, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_11_1_performtransformation_blackBBBBBFBB(Branch y,
			Branch c, S2B d2c, Decision d, Command x, decassdec2branchcmdbranch _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(y)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { y, c, d2c, d, x, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			decassdec2branchcmdbranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_binding = pattern_decassdec2branchcmdbranch_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_binding != null) {
			Branch y = (Branch) result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_binding[0];
			Branch c = (Branch) result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_binding[3];
			Command x = (Command) result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_binding[4];

			Object[] result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_black = pattern_decassdec2branchcmdbranch_11_1_performtransformation_blackBBBBBFBB(
					y, c, d2c, d, x, _this, isApplicableMatch);
			if (result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_black[5];

				return new Object[] { y, c, d2c, d, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_11_1_performtransformation_greenBFFFBBF(Branch y,
			Decision d, Command x) {
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		Decision b = SourcecodeFactory.eINSTANCE.createDecision();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		d.setPositive(a);
		d.setNegative(b);
		a2x.setSource(a);
		a2x.setTarget(x);
		b2y.setTarget(y);
		b2y.setSource(b);
		return new Object[] { y, a, b, a2x, d, x, b2y };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_11_2_collecttranslatedelements_blackBBBBBB(Branch y,
			Assignment a, Decision b, S2N a2x, Command x, S2B b2y) {
		return new Object[] { y, a, b, a2x, x, b2y };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_11_2_collecttranslatedelements_greenFBBBBBB(Branch y,
			Assignment a, Decision b, S2N a2x, Command x, S2B b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, y, a, b, a2x, x, b2y };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject y, EObject c, EObject d2c, EObject a, EObject b, EObject a2x,
			EObject d, EObject x, EObject b2y) {
		if (!c.equals(y)) {
			if (!c.equals(d2c)) {
				if (!c.equals(d)) {
					if (!c.equals(x)) {
						if (!d2c.equals(y)) {
							if (!d2c.equals(x)) {
								if (!a.equals(y)) {
									if (!a.equals(c)) {
										if (!a.equals(d2c)) {
											if (!a.equals(b)) {
												if (!a.equals(a2x)) {
													if (!a.equals(d)) {
														if (!a.equals(x)) {
															if (!a.equals(b2y)) {
																if (!b.equals(y)) {
																	if (!b.equals(c)) {
																		if (!b.equals(d2c)) {
																			if (!b.equals(d)) {
																				if (!b.equals(x)) {
																					if (!b.equals(b2y)) {
																						if (!a2x.equals(y)) {
																							if (!a2x.equals(c)) {
																								if (!a2x.equals(d2c)) {
																									if (!a2x.equals(
																											b)) {
																										if (!a2x.equals(
																												d)) {
																											if (!a2x.equals(
																													x)) {
																												if (!a2x.equals(
																														b2y)) {
																													if (!d.equals(
																															y)) {
																														if (!d.equals(
																																d2c)) {
																															if (!d.equals(
																																	x)) {
																																if (!x.equals(
																																		y)) {
																																	if (!b2y.equals(
																																			y)) {
																																		if (!b2y.equals(
																																				c)) {
																																			if (!b2y.equals(
																																					d2c)) {
																																				if (!b2y.equals(
																																						d)) {
																																					if (!b2y.equals(
																																							x)) {
																																						return new Object[] {
																																								ruleresult,
																																								y,
																																								c,
																																								d2c,
																																								a,
																																								b,
																																								a2x,
																																								d,
																																								x,
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

	public static final Object[] pattern_decassdec2branchcmdbranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject y, EObject c, EObject a, EObject b, EObject a2x, EObject d, EObject x,
			EObject b2y) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decassdec2branchcmdbranch";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String d__b____negative_name_prime = "negative";
		String b2y__b____source_name_prime = "source";
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, y, c, a, b, a2x, d, x, b2y, c__x____positive, c__y____negative,
				a2x__a____source, d__a____positive, a2x__x____target, b2y__y____target, d__b____negative,
				b2y__b____source };
	}

	public static final void pattern_decassdec2branchcmdbranch_11_5_registerobjects_expressionBBBBBBBBBBB(
			decassdec2branchcmdbranch _this, PerformRuleResult ruleresult, EObject y, EObject c, EObject d2c, EObject a,
			EObject b, EObject a2x, EObject d, EObject x, EObject b2y) {
		_this.registerObjects_BWD(ruleresult, y, c, d2c, a, b, a2x, d, x, b2y);

	}

	public static final PerformRuleResult pattern_decassdec2branchcmdbranch_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_bindingFB(
			decassdec2branchcmdbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_blackFBB(EClass eClass,
			decassdec2branchcmdbranch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_bindingAndBlackFFB(
			decassdec2branchcmdbranch _this) {
		Object[] result_pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_binding = pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_black = pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decassdec2branchcmdbranch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("x");
		EObject tmpY = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpX = _localVariable_2;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpX instanceof Command) {
					Command x = (Command) tmpX;
					return new Object[] { y, c, x, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decassdec2branchcmdbranch_12_2_corematch_blackBBFFBB(Branch y,
			Branch c, Command x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(y)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				Statement tmpD = d2c.getSource();
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					_result.add(new Object[] { y, c, d2c, d, x, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decassdec2branchcmdbranch_12_3_findcontext_blackBBBBB(Branch y,
			Branch c, S2B d2c, Decision d, Command x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(y)) {
			if (x.equals(c.getPositive())) {
				if (y.equals(c.getNegative())) {
					if (c.equals(d2c.getTarget())) {
						if (d.equals(d2c.getSource())) {
							_result.add(new Object[] { y, c, d2c, d, x });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_3_findcontext_greenBBBBBFFFFF(Branch y, Branch c,
			S2B d2c, Decision d, Command x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(x);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { y, c, d2c, d, x, isApplicableMatch, c__x____positive, c__y____negative, d2c__c____target,
				d2c__d____source };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_4_solveCSP_bindingFBBBBBBB(
			decassdec2branchcmdbranch _this, IsApplicableMatch isApplicableMatch, Branch y, Branch c, S2B d2c,
			Decision d, Command x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, y, c, d2c, d, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, y, c, d2c, d, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			decassdec2branchcmdbranch _this, IsApplicableMatch isApplicableMatch, Branch y, Branch c, S2B d2c,
			Decision d, Command x) {
		Object[] result_pattern_decassdec2branchcmdbranch_12_4_solveCSP_binding = pattern_decassdec2branchcmdbranch_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, y, c, d2c, d, x);
		if (result_pattern_decassdec2branchcmdbranch_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_12_4_solveCSP_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_12_4_solveCSP_black = pattern_decassdec2branchcmdbranch_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decassdec2branchcmdbranch_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, y, c, d2c, d, x };
			}
		}
		return null;
	}

	public static final boolean pattern_decassdec2branchcmdbranch_12_5_checkCSP_expressionFBB(
			decassdec2branchcmdbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decassdec2branchcmdbranch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decassdec2branchcmdbranch_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_bindingFB(
			decassdec2branchcmdbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decassdec2branchcmdbranch _this) {
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

	public static final Object[] pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_bindingAndBlackFFBF(
			decassdec2branchcmdbranch _this) {
		Object[] result_pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_binding = pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_black = pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_0B(Branch y) {
		for (Graph __DEC_y_root_88168 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_1BB(Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_positive_7562 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_y_positive_7562)) {
					if (!c.equals(__DEC_y_positive_7562)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_2BB(Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_negative_149853 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_y_negative_149853)) {
					if (!c.equals(__DEC_y_negative_149853)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_3B(Command x) {
		for (Graph __DEC_x_root_576472 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_4BBB(Command x,
			Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_positive_24081 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_x_positive_24081)) {
					if (!c.equals(__DEC_x_positive_24081)) {
						return new Object[] { x, y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_5BBB(Command x,
			Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_negative_649227 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_x_negative_649227)) {
					if (!c.equals(__DEC_x_negative_649227)) {
						return new Object[] { x, y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_6BB(Branch y,
			Command x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_7BB(Branch y,
			Command x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_8BB(Branch c,
			Command x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_positive.getSrc();
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			EObject tmpX = _edge_positive.getTrg();
			if (tmpX instanceof Command) {
				Command x = (Command) tmpX;
				if (x.equals(c.getPositive())) {
					Node tmpY = c.getNegative();
					if (tmpY instanceof Branch) {
						Branch y = (Branch) tmpY;
						if (!c.equals(y)) {
							if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_3B(x) == null) {
								if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_8BB(c,
										x) == null) {
									if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_0B(
											y) == null) {
										if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_1BB(y,
												c) == null) {
											if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_2BB(
													y, c) == null) {
												if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_4BBB(
														x, y, c) == null) {
													if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_5BBB(
															x, y, c) == null) {
														if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_6BB(
																y, x) == null) {
															if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_7BB(
																	y, x) == null) {
																_result.add(new Object[] { y, c, x, _edge_positive });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decassdec2branchcmdbranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			decassdec2branchcmdbranch _this, Match match, Branch y, Branch c, Command x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, c, x);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decassdec2branchcmdbranch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decassdec2branchcmdbranch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decassdec2branchcmdbranch_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_bindingFB(
			decassdec2branchcmdbranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decassdec2branchcmdbranch _this) {
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

	public static final Object[] pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_bindingAndBlackFFBF(
			decassdec2branchcmdbranch _this) {
		Object[] result_pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_binding = pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_black = pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_0BBB(
			Assignment a, Decision b, Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_a_negative_737048 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!b.equals(__DEC_a_negative_737048)) {
					if (!d.equals(__DEC_a_negative_737048)) {
						return new Object[] { a, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_1B(
			Assignment a) {
		for (While __DEC_a_first_938619 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_2B(
			Assignment a) {
		for (While __DEC_a_last_610232 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_3B(
			Assignment a) {
		for (Program __DEC_a_first_232039 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_4BB(Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_b_positive_999253 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!b.equals(__DEC_b_positive_999253)) {
					if (!d.equals(__DEC_b_positive_999253)) {
						return new Object[] { b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_5B(Decision b) {
		for (While __DEC_b_first_833323 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_6B(Decision b) {
		for (While __DEC_b_last_778444 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_7B(Decision b) {
		for (Program __DEC_b_first_519685 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_8BB(Decision b,
			Assignment a) {
		if (a.equals(b.getNegative())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_9BB(Decision d,
			Assignment a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpD = _edge_positive.getSrc();
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			EObject tmpA = _edge_positive.getTrg();
			if (tmpA instanceof Assignment) {
				Assignment a = (Assignment) tmpA;
				if (a.equals(d.getPositive())) {
					Statement tmpB = d.getNegative();
					if (tmpB instanceof Decision) {
						Decision b = (Decision) tmpB;
						if (!b.equals(d)) {
							if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_1B(a) == null) {
								if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_2B(
										a) == null) {
									if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_3B(
											a) == null) {
										if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_9BB(d,
												a) == null) {
											if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_0BBB(
													a, b, d) == null) {
												if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_4BB(
														b, d) == null) {
													if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_5B(
															b) == null) {
														if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_6B(
																b) == null) {
															if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_7B(
																	b) == null) {
																if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_8BB(
																		b, a) == null) {
																	_result.add(
																			new Object[] { a, b, d, _edge_positive });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decassdec2branchcmdbranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			decassdec2branchcmdbranch _this, Match match, Assignment a, Decision b, Decision d) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, b, d);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decassdec2branchcmdbranch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decassdec2branchcmdbranch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decassdec2branchcmdbranch_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_1_prepare_blackB(
			decassdec2branchcmdbranch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("y");
		EObject _localVariable_1 = targetMatch.getObject("c");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = sourceMatch.getObject("b");
		EObject _localVariable_4 = sourceMatch.getObject("d");
		EObject _localVariable_5 = targetMatch.getObject("x");
		EObject tmpY = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpX = _localVariable_5;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpA instanceof Assignment) {
					Assignment a = (Assignment) tmpA;
					if (tmpB instanceof Decision) {
						Decision b = (Decision) tmpB;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpX instanceof Command) {
								Command x = (Command) tmpX;
								return new Object[] { y, c, a, b, d, x, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_blackBBBBBBBB(Branch y,
			Branch c, Assignment a, Decision b, Decision d, Command x, Match sourceMatch, Match targetMatch) {
		if (!c.equals(y)) {
			if (!b.equals(d)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { y, c, a, b, d, x, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding = pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding != null) {
			Branch y = (Branch) result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding[0];
			Branch c = (Branch) result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding[1];
			Assignment a = (Assignment) result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding[2];
			Decision b = (Decision) result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding[3];
			Decision d = (Decision) result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding[4];
			Command x = (Command) result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_black = pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_blackBBBBBBBB(
					y, c, a, b, d, x, sourceMatch, targetMatch);
			if (result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { y, c, a, b, d, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_3_solvecsp_bindingFBBBBBBBBB(
			decassdec2branchcmdbranch _this, Branch y, Branch c, Assignment a, Decision b, Decision d, Command x,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(y, c, a, b, d, x, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, y, c, a, b, d, x, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			decassdec2branchcmdbranch _this, Branch y, Branch c, Assignment a, Decision b, Decision d, Command x,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decassdec2branchcmdbranch_24_3_solvecsp_binding = pattern_decassdec2branchcmdbranch_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, y, c, a, b, d, x, sourceMatch, targetMatch);
		if (result_pattern_decassdec2branchcmdbranch_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_24_3_solvecsp_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_24_3_solvecsp_black = pattern_decassdec2branchcmdbranch_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decassdec2branchcmdbranch_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, y, c, a, b, d, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decassdec2branchcmdbranch_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decassdec2branchcmdbranch_24_5_matchcorrcontext_blackBFBBB(Branch c,
			Decision d, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				if (d.equals(d2c.getSource())) {
					_result.add(new Object[] { c, d2c, d, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_5_matchcorrcontext_greenBBBF(S2B d2c,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "decassdec2branchcmdbranch";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_6_createcorrespondence_blackBBBBBBB(Branch y,
			Branch c, Assignment a, Decision b, Decision d, Command x, CCMatch ccMatch) {
		if (!c.equals(y)) {
			if (!b.equals(d)) {
				return new Object[] { y, c, a, b, d, x, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_6_createcorrespondence_greenBBBFBFB(Branch y,
			Assignment a, Decision b, Command x, CCMatch ccMatch) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { y, a, b, a2x, x, b2y, ccMatch };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "decassdec2branchcmdbranch";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_decassdec2branchcmdbranch_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_0BBB(Assignment a,
			Decision b, Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_a_negative_687726 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!b.equals(__DEC_a_negative_687726)) {
					if (!d.equals(__DEC_a_negative_687726)) {
						return new Object[] { a, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_1B(Assignment a) {
		for (While __DEC_a_first_684013 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_2B(Assignment a) {
		for (While __DEC_a_last_822716 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_3B(Assignment a) {
		for (Program __DEC_a_first_608427 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_4BB(Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_b_positive_410093 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!b.equals(__DEC_b_positive_410093)) {
					if (!d.equals(__DEC_b_positive_410093)) {
						return new Object[] { b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_5B(Decision b) {
		for (While __DEC_b_first_400548 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_6B(Decision b) {
		for (While __DEC_b_last_919979 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_7B(Decision b) {
		for (Program __DEC_b_first_419527 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_8BB(Decision b,
			Assignment a) {
		if (a.equals(b.getNegative())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_9BB(Decision d,
			Assignment a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_blackBBB(Assignment a,
			Decision b, Decision d) {
		if (!b.equals(d)) {
			if (a.equals(d.getPositive())) {
				if (b.equals(d.getNegative())) {
					if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_0BBB(a, b, d) == null) {
						if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_1B(a) == null) {
							if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_2B(a) == null) {
								if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_3B(a) == null) {
									if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_4BB(b,
											d) == null) {
										if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_5B(
												b) == null) {
											if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_6B(
													b) == null) {
												if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_7B(
														b) == null) {
													if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_8BB(
															b, a) == null) {
														if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_9BB(
																d, a) == null) {
															return new Object[] { a, b, d };
														}
													}
												}
											}
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

	public static final boolean pattern_decassdec2branchcmdbranch_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decassdec2branchcmdbranch_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_0B(Branch y) {
		for (Graph __DEC_y_root_29204 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_1BB(Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_positive_578677 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_y_positive_578677)) {
					if (!c.equals(__DEC_y_positive_578677)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_2BB(Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_negative_504014 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_y_negative_504014)) {
					if (!c.equals(__DEC_y_negative_504014)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_3B(Command x) {
		for (Graph __DEC_x_root_207937 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_4BBB(Command x,
			Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_positive_391372 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_x_positive_391372)) {
					if (!c.equals(__DEC_x_positive_391372)) {
						return new Object[] { x, y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_5BBB(Command x,
			Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_negative_769829 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_x_negative_769829)) {
					if (!c.equals(__DEC_x_negative_769829)) {
						return new Object[] { x, y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_6BB(Branch y,
			Command x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_7BB(Branch y,
			Command x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_8BB(Branch c,
			Command x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_blackBBB(Branch y, Branch c,
			Command x) {
		if (!c.equals(y)) {
			if (x.equals(c.getPositive())) {
				if (y.equals(c.getNegative())) {
					if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_0B(y) == null) {
						if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_1BB(y, c) == null) {
							if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_2BB(y, c) == null) {
								if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_3B(x) == null) {
									if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_4BBB(x, y,
											c) == null) {
										if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_5BBB(x, y,
												c) == null) {
											if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_6BB(y,
													x) == null) {
												if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_7BB(
														y, x) == null) {
													if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_8BB(
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
		return null;
	}

	public static final boolean pattern_decassdec2branchcmdbranch_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decassdec2branchcmdbranch_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_29_1_createresult_blackB(
			decassdec2branchcmdbranch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decassdec2branchcmdbranch_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_decassdec2branchcmdbranch_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									d2c) == null) {
								if (pattern_decassdec2branchcmdbranch_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										c) == null) {
									if (pattern_decassdec2branchcmdbranch_29_2_isapplicablecore_black_nac_2BB(
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

	public static final Object[] pattern_decassdec2branchcmdbranch_29_3_solveCSP_bindingFBBBBBB(
			decassdec2branchcmdbranch _this, IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, c, d2c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_29_3_solveCSP_bindingAndBlackFBBBBBB(
			decassdec2branchcmdbranch _this, IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decassdec2branchcmdbranch_29_3_solveCSP_binding = pattern_decassdec2branchcmdbranch_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, c, d2c, d, ruleResult);
		if (result_pattern_decassdec2branchcmdbranch_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_29_3_solveCSP_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_29_3_solveCSP_black = pattern_decassdec2branchcmdbranch_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decassdec2branchcmdbranch_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decassdec2branchcmdbranch_29_4_checkCSP_expressionFBB(
			decassdec2branchcmdbranch _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_29_5_checknacs_blackBBB(Branch c, S2B d2c,
			Decision d) {
		return new Object[] { c, d2c, d };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_29_6_perform_blackBBBB(Branch c, S2B d2c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { c, d2c, d, ruleResult };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_29_6_perform_greenFBFFFBFFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		Decision b = SourcecodeFactory.eINSTANCE.createDecision();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		c.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { y, c, a, b, a2x, d, x, b2y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decassdec2branchcmdbranch_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decassdec2branchcmdbranchImpl
