/**
 */
package org.wbsilva.bx.sourcecode2controlflow.Rules.impl;

import controlflow.Branch;
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
import org.wbsilva.bx.sourcecode2controlflow.Rules.nextd2nextb;

import org.wbsilva.bx.sourcecode2controlflow.S2B;
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
 * An implementation of the model object '<em><b>nextd2nextb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class nextd2nextbImpl extends AbstractRuleImpl implements nextd2nextb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected nextd2nextbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getnextd2nextb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment a, Statement s) {

		Object[] result1_black = nextd2nextbImpl.pattern_nextd2nextb_0_1_initialbindings_blackBBBB(this, match, a, s);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[s] = " + s + ".");
		}

		Object[] result2_bindingAndBlack = nextd2nextbImpl.pattern_nextd2nextb_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, a, s);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[s] = " + s + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (nextd2nextbImpl.pattern_nextd2nextb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = nextd2nextbImpl
					.pattern_nextd2nextb_0_4_collectelementstobetranslated_blackBBB(match, a, s);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[s] = " + s + ".");
			}
			nextd2nextbImpl.pattern_nextd2nextb_0_4_collectelementstobetranslated_greenBBBF(match, a, s);
			//nothing EMoflonEdge s__a____next = (EMoflonEdge) result4_green[3];

			Object[] result5_black = nextd2nextbImpl.pattern_nextd2nextb_0_5_collectcontextelements_blackBBB(match, a,
					s);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[s] = " + s + ".");
			}
			nextd2nextbImpl.pattern_nextd2nextb_0_5_collectcontextelements_greenBBB(match, a, s);

			// 
			nextd2nextbImpl.pattern_nextd2nextb_0_6_registerobjectstomatch_expressionBBBB(this, match, a, s);
			return nextd2nextbImpl.pattern_nextd2nextb_0_7_expressionF();
		} else {
			return nextd2nextbImpl.pattern_nextd2nextb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = nextd2nextbImpl
				.pattern_nextd2nextb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment a = (Assignment) result1_bindingAndBlack[0];
		Command c = (Command) result1_bindingAndBlack[1];
		Branch n = (Branch) result1_bindingAndBlack[2];
		Statement s = (Statement) result1_bindingAndBlack[3];
		S2B s2n = (S2B) result1_bindingAndBlack[4];
		S2N a2c = (S2N) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		nextd2nextbImpl.pattern_nextd2nextb_1_1_performtransformation_greenBB(c, n);

		Object[] result2_green = nextd2nextbImpl.pattern_nextd2nextb_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = nextd2nextbImpl.pattern_nextd2nextb_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, a,
				c, n, s, s2n, a2c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[n] = " + n + ", " + "[s] = " + s + ", "
					+ "[s2n] = " + s2n + ", " + "[a2c] = " + a2c + ".");
		}
		nextd2nextbImpl.pattern_nextd2nextb_1_3_bookkeepingforedges_greenBBBBBFF(ruleresult, a, c, n, s);
		//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[6];

		// 
		// 
		nextd2nextbImpl.pattern_nextd2nextb_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, a, c, n, s, s2n,
				a2c);
		return nextd2nextbImpl.pattern_nextd2nextb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = nextd2nextbImpl
				.pattern_nextd2nextb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = nextd2nextbImpl.pattern_nextd2nextb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = nextd2nextbImpl.pattern_nextd2nextb_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment a = (Assignment) result2_binding[0];
		Statement s = (Statement) result2_binding[1];
		for (Object[] result2_black : nextd2nextbImpl.pattern_nextd2nextb_2_2_corematch_blackBFFBFFB(a, s, match)) {
			Command c = (Command) result2_black[1];
			Branch n = (Branch) result2_black[2];
			S2B s2n = (S2B) result2_black[4];
			S2N a2c = (S2N) result2_black[5];
			// ForEach 
			for (Object[] result3_black : nextd2nextbImpl.pattern_nextd2nextb_2_3_findcontext_blackBBBBBB(a, c, n, s,
					s2n, a2c)) {
				Object[] result3_green = nextd2nextbImpl.pattern_nextd2nextb_2_3_findcontext_greenBBBBBBFFFFFF(a, c, n,
						s, s2n, a2c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge a2c__a____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = nextd2nextbImpl
						.pattern_nextd2nextb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, a, c, n, s,
								s2n, a2c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[c] = " + c
							+ ", " + "[n] = " + n + ", " + "[s] = " + s + ", " + "[s2n] = " + s2n + ", " + "[a2c] = "
							+ a2c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (nextd2nextbImpl.pattern_nextd2nextb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = nextd2nextbImpl
							.pattern_nextd2nextb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					nextd2nextbImpl.pattern_nextd2nextb_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return nextd2nextbImpl.pattern_nextd2nextb_2_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment a, Command c, Branch n,
			Statement s, S2B s2n, S2N a2c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("s2n", s2n);
		isApplicableMatch.registerObject("a2c", a2c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a, EObject c, EObject n, EObject s,
			EObject s2n, EObject a2c) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("a2c", a2c);

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
	public boolean isAppropriate_BWD(Match match, Command c, Branch n) {

		Object[] result1_black = nextd2nextbImpl.pattern_nextd2nextb_10_1_initialbindings_blackBBBB(this, match, c, n);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[n] = " + n + ".");
		}

		Object[] result2_bindingAndBlack = nextd2nextbImpl.pattern_nextd2nextb_10_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, c, n);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[n] = " + n + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (nextd2nextbImpl.pattern_nextd2nextb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = nextd2nextbImpl
					.pattern_nextd2nextb_10_4_collectelementstobetranslated_blackBBB(match, c, n);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[n] = " + n + ".");
			}
			nextd2nextbImpl.pattern_nextd2nextb_10_4_collectelementstobetranslated_greenBBBF(match, c, n);
			//nothing EMoflonEdge n__c____next = (EMoflonEdge) result4_green[3];

			Object[] result5_black = nextd2nextbImpl.pattern_nextd2nextb_10_5_collectcontextelements_blackBBB(match, c,
					n);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[n] = " + n + ".");
			}
			nextd2nextbImpl.pattern_nextd2nextb_10_5_collectcontextelements_greenBBB(match, c, n);

			// 
			nextd2nextbImpl.pattern_nextd2nextb_10_6_registerobjectstomatch_expressionBBBB(this, match, c, n);
			return nextd2nextbImpl.pattern_nextd2nextb_10_7_expressionF();
		} else {
			return nextd2nextbImpl.pattern_nextd2nextb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = nextd2nextbImpl
				.pattern_nextd2nextb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment a = (Assignment) result1_bindingAndBlack[0];
		Command c = (Command) result1_bindingAndBlack[1];
		Branch n = (Branch) result1_bindingAndBlack[2];
		Statement s = (Statement) result1_bindingAndBlack[3];
		S2B s2n = (S2B) result1_bindingAndBlack[4];
		S2N a2c = (S2N) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		nextd2nextbImpl.pattern_nextd2nextb_11_1_performtransformation_greenBB(a, s);

		Object[] result2_green = nextd2nextbImpl.pattern_nextd2nextb_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = nextd2nextbImpl.pattern_nextd2nextb_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				a, c, n, s, s2n, a2c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[n] = " + n + ", " + "[s] = " + s + ", "
					+ "[s2n] = " + s2n + ", " + "[a2c] = " + a2c + ".");
		}
		nextd2nextbImpl.pattern_nextd2nextb_11_3_bookkeepingforedges_greenBBBBBFF(ruleresult, a, c, n, s);
		//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[6];

		// 
		// 
		nextd2nextbImpl.pattern_nextd2nextb_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, a, c, n, s, s2n,
				a2c);
		return nextd2nextbImpl.pattern_nextd2nextb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = nextd2nextbImpl
				.pattern_nextd2nextb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = nextd2nextbImpl.pattern_nextd2nextb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = nextd2nextbImpl.pattern_nextd2nextb_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command c = (Command) result2_binding[0];
		Branch n = (Branch) result2_binding[1];
		for (Object[] result2_black : nextd2nextbImpl.pattern_nextd2nextb_12_2_corematch_blackFBBFFFB(c, n, match)) {
			Assignment a = (Assignment) result2_black[0];
			Statement s = (Statement) result2_black[3];
			S2B s2n = (S2B) result2_black[4];
			S2N a2c = (S2N) result2_black[5];
			// ForEach 
			for (Object[] result3_black : nextd2nextbImpl.pattern_nextd2nextb_12_3_findcontext_blackBBBBBB(a, c, n, s,
					s2n, a2c)) {
				Object[] result3_green = nextd2nextbImpl.pattern_nextd2nextb_12_3_findcontext_greenBBBBBBFFFFFF(a, c, n,
						s, s2n, a2c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge a2c__a____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = nextd2nextbImpl
						.pattern_nextd2nextb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, a, c, n, s,
								s2n, a2c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[c] = " + c
							+ ", " + "[n] = " + n + ", " + "[s] = " + s + ", " + "[s2n] = " + s2n + ", " + "[a2c] = "
							+ a2c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (nextd2nextbImpl.pattern_nextd2nextb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = nextd2nextbImpl
							.pattern_nextd2nextb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					nextd2nextbImpl.pattern_nextd2nextb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return nextd2nextbImpl.pattern_nextd2nextb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command c, Branch n) {
		match.registerObject("c", c);
		match.registerObject("n", n);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command c, Branch n) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Assignment a, Command c, Branch n,
			Statement s, S2B s2n, S2N a2c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("s2n", s2n);
		isApplicableMatch.registerObject("a2c", a2c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a, EObject c, EObject n, EObject s,
			EObject s2n, EObject a2c) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("a2c", a2c);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_254(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = nextd2nextbImpl
				.pattern_nextd2nextb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = nextd2nextbImpl.pattern_nextd2nextb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : nextd2nextbImpl
				.pattern_nextd2nextb_20_2_testcorematchandDECs_blackFFB(_edge_next)) {
			Command c = (Command) result2_black[0];
			Branch n = (Branch) result2_black[1];
			Object[] result2_green = nextd2nextbImpl.pattern_nextd2nextb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (nextd2nextbImpl.pattern_nextd2nextb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, c, n)) {
				// 
				if (nextd2nextbImpl
						.pattern_nextd2nextb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = nextd2nextbImpl.pattern_nextd2nextb_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					nextd2nextbImpl.pattern_nextd2nextb_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return nextd2nextbImpl.pattern_nextd2nextb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_262(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = nextd2nextbImpl
				.pattern_nextd2nextb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = nextd2nextbImpl.pattern_nextd2nextb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : nextd2nextbImpl
				.pattern_nextd2nextb_21_2_testcorematchandDECs_blackFFB(_edge_next)) {
			Assignment a = (Assignment) result2_black[0];
			Statement s = (Statement) result2_black[1];
			Object[] result2_green = nextd2nextbImpl.pattern_nextd2nextb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (nextd2nextbImpl.pattern_nextd2nextb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, a, s)) {
				// 
				if (nextd2nextbImpl
						.pattern_nextd2nextb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = nextd2nextbImpl.pattern_nextd2nextb_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					nextd2nextbImpl.pattern_nextd2nextb_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return nextd2nextbImpl.pattern_nextd2nextb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("nextd2nextb");
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
		ruleResult.setRule("nextd2nextb");
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

		Object[] result1_black = nextd2nextbImpl.pattern_nextd2nextb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = nextd2nextbImpl.pattern_nextd2nextb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = nextd2nextbImpl
				.pattern_nextd2nextb_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Assignment a = (Assignment) result2_bindingAndBlack[0];
		Command c = (Command) result2_bindingAndBlack[1];
		Branch n = (Branch) result2_bindingAndBlack[2];
		Statement s = (Statement) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = nextd2nextbImpl
				.pattern_nextd2nextb_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, a, c, n, s, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[a] = " + a + ", " + "[c] = " + c + ", " + "[n] = " + n + ", " + "[s] = " + s + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (nextd2nextbImpl.pattern_nextd2nextb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : nextd2nextbImpl.pattern_nextd2nextb_24_5_matchcorrcontext_blackBBBBFFBB(a, c,
					n, s, sourceMatch, targetMatch)) {
				S2B s2n = (S2B) result5_black[4];
				S2N a2c = (S2N) result5_black[5];
				Object[] result5_green = nextd2nextbImpl.pattern_nextd2nextb_24_5_matchcorrcontext_greenBBBBF(s2n, a2c,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = nextd2nextbImpl.pattern_nextd2nextb_24_6_createcorrespondence_blackBBBBB(a, c,
						n, s, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[c] = " + c + ", "
									+ "[n] = " + n + ", " + "[s] = " + s + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = nextd2nextbImpl.pattern_nextd2nextb_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				nextd2nextbImpl.pattern_nextd2nextb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return nextd2nextbImpl.pattern_nextd2nextb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Assignment a, Command c, Branch n, Statement s, Match sourceMatch,
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
		Object[] result1_black = nextd2nextbImpl.pattern_nextd2nextb_27_1_matchtggpattern_blackBB(a, s);
		if (result1_black != null) {
			return nextd2nextbImpl.pattern_nextd2nextb_27_2_expressionF();
		} else {
			return nextd2nextbImpl.pattern_nextd2nextb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command c, Branch n) {// 
		Object[] result1_black = nextd2nextbImpl.pattern_nextd2nextb_28_1_matchtggpattern_blackBB(c, n);
		if (result1_black != null) {
			return nextd2nextbImpl.pattern_nextd2nextb_28_2_expressionF();
		} else {
			return nextd2nextbImpl.pattern_nextd2nextb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2N a2cParameter,
			S2B s2nParameter) {

		Object[] result1_black = nextd2nextbImpl.pattern_nextd2nextb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = nextd2nextbImpl.pattern_nextd2nextb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : nextd2nextbImpl
				.pattern_nextd2nextb_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList a2cList = (RuleEntryList) result2_black[0];
			Assignment a = (Assignment) result2_black[1];
			S2N a2c = (S2N) result2_black[2];
			Command c = (Command) result2_black[3];
			//nothing RuleEntryList s2nList = (RuleEntryList) result2_black[4];
			Branch n = (Branch) result2_black[5];
			S2B s2n = (S2B) result2_black[6];
			Statement s = (Statement) result2_black[7];

			Object[] result3_bindingAndBlack = nextd2nextbImpl
					.pattern_nextd2nextb_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, a, c, n, s,
							s2n, a2c, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[c] = " + c
						+ ", " + "[n] = " + n + ", " + "[s] = " + s + ", " + "[s2n] = " + s2n + ", " + "[a2c] = " + a2c
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (nextd2nextbImpl.pattern_nextd2nextb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = nextd2nextbImpl.pattern_nextd2nextb_29_5_checknacs_blackBBBBBB(a, c, n, s, s2n,
						a2c);
				if (result5_black != null) {

					Object[] result6_black = nextd2nextbImpl.pattern_nextd2nextb_29_6_perform_blackBBBBBBB(a, c, n, s,
							s2n, a2c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", "
								+ "[c] = " + c + ", " + "[n] = " + n + ", " + "[s] = " + s + ", " + "[s2n] = " + s2n
								+ ", " + "[a2c] = " + a2c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					nextd2nextbImpl.pattern_nextd2nextb_29_6_perform_greenBBBBB(a, c, n, s, ruleResult);

				} else {
				}

			} else {
			}

		}
		return nextd2nextbImpl.pattern_nextd2nextb_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Assignment a, Command c, Branch n,
			Statement s, S2B s2n, S2N a2c, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("n", n);
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("s2n", s2n);
		isApplicableMatch.registerObject("a2c", a2c);
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
		case RulesPackage.NEXTD2NEXTB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_STATEMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Statement) arguments.get(2));
		case RulesPackage.NEXTD2NEXTB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_STATEMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Statement) arguments.get(2));
			return null;
		case RulesPackage.NEXTD2NEXTB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_STATEMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Statement) arguments.get(2));
		case RulesPackage.NEXTD2NEXTB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_COMMAND_BRANCH_STATEMENT_S2B_S2N:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Statement) arguments.get(4),
					(S2B) arguments.get(5), (S2N) arguments.get(6));
		case RulesPackage.NEXTD2NEXTB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.NEXTD2NEXTB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.NEXTD2NEXTB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2));
			return null;
		case RulesPackage.NEXTD2NEXTB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2));
		case RulesPackage.NEXTD2NEXTB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASSIGNMENT_COMMAND_BRANCH_STATEMENT_S2B_S2N:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Statement) arguments.get(4),
					(S2B) arguments.get(5), (S2N) arguments.get(6));
		case RulesPackage.NEXTD2NEXTB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.NEXTD2NEXTB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_254__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_254((EMoflonEdge) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_262__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_262((EMoflonEdge) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.NEXTD2NEXTB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_COMMAND_BRANCH_STATEMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Statement) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.NEXTD2NEXTB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.NEXTD2NEXTB___CHECK_DEC_FWD__ASSIGNMENT_STATEMENT:
			return checkDEC_FWD((Assignment) arguments.get(0), (Statement) arguments.get(1));
		case RulesPackage.NEXTD2NEXTB___CHECK_DEC_BWD__COMMAND_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1));
		case RulesPackage.NEXTD2NEXTB___GENERATE_MODEL__RULEENTRYCONTAINER_S2N_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2N) arguments.get(1), (S2B) arguments.get(2));
		case RulesPackage.NEXTD2NEXTB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASSIGNMENT_COMMAND_BRANCH_STATEMENT_S2B_S2N_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Statement) arguments.get(4),
					(S2B) arguments.get(5), (S2N) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.NEXTD2NEXTB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_nextd2nextb_0_1_initialbindings_blackBBBB(nextd2nextb _this, Match match,
			Assignment a, Statement s) {
		if (!a.equals(s)) {
			return new Object[] { _this, match, a, s };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_0_2_SolveCSP_bindingFBBBB(nextd2nextb _this, Match match,
			Assignment a, Statement s) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, s);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, s };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_nextd2nextb_0_2_SolveCSP_bindingAndBlackFBBBB(nextd2nextb _this, Match match,
			Assignment a, Statement s) {
		Object[] result_pattern_nextd2nextb_0_2_SolveCSP_binding = pattern_nextd2nextb_0_2_SolveCSP_bindingFBBBB(_this,
				match, a, s);
		if (result_pattern_nextd2nextb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_nextd2nextb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_nextd2nextb_0_2_SolveCSP_black = pattern_nextd2nextb_0_2_SolveCSP_blackB(csp);
			if (result_pattern_nextd2nextb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, s };
			}
		}
		return null;
	}

	public static final boolean pattern_nextd2nextb_0_3_CheckCSP_expressionFBB(nextd2nextb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_0_4_collectelementstobetranslated_blackBBB(Match match,
			Assignment a, Statement s) {
		if (!a.equals(s)) {
			return new Object[] { match, a, s };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Assignment a, Statement s) {
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String s__a____next_name_prime = "next";
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		match.getToBeTranslatedEdges().add(s__a____next);
		s__a____next.setName(s__a____next_name_prime);
		return new Object[] { match, a, s, s__a____next };
	}

	public static final Object[] pattern_nextd2nextb_0_5_collectcontextelements_blackBBB(Match match, Assignment a,
			Statement s) {
		if (!a.equals(s)) {
			return new Object[] { match, a, s };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_0_5_collectcontextelements_greenBBB(Match match, Assignment a,
			Statement s) {
		match.getContextNodes().add(a);
		match.getContextNodes().add(s);
		return new Object[] { match, a, s };
	}

	public static final void pattern_nextd2nextb_0_6_registerobjectstomatch_expressionBBBB(nextd2nextb _this,
			Match match, Assignment a, Statement s) {
		_this.registerObjectsToMatch_FWD(match, a, s);

	}

	public static final boolean pattern_nextd2nextb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_nextd2nextb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("a");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("n");
		EObject _localVariable_3 = isApplicableMatch.getObject("s");
		EObject _localVariable_4 = isApplicableMatch.getObject("s2n");
		EObject _localVariable_5 = isApplicableMatch.getObject("a2c");
		EObject tmpA = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpN = _localVariable_2;
		EObject tmpS = _localVariable_3;
		EObject tmpS2n = _localVariable_4;
		EObject tmpA2c = _localVariable_5;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpC instanceof Command) {
				Command c = (Command) tmpC;
				if (tmpN instanceof Branch) {
					Branch n = (Branch) tmpN;
					if (tmpS instanceof Statement) {
						Statement s = (Statement) tmpS;
						if (tmpS2n instanceof S2B) {
							S2B s2n = (S2B) tmpS2n;
							if (tmpA2c instanceof S2N) {
								S2N a2c = (S2N) tmpA2c;
								return new Object[] { a, c, n, s, s2n, a2c, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_1_1_performtransformation_blackBBBBBBFBB(Assignment a, Command c,
			Branch n, Statement s, S2B s2n, S2N a2c, nextd2nextb _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(s)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { a, c, n, s, s2n, a2c, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			nextd2nextb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_nextd2nextb_1_1_performtransformation_binding = pattern_nextd2nextb_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_nextd2nextb_1_1_performtransformation_binding != null) {
			Assignment a = (Assignment) result_pattern_nextd2nextb_1_1_performtransformation_binding[0];
			Command c = (Command) result_pattern_nextd2nextb_1_1_performtransformation_binding[1];
			Branch n = (Branch) result_pattern_nextd2nextb_1_1_performtransformation_binding[2];
			Statement s = (Statement) result_pattern_nextd2nextb_1_1_performtransformation_binding[3];
			S2B s2n = (S2B) result_pattern_nextd2nextb_1_1_performtransformation_binding[4];
			S2N a2c = (S2N) result_pattern_nextd2nextb_1_1_performtransformation_binding[5];

			Object[] result_pattern_nextd2nextb_1_1_performtransformation_black = pattern_nextd2nextb_1_1_performtransformation_blackBBBBBBFBB(
					a, c, n, s, s2n, a2c, _this, isApplicableMatch);
			if (result_pattern_nextd2nextb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_nextd2nextb_1_1_performtransformation_black[6];

				return new Object[] { a, c, n, s, s2n, a2c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_1_1_performtransformation_greenBB(Command c, Branch n) {
		n.setNext(c);
		return new Object[] { c, n };
	}

	public static final Object[] pattern_nextd2nextb_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_nextd2nextb_1_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject a, EObject c, EObject n, EObject s, EObject s2n, EObject a2c) {
		if (!a.equals(c)) {
			if (!a.equals(n)) {
				if (!a.equals(s)) {
					if (!a.equals(s2n)) {
						if (!a.equals(a2c)) {
							if (!c.equals(n)) {
								if (!c.equals(s)) {
									if (!c.equals(s2n)) {
										if (!n.equals(s)) {
											if (!n.equals(s2n)) {
												if (!s.equals(s2n)) {
													if (!a2c.equals(c)) {
														if (!a2c.equals(n)) {
															if (!a2c.equals(s)) {
																if (!a2c.equals(s2n)) {
																	return new Object[] { ruleresult, a, c, n, s, s2n,
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

	public static final Object[] pattern_nextd2nextb_1_3_bookkeepingforedges_greenBBBBBFF(PerformRuleResult ruleresult,
			EObject a, EObject c, EObject n, EObject s) {
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "nextd2nextb";
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
		return new Object[] { ruleresult, a, c, n, s, s__a____next, n__c____next };
	}

	public static final void pattern_nextd2nextb_1_5_registerobjects_expressionBBBBBBBB(nextd2nextb _this,
			PerformRuleResult ruleresult, EObject a, EObject c, EObject n, EObject s, EObject s2n, EObject a2c) {
		_this.registerObjects_FWD(ruleresult, a, c, n, s, s2n, a2c);

	}

	public static final PerformRuleResult pattern_nextd2nextb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_2_1_preparereturnvalue_bindingFB(nextd2nextb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_2_1_preparereturnvalue_blackFBB(EClass eClass, nextd2nextb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_2_1_preparereturnvalue_bindingAndBlackFFB(nextd2nextb _this) {
		Object[] result_pattern_nextd2nextb_2_1_preparereturnvalue_binding = pattern_nextd2nextb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_nextd2nextb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_nextd2nextb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_nextd2nextb_2_1_preparereturnvalue_black = pattern_nextd2nextb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_nextd2nextb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_nextd2nextb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "nextd2nextb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_nextd2nextb_2_2_corematch_bindingFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_nextd2nextb_2_2_corematch_blackBFFBFFB(Assignment a, Statement s,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(s)) {
			for (S2B s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s, S2B.class, "source")) {
				Branch n = s2n.getTarget();
				if (n != null) {
					for (S2N a2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a, S2N.class,
							"source")) {
						Node tmpC = a2c.getTarget();
						if (tmpC instanceof Command) {
							Command c = (Command) tmpC;
							_result.add(new Object[] { a, c, n, s, s2n, a2c, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_nextd2nextb_2_3_findcontext_blackBBBBBB(Assignment a, Command c,
			Branch n, Statement s, S2B s2n, S2N a2c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(s)) {
			if (a.equals(s.getNext())) {
				if (s.equals(s2n.getSource())) {
					if (n.equals(s2n.getTarget())) {
						if (c.equals(a2c.getTarget())) {
							if (a.equals(a2c.getSource())) {
								_result.add(new Object[] { a, c, n, s, s2n, a2c });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_2_3_findcontext_greenBBBBBBFFFFFF(Assignment a, Command c,
			Branch n, Statement s, S2B s2n, S2N a2c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String s__a____next_name_prime = "next";
		String s2n__s____source_name_prime = "source";
		String s2n__n____target_name_prime = "target";
		String a2c__c____target_name_prime = "target";
		String a2c__a____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(s2n);
		isApplicableMatch.getAllContextElements().add(a2c);
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		isApplicableMatch.getAllContextElements().add(s__a____next);
		s2n__s____source.setSrc(s2n);
		s2n__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2n__s____source);
		s2n__n____target.setSrc(s2n);
		s2n__n____target.setTrg(n);
		isApplicableMatch.getAllContextElements().add(s2n__n____target);
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(a2c__c____target);
		a2c__a____source.setSrc(a2c);
		a2c__a____source.setTrg(a);
		isApplicableMatch.getAllContextElements().add(a2c__a____source);
		s__a____next.setName(s__a____next_name_prime);
		s2n__s____source.setName(s2n__s____source_name_prime);
		s2n__n____target.setName(s2n__n____target_name_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		a2c__a____source.setName(a2c__a____source_name_prime);
		return new Object[] { a, c, n, s, s2n, a2c, isApplicableMatch, s__a____next, s2n__s____source, s2n__n____target,
				a2c__c____target, a2c__a____source };
	}

	public static final Object[] pattern_nextd2nextb_2_4_solveCSP_bindingFBBBBBBBB(nextd2nextb _this,
			IsApplicableMatch isApplicableMatch, Assignment a, Command c, Branch n, Statement s, S2B s2n, S2N a2c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, a, c, n, s, s2n, a2c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, c, n, s, s2n, a2c };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_nextd2nextb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(nextd2nextb _this,
			IsApplicableMatch isApplicableMatch, Assignment a, Command c, Branch n, Statement s, S2B s2n, S2N a2c) {
		Object[] result_pattern_nextd2nextb_2_4_solveCSP_binding = pattern_nextd2nextb_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, a, c, n, s, s2n, a2c);
		if (result_pattern_nextd2nextb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_nextd2nextb_2_4_solveCSP_binding[0];

			Object[] result_pattern_nextd2nextb_2_4_solveCSP_black = pattern_nextd2nextb_2_4_solveCSP_blackB(csp);
			if (result_pattern_nextd2nextb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, c, n, s, s2n, a2c };
			}
		}
		return null;
	}

	public static final boolean pattern_nextd2nextb_2_5_checkCSP_expressionFBB(nextd2nextb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_nextd2nextb_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "nextd2nextb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_nextd2nextb_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_10_1_initialbindings_blackBBBB(nextd2nextb _this, Match match,
			Command c, Branch n) {
		return new Object[] { _this, match, c, n };
	}

	public static final Object[] pattern_nextd2nextb_10_2_SolveCSP_bindingFBBBB(nextd2nextb _this, Match match,
			Command c, Branch n) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, c, n);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, n };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_nextd2nextb_10_2_SolveCSP_bindingAndBlackFBBBB(nextd2nextb _this, Match match,
			Command c, Branch n) {
		Object[] result_pattern_nextd2nextb_10_2_SolveCSP_binding = pattern_nextd2nextb_10_2_SolveCSP_bindingFBBBB(
				_this, match, c, n);
		if (result_pattern_nextd2nextb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_nextd2nextb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_nextd2nextb_10_2_SolveCSP_black = pattern_nextd2nextb_10_2_SolveCSP_blackB(csp);
			if (result_pattern_nextd2nextb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, n };
			}
		}
		return null;
	}

	public static final boolean pattern_nextd2nextb_10_3_CheckCSP_expressionFBB(nextd2nextb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_10_4_collectelementstobetranslated_blackBBB(Match match, Command c,
			Branch n) {
		return new Object[] { match, c, n };
	}

	public static final Object[] pattern_nextd2nextb_10_4_collectelementstobetranslated_greenBBBF(Match match,
			Command c, Branch n) {
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String n__c____next_name_prime = "next";
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(n__c____next);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { match, c, n, n__c____next };
	}

	public static final Object[] pattern_nextd2nextb_10_5_collectcontextelements_blackBBB(Match match, Command c,
			Branch n) {
		return new Object[] { match, c, n };
	}

	public static final Object[] pattern_nextd2nextb_10_5_collectcontextelements_greenBBB(Match match, Command c,
			Branch n) {
		match.getContextNodes().add(c);
		match.getContextNodes().add(n);
		return new Object[] { match, c, n };
	}

	public static final void pattern_nextd2nextb_10_6_registerobjectstomatch_expressionBBBB(nextd2nextb _this,
			Match match, Command c, Branch n) {
		_this.registerObjectsToMatch_BWD(match, c, n);

	}

	public static final boolean pattern_nextd2nextb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_nextd2nextb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("a");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("n");
		EObject _localVariable_3 = isApplicableMatch.getObject("s");
		EObject _localVariable_4 = isApplicableMatch.getObject("s2n");
		EObject _localVariable_5 = isApplicableMatch.getObject("a2c");
		EObject tmpA = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpN = _localVariable_2;
		EObject tmpS = _localVariable_3;
		EObject tmpS2n = _localVariable_4;
		EObject tmpA2c = _localVariable_5;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpC instanceof Command) {
				Command c = (Command) tmpC;
				if (tmpN instanceof Branch) {
					Branch n = (Branch) tmpN;
					if (tmpS instanceof Statement) {
						Statement s = (Statement) tmpS;
						if (tmpS2n instanceof S2B) {
							S2B s2n = (S2B) tmpS2n;
							if (tmpA2c instanceof S2N) {
								S2N a2c = (S2N) tmpA2c;
								return new Object[] { a, c, n, s, s2n, a2c, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_11_1_performtransformation_blackBBBBBBFBB(Assignment a, Command c,
			Branch n, Statement s, S2B s2n, S2N a2c, nextd2nextb _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(s)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { a, c, n, s, s2n, a2c, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			nextd2nextb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_nextd2nextb_11_1_performtransformation_binding = pattern_nextd2nextb_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_nextd2nextb_11_1_performtransformation_binding != null) {
			Assignment a = (Assignment) result_pattern_nextd2nextb_11_1_performtransformation_binding[0];
			Command c = (Command) result_pattern_nextd2nextb_11_1_performtransformation_binding[1];
			Branch n = (Branch) result_pattern_nextd2nextb_11_1_performtransformation_binding[2];
			Statement s = (Statement) result_pattern_nextd2nextb_11_1_performtransformation_binding[3];
			S2B s2n = (S2B) result_pattern_nextd2nextb_11_1_performtransformation_binding[4];
			S2N a2c = (S2N) result_pattern_nextd2nextb_11_1_performtransformation_binding[5];

			Object[] result_pattern_nextd2nextb_11_1_performtransformation_black = pattern_nextd2nextb_11_1_performtransformation_blackBBBBBBFBB(
					a, c, n, s, s2n, a2c, _this, isApplicableMatch);
			if (result_pattern_nextd2nextb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_nextd2nextb_11_1_performtransformation_black[6];

				return new Object[] { a, c, n, s, s2n, a2c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_11_1_performtransformation_greenBB(Assignment a, Statement s) {
		s.setNext(a);
		return new Object[] { a, s };
	}

	public static final Object[] pattern_nextd2nextb_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_nextd2nextb_11_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject a, EObject c, EObject n, EObject s, EObject s2n, EObject a2c) {
		if (!a.equals(c)) {
			if (!a.equals(n)) {
				if (!a.equals(s)) {
					if (!a.equals(s2n)) {
						if (!a.equals(a2c)) {
							if (!c.equals(n)) {
								if (!c.equals(s)) {
									if (!c.equals(s2n)) {
										if (!n.equals(s)) {
											if (!n.equals(s2n)) {
												if (!s.equals(s2n)) {
													if (!a2c.equals(c)) {
														if (!a2c.equals(n)) {
															if (!a2c.equals(s)) {
																if (!a2c.equals(s2n)) {
																	return new Object[] { ruleresult, a, c, n, s, s2n,
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

	public static final Object[] pattern_nextd2nextb_11_3_bookkeepingforedges_greenBBBBBFF(PerformRuleResult ruleresult,
			EObject a, EObject c, EObject n, EObject s) {
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "nextd2nextb";
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
		return new Object[] { ruleresult, a, c, n, s, s__a____next, n__c____next };
	}

	public static final void pattern_nextd2nextb_11_5_registerobjects_expressionBBBBBBBB(nextd2nextb _this,
			PerformRuleResult ruleresult, EObject a, EObject c, EObject n, EObject s, EObject s2n, EObject a2c) {
		_this.registerObjects_BWD(ruleresult, a, c, n, s, s2n, a2c);

	}

	public static final PerformRuleResult pattern_nextd2nextb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_12_1_preparereturnvalue_bindingFB(nextd2nextb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			nextd2nextb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_12_1_preparereturnvalue_bindingAndBlackFFB(nextd2nextb _this) {
		Object[] result_pattern_nextd2nextb_12_1_preparereturnvalue_binding = pattern_nextd2nextb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_nextd2nextb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_nextd2nextb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_nextd2nextb_12_1_preparereturnvalue_black = pattern_nextd2nextb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_nextd2nextb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_nextd2nextb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "nextd2nextb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_nextd2nextb_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("n");
		EObject tmpC = _localVariable_0;
		EObject tmpN = _localVariable_1;
		if (tmpC instanceof Command) {
			Command c = (Command) tmpC;
			if (tmpN instanceof Branch) {
				Branch n = (Branch) tmpN;
				return new Object[] { c, n, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_nextd2nextb_12_2_corematch_blackFBBFFFB(Command c, Branch n,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (S2B s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n, S2B.class, "target")) {
			Statement s = s2n.getSource();
			if (s != null) {
				for (S2N a2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2N.class,
						"target")) {
					Statement tmpA = a2c.getSource();
					if (tmpA instanceof Assignment) {
						Assignment a = (Assignment) tmpA;
						if (!a.equals(s)) {
							_result.add(new Object[] { a, c, n, s, s2n, a2c, match });
						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_nextd2nextb_12_3_findcontext_blackBBBBBB(Assignment a, Command c,
			Branch n, Statement s, S2B s2n, S2N a2c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(s)) {
			if (c.equals(n.getNext())) {
				if (s.equals(s2n.getSource())) {
					if (n.equals(s2n.getTarget())) {
						if (c.equals(a2c.getTarget())) {
							if (a.equals(a2c.getSource())) {
								_result.add(new Object[] { a, c, n, s, s2n, a2c });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_12_3_findcontext_greenBBBBBBFFFFFF(Assignment a, Command c,
			Branch n, Statement s, S2B s2n, S2N a2c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String n__c____next_name_prime = "next";
		String s2n__s____source_name_prime = "source";
		String s2n__n____target_name_prime = "target";
		String a2c__c____target_name_prime = "target";
		String a2c__a____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(s2n);
		isApplicableMatch.getAllContextElements().add(a2c);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(n__c____next);
		s2n__s____source.setSrc(s2n);
		s2n__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2n__s____source);
		s2n__n____target.setSrc(s2n);
		s2n__n____target.setTrg(n);
		isApplicableMatch.getAllContextElements().add(s2n__n____target);
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(a2c__c____target);
		a2c__a____source.setSrc(a2c);
		a2c__a____source.setTrg(a);
		isApplicableMatch.getAllContextElements().add(a2c__a____source);
		n__c____next.setName(n__c____next_name_prime);
		s2n__s____source.setName(s2n__s____source_name_prime);
		s2n__n____target.setName(s2n__n____target_name_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		a2c__a____source.setName(a2c__a____source_name_prime);
		return new Object[] { a, c, n, s, s2n, a2c, isApplicableMatch, n__c____next, s2n__s____source, s2n__n____target,
				a2c__c____target, a2c__a____source };
	}

	public static final Object[] pattern_nextd2nextb_12_4_solveCSP_bindingFBBBBBBBB(nextd2nextb _this,
			IsApplicableMatch isApplicableMatch, Assignment a, Command c, Branch n, Statement s, S2B s2n, S2N a2c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, a, c, n, s, s2n, a2c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, c, n, s, s2n, a2c };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_nextd2nextb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(nextd2nextb _this,
			IsApplicableMatch isApplicableMatch, Assignment a, Command c, Branch n, Statement s, S2B s2n, S2N a2c) {
		Object[] result_pattern_nextd2nextb_12_4_solveCSP_binding = pattern_nextd2nextb_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, a, c, n, s, s2n, a2c);
		if (result_pattern_nextd2nextb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_nextd2nextb_12_4_solveCSP_binding[0];

			Object[] result_pattern_nextd2nextb_12_4_solveCSP_black = pattern_nextd2nextb_12_4_solveCSP_blackB(csp);
			if (result_pattern_nextd2nextb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, c, n, s, s2n, a2c };
			}
		}
		return null;
	}

	public static final boolean pattern_nextd2nextb_12_5_checkCSP_expressionFBB(nextd2nextb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_nextd2nextb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "nextd2nextb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_nextd2nextb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_20_1_preparereturnvalue_bindingFB(nextd2nextb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			nextd2nextb _this) {
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

	public static final Object[] pattern_nextd2nextb_20_1_preparereturnvalue_bindingAndBlackFFBF(nextd2nextb _this) {
		Object[] result_pattern_nextd2nextb_20_1_preparereturnvalue_binding = pattern_nextd2nextb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_nextd2nextb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_nextd2nextb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_nextd2nextb_20_1_preparereturnvalue_black = pattern_nextd2nextb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_nextd2nextb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_nextd2nextb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_nextd2nextb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_nextd2nextb_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpN = _edge_next.getSrc();
		if (tmpN instanceof Branch) {
			Branch n = (Branch) tmpN;
			EObject tmpC = _edge_next.getTrg();
			if (tmpC instanceof Command) {
				Command c = (Command) tmpC;
				if (c.equals(n.getNext())) {
					_result.add(new Object[] { c, n, _edge_next });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_nextd2nextb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_nextd2nextb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			nextd2nextb _this, Match match, Command c, Branch n) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, c, n);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_nextd2nextb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			nextd2nextb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_nextd2nextb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_21_1_preparereturnvalue_bindingFB(nextd2nextb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			nextd2nextb _this) {
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

	public static final Object[] pattern_nextd2nextb_21_1_preparereturnvalue_bindingAndBlackFFBF(nextd2nextb _this) {
		Object[] result_pattern_nextd2nextb_21_1_preparereturnvalue_binding = pattern_nextd2nextb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_nextd2nextb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_nextd2nextb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_nextd2nextb_21_1_preparereturnvalue_black = pattern_nextd2nextb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_nextd2nextb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_nextd2nextb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_nextd2nextb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_nextd2nextb_21_2_testcorematchandDECs_blackFFB(
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
						_result.add(new Object[] { a, s, _edge_next });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_nextd2nextb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_nextd2nextb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			nextd2nextb _this, Match match, Assignment a, Statement s) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, s);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_nextd2nextb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			nextd2nextb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_nextd2nextb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_24_1_prepare_blackB(nextd2nextb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_nextd2nextb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_nextd2nextb_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("a");
		EObject _localVariable_1 = targetMatch.getObject("c");
		EObject _localVariable_2 = targetMatch.getObject("n");
		EObject _localVariable_3 = sourceMatch.getObject("s");
		EObject tmpA = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpN = _localVariable_2;
		EObject tmpS = _localVariable_3;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpC instanceof Command) {
				Command c = (Command) tmpC;
				if (tmpN instanceof Branch) {
					Branch n = (Branch) tmpN;
					if (tmpS instanceof Statement) {
						Statement s = (Statement) tmpS;
						return new Object[] { a, c, n, s, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_24_2_matchsrctrgcontext_blackBBBBBB(Assignment a, Command c,
			Branch n, Statement s, Match sourceMatch, Match targetMatch) {
		if (!a.equals(s)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { a, c, n, s, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_nextd2nextb_24_2_matchsrctrgcontext_binding = pattern_nextd2nextb_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_nextd2nextb_24_2_matchsrctrgcontext_binding != null) {
			Assignment a = (Assignment) result_pattern_nextd2nextb_24_2_matchsrctrgcontext_binding[0];
			Command c = (Command) result_pattern_nextd2nextb_24_2_matchsrctrgcontext_binding[1];
			Branch n = (Branch) result_pattern_nextd2nextb_24_2_matchsrctrgcontext_binding[2];
			Statement s = (Statement) result_pattern_nextd2nextb_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_nextd2nextb_24_2_matchsrctrgcontext_black = pattern_nextd2nextb_24_2_matchsrctrgcontext_blackBBBBBB(
					a, c, n, s, sourceMatch, targetMatch);
			if (result_pattern_nextd2nextb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { a, c, n, s, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_24_3_solvecsp_bindingFBBBBBBB(nextd2nextb _this, Assignment a,
			Command c, Branch n, Statement s, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(a, c, n, s, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, a, c, n, s, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_nextd2nextb_24_3_solvecsp_bindingAndBlackFBBBBBBB(nextd2nextb _this,
			Assignment a, Command c, Branch n, Statement s, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_nextd2nextb_24_3_solvecsp_binding = pattern_nextd2nextb_24_3_solvecsp_bindingFBBBBBBB(
				_this, a, c, n, s, sourceMatch, targetMatch);
		if (result_pattern_nextd2nextb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_nextd2nextb_24_3_solvecsp_binding[0];

			Object[] result_pattern_nextd2nextb_24_3_solvecsp_black = pattern_nextd2nextb_24_3_solvecsp_blackB(csp);
			if (result_pattern_nextd2nextb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, a, c, n, s, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_nextd2nextb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_nextd2nextb_24_5_matchcorrcontext_blackBBBBFFBB(Assignment a,
			Command c, Branch n, Statement s, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(s)) {
			if (!sourceMatch.equals(targetMatch)) {
				for (S2B s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s, S2B.class,
						"source")) {
					if (n.equals(s2n.getTarget())) {
						for (S2N a2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2N.class,
								"target")) {
							if (a.equals(a2c.getSource())) {
								_result.add(new Object[] { a, c, n, s, s2n, a2c, sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_24_5_matchcorrcontext_greenBBBBF(S2B s2n, S2N a2c,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "nextd2nextb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(s2n);
		ccMatch.getAllContextElements().add(a2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { s2n, a2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_nextd2nextb_24_6_createcorrespondence_blackBBBBB(Assignment a, Command c,
			Branch n, Statement s, CCMatch ccMatch) {
		if (!a.equals(s)) {
			return new Object[] { a, c, n, s, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_nextd2nextb_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "nextd2nextb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_nextd2nextb_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_27_1_matchtggpattern_blackBB(Assignment a, Statement s) {
		if (!a.equals(s)) {
			if (a.equals(s.getNext())) {
				return new Object[] { a, s };
			}
		}
		return null;
	}

	public static final boolean pattern_nextd2nextb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_nextd2nextb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_28_1_matchtggpattern_blackBB(Command c, Branch n) {
		if (c.equals(n.getNext())) {
			return new Object[] { c, n };
		}
		return null;
	}

	public static final boolean pattern_nextd2nextb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_nextd2nextb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_29_1_createresult_blackB(nextd2nextb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_nextd2nextb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_nextd2nextb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Assignment a) {
		if (ruleResult.getSourceObjects().contains(a)) {
			return new Object[] { ruleResult, a };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2N a2c) {
		if (ruleResult.getCorrObjects().contains(a2c)) {
			return new Object[] { ruleResult, a2c };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Command c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Branch n) {
		if (ruleResult.getTargetObjects().contains(n)) {
			return new Object[] { ruleResult, n };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, S2B s2n) {
		if (ruleResult.getCorrObjects().contains(s2n)) {
			return new Object[] { ruleResult, s2n };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Statement s) {
		if (ruleResult.getSourceObjects().contains(s)) {
			return new Object[] { ruleResult, s };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_nextd2nextb_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList a2cList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList s2nList : ruleEntryContainer.getRuleEntryList()) {
				if (!a2cList.equals(s2nList)) {
					for (EObject tmpA2c : a2cList.getEntryObjects()) {
						if (tmpA2c instanceof S2N) {
							S2N a2c = (S2N) tmpA2c;
							Statement tmpA = a2c.getSource();
							if (tmpA instanceof Assignment) {
								Assignment a = (Assignment) tmpA;
								Node tmpC = a2c.getTarget();
								if (tmpC instanceof Command) {
									Command c = (Command) tmpC;
									if (pattern_nextd2nextb_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											a2c) == null) {
										if (pattern_nextd2nextb_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												a) == null) {
											if (pattern_nextd2nextb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													c) == null) {
												for (EObject tmpS2n : s2nList.getEntryObjects()) {
													if (tmpS2n instanceof S2B) {
														S2B s2n = (S2B) tmpS2n;
														Branch n = s2n.getTarget();
														if (n != null) {
															Statement s = s2n.getSource();
															if (s != null) {
																if (!a.equals(s)) {
																	if (pattern_nextd2nextb_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, s2n) == null) {
																		if (pattern_nextd2nextb_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, n) == null) {
																			if (pattern_nextd2nextb_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, s) == null) {
																				_result.add(new Object[] { a2cList, a,
																						a2c, c, s2nList, n, s2n, s,
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
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_29_3_solveCSP_bindingFBBBBBBBBB(nextd2nextb _this,
			IsApplicableMatch isApplicableMatch, Assignment a, Command c, Branch n, Statement s, S2B s2n, S2N a2c,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, a, c, n, s, s2n, a2c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, c, n, s, s2n, a2c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_nextd2nextb_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(nextd2nextb _this,
			IsApplicableMatch isApplicableMatch, Assignment a, Command c, Branch n, Statement s, S2B s2n, S2N a2c,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_nextd2nextb_29_3_solveCSP_binding = pattern_nextd2nextb_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, a, c, n, s, s2n, a2c, ruleResult);
		if (result_pattern_nextd2nextb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_nextd2nextb_29_3_solveCSP_binding[0];

			Object[] result_pattern_nextd2nextb_29_3_solveCSP_black = pattern_nextd2nextb_29_3_solveCSP_blackB(csp);
			if (result_pattern_nextd2nextb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, c, n, s, s2n, a2c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_nextd2nextb_29_4_checkCSP_expressionFBB(nextd2nextb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_nextd2nextb_29_5_checknacs_blackBBBBBB(Assignment a, Command c, Branch n,
			Statement s, S2B s2n, S2N a2c) {
		if (!a.equals(s)) {
			return new Object[] { a, c, n, s, s2n, a2c };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_29_6_perform_blackBBBBBBB(Assignment a, Command c, Branch n,
			Statement s, S2B s2n, S2N a2c, ModelgeneratorRuleResult ruleResult) {
		if (!a.equals(s)) {
			return new Object[] { a, c, n, s, s2n, a2c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_nextd2nextb_29_6_perform_greenBBBBB(Assignment a, Command c, Branch n,
			Statement s, ModelgeneratorRuleResult ruleResult) {
		s.setNext(a);
		n.setNext(c);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a, c, n, s, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_nextd2nextb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //nextd2nextbImpl
