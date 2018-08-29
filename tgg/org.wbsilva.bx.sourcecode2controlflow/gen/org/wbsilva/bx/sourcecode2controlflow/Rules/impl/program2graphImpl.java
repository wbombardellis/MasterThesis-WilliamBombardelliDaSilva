/**
 */
package org.wbsilva.bx.sourcecode2controlflow.Rules.impl;

import controlflow.ControlflowFactory;
import controlflow.Graph;

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

import org.wbsilva.bx.sourcecode2controlflow.P2G;

import org.wbsilva.bx.sourcecode2controlflow.Rules.RulesPackage;
import org.wbsilva.bx.sourcecode2controlflow.Rules.program2graph;

import org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowFactory;

import sourcecode.Program;
import sourcecode.SourcecodeFactory;
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
 * An implementation of the model object '<em><b>program2graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class program2graphImpl extends AbstractRuleImpl implements program2graph {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected program2graphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getprogram2graph();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Program p) {

		Object[] result1_black = program2graphImpl.pattern_program2graph_0_1_initialbindings_blackBBB(this, match, p);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[p] = " + p + ".");
		}

		Object[] result2_bindingAndBlack = program2graphImpl
				.pattern_program2graph_0_2_SolveCSP_bindingAndBlackFBBB(this, match, p);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[p] = " + p + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (program2graphImpl.pattern_program2graph_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = program2graphImpl
					.pattern_program2graph_0_4_collectelementstobetranslated_blackBB(match, p);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[p] = " + p + ".");
			}
			program2graphImpl.pattern_program2graph_0_4_collectelementstobetranslated_greenBB(match, p);

			Object[] result5_black = program2graphImpl.pattern_program2graph_0_5_collectcontextelements_blackBB(match,
					p);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[p] = " + p + ".");
			}
			// 
			program2graphImpl.pattern_program2graph_0_6_registerobjectstomatch_expressionBBB(this, match, p);
			return program2graphImpl.pattern_program2graph_0_7_expressionF();
		} else {
			return program2graphImpl.pattern_program2graph_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = program2graphImpl
				.pattern_program2graph_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Program p = (Program) result1_bindingAndBlack[0];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = program2graphImpl.pattern_program2graph_1_1_performtransformation_greenBFF(p);
		P2G p2g = (P2G) result1_green[1];
		Graph g = (Graph) result1_green[2];

		Object[] result2_black = program2graphImpl.pattern_program2graph_1_2_collecttranslatedelements_blackBBB(p, p2g,
				g);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[p] = " + p + ", " + "[p2g] = "
					+ p2g + ", " + "[g] = " + g + ".");
		}
		Object[] result2_green = program2graphImpl.pattern_program2graph_1_2_collecttranslatedelements_greenFBBB(p, p2g,
				g);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = program2graphImpl.pattern_program2graph_1_3_bookkeepingforedges_blackBBBB(ruleresult,
				p, p2g, g);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[p] = " + p + ", " + "[p2g] = " + p2g + ", " + "[g] = " + g + ".");
		}
		program2graphImpl.pattern_program2graph_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, p, p2g, g);
		//nothing EMoflonEdge p2g__p____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge p2g__g____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		program2graphImpl.pattern_program2graph_1_5_registerobjects_expressionBBBBB(this, ruleresult, p, p2g, g);
		return program2graphImpl.pattern_program2graph_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = program2graphImpl
				.pattern_program2graph_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = program2graphImpl
				.pattern_program2graph_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = program2graphImpl.pattern_program2graph_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Program p = (Program) result2_binding[0];
		for (Object[] result2_black : program2graphImpl.pattern_program2graph_2_2_corematch_blackBB(p, match)) {
			// ForEach 
			for (Object[] result3_black : program2graphImpl.pattern_program2graph_2_3_findcontext_blackB(p)) {
				Object[] result3_green = program2graphImpl.pattern_program2graph_2_3_findcontext_greenBF(p);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = program2graphImpl
						.pattern_program2graph_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, p);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p] = " + p + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (program2graphImpl.pattern_program2graph_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = program2graphImpl
							.pattern_program2graph_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					program2graphImpl.pattern_program2graph_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return program2graphImpl.pattern_program2graph_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Program p) {
		match.registerObject("p", p);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Program p) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Program p) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p", p);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject p, EObject p2g, EObject g) {
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("p2g", p2g);
		ruleresult.registerObject("g", g);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("p").eClass()).equals("sourcecode.Program.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Graph g) {

		Object[] result1_black = program2graphImpl.pattern_program2graph_10_1_initialbindings_blackBBB(this, match, g);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[g] = " + g + ".");
		}

		Object[] result2_bindingAndBlack = program2graphImpl
				.pattern_program2graph_10_2_SolveCSP_bindingAndBlackFBBB(this, match, g);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[g] = " + g + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (program2graphImpl.pattern_program2graph_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = program2graphImpl
					.pattern_program2graph_10_4_collectelementstobetranslated_blackBB(match, g);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[g] = " + g + ".");
			}
			program2graphImpl.pattern_program2graph_10_4_collectelementstobetranslated_greenBB(match, g);

			Object[] result5_black = program2graphImpl.pattern_program2graph_10_5_collectcontextelements_blackBB(match,
					g);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[g] = " + g + ".");
			}
			// 
			program2graphImpl.pattern_program2graph_10_6_registerobjectstomatch_expressionBBB(this, match, g);
			return program2graphImpl.pattern_program2graph_10_7_expressionF();
		} else {
			return program2graphImpl.pattern_program2graph_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = program2graphImpl
				.pattern_program2graph_11_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Graph g = (Graph) result1_bindingAndBlack[0];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = program2graphImpl.pattern_program2graph_11_1_performtransformation_greenFFB(g);
		Program p = (Program) result1_green[0];
		P2G p2g = (P2G) result1_green[1];

		Object[] result2_black = program2graphImpl.pattern_program2graph_11_2_collecttranslatedelements_blackBBB(p, p2g,
				g);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[p] = " + p + ", " + "[p2g] = "
					+ p2g + ", " + "[g] = " + g + ".");
		}
		Object[] result2_green = program2graphImpl.pattern_program2graph_11_2_collecttranslatedelements_greenFBBB(p,
				p2g, g);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = program2graphImpl.pattern_program2graph_11_3_bookkeepingforedges_blackBBBB(ruleresult,
				p, p2g, g);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[p] = " + p + ", " + "[p2g] = " + p2g + ", " + "[g] = " + g + ".");
		}
		program2graphImpl.pattern_program2graph_11_3_bookkeepingforedges_greenBBBBFF(ruleresult, p, p2g, g);
		//nothing EMoflonEdge p2g__p____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge p2g__g____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		program2graphImpl.pattern_program2graph_11_5_registerobjects_expressionBBBBB(this, ruleresult, p, p2g, g);
		return program2graphImpl.pattern_program2graph_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = program2graphImpl
				.pattern_program2graph_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = program2graphImpl
				.pattern_program2graph_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = program2graphImpl.pattern_program2graph_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Graph g = (Graph) result2_binding[0];
		for (Object[] result2_black : program2graphImpl.pattern_program2graph_12_2_corematch_blackBB(g, match)) {
			// ForEach 
			for (Object[] result3_black : program2graphImpl.pattern_program2graph_12_3_findcontext_blackB(g)) {
				Object[] result3_green = program2graphImpl.pattern_program2graph_12_3_findcontext_greenBF(g);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = program2graphImpl
						.pattern_program2graph_12_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, g);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[g] = " + g + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (program2graphImpl.pattern_program2graph_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = program2graphImpl
							.pattern_program2graph_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					program2graphImpl.pattern_program2graph_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return program2graphImpl.pattern_program2graph_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Graph g) {
		match.registerObject("g", g);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Graph g) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Graph g) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("g", g);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject p, EObject p2g, EObject g) {
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("p2g", p2g);
		ruleresult.registerObject("g", g);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("g").eClass()).equals("controlflow.Graph.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_Graph_2(Graph g) {

		Object[] result1_bindingAndBlack = program2graphImpl
				.pattern_program2graph_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = program2graphImpl.pattern_program2graph_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : program2graphImpl.pattern_program2graph_20_2_testcorematchandDECs_blackB(g)) {
			Object[] result2_green = program2graphImpl
					.pattern_program2graph_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (program2graphImpl.pattern_program2graph_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
					this, match, g)) {
				// 
				if (program2graphImpl
						.pattern_program2graph_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = program2graphImpl
							.pattern_program2graph_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					program2graphImpl.pattern_program2graph_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return program2graphImpl.pattern_program2graph_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_Program_2(Program p) {

		Object[] result1_bindingAndBlack = program2graphImpl
				.pattern_program2graph_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = program2graphImpl.pattern_program2graph_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : program2graphImpl.pattern_program2graph_21_2_testcorematchandDECs_blackB(p)) {
			Object[] result2_green = program2graphImpl
					.pattern_program2graph_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (program2graphImpl.pattern_program2graph_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
					this, match, p)) {
				// 
				if (program2graphImpl
						.pattern_program2graph_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = program2graphImpl
							.pattern_program2graph_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					program2graphImpl.pattern_program2graph_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return program2graphImpl.pattern_program2graph_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("program2graph");
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
		ruleResult.setRule("program2graph");
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

		Object[] result1_black = program2graphImpl.pattern_program2graph_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = program2graphImpl.pattern_program2graph_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = program2graphImpl
				.pattern_program2graph_24_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Program p = (Program) result2_bindingAndBlack[0];
		Graph g = (Graph) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = program2graphImpl
				.pattern_program2graph_24_3_solvecsp_bindingAndBlackFBBBBB(this, p, g, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[p] = " + p + ", " + "[g] = " + g + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (program2graphImpl.pattern_program2graph_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : program2graphImpl
					.pattern_program2graph_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = program2graphImpl
						.pattern_program2graph_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = program2graphImpl.pattern_program2graph_24_6_createcorrespondence_blackBBB(p,
						g, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[p] = " + p + ", "
							+ "[g] = " + g + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				program2graphImpl.pattern_program2graph_24_6_createcorrespondence_greenBFBB(p, g, ccMatch);
				//nothing P2G p2g = (P2G) result6_green[1];

				Object[] result7_black = program2graphImpl
						.pattern_program2graph_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				program2graphImpl.pattern_program2graph_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return program2graphImpl.pattern_program2graph_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Program p, Graph g, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Program p) {// 
		Object[] result1_black = program2graphImpl.pattern_program2graph_27_1_matchtggpattern_blackB(p);
		if (result1_black != null) {
			return program2graphImpl.pattern_program2graph_27_2_expressionF();
		} else {
			return program2graphImpl.pattern_program2graph_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Graph g) {// 
		Object[] result1_black = program2graphImpl.pattern_program2graph_28_1_matchtggpattern_blackB(g);
		if (result1_black != null) {
			return program2graphImpl.pattern_program2graph_28_2_expressionF();
		} else {
			return program2graphImpl.pattern_program2graph_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = program2graphImpl.pattern_program2graph_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = program2graphImpl.pattern_program2graph_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = program2graphImpl.pattern_program2graph_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = program2graphImpl
					.pattern_program2graph_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (program2graphImpl.pattern_program2graph_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = program2graphImpl.pattern_program2graph_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				program2graphImpl.pattern_program2graph_29_6_perform_greenFFFB(ruleResult);
				//nothing Program p = (Program) result6_green[0];
				//nothing P2G p2g = (P2G) result6_green[1];
				//nothing Graph g = (Graph) result6_green[2];

			} else {
			}

		} else {
		}
		return program2graphImpl.pattern_program2graph_29_7_expressionFB(ruleResult);
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
		case RulesPackage.PROGRAM2GRAPH___IS_APPROPRIATE_FWD__MATCH_PROGRAM:
			return isAppropriate_FWD((Match) arguments.get(0), (Program) arguments.get(1));
		case RulesPackage.PROGRAM2GRAPH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROGRAM:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Program) arguments.get(1));
			return null;
		case RulesPackage.PROGRAM2GRAPH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROGRAM:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Program) arguments.get(1));
		case RulesPackage.PROGRAM2GRAPH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROGRAM:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Program) arguments.get(1));
		case RulesPackage.PROGRAM2GRAPH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.PROGRAM2GRAPH___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___IS_APPROPRIATE_BWD__MATCH_GRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (Graph) arguments.get(1));
		case RulesPackage.PROGRAM2GRAPH___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_GRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Graph) arguments.get(1));
			return null;
		case RulesPackage.PROGRAM2GRAPH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_GRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Graph) arguments.get(1));
		case RulesPackage.PROGRAM2GRAPH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_GRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Graph) arguments.get(1));
		case RulesPackage.PROGRAM2GRAPH___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.PROGRAM2GRAPH___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___IS_APPROPRIATE_BWD_GRAPH_2__GRAPH:
			return isAppropriate_BWD_Graph_2((Graph) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___IS_APPROPRIATE_FWD_PROGRAM_2__PROGRAM:
			return isAppropriate_FWD_Program_2((Program) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PROGRAM2GRAPH___IS_APPLICABLE_SOLVE_CSP_CC__PROGRAM_GRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Program) arguments.get(0), (Graph) arguments.get(1),
					(Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.PROGRAM2GRAPH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___CHECK_DEC_FWD__PROGRAM:
			return checkDEC_FWD((Program) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___CHECK_DEC_BWD__GRAPH:
			return checkDEC_BWD((Graph) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.PROGRAM2GRAPH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.PROGRAM2GRAPH___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_program2graph_0_1_initialbindings_blackBBB(program2graph _this, Match match,
			Program p) {
		return new Object[] { _this, match, p };
	}

	public static final Object[] pattern_program2graph_0_2_SolveCSP_bindingFBBB(program2graph _this, Match match,
			Program p) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, p };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_program2graph_0_2_SolveCSP_bindingAndBlackFBBB(program2graph _this,
			Match match, Program p) {
		Object[] result_pattern_program2graph_0_2_SolveCSP_binding = pattern_program2graph_0_2_SolveCSP_bindingFBBB(
				_this, match, p);
		if (result_pattern_program2graph_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_program2graph_0_2_SolveCSP_binding[0];

			Object[] result_pattern_program2graph_0_2_SolveCSP_black = pattern_program2graph_0_2_SolveCSP_blackB(csp);
			if (result_pattern_program2graph_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, p };
			}
		}
		return null;
	}

	public static final boolean pattern_program2graph_0_3_CheckCSP_expressionFBB(program2graph _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_program2graph_0_4_collectelementstobetranslated_blackBB(Match match,
			Program p) {
		return new Object[] { match, p };
	}

	public static final Object[] pattern_program2graph_0_4_collectelementstobetranslated_greenBB(Match match,
			Program p) {
		match.getToBeTranslatedNodes().add(p);
		return new Object[] { match, p };
	}

	public static final Object[] pattern_program2graph_0_5_collectcontextelements_blackBB(Match match, Program p) {
		return new Object[] { match, p };
	}

	public static final void pattern_program2graph_0_6_registerobjectstomatch_expressionBBB(program2graph _this,
			Match match, Program p) {
		_this.registerObjectsToMatch_FWD(match, p);

	}

	public static final boolean pattern_program2graph_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_program2graph_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_program2graph_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("p");
		EObject tmpP = _localVariable_0;
		if (tmpP instanceof Program) {
			Program p = (Program) tmpP;
			return new Object[] { p, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_1_1_performtransformation_blackBFBB(Program p,
			program2graph _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { p, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_program2graph_1_1_performtransformation_bindingAndBlackFFBB(
			program2graph _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_program2graph_1_1_performtransformation_binding = pattern_program2graph_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_program2graph_1_1_performtransformation_binding != null) {
			Program p = (Program) result_pattern_program2graph_1_1_performtransformation_binding[0];

			Object[] result_pattern_program2graph_1_1_performtransformation_black = pattern_program2graph_1_1_performtransformation_blackBFBB(
					p, _this, isApplicableMatch);
			if (result_pattern_program2graph_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_program2graph_1_1_performtransformation_black[1];

				return new Object[] { p, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_program2graph_1_1_performtransformation_greenBFF(Program p) {
		P2G p2g = Sourcecode2controlflowFactory.eINSTANCE.createP2G();
		Graph g = ControlflowFactory.eINSTANCE.createGraph();
		p2g.setSource(p);
		p2g.setTarget(g);
		return new Object[] { p, p2g, g };
	}

	public static final Object[] pattern_program2graph_1_2_collecttranslatedelements_blackBBB(Program p, P2G p2g,
			Graph g) {
		return new Object[] { p, p2g, g };
	}

	public static final Object[] pattern_program2graph_1_2_collecttranslatedelements_greenFBBB(Program p, P2G p2g,
			Graph g) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(p);
		ruleresult.getCreatedLinkElements().add(p2g);
		ruleresult.getCreatedElements().add(g);
		return new Object[] { ruleresult, p, p2g, g };
	}

	public static final Object[] pattern_program2graph_1_3_bookkeepingforedges_blackBBBB(PerformRuleResult ruleresult,
			EObject p, EObject p2g, EObject g) {
		if (!p.equals(p2g)) {
			if (!g.equals(p)) {
				if (!g.equals(p2g)) {
					return new Object[] { ruleresult, p, p2g, g };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_program2graph_1_3_bookkeepingforedges_greenBBBBFF(PerformRuleResult ruleresult,
			EObject p, EObject p2g, EObject g) {
		EMoflonEdge p2g__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__g____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "program2graph";
		String p2g__p____source_name_prime = "source";
		String p2g__g____target_name_prime = "target";
		p2g__p____source.setSrc(p2g);
		p2g__p____source.setTrg(p);
		ruleresult.getCreatedEdges().add(p2g__p____source);
		p2g__g____target.setSrc(p2g);
		p2g__g____target.setTrg(g);
		ruleresult.getCreatedEdges().add(p2g__g____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		p2g__p____source.setName(p2g__p____source_name_prime);
		p2g__g____target.setName(p2g__g____target_name_prime);
		return new Object[] { ruleresult, p, p2g, g, p2g__p____source, p2g__g____target };
	}

	public static final void pattern_program2graph_1_5_registerobjects_expressionBBBBB(program2graph _this,
			PerformRuleResult ruleresult, EObject p, EObject p2g, EObject g) {
		_this.registerObjects_FWD(ruleresult, p, p2g, g);

	}

	public static final PerformRuleResult pattern_program2graph_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_program2graph_2_1_preparereturnvalue_bindingFB(program2graph _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_2_1_preparereturnvalue_blackFBB(EClass eClass,
			program2graph _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_program2graph_2_1_preparereturnvalue_bindingAndBlackFFB(program2graph _this) {
		Object[] result_pattern_program2graph_2_1_preparereturnvalue_binding = pattern_program2graph_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_program2graph_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_program2graph_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_program2graph_2_1_preparereturnvalue_black = pattern_program2graph_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_program2graph_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_program2graph_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_program2graph_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "program2graph";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_program2graph_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("p");
		EObject tmpP = _localVariable_0;
		if (tmpP instanceof Program) {
			Program p = (Program) tmpP;
			return new Object[] { p, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_program2graph_2_2_corematch_blackBB(Program p, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { p, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_program2graph_2_3_findcontext_blackB(Program p) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { p });
		return _result;
	}

	public static final Object[] pattern_program2graph_2_3_findcontext_greenBF(Program p) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(p);
		return new Object[] { p, isApplicableMatch };
	}

	public static final Object[] pattern_program2graph_2_4_solveCSP_bindingFBBB(program2graph _this,
			IsApplicableMatch isApplicableMatch, Program p) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_program2graph_2_4_solveCSP_bindingAndBlackFBBB(program2graph _this,
			IsApplicableMatch isApplicableMatch, Program p) {
		Object[] result_pattern_program2graph_2_4_solveCSP_binding = pattern_program2graph_2_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, p);
		if (result_pattern_program2graph_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_program2graph_2_4_solveCSP_binding[0];

			Object[] result_pattern_program2graph_2_4_solveCSP_black = pattern_program2graph_2_4_solveCSP_blackB(csp);
			if (result_pattern_program2graph_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p };
			}
		}
		return null;
	}

	public static final boolean pattern_program2graph_2_5_checkCSP_expressionFBB(program2graph _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_program2graph_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_program2graph_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "program2graph";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_program2graph_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_program2graph_10_1_initialbindings_blackBBB(program2graph _this, Match match,
			Graph g) {
		return new Object[] { _this, match, g };
	}

	public static final Object[] pattern_program2graph_10_2_SolveCSP_bindingFBBB(program2graph _this, Match match,
			Graph g) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, g);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, g };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_program2graph_10_2_SolveCSP_bindingAndBlackFBBB(program2graph _this,
			Match match, Graph g) {
		Object[] result_pattern_program2graph_10_2_SolveCSP_binding = pattern_program2graph_10_2_SolveCSP_bindingFBBB(
				_this, match, g);
		if (result_pattern_program2graph_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_program2graph_10_2_SolveCSP_binding[0];

			Object[] result_pattern_program2graph_10_2_SolveCSP_black = pattern_program2graph_10_2_SolveCSP_blackB(csp);
			if (result_pattern_program2graph_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, g };
			}
		}
		return null;
	}

	public static final boolean pattern_program2graph_10_3_CheckCSP_expressionFBB(program2graph _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_program2graph_10_4_collectelementstobetranslated_blackBB(Match match,
			Graph g) {
		return new Object[] { match, g };
	}

	public static final Object[] pattern_program2graph_10_4_collectelementstobetranslated_greenBB(Match match,
			Graph g) {
		match.getToBeTranslatedNodes().add(g);
		return new Object[] { match, g };
	}

	public static final Object[] pattern_program2graph_10_5_collectcontextelements_blackBB(Match match, Graph g) {
		return new Object[] { match, g };
	}

	public static final void pattern_program2graph_10_6_registerobjectstomatch_expressionBBB(program2graph _this,
			Match match, Graph g) {
		_this.registerObjectsToMatch_BWD(match, g);

	}

	public static final boolean pattern_program2graph_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_program2graph_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_program2graph_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("g");
		EObject tmpG = _localVariable_0;
		if (tmpG instanceof Graph) {
			Graph g = (Graph) tmpG;
			return new Object[] { g, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_11_1_performtransformation_blackBFBB(Graph g,
			program2graph _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { g, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_program2graph_11_1_performtransformation_bindingAndBlackFFBB(
			program2graph _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_program2graph_11_1_performtransformation_binding = pattern_program2graph_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_program2graph_11_1_performtransformation_binding != null) {
			Graph g = (Graph) result_pattern_program2graph_11_1_performtransformation_binding[0];

			Object[] result_pattern_program2graph_11_1_performtransformation_black = pattern_program2graph_11_1_performtransformation_blackBFBB(
					g, _this, isApplicableMatch);
			if (result_pattern_program2graph_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_program2graph_11_1_performtransformation_black[1];

				return new Object[] { g, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_program2graph_11_1_performtransformation_greenFFB(Graph g) {
		Program p = SourcecodeFactory.eINSTANCE.createProgram();
		P2G p2g = Sourcecode2controlflowFactory.eINSTANCE.createP2G();
		p2g.setSource(p);
		p2g.setTarget(g);
		return new Object[] { p, p2g, g };
	}

	public static final Object[] pattern_program2graph_11_2_collecttranslatedelements_blackBBB(Program p, P2G p2g,
			Graph g) {
		return new Object[] { p, p2g, g };
	}

	public static final Object[] pattern_program2graph_11_2_collecttranslatedelements_greenFBBB(Program p, P2G p2g,
			Graph g) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(p);
		ruleresult.getCreatedLinkElements().add(p2g);
		ruleresult.getTranslatedElements().add(g);
		return new Object[] { ruleresult, p, p2g, g };
	}

	public static final Object[] pattern_program2graph_11_3_bookkeepingforedges_blackBBBB(PerformRuleResult ruleresult,
			EObject p, EObject p2g, EObject g) {
		if (!p.equals(p2g)) {
			if (!g.equals(p)) {
				if (!g.equals(p2g)) {
					return new Object[] { ruleresult, p, p2g, g };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_program2graph_11_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject p, EObject p2g, EObject g) {
		EMoflonEdge p2g__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__g____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "program2graph";
		String p2g__p____source_name_prime = "source";
		String p2g__g____target_name_prime = "target";
		p2g__p____source.setSrc(p2g);
		p2g__p____source.setTrg(p);
		ruleresult.getCreatedEdges().add(p2g__p____source);
		p2g__g____target.setSrc(p2g);
		p2g__g____target.setTrg(g);
		ruleresult.getCreatedEdges().add(p2g__g____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		p2g__p____source.setName(p2g__p____source_name_prime);
		p2g__g____target.setName(p2g__g____target_name_prime);
		return new Object[] { ruleresult, p, p2g, g, p2g__p____source, p2g__g____target };
	}

	public static final void pattern_program2graph_11_5_registerobjects_expressionBBBBB(program2graph _this,
			PerformRuleResult ruleresult, EObject p, EObject p2g, EObject g) {
		_this.registerObjects_BWD(ruleresult, p, p2g, g);

	}

	public static final PerformRuleResult pattern_program2graph_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_program2graph_12_1_preparereturnvalue_bindingFB(program2graph _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_12_1_preparereturnvalue_blackFBB(EClass eClass,
			program2graph _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_program2graph_12_1_preparereturnvalue_bindingAndBlackFFB(program2graph _this) {
		Object[] result_pattern_program2graph_12_1_preparereturnvalue_binding = pattern_program2graph_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_program2graph_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_program2graph_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_program2graph_12_1_preparereturnvalue_black = pattern_program2graph_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_program2graph_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_program2graph_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_program2graph_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "program2graph";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_program2graph_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("g");
		EObject tmpG = _localVariable_0;
		if (tmpG instanceof Graph) {
			Graph g = (Graph) tmpG;
			return new Object[] { g, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_program2graph_12_2_corematch_blackBB(Graph g, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { g, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_program2graph_12_3_findcontext_blackB(Graph g) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { g });
		return _result;
	}

	public static final Object[] pattern_program2graph_12_3_findcontext_greenBF(Graph g) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(g);
		return new Object[] { g, isApplicableMatch };
	}

	public static final Object[] pattern_program2graph_12_4_solveCSP_bindingFBBB(program2graph _this,
			IsApplicableMatch isApplicableMatch, Graph g) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, g);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, g };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_program2graph_12_4_solveCSP_bindingAndBlackFBBB(program2graph _this,
			IsApplicableMatch isApplicableMatch, Graph g) {
		Object[] result_pattern_program2graph_12_4_solveCSP_binding = pattern_program2graph_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, g);
		if (result_pattern_program2graph_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_program2graph_12_4_solveCSP_binding[0];

			Object[] result_pattern_program2graph_12_4_solveCSP_black = pattern_program2graph_12_4_solveCSP_blackB(csp);
			if (result_pattern_program2graph_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, g };
			}
		}
		return null;
	}

	public static final boolean pattern_program2graph_12_5_checkCSP_expressionFBB(program2graph _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_program2graph_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_program2graph_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "program2graph";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_program2graph_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_program2graph_20_1_preparereturnvalue_bindingFB(program2graph _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			program2graph _this) {
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

	public static final Object[] pattern_program2graph_20_1_preparereturnvalue_bindingAndBlackFFBF(
			program2graph _this) {
		Object[] result_pattern_program2graph_20_1_preparereturnvalue_binding = pattern_program2graph_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_program2graph_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_program2graph_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_program2graph_20_1_preparereturnvalue_black = pattern_program2graph_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_program2graph_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_program2graph_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_program2graph_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_program2graph_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_program2graph_20_2_testcorematchandDECs_blackB(Graph g) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { g });
		return _result;
	}

	public static final Object[] pattern_program2graph_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_program2graph_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			program2graph _this, Match match, Graph g) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, g);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_program2graph_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			program2graph _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_program2graph_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_program2graph_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_program2graph_21_1_preparereturnvalue_bindingFB(program2graph _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			program2graph _this) {
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

	public static final Object[] pattern_program2graph_21_1_preparereturnvalue_bindingAndBlackFFBF(
			program2graph _this) {
		Object[] result_pattern_program2graph_21_1_preparereturnvalue_binding = pattern_program2graph_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_program2graph_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_program2graph_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_program2graph_21_1_preparereturnvalue_black = pattern_program2graph_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_program2graph_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_program2graph_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_program2graph_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_program2graph_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_program2graph_21_2_testcorematchandDECs_blackB(Program p) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { p });
		return _result;
	}

	public static final Object[] pattern_program2graph_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_program2graph_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			program2graph _this, Match match, Program p) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, p);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_program2graph_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			program2graph _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_program2graph_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_program2graph_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_program2graph_24_1_prepare_blackB(program2graph _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_program2graph_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_program2graph_24_2_matchsrctrgcontext_bindingFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("p");
		EObject _localVariable_1 = targetMatch.getObject("g");
		EObject tmpP = _localVariable_0;
		EObject tmpG = _localVariable_1;
		if (tmpP instanceof Program) {
			Program p = (Program) tmpP;
			if (tmpG instanceof Graph) {
				Graph g = (Graph) tmpG;
				return new Object[] { p, g, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_program2graph_24_2_matchsrctrgcontext_blackBBBB(Program p, Graph g,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { p, g, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_24_2_matchsrctrgcontext_bindingAndBlackFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_program2graph_24_2_matchsrctrgcontext_binding = pattern_program2graph_24_2_matchsrctrgcontext_bindingFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_program2graph_24_2_matchsrctrgcontext_binding != null) {
			Program p = (Program) result_pattern_program2graph_24_2_matchsrctrgcontext_binding[0];
			Graph g = (Graph) result_pattern_program2graph_24_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_program2graph_24_2_matchsrctrgcontext_black = pattern_program2graph_24_2_matchsrctrgcontext_blackBBBB(
					p, g, sourceMatch, targetMatch);
			if (result_pattern_program2graph_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { p, g, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_program2graph_24_3_solvecsp_bindingFBBBBB(program2graph _this, Program p,
			Graph g, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(p, g, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, p, g, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_program2graph_24_3_solvecsp_bindingAndBlackFBBBBB(program2graph _this,
			Program p, Graph g, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_program2graph_24_3_solvecsp_binding = pattern_program2graph_24_3_solvecsp_bindingFBBBBB(
				_this, p, g, sourceMatch, targetMatch);
		if (result_pattern_program2graph_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_program2graph_24_3_solvecsp_binding[0];

			Object[] result_pattern_program2graph_24_3_solvecsp_black = pattern_program2graph_24_3_solvecsp_blackB(csp);
			if (result_pattern_program2graph_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, p, g, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_program2graph_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_program2graph_24_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_program2graph_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "program2graph";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_program2graph_24_6_createcorrespondence_blackBBB(Program p, Graph g,
			CCMatch ccMatch) {
		return new Object[] { p, g, ccMatch };
	}

	public static final Object[] pattern_program2graph_24_6_createcorrespondence_greenBFBB(Program p, Graph g,
			CCMatch ccMatch) {
		P2G p2g = Sourcecode2controlflowFactory.eINSTANCE.createP2G();
		p2g.setSource(p);
		p2g.setTarget(g);
		ccMatch.getCreateCorr().add(p2g);
		return new Object[] { p, p2g, g, ccMatch };
	}

	public static final Object[] pattern_program2graph_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_program2graph_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "program2graph";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_program2graph_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_program2graph_27_1_matchtggpattern_blackB(Program p) {
		return new Object[] { p };
	}

	public static final boolean pattern_program2graph_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_program2graph_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_program2graph_28_1_matchtggpattern_blackB(Graph g) {
		return new Object[] { g };
	}

	public static final boolean pattern_program2graph_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_program2graph_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_program2graph_29_1_createresult_blackB(program2graph _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_program2graph_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_program2graph_29_2_isapplicablecore_blackB(program2graph _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_program2graph_29_3_solveCSP_bindingFBBB(program2graph _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_program2graph_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_program2graph_29_3_solveCSP_bindingAndBlackFBBB(program2graph _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_program2graph_29_3_solveCSP_binding = pattern_program2graph_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_program2graph_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_program2graph_29_3_solveCSP_binding[0];

			Object[] result_pattern_program2graph_29_3_solveCSP_black = pattern_program2graph_29_3_solveCSP_blackB(csp);
			if (result_pattern_program2graph_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_program2graph_29_4_checkCSP_expressionFBB(program2graph _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_program2graph_29_6_perform_blackB(ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_program2graph_29_6_perform_greenFFFB(ModelgeneratorRuleResult ruleResult) {
		Program p = SourcecodeFactory.eINSTANCE.createProgram();
		P2G p2g = Sourcecode2controlflowFactory.eINSTANCE.createP2G();
		Graph g = ControlflowFactory.eINSTANCE.createGraph();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(p);
		p2g.setSource(p);
		ruleResult.getCorrObjects().add(p2g);
		p2g.setTarget(g);
		ruleResult.getTargetObjects().add(g);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { p, p2g, g, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_program2graph_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //program2graphImpl
