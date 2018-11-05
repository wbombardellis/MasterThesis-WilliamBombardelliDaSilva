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
import org.wbsilva.bx.statemachine2petrinet.Rules.transition2arctransarc;

import org.wbsilva.bx.statemachine2petrinet.S2P;
import org.wbsilva.bx.statemachine2petrinet.SM2PN;
import org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetFactory;
import org.wbsilva.bx.statemachine2petrinet.T2A;
import org.wbsilva.bx.statemachine2petrinet.T2T;

import petrinet.Arc;
import petrinet.Node;
import petrinet.PNGraph;
import petrinet.PetrinetFactory;
import petrinet.Place;

import statemachine.SM;
import statemachine.State;
import statemachine.StatemachineFactory;
import statemachine.Transition;
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
 * An implementation of the model object '<em><b>transition2arctransarc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class transition2arctransarcImpl extends AbstractRuleImpl implements transition2arctransarc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected transition2arctransarcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.gettransition2arctransarc();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Transition st, SM sm, State s1, State s2) {

		Object[] result1_black = transition2arctransarcImpl
				.pattern_transition2arctransarc_0_1_initialbindings_blackBBBBBB(this, match, st, sm, s1, s2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[st] = " + st + ", " + "[sm] = " + sm + ", " + "[s1] = " + s1
					+ ", " + "[s2] = " + s2 + ".");
		}

		Object[] result2_bindingAndBlack = transition2arctransarcImpl
				.pattern_transition2arctransarc_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, st, sm, s1, s2);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[st] = " + st + ", " + "[sm] = " + sm + ", " + "[s1] = " + s1
					+ ", " + "[s2] = " + s2 + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (transition2arctransarcImpl.pattern_transition2arctransarc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = transition2arctransarcImpl
					.pattern_transition2arctransarc_0_4_collectelementstobetranslated_blackBBBBB(match, st, sm, s1, s2);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[st] = " + st + ", " + "[sm] = " + sm + ", " + "[s1] = " + s1 + ", " + "[s2] = " + s2 + ".");
			}
			transition2arctransarcImpl.pattern_transition2arctransarc_0_4_collectelementstobetranslated_greenBBBBBFFF(
					match, st, sm, s1, s2);
			//nothing EMoflonEdge sm__st____transitions = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge st__s1____from = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge st__s2____to = (EMoflonEdge) result4_green[7];

			Object[] result5_black = transition2arctransarcImpl
					.pattern_transition2arctransarc_0_5_collectcontextelements_blackBBBBB(match, st, sm, s1, s2);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[st] = " + st + ", " + "[sm] = " + sm + ", " + "[s1] = " + s1 + ", " + "[s2] = " + s2 + ".");
			}
			transition2arctransarcImpl.pattern_transition2arctransarc_0_5_collectcontextelements_greenBBBB(match, sm,
					s1, s2);

			// 
			transition2arctransarcImpl.pattern_transition2arctransarc_0_6_registerobjectstomatch_expressionBBBBBB(this,
					match, st, sm, s1, s2);
			return transition2arctransarcImpl.pattern_transition2arctransarc_0_7_expressionF();
		} else {
			return transition2arctransarcImpl.pattern_transition2arctransarc_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = transition2arctransarcImpl
				.pattern_transition2arctransarc_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PNGraph png = (PNGraph) result1_bindingAndBlack[0];
		Transition st = (Transition) result1_bindingAndBlack[1];
		SM sm = (SM) result1_bindingAndBlack[2];
		Place p2 = (Place) result1_bindingAndBlack[3];
		S2P s12p1 = (S2P) result1_bindingAndBlack[4];
		Place p1 = (Place) result1_bindingAndBlack[5];
		SM2PN sm2pn = (SM2PN) result1_bindingAndBlack[6];
		State s1 = (State) result1_bindingAndBlack[7];
		State s2 = (State) result1_bindingAndBlack[8];
		S2P s22p2 = (S2P) result1_bindingAndBlack[9];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = transition2arctransarcImpl
				.pattern_transition2arctransarc_1_1_performtransformation_greenBBFFBFBFFF(png, st, p2, p1);
		Arc a1 = (Arc) result1_green[2];
		Arc a2 = (Arc) result1_green[3];
		T2A st2a1 = (T2A) result1_green[5];
		T2T st2pt = (T2T) result1_green[7];
		T2A st2a2 = (T2A) result1_green[8];
		petrinet.Transition pt = (petrinet.Transition) result1_green[9];

		Object[] result2_black = transition2arctransarcImpl
				.pattern_transition2arctransarc_1_2_collecttranslatedelements_blackBBBBBBB(st, a1, a2, st2a1, st2pt,
						st2a2, pt);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[st] = " + st + ", " + "[a1] = "
					+ a1 + ", " + "[a2] = " + a2 + ", " + "[st2a1] = " + st2a1 + ", " + "[st2pt] = " + st2pt + ", "
					+ "[st2a2] = " + st2a2 + ", " + "[pt] = " + pt + ".");
		}
		Object[] result2_green = transition2arctransarcImpl
				.pattern_transition2arctransarc_1_2_collecttranslatedelements_greenFBBBBBBB(st, a1, a2, st2a1, st2pt,
						st2a2, pt);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = transition2arctransarcImpl
				.pattern_transition2arctransarc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(ruleresult, png, st, sm,
						a1, a2, p2, st2a1, s12p1, p1, sm2pn, s1, st2pt, s2, st2a2, pt, s22p2);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[png] = " + png + ", " + "[st] = " + st + ", " + "[sm] = " + sm + ", " + "[a1] = " + a1
					+ ", " + "[a2] = " + a2 + ", " + "[p2] = " + p2 + ", " + "[st2a1] = " + st2a1 + ", " + "[s12p1] = "
					+ s12p1 + ", " + "[p1] = " + p1 + ", " + "[sm2pn] = " + sm2pn + ", " + "[s1] = " + s1 + ", "
					+ "[st2pt] = " + st2pt + ", " + "[s2] = " + s2 + ", " + "[st2a2] = " + st2a2 + ", " + "[pt] = " + pt
					+ ", " + "[s22p2] = " + s22p2 + ".");
		}
		transition2arctransarcImpl
				.pattern_transition2arctransarc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult,
						png, st, sm, a1, a2, p2, st2a1, p1, s1, st2pt, s2, st2a2, pt);
		//nothing EMoflonEdge png__a2____arcs = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge sm__st____transitions = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge png__a1____arcs = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a1__pt____to = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a1__p1____from = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge st__s1____from = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge png__pt____transitions = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge st2a1__st____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge st2a1__a1____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge st2pt__st____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge st2a2__st____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge st2a2__a2____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge st2pt__pt____target = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge st__s2____to = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2__pt____from = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2__p2____to = (EMoflonEdge) result3_green[29];

		// 
		// 
		transition2arctransarcImpl.pattern_transition2arctransarc_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(this,
				ruleresult, png, st, sm, a1, a2, p2, st2a1, s12p1, p1, sm2pn, s1, st2pt, s2, st2a2, pt, s22p2);
		return transition2arctransarcImpl.pattern_transition2arctransarc_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = transition2arctransarcImpl
				.pattern_transition2arctransarc_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = transition2arctransarcImpl
				.pattern_transition2arctransarc_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = transition2arctransarcImpl
				.pattern_transition2arctransarc_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Transition st = (Transition) result2_binding[0];
		SM sm = (SM) result2_binding[1];
		State s1 = (State) result2_binding[2];
		State s2 = (State) result2_binding[3];
		for (Object[] result2_black : transition2arctransarcImpl
				.pattern_transition2arctransarc_2_2_corematch_blackFBBFFFFBBFB(st, sm, s1, s2, match)) {
			PNGraph png = (PNGraph) result2_black[0];
			Place p2 = (Place) result2_black[3];
			S2P s12p1 = (S2P) result2_black[4];
			Place p1 = (Place) result2_black[5];
			SM2PN sm2pn = (SM2PN) result2_black[6];
			S2P s22p2 = (S2P) result2_black[9];
			// ForEach 
			for (Object[] result3_black : transition2arctransarcImpl
					.pattern_transition2arctransarc_2_3_findcontext_blackBBBBBBBBBB(png, st, sm, p2, s12p1, p1, sm2pn,
							s1, s2, s22p2)) {
				Object[] result3_green = transition2arctransarcImpl
						.pattern_transition2arctransarc_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFF(png, st, sm, p2,
								s12p1, p1, sm2pn, s1, s2, s22p2);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge sm__st____transitions = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge st__s1____from = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge s12p1__p1____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge sm2pn__png____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge sm2pn__sm____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge s22p2__p2____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge s22p2__s2____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge st__s2____to = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge s12p1__s1____source = (EMoflonEdge) result3_green[19];

				Object[] result4_bindingAndBlack = transition2arctransarcImpl
						.pattern_transition2arctransarc_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, png, st, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[png] = " + png + ", " + "[st] = "
							+ st + ", " + "[sm] = " + sm + ", " + "[p2] = " + p2 + ", " + "[s12p1] = " + s12p1 + ", "
							+ "[p1] = " + p1 + ", " + "[sm2pn] = " + sm2pn + ", " + "[s1] = " + s1 + ", " + "[s2] = "
							+ s2 + ", " + "[s22p2] = " + s22p2 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (transition2arctransarcImpl.pattern_transition2arctransarc_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = transition2arctransarcImpl
							.pattern_transition2arctransarc_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					transition2arctransarcImpl.pattern_transition2arctransarc_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return transition2arctransarcImpl.pattern_transition2arctransarc_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Transition st, SM sm, State s1, State s2) {
		match.registerObject("st", st);
		match.registerObject("sm", sm);
		match.registerObject("s1", s1);
		match.registerObject("s2", s2);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Transition st, SM sm, State s1, State s2) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, PNGraph png, Transition st, SM sm,
			Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2, S2P s22p2) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("png", png);
		isApplicableMatch.registerObject("st", st);
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("p2", p2);
		isApplicableMatch.registerObject("s12p1", s12p1);
		isApplicableMatch.registerObject("p1", p1);
		isApplicableMatch.registerObject("sm2pn", sm2pn);
		isApplicableMatch.registerObject("s1", s1);
		isApplicableMatch.registerObject("s2", s2);
		isApplicableMatch.registerObject("s22p2", s22p2);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject png, EObject st, EObject sm, EObject a1,
			EObject a2, EObject p2, EObject st2a1, EObject s12p1, EObject p1, EObject sm2pn, EObject s1, EObject st2pt,
			EObject s2, EObject st2a2, EObject pt, EObject s22p2) {
		ruleresult.registerObject("png", png);
		ruleresult.registerObject("st", st);
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("a1", a1);
		ruleresult.registerObject("a2", a2);
		ruleresult.registerObject("p2", p2);
		ruleresult.registerObject("st2a1", st2a1);
		ruleresult.registerObject("s12p1", s12p1);
		ruleresult.registerObject("p1", p1);
		ruleresult.registerObject("sm2pn", sm2pn);
		ruleresult.registerObject("s1", s1);
		ruleresult.registerObject("st2pt", st2pt);
		ruleresult.registerObject("s2", s2);
		ruleresult.registerObject("st2a2", st2a2);
		ruleresult.registerObject("pt", pt);
		ruleresult.registerObject("s22p2", s22p2);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("st").eClass())
				.equals("statemachine.Transition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, PNGraph png, Arc a1, Arc a2, Place p2, Place p1,
			petrinet.Transition pt) {

		Object[] result1_black = transition2arctransarcImpl
				.pattern_transition2arctransarc_10_1_initialbindings_blackBBBBBBBB(this, match, png, a1, a2, p2, p1,
						pt);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[png] = " + png + ", " + "[a1] = " + a1 + ", " + "[a2] = " + a2
					+ ", " + "[p2] = " + p2 + ", " + "[p1] = " + p1 + ", " + "[pt] = " + pt + ".");
		}

		Object[] result2_bindingAndBlack = transition2arctransarcImpl
				.pattern_transition2arctransarc_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(this, match, png, a1, a2, p2, p1,
						pt);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[png] = " + png + ", " + "[a1] = " + a1 + ", " + "[a2] = " + a2
					+ ", " + "[p2] = " + p2 + ", " + "[p1] = " + p1 + ", " + "[pt] = " + pt + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (transition2arctransarcImpl.pattern_transition2arctransarc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = transition2arctransarcImpl
					.pattern_transition2arctransarc_10_4_collectelementstobetranslated_blackBBBBBBB(match, png, a1, a2,
							p2, p1, pt);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[png] = " + png + ", " + "[a1] = " + a1 + ", " + "[a2] = " + a2 + ", " + "[p2] = " + p2
						+ ", " + "[p1] = " + p1 + ", " + "[pt] = " + pt + ".");
			}
			transition2arctransarcImpl
					.pattern_transition2arctransarc_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFF(match, png,
							a1, a2, p2, p1, pt);
			//nothing EMoflonEdge png__a2____arcs = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge png__a1____arcs = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge a1__pt____to = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge a1__p1____from = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge png__pt____transitions = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge a2__pt____from = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge a2__p2____to = (EMoflonEdge) result4_green[13];

			Object[] result5_black = transition2arctransarcImpl
					.pattern_transition2arctransarc_10_5_collectcontextelements_blackBBBBBBB(match, png, a1, a2, p2, p1,
							pt);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[png] = " + png + ", " + "[a1] = " + a1 + ", " + "[a2] = " + a2 + ", " + "[p2] = " + p2
						+ ", " + "[p1] = " + p1 + ", " + "[pt] = " + pt + ".");
			}
			transition2arctransarcImpl.pattern_transition2arctransarc_10_5_collectcontextelements_greenBBBB(match, png,
					p2, p1);

			// 
			transition2arctransarcImpl.pattern_transition2arctransarc_10_6_registerobjectstomatch_expressionBBBBBBBB(
					this, match, png, a1, a2, p2, p1, pt);
			return transition2arctransarcImpl.pattern_transition2arctransarc_10_7_expressionF();
		} else {
			return transition2arctransarcImpl.pattern_transition2arctransarc_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = transition2arctransarcImpl
				.pattern_transition2arctransarc_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PNGraph png = (PNGraph) result1_bindingAndBlack[0];
		SM sm = (SM) result1_bindingAndBlack[1];
		Arc a1 = (Arc) result1_bindingAndBlack[2];
		Arc a2 = (Arc) result1_bindingAndBlack[3];
		Place p2 = (Place) result1_bindingAndBlack[4];
		S2P s12p1 = (S2P) result1_bindingAndBlack[5];
		Place p1 = (Place) result1_bindingAndBlack[6];
		SM2PN sm2pn = (SM2PN) result1_bindingAndBlack[7];
		State s1 = (State) result1_bindingAndBlack[8];
		State s2 = (State) result1_bindingAndBlack[9];
		petrinet.Transition pt = (petrinet.Transition) result1_bindingAndBlack[10];
		S2P s22p2 = (S2P) result1_bindingAndBlack[11];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[12];
		Object[] result1_green = transition2arctransarcImpl
				.pattern_transition2arctransarc_11_1_performtransformation_greenFBBBFBFBFB(sm, a1, a2, s1, s2, pt);
		Transition st = (Transition) result1_green[0];
		T2A st2a1 = (T2A) result1_green[4];
		T2T st2pt = (T2T) result1_green[6];
		T2A st2a2 = (T2A) result1_green[8];

		Object[] result2_black = transition2arctransarcImpl
				.pattern_transition2arctransarc_11_2_collecttranslatedelements_blackBBBBBBB(st, a1, a2, st2a1, st2pt,
						st2a2, pt);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[st] = " + st + ", " + "[a1] = "
					+ a1 + ", " + "[a2] = " + a2 + ", " + "[st2a1] = " + st2a1 + ", " + "[st2pt] = " + st2pt + ", "
					+ "[st2a2] = " + st2a2 + ", " + "[pt] = " + pt + ".");
		}
		Object[] result2_green = transition2arctransarcImpl
				.pattern_transition2arctransarc_11_2_collecttranslatedelements_greenFBBBBBBB(st, a1, a2, st2a1, st2pt,
						st2a2, pt);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = transition2arctransarcImpl
				.pattern_transition2arctransarc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(ruleresult, png, st, sm,
						a1, a2, p2, st2a1, s12p1, p1, sm2pn, s1, st2pt, s2, st2a2, pt, s22p2);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[png] = " + png + ", " + "[st] = " + st + ", " + "[sm] = " + sm + ", " + "[a1] = " + a1
					+ ", " + "[a2] = " + a2 + ", " + "[p2] = " + p2 + ", " + "[st2a1] = " + st2a1 + ", " + "[s12p1] = "
					+ s12p1 + ", " + "[p1] = " + p1 + ", " + "[sm2pn] = " + sm2pn + ", " + "[s1] = " + s1 + ", "
					+ "[st2pt] = " + st2pt + ", " + "[s2] = " + s2 + ", " + "[st2a2] = " + st2a2 + ", " + "[pt] = " + pt
					+ ", " + "[s22p2] = " + s22p2 + ".");
		}
		transition2arctransarcImpl
				.pattern_transition2arctransarc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult,
						png, st, sm, a1, a2, p2, st2a1, p1, s1, st2pt, s2, st2a2, pt);
		//nothing EMoflonEdge png__a2____arcs = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge sm__st____transitions = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge png__a1____arcs = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a1__pt____to = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a1__p1____from = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge st__s1____from = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge png__pt____transitions = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge st2a1__st____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge st2a1__a1____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge st2pt__st____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge st2a2__st____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge st2a2__a2____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge st2pt__pt____target = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge st__s2____to = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2__pt____from = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2__p2____to = (EMoflonEdge) result3_green[29];

		// 
		// 
		transition2arctransarcImpl.pattern_transition2arctransarc_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(
				this, ruleresult, png, st, sm, a1, a2, p2, st2a1, s12p1, p1, sm2pn, s1, st2pt, s2, st2a2, pt, s22p2);
		return transition2arctransarcImpl.pattern_transition2arctransarc_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = transition2arctransarcImpl
				.pattern_transition2arctransarc_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = transition2arctransarcImpl
				.pattern_transition2arctransarc_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = transition2arctransarcImpl
				.pattern_transition2arctransarc_12_2_corematch_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		PNGraph png = (PNGraph) result2_binding[0];
		Arc a1 = (Arc) result2_binding[1];
		Arc a2 = (Arc) result2_binding[2];
		Place p2 = (Place) result2_binding[3];
		Place p1 = (Place) result2_binding[4];
		petrinet.Transition pt = (petrinet.Transition) result2_binding[5];
		for (Object[] result2_black : transition2arctransarcImpl
				.pattern_transition2arctransarc_12_2_corematch_blackBFBBBFBFFFBFB(png, a1, a2, p2, p1, pt, match)) {
			SM sm = (SM) result2_black[1];
			S2P s12p1 = (S2P) result2_black[5];
			SM2PN sm2pn = (SM2PN) result2_black[7];
			State s1 = (State) result2_black[8];
			State s2 = (State) result2_black[9];
			S2P s22p2 = (S2P) result2_black[11];
			// ForEach 
			for (Object[] result3_black : transition2arctransarcImpl
					.pattern_transition2arctransarc_12_3_findcontext_blackBBBBBBBBBBBB(png, sm, a1, a2, p2, s12p1, p1,
							sm2pn, s1, s2, pt, s22p2)) {
				Object[] result3_green = transition2arctransarcImpl
						.pattern_transition2arctransarc_12_3_findcontext_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(png, sm, a1,
								a2, p2, s12p1, p1, sm2pn, s1, s2, pt, s22p2);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[12];
				//nothing EMoflonEdge png__a2____arcs = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge png__a1____arcs = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge a1__pt____to = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge a1__p1____from = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge png__pt____transitions = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge s12p1__p1____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge sm2pn__png____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge sm2pn__sm____source = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge s22p2__p2____target = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge s22p2__s2____source = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge s12p1__s1____source = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge a2__pt____from = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge a2__p2____to = (EMoflonEdge) result3_green[25];

				Object[] result4_bindingAndBlack = transition2arctransarcImpl
						.pattern_transition2arctransarc_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBB(this,
								isApplicableMatch, png, sm, a1, a2, p2, s12p1, p1, sm2pn, s1, s2, pt, s22p2);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[png] = " + png + ", " + "[sm] = "
							+ sm + ", " + "[a1] = " + a1 + ", " + "[a2] = " + a2 + ", " + "[p2] = " + p2 + ", "
							+ "[s12p1] = " + s12p1 + ", " + "[p1] = " + p1 + ", " + "[sm2pn] = " + sm2pn + ", "
							+ "[s1] = " + s1 + ", " + "[s2] = " + s2 + ", " + "[pt] = " + pt + ", " + "[s22p2] = "
							+ s22p2 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (transition2arctransarcImpl.pattern_transition2arctransarc_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = transition2arctransarcImpl
							.pattern_transition2arctransarc_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					transition2arctransarcImpl.pattern_transition2arctransarc_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return transition2arctransarcImpl.pattern_transition2arctransarc_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, PNGraph png, Arc a1, Arc a2, Place p2, Place p1,
			petrinet.Transition pt) {
		match.registerObject("png", png);
		match.registerObject("a1", a1);
		match.registerObject("a2", a2);
		match.registerObject("p2", p2);
		match.registerObject("p1", p1);
		match.registerObject("pt", pt);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, PNGraph png, Arc a1, Arc a2, Place p2, Place p1,
			petrinet.Transition pt) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, PNGraph png, SM sm, Arc a1, Arc a2,
			Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2, petrinet.Transition pt, S2P s22p2) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("png", png);
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("a1", a1);
		isApplicableMatch.registerObject("a2", a2);
		isApplicableMatch.registerObject("p2", p2);
		isApplicableMatch.registerObject("s12p1", s12p1);
		isApplicableMatch.registerObject("p1", p1);
		isApplicableMatch.registerObject("sm2pn", sm2pn);
		isApplicableMatch.registerObject("s1", s1);
		isApplicableMatch.registerObject("s2", s2);
		isApplicableMatch.registerObject("pt", pt);
		isApplicableMatch.registerObject("s22p2", s22p2);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject png, EObject st, EObject sm, EObject a1,
			EObject a2, EObject p2, EObject st2a1, EObject s12p1, EObject p1, EObject sm2pn, EObject s1, EObject st2pt,
			EObject s2, EObject st2a2, EObject pt, EObject s22p2) {
		ruleresult.registerObject("png", png);
		ruleresult.registerObject("st", st);
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("a1", a1);
		ruleresult.registerObject("a2", a2);
		ruleresult.registerObject("p2", p2);
		ruleresult.registerObject("st2a1", st2a1);
		ruleresult.registerObject("s12p1", s12p1);
		ruleresult.registerObject("p1", p1);
		ruleresult.registerObject("sm2pn", sm2pn);
		ruleresult.registerObject("s1", s1);
		ruleresult.registerObject("st2pt", st2pt);
		ruleresult.registerObject("s2", s2);
		ruleresult.registerObject("st2a2", st2a2);
		ruleresult.registerObject("pt", pt);
		ruleresult.registerObject("s22p2", s22p2);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a1").eClass()).equals("petrinet.Arc.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a2").eClass()).equals("petrinet.Arc.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("pt").eClass()).equals("petrinet.Transition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_107(EMoflonEdge _edge_arcs) {

		Object[] result1_bindingAndBlack = transition2arctransarcImpl
				.pattern_transition2arctransarc_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = transition2arctransarcImpl
				.pattern_transition2arctransarc_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : transition2arctransarcImpl
				.pattern_transition2arctransarc_20_2_testcorematchandDECs_blackFFFFFFB(_edge_arcs)) {
			PNGraph png = (PNGraph) result2_black[0];
			Arc a1 = (Arc) result2_black[1];
			Arc a2 = (Arc) result2_black[2];
			Place p2 = (Place) result2_black[3];
			Place p1 = (Place) result2_black[4];
			petrinet.Transition pt = (petrinet.Transition) result2_black[5];
			Object[] result2_green = transition2arctransarcImpl
					.pattern_transition2arctransarc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (transition2arctransarcImpl
					.pattern_transition2arctransarc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
							this, match, png, a1, a2, p2, p1, pt)) {
				// 
				if (transition2arctransarcImpl
						.pattern_transition2arctransarc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = transition2arctransarcImpl
							.pattern_transition2arctransarc_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					transition2arctransarcImpl.pattern_transition2arctransarc_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return transition2arctransarcImpl.pattern_transition2arctransarc_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_114(EMoflonEdge _edge_transitions) {

		Object[] result1_bindingAndBlack = transition2arctransarcImpl
				.pattern_transition2arctransarc_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = transition2arctransarcImpl
				.pattern_transition2arctransarc_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : transition2arctransarcImpl
				.pattern_transition2arctransarc_21_2_testcorematchandDECs_blackFFFFB(_edge_transitions)) {
			Transition st = (Transition) result2_black[0];
			SM sm = (SM) result2_black[1];
			State s1 = (State) result2_black[2];
			State s2 = (State) result2_black[3];
			Object[] result2_green = transition2arctransarcImpl
					.pattern_transition2arctransarc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (transition2arctransarcImpl
					.pattern_transition2arctransarc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, st, sm, s1, s2)) {
				// 
				if (transition2arctransarcImpl
						.pattern_transition2arctransarc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = transition2arctransarcImpl
							.pattern_transition2arctransarc_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					transition2arctransarcImpl.pattern_transition2arctransarc_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return transition2arctransarcImpl.pattern_transition2arctransarc_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("transition2arctransarc");
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
		ruleResult.setRule("transition2arctransarc");
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

		Object[] result1_black = transition2arctransarcImpl.pattern_transition2arctransarc_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = transition2arctransarcImpl.pattern_transition2arctransarc_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = transition2arctransarcImpl
				.pattern_transition2arctransarc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		PNGraph png = (PNGraph) result2_bindingAndBlack[0];
		Transition st = (Transition) result2_bindingAndBlack[1];
		SM sm = (SM) result2_bindingAndBlack[2];
		Arc a1 = (Arc) result2_bindingAndBlack[3];
		Arc a2 = (Arc) result2_bindingAndBlack[4];
		Place p2 = (Place) result2_bindingAndBlack[5];
		Place p1 = (Place) result2_bindingAndBlack[6];
		State s1 = (State) result2_bindingAndBlack[7];
		State s2 = (State) result2_bindingAndBlack[8];
		petrinet.Transition pt = (petrinet.Transition) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = transition2arctransarcImpl
				.pattern_transition2arctransarc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, png, st, sm, a1, a2,
						p2, p1, s1, s2, pt, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[png] = " + png + ", " + "[st] = " + st + ", " + "[sm] = " + sm + ", " + "[a1] = " + a1 + ", "
					+ "[a2] = " + a2 + ", " + "[p2] = " + p2 + ", " + "[p1] = " + p1 + ", " + "[s1] = " + s1 + ", "
					+ "[s2] = " + s2 + ", " + "[pt] = " + pt + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (transition2arctransarcImpl.pattern_transition2arctransarc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : transition2arctransarcImpl
					.pattern_transition2arctransarc_24_5_matchcorrcontext_blackBBBFBFBBFBB(png, sm, p2, p1, s1, s2,
							sourceMatch, targetMatch)) {
				S2P s12p1 = (S2P) result5_black[3];
				SM2PN sm2pn = (SM2PN) result5_black[5];
				S2P s22p2 = (S2P) result5_black[8];
				Object[] result5_green = transition2arctransarcImpl
						.pattern_transition2arctransarc_24_5_matchcorrcontext_greenBBBBBF(s12p1, sm2pn, s22p2,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[5];

				Object[] result6_black = transition2arctransarcImpl
						.pattern_transition2arctransarc_24_6_createcorrespondence_blackBBBBBBBBBBB(png, st, sm, a1, a2,
								p2, p1, s1, s2, pt, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[png] = " + png + ", "
							+ "[st] = " + st + ", " + "[sm] = " + sm + ", " + "[a1] = " + a1 + ", " + "[a2] = " + a2
							+ ", " + "[p2] = " + p2 + ", " + "[p1] = " + p1 + ", " + "[s1] = " + s1 + ", " + "[s2] = "
							+ s2 + ", " + "[pt] = " + pt + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				transition2arctransarcImpl.pattern_transition2arctransarc_24_6_createcorrespondence_greenBBBFFFBB(st,
						a1, a2, pt, ccMatch);
				//nothing T2A st2a1 = (T2A) result6_green[3];
				//nothing T2T st2pt = (T2T) result6_green[4];
				//nothing T2A st2a2 = (T2A) result6_green[5];

				Object[] result7_black = transition2arctransarcImpl
						.pattern_transition2arctransarc_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				transition2arctransarcImpl.pattern_transition2arctransarc_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return transition2arctransarcImpl.pattern_transition2arctransarc_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(PNGraph png, Transition st, SM sm, Arc a1, Arc a2, Place p2, Place p1, State s1,
			State s2, petrinet.Transition pt, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Transition st, SM sm, State s1, State s2) {// 
		Object[] result1_black = transition2arctransarcImpl
				.pattern_transition2arctransarc_27_1_matchtggpattern_blackBBBB(st, sm, s1, s2);
		if (result1_black != null) {
			return transition2arctransarcImpl.pattern_transition2arctransarc_27_2_expressionF();
		} else {
			return transition2arctransarcImpl.pattern_transition2arctransarc_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(PNGraph png, Arc a1, Arc a2, Place p2, Place p1, petrinet.Transition pt) {// 
		Object[] result1_black = transition2arctransarcImpl
				.pattern_transition2arctransarc_28_1_matchtggpattern_blackBBBBBB(png, a1, a2, p2, p1, pt);
		if (result1_black != null) {
			return transition2arctransarcImpl.pattern_transition2arctransarc_28_2_expressionF();
		} else {
			return transition2arctransarcImpl.pattern_transition2arctransarc_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, SM2PN sm2pnParameter,
			S2P s22p2Parameter, S2P s12p1Parameter) {

		Object[] result1_black = transition2arctransarcImpl
				.pattern_transition2arctransarc_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = transition2arctransarcImpl.pattern_transition2arctransarc_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : transition2arctransarcImpl
				.pattern_transition2arctransarc_29_2_isapplicablecore_blackFFFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList sm2pnList = (RuleEntryList) result2_black[0];
			PNGraph png = (PNGraph) result2_black[1];
			SM2PN sm2pn = (SM2PN) result2_black[2];
			SM sm = (SM) result2_black[3];
			//nothing RuleEntryList s22p2List = (RuleEntryList) result2_black[4];
			Place p2 = (Place) result2_black[5];
			S2P s22p2 = (S2P) result2_black[6];
			State s2 = (State) result2_black[7];
			//nothing RuleEntryList s12p1List = (RuleEntryList) result2_black[8];
			S2P s12p1 = (S2P) result2_black[9];
			Place p1 = (Place) result2_black[10];
			State s1 = (State) result2_black[11];

			Object[] result3_bindingAndBlack = transition2arctransarcImpl
					.pattern_transition2arctransarc_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
							png, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[png] = " + png + ", " + "[sm] = " + sm
						+ ", " + "[p2] = " + p2 + ", " + "[s12p1] = " + s12p1 + ", " + "[p1] = " + p1 + ", "
						+ "[sm2pn] = " + sm2pn + ", " + "[s1] = " + s1 + ", " + "[s2] = " + s2 + ", " + "[s22p2] = "
						+ s22p2 + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (transition2arctransarcImpl.pattern_transition2arctransarc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = transition2arctransarcImpl
						.pattern_transition2arctransarc_29_5_checknacs_blackBBBBBBBBB(png, sm, p2, s12p1, p1, sm2pn, s1,
								s2, s22p2);
				if (result5_black != null) {

					Object[] result6_black = transition2arctransarcImpl
							.pattern_transition2arctransarc_29_6_perform_blackBBBBBBBBBB(png, sm, p2, s12p1, p1, sm2pn,
									s1, s2, s22p2, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[png] = " + png + ", " + "[sm] = " + sm
										+ ", " + "[p2] = " + p2 + ", " + "[s12p1] = " + s12p1 + ", " + "[p1] = " + p1
										+ ", " + "[sm2pn] = " + sm2pn + ", " + "[s1] = " + s1 + ", " + "[s2] = " + s2
										+ ", " + "[s22p2] = " + s22p2 + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					transition2arctransarcImpl.pattern_transition2arctransarc_29_6_perform_greenBFBFFBFBBFBFFB(png, sm,
							p2, p1, s1, s2, ruleResult);
					//nothing Transition st = (Transition) result6_green[1];
					//nothing Arc a1 = (Arc) result6_green[3];
					//nothing Arc a2 = (Arc) result6_green[4];
					//nothing T2A st2a1 = (T2A) result6_green[6];
					//nothing T2T st2pt = (T2T) result6_green[9];
					//nothing T2A st2a2 = (T2A) result6_green[11];
					//nothing petrinet.Transition pt = (petrinet.Transition) result6_green[12];

				} else {
				}

			} else {
			}

		}
		return transition2arctransarcImpl.pattern_transition2arctransarc_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, PNGraph png, SM sm, Place p2, S2P s12p1,
			Place p1, SM2PN sm2pn, State s1, State s2, S2P s22p2, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("png", png);
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("p2", p2);
		isApplicableMatch.registerObject("s12p1", s12p1);
		isApplicableMatch.registerObject("p1", p1);
		isApplicableMatch.registerObject("sm2pn", sm2pn);
		isApplicableMatch.registerObject("s1", s1);
		isApplicableMatch.registerObject("s2", s2);
		isApplicableMatch.registerObject("s22p2", s22p2);
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
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPROPRIATE_FWD__MATCH_TRANSITION_SM_STATE_STATE:
			return isAppropriate_FWD((Match) arguments.get(0), (Transition) arguments.get(1), (SM) arguments.get(2),
					(State) arguments.get(3), (State) arguments.get(4));
		case RulesPackage.TRANSITION2ARCTRANSARC___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TRANSITION_SM_STATE_STATE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Transition) arguments.get(1), (SM) arguments.get(2),
					(State) arguments.get(3), (State) arguments.get(4));
			return null;
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TRANSITION_SM_STATE_STATE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Transition) arguments.get(1),
					(SM) arguments.get(2), (State) arguments.get(3), (State) arguments.get(4));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PNGRAPH_TRANSITION_SM_PLACE_S2P_PLACE_SM2PN_STATE_STATE_S2P:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (PNGraph) arguments.get(1),
					(Transition) arguments.get(2), (SM) arguments.get(3), (Place) arguments.get(4),
					(S2P) arguments.get(5), (Place) arguments.get(6), (SM2PN) arguments.get(7),
					(State) arguments.get(8), (State) arguments.get(9), (S2P) arguments.get(10));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15), (EObject) arguments.get(16));
			return null;
		case RulesPackage.TRANSITION2ARCTRANSARC___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPROPRIATE_BWD__MATCH_PNGRAPH_ARC_ARC_PLACE_PLACE_TRANSITION:
			return isAppropriate_BWD((Match) arguments.get(0), (PNGraph) arguments.get(1), (Arc) arguments.get(2),
					(Arc) arguments.get(3), (Place) arguments.get(4), (Place) arguments.get(5),
					(petrinet.Transition) arguments.get(6));
		case RulesPackage.TRANSITION2ARCTRANSARC___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PNGRAPH_ARC_ARC_PLACE_PLACE_TRANSITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (PNGraph) arguments.get(1), (Arc) arguments.get(2),
					(Arc) arguments.get(3), (Place) arguments.get(4), (Place) arguments.get(5),
					(petrinet.Transition) arguments.get(6));
			return null;
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PNGRAPH_ARC_ARC_PLACE_PLACE_TRANSITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (PNGraph) arguments.get(1),
					(Arc) arguments.get(2), (Arc) arguments.get(3), (Place) arguments.get(4), (Place) arguments.get(5),
					(petrinet.Transition) arguments.get(6));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PNGRAPH_SM_ARC_ARC_PLACE_S2P_PLACE_SM2PN_STATE_STATE_TRANSITION_S2P:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (PNGraph) arguments.get(1),
					(SM) arguments.get(2), (Arc) arguments.get(3), (Arc) arguments.get(4), (Place) arguments.get(5),
					(S2P) arguments.get(6), (Place) arguments.get(7), (SM2PN) arguments.get(8),
					(State) arguments.get(9), (State) arguments.get(10), (petrinet.Transition) arguments.get(11),
					(S2P) arguments.get(12));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15), (EObject) arguments.get(16));
			return null;
		case RulesPackage.TRANSITION2ARCTRANSARC___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_107__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_107((EMoflonEdge) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_114__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_114((EMoflonEdge) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPLICABLE_SOLVE_CSP_CC__PNGRAPH_TRANSITION_SM_ARC_ARC_PLACE_PLACE_STATE_STATE_TRANSITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((PNGraph) arguments.get(0), (Transition) arguments.get(1),
					(SM) arguments.get(2), (Arc) arguments.get(3), (Arc) arguments.get(4), (Place) arguments.get(5),
					(Place) arguments.get(6), (State) arguments.get(7), (State) arguments.get(8),
					(petrinet.Transition) arguments.get(9), (Match) arguments.get(10), (Match) arguments.get(11));
		case RulesPackage.TRANSITION2ARCTRANSARC___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TRANSITION2ARCTRANSARC___CHECK_DEC_FWD__TRANSITION_SM_STATE_STATE:
			return checkDEC_FWD((Transition) arguments.get(0), (SM) arguments.get(1), (State) arguments.get(2),
					(State) arguments.get(3));
		case RulesPackage.TRANSITION2ARCTRANSARC___CHECK_DEC_BWD__PNGRAPH_ARC_ARC_PLACE_PLACE_TRANSITION:
			return checkDEC_BWD((PNGraph) arguments.get(0), (Arc) arguments.get(1), (Arc) arguments.get(2),
					(Place) arguments.get(3), (Place) arguments.get(4), (petrinet.Transition) arguments.get(5));
		case RulesPackage.TRANSITION2ARCTRANSARC___GENERATE_MODEL__RULEENTRYCONTAINER_SM2PN_S2P_S2P:
			return generateModel((RuleEntryContainer) arguments.get(0), (SM2PN) arguments.get(1),
					(S2P) arguments.get(2), (S2P) arguments.get(3));
		case RulesPackage.TRANSITION2ARCTRANSARC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PNGRAPH_SM_PLACE_S2P_PLACE_SM2PN_STATE_STATE_S2P_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (PNGraph) arguments.get(1),
					(SM) arguments.get(2), (Place) arguments.get(3), (S2P) arguments.get(4), (Place) arguments.get(5),
					(SM2PN) arguments.get(6), (State) arguments.get(7), (State) arguments.get(8),
					(S2P) arguments.get(9), (ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.TRANSITION2ARCTRANSARC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_transition2arctransarc_0_1_initialbindings_blackBBBBBB(
			transition2arctransarc _this, Match match, Transition st, SM sm, State s1, State s2) {
		if (!s1.equals(s2)) {
			return new Object[] { _this, match, st, sm, s1, s2 };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_0_2_SolveCSP_bindingFBBBBBB(
			transition2arctransarc _this, Match match, Transition st, SM sm, State s1, State s2) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, st, sm, s1, s2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, st, sm, s1, s2 };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_transition2arctransarc_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			transition2arctransarc _this, Match match, Transition st, SM sm, State s1, State s2) {
		Object[] result_pattern_transition2arctransarc_0_2_SolveCSP_binding = pattern_transition2arctransarc_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, st, sm, s1, s2);
		if (result_pattern_transition2arctransarc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_transition2arctransarc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_transition2arctransarc_0_2_SolveCSP_black = pattern_transition2arctransarc_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_transition2arctransarc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, st, sm, s1, s2 };
			}
		}
		return null;
	}

	public static final boolean pattern_transition2arctransarc_0_3_CheckCSP_expressionFBB(transition2arctransarc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, Transition st, SM sm, State s1, State s2) {
		if (!s1.equals(s2)) {
			return new Object[] { match, st, sm, s1, s2 };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_0_4_collectelementstobetranslated_greenBBBBBFFF(
			Match match, Transition st, SM sm, State s1, State s2) {
		EMoflonEdge sm__st____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s2____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(st);
		String sm__st____transitions_name_prime = "transitions";
		String st__s1____from_name_prime = "from";
		String st__s2____to_name_prime = "to";
		sm__st____transitions.setSrc(sm);
		sm__st____transitions.setTrg(st);
		match.getToBeTranslatedEdges().add(sm__st____transitions);
		st__s1____from.setSrc(st);
		st__s1____from.setTrg(s1);
		match.getToBeTranslatedEdges().add(st__s1____from);
		st__s2____to.setSrc(st);
		st__s2____to.setTrg(s2);
		match.getToBeTranslatedEdges().add(st__s2____to);
		sm__st____transitions.setName(sm__st____transitions_name_prime);
		st__s1____from.setName(st__s1____from_name_prime);
		st__s2____to.setName(st__s2____to_name_prime);
		return new Object[] { match, st, sm, s1, s2, sm__st____transitions, st__s1____from, st__s2____to };
	}

	public static final Object[] pattern_transition2arctransarc_0_5_collectcontextelements_blackBBBBB(Match match,
			Transition st, SM sm, State s1, State s2) {
		if (!s1.equals(s2)) {
			return new Object[] { match, st, sm, s1, s2 };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_0_5_collectcontextelements_greenBBBB(Match match, SM sm,
			State s1, State s2) {
		match.getContextNodes().add(sm);
		match.getContextNodes().add(s1);
		match.getContextNodes().add(s2);
		return new Object[] { match, sm, s1, s2 };
	}

	public static final void pattern_transition2arctransarc_0_6_registerobjectstomatch_expressionBBBBBB(
			transition2arctransarc _this, Match match, Transition st, SM sm, State s1, State s2) {
		_this.registerObjectsToMatch_FWD(match, st, sm, s1, s2);

	}

	public static final boolean pattern_transition2arctransarc_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_transition2arctransarc_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_1_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("png");
		EObject _localVariable_1 = isApplicableMatch.getObject("st");
		EObject _localVariable_2 = isApplicableMatch.getObject("sm");
		EObject _localVariable_3 = isApplicableMatch.getObject("p2");
		EObject _localVariable_4 = isApplicableMatch.getObject("s12p1");
		EObject _localVariable_5 = isApplicableMatch.getObject("p1");
		EObject _localVariable_6 = isApplicableMatch.getObject("sm2pn");
		EObject _localVariable_7 = isApplicableMatch.getObject("s1");
		EObject _localVariable_8 = isApplicableMatch.getObject("s2");
		EObject _localVariable_9 = isApplicableMatch.getObject("s22p2");
		EObject tmpPng = _localVariable_0;
		EObject tmpSt = _localVariable_1;
		EObject tmpSm = _localVariable_2;
		EObject tmpP2 = _localVariable_3;
		EObject tmpS12p1 = _localVariable_4;
		EObject tmpP1 = _localVariable_5;
		EObject tmpSm2pn = _localVariable_6;
		EObject tmpS1 = _localVariable_7;
		EObject tmpS2 = _localVariable_8;
		EObject tmpS22p2 = _localVariable_9;
		if (tmpPng instanceof PNGraph) {
			PNGraph png = (PNGraph) tmpPng;
			if (tmpSt instanceof Transition) {
				Transition st = (Transition) tmpSt;
				if (tmpSm instanceof SM) {
					SM sm = (SM) tmpSm;
					if (tmpP2 instanceof Place) {
						Place p2 = (Place) tmpP2;
						if (tmpS12p1 instanceof S2P) {
							S2P s12p1 = (S2P) tmpS12p1;
							if (tmpP1 instanceof Place) {
								Place p1 = (Place) tmpP1;
								if (tmpSm2pn instanceof SM2PN) {
									SM2PN sm2pn = (SM2PN) tmpSm2pn;
									if (tmpS1 instanceof State) {
										State s1 = (State) tmpS1;
										if (tmpS2 instanceof State) {
											State s2 = (State) tmpS2;
											if (tmpS22p2 instanceof S2P) {
												S2P s22p2 = (S2P) tmpS22p2;
												return new Object[] { png, st, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2,
														isApplicableMatch };
											}
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

	public static final Object[] pattern_transition2arctransarc_1_1_performtransformation_blackBBBBBBBBBBFBB(
			PNGraph png, Transition st, SM sm, Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2,
			S2P s22p2, transition2arctransarc _this, IsApplicableMatch isApplicableMatch) {
		if (!s12p1.equals(s22p2)) {
			if (!p1.equals(p2)) {
				if (!s1.equals(s2)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { png, st, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			transition2arctransarc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_transition2arctransarc_1_1_performtransformation_binding = pattern_transition2arctransarc_1_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_transition2arctransarc_1_1_performtransformation_binding != null) {
			PNGraph png = (PNGraph) result_pattern_transition2arctransarc_1_1_performtransformation_binding[0];
			Transition st = (Transition) result_pattern_transition2arctransarc_1_1_performtransformation_binding[1];
			SM sm = (SM) result_pattern_transition2arctransarc_1_1_performtransformation_binding[2];
			Place p2 = (Place) result_pattern_transition2arctransarc_1_1_performtransformation_binding[3];
			S2P s12p1 = (S2P) result_pattern_transition2arctransarc_1_1_performtransformation_binding[4];
			Place p1 = (Place) result_pattern_transition2arctransarc_1_1_performtransformation_binding[5];
			SM2PN sm2pn = (SM2PN) result_pattern_transition2arctransarc_1_1_performtransformation_binding[6];
			State s1 = (State) result_pattern_transition2arctransarc_1_1_performtransformation_binding[7];
			State s2 = (State) result_pattern_transition2arctransarc_1_1_performtransformation_binding[8];
			S2P s22p2 = (S2P) result_pattern_transition2arctransarc_1_1_performtransformation_binding[9];

			Object[] result_pattern_transition2arctransarc_1_1_performtransformation_black = pattern_transition2arctransarc_1_1_performtransformation_blackBBBBBBBBBBFBB(
					png, st, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2, _this, isApplicableMatch);
			if (result_pattern_transition2arctransarc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_transition2arctransarc_1_1_performtransformation_black[10];

				return new Object[] { png, st, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_1_1_performtransformation_greenBBFFBFBFFF(PNGraph png,
			Transition st, Place p2, Place p1) {
		Arc a1 = PetrinetFactory.eINSTANCE.createArc();
		Arc a2 = PetrinetFactory.eINSTANCE.createArc();
		T2A st2a1 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		T2T st2pt = Statemachine2petrinetFactory.eINSTANCE.createT2T();
		T2A st2a2 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		petrinet.Transition pt = PetrinetFactory.eINSTANCE.createTransition();
		png.getArcs().add(a1);
		a1.setFrom(p1);
		png.getArcs().add(a2);
		a2.setTo(p2);
		st2a1.setSource(st);
		st2a1.setTarget(a1);
		st2pt.setSource(st);
		st2a2.setSource(st);
		st2a2.setTarget(a2);
		a1.setTo(pt);
		png.getTransitions().add(pt);
		st2pt.setTarget(pt);
		a2.setFrom(pt);
		return new Object[] { png, st, a1, a2, p2, st2a1, p1, st2pt, st2a2, pt };
	}

	public static final Object[] pattern_transition2arctransarc_1_2_collecttranslatedelements_blackBBBBBBB(
			Transition st, Arc a1, Arc a2, T2A st2a1, T2T st2pt, T2A st2a2, petrinet.Transition pt) {
		if (!a1.equals(a2)) {
			if (!st2a1.equals(st2a2)) {
				return new Object[] { st, a1, a2, st2a1, st2pt, st2a2, pt };
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_1_2_collecttranslatedelements_greenFBBBBBBB(
			Transition st, Arc a1, Arc a2, T2A st2a1, T2T st2pt, T2A st2a2, petrinet.Transition pt) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(st);
		ruleresult.getCreatedElements().add(a1);
		ruleresult.getCreatedElements().add(a2);
		ruleresult.getCreatedLinkElements().add(st2a1);
		ruleresult.getCreatedLinkElements().add(st2pt);
		ruleresult.getCreatedLinkElements().add(st2a2);
		ruleresult.getCreatedElements().add(pt);
		return new Object[] { ruleresult, st, a1, a2, st2a1, st2pt, st2a2, pt };
	}

	public static final Object[] pattern_transition2arctransarc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject png, EObject st, EObject sm, EObject a1, EObject a2, EObject p2,
			EObject st2a1, EObject s12p1, EObject p1, EObject sm2pn, EObject s1, EObject st2pt, EObject s2,
			EObject st2a2, EObject pt, EObject s22p2) {
		if (!png.equals(st)) {
			if (!png.equals(sm)) {
				if (!png.equals(st2a1)) {
					if (!png.equals(s12p1)) {
						if (!png.equals(sm2pn)) {
							if (!png.equals(s1)) {
								if (!png.equals(st2pt)) {
									if (!png.equals(s2)) {
										if (!png.equals(st2a2)) {
											if (!png.equals(pt)) {
												if (!png.equals(s22p2)) {
													if (!st.equals(st2a1)) {
														if (!st.equals(st2pt)) {
															if (!st.equals(st2a2)) {
																if (!sm.equals(st)) {
																	if (!sm.equals(st2a1)) {
																		if (!sm.equals(sm2pn)) {
																			if (!sm.equals(st2pt)) {
																				if (!sm.equals(st2a2)) {
																					if (!a1.equals(png)) {
																						if (!a1.equals(st)) {
																							if (!a1.equals(sm)) {
																								if (!a1.equals(a2)) {
																									if (!a1.equals(
																											p2)) {
																										if (!a1.equals(
																												st2a1)) {
																											if (!a1.equals(
																													s12p1)) {
																												if (!a1.equals(
																														p1)) {
																													if (!a1.equals(
																															sm2pn)) {
																														if (!a1.equals(
																																s1)) {
																															if (!a1.equals(
																																	st2pt)) {
																																if (!a1.equals(
																																		s2)) {
																																	if (!a1.equals(
																																			st2a2)) {
																																		if (!a1.equals(
																																				pt)) {
																																			if (!a1.equals(
																																					s22p2)) {
																																				if (!a2.equals(
																																						png)) {
																																					if (!a2.equals(
																																							st)) {
																																						if (!a2.equals(
																																								sm)) {
																																							if (!a2.equals(
																																									p2)) {
																																								if (!a2.equals(
																																										st2a1)) {
																																									if (!a2.equals(
																																											s12p1)) {
																																										if (!a2.equals(
																																												p1)) {
																																											if (!a2.equals(
																																													sm2pn)) {
																																												if (!a2.equals(
																																														s1)) {
																																													if (!a2.equals(
																																															st2pt)) {
																																														if (!a2.equals(
																																																s2)) {
																																															if (!a2.equals(
																																																	st2a2)) {
																																																if (!a2.equals(
																																																		pt)) {
																																																	if (!a2.equals(
																																																			s22p2)) {
																																																		if (!p2.equals(
																																																				png)) {
																																																			if (!p2.equals(
																																																					st)) {
																																																				if (!p2.equals(
																																																						sm)) {
																																																					if (!p2.equals(
																																																							st2a1)) {
																																																						if (!p2.equals(
																																																								s12p1)) {
																																																							if (!p2.equals(
																																																									sm2pn)) {
																																																								if (!p2.equals(
																																																										s1)) {
																																																									if (!p2.equals(
																																																											st2pt)) {
																																																										if (!p2.equals(
																																																												s2)) {
																																																											if (!p2.equals(
																																																													st2a2)) {
																																																												if (!p2.equals(
																																																														pt)) {
																																																													if (!p2.equals(
																																																															s22p2)) {
																																																														if (!st2a1
																																																																.equals(st2pt)) {
																																																															if (!st2a1
																																																																	.equals(st2a2)) {
																																																																if (!s12p1
																																																																		.equals(st)) {
																																																																	if (!s12p1
																																																																			.equals(sm)) {
																																																																		if (!s12p1
																																																																				.equals(st2a1)) {
																																																																			if (!s12p1
																																																																					.equals(sm2pn)) {
																																																																				if (!s12p1
																																																																						.equals(st2pt)) {
																																																																					if (!s12p1
																																																																							.equals(s2)) {
																																																																						if (!s12p1
																																																																								.equals(st2a2)) {
																																																																							if (!s12p1
																																																																									.equals(s22p2)) {
																																																																								if (!p1.equals(
																																																																										png)) {
																																																																									if (!p1.equals(
																																																																											st)) {
																																																																										if (!p1.equals(
																																																																												sm)) {
																																																																											if (!p1.equals(
																																																																													p2)) {
																																																																												if (!p1.equals(
																																																																														st2a1)) {
																																																																													if (!p1.equals(
																																																																															s12p1)) {
																																																																														if (!p1.equals(
																																																																																sm2pn)) {
																																																																															if (!p1.equals(
																																																																																	s1)) {
																																																																																if (!p1.equals(
																																																																																		st2pt)) {
																																																																																	if (!p1.equals(
																																																																																			s2)) {
																																																																																		if (!p1.equals(
																																																																																				st2a2)) {
																																																																																			if (!p1.equals(
																																																																																					pt)) {
																																																																																				if (!p1.equals(
																																																																																						s22p2)) {
																																																																																					if (!sm2pn
																																																																																							.equals(st)) {
																																																																																						if (!sm2pn
																																																																																								.equals(st2a1)) {
																																																																																							if (!sm2pn
																																																																																									.equals(st2pt)) {
																																																																																								if (!sm2pn
																																																																																										.equals(st2a2)) {
																																																																																									if (!s1.equals(
																																																																																											st)) {
																																																																																										if (!s1.equals(
																																																																																												sm)) {
																																																																																											if (!s1.equals(
																																																																																													st2a1)) {
																																																																																												if (!s1.equals(
																																																																																														s12p1)) {
																																																																																													if (!s1.equals(
																																																																																															sm2pn)) {
																																																																																														if (!s1.equals(
																																																																																																st2pt)) {
																																																																																															if (!s1.equals(
																																																																																																	s2)) {
																																																																																																if (!s1.equals(
																																																																																																		st2a2)) {
																																																																																																	if (!s1.equals(
																																																																																																			s22p2)) {
																																																																																																		if (!s2.equals(
																																																																																																				st)) {
																																																																																																			if (!s2.equals(
																																																																																																					sm)) {
																																																																																																				if (!s2.equals(
																																																																																																						st2a1)) {
																																																																																																					if (!s2.equals(
																																																																																																							sm2pn)) {
																																																																																																						if (!s2.equals(
																																																																																																								st2pt)) {
																																																																																																							if (!s2.equals(
																																																																																																									st2a2)) {
																																																																																																								if (!s2.equals(
																																																																																																										s22p2)) {
																																																																																																									if (!st2a2
																																																																																																											.equals(st2pt)) {
																																																																																																										if (!pt.equals(
																																																																																																												st)) {
																																																																																																											if (!pt.equals(
																																																																																																													sm)) {
																																																																																																												if (!pt.equals(
																																																																																																														st2a1)) {
																																																																																																													if (!pt.equals(
																																																																																																															s12p1)) {
																																																																																																														if (!pt.equals(
																																																																																																																sm2pn)) {
																																																																																																															if (!pt.equals(
																																																																																																																	s1)) {
																																																																																																																if (!pt.equals(
																																																																																																																		st2pt)) {
																																																																																																																	if (!pt.equals(
																																																																																																																			s2)) {
																																																																																																																		if (!pt.equals(
																																																																																																																				st2a2)) {
																																																																																																																			if (!pt.equals(
																																																																																																																					s22p2)) {
																																																																																																																				if (!s22p2
																																																																																																																						.equals(st)) {
																																																																																																																					if (!s22p2
																																																																																																																							.equals(sm)) {
																																																																																																																						if (!s22p2
																																																																																																																								.equals(st2a1)) {
																																																																																																																							if (!s22p2
																																																																																																																									.equals(sm2pn)) {
																																																																																																																								if (!s22p2
																																																																																																																										.equals(st2pt)) {
																																																																																																																									if (!s22p2
																																																																																																																											.equals(st2a2)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												png,
																																																																																																																												st,
																																																																																																																												sm,
																																																																																																																												a1,
																																																																																																																												a2,
																																																																																																																												p2,
																																																																																																																												st2a1,
																																																																																																																												s12p1,
																																																																																																																												p1,
																																																																																																																												sm2pn,
																																																																																																																												s1,
																																																																																																																												st2pt,
																																																																																																																												s2,
																																																																																																																												st2a2,
																																																																																																																												pt,
																																																																																																																												s22p2 };
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_transition2arctransarc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject png, EObject st, EObject sm, EObject a1, EObject a2, EObject p2,
			EObject st2a1, EObject p1, EObject s1, EObject st2pt, EObject s2, EObject st2a2, EObject pt) {
		EMoflonEdge png__a2____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm__st____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__a1____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__pt____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__p1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__pt____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a1__st____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a1__a1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2pt__st____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a2__st____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a2__a2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2pt__pt____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s2____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__pt____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__p2____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "transition2arctransarc";
		String png__a2____arcs_name_prime = "arcs";
		String sm__st____transitions_name_prime = "transitions";
		String png__a1____arcs_name_prime = "arcs";
		String a1__pt____to_name_prime = "to";
		String a1__p1____from_name_prime = "from";
		String st__s1____from_name_prime = "from";
		String png__pt____transitions_name_prime = "transitions";
		String st2a1__st____source_name_prime = "source";
		String st2a1__a1____target_name_prime = "target";
		String st2pt__st____source_name_prime = "source";
		String st2a2__st____source_name_prime = "source";
		String st2a2__a2____target_name_prime = "target";
		String st2pt__pt____target_name_prime = "target";
		String st__s2____to_name_prime = "to";
		String a2__pt____from_name_prime = "from";
		String a2__p2____to_name_prime = "to";
		png__a2____arcs.setSrc(png);
		png__a2____arcs.setTrg(a2);
		ruleresult.getCreatedEdges().add(png__a2____arcs);
		sm__st____transitions.setSrc(sm);
		sm__st____transitions.setTrg(st);
		ruleresult.getTranslatedEdges().add(sm__st____transitions);
		png__a1____arcs.setSrc(png);
		png__a1____arcs.setTrg(a1);
		ruleresult.getCreatedEdges().add(png__a1____arcs);
		a1__pt____to.setSrc(a1);
		a1__pt____to.setTrg(pt);
		ruleresult.getCreatedEdges().add(a1__pt____to);
		a1__p1____from.setSrc(a1);
		a1__p1____from.setTrg(p1);
		ruleresult.getCreatedEdges().add(a1__p1____from);
		st__s1____from.setSrc(st);
		st__s1____from.setTrg(s1);
		ruleresult.getTranslatedEdges().add(st__s1____from);
		png__pt____transitions.setSrc(png);
		png__pt____transitions.setTrg(pt);
		ruleresult.getCreatedEdges().add(png__pt____transitions);
		st2a1__st____source.setSrc(st2a1);
		st2a1__st____source.setTrg(st);
		ruleresult.getCreatedEdges().add(st2a1__st____source);
		st2a1__a1____target.setSrc(st2a1);
		st2a1__a1____target.setTrg(a1);
		ruleresult.getCreatedEdges().add(st2a1__a1____target);
		st2pt__st____source.setSrc(st2pt);
		st2pt__st____source.setTrg(st);
		ruleresult.getCreatedEdges().add(st2pt__st____source);
		st2a2__st____source.setSrc(st2a2);
		st2a2__st____source.setTrg(st);
		ruleresult.getCreatedEdges().add(st2a2__st____source);
		st2a2__a2____target.setSrc(st2a2);
		st2a2__a2____target.setTrg(a2);
		ruleresult.getCreatedEdges().add(st2a2__a2____target);
		st2pt__pt____target.setSrc(st2pt);
		st2pt__pt____target.setTrg(pt);
		ruleresult.getCreatedEdges().add(st2pt__pt____target);
		st__s2____to.setSrc(st);
		st__s2____to.setTrg(s2);
		ruleresult.getTranslatedEdges().add(st__s2____to);
		a2__pt____from.setSrc(a2);
		a2__pt____from.setTrg(pt);
		ruleresult.getCreatedEdges().add(a2__pt____from);
		a2__p2____to.setSrc(a2);
		a2__p2____to.setTrg(p2);
		ruleresult.getCreatedEdges().add(a2__p2____to);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		png__a2____arcs.setName(png__a2____arcs_name_prime);
		sm__st____transitions.setName(sm__st____transitions_name_prime);
		png__a1____arcs.setName(png__a1____arcs_name_prime);
		a1__pt____to.setName(a1__pt____to_name_prime);
		a1__p1____from.setName(a1__p1____from_name_prime);
		st__s1____from.setName(st__s1____from_name_prime);
		png__pt____transitions.setName(png__pt____transitions_name_prime);
		st2a1__st____source.setName(st2a1__st____source_name_prime);
		st2a1__a1____target.setName(st2a1__a1____target_name_prime);
		st2pt__st____source.setName(st2pt__st____source_name_prime);
		st2a2__st____source.setName(st2a2__st____source_name_prime);
		st2a2__a2____target.setName(st2a2__a2____target_name_prime);
		st2pt__pt____target.setName(st2pt__pt____target_name_prime);
		st__s2____to.setName(st__s2____to_name_prime);
		a2__pt____from.setName(a2__pt____from_name_prime);
		a2__p2____to.setName(a2__p2____to_name_prime);
		return new Object[] { ruleresult, png, st, sm, a1, a2, p2, st2a1, p1, s1, st2pt, s2, st2a2, pt, png__a2____arcs,
				sm__st____transitions, png__a1____arcs, a1__pt____to, a1__p1____from, st__s1____from,
				png__pt____transitions, st2a1__st____source, st2a1__a1____target, st2pt__st____source,
				st2a2__st____source, st2a2__a2____target, st2pt__pt____target, st__s2____to, a2__pt____from,
				a2__p2____to };
	}

	public static final void pattern_transition2arctransarc_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(
			transition2arctransarc _this, PerformRuleResult ruleresult, EObject png, EObject st, EObject sm, EObject a1,
			EObject a2, EObject p2, EObject st2a1, EObject s12p1, EObject p1, EObject sm2pn, EObject s1, EObject st2pt,
			EObject s2, EObject st2a2, EObject pt, EObject s22p2) {
		_this.registerObjects_FWD(ruleresult, png, st, sm, a1, a2, p2, st2a1, s12p1, p1, sm2pn, s1, st2pt, s2, st2a2,
				pt, s22p2);

	}

	public static final PerformRuleResult pattern_transition2arctransarc_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_2_1_preparereturnvalue_bindingFB(
			transition2arctransarc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_2_1_preparereturnvalue_blackFBB(EClass eClass,
			transition2arctransarc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_2_1_preparereturnvalue_bindingAndBlackFFB(
			transition2arctransarc _this) {
		Object[] result_pattern_transition2arctransarc_2_1_preparereturnvalue_binding = pattern_transition2arctransarc_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_transition2arctransarc_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_transition2arctransarc_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_transition2arctransarc_2_1_preparereturnvalue_black = pattern_transition2arctransarc_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_transition2arctransarc_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_transition2arctransarc_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "transition2arctransarc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_transition2arctransarc_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("st");
		EObject _localVariable_1 = match.getObject("sm");
		EObject _localVariable_2 = match.getObject("s1");
		EObject _localVariable_3 = match.getObject("s2");
		EObject tmpSt = _localVariable_0;
		EObject tmpSm = _localVariable_1;
		EObject tmpS1 = _localVariable_2;
		EObject tmpS2 = _localVariable_3;
		if (tmpSt instanceof Transition) {
			Transition st = (Transition) tmpSt;
			if (tmpSm instanceof SM) {
				SM sm = (SM) tmpSm;
				if (tmpS1 instanceof State) {
					State s1 = (State) tmpS1;
					if (tmpS2 instanceof State) {
						State s2 = (State) tmpS2;
						return new Object[] { st, sm, s1, s2, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_transition2arctransarc_2_2_corematch_blackFBBFFFFBBFB(Transition st,
			SM sm, State s1, State s2, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!s1.equals(s2)) {
			for (SM2PN sm2pn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(sm, SM2PN.class,
					"source")) {
				PNGraph png = sm2pn.getTarget();
				if (png != null) {
					for (S2P s22p2 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s2, S2P.class,
							"source")) {
						Place p2 = s22p2.getTarget();
						if (p2 != null) {
							for (S2P s12p1 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s1,
									S2P.class, "source")) {
								if (!s12p1.equals(s22p2)) {
									Place p1 = s12p1.getTarget();
									if (p1 != null) {
										if (!p1.equals(p2)) {
											_result.add(new Object[] { png, st, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2,
													match });
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

	public static final Iterable<Object[]> pattern_transition2arctransarc_2_3_findcontext_blackBBBBBBBBBB(PNGraph png,
			Transition st, SM sm, Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2, S2P s22p2) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!s12p1.equals(s22p2)) {
			if (!p1.equals(p2)) {
				if (!s1.equals(s2)) {
					if (sm.getTransitions().contains(st)) {
						if (s1.equals(st.getFrom())) {
							if (p1.equals(s12p1.getTarget())) {
								if (png.equals(sm2pn.getTarget())) {
									if (sm.equals(sm2pn.getSource())) {
										if (p2.equals(s22p2.getTarget())) {
											if (s2.equals(s22p2.getSource())) {
												if (s2.equals(st.getTo())) {
													if (s1.equals(s12p1.getSource())) {
														_result.add(new Object[] { png, st, sm, p2, s12p1, p1, sm2pn,
																s1, s2, s22p2 });
													}
												}
											}
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

	public static final Object[] pattern_transition2arctransarc_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFF(PNGraph png,
			Transition st, SM sm, Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2, S2P s22p2) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge sm__st____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s12p1__p1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm2pn__png____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm2pn__sm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s22p2__p2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s22p2__s2____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s2____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s12p1__s1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String sm__st____transitions_name_prime = "transitions";
		String st__s1____from_name_prime = "from";
		String s12p1__p1____target_name_prime = "target";
		String sm2pn__png____target_name_prime = "target";
		String sm2pn__sm____source_name_prime = "source";
		String s22p2__p2____target_name_prime = "target";
		String s22p2__s2____source_name_prime = "source";
		String st__s2____to_name_prime = "to";
		String s12p1__s1____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(png);
		isApplicableMatch.getAllContextElements().add(st);
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(p2);
		isApplicableMatch.getAllContextElements().add(s12p1);
		isApplicableMatch.getAllContextElements().add(p1);
		isApplicableMatch.getAllContextElements().add(sm2pn);
		isApplicableMatch.getAllContextElements().add(s1);
		isApplicableMatch.getAllContextElements().add(s2);
		isApplicableMatch.getAllContextElements().add(s22p2);
		sm__st____transitions.setSrc(sm);
		sm__st____transitions.setTrg(st);
		isApplicableMatch.getAllContextElements().add(sm__st____transitions);
		st__s1____from.setSrc(st);
		st__s1____from.setTrg(s1);
		isApplicableMatch.getAllContextElements().add(st__s1____from);
		s12p1__p1____target.setSrc(s12p1);
		s12p1__p1____target.setTrg(p1);
		isApplicableMatch.getAllContextElements().add(s12p1__p1____target);
		sm2pn__png____target.setSrc(sm2pn);
		sm2pn__png____target.setTrg(png);
		isApplicableMatch.getAllContextElements().add(sm2pn__png____target);
		sm2pn__sm____source.setSrc(sm2pn);
		sm2pn__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(sm2pn__sm____source);
		s22p2__p2____target.setSrc(s22p2);
		s22p2__p2____target.setTrg(p2);
		isApplicableMatch.getAllContextElements().add(s22p2__p2____target);
		s22p2__s2____source.setSrc(s22p2);
		s22p2__s2____source.setTrg(s2);
		isApplicableMatch.getAllContextElements().add(s22p2__s2____source);
		st__s2____to.setSrc(st);
		st__s2____to.setTrg(s2);
		isApplicableMatch.getAllContextElements().add(st__s2____to);
		s12p1__s1____source.setSrc(s12p1);
		s12p1__s1____source.setTrg(s1);
		isApplicableMatch.getAllContextElements().add(s12p1__s1____source);
		sm__st____transitions.setName(sm__st____transitions_name_prime);
		st__s1____from.setName(st__s1____from_name_prime);
		s12p1__p1____target.setName(s12p1__p1____target_name_prime);
		sm2pn__png____target.setName(sm2pn__png____target_name_prime);
		sm2pn__sm____source.setName(sm2pn__sm____source_name_prime);
		s22p2__p2____target.setName(s22p2__p2____target_name_prime);
		s22p2__s2____source.setName(s22p2__s2____source_name_prime);
		st__s2____to.setName(st__s2____to_name_prime);
		s12p1__s1____source.setName(s12p1__s1____source_name_prime);
		return new Object[] { png, st, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2, isApplicableMatch,
				sm__st____transitions, st__s1____from, s12p1__p1____target, sm2pn__png____target, sm2pn__sm____source,
				s22p2__p2____target, s22p2__s2____source, st__s2____to, s12p1__s1____source };
	}

	public static final Object[] pattern_transition2arctransarc_2_4_solveCSP_bindingFBBBBBBBBBBBB(
			transition2arctransarc _this, IsApplicableMatch isApplicableMatch, PNGraph png, Transition st, SM sm,
			Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2, S2P s22p2) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, png, st, sm, p2, s12p1, p1, sm2pn, s1,
				s2, s22p2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, png, st, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2 };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_transition2arctransarc_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			transition2arctransarc _this, IsApplicableMatch isApplicableMatch, PNGraph png, Transition st, SM sm,
			Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2, S2P s22p2) {
		Object[] result_pattern_transition2arctransarc_2_4_solveCSP_binding = pattern_transition2arctransarc_2_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, png, st, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2);
		if (result_pattern_transition2arctransarc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_transition2arctransarc_2_4_solveCSP_binding[0];

			Object[] result_pattern_transition2arctransarc_2_4_solveCSP_black = pattern_transition2arctransarc_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_transition2arctransarc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, png, st, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2 };
			}
		}
		return null;
	}

	public static final boolean pattern_transition2arctransarc_2_5_checkCSP_expressionFBB(transition2arctransarc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_transition2arctransarc_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "transition2arctransarc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_transition2arctransarc_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_10_1_initialbindings_blackBBBBBBBB(
			transition2arctransarc _this, Match match, PNGraph png, Arc a1, Arc a2, Place p2, Place p1,
			petrinet.Transition pt) {
		if (!a1.equals(a2)) {
			if (!p1.equals(p2)) {
				return new Object[] { _this, match, png, a1, a2, p2, p1, pt };
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_10_2_SolveCSP_bindingFBBBBBBBB(
			transition2arctransarc _this, Match match, PNGraph png, Arc a1, Arc a2, Place p2, Place p1,
			petrinet.Transition pt) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, png, a1, a2, p2, p1, pt);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, png, a1, a2, p2, p1, pt };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_transition2arctransarc_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(
			transition2arctransarc _this, Match match, PNGraph png, Arc a1, Arc a2, Place p2, Place p1,
			petrinet.Transition pt) {
		Object[] result_pattern_transition2arctransarc_10_2_SolveCSP_binding = pattern_transition2arctransarc_10_2_SolveCSP_bindingFBBBBBBBB(
				_this, match, png, a1, a2, p2, p1, pt);
		if (result_pattern_transition2arctransarc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_transition2arctransarc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_transition2arctransarc_10_2_SolveCSP_black = pattern_transition2arctransarc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_transition2arctransarc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, png, a1, a2, p2, p1, pt };
			}
		}
		return null;
	}

	public static final boolean pattern_transition2arctransarc_10_3_CheckCSP_expressionFBB(transition2arctransarc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_10_4_collectelementstobetranslated_blackBBBBBBB(
			Match match, PNGraph png, Arc a1, Arc a2, Place p2, Place p1, petrinet.Transition pt) {
		if (!a1.equals(a2)) {
			if (!p1.equals(p2)) {
				return new Object[] { match, png, a1, a2, p2, p1, pt };
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFF(
			Match match, PNGraph png, Arc a1, Arc a2, Place p2, Place p1, petrinet.Transition pt) {
		EMoflonEdge png__a2____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__a1____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__pt____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__p1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__pt____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__pt____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__p2____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a1);
		match.getToBeTranslatedNodes().add(a2);
		match.getToBeTranslatedNodes().add(pt);
		String png__a2____arcs_name_prime = "arcs";
		String png__a1____arcs_name_prime = "arcs";
		String a1__pt____to_name_prime = "to";
		String a1__p1____from_name_prime = "from";
		String png__pt____transitions_name_prime = "transitions";
		String a2__pt____from_name_prime = "from";
		String a2__p2____to_name_prime = "to";
		png__a2____arcs.setSrc(png);
		png__a2____arcs.setTrg(a2);
		match.getToBeTranslatedEdges().add(png__a2____arcs);
		png__a1____arcs.setSrc(png);
		png__a1____arcs.setTrg(a1);
		match.getToBeTranslatedEdges().add(png__a1____arcs);
		a1__pt____to.setSrc(a1);
		a1__pt____to.setTrg(pt);
		match.getToBeTranslatedEdges().add(a1__pt____to);
		a1__p1____from.setSrc(a1);
		a1__p1____from.setTrg(p1);
		match.getToBeTranslatedEdges().add(a1__p1____from);
		png__pt____transitions.setSrc(png);
		png__pt____transitions.setTrg(pt);
		match.getToBeTranslatedEdges().add(png__pt____transitions);
		a2__pt____from.setSrc(a2);
		a2__pt____from.setTrg(pt);
		match.getToBeTranslatedEdges().add(a2__pt____from);
		a2__p2____to.setSrc(a2);
		a2__p2____to.setTrg(p2);
		match.getToBeTranslatedEdges().add(a2__p2____to);
		png__a2____arcs.setName(png__a2____arcs_name_prime);
		png__a1____arcs.setName(png__a1____arcs_name_prime);
		a1__pt____to.setName(a1__pt____to_name_prime);
		a1__p1____from.setName(a1__p1____from_name_prime);
		png__pt____transitions.setName(png__pt____transitions_name_prime);
		a2__pt____from.setName(a2__pt____from_name_prime);
		a2__p2____to.setName(a2__p2____to_name_prime);
		return new Object[] { match, png, a1, a2, p2, p1, pt, png__a2____arcs, png__a1____arcs, a1__pt____to,
				a1__p1____from, png__pt____transitions, a2__pt____from, a2__p2____to };
	}

	public static final Object[] pattern_transition2arctransarc_10_5_collectcontextelements_blackBBBBBBB(Match match,
			PNGraph png, Arc a1, Arc a2, Place p2, Place p1, petrinet.Transition pt) {
		if (!a1.equals(a2)) {
			if (!p1.equals(p2)) {
				return new Object[] { match, png, a1, a2, p2, p1, pt };
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_10_5_collectcontextelements_greenBBBB(Match match,
			PNGraph png, Place p2, Place p1) {
		match.getContextNodes().add(png);
		match.getContextNodes().add(p2);
		match.getContextNodes().add(p1);
		return new Object[] { match, png, p2, p1 };
	}

	public static final void pattern_transition2arctransarc_10_6_registerobjectstomatch_expressionBBBBBBBB(
			transition2arctransarc _this, Match match, PNGraph png, Arc a1, Arc a2, Place p2, Place p1,
			petrinet.Transition pt) {
		_this.registerObjectsToMatch_BWD(match, png, a1, a2, p2, p1, pt);

	}

	public static final boolean pattern_transition2arctransarc_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_transition2arctransarc_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_11_1_performtransformation_bindingFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("png");
		EObject _localVariable_1 = isApplicableMatch.getObject("sm");
		EObject _localVariable_2 = isApplicableMatch.getObject("a1");
		EObject _localVariable_3 = isApplicableMatch.getObject("a2");
		EObject _localVariable_4 = isApplicableMatch.getObject("p2");
		EObject _localVariable_5 = isApplicableMatch.getObject("s12p1");
		EObject _localVariable_6 = isApplicableMatch.getObject("p1");
		EObject _localVariable_7 = isApplicableMatch.getObject("sm2pn");
		EObject _localVariable_8 = isApplicableMatch.getObject("s1");
		EObject _localVariable_9 = isApplicableMatch.getObject("s2");
		EObject _localVariable_10 = isApplicableMatch.getObject("pt");
		EObject _localVariable_11 = isApplicableMatch.getObject("s22p2");
		EObject tmpPng = _localVariable_0;
		EObject tmpSm = _localVariable_1;
		EObject tmpA1 = _localVariable_2;
		EObject tmpA2 = _localVariable_3;
		EObject tmpP2 = _localVariable_4;
		EObject tmpS12p1 = _localVariable_5;
		EObject tmpP1 = _localVariable_6;
		EObject tmpSm2pn = _localVariable_7;
		EObject tmpS1 = _localVariable_8;
		EObject tmpS2 = _localVariable_9;
		EObject tmpPt = _localVariable_10;
		EObject tmpS22p2 = _localVariable_11;
		if (tmpPng instanceof PNGraph) {
			PNGraph png = (PNGraph) tmpPng;
			if (tmpSm instanceof SM) {
				SM sm = (SM) tmpSm;
				if (tmpA1 instanceof Arc) {
					Arc a1 = (Arc) tmpA1;
					if (tmpA2 instanceof Arc) {
						Arc a2 = (Arc) tmpA2;
						if (tmpP2 instanceof Place) {
							Place p2 = (Place) tmpP2;
							if (tmpS12p1 instanceof S2P) {
								S2P s12p1 = (S2P) tmpS12p1;
								if (tmpP1 instanceof Place) {
									Place p1 = (Place) tmpP1;
									if (tmpSm2pn instanceof SM2PN) {
										SM2PN sm2pn = (SM2PN) tmpSm2pn;
										if (tmpS1 instanceof State) {
											State s1 = (State) tmpS1;
											if (tmpS2 instanceof State) {
												State s2 = (State) tmpS2;
												if (tmpPt instanceof petrinet.Transition) {
													petrinet.Transition pt = (petrinet.Transition) tmpPt;
													if (tmpS22p2 instanceof S2P) {
														S2P s22p2 = (S2P) tmpS22p2;
														return new Object[] { png, sm, a1, a2, p2, s12p1, p1, sm2pn, s1,
																s2, pt, s22p2, isApplicableMatch };
													}
												}
											}
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

	public static final Object[] pattern_transition2arctransarc_11_1_performtransformation_blackBBBBBBBBBBBBFBB(
			PNGraph png, SM sm, Arc a1, Arc a2, Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2,
			petrinet.Transition pt, S2P s22p2, transition2arctransarc _this, IsApplicableMatch isApplicableMatch) {
		if (!a1.equals(a2)) {
			if (!s12p1.equals(s22p2)) {
				if (!p1.equals(p2)) {
					if (!s1.equals(s2)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { png, sm, a1, a2, p2, s12p1, p1, sm2pn, s1, s2, pt, s22p2, csp,
										_this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFBB(
			transition2arctransarc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_transition2arctransarc_11_1_performtransformation_binding = pattern_transition2arctransarc_11_1_performtransformation_bindingFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_transition2arctransarc_11_1_performtransformation_binding != null) {
			PNGraph png = (PNGraph) result_pattern_transition2arctransarc_11_1_performtransformation_binding[0];
			SM sm = (SM) result_pattern_transition2arctransarc_11_1_performtransformation_binding[1];
			Arc a1 = (Arc) result_pattern_transition2arctransarc_11_1_performtransformation_binding[2];
			Arc a2 = (Arc) result_pattern_transition2arctransarc_11_1_performtransformation_binding[3];
			Place p2 = (Place) result_pattern_transition2arctransarc_11_1_performtransformation_binding[4];
			S2P s12p1 = (S2P) result_pattern_transition2arctransarc_11_1_performtransformation_binding[5];
			Place p1 = (Place) result_pattern_transition2arctransarc_11_1_performtransformation_binding[6];
			SM2PN sm2pn = (SM2PN) result_pattern_transition2arctransarc_11_1_performtransformation_binding[7];
			State s1 = (State) result_pattern_transition2arctransarc_11_1_performtransformation_binding[8];
			State s2 = (State) result_pattern_transition2arctransarc_11_1_performtransformation_binding[9];
			petrinet.Transition pt = (petrinet.Transition) result_pattern_transition2arctransarc_11_1_performtransformation_binding[10];
			S2P s22p2 = (S2P) result_pattern_transition2arctransarc_11_1_performtransformation_binding[11];

			Object[] result_pattern_transition2arctransarc_11_1_performtransformation_black = pattern_transition2arctransarc_11_1_performtransformation_blackBBBBBBBBBBBBFBB(
					png, sm, a1, a2, p2, s12p1, p1, sm2pn, s1, s2, pt, s22p2, _this, isApplicableMatch);
			if (result_pattern_transition2arctransarc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_transition2arctransarc_11_1_performtransformation_black[12];

				return new Object[] { png, sm, a1, a2, p2, s12p1, p1, sm2pn, s1, s2, pt, s22p2, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_11_1_performtransformation_greenFBBBFBFBFB(SM sm,
			Arc a1, Arc a2, State s1, State s2, petrinet.Transition pt) {
		Transition st = StatemachineFactory.eINSTANCE.createTransition();
		T2A st2a1 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		T2T st2pt = Statemachine2petrinetFactory.eINSTANCE.createT2T();
		T2A st2a2 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		sm.getTransitions().add(st);
		st.setFrom(s1);
		st.setTo(s2);
		st2a1.setSource(st);
		st2a1.setTarget(a1);
		st2pt.setSource(st);
		st2pt.setTarget(pt);
		st2a2.setSource(st);
		st2a2.setTarget(a2);
		return new Object[] { st, sm, a1, a2, st2a1, s1, st2pt, s2, st2a2, pt };
	}

	public static final Object[] pattern_transition2arctransarc_11_2_collecttranslatedelements_blackBBBBBBB(
			Transition st, Arc a1, Arc a2, T2A st2a1, T2T st2pt, T2A st2a2, petrinet.Transition pt) {
		if (!a1.equals(a2)) {
			if (!st2a1.equals(st2a2)) {
				return new Object[] { st, a1, a2, st2a1, st2pt, st2a2, pt };
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_11_2_collecttranslatedelements_greenFBBBBBBB(
			Transition st, Arc a1, Arc a2, T2A st2a1, T2T st2pt, T2A st2a2, petrinet.Transition pt) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(st);
		ruleresult.getTranslatedElements().add(a1);
		ruleresult.getTranslatedElements().add(a2);
		ruleresult.getCreatedLinkElements().add(st2a1);
		ruleresult.getCreatedLinkElements().add(st2pt);
		ruleresult.getCreatedLinkElements().add(st2a2);
		ruleresult.getTranslatedElements().add(pt);
		return new Object[] { ruleresult, st, a1, a2, st2a1, st2pt, st2a2, pt };
	}

	public static final Object[] pattern_transition2arctransarc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject png, EObject st, EObject sm, EObject a1, EObject a2, EObject p2,
			EObject st2a1, EObject s12p1, EObject p1, EObject sm2pn, EObject s1, EObject st2pt, EObject s2,
			EObject st2a2, EObject pt, EObject s22p2) {
		if (!png.equals(st)) {
			if (!png.equals(sm)) {
				if (!png.equals(st2a1)) {
					if (!png.equals(s12p1)) {
						if (!png.equals(sm2pn)) {
							if (!png.equals(s1)) {
								if (!png.equals(st2pt)) {
									if (!png.equals(s2)) {
										if (!png.equals(st2a2)) {
											if (!png.equals(pt)) {
												if (!png.equals(s22p2)) {
													if (!st.equals(st2a1)) {
														if (!st.equals(st2pt)) {
															if (!st.equals(st2a2)) {
																if (!sm.equals(st)) {
																	if (!sm.equals(st2a1)) {
																		if (!sm.equals(sm2pn)) {
																			if (!sm.equals(st2pt)) {
																				if (!sm.equals(st2a2)) {
																					if (!a1.equals(png)) {
																						if (!a1.equals(st)) {
																							if (!a1.equals(sm)) {
																								if (!a1.equals(a2)) {
																									if (!a1.equals(
																											p2)) {
																										if (!a1.equals(
																												st2a1)) {
																											if (!a1.equals(
																													s12p1)) {
																												if (!a1.equals(
																														p1)) {
																													if (!a1.equals(
																															sm2pn)) {
																														if (!a1.equals(
																																s1)) {
																															if (!a1.equals(
																																	st2pt)) {
																																if (!a1.equals(
																																		s2)) {
																																	if (!a1.equals(
																																			st2a2)) {
																																		if (!a1.equals(
																																				pt)) {
																																			if (!a1.equals(
																																					s22p2)) {
																																				if (!a2.equals(
																																						png)) {
																																					if (!a2.equals(
																																							st)) {
																																						if (!a2.equals(
																																								sm)) {
																																							if (!a2.equals(
																																									p2)) {
																																								if (!a2.equals(
																																										st2a1)) {
																																									if (!a2.equals(
																																											s12p1)) {
																																										if (!a2.equals(
																																												p1)) {
																																											if (!a2.equals(
																																													sm2pn)) {
																																												if (!a2.equals(
																																														s1)) {
																																													if (!a2.equals(
																																															st2pt)) {
																																														if (!a2.equals(
																																																s2)) {
																																															if (!a2.equals(
																																																	st2a2)) {
																																																if (!a2.equals(
																																																		pt)) {
																																																	if (!a2.equals(
																																																			s22p2)) {
																																																		if (!p2.equals(
																																																				png)) {
																																																			if (!p2.equals(
																																																					st)) {
																																																				if (!p2.equals(
																																																						sm)) {
																																																					if (!p2.equals(
																																																							st2a1)) {
																																																						if (!p2.equals(
																																																								s12p1)) {
																																																							if (!p2.equals(
																																																									sm2pn)) {
																																																								if (!p2.equals(
																																																										s1)) {
																																																									if (!p2.equals(
																																																											st2pt)) {
																																																										if (!p2.equals(
																																																												s2)) {
																																																											if (!p2.equals(
																																																													st2a2)) {
																																																												if (!p2.equals(
																																																														pt)) {
																																																													if (!p2.equals(
																																																															s22p2)) {
																																																														if (!st2a1
																																																																.equals(st2pt)) {
																																																															if (!st2a1
																																																																	.equals(st2a2)) {
																																																																if (!s12p1
																																																																		.equals(st)) {
																																																																	if (!s12p1
																																																																			.equals(sm)) {
																																																																		if (!s12p1
																																																																				.equals(st2a1)) {
																																																																			if (!s12p1
																																																																					.equals(sm2pn)) {
																																																																				if (!s12p1
																																																																						.equals(st2pt)) {
																																																																					if (!s12p1
																																																																							.equals(s2)) {
																																																																						if (!s12p1
																																																																								.equals(st2a2)) {
																																																																							if (!s12p1
																																																																									.equals(s22p2)) {
																																																																								if (!p1.equals(
																																																																										png)) {
																																																																									if (!p1.equals(
																																																																											st)) {
																																																																										if (!p1.equals(
																																																																												sm)) {
																																																																											if (!p1.equals(
																																																																													p2)) {
																																																																												if (!p1.equals(
																																																																														st2a1)) {
																																																																													if (!p1.equals(
																																																																															s12p1)) {
																																																																														if (!p1.equals(
																																																																																sm2pn)) {
																																																																															if (!p1.equals(
																																																																																	s1)) {
																																																																																if (!p1.equals(
																																																																																		st2pt)) {
																																																																																	if (!p1.equals(
																																																																																			s2)) {
																																																																																		if (!p1.equals(
																																																																																				st2a2)) {
																																																																																			if (!p1.equals(
																																																																																					pt)) {
																																																																																				if (!p1.equals(
																																																																																						s22p2)) {
																																																																																					if (!sm2pn
																																																																																							.equals(st)) {
																																																																																						if (!sm2pn
																																																																																								.equals(st2a1)) {
																																																																																							if (!sm2pn
																																																																																									.equals(st2pt)) {
																																																																																								if (!sm2pn
																																																																																										.equals(st2a2)) {
																																																																																									if (!s1.equals(
																																																																																											st)) {
																																																																																										if (!s1.equals(
																																																																																												sm)) {
																																																																																											if (!s1.equals(
																																																																																													st2a1)) {
																																																																																												if (!s1.equals(
																																																																																														s12p1)) {
																																																																																													if (!s1.equals(
																																																																																															sm2pn)) {
																																																																																														if (!s1.equals(
																																																																																																st2pt)) {
																																																																																															if (!s1.equals(
																																																																																																	s2)) {
																																																																																																if (!s1.equals(
																																																																																																		st2a2)) {
																																																																																																	if (!s1.equals(
																																																																																																			s22p2)) {
																																																																																																		if (!s2.equals(
																																																																																																				st)) {
																																																																																																			if (!s2.equals(
																																																																																																					sm)) {
																																																																																																				if (!s2.equals(
																																																																																																						st2a1)) {
																																																																																																					if (!s2.equals(
																																																																																																							sm2pn)) {
																																																																																																						if (!s2.equals(
																																																																																																								st2pt)) {
																																																																																																							if (!s2.equals(
																																																																																																									st2a2)) {
																																																																																																								if (!s2.equals(
																																																																																																										s22p2)) {
																																																																																																									if (!st2a2
																																																																																																											.equals(st2pt)) {
																																																																																																										if (!pt.equals(
																																																																																																												st)) {
																																																																																																											if (!pt.equals(
																																																																																																													sm)) {
																																																																																																												if (!pt.equals(
																																																																																																														st2a1)) {
																																																																																																													if (!pt.equals(
																																																																																																															s12p1)) {
																																																																																																														if (!pt.equals(
																																																																																																																sm2pn)) {
																																																																																																															if (!pt.equals(
																																																																																																																	s1)) {
																																																																																																																if (!pt.equals(
																																																																																																																		st2pt)) {
																																																																																																																	if (!pt.equals(
																																																																																																																			s2)) {
																																																																																																																		if (!pt.equals(
																																																																																																																				st2a2)) {
																																																																																																																			if (!pt.equals(
																																																																																																																					s22p2)) {
																																																																																																																				if (!s22p2
																																																																																																																						.equals(st)) {
																																																																																																																					if (!s22p2
																																																																																																																							.equals(sm)) {
																																																																																																																						if (!s22p2
																																																																																																																								.equals(st2a1)) {
																																																																																																																							if (!s22p2
																																																																																																																									.equals(sm2pn)) {
																																																																																																																								if (!s22p2
																																																																																																																										.equals(st2pt)) {
																																																																																																																									if (!s22p2
																																																																																																																											.equals(st2a2)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												png,
																																																																																																																												st,
																																																																																																																												sm,
																																																																																																																												a1,
																																																																																																																												a2,
																																																																																																																												p2,
																																																																																																																												st2a1,
																																																																																																																												s12p1,
																																																																																																																												p1,
																																																																																																																												sm2pn,
																																																																																																																												s1,
																																																																																																																												st2pt,
																																																																																																																												s2,
																																																																																																																												st2a2,
																																																																																																																												pt,
																																																																																																																												s22p2 };
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_transition2arctransarc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject png, EObject st, EObject sm, EObject a1, EObject a2, EObject p2,
			EObject st2a1, EObject p1, EObject s1, EObject st2pt, EObject s2, EObject st2a2, EObject pt) {
		EMoflonEdge png__a2____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm__st____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__a1____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__pt____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__p1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__pt____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a1__st____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a1__a1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2pt__st____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a2__st____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a2__a2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2pt__pt____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s2____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__pt____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__p2____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "transition2arctransarc";
		String png__a2____arcs_name_prime = "arcs";
		String sm__st____transitions_name_prime = "transitions";
		String png__a1____arcs_name_prime = "arcs";
		String a1__pt____to_name_prime = "to";
		String a1__p1____from_name_prime = "from";
		String st__s1____from_name_prime = "from";
		String png__pt____transitions_name_prime = "transitions";
		String st2a1__st____source_name_prime = "source";
		String st2a1__a1____target_name_prime = "target";
		String st2pt__st____source_name_prime = "source";
		String st2a2__st____source_name_prime = "source";
		String st2a2__a2____target_name_prime = "target";
		String st2pt__pt____target_name_prime = "target";
		String st__s2____to_name_prime = "to";
		String a2__pt____from_name_prime = "from";
		String a2__p2____to_name_prime = "to";
		png__a2____arcs.setSrc(png);
		png__a2____arcs.setTrg(a2);
		ruleresult.getTranslatedEdges().add(png__a2____arcs);
		sm__st____transitions.setSrc(sm);
		sm__st____transitions.setTrg(st);
		ruleresult.getCreatedEdges().add(sm__st____transitions);
		png__a1____arcs.setSrc(png);
		png__a1____arcs.setTrg(a1);
		ruleresult.getTranslatedEdges().add(png__a1____arcs);
		a1__pt____to.setSrc(a1);
		a1__pt____to.setTrg(pt);
		ruleresult.getTranslatedEdges().add(a1__pt____to);
		a1__p1____from.setSrc(a1);
		a1__p1____from.setTrg(p1);
		ruleresult.getTranslatedEdges().add(a1__p1____from);
		st__s1____from.setSrc(st);
		st__s1____from.setTrg(s1);
		ruleresult.getCreatedEdges().add(st__s1____from);
		png__pt____transitions.setSrc(png);
		png__pt____transitions.setTrg(pt);
		ruleresult.getTranslatedEdges().add(png__pt____transitions);
		st2a1__st____source.setSrc(st2a1);
		st2a1__st____source.setTrg(st);
		ruleresult.getCreatedEdges().add(st2a1__st____source);
		st2a1__a1____target.setSrc(st2a1);
		st2a1__a1____target.setTrg(a1);
		ruleresult.getCreatedEdges().add(st2a1__a1____target);
		st2pt__st____source.setSrc(st2pt);
		st2pt__st____source.setTrg(st);
		ruleresult.getCreatedEdges().add(st2pt__st____source);
		st2a2__st____source.setSrc(st2a2);
		st2a2__st____source.setTrg(st);
		ruleresult.getCreatedEdges().add(st2a2__st____source);
		st2a2__a2____target.setSrc(st2a2);
		st2a2__a2____target.setTrg(a2);
		ruleresult.getCreatedEdges().add(st2a2__a2____target);
		st2pt__pt____target.setSrc(st2pt);
		st2pt__pt____target.setTrg(pt);
		ruleresult.getCreatedEdges().add(st2pt__pt____target);
		st__s2____to.setSrc(st);
		st__s2____to.setTrg(s2);
		ruleresult.getCreatedEdges().add(st__s2____to);
		a2__pt____from.setSrc(a2);
		a2__pt____from.setTrg(pt);
		ruleresult.getTranslatedEdges().add(a2__pt____from);
		a2__p2____to.setSrc(a2);
		a2__p2____to.setTrg(p2);
		ruleresult.getTranslatedEdges().add(a2__p2____to);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		png__a2____arcs.setName(png__a2____arcs_name_prime);
		sm__st____transitions.setName(sm__st____transitions_name_prime);
		png__a1____arcs.setName(png__a1____arcs_name_prime);
		a1__pt____to.setName(a1__pt____to_name_prime);
		a1__p1____from.setName(a1__p1____from_name_prime);
		st__s1____from.setName(st__s1____from_name_prime);
		png__pt____transitions.setName(png__pt____transitions_name_prime);
		st2a1__st____source.setName(st2a1__st____source_name_prime);
		st2a1__a1____target.setName(st2a1__a1____target_name_prime);
		st2pt__st____source.setName(st2pt__st____source_name_prime);
		st2a2__st____source.setName(st2a2__st____source_name_prime);
		st2a2__a2____target.setName(st2a2__a2____target_name_prime);
		st2pt__pt____target.setName(st2pt__pt____target_name_prime);
		st__s2____to.setName(st__s2____to_name_prime);
		a2__pt____from.setName(a2__pt____from_name_prime);
		a2__p2____to.setName(a2__p2____to_name_prime);
		return new Object[] { ruleresult, png, st, sm, a1, a2, p2, st2a1, p1, s1, st2pt, s2, st2a2, pt, png__a2____arcs,
				sm__st____transitions, png__a1____arcs, a1__pt____to, a1__p1____from, st__s1____from,
				png__pt____transitions, st2a1__st____source, st2a1__a1____target, st2pt__st____source,
				st2a2__st____source, st2a2__a2____target, st2pt__pt____target, st__s2____to, a2__pt____from,
				a2__p2____to };
	}

	public static final void pattern_transition2arctransarc_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(
			transition2arctransarc _this, PerformRuleResult ruleresult, EObject png, EObject st, EObject sm, EObject a1,
			EObject a2, EObject p2, EObject st2a1, EObject s12p1, EObject p1, EObject sm2pn, EObject s1, EObject st2pt,
			EObject s2, EObject st2a2, EObject pt, EObject s22p2) {
		_this.registerObjects_BWD(ruleresult, png, st, sm, a1, a2, p2, st2a1, s12p1, p1, sm2pn, s1, st2pt, s2, st2a2,
				pt, s22p2);

	}

	public static final PerformRuleResult pattern_transition2arctransarc_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_12_1_preparereturnvalue_bindingFB(
			transition2arctransarc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_12_1_preparereturnvalue_blackFBB(EClass eClass,
			transition2arctransarc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_12_1_preparereturnvalue_bindingAndBlackFFB(
			transition2arctransarc _this) {
		Object[] result_pattern_transition2arctransarc_12_1_preparereturnvalue_binding = pattern_transition2arctransarc_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_transition2arctransarc_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_transition2arctransarc_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_transition2arctransarc_12_1_preparereturnvalue_black = pattern_transition2arctransarc_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_transition2arctransarc_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_transition2arctransarc_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "transition2arctransarc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_transition2arctransarc_12_2_corematch_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("png");
		EObject _localVariable_1 = match.getObject("a1");
		EObject _localVariable_2 = match.getObject("a2");
		EObject _localVariable_3 = match.getObject("p2");
		EObject _localVariable_4 = match.getObject("p1");
		EObject _localVariable_5 = match.getObject("pt");
		EObject tmpPng = _localVariable_0;
		EObject tmpA1 = _localVariable_1;
		EObject tmpA2 = _localVariable_2;
		EObject tmpP2 = _localVariable_3;
		EObject tmpP1 = _localVariable_4;
		EObject tmpPt = _localVariable_5;
		if (tmpPng instanceof PNGraph) {
			PNGraph png = (PNGraph) tmpPng;
			if (tmpA1 instanceof Arc) {
				Arc a1 = (Arc) tmpA1;
				if (tmpA2 instanceof Arc) {
					Arc a2 = (Arc) tmpA2;
					if (tmpP2 instanceof Place) {
						Place p2 = (Place) tmpP2;
						if (tmpP1 instanceof Place) {
							Place p1 = (Place) tmpP1;
							if (tmpPt instanceof petrinet.Transition) {
								petrinet.Transition pt = (petrinet.Transition) tmpPt;
								return new Object[] { png, a1, a2, p2, p1, pt, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_transition2arctransarc_12_2_corematch_blackBFBBBFBFFFBFB(PNGraph png,
			Arc a1, Arc a2, Place p2, Place p1, petrinet.Transition pt, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a1.equals(a2)) {
			if (!p1.equals(p2)) {
				for (S2P s12p1 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p1, S2P.class,
						"target")) {
					State s1 = s12p1.getSource();
					if (s1 != null) {
						for (SM2PN sm2pn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(png,
								SM2PN.class, "target")) {
							SM sm = sm2pn.getSource();
							if (sm != null) {
								for (S2P s22p2 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p2,
										S2P.class, "target")) {
									if (!s12p1.equals(s22p2)) {
										State s2 = s22p2.getSource();
										if (s2 != null) {
											if (!s1.equals(s2)) {
												_result.add(new Object[] { png, sm, a1, a2, p2, s12p1, p1, sm2pn, s1,
														s2, pt, s22p2, match });
											}
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

	public static final Iterable<Object[]> pattern_transition2arctransarc_12_3_findcontext_blackBBBBBBBBBBBB(
			PNGraph png, SM sm, Arc a1, Arc a2, Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2,
			petrinet.Transition pt, S2P s22p2) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a1.equals(a2)) {
			if (!s12p1.equals(s22p2)) {
				if (!p1.equals(p2)) {
					if (!s1.equals(s2)) {
						if (png.getArcs().contains(a2)) {
							if (png.getArcs().contains(a1)) {
								if (pt.equals(a1.getTo())) {
									if (p1.equals(a1.getFrom())) {
										if (png.getTransitions().contains(pt)) {
											if (p1.equals(s12p1.getTarget())) {
												if (png.equals(sm2pn.getTarget())) {
													if (sm.equals(sm2pn.getSource())) {
														if (p2.equals(s22p2.getTarget())) {
															if (s2.equals(s22p2.getSource())) {
																if (s1.equals(s12p1.getSource())) {
																	if (pt.equals(a2.getFrom())) {
																		if (p2.equals(a2.getTo())) {
																			_result.add(new Object[] { png, sm, a1, a2,
																					p2, s12p1, p1, sm2pn, s1, s2, pt,
																					s22p2 });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_transition2arctransarc_12_3_findcontext_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PNGraph png, SM sm, Arc a1, Arc a2, Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2,
			petrinet.Transition pt, S2P s22p2) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge png__a2____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__a1____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__pt____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__p1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__pt____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s12p1__p1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm2pn__png____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm2pn__sm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s22p2__p2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s22p2__s2____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s12p1__s1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__pt____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__p2____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String png__a2____arcs_name_prime = "arcs";
		String png__a1____arcs_name_prime = "arcs";
		String a1__pt____to_name_prime = "to";
		String a1__p1____from_name_prime = "from";
		String png__pt____transitions_name_prime = "transitions";
		String s12p1__p1____target_name_prime = "target";
		String sm2pn__png____target_name_prime = "target";
		String sm2pn__sm____source_name_prime = "source";
		String s22p2__p2____target_name_prime = "target";
		String s22p2__s2____source_name_prime = "source";
		String s12p1__s1____source_name_prime = "source";
		String a2__pt____from_name_prime = "from";
		String a2__p2____to_name_prime = "to";
		isApplicableMatch.getAllContextElements().add(png);
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(a1);
		isApplicableMatch.getAllContextElements().add(a2);
		isApplicableMatch.getAllContextElements().add(p2);
		isApplicableMatch.getAllContextElements().add(s12p1);
		isApplicableMatch.getAllContextElements().add(p1);
		isApplicableMatch.getAllContextElements().add(sm2pn);
		isApplicableMatch.getAllContextElements().add(s1);
		isApplicableMatch.getAllContextElements().add(s2);
		isApplicableMatch.getAllContextElements().add(pt);
		isApplicableMatch.getAllContextElements().add(s22p2);
		png__a2____arcs.setSrc(png);
		png__a2____arcs.setTrg(a2);
		isApplicableMatch.getAllContextElements().add(png__a2____arcs);
		png__a1____arcs.setSrc(png);
		png__a1____arcs.setTrg(a1);
		isApplicableMatch.getAllContextElements().add(png__a1____arcs);
		a1__pt____to.setSrc(a1);
		a1__pt____to.setTrg(pt);
		isApplicableMatch.getAllContextElements().add(a1__pt____to);
		a1__p1____from.setSrc(a1);
		a1__p1____from.setTrg(p1);
		isApplicableMatch.getAllContextElements().add(a1__p1____from);
		png__pt____transitions.setSrc(png);
		png__pt____transitions.setTrg(pt);
		isApplicableMatch.getAllContextElements().add(png__pt____transitions);
		s12p1__p1____target.setSrc(s12p1);
		s12p1__p1____target.setTrg(p1);
		isApplicableMatch.getAllContextElements().add(s12p1__p1____target);
		sm2pn__png____target.setSrc(sm2pn);
		sm2pn__png____target.setTrg(png);
		isApplicableMatch.getAllContextElements().add(sm2pn__png____target);
		sm2pn__sm____source.setSrc(sm2pn);
		sm2pn__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(sm2pn__sm____source);
		s22p2__p2____target.setSrc(s22p2);
		s22p2__p2____target.setTrg(p2);
		isApplicableMatch.getAllContextElements().add(s22p2__p2____target);
		s22p2__s2____source.setSrc(s22p2);
		s22p2__s2____source.setTrg(s2);
		isApplicableMatch.getAllContextElements().add(s22p2__s2____source);
		s12p1__s1____source.setSrc(s12p1);
		s12p1__s1____source.setTrg(s1);
		isApplicableMatch.getAllContextElements().add(s12p1__s1____source);
		a2__pt____from.setSrc(a2);
		a2__pt____from.setTrg(pt);
		isApplicableMatch.getAllContextElements().add(a2__pt____from);
		a2__p2____to.setSrc(a2);
		a2__p2____to.setTrg(p2);
		isApplicableMatch.getAllContextElements().add(a2__p2____to);
		png__a2____arcs.setName(png__a2____arcs_name_prime);
		png__a1____arcs.setName(png__a1____arcs_name_prime);
		a1__pt____to.setName(a1__pt____to_name_prime);
		a1__p1____from.setName(a1__p1____from_name_prime);
		png__pt____transitions.setName(png__pt____transitions_name_prime);
		s12p1__p1____target.setName(s12p1__p1____target_name_prime);
		sm2pn__png____target.setName(sm2pn__png____target_name_prime);
		sm2pn__sm____source.setName(sm2pn__sm____source_name_prime);
		s22p2__p2____target.setName(s22p2__p2____target_name_prime);
		s22p2__s2____source.setName(s22p2__s2____source_name_prime);
		s12p1__s1____source.setName(s12p1__s1____source_name_prime);
		a2__pt____from.setName(a2__pt____from_name_prime);
		a2__p2____to.setName(a2__p2____to_name_prime);
		return new Object[] { png, sm, a1, a2, p2, s12p1, p1, sm2pn, s1, s2, pt, s22p2, isApplicableMatch,
				png__a2____arcs, png__a1____arcs, a1__pt____to, a1__p1____from, png__pt____transitions,
				s12p1__p1____target, sm2pn__png____target, sm2pn__sm____source, s22p2__p2____target,
				s22p2__s2____source, s12p1__s1____source, a2__pt____from, a2__p2____to };
	}

	public static final Object[] pattern_transition2arctransarc_12_4_solveCSP_bindingFBBBBBBBBBBBBBB(
			transition2arctransarc _this, IsApplicableMatch isApplicableMatch, PNGraph png, SM sm, Arc a1, Arc a2,
			Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2, petrinet.Transition pt, S2P s22p2) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, png, sm, a1, a2, p2, s12p1, p1, sm2pn,
				s1, s2, pt, s22p2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, png, sm, a1, a2, p2, s12p1, p1, sm2pn, s1, s2, pt,
					s22p2 };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_transition2arctransarc_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBB(
			transition2arctransarc _this, IsApplicableMatch isApplicableMatch, PNGraph png, SM sm, Arc a1, Arc a2,
			Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2, petrinet.Transition pt, S2P s22p2) {
		Object[] result_pattern_transition2arctransarc_12_4_solveCSP_binding = pattern_transition2arctransarc_12_4_solveCSP_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, png, sm, a1, a2, p2, s12p1, p1, sm2pn, s1, s2, pt, s22p2);
		if (result_pattern_transition2arctransarc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_transition2arctransarc_12_4_solveCSP_binding[0];

			Object[] result_pattern_transition2arctransarc_12_4_solveCSP_black = pattern_transition2arctransarc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_transition2arctransarc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, png, sm, a1, a2, p2, s12p1, p1, sm2pn, s1, s2, pt,
						s22p2 };
			}
		}
		return null;
	}

	public static final boolean pattern_transition2arctransarc_12_5_checkCSP_expressionFBB(transition2arctransarc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_transition2arctransarc_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "transition2arctransarc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_transition2arctransarc_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_20_1_preparereturnvalue_bindingFB(
			transition2arctransarc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			transition2arctransarc _this) {
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

	public static final Object[] pattern_transition2arctransarc_20_1_preparereturnvalue_bindingAndBlackFFBF(
			transition2arctransarc _this) {
		Object[] result_pattern_transition2arctransarc_20_1_preparereturnvalue_binding = pattern_transition2arctransarc_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_transition2arctransarc_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_transition2arctransarc_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_transition2arctransarc_20_1_preparereturnvalue_black = pattern_transition2arctransarc_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_transition2arctransarc_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_transition2arctransarc_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_transition2arctransarc_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_transition2arctransarc_20_2_testcorematchandDECs_blackFFFFFFB(
			EMoflonEdge _edge_arcs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPng = _edge_arcs.getSrc();
		if (tmpPng instanceof PNGraph) {
			PNGraph png = (PNGraph) tmpPng;
			EObject tmpA2 = _edge_arcs.getTrg();
			if (tmpA2 instanceof Arc) {
				Arc a2 = (Arc) tmpA2;
				if (png.getArcs().contains(a2)) {
					Node tmpPt = a2.getFrom();
					if (tmpPt instanceof petrinet.Transition) {
						petrinet.Transition pt = (petrinet.Transition) tmpPt;
						if (png.getTransitions().contains(pt)) {
							Node tmpP2 = a2.getTo();
							if (tmpP2 instanceof Place) {
								Place p2 = (Place) tmpP2;
								for (Arc a1 : png.getArcs()) {
									if (!a1.equals(a2)) {
										if (pt.equals(a1.getTo())) {
											Node tmpP1 = a1.getFrom();
											if (tmpP1 instanceof Place) {
												Place p1 = (Place) tmpP1;
												if (!p1.equals(p2)) {
													_result.add(new Object[] { png, a1, a2, p2, p1, pt, _edge_arcs });
												}
											}

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

	public static final Object[] pattern_transition2arctransarc_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_transition2arctransarc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
			transition2arctransarc _this, Match match, PNGraph png, Arc a1, Arc a2, Place p2, Place p1,
			petrinet.Transition pt) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, png, a1, a2, p2, p1, pt);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_transition2arctransarc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			transition2arctransarc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_transition2arctransarc_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_21_1_preparereturnvalue_bindingFB(
			transition2arctransarc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			transition2arctransarc _this) {
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

	public static final Object[] pattern_transition2arctransarc_21_1_preparereturnvalue_bindingAndBlackFFBF(
			transition2arctransarc _this) {
		Object[] result_pattern_transition2arctransarc_21_1_preparereturnvalue_binding = pattern_transition2arctransarc_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_transition2arctransarc_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_transition2arctransarc_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_transition2arctransarc_21_1_preparereturnvalue_black = pattern_transition2arctransarc_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_transition2arctransarc_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_transition2arctransarc_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_transition2arctransarc_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_transition2arctransarc_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_transitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSm = _edge_transitions.getSrc();
		if (tmpSm instanceof SM) {
			SM sm = (SM) tmpSm;
			EObject tmpSt = _edge_transitions.getTrg();
			if (tmpSt instanceof Transition) {
				Transition st = (Transition) tmpSt;
				if (sm.getTransitions().contains(st)) {
					State s1 = st.getFrom();
					if (s1 != null) {
						State s2 = st.getTo();
						if (s2 != null) {
							if (!s1.equals(s2)) {
								_result.add(new Object[] { st, sm, s1, s2, _edge_transitions });
							}
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_transition2arctransarc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			transition2arctransarc _this, Match match, Transition st, SM sm, State s1, State s2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, st, sm, s1, s2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_transition2arctransarc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			transition2arctransarc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_transition2arctransarc_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_24_1_prepare_blackB(transition2arctransarc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_transition2arctransarc_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_transition2arctransarc_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("png");
		EObject _localVariable_1 = sourceMatch.getObject("st");
		EObject _localVariable_2 = sourceMatch.getObject("sm");
		EObject _localVariable_3 = targetMatch.getObject("a1");
		EObject _localVariable_4 = targetMatch.getObject("a2");
		EObject _localVariable_5 = targetMatch.getObject("p2");
		EObject _localVariable_6 = targetMatch.getObject("p1");
		EObject _localVariable_7 = sourceMatch.getObject("s1");
		EObject _localVariable_8 = sourceMatch.getObject("s2");
		EObject _localVariable_9 = targetMatch.getObject("pt");
		EObject tmpPng = _localVariable_0;
		EObject tmpSt = _localVariable_1;
		EObject tmpSm = _localVariable_2;
		EObject tmpA1 = _localVariable_3;
		EObject tmpA2 = _localVariable_4;
		EObject tmpP2 = _localVariable_5;
		EObject tmpP1 = _localVariable_6;
		EObject tmpS1 = _localVariable_7;
		EObject tmpS2 = _localVariable_8;
		EObject tmpPt = _localVariable_9;
		if (tmpPng instanceof PNGraph) {
			PNGraph png = (PNGraph) tmpPng;
			if (tmpSt instanceof Transition) {
				Transition st = (Transition) tmpSt;
				if (tmpSm instanceof SM) {
					SM sm = (SM) tmpSm;
					if (tmpA1 instanceof Arc) {
						Arc a1 = (Arc) tmpA1;
						if (tmpA2 instanceof Arc) {
							Arc a2 = (Arc) tmpA2;
							if (tmpP2 instanceof Place) {
								Place p2 = (Place) tmpP2;
								if (tmpP1 instanceof Place) {
									Place p1 = (Place) tmpP1;
									if (tmpS1 instanceof State) {
										State s1 = (State) tmpS1;
										if (tmpS2 instanceof State) {
											State s2 = (State) tmpS2;
											if (tmpPt instanceof petrinet.Transition) {
												petrinet.Transition pt = (petrinet.Transition) tmpPt;
												return new Object[] { png, st, sm, a1, a2, p2, p1, s1, s2, pt,
														targetMatch, sourceMatch };
											}
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

	public static final Object[] pattern_transition2arctransarc_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(PNGraph png,
			Transition st, SM sm, Arc a1, Arc a2, Place p2, Place p1, State s1, State s2, petrinet.Transition pt,
			Match sourceMatch, Match targetMatch) {
		if (!a1.equals(a2)) {
			if (!p1.equals(p2)) {
				if (!s1.equals(s2)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { png, st, sm, a1, a2, p2, p1, s1, s2, pt, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_binding = pattern_transition2arctransarc_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_binding != null) {
			PNGraph png = (PNGraph) result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_binding[0];
			Transition st = (Transition) result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_binding[1];
			SM sm = (SM) result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_binding[2];
			Arc a1 = (Arc) result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_binding[3];
			Arc a2 = (Arc) result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_binding[4];
			Place p2 = (Place) result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_binding[5];
			Place p1 = (Place) result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_binding[6];
			State s1 = (State) result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_binding[7];
			State s2 = (State) result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_binding[8];
			petrinet.Transition pt = (petrinet.Transition) result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_black = pattern_transition2arctransarc_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					png, st, sm, a1, a2, p2, p1, s1, s2, pt, sourceMatch, targetMatch);
			if (result_pattern_transition2arctransarc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { png, st, sm, a1, a2, p2, p1, s1, s2, pt, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			transition2arctransarc _this, PNGraph png, Transition st, SM sm, Arc a1, Arc a2, Place p2, Place p1,
			State s1, State s2, petrinet.Transition pt, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(png, st, sm, a1, a2, p2, p1, s1, s2, pt, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, png, st, sm, a1, a2, p2, p1, s1, s2, pt, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_transition2arctransarc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			transition2arctransarc _this, PNGraph png, Transition st, SM sm, Arc a1, Arc a2, Place p2, Place p1,
			State s1, State s2, petrinet.Transition pt, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_transition2arctransarc_24_3_solvecsp_binding = pattern_transition2arctransarc_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, png, st, sm, a1, a2, p2, p1, s1, s2, pt, sourceMatch, targetMatch);
		if (result_pattern_transition2arctransarc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_transition2arctransarc_24_3_solvecsp_binding[0];

			Object[] result_pattern_transition2arctransarc_24_3_solvecsp_black = pattern_transition2arctransarc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_transition2arctransarc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, png, st, sm, a1, a2, p2, p1, s1, s2, pt, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_transition2arctransarc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_transition2arctransarc_24_5_matchcorrcontext_blackBBBFBFBBFBB(
			PNGraph png, SM sm, Place p2, Place p1, State s1, State s2, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!p1.equals(p2)) {
			if (!s1.equals(s2)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (S2P s12p1 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p1, S2P.class,
							"target")) {
						if (s1.equals(s12p1.getSource())) {
							for (SM2PN sm2pn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(png,
									SM2PN.class, "target")) {
								if (sm.equals(sm2pn.getSource())) {
									for (S2P s22p2 : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(p2, S2P.class, "target")) {
										if (!s12p1.equals(s22p2)) {
											if (s2.equals(s22p2.getSource())) {
												_result.add(new Object[] { png, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2,
														sourceMatch, targetMatch });
											}
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

	public static final Object[] pattern_transition2arctransarc_24_5_matchcorrcontext_greenBBBBBF(S2P s12p1,
			SM2PN sm2pn, S2P s22p2, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "transition2arctransarc";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(s12p1);
		ccMatch.getAllContextElements().add(sm2pn);
		ccMatch.getAllContextElements().add(s22p2);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { s12p1, sm2pn, s22p2, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_transition2arctransarc_24_6_createcorrespondence_blackBBBBBBBBBBB(PNGraph png,
			Transition st, SM sm, Arc a1, Arc a2, Place p2, Place p1, State s1, State s2, petrinet.Transition pt,
			CCMatch ccMatch) {
		if (!a1.equals(a2)) {
			if (!p1.equals(p2)) {
				if (!s1.equals(s2)) {
					return new Object[] { png, st, sm, a1, a2, p2, p1, s1, s2, pt, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_24_6_createcorrespondence_greenBBBFFFBB(Transition st,
			Arc a1, Arc a2, petrinet.Transition pt, CCMatch ccMatch) {
		T2A st2a1 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		T2T st2pt = Statemachine2petrinetFactory.eINSTANCE.createT2T();
		T2A st2a2 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		st2a1.setSource(st);
		st2a1.setTarget(a1);
		ccMatch.getCreateCorr().add(st2a1);
		st2pt.setSource(st);
		st2pt.setTarget(pt);
		ccMatch.getCreateCorr().add(st2pt);
		st2a2.setSource(st);
		st2a2.setTarget(a2);
		ccMatch.getCreateCorr().add(st2a2);
		return new Object[] { st, a1, a2, st2a1, st2pt, st2a2, pt, ccMatch };
	}

	public static final Object[] pattern_transition2arctransarc_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_transition2arctransarc_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "transition2arctransarc";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_transition2arctransarc_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_27_1_matchtggpattern_blackBBBB(Transition st, SM sm,
			State s1, State s2) {
		if (!s1.equals(s2)) {
			if (sm.getTransitions().contains(st)) {
				if (s1.equals(st.getFrom())) {
					if (s2.equals(st.getTo())) {
						return new Object[] { st, sm, s1, s2 };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_transition2arctransarc_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_transition2arctransarc_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_28_1_matchtggpattern_blackBBBBBB(PNGraph png, Arc a1,
			Arc a2, Place p2, Place p1, petrinet.Transition pt) {
		if (!a1.equals(a2)) {
			if (!p1.equals(p2)) {
				if (png.getArcs().contains(a2)) {
					if (png.getArcs().contains(a1)) {
						if (pt.equals(a1.getTo())) {
							if (p1.equals(a1.getFrom())) {
								if (png.getTransitions().contains(pt)) {
									if (pt.equals(a2.getFrom())) {
										if (p2.equals(a2.getTo())) {
											return new Object[] { png, a1, a2, p2, p1, pt };
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

	public static final boolean pattern_transition2arctransarc_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_transition2arctransarc_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_29_1_createresult_blackB(transition2arctransarc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_transition2arctransarc_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, PNGraph png) {
		if (ruleResult.getTargetObjects().contains(png)) {
			return new Object[] { ruleResult, png };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SM2PN sm2pn) {
		if (ruleResult.getCorrObjects().contains(sm2pn)) {
			return new Object[] { ruleResult, sm2pn };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, SM sm) {
		if (ruleResult.getSourceObjects().contains(sm)) {
			return new Object[] { ruleResult, sm };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Place p2) {
		if (ruleResult.getTargetObjects().contains(p2)) {
			return new Object[] { ruleResult, p2 };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, S2P s22p2) {
		if (ruleResult.getCorrObjects().contains(s22p2)) {
			return new Object[] { ruleResult, s22p2 };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, State s2) {
		if (ruleResult.getSourceObjects().contains(s2)) {
			return new Object[] { ruleResult, s2 };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, S2P s12p1) {
		if (ruleResult.getCorrObjects().contains(s12p1)) {
			return new Object[] { ruleResult, s12p1 };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Place p1) {
		if (ruleResult.getTargetObjects().contains(p1)) {
			return new Object[] { ruleResult, p1 };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, State s1) {
		if (ruleResult.getSourceObjects().contains(s1)) {
			return new Object[] { ruleResult, s1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_transition2arctransarc_29_2_isapplicablecore_blackFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList sm2pnList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList s22p2List : ruleEntryContainer.getRuleEntryList()) {
				if (!s22p2List.equals(sm2pnList)) {
					for (RuleEntryList s12p1List : ruleEntryContainer.getRuleEntryList()) {
						if (!s12p1List.equals(sm2pnList)) {
							if (!s12p1List.equals(s22p2List)) {
								for (EObject tmpSm2pn : sm2pnList.getEntryObjects()) {
									if (tmpSm2pn instanceof SM2PN) {
										SM2PN sm2pn = (SM2PN) tmpSm2pn;
										PNGraph png = sm2pn.getTarget();
										if (png != null) {
											SM sm = sm2pn.getSource();
											if (sm != null) {
												if (pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_1BB(
														ruleResult, sm2pn) == null) {
													if (pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_0BB(
															ruleResult, png) == null) {
														if (pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_2BB(
																ruleResult, sm) == null) {
															for (EObject tmpS22p2 : s22p2List.getEntryObjects()) {
																if (tmpS22p2 instanceof S2P) {
																	S2P s22p2 = (S2P) tmpS22p2;
																	Place p2 = s22p2.getTarget();
																	if (p2 != null) {
																		State s2 = s22p2.getSource();
																		if (s2 != null) {
																			if (pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult, s22p2) == null) {
																				if (pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_3BB(
																						ruleResult, p2) == null) {
																					if (pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult, s2) == null) {
																						for (EObject tmpS12p1 : s12p1List
																								.getEntryObjects()) {
																							if (tmpS12p1 instanceof S2P) {
																								S2P s12p1 = (S2P) tmpS12p1;
																								if (!s12p1.equals(
																										s22p2)) {
																									Place p1 = s12p1
																											.getTarget();
																									if (p1 != null) {
																										if (!p1.equals(
																												p2)) {
																											State s1 = s12p1
																													.getSource();
																											if (s1 != null) {
																												if (!s1.equals(
																														s2)) {
																													if (pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_6BB(
																															ruleResult,
																															s12p1) == null) {
																														if (pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_7BB(
																																ruleResult,
																																p1) == null) {
																															if (pattern_transition2arctransarc_29_2_isapplicablecore_black_nac_8BB(
																																	ruleResult,
																																	s1) == null) {
																																_result.add(
																																		new Object[] {
																																				sm2pnList,
																																				png,
																																				sm2pn,
																																				sm,
																																				s22p2List,
																																				p2,
																																				s22p2,
																																				s2,
																																				s12p1List,
																																				s12p1,
																																				p1,
																																				s1,
																																				ruleEntryContainer,
																																				ruleResult });
																															}
																														}
																													}
																												}
																											}

																										}
																									}

																								}
																							}
																						}
																					}
																				}
																			}
																		}

																	}

																}
															}
														}
													}
												}
											}

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

	public static final Object[] pattern_transition2arctransarc_29_3_solveCSP_bindingFBBBBBBBBBBBB(
			transition2arctransarc _this, IsApplicableMatch isApplicableMatch, PNGraph png, SM sm, Place p2, S2P s12p1,
			Place p1, SM2PN sm2pn, State s1, State s2, S2P s22p2, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, png, sm, p2, s12p1, p1, sm2pn, s1,
				s2, s22p2, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, png, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_transition2arctransarc_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			transition2arctransarc _this, IsApplicableMatch isApplicableMatch, PNGraph png, SM sm, Place p2, S2P s12p1,
			Place p1, SM2PN sm2pn, State s1, State s2, S2P s22p2, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_transition2arctransarc_29_3_solveCSP_binding = pattern_transition2arctransarc_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, png, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2, ruleResult);
		if (result_pattern_transition2arctransarc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_transition2arctransarc_29_3_solveCSP_binding[0];

			Object[] result_pattern_transition2arctransarc_29_3_solveCSP_black = pattern_transition2arctransarc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_transition2arctransarc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, png, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_transition2arctransarc_29_4_checkCSP_expressionFBB(transition2arctransarc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_transition2arctransarc_29_5_checknacs_blackBBBBBBBBB(PNGraph png, SM sm,
			Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2, S2P s22p2) {
		if (!s12p1.equals(s22p2)) {
			if (!p1.equals(p2)) {
				if (!s1.equals(s2)) {
					return new Object[] { png, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2 };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_29_6_perform_blackBBBBBBBBBB(PNGraph png, SM sm,
			Place p2, S2P s12p1, Place p1, SM2PN sm2pn, State s1, State s2, S2P s22p2,
			ModelgeneratorRuleResult ruleResult) {
		if (!s12p1.equals(s22p2)) {
			if (!p1.equals(p2)) {
				if (!s1.equals(s2)) {
					return new Object[] { png, sm, p2, s12p1, p1, sm2pn, s1, s2, s22p2, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_transition2arctransarc_29_6_perform_greenBFBFFBFBBFBFFB(PNGraph png, SM sm,
			Place p2, Place p1, State s1, State s2, ModelgeneratorRuleResult ruleResult) {
		Transition st = StatemachineFactory.eINSTANCE.createTransition();
		Arc a1 = PetrinetFactory.eINSTANCE.createArc();
		Arc a2 = PetrinetFactory.eINSTANCE.createArc();
		T2A st2a1 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		T2T st2pt = Statemachine2petrinetFactory.eINSTANCE.createT2T();
		T2A st2a2 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		petrinet.Transition pt = PetrinetFactory.eINSTANCE.createTransition();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		sm.getTransitions().add(st);
		st.setFrom(s1);
		st.setTo(s2);
		ruleResult.getSourceObjects().add(st);
		png.getArcs().add(a1);
		a1.setFrom(p1);
		ruleResult.getTargetObjects().add(a1);
		png.getArcs().add(a2);
		a2.setTo(p2);
		ruleResult.getTargetObjects().add(a2);
		st2a1.setSource(st);
		st2a1.setTarget(a1);
		ruleResult.getCorrObjects().add(st2a1);
		st2pt.setSource(st);
		ruleResult.getCorrObjects().add(st2pt);
		st2a2.setSource(st);
		st2a2.setTarget(a2);
		ruleResult.getCorrObjects().add(st2a2);
		a1.setTo(pt);
		png.getTransitions().add(pt);
		st2pt.setTarget(pt);
		a2.setFrom(pt);
		ruleResult.getTargetObjects().add(pt);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { png, st, sm, a1, a2, p2, st2a1, p1, s1, st2pt, s2, st2a2, pt, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_transition2arctransarc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //transition2arctransarcImpl
