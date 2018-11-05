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
	public boolean isAppropriate_FWD(Match match, Statement s, Assignment a) {

		Object[] result1_black = assignment2commandImpl.pattern_assignment2command_0_1_initialbindings_blackBBBB(this,
				match, s, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[s] = " + s + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = assignment2commandImpl
				.pattern_assignment2command_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, s, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[s] = " + s + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (assignment2commandImpl.pattern_assignment2command_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = assignment2commandImpl
					.pattern_assignment2command_0_4_collectelementstobetranslated_blackBBB(match, s, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[s] = " + s + ", " + "[a] = " + a + ".");
			}
			assignment2commandImpl.pattern_assignment2command_0_4_collectelementstobetranslated_greenBBBF(match, s, a);
			//nothing EMoflonEdge s__a____next = (EMoflonEdge) result4_green[3];

			Object[] result5_black = assignment2commandImpl
					.pattern_assignment2command_0_5_collectcontextelements_blackBBB(match, s, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[s] = " + s + ", " + "[a] = " + a + ".");
			}
			assignment2commandImpl.pattern_assignment2command_0_5_collectcontextelements_greenBB(match, s);

			// 
			assignment2commandImpl.pattern_assignment2command_0_6_registerobjectstomatch_expressionBBBB(this, match, s,
					a);
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
		Statement s = (Statement) result1_bindingAndBlack[0];
		Node n = (Node) result1_bindingAndBlack[1];
		S2N s2n = (S2N) result1_bindingAndBlack[2];
		Assignment a = (Assignment) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = assignment2commandImpl
				.pattern_assignment2command_1_1_performtransformation_greenFBFB(n, a);
		S2N a2c = (S2N) result1_green[0];
		Command c = (Command) result1_green[2];

		Object[] result2_black = assignment2commandImpl
				.pattern_assignment2command_1_2_collecttranslatedelements_blackBBB(a2c, c, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2c] = " + a2c + ", " + "[c] = "
					+ c + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = assignment2commandImpl
				.pattern_assignment2command_1_2_collecttranslatedelements_greenFBBB(a2c, c, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = assignment2commandImpl
				.pattern_assignment2command_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, s, a2c, n, c, s2n, a);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[s] = " + s + ", " + "[a2c] = " + a2c + ", " + "[n] = " + n + ", " + "[c] = " + c + ", "
					+ "[s2n] = " + s2n + ", " + "[a] = " + a + ".");
		}
		assignment2commandImpl.pattern_assignment2command_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, s, a2c, n,
				c, a);
		//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge a2c__a____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[9];

		// 
		// 
		assignment2commandImpl.pattern_assignment2command_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, s,
				a2c, n, c, s2n, a);
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
		Statement s = (Statement) result2_binding[0];
		Assignment a = (Assignment) result2_binding[1];
		for (Object[] result2_black : assignment2commandImpl.pattern_assignment2command_2_2_corematch_blackBFFBB(s, a,
				match)) {
			Node n = (Node) result2_black[1];
			S2N s2n = (S2N) result2_black[2];
			// ForEach 
			for (Object[] result3_black : assignment2commandImpl.pattern_assignment2command_2_3_findcontext_blackBBBB(s,
					n, s2n, a)) {
				Object[] result3_green = assignment2commandImpl
						.pattern_assignment2command_2_3_findcontext_greenBBBBFFFF(s, n, s2n, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = assignment2commandImpl
						.pattern_assignment2command_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, s, n,
								s2n, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s] = " + s + ", " + "[n] = " + n
							+ ", " + "[s2n] = " + s2n + ", " + "[a] = " + a + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Statement s, Assignment a) {
		match.registerObject("s", s);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Statement s, Assignment a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Statement s, Node n, S2N s2n,
			Assignment a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("s2n", s2n);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject s, EObject a2c, EObject n, EObject c,
			EObject s2n, EObject a) {
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("a", a);

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
		Statement s = (Statement) result1_bindingAndBlack[0];
		Node n = (Node) result1_bindingAndBlack[1];
		Command c = (Command) result1_bindingAndBlack[2];
		S2N s2n = (S2N) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = assignment2commandImpl
				.pattern_assignment2command_11_1_performtransformation_greenBFBF(s, c);
		S2N a2c = (S2N) result1_green[1];
		Assignment a = (Assignment) result1_green[3];

		Object[] result2_black = assignment2commandImpl
				.pattern_assignment2command_11_2_collecttranslatedelements_blackBBB(a2c, c, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2c] = " + a2c + ", " + "[c] = "
					+ c + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = assignment2commandImpl
				.pattern_assignment2command_11_2_collecttranslatedelements_greenFBBB(a2c, c, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = assignment2commandImpl
				.pattern_assignment2command_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, s, a2c, n, c, s2n, a);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[s] = " + s + ", " + "[a2c] = " + a2c + ", " + "[n] = " + n + ", " + "[c] = " + c + ", "
					+ "[s2n] = " + s2n + ", " + "[a] = " + a + ".");
		}
		assignment2commandImpl.pattern_assignment2command_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, s, a2c,
				n, c, a);
		//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge a2c__a____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[9];

		// 
		// 
		assignment2commandImpl.pattern_assignment2command_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, s,
				a2c, n, c, s2n, a);
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
		for (Object[] result2_black : assignment2commandImpl.pattern_assignment2command_12_2_corematch_blackFBBFB(n, c,
				match)) {
			Statement s = (Statement) result2_black[0];
			S2N s2n = (S2N) result2_black[3];
			// ForEach 
			for (Object[] result3_black : assignment2commandImpl
					.pattern_assignment2command_12_3_findcontext_blackBBBB(s, n, c, s2n)) {
				Object[] result3_green = assignment2commandImpl
						.pattern_assignment2command_12_3_findcontext_greenBBBBFFFF(s, n, c, s2n);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = assignment2commandImpl
						.pattern_assignment2command_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, s, n,
								c, s2n);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s] = " + s + ", " + "[n] = " + n
							+ ", " + "[c] = " + c + ", " + "[s2n] = " + s2n + ".");
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Statement s, Node n, Command c, S2N s2n) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("s2n", s2n);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject s, EObject a2c, EObject n, EObject c,
			EObject s2n, EObject a) {
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("a", a);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_261(EMoflonEdge _edge_next) {

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_269(EMoflonEdge _edge_next) {

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
			Statement s = (Statement) result2_black[0];
			Assignment a = (Assignment) result2_black[1];
			Object[] result2_green = assignment2commandImpl
					.pattern_assignment2command_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (assignment2commandImpl
					.pattern_assignment2command_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, s, a)) {
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
		Statement s = (Statement) result2_bindingAndBlack[0];
		Node n = (Node) result2_bindingAndBlack[1];
		Command c = (Command) result2_bindingAndBlack[2];
		Assignment a = (Assignment) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = assignment2commandImpl
				.pattern_assignment2command_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, s, n, c, a, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[s] = " + s + ", " + "[n] = " + n + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (assignment2commandImpl.pattern_assignment2command_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : assignment2commandImpl
					.pattern_assignment2command_24_5_matchcorrcontext_blackBBFBB(s, n, sourceMatch, targetMatch)) {
				S2N s2n = (S2N) result5_black[2];
				Object[] result5_green = assignment2commandImpl
						.pattern_assignment2command_24_5_matchcorrcontext_greenBBBF(s2n, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = assignment2commandImpl
						.pattern_assignment2command_24_6_createcorrespondence_blackBBBBB(s, n, c, a, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[s] = " + s + ", " + "[n] = " + n + ", "
									+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				assignment2commandImpl.pattern_assignment2command_24_6_createcorrespondence_greenFBBB(c, a, ccMatch);
				//nothing S2N a2c = (S2N) result6_green[0];

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
	public CSP isApplicable_solveCsp_CC(Statement s, Node n, Command c, Assignment a, Match sourceMatch,
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
	public boolean checkDEC_FWD(Statement s, Assignment a) {// 
		Object[] result1_black = assignment2commandImpl.pattern_assignment2command_27_1_matchtggpattern_blackBB(s, a);
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
			Statement s = (Statement) result2_black[1];
			S2N s2n = (S2N) result2_black[2];
			Node n = (Node) result2_black[3];

			Object[] result3_bindingAndBlack = assignment2commandImpl
					.pattern_assignment2command_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, s, n, s2n,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s] = " + s + ", " + "[n] = " + n
						+ ", " + "[s2n] = " + s2n + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (assignment2commandImpl.pattern_assignment2command_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = assignment2commandImpl.pattern_assignment2command_29_5_checknacs_blackBBB(s, n,
						s2n);
				if (result5_black != null) {

					Object[] result6_black = assignment2commandImpl.pattern_assignment2command_29_6_perform_blackBBBB(s,
							n, s2n, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[s] = " + s + ", "
								+ "[n] = " + n + ", " + "[s2n] = " + s2n + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					assignment2commandImpl.pattern_assignment2command_29_6_perform_greenBFBFFB(s, n, ruleResult);
					//nothing S2N a2c = (S2N) result6_green[1];
					//nothing Command c = (Command) result6_green[3];
					//nothing Assignment a = (Assignment) result6_green[4];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Statement s, Node n, S2N s2n,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("n", n);
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
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPROPRIATE_FWD__MATCH_STATEMENT_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Statement) arguments.get(1),
					(Assignment) arguments.get(2));
		case RulesPackage.ASSIGNMENT2COMMAND___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_STATEMENT_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Statement) arguments.get(1),
					(Assignment) arguments.get(2));
			return null;
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_STATEMENT_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Statement) arguments.get(1),
					(Assignment) arguments.get(2));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STATEMENT_NODE_S2N_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Statement) arguments.get(1),
					(Node) arguments.get(2), (S2N) arguments.get(3), (Assignment) arguments.get(4));
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
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STATEMENT_NODE_COMMAND_S2N:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Statement) arguments.get(1),
					(Node) arguments.get(2), (Command) arguments.get(3), (S2N) arguments.get(4));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.ASSIGNMENT2COMMAND___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPROPRIATE_BWD_EMOFLON_EDGE_261__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_261((EMoflonEdge) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPROPRIATE_FWD_EMOFLON_EDGE_269__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_269((EMoflonEdge) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_SOLVE_CSP_CC__STATEMENT_NODE_COMMAND_ASSIGNMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Statement) arguments.get(0), (Node) arguments.get(1),
					(Command) arguments.get(2), (Assignment) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.ASSIGNMENT2COMMAND___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ASSIGNMENT2COMMAND___CHECK_DEC_FWD__STATEMENT_ASSIGNMENT:
			return checkDEC_FWD((Statement) arguments.get(0), (Assignment) arguments.get(1));
		case RulesPackage.ASSIGNMENT2COMMAND___CHECK_DEC_BWD__NODE_COMMAND:
			return checkDEC_BWD((Node) arguments.get(0), (Command) arguments.get(1));
		case RulesPackage.ASSIGNMENT2COMMAND___GENERATE_MODEL__RULEENTRYCONTAINER_S2N:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2N) arguments.get(1));
		case RulesPackage.ASSIGNMENT2COMMAND___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STATEMENT_NODE_S2N_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Statement) arguments.get(1),
					(Node) arguments.get(2), (S2N) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.ASSIGNMENT2COMMAND___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_assignment2command_0_1_initialbindings_blackBBBB(assignment2command _this,
			Match match, Statement s, Assignment a) {
		if (!a.equals(s)) {
			return new Object[] { _this, match, s, a };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_0_2_SolveCSP_bindingFBBBB(assignment2command _this,
			Match match, Statement s, Assignment a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, s, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, s, a };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_assignment2command_0_2_SolveCSP_bindingAndBlackFBBBB(assignment2command _this,
			Match match, Statement s, Assignment a) {
		Object[] result_pattern_assignment2command_0_2_SolveCSP_binding = pattern_assignment2command_0_2_SolveCSP_bindingFBBBB(
				_this, match, s, a);
		if (result_pattern_assignment2command_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_assignment2command_0_2_SolveCSP_binding[0];

			Object[] result_pattern_assignment2command_0_2_SolveCSP_black = pattern_assignment2command_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_assignment2command_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, s, a };
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
			Statement s, Assignment a) {
		if (!a.equals(s)) {
			return new Object[] { match, s, a };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Statement s, Assignment a) {
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		String s__a____next_name_prime = "next";
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		match.getToBeTranslatedEdges().add(s__a____next);
		s__a____next.setName(s__a____next_name_prime);
		return new Object[] { match, s, a, s__a____next };
	}

	public static final Object[] pattern_assignment2command_0_5_collectcontextelements_blackBBB(Match match,
			Statement s, Assignment a) {
		if (!a.equals(s)) {
			return new Object[] { match, s, a };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_0_5_collectcontextelements_greenBB(Match match,
			Statement s) {
		match.getContextNodes().add(s);
		return new Object[] { match, s };
	}

	public static final void pattern_assignment2command_0_6_registerobjectstomatch_expressionBBBB(
			assignment2command _this, Match match, Statement s, Assignment a) {
		_this.registerObjectsToMatch_FWD(match, s, a);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("s");
		EObject _localVariable_1 = isApplicableMatch.getObject("n");
		EObject _localVariable_2 = isApplicableMatch.getObject("s2n");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject tmpS = _localVariable_0;
		EObject tmpN = _localVariable_1;
		EObject tmpS2n = _localVariable_2;
		EObject tmpA = _localVariable_3;
		if (tmpS instanceof Statement) {
			Statement s = (Statement) tmpS;
			if (tmpN instanceof Node) {
				Node n = (Node) tmpN;
				if (tmpS2n instanceof S2N) {
					S2N s2n = (S2N) tmpS2n;
					if (tmpA instanceof Assignment) {
						Assignment a = (Assignment) tmpA;
						return new Object[] { s, n, s2n, a, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_1_1_performtransformation_blackBBBBFBB(Statement s, Node n,
			S2N s2n, Assignment a, assignment2command _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(s)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { s, n, s2n, a, csp, _this, isApplicableMatch };
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
			Statement s = (Statement) result_pattern_assignment2command_1_1_performtransformation_binding[0];
			Node n = (Node) result_pattern_assignment2command_1_1_performtransformation_binding[1];
			S2N s2n = (S2N) result_pattern_assignment2command_1_1_performtransformation_binding[2];
			Assignment a = (Assignment) result_pattern_assignment2command_1_1_performtransformation_binding[3];

			Object[] result_pattern_assignment2command_1_1_performtransformation_black = pattern_assignment2command_1_1_performtransformation_blackBBBBFBB(
					s, n, s2n, a, _this, isApplicableMatch);
			if (result_pattern_assignment2command_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_assignment2command_1_1_performtransformation_black[4];

				return new Object[] { s, n, s2n, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_1_1_performtransformation_greenFBFB(Node n, Assignment a) {
		S2N a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command c = ControlflowFactory.eINSTANCE.createCommand();
		a2c.setSource(a);
		a2c.setTarget(c);
		n.setNext(c);
		return new Object[] { a2c, n, c, a };
	}

	public static final Object[] pattern_assignment2command_1_2_collecttranslatedelements_blackBBB(S2N a2c, Command c,
			Assignment a) {
		return new Object[] { a2c, c, a };
	}

	public static final Object[] pattern_assignment2command_1_2_collecttranslatedelements_greenFBBB(S2N a2c, Command c,
			Assignment a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2c);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getTranslatedElements().add(a);
		return new Object[] { ruleresult, a2c, c, a };
	}

	public static final Object[] pattern_assignment2command_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject s, EObject a2c, EObject n, EObject c, EObject s2n, EObject a) {
		if (!s.equals(s2n)) {
			if (!a2c.equals(s)) {
				if (!a2c.equals(n)) {
					if (!a2c.equals(c)) {
						if (!a2c.equals(s2n)) {
							if (!n.equals(s)) {
								if (!n.equals(s2n)) {
									if (!c.equals(s)) {
										if (!c.equals(n)) {
											if (!c.equals(s2n)) {
												if (!a.equals(s)) {
													if (!a.equals(a2c)) {
														if (!a.equals(n)) {
															if (!a.equals(c)) {
																if (!a.equals(s2n)) {
																	return new Object[] { ruleresult, s, a2c, n, c, s2n,
																			a };
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject s, EObject a2c, EObject n, EObject c, EObject a) {
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "assignment2command";
		String s__a____next_name_prime = "next";
		String a2c__c____target_name_prime = "target";
		String a2c__a____source_name_prime = "source";
		String n__c____next_name_prime = "next";
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		ruleresult.getTranslatedEdges().add(s__a____next);
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		ruleresult.getCreatedEdges().add(a2c__c____target);
		a2c__a____source.setSrc(a2c);
		a2c__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2c__a____source);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(n__c____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		s__a____next.setName(s__a____next_name_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		a2c__a____source.setName(a2c__a____source_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { ruleresult, s, a2c, n, c, a, s__a____next, a2c__c____target, a2c__a____source,
				n__c____next };
	}

	public static final void pattern_assignment2command_1_5_registerobjects_expressionBBBBBBBB(assignment2command _this,
			PerformRuleResult ruleresult, EObject s, EObject a2c, EObject n, EObject c, EObject s2n, EObject a) {
		_this.registerObjects_FWD(ruleresult, s, a2c, n, c, s2n, a);

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
		EObject _localVariable_0 = match.getObject("s");
		EObject _localVariable_1 = match.getObject("a");
		EObject tmpS = _localVariable_0;
		EObject tmpA = _localVariable_1;
		if (tmpS instanceof Statement) {
			Statement s = (Statement) tmpS;
			if (tmpA instanceof Assignment) {
				Assignment a = (Assignment) tmpA;
				return new Object[] { s, a, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_assignment2command_2_2_corematch_blackBFFBB(Statement s,
			Assignment a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(s)) {
			for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s, S2N.class, "source")) {
				Node n = s2n.getTarget();
				if (n != null) {
					_result.add(new Object[] { s, n, s2n, a, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_assignment2command_2_3_findcontext_blackBBBB(Statement s, Node n,
			S2N s2n, Assignment a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(s)) {
			if (a.equals(s.getNext())) {
				if (s.equals(s2n.getSource())) {
					if (n.equals(s2n.getTarget())) {
						_result.add(new Object[] { s, n, s2n, a });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_assignment2command_2_3_findcontext_greenBBBBFFFF(Statement s, Node n, S2N s2n,
			Assignment a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String s__a____next_name_prime = "next";
		String s2n__s____source_name_prime = "source";
		String s2n__n____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(s2n);
		isApplicableMatch.getAllContextElements().add(a);
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
		return new Object[] { s, n, s2n, a, isApplicableMatch, s__a____next, s2n__s____source, s2n__n____target };
	}

	public static final Object[] pattern_assignment2command_2_4_solveCSP_bindingFBBBBBB(assignment2command _this,
			IsApplicableMatch isApplicableMatch, Statement s, Node n, S2N s2n, Assignment a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, s, n, s2n, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s, n, s2n, a };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_assignment2command_2_4_solveCSP_bindingAndBlackFBBBBBB(
			assignment2command _this, IsApplicableMatch isApplicableMatch, Statement s, Node n, S2N s2n, Assignment a) {
		Object[] result_pattern_assignment2command_2_4_solveCSP_binding = pattern_assignment2command_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, s, n, s2n, a);
		if (result_pattern_assignment2command_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_assignment2command_2_4_solveCSP_binding[0];

			Object[] result_pattern_assignment2command_2_4_solveCSP_black = pattern_assignment2command_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_assignment2command_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s, n, s2n, a };
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
		EObject _localVariable_0 = isApplicableMatch.getObject("s");
		EObject _localVariable_1 = isApplicableMatch.getObject("n");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("s2n");
		EObject tmpS = _localVariable_0;
		EObject tmpN = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpS2n = _localVariable_3;
		if (tmpS instanceof Statement) {
			Statement s = (Statement) tmpS;
			if (tmpN instanceof Node) {
				Node n = (Node) tmpN;
				if (tmpC instanceof Command) {
					Command c = (Command) tmpC;
					if (tmpS2n instanceof S2N) {
						S2N s2n = (S2N) tmpS2n;
						return new Object[] { s, n, c, s2n, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_11_1_performtransformation_blackBBBBFBB(Statement s, Node n,
			Command c, S2N s2n, assignment2command _this, IsApplicableMatch isApplicableMatch) {
		if (!c.equals(n)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { s, n, c, s2n, csp, _this, isApplicableMatch };
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
			Statement s = (Statement) result_pattern_assignment2command_11_1_performtransformation_binding[0];
			Node n = (Node) result_pattern_assignment2command_11_1_performtransformation_binding[1];
			Command c = (Command) result_pattern_assignment2command_11_1_performtransformation_binding[2];
			S2N s2n = (S2N) result_pattern_assignment2command_11_1_performtransformation_binding[3];

			Object[] result_pattern_assignment2command_11_1_performtransformation_black = pattern_assignment2command_11_1_performtransformation_blackBBBBFBB(
					s, n, c, s2n, _this, isApplicableMatch);
			if (result_pattern_assignment2command_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_assignment2command_11_1_performtransformation_black[4];

				return new Object[] { s, n, c, s2n, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_11_1_performtransformation_greenBFBF(Statement s,
			Command c) {
		S2N a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		a2c.setTarget(c);
		s.setNext(a);
		a2c.setSource(a);
		return new Object[] { s, a2c, c, a };
	}

	public static final Object[] pattern_assignment2command_11_2_collecttranslatedelements_blackBBB(S2N a2c, Command c,
			Assignment a) {
		return new Object[] { a2c, c, a };
	}

	public static final Object[] pattern_assignment2command_11_2_collecttranslatedelements_greenFBBB(S2N a2c, Command c,
			Assignment a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2c);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedElements().add(a);
		return new Object[] { ruleresult, a2c, c, a };
	}

	public static final Object[] pattern_assignment2command_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject s, EObject a2c, EObject n, EObject c, EObject s2n, EObject a) {
		if (!s.equals(s2n)) {
			if (!a2c.equals(s)) {
				if (!a2c.equals(n)) {
					if (!a2c.equals(c)) {
						if (!a2c.equals(s2n)) {
							if (!n.equals(s)) {
								if (!n.equals(s2n)) {
									if (!c.equals(s)) {
										if (!c.equals(n)) {
											if (!c.equals(s2n)) {
												if (!a.equals(s)) {
													if (!a.equals(a2c)) {
														if (!a.equals(n)) {
															if (!a.equals(c)) {
																if (!a.equals(s2n)) {
																	return new Object[] { ruleresult, s, a2c, n, c, s2n,
																			a };
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject s, EObject a2c, EObject n, EObject c, EObject a) {
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "assignment2command";
		String s__a____next_name_prime = "next";
		String a2c__c____target_name_prime = "target";
		String a2c__a____source_name_prime = "source";
		String n__c____next_name_prime = "next";
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		ruleresult.getCreatedEdges().add(s__a____next);
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		ruleresult.getCreatedEdges().add(a2c__c____target);
		a2c__a____source.setSrc(a2c);
		a2c__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2c__a____source);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(n__c____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		s__a____next.setName(s__a____next_name_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		a2c__a____source.setName(a2c__a____source_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { ruleresult, s, a2c, n, c, a, s__a____next, a2c__c____target, a2c__a____source,
				n__c____next };
	}

	public static final void pattern_assignment2command_11_5_registerobjects_expressionBBBBBBBB(
			assignment2command _this, PerformRuleResult ruleresult, EObject s, EObject a2c, EObject n, EObject c,
			EObject s2n, EObject a) {
		_this.registerObjects_BWD(ruleresult, s, a2c, n, c, s2n, a);

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

	public static final Iterable<Object[]> pattern_assignment2command_12_2_corematch_blackFBBFB(Node n, Command c,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(n)) {
			for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n, S2N.class, "target")) {
				Statement s = s2n.getSource();
				if (s != null) {
					_result.add(new Object[] { s, n, c, s2n, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_assignment2command_12_3_findcontext_blackBBBB(Statement s, Node n,
			Command c, S2N s2n) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(n)) {
			if (s.equals(s2n.getSource())) {
				if (n.equals(s2n.getTarget())) {
					if (c.equals(n.getNext())) {
						_result.add(new Object[] { s, n, c, s2n });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_assignment2command_12_3_findcontext_greenBBBBFFFF(Statement s, Node n,
			Command c, S2N s2n) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String s2n__s____source_name_prime = "source";
		String s2n__n____target_name_prime = "target";
		String n__c____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(s2n);
		s2n__s____source.setSrc(s2n);
		s2n__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2n__s____source);
		s2n__n____target.setSrc(s2n);
		s2n__n____target.setTrg(n);
		isApplicableMatch.getAllContextElements().add(s2n__n____target);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(n__c____next);
		s2n__s____source.setName(s2n__s____source_name_prime);
		s2n__n____target.setName(s2n__n____target_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { s, n, c, s2n, isApplicableMatch, s2n__s____source, s2n__n____target, n__c____next };
	}

	public static final Object[] pattern_assignment2command_12_4_solveCSP_bindingFBBBBBB(assignment2command _this,
			IsApplicableMatch isApplicableMatch, Statement s, Node n, Command c, S2N s2n) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, s, n, c, s2n);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s, n, c, s2n };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_assignment2command_12_4_solveCSP_bindingAndBlackFBBBBBB(
			assignment2command _this, IsApplicableMatch isApplicableMatch, Statement s, Node n, Command c, S2N s2n) {
		Object[] result_pattern_assignment2command_12_4_solveCSP_binding = pattern_assignment2command_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, s, n, c, s2n);
		if (result_pattern_assignment2command_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_assignment2command_12_4_solveCSP_binding[0];

			Object[] result_pattern_assignment2command_12_4_solveCSP_black = pattern_assignment2command_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_assignment2command_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s, n, c, s2n };
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
		for (Graph __DEC_c_root_328798 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Graph.class, "root")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_20_2_testcorematchandDECs_black_nac_1BB(Command c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_positive_224591 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "positive")) {
				if (!n.equals(__DEC_c_positive_224591)) {
					return new Object[] { c, n };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_20_2_testcorematchandDECs_black_nac_2BB(Command c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_negative_180212 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "negative")) {
				if (!n.equals(__DEC_c_negative_180212)) {
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
			for (Decision __DEC_a_positive_77302 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					Decision.class, "positive")) {
				if (!s.equals(__DEC_a_positive_77302)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_21_2_testcorematchandDECs_black_nac_1BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_negative_598787 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!s.equals(__DEC_a_negative_598787)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_21_2_testcorematchandDECs_black_nac_2BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_first_256743 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!s.equals(__DEC_a_first_256743)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_21_2_testcorematchandDECs_black_nac_3BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_last_774868 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!s.equals(__DEC_a_last_774868)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_21_2_testcorematchandDECs_black_nac_4B(Assignment a) {
		for (Program __DEC_a_first_351818 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
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
											_result.add(new Object[] { s, a, _edge_next });
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
			assignment2command _this, Match match, Statement s, Assignment a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, s, a);
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
		EObject _localVariable_0 = sourceMatch.getObject("s");
		EObject _localVariable_1 = targetMatch.getObject("n");
		EObject _localVariable_2 = targetMatch.getObject("c");
		EObject _localVariable_3 = sourceMatch.getObject("a");
		EObject tmpS = _localVariable_0;
		EObject tmpN = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpA = _localVariable_3;
		if (tmpS instanceof Statement) {
			Statement s = (Statement) tmpS;
			if (tmpN instanceof Node) {
				Node n = (Node) tmpN;
				if (tmpC instanceof Command) {
					Command c = (Command) tmpC;
					if (tmpA instanceof Assignment) {
						Assignment a = (Assignment) tmpA;
						return new Object[] { s, n, c, a, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_24_2_matchsrctrgcontext_blackBBBBBB(Statement s, Node n,
			Command c, Assignment a, Match sourceMatch, Match targetMatch) {
		if (!c.equals(n)) {
			if (!a.equals(s)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { s, n, c, a, sourceMatch, targetMatch };
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
			Statement s = (Statement) result_pattern_assignment2command_24_2_matchsrctrgcontext_binding[0];
			Node n = (Node) result_pattern_assignment2command_24_2_matchsrctrgcontext_binding[1];
			Command c = (Command) result_pattern_assignment2command_24_2_matchsrctrgcontext_binding[2];
			Assignment a = (Assignment) result_pattern_assignment2command_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_assignment2command_24_2_matchsrctrgcontext_black = pattern_assignment2command_24_2_matchsrctrgcontext_blackBBBBBB(
					s, n, c, a, sourceMatch, targetMatch);
			if (result_pattern_assignment2command_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { s, n, c, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_24_3_solvecsp_bindingFBBBBBBB(assignment2command _this,
			Statement s, Node n, Command c, Assignment a, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(s, n, c, a, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, s, n, c, a, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_assignment2command_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			assignment2command _this, Statement s, Node n, Command c, Assignment a, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_assignment2command_24_3_solvecsp_binding = pattern_assignment2command_24_3_solvecsp_bindingFBBBBBBB(
				_this, s, n, c, a, sourceMatch, targetMatch);
		if (result_pattern_assignment2command_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_assignment2command_24_3_solvecsp_binding[0];

			Object[] result_pattern_assignment2command_24_3_solvecsp_black = pattern_assignment2command_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_assignment2command_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, s, n, c, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_assignment2command_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_assignment2command_24_5_matchcorrcontext_blackBBFBB(Statement s,
			Node n, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s, S2N.class, "source")) {
				if (n.equals(s2n.getTarget())) {
					_result.add(new Object[] { s, n, s2n, sourceMatch, targetMatch });
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

	public static final Object[] pattern_assignment2command_24_6_createcorrespondence_blackBBBBB(Statement s, Node n,
			Command c, Assignment a, CCMatch ccMatch) {
		if (!c.equals(n)) {
			if (!a.equals(s)) {
				return new Object[] { s, n, c, a, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_24_6_createcorrespondence_greenFBBB(Command c, Assignment a,
			CCMatch ccMatch) {
		S2N a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2c.setTarget(c);
		a2c.setSource(a);
		ccMatch.getCreateCorr().add(a2c);
		return new Object[] { a2c, c, a, ccMatch };
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
			for (Decision __DEC_a_positive_554438 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "positive")) {
				if (!s.equals(__DEC_a_positive_554438)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_27_1_matchtggpattern_black_nac_1BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_negative_177867 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!s.equals(__DEC_a_negative_177867)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_27_1_matchtggpattern_black_nac_2BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_first_520129 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!s.equals(__DEC_a_first_520129)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_27_1_matchtggpattern_black_nac_3BB(Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_last_98351 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!s.equals(__DEC_a_last_98351)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_27_1_matchtggpattern_black_nac_4B(Assignment a) {
		for (Program __DEC_a_first_789243 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_27_1_matchtggpattern_blackBB(Statement s, Assignment a) {
		if (!a.equals(s)) {
			if (a.equals(s.getNext())) {
				if (pattern_assignment2command_27_1_matchtggpattern_black_nac_0BB(a, s) == null) {
					if (pattern_assignment2command_27_1_matchtggpattern_black_nac_1BB(a, s) == null) {
						if (pattern_assignment2command_27_1_matchtggpattern_black_nac_2BB(a, s) == null) {
							if (pattern_assignment2command_27_1_matchtggpattern_black_nac_3BB(a, s) == null) {
								if (pattern_assignment2command_27_1_matchtggpattern_black_nac_4B(a) == null) {
									return new Object[] { s, a };
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
		for (Graph __DEC_c_root_621930 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Graph.class, "root")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_28_1_matchtggpattern_black_nac_1BB(Command c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_positive_834759 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "positive")) {
				if (!n.equals(__DEC_c_positive_834759)) {
					return new Object[] { c, n };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_28_1_matchtggpattern_black_nac_2BB(Command c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_negative_186641 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "negative")) {
				if (!n.equals(__DEC_c_negative_186641)) {
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
			ModelgeneratorRuleResult ruleResult, Statement s) {
		if (ruleResult.getSourceObjects().contains(s)) {
			return new Object[] { ruleResult, s };
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
			ModelgeneratorRuleResult ruleResult, Node n) {
		if (ruleResult.getTargetObjects().contains(n)) {
			return new Object[] { ruleResult, n };
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
					Statement s = s2n.getSource();
					if (s != null) {
						Node n = s2n.getTarget();
						if (n != null) {
							if (pattern_assignment2command_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									s2n) == null) {
								if (pattern_assignment2command_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										s) == null) {
									if (pattern_assignment2command_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											n) == null) {
										_result.add(
												new Object[] { s2nList, s, s2n, n, ruleEntryContainer, ruleResult });
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
			IsApplicableMatch isApplicableMatch, Statement s, Node n, S2N s2n, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, s, n, s2n, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s, n, s2n, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_assignment2command_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_assignment2command_29_3_solveCSP_bindingAndBlackFBBBBBB(
			assignment2command _this, IsApplicableMatch isApplicableMatch, Statement s, Node n, S2N s2n,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_assignment2command_29_3_solveCSP_binding = pattern_assignment2command_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, s, n, s2n, ruleResult);
		if (result_pattern_assignment2command_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_assignment2command_29_3_solveCSP_binding[0];

			Object[] result_pattern_assignment2command_29_3_solveCSP_black = pattern_assignment2command_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_assignment2command_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s, n, s2n, ruleResult };
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

	public static final Object[] pattern_assignment2command_29_5_checknacs_blackBBB(Statement s, Node n, S2N s2n) {
		return new Object[] { s, n, s2n };
	}

	public static final Object[] pattern_assignment2command_29_6_perform_blackBBBB(Statement s, Node n, S2N s2n,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { s, n, s2n, ruleResult };
	}

	public static final Object[] pattern_assignment2command_29_6_perform_greenBFBFFB(Statement s, Node n,
			ModelgeneratorRuleResult ruleResult) {
		S2N a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command c = ControlflowFactory.eINSTANCE.createCommand();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2c);
		a2c.setTarget(c);
		n.setNext(c);
		ruleResult.getTargetObjects().add(c);
		s.setNext(a);
		a2c.setSource(a);
		ruleResult.getSourceObjects().add(a);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { s, a2c, n, c, a, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_assignment2command_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //assignment2commandImpl
