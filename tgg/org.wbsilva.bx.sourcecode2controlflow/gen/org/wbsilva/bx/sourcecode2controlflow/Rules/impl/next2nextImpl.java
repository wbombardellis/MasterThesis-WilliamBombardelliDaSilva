/**
 */
package org.wbsilva.bx.sourcecode2controlflow.Rules.impl;

import controlflow.Command;
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
import org.wbsilva.bx.sourcecode2controlflow.Rules.next2next;

import org.wbsilva.bx.sourcecode2controlflow.S2N;

import sourcecode.Assignment;
import sourcecode.Statement;
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
 * An implementation of the model object '<em><b>next2next</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class next2nextImpl extends AbstractRuleImpl implements next2next {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected next2nextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getnext2next();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Statement s, Assignment a) {

		Object[] result1_black = next2nextImpl.pattern_next2next_0_1_initialbindings_blackBBBB(this, match, s, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[s] = " + s + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = next2nextImpl.pattern_next2next_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, s, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[s] = " + s + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (next2nextImpl.pattern_next2next_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = next2nextImpl.pattern_next2next_0_4_collectelementstobetranslated_blackBBB(match,
					s, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[s] = " + s + ", " + "[a] = " + a + ".");
			}
			next2nextImpl.pattern_next2next_0_4_collectelementstobetranslated_greenBBBF(match, s, a);
			//nothing EMoflonEdge s__a____next = (EMoflonEdge) result4_green[3];

			Object[] result5_black = next2nextImpl.pattern_next2next_0_5_collectcontextelements_blackBBB(match, s, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[s] = " + s + ", " + "[a] = " + a + ".");
			}
			next2nextImpl.pattern_next2next_0_5_collectcontextelements_greenBBB(match, s, a);

			// 
			next2nextImpl.pattern_next2next_0_6_registerobjectstomatch_expressionBBBB(this, match, s, a);
			return next2nextImpl.pattern_next2next_0_7_expressionF();
		} else {
			return next2nextImpl.pattern_next2next_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = next2nextImpl
				.pattern_next2next_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Statement s = (Statement) result1_bindingAndBlack[0];
		S2N s2n = (S2N) result1_bindingAndBlack[1];
		S2N a2c = (S2N) result1_bindingAndBlack[2];
		Command c = (Command) result1_bindingAndBlack[3];
		Node n = (Node) result1_bindingAndBlack[4];
		Assignment a = (Assignment) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		next2nextImpl.pattern_next2next_1_1_performtransformation_greenBB(c, n);

		Object[] result2_green = next2nextImpl.pattern_next2next_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = next2nextImpl.pattern_next2next_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, s,
				s2n, a2c, c, n, a);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[s] = " + s + ", " + "[s2n] = " + s2n + ", " + "[a2c] = " + a2c + ", " + "[c] = " + c
					+ ", " + "[n] = " + n + ", " + "[a] = " + a + ".");
		}
		next2nextImpl.pattern_next2next_1_3_bookkeepingforedges_greenBBBBBFF(ruleresult, s, c, n, a);
		//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[6];

		// 
		// 
		next2nextImpl.pattern_next2next_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, s, s2n, a2c, c, n, a);
		return next2nextImpl.pattern_next2next_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = next2nextImpl
				.pattern_next2next_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = next2nextImpl.pattern_next2next_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = next2nextImpl.pattern_next2next_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Statement s = (Statement) result2_binding[0];
		Assignment a = (Assignment) result2_binding[1];
		for (Object[] result2_black : next2nextImpl.pattern_next2next_2_2_corematch_blackBFFFFBB(s, a, match)) {
			S2N s2n = (S2N) result2_black[1];
			S2N a2c = (S2N) result2_black[2];
			Command c = (Command) result2_black[3];
			Node n = (Node) result2_black[4];
			// ForEach 
			for (Object[] result3_black : next2nextImpl.pattern_next2next_2_3_findcontext_blackBBBBBB(s, s2n, a2c, c, n,
					a)) {
				Object[] result3_green = next2nextImpl.pattern_next2next_2_3_findcontext_greenBBBBBBFFFFFF(s, s2n, a2c,
						c, n, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge a2c__a____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = next2nextImpl
						.pattern_next2next_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, s, s2n, a2c,
								c, n, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s] = " + s + ", " + "[s2n] = "
							+ s2n + ", " + "[a2c] = " + a2c + ", " + "[c] = " + c + ", " + "[n] = " + n + ", "
							+ "[a] = " + a + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (next2nextImpl.pattern_next2next_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = next2nextImpl
							.pattern_next2next_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					next2nextImpl.pattern_next2next_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return next2nextImpl.pattern_next2next_2_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Statement s, S2N s2n, S2N a2c, Command c,
			Node n, Assignment a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("s2n", s2n);
		isApplicableMatch.registerObject("a2c", a2c);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("n", n);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject s, EObject s2n, EObject a2c, EObject c,
			EObject n, EObject a) {
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("a", a);

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
	public boolean isAppropriate_BWD(Match match, Command c, Node n) {

		Object[] result1_black = next2nextImpl.pattern_next2next_10_1_initialbindings_blackBBBB(this, match, c, n);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[n] = " + n + ".");
		}

		Object[] result2_bindingAndBlack = next2nextImpl.pattern_next2next_10_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, c, n);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[n] = " + n + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (next2nextImpl.pattern_next2next_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = next2nextImpl.pattern_next2next_10_4_collectelementstobetranslated_blackBBB(match,
					c, n);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[n] = " + n + ".");
			}
			next2nextImpl.pattern_next2next_10_4_collectelementstobetranslated_greenBBBF(match, c, n);
			//nothing EMoflonEdge n__c____next = (EMoflonEdge) result4_green[3];

			Object[] result5_black = next2nextImpl.pattern_next2next_10_5_collectcontextelements_blackBBB(match, c, n);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[n] = " + n + ".");
			}
			next2nextImpl.pattern_next2next_10_5_collectcontextelements_greenBBB(match, c, n);

			// 
			next2nextImpl.pattern_next2next_10_6_registerobjectstomatch_expressionBBBB(this, match, c, n);
			return next2nextImpl.pattern_next2next_10_7_expressionF();
		} else {
			return next2nextImpl.pattern_next2next_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = next2nextImpl
				.pattern_next2next_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Statement s = (Statement) result1_bindingAndBlack[0];
		S2N s2n = (S2N) result1_bindingAndBlack[1];
		S2N a2c = (S2N) result1_bindingAndBlack[2];
		Command c = (Command) result1_bindingAndBlack[3];
		Node n = (Node) result1_bindingAndBlack[4];
		Assignment a = (Assignment) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		next2nextImpl.pattern_next2next_11_1_performtransformation_greenBB(s, a);

		Object[] result2_green = next2nextImpl.pattern_next2next_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = next2nextImpl.pattern_next2next_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, s,
				s2n, a2c, c, n, a);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[s] = " + s + ", " + "[s2n] = " + s2n + ", " + "[a2c] = " + a2c + ", " + "[c] = " + c
					+ ", " + "[n] = " + n + ", " + "[a] = " + a + ".");
		}
		next2nextImpl.pattern_next2next_11_3_bookkeepingforedges_greenBBBBBFF(ruleresult, s, c, n, a);
		//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[6];

		// 
		// 
		next2nextImpl.pattern_next2next_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, s, s2n, a2c, c, n, a);
		return next2nextImpl.pattern_next2next_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = next2nextImpl
				.pattern_next2next_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = next2nextImpl.pattern_next2next_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = next2nextImpl.pattern_next2next_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command c = (Command) result2_binding[0];
		Node n = (Node) result2_binding[1];
		for (Object[] result2_black : next2nextImpl.pattern_next2next_12_2_corematch_blackFFFBBFB(c, n, match)) {
			Statement s = (Statement) result2_black[0];
			S2N s2n = (S2N) result2_black[1];
			S2N a2c = (S2N) result2_black[2];
			Assignment a = (Assignment) result2_black[5];
			// ForEach 
			for (Object[] result3_black : next2nextImpl.pattern_next2next_12_3_findcontext_blackBBBBBB(s, s2n, a2c, c,
					n, a)) {
				Object[] result3_green = next2nextImpl.pattern_next2next_12_3_findcontext_greenBBBBBBFFFFFF(s, s2n, a2c,
						c, n, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge a2c__a____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = next2nextImpl
						.pattern_next2next_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, s, s2n, a2c,
								c, n, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s] = " + s + ", " + "[s2n] = "
							+ s2n + ", " + "[a2c] = " + a2c + ", " + "[c] = " + c + ", " + "[n] = " + n + ", "
							+ "[a] = " + a + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (next2nextImpl.pattern_next2next_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = next2nextImpl
							.pattern_next2next_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					next2nextImpl.pattern_next2next_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return next2nextImpl.pattern_next2next_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command c, Node n) {
		match.registerObject("c", c);
		match.registerObject("n", n);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command c, Node n) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Statement s, S2N s2n, S2N a2c, Command c,
			Node n, Assignment a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("s2n", s2n);
		isApplicableMatch.registerObject("a2c", a2c);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("a", a);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject s, EObject s2n, EObject a2c, EObject c,
			EObject n, EObject a) {
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("a", a);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_62(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = next2nextImpl
				.pattern_next2next_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = next2nextImpl.pattern_next2next_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : next2nextImpl.pattern_next2next_20_2_testcorematchandDECs_blackFFB(_edge_next)) {
			Command c = (Command) result2_black[0];
			Node n = (Node) result2_black[1];
			Object[] result2_green = next2nextImpl.pattern_next2next_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (next2nextImpl.pattern_next2next_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, c, n)) {
				// 
				if (next2nextImpl.pattern_next2next_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = next2nextImpl.pattern_next2next_20_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					next2nextImpl.pattern_next2next_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return next2nextImpl.pattern_next2next_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_68(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = next2nextImpl
				.pattern_next2next_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = next2nextImpl.pattern_next2next_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : next2nextImpl.pattern_next2next_21_2_testcorematchandDECs_blackFFB(_edge_next)) {
			Statement s = (Statement) result2_black[0];
			Assignment a = (Assignment) result2_black[1];
			Object[] result2_green = next2nextImpl.pattern_next2next_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (next2nextImpl.pattern_next2next_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, s, a)) {
				// 
				if (next2nextImpl.pattern_next2next_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = next2nextImpl.pattern_next2next_21_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					next2nextImpl.pattern_next2next_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return next2nextImpl.pattern_next2next_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("next2next");
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
		ruleResult.setRule("next2next");
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

		Object[] result1_black = next2nextImpl.pattern_next2next_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = next2nextImpl.pattern_next2next_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = next2nextImpl
				.pattern_next2next_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Statement s = (Statement) result2_bindingAndBlack[0];
		Command c = (Command) result2_bindingAndBlack[1];
		Node n = (Node) result2_bindingAndBlack[2];
		Assignment a = (Assignment) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = next2nextImpl.pattern_next2next_24_3_solvecsp_bindingAndBlackFBBBBBBB(this,
				s, c, n, a, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[s] = " + s + ", " + "[c] = " + c + ", " + "[n] = " + n + ", " + "[a] = " + a + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (next2nextImpl.pattern_next2next_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : next2nextImpl.pattern_next2next_24_5_matchcorrcontext_blackBFFBBBBB(s, c, n,
					a, sourceMatch, targetMatch)) {
				S2N s2n = (S2N) result5_black[1];
				S2N a2c = (S2N) result5_black[2];
				Object[] result5_green = next2nextImpl.pattern_next2next_24_5_matchcorrcontext_greenBBBBF(s2n, a2c,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = next2nextImpl.pattern_next2next_24_6_createcorrespondence_blackBBBBB(s, c, n,
						a, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[s] = " + s + ", " + "[c] = " + c + ", "
									+ "[n] = " + n + ", " + "[a] = " + a + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = next2nextImpl.pattern_next2next_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				next2nextImpl.pattern_next2next_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return next2nextImpl.pattern_next2next_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Statement s, Command c, Node n, Assignment a, Match sourceMatch,
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
		Object[] result1_black = next2nextImpl.pattern_next2next_27_1_matchtggpattern_blackBB(s, a);
		if (result1_black != null) {
			return next2nextImpl.pattern_next2next_27_2_expressionF();
		} else {
			return next2nextImpl.pattern_next2next_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command c, Node n) {// 
		Object[] result1_black = next2nextImpl.pattern_next2next_28_1_matchtggpattern_blackBB(c, n);
		if (result1_black != null) {
			return next2nextImpl.pattern_next2next_28_2_expressionF();
		} else {
			return next2nextImpl.pattern_next2next_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2N s2nParameter,
			S2N a2cParameter) {

		Object[] result1_black = next2nextImpl.pattern_next2next_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = next2nextImpl.pattern_next2next_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : next2nextImpl
				.pattern_next2next_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList s2nList = (RuleEntryList) result2_black[0];
			Statement s = (Statement) result2_black[1];
			S2N s2n = (S2N) result2_black[2];
			Node n = (Node) result2_black[3];
			//nothing RuleEntryList a2cList = (RuleEntryList) result2_black[4];
			S2N a2c = (S2N) result2_black[5];
			Command c = (Command) result2_black[6];
			Assignment a = (Assignment) result2_black[7];

			Object[] result3_bindingAndBlack = next2nextImpl.pattern_next2next_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
					this, isApplicableMatch, s, s2n, a2c, c, n, a, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s] = " + s + ", " + "[s2n] = " + s2n
						+ ", " + "[a2c] = " + a2c + ", " + "[c] = " + c + ", " + "[n] = " + n + ", " + "[a] = " + a
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (next2nextImpl.pattern_next2next_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = next2nextImpl.pattern_next2next_29_5_checknacs_blackBBBBBB(s, s2n, a2c, c, n,
						a);
				if (result5_black != null) {

					Object[] result6_black = next2nextImpl.pattern_next2next_29_6_perform_blackBBBBBBB(s, s2n, a2c, c,
							n, a, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[s] = " + s + ", "
								+ "[s2n] = " + s2n + ", " + "[a2c] = " + a2c + ", " + "[c] = " + c + ", " + "[n] = " + n
								+ ", " + "[a] = " + a + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					next2nextImpl.pattern_next2next_29_6_perform_greenBBBBB(s, c, n, a, ruleResult);

				} else {
				}

			} else {
			}

		}
		return next2nextImpl.pattern_next2next_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Statement s, S2N s2n, S2N a2c, Command c,
			Node n, Assignment a, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("s2n", s2n);
		isApplicableMatch.registerObject("a2c", a2c);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("a", a);
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
		case RulesPackage.NEXT2NEXT___IS_APPROPRIATE_FWD__MATCH_STATEMENT_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Statement) arguments.get(1),
					(Assignment) arguments.get(2));
		case RulesPackage.NEXT2NEXT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NEXT2NEXT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.NEXT2NEXT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_STATEMENT_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Statement) arguments.get(1),
					(Assignment) arguments.get(2));
			return null;
		case RulesPackage.NEXT2NEXT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_STATEMENT_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Statement) arguments.get(1),
					(Assignment) arguments.get(2));
		case RulesPackage.NEXT2NEXT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NEXT2NEXT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STATEMENT_S2N_S2N_COMMAND_NODE_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Statement) arguments.get(1),
					(S2N) arguments.get(2), (S2N) arguments.get(3), (Command) arguments.get(4), (Node) arguments.get(5),
					(Assignment) arguments.get(6));
		case RulesPackage.NEXT2NEXT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NEXT2NEXT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.NEXT2NEXT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.NEXT2NEXT___IS_APPROPRIATE_BWD__MATCH_COMMAND_NODE:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Node) arguments.get(2));
		case RulesPackage.NEXT2NEXT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NEXT2NEXT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.NEXT2NEXT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_NODE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Node) arguments.get(2));
			return null;
		case RulesPackage.NEXT2NEXT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_NODE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Node) arguments.get(2));
		case RulesPackage.NEXT2NEXT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NEXT2NEXT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STATEMENT_S2N_S2N_COMMAND_NODE_ASSIGNMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Statement) arguments.get(1),
					(S2N) arguments.get(2), (S2N) arguments.get(3), (Command) arguments.get(4), (Node) arguments.get(5),
					(Assignment) arguments.get(6));
		case RulesPackage.NEXT2NEXT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NEXT2NEXT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.NEXT2NEXT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.NEXT2NEXT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_62__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_62((EMoflonEdge) arguments.get(0));
		case RulesPackage.NEXT2NEXT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_68__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_68((EMoflonEdge) arguments.get(0));
		case RulesPackage.NEXT2NEXT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.NEXT2NEXT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.NEXT2NEXT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.NEXT2NEXT___IS_APPLICABLE_SOLVE_CSP_CC__STATEMENT_COMMAND_NODE_ASSIGNMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Statement) arguments.get(0), (Command) arguments.get(1),
					(Node) arguments.get(2), (Assignment) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.NEXT2NEXT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.NEXT2NEXT___CHECK_DEC_FWD__STATEMENT_ASSIGNMENT:
			return checkDEC_FWD((Statement) arguments.get(0), (Assignment) arguments.get(1));
		case RulesPackage.NEXT2NEXT___CHECK_DEC_BWD__COMMAND_NODE:
			return checkDEC_BWD((Command) arguments.get(0), (Node) arguments.get(1));
		case RulesPackage.NEXT2NEXT___GENERATE_MODEL__RULEENTRYCONTAINER_S2N_S2N:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2N) arguments.get(1), (S2N) arguments.get(2));
		case RulesPackage.NEXT2NEXT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STATEMENT_S2N_S2N_COMMAND_NODE_ASSIGNMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Statement) arguments.get(1),
					(S2N) arguments.get(2), (S2N) arguments.get(3), (Command) arguments.get(4), (Node) arguments.get(5),
					(Assignment) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.NEXT2NEXT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_next2next_0_1_initialbindings_blackBBBB(next2next _this, Match match,
			Statement s, Assignment a) {
		if (!a.equals(s)) {
			return new Object[] { _this, match, s, a };
		}
		return null;
	}

	public static final Object[] pattern_next2next_0_2_SolveCSP_bindingFBBBB(next2next _this, Match match, Statement s,
			Assignment a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, s, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, s, a };
		}
		return null;
	}

	public static final Object[] pattern_next2next_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_next2next_0_2_SolveCSP_bindingAndBlackFBBBB(next2next _this, Match match,
			Statement s, Assignment a) {
		Object[] result_pattern_next2next_0_2_SolveCSP_binding = pattern_next2next_0_2_SolveCSP_bindingFBBBB(_this,
				match, s, a);
		if (result_pattern_next2next_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_next2next_0_2_SolveCSP_binding[0];

			Object[] result_pattern_next2next_0_2_SolveCSP_black = pattern_next2next_0_2_SolveCSP_blackB(csp);
			if (result_pattern_next2next_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, s, a };
			}
		}
		return null;
	}

	public static final boolean pattern_next2next_0_3_CheckCSP_expressionFBB(next2next _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_next2next_0_4_collectelementstobetranslated_blackBBB(Match match, Statement s,
			Assignment a) {
		if (!a.equals(s)) {
			return new Object[] { match, s, a };
		}
		return null;
	}

	public static final Object[] pattern_next2next_0_4_collectelementstobetranslated_greenBBBF(Match match, Statement s,
			Assignment a) {
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String s__a____next_name_prime = "next";
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		match.getToBeTranslatedEdges().add(s__a____next);
		s__a____next.setName(s__a____next_name_prime);
		return new Object[] { match, s, a, s__a____next };
	}

	public static final Object[] pattern_next2next_0_5_collectcontextelements_blackBBB(Match match, Statement s,
			Assignment a) {
		if (!a.equals(s)) {
			return new Object[] { match, s, a };
		}
		return null;
	}

	public static final Object[] pattern_next2next_0_5_collectcontextelements_greenBBB(Match match, Statement s,
			Assignment a) {
		match.getContextNodes().add(s);
		match.getContextNodes().add(a);
		return new Object[] { match, s, a };
	}

	public static final void pattern_next2next_0_6_registerobjectstomatch_expressionBBBB(next2next _this, Match match,
			Statement s, Assignment a) {
		_this.registerObjectsToMatch_FWD(match, s, a);

	}

	public static final boolean pattern_next2next_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_next2next_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_next2next_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("s");
		EObject _localVariable_1 = isApplicableMatch.getObject("s2n");
		EObject _localVariable_2 = isApplicableMatch.getObject("a2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("n");
		EObject _localVariable_5 = isApplicableMatch.getObject("a");
		EObject tmpS = _localVariable_0;
		EObject tmpS2n = _localVariable_1;
		EObject tmpA2c = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpN = _localVariable_4;
		EObject tmpA = _localVariable_5;
		if (tmpS instanceof Statement) {
			Statement s = (Statement) tmpS;
			if (tmpS2n instanceof S2N) {
				S2N s2n = (S2N) tmpS2n;
				if (tmpA2c instanceof S2N) {
					S2N a2c = (S2N) tmpA2c;
					if (tmpC instanceof Command) {
						Command c = (Command) tmpC;
						if (tmpN instanceof Node) {
							Node n = (Node) tmpN;
							if (tmpA instanceof Assignment) {
								Assignment a = (Assignment) tmpA;
								return new Object[] { s, s2n, a2c, c, n, a, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_1_1_performtransformation_blackBBBBBBFBB(Statement s, S2N s2n,
			S2N a2c, Command c, Node n, Assignment a, next2next _this, IsApplicableMatch isApplicableMatch) {
		if (!a2c.equals(s2n)) {
			if (!c.equals(n)) {
				if (!a.equals(s)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { s, s2n, a2c, c, n, a, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_1_1_performtransformation_bindingAndBlackFFFFFFFBB(next2next _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_next2next_1_1_performtransformation_binding = pattern_next2next_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_next2next_1_1_performtransformation_binding != null) {
			Statement s = (Statement) result_pattern_next2next_1_1_performtransformation_binding[0];
			S2N s2n = (S2N) result_pattern_next2next_1_1_performtransformation_binding[1];
			S2N a2c = (S2N) result_pattern_next2next_1_1_performtransformation_binding[2];
			Command c = (Command) result_pattern_next2next_1_1_performtransformation_binding[3];
			Node n = (Node) result_pattern_next2next_1_1_performtransformation_binding[4];
			Assignment a = (Assignment) result_pattern_next2next_1_1_performtransformation_binding[5];

			Object[] result_pattern_next2next_1_1_performtransformation_black = pattern_next2next_1_1_performtransformation_blackBBBBBBFBB(
					s, s2n, a2c, c, n, a, _this, isApplicableMatch);
			if (result_pattern_next2next_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_next2next_1_1_performtransformation_black[6];

				return new Object[] { s, s2n, a2c, c, n, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_1_1_performtransformation_greenBB(Command c, Node n) {
		n.setNext(c);
		return new Object[] { c, n };
	}

	public static final Object[] pattern_next2next_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_next2next_1_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject s, EObject s2n, EObject a2c, EObject c, EObject n, EObject a) {
		if (!s.equals(s2n)) {
			if (!a2c.equals(s)) {
				if (!a2c.equals(s2n)) {
					if (!a2c.equals(c)) {
						if (!a2c.equals(n)) {
							if (!c.equals(s)) {
								if (!c.equals(s2n)) {
									if (!c.equals(n)) {
										if (!n.equals(s)) {
											if (!n.equals(s2n)) {
												if (!a.equals(s)) {
													if (!a.equals(s2n)) {
														if (!a.equals(a2c)) {
															if (!a.equals(c)) {
																if (!a.equals(n)) {
																	return new Object[] { ruleresult, s, s2n, a2c, c, n,
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

	public static final Object[] pattern_next2next_1_3_bookkeepingforedges_greenBBBBBFF(PerformRuleResult ruleresult,
			EObject s, EObject c, EObject n, EObject a) {
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "next2next";
		String s__a____next_name_prime = "next";
		String n__c____next_name_prime = "next";
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		ruleresult.getTranslatedEdges().add(s__a____next);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(n__c____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		s__a____next.setName(s__a____next_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { ruleresult, s, c, n, a, s__a____next, n__c____next };
	}

	public static final void pattern_next2next_1_5_registerobjects_expressionBBBBBBBB(next2next _this,
			PerformRuleResult ruleresult, EObject s, EObject s2n, EObject a2c, EObject c, EObject n, EObject a) {
		_this.registerObjects_FWD(ruleresult, s, s2n, a2c, c, n, a);

	}

	public static final PerformRuleResult pattern_next2next_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_next2next_2_1_preparereturnvalue_bindingFB(next2next _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_next2next_2_1_preparereturnvalue_blackFBB(EClass eClass, next2next _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_next2next_2_1_preparereturnvalue_bindingAndBlackFFB(next2next _this) {
		Object[] result_pattern_next2next_2_1_preparereturnvalue_binding = pattern_next2next_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_next2next_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_next2next_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_next2next_2_1_preparereturnvalue_black = pattern_next2next_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_next2next_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_next2next_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "next2next";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_next2next_2_2_corematch_bindingFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_next2next_2_2_corematch_blackBFFFFBB(Statement s, Assignment a,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(s)) {
			for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s, S2N.class, "source")) {
				Node n = s2n.getTarget();
				if (n != null) {
					for (S2N a2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a, S2N.class,
							"source")) {
						if (!a2c.equals(s2n)) {
							Node tmpC = a2c.getTarget();
							if (tmpC instanceof Command) {
								Command c = (Command) tmpC;
								if (!c.equals(n)) {
									_result.add(new Object[] { s, s2n, a2c, c, n, a, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_next2next_2_3_findcontext_blackBBBBBB(Statement s, S2N s2n, S2N a2c,
			Command c, Node n, Assignment a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a2c.equals(s2n)) {
			if (!c.equals(n)) {
				if (!a.equals(s)) {
					if (a.equals(s.getNext())) {
						if (s.equals(s2n.getSource())) {
							if (c.equals(a2c.getTarget())) {
								if (n.equals(s2n.getTarget())) {
									if (a.equals(a2c.getSource())) {
										_result.add(new Object[] { s, s2n, a2c, c, n, a });
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

	public static final Object[] pattern_next2next_2_3_findcontext_greenBBBBBBFFFFFF(Statement s, S2N s2n, S2N a2c,
			Command c, Node n, Assignment a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String s__a____next_name_prime = "next";
		String s2n__s____source_name_prime = "source";
		String a2c__c____target_name_prime = "target";
		String s2n__n____target_name_prime = "target";
		String a2c__a____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(s2n);
		isApplicableMatch.getAllContextElements().add(a2c);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(a);
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		isApplicableMatch.getAllContextElements().add(s__a____next);
		s2n__s____source.setSrc(s2n);
		s2n__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2n__s____source);
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(a2c__c____target);
		s2n__n____target.setSrc(s2n);
		s2n__n____target.setTrg(n);
		isApplicableMatch.getAllContextElements().add(s2n__n____target);
		a2c__a____source.setSrc(a2c);
		a2c__a____source.setTrg(a);
		isApplicableMatch.getAllContextElements().add(a2c__a____source);
		s__a____next.setName(s__a____next_name_prime);
		s2n__s____source.setName(s2n__s____source_name_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		s2n__n____target.setName(s2n__n____target_name_prime);
		a2c__a____source.setName(a2c__a____source_name_prime);
		return new Object[] { s, s2n, a2c, c, n, a, isApplicableMatch, s__a____next, s2n__s____source, a2c__c____target,
				s2n__n____target, a2c__a____source };
	}

	public static final Object[] pattern_next2next_2_4_solveCSP_bindingFBBBBBBBB(next2next _this,
			IsApplicableMatch isApplicableMatch, Statement s, S2N s2n, S2N a2c, Command c, Node n, Assignment a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, s, s2n, a2c, c, n, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s, s2n, a2c, c, n, a };
		}
		return null;
	}

	public static final Object[] pattern_next2next_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_next2next_2_4_solveCSP_bindingAndBlackFBBBBBBBB(next2next _this,
			IsApplicableMatch isApplicableMatch, Statement s, S2N s2n, S2N a2c, Command c, Node n, Assignment a) {
		Object[] result_pattern_next2next_2_4_solveCSP_binding = pattern_next2next_2_4_solveCSP_bindingFBBBBBBBB(_this,
				isApplicableMatch, s, s2n, a2c, c, n, a);
		if (result_pattern_next2next_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_next2next_2_4_solveCSP_binding[0];

			Object[] result_pattern_next2next_2_4_solveCSP_black = pattern_next2next_2_4_solveCSP_blackB(csp);
			if (result_pattern_next2next_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s, s2n, a2c, c, n, a };
			}
		}
		return null;
	}

	public static final boolean pattern_next2next_2_5_checkCSP_expressionFBB(next2next _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_next2next_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_next2next_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "next2next";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_next2next_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_next2next_10_1_initialbindings_blackBBBB(next2next _this, Match match,
			Command c, Node n) {
		if (!c.equals(n)) {
			return new Object[] { _this, match, c, n };
		}
		return null;
	}

	public static final Object[] pattern_next2next_10_2_SolveCSP_bindingFBBBB(next2next _this, Match match, Command c,
			Node n) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, c, n);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, n };
		}
		return null;
	}

	public static final Object[] pattern_next2next_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_next2next_10_2_SolveCSP_bindingAndBlackFBBBB(next2next _this, Match match,
			Command c, Node n) {
		Object[] result_pattern_next2next_10_2_SolveCSP_binding = pattern_next2next_10_2_SolveCSP_bindingFBBBB(_this,
				match, c, n);
		if (result_pattern_next2next_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_next2next_10_2_SolveCSP_binding[0];

			Object[] result_pattern_next2next_10_2_SolveCSP_black = pattern_next2next_10_2_SolveCSP_blackB(csp);
			if (result_pattern_next2next_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, n };
			}
		}
		return null;
	}

	public static final boolean pattern_next2next_10_3_CheckCSP_expressionFBB(next2next _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_next2next_10_4_collectelementstobetranslated_blackBBB(Match match, Command c,
			Node n) {
		if (!c.equals(n)) {
			return new Object[] { match, c, n };
		}
		return null;
	}

	public static final Object[] pattern_next2next_10_4_collectelementstobetranslated_greenBBBF(Match match, Command c,
			Node n) {
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String n__c____next_name_prime = "next";
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(n__c____next);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { match, c, n, n__c____next };
	}

	public static final Object[] pattern_next2next_10_5_collectcontextelements_blackBBB(Match match, Command c,
			Node n) {
		if (!c.equals(n)) {
			return new Object[] { match, c, n };
		}
		return null;
	}

	public static final Object[] pattern_next2next_10_5_collectcontextelements_greenBBB(Match match, Command c,
			Node n) {
		match.getContextNodes().add(c);
		match.getContextNodes().add(n);
		return new Object[] { match, c, n };
	}

	public static final void pattern_next2next_10_6_registerobjectstomatch_expressionBBBB(next2next _this, Match match,
			Command c, Node n) {
		_this.registerObjectsToMatch_BWD(match, c, n);

	}

	public static final boolean pattern_next2next_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_next2next_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_next2next_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("s");
		EObject _localVariable_1 = isApplicableMatch.getObject("s2n");
		EObject _localVariable_2 = isApplicableMatch.getObject("a2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("n");
		EObject _localVariable_5 = isApplicableMatch.getObject("a");
		EObject tmpS = _localVariable_0;
		EObject tmpS2n = _localVariable_1;
		EObject tmpA2c = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpN = _localVariable_4;
		EObject tmpA = _localVariable_5;
		if (tmpS instanceof Statement) {
			Statement s = (Statement) tmpS;
			if (tmpS2n instanceof S2N) {
				S2N s2n = (S2N) tmpS2n;
				if (tmpA2c instanceof S2N) {
					S2N a2c = (S2N) tmpA2c;
					if (tmpC instanceof Command) {
						Command c = (Command) tmpC;
						if (tmpN instanceof Node) {
							Node n = (Node) tmpN;
							if (tmpA instanceof Assignment) {
								Assignment a = (Assignment) tmpA;
								return new Object[] { s, s2n, a2c, c, n, a, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_11_1_performtransformation_blackBBBBBBFBB(Statement s, S2N s2n,
			S2N a2c, Command c, Node n, Assignment a, next2next _this, IsApplicableMatch isApplicableMatch) {
		if (!a2c.equals(s2n)) {
			if (!c.equals(n)) {
				if (!a.equals(s)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { s, s2n, a2c, c, n, a, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_11_1_performtransformation_bindingAndBlackFFFFFFFBB(next2next _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_next2next_11_1_performtransformation_binding = pattern_next2next_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_next2next_11_1_performtransformation_binding != null) {
			Statement s = (Statement) result_pattern_next2next_11_1_performtransformation_binding[0];
			S2N s2n = (S2N) result_pattern_next2next_11_1_performtransformation_binding[1];
			S2N a2c = (S2N) result_pattern_next2next_11_1_performtransformation_binding[2];
			Command c = (Command) result_pattern_next2next_11_1_performtransformation_binding[3];
			Node n = (Node) result_pattern_next2next_11_1_performtransformation_binding[4];
			Assignment a = (Assignment) result_pattern_next2next_11_1_performtransformation_binding[5];

			Object[] result_pattern_next2next_11_1_performtransformation_black = pattern_next2next_11_1_performtransformation_blackBBBBBBFBB(
					s, s2n, a2c, c, n, a, _this, isApplicableMatch);
			if (result_pattern_next2next_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_next2next_11_1_performtransformation_black[6];

				return new Object[] { s, s2n, a2c, c, n, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_11_1_performtransformation_greenBB(Statement s, Assignment a) {
		s.setNext(a);
		return new Object[] { s, a };
	}

	public static final Object[] pattern_next2next_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_next2next_11_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject s, EObject s2n, EObject a2c, EObject c, EObject n, EObject a) {
		if (!s.equals(s2n)) {
			if (!a2c.equals(s)) {
				if (!a2c.equals(s2n)) {
					if (!a2c.equals(c)) {
						if (!a2c.equals(n)) {
							if (!c.equals(s)) {
								if (!c.equals(s2n)) {
									if (!c.equals(n)) {
										if (!n.equals(s)) {
											if (!n.equals(s2n)) {
												if (!a.equals(s)) {
													if (!a.equals(s2n)) {
														if (!a.equals(a2c)) {
															if (!a.equals(c)) {
																if (!a.equals(n)) {
																	return new Object[] { ruleresult, s, s2n, a2c, c, n,
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

	public static final Object[] pattern_next2next_11_3_bookkeepingforedges_greenBBBBBFF(PerformRuleResult ruleresult,
			EObject s, EObject c, EObject n, EObject a) {
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "next2next";
		String s__a____next_name_prime = "next";
		String n__c____next_name_prime = "next";
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		ruleresult.getCreatedEdges().add(s__a____next);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(n__c____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		s__a____next.setName(s__a____next_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { ruleresult, s, c, n, a, s__a____next, n__c____next };
	}

	public static final void pattern_next2next_11_5_registerobjects_expressionBBBBBBBB(next2next _this,
			PerformRuleResult ruleresult, EObject s, EObject s2n, EObject a2c, EObject c, EObject n, EObject a) {
		_this.registerObjects_BWD(ruleresult, s, s2n, a2c, c, n, a);

	}

	public static final PerformRuleResult pattern_next2next_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_next2next_12_1_preparereturnvalue_bindingFB(next2next _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_next2next_12_1_preparereturnvalue_blackFBB(EClass eClass, next2next _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_next2next_12_1_preparereturnvalue_bindingAndBlackFFB(next2next _this) {
		Object[] result_pattern_next2next_12_1_preparereturnvalue_binding = pattern_next2next_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_next2next_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_next2next_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_next2next_12_1_preparereturnvalue_black = pattern_next2next_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_next2next_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_next2next_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "next2next";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_next2next_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("n");
		EObject tmpC = _localVariable_0;
		EObject tmpN = _localVariable_1;
		if (tmpC instanceof Command) {
			Command c = (Command) tmpC;
			if (tmpN instanceof Node) {
				Node n = (Node) tmpN;
				return new Object[] { c, n, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_next2next_12_2_corematch_blackFFFBBFB(Command c, Node n,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(n)) {
			for (S2N a2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2N.class, "target")) {
				Statement tmpA = a2c.getSource();
				if (tmpA instanceof Assignment) {
					Assignment a = (Assignment) tmpA;
					for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n, S2N.class,
							"target")) {
						if (!a2c.equals(s2n)) {
							Statement s = s2n.getSource();
							if (s != null) {
								if (!a.equals(s)) {
									_result.add(new Object[] { s, s2n, a2c, c, n, a, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_next2next_12_3_findcontext_blackBBBBBB(Statement s, S2N s2n, S2N a2c,
			Command c, Node n, Assignment a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a2c.equals(s2n)) {
			if (!c.equals(n)) {
				if (!a.equals(s)) {
					if (s.equals(s2n.getSource())) {
						if (c.equals(a2c.getTarget())) {
							if (n.equals(s2n.getTarget())) {
								if (c.equals(n.getNext())) {
									if (a.equals(a2c.getSource())) {
										_result.add(new Object[] { s, s2n, a2c, c, n, a });
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

	public static final Object[] pattern_next2next_12_3_findcontext_greenBBBBBBFFFFFF(Statement s, S2N s2n, S2N a2c,
			Command c, Node n, Assignment a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String s2n__s____source_name_prime = "source";
		String a2c__c____target_name_prime = "target";
		String s2n__n____target_name_prime = "target";
		String n__c____next_name_prime = "next";
		String a2c__a____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(s2n);
		isApplicableMatch.getAllContextElements().add(a2c);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(a);
		s2n__s____source.setSrc(s2n);
		s2n__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2n__s____source);
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(a2c__c____target);
		s2n__n____target.setSrc(s2n);
		s2n__n____target.setTrg(n);
		isApplicableMatch.getAllContextElements().add(s2n__n____target);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(n__c____next);
		a2c__a____source.setSrc(a2c);
		a2c__a____source.setTrg(a);
		isApplicableMatch.getAllContextElements().add(a2c__a____source);
		s2n__s____source.setName(s2n__s____source_name_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		s2n__n____target.setName(s2n__n____target_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		a2c__a____source.setName(a2c__a____source_name_prime);
		return new Object[] { s, s2n, a2c, c, n, a, isApplicableMatch, s2n__s____source, a2c__c____target,
				s2n__n____target, n__c____next, a2c__a____source };
	}

	public static final Object[] pattern_next2next_12_4_solveCSP_bindingFBBBBBBBB(next2next _this,
			IsApplicableMatch isApplicableMatch, Statement s, S2N s2n, S2N a2c, Command c, Node n, Assignment a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, s, s2n, a2c, c, n, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s, s2n, a2c, c, n, a };
		}
		return null;
	}

	public static final Object[] pattern_next2next_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_next2next_12_4_solveCSP_bindingAndBlackFBBBBBBBB(next2next _this,
			IsApplicableMatch isApplicableMatch, Statement s, S2N s2n, S2N a2c, Command c, Node n, Assignment a) {
		Object[] result_pattern_next2next_12_4_solveCSP_binding = pattern_next2next_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, s, s2n, a2c, c, n, a);
		if (result_pattern_next2next_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_next2next_12_4_solveCSP_binding[0];

			Object[] result_pattern_next2next_12_4_solveCSP_black = pattern_next2next_12_4_solveCSP_blackB(csp);
			if (result_pattern_next2next_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s, s2n, a2c, c, n, a };
			}
		}
		return null;
	}

	public static final boolean pattern_next2next_12_5_checkCSP_expressionFBB(next2next _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_next2next_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_next2next_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "next2next";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_next2next_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_next2next_20_1_preparereturnvalue_bindingFB(next2next _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_next2next_20_1_preparereturnvalue_blackFBBF(EClass __eClass, next2next _this) {
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

	public static final Object[] pattern_next2next_20_1_preparereturnvalue_bindingAndBlackFFBF(next2next _this) {
		Object[] result_pattern_next2next_20_1_preparereturnvalue_binding = pattern_next2next_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_next2next_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_next2next_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_next2next_20_1_preparereturnvalue_black = pattern_next2next_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_next2next_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_next2next_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_next2next_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_next2next_20_2_testcorematchandDECs_blackFFB(
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
						_result.add(new Object[] { c, n, _edge_next });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_next2next_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_next2next_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			next2next _this, Match match, Command c, Node n) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, c, n);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_next2next_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			next2next _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_next2next_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_next2next_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_next2next_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_next2next_21_1_preparereturnvalue_bindingFB(next2next _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_next2next_21_1_preparereturnvalue_blackFBBF(EClass __eClass, next2next _this) {
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

	public static final Object[] pattern_next2next_21_1_preparereturnvalue_bindingAndBlackFFBF(next2next _this) {
		Object[] result_pattern_next2next_21_1_preparereturnvalue_binding = pattern_next2next_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_next2next_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_next2next_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_next2next_21_1_preparereturnvalue_black = pattern_next2next_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_next2next_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_next2next_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_next2next_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_next2next_21_2_testcorematchandDECs_blackFFB(
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
						_result.add(new Object[] { s, a, _edge_next });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_next2next_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_next2next_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			next2next _this, Match match, Statement s, Assignment a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, s, a);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_next2next_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			next2next _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_next2next_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_next2next_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_next2next_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_next2next_24_1_prepare_blackB(next2next _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_next2next_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_next2next_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("s");
		EObject _localVariable_1 = targetMatch.getObject("c");
		EObject _localVariable_2 = targetMatch.getObject("n");
		EObject _localVariable_3 = sourceMatch.getObject("a");
		EObject tmpS = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpN = _localVariable_2;
		EObject tmpA = _localVariable_3;
		if (tmpS instanceof Statement) {
			Statement s = (Statement) tmpS;
			if (tmpC instanceof Command) {
				Command c = (Command) tmpC;
				if (tmpN instanceof Node) {
					Node n = (Node) tmpN;
					if (tmpA instanceof Assignment) {
						Assignment a = (Assignment) tmpA;
						return new Object[] { s, c, n, a, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_24_2_matchsrctrgcontext_blackBBBBBB(Statement s, Command c, Node n,
			Assignment a, Match sourceMatch, Match targetMatch) {
		if (!c.equals(n)) {
			if (!a.equals(s)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { s, c, n, a, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_next2next_24_2_matchsrctrgcontext_binding = pattern_next2next_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_next2next_24_2_matchsrctrgcontext_binding != null) {
			Statement s = (Statement) result_pattern_next2next_24_2_matchsrctrgcontext_binding[0];
			Command c = (Command) result_pattern_next2next_24_2_matchsrctrgcontext_binding[1];
			Node n = (Node) result_pattern_next2next_24_2_matchsrctrgcontext_binding[2];
			Assignment a = (Assignment) result_pattern_next2next_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_next2next_24_2_matchsrctrgcontext_black = pattern_next2next_24_2_matchsrctrgcontext_blackBBBBBB(
					s, c, n, a, sourceMatch, targetMatch);
			if (result_pattern_next2next_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { s, c, n, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_24_3_solvecsp_bindingFBBBBBBB(next2next _this, Statement s,
			Command c, Node n, Assignment a, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(s, c, n, a, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, s, c, n, a, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_next2next_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_next2next_24_3_solvecsp_bindingAndBlackFBBBBBBB(next2next _this, Statement s,
			Command c, Node n, Assignment a, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_next2next_24_3_solvecsp_binding = pattern_next2next_24_3_solvecsp_bindingFBBBBBBB(_this,
				s, c, n, a, sourceMatch, targetMatch);
		if (result_pattern_next2next_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_next2next_24_3_solvecsp_binding[0];

			Object[] result_pattern_next2next_24_3_solvecsp_black = pattern_next2next_24_3_solvecsp_blackB(csp);
			if (result_pattern_next2next_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, s, c, n, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_next2next_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_next2next_24_5_matchcorrcontext_blackBFFBBBBB(Statement s, Command c,
			Node n, Assignment a, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(n)) {
			if (!a.equals(s)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s, S2N.class,
							"source")) {
						if (n.equals(s2n.getTarget())) {
							for (S2N a2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
									S2N.class, "target")) {
								if (!a2c.equals(s2n)) {
									if (a.equals(a2c.getSource())) {
										_result.add(new Object[] { s, s2n, a2c, c, n, a, sourceMatch, targetMatch });
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

	public static final Object[] pattern_next2next_24_5_matchcorrcontext_greenBBBBF(S2N s2n, S2N a2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "next2next";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(s2n);
		ccMatch.getAllContextElements().add(a2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { s2n, a2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_next2next_24_6_createcorrespondence_blackBBBBB(Statement s, Command c, Node n,
			Assignment a, CCMatch ccMatch) {
		if (!c.equals(n)) {
			if (!a.equals(s)) {
				return new Object[] { s, c, n, a, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_next2next_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "next2next";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_next2next_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_next2next_27_1_matchtggpattern_blackBB(Statement s, Assignment a) {
		if (!a.equals(s)) {
			if (a.equals(s.getNext())) {
				return new Object[] { s, a };
			}
		}
		return null;
	}

	public static final boolean pattern_next2next_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_next2next_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_next2next_28_1_matchtggpattern_blackBB(Command c, Node n) {
		if (!c.equals(n)) {
			if (c.equals(n.getNext())) {
				return new Object[] { c, n };
			}
		}
		return null;
	}

	public static final boolean pattern_next2next_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_next2next_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_next2next_29_1_createresult_blackB(next2next _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_next2next_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_next2next_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Statement s) {
		if (ruleResult.getSourceObjects().contains(s)) {
			return new Object[] { ruleResult, s };
		}
		return null;
	}

	public static final Object[] pattern_next2next_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2N s2n) {
		if (ruleResult.getCorrObjects().contains(s2n)) {
			return new Object[] { ruleResult, s2n };
		}
		return null;
	}

	public static final Object[] pattern_next2next_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Node n) {
		if (ruleResult.getTargetObjects().contains(n)) {
			return new Object[] { ruleResult, n };
		}
		return null;
	}

	public static final Object[] pattern_next2next_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, S2N a2c) {
		if (ruleResult.getCorrObjects().contains(a2c)) {
			return new Object[] { ruleResult, a2c };
		}
		return null;
	}

	public static final Object[] pattern_next2next_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Command c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_next2next_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Assignment a) {
		if (ruleResult.getSourceObjects().contains(a)) {
			return new Object[] { ruleResult, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_next2next_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList s2nList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList a2cList : ruleEntryContainer.getRuleEntryList()) {
				if (!a2cList.equals(s2nList)) {
					for (EObject tmpS2n : s2nList.getEntryObjects()) {
						if (tmpS2n instanceof S2N) {
							S2N s2n = (S2N) tmpS2n;
							Statement s = s2n.getSource();
							if (s != null) {
								Node n = s2n.getTarget();
								if (n != null) {
									if (pattern_next2next_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											s2n) == null) {
										if (pattern_next2next_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												s) == null) {
											if (pattern_next2next_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													n) == null) {
												for (EObject tmpA2c : a2cList.getEntryObjects()) {
													if (tmpA2c instanceof S2N) {
														S2N a2c = (S2N) tmpA2c;
														if (!a2c.equals(s2n)) {
															Node tmpC = a2c.getTarget();
															if (tmpC instanceof Command) {
																Command c = (Command) tmpC;
																if (!c.equals(n)) {
																	Statement tmpA = a2c.getSource();
																	if (tmpA instanceof Assignment) {
																		Assignment a = (Assignment) tmpA;
																		if (!a.equals(s)) {
																			if (pattern_next2next_29_2_isapplicablecore_black_nac_3BB(
																					ruleResult, a2c) == null) {
																				if (pattern_next2next_29_2_isapplicablecore_black_nac_4BB(
																						ruleResult, c) == null) {
																					if (pattern_next2next_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult, a) == null) {
																						_result.add(new Object[] {
																								s2nList, s, s2n, n,
																								a2cList, a2c, c, a,
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
		return _result;
	}

	public static final Object[] pattern_next2next_29_3_solveCSP_bindingFBBBBBBBBB(next2next _this,
			IsApplicableMatch isApplicableMatch, Statement s, S2N s2n, S2N a2c, Command c, Node n, Assignment a,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, s, s2n, a2c, c, n, a, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s, s2n, a2c, c, n, a, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_next2next_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_next2next_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(next2next _this,
			IsApplicableMatch isApplicableMatch, Statement s, S2N s2n, S2N a2c, Command c, Node n, Assignment a,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_next2next_29_3_solveCSP_binding = pattern_next2next_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, s, s2n, a2c, c, n, a, ruleResult);
		if (result_pattern_next2next_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_next2next_29_3_solveCSP_binding[0];

			Object[] result_pattern_next2next_29_3_solveCSP_black = pattern_next2next_29_3_solveCSP_blackB(csp);
			if (result_pattern_next2next_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s, s2n, a2c, c, n, a, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_next2next_29_4_checkCSP_expressionFBB(next2next _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_next2next_29_5_checknacs_blackBBBBBB(Statement s, S2N s2n, S2N a2c, Command c,
			Node n, Assignment a) {
		if (!a2c.equals(s2n)) {
			if (!c.equals(n)) {
				if (!a.equals(s)) {
					return new Object[] { s, s2n, a2c, c, n, a };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_29_6_perform_blackBBBBBBB(Statement s, S2N s2n, S2N a2c, Command c,
			Node n, Assignment a, ModelgeneratorRuleResult ruleResult) {
		if (!a2c.equals(s2n)) {
			if (!c.equals(n)) {
				if (!a.equals(s)) {
					return new Object[] { s, s2n, a2c, c, n, a, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_next2next_29_6_perform_greenBBBBB(Statement s, Command c, Node n, Assignment a,
			ModelgeneratorRuleResult ruleResult) {
		s.setNext(a);
		n.setNext(c);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { s, c, n, a, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_next2next_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //next2nextImpl
