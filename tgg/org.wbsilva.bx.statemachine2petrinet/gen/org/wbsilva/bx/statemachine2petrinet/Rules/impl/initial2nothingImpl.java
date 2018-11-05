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
import org.wbsilva.bx.statemachine2petrinet.Rules.initial2nothing;

import org.wbsilva.bx.statemachine2petrinet.S2P;
import org.wbsilva.bx.statemachine2petrinet.SM2PN;

import petrinet.PNGraph;
import petrinet.Place;

import statemachine.SM;
import statemachine.State;
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
 * An implementation of the model object '<em><b>initial2nothing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class initial2nothingImpl extends AbstractRuleImpl implements initial2nothing {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected initial2nothingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getinitial2nothing();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, State s, SM sm) {

		Object[] result1_black = initial2nothingImpl.pattern_initial2nothing_0_1_initialbindings_blackBBBB(this, match,
				s, sm);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[s] = " + s + ", " + "[sm] = " + sm + ".");
		}

		Object[] result2_bindingAndBlack = initial2nothingImpl
				.pattern_initial2nothing_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, s, sm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[s] = " + s + ", " + "[sm] = " + sm + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (initial2nothingImpl.pattern_initial2nothing_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = initial2nothingImpl
					.pattern_initial2nothing_0_4_collectelementstobetranslated_blackBBB(match, s, sm);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[s] = " + s + ", " + "[sm] = " + sm + ".");
			}
			initial2nothingImpl.pattern_initial2nothing_0_4_collectelementstobetranslated_greenBBBF(match, s, sm);
			//nothing EMoflonEdge sm__s____initial = (EMoflonEdge) result4_green[3];

			Object[] result5_black = initial2nothingImpl
					.pattern_initial2nothing_0_5_collectcontextelements_blackBBB(match, s, sm);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[s] = " + s + ", " + "[sm] = " + sm + ".");
			}
			initial2nothingImpl.pattern_initial2nothing_0_5_collectcontextelements_greenBBBF(match, s, sm);
			//nothing EMoflonEdge sm__s____states = (EMoflonEdge) result5_green[3];

			// 
			initial2nothingImpl.pattern_initial2nothing_0_6_registerobjectstomatch_expressionBBBB(this, match, s, sm);
			return initial2nothingImpl.pattern_initial2nothing_0_7_expressionF();
		} else {
			return initial2nothingImpl.pattern_initial2nothing_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = initial2nothingImpl
				.pattern_initial2nothing_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		State s = (State) result1_bindingAndBlack[0];
		SM sm = (SM) result1_bindingAndBlack[1];
		SM2PN sm2pn = (SM2PN) result1_bindingAndBlack[2];
		PNGraph png = (PNGraph) result1_bindingAndBlack[3];
		Place p = (Place) result1_bindingAndBlack[4];
		S2P s2p = (S2P) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];

		Object[] result2_green = initial2nothingImpl.pattern_initial2nothing_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = initial2nothingImpl
				.pattern_initial2nothing_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, s, sm, sm2pn, png, p, s2p);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[s] = " + s + ", " + "[sm] = " + sm + ", " + "[sm2pn] = " + sm2pn + ", " + "[png] = "
					+ png + ", " + "[p] = " + p + ", " + "[s2p] = " + s2p + ".");
		}
		initial2nothingImpl.pattern_initial2nothing_1_3_bookkeepingforedges_greenBBBF(ruleresult, s, sm);
		//nothing EMoflonEdge sm__s____initial = (EMoflonEdge) result3_green[3];

		// 
		// 
		initial2nothingImpl.pattern_initial2nothing_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, s, sm,
				sm2pn, png, p, s2p);
		return initial2nothingImpl.pattern_initial2nothing_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = initial2nothingImpl
				.pattern_initial2nothing_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = initial2nothingImpl
				.pattern_initial2nothing_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = initial2nothingImpl.pattern_initial2nothing_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		State s = (State) result2_binding[0];
		SM sm = (SM) result2_binding[1];
		for (Object[] result2_black : initial2nothingImpl.pattern_initial2nothing_2_2_corematch_blackBBFFFFB(s, sm,
				match)) {
			SM2PN sm2pn = (SM2PN) result2_black[2];
			PNGraph png = (PNGraph) result2_black[3];
			Place p = (Place) result2_black[4];
			S2P s2p = (S2P) result2_black[5];
			// ForEach 
			for (Object[] result3_black : initial2nothingImpl.pattern_initial2nothing_2_3_findcontext_blackBBBBBB(s, sm,
					sm2pn, png, p, s2p)) {
				Object[] result3_green = initial2nothingImpl
						.pattern_initial2nothing_2_3_findcontext_greenBBBBBBFFFFFFFF(s, sm, sm2pn, png, p, s2p);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge sm2pn__sm____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge png__p____places = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge sm2pn__png____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge sm__s____initial = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge sm__s____states = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge s2p__p____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge s2p__s____source = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = initial2nothingImpl
						.pattern_initial2nothing_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, s, sm,
								sm2pn, png, p, s2p);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s] = " + s + ", " + "[sm] = " + sm
							+ ", " + "[sm2pn] = " + sm2pn + ", " + "[png] = " + png + ", " + "[p] = " + p + ", "
							+ "[s2p] = " + s2p + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (initial2nothingImpl.pattern_initial2nothing_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = initial2nothingImpl
							.pattern_initial2nothing_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					initial2nothingImpl.pattern_initial2nothing_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return initial2nothingImpl.pattern_initial2nothing_2_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, State s, SM sm, SM2PN sm2pn, PNGraph png,
			Place p, S2P s2p) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("sm2pn", sm2pn);
		isApplicableMatch.registerObject("png", png);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("s2p", s2p);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject s, EObject sm, EObject sm2pn, EObject png,
			EObject p, EObject s2p) {
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("sm2pn", sm2pn);
		ruleresult.registerObject("png", png);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("s2p", s2p);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, PNGraph png, Place p) {

		Object[] result1_black = initial2nothingImpl.pattern_initial2nothing_10_1_initialbindings_blackBBBB(this, match,
				png, p);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[png] = " + png + ", " + "[p] = " + p + ".");
		}

		Object[] result2_bindingAndBlack = initial2nothingImpl
				.pattern_initial2nothing_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, png, p);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[png] = " + png + ", " + "[p] = " + p + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (initial2nothingImpl.pattern_initial2nothing_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = initial2nothingImpl
					.pattern_initial2nothing_10_4_collectelementstobetranslated_blackBBB(match, png, p);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[png] = " + png + ", " + "[p] = " + p + ".");
			}

			Object[] result5_black = initial2nothingImpl
					.pattern_initial2nothing_10_5_collectcontextelements_blackBBB(match, png, p);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[png] = " + png + ", " + "[p] = " + p + ".");
			}
			initial2nothingImpl.pattern_initial2nothing_10_5_collectcontextelements_greenBBBF(match, png, p);
			//nothing EMoflonEdge png__p____places = (EMoflonEdge) result5_green[3];

			// 
			initial2nothingImpl.pattern_initial2nothing_10_6_registerobjectstomatch_expressionBBBB(this, match, png, p);
			return initial2nothingImpl.pattern_initial2nothing_10_7_expressionF();
		} else {
			return initial2nothingImpl.pattern_initial2nothing_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, PNGraph png, Place p) {
		match.registerObject("png", png);
		match.registerObject("p", p);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, PNGraph png, Place p) {// Create CSP
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
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_PNGraph_0(PNGraph png) {

		Object[] result1_bindingAndBlack = initial2nothingImpl
				.pattern_initial2nothing_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = initial2nothingImpl.pattern_initial2nothing_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : initial2nothingImpl
				.pattern_initial2nothing_17_2_testcorematchandDECs_blackBF(png)) {
			Place p = (Place) result2_black[1];
			Object[] result2_green = initial2nothingImpl
					.pattern_initial2nothing_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (initial2nothingImpl
					.pattern_initial2nothing_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							png, p)) {
				// 
				if (initial2nothingImpl
						.pattern_initial2nothing_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = initial2nothingImpl
							.pattern_initial2nothing_17_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					initial2nothingImpl.pattern_initial2nothing_17_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return initial2nothingImpl.pattern_initial2nothing_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_55(EMoflonEdge _edge_initial) {

		Object[] result1_bindingAndBlack = initial2nothingImpl
				.pattern_initial2nothing_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = initial2nothingImpl.pattern_initial2nothing_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : initial2nothingImpl
				.pattern_initial2nothing_18_2_testcorematchandDECs_blackFFB(_edge_initial)) {
			State s = (State) result2_black[0];
			SM sm = (SM) result2_black[1];
			Object[] result2_green = initial2nothingImpl
					.pattern_initial2nothing_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (initial2nothingImpl
					.pattern_initial2nothing_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							s, sm)) {
				// 
				if (initial2nothingImpl
						.pattern_initial2nothing_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = initial2nothingImpl
							.pattern_initial2nothing_18_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					initial2nothingImpl.pattern_initial2nothing_18_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return initial2nothingImpl.pattern_initial2nothing_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("initial2nothing");
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
		ruleResult.setRule("initial2nothing");
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

		Object[] result1_black = initial2nothingImpl.pattern_initial2nothing_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = initial2nothingImpl.pattern_initial2nothing_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = initial2nothingImpl
				.pattern_initial2nothing_21_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		State s = (State) result2_bindingAndBlack[0];
		SM sm = (SM) result2_bindingAndBlack[1];
		PNGraph png = (PNGraph) result2_bindingAndBlack[2];
		Place p = (Place) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = initial2nothingImpl
				.pattern_initial2nothing_21_3_solvecsp_bindingAndBlackFBBBBBBB(this, s, sm, png, p, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[s] = " + s + ", " + "[sm] = " + sm + ", " + "[png] = " + png + ", " + "[p] = " + p + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (initial2nothingImpl.pattern_initial2nothing_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : initial2nothingImpl
					.pattern_initial2nothing_21_5_matchcorrcontext_blackBBFBBFBB(s, sm, png, p, sourceMatch,
							targetMatch)) {
				SM2PN sm2pn = (SM2PN) result5_black[2];
				S2P s2p = (S2P) result5_black[5];
				Object[] result5_green = initial2nothingImpl
						.pattern_initial2nothing_21_5_matchcorrcontext_greenBBBBF(sm2pn, s2p, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = initial2nothingImpl
						.pattern_initial2nothing_21_6_createcorrespondence_blackBBBBB(s, sm, png, p, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[s] = " + s + ", " + "[sm] = " + sm + ", "
									+ "[png] = " + png + ", " + "[p] = " + p + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = initial2nothingImpl
						.pattern_initial2nothing_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				initial2nothingImpl.pattern_initial2nothing_21_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return initial2nothingImpl.pattern_initial2nothing_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(State s, SM sm, PNGraph png, Place p, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(State s, SM sm) {// 
		Object[] result1_black = initial2nothingImpl.pattern_initial2nothing_24_1_matchtggpattern_blackBB(s, sm);
		if (result1_black != null) {
			return initial2nothingImpl.pattern_initial2nothing_24_2_expressionF();
		} else {
			return initial2nothingImpl.pattern_initial2nothing_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(PNGraph png, Place p) {// 
		Object[] result1_black = initial2nothingImpl.pattern_initial2nothing_25_1_matchtggpattern_blackBB(png, p);
		if (result1_black != null) {
			return initial2nothingImpl.pattern_initial2nothing_25_2_expressionF();
		} else {
			return initial2nothingImpl.pattern_initial2nothing_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, SM2PN sm2pnParameter) {

		Object[] result1_black = initial2nothingImpl.pattern_initial2nothing_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = initial2nothingImpl.pattern_initial2nothing_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : initial2nothingImpl
				.pattern_initial2nothing_26_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList sm2pnList = (RuleEntryList) result2_black[0];
			State s = (State) result2_black[1];
			SM sm = (SM) result2_black[2];
			SM2PN sm2pn = (SM2PN) result2_black[3];
			PNGraph png = (PNGraph) result2_black[4];
			Place p = (Place) result2_black[5];
			S2P s2p = (S2P) result2_black[6];

			Object[] result3_bindingAndBlack = initial2nothingImpl
					.pattern_initial2nothing_26_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, s, sm,
							sm2pn, png, p, s2p, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s] = " + s + ", " + "[sm] = " + sm
						+ ", " + "[sm2pn] = " + sm2pn + ", " + "[png] = " + png + ", " + "[p] = " + p + ", "
						+ "[s2p] = " + s2p + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (initial2nothingImpl.pattern_initial2nothing_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = initial2nothingImpl.pattern_initial2nothing_26_5_checknacs_blackBBBBBB(s, sm,
						sm2pn, png, p, s2p);
				if (result5_black != null) {

					Object[] result6_black = initial2nothingImpl.pattern_initial2nothing_26_6_perform_blackBBBBBBB(s,
							sm, sm2pn, png, p, s2p, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[s] = " + s + ", "
								+ "[sm] = " + sm + ", " + "[sm2pn] = " + sm2pn + ", " + "[png] = " + png + ", "
								+ "[p] = " + p + ", " + "[s2p] = " + s2p + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					initial2nothingImpl.pattern_initial2nothing_26_6_perform_greenBBB(s, sm, ruleResult);

				} else {
				}

			} else {
			}

		}
		return initial2nothingImpl.pattern_initial2nothing_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, State s, SM sm, SM2PN sm2pn, PNGraph png,
			Place p, S2P s2p, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("sm2pn", sm2pn);
		isApplicableMatch.registerObject("png", png);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("s2p", s2p);
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
		case RulesPackage.INITIAL2NOTHING___IS_APPROPRIATE_FWD__MATCH_STATE_SM:
			return isAppropriate_FWD((Match) arguments.get(0), (State) arguments.get(1), (SM) arguments.get(2));
		case RulesPackage.INITIAL2NOTHING___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_STATE_SM:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (State) arguments.get(1), (SM) arguments.get(2));
			return null;
		case RulesPackage.INITIAL2NOTHING___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_STATE_SM:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (State) arguments.get(1),
					(SM) arguments.get(2));
		case RulesPackage.INITIAL2NOTHING___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STATE_SM_SM2PN_PNGRAPH_PLACE_S2P:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (State) arguments.get(1),
					(SM) arguments.get(2), (SM2PN) arguments.get(3), (PNGraph) arguments.get(4),
					(Place) arguments.get(5), (S2P) arguments.get(6));
		case RulesPackage.INITIAL2NOTHING___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.INITIAL2NOTHING___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___IS_APPROPRIATE_BWD__MATCH_PNGRAPH_PLACE:
			return isAppropriate_BWD((Match) arguments.get(0), (PNGraph) arguments.get(1), (Place) arguments.get(2));
		case RulesPackage.INITIAL2NOTHING___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PNGRAPH_PLACE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (PNGraph) arguments.get(1), (Place) arguments.get(2));
			return null;
		case RulesPackage.INITIAL2NOTHING___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PNGRAPH_PLACE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (PNGraph) arguments.get(1),
					(Place) arguments.get(2));
		case RulesPackage.INITIAL2NOTHING___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___IS_APPROPRIATE_BWD_PN_GRAPH_0__PNGRAPH:
			return isAppropriate_BWD_PNGraph_0((PNGraph) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___IS_APPROPRIATE_FWD_EMOFLON_EDGE_55__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_55((EMoflonEdge) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INITIAL2NOTHING___IS_APPLICABLE_SOLVE_CSP_CC__STATE_SM_PNGRAPH_PLACE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((State) arguments.get(0), (SM) arguments.get(1), (PNGraph) arguments.get(2),
					(Place) arguments.get(3), (Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.INITIAL2NOTHING___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INITIAL2NOTHING___CHECK_DEC_FWD__STATE_SM:
			return checkDEC_FWD((State) arguments.get(0), (SM) arguments.get(1));
		case RulesPackage.INITIAL2NOTHING___CHECK_DEC_BWD__PNGRAPH_PLACE:
			return checkDEC_BWD((PNGraph) arguments.get(0), (Place) arguments.get(1));
		case RulesPackage.INITIAL2NOTHING___GENERATE_MODEL__RULEENTRYCONTAINER_SM2PN:
			return generateModel((RuleEntryContainer) arguments.get(0), (SM2PN) arguments.get(1));
		case RulesPackage.INITIAL2NOTHING___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STATE_SM_SM2PN_PNGRAPH_PLACE_S2P_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (State) arguments.get(1),
					(SM) arguments.get(2), (SM2PN) arguments.get(3), (PNGraph) arguments.get(4),
					(Place) arguments.get(5), (S2P) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.INITIAL2NOTHING___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_initial2nothing_0_1_initialbindings_blackBBBB(initial2nothing _this,
			Match match, State s, SM sm) {
		return new Object[] { _this, match, s, sm };
	}

	public static final Object[] pattern_initial2nothing_0_2_SolveCSP_bindingFBBBB(initial2nothing _this, Match match,
			State s, SM sm) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, s, sm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, s, sm };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_initial2nothing_0_2_SolveCSP_bindingAndBlackFBBBB(initial2nothing _this,
			Match match, State s, SM sm) {
		Object[] result_pattern_initial2nothing_0_2_SolveCSP_binding = pattern_initial2nothing_0_2_SolveCSP_bindingFBBBB(
				_this, match, s, sm);
		if (result_pattern_initial2nothing_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_initial2nothing_0_2_SolveCSP_binding[0];

			Object[] result_pattern_initial2nothing_0_2_SolveCSP_black = pattern_initial2nothing_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_initial2nothing_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, s, sm };
			}
		}
		return null;
	}

	public static final boolean pattern_initial2nothing_0_3_CheckCSP_expressionFBB(initial2nothing _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_initial2nothing_0_4_collectelementstobetranslated_blackBBB(Match match,
			State s, SM sm) {
		return new Object[] { match, s, sm };
	}

	public static final Object[] pattern_initial2nothing_0_4_collectelementstobetranslated_greenBBBF(Match match,
			State s, SM sm) {
		EMoflonEdge sm__s____initial = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String sm__s____initial_name_prime = "initial";
		sm__s____initial.setSrc(sm);
		sm__s____initial.setTrg(s);
		match.getToBeTranslatedEdges().add(sm__s____initial);
		sm__s____initial.setName(sm__s____initial_name_prime);
		return new Object[] { match, s, sm, sm__s____initial };
	}

	public static final Object[] pattern_initial2nothing_0_5_collectcontextelements_blackBBB(Match match, State s,
			SM sm) {
		return new Object[] { match, s, sm };
	}

	public static final Object[] pattern_initial2nothing_0_5_collectcontextelements_greenBBBF(Match match, State s,
			SM sm) {
		EMoflonEdge sm__s____states = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(s);
		match.getContextNodes().add(sm);
		String sm__s____states_name_prime = "states";
		sm__s____states.setSrc(sm);
		sm__s____states.setTrg(s);
		match.getContextEdges().add(sm__s____states);
		sm__s____states.setName(sm__s____states_name_prime);
		return new Object[] { match, s, sm, sm__s____states };
	}

	public static final void pattern_initial2nothing_0_6_registerobjectstomatch_expressionBBBB(initial2nothing _this,
			Match match, State s, SM sm) {
		_this.registerObjectsToMatch_FWD(match, s, sm);

	}

	public static final boolean pattern_initial2nothing_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_initial2nothing_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_initial2nothing_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("s");
		EObject _localVariable_1 = isApplicableMatch.getObject("sm");
		EObject _localVariable_2 = isApplicableMatch.getObject("sm2pn");
		EObject _localVariable_3 = isApplicableMatch.getObject("png");
		EObject _localVariable_4 = isApplicableMatch.getObject("p");
		EObject _localVariable_5 = isApplicableMatch.getObject("s2p");
		EObject tmpS = _localVariable_0;
		EObject tmpSm = _localVariable_1;
		EObject tmpSm2pn = _localVariable_2;
		EObject tmpPng = _localVariable_3;
		EObject tmpP = _localVariable_4;
		EObject tmpS2p = _localVariable_5;
		if (tmpS instanceof State) {
			State s = (State) tmpS;
			if (tmpSm instanceof SM) {
				SM sm = (SM) tmpSm;
				if (tmpSm2pn instanceof SM2PN) {
					SM2PN sm2pn = (SM2PN) tmpSm2pn;
					if (tmpPng instanceof PNGraph) {
						PNGraph png = (PNGraph) tmpPng;
						if (tmpP instanceof Place) {
							Place p = (Place) tmpP;
							if (tmpS2p instanceof S2P) {
								S2P s2p = (S2P) tmpS2p;
								return new Object[] { s, sm, sm2pn, png, p, s2p, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_1_1_performtransformation_blackBBBBBBFBB(State s, SM sm,
			SM2PN sm2pn, PNGraph png, Place p, S2P s2p, initial2nothing _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { s, sm, sm2pn, png, p, s2p, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			initial2nothing _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_initial2nothing_1_1_performtransformation_binding = pattern_initial2nothing_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_initial2nothing_1_1_performtransformation_binding != null) {
			State s = (State) result_pattern_initial2nothing_1_1_performtransformation_binding[0];
			SM sm = (SM) result_pattern_initial2nothing_1_1_performtransformation_binding[1];
			SM2PN sm2pn = (SM2PN) result_pattern_initial2nothing_1_1_performtransformation_binding[2];
			PNGraph png = (PNGraph) result_pattern_initial2nothing_1_1_performtransformation_binding[3];
			Place p = (Place) result_pattern_initial2nothing_1_1_performtransformation_binding[4];
			S2P s2p = (S2P) result_pattern_initial2nothing_1_1_performtransformation_binding[5];

			Object[] result_pattern_initial2nothing_1_1_performtransformation_black = pattern_initial2nothing_1_1_performtransformation_blackBBBBBBFBB(
					s, sm, sm2pn, png, p, s2p, _this, isApplicableMatch);
			if (result_pattern_initial2nothing_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_initial2nothing_1_1_performtransformation_black[6];

				return new Object[] { s, sm, sm2pn, png, p, s2p, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_initial2nothing_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject s, EObject sm, EObject sm2pn, EObject png, EObject p, EObject s2p) {
		if (!s.equals(sm)) {
			if (!s.equals(sm2pn)) {
				if (!s.equals(s2p)) {
					if (!sm.equals(sm2pn)) {
						if (!png.equals(s)) {
							if (!png.equals(sm)) {
								if (!png.equals(sm2pn)) {
									if (!png.equals(s2p)) {
										if (!p.equals(s)) {
											if (!p.equals(sm)) {
												if (!p.equals(sm2pn)) {
													if (!p.equals(png)) {
														if (!p.equals(s2p)) {
															if (!s2p.equals(sm)) {
																if (!s2p.equals(sm2pn)) {
																	return new Object[] { ruleresult, s, sm, sm2pn, png,
																			p, s2p };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_initial2nothing_1_3_bookkeepingforedges_greenBBBF(PerformRuleResult ruleresult,
			EObject s, EObject sm) {
		EMoflonEdge sm__s____initial = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "initial2nothing";
		String sm__s____initial_name_prime = "initial";
		sm__s____initial.setSrc(sm);
		sm__s____initial.setTrg(s);
		ruleresult.getTranslatedEdges().add(sm__s____initial);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sm__s____initial.setName(sm__s____initial_name_prime);
		return new Object[] { ruleresult, s, sm, sm__s____initial };
	}

	public static final void pattern_initial2nothing_1_5_registerobjects_expressionBBBBBBBB(initial2nothing _this,
			PerformRuleResult ruleresult, EObject s, EObject sm, EObject sm2pn, EObject png, EObject p, EObject s2p) {
		_this.registerObjects_FWD(ruleresult, s, sm, sm2pn, png, p, s2p);

	}

	public static final PerformRuleResult pattern_initial2nothing_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_initial2nothing_2_1_preparereturnvalue_bindingFB(initial2nothing _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_2_1_preparereturnvalue_blackFBB(EClass eClass,
			initial2nothing _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_2_1_preparereturnvalue_bindingAndBlackFFB(
			initial2nothing _this) {
		Object[] result_pattern_initial2nothing_2_1_preparereturnvalue_binding = pattern_initial2nothing_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_initial2nothing_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_initial2nothing_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_initial2nothing_2_1_preparereturnvalue_black = pattern_initial2nothing_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_initial2nothing_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_initial2nothing_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "initial2nothing";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_initial2nothing_2_2_corematch_bindingFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_initial2nothing_2_2_corematch_blackBBFFFFB(State s, SM sm,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SM2PN sm2pn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(sm, SM2PN.class,
				"source")) {
			PNGraph png = sm2pn.getTarget();
			if (png != null) {
				for (S2P s2p : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s, S2P.class,
						"source")) {
					Place p = s2p.getTarget();
					if (p != null) {
						_result.add(new Object[] { s, sm, sm2pn, png, p, s2p, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_initial2nothing_2_3_findcontext_blackBBBBBB(State s, SM sm,
			SM2PN sm2pn, PNGraph png, Place p, S2P s2p) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (sm.equals(sm2pn.getSource())) {
			if (png.getPlaces().contains(p)) {
				if (png.equals(sm2pn.getTarget())) {
					if (s.equals(sm.getInitial())) {
						if (sm.getStates().contains(s)) {
							if (p.equals(s2p.getTarget())) {
								if (s.equals(s2p.getSource())) {
									_result.add(new Object[] { s, sm, sm2pn, png, p, s2p });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_initial2nothing_2_3_findcontext_greenBBBBBBFFFFFFFF(State s, SM sm,
			SM2PN sm2pn, PNGraph png, Place p, S2P s2p) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge sm2pn__sm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge png__p____places = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm2pn__png____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm__s____initial = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sm__s____states = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2p__p____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2p__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String sm2pn__sm____source_name_prime = "source";
		String png__p____places_name_prime = "places";
		String sm2pn__png____target_name_prime = "target";
		String sm__s____initial_name_prime = "initial";
		String sm__s____states_name_prime = "states";
		String s2p__p____target_name_prime = "target";
		String s2p__s____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(sm2pn);
		isApplicableMatch.getAllContextElements().add(png);
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(s2p);
		sm2pn__sm____source.setSrc(sm2pn);
		sm2pn__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(sm2pn__sm____source);
		png__p____places.setSrc(png);
		png__p____places.setTrg(p);
		isApplicableMatch.getAllContextElements().add(png__p____places);
		sm2pn__png____target.setSrc(sm2pn);
		sm2pn__png____target.setTrg(png);
		isApplicableMatch.getAllContextElements().add(sm2pn__png____target);
		sm__s____initial.setSrc(sm);
		sm__s____initial.setTrg(s);
		isApplicableMatch.getAllContextElements().add(sm__s____initial);
		sm__s____states.setSrc(sm);
		sm__s____states.setTrg(s);
		isApplicableMatch.getAllContextElements().add(sm__s____states);
		s2p__p____target.setSrc(s2p);
		s2p__p____target.setTrg(p);
		isApplicableMatch.getAllContextElements().add(s2p__p____target);
		s2p__s____source.setSrc(s2p);
		s2p__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2p__s____source);
		sm2pn__sm____source.setName(sm2pn__sm____source_name_prime);
		png__p____places.setName(png__p____places_name_prime);
		sm2pn__png____target.setName(sm2pn__png____target_name_prime);
		sm__s____initial.setName(sm__s____initial_name_prime);
		sm__s____states.setName(sm__s____states_name_prime);
		s2p__p____target.setName(s2p__p____target_name_prime);
		s2p__s____source.setName(s2p__s____source_name_prime);
		return new Object[] { s, sm, sm2pn, png, p, s2p, isApplicableMatch, sm2pn__sm____source, png__p____places,
				sm2pn__png____target, sm__s____initial, sm__s____states, s2p__p____target, s2p__s____source };
	}

	public static final Object[] pattern_initial2nothing_2_4_solveCSP_bindingFBBBBBBBB(initial2nothing _this,
			IsApplicableMatch isApplicableMatch, State s, SM sm, SM2PN sm2pn, PNGraph png, Place p, S2P s2p) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, s, sm, sm2pn, png, p, s2p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s, sm, sm2pn, png, p, s2p };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_initial2nothing_2_4_solveCSP_bindingAndBlackFBBBBBBBB(initial2nothing _this,
			IsApplicableMatch isApplicableMatch, State s, SM sm, SM2PN sm2pn, PNGraph png, Place p, S2P s2p) {
		Object[] result_pattern_initial2nothing_2_4_solveCSP_binding = pattern_initial2nothing_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, s, sm, sm2pn, png, p, s2p);
		if (result_pattern_initial2nothing_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_initial2nothing_2_4_solveCSP_binding[0];

			Object[] result_pattern_initial2nothing_2_4_solveCSP_black = pattern_initial2nothing_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_initial2nothing_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s, sm, sm2pn, png, p, s2p };
			}
		}
		return null;
	}

	public static final boolean pattern_initial2nothing_2_5_checkCSP_expressionFBB(initial2nothing _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_initial2nothing_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_initial2nothing_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "initial2nothing";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_initial2nothing_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_initial2nothing_10_1_initialbindings_blackBBBB(initial2nothing _this,
			Match match, PNGraph png, Place p) {
		return new Object[] { _this, match, png, p };
	}

	public static final Object[] pattern_initial2nothing_10_2_SolveCSP_bindingFBBBB(initial2nothing _this, Match match,
			PNGraph png, Place p) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, png, p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, png, p };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_initial2nothing_10_2_SolveCSP_bindingAndBlackFBBBB(initial2nothing _this,
			Match match, PNGraph png, Place p) {
		Object[] result_pattern_initial2nothing_10_2_SolveCSP_binding = pattern_initial2nothing_10_2_SolveCSP_bindingFBBBB(
				_this, match, png, p);
		if (result_pattern_initial2nothing_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_initial2nothing_10_2_SolveCSP_binding[0];

			Object[] result_pattern_initial2nothing_10_2_SolveCSP_black = pattern_initial2nothing_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_initial2nothing_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, png, p };
			}
		}
		return null;
	}

	public static final boolean pattern_initial2nothing_10_3_CheckCSP_expressionFBB(initial2nothing _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_initial2nothing_10_4_collectelementstobetranslated_blackBBB(Match match,
			PNGraph png, Place p) {
		return new Object[] { match, png, p };
	}

	public static final Object[] pattern_initial2nothing_10_5_collectcontextelements_blackBBB(Match match, PNGraph png,
			Place p) {
		return new Object[] { match, png, p };
	}

	public static final Object[] pattern_initial2nothing_10_5_collectcontextelements_greenBBBF(Match match, PNGraph png,
			Place p) {
		EMoflonEdge png__p____places = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(png);
		match.getContextNodes().add(p);
		String png__p____places_name_prime = "places";
		png__p____places.setSrc(png);
		png__p____places.setTrg(p);
		match.getContextEdges().add(png__p____places);
		png__p____places.setName(png__p____places_name_prime);
		return new Object[] { match, png, p, png__p____places };
	}

	public static final void pattern_initial2nothing_10_6_registerobjectstomatch_expressionBBBB(initial2nothing _this,
			Match match, PNGraph png, Place p) {
		_this.registerObjectsToMatch_BWD(match, png, p);

	}

	public static final boolean pattern_initial2nothing_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_initial2nothing_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_initial2nothing_17_1_preparereturnvalue_bindingFB(initial2nothing _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			initial2nothing _this) {
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

	public static final Object[] pattern_initial2nothing_17_1_preparereturnvalue_bindingAndBlackFFBF(
			initial2nothing _this) {
		Object[] result_pattern_initial2nothing_17_1_preparereturnvalue_binding = pattern_initial2nothing_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_initial2nothing_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_initial2nothing_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_initial2nothing_17_1_preparereturnvalue_black = pattern_initial2nothing_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_initial2nothing_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_initial2nothing_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_initial2nothing_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_initial2nothing_17_2_testcorematchandDECs_blackBF(PNGraph png) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (Place p : png.getPlaces()) {
			_result.add(new Object[] { png, p });
		}
		return _result;
	}

	public static final Object[] pattern_initial2nothing_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_initial2nothing_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			initial2nothing _this, Match match, PNGraph png, Place p) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, png, p);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_initial2nothing_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			initial2nothing _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_initial2nothing_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_initial2nothing_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_initial2nothing_18_1_preparereturnvalue_bindingFB(initial2nothing _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			initial2nothing _this) {
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

	public static final Object[] pattern_initial2nothing_18_1_preparereturnvalue_bindingAndBlackFFBF(
			initial2nothing _this) {
		Object[] result_pattern_initial2nothing_18_1_preparereturnvalue_binding = pattern_initial2nothing_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_initial2nothing_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_initial2nothing_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_initial2nothing_18_1_preparereturnvalue_black = pattern_initial2nothing_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_initial2nothing_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_initial2nothing_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_initial2nothing_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_initial2nothing_18_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_initial) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSm = _edge_initial.getSrc();
		if (tmpSm instanceof SM) {
			SM sm = (SM) tmpSm;
			EObject tmpS = _edge_initial.getTrg();
			if (tmpS instanceof State) {
				State s = (State) tmpS;
				if (s.equals(sm.getInitial())) {
					if (sm.getStates().contains(s)) {
						_result.add(new Object[] { s, sm, _edge_initial });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_initial2nothing_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_initial2nothing_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			initial2nothing _this, Match match, State s, SM sm) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, s, sm);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_initial2nothing_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			initial2nothing _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_initial2nothing_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_initial2nothing_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_initial2nothing_21_1_prepare_blackB(initial2nothing _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_initial2nothing_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_initial2nothing_21_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("s");
		EObject _localVariable_1 = sourceMatch.getObject("sm");
		EObject _localVariable_2 = targetMatch.getObject("png");
		EObject _localVariable_3 = targetMatch.getObject("p");
		EObject tmpS = _localVariable_0;
		EObject tmpSm = _localVariable_1;
		EObject tmpPng = _localVariable_2;
		EObject tmpP = _localVariable_3;
		if (tmpS instanceof State) {
			State s = (State) tmpS;
			if (tmpSm instanceof SM) {
				SM sm = (SM) tmpSm;
				if (tmpPng instanceof PNGraph) {
					PNGraph png = (PNGraph) tmpPng;
					if (tmpP instanceof Place) {
						Place p = (Place) tmpP;
						return new Object[] { s, sm, png, p, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_21_2_matchsrctrgcontext_blackBBBBBB(State s, SM sm,
			PNGraph png, Place p, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { s, sm, png, p, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_21_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_initial2nothing_21_2_matchsrctrgcontext_binding = pattern_initial2nothing_21_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_initial2nothing_21_2_matchsrctrgcontext_binding != null) {
			State s = (State) result_pattern_initial2nothing_21_2_matchsrctrgcontext_binding[0];
			SM sm = (SM) result_pattern_initial2nothing_21_2_matchsrctrgcontext_binding[1];
			PNGraph png = (PNGraph) result_pattern_initial2nothing_21_2_matchsrctrgcontext_binding[2];
			Place p = (Place) result_pattern_initial2nothing_21_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_initial2nothing_21_2_matchsrctrgcontext_black = pattern_initial2nothing_21_2_matchsrctrgcontext_blackBBBBBB(
					s, sm, png, p, sourceMatch, targetMatch);
			if (result_pattern_initial2nothing_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { s, sm, png, p, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_21_3_solvecsp_bindingFBBBBBBB(initial2nothing _this, State s,
			SM sm, PNGraph png, Place p, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(s, sm, png, p, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, s, sm, png, p, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_initial2nothing_21_3_solvecsp_bindingAndBlackFBBBBBBB(initial2nothing _this,
			State s, SM sm, PNGraph png, Place p, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_initial2nothing_21_3_solvecsp_binding = pattern_initial2nothing_21_3_solvecsp_bindingFBBBBBBB(
				_this, s, sm, png, p, sourceMatch, targetMatch);
		if (result_pattern_initial2nothing_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_initial2nothing_21_3_solvecsp_binding[0];

			Object[] result_pattern_initial2nothing_21_3_solvecsp_black = pattern_initial2nothing_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_initial2nothing_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, s, sm, png, p, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_initial2nothing_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_initial2nothing_21_5_matchcorrcontext_blackBBFBBFBB(State s, SM sm,
			PNGraph png, Place p, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (SM2PN sm2pn : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(sm, SM2PN.class,
					"source")) {
				if (png.equals(sm2pn.getTarget())) {
					for (S2P s2p : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p, S2P.class,
							"target")) {
						if (s.equals(s2p.getSource())) {
							_result.add(new Object[] { s, sm, sm2pn, png, p, s2p, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_initial2nothing_21_5_matchcorrcontext_greenBBBBF(SM2PN sm2pn, S2P s2p,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "initial2nothing";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(sm2pn);
		ccMatch.getAllContextElements().add(s2p);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sm2pn, s2p, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_initial2nothing_21_6_createcorrespondence_blackBBBBB(State s, SM sm,
			PNGraph png, Place p, CCMatch ccMatch) {
		return new Object[] { s, sm, png, p, ccMatch };
	}

	public static final Object[] pattern_initial2nothing_21_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_initial2nothing_21_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "initial2nothing";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_initial2nothing_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_initial2nothing_24_1_matchtggpattern_blackBB(State s, SM sm) {
		if (s.equals(sm.getInitial())) {
			if (sm.getStates().contains(s)) {
				return new Object[] { s, sm };
			}
		}
		return null;
	}

	public static final boolean pattern_initial2nothing_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_initial2nothing_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_initial2nothing_25_1_matchtggpattern_blackBB(PNGraph png, Place p) {
		if (png.getPlaces().contains(p)) {
			return new Object[] { png, p };
		}
		return null;
	}

	public static final boolean pattern_initial2nothing_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_initial2nothing_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_initial2nothing_26_1_createresult_blackB(initial2nothing _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_initial2nothing_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_initial2nothing_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, State s) {
		if (ruleResult.getSourceObjects().contains(s)) {
			return new Object[] { ruleResult, s };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SM sm) {
		if (ruleResult.getSourceObjects().contains(sm)) {
			return new Object[] { ruleResult, sm };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, SM2PN sm2pn) {
		if (ruleResult.getCorrObjects().contains(sm2pn)) {
			return new Object[] { ruleResult, sm2pn };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, PNGraph png) {
		if (ruleResult.getTargetObjects().contains(png)) {
			return new Object[] { ruleResult, png };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_26_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Place p) {
		if (ruleResult.getTargetObjects().contains(p)) {
			return new Object[] { ruleResult, p };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_26_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, S2P s2p) {
		if (ruleResult.getCorrObjects().contains(s2p)) {
			return new Object[] { ruleResult, s2p };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_initial2nothing_26_2_isapplicablecore_blackFFFFFFFBB(
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
							if (pattern_initial2nothing_26_2_isapplicablecore_black_nac_2BB(ruleResult,
									sm2pn) == null) {
								if (pattern_initial2nothing_26_2_isapplicablecore_black_nac_1BB(ruleResult,
										sm) == null) {
									if (pattern_initial2nothing_26_2_isapplicablecore_black_nac_3BB(ruleResult,
											png) == null) {
										for (State s : sm.getStates()) {
											if (pattern_initial2nothing_26_2_isapplicablecore_black_nac_0BB(ruleResult,
													s) == null) {
												for (Place p : png.getPlaces()) {
													if (pattern_initial2nothing_26_2_isapplicablecore_black_nac_4BB(
															ruleResult, p) == null) {
														for (S2P s2p : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(s, S2P.class, "source")) {
															if (p.equals(s2p.getTarget())) {
																if (pattern_initial2nothing_26_2_isapplicablecore_black_nac_5BB(
																		ruleResult, s2p) == null) {
																	_result.add(new Object[] { sm2pnList, s, sm, sm2pn,
																			png, p, s2p, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_initial2nothing_26_3_solveCSP_bindingFBBBBBBBBB(initial2nothing _this,
			IsApplicableMatch isApplicableMatch, State s, SM sm, SM2PN sm2pn, PNGraph png, Place p, S2P s2p,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, s, sm, sm2pn, png, p, s2p,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s, sm, sm2pn, png, p, s2p, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_initial2nothing_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_initial2nothing_26_3_solveCSP_bindingAndBlackFBBBBBBBBB(initial2nothing _this,
			IsApplicableMatch isApplicableMatch, State s, SM sm, SM2PN sm2pn, PNGraph png, Place p, S2P s2p,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_initial2nothing_26_3_solveCSP_binding = pattern_initial2nothing_26_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, s, sm, sm2pn, png, p, s2p, ruleResult);
		if (result_pattern_initial2nothing_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_initial2nothing_26_3_solveCSP_binding[0];

			Object[] result_pattern_initial2nothing_26_3_solveCSP_black = pattern_initial2nothing_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_initial2nothing_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s, sm, sm2pn, png, p, s2p, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_initial2nothing_26_4_checkCSP_expressionFBB(initial2nothing _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_initial2nothing_26_5_checknacs_blackBBBBBB(State s, SM sm, SM2PN sm2pn,
			PNGraph png, Place p, S2P s2p) {
		return new Object[] { s, sm, sm2pn, png, p, s2p };
	}

	public static final Object[] pattern_initial2nothing_26_6_perform_blackBBBBBBB(State s, SM sm, SM2PN sm2pn,
			PNGraph png, Place p, S2P s2p, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { s, sm, sm2pn, png, p, s2p, ruleResult };
	}

	public static final Object[] pattern_initial2nothing_26_6_perform_greenBBB(State s, SM sm,
			ModelgeneratorRuleResult ruleResult) {
		sm.setInitial(s);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { s, sm, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_initial2nothing_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //initial2nothingImpl
