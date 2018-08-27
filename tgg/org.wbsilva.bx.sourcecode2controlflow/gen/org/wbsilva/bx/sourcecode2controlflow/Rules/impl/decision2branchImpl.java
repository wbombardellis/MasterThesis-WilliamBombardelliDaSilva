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
import org.wbsilva.bx.sourcecode2controlflow.Rules.decision2branch;

import org.wbsilva.bx.sourcecode2controlflow.S2B;
import org.wbsilva.bx.sourcecode2controlflow.S2N;
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
 * An implementation of the model object '<em><b>decision2branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class decision2branchImpl extends AbstractRuleImpl implements decision2branch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decision2branchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdecision2branch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Decision d, Statement s) {

		Object[] result1_black = decision2branchImpl.pattern_decision2branch_0_1_initialbindings_blackBBBB(this, match,
				d, s);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[s] = " + s + ".");
		}

		Object[] result2_bindingAndBlack = decision2branchImpl
				.pattern_decision2branch_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, d, s);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[s] = " + s + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decision2branchImpl.pattern_decision2branch_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decision2branchImpl
					.pattern_decision2branch_0_4_collectelementstobetranslated_blackBBB(match, d, s);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[s] = " + s + ".");
			}
			decision2branchImpl.pattern_decision2branch_0_4_collectelementstobetranslated_greenBBBF(match, d, s);
			//nothing EMoflonEdge s__d____next = (EMoflonEdge) result4_green[3];

			Object[] result5_black = decision2branchImpl
					.pattern_decision2branch_0_5_collectcontextelements_blackBBB(match, d, s);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[s] = " + s + ".");
			}
			decision2branchImpl.pattern_decision2branch_0_5_collectcontextelements_greenBB(match, s);

			// 
			decision2branchImpl.pattern_decision2branch_0_6_registerobjectstomatch_expressionBBBB(this, match, d, s);
			return decision2branchImpl.pattern_decision2branch_0_7_expressionF();
		} else {
			return decision2branchImpl.pattern_decision2branch_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decision2branchImpl
				.pattern_decision2branch_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2N s2n = (S2N) result1_bindingAndBlack[0];
		Decision d = (Decision) result1_bindingAndBlack[1];
		Node n = (Node) result1_bindingAndBlack[2];
		Statement s = (Statement) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = decision2branchImpl.pattern_decision2branch_1_1_performtransformation_greenFBBF(d, n);
		S2B a2c = (S2B) result1_green[0];
		Branch c = (Branch) result1_green[3];

		Object[] result2_black = decision2branchImpl.pattern_decision2branch_1_2_collecttranslatedelements_blackBBB(a2c,
				d, c);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2c] = " + a2c + ", " + "[d] = "
					+ d + ", " + "[c] = " + c + ".");
		}
		Object[] result2_green = decision2branchImpl
				.pattern_decision2branch_1_2_collecttranslatedelements_greenFBBB(a2c, d, c);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decision2branchImpl
				.pattern_decision2branch_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, a2c, s2n, d, n, c, s);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2c] = " + a2c + ", " + "[s2n] = " + s2n + ", " + "[d] = " + d + ", " + "[n] = " + n
					+ ", " + "[c] = " + c + ", " + "[s] = " + s + ".");
		}
		decision2branchImpl.pattern_decision2branch_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, a2c, d, n, c,
				s);
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge a2c__d____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge s__d____next = (EMoflonEdge) result3_green[9];

		// 
		// 
		decision2branchImpl.pattern_decision2branch_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, a2c, s2n,
				d, n, c, s);
		return decision2branchImpl.pattern_decision2branch_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = decision2branchImpl
				.pattern_decision2branch_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decision2branchImpl
				.pattern_decision2branch_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decision2branchImpl.pattern_decision2branch_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Decision d = (Decision) result2_binding[0];
		Statement s = (Statement) result2_binding[1];
		for (Object[] result2_black : decision2branchImpl.pattern_decision2branch_2_2_corematch_blackFBFBB(d, s,
				match)) {
			S2N s2n = (S2N) result2_black[0];
			Node n = (Node) result2_black[2];
			// ForEach 
			for (Object[] result3_black : decision2branchImpl.pattern_decision2branch_2_3_findcontext_blackBBBB(s2n, d,
					n, s)) {
				Object[] result3_green = decision2branchImpl.pattern_decision2branch_2_3_findcontext_greenBBBBFFFF(s2n,
						d, n, s);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge s__d____next = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = decision2branchImpl
						.pattern_decision2branch_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, s2n, d, n,
								s);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s2n] = " + s2n + ", " + "[d] = "
							+ d + ", " + "[n] = " + n + ", " + "[s] = " + s + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decision2branchImpl.pattern_decision2branch_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decision2branchImpl
							.pattern_decision2branch_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decision2branchImpl.pattern_decision2branch_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decision2branchImpl.pattern_decision2branch_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Decision d, Statement s) {
		match.registerObject("d", d);
		match.registerObject("s", s);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision d, Statement s) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, S2N s2n, Decision d, Node n,
			Statement s) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s2n", s2n);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("s", s);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a2c, EObject s2n, EObject d, EObject n,
			EObject c, EObject s) {
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("s", s);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("sourcecode.Decision.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Node n, Branch c) {

		Object[] result1_black = decision2branchImpl.pattern_decision2branch_10_1_initialbindings_blackBBBB(this, match,
				n, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[n] = " + n + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = decision2branchImpl
				.pattern_decision2branch_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, n, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[n] = " + n + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decision2branchImpl.pattern_decision2branch_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decision2branchImpl
					.pattern_decision2branch_10_4_collectelementstobetranslated_blackBBB(match, n, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[n] = " + n + ", " + "[c] = " + c + ".");
			}
			decision2branchImpl.pattern_decision2branch_10_4_collectelementstobetranslated_greenBBBF(match, n, c);
			//nothing EMoflonEdge n__c____next = (EMoflonEdge) result4_green[3];

			Object[] result5_black = decision2branchImpl
					.pattern_decision2branch_10_5_collectcontextelements_blackBBB(match, n, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[n] = " + n + ", " + "[c] = " + c + ".");
			}
			decision2branchImpl.pattern_decision2branch_10_5_collectcontextelements_greenBB(match, n);

			// 
			decision2branchImpl.pattern_decision2branch_10_6_registerobjectstomatch_expressionBBBB(this, match, n, c);
			return decision2branchImpl.pattern_decision2branch_10_7_expressionF();
		} else {
			return decision2branchImpl.pattern_decision2branch_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decision2branchImpl
				.pattern_decision2branch_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2N s2n = (S2N) result1_bindingAndBlack[0];
		Node n = (Node) result1_bindingAndBlack[1];
		Branch c = (Branch) result1_bindingAndBlack[2];
		Statement s = (Statement) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = decision2branchImpl.pattern_decision2branch_11_1_performtransformation_greenFFBB(c, s);
		S2B a2c = (S2B) result1_green[0];
		Decision d = (Decision) result1_green[1];

		Object[] result2_black = decision2branchImpl
				.pattern_decision2branch_11_2_collecttranslatedelements_blackBBB(a2c, d, c);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2c] = " + a2c + ", " + "[d] = "
					+ d + ", " + "[c] = " + c + ".");
		}
		Object[] result2_green = decision2branchImpl
				.pattern_decision2branch_11_2_collecttranslatedelements_greenFBBB(a2c, d, c);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decision2branchImpl
				.pattern_decision2branch_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, a2c, s2n, d, n, c, s);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2c] = " + a2c + ", " + "[s2n] = " + s2n + ", " + "[d] = " + d + ", " + "[n] = " + n
					+ ", " + "[c] = " + c + ", " + "[s] = " + s + ".");
		}
		decision2branchImpl.pattern_decision2branch_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, a2c, d, n, c,
				s);
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge a2c__d____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge s__d____next = (EMoflonEdge) result3_green[9];

		// 
		// 
		decision2branchImpl.pattern_decision2branch_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, a2c, s2n,
				d, n, c, s);
		return decision2branchImpl.pattern_decision2branch_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = decision2branchImpl
				.pattern_decision2branch_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decision2branchImpl
				.pattern_decision2branch_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decision2branchImpl.pattern_decision2branch_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Node n = (Node) result2_binding[0];
		Branch c = (Branch) result2_binding[1];
		for (Object[] result2_black : decision2branchImpl.pattern_decision2branch_12_2_corematch_blackFBBFB(n, c,
				match)) {
			S2N s2n = (S2N) result2_black[0];
			Statement s = (Statement) result2_black[3];
			// ForEach 
			for (Object[] result3_black : decision2branchImpl.pattern_decision2branch_12_3_findcontext_blackBBBB(s2n, n,
					c, s)) {
				Object[] result3_green = decision2branchImpl.pattern_decision2branch_12_3_findcontext_greenBBBBFFFF(s2n,
						n, c, s);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = decision2branchImpl
						.pattern_decision2branch_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, s2n, n,
								c, s);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s2n] = " + s2n + ", " + "[n] = "
							+ n + ", " + "[c] = " + c + ", " + "[s] = " + s + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decision2branchImpl.pattern_decision2branch_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decision2branchImpl
							.pattern_decision2branch_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decision2branchImpl.pattern_decision2branch_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decision2branchImpl.pattern_decision2branch_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Node n, Branch c) {
		match.registerObject("n", n);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Node n, Branch c) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2N s2n, Node n, Branch c, Statement s) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s2n", s2n);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("s", s);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a2c, EObject s2n, EObject d, EObject n,
			EObject c, EObject s) {
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("s", s);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_127(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = decision2branchImpl
				.pattern_decision2branch_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decision2branchImpl.pattern_decision2branch_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decision2branchImpl
				.pattern_decision2branch_20_2_testcorematchandDECs_blackFFB(_edge_next)) {
			Node n = (Node) result2_black[0];
			Branch c = (Branch) result2_black[1];
			Object[] result2_green = decision2branchImpl
					.pattern_decision2branch_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decision2branchImpl
					.pattern_decision2branch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							n, c)) {
				// 
				if (decision2branchImpl
						.pattern_decision2branch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decision2branchImpl
							.pattern_decision2branch_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decision2branchImpl.pattern_decision2branch_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decision2branchImpl.pattern_decision2branch_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_127(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = decision2branchImpl
				.pattern_decision2branch_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decision2branchImpl.pattern_decision2branch_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decision2branchImpl
				.pattern_decision2branch_21_2_testcorematchandDECs_blackFFB(_edge_next)) {
			Decision d = (Decision) result2_black[0];
			Statement s = (Statement) result2_black[1];
			Object[] result2_green = decision2branchImpl
					.pattern_decision2branch_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decision2branchImpl
					.pattern_decision2branch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							d, s)) {
				// 
				if (decision2branchImpl
						.pattern_decision2branch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decision2branchImpl
							.pattern_decision2branch_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decision2branchImpl.pattern_decision2branch_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decision2branchImpl.pattern_decision2branch_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("decision2branch");
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
		ruleResult.setRule("decision2branch");
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

		Object[] result1_black = decision2branchImpl.pattern_decision2branch_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decision2branchImpl.pattern_decision2branch_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = decision2branchImpl
				.pattern_decision2branch_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Decision d = (Decision) result2_bindingAndBlack[0];
		Node n = (Node) result2_bindingAndBlack[1];
		Branch c = (Branch) result2_bindingAndBlack[2];
		Statement s = (Statement) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = decision2branchImpl
				.pattern_decision2branch_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, d, n, c, s, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[d] = " + d + ", " + "[n] = " + n + ", " + "[c] = " + c + ", " + "[s] = " + s + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decision2branchImpl.pattern_decision2branch_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decision2branchImpl
					.pattern_decision2branch_24_5_matchcorrcontext_blackFBBBB(n, s, sourceMatch, targetMatch)) {
				S2N s2n = (S2N) result5_black[0];
				Object[] result5_green = decision2branchImpl
						.pattern_decision2branch_24_5_matchcorrcontext_greenBBBF(s2n, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decision2branchImpl
						.pattern_decision2branch_24_6_createcorrespondence_blackBBBBB(d, n, c, s, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[d] = " + d + ", " + "[n] = " + n + ", "
									+ "[c] = " + c + ", " + "[s] = " + s + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decision2branchImpl.pattern_decision2branch_24_6_createcorrespondence_greenFBBB(d, c, ccMatch);
				//nothing S2B a2c = (S2B) result6_green[0];

				Object[] result7_black = decision2branchImpl
						.pattern_decision2branch_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decision2branchImpl.pattern_decision2branch_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return decision2branchImpl.pattern_decision2branch_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Decision d, Node n, Branch c, Statement s, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Decision d, Statement s) {// 
		Object[] result1_black = decision2branchImpl.pattern_decision2branch_27_1_matchtggpattern_blackBB(d, s);
		if (result1_black != null) {
			return decision2branchImpl.pattern_decision2branch_27_2_expressionF();
		} else {
			return decision2branchImpl.pattern_decision2branch_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Node n, Branch c) {// 
		Object[] result1_black = decision2branchImpl.pattern_decision2branch_28_1_matchtggpattern_blackBB(n, c);
		if (result1_black != null) {
			return decision2branchImpl.pattern_decision2branch_28_2_expressionF();
		} else {
			return decision2branchImpl.pattern_decision2branch_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2N s2nParameter) {

		Object[] result1_black = decision2branchImpl.pattern_decision2branch_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decision2branchImpl.pattern_decision2branch_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : decision2branchImpl
				.pattern_decision2branch_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList s2nList = (RuleEntryList) result2_black[0];
			S2N s2n = (S2N) result2_black[1];
			Node n = (Node) result2_black[2];
			Statement s = (Statement) result2_black[3];

			Object[] result3_bindingAndBlack = decision2branchImpl
					.pattern_decision2branch_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, s2n, n, s,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s2n] = " + s2n + ", " + "[n] = " + n
						+ ", " + "[s] = " + s + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decision2branchImpl.pattern_decision2branch_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decision2branchImpl.pattern_decision2branch_29_5_checknacs_blackBBB(s2n, n, s);
				if (result5_black != null) {

					Object[] result6_black = decision2branchImpl.pattern_decision2branch_29_6_perform_blackBBBB(s2n, n,
							s, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[s2n] = " + s2n + ", "
								+ "[n] = " + n + ", " + "[s] = " + s + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decision2branchImpl.pattern_decision2branch_29_6_perform_greenFFBFBB(n, s, ruleResult);
					//nothing S2B a2c = (S2B) result6_green[0];
					//nothing Decision d = (Decision) result6_green[1];
					//nothing Branch c = (Branch) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return decision2branchImpl.pattern_decision2branch_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2N s2n, Node n, Statement s,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s2n", s2n);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("s", s);
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
		case RulesPackage.DECISION2BRANCH___IS_APPROPRIATE_FWD__MATCH_DECISION_STATEMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Statement) arguments.get(2));
		case RulesPackage.DECISION2BRANCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_STATEMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Statement) arguments.get(2));
			return null;
		case RulesPackage.DECISION2BRANCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_STATEMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Statement) arguments.get(2));
		case RulesPackage.DECISION2BRANCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2N_DECISION_NODE_STATEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (S2N) arguments.get(1),
					(Decision) arguments.get(2), (Node) arguments.get(3), (Statement) arguments.get(4));
		case RulesPackage.DECISION2BRANCH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.DECISION2BRANCH___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___IS_APPROPRIATE_BWD__MATCH_NODE_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Node) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.DECISION2BRANCH___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NODE_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Node) arguments.get(1), (Branch) arguments.get(2));
			return null;
		case RulesPackage.DECISION2BRANCH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NODE_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Node) arguments.get(1),
					(Branch) arguments.get(2));
		case RulesPackage.DECISION2BRANCH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2N_NODE_BRANCH_STATEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2N) arguments.get(1),
					(Node) arguments.get(2), (Branch) arguments.get(3), (Statement) arguments.get(4));
		case RulesPackage.DECISION2BRANCH___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.DECISION2BRANCH___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___IS_APPROPRIATE_BWD_EMOFLON_EDGE_127__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_127((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_127__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_127((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECISION2BRANCH___IS_APPLICABLE_SOLVE_CSP_CC__DECISION_NODE_BRANCH_STATEMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Decision) arguments.get(0), (Node) arguments.get(1),
					(Branch) arguments.get(2), (Statement) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.DECISION2BRANCH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECISION2BRANCH___CHECK_DEC_FWD__DECISION_STATEMENT:
			return checkDEC_FWD((Decision) arguments.get(0), (Statement) arguments.get(1));
		case RulesPackage.DECISION2BRANCH___CHECK_DEC_BWD__NODE_BRANCH:
			return checkDEC_BWD((Node) arguments.get(0), (Branch) arguments.get(1));
		case RulesPackage.DECISION2BRANCH___GENERATE_MODEL__RULEENTRYCONTAINER_S2N:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2N) arguments.get(1));
		case RulesPackage.DECISION2BRANCH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2N_NODE_STATEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2N) arguments.get(1),
					(Node) arguments.get(2), (Statement) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECISION2BRANCH___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decision2branch_0_1_initialbindings_blackBBBB(decision2branch _this,
			Match match, Decision d, Statement s) {
		if (!d.equals(s)) {
			return new Object[] { _this, match, d, s };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_0_2_SolveCSP_bindingFBBBB(decision2branch _this, Match match,
			Decision d, Statement s) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, d, s);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, d, s };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decision2branch_0_2_SolveCSP_bindingAndBlackFBBBB(decision2branch _this,
			Match match, Decision d, Statement s) {
		Object[] result_pattern_decision2branch_0_2_SolveCSP_binding = pattern_decision2branch_0_2_SolveCSP_bindingFBBBB(
				_this, match, d, s);
		if (result_pattern_decision2branch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decision2branch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decision2branch_0_2_SolveCSP_black = pattern_decision2branch_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decision2branch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, d, s };
			}
		}
		return null;
	}

	public static final boolean pattern_decision2branch_0_3_CheckCSP_expressionFBB(decision2branch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decision2branch_0_4_collectelementstobetranslated_blackBBB(Match match,
			Decision d, Statement s) {
		if (!d.equals(s)) {
			return new Object[] { match, d, s };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Decision d, Statement s) {
		EMoflonEdge s__d____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(d);
		String s__d____next_name_prime = "next";
		s__d____next.setSrc(s);
		s__d____next.setTrg(d);
		match.getToBeTranslatedEdges().add(s__d____next);
		s__d____next.setName(s__d____next_name_prime);
		return new Object[] { match, d, s, s__d____next };
	}

	public static final Object[] pattern_decision2branch_0_5_collectcontextelements_blackBBB(Match match, Decision d,
			Statement s) {
		if (!d.equals(s)) {
			return new Object[] { match, d, s };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_0_5_collectcontextelements_greenBB(Match match, Statement s) {
		match.getContextNodes().add(s);
		return new Object[] { match, s };
	}

	public static final void pattern_decision2branch_0_6_registerobjectstomatch_expressionBBBB(decision2branch _this,
			Match match, Decision d, Statement s) {
		_this.registerObjectsToMatch_FWD(match, d, s);

	}

	public static final boolean pattern_decision2branch_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decision2branch_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decision2branch_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("s2n");
		EObject _localVariable_1 = isApplicableMatch.getObject("d");
		EObject _localVariable_2 = isApplicableMatch.getObject("n");
		EObject _localVariable_3 = isApplicableMatch.getObject("s");
		EObject tmpS2n = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpN = _localVariable_2;
		EObject tmpS = _localVariable_3;
		if (tmpS2n instanceof S2N) {
			S2N s2n = (S2N) tmpS2n;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (tmpN instanceof Node) {
					Node n = (Node) tmpN;
					if (tmpS instanceof Statement) {
						Statement s = (Statement) tmpS;
						return new Object[] { s2n, d, n, s, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_1_1_performtransformation_blackBBBBFBB(S2N s2n, Decision d,
			Node n, Statement s, decision2branch _this, IsApplicableMatch isApplicableMatch) {
		if (!d.equals(s)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { s2n, d, n, s, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_1_1_performtransformation_bindingAndBlackFFFFFBB(
			decision2branch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decision2branch_1_1_performtransformation_binding = pattern_decision2branch_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_decision2branch_1_1_performtransformation_binding != null) {
			S2N s2n = (S2N) result_pattern_decision2branch_1_1_performtransformation_binding[0];
			Decision d = (Decision) result_pattern_decision2branch_1_1_performtransformation_binding[1];
			Node n = (Node) result_pattern_decision2branch_1_1_performtransformation_binding[2];
			Statement s = (Statement) result_pattern_decision2branch_1_1_performtransformation_binding[3];

			Object[] result_pattern_decision2branch_1_1_performtransformation_black = pattern_decision2branch_1_1_performtransformation_blackBBBBFBB(
					s2n, d, n, s, _this, isApplicableMatch);
			if (result_pattern_decision2branch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decision2branch_1_1_performtransformation_black[4];

				return new Object[] { s2n, d, n, s, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_1_1_performtransformation_greenFBBF(Decision d, Node n) {
		S2B a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch c = ControlflowFactory.eINSTANCE.createBranch();
		a2c.setSource(d);
		n.setNext(c);
		a2c.setTarget(c);
		return new Object[] { a2c, d, n, c };
	}

	public static final Object[] pattern_decision2branch_1_2_collecttranslatedelements_blackBBB(S2B a2c, Decision d,
			Branch c) {
		return new Object[] { a2c, d, c };
	}

	public static final Object[] pattern_decision2branch_1_2_collecttranslatedelements_greenFBBB(S2B a2c, Decision d,
			Branch c) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2c);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getCreatedElements().add(c);
		return new Object[] { ruleresult, a2c, d, c };
	}

	public static final Object[] pattern_decision2branch_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject a2c, EObject s2n, EObject d, EObject n, EObject c, EObject s) {
		if (!a2c.equals(s2n)) {
			if (!a2c.equals(d)) {
				if (!a2c.equals(n)) {
					if (!a2c.equals(c)) {
						if (!a2c.equals(s)) {
							if (!d.equals(s2n)) {
								if (!d.equals(n)) {
									if (!d.equals(s)) {
										if (!n.equals(s2n)) {
											if (!n.equals(s)) {
												if (!c.equals(s2n)) {
													if (!c.equals(d)) {
														if (!c.equals(n)) {
															if (!c.equals(s)) {
																if (!s.equals(s2n)) {
																	return new Object[] { ruleresult, a2c, s2n, d, n, c,
																			s };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decision2branch_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject a2c, EObject d, EObject n, EObject c, EObject s) {
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s__d____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decision2branch";
		String n__c____next_name_prime = "next";
		String a2c__d____source_name_prime = "source";
		String a2c__c____target_name_prime = "target";
		String s__d____next_name_prime = "next";
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(n__c____next);
		a2c__d____source.setSrc(a2c);
		a2c__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(a2c__d____source);
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		ruleresult.getCreatedEdges().add(a2c__c____target);
		s__d____next.setSrc(s);
		s__d____next.setTrg(d);
		ruleresult.getTranslatedEdges().add(s__d____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		n__c____next.setName(n__c____next_name_prime);
		a2c__d____source.setName(a2c__d____source_name_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		s__d____next.setName(s__d____next_name_prime);
		return new Object[] { ruleresult, a2c, d, n, c, s, n__c____next, a2c__d____source, a2c__c____target,
				s__d____next };
	}

	public static final void pattern_decision2branch_1_5_registerobjects_expressionBBBBBBBB(decision2branch _this,
			PerformRuleResult ruleresult, EObject a2c, EObject s2n, EObject d, EObject n, EObject c, EObject s) {
		_this.registerObjects_FWD(ruleresult, a2c, s2n, d, n, c, s);

	}

	public static final PerformRuleResult pattern_decision2branch_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decision2branch_2_1_preparereturnvalue_bindingFB(decision2branch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_2_1_preparereturnvalue_blackFBB(EClass eClass,
			decision2branch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decision2branch_2_1_preparereturnvalue_bindingAndBlackFFB(
			decision2branch _this) {
		Object[] result_pattern_decision2branch_2_1_preparereturnvalue_binding = pattern_decision2branch_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decision2branch_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decision2branch_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decision2branch_2_1_preparereturnvalue_black = pattern_decision2branch_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decision2branch_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decision2branch_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decision2branch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decision2branch_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("d");
		EObject _localVariable_1 = match.getObject("s");
		EObject tmpD = _localVariable_0;
		EObject tmpS = _localVariable_1;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpS instanceof Statement) {
				Statement s = (Statement) tmpS;
				return new Object[] { d, s, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decision2branch_2_2_corematch_blackFBFBB(Decision d, Statement s,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!d.equals(s)) {
			for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s, S2N.class, "source")) {
				Node n = s2n.getTarget();
				if (n != null) {
					_result.add(new Object[] { s2n, d, n, s, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decision2branch_2_3_findcontext_blackBBBB(S2N s2n, Decision d,
			Node n, Statement s) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!d.equals(s)) {
			if (n.equals(s2n.getTarget())) {
				if (s.equals(s2n.getSource())) {
					if (d.equals(s.getNext())) {
						_result.add(new Object[] { s2n, d, n, s });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decision2branch_2_3_findcontext_greenBBBBFFFF(S2N s2n, Decision d, Node n,
			Statement s) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s__d____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String s2n__n____target_name_prime = "target";
		String s2n__s____source_name_prime = "source";
		String s__d____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(s2n);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(s);
		s2n__n____target.setSrc(s2n);
		s2n__n____target.setTrg(n);
		isApplicableMatch.getAllContextElements().add(s2n__n____target);
		s2n__s____source.setSrc(s2n);
		s2n__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2n__s____source);
		s__d____next.setSrc(s);
		s__d____next.setTrg(d);
		isApplicableMatch.getAllContextElements().add(s__d____next);
		s2n__n____target.setName(s2n__n____target_name_prime);
		s2n__s____source.setName(s2n__s____source_name_prime);
		s__d____next.setName(s__d____next_name_prime);
		return new Object[] { s2n, d, n, s, isApplicableMatch, s2n__n____target, s2n__s____source, s__d____next };
	}

	public static final Object[] pattern_decision2branch_2_4_solveCSP_bindingFBBBBBB(decision2branch _this,
			IsApplicableMatch isApplicableMatch, S2N s2n, Decision d, Node n, Statement s) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, s2n, d, n, s);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s2n, d, n, s };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decision2branch_2_4_solveCSP_bindingAndBlackFBBBBBB(decision2branch _this,
			IsApplicableMatch isApplicableMatch, S2N s2n, Decision d, Node n, Statement s) {
		Object[] result_pattern_decision2branch_2_4_solveCSP_binding = pattern_decision2branch_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, s2n, d, n, s);
		if (result_pattern_decision2branch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decision2branch_2_4_solveCSP_binding[0];

			Object[] result_pattern_decision2branch_2_4_solveCSP_black = pattern_decision2branch_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decision2branch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s2n, d, n, s };
			}
		}
		return null;
	}

	public static final boolean pattern_decision2branch_2_5_checkCSP_expressionFBB(decision2branch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decision2branch_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decision2branch_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decision2branch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decision2branch_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decision2branch_10_1_initialbindings_blackBBBB(decision2branch _this,
			Match match, Node n, Branch c) {
		if (!c.equals(n)) {
			return new Object[] { _this, match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_10_2_SolveCSP_bindingFBBBB(decision2branch _this, Match match,
			Node n, Branch c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, n, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decision2branch_10_2_SolveCSP_bindingAndBlackFBBBB(decision2branch _this,
			Match match, Node n, Branch c) {
		Object[] result_pattern_decision2branch_10_2_SolveCSP_binding = pattern_decision2branch_10_2_SolveCSP_bindingFBBBB(
				_this, match, n, c);
		if (result_pattern_decision2branch_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decision2branch_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decision2branch_10_2_SolveCSP_black = pattern_decision2branch_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decision2branch_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, n, c };
			}
		}
		return null;
	}

	public static final boolean pattern_decision2branch_10_3_CheckCSP_expressionFBB(decision2branch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decision2branch_10_4_collectelementstobetranslated_blackBBB(Match match,
			Node n, Branch c) {
		if (!c.equals(n)) {
			return new Object[] { match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_10_4_collectelementstobetranslated_greenBBBF(Match match,
			Node n, Branch c) {
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		String n__c____next_name_prime = "next";
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(n__c____next);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { match, n, c, n__c____next };
	}

	public static final Object[] pattern_decision2branch_10_5_collectcontextelements_blackBBB(Match match, Node n,
			Branch c) {
		if (!c.equals(n)) {
			return new Object[] { match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_10_5_collectcontextelements_greenBB(Match match, Node n) {
		match.getContextNodes().add(n);
		return new Object[] { match, n };
	}

	public static final void pattern_decision2branch_10_6_registerobjectstomatch_expressionBBBB(decision2branch _this,
			Match match, Node n, Branch c) {
		_this.registerObjectsToMatch_BWD(match, n, c);

	}

	public static final boolean pattern_decision2branch_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decision2branch_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decision2branch_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("s2n");
		EObject _localVariable_1 = isApplicableMatch.getObject("n");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("s");
		EObject tmpS2n = _localVariable_0;
		EObject tmpN = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpS = _localVariable_3;
		if (tmpS2n instanceof S2N) {
			S2N s2n = (S2N) tmpS2n;
			if (tmpN instanceof Node) {
				Node n = (Node) tmpN;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpS instanceof Statement) {
						Statement s = (Statement) tmpS;
						return new Object[] { s2n, n, c, s, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_11_1_performtransformation_blackBBBBFBB(S2N s2n, Node n,
			Branch c, Statement s, decision2branch _this, IsApplicableMatch isApplicableMatch) {
		if (!c.equals(n)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { s2n, n, c, s, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_11_1_performtransformation_bindingAndBlackFFFFFBB(
			decision2branch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decision2branch_11_1_performtransformation_binding = pattern_decision2branch_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_decision2branch_11_1_performtransformation_binding != null) {
			S2N s2n = (S2N) result_pattern_decision2branch_11_1_performtransformation_binding[0];
			Node n = (Node) result_pattern_decision2branch_11_1_performtransformation_binding[1];
			Branch c = (Branch) result_pattern_decision2branch_11_1_performtransformation_binding[2];
			Statement s = (Statement) result_pattern_decision2branch_11_1_performtransformation_binding[3];

			Object[] result_pattern_decision2branch_11_1_performtransformation_black = pattern_decision2branch_11_1_performtransformation_blackBBBBFBB(
					s2n, n, c, s, _this, isApplicableMatch);
			if (result_pattern_decision2branch_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decision2branch_11_1_performtransformation_black[4];

				return new Object[] { s2n, n, c, s, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_11_1_performtransformation_greenFFBB(Branch c, Statement s) {
		S2B a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision d = SourcecodeFactory.eINSTANCE.createDecision();
		a2c.setTarget(c);
		a2c.setSource(d);
		s.setNext(d);
		return new Object[] { a2c, d, c, s };
	}

	public static final Object[] pattern_decision2branch_11_2_collecttranslatedelements_blackBBB(S2B a2c, Decision d,
			Branch c) {
		return new Object[] { a2c, d, c };
	}

	public static final Object[] pattern_decision2branch_11_2_collecttranslatedelements_greenFBBB(S2B a2c, Decision d,
			Branch c) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2c);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getTranslatedElements().add(c);
		return new Object[] { ruleresult, a2c, d, c };
	}

	public static final Object[] pattern_decision2branch_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject a2c, EObject s2n, EObject d, EObject n, EObject c, EObject s) {
		if (!a2c.equals(s2n)) {
			if (!a2c.equals(d)) {
				if (!a2c.equals(n)) {
					if (!a2c.equals(c)) {
						if (!a2c.equals(s)) {
							if (!d.equals(s2n)) {
								if (!d.equals(n)) {
									if (!d.equals(s)) {
										if (!n.equals(s2n)) {
											if (!n.equals(s)) {
												if (!c.equals(s2n)) {
													if (!c.equals(d)) {
														if (!c.equals(n)) {
															if (!c.equals(s)) {
																if (!s.equals(s2n)) {
																	return new Object[] { ruleresult, a2c, s2n, d, n, c,
																			s };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decision2branch_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject a2c, EObject d, EObject n, EObject c, EObject s) {
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s__d____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decision2branch";
		String n__c____next_name_prime = "next";
		String a2c__d____source_name_prime = "source";
		String a2c__c____target_name_prime = "target";
		String s__d____next_name_prime = "next";
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(n__c____next);
		a2c__d____source.setSrc(a2c);
		a2c__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(a2c__d____source);
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		ruleresult.getCreatedEdges().add(a2c__c____target);
		s__d____next.setSrc(s);
		s__d____next.setTrg(d);
		ruleresult.getCreatedEdges().add(s__d____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		n__c____next.setName(n__c____next_name_prime);
		a2c__d____source.setName(a2c__d____source_name_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		s__d____next.setName(s__d____next_name_prime);
		return new Object[] { ruleresult, a2c, d, n, c, s, n__c____next, a2c__d____source, a2c__c____target,
				s__d____next };
	}

	public static final void pattern_decision2branch_11_5_registerobjects_expressionBBBBBBBB(decision2branch _this,
			PerformRuleResult ruleresult, EObject a2c, EObject s2n, EObject d, EObject n, EObject c, EObject s) {
		_this.registerObjects_BWD(ruleresult, a2c, s2n, d, n, c, s);

	}

	public static final PerformRuleResult pattern_decision2branch_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decision2branch_12_1_preparereturnvalue_bindingFB(decision2branch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_12_1_preparereturnvalue_blackFBB(EClass eClass,
			decision2branch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decision2branch_12_1_preparereturnvalue_bindingAndBlackFFB(
			decision2branch _this) {
		Object[] result_pattern_decision2branch_12_1_preparereturnvalue_binding = pattern_decision2branch_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decision2branch_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decision2branch_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decision2branch_12_1_preparereturnvalue_black = pattern_decision2branch_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decision2branch_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decision2branch_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decision2branch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decision2branch_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("n");
		EObject _localVariable_1 = match.getObject("c");
		EObject tmpN = _localVariable_0;
		EObject tmpC = _localVariable_1;
		if (tmpN instanceof Node) {
			Node n = (Node) tmpN;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				return new Object[] { n, c, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decision2branch_12_2_corematch_blackFBBFB(Node n, Branch c,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(n)) {
			for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n, S2N.class, "target")) {
				Statement s = s2n.getSource();
				if (s != null) {
					_result.add(new Object[] { s2n, n, c, s, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decision2branch_12_3_findcontext_blackBBBB(S2N s2n, Node n, Branch c,
			Statement s) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(n)) {
			if (c.equals(n.getNext())) {
				if (n.equals(s2n.getTarget())) {
					if (s.equals(s2n.getSource())) {
						_result.add(new Object[] { s2n, n, c, s });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decision2branch_12_3_findcontext_greenBBBBFFFF(S2N s2n, Node n, Branch c,
			Statement s) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String n__c____next_name_prime = "next";
		String s2n__n____target_name_prime = "target";
		String s2n__s____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(s2n);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(s);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(n__c____next);
		s2n__n____target.setSrc(s2n);
		s2n__n____target.setTrg(n);
		isApplicableMatch.getAllContextElements().add(s2n__n____target);
		s2n__s____source.setSrc(s2n);
		s2n__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2n__s____source);
		n__c____next.setName(n__c____next_name_prime);
		s2n__n____target.setName(s2n__n____target_name_prime);
		s2n__s____source.setName(s2n__s____source_name_prime);
		return new Object[] { s2n, n, c, s, isApplicableMatch, n__c____next, s2n__n____target, s2n__s____source };
	}

	public static final Object[] pattern_decision2branch_12_4_solveCSP_bindingFBBBBBB(decision2branch _this,
			IsApplicableMatch isApplicableMatch, S2N s2n, Node n, Branch c, Statement s) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, s2n, n, c, s);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s2n, n, c, s };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decision2branch_12_4_solveCSP_bindingAndBlackFBBBBBB(decision2branch _this,
			IsApplicableMatch isApplicableMatch, S2N s2n, Node n, Branch c, Statement s) {
		Object[] result_pattern_decision2branch_12_4_solveCSP_binding = pattern_decision2branch_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, s2n, n, c, s);
		if (result_pattern_decision2branch_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decision2branch_12_4_solveCSP_binding[0];

			Object[] result_pattern_decision2branch_12_4_solveCSP_black = pattern_decision2branch_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decision2branch_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s2n, n, c, s };
			}
		}
		return null;
	}

	public static final boolean pattern_decision2branch_12_5_checkCSP_expressionFBB(decision2branch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decision2branch_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decision2branch_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decision2branch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decision2branch_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decision2branch_20_1_preparereturnvalue_bindingFB(decision2branch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decision2branch _this) {
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

	public static final Object[] pattern_decision2branch_20_1_preparereturnvalue_bindingAndBlackFFBF(
			decision2branch _this) {
		Object[] result_pattern_decision2branch_20_1_preparereturnvalue_binding = pattern_decision2branch_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decision2branch_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decision2branch_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decision2branch_20_1_preparereturnvalue_black = pattern_decision2branch_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decision2branch_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decision2branch_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decision2branch_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decision2branch_20_2_testcorematchandDECs_black_nac_0B(Branch c) {
		for (Graph __DEC_c_root_26914 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Graph.class, "root")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_20_2_testcorematchandDECs_black_nac_1BB(Branch c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_positive_724189 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_c_positive_724189)) {
					if (!n.equals(__DEC_c_positive_724189)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_20_2_testcorematchandDECs_black_nac_2BB(Branch c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_negative_766347 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_c_negative_766347)) {
					if (!n.equals(__DEC_c_negative_766347)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decision2branch_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpN = _edge_next.getSrc();
		if (tmpN instanceof Node) {
			Node n = (Node) tmpN;
			EObject tmpC = _edge_next.getTrg();
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (!c.equals(n)) {
					if (c.equals(n.getNext())) {
						if (pattern_decision2branch_20_2_testcorematchandDECs_black_nac_0B(c) == null) {
							if (pattern_decision2branch_20_2_testcorematchandDECs_black_nac_1BB(c, n) == null) {
								if (pattern_decision2branch_20_2_testcorematchandDECs_black_nac_2BB(c, n) == null) {
									_result.add(new Object[] { n, c, _edge_next });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_decision2branch_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decision2branch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			decision2branch _this, Match match, Node n, Branch c) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, n, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decision2branch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decision2branch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decision2branch_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decision2branch_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decision2branch_21_1_preparereturnvalue_bindingFB(decision2branch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decision2branch _this) {
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

	public static final Object[] pattern_decision2branch_21_1_preparereturnvalue_bindingAndBlackFFBF(
			decision2branch _this) {
		Object[] result_pattern_decision2branch_21_1_preparereturnvalue_binding = pattern_decision2branch_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decision2branch_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decision2branch_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decision2branch_21_1_preparereturnvalue_black = pattern_decision2branch_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decision2branch_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decision2branch_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decision2branch_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decision2branch_21_2_testcorematchandDECs_black_nac_0BB(Decision d,
			Statement s) {
		if (!d.equals(s)) {
			for (Decision __DEC_d_positive_434852 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(d, Decision.class, "positive")) {
				if (!d.equals(__DEC_d_positive_434852)) {
					if (!s.equals(__DEC_d_positive_434852)) {
						return new Object[] { d, s };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_21_2_testcorematchandDECs_black_nac_1BB(Decision d,
			Statement s) {
		if (!d.equals(s)) {
			for (Decision __DEC_d_negative_449864 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(d, Decision.class, "negative")) {
				if (!d.equals(__DEC_d_negative_449864)) {
					if (!s.equals(__DEC_d_negative_449864)) {
						return new Object[] { d, s };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_21_2_testcorematchandDECs_black_nac_2BB(Decision d,
			Statement s) {
		if (!d.equals(s)) {
			for (While __DEC_d_first_38556 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
					While.class, "first")) {
				if (!s.equals(__DEC_d_first_38556)) {
					return new Object[] { d, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_21_2_testcorematchandDECs_black_nac_3BB(Decision d,
			Statement s) {
		if (!d.equals(s)) {
			for (While __DEC_d_last_498259 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
					While.class, "last")) {
				if (!s.equals(__DEC_d_last_498259)) {
					return new Object[] { d, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_21_2_testcorematchandDECs_black_nac_4B(Decision d) {
		for (Program __DEC_d_first_447964 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decision2branch_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpS = _edge_next.getSrc();
		if (tmpS instanceof Statement) {
			Statement s = (Statement) tmpS;
			EObject tmpD = _edge_next.getTrg();
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (!d.equals(s)) {
					if (d.equals(s.getNext())) {
						if (pattern_decision2branch_21_2_testcorematchandDECs_black_nac_0BB(d, s) == null) {
							if (pattern_decision2branch_21_2_testcorematchandDECs_black_nac_1BB(d, s) == null) {
								if (pattern_decision2branch_21_2_testcorematchandDECs_black_nac_2BB(d, s) == null) {
									if (pattern_decision2branch_21_2_testcorematchandDECs_black_nac_3BB(d, s) == null) {
										if (pattern_decision2branch_21_2_testcorematchandDECs_black_nac_4B(d) == null) {
											_result.add(new Object[] { d, s, _edge_next });
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

	public static final Object[] pattern_decision2branch_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decision2branch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			decision2branch _this, Match match, Decision d, Statement s) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, d, s);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decision2branch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decision2branch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decision2branch_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decision2branch_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decision2branch_24_1_prepare_blackB(decision2branch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decision2branch_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_decision2branch_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("d");
		EObject _localVariable_1 = targetMatch.getObject("n");
		EObject _localVariable_2 = targetMatch.getObject("c");
		EObject _localVariable_3 = sourceMatch.getObject("s");
		EObject tmpD = _localVariable_0;
		EObject tmpN = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpS = _localVariable_3;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpN instanceof Node) {
				Node n = (Node) tmpN;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpS instanceof Statement) {
						Statement s = (Statement) tmpS;
						return new Object[] { d, n, c, s, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_24_2_matchsrctrgcontext_blackBBBBBB(Decision d, Node n,
			Branch c, Statement s, Match sourceMatch, Match targetMatch) {
		if (!d.equals(s)) {
			if (!c.equals(n)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { d, n, c, s, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decision2branch_24_2_matchsrctrgcontext_binding = pattern_decision2branch_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_decision2branch_24_2_matchsrctrgcontext_binding != null) {
			Decision d = (Decision) result_pattern_decision2branch_24_2_matchsrctrgcontext_binding[0];
			Node n = (Node) result_pattern_decision2branch_24_2_matchsrctrgcontext_binding[1];
			Branch c = (Branch) result_pattern_decision2branch_24_2_matchsrctrgcontext_binding[2];
			Statement s = (Statement) result_pattern_decision2branch_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_decision2branch_24_2_matchsrctrgcontext_black = pattern_decision2branch_24_2_matchsrctrgcontext_blackBBBBBB(
					d, n, c, s, sourceMatch, targetMatch);
			if (result_pattern_decision2branch_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { d, n, c, s, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_24_3_solvecsp_bindingFBBBBBBB(decision2branch _this,
			Decision d, Node n, Branch c, Statement s, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(d, n, c, s, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, d, n, c, s, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decision2branch_24_3_solvecsp_bindingAndBlackFBBBBBBB(decision2branch _this,
			Decision d, Node n, Branch c, Statement s, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decision2branch_24_3_solvecsp_binding = pattern_decision2branch_24_3_solvecsp_bindingFBBBBBBB(
				_this, d, n, c, s, sourceMatch, targetMatch);
		if (result_pattern_decision2branch_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decision2branch_24_3_solvecsp_binding[0];

			Object[] result_pattern_decision2branch_24_3_solvecsp_black = pattern_decision2branch_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decision2branch_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, d, n, c, s, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decision2branch_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decision2branch_24_5_matchcorrcontext_blackFBBBB(Node n, Statement s,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n, S2N.class, "target")) {
				if (s.equals(s2n.getSource())) {
					_result.add(new Object[] { s2n, n, s, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decision2branch_24_5_matchcorrcontext_greenBBBF(S2N s2n, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "decision2branch";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(s2n);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { s2n, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_decision2branch_24_6_createcorrespondence_blackBBBBB(Decision d, Node n,
			Branch c, Statement s, CCMatch ccMatch) {
		if (!d.equals(s)) {
			if (!c.equals(n)) {
				return new Object[] { d, n, c, s, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_24_6_createcorrespondence_greenFBBB(Decision d, Branch c,
			CCMatch ccMatch) {
		S2B a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2c.setSource(d);
		a2c.setTarget(c);
		ccMatch.getCreateCorr().add(a2c);
		return new Object[] { a2c, d, c, ccMatch };
	}

	public static final Object[] pattern_decision2branch_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_decision2branch_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "decision2branch";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_decision2branch_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_decision2branch_27_1_matchtggpattern_black_nac_0BB(Decision d, Statement s) {
		if (!d.equals(s)) {
			for (Decision __DEC_d_positive_864562 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(d, Decision.class, "positive")) {
				if (!d.equals(__DEC_d_positive_864562)) {
					if (!s.equals(__DEC_d_positive_864562)) {
						return new Object[] { d, s };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_27_1_matchtggpattern_black_nac_1BB(Decision d, Statement s) {
		if (!d.equals(s)) {
			for (Decision __DEC_d_negative_833054 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(d, Decision.class, "negative")) {
				if (!d.equals(__DEC_d_negative_833054)) {
					if (!s.equals(__DEC_d_negative_833054)) {
						return new Object[] { d, s };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_27_1_matchtggpattern_black_nac_2BB(Decision d, Statement s) {
		if (!d.equals(s)) {
			for (While __DEC_d_first_898303 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
					While.class, "first")) {
				if (!s.equals(__DEC_d_first_898303)) {
					return new Object[] { d, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_27_1_matchtggpattern_black_nac_3BB(Decision d, Statement s) {
		if (!d.equals(s)) {
			for (While __DEC_d_last_555658 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
					While.class, "last")) {
				if (!s.equals(__DEC_d_last_555658)) {
					return new Object[] { d, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_27_1_matchtggpattern_black_nac_4B(Decision d) {
		for (Program __DEC_d_first_213078 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_27_1_matchtggpattern_blackBB(Decision d, Statement s) {
		if (!d.equals(s)) {
			if (d.equals(s.getNext())) {
				if (pattern_decision2branch_27_1_matchtggpattern_black_nac_0BB(d, s) == null) {
					if (pattern_decision2branch_27_1_matchtggpattern_black_nac_1BB(d, s) == null) {
						if (pattern_decision2branch_27_1_matchtggpattern_black_nac_2BB(d, s) == null) {
							if (pattern_decision2branch_27_1_matchtggpattern_black_nac_3BB(d, s) == null) {
								if (pattern_decision2branch_27_1_matchtggpattern_black_nac_4B(d) == null) {
									return new Object[] { d, s };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_decision2branch_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decision2branch_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decision2branch_28_1_matchtggpattern_black_nac_0B(Branch c) {
		for (Graph __DEC_c_root_789748 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Graph.class, "root")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_28_1_matchtggpattern_black_nac_1BB(Branch c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_positive_331898 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_c_positive_331898)) {
					if (!n.equals(__DEC_c_positive_331898)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_28_1_matchtggpattern_black_nac_2BB(Branch c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_negative_575175 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_c_negative_575175)) {
					if (!n.equals(__DEC_c_negative_575175)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_28_1_matchtggpattern_blackBB(Node n, Branch c) {
		if (!c.equals(n)) {
			if (c.equals(n.getNext())) {
				if (pattern_decision2branch_28_1_matchtggpattern_black_nac_0B(c) == null) {
					if (pattern_decision2branch_28_1_matchtggpattern_black_nac_1BB(c, n) == null) {
						if (pattern_decision2branch_28_1_matchtggpattern_black_nac_2BB(c, n) == null) {
							return new Object[] { n, c };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_decision2branch_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decision2branch_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decision2branch_29_1_createresult_blackB(decision2branch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decision2branch_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_decision2branch_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2N s2n) {
		if (ruleResult.getCorrObjects().contains(s2n)) {
			return new Object[] { ruleResult, s2n };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Node n) {
		if (ruleResult.getTargetObjects().contains(n)) {
			return new Object[] { ruleResult, n };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Statement s) {
		if (ruleResult.getSourceObjects().contains(s)) {
			return new Object[] { ruleResult, s };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decision2branch_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList s2nList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpS2n : s2nList.getEntryObjects()) {
				if (tmpS2n instanceof S2N) {
					S2N s2n = (S2N) tmpS2n;
					Node n = s2n.getTarget();
					if (n != null) {
						Statement s = s2n.getSource();
						if (s != null) {
							if (pattern_decision2branch_29_2_isapplicablecore_black_nac_0BB(ruleResult, s2n) == null) {
								if (pattern_decision2branch_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										n) == null) {
									if (pattern_decision2branch_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											s) == null) {
										_result.add(
												new Object[] { s2nList, s2n, n, s, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_decision2branch_29_3_solveCSP_bindingFBBBBBB(decision2branch _this,
			IsApplicableMatch isApplicableMatch, S2N s2n, Node n, Statement s, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, s2n, n, s, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s2n, n, s, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decision2branch_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decision2branch_29_3_solveCSP_bindingAndBlackFBBBBBB(decision2branch _this,
			IsApplicableMatch isApplicableMatch, S2N s2n, Node n, Statement s, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decision2branch_29_3_solveCSP_binding = pattern_decision2branch_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, s2n, n, s, ruleResult);
		if (result_pattern_decision2branch_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decision2branch_29_3_solveCSP_binding[0];

			Object[] result_pattern_decision2branch_29_3_solveCSP_black = pattern_decision2branch_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decision2branch_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s2n, n, s, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decision2branch_29_4_checkCSP_expressionFBB(decision2branch _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decision2branch_29_5_checknacs_blackBBB(S2N s2n, Node n, Statement s) {
		return new Object[] { s2n, n, s };
	}

	public static final Object[] pattern_decision2branch_29_6_perform_blackBBBB(S2N s2n, Node n, Statement s,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { s2n, n, s, ruleResult };
	}

	public static final Object[] pattern_decision2branch_29_6_perform_greenFFBFBB(Node n, Statement s,
			ModelgeneratorRuleResult ruleResult) {
		S2B a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision d = SourcecodeFactory.eINSTANCE.createDecision();
		Branch c = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2c);
		a2c.setSource(d);
		s.setNext(d);
		ruleResult.getSourceObjects().add(d);
		n.setNext(c);
		a2c.setTarget(c);
		ruleResult.getTargetObjects().add(c);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a2c, d, n, c, s, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decision2branch_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decision2branchImpl