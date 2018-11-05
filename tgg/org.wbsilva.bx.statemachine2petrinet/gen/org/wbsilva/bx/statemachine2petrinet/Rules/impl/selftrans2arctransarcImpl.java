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
import org.wbsilva.bx.statemachine2petrinet.Rules.selftrans2arctransarc;

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
 * An implementation of the model object '<em><b>selftrans2arctransarc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class selftrans2arctransarcImpl extends AbstractRuleImpl implements selftrans2arctransarc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected selftrans2arctransarcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getselftrans2arctransarc();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SM sm, Transition st, State s1) {

		Object[] result1_black = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_0_1_initialbindings_blackBBBBB(this, match, sm, st, s1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[sm] = " + sm + ", " + "[st] = " + st + ", " + "[s1] = " + s1 + ".");
		}

		Object[] result2_bindingAndBlack = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, sm, st, s1);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[sm] = " + sm + ", " + "[st] = " + st + ", " + "[s1] = " + s1 + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (selftrans2arctransarcImpl.pattern_selftrans2arctransarc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_0_4_collectelementstobetranslated_blackBBBB(match, sm, st, s1);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[sm] = " + sm + ", " + "[st] = " + st + ", " + "[s1] = " + s1 + ".");
			}
			selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_0_4_collectelementstobetranslated_greenBBBBFFF(match, sm, st, s1);
			//nothing EMoflonEdge sm__st____transitions = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge st__s1____to = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge st__s1____from = (EMoflonEdge) result4_green[6];

			Object[] result5_black = selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_0_5_collectcontextelements_blackBBBB(match, sm, st, s1);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[sm] = " + sm + ", " + "[st] = " + st + ", " + "[s1] = " + s1 + ".");
			}
			selftrans2arctransarcImpl.pattern_selftrans2arctransarc_0_5_collectcontextelements_greenBBB(match, sm, s1);

			// 
			selftrans2arctransarcImpl.pattern_selftrans2arctransarc_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, sm, st, s1);
			return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_0_7_expressionF();
		} else {
			return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2P s12p1 = (S2P) result1_bindingAndBlack[0];
		SM sm = (SM) result1_bindingAndBlack[1];
		Transition st = (Transition) result1_bindingAndBlack[2];
		Place p1 = (Place) result1_bindingAndBlack[3];
		State s1 = (State) result1_bindingAndBlack[4];
		PNGraph png = (PNGraph) result1_bindingAndBlack[5];
		SM2PN sm2pn = (SM2PN) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_1_1_performtransformation_greenFFBBFBFFF(st, p1, png);
		petrinet.Transition pt = (petrinet.Transition) result1_green[0];
		T2T st2pt = (T2T) result1_green[1];
		Arc a1 = (Arc) result1_green[4];
		T2A st2a2 = (T2A) result1_green[6];
		Arc a2 = (Arc) result1_green[7];
		T2A st2a1 = (T2A) result1_green[8];

		Object[] result2_black = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_1_2_collecttranslatedelements_blackBBBBBBB(pt, st2pt, st, a1, st2a2, a2,
						st2a1);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pt] = " + pt + ", "
					+ "[st2pt] = " + st2pt + ", " + "[st] = " + st + ", " + "[a1] = " + a1 + ", " + "[st2a2] = " + st2a2
					+ ", " + "[a2] = " + a2 + ", " + "[st2a1] = " + st2a1 + ".");
		}
		Object[] result2_green = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_1_2_collecttranslatedelements_greenFBBBBBBB(pt, st2pt, st, a1, st2a2, a2,
						st2a1);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(ruleresult, s12p1, sm, pt,
						st2pt, st, p1, s1, a1, png, st2a2, a2, st2a1, sm2pn);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[s12p1] = " + s12p1 + ", " + "[sm] = " + sm + ", " + "[pt] = " + pt + ", " + "[st2pt] = "
					+ st2pt + ", " + "[st] = " + st + ", " + "[p1] = " + p1 + ", " + "[s1] = " + s1 + ", " + "[a1] = "
					+ a1 + ", " + "[png] = " + png + ", " + "[st2a2] = " + st2a2 + ", " + "[a2] = " + a2 + ", "
					+ "[st2a1] = " + st2a1 + ", " + "[sm2pn] = " + sm2pn + ".");
		}
		selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult, sm,
						pt, st2pt, st, p1, s1, a1, png, st2a2, a2, st2a1);
		//nothing EMoflonEdge sm__st____transitions = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge st2pt__st____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a1__pt____to = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a1__p1____from = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge st2pt__pt____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge png__pt____transitions = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge st2a2__st____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge st2a2__a2____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge png__a2____arcs = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge st2a1__a1____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge st__s1____to = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a2__p1____to = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge st2a1__st____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge png__a1____arcs = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge st__s1____from = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge a2__pt____from = (EMoflonEdge) result3_green[27];

		// 
		// 
		selftrans2arctransarcImpl.pattern_selftrans2arctransarc_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(this,
				ruleresult, s12p1, sm, pt, st2pt, st, p1, s1, a1, png, st2a2, a2, st2a1, sm2pn);
		return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SM sm = (SM) result2_binding[0];
		Transition st = (Transition) result2_binding[1];
		State s1 = (State) result2_binding[2];
		for (Object[] result2_black : selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_2_2_corematch_blackFBBFBFFB(sm, st, s1, match)) {
			S2P s12p1 = (S2P) result2_black[0];
			Place p1 = (Place) result2_black[3];
			PNGraph png = (PNGraph) result2_black[5];
			SM2PN sm2pn = (SM2PN) result2_black[6];
			// ForEach 
			for (Object[] result3_black : selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_2_3_findcontext_blackBBBBBBB(s12p1, sm, st, p1, s1, png, sm2pn)) {
				Object[] result3_green = selftrans2arctransarcImpl
						.pattern_selftrans2arctransarc_2_3_findcontext_greenBBBBBBBFFFFFFFF(s12p1, sm, st, p1, s1, png,
								sm2pn);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge sm__st____transitions = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge s12p1__s1____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge s12p1__p1____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge st__s1____to = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge sm2pn__png____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge st__s1____from = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge sm2pn__sm____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = selftrans2arctransarcImpl
						.pattern_selftrans2arctransarc_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								s12p1, sm, st, p1, s1, png, sm2pn);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s12p1] = " + s12p1 + ", "
							+ "[sm] = " + sm + ", " + "[st] = " + st + ", " + "[p1] = " + p1 + ", " + "[s1] = " + s1
							+ ", " + "[png] = " + png + ", " + "[sm2pn] = " + sm2pn + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (selftrans2arctransarcImpl.pattern_selftrans2arctransarc_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = selftrans2arctransarcImpl
							.pattern_selftrans2arctransarc_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					selftrans2arctransarcImpl.pattern_selftrans2arctransarc_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SM sm, Transition st, State s1) {
		match.registerObject("sm", sm);
		match.registerObject("st", st);
		match.registerObject("s1", s1);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SM sm, Transition st, State s1) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, S2P s12p1, SM sm, Transition st, Place p1,
			State s1, PNGraph png, SM2PN sm2pn) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s12p1", s12p1);
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("st", st);
		isApplicableMatch.registerObject("p1", p1);
		isApplicableMatch.registerObject("s1", s1);
		isApplicableMatch.registerObject("png", png);
		isApplicableMatch.registerObject("sm2pn", sm2pn);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject s12p1, EObject sm, EObject pt, EObject st2pt,
			EObject st, EObject p1, EObject s1, EObject a1, EObject png, EObject st2a2, EObject a2, EObject st2a1,
			EObject sm2pn) {
		ruleresult.registerObject("s12p1", s12p1);
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("pt", pt);
		ruleresult.registerObject("st2pt", st2pt);
		ruleresult.registerObject("st", st);
		ruleresult.registerObject("p1", p1);
		ruleresult.registerObject("s1", s1);
		ruleresult.registerObject("a1", a1);
		ruleresult.registerObject("png", png);
		ruleresult.registerObject("st2a2", st2a2);
		ruleresult.registerObject("a2", a2);
		ruleresult.registerObject("st2a1", st2a1);
		ruleresult.registerObject("sm2pn", sm2pn);

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
	public boolean isAppropriate_BWD(Match match, petrinet.Transition pt, Place p1, Arc a1, PNGraph png, Arc a2) {

		Object[] result1_black = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_10_1_initialbindings_blackBBBBBBB(this, match, pt, p1, a1, png, a2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pt] = " + pt + ", " + "[p1] = " + p1 + ", " + "[a1] = " + a1
					+ ", " + "[png] = " + png + ", " + "[a2] = " + a2 + ".");
		}

		Object[] result2_bindingAndBlack = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, pt, p1, a1, png, a2);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pt] = " + pt + ", " + "[p1] = " + p1 + ", " + "[a1] = " + a1
					+ ", " + "[png] = " + png + ", " + "[a2] = " + a2 + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (selftrans2arctransarcImpl.pattern_selftrans2arctransarc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_10_4_collectelementstobetranslated_blackBBBBBB(match, pt, p1, a1,
							png, a2);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pt] = " + pt + ", " + "[p1] = " + p1 + ", " + "[a1] = " + a1 + ", " + "[png] = " + png
						+ ", " + "[a2] = " + a2 + ".");
			}
			selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFF(match, pt, p1,
							a1, png, a2);
			//nothing EMoflonEdge a1__pt____to = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a1__p1____from = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge png__pt____transitions = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge png__a2____arcs = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge a2__p1____to = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge png__a1____arcs = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge a2__pt____from = (EMoflonEdge) result4_green[12];

			Object[] result5_black = selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_10_5_collectcontextelements_blackBBBBBB(match, pt, p1, a1, png, a2);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pt] = " + pt + ", " + "[p1] = " + p1 + ", " + "[a1] = " + a1 + ", " + "[png] = " + png
						+ ", " + "[a2] = " + a2 + ".");
			}
			selftrans2arctransarcImpl.pattern_selftrans2arctransarc_10_5_collectcontextelements_greenBBB(match, p1,
					png);

			// 
			selftrans2arctransarcImpl.pattern_selftrans2arctransarc_10_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, pt, p1, a1, png, a2);
			return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_10_7_expressionF();
		} else {
			return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2P s12p1 = (S2P) result1_bindingAndBlack[0];
		SM sm = (SM) result1_bindingAndBlack[1];
		petrinet.Transition pt = (petrinet.Transition) result1_bindingAndBlack[2];
		Place p1 = (Place) result1_bindingAndBlack[3];
		State s1 = (State) result1_bindingAndBlack[4];
		Arc a1 = (Arc) result1_bindingAndBlack[5];
		PNGraph png = (PNGraph) result1_bindingAndBlack[6];
		Arc a2 = (Arc) result1_bindingAndBlack[7];
		SM2PN sm2pn = (SM2PN) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_11_1_performtransformation_greenBBFFBBFBF(sm, pt, s1, a1, a2);
		T2T st2pt = (T2T) result1_green[2];
		Transition st = (Transition) result1_green[3];
		T2A st2a2 = (T2A) result1_green[6];
		T2A st2a1 = (T2A) result1_green[8];

		Object[] result2_black = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_11_2_collecttranslatedelements_blackBBBBBBB(pt, st2pt, st, a1, st2a2, a2,
						st2a1);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pt] = " + pt + ", "
					+ "[st2pt] = " + st2pt + ", " + "[st] = " + st + ", " + "[a1] = " + a1 + ", " + "[st2a2] = " + st2a2
					+ ", " + "[a2] = " + a2 + ", " + "[st2a1] = " + st2a1 + ".");
		}
		Object[] result2_green = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_11_2_collecttranslatedelements_greenFBBBBBBB(pt, st2pt, st, a1, st2a2,
						a2, st2a1);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(ruleresult, s12p1, sm, pt,
						st2pt, st, p1, s1, a1, png, st2a2, a2, st2a1, sm2pn);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[s12p1] = " + s12p1 + ", " + "[sm] = " + sm + ", " + "[pt] = " + pt + ", " + "[st2pt] = "
					+ st2pt + ", " + "[st] = " + st + ", " + "[p1] = " + p1 + ", " + "[s1] = " + s1 + ", " + "[a1] = "
					+ a1 + ", " + "[png] = " + png + ", " + "[st2a2] = " + st2a2 + ", " + "[a2] = " + a2 + ", "
					+ "[st2a1] = " + st2a1 + ", " + "[sm2pn] = " + sm2pn + ".");
		}
		selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult,
						sm, pt, st2pt, st, p1, s1, a1, png, st2a2, a2, st2a1);
		//nothing EMoflonEdge sm__st____transitions = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge st2pt__st____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a1__pt____to = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a1__p1____from = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge st2pt__pt____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge png__pt____transitions = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge st2a2__st____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge st2a2__a2____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge png__a2____arcs = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge st2a1__a1____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge st__s1____to = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a2__p1____to = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge st2a1__st____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge png__a1____arcs = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge st__s1____from = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge a2__pt____from = (EMoflonEdge) result3_green[27];

		// 
		// 
		selftrans2arctransarcImpl.pattern_selftrans2arctransarc_11_5_registerobjects_expressionBBBBBBBBBBBBBBB(this,
				ruleresult, s12p1, sm, pt, st2pt, st, p1, s1, a1, png, st2a2, a2, st2a1, sm2pn);
		return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		petrinet.Transition pt = (petrinet.Transition) result2_binding[0];
		Place p1 = (Place) result2_binding[1];
		Arc a1 = (Arc) result2_binding[2];
		PNGraph png = (PNGraph) result2_binding[3];
		Arc a2 = (Arc) result2_binding[4];
		for (Object[] result2_black : selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_12_2_corematch_blackFFBBFBBBFB(pt, p1, a1, png, a2, match)) {
			S2P s12p1 = (S2P) result2_black[0];
			SM sm = (SM) result2_black[1];
			State s1 = (State) result2_black[4];
			SM2PN sm2pn = (SM2PN) result2_black[8];
			// ForEach 
			for (Object[] result3_black : selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_12_3_findcontext_blackBBBBBBBBB(s12p1, sm, pt, p1, s1, a1, png, a2,
							sm2pn)) {
				Object[] result3_green = selftrans2arctransarcImpl
						.pattern_selftrans2arctransarc_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(s12p1, sm, pt, p1,
								s1, a1, png, a2, sm2pn);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge s12p1__s1____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge a1__pt____to = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge a1__p1____from = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge s12p1__p1____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge png__pt____transitions = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge png__a2____arcs = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge a2__p1____to = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge png__a1____arcs = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge sm2pn__png____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge a2__pt____from = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge sm2pn__sm____source = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = selftrans2arctransarcImpl
						.pattern_selftrans2arctransarc_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, s12p1, sm, pt, p1, s1, a1, png, a2, sm2pn);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s12p1] = " + s12p1 + ", "
							+ "[sm] = " + sm + ", " + "[pt] = " + pt + ", " + "[p1] = " + p1 + ", " + "[s1] = " + s1
							+ ", " + "[a1] = " + a1 + ", " + "[png] = " + png + ", " + "[a2] = " + a2 + ", "
							+ "[sm2pn] = " + sm2pn + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (selftrans2arctransarcImpl.pattern_selftrans2arctransarc_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = selftrans2arctransarcImpl
							.pattern_selftrans2arctransarc_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					selftrans2arctransarcImpl.pattern_selftrans2arctransarc_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, petrinet.Transition pt, Place p1, Arc a1, PNGraph png, Arc a2) {
		match.registerObject("pt", pt);
		match.registerObject("p1", p1);
		match.registerObject("a1", a1);
		match.registerObject("png", png);
		match.registerObject("a2", a2);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, petrinet.Transition pt, Place p1, Arc a1, PNGraph png, Arc a2) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2P s12p1, SM sm, petrinet.Transition pt,
			Place p1, State s1, Arc a1, PNGraph png, Arc a2, SM2PN sm2pn) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s12p1", s12p1);
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("pt", pt);
		isApplicableMatch.registerObject("p1", p1);
		isApplicableMatch.registerObject("s1", s1);
		isApplicableMatch.registerObject("a1", a1);
		isApplicableMatch.registerObject("png", png);
		isApplicableMatch.registerObject("a2", a2);
		isApplicableMatch.registerObject("sm2pn", sm2pn);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject s12p1, EObject sm, EObject pt, EObject st2pt,
			EObject st, EObject p1, EObject s1, EObject a1, EObject png, EObject st2a2, EObject a2, EObject st2a1,
			EObject sm2pn) {
		ruleresult.registerObject("s12p1", s12p1);
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("pt", pt);
		ruleresult.registerObject("st2pt", st2pt);
		ruleresult.registerObject("st", st);
		ruleresult.registerObject("p1", p1);
		ruleresult.registerObject("s1", s1);
		ruleresult.registerObject("a1", a1);
		ruleresult.registerObject("png", png);
		ruleresult.registerObject("st2a2", st2a2);
		ruleresult.registerObject("a2", a2);
		ruleresult.registerObject("st2a1", st2a1);
		ruleresult.registerObject("sm2pn", sm2pn);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("pt").eClass()).equals("petrinet.Transition.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a1").eClass()).equals("petrinet.Arc.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a2").eClass()).equals("petrinet.Arc.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_53(EMoflonEdge _edge_to) {

		Object[] result1_bindingAndBlack = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_20_2_testcorematchandDECs_blackFFFFFB(_edge_to)) {
			petrinet.Transition pt = (petrinet.Transition) result2_black[0];
			Place p1 = (Place) result2_black[1];
			Arc a1 = (Arc) result2_black[2];
			PNGraph png = (PNGraph) result2_black[3];
			Arc a2 = (Arc) result2_black[4];
			Object[] result2_green = selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, pt, p1, a1, png, a2)) {
				// 
				if (selftrans2arctransarcImpl
						.pattern_selftrans2arctransarc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = selftrans2arctransarcImpl
							.pattern_selftrans2arctransarc_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					selftrans2arctransarcImpl.pattern_selftrans2arctransarc_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_54(EMoflonEdge _edge_transitions) {

		Object[] result1_bindingAndBlack = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_21_2_testcorematchandDECs_blackFFFB(_edge_transitions)) {
			SM sm = (SM) result2_black[0];
			Transition st = (Transition) result2_black[1];
			State s1 = (State) result2_black[2];
			Object[] result2_green = selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, sm, st, s1)) {
				// 
				if (selftrans2arctransarcImpl
						.pattern_selftrans2arctransarc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = selftrans2arctransarcImpl
							.pattern_selftrans2arctransarc_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					selftrans2arctransarcImpl.pattern_selftrans2arctransarc_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("selftrans2arctransarc");
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
		ruleResult.setRule("selftrans2arctransarc");
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

		Object[] result1_black = selftrans2arctransarcImpl.pattern_selftrans2arctransarc_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = selftrans2arctransarcImpl.pattern_selftrans2arctransarc_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		SM sm = (SM) result2_bindingAndBlack[0];
		petrinet.Transition pt = (petrinet.Transition) result2_bindingAndBlack[1];
		Transition st = (Transition) result2_bindingAndBlack[2];
		Place p1 = (Place) result2_bindingAndBlack[3];
		State s1 = (State) result2_bindingAndBlack[4];
		Arc a1 = (Arc) result2_bindingAndBlack[5];
		PNGraph png = (PNGraph) result2_bindingAndBlack[6];
		Arc a2 = (Arc) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, sm, pt, st, p1, s1, a1,
						png, a2, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[sm] = " + sm + ", " + "[pt] = " + pt + ", " + "[st] = " + st + ", " + "[p1] = " + p1 + ", "
					+ "[s1] = " + s1 + ", " + "[a1] = " + a1 + ", " + "[png] = " + png + ", " + "[a2] = " + a2 + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (selftrans2arctransarcImpl.pattern_selftrans2arctransarc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_24_5_matchcorrcontext_blackFBBBBFBB(sm, p1, s1, png, sourceMatch,
							targetMatch)) {
				S2P s12p1 = (S2P) result5_black[0];
				SM2PN sm2pn = (SM2PN) result5_black[5];
				Object[] result5_green = selftrans2arctransarcImpl
						.pattern_selftrans2arctransarc_24_5_matchcorrcontext_greenBBBBF(s12p1, sm2pn, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = selftrans2arctransarcImpl
						.pattern_selftrans2arctransarc_24_6_createcorrespondence_blackBBBBBBBBB(sm, pt, st, p1, s1, a1,
								png, a2, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sm] = " + sm + ", "
							+ "[pt] = " + pt + ", " + "[st] = " + st + ", " + "[p1] = " + p1 + ", " + "[s1] = " + s1
							+ ", " + "[a1] = " + a1 + ", " + "[png] = " + png + ", " + "[a2] = " + a2 + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				selftrans2arctransarcImpl.pattern_selftrans2arctransarc_24_6_createcorrespondence_greenBFBBFBFB(pt, st,
						a1, a2, ccMatch);
				//nothing T2T st2pt = (T2T) result6_green[1];
				//nothing T2A st2a2 = (T2A) result6_green[4];
				//nothing T2A st2a1 = (T2A) result6_green[6];

				Object[] result7_black = selftrans2arctransarcImpl
						.pattern_selftrans2arctransarc_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				selftrans2arctransarcImpl.pattern_selftrans2arctransarc_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(SM sm, petrinet.Transition pt, Transition st, Place p1, State s1, Arc a1,
			PNGraph png, Arc a2, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(SM sm, Transition st, State s1) {// 
		Object[] result1_black = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_27_1_matchtggpattern_blackBBB(sm, st, s1);
		if (result1_black != null) {
			return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_27_2_expressionF();
		} else {
			return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(petrinet.Transition pt, Place p1, Arc a1, PNGraph png, Arc a2) {// 
		Object[] result1_black = selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_28_1_matchtggpattern_blackBBBBB(pt, p1, a1, png, a2);
		if (result1_black != null) {
			return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_28_2_expressionF();
		} else {
			return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2P s12p1Parameter,
			SM2PN sm2pnParameter) {

		Object[] result1_black = selftrans2arctransarcImpl.pattern_selftrans2arctransarc_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = selftrans2arctransarcImpl.pattern_selftrans2arctransarc_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : selftrans2arctransarcImpl
				.pattern_selftrans2arctransarc_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList s12p1List = (RuleEntryList) result2_black[0];
			S2P s12p1 = (S2P) result2_black[1];
			State s1 = (State) result2_black[2];
			Place p1 = (Place) result2_black[3];
			//nothing RuleEntryList sm2pnList = (RuleEntryList) result2_black[4];
			SM sm = (SM) result2_black[5];
			SM2PN sm2pn = (SM2PN) result2_black[6];
			PNGraph png = (PNGraph) result2_black[7];

			Object[] result3_bindingAndBlack = selftrans2arctransarcImpl
					.pattern_selftrans2arctransarc_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							s12p1, sm, p1, s1, png, sm2pn, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s12p1] = " + s12p1 + ", " + "[sm] = "
						+ sm + ", " + "[p1] = " + p1 + ", " + "[s1] = " + s1 + ", " + "[png] = " + png + ", "
						+ "[sm2pn] = " + sm2pn + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (selftrans2arctransarcImpl.pattern_selftrans2arctransarc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = selftrans2arctransarcImpl
						.pattern_selftrans2arctransarc_29_5_checknacs_blackBBBBBB(s12p1, sm, p1, s1, png, sm2pn);
				if (result5_black != null) {

					Object[] result6_black = selftrans2arctransarcImpl
							.pattern_selftrans2arctransarc_29_6_perform_blackBBBBBBB(s12p1, sm, p1, s1, png, sm2pn,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[s12p1] = " + s12p1 + ", " + "[sm] = "
										+ sm + ", " + "[p1] = " + p1 + ", " + "[s1] = " + s1 + ", " + "[png] = " + png
										+ ", " + "[sm2pn] = " + sm2pn + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					selftrans2arctransarcImpl.pattern_selftrans2arctransarc_29_6_perform_greenBFFFBBFBFFFB(sm, p1, s1,
							png, ruleResult);
					//nothing petrinet.Transition pt = (petrinet.Transition) result6_green[1];
					//nothing T2T st2pt = (T2T) result6_green[2];
					//nothing Transition st = (Transition) result6_green[3];
					//nothing Arc a1 = (Arc) result6_green[6];
					//nothing T2A st2a2 = (T2A) result6_green[8];
					//nothing Arc a2 = (Arc) result6_green[9];
					//nothing T2A st2a1 = (T2A) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return selftrans2arctransarcImpl.pattern_selftrans2arctransarc_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2P s12p1, SM sm, Place p1, State s1,
			PNGraph png, SM2PN sm2pn, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s12p1", s12p1);
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("p1", p1);
		isApplicableMatch.registerObject("s1", s1);
		isApplicableMatch.registerObject("png", png);
		isApplicableMatch.registerObject("sm2pn", sm2pn);
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
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_FWD__MATCH_SM_TRANSITION_STATE:
			return isAppropriate_FWD((Match) arguments.get(0), (SM) arguments.get(1), (Transition) arguments.get(2),
					(State) arguments.get(3));
		case RulesPackage.SELFTRANS2ARCTRANSARC___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SM_TRANSITION_STATE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SM) arguments.get(1), (Transition) arguments.get(2),
					(State) arguments.get(3));
			return null;
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SM_TRANSITION_STATE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SM) arguments.get(1),
					(Transition) arguments.get(2), (State) arguments.get(3));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2P_SM_TRANSITION_PLACE_STATE_PNGRAPH_SM2PN:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (S2P) arguments.get(1),
					(SM) arguments.get(2), (Transition) arguments.get(3), (Place) arguments.get(4),
					(State) arguments.get(5), (PNGraph) arguments.get(6), (SM2PN) arguments.get(7));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.SELFTRANS2ARCTRANSARC___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_BWD__MATCH_TRANSITION_PLACE_ARC_PNGRAPH_ARC:
			return isAppropriate_BWD((Match) arguments.get(0), (petrinet.Transition) arguments.get(1),
					(Place) arguments.get(2), (Arc) arguments.get(3), (PNGraph) arguments.get(4),
					(Arc) arguments.get(5));
		case RulesPackage.SELFTRANS2ARCTRANSARC___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TRANSITION_PLACE_ARC_PNGRAPH_ARC:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (petrinet.Transition) arguments.get(1),
					(Place) arguments.get(2), (Arc) arguments.get(3), (PNGraph) arguments.get(4),
					(Arc) arguments.get(5));
			return null;
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TRANSITION_PLACE_ARC_PNGRAPH_ARC:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (petrinet.Transition) arguments.get(1),
					(Place) arguments.get(2), (Arc) arguments.get(3), (PNGraph) arguments.get(4),
					(Arc) arguments.get(5));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2P_SM_TRANSITION_PLACE_STATE_ARC_PNGRAPH_ARC_SM2PN:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2P) arguments.get(1),
					(SM) arguments.get(2), (petrinet.Transition) arguments.get(3), (Place) arguments.get(4),
					(State) arguments.get(5), (Arc) arguments.get(6), (PNGraph) arguments.get(7),
					(Arc) arguments.get(8), (SM2PN) arguments.get(9));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.SELFTRANS2ARCTRANSARC___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_53__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_53((EMoflonEdge) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_54__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_54((EMoflonEdge) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPLICABLE_SOLVE_CSP_CC__SM_TRANSITION_TRANSITION_PLACE_STATE_ARC_PNGRAPH_ARC_MATCH_MATCH:
			return isApplicable_solveCsp_CC((SM) arguments.get(0), (petrinet.Transition) arguments.get(1),
					(Transition) arguments.get(2), (Place) arguments.get(3), (State) arguments.get(4),
					(Arc) arguments.get(5), (PNGraph) arguments.get(6), (Arc) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.SELFTRANS2ARCTRANSARC___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SELFTRANS2ARCTRANSARC___CHECK_DEC_FWD__SM_TRANSITION_STATE:
			return checkDEC_FWD((SM) arguments.get(0), (Transition) arguments.get(1), (State) arguments.get(2));
		case RulesPackage.SELFTRANS2ARCTRANSARC___CHECK_DEC_BWD__TRANSITION_PLACE_ARC_PNGRAPH_ARC:
			return checkDEC_BWD((petrinet.Transition) arguments.get(0), (Place) arguments.get(1),
					(Arc) arguments.get(2), (PNGraph) arguments.get(3), (Arc) arguments.get(4));
		case RulesPackage.SELFTRANS2ARCTRANSARC___GENERATE_MODEL__RULEENTRYCONTAINER_S2P_SM2PN:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2P) arguments.get(1),
					(SM2PN) arguments.get(2));
		case RulesPackage.SELFTRANS2ARCTRANSARC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2P_SM_PLACE_STATE_PNGRAPH_SM2PN_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2P) arguments.get(1),
					(SM) arguments.get(2), (Place) arguments.get(3), (State) arguments.get(4),
					(PNGraph) arguments.get(5), (SM2PN) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.SELFTRANS2ARCTRANSARC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_selftrans2arctransarc_0_1_initialbindings_blackBBBBB(
			selftrans2arctransarc _this, Match match, SM sm, Transition st, State s1) {
		return new Object[] { _this, match, sm, st, s1 };
	}

	public static final Object[] pattern_selftrans2arctransarc_0_2_SolveCSP_bindingFBBBBB(selftrans2arctransarc _this,
			Match match, SM sm, Transition st, State s1) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, sm, st, s1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, sm, st, s1 };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_selftrans2arctransarc_0_2_SolveCSP_bindingAndBlackFBBBBB(
			selftrans2arctransarc _this, Match match, SM sm, Transition st, State s1) {
		Object[] result_pattern_selftrans2arctransarc_0_2_SolveCSP_binding = pattern_selftrans2arctransarc_0_2_SolveCSP_bindingFBBBBB(
				_this, match, sm, st, s1);
		if (result_pattern_selftrans2arctransarc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_selftrans2arctransarc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_selftrans2arctransarc_0_2_SolveCSP_black = pattern_selftrans2arctransarc_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_selftrans2arctransarc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, sm, st, s1 };
			}
		}
		return null;
	}

	public static final boolean pattern_selftrans2arctransarc_0_3_CheckCSP_expressionFBB(selftrans2arctransarc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_0_4_collectelementstobetranslated_blackBBBB(Match match,
			SM sm, Transition st, State s1) {
		return new Object[] { match, sm, st, s1 };
	}

	public static final Object[] pattern_selftrans2arctransarc_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, SM sm, Transition st, State s1) {
		EMoflonEdge sm__st____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s1____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(st);
		String sm__st____transitions_name_prime = "transitions";
		String st__s1____to_name_prime = "to";
		String st__s1____from_name_prime = "from";
		sm__st____transitions.setSrc(sm);
		sm__st____transitions.setTrg(st);
		match.getToBeTranslatedEdges().add(sm__st____transitions);
		st__s1____to.setSrc(st);
		st__s1____to.setTrg(s1);
		match.getToBeTranslatedEdges().add(st__s1____to);
		st__s1____from.setSrc(st);
		st__s1____from.setTrg(s1);
		match.getToBeTranslatedEdges().add(st__s1____from);
		sm__st____transitions.setName(sm__st____transitions_name_prime);
		st__s1____to.setName(st__s1____to_name_prime);
		st__s1____from.setName(st__s1____from_name_prime);
		return new Object[] { match, sm, st, s1, sm__st____transitions, st__s1____to, st__s1____from };
	}

	public static final Object[] pattern_selftrans2arctransarc_0_5_collectcontextelements_blackBBBB(Match match, SM sm,
			Transition st, State s1) {
		return new Object[] { match, sm, st, s1 };
	}

	public static final Object[] pattern_selftrans2arctransarc_0_5_collectcontextelements_greenBBB(Match match, SM sm,
			State s1) {
		match.getContextNodes().add(sm);
		match.getContextNodes().add(s1);
		return new Object[] { match, sm, s1 };
	}

	public static final void pattern_selftrans2arctransarc_0_6_registerobjectstomatch_expressionBBBBB(
			selftrans2arctransarc _this, Match match, SM sm, Transition st, State s1) {
		_this.registerObjectsToMatch_FWD(match, sm, st, s1);

	}

	public static final boolean pattern_selftrans2arctransarc_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_selftrans2arctransarc_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("s12p1");
		EObject _localVariable_1 = isApplicableMatch.getObject("sm");
		EObject _localVariable_2 = isApplicableMatch.getObject("st");
		EObject _localVariable_3 = isApplicableMatch.getObject("p1");
		EObject _localVariable_4 = isApplicableMatch.getObject("s1");
		EObject _localVariable_5 = isApplicableMatch.getObject("png");
		EObject _localVariable_6 = isApplicableMatch.getObject("sm2pn");
		EObject tmpS12p1 = _localVariable_0;
		EObject tmpSm = _localVariable_1;
		EObject tmpSt = _localVariable_2;
		EObject tmpP1 = _localVariable_3;
		EObject tmpS1 = _localVariable_4;
		EObject tmpPng = _localVariable_5;
		EObject tmpSm2pn = _localVariable_6;
		if (tmpS12p1 instanceof S2P) {
			S2P s12p1 = (S2P) tmpS12p1;
			if (tmpSm instanceof SM) {
				SM sm = (SM) tmpSm;
				if (tmpSt instanceof Transition) {
					Transition st = (Transition) tmpSt;
					if (tmpP1 instanceof Place) {
						Place p1 = (Place) tmpP1;
						if (tmpS1 instanceof State) {
							State s1 = (State) tmpS1;
							if (tmpPng instanceof PNGraph) {
								PNGraph png = (PNGraph) tmpPng;
								if (tmpSm2pn instanceof SM2PN) {
									SM2PN sm2pn = (SM2PN) tmpSm2pn;
									return new Object[] { s12p1, sm, st, p1, s1, png, sm2pn, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_1_1_performtransformation_blackBBBBBBBFBB(S2P s12p1,
			SM sm, Transition st, Place p1, State s1, PNGraph png, SM2PN sm2pn, selftrans2arctransarc _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { s12p1, sm, st, p1, s1, png, sm2pn, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			selftrans2arctransarc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_selftrans2arctransarc_1_1_performtransformation_binding = pattern_selftrans2arctransarc_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_selftrans2arctransarc_1_1_performtransformation_binding != null) {
			S2P s12p1 = (S2P) result_pattern_selftrans2arctransarc_1_1_performtransformation_binding[0];
			SM sm = (SM) result_pattern_selftrans2arctransarc_1_1_performtransformation_binding[1];
			Transition st = (Transition) result_pattern_selftrans2arctransarc_1_1_performtransformation_binding[2];
			Place p1 = (Place) result_pattern_selftrans2arctransarc_1_1_performtransformation_binding[3];
			State s1 = (State) result_pattern_selftrans2arctransarc_1_1_performtransformation_binding[4];
			PNGraph png = (PNGraph) result_pattern_selftrans2arctransarc_1_1_performtransformation_binding[5];
			SM2PN sm2pn = (SM2PN) result_pattern_selftrans2arctransarc_1_1_performtransformation_binding[6];

			Object[] result_pattern_selftrans2arctransarc_1_1_performtransformation_black = pattern_selftrans2arctransarc_1_1_performtransformation_blackBBBBBBBFBB(
					s12p1, sm, st, p1, s1, png, sm2pn, _this, isApplicableMatch);
			if (result_pattern_selftrans2arctransarc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_selftrans2arctransarc_1_1_performtransformation_black[7];

				return new Object[] { s12p1, sm, st, p1, s1, png, sm2pn, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_1_1_performtransformation_greenFFBBFBFFF(Transition st,
			Place p1, PNGraph png) {
		petrinet.Transition pt = PetrinetFactory.eINSTANCE.createTransition();
		T2T st2pt = Statemachine2petrinetFactory.eINSTANCE.createT2T();
		Arc a1 = PetrinetFactory.eINSTANCE.createArc();
		T2A st2a2 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		Arc a2 = PetrinetFactory.eINSTANCE.createArc();
		T2A st2a1 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		png.getTransitions().add(pt);
		st2pt.setSource(st);
		st2pt.setTarget(pt);
		a1.setTo(pt);
		a1.setFrom(p1);
		png.getArcs().add(a1);
		st2a2.setSource(st);
		st2a2.setTarget(a2);
		png.getArcs().add(a2);
		a2.setTo(p1);
		a2.setFrom(pt);
		st2a1.setTarget(a1);
		st2a1.setSource(st);
		return new Object[] { pt, st2pt, st, p1, a1, png, st2a2, a2, st2a1 };
	}

	public static final Object[] pattern_selftrans2arctransarc_1_2_collecttranslatedelements_blackBBBBBBB(
			petrinet.Transition pt, T2T st2pt, Transition st, Arc a1, T2A st2a2, Arc a2, T2A st2a1) {
		if (!a1.equals(a2)) {
			if (!st2a1.equals(st2a2)) {
				return new Object[] { pt, st2pt, st, a1, st2a2, a2, st2a1 };
			}
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_1_2_collecttranslatedelements_greenFBBBBBBB(
			petrinet.Transition pt, T2T st2pt, Transition st, Arc a1, T2A st2a2, Arc a2, T2A st2a1) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(pt);
		ruleresult.getCreatedLinkElements().add(st2pt);
		ruleresult.getTranslatedElements().add(st);
		ruleresult.getCreatedElements().add(a1);
		ruleresult.getCreatedLinkElements().add(st2a2);
		ruleresult.getCreatedElements().add(a2);
		ruleresult.getCreatedLinkElements().add(st2a1);
		return new Object[] { ruleresult, pt, st2pt, st, a1, st2a2, a2, st2a1 };
	}

	public static final Object[] pattern_selftrans2arctransarc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject s12p1, EObject sm, EObject pt, EObject st2pt, EObject st, EObject p1,
			EObject s1, EObject a1, EObject png, EObject st2a2, EObject a2, EObject st2a1, EObject sm2pn) {
		if (!s12p1.equals(sm)) {
			if (!s12p1.equals(st2pt)) {
				if (!s12p1.equals(st)) {
					if (!s12p1.equals(st2a2)) {
						if (!s12p1.equals(st2a1)) {
							if (!s12p1.equals(sm2pn)) {
								if (!sm.equals(st2pt)) {
									if (!sm.equals(st)) {
										if (!sm.equals(st2a2)) {
											if (!sm.equals(st2a1)) {
												if (!sm.equals(sm2pn)) {
													if (!pt.equals(s12p1)) {
														if (!pt.equals(sm)) {
															if (!pt.equals(st2pt)) {
																if (!pt.equals(st)) {
																	if (!pt.equals(s1)) {
																		if (!pt.equals(st2a2)) {
																			if (!pt.equals(st2a1)) {
																				if (!pt.equals(sm2pn)) {
																					if (!st.equals(st2pt)) {
																						if (!st.equals(st2a2)) {
																							if (!st.equals(st2a1)) {
																								if (!p1.equals(s12p1)) {
																									if (!p1.equals(
																											sm)) {
																										if (!p1.equals(
																												pt)) {
																											if (!p1.equals(
																													st2pt)) {
																												if (!p1.equals(
																														st)) {
																													if (!p1.equals(
																															s1)) {
																														if (!p1.equals(
																																png)) {
																															if (!p1.equals(
																																	st2a2)) {
																																if (!p1.equals(
																																		st2a1)) {
																																	if (!p1.equals(
																																			sm2pn)) {
																																		if (!s1.equals(
																																				s12p1)) {
																																			if (!s1.equals(
																																					sm)) {
																																				if (!s1.equals(
																																						st2pt)) {
																																					if (!s1.equals(
																																							st)) {
																																						if (!s1.equals(
																																								st2a2)) {
																																							if (!s1.equals(
																																									st2a1)) {
																																								if (!s1.equals(
																																										sm2pn)) {
																																									if (!a1.equals(
																																											s12p1)) {
																																										if (!a1.equals(
																																												sm)) {
																																											if (!a1.equals(
																																													pt)) {
																																												if (!a1.equals(
																																														st2pt)) {
																																													if (!a1.equals(
																																															st)) {
																																														if (!a1.equals(
																																																p1)) {
																																															if (!a1.equals(
																																																	s1)) {
																																																if (!a1.equals(
																																																		png)) {
																																																	if (!a1.equals(
																																																			st2a2)) {
																																																		if (!a1.equals(
																																																				a2)) {
																																																			if (!a1.equals(
																																																					st2a1)) {
																																																				if (!a1.equals(
																																																						sm2pn)) {
																																																					if (!png.equals(
																																																							s12p1)) {
																																																						if (!png.equals(
																																																								sm)) {
																																																							if (!png.equals(
																																																									pt)) {
																																																								if (!png.equals(
																																																										st2pt)) {
																																																									if (!png.equals(
																																																											st)) {
																																																										if (!png.equals(
																																																												s1)) {
																																																											if (!png.equals(
																																																													st2a2)) {
																																																												if (!png.equals(
																																																														st2a1)) {
																																																													if (!png.equals(
																																																															sm2pn)) {
																																																														if (!st2a2
																																																																.equals(st2pt)) {
																																																															if (!a2.equals(
																																																																	s12p1)) {
																																																																if (!a2.equals(
																																																																		sm)) {
																																																																	if (!a2.equals(
																																																																			pt)) {
																																																																		if (!a2.equals(
																																																																				st2pt)) {
																																																																			if (!a2.equals(
																																																																					st)) {
																																																																				if (!a2.equals(
																																																																						p1)) {
																																																																					if (!a2.equals(
																																																																							s1)) {
																																																																						if (!a2.equals(
																																																																								png)) {
																																																																							if (!a2.equals(
																																																																									st2a2)) {
																																																																								if (!a2.equals(
																																																																										st2a1)) {
																																																																									if (!a2.equals(
																																																																											sm2pn)) {
																																																																										if (!st2a1
																																																																												.equals(st2pt)) {
																																																																											if (!st2a1
																																																																													.equals(st2a2)) {
																																																																												if (!sm2pn
																																																																														.equals(st2pt)) {
																																																																													if (!sm2pn
																																																																															.equals(st)) {
																																																																														if (!sm2pn
																																																																																.equals(st2a2)) {
																																																																															if (!sm2pn
																																																																																	.equals(st2a1)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		s12p1,
																																																																																		sm,
																																																																																		pt,
																																																																																		st2pt,
																																																																																		st,
																																																																																		p1,
																																																																																		s1,
																																																																																		a1,
																																																																																		png,
																																																																																		st2a2,
																																																																																		a2,
																																																																																		st2a1,
																																																																																		sm2pn };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_selftrans2arctransarc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject sm, EObject pt, EObject st2pt, EObject st, EObject p1, EObject s1,
			EObject a1, EObject png, EObject st2a2, EObject a2, EObject st2a1) {
		EMoflonEdge sm__st____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2pt__st____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__pt____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__p1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2pt__pt____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__pt____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a2__st____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a2__a2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__a2____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a1__a1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s1____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__p1____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a1__st____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__a1____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__pt____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "selftrans2arctransarc";
		String sm__st____transitions_name_prime = "transitions";
		String st2pt__st____source_name_prime = "source";
		String a1__pt____to_name_prime = "to";
		String a1__p1____from_name_prime = "from";
		String st2pt__pt____target_name_prime = "target";
		String png__pt____transitions_name_prime = "transitions";
		String st2a2__st____source_name_prime = "source";
		String st2a2__a2____target_name_prime = "target";
		String png__a2____arcs_name_prime = "arcs";
		String st2a1__a1____target_name_prime = "target";
		String st__s1____to_name_prime = "to";
		String a2__p1____to_name_prime = "to";
		String st2a1__st____source_name_prime = "source";
		String png__a1____arcs_name_prime = "arcs";
		String st__s1____from_name_prime = "from";
		String a2__pt____from_name_prime = "from";
		sm__st____transitions.setSrc(sm);
		sm__st____transitions.setTrg(st);
		ruleresult.getTranslatedEdges().add(sm__st____transitions);
		st2pt__st____source.setSrc(st2pt);
		st2pt__st____source.setTrg(st);
		ruleresult.getCreatedEdges().add(st2pt__st____source);
		a1__pt____to.setSrc(a1);
		a1__pt____to.setTrg(pt);
		ruleresult.getCreatedEdges().add(a1__pt____to);
		a1__p1____from.setSrc(a1);
		a1__p1____from.setTrg(p1);
		ruleresult.getCreatedEdges().add(a1__p1____from);
		st2pt__pt____target.setSrc(st2pt);
		st2pt__pt____target.setTrg(pt);
		ruleresult.getCreatedEdges().add(st2pt__pt____target);
		png__pt____transitions.setSrc(png);
		png__pt____transitions.setTrg(pt);
		ruleresult.getCreatedEdges().add(png__pt____transitions);
		st2a2__st____source.setSrc(st2a2);
		st2a2__st____source.setTrg(st);
		ruleresult.getCreatedEdges().add(st2a2__st____source);
		st2a2__a2____target.setSrc(st2a2);
		st2a2__a2____target.setTrg(a2);
		ruleresult.getCreatedEdges().add(st2a2__a2____target);
		png__a2____arcs.setSrc(png);
		png__a2____arcs.setTrg(a2);
		ruleresult.getCreatedEdges().add(png__a2____arcs);
		st2a1__a1____target.setSrc(st2a1);
		st2a1__a1____target.setTrg(a1);
		ruleresult.getCreatedEdges().add(st2a1__a1____target);
		st__s1____to.setSrc(st);
		st__s1____to.setTrg(s1);
		ruleresult.getTranslatedEdges().add(st__s1____to);
		a2__p1____to.setSrc(a2);
		a2__p1____to.setTrg(p1);
		ruleresult.getCreatedEdges().add(a2__p1____to);
		st2a1__st____source.setSrc(st2a1);
		st2a1__st____source.setTrg(st);
		ruleresult.getCreatedEdges().add(st2a1__st____source);
		png__a1____arcs.setSrc(png);
		png__a1____arcs.setTrg(a1);
		ruleresult.getCreatedEdges().add(png__a1____arcs);
		st__s1____from.setSrc(st);
		st__s1____from.setTrg(s1);
		ruleresult.getTranslatedEdges().add(st__s1____from);
		a2__pt____from.setSrc(a2);
		a2__pt____from.setTrg(pt);
		ruleresult.getCreatedEdges().add(a2__pt____from);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sm__st____transitions.setName(sm__st____transitions_name_prime);
		st2pt__st____source.setName(st2pt__st____source_name_prime);
		a1__pt____to.setName(a1__pt____to_name_prime);
		a1__p1____from.setName(a1__p1____from_name_prime);
		st2pt__pt____target.setName(st2pt__pt____target_name_prime);
		png__pt____transitions.setName(png__pt____transitions_name_prime);
		st2a2__st____source.setName(st2a2__st____source_name_prime);
		st2a2__a2____target.setName(st2a2__a2____target_name_prime);
		png__a2____arcs.setName(png__a2____arcs_name_prime);
		st2a1__a1____target.setName(st2a1__a1____target_name_prime);
		st__s1____to.setName(st__s1____to_name_prime);
		a2__p1____to.setName(a2__p1____to_name_prime);
		st2a1__st____source.setName(st2a1__st____source_name_prime);
		png__a1____arcs.setName(png__a1____arcs_name_prime);
		st__s1____from.setName(st__s1____from_name_prime);
		a2__pt____from.setName(a2__pt____from_name_prime);
		return new Object[] { ruleresult, sm, pt, st2pt, st, p1, s1, a1, png, st2a2, a2, st2a1, sm__st____transitions,
				st2pt__st____source, a1__pt____to, a1__p1____from, st2pt__pt____target, png__pt____transitions,
				st2a2__st____source, st2a2__a2____target, png__a2____arcs, st2a1__a1____target, st__s1____to,
				a2__p1____to, st2a1__st____source, png__a1____arcs, st__s1____from, a2__pt____from };
	}

	public static final void pattern_selftrans2arctransarc_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(
			selftrans2arctransarc _this, PerformRuleResult ruleresult, EObject s12p1, EObject sm, EObject pt,
			EObject st2pt, EObject st, EObject p1, EObject s1, EObject a1, EObject png, EObject st2a2, EObject a2,
			EObject st2a1, EObject sm2pn) {
		_this.registerObjects_FWD(ruleresult, s12p1, sm, pt, st2pt, st, p1, s1, a1, png, st2a2, a2, st2a1, sm2pn);

	}

	public static final PerformRuleResult pattern_selftrans2arctransarc_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_2_1_preparereturnvalue_bindingFB(
			selftrans2arctransarc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_2_1_preparereturnvalue_blackFBB(EClass eClass,
			selftrans2arctransarc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_2_1_preparereturnvalue_bindingAndBlackFFB(
			selftrans2arctransarc _this) {
		Object[] result_pattern_selftrans2arctransarc_2_1_preparereturnvalue_binding = pattern_selftrans2arctransarc_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_selftrans2arctransarc_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_selftrans2arctransarc_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_selftrans2arctransarc_2_1_preparereturnvalue_black = pattern_selftrans2arctransarc_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_selftrans2arctransarc_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_selftrans2arctransarc_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "selftrans2arctransarc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_selftrans2arctransarc_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("sm");
		EObject _localVariable_1 = match.getObject("st");
		EObject _localVariable_2 = match.getObject("s1");
		EObject tmpSm = _localVariable_0;
		EObject tmpSt = _localVariable_1;
		EObject tmpS1 = _localVariable_2;
		if (tmpSm instanceof SM) {
			SM sm = (SM) tmpSm;
			if (tmpSt instanceof Transition) {
				Transition st = (Transition) tmpSt;
				if (tmpS1 instanceof State) {
					State s1 = (State) tmpS1;
					return new Object[] { sm, st, s1, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_selftrans2arctransarc_2_2_corematch_blackFBBFBFFB(SM sm,
			Transition st, State s1, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (S2P s12p1 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s1, S2P.class, "source")) {
			Place p1 = s12p1.getTarget();
			if (p1 != null) {
				for (SM2PN sm2pn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(sm, SM2PN.class,
						"source")) {
					PNGraph png = sm2pn.getTarget();
					if (png != null) {
						_result.add(new Object[] { s12p1, sm, st, p1, s1, png, sm2pn, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_selftrans2arctransarc_2_3_findcontext_blackBBBBBBB(S2P s12p1, SM sm,
			Transition st, Place p1, State s1, PNGraph png, SM2PN sm2pn) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (sm.getTransitions().contains(st)) {
			if (s1.equals(s12p1.getSource())) {
				if (p1.equals(s12p1.getTarget())) {
					if (s1.equals(st.getTo())) {
						if (png.equals(sm2pn.getTarget())) {
							if (s1.equals(st.getFrom())) {
								if (sm.equals(sm2pn.getSource())) {
									_result.add(new Object[] { s12p1, sm, st, p1, s1, png, sm2pn });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_2_3_findcontext_greenBBBBBBBFFFFFFFF(S2P s12p1, SM sm,
			Transition st, Place p1, State s1, PNGraph png, SM2PN sm2pn) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge sm__st____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s12p1__s1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s12p1__p1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s1____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm2pn__png____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm2pn__sm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String sm__st____transitions_name_prime = "transitions";
		String s12p1__s1____source_name_prime = "source";
		String s12p1__p1____target_name_prime = "target";
		String st__s1____to_name_prime = "to";
		String sm2pn__png____target_name_prime = "target";
		String st__s1____from_name_prime = "from";
		String sm2pn__sm____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(s12p1);
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(st);
		isApplicableMatch.getAllContextElements().add(p1);
		isApplicableMatch.getAllContextElements().add(s1);
		isApplicableMatch.getAllContextElements().add(png);
		isApplicableMatch.getAllContextElements().add(sm2pn);
		sm__st____transitions.setSrc(sm);
		sm__st____transitions.setTrg(st);
		isApplicableMatch.getAllContextElements().add(sm__st____transitions);
		s12p1__s1____source.setSrc(s12p1);
		s12p1__s1____source.setTrg(s1);
		isApplicableMatch.getAllContextElements().add(s12p1__s1____source);
		s12p1__p1____target.setSrc(s12p1);
		s12p1__p1____target.setTrg(p1);
		isApplicableMatch.getAllContextElements().add(s12p1__p1____target);
		st__s1____to.setSrc(st);
		st__s1____to.setTrg(s1);
		isApplicableMatch.getAllContextElements().add(st__s1____to);
		sm2pn__png____target.setSrc(sm2pn);
		sm2pn__png____target.setTrg(png);
		isApplicableMatch.getAllContextElements().add(sm2pn__png____target);
		st__s1____from.setSrc(st);
		st__s1____from.setTrg(s1);
		isApplicableMatch.getAllContextElements().add(st__s1____from);
		sm2pn__sm____source.setSrc(sm2pn);
		sm2pn__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(sm2pn__sm____source);
		sm__st____transitions.setName(sm__st____transitions_name_prime);
		s12p1__s1____source.setName(s12p1__s1____source_name_prime);
		s12p1__p1____target.setName(s12p1__p1____target_name_prime);
		st__s1____to.setName(st__s1____to_name_prime);
		sm2pn__png____target.setName(sm2pn__png____target_name_prime);
		st__s1____from.setName(st__s1____from_name_prime);
		sm2pn__sm____source.setName(sm2pn__sm____source_name_prime);
		return new Object[] { s12p1, sm, st, p1, s1, png, sm2pn, isApplicableMatch, sm__st____transitions,
				s12p1__s1____source, s12p1__p1____target, st__s1____to, sm2pn__png____target, st__s1____from,
				sm2pn__sm____source };
	}

	public static final Object[] pattern_selftrans2arctransarc_2_4_solveCSP_bindingFBBBBBBBBB(
			selftrans2arctransarc _this, IsApplicableMatch isApplicableMatch, S2P s12p1, SM sm, Transition st, Place p1,
			State s1, PNGraph png, SM2PN sm2pn) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, s12p1, sm, st, p1, s1, png, sm2pn);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s12p1, sm, st, p1, s1, png, sm2pn };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_selftrans2arctransarc_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			selftrans2arctransarc _this, IsApplicableMatch isApplicableMatch, S2P s12p1, SM sm, Transition st, Place p1,
			State s1, PNGraph png, SM2PN sm2pn) {
		Object[] result_pattern_selftrans2arctransarc_2_4_solveCSP_binding = pattern_selftrans2arctransarc_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, s12p1, sm, st, p1, s1, png, sm2pn);
		if (result_pattern_selftrans2arctransarc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_selftrans2arctransarc_2_4_solveCSP_binding[0];

			Object[] result_pattern_selftrans2arctransarc_2_4_solveCSP_black = pattern_selftrans2arctransarc_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_selftrans2arctransarc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s12p1, sm, st, p1, s1, png, sm2pn };
			}
		}
		return null;
	}

	public static final boolean pattern_selftrans2arctransarc_2_5_checkCSP_expressionFBB(selftrans2arctransarc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_selftrans2arctransarc_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "selftrans2arctransarc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_selftrans2arctransarc_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_10_1_initialbindings_blackBBBBBBB(
			selftrans2arctransarc _this, Match match, petrinet.Transition pt, Place p1, Arc a1, PNGraph png, Arc a2) {
		if (!a1.equals(a2)) {
			return new Object[] { _this, match, pt, p1, a1, png, a2 };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_10_2_SolveCSP_bindingFBBBBBBB(
			selftrans2arctransarc _this, Match match, petrinet.Transition pt, Place p1, Arc a1, PNGraph png, Arc a2) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pt, p1, a1, png, a2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pt, p1, a1, png, a2 };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_selftrans2arctransarc_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			selftrans2arctransarc _this, Match match, petrinet.Transition pt, Place p1, Arc a1, PNGraph png, Arc a2) {
		Object[] result_pattern_selftrans2arctransarc_10_2_SolveCSP_binding = pattern_selftrans2arctransarc_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, pt, p1, a1, png, a2);
		if (result_pattern_selftrans2arctransarc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_selftrans2arctransarc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_selftrans2arctransarc_10_2_SolveCSP_black = pattern_selftrans2arctransarc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_selftrans2arctransarc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pt, p1, a1, png, a2 };
			}
		}
		return null;
	}

	public static final boolean pattern_selftrans2arctransarc_10_3_CheckCSP_expressionFBB(selftrans2arctransarc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_10_4_collectelementstobetranslated_blackBBBBBB(
			Match match, petrinet.Transition pt, Place p1, Arc a1, PNGraph png, Arc a2) {
		if (!a1.equals(a2)) {
			return new Object[] { match, pt, p1, a1, png, a2 };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFF(
			Match match, petrinet.Transition pt, Place p1, Arc a1, PNGraph png, Arc a2) {
		EMoflonEdge a1__pt____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__p1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__pt____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__a2____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__p1____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__a1____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__pt____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(pt);
		match.getToBeTranslatedNodes().add(a1);
		match.getToBeTranslatedNodes().add(a2);
		String a1__pt____to_name_prime = "to";
		String a1__p1____from_name_prime = "from";
		String png__pt____transitions_name_prime = "transitions";
		String png__a2____arcs_name_prime = "arcs";
		String a2__p1____to_name_prime = "to";
		String png__a1____arcs_name_prime = "arcs";
		String a2__pt____from_name_prime = "from";
		a1__pt____to.setSrc(a1);
		a1__pt____to.setTrg(pt);
		match.getToBeTranslatedEdges().add(a1__pt____to);
		a1__p1____from.setSrc(a1);
		a1__p1____from.setTrg(p1);
		match.getToBeTranslatedEdges().add(a1__p1____from);
		png__pt____transitions.setSrc(png);
		png__pt____transitions.setTrg(pt);
		match.getToBeTranslatedEdges().add(png__pt____transitions);
		png__a2____arcs.setSrc(png);
		png__a2____arcs.setTrg(a2);
		match.getToBeTranslatedEdges().add(png__a2____arcs);
		a2__p1____to.setSrc(a2);
		a2__p1____to.setTrg(p1);
		match.getToBeTranslatedEdges().add(a2__p1____to);
		png__a1____arcs.setSrc(png);
		png__a1____arcs.setTrg(a1);
		match.getToBeTranslatedEdges().add(png__a1____arcs);
		a2__pt____from.setSrc(a2);
		a2__pt____from.setTrg(pt);
		match.getToBeTranslatedEdges().add(a2__pt____from);
		a1__pt____to.setName(a1__pt____to_name_prime);
		a1__p1____from.setName(a1__p1____from_name_prime);
		png__pt____transitions.setName(png__pt____transitions_name_prime);
		png__a2____arcs.setName(png__a2____arcs_name_prime);
		a2__p1____to.setName(a2__p1____to_name_prime);
		png__a1____arcs.setName(png__a1____arcs_name_prime);
		a2__pt____from.setName(a2__pt____from_name_prime);
		return new Object[] { match, pt, p1, a1, png, a2, a1__pt____to, a1__p1____from, png__pt____transitions,
				png__a2____arcs, a2__p1____to, png__a1____arcs, a2__pt____from };
	}

	public static final Object[] pattern_selftrans2arctransarc_10_5_collectcontextelements_blackBBBBBB(Match match,
			petrinet.Transition pt, Place p1, Arc a1, PNGraph png, Arc a2) {
		if (!a1.equals(a2)) {
			return new Object[] { match, pt, p1, a1, png, a2 };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_10_5_collectcontextelements_greenBBB(Match match,
			Place p1, PNGraph png) {
		match.getContextNodes().add(p1);
		match.getContextNodes().add(png);
		return new Object[] { match, p1, png };
	}

	public static final void pattern_selftrans2arctransarc_10_6_registerobjectstomatch_expressionBBBBBBB(
			selftrans2arctransarc _this, Match match, petrinet.Transition pt, Place p1, Arc a1, PNGraph png, Arc a2) {
		_this.registerObjectsToMatch_BWD(match, pt, p1, a1, png, a2);

	}

	public static final boolean pattern_selftrans2arctransarc_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_selftrans2arctransarc_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("s12p1");
		EObject _localVariable_1 = isApplicableMatch.getObject("sm");
		EObject _localVariable_2 = isApplicableMatch.getObject("pt");
		EObject _localVariable_3 = isApplicableMatch.getObject("p1");
		EObject _localVariable_4 = isApplicableMatch.getObject("s1");
		EObject _localVariable_5 = isApplicableMatch.getObject("a1");
		EObject _localVariable_6 = isApplicableMatch.getObject("png");
		EObject _localVariable_7 = isApplicableMatch.getObject("a2");
		EObject _localVariable_8 = isApplicableMatch.getObject("sm2pn");
		EObject tmpS12p1 = _localVariable_0;
		EObject tmpSm = _localVariable_1;
		EObject tmpPt = _localVariable_2;
		EObject tmpP1 = _localVariable_3;
		EObject tmpS1 = _localVariable_4;
		EObject tmpA1 = _localVariable_5;
		EObject tmpPng = _localVariable_6;
		EObject tmpA2 = _localVariable_7;
		EObject tmpSm2pn = _localVariable_8;
		if (tmpS12p1 instanceof S2P) {
			S2P s12p1 = (S2P) tmpS12p1;
			if (tmpSm instanceof SM) {
				SM sm = (SM) tmpSm;
				if (tmpPt instanceof petrinet.Transition) {
					petrinet.Transition pt = (petrinet.Transition) tmpPt;
					if (tmpP1 instanceof Place) {
						Place p1 = (Place) tmpP1;
						if (tmpS1 instanceof State) {
							State s1 = (State) tmpS1;
							if (tmpA1 instanceof Arc) {
								Arc a1 = (Arc) tmpA1;
								if (tmpPng instanceof PNGraph) {
									PNGraph png = (PNGraph) tmpPng;
									if (tmpA2 instanceof Arc) {
										Arc a2 = (Arc) tmpA2;
										if (tmpSm2pn instanceof SM2PN) {
											SM2PN sm2pn = (SM2PN) tmpSm2pn;
											return new Object[] { s12p1, sm, pt, p1, s1, a1, png, a2, sm2pn,
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
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_11_1_performtransformation_blackBBBBBBBBBFBB(S2P s12p1,
			SM sm, petrinet.Transition pt, Place p1, State s1, Arc a1, PNGraph png, Arc a2, SM2PN sm2pn,
			selftrans2arctransarc _this, IsApplicableMatch isApplicableMatch) {
		if (!a1.equals(a2)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { s12p1, sm, pt, p1, s1, a1, png, a2, sm2pn, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			selftrans2arctransarc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_selftrans2arctransarc_11_1_performtransformation_binding = pattern_selftrans2arctransarc_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_selftrans2arctransarc_11_1_performtransformation_binding != null) {
			S2P s12p1 = (S2P) result_pattern_selftrans2arctransarc_11_1_performtransformation_binding[0];
			SM sm = (SM) result_pattern_selftrans2arctransarc_11_1_performtransformation_binding[1];
			petrinet.Transition pt = (petrinet.Transition) result_pattern_selftrans2arctransarc_11_1_performtransformation_binding[2];
			Place p1 = (Place) result_pattern_selftrans2arctransarc_11_1_performtransformation_binding[3];
			State s1 = (State) result_pattern_selftrans2arctransarc_11_1_performtransformation_binding[4];
			Arc a1 = (Arc) result_pattern_selftrans2arctransarc_11_1_performtransformation_binding[5];
			PNGraph png = (PNGraph) result_pattern_selftrans2arctransarc_11_1_performtransformation_binding[6];
			Arc a2 = (Arc) result_pattern_selftrans2arctransarc_11_1_performtransformation_binding[7];
			SM2PN sm2pn = (SM2PN) result_pattern_selftrans2arctransarc_11_1_performtransformation_binding[8];

			Object[] result_pattern_selftrans2arctransarc_11_1_performtransformation_black = pattern_selftrans2arctransarc_11_1_performtransformation_blackBBBBBBBBBFBB(
					s12p1, sm, pt, p1, s1, a1, png, a2, sm2pn, _this, isApplicableMatch);
			if (result_pattern_selftrans2arctransarc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_selftrans2arctransarc_11_1_performtransformation_black[9];

				return new Object[] { s12p1, sm, pt, p1, s1, a1, png, a2, sm2pn, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_11_1_performtransformation_greenBBFFBBFBF(SM sm,
			petrinet.Transition pt, State s1, Arc a1, Arc a2) {
		T2T st2pt = Statemachine2petrinetFactory.eINSTANCE.createT2T();
		Transition st = StatemachineFactory.eINSTANCE.createTransition();
		T2A st2a2 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		T2A st2a1 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		st2pt.setTarget(pt);
		sm.getTransitions().add(st);
		st2pt.setSource(st);
		st.setTo(s1);
		st.setFrom(s1);
		st2a2.setSource(st);
		st2a2.setTarget(a2);
		st2a1.setTarget(a1);
		st2a1.setSource(st);
		return new Object[] { sm, pt, st2pt, st, s1, a1, st2a2, a2, st2a1 };
	}

	public static final Object[] pattern_selftrans2arctransarc_11_2_collecttranslatedelements_blackBBBBBBB(
			petrinet.Transition pt, T2T st2pt, Transition st, Arc a1, T2A st2a2, Arc a2, T2A st2a1) {
		if (!a1.equals(a2)) {
			if (!st2a1.equals(st2a2)) {
				return new Object[] { pt, st2pt, st, a1, st2a2, a2, st2a1 };
			}
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_11_2_collecttranslatedelements_greenFBBBBBBB(
			petrinet.Transition pt, T2T st2pt, Transition st, Arc a1, T2A st2a2, Arc a2, T2A st2a1) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(pt);
		ruleresult.getCreatedLinkElements().add(st2pt);
		ruleresult.getCreatedElements().add(st);
		ruleresult.getTranslatedElements().add(a1);
		ruleresult.getCreatedLinkElements().add(st2a2);
		ruleresult.getTranslatedElements().add(a2);
		ruleresult.getCreatedLinkElements().add(st2a1);
		return new Object[] { ruleresult, pt, st2pt, st, a1, st2a2, a2, st2a1 };
	}

	public static final Object[] pattern_selftrans2arctransarc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject s12p1, EObject sm, EObject pt, EObject st2pt, EObject st, EObject p1,
			EObject s1, EObject a1, EObject png, EObject st2a2, EObject a2, EObject st2a1, EObject sm2pn) {
		if (!s12p1.equals(sm)) {
			if (!s12p1.equals(st2pt)) {
				if (!s12p1.equals(st)) {
					if (!s12p1.equals(st2a2)) {
						if (!s12p1.equals(st2a1)) {
							if (!s12p1.equals(sm2pn)) {
								if (!sm.equals(st2pt)) {
									if (!sm.equals(st)) {
										if (!sm.equals(st2a2)) {
											if (!sm.equals(st2a1)) {
												if (!sm.equals(sm2pn)) {
													if (!pt.equals(s12p1)) {
														if (!pt.equals(sm)) {
															if (!pt.equals(st2pt)) {
																if (!pt.equals(st)) {
																	if (!pt.equals(s1)) {
																		if (!pt.equals(st2a2)) {
																			if (!pt.equals(st2a1)) {
																				if (!pt.equals(sm2pn)) {
																					if (!st.equals(st2pt)) {
																						if (!st.equals(st2a2)) {
																							if (!st.equals(st2a1)) {
																								if (!p1.equals(s12p1)) {
																									if (!p1.equals(
																											sm)) {
																										if (!p1.equals(
																												pt)) {
																											if (!p1.equals(
																													st2pt)) {
																												if (!p1.equals(
																														st)) {
																													if (!p1.equals(
																															s1)) {
																														if (!p1.equals(
																																png)) {
																															if (!p1.equals(
																																	st2a2)) {
																																if (!p1.equals(
																																		st2a1)) {
																																	if (!p1.equals(
																																			sm2pn)) {
																																		if (!s1.equals(
																																				s12p1)) {
																																			if (!s1.equals(
																																					sm)) {
																																				if (!s1.equals(
																																						st2pt)) {
																																					if (!s1.equals(
																																							st)) {
																																						if (!s1.equals(
																																								st2a2)) {
																																							if (!s1.equals(
																																									st2a1)) {
																																								if (!s1.equals(
																																										sm2pn)) {
																																									if (!a1.equals(
																																											s12p1)) {
																																										if (!a1.equals(
																																												sm)) {
																																											if (!a1.equals(
																																													pt)) {
																																												if (!a1.equals(
																																														st2pt)) {
																																													if (!a1.equals(
																																															st)) {
																																														if (!a1.equals(
																																																p1)) {
																																															if (!a1.equals(
																																																	s1)) {
																																																if (!a1.equals(
																																																		png)) {
																																																	if (!a1.equals(
																																																			st2a2)) {
																																																		if (!a1.equals(
																																																				a2)) {
																																																			if (!a1.equals(
																																																					st2a1)) {
																																																				if (!a1.equals(
																																																						sm2pn)) {
																																																					if (!png.equals(
																																																							s12p1)) {
																																																						if (!png.equals(
																																																								sm)) {
																																																							if (!png.equals(
																																																									pt)) {
																																																								if (!png.equals(
																																																										st2pt)) {
																																																									if (!png.equals(
																																																											st)) {
																																																										if (!png.equals(
																																																												s1)) {
																																																											if (!png.equals(
																																																													st2a2)) {
																																																												if (!png.equals(
																																																														st2a1)) {
																																																													if (!png.equals(
																																																															sm2pn)) {
																																																														if (!st2a2
																																																																.equals(st2pt)) {
																																																															if (!a2.equals(
																																																																	s12p1)) {
																																																																if (!a2.equals(
																																																																		sm)) {
																																																																	if (!a2.equals(
																																																																			pt)) {
																																																																		if (!a2.equals(
																																																																				st2pt)) {
																																																																			if (!a2.equals(
																																																																					st)) {
																																																																				if (!a2.equals(
																																																																						p1)) {
																																																																					if (!a2.equals(
																																																																							s1)) {
																																																																						if (!a2.equals(
																																																																								png)) {
																																																																							if (!a2.equals(
																																																																									st2a2)) {
																																																																								if (!a2.equals(
																																																																										st2a1)) {
																																																																									if (!a2.equals(
																																																																											sm2pn)) {
																																																																										if (!st2a1
																																																																												.equals(st2pt)) {
																																																																											if (!st2a1
																																																																													.equals(st2a2)) {
																																																																												if (!sm2pn
																																																																														.equals(st2pt)) {
																																																																													if (!sm2pn
																																																																															.equals(st)) {
																																																																														if (!sm2pn
																																																																																.equals(st2a2)) {
																																																																															if (!sm2pn
																																																																																	.equals(st2a1)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		s12p1,
																																																																																		sm,
																																																																																		pt,
																																																																																		st2pt,
																																																																																		st,
																																																																																		p1,
																																																																																		s1,
																																																																																		a1,
																																																																																		png,
																																																																																		st2a2,
																																																																																		a2,
																																																																																		st2a1,
																																																																																		sm2pn };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_selftrans2arctransarc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject sm, EObject pt, EObject st2pt, EObject st, EObject p1, EObject s1,
			EObject a1, EObject png, EObject st2a2, EObject a2, EObject st2a1) {
		EMoflonEdge sm__st____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2pt__st____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__pt____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__p1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2pt__pt____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__pt____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a2__st____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a2__a2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__a2____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a1__a1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s1____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__p1____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st2a1__st____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__a1____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge st__s1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__pt____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "selftrans2arctransarc";
		String sm__st____transitions_name_prime = "transitions";
		String st2pt__st____source_name_prime = "source";
		String a1__pt____to_name_prime = "to";
		String a1__p1____from_name_prime = "from";
		String st2pt__pt____target_name_prime = "target";
		String png__pt____transitions_name_prime = "transitions";
		String st2a2__st____source_name_prime = "source";
		String st2a2__a2____target_name_prime = "target";
		String png__a2____arcs_name_prime = "arcs";
		String st2a1__a1____target_name_prime = "target";
		String st__s1____to_name_prime = "to";
		String a2__p1____to_name_prime = "to";
		String st2a1__st____source_name_prime = "source";
		String png__a1____arcs_name_prime = "arcs";
		String st__s1____from_name_prime = "from";
		String a2__pt____from_name_prime = "from";
		sm__st____transitions.setSrc(sm);
		sm__st____transitions.setTrg(st);
		ruleresult.getCreatedEdges().add(sm__st____transitions);
		st2pt__st____source.setSrc(st2pt);
		st2pt__st____source.setTrg(st);
		ruleresult.getCreatedEdges().add(st2pt__st____source);
		a1__pt____to.setSrc(a1);
		a1__pt____to.setTrg(pt);
		ruleresult.getTranslatedEdges().add(a1__pt____to);
		a1__p1____from.setSrc(a1);
		a1__p1____from.setTrg(p1);
		ruleresult.getTranslatedEdges().add(a1__p1____from);
		st2pt__pt____target.setSrc(st2pt);
		st2pt__pt____target.setTrg(pt);
		ruleresult.getCreatedEdges().add(st2pt__pt____target);
		png__pt____transitions.setSrc(png);
		png__pt____transitions.setTrg(pt);
		ruleresult.getTranslatedEdges().add(png__pt____transitions);
		st2a2__st____source.setSrc(st2a2);
		st2a2__st____source.setTrg(st);
		ruleresult.getCreatedEdges().add(st2a2__st____source);
		st2a2__a2____target.setSrc(st2a2);
		st2a2__a2____target.setTrg(a2);
		ruleresult.getCreatedEdges().add(st2a2__a2____target);
		png__a2____arcs.setSrc(png);
		png__a2____arcs.setTrg(a2);
		ruleresult.getTranslatedEdges().add(png__a2____arcs);
		st2a1__a1____target.setSrc(st2a1);
		st2a1__a1____target.setTrg(a1);
		ruleresult.getCreatedEdges().add(st2a1__a1____target);
		st__s1____to.setSrc(st);
		st__s1____to.setTrg(s1);
		ruleresult.getCreatedEdges().add(st__s1____to);
		a2__p1____to.setSrc(a2);
		a2__p1____to.setTrg(p1);
		ruleresult.getTranslatedEdges().add(a2__p1____to);
		st2a1__st____source.setSrc(st2a1);
		st2a1__st____source.setTrg(st);
		ruleresult.getCreatedEdges().add(st2a1__st____source);
		png__a1____arcs.setSrc(png);
		png__a1____arcs.setTrg(a1);
		ruleresult.getTranslatedEdges().add(png__a1____arcs);
		st__s1____from.setSrc(st);
		st__s1____from.setTrg(s1);
		ruleresult.getCreatedEdges().add(st__s1____from);
		a2__pt____from.setSrc(a2);
		a2__pt____from.setTrg(pt);
		ruleresult.getTranslatedEdges().add(a2__pt____from);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sm__st____transitions.setName(sm__st____transitions_name_prime);
		st2pt__st____source.setName(st2pt__st____source_name_prime);
		a1__pt____to.setName(a1__pt____to_name_prime);
		a1__p1____from.setName(a1__p1____from_name_prime);
		st2pt__pt____target.setName(st2pt__pt____target_name_prime);
		png__pt____transitions.setName(png__pt____transitions_name_prime);
		st2a2__st____source.setName(st2a2__st____source_name_prime);
		st2a2__a2____target.setName(st2a2__a2____target_name_prime);
		png__a2____arcs.setName(png__a2____arcs_name_prime);
		st2a1__a1____target.setName(st2a1__a1____target_name_prime);
		st__s1____to.setName(st__s1____to_name_prime);
		a2__p1____to.setName(a2__p1____to_name_prime);
		st2a1__st____source.setName(st2a1__st____source_name_prime);
		png__a1____arcs.setName(png__a1____arcs_name_prime);
		st__s1____from.setName(st__s1____from_name_prime);
		a2__pt____from.setName(a2__pt____from_name_prime);
		return new Object[] { ruleresult, sm, pt, st2pt, st, p1, s1, a1, png, st2a2, a2, st2a1, sm__st____transitions,
				st2pt__st____source, a1__pt____to, a1__p1____from, st2pt__pt____target, png__pt____transitions,
				st2a2__st____source, st2a2__a2____target, png__a2____arcs, st2a1__a1____target, st__s1____to,
				a2__p1____to, st2a1__st____source, png__a1____arcs, st__s1____from, a2__pt____from };
	}

	public static final void pattern_selftrans2arctransarc_11_5_registerobjects_expressionBBBBBBBBBBBBBBB(
			selftrans2arctransarc _this, PerformRuleResult ruleresult, EObject s12p1, EObject sm, EObject pt,
			EObject st2pt, EObject st, EObject p1, EObject s1, EObject a1, EObject png, EObject st2a2, EObject a2,
			EObject st2a1, EObject sm2pn) {
		_this.registerObjects_BWD(ruleresult, s12p1, sm, pt, st2pt, st, p1, s1, a1, png, st2a2, a2, st2a1, sm2pn);

	}

	public static final PerformRuleResult pattern_selftrans2arctransarc_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_12_1_preparereturnvalue_bindingFB(
			selftrans2arctransarc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_12_1_preparereturnvalue_blackFBB(EClass eClass,
			selftrans2arctransarc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_12_1_preparereturnvalue_bindingAndBlackFFB(
			selftrans2arctransarc _this) {
		Object[] result_pattern_selftrans2arctransarc_12_1_preparereturnvalue_binding = pattern_selftrans2arctransarc_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_selftrans2arctransarc_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_selftrans2arctransarc_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_selftrans2arctransarc_12_1_preparereturnvalue_black = pattern_selftrans2arctransarc_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_selftrans2arctransarc_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_selftrans2arctransarc_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "selftrans2arctransarc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_selftrans2arctransarc_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("pt");
		EObject _localVariable_1 = match.getObject("p1");
		EObject _localVariable_2 = match.getObject("a1");
		EObject _localVariable_3 = match.getObject("png");
		EObject _localVariable_4 = match.getObject("a2");
		EObject tmpPt = _localVariable_0;
		EObject tmpP1 = _localVariable_1;
		EObject tmpA1 = _localVariable_2;
		EObject tmpPng = _localVariable_3;
		EObject tmpA2 = _localVariable_4;
		if (tmpPt instanceof petrinet.Transition) {
			petrinet.Transition pt = (petrinet.Transition) tmpPt;
			if (tmpP1 instanceof Place) {
				Place p1 = (Place) tmpP1;
				if (tmpA1 instanceof Arc) {
					Arc a1 = (Arc) tmpA1;
					if (tmpPng instanceof PNGraph) {
						PNGraph png = (PNGraph) tmpPng;
						if (tmpA2 instanceof Arc) {
							Arc a2 = (Arc) tmpA2;
							return new Object[] { pt, p1, a1, png, a2, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_selftrans2arctransarc_12_2_corematch_blackFFBBFBBBFB(
			petrinet.Transition pt, Place p1, Arc a1, PNGraph png, Arc a2, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a1.equals(a2)) {
			for (S2P s12p1 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p1, S2P.class,
					"target")) {
				State s1 = s12p1.getSource();
				if (s1 != null) {
					for (SM2PN sm2pn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(png,
							SM2PN.class, "target")) {
						SM sm = sm2pn.getSource();
						if (sm != null) {
							_result.add(new Object[] { s12p1, sm, pt, p1, s1, a1, png, a2, sm2pn, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_selftrans2arctransarc_12_3_findcontext_blackBBBBBBBBB(S2P s12p1,
			SM sm, petrinet.Transition pt, Place p1, State s1, Arc a1, PNGraph png, Arc a2, SM2PN sm2pn) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a1.equals(a2)) {
			if (s1.equals(s12p1.getSource())) {
				if (pt.equals(a1.getTo())) {
					if (p1.equals(a1.getFrom())) {
						if (p1.equals(s12p1.getTarget())) {
							if (png.getTransitions().contains(pt)) {
								if (png.getArcs().contains(a2)) {
									if (p1.equals(a2.getTo())) {
										if (png.getArcs().contains(a1)) {
											if (png.equals(sm2pn.getTarget())) {
												if (pt.equals(a2.getFrom())) {
													if (sm.equals(sm2pn.getSource())) {
														_result.add(new Object[] { s12p1, sm, pt, p1, s1, a1, png, a2,
																sm2pn });
													}
												}
											}
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

	public static final Object[] pattern_selftrans2arctransarc_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(S2P s12p1,
			SM sm, petrinet.Transition pt, Place p1, State s1, Arc a1, PNGraph png, Arc a2, SM2PN sm2pn) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge s12p1__s1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__pt____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a1__p1____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s12p1__p1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__pt____transitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__a2____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__p1____to = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__a1____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm2pn__png____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2__pt____from = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm2pn__sm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String s12p1__s1____source_name_prime = "source";
		String a1__pt____to_name_prime = "to";
		String a1__p1____from_name_prime = "from";
		String s12p1__p1____target_name_prime = "target";
		String png__pt____transitions_name_prime = "transitions";
		String png__a2____arcs_name_prime = "arcs";
		String a2__p1____to_name_prime = "to";
		String png__a1____arcs_name_prime = "arcs";
		String sm2pn__png____target_name_prime = "target";
		String a2__pt____from_name_prime = "from";
		String sm2pn__sm____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(s12p1);
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(pt);
		isApplicableMatch.getAllContextElements().add(p1);
		isApplicableMatch.getAllContextElements().add(s1);
		isApplicableMatch.getAllContextElements().add(a1);
		isApplicableMatch.getAllContextElements().add(png);
		isApplicableMatch.getAllContextElements().add(a2);
		isApplicableMatch.getAllContextElements().add(sm2pn);
		s12p1__s1____source.setSrc(s12p1);
		s12p1__s1____source.setTrg(s1);
		isApplicableMatch.getAllContextElements().add(s12p1__s1____source);
		a1__pt____to.setSrc(a1);
		a1__pt____to.setTrg(pt);
		isApplicableMatch.getAllContextElements().add(a1__pt____to);
		a1__p1____from.setSrc(a1);
		a1__p1____from.setTrg(p1);
		isApplicableMatch.getAllContextElements().add(a1__p1____from);
		s12p1__p1____target.setSrc(s12p1);
		s12p1__p1____target.setTrg(p1);
		isApplicableMatch.getAllContextElements().add(s12p1__p1____target);
		png__pt____transitions.setSrc(png);
		png__pt____transitions.setTrg(pt);
		isApplicableMatch.getAllContextElements().add(png__pt____transitions);
		png__a2____arcs.setSrc(png);
		png__a2____arcs.setTrg(a2);
		isApplicableMatch.getAllContextElements().add(png__a2____arcs);
		a2__p1____to.setSrc(a2);
		a2__p1____to.setTrg(p1);
		isApplicableMatch.getAllContextElements().add(a2__p1____to);
		png__a1____arcs.setSrc(png);
		png__a1____arcs.setTrg(a1);
		isApplicableMatch.getAllContextElements().add(png__a1____arcs);
		sm2pn__png____target.setSrc(sm2pn);
		sm2pn__png____target.setTrg(png);
		isApplicableMatch.getAllContextElements().add(sm2pn__png____target);
		a2__pt____from.setSrc(a2);
		a2__pt____from.setTrg(pt);
		isApplicableMatch.getAllContextElements().add(a2__pt____from);
		sm2pn__sm____source.setSrc(sm2pn);
		sm2pn__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(sm2pn__sm____source);
		s12p1__s1____source.setName(s12p1__s1____source_name_prime);
		a1__pt____to.setName(a1__pt____to_name_prime);
		a1__p1____from.setName(a1__p1____from_name_prime);
		s12p1__p1____target.setName(s12p1__p1____target_name_prime);
		png__pt____transitions.setName(png__pt____transitions_name_prime);
		png__a2____arcs.setName(png__a2____arcs_name_prime);
		a2__p1____to.setName(a2__p1____to_name_prime);
		png__a1____arcs.setName(png__a1____arcs_name_prime);
		sm2pn__png____target.setName(sm2pn__png____target_name_prime);
		a2__pt____from.setName(a2__pt____from_name_prime);
		sm2pn__sm____source.setName(sm2pn__sm____source_name_prime);
		return new Object[] { s12p1, sm, pt, p1, s1, a1, png, a2, sm2pn, isApplicableMatch, s12p1__s1____source,
				a1__pt____to, a1__p1____from, s12p1__p1____target, png__pt____transitions, png__a2____arcs,
				a2__p1____to, png__a1____arcs, sm2pn__png____target, a2__pt____from, sm2pn__sm____source };
	}

	public static final Object[] pattern_selftrans2arctransarc_12_4_solveCSP_bindingFBBBBBBBBBBB(
			selftrans2arctransarc _this, IsApplicableMatch isApplicableMatch, S2P s12p1, SM sm, petrinet.Transition pt,
			Place p1, State s1, Arc a1, PNGraph png, Arc a2, SM2PN sm2pn) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, s12p1, sm, pt, p1, s1, a1, png, a2,
				sm2pn);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s12p1, sm, pt, p1, s1, a1, png, a2, sm2pn };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_selftrans2arctransarc_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			selftrans2arctransarc _this, IsApplicableMatch isApplicableMatch, S2P s12p1, SM sm, petrinet.Transition pt,
			Place p1, State s1, Arc a1, PNGraph png, Arc a2, SM2PN sm2pn) {
		Object[] result_pattern_selftrans2arctransarc_12_4_solveCSP_binding = pattern_selftrans2arctransarc_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, s12p1, sm, pt, p1, s1, a1, png, a2, sm2pn);
		if (result_pattern_selftrans2arctransarc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_selftrans2arctransarc_12_4_solveCSP_binding[0];

			Object[] result_pattern_selftrans2arctransarc_12_4_solveCSP_black = pattern_selftrans2arctransarc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_selftrans2arctransarc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s12p1, sm, pt, p1, s1, a1, png, a2, sm2pn };
			}
		}
		return null;
	}

	public static final boolean pattern_selftrans2arctransarc_12_5_checkCSP_expressionFBB(selftrans2arctransarc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_selftrans2arctransarc_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "selftrans2arctransarc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_selftrans2arctransarc_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_20_1_preparereturnvalue_bindingFB(
			selftrans2arctransarc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			selftrans2arctransarc _this) {
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

	public static final Object[] pattern_selftrans2arctransarc_20_1_preparereturnvalue_bindingAndBlackFFBF(
			selftrans2arctransarc _this) {
		Object[] result_pattern_selftrans2arctransarc_20_1_preparereturnvalue_binding = pattern_selftrans2arctransarc_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_selftrans2arctransarc_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_selftrans2arctransarc_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_selftrans2arctransarc_20_1_preparereturnvalue_black = pattern_selftrans2arctransarc_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_selftrans2arctransarc_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_selftrans2arctransarc_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_selftrans2arctransarc_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_selftrans2arctransarc_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_to) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpA1 = _edge_to.getSrc();
		if (tmpA1 instanceof Arc) {
			Arc a1 = (Arc) tmpA1;
			EObject tmpPt = _edge_to.getTrg();
			if (tmpPt instanceof petrinet.Transition) {
				petrinet.Transition pt = (petrinet.Transition) tmpPt;
				if (pt.equals(a1.getTo())) {
					Node tmpP1 = a1.getFrom();
					if (tmpP1 instanceof Place) {
						Place p1 = (Place) tmpP1;
						for (PNGraph png : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a1,
								PNGraph.class, "arcs")) {
							if (png.getTransitions().contains(pt)) {
								for (Arc a2 : png.getArcs()) {
									if (!a1.equals(a2)) {
										if (p1.equals(a2.getTo())) {
											if (pt.equals(a2.getFrom())) {
												_result.add(new Object[] { pt, p1, a1, png, a2, _edge_to });
											}
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

	public static final Object[] pattern_selftrans2arctransarc_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_selftrans2arctransarc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			selftrans2arctransarc _this, Match match, petrinet.Transition pt, Place p1, Arc a1, PNGraph png, Arc a2) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pt, p1, a1, png, a2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_selftrans2arctransarc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			selftrans2arctransarc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_selftrans2arctransarc_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_21_1_preparereturnvalue_bindingFB(
			selftrans2arctransarc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			selftrans2arctransarc _this) {
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

	public static final Object[] pattern_selftrans2arctransarc_21_1_preparereturnvalue_bindingAndBlackFFBF(
			selftrans2arctransarc _this) {
		Object[] result_pattern_selftrans2arctransarc_21_1_preparereturnvalue_binding = pattern_selftrans2arctransarc_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_selftrans2arctransarc_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_selftrans2arctransarc_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_selftrans2arctransarc_21_1_preparereturnvalue_black = pattern_selftrans2arctransarc_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_selftrans2arctransarc_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_selftrans2arctransarc_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_selftrans2arctransarc_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_selftrans2arctransarc_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_transitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSm = _edge_transitions.getSrc();
		if (tmpSm instanceof SM) {
			SM sm = (SM) tmpSm;
			EObject tmpSt = _edge_transitions.getTrg();
			if (tmpSt instanceof Transition) {
				Transition st = (Transition) tmpSt;
				if (sm.getTransitions().contains(st)) {
					State s1 = st.getTo();
					if (s1 != null) {
						if (s1.equals(st.getFrom())) {
							_result.add(new Object[] { sm, st, s1, _edge_transitions });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_selftrans2arctransarc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			selftrans2arctransarc _this, Match match, SM sm, Transition st, State s1) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, sm, st, s1);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_selftrans2arctransarc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			selftrans2arctransarc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_selftrans2arctransarc_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_24_1_prepare_blackB(selftrans2arctransarc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_selftrans2arctransarc_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("sm");
		EObject _localVariable_1 = targetMatch.getObject("pt");
		EObject _localVariable_2 = sourceMatch.getObject("st");
		EObject _localVariable_3 = targetMatch.getObject("p1");
		EObject _localVariable_4 = sourceMatch.getObject("s1");
		EObject _localVariable_5 = targetMatch.getObject("a1");
		EObject _localVariable_6 = targetMatch.getObject("png");
		EObject _localVariable_7 = targetMatch.getObject("a2");
		EObject tmpSm = _localVariable_0;
		EObject tmpPt = _localVariable_1;
		EObject tmpSt = _localVariable_2;
		EObject tmpP1 = _localVariable_3;
		EObject tmpS1 = _localVariable_4;
		EObject tmpA1 = _localVariable_5;
		EObject tmpPng = _localVariable_6;
		EObject tmpA2 = _localVariable_7;
		if (tmpSm instanceof SM) {
			SM sm = (SM) tmpSm;
			if (tmpPt instanceof petrinet.Transition) {
				petrinet.Transition pt = (petrinet.Transition) tmpPt;
				if (tmpSt instanceof Transition) {
					Transition st = (Transition) tmpSt;
					if (tmpP1 instanceof Place) {
						Place p1 = (Place) tmpP1;
						if (tmpS1 instanceof State) {
							State s1 = (State) tmpS1;
							if (tmpA1 instanceof Arc) {
								Arc a1 = (Arc) tmpA1;
								if (tmpPng instanceof PNGraph) {
									PNGraph png = (PNGraph) tmpPng;
									if (tmpA2 instanceof Arc) {
										Arc a2 = (Arc) tmpA2;
										return new Object[] { sm, pt, st, p1, s1, a1, png, a2, sourceMatch,
												targetMatch };
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

	public static final Object[] pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(SM sm,
			petrinet.Transition pt, Transition st, Place p1, State s1, Arc a1, PNGraph png, Arc a2, Match sourceMatch,
			Match targetMatch) {
		if (!a1.equals(a2)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { sm, pt, st, p1, s1, a1, png, a2, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_binding = pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_binding != null) {
			SM sm = (SM) result_pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_binding[0];
			petrinet.Transition pt = (petrinet.Transition) result_pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_binding[1];
			Transition st = (Transition) result_pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_binding[2];
			Place p1 = (Place) result_pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_binding[3];
			State s1 = (State) result_pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_binding[4];
			Arc a1 = (Arc) result_pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_binding[5];
			PNGraph png = (PNGraph) result_pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_binding[6];
			Arc a2 = (Arc) result_pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_black = pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					sm, pt, st, p1, s1, a1, png, a2, sourceMatch, targetMatch);
			if (result_pattern_selftrans2arctransarc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { sm, pt, st, p1, s1, a1, png, a2, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_24_3_solvecsp_bindingFBBBBBBBBBBB(
			selftrans2arctransarc _this, SM sm, petrinet.Transition pt, Transition st, Place p1, State s1, Arc a1,
			PNGraph png, Arc a2, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(sm, pt, st, p1, s1, a1, png, a2, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, sm, pt, st, p1, s1, a1, png, a2, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_selftrans2arctransarc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			selftrans2arctransarc _this, SM sm, petrinet.Transition pt, Transition st, Place p1, State s1, Arc a1,
			PNGraph png, Arc a2, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_selftrans2arctransarc_24_3_solvecsp_binding = pattern_selftrans2arctransarc_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, sm, pt, st, p1, s1, a1, png, a2, sourceMatch, targetMatch);
		if (result_pattern_selftrans2arctransarc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_selftrans2arctransarc_24_3_solvecsp_binding[0];

			Object[] result_pattern_selftrans2arctransarc_24_3_solvecsp_black = pattern_selftrans2arctransarc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_selftrans2arctransarc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, sm, pt, st, p1, s1, a1, png, a2, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_selftrans2arctransarc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_selftrans2arctransarc_24_5_matchcorrcontext_blackFBBBBFBB(SM sm,
			Place p1, State s1, PNGraph png, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2P s12p1 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s1, S2P.class,
					"source")) {
				if (p1.equals(s12p1.getTarget())) {
					for (SM2PN sm2pn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(png,
							SM2PN.class, "target")) {
						if (sm.equals(sm2pn.getSource())) {
							_result.add(new Object[] { s12p1, sm, p1, s1, png, sm2pn, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_24_5_matchcorrcontext_greenBBBBF(S2P s12p1, SM2PN sm2pn,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "selftrans2arctransarc";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(s12p1);
		ccMatch.getAllContextElements().add(sm2pn);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { s12p1, sm2pn, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_selftrans2arctransarc_24_6_createcorrespondence_blackBBBBBBBBB(SM sm,
			petrinet.Transition pt, Transition st, Place p1, State s1, Arc a1, PNGraph png, Arc a2, CCMatch ccMatch) {
		if (!a1.equals(a2)) {
			return new Object[] { sm, pt, st, p1, s1, a1, png, a2, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_24_6_createcorrespondence_greenBFBBFBFB(
			petrinet.Transition pt, Transition st, Arc a1, Arc a2, CCMatch ccMatch) {
		T2T st2pt = Statemachine2petrinetFactory.eINSTANCE.createT2T();
		T2A st2a2 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		T2A st2a1 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		st2pt.setSource(st);
		st2pt.setTarget(pt);
		ccMatch.getCreateCorr().add(st2pt);
		st2a2.setSource(st);
		st2a2.setTarget(a2);
		ccMatch.getCreateCorr().add(st2a2);
		st2a1.setTarget(a1);
		st2a1.setSource(st);
		ccMatch.getCreateCorr().add(st2a1);
		return new Object[] { pt, st2pt, st, a1, st2a2, a2, st2a1, ccMatch };
	}

	public static final Object[] pattern_selftrans2arctransarc_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_selftrans2arctransarc_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "selftrans2arctransarc";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_selftrans2arctransarc_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_27_1_matchtggpattern_blackBBB(SM sm, Transition st,
			State s1) {
		if (sm.getTransitions().contains(st)) {
			if (s1.equals(st.getTo())) {
				if (s1.equals(st.getFrom())) {
					return new Object[] { sm, st, s1 };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_selftrans2arctransarc_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_selftrans2arctransarc_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_28_1_matchtggpattern_blackBBBBB(petrinet.Transition pt,
			Place p1, Arc a1, PNGraph png, Arc a2) {
		if (!a1.equals(a2)) {
			if (pt.equals(a1.getTo())) {
				if (p1.equals(a1.getFrom())) {
					if (png.getTransitions().contains(pt)) {
						if (png.getArcs().contains(a2)) {
							if (p1.equals(a2.getTo())) {
								if (png.getArcs().contains(a1)) {
									if (pt.equals(a2.getFrom())) {
										return new Object[] { pt, p1, a1, png, a2 };
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

	public static final boolean pattern_selftrans2arctransarc_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_selftrans2arctransarc_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_29_1_createresult_blackB(selftrans2arctransarc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_selftrans2arctransarc_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_selftrans2arctransarc_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2P s12p1) {
		if (ruleResult.getCorrObjects().contains(s12p1)) {
			return new Object[] { ruleResult, s12p1 };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, State s1) {
		if (ruleResult.getSourceObjects().contains(s1)) {
			return new Object[] { ruleResult, s1 };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Place p1) {
		if (ruleResult.getTargetObjects().contains(p1)) {
			return new Object[] { ruleResult, p1 };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, SM sm) {
		if (ruleResult.getSourceObjects().contains(sm)) {
			return new Object[] { ruleResult, sm };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, SM2PN sm2pn) {
		if (ruleResult.getCorrObjects().contains(sm2pn)) {
			return new Object[] { ruleResult, sm2pn };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, PNGraph png) {
		if (ruleResult.getTargetObjects().contains(png)) {
			return new Object[] { ruleResult, png };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_selftrans2arctransarc_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList s12p1List : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList sm2pnList : ruleEntryContainer.getRuleEntryList()) {
				if (!s12p1List.equals(sm2pnList)) {
					for (EObject tmpS12p1 : s12p1List.getEntryObjects()) {
						if (tmpS12p1 instanceof S2P) {
							S2P s12p1 = (S2P) tmpS12p1;
							State s1 = s12p1.getSource();
							if (s1 != null) {
								Place p1 = s12p1.getTarget();
								if (p1 != null) {
									if (pattern_selftrans2arctransarc_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											s12p1) == null) {
										if (pattern_selftrans2arctransarc_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, s1) == null) {
											if (pattern_selftrans2arctransarc_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, p1) == null) {
												for (EObject tmpSm2pn : sm2pnList.getEntryObjects()) {
													if (tmpSm2pn instanceof SM2PN) {
														SM2PN sm2pn = (SM2PN) tmpSm2pn;
														SM sm = sm2pn.getSource();
														if (sm != null) {
															PNGraph png = sm2pn.getTarget();
															if (png != null) {
																if (pattern_selftrans2arctransarc_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, sm2pn) == null) {
																	if (pattern_selftrans2arctransarc_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, sm) == null) {
																		if (pattern_selftrans2arctransarc_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, png) == null) {
																			_result.add(new Object[] { s12p1List, s12p1,
																					s1, p1, sm2pnList, sm, sm2pn, png,
																					ruleEntryContainer, ruleResult });
																		}
																	}
																}
															}

														}

													}
												}
											}
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

	public static final Object[] pattern_selftrans2arctransarc_29_3_solveCSP_bindingFBBBBBBBBB(
			selftrans2arctransarc _this, IsApplicableMatch isApplicableMatch, S2P s12p1, SM sm, Place p1, State s1,
			PNGraph png, SM2PN sm2pn, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, s12p1, sm, p1, s1, png, sm2pn,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s12p1, sm, p1, s1, png, sm2pn, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_selftrans2arctransarc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_selftrans2arctransarc_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			selftrans2arctransarc _this, IsApplicableMatch isApplicableMatch, S2P s12p1, SM sm, Place p1, State s1,
			PNGraph png, SM2PN sm2pn, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_selftrans2arctransarc_29_3_solveCSP_binding = pattern_selftrans2arctransarc_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, s12p1, sm, p1, s1, png, sm2pn, ruleResult);
		if (result_pattern_selftrans2arctransarc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_selftrans2arctransarc_29_3_solveCSP_binding[0];

			Object[] result_pattern_selftrans2arctransarc_29_3_solveCSP_black = pattern_selftrans2arctransarc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_selftrans2arctransarc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s12p1, sm, p1, s1, png, sm2pn, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_selftrans2arctransarc_29_4_checkCSP_expressionFBB(selftrans2arctransarc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selftrans2arctransarc_29_5_checknacs_blackBBBBBB(S2P s12p1, SM sm, Place p1,
			State s1, PNGraph png, SM2PN sm2pn) {
		return new Object[] { s12p1, sm, p1, s1, png, sm2pn };
	}

	public static final Object[] pattern_selftrans2arctransarc_29_6_perform_blackBBBBBBB(S2P s12p1, SM sm, Place p1,
			State s1, PNGraph png, SM2PN sm2pn, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { s12p1, sm, p1, s1, png, sm2pn, ruleResult };
	}

	public static final Object[] pattern_selftrans2arctransarc_29_6_perform_greenBFFFBBFBFFFB(SM sm, Place p1, State s1,
			PNGraph png, ModelgeneratorRuleResult ruleResult) {
		petrinet.Transition pt = PetrinetFactory.eINSTANCE.createTransition();
		T2T st2pt = Statemachine2petrinetFactory.eINSTANCE.createT2T();
		Transition st = StatemachineFactory.eINSTANCE.createTransition();
		Arc a1 = PetrinetFactory.eINSTANCE.createArc();
		T2A st2a2 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		Arc a2 = PetrinetFactory.eINSTANCE.createArc();
		T2A st2a1 = Statemachine2petrinetFactory.eINSTANCE.createT2A();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		png.getTransitions().add(pt);
		ruleResult.getTargetObjects().add(pt);
		st2pt.setTarget(pt);
		ruleResult.getCorrObjects().add(st2pt);
		sm.getTransitions().add(st);
		st2pt.setSource(st);
		st.setTo(s1);
		st.setFrom(s1);
		ruleResult.getSourceObjects().add(st);
		a1.setTo(pt);
		a1.setFrom(p1);
		png.getArcs().add(a1);
		ruleResult.getTargetObjects().add(a1);
		st2a2.setSource(st);
		ruleResult.getCorrObjects().add(st2a2);
		st2a2.setTarget(a2);
		png.getArcs().add(a2);
		a2.setTo(p1);
		a2.setFrom(pt);
		ruleResult.getTargetObjects().add(a2);
		st2a1.setTarget(a1);
		st2a1.setSource(st);
		ruleResult.getCorrObjects().add(st2a1);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { sm, pt, st2pt, st, p1, s1, a1, png, st2a2, a2, st2a1, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_selftrans2arctransarc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //selftrans2arctransarcImpl
