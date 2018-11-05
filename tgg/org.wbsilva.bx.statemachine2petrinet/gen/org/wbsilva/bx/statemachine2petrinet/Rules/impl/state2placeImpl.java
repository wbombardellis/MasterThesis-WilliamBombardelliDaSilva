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

import org.wbsilva.bx.statemachine2petrinet.Rules.RulesPackage;
import org.wbsilva.bx.statemachine2petrinet.Rules.state2place;

import org.wbsilva.bx.statemachine2petrinet.S2P;
import org.wbsilva.bx.statemachine2petrinet.SM2PN;
import org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetFactory;

import petrinet.PNGraph;
import petrinet.PetrinetFactory;
import petrinet.Place;

import statemachine.SM;
import statemachine.State;
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
 * An implementation of the model object '<em><b>state2place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class state2placeImpl extends AbstractRuleImpl implements state2place {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected state2placeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getstate2place();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, State s, SM sm) {

		Object[] result1_black = state2placeImpl.pattern_state2place_0_1_initialbindings_blackBBBB(this, match, s, sm);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[s] = " + s + ", " + "[sm] = " + sm + ".");
		}

		Object[] result2_bindingAndBlack = state2placeImpl.pattern_state2place_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, s, sm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[s] = " + s + ", " + "[sm] = " + sm + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (state2placeImpl.pattern_state2place_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = state2placeImpl
					.pattern_state2place_0_4_collectelementstobetranslated_blackBBB(match, s, sm);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[s] = " + s + ", " + "[sm] = " + sm + ".");
			}
			state2placeImpl.pattern_state2place_0_4_collectelementstobetranslated_greenBBBF(match, s, sm);
			//nothing EMoflonEdge sm__s____states = (EMoflonEdge) result4_green[3];

			Object[] result5_black = state2placeImpl.pattern_state2place_0_5_collectcontextelements_blackBBB(match, s,
					sm);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[s] = " + s + ", " + "[sm] = " + sm + ".");
			}
			state2placeImpl.pattern_state2place_0_5_collectcontextelements_greenBB(match, sm);

			// 
			state2placeImpl.pattern_state2place_0_6_registerobjectstomatch_expressionBBBB(this, match, s, sm);
			return state2placeImpl.pattern_state2place_0_7_expressionF();
		} else {
			return state2placeImpl.pattern_state2place_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = state2placeImpl
				.pattern_state2place_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SM2PN sm2pn = (SM2PN) result1_bindingAndBlack[0];
		State s = (State) result1_bindingAndBlack[1];
		SM sm = (SM) result1_bindingAndBlack[2];
		PNGraph png = (PNGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = state2placeImpl.pattern_state2place_1_1_performtransformation_greenFBFBB(s, png, csp);
		Place p = (Place) result1_green[0];
		S2P s2p = (S2P) result1_green[2];

		Object[] result2_black = state2placeImpl.pattern_state2place_1_2_collecttranslatedelements_blackBBB(p, s, s2p);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[p] = " + p + ", " + "[s] = " + s
					+ ", " + "[s2p] = " + s2p + ".");
		}
		Object[] result2_green = state2placeImpl.pattern_state2place_1_2_collecttranslatedelements_greenFBBB(p, s, s2p);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = state2placeImpl.pattern_state2place_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, p,
				sm2pn, s, sm, s2p, png);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[p] = " + p + ", " + "[sm2pn] = " + sm2pn + ", " + "[s] = " + s + ", " + "[sm] = " + sm
					+ ", " + "[s2p] = " + s2p + ", " + "[png] = " + png + ".");
		}
		state2placeImpl.pattern_state2place_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, p, s, sm, s2p, png);
		//nothing EMoflonEdge s2p__s____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge s2p__p____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge sm__s____states = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge png__p____places = (EMoflonEdge) result3_green[9];

		// 
		// 
		state2placeImpl.pattern_state2place_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, p, sm2pn, s, sm,
				s2p, png);
		return state2placeImpl.pattern_state2place_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = state2placeImpl
				.pattern_state2place_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = state2placeImpl.pattern_state2place_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = state2placeImpl.pattern_state2place_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		State s = (State) result2_binding[0];
		SM sm = (SM) result2_binding[1];
		for (Object[] result2_black : state2placeImpl.pattern_state2place_2_2_corematch_blackFBBFB(s, sm, match)) {
			SM2PN sm2pn = (SM2PN) result2_black[0];
			PNGraph png = (PNGraph) result2_black[3];
			// ForEach 
			for (Object[] result3_black : state2placeImpl.pattern_state2place_2_3_findcontext_blackBBBB(sm2pn, s, sm,
					png)) {
				Object[] result3_green = state2placeImpl.pattern_state2place_2_3_findcontext_greenBBBBFFFF(sm2pn, s, sm,
						png);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge sm2pn__sm____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge sm__s____states = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge sm2pn__png____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = state2placeImpl
						.pattern_state2place_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, sm2pn, s, sm,
								png);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[sm2pn] = " + sm2pn + ", "
							+ "[s] = " + s + ", " + "[sm] = " + sm + ", " + "[png] = " + png + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (state2placeImpl.pattern_state2place_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = state2placeImpl
							.pattern_state2place_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					state2placeImpl.pattern_state2place_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return state2placeImpl.pattern_state2place_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, State s, SM sm) {
		match.registerObject("s", s);
		match.registerObject("sm", sm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, State s, SM sm) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SM2PN sm2pn, State s, SM sm,
			PNGraph png) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_s_id = CSPFactoryHelper.eINSTANCE.createVariable("s.id", true, csp);
		var_s_id.setValue(s.getId());
		var_s_id.setType("String");

		// Create unbound variables
		Variable var_p_id = CSPFactoryHelper.eINSTANCE.createVariable("p.id", csp);
		var_p_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_s_id, var_p_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sm2pn", sm2pn);
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("png", png);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject p, EObject sm2pn, EObject s, EObject sm,
			EObject s2p, EObject png) {
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("sm2pn", sm2pn);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("s2p", s2p);
		ruleresult.registerObject("png", png);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("s").eClass()).equals("statemachine.State.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Place p, PNGraph png) {

		Object[] result1_black = state2placeImpl.pattern_state2place_10_1_initialbindings_blackBBBB(this, match, p,
				png);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[p] = " + p + ", " + "[png] = " + png + ".");
		}

		Object[] result2_bindingAndBlack = state2placeImpl.pattern_state2place_10_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, p, png);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[p] = " + p + ", " + "[png] = " + png + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (state2placeImpl.pattern_state2place_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = state2placeImpl
					.pattern_state2place_10_4_collectelementstobetranslated_blackBBB(match, p, png);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[p] = " + p + ", " + "[png] = " + png + ".");
			}
			state2placeImpl.pattern_state2place_10_4_collectelementstobetranslated_greenBBBF(match, p, png);
			//nothing EMoflonEdge png__p____places = (EMoflonEdge) result4_green[3];

			Object[] result5_black = state2placeImpl.pattern_state2place_10_5_collectcontextelements_blackBBB(match, p,
					png);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[p] = " + p + ", " + "[png] = " + png + ".");
			}
			state2placeImpl.pattern_state2place_10_5_collectcontextelements_greenBB(match, png);

			// 
			state2placeImpl.pattern_state2place_10_6_registerobjectstomatch_expressionBBBB(this, match, p, png);
			return state2placeImpl.pattern_state2place_10_7_expressionF();
		} else {
			return state2placeImpl.pattern_state2place_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = state2placeImpl
				.pattern_state2place_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Place p = (Place) result1_bindingAndBlack[0];
		SM2PN sm2pn = (SM2PN) result1_bindingAndBlack[1];
		SM sm = (SM) result1_bindingAndBlack[2];
		PNGraph png = (PNGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = state2placeImpl.pattern_state2place_11_1_performtransformation_greenBFBFB(p, sm, csp);
		State s = (State) result1_green[1];
		S2P s2p = (S2P) result1_green[3];

		Object[] result2_black = state2placeImpl.pattern_state2place_11_2_collecttranslatedelements_blackBBB(p, s, s2p);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[p] = " + p + ", " + "[s] = " + s
					+ ", " + "[s2p] = " + s2p + ".");
		}
		Object[] result2_green = state2placeImpl.pattern_state2place_11_2_collecttranslatedelements_greenFBBB(p, s,
				s2p);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = state2placeImpl.pattern_state2place_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				p, sm2pn, s, sm, s2p, png);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[p] = " + p + ", " + "[sm2pn] = " + sm2pn + ", " + "[s] = " + s + ", " + "[sm] = " + sm
					+ ", " + "[s2p] = " + s2p + ", " + "[png] = " + png + ".");
		}
		state2placeImpl.pattern_state2place_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, p, s, sm, s2p, png);
		//nothing EMoflonEdge s2p__s____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge s2p__p____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge sm__s____states = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge png__p____places = (EMoflonEdge) result3_green[9];

		// 
		// 
		state2placeImpl.pattern_state2place_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, p, sm2pn, s, sm,
				s2p, png);
		return state2placeImpl.pattern_state2place_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = state2placeImpl
				.pattern_state2place_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = state2placeImpl.pattern_state2place_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = state2placeImpl.pattern_state2place_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Place p = (Place) result2_binding[0];
		PNGraph png = (PNGraph) result2_binding[1];
		for (Object[] result2_black : state2placeImpl.pattern_state2place_12_2_corematch_blackBFFBB(p, png, match)) {
			SM2PN sm2pn = (SM2PN) result2_black[1];
			SM sm = (SM) result2_black[2];
			// ForEach 
			for (Object[] result3_black : state2placeImpl.pattern_state2place_12_3_findcontext_blackBBBB(p, sm2pn, sm,
					png)) {
				Object[] result3_green = state2placeImpl.pattern_state2place_12_3_findcontext_greenBBBBFFFF(p, sm2pn,
						sm, png);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge sm2pn__sm____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge png__p____places = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge sm2pn__png____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = state2placeImpl
						.pattern_state2place_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, p, sm2pn, sm,
								png);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p] = " + p + ", " + "[sm2pn] = "
							+ sm2pn + ", " + "[sm] = " + sm + ", " + "[png] = " + png + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (state2placeImpl.pattern_state2place_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = state2placeImpl
							.pattern_state2place_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					state2placeImpl.pattern_state2place_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return state2placeImpl.pattern_state2place_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Place p, PNGraph png) {
		match.registerObject("p", p);
		match.registerObject("png", png);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Place p, PNGraph png) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Place p, SM2PN sm2pn, SM sm,
			PNGraph png) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_p_id = CSPFactoryHelper.eINSTANCE.createVariable("p.id", true, csp);
		var_p_id.setValue(p.getId());
		var_p_id.setType("String");

		// Create unbound variables
		Variable var_s_id = CSPFactoryHelper.eINSTANCE.createVariable("s.id", csp);
		var_s_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_s_id, var_p_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("sm2pn", sm2pn);
		isApplicableMatch.registerObject("sm", sm);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject p, EObject sm2pn, EObject s, EObject sm,
			EObject s2p, EObject png) {
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("sm2pn", sm2pn);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("s2p", s2p);
		ruleresult.registerObject("png", png);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("p").eClass()).equals("petrinet.Place.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_52(EMoflonEdge _edge_places) {

		Object[] result1_bindingAndBlack = state2placeImpl
				.pattern_state2place_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = state2placeImpl.pattern_state2place_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : state2placeImpl
				.pattern_state2place_20_2_testcorematchandDECs_blackFFB(_edge_places)) {
			Place p = (Place) result2_black[0];
			PNGraph png = (PNGraph) result2_black[1];
			Object[] result2_green = state2placeImpl.pattern_state2place_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (state2placeImpl.pattern_state2place_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, p, png)) {
				// 
				if (state2placeImpl
						.pattern_state2place_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = state2placeImpl.pattern_state2place_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					state2placeImpl.pattern_state2place_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return state2placeImpl.pattern_state2place_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_53(EMoflonEdge _edge_states) {

		Object[] result1_bindingAndBlack = state2placeImpl
				.pattern_state2place_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = state2placeImpl.pattern_state2place_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : state2placeImpl
				.pattern_state2place_21_2_testcorematchandDECs_blackFFB(_edge_states)) {
			State s = (State) result2_black[0];
			SM sm = (SM) result2_black[1];
			Object[] result2_green = state2placeImpl.pattern_state2place_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (state2placeImpl.pattern_state2place_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, s, sm)) {
				// 
				if (state2placeImpl
						.pattern_state2place_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = state2placeImpl.pattern_state2place_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					state2placeImpl.pattern_state2place_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return state2placeImpl.pattern_state2place_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("state2place");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_p_id = CSPFactoryHelper.eINSTANCE.createVariable("p", true, csp);
		var_p_id.setValue(__helper.getValue("p", "id"));
		var_p_id.setType("String");

		Variable var_s_id = CSPFactoryHelper.eINSTANCE.createVariable("s", true, csp);
		var_s_id.setValue(__helper.getValue("s", "id"));
		var_s_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("state2place");
		eq0.solve(var_s_id, var_p_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_p_id.setBound(false);
			eq0.solve(var_s_id, var_p_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("p", "id", var_p_id.getValue());
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
		ruleResult.setRule("state2place");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_p_id = CSPFactoryHelper.eINSTANCE.createVariable("p", true, csp);
		var_p_id.setValue(__helper.getValue("p", "id"));
		var_p_id.setType("String");

		Variable var_s_id = CSPFactoryHelper.eINSTANCE.createVariable("s", true, csp);
		var_s_id.setValue(__helper.getValue("s", "id"));
		var_s_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("state2place");
		eq0.solve(var_s_id, var_p_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_s_id.setBound(false);
			eq0.solve(var_s_id, var_p_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("s", "id", var_s_id.getValue());
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

		Object[] result1_black = state2placeImpl.pattern_state2place_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = state2placeImpl.pattern_state2place_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = state2placeImpl
				.pattern_state2place_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Place p = (Place) result2_bindingAndBlack[0];
		State s = (State) result2_bindingAndBlack[1];
		SM sm = (SM) result2_bindingAndBlack[2];
		PNGraph png = (PNGraph) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = state2placeImpl.pattern_state2place_24_3_solvecsp_bindingAndBlackFBBBBBBB(
				this, p, s, sm, png, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[p] = " + p + ", " + "[s] = " + s + ", " + "[sm] = " + sm + ", " + "[png] = " + png + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (state2placeImpl.pattern_state2place_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : state2placeImpl.pattern_state2place_24_5_matchcorrcontext_blackFBBBB(sm, png,
					sourceMatch, targetMatch)) {
				SM2PN sm2pn = (SM2PN) result5_black[0];
				Object[] result5_green = state2placeImpl.pattern_state2place_24_5_matchcorrcontext_greenBBBF(sm2pn,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = state2placeImpl.pattern_state2place_24_6_createcorrespondence_blackBBBBB(p, s,
						sm, png, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[p] = " + p + ", " + "[s] = " + s + ", "
									+ "[sm] = " + sm + ", " + "[png] = " + png + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				state2placeImpl.pattern_state2place_24_6_createcorrespondence_greenBBFB(p, s, ccMatch);
				//nothing S2P s2p = (S2P) result6_green[2];

				Object[] result7_black = state2placeImpl.pattern_state2place_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				state2placeImpl.pattern_state2place_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return state2placeImpl.pattern_state2place_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Place p, State s, SM sm, PNGraph png, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_s_id = CSPFactoryHelper.eINSTANCE.createVariable("s.id", true, csp);
		var_s_id.setValue(s.getId());
		var_s_id.setType("String");
		Variable var_p_id = CSPFactoryHelper.eINSTANCE.createVariable("p.id", true, csp);
		var_p_id.setValue(p.getId());
		var_p_id.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_s_id, var_p_id);
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
	public boolean checkDEC_FWD(State s, SM sm) {// 
		Object[] result1_black = state2placeImpl.pattern_state2place_27_1_matchtggpattern_blackBB(s, sm);
		if (result1_black != null) {
			return state2placeImpl.pattern_state2place_27_2_expressionF();
		} else {
			return state2placeImpl.pattern_state2place_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Place p, PNGraph png) {// 
		Object[] result1_black = state2placeImpl.pattern_state2place_28_1_matchtggpattern_blackBB(p, png);
		if (result1_black != null) {
			return state2placeImpl.pattern_state2place_28_2_expressionF();
		} else {
			return state2placeImpl.pattern_state2place_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, SM2PN sm2pnParameter) {

		Object[] result1_black = state2placeImpl.pattern_state2place_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = state2placeImpl.pattern_state2place_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : state2placeImpl
				.pattern_state2place_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList sm2pnList = (RuleEntryList) result2_black[0];
			SM2PN sm2pn = (SM2PN) result2_black[1];
			SM sm = (SM) result2_black[2];
			PNGraph png = (PNGraph) result2_black[3];

			Object[] result3_bindingAndBlack = state2placeImpl.pattern_state2place_29_3_solveCSP_bindingAndBlackFBBBBBB(
					this, isApplicableMatch, sm2pn, sm, png, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[sm2pn] = " + sm2pn + ", " + "[sm] = "
						+ sm + ", " + "[png] = " + png + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (state2placeImpl.pattern_state2place_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = state2placeImpl.pattern_state2place_29_5_checknacs_blackBBB(sm2pn, sm, png);
				if (result5_black != null) {

					Object[] result6_black = state2placeImpl.pattern_state2place_29_6_perform_blackBBBB(sm2pn, sm, png,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[sm2pn] = " + sm2pn + ", " + "[sm] = "
										+ sm + ", " + "[png] = " + png + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					state2placeImpl.pattern_state2place_29_6_perform_greenFFBFBBB(sm, png, ruleResult, csp);
					//nothing Place p = (Place) result6_green[0];
					//nothing State s = (State) result6_green[1];
					//nothing S2P s2p = (S2P) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return state2placeImpl.pattern_state2place_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, SM2PN sm2pn, SM sm, PNGraph png,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_s_id = CSPFactoryHelper.eINSTANCE.createVariable("s.id", csp);
		var_s_id.setType("String");
		Variable var_p_id = CSPFactoryHelper.eINSTANCE.createVariable("p.id", csp);
		var_p_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_s_id, var_p_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sm2pn", sm2pn);
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("png", png);
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
		case RulesPackage.STATE2PLACE___IS_APPROPRIATE_FWD__MATCH_STATE_SM:
			return isAppropriate_FWD((Match) arguments.get(0), (State) arguments.get(1), (SM) arguments.get(2));
		case RulesPackage.STATE2PLACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.STATE2PLACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.STATE2PLACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_STATE_SM:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (State) arguments.get(1), (SM) arguments.get(2));
			return null;
		case RulesPackage.STATE2PLACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_STATE_SM:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (State) arguments.get(1),
					(SM) arguments.get(2));
		case RulesPackage.STATE2PLACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.STATE2PLACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SM2PN_STATE_SM_PNGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (SM2PN) arguments.get(1),
					(State) arguments.get(2), (SM) arguments.get(3), (PNGraph) arguments.get(4));
		case RulesPackage.STATE2PLACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.STATE2PLACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.STATE2PLACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.STATE2PLACE___IS_APPROPRIATE_BWD__MATCH_PLACE_PNGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (Place) arguments.get(1), (PNGraph) arguments.get(2));
		case RulesPackage.STATE2PLACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.STATE2PLACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.STATE2PLACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PLACE_PNGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Place) arguments.get(1), (PNGraph) arguments.get(2));
			return null;
		case RulesPackage.STATE2PLACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PLACE_PNGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Place) arguments.get(1),
					(PNGraph) arguments.get(2));
		case RulesPackage.STATE2PLACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.STATE2PLACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PLACE_SM2PN_SM_PNGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Place) arguments.get(1),
					(SM2PN) arguments.get(2), (SM) arguments.get(3), (PNGraph) arguments.get(4));
		case RulesPackage.STATE2PLACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.STATE2PLACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.STATE2PLACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.STATE2PLACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_52__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_52((EMoflonEdge) arguments.get(0));
		case RulesPackage.STATE2PLACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_53__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_53((EMoflonEdge) arguments.get(0));
		case RulesPackage.STATE2PLACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.STATE2PLACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.STATE2PLACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.STATE2PLACE___IS_APPLICABLE_SOLVE_CSP_CC__PLACE_STATE_SM_PNGRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Place) arguments.get(0), (State) arguments.get(1), (SM) arguments.get(2),
					(PNGraph) arguments.get(3), (Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.STATE2PLACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.STATE2PLACE___CHECK_DEC_FWD__STATE_SM:
			return checkDEC_FWD((State) arguments.get(0), (SM) arguments.get(1));
		case RulesPackage.STATE2PLACE___CHECK_DEC_BWD__PLACE_PNGRAPH:
			return checkDEC_BWD((Place) arguments.get(0), (PNGraph) arguments.get(1));
		case RulesPackage.STATE2PLACE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2PN:
			return generateModel((RuleEntryContainer) arguments.get(0), (SM2PN) arguments.get(1));
		case RulesPackage.STATE2PLACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SM2PN_SM_PNGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (SM2PN) arguments.get(1),
					(SM) arguments.get(2), (PNGraph) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.STATE2PLACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_state2place_0_1_initialbindings_blackBBBB(state2place _this, Match match,
			State s, SM sm) {
		return new Object[] { _this, match, s, sm };
	}

	public static final Object[] pattern_state2place_0_2_SolveCSP_bindingFBBBB(state2place _this, Match match, State s,
			SM sm) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, s, sm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, s, sm };
		}
		return null;
	}

	public static final Object[] pattern_state2place_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_state2place_0_2_SolveCSP_bindingAndBlackFBBBB(state2place _this, Match match,
			State s, SM sm) {
		Object[] result_pattern_state2place_0_2_SolveCSP_binding = pattern_state2place_0_2_SolveCSP_bindingFBBBB(_this,
				match, s, sm);
		if (result_pattern_state2place_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_state2place_0_2_SolveCSP_binding[0];

			Object[] result_pattern_state2place_0_2_SolveCSP_black = pattern_state2place_0_2_SolveCSP_blackB(csp);
			if (result_pattern_state2place_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, s, sm };
			}
		}
		return null;
	}

	public static final boolean pattern_state2place_0_3_CheckCSP_expressionFBB(state2place _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_state2place_0_4_collectelementstobetranslated_blackBBB(Match match, State s,
			SM sm) {
		return new Object[] { match, s, sm };
	}

	public static final Object[] pattern_state2place_0_4_collectelementstobetranslated_greenBBBF(Match match, State s,
			SM sm) {
		EMoflonEdge sm__s____states = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(s);
		String sm__s____states_name_prime = "states";
		sm__s____states.setSrc(sm);
		sm__s____states.setTrg(s);
		match.getToBeTranslatedEdges().add(sm__s____states);
		sm__s____states.setName(sm__s____states_name_prime);
		return new Object[] { match, s, sm, sm__s____states };
	}

	public static final Object[] pattern_state2place_0_5_collectcontextelements_blackBBB(Match match, State s, SM sm) {
		return new Object[] { match, s, sm };
	}

	public static final Object[] pattern_state2place_0_5_collectcontextelements_greenBB(Match match, SM sm) {
		match.getContextNodes().add(sm);
		return new Object[] { match, sm };
	}

	public static final void pattern_state2place_0_6_registerobjectstomatch_expressionBBBB(state2place _this,
			Match match, State s, SM sm) {
		_this.registerObjectsToMatch_FWD(match, s, sm);

	}

	public static final boolean pattern_state2place_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_state2place_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_state2place_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("sm2pn");
		EObject _localVariable_1 = isApplicableMatch.getObject("s");
		EObject _localVariable_2 = isApplicableMatch.getObject("sm");
		EObject _localVariable_3 = isApplicableMatch.getObject("png");
		EObject tmpSm2pn = _localVariable_0;
		EObject tmpS = _localVariable_1;
		EObject tmpSm = _localVariable_2;
		EObject tmpPng = _localVariable_3;
		if (tmpSm2pn instanceof SM2PN) {
			SM2PN sm2pn = (SM2PN) tmpSm2pn;
			if (tmpS instanceof State) {
				State s = (State) tmpS;
				if (tmpSm instanceof SM) {
					SM sm = (SM) tmpSm;
					if (tmpPng instanceof PNGraph) {
						PNGraph png = (PNGraph) tmpPng;
						return new Object[] { sm2pn, s, sm, png, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_state2place_1_1_performtransformation_blackBBBBFBB(SM2PN sm2pn, State s, SM sm,
			PNGraph png, state2place _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { sm2pn, s, sm, png, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_state2place_1_1_performtransformation_bindingAndBlackFFFFFBB(state2place _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_state2place_1_1_performtransformation_binding = pattern_state2place_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_state2place_1_1_performtransformation_binding != null) {
			SM2PN sm2pn = (SM2PN) result_pattern_state2place_1_1_performtransformation_binding[0];
			State s = (State) result_pattern_state2place_1_1_performtransformation_binding[1];
			SM sm = (SM) result_pattern_state2place_1_1_performtransformation_binding[2];
			PNGraph png = (PNGraph) result_pattern_state2place_1_1_performtransformation_binding[3];

			Object[] result_pattern_state2place_1_1_performtransformation_black = pattern_state2place_1_1_performtransformation_blackBBBBFBB(
					sm2pn, s, sm, png, _this, isApplicableMatch);
			if (result_pattern_state2place_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_state2place_1_1_performtransformation_black[4];

				return new Object[] { sm2pn, s, sm, png, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_state2place_1_1_performtransformation_greenFBFBB(State s, PNGraph png,
			CSP csp) {
		Place p = PetrinetFactory.eINSTANCE.createPlace();
		S2P s2p = Statemachine2petrinetFactory.eINSTANCE.createS2P();
		Object _localVariable_0 = csp.getValue("p", "id");
		png.getPlaces().add(p);
		s2p.setSource(s);
		s2p.setTarget(p);
		String p_id_prime = (String) _localVariable_0;
		p.setId(p_id_prime);
		return new Object[] { p, s, s2p, png, csp };
	}

	public static final Object[] pattern_state2place_1_2_collecttranslatedelements_blackBBB(Place p, State s, S2P s2p) {
		return new Object[] { p, s, s2p };
	}

	public static final Object[] pattern_state2place_1_2_collecttranslatedelements_greenFBBB(Place p, State s,
			S2P s2p) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(p);
		ruleresult.getTranslatedElements().add(s);
		ruleresult.getCreatedLinkElements().add(s2p);
		return new Object[] { ruleresult, p, s, s2p };
	}

	public static final Object[] pattern_state2place_1_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject p, EObject sm2pn, EObject s, EObject sm, EObject s2p, EObject png) {
		if (!p.equals(sm2pn)) {
			if (!p.equals(s)) {
				if (!p.equals(sm)) {
					if (!p.equals(s2p)) {
						if (!p.equals(png)) {
							if (!s.equals(sm2pn)) {
								if (!s.equals(sm)) {
									if (!s.equals(s2p)) {
										if (!sm.equals(sm2pn)) {
											if (!s2p.equals(sm2pn)) {
												if (!s2p.equals(sm)) {
													if (!png.equals(sm2pn)) {
														if (!png.equals(s)) {
															if (!png.equals(sm)) {
																if (!png.equals(s2p)) {
																	return new Object[] { ruleresult, p, sm2pn, s, sm,
																			s2p, png };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_state2place_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject p, EObject s, EObject sm, EObject s2p, EObject png) {
		EMoflonEdge s2p__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2p__p____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm__s____states = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__p____places = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "state2place";
		String s2p__s____source_name_prime = "source";
		String s2p__p____target_name_prime = "target";
		String sm__s____states_name_prime = "states";
		String png__p____places_name_prime = "places";
		s2p__s____source.setSrc(s2p);
		s2p__s____source.setTrg(s);
		ruleresult.getCreatedEdges().add(s2p__s____source);
		s2p__p____target.setSrc(s2p);
		s2p__p____target.setTrg(p);
		ruleresult.getCreatedEdges().add(s2p__p____target);
		sm__s____states.setSrc(sm);
		sm__s____states.setTrg(s);
		ruleresult.getTranslatedEdges().add(sm__s____states);
		png__p____places.setSrc(png);
		png__p____places.setTrg(p);
		ruleresult.getCreatedEdges().add(png__p____places);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		s2p__s____source.setName(s2p__s____source_name_prime);
		s2p__p____target.setName(s2p__p____target_name_prime);
		sm__s____states.setName(sm__s____states_name_prime);
		png__p____places.setName(png__p____places_name_prime);
		return new Object[] { ruleresult, p, s, sm, s2p, png, s2p__s____source, s2p__p____target, sm__s____states,
				png__p____places };
	}

	public static final void pattern_state2place_1_5_registerobjects_expressionBBBBBBBB(state2place _this,
			PerformRuleResult ruleresult, EObject p, EObject sm2pn, EObject s, EObject sm, EObject s2p, EObject png) {
		_this.registerObjects_FWD(ruleresult, p, sm2pn, s, sm, s2p, png);

	}

	public static final PerformRuleResult pattern_state2place_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_state2place_2_1_preparereturnvalue_bindingFB(state2place _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_state2place_2_1_preparereturnvalue_blackFBB(EClass eClass, state2place _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_state2place_2_1_preparereturnvalue_bindingAndBlackFFB(state2place _this) {
		Object[] result_pattern_state2place_2_1_preparereturnvalue_binding = pattern_state2place_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_state2place_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_state2place_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_state2place_2_1_preparereturnvalue_black = pattern_state2place_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_state2place_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_state2place_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_state2place_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "state2place";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_state2place_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("s");
		EObject _localVariable_1 = match.getObject("sm");
		EObject tmpS = _localVariable_0;
		EObject tmpSm = _localVariable_1;
		if (tmpS instanceof State) {
			State s = (State) tmpS;
			if (tmpSm instanceof SM) {
				SM sm = (SM) tmpSm;
				return new Object[] { s, sm, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_state2place_2_2_corematch_blackFBBFB(State s, SM sm, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SM2PN sm2pn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(sm, SM2PN.class,
				"source")) {
			PNGraph png = sm2pn.getTarget();
			if (png != null) {
				_result.add(new Object[] { sm2pn, s, sm, png, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_state2place_2_3_findcontext_blackBBBB(SM2PN sm2pn, State s, SM sm,
			PNGraph png) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (sm.equals(sm2pn.getSource())) {
			if (sm.getStates().contains(s)) {
				if (png.equals(sm2pn.getTarget())) {
					_result.add(new Object[] { sm2pn, s, sm, png });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_state2place_2_3_findcontext_greenBBBBFFFF(SM2PN sm2pn, State s, SM sm,
			PNGraph png) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge sm2pn__sm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm__s____states = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm2pn__png____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String sm2pn__sm____source_name_prime = "source";
		String sm__s____states_name_prime = "states";
		String sm2pn__png____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(sm2pn);
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(png);
		sm2pn__sm____source.setSrc(sm2pn);
		sm2pn__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(sm2pn__sm____source);
		sm__s____states.setSrc(sm);
		sm__s____states.setTrg(s);
		isApplicableMatch.getAllContextElements().add(sm__s____states);
		sm2pn__png____target.setSrc(sm2pn);
		sm2pn__png____target.setTrg(png);
		isApplicableMatch.getAllContextElements().add(sm2pn__png____target);
		sm2pn__sm____source.setName(sm2pn__sm____source_name_prime);
		sm__s____states.setName(sm__s____states_name_prime);
		sm2pn__png____target.setName(sm2pn__png____target_name_prime);
		return new Object[] { sm2pn, s, sm, png, isApplicableMatch, sm2pn__sm____source, sm__s____states,
				sm2pn__png____target };
	}

	public static final Object[] pattern_state2place_2_4_solveCSP_bindingFBBBBBB(state2place _this,
			IsApplicableMatch isApplicableMatch, SM2PN sm2pn, State s, SM sm, PNGraph png) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, sm2pn, s, sm, png);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm2pn, s, sm, png };
		}
		return null;
	}

	public static final Object[] pattern_state2place_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_state2place_2_4_solveCSP_bindingAndBlackFBBBBBB(state2place _this,
			IsApplicableMatch isApplicableMatch, SM2PN sm2pn, State s, SM sm, PNGraph png) {
		Object[] result_pattern_state2place_2_4_solveCSP_binding = pattern_state2place_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, sm2pn, s, sm, png);
		if (result_pattern_state2place_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_state2place_2_4_solveCSP_binding[0];

			Object[] result_pattern_state2place_2_4_solveCSP_black = pattern_state2place_2_4_solveCSP_blackB(csp);
			if (result_pattern_state2place_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm2pn, s, sm, png };
			}
		}
		return null;
	}

	public static final boolean pattern_state2place_2_5_checkCSP_expressionFBB(state2place _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_state2place_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_state2place_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "state2place";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_state2place_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_state2place_10_1_initialbindings_blackBBBB(state2place _this, Match match,
			Place p, PNGraph png) {
		return new Object[] { _this, match, p, png };
	}

	public static final Object[] pattern_state2place_10_2_SolveCSP_bindingFBBBB(state2place _this, Match match, Place p,
			PNGraph png) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, p, png);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, p, png };
		}
		return null;
	}

	public static final Object[] pattern_state2place_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_state2place_10_2_SolveCSP_bindingAndBlackFBBBB(state2place _this, Match match,
			Place p, PNGraph png) {
		Object[] result_pattern_state2place_10_2_SolveCSP_binding = pattern_state2place_10_2_SolveCSP_bindingFBBBB(
				_this, match, p, png);
		if (result_pattern_state2place_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_state2place_10_2_SolveCSP_binding[0];

			Object[] result_pattern_state2place_10_2_SolveCSP_black = pattern_state2place_10_2_SolveCSP_blackB(csp);
			if (result_pattern_state2place_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, p, png };
			}
		}
		return null;
	}

	public static final boolean pattern_state2place_10_3_CheckCSP_expressionFBB(state2place _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_state2place_10_4_collectelementstobetranslated_blackBBB(Match match, Place p,
			PNGraph png) {
		return new Object[] { match, p, png };
	}

	public static final Object[] pattern_state2place_10_4_collectelementstobetranslated_greenBBBF(Match match, Place p,
			PNGraph png) {
		EMoflonEdge png__p____places = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(p);
		String png__p____places_name_prime = "places";
		png__p____places.setSrc(png);
		png__p____places.setTrg(p);
		match.getToBeTranslatedEdges().add(png__p____places);
		png__p____places.setName(png__p____places_name_prime);
		return new Object[] { match, p, png, png__p____places };
	}

	public static final Object[] pattern_state2place_10_5_collectcontextelements_blackBBB(Match match, Place p,
			PNGraph png) {
		return new Object[] { match, p, png };
	}

	public static final Object[] pattern_state2place_10_5_collectcontextelements_greenBB(Match match, PNGraph png) {
		match.getContextNodes().add(png);
		return new Object[] { match, png };
	}

	public static final void pattern_state2place_10_6_registerobjectstomatch_expressionBBBB(state2place _this,
			Match match, Place p, PNGraph png) {
		_this.registerObjectsToMatch_BWD(match, p, png);

	}

	public static final boolean pattern_state2place_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_state2place_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_state2place_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("p");
		EObject _localVariable_1 = isApplicableMatch.getObject("sm2pn");
		EObject _localVariable_2 = isApplicableMatch.getObject("sm");
		EObject _localVariable_3 = isApplicableMatch.getObject("png");
		EObject tmpP = _localVariable_0;
		EObject tmpSm2pn = _localVariable_1;
		EObject tmpSm = _localVariable_2;
		EObject tmpPng = _localVariable_3;
		if (tmpP instanceof Place) {
			Place p = (Place) tmpP;
			if (tmpSm2pn instanceof SM2PN) {
				SM2PN sm2pn = (SM2PN) tmpSm2pn;
				if (tmpSm instanceof SM) {
					SM sm = (SM) tmpSm;
					if (tmpPng instanceof PNGraph) {
						PNGraph png = (PNGraph) tmpPng;
						return new Object[] { p, sm2pn, sm, png, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_state2place_11_1_performtransformation_blackBBBBFBB(Place p, SM2PN sm2pn,
			SM sm, PNGraph png, state2place _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { p, sm2pn, sm, png, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_state2place_11_1_performtransformation_bindingAndBlackFFFFFBB(
			state2place _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_state2place_11_1_performtransformation_binding = pattern_state2place_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_state2place_11_1_performtransformation_binding != null) {
			Place p = (Place) result_pattern_state2place_11_1_performtransformation_binding[0];
			SM2PN sm2pn = (SM2PN) result_pattern_state2place_11_1_performtransformation_binding[1];
			SM sm = (SM) result_pattern_state2place_11_1_performtransformation_binding[2];
			PNGraph png = (PNGraph) result_pattern_state2place_11_1_performtransformation_binding[3];

			Object[] result_pattern_state2place_11_1_performtransformation_black = pattern_state2place_11_1_performtransformation_blackBBBBFBB(
					p, sm2pn, sm, png, _this, isApplicableMatch);
			if (result_pattern_state2place_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_state2place_11_1_performtransformation_black[4];

				return new Object[] { p, sm2pn, sm, png, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_state2place_11_1_performtransformation_greenBFBFB(Place p, SM sm, CSP csp) {
		State s = StatemachineFactory.eINSTANCE.createState();
		S2P s2p = Statemachine2petrinetFactory.eINSTANCE.createS2P();
		Object _localVariable_0 = csp.getValue("s", "id");
		sm.getStates().add(s);
		s2p.setSource(s);
		s2p.setTarget(p);
		String s_id_prime = (String) _localVariable_0;
		s.setId(s_id_prime);
		return new Object[] { p, s, sm, s2p, csp };
	}

	public static final Object[] pattern_state2place_11_2_collecttranslatedelements_blackBBB(Place p, State s,
			S2P s2p) {
		return new Object[] { p, s, s2p };
	}

	public static final Object[] pattern_state2place_11_2_collecttranslatedelements_greenFBBB(Place p, State s,
			S2P s2p) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(p);
		ruleresult.getCreatedElements().add(s);
		ruleresult.getCreatedLinkElements().add(s2p);
		return new Object[] { ruleresult, p, s, s2p };
	}

	public static final Object[] pattern_state2place_11_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject p, EObject sm2pn, EObject s, EObject sm, EObject s2p, EObject png) {
		if (!p.equals(sm2pn)) {
			if (!p.equals(s)) {
				if (!p.equals(sm)) {
					if (!p.equals(s2p)) {
						if (!p.equals(png)) {
							if (!s.equals(sm2pn)) {
								if (!s.equals(sm)) {
									if (!s.equals(s2p)) {
										if (!sm.equals(sm2pn)) {
											if (!s2p.equals(sm2pn)) {
												if (!s2p.equals(sm)) {
													if (!png.equals(sm2pn)) {
														if (!png.equals(s)) {
															if (!png.equals(sm)) {
																if (!png.equals(s2p)) {
																	return new Object[] { ruleresult, p, sm2pn, s, sm,
																			s2p, png };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_state2place_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject p, EObject s, EObject sm, EObject s2p, EObject png) {
		EMoflonEdge s2p__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2p__p____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm__s____states = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__p____places = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "state2place";
		String s2p__s____source_name_prime = "source";
		String s2p__p____target_name_prime = "target";
		String sm__s____states_name_prime = "states";
		String png__p____places_name_prime = "places";
		s2p__s____source.setSrc(s2p);
		s2p__s____source.setTrg(s);
		ruleresult.getCreatedEdges().add(s2p__s____source);
		s2p__p____target.setSrc(s2p);
		s2p__p____target.setTrg(p);
		ruleresult.getCreatedEdges().add(s2p__p____target);
		sm__s____states.setSrc(sm);
		sm__s____states.setTrg(s);
		ruleresult.getCreatedEdges().add(sm__s____states);
		png__p____places.setSrc(png);
		png__p____places.setTrg(p);
		ruleresult.getTranslatedEdges().add(png__p____places);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		s2p__s____source.setName(s2p__s____source_name_prime);
		s2p__p____target.setName(s2p__p____target_name_prime);
		sm__s____states.setName(sm__s____states_name_prime);
		png__p____places.setName(png__p____places_name_prime);
		return new Object[] { ruleresult, p, s, sm, s2p, png, s2p__s____source, s2p__p____target, sm__s____states,
				png__p____places };
	}

	public static final void pattern_state2place_11_5_registerobjects_expressionBBBBBBBB(state2place _this,
			PerformRuleResult ruleresult, EObject p, EObject sm2pn, EObject s, EObject sm, EObject s2p, EObject png) {
		_this.registerObjects_BWD(ruleresult, p, sm2pn, s, sm, s2p, png);

	}

	public static final PerformRuleResult pattern_state2place_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_state2place_12_1_preparereturnvalue_bindingFB(state2place _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_state2place_12_1_preparereturnvalue_blackFBB(EClass eClass,
			state2place _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_state2place_12_1_preparereturnvalue_bindingAndBlackFFB(state2place _this) {
		Object[] result_pattern_state2place_12_1_preparereturnvalue_binding = pattern_state2place_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_state2place_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_state2place_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_state2place_12_1_preparereturnvalue_black = pattern_state2place_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_state2place_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_state2place_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_state2place_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "state2place";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_state2place_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("p");
		EObject _localVariable_1 = match.getObject("png");
		EObject tmpP = _localVariable_0;
		EObject tmpPng = _localVariable_1;
		if (tmpP instanceof Place) {
			Place p = (Place) tmpP;
			if (tmpPng instanceof PNGraph) {
				PNGraph png = (PNGraph) tmpPng;
				return new Object[] { p, png, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_state2place_12_2_corematch_blackBFFBB(Place p, PNGraph png,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SM2PN sm2pn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(png, SM2PN.class,
				"target")) {
			SM sm = sm2pn.getSource();
			if (sm != null) {
				_result.add(new Object[] { p, sm2pn, sm, png, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_state2place_12_3_findcontext_blackBBBB(Place p, SM2PN sm2pn, SM sm,
			PNGraph png) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (sm.equals(sm2pn.getSource())) {
			if (png.getPlaces().contains(p)) {
				if (png.equals(sm2pn.getTarget())) {
					_result.add(new Object[] { p, sm2pn, sm, png });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_state2place_12_3_findcontext_greenBBBBFFFF(Place p, SM2PN sm2pn, SM sm,
			PNGraph png) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge sm2pn__sm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__p____places = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm2pn__png____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String sm2pn__sm____source_name_prime = "source";
		String png__p____places_name_prime = "places";
		String sm2pn__png____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(sm2pn);
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(png);
		sm2pn__sm____source.setSrc(sm2pn);
		sm2pn__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(sm2pn__sm____source);
		png__p____places.setSrc(png);
		png__p____places.setTrg(p);
		isApplicableMatch.getAllContextElements().add(png__p____places);
		sm2pn__png____target.setSrc(sm2pn);
		sm2pn__png____target.setTrg(png);
		isApplicableMatch.getAllContextElements().add(sm2pn__png____target);
		sm2pn__sm____source.setName(sm2pn__sm____source_name_prime);
		png__p____places.setName(png__p____places_name_prime);
		sm2pn__png____target.setName(sm2pn__png____target_name_prime);
		return new Object[] { p, sm2pn, sm, png, isApplicableMatch, sm2pn__sm____source, png__p____places,
				sm2pn__png____target };
	}

	public static final Object[] pattern_state2place_12_4_solveCSP_bindingFBBBBBB(state2place _this,
			IsApplicableMatch isApplicableMatch, Place p, SM2PN sm2pn, SM sm, PNGraph png) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, p, sm2pn, sm, png);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p, sm2pn, sm, png };
		}
		return null;
	}

	public static final Object[] pattern_state2place_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_state2place_12_4_solveCSP_bindingAndBlackFBBBBBB(state2place _this,
			IsApplicableMatch isApplicableMatch, Place p, SM2PN sm2pn, SM sm, PNGraph png) {
		Object[] result_pattern_state2place_12_4_solveCSP_binding = pattern_state2place_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, p, sm2pn, sm, png);
		if (result_pattern_state2place_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_state2place_12_4_solveCSP_binding[0];

			Object[] result_pattern_state2place_12_4_solveCSP_black = pattern_state2place_12_4_solveCSP_blackB(csp);
			if (result_pattern_state2place_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p, sm2pn, sm, png };
			}
		}
		return null;
	}

	public static final boolean pattern_state2place_12_5_checkCSP_expressionFBB(state2place _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_state2place_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_state2place_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "state2place";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_state2place_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_state2place_20_1_preparereturnvalue_bindingFB(state2place _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_state2place_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			state2place _this) {
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

	public static final Object[] pattern_state2place_20_1_preparereturnvalue_bindingAndBlackFFBF(state2place _this) {
		Object[] result_pattern_state2place_20_1_preparereturnvalue_binding = pattern_state2place_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_state2place_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_state2place_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_state2place_20_1_preparereturnvalue_black = pattern_state2place_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_state2place_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_state2place_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_state2place_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_state2place_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_state2place_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_places) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPng = _edge_places.getSrc();
		if (tmpPng instanceof PNGraph) {
			PNGraph png = (PNGraph) tmpPng;
			EObject tmpP = _edge_places.getTrg();
			if (tmpP instanceof Place) {
				Place p = (Place) tmpP;
				if (png.getPlaces().contains(p)) {
					_result.add(new Object[] { p, png, _edge_places });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_state2place_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_state2place_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			state2place _this, Match match, Place p, PNGraph png) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, p, png);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_state2place_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			state2place _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_state2place_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_state2place_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_state2place_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_state2place_21_1_preparereturnvalue_bindingFB(state2place _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_state2place_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			state2place _this) {
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

	public static final Object[] pattern_state2place_21_1_preparereturnvalue_bindingAndBlackFFBF(state2place _this) {
		Object[] result_pattern_state2place_21_1_preparereturnvalue_binding = pattern_state2place_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_state2place_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_state2place_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_state2place_21_1_preparereturnvalue_black = pattern_state2place_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_state2place_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_state2place_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_state2place_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_state2place_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_state2place_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_states) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSm = _edge_states.getSrc();
		if (tmpSm instanceof SM) {
			SM sm = (SM) tmpSm;
			EObject tmpS = _edge_states.getTrg();
			if (tmpS instanceof State) {
				State s = (State) tmpS;
				if (sm.getStates().contains(s)) {
					_result.add(new Object[] { s, sm, _edge_states });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_state2place_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_state2place_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			state2place _this, Match match, State s, SM sm) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, s, sm);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_state2place_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			state2place _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_state2place_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_state2place_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_state2place_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_state2place_24_1_prepare_blackB(state2place _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_state2place_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_state2place_24_2_matchsrctrgcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("p");
		EObject _localVariable_1 = sourceMatch.getObject("s");
		EObject _localVariable_2 = sourceMatch.getObject("sm");
		EObject _localVariable_3 = targetMatch.getObject("png");
		EObject tmpP = _localVariable_0;
		EObject tmpS = _localVariable_1;
		EObject tmpSm = _localVariable_2;
		EObject tmpPng = _localVariable_3;
		if (tmpP instanceof Place) {
			Place p = (Place) tmpP;
			if (tmpS instanceof State) {
				State s = (State) tmpS;
				if (tmpSm instanceof SM) {
					SM sm = (SM) tmpSm;
					if (tmpPng instanceof PNGraph) {
						PNGraph png = (PNGraph) tmpPng;
						return new Object[] { p, s, sm, png, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_state2place_24_2_matchsrctrgcontext_blackBBBBBB(Place p, State s, SM sm,
			PNGraph png, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { p, s, sm, png, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_state2place_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_state2place_24_2_matchsrctrgcontext_binding = pattern_state2place_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_state2place_24_2_matchsrctrgcontext_binding != null) {
			Place p = (Place) result_pattern_state2place_24_2_matchsrctrgcontext_binding[0];
			State s = (State) result_pattern_state2place_24_2_matchsrctrgcontext_binding[1];
			SM sm = (SM) result_pattern_state2place_24_2_matchsrctrgcontext_binding[2];
			PNGraph png = (PNGraph) result_pattern_state2place_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_state2place_24_2_matchsrctrgcontext_black = pattern_state2place_24_2_matchsrctrgcontext_blackBBBBBB(
					p, s, sm, png, sourceMatch, targetMatch);
			if (result_pattern_state2place_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { p, s, sm, png, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_state2place_24_3_solvecsp_bindingFBBBBBBB(state2place _this, Place p, State s,
			SM sm, PNGraph png, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(p, s, sm, png, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, p, s, sm, png, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_state2place_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_state2place_24_3_solvecsp_bindingAndBlackFBBBBBBB(state2place _this, Place p,
			State s, SM sm, PNGraph png, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_state2place_24_3_solvecsp_binding = pattern_state2place_24_3_solvecsp_bindingFBBBBBBB(
				_this, p, s, sm, png, sourceMatch, targetMatch);
		if (result_pattern_state2place_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_state2place_24_3_solvecsp_binding[0];

			Object[] result_pattern_state2place_24_3_solvecsp_black = pattern_state2place_24_3_solvecsp_blackB(csp);
			if (result_pattern_state2place_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, p, s, sm, png, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_state2place_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_state2place_24_5_matchcorrcontext_blackFBBBB(SM sm, PNGraph png,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (SM2PN sm2pn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(sm, SM2PN.class,
					"source")) {
				if (png.equals(sm2pn.getTarget())) {
					_result.add(new Object[] { sm2pn, sm, png, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_state2place_24_5_matchcorrcontext_greenBBBF(SM2PN sm2pn, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "state2place";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(sm2pn);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sm2pn, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_state2place_24_6_createcorrespondence_blackBBBBB(Place p, State s, SM sm,
			PNGraph png, CCMatch ccMatch) {
		return new Object[] { p, s, sm, png, ccMatch };
	}

	public static final Object[] pattern_state2place_24_6_createcorrespondence_greenBBFB(Place p, State s,
			CCMatch ccMatch) {
		S2P s2p = Statemachine2petrinetFactory.eINSTANCE.createS2P();
		s2p.setSource(s);
		s2p.setTarget(p);
		ccMatch.getCreateCorr().add(s2p);
		return new Object[] { p, s, s2p, ccMatch };
	}

	public static final Object[] pattern_state2place_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_state2place_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "state2place";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_state2place_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_state2place_27_1_matchtggpattern_blackBB(State s, SM sm) {
		if (sm.getStates().contains(s)) {
			return new Object[] { s, sm };
		}
		return null;
	}

	public static final boolean pattern_state2place_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_state2place_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_state2place_28_1_matchtggpattern_blackBB(Place p, PNGraph png) {
		if (png.getPlaces().contains(p)) {
			return new Object[] { p, png };
		}
		return null;
	}

	public static final boolean pattern_state2place_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_state2place_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_state2place_29_1_createresult_blackB(state2place _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_state2place_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_state2place_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, SM2PN sm2pn) {
		if (ruleResult.getCorrObjects().contains(sm2pn)) {
			return new Object[] { ruleResult, sm2pn };
		}
		return null;
	}

	public static final Object[] pattern_state2place_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SM sm) {
		if (ruleResult.getSourceObjects().contains(sm)) {
			return new Object[] { ruleResult, sm };
		}
		return null;
	}

	public static final Object[] pattern_state2place_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, PNGraph png) {
		if (ruleResult.getTargetObjects().contains(png)) {
			return new Object[] { ruleResult, png };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_state2place_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList sm2pnList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpSm2pn : sm2pnList.getEntryObjects()) {
				if (tmpSm2pn instanceof SM2PN) {
					SM2PN sm2pn = (SM2PN) tmpSm2pn;
					SM sm = sm2pn.getSource();
					if (sm != null) {
						PNGraph png = sm2pn.getTarget();
						if (png != null) {
							if (pattern_state2place_29_2_isapplicablecore_black_nac_0BB(ruleResult, sm2pn) == null) {
								if (pattern_state2place_29_2_isapplicablecore_black_nac_1BB(ruleResult, sm) == null) {
									if (pattern_state2place_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											png) == null) {
										_result.add(new Object[] { sm2pnList, sm2pn, sm, png, ruleEntryContainer,
												ruleResult });
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

	public static final Object[] pattern_state2place_29_3_solveCSP_bindingFBBBBBB(state2place _this,
			IsApplicableMatch isApplicableMatch, SM2PN sm2pn, SM sm, PNGraph png, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, sm2pn, sm, png, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm2pn, sm, png, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_state2place_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_state2place_29_3_solveCSP_bindingAndBlackFBBBBBB(state2place _this,
			IsApplicableMatch isApplicableMatch, SM2PN sm2pn, SM sm, PNGraph png, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_state2place_29_3_solveCSP_binding = pattern_state2place_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, sm2pn, sm, png, ruleResult);
		if (result_pattern_state2place_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_state2place_29_3_solveCSP_binding[0];

			Object[] result_pattern_state2place_29_3_solveCSP_black = pattern_state2place_29_3_solveCSP_blackB(csp);
			if (result_pattern_state2place_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm2pn, sm, png, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_state2place_29_4_checkCSP_expressionFBB(state2place _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_state2place_29_5_checknacs_blackBBB(SM2PN sm2pn, SM sm, PNGraph png) {
		return new Object[] { sm2pn, sm, png };
	}

	public static final Object[] pattern_state2place_29_6_perform_blackBBBB(SM2PN sm2pn, SM sm, PNGraph png,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { sm2pn, sm, png, ruleResult };
	}

	public static final Object[] pattern_state2place_29_6_perform_greenFFBFBBB(SM sm, PNGraph png,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Place p = PetrinetFactory.eINSTANCE.createPlace();
		State s = StatemachineFactory.eINSTANCE.createState();
		S2P s2p = Statemachine2petrinetFactory.eINSTANCE.createS2P();
		Object _localVariable_0 = csp.getValue("p", "id");
		Object _localVariable_1 = csp.getValue("s", "id");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		png.getPlaces().add(p);
		ruleResult.getTargetObjects().add(p);
		sm.getStates().add(s);
		ruleResult.getSourceObjects().add(s);
		s2p.setSource(s);
		s2p.setTarget(p);
		ruleResult.getCorrObjects().add(s2p);
		String p_id_prime = (String) _localVariable_0;
		String s_id_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		p.setId(p_id_prime);
		s.setId(s_id_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { p, s, sm, s2p, png, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_state2place_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //state2placeImpl
