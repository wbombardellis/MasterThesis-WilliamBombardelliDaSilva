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
	public boolean isAppropriate_FWD(Match match, Decision b, Decision d, Assignment a) {

		Object[] result1_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_0_1_initialbindings_blackBBBBB(this, match, b, d, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, b, d, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_0_4_collectelementstobetranslated_blackBBBB(match, b, d, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
			}
			decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_0_4_collectelementstobetranslated_greenBBBBFF(match, b, d, a);
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_0_5_collectcontextelements_blackBBBB(match, b, d, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
			}
			decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_0_5_collectcontextelements_greenBB(match,
					d);

			// 
			decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_0_6_registerobjectstomatch_expressionBBBBB(this, match, b, d, a);
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
		Decision b = (Decision) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		Assignment a = (Assignment) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_1_1_performtransformation_greenFFBFBBF(c, b, a);
		Command x = (Command) result1_green[0];
		S2N a2x = (S2N) result1_green[1];
		S2B b2y = (S2B) result1_green[3];
		Branch y = (Branch) result1_green[6];

		Object[] result2_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_1_2_collecttranslatedelements_blackBBBBBB(x, a2x, b2y, b, a, y);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[a2x] = " + a2x + ", "
							+ "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_1_2_collecttranslatedelements_greenFBBBBBB(x, a2x, b2y, b, a, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, x, a2x, c, b2y,
						b, d2c, d, a, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[x] = " + x + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c + ", " + "[b2y] = " + b2y
					+ ", " + "[b] = " + b + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[a] = " + a + ", "
					+ "[y] = " + y + ".");
		}
		decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, x, a2x, c, b2y, b, d, a, y);
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[16];

		// 
		// 
		decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, x, a2x, c, b2y, b, d2c, d, a, y);
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
		Decision b = (Decision) result2_binding[0];
		Decision d = (Decision) result2_binding[1];
		Assignment a = (Assignment) result2_binding[2];
		for (Object[] result2_black : decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_2_2_corematch_blackFBFBBB(b, d, a, match)) {
			Branch c = (Branch) result2_black[0];
			S2B d2c = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_2_3_findcontext_blackBBBBB(c, b, d2c, d, a)) {
				Object[] result3_green = decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_2_3_findcontext_greenBBBBBFFFFF(c, b, d2c, d, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								c, b, d2c, d, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[b] = " + b
							+ ", " + "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Decision b, Decision d, Assignment a) {
		match.registerObject("b", b);
		match.registerObject("d", d);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision b, Decision d, Assignment a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch c, Decision b, S2B d2c, Decision d,
			Assignment a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("d2c", d2c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject x, EObject a2x, EObject c, EObject b2y,
			EObject b, EObject d2c, EObject d, EObject a, EObject y) {
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("d", d);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command x, Branch c, Branch y) {

		Object[] result1_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_10_1_initialbindings_blackBBBBB(this, match, x, c, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, x, c, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_10_4_collectelementstobetranslated_blackBBBB(match, x, c, y);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
			}
			decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_10_4_collectelementstobetranslated_greenBBBBFF(match, x, c, y);
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[5];

			Object[] result5_black = decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_10_5_collectcontextelements_blackBBBB(match, x, c, y);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
			}
			decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_10_5_collectcontextelements_greenBB(match,
					c);

			// 
			decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, x, c, y);
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
		Command x = (Command) result1_bindingAndBlack[0];
		Branch c = (Branch) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		Branch y = (Branch) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_11_1_performtransformation_greenBFFFBFB(x, d, y);
		S2N a2x = (S2N) result1_green[1];
		S2B b2y = (S2B) result1_green[2];
		Decision b = (Decision) result1_green[3];
		Assignment a = (Assignment) result1_green[5];

		Object[] result2_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_11_2_collecttranslatedelements_blackBBBBBB(x, a2x, b2y, b, a, y);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[a2x] = " + a2x + ", "
							+ "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_11_2_collecttranslatedelements_greenFBBBBBB(x, a2x, b2y, b, a, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, x, a2x, c, b2y,
						b, d2c, d, a, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[x] = " + x + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c + ", " + "[b2y] = " + b2y
					+ ", " + "[b] = " + b + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[a] = " + a + ", "
					+ "[y] = " + y + ".");
		}
		decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, x, a2x, c, b2y, b, d, a, y);
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[16];

		// 
		// 
		decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, x, a2x, c, b2y, b, d2c, d, a, y);
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
		Command x = (Command) result2_binding[0];
		Branch c = (Branch) result2_binding[1];
		Branch y = (Branch) result2_binding[2];
		for (Object[] result2_black : decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_12_2_corematch_blackBBFFBB(x, c, y, match)) {
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[3];
			// ForEach 
			for (Object[] result3_black : decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_12_3_findcontext_blackBBBBB(x, c, d2c, d, y)) {
				Object[] result3_green = decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_12_3_findcontext_greenBBBBBFFFFF(x, c, d2c, d, y);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, x, c, d2c, d, y);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[x] = " + x + ", " + "[c] = " + c
							+ ", " + "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[y] = " + y + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Command x, Branch c, Branch y) {
		match.registerObject("x", x);
		match.registerObject("c", c);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command x, Branch c, Branch y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command x, Branch c, S2B d2c, Decision d,
			Branch y) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject x, EObject a2x, EObject c, EObject b2y,
			EObject b, EObject d2c, EObject d, EObject a, EObject y) {
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("d", d);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_22(EMoflonEdge _edge_positive) {

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
			Command x = (Command) result2_black[0];
			Branch c = (Branch) result2_black[1];
			Branch y = (Branch) result2_black[2];
			Object[] result2_green = decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, x, c, y)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_22(EMoflonEdge _edge_positive) {

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
			Decision b = (Decision) result2_black[0];
			Decision d = (Decision) result2_black[1];
			Assignment a = (Assignment) result2_black[2];
			Object[] result2_green = decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decassdec2branchcmdbranchImpl
					.pattern_decassdec2branchcmdbranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, b, d, a)) {
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
		Command x = (Command) result2_bindingAndBlack[0];
		Branch c = (Branch) result2_bindingAndBlack[1];
		Decision b = (Decision) result2_bindingAndBlack[2];
		Decision d = (Decision) result2_bindingAndBlack[3];
		Assignment a = (Assignment) result2_bindingAndBlack[4];
		Branch y = (Branch) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, x, c, b, d, a, y,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[x] = " + x + ", " + "[c] = " + c + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = "
					+ a + ", " + "[y] = " + y + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
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
						.pattern_decassdec2branchcmdbranch_24_6_createcorrespondence_blackBBBBBBB(x, c, b, d, a, y,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", "
							+ "[c] = " + c + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ", "
							+ "[y] = " + y + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decassdec2branchcmdbranchImpl
						.pattern_decassdec2branchcmdbranch_24_6_createcorrespondence_greenBFFBBBB(x, b, a, y, ccMatch);
				//nothing S2N a2x = (S2N) result6_green[1];
				//nothing S2B b2y = (S2B) result6_green[2];

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
	public CSP isApplicable_solveCsp_CC(Command x, Branch c, Decision b, Decision d, Assignment a, Branch y,
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
	public boolean checkDEC_FWD(Decision b, Decision d, Assignment a) {// 
		Object[] result1_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_blackBBB(b, d, a);
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
	public boolean checkDEC_BWD(Command x, Branch c, Branch y) {// 
		Object[] result1_black = decassdec2branchcmdbranchImpl
				.pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_blackBBB(x, c, y);
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
					decassdec2branchcmdbranchImpl.pattern_decassdec2branchcmdbranch_29_6_perform_greenFFBFFBFFB(c, d,
							ruleResult);
					//nothing Command x = (Command) result6_green[0];
					//nothing S2N a2x = (S2N) result6_green[1];
					//nothing S2B b2y = (S2B) result6_green[3];
					//nothing Decision b = (Decision) result6_green[4];
					//nothing Assignment a = (Assignment) result6_green[6];
					//nothing Branch y = (Branch) result6_green[7];

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
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_FWD__MATCH_DECISION_DECISION_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (Decision) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_DECISION_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Decision) arguments.get(2), (Assignment) arguments.get(3));
			return null;
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_DECISION_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Decision) arguments.get(2), (Assignment) arguments.get(3));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_DECISION_S2B_DECISION_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Decision) arguments.get(2), (S2B) arguments.get(3), (Decision) arguments.get(4),
					(Assignment) arguments.get(5));
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
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
			return null;
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_BRANCH_S2B_DECISION_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (Decision) arguments.get(4),
					(Branch) arguments.get(5));
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
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_BWD_EMOFLON_EDGE_22__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_22((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_22__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_22((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_SOLVE_CSP_CC__COMMAND_BRANCH_DECISION_DECISION_ASSIGNMENT_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Command) arguments.get(0), (Branch) arguments.get(1),
					(Decision) arguments.get(2), (Decision) arguments.get(3), (Assignment) arguments.get(4),
					(Branch) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___CHECK_DEC_FWD__DECISION_DECISION_ASSIGNMENT:
			return checkDEC_FWD((Decision) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2));
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2));
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
			decassdec2branchcmdbranch _this, Match match, Decision b, Decision d, Assignment a) {
		if (!b.equals(d)) {
			return new Object[] { _this, match, b, d, a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_0_2_SolveCSP_bindingFBBBBB(
			decassdec2branchcmdbranch _this, Match match, Decision b, Decision d, Assignment a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, d, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, d, a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_0_2_SolveCSP_bindingAndBlackFBBBBB(
			decassdec2branchcmdbranch _this, Match match, Decision b, Decision d, Assignment a) {
		Object[] result_pattern_decassdec2branchcmdbranch_0_2_SolveCSP_binding = pattern_decassdec2branchcmdbranch_0_2_SolveCSP_bindingFBBBBB(
				_this, match, b, d, a);
		if (result_pattern_decassdec2branchcmdbranch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_0_2_SolveCSP_black = pattern_decassdec2branchcmdbranch_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decassdec2branchcmdbranch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, d, a };
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
			Match match, Decision b, Decision d, Assignment a) {
		if (!b.equals(d)) {
			return new Object[] { match, b, d, a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Decision b, Decision d, Assignment a) {
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

	public static final Object[] pattern_decassdec2branchcmdbranch_0_5_collectcontextelements_blackBBBB(Match match,
			Decision b, Decision d, Assignment a) {
		if (!b.equals(d)) {
			return new Object[] { match, b, d, a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_0_5_collectcontextelements_greenBB(Match match,
			Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decassdec2branchcmdbranch_0_6_registerobjectstomatch_expressionBBBBB(
			decassdec2branchcmdbranch _this, Match match, Decision b, Decision d, Assignment a) {
		_this.registerObjectsToMatch_FWD(match, b, d, a);

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
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("a");
		EObject tmpC = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpA = _localVariable_4;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpB instanceof Decision) {
				Decision b = (Decision) tmpB;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpA instanceof Assignment) {
							Assignment a = (Assignment) tmpA;
							return new Object[] { c, b, d2c, d, a, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_1_1_performtransformation_blackBBBBBFBB(Branch c,
			Decision b, S2B d2c, Decision d, Assignment a, decassdec2branchcmdbranch _this,
			IsApplicableMatch isApplicableMatch) {
		if (!b.equals(d)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { c, b, d2c, d, a, csp, _this, isApplicableMatch };
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
			Decision b = (Decision) result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_binding[3];
			Assignment a = (Assignment) result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_binding[4];

			Object[] result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_black = pattern_decassdec2branchcmdbranch_1_1_performtransformation_blackBBBBBFBB(
					c, b, d2c, d, a, _this, isApplicableMatch);
			if (result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_1_1_performtransformation_black[5];

				return new Object[] { c, b, d2c, d, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_1_1_performtransformation_greenFFBFBBF(Branch c,
			Decision b, Assignment a) {
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		c.setPositive(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		b2y.setSource(b);
		c.setNegative(y);
		b2y.setTarget(y);
		return new Object[] { x, a2x, c, b2y, b, a, y };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_1_2_collecttranslatedelements_blackBBBBBB(Command x,
			S2N a2x, S2B b2y, Decision b, Assignment a, Branch y) {
		return new Object[] { x, a2x, b2y, b, a, y };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_1_2_collecttranslatedelements_greenFBBBBBB(Command x,
			S2N a2x, S2B b2y, Decision b, Assignment a, Branch y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(y);
		return new Object[] { ruleresult, x, a2x, b2y, b, a, y };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject x, EObject a2x, EObject c, EObject b2y, EObject b, EObject d2c,
			EObject d, EObject a, EObject y) {
		if (!x.equals(y)) {
			if (!a2x.equals(x)) {
				if (!a2x.equals(c)) {
					if (!a2x.equals(b2y)) {
						if (!a2x.equals(b)) {
							if (!a2x.equals(d2c)) {
								if (!a2x.equals(d)) {
									if (!a2x.equals(y)) {
										if (!c.equals(x)) {
											if (!c.equals(d2c)) {
												if (!c.equals(d)) {
													if (!c.equals(y)) {
														if (!b2y.equals(x)) {
															if (!b2y.equals(c)) {
																if (!b2y.equals(d2c)) {
																	if (!b2y.equals(d)) {
																		if (!b2y.equals(y)) {
																			if (!b.equals(x)) {
																				if (!b.equals(c)) {
																					if (!b.equals(b2y)) {
																						if (!b.equals(d2c)) {
																							if (!b.equals(d)) {
																								if (!b.equals(y)) {
																									if (!d2c.equals(
																											x)) {
																										if (!d2c.equals(
																												y)) {
																											if (!d.equals(
																													x)) {
																												if (!d.equals(
																														d2c)) {
																													if (!d.equals(
																															y)) {
																														if (!a.equals(
																																x)) {
																															if (!a.equals(
																																	a2x)) {
																																if (!a.equals(
																																		c)) {
																																	if (!a.equals(
																																			b2y)) {
																																		if (!a.equals(
																																				b)) {
																																			if (!a.equals(
																																					d2c)) {
																																				if (!a.equals(
																																						d)) {
																																					if (!a.equals(
																																							y)) {
																																						return new Object[] {
																																								ruleresult,
																																								x,
																																								a2x,
																																								c,
																																								b2y,
																																								b,
																																								d2c,
																																								d,
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

	public static final Object[] pattern_decassdec2branchcmdbranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject x, EObject a2x, EObject c, EObject b2y, EObject b, EObject d,
			EObject a, EObject y) {
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decassdec2branchcmdbranch";
		String a2x__x____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String b2y__b____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String d__b____negative_name_prime = "negative";
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { ruleresult, x, a2x, c, b2y, b, d, a, y, a2x__x____target, c__x____positive,
				c__y____negative, b2y__b____source, d__a____positive, a2x__a____source, b2y__y____target,
				d__b____negative };
	}

	public static final void pattern_decassdec2branchcmdbranch_1_5_registerobjects_expressionBBBBBBBBBBB(
			decassdec2branchcmdbranch _this, PerformRuleResult ruleresult, EObject x, EObject a2x, EObject c,
			EObject b2y, EObject b, EObject d2c, EObject d, EObject a, EObject y) {
		_this.registerObjects_FWD(ruleresult, x, a2x, c, b2y, b, d2c, d, a, y);

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
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("d");
		EObject _localVariable_2 = match.getObject("a");
		EObject tmpB = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpA = _localVariable_2;
		if (tmpB instanceof Decision) {
			Decision b = (Decision) tmpB;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (tmpA instanceof Assignment) {
					Assignment a = (Assignment) tmpA;
					return new Object[] { b, d, a, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decassdec2branchcmdbranch_2_2_corematch_blackFBFBBB(Decision b,
			Decision d, Assignment a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { c, b, d2c, d, a, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decassdec2branchcmdbranch_2_3_findcontext_blackBBBBB(Branch c,
			Decision b, S2B d2c, Decision d, Assignment a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			if (a.equals(d.getPositive())) {
				if (c.equals(d2c.getTarget())) {
					if (d.equals(d2c.getSource())) {
						if (b.equals(d.getNegative())) {
							_result.add(new Object[] { c, b, d2c, d, a });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_3_findcontext_greenBBBBBFFFFF(Branch c, Decision b,
			S2B d2c, Decision d, Assignment a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d__a____positive_name_prime = "positive";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(a);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { c, b, d2c, d, a, isApplicableMatch, d__a____positive, d2c__c____target, d2c__d____source,
				d__b____negative };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_4_solveCSP_bindingFBBBBBBB(
			decassdec2branchcmdbranch _this, IsApplicableMatch isApplicableMatch, Branch c, Decision b, S2B d2c,
			Decision d, Assignment a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, b, d2c, d, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, b, d2c, d, a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			decassdec2branchcmdbranch _this, IsApplicableMatch isApplicableMatch, Branch c, Decision b, S2B d2c,
			Decision d, Assignment a) {
		Object[] result_pattern_decassdec2branchcmdbranch_2_4_solveCSP_binding = pattern_decassdec2branchcmdbranch_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, c, b, d2c, d, a);
		if (result_pattern_decassdec2branchcmdbranch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_2_4_solveCSP_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_2_4_solveCSP_black = pattern_decassdec2branchcmdbranch_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decassdec2branchcmdbranch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, b, d2c, d, a };
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
			decassdec2branchcmdbranch _this, Match match, Command x, Branch c, Branch y) {
		if (!c.equals(y)) {
			return new Object[] { _this, match, x, c, y };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_10_2_SolveCSP_bindingFBBBBB(
			decassdec2branchcmdbranch _this, Match match, Command x, Branch c, Branch y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, c, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, c, y };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_10_2_SolveCSP_bindingAndBlackFBBBBB(
			decassdec2branchcmdbranch _this, Match match, Command x, Branch c, Branch y) {
		Object[] result_pattern_decassdec2branchcmdbranch_10_2_SolveCSP_binding = pattern_decassdec2branchcmdbranch_10_2_SolveCSP_bindingFBBBBB(
				_this, match, x, c, y);
		if (result_pattern_decassdec2branchcmdbranch_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_10_2_SolveCSP_black = pattern_decassdec2branchcmdbranch_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decassdec2branchcmdbranch_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, c, y };
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
			Match match, Command x, Branch c, Branch y) {
		if (!c.equals(y)) {
			return new Object[] { match, x, c, y };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Command x, Branch c, Branch y) {
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

	public static final Object[] pattern_decassdec2branchcmdbranch_10_5_collectcontextelements_blackBBBB(Match match,
			Command x, Branch c, Branch y) {
		if (!c.equals(y)) {
			return new Object[] { match, x, c, y };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_10_5_collectcontextelements_greenBB(Match match,
			Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decassdec2branchcmdbranch_10_6_registerobjectstomatch_expressionBBBBB(
			decassdec2branchcmdbranch _this, Match match, Command x, Branch c, Branch y) {
		_this.registerObjectsToMatch_BWD(match, x, c, y);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("x");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("y");
		EObject tmpX = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpY = _localVariable_4;
		if (tmpX instanceof Command) {
			Command x = (Command) tmpX;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpY instanceof Branch) {
							Branch y = (Branch) tmpY;
							return new Object[] { x, c, d2c, d, y, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_11_1_performtransformation_blackBBBBBFBB(Command x,
			Branch c, S2B d2c, Decision d, Branch y, decassdec2branchcmdbranch _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(y)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { x, c, d2c, d, y, csp, _this, isApplicableMatch };
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
			Command x = (Command) result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_binding[0];
			Branch c = (Branch) result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_binding[3];
			Branch y = (Branch) result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_binding[4];

			Object[] result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_black = pattern_decassdec2branchcmdbranch_11_1_performtransformation_blackBBBBBFBB(
					x, c, d2c, d, y, _this, isApplicableMatch);
			if (result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_11_1_performtransformation_black[5];

				return new Object[] { x, c, d2c, d, y, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_11_1_performtransformation_greenBFFFBFB(Command x,
			Decision d, Branch y) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision b = SourcecodeFactory.eINSTANCE.createDecision();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		a2x.setTarget(x);
		b2y.setTarget(y);
		b2y.setSource(b);
		d.setNegative(b);
		d.setPositive(a);
		a2x.setSource(a);
		return new Object[] { x, a2x, b2y, b, d, a, y };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_11_2_collecttranslatedelements_blackBBBBBB(Command x,
			S2N a2x, S2B b2y, Decision b, Assignment a, Branch y) {
		return new Object[] { x, a2x, b2y, b, a, y };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_11_2_collecttranslatedelements_greenFBBBBBB(
			Command x, S2N a2x, S2B b2y, Decision b, Assignment a, Branch y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(y);
		return new Object[] { ruleresult, x, a2x, b2y, b, a, y };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject x, EObject a2x, EObject c, EObject b2y, EObject b, EObject d2c,
			EObject d, EObject a, EObject y) {
		if (!x.equals(y)) {
			if (!a2x.equals(x)) {
				if (!a2x.equals(c)) {
					if (!a2x.equals(b2y)) {
						if (!a2x.equals(b)) {
							if (!a2x.equals(d2c)) {
								if (!a2x.equals(d)) {
									if (!a2x.equals(y)) {
										if (!c.equals(x)) {
											if (!c.equals(d2c)) {
												if (!c.equals(d)) {
													if (!c.equals(y)) {
														if (!b2y.equals(x)) {
															if (!b2y.equals(c)) {
																if (!b2y.equals(d2c)) {
																	if (!b2y.equals(d)) {
																		if (!b2y.equals(y)) {
																			if (!b.equals(x)) {
																				if (!b.equals(c)) {
																					if (!b.equals(b2y)) {
																						if (!b.equals(d2c)) {
																							if (!b.equals(d)) {
																								if (!b.equals(y)) {
																									if (!d2c.equals(
																											x)) {
																										if (!d2c.equals(
																												y)) {
																											if (!d.equals(
																													x)) {
																												if (!d.equals(
																														d2c)) {
																													if (!d.equals(
																															y)) {
																														if (!a.equals(
																																x)) {
																															if (!a.equals(
																																	a2x)) {
																																if (!a.equals(
																																		c)) {
																																	if (!a.equals(
																																			b2y)) {
																																		if (!a.equals(
																																				b)) {
																																			if (!a.equals(
																																					d2c)) {
																																				if (!a.equals(
																																						d)) {
																																					if (!a.equals(
																																							y)) {
																																						return new Object[] {
																																								ruleresult,
																																								x,
																																								a2x,
																																								c,
																																								b2y,
																																								b,
																																								d2c,
																																								d,
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

	public static final Object[] pattern_decassdec2branchcmdbranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject x, EObject a2x, EObject c, EObject b2y, EObject b, EObject d,
			EObject a, EObject y) {
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decassdec2branchcmdbranch";
		String a2x__x____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String b2y__b____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String d__b____negative_name_prime = "negative";
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { ruleresult, x, a2x, c, b2y, b, d, a, y, a2x__x____target, c__x____positive,
				c__y____negative, b2y__b____source, d__a____positive, a2x__a____source, b2y__y____target,
				d__b____negative };
	}

	public static final void pattern_decassdec2branchcmdbranch_11_5_registerobjects_expressionBBBBBBBBBBB(
			decassdec2branchcmdbranch _this, PerformRuleResult ruleresult, EObject x, EObject a2x, EObject c,
			EObject b2y, EObject b, EObject d2c, EObject d, EObject a, EObject y) {
		_this.registerObjects_BWD(ruleresult, x, a2x, c, b2y, b, d2c, d, a, y);

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
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("y");
		EObject tmpX = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpY = _localVariable_2;
		if (tmpX instanceof Command) {
			Command x = (Command) tmpX;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpY instanceof Branch) {
					Branch y = (Branch) tmpY;
					return new Object[] { x, c, y, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decassdec2branchcmdbranch_12_2_corematch_blackBBFFBB(Command x,
			Branch c, Branch y, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(y)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				Statement tmpD = d2c.getSource();
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					_result.add(new Object[] { x, c, d2c, d, y, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decassdec2branchcmdbranch_12_3_findcontext_blackBBBBB(Command x,
			Branch c, S2B d2c, Decision d, Branch y) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(y)) {
			if (x.equals(c.getPositive())) {
				if (y.equals(c.getNegative())) {
					if (c.equals(d2c.getTarget())) {
						if (d.equals(d2c.getSource())) {
							_result.add(new Object[] { x, c, d2c, d, y });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_3_findcontext_greenBBBBBFFFFF(Command x, Branch c,
			S2B d2c, Decision d, Branch y) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(y);
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
		return new Object[] { x, c, d2c, d, y, isApplicableMatch, c__x____positive, c__y____negative, d2c__c____target,
				d2c__d____source };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_4_solveCSP_bindingFBBBBBBB(
			decassdec2branchcmdbranch _this, IsApplicableMatch isApplicableMatch, Command x, Branch c, S2B d2c,
			Decision d, Branch y) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, x, c, d2c, d, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, x, c, d2c, d, y };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			decassdec2branchcmdbranch _this, IsApplicableMatch isApplicableMatch, Command x, Branch c, S2B d2c,
			Decision d, Branch y) {
		Object[] result_pattern_decassdec2branchcmdbranch_12_4_solveCSP_binding = pattern_decassdec2branchcmdbranch_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, x, c, d2c, d, y);
		if (result_pattern_decassdec2branchcmdbranch_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_12_4_solveCSP_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_12_4_solveCSP_black = pattern_decassdec2branchcmdbranch_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decassdec2branchcmdbranch_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, x, c, d2c, d, y };
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

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_0B(Command x) {
		for (Graph __DEC_x_root_102853 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_1BBB(Command x,
			Branch c, Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_positive_302945 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_x_positive_302945)) {
					if (!y.equals(__DEC_x_positive_302945)) {
						return new Object[] { x, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_2BBB(Command x,
			Branch c, Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_negative_287353 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_x_negative_287353)) {
					if (!y.equals(__DEC_x_negative_287353)) {
						return new Object[] { x, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_278721 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_4BB(Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_positive_849677 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_y_positive_849677)) {
					if (!c.equals(__DEC_y_positive_849677)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_5BB(Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_negative_919295 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_y_negative_919295)) {
					if (!c.equals(__DEC_y_negative_919295)) {
						return new Object[] { y, c };
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

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_7BB(Branch c,
			Command x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_8BB(Branch y,
			Command x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_9BB(Branch c,
			Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
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
							if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
								if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_7BB(c,
										x) == null) {
									if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_1BBB(x, c,
											y) == null) {
										if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_2BBB(
												x, c, y) == null) {
											if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_3B(
													y) == null) {
												if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_4BB(
														y, c) == null) {
													if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_5BB(
															y, c) == null) {
														if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_6BB(
																y, x) == null) {
															if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_8BB(
																	y, x) == null) {
																if (pattern_decassdec2branchcmdbranch_20_2_testcorematchandDECs_black_nac_9BB(
																		c, y) == null) {
																	_result.add(
																			new Object[] { x, c, y, _edge_positive });
																}
															}
														}
													}
												}
											}
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
			decassdec2branchcmdbranch _this, Match match, Command x, Branch c, Branch y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, c, y);
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

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_0BB(Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_b_positive_54047 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					Decision.class, "positive")) {
				if (!b.equals(__DEC_b_positive_54047)) {
					if (!d.equals(__DEC_b_positive_54047)) {
						return new Object[] { b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_1B(Decision b) {
		for (While __DEC_b_first_825814 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_2B(Decision b) {
		for (While __DEC_b_last_785733 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_3B(Decision b) {
		for (Program __DEC_b_first_198769 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_4BBB(
			Assignment a, Decision b, Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_a_negative_997838 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!b.equals(__DEC_a_negative_997838)) {
					if (!d.equals(__DEC_a_negative_997838)) {
						return new Object[] { a, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_5B(
			Assignment a) {
		for (While __DEC_a_first_321351 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_6B(
			Assignment a) {
		for (While __DEC_a_last_841250 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_7B(
			Assignment a) {
		for (Program __DEC_a_first_887049 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
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
							if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_5B(a) == null) {
								if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_6B(
										a) == null) {
									if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_7B(
											a) == null) {
										if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_9BB(d,
												a) == null) {
											if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_0BB(
													b, d) == null) {
												if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_1B(
														b) == null) {
													if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_2B(
															b) == null) {
														if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_3B(
																b) == null) {
															if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_4BBB(
																	a, b, d) == null) {
																if (pattern_decassdec2branchcmdbranch_21_2_testcorematchandDECs_black_nac_8BB(
																		b, a) == null) {
																	_result.add(
																			new Object[] { b, d, a, _edge_positive });
																}
															}
														}
													}
												}
											}
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
			decassdec2branchcmdbranch _this, Match match, Decision b, Decision d, Assignment a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, d, a);
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
		EObject _localVariable_0 = targetMatch.getObject("x");
		EObject _localVariable_1 = targetMatch.getObject("c");
		EObject _localVariable_2 = sourceMatch.getObject("b");
		EObject _localVariable_3 = sourceMatch.getObject("d");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject tmpX = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpY = _localVariable_5;
		if (tmpX instanceof Command) {
			Command x = (Command) tmpX;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpB instanceof Decision) {
					Decision b = (Decision) tmpB;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpA instanceof Assignment) {
							Assignment a = (Assignment) tmpA;
							if (tmpY instanceof Branch) {
								Branch y = (Branch) tmpY;
								return new Object[] { x, c, b, d, a, y, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_blackBBBBBBBB(Command x,
			Branch c, Decision b, Decision d, Assignment a, Branch y, Match sourceMatch, Match targetMatch) {
		if (!c.equals(y)) {
			if (!b.equals(d)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { x, c, b, d, a, y, sourceMatch, targetMatch };
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
			Command x = (Command) result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding[0];
			Branch c = (Branch) result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding[1];
			Decision b = (Decision) result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding[2];
			Decision d = (Decision) result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding[3];
			Assignment a = (Assignment) result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding[4];
			Branch y = (Branch) result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_black = pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_blackBBBBBBBB(
					x, c, b, d, a, y, sourceMatch, targetMatch);
			if (result_pattern_decassdec2branchcmdbranch_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { x, c, b, d, a, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_3_solvecsp_bindingFBBBBBBBBB(
			decassdec2branchcmdbranch _this, Command x, Branch c, Decision b, Decision d, Assignment a, Branch y,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(x, c, b, d, a, y, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, x, c, b, d, a, y, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			decassdec2branchcmdbranch _this, Command x, Branch c, Decision b, Decision d, Assignment a, Branch y,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decassdec2branchcmdbranch_24_3_solvecsp_binding = pattern_decassdec2branchcmdbranch_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, x, c, b, d, a, y, sourceMatch, targetMatch);
		if (result_pattern_decassdec2branchcmdbranch_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decassdec2branchcmdbranch_24_3_solvecsp_binding[0];

			Object[] result_pattern_decassdec2branchcmdbranch_24_3_solvecsp_black = pattern_decassdec2branchcmdbranch_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decassdec2branchcmdbranch_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, x, c, b, d, a, y, sourceMatch, targetMatch };
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

	public static final Object[] pattern_decassdec2branchcmdbranch_24_6_createcorrespondence_blackBBBBBBB(Command x,
			Branch c, Decision b, Decision d, Assignment a, Branch y, CCMatch ccMatch) {
		if (!c.equals(y)) {
			if (!b.equals(d)) {
				return new Object[] { x, c, b, d, a, y, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_24_6_createcorrespondence_greenBFFBBBB(Command x,
			Decision b, Assignment a, Branch y, CCMatch ccMatch) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { x, a2x, b2y, b, a, y, ccMatch };
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

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_0BB(Decision b,
			Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_b_positive_509863 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!b.equals(__DEC_b_positive_509863)) {
					if (!d.equals(__DEC_b_positive_509863)) {
						return new Object[] { b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_1B(Decision b) {
		for (While __DEC_b_first_106221 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_2B(Decision b) {
		for (While __DEC_b_last_986278 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_3B(Decision b) {
		for (Program __DEC_b_first_331612 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_4BBB(Assignment a,
			Decision b, Decision d) {
		if (!b.equals(d)) {
			for (Decision __DEC_a_negative_983184 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!b.equals(__DEC_a_negative_983184)) {
					if (!d.equals(__DEC_a_negative_983184)) {
						return new Object[] { a, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_5B(Assignment a) {
		for (While __DEC_a_first_276721 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_6B(Assignment a) {
		for (While __DEC_a_last_32974 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_7B(Assignment a) {
		for (Program __DEC_a_first_28725 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
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

	public static final Object[] pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_blackBBB(Decision b, Decision d,
			Assignment a) {
		if (!b.equals(d)) {
			if (a.equals(d.getPositive())) {
				if (b.equals(d.getNegative())) {
					if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_0BB(b, d) == null) {
						if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_1B(b) == null) {
							if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_2B(b) == null) {
								if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_3B(b) == null) {
									if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_4BBB(a, b,
											d) == null) {
										if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_5B(
												a) == null) {
											if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_6B(
													a) == null) {
												if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_7B(
														a) == null) {
													if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_8BB(
															b, a) == null) {
														if (pattern_decassdec2branchcmdbranch_27_1_matchtggpattern_black_nac_9BB(
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

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_0B(Command x) {
		for (Graph __DEC_x_root_345286 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_1BBB(Command x,
			Branch c, Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_positive_623616 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_x_positive_623616)) {
					if (!y.equals(__DEC_x_positive_623616)) {
						return new Object[] { x, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_2BBB(Command x,
			Branch c, Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_negative_175347 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_x_negative_175347)) {
					if (!y.equals(__DEC_x_negative_175347)) {
						return new Object[] { x, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_544676 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_4BB(Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_positive_813486 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_y_positive_813486)) {
					if (!c.equals(__DEC_y_positive_813486)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_5BB(Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_negative_429844 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_y_negative_429844)) {
					if (!c.equals(__DEC_y_negative_429844)) {
						return new Object[] { y, c };
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

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_7BB(Branch c,
			Command x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_8BB(Branch y,
			Command x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_9BB(Branch c,
			Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_blackBBB(Command x, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			if (x.equals(c.getPositive())) {
				if (y.equals(c.getNegative())) {
					if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_0B(x) == null) {
						if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_1BBB(x, c, y) == null) {
							if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_2BBB(x, c,
									y) == null) {
								if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_3B(y) == null) {
									if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_4BB(y,
											c) == null) {
										if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_5BB(y,
												c) == null) {
											if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_6BB(y,
													x) == null) {
												if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_7BB(
														c, x) == null) {
													if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_8BB(
															y, x) == null) {
														if (pattern_decassdec2branchcmdbranch_28_1_matchtggpattern_black_nac_9BB(
																c, y) == null) {
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

	public static final Object[] pattern_decassdec2branchcmdbranch_29_6_perform_greenFFBFFBFFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision b = SourcecodeFactory.eINSTANCE.createDecision();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.getCorrObjects().add(b2y);
		b2y.setSource(b);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		d.setPositive(a);
		a2x.setSource(a);
		ruleResult.getSourceObjects().add(a);
		c.setNegative(y);
		b2y.setTarget(y);
		ruleResult.getTargetObjects().add(y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { x, a2x, c, b2y, b, d, a, y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decassdec2branchcmdbranch_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decassdec2branchcmdbranchImpl
