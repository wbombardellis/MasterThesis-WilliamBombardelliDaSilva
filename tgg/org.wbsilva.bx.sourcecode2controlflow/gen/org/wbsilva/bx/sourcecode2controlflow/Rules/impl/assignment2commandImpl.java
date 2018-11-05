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
import org.wbsilva.bx.sourcecode2controlflow.Rules.assignment2command;

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
 * An implementation of the model object '<em><b>assignment2command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class assignment2commandImpl extends AbstractRuleImpl implements assignment2command {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected assignment2commandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getassignment2command();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment a, Statement s) {

		Object[] result1_black = assignment2commandImpl.pattern_assignment2command_0_1_initialbindings_blackBBBB(this,
				match, a, s);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[s] = " + s + ".");
		}

		Object[] result2_bindingAndBlack = assignment2commandImpl
				.pattern_assignment2command_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, a, s);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[s] = " + s + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (assignment2commandImpl.pattern_assignment2command_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = assignment2commandImpl
					.pattern_assignment2command_0_4_collectelementstobetranslated_blackBBB(match, a, s);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[s] = " + s + ".");
			}
			assignment2commandImpl.pattern_assignment2command_0_4_collectelementstobetranslated_greenBBBF(match, a, s);
			//nothing EMoflonEdge s__a____next = (EMoflonEdge) result4_green[3];

			Object[] result5_black = assignment2commandImpl
					.pattern_assignment2command_0_5_collectcontextelements_blackBBB(match, a, s);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[s] = " + s + ".");
			}
			assignment2commandImpl.pattern_assignment2command_0_5_collectcontextelements_greenBB(match, s);

			// 
			assignment2commandImpl.pattern_assignment2command_0_6_registerobjectstomatch_expressionBBBB(this, match, a,
					s);
			return assignment2commandImpl.pattern_assignment2command_0_7_expressionF();
		} else {
			return assignment2commandImpl.pattern_assignment2command_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = assignment2commandImpl
				.pattern_assignment2command_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment a = (Assignment) result1_bindingAndBlack[0];
		Node n = (Node) result1_bindingAndBlack[1];
		Statement s = (Statement) result1_bindingAndBlack[2];
		S2N s2n = (S2N) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = assignment2commandImpl
				.pattern_assignment2command_1_1_performtransformation_greenBBFF(a, n);
		Command c = (Command) result1_green[2];
		S2N a2c = (S2N) result1_green[3];

		Object[] result2_black = assignment2commandImpl
				.pattern_assignment2command_1_2_collecttranslatedelements_blackBBB(a, c, a2c);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[c] = " + c
					+ ", " + "[a2c] = " + a2c + ".");
		}
		Object[] result2_green = assignment2commandImpl
				.pattern_assignment2command_1_2_collecttranslatedelements_greenFBBB(a, c, a2c);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = assignment2commandImpl
				.pattern_assignment2command_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, a, n, s, s2n, c, a2c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[n] = " + n + ", " + "[s] = " + s + ", " + "[s2n] = " + s2n + ", "
					+ "[c] = " + c + ", " + "[a2c] = " + a2c + ".");
		}
		assignment2commandImpl.pattern_assignment2command_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, a, n, s,
				c, a2c);
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge a2c__a____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		assignment2commandImpl.pattern_assignment2command_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, a, n,
				s, s2n, c, a2c);
		return assignment2commandImpl.pattern_assignment2command_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = assignment2commandImpl
				.pattern_assignment2command_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = assignment2commandImpl
				.pattern_assignment2command_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = assignment2commandImpl.pattern_assignment2command_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment a = (Assignment) result2_binding[0];
		Statement s = (Statement) result2_binding[1];
		for (Object[] result2_black : assignment2commandImpl.pattern_assignment2command_2_2_corematch_blackBFBFB(a, s,
				match)) {
			Node n = (Node) result2_black[1];
			S2N s2n = (S2N) result2_black[3];
			// ForEach 
			for (Object[] result3_black : assignment2commandImpl.pattern_assignment2command_2_3_findcontext_blackBBBB(a,
					n, s, s2n)) {
				Object[] result3_green = assignment2commandImpl
						.pattern_assignment2command_2_3_findcontext_greenBBBBFFFF(a, n, s, s2n);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = assignment2commandImpl
						.pattern_assignment2command_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, a, n,
								s, s2n);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[n] = " + n
							+ ", " + "[s] = " + s + ", " + "[s2n] = " + s2n + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (assignment2commandImpl.pattern_assignment2command_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = assignment2commandImpl
							.pattern_assignment2command_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					assignment2commandImpl.pattern_assignment2command_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return assignment2commandImpl.pattern_assignment2command_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment a, Statement s) {
		match.registerObject("a", a);
		match.registerObject("s", s);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment a, Statement s) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment a, Node n, Statement s,
			S2N s2n) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("s2n", s2n);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a, EObject n, EObject s, EObject s2n,
			EObject c, EObject a2c) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2c", a2c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass())
				.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Node n, Command c) {

		Object[] result1_black = assignment2commandImpl.pattern_assignment2command_10_1_initialbindings_blackBBBB(this,
				match, n, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[n] = " + n + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = assignment2commandImpl
				.pattern_assignment2command_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, n, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[n] = " + n + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (assignment2commandImpl.pattern_assignment2command_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = assignment2commandImpl
					.pattern_assignment2command_10_4_collectelementstobetranslated_blackBBB(match, n, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[n] = " + n + ", " + "[c] = " + c + ".");
			}
			assignment2commandImpl.pattern_assignment2command_10_4_collectelementstobetranslated_greenBBBF(match, n, c);
			//nothing EMoflonEdge n__c____next = (EMoflonEdge) result4_green[3];

			Object[] result5_black = assignment2commandImpl
					.pattern_assignment2command_10_5_collectcontextelements_blackBBB(match, n, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[n] = " + n + ", " + "[c] = " + c + ".");
			}
			assignment2commandImpl.pattern_assignment2command_10_5_collectcontextelements_greenBB(match, n);

			// 
			assignment2commandImpl.pattern_assignment2command_10_6_registerobjectstomatch_expressionBBBB(this, match, n,
					c);
			return assignment2commandImpl.pattern_assignment2command_10_7_expressionF();
		} else {
			return assignment2commandImpl.pattern_assignment2command_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = assignment2commandImpl
				.pattern_assignment2command_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Node n = (Node) result1_bindingAndBlack[0];
		Statement s = (Statement) result1_bindingAndBlack[1];
		S2N s2n = (S2N) result1_bindingAndBlack[2];
		Command c = (Command) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = assignment2commandImpl
				.pattern_assignment2command_11_1_performtransformation_greenFBBF(s, c);
		Assignment a = (Assignment) result1_green[0];
		S2N a2c = (S2N) result1_green[3];

		Object[] result2_black = assignment2commandImpl
				.pattern_assignment2command_11_2_collecttranslatedelements_blackBBB(a, c, a2c);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[c] = " + c
					+ ", " + "[a2c] = " + a2c + ".");
		}
		Object[] result2_green = assignment2commandImpl
				.pattern_assignment2command_11_2_collecttranslatedelements_greenFBBB(a, c, a2c);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = assignment2commandImpl
				.pattern_assignment2command_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, a, n, s, s2n, c, a2c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[n] = " + n + ", " + "[s] = " + s + ", " + "[s2n] = " + s2n + ", "
					+ "[c] = " + c + ", " + "[a2c] = " + a2c + ".");
		}
		assignment2commandImpl.pattern_assignment2command_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, a, n, s,
				c, a2c);
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge a2c__a____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		assignment2commandImpl.pattern_assignment2command_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, a,
				n, s, s2n, c, a2c);
		return assignment2commandImpl.pattern_assignment2command_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = assignment2commandImpl
				.pattern_assignment2command_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = assignment2commandImpl
				.pattern_assignment2command_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = assignment2commandImpl.pattern_assignment2command_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Node n = (Node) result2_binding[0];
		Command c = (Command) result2_binding[1];
		for (Object[] result2_black : assignment2commandImpl.pattern_assignment2command_12_2_corematch_blackBFFBB(n, c,
				match)) {
			Statement s = (Statement) result2_black[1];
			S2N s2n = (S2N) result2_black[2];
			// ForEach 
			for (Object[] result3_black : assignment2commandImpl
					.pattern_assignment2command_12_3_findcontext_blackBBBB(n, s, s2n, c)) {
				Object[] result3_green = assignment2commandImpl
						.pattern_assignment2command_12_3_findcontext_greenBBBBFFFF(n, s, s2n, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = assignment2commandImpl
						.pattern_assignment2command_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, n, s,
								s2n, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ", " + "[s] = " + s
							+ ", " + "[s2n] = " + s2n + ", " + "[c] = " + c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (assignment2commandImpl.pattern_assignment2command_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = assignment2commandImpl
							.pattern_assignment2command_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					assignment2commandImpl.pattern_assignment2command_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return assignment2commandImpl.pattern_assignment2command_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Node n, Command c) {
		match.registerObject("n", n);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Node n, Command c) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Node n, Statement s, S2N s2n, Command c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("s2n", s2n);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a, EObject n, EObject s, EObject s2n,
			EObject c, EObject a2c) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2c", a2c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_63(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = assignment2commandImpl
				.pattern_assignment2command_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = assignment2commandImpl.pattern_assignment2command_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : assignment2commandImpl
				.pattern_assignment2command_20_2_testcorematchandDECs_blackFFB(_edge_next)) {
			Node n = (Node) result2_black[0];
			Command c = (Command) result2_black[1];
			Object[] result2_green = assignment2commandImpl
					.pattern_assignment2command_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (assignment2commandImpl
					.pattern_assignment2command_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, n, c)) {
				// 
				if (assignment2commandImpl
						.pattern_assignment2command_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = assignment2commandImpl
							.pattern_assignment2command_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					assignment2commandImpl.pattern_assignment2command_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return assignment2commandImpl.pattern_assignment2command_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_69(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = assignment2commandImpl
				.pattern_assignment2command_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = assignment2commandImpl.pattern_assignment2command_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : assignment2commandImpl
				.pattern_assignment2command_21_2_testcorematchandDECs_blackFFB(_edge_next)) {
			Assignment a = (Assignment) result2_black[0];
			Statement s = (Statement) result2_black[1];
			Object[] result2_green = assignment2commandImpl
					.pattern_assignment2command_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (assignment2commandImpl
					.pattern_assignment2command_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, a, s)) {
				// 
				if (assignment2commandImpl
						.pattern_assignment2command_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = assignment2commandImpl
							.pattern_assignment2command_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					assignment2commandImpl.pattern_assignment2command_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return assignment2commandImpl.pattern_assignment2command_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("assignment2command");
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
		ruleResult.setRule("assignment2command");
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

		Object[] result1_black = assignment2commandImpl.pattern_assignment2command_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = assignment2commandImpl.pattern_assignment2command_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = assignment2commandImpl
				.pattern_assignment2command_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Assignment a = (Assignment) result2_bindingAndBlack[0];
		Node n = (Node) result2_bindingAndBlack[1];
		Statement s = (Statement) result2_bindingAndBlack[2];
		Command c = (Command) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = assignment2commandImpl
				.pattern_assignment2command_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, a, n, s, c, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[a] = " + a + ", " + "[n] = " + n + ", " + "[s] = " + s + ", " + "[c] = " + c + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (assignment2commandImpl.pattern_assignment2command_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : assignment2commandImpl
					.pattern_assignment2command_24_5_matchcorrcontext_blackBBFBB(n, s, sourceMatch, targetMatch)) {
				S2N s2n = (S2N) result5_black[2];
				Object[] result5_green = assignment2commandImpl
						.pattern_assignment2command_24_5_matchcorrcontext_greenBBBF(s2n, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = assignment2commandImpl
						.pattern_assignment2command_24_6_createcorrespondence_blackBBBBB(a, n, s, c, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[n] = " + n + ", "
									+ "[s] = " + s + ", " + "[c] = " + c + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				assignment2commandImpl.pattern_assignment2command_24_6_createcorrespondence_greenBBFB(a, c, ccMatch);
				//nothing S2N a2c = (S2N) result6_green[2];

				Object[] result7_black = assignment2commandImpl
						.pattern_assignment2command_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				assignment2commandImpl.pattern_assignment2command_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return assignment2commandImpl.pattern_assignment2command_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Assignment a, Node n, Statement s, Command c, Match sourceMatch,
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
	public boolean checkDEC_FWD(Assignment a, Statement s) {// 
		Object[] result1_black = assignment2commandImpl.pattern_assignment2command_27_1_matchtggpattern_blackBB(a, s);
		if (result1_black != null) {
			return assignment2commandImpl.pattern_assignment2command_27_2_expressionF();
		} else {
			return assignment2commandImpl.pattern_assignment2command_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Node n, Command c) {// 
		Object[] result1_black = assignment2commandImpl.pattern_assignment2command_28_1_matchtggpattern_blackBB(n, c);
		if (result1_black != null) {
			return assignment2commandImpl.pattern_assignment2command_28_2_expressionF();
		} else {
			return assignment2commandImpl.pattern_assignment2command_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2N s2nParameter) {

		Object[] result1_black = assignment2commandImpl.pattern_assignment2command_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = assignment2commandImpl.pattern_assignment2command_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : assignment2commandImpl
				.pattern_assignment2command_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList s2nList = (RuleEntryList) result2_black[0];
			Node n = (Node) result2_black[1];
			S2N s2n = (S2N) result2_black[2];
			Statement s = (Statement) result2_black[3];

			Object[] result3_bindingAndBlack = assignment2commandImpl
					.pattern_assignment2command_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, n, s, s2n,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ", " + "[s] = " + s
						+ ", " + "[s2n] = " + s2n + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (assignment2commandImpl.pattern_assignment2command_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = assignment2commandImpl.pattern_assignment2command_29_5_checknacs_blackBBB(n, s,
						s2n);
				if (result5_black != null) {

					Object[] result6_black = assignment2commandImpl.pattern_assignment2command_29_6_perform_blackBBBB(n,
							s, s2n, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[n] = " + n + ", "
								+ "[s] = " + s + ", " + "[s2n] = " + s2n + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					assignment2commandImpl.pattern_assignment2command_29_6_perform_greenFBBFFB(n, s, ruleResult);
					//nothing Assignment a = (Assignment) result6_green[0];
					//nothing Command c = (Command) result6_green[3];
					//nothing S2N a2c = (S2N) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return assignment2commandImpl.pattern_assignment2command_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Node n, Statement s, S2N s2n,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("s2n", s2n);
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
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_STATEMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Statement) arguments.get(2));
		case RulesPackage.ASSIGNMENT2COMMAND___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_STATEMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Statement) arguments.get(2));
			return null;
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_STATEMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Statement) arguments.get(2));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_NODE_STATEMENT_S2N:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(Node) arguments.get(2), (Statement) arguments.get(3), (S2N) arguments.get(4));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.ASSIGNMENT2COMMAND___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPROPRIATE_BWD__MATCH_NODE_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Node) arguments.get(1), (Command) arguments.get(2));
		case RulesPackage.ASSIGNMENT2COMMAND___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NODE_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Node) arguments.get(1), (Command) arguments.get(2));
			return null;
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NODE_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Node) arguments.get(1),
					(Command) arguments.get(2));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NODE_STATEMENT_S2N_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Node) arguments.get(1),
					(Statement) arguments.get(2), (S2N) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.ASSIGNMENT2COMMAND___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPROPRIATE_BWD_EMOFLON_EDGE_63__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_63((EMoflonEdge) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPROPRIATE_FWD_EMOFLON_EDGE_69__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_69((EMoflonEdge) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_NODE_STATEMENT_COMMAND_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Node) arguments.get(1),
					(Statement) arguments.get(2), (Command) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___CHECK_DEC_FWD__ASSIGNMENT_STATEMENT:
			return checkDEC_FWD((Assignment) arguments.get(0), (Statement) arguments.get(1));
		case RulesPackage.ASSIGNMENT2COMMAND___CHECK_DEC_BWD__NODE_COMMAND:
			return checkDEC_BWD((Node) arguments.get(0), (Command) arguments.get(1));
		case RulesPackage.ASSIGNMENT2COMMAND___GENERATE_MODEL__RULEENTRYCONTAINER_S2N:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2N) arguments.get(1));
		case RulesPackage.ASSIGNMENT2COMMAND___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NODE_STATEMENT_S2N_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Node) arguments.get(1),
					(Statement) arguments.get(2), (S2N) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.ASSIGNMENT2COMMAND___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_assignment2command_0_1_initialbindings_blackBBBB(assignment2command _this,
			Match match, Assignment a, Statement s) {
		if (!a.equals(s)) {
			return new Object[] { _this, match, a, s };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_0_2_SolveCSP_bindingFBBBB(assignment2command _this,
			Match match, Assignment a, Statement s) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, s);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, s };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_assignment2command_0_2_SolveCSP_bindingAndBlackFBBBB(assignment2command _this,
			Match match, Assignment a, Statement s) {
		Object[] result_pattern_assignment2command_0_2_SolveCSP_binding = pattern_assignment2command_0_2_SolveCSP_bindingFBBBB(
				_this, match, a, s);
		if (result_pattern_assignment2command_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_assignment2command_0_2_SolveCSP_binding[0];

			Object[] result_pattern_assignment2command_0_2_SolveCSP_black = pattern_assignment2command_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_assignment2command_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, s };
			}
		}
		return null;
	}

	public static final boolean pattern_assignment2command_0_3_CheckCSP_expressionFBB(assignment2command _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_assignment2command_0_4_collectelementstobetranslated_blackBBB(Match match,
			Assignment a, Statement s) {
		if (!a.equals(s)) {
			return new Object[] { match, a, s };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Assignment a, Statement s) {
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		String s__a____next_name_prime = "next";
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		match.getToBeTranslatedEdges().add(s__a____next);
		s__a____next.setName(s__a____next_name_prime);
		return new Object[] { match, a, s, s__a____next };
	}

	public static final Object[] pattern_assignment2command_0_5_collectcontextelements_blackBBB(Match match,
			Assignment a, Statement s) {
		if (!a.equals(s)) {
			return new Object[] { match, a, s };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_0_5_collectcontextelements_greenBB(Match match,
			Statement s) {
		match.getContextNodes().add(s);
		return new Object[] { match, s };
	}

	public static final void pattern_assignment2command_0_6_registerobjectstomatch_expressionBBBB(
			assignment2command _this, Match match, Assignment a, Statement s) {
		_this.registerObjectsToMatch_FWD(match, a, s);

	}

	public static final boolean pattern_assignment2command_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_assignment2command_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_assignment2command_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("a");
		EObject _localVariable_1 = isApplicableMatch.getObject("n");
		EObject _localVariable_2 = isApplicableMatch.getObject("s");
		EObject _localVariable_3 = isApplicableMatch.getObject("s2n");
		EObject tmpA = _localVariable_0;
		EObject tmpN = _localVariable_1;
		EObject tmpS = _localVariable_2;
		EObject tmpS2n = _localVariable_3;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpN instanceof Node) {
				Node n = (Node) tmpN;
				if (tmpS instanceof Statement) {
					Statement s = (Statement) tmpS;
					if (tmpS2n instanceof S2N) {
						S2N s2n = (S2N) tmpS2n;
						return new Object[] { a, n, s, s2n, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_1_1_performtransformation_blackBBBBFBB(Assignment a, Node n,
			Statement s, S2N s2n, assignment2command _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(s)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { a, n, s, s2n, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_1_1_performtransformation_bindingAndBlackFFFFFBB(
			assignment2command _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_assignment2command_1_1_performtransformation_binding = pattern_assignment2command_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_assignment2command_1_1_performtransformation_binding != null) {
			Assignment a = (Assignment) result_pattern_assignment2command_1_1_performtransformation_binding[0];
			Node n = (Node) result_pattern_assignment2command_1_1_performtransformation_binding[1];
			Statement s = (Statement) result_pattern_assignment2command_1_1_performtransformation_binding[2];
			S2N s2n = (S2N) result_pattern_assignment2command_1_1_performtransformation_binding[3];

			Object[] result_pattern_assignment2command_1_1_performtransformation_black = pattern_assignment2command_1_1_performtransformation_blackBBBBFBB(
					a, n, s, s2n, _this, isApplicableMatch);
			if (result_pattern_assignment2command_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_assignment2command_1_1_performtransformation_black[4];

				return new Object[] { a, n, s, s2n, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_1_1_performtransformation_greenBBFF(Assignment a, Node n) {
		Command c = ControlflowFactory.eINSTANCE.createCommand();
		S2N a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		n.setNext(c);
		a2c.setSource(a);
		a2c.setTarget(c);
		return new Object[] { a, n, c, a2c };
	}

	public static final Object[] pattern_assignment2command_1_2_collecttranslatedelements_blackBBB(Assignment a,
			Command c, S2N a2c) {
		return new Object[] { a, c, a2c };
	}

	public static final Object[] pattern_assignment2command_1_2_collecttranslatedelements_greenFBBB(Assignment a,
			Command c, S2N a2c) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2c);
		return new Object[] { ruleresult, a, c, a2c };
	}

	public static final Object[] pattern_assignment2command_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject a, EObject n, EObject s, EObject s2n, EObject c, EObject a2c) {
		if (!a.equals(n)) {
			if (!a.equals(s)) {
				if (!a.equals(s2n)) {
					if (!a.equals(c)) {
						if (!a.equals(a2c)) {
							if (!n.equals(s)) {
								if (!n.equals(s2n)) {
									if (!s.equals(s2n)) {
										if (!c.equals(n)) {
											if (!c.equals(s)) {
												if (!c.equals(s2n)) {
													if (!a2c.equals(n)) {
														if (!a2c.equals(s)) {
															if (!a2c.equals(s2n)) {
																if (!a2c.equals(c)) {
																	return new Object[] { ruleresult, a, n, s, s2n, c,
																			a2c };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_assignment2command_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject a, EObject n, EObject s, EObject c, EObject a2c) {
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "assignment2command";
		String n__c____next_name_prime = "next";
		String s__a____next_name_prime = "next";
		String a2c__a____source_name_prime = "source";
		String a2c__c____target_name_prime = "target";
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(n__c____next);
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		ruleresult.getTranslatedEdges().add(s__a____next);
		a2c__a____source.setSrc(a2c);
		a2c__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2c__a____source);
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		ruleresult.getCreatedEdges().add(a2c__c____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		n__c____next.setName(n__c____next_name_prime);
		s__a____next.setName(s__a____next_name_prime);
		a2c__a____source.setName(a2c__a____source_name_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		return new Object[] { ruleresult, a, n, s, c, a2c, n__c____next, s__a____next, a2c__a____source,
				a2c__c____target };
	}

	public static final void pattern_assignment2command_1_5_registerobjects_expressionBBBBBBBB(assignment2command _this,
			PerformRuleResult ruleresult, EObject a, EObject n, EObject s, EObject s2n, EObject c, EObject a2c) {
		_this.registerObjects_FWD(ruleresult, a, n, s, s2n, c, a2c);

	}

	public static final PerformRuleResult pattern_assignment2command_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_assignment2command_2_1_preparereturnvalue_bindingFB(assignment2command _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_2_1_preparereturnvalue_blackFBB(EClass eClass,
			assignment2command _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_assignment2command_2_1_preparereturnvalue_bindingAndBlackFFB(
			assignment2command _this) {
		Object[] result_pattern_assignment2command_2_1_preparereturnvalue_binding = pattern_assignment2command_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_assignment2command_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_assignment2command_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_assignment2command_2_1_preparereturnvalue_black = pattern_assignment2command_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_assignment2command_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_assignment2command_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "assignment2command";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_assignment2command_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("a");
		EObject _localVariable_1 = match.getObject("s");
		EObject tmpA = _localVariable_0;
		EObject tmpS = _localVariable_1;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpS instanceof Statement) {
				Statement s = (Statement) tmpS;
				return new Object[] { a, s, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_assignment2command_2_2_corematch_blackBFBFB(Assignment a,
			Statement s, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(s)) {
			for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s, S2N.class, "source")) {
				Node n = s2n.getTarget();
				if (n != null) {
					_result.add(new Object[] { a, n, s, s2n, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_assignment2command_2_3_findcontext_blackBBBB(Assignment a, Node n,
			Statement s, S2N s2n) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(s)) {
			if (a.equals(s.getNext())) {
				if (s.equals(s2n.getSource())) {
					if (n.equals(s2n.getTarget())) {
						_result.add(new Object[] { a, n, s, s2n });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_assignment2command_2_3_findcontext_greenBBBBFFFF(Assignment a, Node n,
			Statement s, S2N s2n) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String s__a____next_name_prime = "next";
		String s2n__s____source_name_prime = "source";
		String s2n__n____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(s2n);
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		isApplicableMatch.getAllContextElements().add(s__a____next);
		s2n__s____source.setSrc(s2n);
		s2n__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2n__s____source);
		s2n__n____target.setSrc(s2n);
		s2n__n____target.setTrg(n);
		isApplicableMatch.getAllContextElements().add(s2n__n____target);
		s__a____next.setName(s__a____next_name_prime);
		s2n__s____source.setName(s2n__s____source_name_prime);
		s2n__n____target.setName(s2n__n____target_name_prime);
		return new Object[] { a, n, s, s2n, isApplicableMatch, s__a____next, s2n__s____source, s2n__n____target };
	}

	public static final Object[] pattern_assignment2command_2_4_solveCSP_bindingFBBBBBB(assignment2command _this,
			IsApplicableMatch isApplicableMatch, Assignment a, Node n, Statement s, S2N s2n) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, a, n, s, s2n);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, n, s, s2n };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_assignment2command_2_4_solveCSP_bindingAndBlackFBBBBBB(
			assignment2command _this, IsApplicableMatch isApplicableMatch, Assignment a, Node n, Statement s, S2N s2n) {
		Object[] result_pattern_assignment2command_2_4_solveCSP_binding = pattern_assignment2command_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, a, n, s, s2n);
		if (result_pattern_assignment2command_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_assignment2command_2_4_solveCSP_binding[0];

			Object[] result_pattern_assignment2command_2_4_solveCSP_black = pattern_assignment2command_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_assignment2command_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, n, s, s2n };
			}
		}
		return null;
	}

	public static final boolean pattern_assignment2command_2_5_checkCSP_expressionFBB(assignment2command _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_assignment2command_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_assignment2command_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "assignment2command";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_assignment2command_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_assignment2command_10_1_initialbindings_blackBBBB(assignment2command _this,
			Match match, Node n, Command c) {
		if (!c.equals(n)) {
			return new Object[] { _this, match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_10_2_SolveCSP_bindingFBBBB(assignment2command _this,
			Match match, Node n, Command c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, n, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_assignment2command_10_2_SolveCSP_bindingAndBlackFBBBB(assignment2command _this,
			Match match, Node n, Command c) {
		Object[] result_pattern_assignment2command_10_2_SolveCSP_binding = pattern_assignment2command_10_2_SolveCSP_bindingFBBBB(
				_this, match, n, c);
		if (result_pattern_assignment2command_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_assignment2command_10_2_SolveCSP_binding[0];

			Object[] result_pattern_assignment2command_10_2_SolveCSP_black = pattern_assignment2command_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_assignment2command_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, n, c };
			}
		}
		return null;
	}

	public static final boolean pattern_assignment2command_10_3_CheckCSP_expressionFBB(assignment2command _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_assignment2command_10_4_collectelementstobetranslated_blackBBB(Match match,
			Node n, Command c) {
		if (!c.equals(n)) {
			return new Object[] { match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_10_4_collectelementstobetranslated_greenBBBF(Match match,
			Node n, Command c) {
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		String n__c____next_name_prime = "next";
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(n__c____next);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { match, n, c, n__c____next };
	}

	public static final Object[] pattern_assignment2command_10_5_collectcontextelements_blackBBB(Match match, Node n,
			Command c) {
		if (!c.equals(n)) {
			return new Object[] { match, n, c };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_10_5_collectcontextelements_greenBB(Match match, Node n) {
		match.getContextNodes().add(n);
		return new Object[] { match, n };
	}

	public static final void pattern_assignment2command_10_6_registerobjectstomatch_expressionBBBB(
			assignment2command _this, Match match, Node n, Command c) {
		_this.registerObjectsToMatch_BWD(match, n, c);

	}

	public static final boolean pattern_assignment2command_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_assignment2command_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_assignment2command_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("n");
		EObject _localVariable_1 = isApplicableMatch.getObject("s");
		EObject _localVariable_2 = isApplicableMatch.getObject("s2n");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject tmpN = _localVariable_0;
		EObject tmpS = _localVariable_1;
		EObject tmpS2n = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpN instanceof Node) {
			Node n = (Node) tmpN;
			if (tmpS instanceof Statement) {
				Statement s = (Statement) tmpS;
				if (tmpS2n instanceof S2N) {
					S2N s2n = (S2N) tmpS2n;
					if (tmpC instanceof Command) {
						Command c = (Command) tmpC;
						return new Object[] { n, s, s2n, c, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_11_1_performtransformation_blackBBBBFBB(Node n, Statement s,
			S2N s2n, Command c, assignment2command _this, IsApplicableMatch isApplicableMatch) {
		if (!c.equals(n)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { n, s, s2n, c, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_11_1_performtransformation_bindingAndBlackFFFFFBB(
			assignment2command _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_assignment2command_11_1_performtransformation_binding = pattern_assignment2command_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_assignment2command_11_1_performtransformation_binding != null) {
			Node n = (Node) result_pattern_assignment2command_11_1_performtransformation_binding[0];
			Statement s = (Statement) result_pattern_assignment2command_11_1_performtransformation_binding[1];
			S2N s2n = (S2N) result_pattern_assignment2command_11_1_performtransformation_binding[2];
			Command c = (Command) result_pattern_assignment2command_11_1_performtransformation_binding[3];

			Object[] result_pattern_assignment2command_11_1_performtransformation_black = pattern_assignment2command_11_1_performtransformation_blackBBBBFBB(
					n, s, s2n, c, _this, isApplicableMatch);
			if (result_pattern_assignment2command_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_assignment2command_11_1_performtransformation_black[4];

				return new Object[] { n, s, s2n, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_11_1_performtransformation_greenFBBF(Statement s,
			Command c) {
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		s.setNext(a);
		a2c.setSource(a);
		a2c.setTarget(c);
		return new Object[] { a, s, c, a2c };
	}

	public static final Object[] pattern_assignment2command_11_2_collecttranslatedelements_blackBBB(Assignment a,
			Command c, S2N a2c) {
		return new Object[] { a, c, a2c };
	}

	public static final Object[] pattern_assignment2command_11_2_collecttranslatedelements_greenFBBB(Assignment a,
			Command c, S2N a2c) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2c);
		return new Object[] { ruleresult, a, c, a2c };
	}

	public static final Object[] pattern_assignment2command_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject a, EObject n, EObject s, EObject s2n, EObject c, EObject a2c) {
		if (!a.equals(n)) {
			if (!a.equals(s)) {
				if (!a.equals(s2n)) {
					if (!a.equals(c)) {
						if (!a.equals(a2c)) {
							if (!n.equals(s)) {
								if (!n.equals(s2n)) {
									if (!s.equals(s2n)) {
										if (!c.equals(n)) {
											if (!c.equals(s)) {
												if (!c.equals(s2n)) {
													if (!a2c.equals(n)) {
														if (!a2c.equals(s)) {
															if (!a2c.equals(s2n)) {
																if (!a2c.equals(c)) {
																	return new Object[] { ruleresult, a, n, s, s2n, c,
																			a2c };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_assignment2command_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject a, EObject n, EObject s, EObject c, EObject a2c) {
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "assignment2command";
		String n__c____next_name_prime = "next";
		String s__a____next_name_prime = "next";
		String a2c__a____source_name_prime = "source";
		String a2c__c____target_name_prime = "target";
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(n__c____next);
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		ruleresult.getCreatedEdges().add(s__a____next);
		a2c__a____source.setSrc(a2c);
		a2c__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2c__a____source);
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		ruleresult.getCreatedEdges().add(a2c__c____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		n__c____next.setName(n__c____next_name_prime);
		s__a____next.setName(s__a____next_name_prime);
		a2c__a____source.setName(a2c__a____source_name_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		return new Object[] { ruleresult, a, n, s, c, a2c, n__c____next, s__a____next, a2c__a____source,
				a2c__c____target };
	}

	public static final void pattern_assignment2command_11_5_registerobjects_expressionBBBBBBBB(
			assignment2command _this, PerformRuleResult ruleresult, EObject a, EObject n, EObject s, EObject s2n,
			EObject c, EObject a2c) {
		_this.registerObjects_BWD(ruleresult, a, n, s, s2n, c, a2c);

	}

	public static final PerformRuleResult pattern_assignment2command_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_assignment2command_12_1_preparereturnvalue_bindingFB(
			assignment2command _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_12_1_preparereturnvalue_blackFBB(EClass eClass,
			assignment2command _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_assignment2command_12_1_preparereturnvalue_bindingAndBlackFFB(
			assignment2command _this) {
		Object[] result_pattern_assignment2command_12_1_preparereturnvalue_binding = pattern_assignment2command_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_assignment2command_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_assignment2command_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_assignment2command_12_1_preparereturnvalue_black = pattern_assignment2command_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_assignment2command_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_assignment2command_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "assignment2command";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_assignment2command_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("n");
		EObject _localVariable_1 = match.getObject("c");
		EObject tmpN = _localVariable_0;
		EObject tmpC = _localVariable_1;
		if (tmpN instanceof Node) {
			Node n = (Node) tmpN;
			if (tmpC instanceof Command) {
				Command c = (Command) tmpC;
				return new Object[] { n, c, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_assignment2command_12_2_corematch_blackBFFBB(Node n, Command c,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(n)) {
			for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n, S2N.class, "target")) {
				Statement s = s2n.getSource();
				if (s != null) {
					_result.add(new Object[] { n, s, s2n, c, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_assignment2command_12_3_findcontext_blackBBBB(Node n, Statement s,
			S2N s2n, Command c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(n)) {
			if (c.equals(n.getNext())) {
				if (s.equals(s2n.getSource())) {
					if (n.equals(s2n.getTarget())) {
						_result.add(new Object[] { n, s, s2n, c });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_assignment2command_12_3_findcontext_greenBBBBFFFF(Node n, Statement s, S2N s2n,
			Command c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String n__c____next_name_prime = "next";
		String s2n__s____source_name_prime = "source";
		String s2n__n____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(s2n);
		isApplicableMatch.getAllContextElements().add(c);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(n__c____next);
		s2n__s____source.setSrc(s2n);
		s2n__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2n__s____source);
		s2n__n____target.setSrc(s2n);
		s2n__n____target.setTrg(n);
		isApplicableMatch.getAllContextElements().add(s2n__n____target);
		n__c____next.setName(n__c____next_name_prime);
		s2n__s____source.setName(s2n__s____source_name_prime);
		s2n__n____target.setName(s2n__n____target_name_prime);
		return new Object[] { n, s, s2n, c, isApplicableMatch, n__c____next, s2n__s____source, s2n__n____target };
	}

	public static final Object[] pattern_assignment2command_12_4_solveCSP_bindingFBBBBBB(assignment2command _this,
			IsApplicableMatch isApplicableMatch, Node n, Statement s, S2N s2n, Command c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, n, s, s2n, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n, s, s2n, c };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_assignment2command_12_4_solveCSP_bindingAndBlackFBBBBBB(
			assignment2command _this, IsApplicableMatch isApplicableMatch, Node n, Statement s, S2N s2n, Command c) {
		Object[] result_pattern_assignment2command_12_4_solveCSP_binding = pattern_assignment2command_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, n, s, s2n, c);
		if (result_pattern_assignment2command_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_assignment2command_12_4_solveCSP_binding[0];

			Object[] result_pattern_assignment2command_12_4_solveCSP_black = pattern_assignment2command_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_assignment2command_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n, s, s2n, c };
			}
		}
		return null;
	}

	public static final boolean pattern_assignment2command_12_5_checkCSP_expressionFBB(assignment2command _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_assignment2command_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_assignment2command_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "assignment2command";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_assignment2command_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_assignment2command_20_1_preparereturnvalue_bindingFB(
			assignment2command _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			assignment2command _this) {
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

	public static final Object[] pattern_assignment2command_20_1_preparereturnvalue_bindingAndBlackFFBF(
			assignment2command _this) {
		Object[] result_pattern_assignment2command_20_1_preparereturnvalue_binding = pattern_assignment2command_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_assignment2command_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_assignment2command_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_assignment2command_20_1_preparereturnvalue_black = pattern_assignment2command_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_assignment2command_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_assignment2command_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_assignment2command_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_assignment2command_20_2_testcorematchandDECs_black_nac_0B(Command c) {
		for (Graph __DEC_c_root_968261 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Graph.class, "root")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_20_2_testcorematchandDECs_black_nac_1BB(Command c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_positive_820964 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "positive")) {
				if (!n.equals(__DEC_c_positive_820964)) {
					return new Object[] { c, n };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_20_2_testcorematchandDECs_black_nac_2BB(Command c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_negative_974055 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "negative")) {
				if (!n.equals(__DEC_c_negative_974055)) {
					return new Object[] { c, n };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_assignment2command_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpN = _edge_next.getSrc();
		if (tmpN instanceof Node) {
			Node n = (Node) tmpN;
			EObject tmpC = _edge_next.getTrg();
			if (tmpC instanceof Command) {
				Command c = (Command) tmpC;
				if (!c.equals(n)) {
					if (c.equals(n.getNext())) {
						if (pattern_assignment2command_20_2_testcorematchandDECs_black_nac_0B(c) == null) {
							if (pattern_assignment2command_20_2_testcorematchandDECs_black_nac_1BB(c, n) == null) {
								if (pattern_assignment2command_20_2_testcorematchandDECs_black_nac_2BB(c, n) == null) {
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

	public static final Object[] pattern_assignment2command_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_assignment2command_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			assignment2command _this, Match match, Node n, Command c) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, n, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_assignment2command_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			assignment2command _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_assignment2command_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_assignment2command_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_assignment2command_21_1_preparereturnvalue_bindingFB(
			assignment2command _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			assignment2command _this) {
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

	public static final Object[] pattern_assignment2command_21_1_preparereturnvalue_bindingAndBlackFFBF(
			assignment2command _this) {
		Object[] result_pattern_assignment2command_21_1_preparereturnvalue_binding = pattern_assignment2command_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_assignment2command_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_assignment2command_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_assignment2command_21_1_preparereturnvalue_black = pattern_assignment2command_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_assignment2command_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_assignment2command_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_assignment2command_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_assignment2command_21_2_testcorematchandDECs_black_nac_0BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_positive_25004 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					Decision.class, "positive")) {
				if (!s.equals(__DEC_a_positive_25004)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_21_2_testcorematchandDECs_black_nac_1BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_negative_888645 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!s.equals(__DEC_a_negative_888645)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_21_2_testcorematchandDECs_black_nac_2BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_first_194707 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!s.equals(__DEC_a_first_194707)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_21_2_testcorematchandDECs_black_nac_3BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_last_273247 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!s.equals(__DEC_a_last_273247)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_21_2_testcorematchandDECs_black_nac_4B(Assignment a) {
		for (Program __DEC_a_first_274283 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_assignment2command_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpS = _edge_next.getSrc();
		if (tmpS instanceof Statement) {
			Statement s = (Statement) tmpS;
			EObject tmpA = _edge_next.getTrg();
			if (tmpA instanceof Assignment) {
				Assignment a = (Assignment) tmpA;
				if (!a.equals(s)) {
					if (a.equals(s.getNext())) {
						if (pattern_assignment2command_21_2_testcorematchandDECs_black_nac_0BB(a, s) == null) {
							if (pattern_assignment2command_21_2_testcorematchandDECs_black_nac_1BB(a, s) == null) {
								if (pattern_assignment2command_21_2_testcorematchandDECs_black_nac_2BB(a, s) == null) {
									if (pattern_assignment2command_21_2_testcorematchandDECs_black_nac_3BB(a,
											s) == null) {
										if (pattern_assignment2command_21_2_testcorematchandDECs_black_nac_4B(
												a) == null) {
											_result.add(new Object[] { a, s, _edge_next });
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

	public static final Object[] pattern_assignment2command_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_assignment2command_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			assignment2command _this, Match match, Assignment a, Statement s) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, s);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_assignment2command_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			assignment2command _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_assignment2command_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_assignment2command_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_assignment2command_24_1_prepare_blackB(assignment2command _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_assignment2command_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_assignment2command_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("a");
		EObject _localVariable_1 = targetMatch.getObject("n");
		EObject _localVariable_2 = sourceMatch.getObject("s");
		EObject _localVariable_3 = targetMatch.getObject("c");
		EObject tmpA = _localVariable_0;
		EObject tmpN = _localVariable_1;
		EObject tmpS = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpN instanceof Node) {
				Node n = (Node) tmpN;
				if (tmpS instanceof Statement) {
					Statement s = (Statement) tmpS;
					if (tmpC instanceof Command) {
						Command c = (Command) tmpC;
						return new Object[] { a, n, s, c, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_24_2_matchsrctrgcontext_blackBBBBBB(Assignment a, Node n,
			Statement s, Command c, Match sourceMatch, Match targetMatch) {
		if (!a.equals(s)) {
			if (!c.equals(n)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { a, n, s, c, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_assignment2command_24_2_matchsrctrgcontext_binding = pattern_assignment2command_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_assignment2command_24_2_matchsrctrgcontext_binding != null) {
			Assignment a = (Assignment) result_pattern_assignment2command_24_2_matchsrctrgcontext_binding[0];
			Node n = (Node) result_pattern_assignment2command_24_2_matchsrctrgcontext_binding[1];
			Statement s = (Statement) result_pattern_assignment2command_24_2_matchsrctrgcontext_binding[2];
			Command c = (Command) result_pattern_assignment2command_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_assignment2command_24_2_matchsrctrgcontext_black = pattern_assignment2command_24_2_matchsrctrgcontext_blackBBBBBB(
					a, n, s, c, sourceMatch, targetMatch);
			if (result_pattern_assignment2command_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { a, n, s, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_24_3_solvecsp_bindingFBBBBBBB(assignment2command _this,
			Assignment a, Node n, Statement s, Command c, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(a, n, s, c, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, a, n, s, c, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_assignment2command_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			assignment2command _this, Assignment a, Node n, Statement s, Command c, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_assignment2command_24_3_solvecsp_binding = pattern_assignment2command_24_3_solvecsp_bindingFBBBBBBB(
				_this, a, n, s, c, sourceMatch, targetMatch);
		if (result_pattern_assignment2command_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_assignment2command_24_3_solvecsp_binding[0];

			Object[] result_pattern_assignment2command_24_3_solvecsp_black = pattern_assignment2command_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_assignment2command_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, a, n, s, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_assignment2command_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_assignment2command_24_5_matchcorrcontext_blackBBFBB(Node n,
			Statement s, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s, S2N.class, "source")) {
				if (n.equals(s2n.getTarget())) {
					_result.add(new Object[] { n, s, s2n, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_assignment2command_24_5_matchcorrcontext_greenBBBF(S2N s2n, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "assignment2command";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(s2n);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { s2n, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_assignment2command_24_6_createcorrespondence_blackBBBBB(Assignment a, Node n,
			Statement s, Command c, CCMatch ccMatch) {
		if (!a.equals(s)) {
			if (!c.equals(n)) {
				return new Object[] { a, n, s, c, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_24_6_createcorrespondence_greenBBFB(Assignment a, Command c,
			CCMatch ccMatch) {
		S2N a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2c.setSource(a);
		a2c.setTarget(c);
		ccMatch.getCreateCorr().add(a2c);
		return new Object[] { a, c, a2c, ccMatch };
	}

	public static final Object[] pattern_assignment2command_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_assignment2command_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "assignment2command";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_assignment2command_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_assignment2command_27_1_matchtggpattern_black_nac_0BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_positive_297470 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "positive")) {
				if (!s.equals(__DEC_a_positive_297470)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_27_1_matchtggpattern_black_nac_1BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_negative_836677 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!s.equals(__DEC_a_negative_836677)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_27_1_matchtggpattern_black_nac_2BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_first_106732 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!s.equals(__DEC_a_first_106732)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_27_1_matchtggpattern_black_nac_3BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_last_552840 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!s.equals(__DEC_a_last_552840)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_27_1_matchtggpattern_black_nac_4B(Assignment a) {
		for (Program __DEC_a_first_87177 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_27_1_matchtggpattern_blackBB(Assignment a, Statement s) {
		if (!a.equals(s)) {
			if (a.equals(s.getNext())) {
				if (pattern_assignment2command_27_1_matchtggpattern_black_nac_0BB(a, s) == null) {
					if (pattern_assignment2command_27_1_matchtggpattern_black_nac_1BB(a, s) == null) {
						if (pattern_assignment2command_27_1_matchtggpattern_black_nac_2BB(a, s) == null) {
							if (pattern_assignment2command_27_1_matchtggpattern_black_nac_3BB(a, s) == null) {
								if (pattern_assignment2command_27_1_matchtggpattern_black_nac_4B(a) == null) {
									return new Object[] { a, s };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_assignment2command_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_assignment2command_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_assignment2command_28_1_matchtggpattern_black_nac_0B(Command c) {
		for (Graph __DEC_c_root_142005 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Graph.class, "root")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_28_1_matchtggpattern_black_nac_1BB(Command c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_positive_143296 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "positive")) {
				if (!n.equals(__DEC_c_positive_143296)) {
					return new Object[] { c, n };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_28_1_matchtggpattern_black_nac_2BB(Command c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_negative_832194 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "negative")) {
				if (!n.equals(__DEC_c_negative_832194)) {
					return new Object[] { c, n };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_28_1_matchtggpattern_blackBB(Node n, Command c) {
		if (!c.equals(n)) {
			if (c.equals(n.getNext())) {
				if (pattern_assignment2command_28_1_matchtggpattern_black_nac_0B(c) == null) {
					if (pattern_assignment2command_28_1_matchtggpattern_black_nac_1BB(c, n) == null) {
						if (pattern_assignment2command_28_1_matchtggpattern_black_nac_2BB(c, n) == null) {
							return new Object[] { n, c };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_assignment2command_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_assignment2command_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_assignment2command_29_1_createresult_blackB(assignment2command _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_assignment2command_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_assignment2command_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Node n) {
		if (ruleResult.getTargetObjects().contains(n)) {
			return new Object[] { ruleResult, n };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2N s2n) {
		if (ruleResult.getCorrObjects().contains(s2n)) {
			return new Object[] { ruleResult, s2n };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Statement s) {
		if (ruleResult.getSourceObjects().contains(s)) {
			return new Object[] { ruleResult, s };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_assignment2command_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_assignment2command_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									s2n) == null) {
								if (pattern_assignment2command_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										n) == null) {
									if (pattern_assignment2command_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											s) == null) {
										_result.add(
												new Object[] { s2nList, n, s2n, s, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_assignment2command_29_3_solveCSP_bindingFBBBBBB(assignment2command _this,
			IsApplicableMatch isApplicableMatch, Node n, Statement s, S2N s2n, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, n, s, s2n, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n, s, s2n, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_assignment2command_29_3_solveCSP_bindingAndBlackFBBBBBB(
			assignment2command _this, IsApplicableMatch isApplicableMatch, Node n, Statement s, S2N s2n,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_assignment2command_29_3_solveCSP_binding = pattern_assignment2command_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, n, s, s2n, ruleResult);
		if (result_pattern_assignment2command_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_assignment2command_29_3_solveCSP_binding[0];

			Object[] result_pattern_assignment2command_29_3_solveCSP_black = pattern_assignment2command_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_assignment2command_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n, s, s2n, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_assignment2command_29_4_checkCSP_expressionFBB(assignment2command _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_assignment2command_29_5_checknacs_blackBBB(Node n, Statement s, S2N s2n) {
		return new Object[] { n, s, s2n };
	}

	public static final Object[] pattern_assignment2command_29_6_perform_blackBBBB(Node n, Statement s, S2N s2n,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { n, s, s2n, ruleResult };
	}

	public static final Object[] pattern_assignment2command_29_6_perform_greenFBBFFB(Node n, Statement s,
			ModelgeneratorRuleResult ruleResult) {
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		Command c = ControlflowFactory.eINSTANCE.createCommand();
		S2N a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		s.setNext(a);
		ruleResult.getSourceObjects().add(a);
		n.setNext(c);
		ruleResult.getTargetObjects().add(c);
		a2c.setSource(a);
		a2c.setTarget(c);
		ruleResult.getCorrObjects().add(a2c);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a, n, s, c, a2c, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_assignment2command_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //assignment2commandImpl
