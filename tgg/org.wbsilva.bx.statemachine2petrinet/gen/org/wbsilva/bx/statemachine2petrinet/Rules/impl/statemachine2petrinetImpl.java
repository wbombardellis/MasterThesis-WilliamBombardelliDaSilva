/**
 */
package org.wbsilva.bx.statemachine2petrinet.Rules.impl;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;

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

import org.wbsilva.bx.statemachine2petrinet.Rules.RulesPackage;
import org.wbsilva.bx.statemachine2petrinet.Rules.statemachine2petrinet;

import org.wbsilva.bx.statemachine2petrinet.SM2PN;
import org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetFactory;

import petrinet.PNGraph;
import petrinet.PetrinetFactory;

import statemachine.SM;
import statemachine.StatemachineFactory;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import org.wbsilva.bx.statemachine2petrinet.csp.constraints.*;
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
 * An implementation of the model object '<em><b>statemachine2petrinet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class statemachine2petrinetImpl extends AbstractRuleImpl implements statemachine2petrinet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected statemachine2petrinetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getstatemachine2petrinet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SM sm) {

		Object[] result1_black = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_0_1_initialbindings_blackBBB(this, match, sm);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[sm] = " + sm + ".");
		}

		Object[] result2_bindingAndBlack = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_0_2_SolveCSP_bindingAndBlackFBBB(this, match, sm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[sm] = " + sm + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (statemachine2petrinetImpl.pattern_statemachine2petrinet_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = statemachine2petrinetImpl
					.pattern_statemachine2petrinet_0_4_collectelementstobetranslated_blackBB(match, sm);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[sm] = " + sm + ".");
			}
			statemachine2petrinetImpl.pattern_statemachine2petrinet_0_4_collectelementstobetranslated_greenBB(match,
					sm);

			Object[] result5_black = statemachine2petrinetImpl
					.pattern_statemachine2petrinet_0_5_collectcontextelements_blackBB(match, sm);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[sm] = " + sm + ".");
			}
			// 
			statemachine2petrinetImpl.pattern_statemachine2petrinet_0_6_registerobjectstomatch_expressionBBB(this,
					match, sm);
			return statemachine2petrinetImpl.pattern_statemachine2petrinet_0_7_expressionF();
		} else {
			return statemachine2petrinetImpl.pattern_statemachine2petrinet_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SM sm = (SM) result1_bindingAndBlack[0];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_1_1_performtransformation_greenFFB(sm);
		PNGraph png = (PNGraph) result1_green[0];
		SM2PN sm2pn = (SM2PN) result1_green[1];

		Object[] result2_black = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_1_2_collecttranslatedelements_blackBBB(png, sm2pn, sm);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[png] = " + png + ", "
					+ "[sm2pn] = " + sm2pn + ", " + "[sm] = " + sm + ".");
		}
		Object[] result2_green = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_1_2_collecttranslatedelements_greenFBBB(png, sm2pn, sm);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_1_3_bookkeepingforedges_blackBBBB(ruleresult, png, sm2pn, sm);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[png] = " + png + ", " + "[sm2pn] = " + sm2pn + ", " + "[sm] = " + sm + ".");
		}
		statemachine2petrinetImpl.pattern_statemachine2petrinet_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, png,
				sm2pn, sm);
		//nothing EMoflonEdge sm2pn__sm____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge sm2pn__png____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		statemachine2petrinetImpl.pattern_statemachine2petrinet_1_5_registerobjects_expressionBBBBB(this, ruleresult,
				png, sm2pn, sm);
		return statemachine2petrinetImpl.pattern_statemachine2petrinet_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SM sm = (SM) result2_binding[0];
		for (Object[] result2_black : statemachine2petrinetImpl.pattern_statemachine2petrinet_2_2_corematch_blackBB(sm,
				match)) {
			// ForEach 
			for (Object[] result3_black : statemachine2petrinetImpl
					.pattern_statemachine2petrinet_2_3_findcontext_blackB(sm)) {
				Object[] result3_green = statemachine2petrinetImpl
						.pattern_statemachine2petrinet_2_3_findcontext_greenBF(sm);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = statemachine2petrinetImpl
						.pattern_statemachine2petrinet_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, sm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[sm] = " + sm + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (statemachine2petrinetImpl.pattern_statemachine2petrinet_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = statemachine2petrinetImpl
							.pattern_statemachine2petrinet_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					statemachine2petrinetImpl.pattern_statemachine2petrinet_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return statemachine2petrinetImpl.pattern_statemachine2petrinet_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SM sm) {
		match.registerObject("sm", sm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SM sm) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SM sm) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sm", sm);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject png, EObject sm2pn, EObject sm) {
		ruleresult.registerObject("png", png);
		ruleresult.registerObject("sm2pn", sm2pn);
		ruleresult.registerObject("sm", sm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("sm").eClass()).equals("statemachine.SM.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, PNGraph png) {

		Object[] result1_black = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_10_1_initialbindings_blackBBB(this, match, png);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[png] = " + png + ".");
		}

		Object[] result2_bindingAndBlack = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_10_2_SolveCSP_bindingAndBlackFBBB(this, match, png);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[png] = " + png + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (statemachine2petrinetImpl.pattern_statemachine2petrinet_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = statemachine2petrinetImpl
					.pattern_statemachine2petrinet_10_4_collectelementstobetranslated_blackBB(match, png);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[png] = " + png + ".");
			}
			statemachine2petrinetImpl.pattern_statemachine2petrinet_10_4_collectelementstobetranslated_greenBB(match,
					png);

			Object[] result5_black = statemachine2petrinetImpl
					.pattern_statemachine2petrinet_10_5_collectcontextelements_blackBB(match, png);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[png] = " + png + ".");
			}
			// 
			statemachine2petrinetImpl.pattern_statemachine2petrinet_10_6_registerobjectstomatch_expressionBBB(this,
					match, png);
			return statemachine2petrinetImpl.pattern_statemachine2petrinet_10_7_expressionF();
		} else {
			return statemachine2petrinetImpl.pattern_statemachine2petrinet_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_11_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PNGraph png = (PNGraph) result1_bindingAndBlack[0];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_11_1_performtransformation_greenBFF(png);
		SM2PN sm2pn = (SM2PN) result1_green[1];
		SM sm = (SM) result1_green[2];

		Object[] result2_black = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_11_2_collecttranslatedelements_blackBBB(png, sm2pn, sm);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[png] = " + png + ", "
					+ "[sm2pn] = " + sm2pn + ", " + "[sm] = " + sm + ".");
		}
		Object[] result2_green = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_11_2_collecttranslatedelements_greenFBBB(png, sm2pn, sm);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_11_3_bookkeepingforedges_blackBBBB(ruleresult, png, sm2pn, sm);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[png] = " + png + ", " + "[sm2pn] = " + sm2pn + ", " + "[sm] = " + sm + ".");
		}
		statemachine2petrinetImpl.pattern_statemachine2petrinet_11_3_bookkeepingforedges_greenBBBBFF(ruleresult, png,
				sm2pn, sm);
		//nothing EMoflonEdge sm2pn__sm____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge sm2pn__png____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		statemachine2petrinetImpl.pattern_statemachine2petrinet_11_5_registerobjects_expressionBBBBB(this, ruleresult,
				png, sm2pn, sm);
		return statemachine2petrinetImpl.pattern_statemachine2petrinet_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		PNGraph png = (PNGraph) result2_binding[0];
		for (Object[] result2_black : statemachine2petrinetImpl
				.pattern_statemachine2petrinet_12_2_corematch_blackBB(png, match)) {
			// ForEach 
			for (Object[] result3_black : statemachine2petrinetImpl
					.pattern_statemachine2petrinet_12_3_findcontext_blackB(png)) {
				Object[] result3_green = statemachine2petrinetImpl
						.pattern_statemachine2petrinet_12_3_findcontext_greenBF(png);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = statemachine2petrinetImpl
						.pattern_statemachine2petrinet_12_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, png);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[png] = " + png + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (statemachine2petrinetImpl.pattern_statemachine2petrinet_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = statemachine2petrinetImpl
							.pattern_statemachine2petrinet_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					statemachine2petrinetImpl.pattern_statemachine2petrinet_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return statemachine2petrinetImpl.pattern_statemachine2petrinet_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, PNGraph png) {
		match.registerObject("png", png);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, PNGraph png) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, PNGraph png) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("png", png);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject png, EObject sm2pn, EObject sm) {
		ruleresult.registerObject("png", png);
		ruleresult.registerObject("sm2pn", sm2pn);
		ruleresult.registerObject("sm", sm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("png").eClass()).equals("petrinet.PNGraph.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_PNGraph_2(PNGraph png) {

		Object[] result1_bindingAndBlack = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : statemachine2petrinetImpl
				.pattern_statemachine2petrinet_20_2_testcorematchandDECs_blackB(png)) {
			Object[] result2_green = statemachine2petrinetImpl
					.pattern_statemachine2petrinet_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (statemachine2petrinetImpl
					.pattern_statemachine2petrinet_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, png)) {
				// 
				if (statemachine2petrinetImpl
						.pattern_statemachine2petrinet_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = statemachine2petrinetImpl
							.pattern_statemachine2petrinet_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					statemachine2petrinetImpl.pattern_statemachine2petrinet_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return statemachine2petrinetImpl.pattern_statemachine2petrinet_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_SM_0(SM sm) {

		Object[] result1_bindingAndBlack = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : statemachine2petrinetImpl
				.pattern_statemachine2petrinet_21_2_testcorematchandDECs_blackB(sm)) {
			Object[] result2_green = statemachine2petrinetImpl
					.pattern_statemachine2petrinet_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (statemachine2petrinetImpl
					.pattern_statemachine2petrinet_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, sm)) {
				// 
				if (statemachine2petrinetImpl
						.pattern_statemachine2petrinet_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = statemachine2petrinetImpl
							.pattern_statemachine2petrinet_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					statemachine2petrinetImpl.pattern_statemachine2petrinet_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return statemachine2petrinetImpl.pattern_statemachine2petrinet_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("statemachine2petrinet");
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
		ruleResult.setRule("statemachine2petrinet");
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

		Object[] result1_black = statemachine2petrinetImpl.pattern_statemachine2petrinet_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = statemachine2petrinetImpl.pattern_statemachine2petrinet_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_24_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		PNGraph png = (PNGraph) result2_bindingAndBlack[0];
		SM sm = (SM) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_24_3_solvecsp_bindingAndBlackFBBBBB(this, png, sm, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[png] = " + png + ", " + "[sm] = " + sm + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (statemachine2petrinetImpl.pattern_statemachine2petrinet_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : statemachine2petrinetImpl
					.pattern_statemachine2petrinet_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = statemachine2petrinetImpl
						.pattern_statemachine2petrinet_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = statemachine2petrinetImpl
						.pattern_statemachine2petrinet_24_6_createcorrespondence_blackBBB(png, sm, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[png] = " + png + ", "
							+ "[sm] = " + sm + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				statemachine2petrinetImpl.pattern_statemachine2petrinet_24_6_createcorrespondence_greenBFBB(png, sm,
						ccMatch);
				//nothing SM2PN sm2pn = (SM2PN) result6_green[1];

				Object[] result7_black = statemachine2petrinetImpl
						.pattern_statemachine2petrinet_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				statemachine2petrinetImpl.pattern_statemachine2petrinet_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return statemachine2petrinetImpl.pattern_statemachine2petrinet_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(PNGraph png, SM sm, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(SM sm) {// 
		Object[] result1_black = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_27_1_matchtggpattern_blackB(sm);
		if (result1_black != null) {
			return statemachine2petrinetImpl.pattern_statemachine2petrinet_27_2_expressionF();
		} else {
			return statemachine2petrinetImpl.pattern_statemachine2petrinet_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(PNGraph png) {// 
		Object[] result1_black = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_28_1_matchtggpattern_blackB(png);
		if (result1_black != null) {
			return statemachine2petrinetImpl.pattern_statemachine2petrinet_28_2_expressionF();
		} else {
			return statemachine2petrinetImpl.pattern_statemachine2petrinet_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = statemachine2petrinetImpl.pattern_statemachine2petrinet_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = statemachine2petrinetImpl.pattern_statemachine2petrinet_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = statemachine2petrinetImpl
				.pattern_statemachine2petrinet_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = statemachine2petrinetImpl
					.pattern_statemachine2petrinet_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (statemachine2petrinetImpl.pattern_statemachine2petrinet_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = statemachine2petrinetImpl
						.pattern_statemachine2petrinet_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				statemachine2petrinetImpl.pattern_statemachine2petrinet_29_6_perform_greenFFFB(ruleResult);
				//nothing PNGraph png = (PNGraph) result6_green[0];
				//nothing SM2PN sm2pn = (SM2PN) result6_green[1];
				//nothing SM sm = (SM) result6_green[2];

			} else {
			}

		} else {
		}
		return statemachine2petrinetImpl.pattern_statemachine2petrinet_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
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
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPROPRIATE_FWD__MATCH_SM:
			return isAppropriate_FWD((Match) arguments.get(0), (SM) arguments.get(1));
		case RulesPackage.STATEMACHINE2PETRINET___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SM:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SM) arguments.get(1));
			return null;
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SM:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SM) arguments.get(1));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SM:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (SM) arguments.get(1));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.STATEMACHINE2PETRINET___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPROPRIATE_BWD__MATCH_PNGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (PNGraph) arguments.get(1));
		case RulesPackage.STATEMACHINE2PETRINET___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PNGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (PNGraph) arguments.get(1));
			return null;
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PNGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (PNGraph) arguments.get(1));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PNGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (PNGraph) arguments.get(1));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.STATEMACHINE2PETRINET___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPROPRIATE_BWD_PN_GRAPH_2__PNGRAPH:
			return isAppropriate_BWD_PNGraph_2((PNGraph) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPROPRIATE_FWD_SM_0__SM:
			return isAppropriate_FWD_SM_0((SM) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPLICABLE_SOLVE_CSP_CC__PNGRAPH_SM_MATCH_MATCH:
			return isApplicable_solveCsp_CC((PNGraph) arguments.get(0), (SM) arguments.get(1), (Match) arguments.get(2),
					(Match) arguments.get(3));
		case RulesPackage.STATEMACHINE2PETRINET___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___CHECK_DEC_FWD__SM:
			return checkDEC_FWD((SM) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___CHECK_DEC_BWD__PNGRAPH:
			return checkDEC_BWD((PNGraph) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.STATEMACHINE2PETRINET___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.STATEMACHINE2PETRINET___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_statemachine2petrinet_0_1_initialbindings_blackBBB(statemachine2petrinet _this,
			Match match, SM sm) {
		return new Object[] { _this, match, sm };
	}

	public static final Object[] pattern_statemachine2petrinet_0_2_SolveCSP_bindingFBBB(statemachine2petrinet _this,
			Match match, SM sm) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, sm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, sm };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_statemachine2petrinet_0_2_SolveCSP_bindingAndBlackFBBB(
			statemachine2petrinet _this, Match match, SM sm) {
		Object[] result_pattern_statemachine2petrinet_0_2_SolveCSP_binding = pattern_statemachine2petrinet_0_2_SolveCSP_bindingFBBB(
				_this, match, sm);
		if (result_pattern_statemachine2petrinet_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_statemachine2petrinet_0_2_SolveCSP_binding[0];

			Object[] result_pattern_statemachine2petrinet_0_2_SolveCSP_black = pattern_statemachine2petrinet_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_statemachine2petrinet_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, sm };
			}
		}
		return null;
	}

	public static final boolean pattern_statemachine2petrinet_0_3_CheckCSP_expressionFBB(statemachine2petrinet _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_0_4_collectelementstobetranslated_blackBB(Match match,
			SM sm) {
		return new Object[] { match, sm };
	}

	public static final Object[] pattern_statemachine2petrinet_0_4_collectelementstobetranslated_greenBB(Match match,
			SM sm) {
		match.getToBeTranslatedNodes().add(sm);
		return new Object[] { match, sm };
	}

	public static final Object[] pattern_statemachine2petrinet_0_5_collectcontextelements_blackBB(Match match, SM sm) {
		return new Object[] { match, sm };
	}

	public static final void pattern_statemachine2petrinet_0_6_registerobjectstomatch_expressionBBB(
			statemachine2petrinet _this, Match match, SM sm) {
		_this.registerObjectsToMatch_FWD(match, sm);

	}

	public static final boolean pattern_statemachine2petrinet_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_statemachine2petrinet_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("sm");
		EObject tmpSm = _localVariable_0;
		if (tmpSm instanceof SM) {
			SM sm = (SM) tmpSm;
			return new Object[] { sm, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_1_1_performtransformation_blackBFBB(SM sm,
			statemachine2petrinet _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { sm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_1_1_performtransformation_bindingAndBlackFFBB(
			statemachine2petrinet _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_statemachine2petrinet_1_1_performtransformation_binding = pattern_statemachine2petrinet_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_statemachine2petrinet_1_1_performtransformation_binding != null) {
			SM sm = (SM) result_pattern_statemachine2petrinet_1_1_performtransformation_binding[0];

			Object[] result_pattern_statemachine2petrinet_1_1_performtransformation_black = pattern_statemachine2petrinet_1_1_performtransformation_blackBFBB(
					sm, _this, isApplicableMatch);
			if (result_pattern_statemachine2petrinet_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_statemachine2petrinet_1_1_performtransformation_black[1];

				return new Object[] { sm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_1_1_performtransformation_greenFFB(SM sm) {
		PNGraph png = PetrinetFactory.eINSTANCE.createPNGraph();
		SM2PN sm2pn = Statemachine2petrinetFactory.eINSTANCE.createSM2PN();
		sm2pn.setSource(sm);
		sm2pn.setTarget(png);
		return new Object[] { png, sm2pn, sm };
	}

	public static final Object[] pattern_statemachine2petrinet_1_2_collecttranslatedelements_blackBBB(PNGraph png,
			SM2PN sm2pn, SM sm) {
		return new Object[] { png, sm2pn, sm };
	}

	public static final Object[] pattern_statemachine2petrinet_1_2_collecttranslatedelements_greenFBBB(PNGraph png,
			SM2PN sm2pn, SM sm) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(png);
		ruleresult.getCreatedLinkElements().add(sm2pn);
		ruleresult.getTranslatedElements().add(sm);
		return new Object[] { ruleresult, png, sm2pn, sm };
	}

	public static final Object[] pattern_statemachine2petrinet_1_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject png, EObject sm2pn, EObject sm) {
		if (!png.equals(sm2pn)) {
			if (!png.equals(sm)) {
				if (!sm.equals(sm2pn)) {
					return new Object[] { ruleresult, png, sm2pn, sm };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_1_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject png, EObject sm2pn, EObject sm) {
		EMoflonEdge sm2pn__sm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm2pn__png____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "statemachine2petrinet";
		String sm2pn__sm____source_name_prime = "source";
		String sm2pn__png____target_name_prime = "target";
		sm2pn__sm____source.setSrc(sm2pn);
		sm2pn__sm____source.setTrg(sm);
		ruleresult.getCreatedEdges().add(sm2pn__sm____source);
		sm2pn__png____target.setSrc(sm2pn);
		sm2pn__png____target.setTrg(png);
		ruleresult.getCreatedEdges().add(sm2pn__png____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sm2pn__sm____source.setName(sm2pn__sm____source_name_prime);
		sm2pn__png____target.setName(sm2pn__png____target_name_prime);
		return new Object[] { ruleresult, png, sm2pn, sm, sm2pn__sm____source, sm2pn__png____target };
	}

	public static final void pattern_statemachine2petrinet_1_5_registerobjects_expressionBBBBB(
			statemachine2petrinet _this, PerformRuleResult ruleresult, EObject png, EObject sm2pn, EObject sm) {
		_this.registerObjects_FWD(ruleresult, png, sm2pn, sm);

	}

	public static final PerformRuleResult pattern_statemachine2petrinet_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_2_1_preparereturnvalue_bindingFB(
			statemachine2petrinet _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_2_1_preparereturnvalue_blackFBB(EClass eClass,
			statemachine2petrinet _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_2_1_preparereturnvalue_bindingAndBlackFFB(
			statemachine2petrinet _this) {
		Object[] result_pattern_statemachine2petrinet_2_1_preparereturnvalue_binding = pattern_statemachine2petrinet_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_statemachine2petrinet_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_statemachine2petrinet_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_statemachine2petrinet_2_1_preparereturnvalue_black = pattern_statemachine2petrinet_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_statemachine2petrinet_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_statemachine2petrinet_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "statemachine2petrinet";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_statemachine2petrinet_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("sm");
		EObject tmpSm = _localVariable_0;
		if (tmpSm instanceof SM) {
			SM sm = (SM) tmpSm;
			return new Object[] { sm, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_statemachine2petrinet_2_2_corematch_blackBB(SM sm, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { sm, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_statemachine2petrinet_2_3_findcontext_blackB(SM sm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { sm });
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_2_3_findcontext_greenBF(SM sm) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(sm);
		return new Object[] { sm, isApplicableMatch };
	}

	public static final Object[] pattern_statemachine2petrinet_2_4_solveCSP_bindingFBBB(statemachine2petrinet _this,
			IsApplicableMatch isApplicableMatch, SM sm) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, sm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_statemachine2petrinet_2_4_solveCSP_bindingAndBlackFBBB(
			statemachine2petrinet _this, IsApplicableMatch isApplicableMatch, SM sm) {
		Object[] result_pattern_statemachine2petrinet_2_4_solveCSP_binding = pattern_statemachine2petrinet_2_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, sm);
		if (result_pattern_statemachine2petrinet_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_statemachine2petrinet_2_4_solveCSP_binding[0];

			Object[] result_pattern_statemachine2petrinet_2_4_solveCSP_black = pattern_statemachine2petrinet_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_statemachine2petrinet_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm };
			}
		}
		return null;
	}

	public static final boolean pattern_statemachine2petrinet_2_5_checkCSP_expressionFBB(statemachine2petrinet _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_statemachine2petrinet_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "statemachine2petrinet";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_statemachine2petrinet_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_10_1_initialbindings_blackBBB(
			statemachine2petrinet _this, Match match, PNGraph png) {
		return new Object[] { _this, match, png };
	}

	public static final Object[] pattern_statemachine2petrinet_10_2_SolveCSP_bindingFBBB(statemachine2petrinet _this,
			Match match, PNGraph png) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, png);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, png };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_statemachine2petrinet_10_2_SolveCSP_bindingAndBlackFBBB(
			statemachine2petrinet _this, Match match, PNGraph png) {
		Object[] result_pattern_statemachine2petrinet_10_2_SolveCSP_binding = pattern_statemachine2petrinet_10_2_SolveCSP_bindingFBBB(
				_this, match, png);
		if (result_pattern_statemachine2petrinet_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_statemachine2petrinet_10_2_SolveCSP_binding[0];

			Object[] result_pattern_statemachine2petrinet_10_2_SolveCSP_black = pattern_statemachine2petrinet_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_statemachine2petrinet_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, png };
			}
		}
		return null;
	}

	public static final boolean pattern_statemachine2petrinet_10_3_CheckCSP_expressionFBB(statemachine2petrinet _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_10_4_collectelementstobetranslated_blackBB(Match match,
			PNGraph png) {
		return new Object[] { match, png };
	}

	public static final Object[] pattern_statemachine2petrinet_10_4_collectelementstobetranslated_greenBB(Match match,
			PNGraph png) {
		match.getToBeTranslatedNodes().add(png);
		return new Object[] { match, png };
	}

	public static final Object[] pattern_statemachine2petrinet_10_5_collectcontextelements_blackBB(Match match,
			PNGraph png) {
		return new Object[] { match, png };
	}

	public static final void pattern_statemachine2petrinet_10_6_registerobjectstomatch_expressionBBB(
			statemachine2petrinet _this, Match match, PNGraph png) {
		_this.registerObjectsToMatch_BWD(match, png);

	}

	public static final boolean pattern_statemachine2petrinet_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_statemachine2petrinet_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("png");
		EObject tmpPng = _localVariable_0;
		if (tmpPng instanceof PNGraph) {
			PNGraph png = (PNGraph) tmpPng;
			return new Object[] { png, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_11_1_performtransformation_blackBFBB(PNGraph png,
			statemachine2petrinet _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { png, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_11_1_performtransformation_bindingAndBlackFFBB(
			statemachine2petrinet _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_statemachine2petrinet_11_1_performtransformation_binding = pattern_statemachine2petrinet_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_statemachine2petrinet_11_1_performtransformation_binding != null) {
			PNGraph png = (PNGraph) result_pattern_statemachine2petrinet_11_1_performtransformation_binding[0];

			Object[] result_pattern_statemachine2petrinet_11_1_performtransformation_black = pattern_statemachine2petrinet_11_1_performtransformation_blackBFBB(
					png, _this, isApplicableMatch);
			if (result_pattern_statemachine2petrinet_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_statemachine2petrinet_11_1_performtransformation_black[1];

				return new Object[] { png, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_11_1_performtransformation_greenBFF(PNGraph png) {
		SM2PN sm2pn = Statemachine2petrinetFactory.eINSTANCE.createSM2PN();
		SM sm = StatemachineFactory.eINSTANCE.createSM();
		sm2pn.setTarget(png);
		sm2pn.setSource(sm);
		return new Object[] { png, sm2pn, sm };
	}

	public static final Object[] pattern_statemachine2petrinet_11_2_collecttranslatedelements_blackBBB(PNGraph png,
			SM2PN sm2pn, SM sm) {
		return new Object[] { png, sm2pn, sm };
	}

	public static final Object[] pattern_statemachine2petrinet_11_2_collecttranslatedelements_greenFBBB(PNGraph png,
			SM2PN sm2pn, SM sm) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(png);
		ruleresult.getCreatedLinkElements().add(sm2pn);
		ruleresult.getCreatedElements().add(sm);
		return new Object[] { ruleresult, png, sm2pn, sm };
	}

	public static final Object[] pattern_statemachine2petrinet_11_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject png, EObject sm2pn, EObject sm) {
		if (!png.equals(sm2pn)) {
			if (!png.equals(sm)) {
				if (!sm.equals(sm2pn)) {
					return new Object[] { ruleresult, png, sm2pn, sm };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_11_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject png, EObject sm2pn, EObject sm) {
		EMoflonEdge sm2pn__sm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm2pn__png____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "statemachine2petrinet";
		String sm2pn__sm____source_name_prime = "source";
		String sm2pn__png____target_name_prime = "target";
		sm2pn__sm____source.setSrc(sm2pn);
		sm2pn__sm____source.setTrg(sm);
		ruleresult.getCreatedEdges().add(sm2pn__sm____source);
		sm2pn__png____target.setSrc(sm2pn);
		sm2pn__png____target.setTrg(png);
		ruleresult.getCreatedEdges().add(sm2pn__png____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sm2pn__sm____source.setName(sm2pn__sm____source_name_prime);
		sm2pn__png____target.setName(sm2pn__png____target_name_prime);
		return new Object[] { ruleresult, png, sm2pn, sm, sm2pn__sm____source, sm2pn__png____target };
	}

	public static final void pattern_statemachine2petrinet_11_5_registerobjects_expressionBBBBB(
			statemachine2petrinet _this, PerformRuleResult ruleresult, EObject png, EObject sm2pn, EObject sm) {
		_this.registerObjects_BWD(ruleresult, png, sm2pn, sm);

	}

	public static final PerformRuleResult pattern_statemachine2petrinet_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_12_1_preparereturnvalue_bindingFB(
			statemachine2petrinet _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_12_1_preparereturnvalue_blackFBB(EClass eClass,
			statemachine2petrinet _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_12_1_preparereturnvalue_bindingAndBlackFFB(
			statemachine2petrinet _this) {
		Object[] result_pattern_statemachine2petrinet_12_1_preparereturnvalue_binding = pattern_statemachine2petrinet_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_statemachine2petrinet_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_statemachine2petrinet_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_statemachine2petrinet_12_1_preparereturnvalue_black = pattern_statemachine2petrinet_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_statemachine2petrinet_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_statemachine2petrinet_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "statemachine2petrinet";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_statemachine2petrinet_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("png");
		EObject tmpPng = _localVariable_0;
		if (tmpPng instanceof PNGraph) {
			PNGraph png = (PNGraph) tmpPng;
			return new Object[] { png, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_statemachine2petrinet_12_2_corematch_blackBB(PNGraph png,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { png, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_statemachine2petrinet_12_3_findcontext_blackB(PNGraph png) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { png });
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_12_3_findcontext_greenBF(PNGraph png) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(png);
		return new Object[] { png, isApplicableMatch };
	}

	public static final Object[] pattern_statemachine2petrinet_12_4_solveCSP_bindingFBBB(statemachine2petrinet _this,
			IsApplicableMatch isApplicableMatch, PNGraph png) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, png);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, png };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_statemachine2petrinet_12_4_solveCSP_bindingAndBlackFBBB(
			statemachine2petrinet _this, IsApplicableMatch isApplicableMatch, PNGraph png) {
		Object[] result_pattern_statemachine2petrinet_12_4_solveCSP_binding = pattern_statemachine2petrinet_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, png);
		if (result_pattern_statemachine2petrinet_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_statemachine2petrinet_12_4_solveCSP_binding[0];

			Object[] result_pattern_statemachine2petrinet_12_4_solveCSP_black = pattern_statemachine2petrinet_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_statemachine2petrinet_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, png };
			}
		}
		return null;
	}

	public static final boolean pattern_statemachine2petrinet_12_5_checkCSP_expressionFBB(statemachine2petrinet _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_statemachine2petrinet_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "statemachine2petrinet";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_statemachine2petrinet_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_20_1_preparereturnvalue_bindingFB(
			statemachine2petrinet _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			statemachine2petrinet _this) {
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

	public static final Object[] pattern_statemachine2petrinet_20_1_preparereturnvalue_bindingAndBlackFFBF(
			statemachine2petrinet _this) {
		Object[] result_pattern_statemachine2petrinet_20_1_preparereturnvalue_binding = pattern_statemachine2petrinet_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_statemachine2petrinet_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_statemachine2petrinet_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_statemachine2petrinet_20_1_preparereturnvalue_black = pattern_statemachine2petrinet_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_statemachine2petrinet_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_statemachine2petrinet_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_statemachine2petrinet_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_statemachine2petrinet_20_2_testcorematchandDECs_blackB(PNGraph png) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { png });
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_statemachine2petrinet_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			statemachine2petrinet _this, Match match, PNGraph png) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, png);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_statemachine2petrinet_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			statemachine2petrinet _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_statemachine2petrinet_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_21_1_preparereturnvalue_bindingFB(
			statemachine2petrinet _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			statemachine2petrinet _this) {
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

	public static final Object[] pattern_statemachine2petrinet_21_1_preparereturnvalue_bindingAndBlackFFBF(
			statemachine2petrinet _this) {
		Object[] result_pattern_statemachine2petrinet_21_1_preparereturnvalue_binding = pattern_statemachine2petrinet_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_statemachine2petrinet_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_statemachine2petrinet_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_statemachine2petrinet_21_1_preparereturnvalue_black = pattern_statemachine2petrinet_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_statemachine2petrinet_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_statemachine2petrinet_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_statemachine2petrinet_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_statemachine2petrinet_21_2_testcorematchandDECs_blackB(SM sm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { sm });
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_statemachine2petrinet_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			statemachine2petrinet _this, Match match, SM sm) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, sm);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_statemachine2petrinet_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			statemachine2petrinet _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_statemachine2petrinet_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_24_1_prepare_blackB(statemachine2petrinet _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_statemachine2petrinet_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_statemachine2petrinet_24_2_matchsrctrgcontext_bindingFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("png");
		EObject _localVariable_1 = sourceMatch.getObject("sm");
		EObject tmpPng = _localVariable_0;
		EObject tmpSm = _localVariable_1;
		if (tmpPng instanceof PNGraph) {
			PNGraph png = (PNGraph) tmpPng;
			if (tmpSm instanceof SM) {
				SM sm = (SM) tmpSm;
				return new Object[] { png, sm, targetMatch, sourceMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_24_2_matchsrctrgcontext_blackBBBB(PNGraph png, SM sm,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { png, sm, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_24_2_matchsrctrgcontext_bindingAndBlackFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_statemachine2petrinet_24_2_matchsrctrgcontext_binding = pattern_statemachine2petrinet_24_2_matchsrctrgcontext_bindingFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_statemachine2petrinet_24_2_matchsrctrgcontext_binding != null) {
			PNGraph png = (PNGraph) result_pattern_statemachine2petrinet_24_2_matchsrctrgcontext_binding[0];
			SM sm = (SM) result_pattern_statemachine2petrinet_24_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_statemachine2petrinet_24_2_matchsrctrgcontext_black = pattern_statemachine2petrinet_24_2_matchsrctrgcontext_blackBBBB(
					png, sm, sourceMatch, targetMatch);
			if (result_pattern_statemachine2petrinet_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { png, sm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_24_3_solvecsp_bindingFBBBBB(statemachine2petrinet _this,
			PNGraph png, SM sm, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(png, sm, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, png, sm, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_statemachine2petrinet_24_3_solvecsp_bindingAndBlackFBBBBB(
			statemachine2petrinet _this, PNGraph png, SM sm, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_statemachine2petrinet_24_3_solvecsp_binding = pattern_statemachine2petrinet_24_3_solvecsp_bindingFBBBBB(
				_this, png, sm, sourceMatch, targetMatch);
		if (result_pattern_statemachine2petrinet_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_statemachine2petrinet_24_3_solvecsp_binding[0];

			Object[] result_pattern_statemachine2petrinet_24_3_solvecsp_black = pattern_statemachine2petrinet_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_statemachine2petrinet_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, png, sm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_statemachine2petrinet_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_statemachine2petrinet_24_5_matchcorrcontext_blackBB(
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "statemachine2petrinet";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_statemachine2petrinet_24_6_createcorrespondence_blackBBB(PNGraph png, SM sm,
			CCMatch ccMatch) {
		return new Object[] { png, sm, ccMatch };
	}

	public static final Object[] pattern_statemachine2petrinet_24_6_createcorrespondence_greenBFBB(PNGraph png, SM sm,
			CCMatch ccMatch) {
		SM2PN sm2pn = Statemachine2petrinetFactory.eINSTANCE.createSM2PN();
		sm2pn.setSource(sm);
		sm2pn.setTarget(png);
		ccMatch.getCreateCorr().add(sm2pn);
		return new Object[] { png, sm2pn, sm, ccMatch };
	}

	public static final Object[] pattern_statemachine2petrinet_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_statemachine2petrinet_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "statemachine2petrinet";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_statemachine2petrinet_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_27_1_matchtggpattern_blackB(SM sm) {
		return new Object[] { sm };
	}

	public static final boolean pattern_statemachine2petrinet_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_statemachine2petrinet_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_28_1_matchtggpattern_blackB(PNGraph png) {
		return new Object[] { png };
	}

	public static final boolean pattern_statemachine2petrinet_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_statemachine2petrinet_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_29_1_createresult_blackB(statemachine2petrinet _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_statemachine2petrinet_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_statemachine2petrinet_29_2_isapplicablecore_blackB(
			statemachine2petrinet _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_statemachine2petrinet_29_3_solveCSP_bindingFBBB(statemachine2petrinet _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_statemachine2petrinet_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_statemachine2petrinet_29_3_solveCSP_bindingAndBlackFBBB(
			statemachine2petrinet _this, IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_statemachine2petrinet_29_3_solveCSP_binding = pattern_statemachine2petrinet_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_statemachine2petrinet_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_statemachine2petrinet_29_3_solveCSP_binding[0];

			Object[] result_pattern_statemachine2petrinet_29_3_solveCSP_black = pattern_statemachine2petrinet_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_statemachine2petrinet_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_statemachine2petrinet_29_4_checkCSP_expressionFBB(statemachine2petrinet _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_statemachine2petrinet_29_6_perform_blackB(
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_statemachine2petrinet_29_6_perform_greenFFFB(
			ModelgeneratorRuleResult ruleResult) {
		PNGraph png = PetrinetFactory.eINSTANCE.createPNGraph();
		SM2PN sm2pn = Statemachine2petrinetFactory.eINSTANCE.createSM2PN();
		SM sm = StatemachineFactory.eINSTANCE.createSM();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(png);
		sm2pn.setTarget(png);
		ruleResult.getCorrObjects().add(sm2pn);
		sm2pn.setSource(sm);
		ruleResult.getSourceObjects().add(sm);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { png, sm2pn, sm, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_statemachine2petrinet_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //statemachine2petrinetImpl
