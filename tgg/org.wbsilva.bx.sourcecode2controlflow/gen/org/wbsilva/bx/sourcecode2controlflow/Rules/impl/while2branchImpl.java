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
import org.wbsilva.bx.sourcecode2controlflow.Rules.while2branch;

import org.wbsilva.bx.sourcecode2controlflow.S2B;
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
 * An implementation of the model object '<em><b>while2branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class while2branchImpl extends AbstractRuleImpl implements while2branch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected while2branchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhile2branch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment b, While a, Statement s) {

		Object[] result1_black = while2branchImpl.pattern_while2branch_0_1_initialbindings_blackBBBBB(this, match, b, a,
				s);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[s] = " + s + ".");
		}

		Object[] result2_bindingAndBlack = while2branchImpl
				.pattern_while2branch_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, b, a, s);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[s] = " + s + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (while2branchImpl.pattern_while2branch_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = while2branchImpl
					.pattern_while2branch_0_4_collectelementstobetranslated_blackBBBB(match, b, a, s);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[s] = " + s + ".");
			}
			while2branchImpl.pattern_while2branch_0_4_collectelementstobetranslated_greenBBBBFF(match, b, a, s);
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge s__a____next = (EMoflonEdge) result4_green[5];

			Object[] result5_black = while2branchImpl.pattern_while2branch_0_5_collectcontextelements_blackBBBB(match,
					b, a, s);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[s] = " + s + ".");
			}
			while2branchImpl.pattern_while2branch_0_5_collectcontextelements_greenBB(match, s);

			// 
			while2branchImpl.pattern_while2branch_0_6_registerobjectstomatch_expressionBBBBB(this, match, b, a, s);
			return while2branchImpl.pattern_while2branch_0_7_expressionF();
		} else {
			return while2branchImpl.pattern_while2branch_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = while2branchImpl
				.pattern_while2branch_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment b = (Assignment) result1_bindingAndBlack[0];
		While a = (While) result1_bindingAndBlack[1];
		S2N s2n = (S2N) result1_bindingAndBlack[2];
		Statement s = (Statement) result1_bindingAndBlack[3];
		Node n = (Node) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = while2branchImpl.pattern_while2branch_1_1_performtransformation_greenFFFBFBB(b, a, n);
		Branch c = (Branch) result1_green[0];
		S2B a2c = (S2B) result1_green[1];
		Command d = (Command) result1_green[2];
		S2N b2d = (S2N) result1_green[4];

		Object[] result2_black = while2branchImpl.pattern_while2branch_1_2_collecttranslatedelements_blackBBBBBB(c, a2c,
				d, b, b2d, a);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[a2c] = " + a2c + ", "
							+ "[d] = " + d + ", " + "[b] = " + b + ", " + "[b2d] = " + b2d + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = while2branchImpl.pattern_while2branch_1_2_collecttranslatedelements_greenFBBBBBB(c,
				a2c, d, b, b2d, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = while2branchImpl.pattern_while2branch_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, c, a2c, d, b, b2d, a, s2n, s, n);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[a2c] = " + a2c + ", " + "[d] = " + d + ", " + "[b] = " + b + ", "
					+ "[b2d] = " + b2d + ", " + "[a] = " + a + ", " + "[s2n] = " + s2n + ", " + "[s] = " + s + ", "
					+ "[n] = " + n + ".");
		}
		while2branchImpl.pattern_while2branch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, c, a2c, d, b,
				b2d, a, s, n);
		//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge d__c____next = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2d__d____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge a2c__a____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2d__b____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[16];

		// 
		// 
		while2branchImpl.pattern_while2branch_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, c, a2c, d, b,
				b2d, a, s2n, s, n);
		return while2branchImpl.pattern_while2branch_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = while2branchImpl
				.pattern_while2branch_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = while2branchImpl.pattern_while2branch_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = while2branchImpl.pattern_while2branch_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment b = (Assignment) result2_binding[0];
		While a = (While) result2_binding[1];
		Statement s = (Statement) result2_binding[2];
		for (Object[] result2_black : while2branchImpl.pattern_while2branch_2_2_corematch_blackBBFBFB(b, a, s, match)) {
			S2N s2n = (S2N) result2_black[2];
			Node n = (Node) result2_black[4];
			// ForEach 
			for (Object[] result3_black : while2branchImpl.pattern_while2branch_2_3_findcontext_blackBBBBB(b, a, s2n, s,
					n)) {
				Object[] result3_green = while2branchImpl.pattern_while2branch_2_3_findcontext_greenBBBBBFFFFF(b, a,
						s2n, s, n);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = while2branchImpl
						.pattern_while2branch_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, b, a, s2n,
								s, n);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[b] = " + b + ", " + "[a] = " + a
							+ ", " + "[s2n] = " + s2n + ", " + "[s] = " + s + ", " + "[n] = " + n + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (while2branchImpl.pattern_while2branch_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = while2branchImpl
							.pattern_while2branch_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					while2branchImpl.pattern_while2branch_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return while2branchImpl.pattern_while2branch_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment b, While a, Statement s) {
		match.registerObject("b", b);
		match.registerObject("a", a);
		match.registerObject("s", s);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment b, While a, Statement s) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment b, While a, S2N s2n,
			Statement s, Node n) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("s2n", s2n);
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("n", n);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c, EObject a2c, EObject d, EObject b,
			EObject b2d, EObject a, EObject s2n, EObject s, EObject n) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2d", b2d);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("n", n);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch c, Command d, Node n) {

		Object[] result1_black = while2branchImpl.pattern_while2branch_10_1_initialbindings_blackBBBBB(this, match, c,
				d, n);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[n] = " + n + ".");
		}

		Object[] result2_bindingAndBlack = while2branchImpl
				.pattern_while2branch_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, c, d, n);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[n] = " + n + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (while2branchImpl.pattern_while2branch_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = while2branchImpl
					.pattern_while2branch_10_4_collectelementstobetranslated_blackBBBB(match, c, d, n);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[n] = " + n + ".");
			}
			while2branchImpl.pattern_while2branch_10_4_collectelementstobetranslated_greenBBBBFF(match, c, d, n);
			//nothing EMoflonEdge d__c____next = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge n__c____next = (EMoflonEdge) result4_green[5];

			Object[] result5_black = while2branchImpl.pattern_while2branch_10_5_collectcontextelements_blackBBBB(match,
					c, d, n);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[n] = " + n + ".");
			}
			while2branchImpl.pattern_while2branch_10_5_collectcontextelements_greenBB(match, n);

			// 
			while2branchImpl.pattern_while2branch_10_6_registerobjectstomatch_expressionBBBBB(this, match, c, d, n);
			return while2branchImpl.pattern_while2branch_10_7_expressionF();
		} else {
			return while2branchImpl.pattern_while2branch_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = while2branchImpl
				.pattern_while2branch_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch c = (Branch) result1_bindingAndBlack[0];
		Command d = (Command) result1_bindingAndBlack[1];
		S2N s2n = (S2N) result1_bindingAndBlack[2];
		Statement s = (Statement) result1_bindingAndBlack[3];
		Node n = (Node) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = while2branchImpl.pattern_while2branch_11_1_performtransformation_greenBFBFFFB(c, d, s);
		S2B a2c = (S2B) result1_green[1];
		Assignment b = (Assignment) result1_green[3];
		S2N b2d = (S2N) result1_green[4];
		While a = (While) result1_green[5];

		Object[] result2_black = while2branchImpl.pattern_while2branch_11_2_collecttranslatedelements_blackBBBBBB(c,
				a2c, d, b, b2d, a);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[a2c] = " + a2c + ", "
							+ "[d] = " + d + ", " + "[b] = " + b + ", " + "[b2d] = " + b2d + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = while2branchImpl.pattern_while2branch_11_2_collecttranslatedelements_greenFBBBBBB(c,
				a2c, d, b, b2d, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = while2branchImpl.pattern_while2branch_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, c, a2c, d, b, b2d, a, s2n, s, n);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[a2c] = " + a2c + ", " + "[d] = " + d + ", " + "[b] = " + b + ", "
					+ "[b2d] = " + b2d + ", " + "[a] = " + a + ", " + "[s2n] = " + s2n + ", " + "[s] = " + s + ", "
					+ "[n] = " + n + ".");
		}
		while2branchImpl.pattern_while2branch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, c, a2c, d, b,
				b2d, a, s, n);
		//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge d__c____next = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2d__d____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge a2c__a____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2d__b____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[16];

		// 
		// 
		while2branchImpl.pattern_while2branch_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, c, a2c, d, b,
				b2d, a, s2n, s, n);
		return while2branchImpl.pattern_while2branch_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = while2branchImpl
				.pattern_while2branch_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = while2branchImpl
				.pattern_while2branch_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = while2branchImpl.pattern_while2branch_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch c = (Branch) result2_binding[0];
		Command d = (Command) result2_binding[1];
		Node n = (Node) result2_binding[2];
		for (Object[] result2_black : while2branchImpl.pattern_while2branch_12_2_corematch_blackBBFFBB(c, d, n,
				match)) {
			S2N s2n = (S2N) result2_black[2];
			Statement s = (Statement) result2_black[3];
			// ForEach 
			for (Object[] result3_black : while2branchImpl.pattern_while2branch_12_3_findcontext_blackBBBBB(c, d, s2n,
					s, n)) {
				Object[] result3_green = while2branchImpl.pattern_while2branch_12_3_findcontext_greenBBBBBFFFFF(c, d,
						s2n, s, n);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge d__c____next = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = while2branchImpl
						.pattern_while2branch_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, c, d, s2n,
								s, n);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d] = " + d
							+ ", " + "[s2n] = " + s2n + ", " + "[s] = " + s + ", " + "[n] = " + n + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (while2branchImpl.pattern_while2branch_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = while2branchImpl
							.pattern_while2branch_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					while2branchImpl.pattern_while2branch_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return while2branchImpl.pattern_while2branch_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch c, Command d, Node n) {
		match.registerObject("c", c);
		match.registerObject("d", d);
		match.registerObject("n", n);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch c, Command d, Node n) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch c, Command d, S2N s2n, Statement s,
			Node n) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("s2n", s2n);
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("n", n);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c, EObject a2c, EObject d, EObject b,
			EObject b2d, EObject a, EObject s2n, EObject s, EObject n) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2d", b2d);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("n", n);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_66(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = while2branchImpl
				.pattern_while2branch_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = while2branchImpl.pattern_while2branch_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : while2branchImpl
				.pattern_while2branch_20_2_testcorematchandDECs_blackFFFB(_edge_next)) {
			Branch c = (Branch) result2_black[0];
			Command d = (Command) result2_black[1];
			Node n = (Node) result2_black[2];
			Object[] result2_green = while2branchImpl.pattern_while2branch_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (while2branchImpl.pattern_while2branch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
					this, match, c, d, n)) {
				// 
				if (while2branchImpl
						.pattern_while2branch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = while2branchImpl.pattern_while2branch_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					while2branchImpl.pattern_while2branch_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return while2branchImpl.pattern_while2branch_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_72(EMoflonEdge _edge_last) {

		Object[] result1_bindingAndBlack = while2branchImpl
				.pattern_while2branch_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = while2branchImpl.pattern_while2branch_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : while2branchImpl
				.pattern_while2branch_21_2_testcorematchandDECs_blackFFFB(_edge_last)) {
			Assignment b = (Assignment) result2_black[0];
			While a = (While) result2_black[1];
			Statement s = (Statement) result2_black[2];
			Object[] result2_green = while2branchImpl.pattern_while2branch_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (while2branchImpl.pattern_while2branch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
					this, match, b, a, s)) {
				// 
				if (while2branchImpl
						.pattern_while2branch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = while2branchImpl.pattern_while2branch_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					while2branchImpl.pattern_while2branch_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return while2branchImpl.pattern_while2branch_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("while2branch");
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
		ruleResult.setRule("while2branch");
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

		Object[] result1_black = while2branchImpl.pattern_while2branch_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = while2branchImpl.pattern_while2branch_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = while2branchImpl
				.pattern_while2branch_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Branch c = (Branch) result2_bindingAndBlack[0];
		Command d = (Command) result2_bindingAndBlack[1];
		Assignment b = (Assignment) result2_bindingAndBlack[2];
		While a = (While) result2_bindingAndBlack[3];
		Statement s = (Statement) result2_bindingAndBlack[4];
		Node n = (Node) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = while2branchImpl
				.pattern_while2branch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, c, d, b, a, s, n, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[s] = "
					+ s + ", " + "[n] = " + n + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (while2branchImpl.pattern_while2branch_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : while2branchImpl.pattern_while2branch_24_5_matchcorrcontext_blackFBBBB(s, n,
					sourceMatch, targetMatch)) {
				S2N s2n = (S2N) result5_black[0];
				Object[] result5_green = while2branchImpl.pattern_while2branch_24_5_matchcorrcontext_greenBBBF(s2n,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = while2branchImpl.pattern_while2branch_24_6_createcorrespondence_blackBBBBBBB(c,
						d, b, a, s, n, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
							+ "[d] = " + d + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[s] = " + s + ", "
							+ "[n] = " + n + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				while2branchImpl.pattern_while2branch_24_6_createcorrespondence_greenBFBBFBB(c, d, b, a, ccMatch);
				//nothing S2B a2c = (S2B) result6_green[1];
				//nothing S2N b2d = (S2N) result6_green[4];

				Object[] result7_black = while2branchImpl.pattern_while2branch_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				while2branchImpl.pattern_while2branch_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return while2branchImpl.pattern_while2branch_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Branch c, Command d, Assignment b, While a, Statement s, Node n,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment b, While a, Statement s) {// 
		Object[] result1_black = while2branchImpl.pattern_while2branch_27_1_matchtggpattern_blackBBB(b, a, s);
		if (result1_black != null) {
			return while2branchImpl.pattern_while2branch_27_2_expressionF();
		} else {
			return while2branchImpl.pattern_while2branch_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch c, Command d, Node n) {// 
		Object[] result1_black = while2branchImpl.pattern_while2branch_28_1_matchtggpattern_blackBBB(c, d, n);
		if (result1_black != null) {
			return while2branchImpl.pattern_while2branch_28_2_expressionF();
		} else {
			return while2branchImpl.pattern_while2branch_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2N s2nParameter) {

		Object[] result1_black = while2branchImpl.pattern_while2branch_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = while2branchImpl.pattern_while2branch_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : while2branchImpl
				.pattern_while2branch_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList s2nList = (RuleEntryList) result2_black[0];
			S2N s2n = (S2N) result2_black[1];
			Statement s = (Statement) result2_black[2];
			Node n = (Node) result2_black[3];

			Object[] result3_bindingAndBlack = while2branchImpl
					.pattern_while2branch_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, s2n, s, n,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[s2n] = " + s2n + ", " + "[s] = " + s
						+ ", " + "[n] = " + n + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (while2branchImpl.pattern_while2branch_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = while2branchImpl.pattern_while2branch_29_5_checknacs_blackBBB(s2n, s, n);
				if (result5_black != null) {

					Object[] result6_black = while2branchImpl.pattern_while2branch_29_6_perform_blackBBBB(s2n, s, n,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[s2n] = " + s2n + ", "
								+ "[s] = " + s + ", " + "[n] = " + n + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					while2branchImpl.pattern_while2branch_29_6_perform_greenFFFFFFBBB(s, n, ruleResult);
					//nothing Branch c = (Branch) result6_green[0];
					//nothing S2B a2c = (S2B) result6_green[1];
					//nothing Command d = (Command) result6_green[2];
					//nothing Assignment b = (Assignment) result6_green[3];
					//nothing S2N b2d = (S2N) result6_green[4];
					//nothing While a = (While) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return while2branchImpl.pattern_while2branch_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2N s2n, Statement s, Node n,
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
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("n", n);
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
		case RulesPackage.WHILE2BRANCH___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_STATEMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Statement) arguments.get(3));
		case RulesPackage.WHILE2BRANCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_STATEMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Statement) arguments.get(3));
			return null;
		case RulesPackage.WHILE2BRANCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_STATEMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Statement) arguments.get(3));
		case RulesPackage.WHILE2BRANCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_WHILE_S2N_STATEMENT_NODE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (S2N) arguments.get(3), (Statement) arguments.get(4),
					(Node) arguments.get(5));
		case RulesPackage.WHILE2BRANCH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILE2BRANCH___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_NODE:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Node) arguments.get(3));
		case RulesPackage.WHILE2BRANCH___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_NODE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Node) arguments.get(3));
			return null;
		case RulesPackage.WHILE2BRANCH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_NODE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Node) arguments.get(3));
		case RulesPackage.WHILE2BRANCH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_COMMAND_S2N_STATEMENT_NODE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (S2N) arguments.get(3), (Statement) arguments.get(4),
					(Node) arguments.get(5));
		case RulesPackage.WHILE2BRANCH___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILE2BRANCH___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___IS_APPROPRIATE_BWD_EMOFLON_EDGE_66__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_66((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_72__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_72((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILE2BRANCH___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_COMMAND_ASSIGNMENT_WHILE_STATEMENT_NODE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Command) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Statement) arguments.get(4),
					(Node) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.WHILE2BRANCH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILE2BRANCH___CHECK_DEC_FWD__ASSIGNMENT_WHILE_STATEMENT:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (Statement) arguments.get(2));
		case RulesPackage.WHILE2BRANCH___CHECK_DEC_BWD__BRANCH_COMMAND_NODE:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Node) arguments.get(2));
		case RulesPackage.WHILE2BRANCH___GENERATE_MODEL__RULEENTRYCONTAINER_S2N:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2N) arguments.get(1));
		case RulesPackage.WHILE2BRANCH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2N_STATEMENT_NODE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2N) arguments.get(1),
					(Statement) arguments.get(2), (Node) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILE2BRANCH___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_while2branch_0_1_initialbindings_blackBBBBB(while2branch _this, Match match,
			Assignment b, While a, Statement s) {
		if (!b.equals(s)) {
			if (!a.equals(s)) {
				return new Object[] { _this, match, b, a, s };
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_0_2_SolveCSP_bindingFBBBBB(while2branch _this, Match match,
			Assignment b, While a, Statement s) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, a, s);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, a, s };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_while2branch_0_2_SolveCSP_bindingAndBlackFBBBBB(while2branch _this,
			Match match, Assignment b, While a, Statement s) {
		Object[] result_pattern_while2branch_0_2_SolveCSP_binding = pattern_while2branch_0_2_SolveCSP_bindingFBBBBB(
				_this, match, b, a, s);
		if (result_pattern_while2branch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_while2branch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_while2branch_0_2_SolveCSP_black = pattern_while2branch_0_2_SolveCSP_blackB(csp);
			if (result_pattern_while2branch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, a, s };
			}
		}
		return null;
	}

	public static final boolean pattern_while2branch_0_3_CheckCSP_expressionFBB(while2branch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_while2branch_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Assignment b, While a, Statement s) {
		if (!b.equals(s)) {
			if (!a.equals(s)) {
				return new Object[] { match, b, a, s };
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Assignment b, While a, Statement s) {
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		String a__b____last_name_prime = "last";
		String s__a____next_name_prime = "next";
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		match.getToBeTranslatedEdges().add(s__a____next);
		a__b____last.setName(a__b____last_name_prime);
		s__a____next.setName(s__a____next_name_prime);
		return new Object[] { match, b, a, s, a__b____last, s__a____next };
	}

	public static final Object[] pattern_while2branch_0_5_collectcontextelements_blackBBBB(Match match, Assignment b,
			While a, Statement s) {
		if (!b.equals(s)) {
			if (!a.equals(s)) {
				return new Object[] { match, b, a, s };
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_0_5_collectcontextelements_greenBB(Match match, Statement s) {
		match.getContextNodes().add(s);
		return new Object[] { match, s };
	}

	public static final void pattern_while2branch_0_6_registerobjectstomatch_expressionBBBBB(while2branch _this,
			Match match, Assignment b, While a, Statement s) {
		_this.registerObjectsToMatch_FWD(match, b, a, s);

	}

	public static final boolean pattern_while2branch_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_while2branch_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_while2branch_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("b");
		EObject _localVariable_1 = isApplicableMatch.getObject("a");
		EObject _localVariable_2 = isApplicableMatch.getObject("s2n");
		EObject _localVariable_3 = isApplicableMatch.getObject("s");
		EObject _localVariable_4 = isApplicableMatch.getObject("n");
		EObject tmpB = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpS2n = _localVariable_2;
		EObject tmpS = _localVariable_3;
		EObject tmpN = _localVariable_4;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpS2n instanceof S2N) {
					S2N s2n = (S2N) tmpS2n;
					if (tmpS instanceof Statement) {
						Statement s = (Statement) tmpS;
						if (tmpN instanceof Node) {
							Node n = (Node) tmpN;
							return new Object[] { b, a, s2n, s, n, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_1_1_performtransformation_blackBBBBBFBB(Assignment b, While a,
			S2N s2n, Statement s, Node n, while2branch _this, IsApplicableMatch isApplicableMatch) {
		if (!b.equals(s)) {
			if (!a.equals(s)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { b, a, s2n, s, n, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			while2branch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_while2branch_1_1_performtransformation_binding = pattern_while2branch_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_while2branch_1_1_performtransformation_binding != null) {
			Assignment b = (Assignment) result_pattern_while2branch_1_1_performtransformation_binding[0];
			While a = (While) result_pattern_while2branch_1_1_performtransformation_binding[1];
			S2N s2n = (S2N) result_pattern_while2branch_1_1_performtransformation_binding[2];
			Statement s = (Statement) result_pattern_while2branch_1_1_performtransformation_binding[3];
			Node n = (Node) result_pattern_while2branch_1_1_performtransformation_binding[4];

			Object[] result_pattern_while2branch_1_1_performtransformation_black = pattern_while2branch_1_1_performtransformation_blackBBBBBFBB(
					b, a, s2n, s, n, _this, isApplicableMatch);
			if (result_pattern_while2branch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_while2branch_1_1_performtransformation_black[5];

				return new Object[] { b, a, s2n, s, n, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_1_1_performtransformation_greenFFFBFBB(Assignment b, While a,
			Node n) {
		Branch c = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command d = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		n.setNext(c);
		a2c.setTarget(c);
		a2c.setSource(a);
		d.setNext(c);
		b2d.setTarget(d);
		b2d.setSource(b);
		return new Object[] { c, a2c, d, b, b2d, a, n };
	}

	public static final Object[] pattern_while2branch_1_2_collecttranslatedelements_blackBBBBBB(Branch c, S2B a2c,
			Command d, Assignment b, S2N b2d, While a) {
		return new Object[] { c, a2c, d, b, b2d, a };
	}

	public static final Object[] pattern_while2branch_1_2_collecttranslatedelements_greenFBBBBBB(Branch c, S2B a2c,
			Command d, Assignment b, S2N b2d, While a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2c);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2d);
		ruleresult.getTranslatedElements().add(a);
		return new Object[] { ruleresult, c, a2c, d, b, b2d, a };
	}

	public static final Object[] pattern_while2branch_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject a2c, EObject d, EObject b, EObject b2d, EObject a,
			EObject s2n, EObject s, EObject n) {
		if (!c.equals(d)) {
			if (!c.equals(s2n)) {
				if (!c.equals(s)) {
					if (!c.equals(n)) {
						if (!a2c.equals(c)) {
							if (!a2c.equals(d)) {
								if (!a2c.equals(b)) {
									if (!a2c.equals(b2d)) {
										if (!a2c.equals(s2n)) {
											if (!a2c.equals(s)) {
												if (!a2c.equals(n)) {
													if (!d.equals(s2n)) {
														if (!d.equals(s)) {
															if (!d.equals(n)) {
																if (!b.equals(c)) {
																	if (!b.equals(d)) {
																		if (!b.equals(b2d)) {
																			if (!b.equals(s2n)) {
																				if (!b.equals(s)) {
																					if (!b.equals(n)) {
																						if (!b2d.equals(c)) {
																							if (!b2d.equals(d)) {
																								if (!b2d.equals(s2n)) {
																									if (!b2d.equals(
																											s)) {
																										if (!b2d.equals(
																												n)) {
																											if (!a.equals(
																													c)) {
																												if (!a.equals(
																														a2c)) {
																													if (!a.equals(
																															d)) {
																														if (!a.equals(
																																b)) {
																															if (!a.equals(
																																	b2d)) {
																																if (!a.equals(
																																		s2n)) {
																																	if (!a.equals(
																																			s)) {
																																		if (!a.equals(
																																				n)) {
																																			if (!s.equals(
																																					s2n)) {
																																				if (!n.equals(
																																						s2n)) {
																																					if (!n.equals(
																																							s)) {
																																						return new Object[] {
																																								ruleresult,
																																								c,
																																								a2c,
																																								d,
																																								b,
																																								b2d,
																																								a,
																																								s2n,
																																								s,
																																								n };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_while2branch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject c, EObject a2c, EObject d, EObject b, EObject b2d, EObject a,
			EObject s, EObject n) {
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2d__d____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2d__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "while2branch";
		String a2c__c____target_name_prime = "target";
		String d__c____next_name_prime = "next";
		String b2d__d____target_name_prime = "target";
		String a2c__a____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String b2d__b____source_name_prime = "source";
		String s__a____next_name_prime = "next";
		String n__c____next_name_prime = "next";
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		ruleresult.getCreatedEdges().add(a2c__c____target);
		d__c____next.setSrc(d);
		d__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(d__c____next);
		b2d__d____target.setSrc(b2d);
		b2d__d____target.setTrg(d);
		ruleresult.getCreatedEdges().add(b2d__d____target);
		a2c__a____source.setSrc(a2c);
		a2c__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2c__a____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		b2d__b____source.setSrc(b2d);
		b2d__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2d__b____source);
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		ruleresult.getTranslatedEdges().add(s__a____next);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(n__c____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		d__c____next.setName(d__c____next_name_prime);
		b2d__d____target.setName(b2d__d____target_name_prime);
		a2c__a____source.setName(a2c__a____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		b2d__b____source.setName(b2d__b____source_name_prime);
		s__a____next.setName(s__a____next_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { ruleresult, c, a2c, d, b, b2d, a, s, n, a2c__c____target, d__c____next, b2d__d____target,
				a2c__a____source, a__b____last, b2d__b____source, s__a____next, n__c____next };
	}

	public static final void pattern_while2branch_1_5_registerobjects_expressionBBBBBBBBBBB(while2branch _this,
			PerformRuleResult ruleresult, EObject c, EObject a2c, EObject d, EObject b, EObject b2d, EObject a,
			EObject s2n, EObject s, EObject n) {
		_this.registerObjects_FWD(ruleresult, c, a2c, d, b, b2d, a, s2n, s, n);

	}

	public static final PerformRuleResult pattern_while2branch_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_while2branch_2_1_preparereturnvalue_bindingFB(while2branch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_2_1_preparereturnvalue_blackFBB(EClass eClass,
			while2branch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_while2branch_2_1_preparereturnvalue_bindingAndBlackFFB(while2branch _this) {
		Object[] result_pattern_while2branch_2_1_preparereturnvalue_binding = pattern_while2branch_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_while2branch_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_while2branch_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_while2branch_2_1_preparereturnvalue_black = pattern_while2branch_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_while2branch_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_while2branch_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "while2branch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_while2branch_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("s");
		EObject tmpB = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpS = _localVariable_2;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpS instanceof Statement) {
					Statement s = (Statement) tmpS;
					return new Object[] { b, a, s, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_while2branch_2_2_corematch_blackBBFBFB(Assignment b, While a,
			Statement s, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(s)) {
			if (!a.equals(s)) {
				for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s, S2N.class,
						"source")) {
					Node n = s2n.getTarget();
					if (n != null) {
						_result.add(new Object[] { b, a, s2n, s, n, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_while2branch_2_3_findcontext_blackBBBBB(Assignment b, While a,
			S2N s2n, Statement s, Node n) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(s)) {
			if (!a.equals(s)) {
				if (b.equals(a.getLast())) {
					if (s.equals(s2n.getSource())) {
						if (a.equals(s.getNext())) {
							if (n.equals(s2n.getTarget())) {
								_result.add(new Object[] { b, a, s2n, s, n });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_while2branch_2_3_findcontext_greenBBBBBFFFFF(Assignment b, While a, S2N s2n,
			Statement s, Node n) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String a__b____last_name_prime = "last";
		String s2n__s____source_name_prime = "source";
		String s__a____next_name_prime = "next";
		String s2n__n____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(s2n);
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(n);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		s2n__s____source.setSrc(s2n);
		s2n__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2n__s____source);
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		isApplicableMatch.getAllContextElements().add(s__a____next);
		s2n__n____target.setSrc(s2n);
		s2n__n____target.setTrg(n);
		isApplicableMatch.getAllContextElements().add(s2n__n____target);
		a__b____last.setName(a__b____last_name_prime);
		s2n__s____source.setName(s2n__s____source_name_prime);
		s__a____next.setName(s__a____next_name_prime);
		s2n__n____target.setName(s2n__n____target_name_prime);
		return new Object[] { b, a, s2n, s, n, isApplicableMatch, a__b____last, s2n__s____source, s__a____next,
				s2n__n____target };
	}

	public static final Object[] pattern_while2branch_2_4_solveCSP_bindingFBBBBBBB(while2branch _this,
			IsApplicableMatch isApplicableMatch, Assignment b, While a, S2N s2n, Statement s, Node n) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, b, a, s2n, s, n);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, b, a, s2n, s, n };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_while2branch_2_4_solveCSP_bindingAndBlackFBBBBBBB(while2branch _this,
			IsApplicableMatch isApplicableMatch, Assignment b, While a, S2N s2n, Statement s, Node n) {
		Object[] result_pattern_while2branch_2_4_solveCSP_binding = pattern_while2branch_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, b, a, s2n, s, n);
		if (result_pattern_while2branch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_while2branch_2_4_solveCSP_binding[0];

			Object[] result_pattern_while2branch_2_4_solveCSP_black = pattern_while2branch_2_4_solveCSP_blackB(csp);
			if (result_pattern_while2branch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, b, a, s2n, s, n };
			}
		}
		return null;
	}

	public static final boolean pattern_while2branch_2_5_checkCSP_expressionFBB(while2branch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_while2branch_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_while2branch_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "while2branch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_while2branch_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_while2branch_10_1_initialbindings_blackBBBBB(while2branch _this, Match match,
			Branch c, Command d, Node n) {
		if (!c.equals(n)) {
			if (!d.equals(n)) {
				return new Object[] { _this, match, c, d, n };
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_10_2_SolveCSP_bindingFBBBBB(while2branch _this, Match match,
			Branch c, Command d, Node n) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, c, d, n);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, d, n };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_while2branch_10_2_SolveCSP_bindingAndBlackFBBBBB(while2branch _this,
			Match match, Branch c, Command d, Node n) {
		Object[] result_pattern_while2branch_10_2_SolveCSP_binding = pattern_while2branch_10_2_SolveCSP_bindingFBBBBB(
				_this, match, c, d, n);
		if (result_pattern_while2branch_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_while2branch_10_2_SolveCSP_binding[0];

			Object[] result_pattern_while2branch_10_2_SolveCSP_black = pattern_while2branch_10_2_SolveCSP_blackB(csp);
			if (result_pattern_while2branch_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, d, n };
			}
		}
		return null;
	}

	public static final boolean pattern_while2branch_10_3_CheckCSP_expressionFBB(while2branch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_while2branch_10_4_collectelementstobetranslated_blackBBBB(Match match,
			Branch c, Command d, Node n) {
		if (!c.equals(n)) {
			if (!d.equals(n)) {
				return new Object[] { match, c, d, n };
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_10_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Branch c, Command d, Node n) {
		EMoflonEdge d__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(d);
		String d__c____next_name_prime = "next";
		String n__c____next_name_prime = "next";
		d__c____next.setSrc(d);
		d__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(d__c____next);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(n__c____next);
		d__c____next.setName(d__c____next_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { match, c, d, n, d__c____next, n__c____next };
	}

	public static final Object[] pattern_while2branch_10_5_collectcontextelements_blackBBBB(Match match, Branch c,
			Command d, Node n) {
		if (!c.equals(n)) {
			if (!d.equals(n)) {
				return new Object[] { match, c, d, n };
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_10_5_collectcontextelements_greenBB(Match match, Node n) {
		match.getContextNodes().add(n);
		return new Object[] { match, n };
	}

	public static final void pattern_while2branch_10_6_registerobjectstomatch_expressionBBBBB(while2branch _this,
			Match match, Branch c, Command d, Node n) {
		_this.registerObjectsToMatch_BWD(match, c, d, n);

	}

	public static final boolean pattern_while2branch_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_while2branch_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_while2branch_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("d");
		EObject _localVariable_2 = isApplicableMatch.getObject("s2n");
		EObject _localVariable_3 = isApplicableMatch.getObject("s");
		EObject _localVariable_4 = isApplicableMatch.getObject("n");
		EObject tmpC = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpS2n = _localVariable_2;
		EObject tmpS = _localVariable_3;
		EObject tmpN = _localVariable_4;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpD instanceof Command) {
				Command d = (Command) tmpD;
				if (tmpS2n instanceof S2N) {
					S2N s2n = (S2N) tmpS2n;
					if (tmpS instanceof Statement) {
						Statement s = (Statement) tmpS;
						if (tmpN instanceof Node) {
							Node n = (Node) tmpN;
							return new Object[] { c, d, s2n, s, n, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_11_1_performtransformation_blackBBBBBFBB(Branch c, Command d,
			S2N s2n, Statement s, Node n, while2branch _this, IsApplicableMatch isApplicableMatch) {
		if (!c.equals(n)) {
			if (!d.equals(n)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { c, d, s2n, s, n, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			while2branch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_while2branch_11_1_performtransformation_binding = pattern_while2branch_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_while2branch_11_1_performtransformation_binding != null) {
			Branch c = (Branch) result_pattern_while2branch_11_1_performtransformation_binding[0];
			Command d = (Command) result_pattern_while2branch_11_1_performtransformation_binding[1];
			S2N s2n = (S2N) result_pattern_while2branch_11_1_performtransformation_binding[2];
			Statement s = (Statement) result_pattern_while2branch_11_1_performtransformation_binding[3];
			Node n = (Node) result_pattern_while2branch_11_1_performtransformation_binding[4];

			Object[] result_pattern_while2branch_11_1_performtransformation_black = pattern_while2branch_11_1_performtransformation_blackBBBBBFBB(
					c, d, s2n, s, n, _this, isApplicableMatch);
			if (result_pattern_while2branch_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_while2branch_11_1_performtransformation_black[5];

				return new Object[] { c, d, s2n, s, n, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_11_1_performtransformation_greenBFBFFFB(Branch c, Command d,
			Statement s) {
		S2B a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		a2c.setTarget(c);
		b2d.setTarget(d);
		b2d.setSource(b);
		a2c.setSource(a);
		a.setLast(b);
		s.setNext(a);
		return new Object[] { c, a2c, d, b, b2d, a, s };
	}

	public static final Object[] pattern_while2branch_11_2_collecttranslatedelements_blackBBBBBB(Branch c, S2B a2c,
			Command d, Assignment b, S2N b2d, While a) {
		return new Object[] { c, a2c, d, b, b2d, a };
	}

	public static final Object[] pattern_while2branch_11_2_collecttranslatedelements_greenFBBBBBB(Branch c, S2B a2c,
			Command d, Assignment b, S2N b2d, While a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2c);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2d);
		ruleresult.getCreatedElements().add(a);
		return new Object[] { ruleresult, c, a2c, d, b, b2d, a };
	}

	public static final Object[] pattern_while2branch_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject a2c, EObject d, EObject b, EObject b2d, EObject a,
			EObject s2n, EObject s, EObject n) {
		if (!c.equals(d)) {
			if (!c.equals(s2n)) {
				if (!c.equals(s)) {
					if (!c.equals(n)) {
						if (!a2c.equals(c)) {
							if (!a2c.equals(d)) {
								if (!a2c.equals(b)) {
									if (!a2c.equals(b2d)) {
										if (!a2c.equals(s2n)) {
											if (!a2c.equals(s)) {
												if (!a2c.equals(n)) {
													if (!d.equals(s2n)) {
														if (!d.equals(s)) {
															if (!d.equals(n)) {
																if (!b.equals(c)) {
																	if (!b.equals(d)) {
																		if (!b.equals(b2d)) {
																			if (!b.equals(s2n)) {
																				if (!b.equals(s)) {
																					if (!b.equals(n)) {
																						if (!b2d.equals(c)) {
																							if (!b2d.equals(d)) {
																								if (!b2d.equals(s2n)) {
																									if (!b2d.equals(
																											s)) {
																										if (!b2d.equals(
																												n)) {
																											if (!a.equals(
																													c)) {
																												if (!a.equals(
																														a2c)) {
																													if (!a.equals(
																															d)) {
																														if (!a.equals(
																																b)) {
																															if (!a.equals(
																																	b2d)) {
																																if (!a.equals(
																																		s2n)) {
																																	if (!a.equals(
																																			s)) {
																																		if (!a.equals(
																																				n)) {
																																			if (!s.equals(
																																					s2n)) {
																																				if (!n.equals(
																																						s2n)) {
																																					if (!n.equals(
																																							s)) {
																																						return new Object[] {
																																								ruleresult,
																																								c,
																																								a2c,
																																								d,
																																								b,
																																								b2d,
																																								a,
																																								s2n,
																																								s,
																																								n };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_while2branch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject c, EObject a2c, EObject d, EObject b, EObject b2d, EObject a,
			EObject s, EObject n) {
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2d__d____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2d__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "while2branch";
		String a2c__c____target_name_prime = "target";
		String d__c____next_name_prime = "next";
		String b2d__d____target_name_prime = "target";
		String a2c__a____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String b2d__b____source_name_prime = "source";
		String s__a____next_name_prime = "next";
		String n__c____next_name_prime = "next";
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		ruleresult.getCreatedEdges().add(a2c__c____target);
		d__c____next.setSrc(d);
		d__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(d__c____next);
		b2d__d____target.setSrc(b2d);
		b2d__d____target.setTrg(d);
		ruleresult.getCreatedEdges().add(b2d__d____target);
		a2c__a____source.setSrc(a2c);
		a2c__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2c__a____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		b2d__b____source.setSrc(b2d);
		b2d__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2d__b____source);
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		ruleresult.getCreatedEdges().add(s__a____next);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(n__c____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		d__c____next.setName(d__c____next_name_prime);
		b2d__d____target.setName(b2d__d____target_name_prime);
		a2c__a____source.setName(a2c__a____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		b2d__b____source.setName(b2d__b____source_name_prime);
		s__a____next.setName(s__a____next_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { ruleresult, c, a2c, d, b, b2d, a, s, n, a2c__c____target, d__c____next, b2d__d____target,
				a2c__a____source, a__b____last, b2d__b____source, s__a____next, n__c____next };
	}

	public static final void pattern_while2branch_11_5_registerobjects_expressionBBBBBBBBBBB(while2branch _this,
			PerformRuleResult ruleresult, EObject c, EObject a2c, EObject d, EObject b, EObject b2d, EObject a,
			EObject s2n, EObject s, EObject n) {
		_this.registerObjects_BWD(ruleresult, c, a2c, d, b, b2d, a, s2n, s, n);

	}

	public static final PerformRuleResult pattern_while2branch_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_while2branch_12_1_preparereturnvalue_bindingFB(while2branch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_12_1_preparereturnvalue_blackFBB(EClass eClass,
			while2branch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_while2branch_12_1_preparereturnvalue_bindingAndBlackFFB(while2branch _this) {
		Object[] result_pattern_while2branch_12_1_preparereturnvalue_binding = pattern_while2branch_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_while2branch_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_while2branch_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_while2branch_12_1_preparereturnvalue_black = pattern_while2branch_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_while2branch_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_while2branch_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "while2branch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_while2branch_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("d");
		EObject _localVariable_2 = match.getObject("n");
		EObject tmpC = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpN = _localVariable_2;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpD instanceof Command) {
				Command d = (Command) tmpD;
				if (tmpN instanceof Node) {
					Node n = (Node) tmpN;
					return new Object[] { c, d, n, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_while2branch_12_2_corematch_blackBBFFBB(Branch c, Command d, Node n,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(n)) {
			if (!d.equals(n)) {
				for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n, S2N.class,
						"target")) {
					Statement s = s2n.getSource();
					if (s != null) {
						_result.add(new Object[] { c, d, s2n, s, n, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_while2branch_12_3_findcontext_blackBBBBB(Branch c, Command d,
			S2N s2n, Statement s, Node n) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(n)) {
			if (!d.equals(n)) {
				if (c.equals(d.getNext())) {
					if (s.equals(s2n.getSource())) {
						if (c.equals(n.getNext())) {
							if (n.equals(s2n.getTarget())) {
								_result.add(new Object[] { c, d, s2n, s, n });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_while2branch_12_3_findcontext_greenBBBBBFFFFF(Branch c, Command d, S2N s2n,
			Statement s, Node n) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d__c____next_name_prime = "next";
		String s2n__s____source_name_prime = "source";
		String n__c____next_name_prime = "next";
		String s2n__n____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(s2n);
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(n);
		d__c____next.setSrc(d);
		d__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d__c____next);
		s2n__s____source.setSrc(s2n);
		s2n__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2n__s____source);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(n__c____next);
		s2n__n____target.setSrc(s2n);
		s2n__n____target.setTrg(n);
		isApplicableMatch.getAllContextElements().add(s2n__n____target);
		d__c____next.setName(d__c____next_name_prime);
		s2n__s____source.setName(s2n__s____source_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		s2n__n____target.setName(s2n__n____target_name_prime);
		return new Object[] { c, d, s2n, s, n, isApplicableMatch, d__c____next, s2n__s____source, n__c____next,
				s2n__n____target };
	}

	public static final Object[] pattern_while2branch_12_4_solveCSP_bindingFBBBBBBB(while2branch _this,
			IsApplicableMatch isApplicableMatch, Branch c, Command d, S2N s2n, Statement s, Node n) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, c, d, s2n, s, n);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d, s2n, s, n };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_while2branch_12_4_solveCSP_bindingAndBlackFBBBBBBB(while2branch _this,
			IsApplicableMatch isApplicableMatch, Branch c, Command d, S2N s2n, Statement s, Node n) {
		Object[] result_pattern_while2branch_12_4_solveCSP_binding = pattern_while2branch_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, c, d, s2n, s, n);
		if (result_pattern_while2branch_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_while2branch_12_4_solveCSP_binding[0];

			Object[] result_pattern_while2branch_12_4_solveCSP_black = pattern_while2branch_12_4_solveCSP_blackB(csp);
			if (result_pattern_while2branch_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d, s2n, s, n };
			}
		}
		return null;
	}

	public static final boolean pattern_while2branch_12_5_checkCSP_expressionFBB(while2branch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_while2branch_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_while2branch_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "while2branch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_while2branch_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_while2branch_20_1_preparereturnvalue_bindingFB(while2branch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			while2branch _this) {
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

	public static final Object[] pattern_while2branch_20_1_preparereturnvalue_bindingAndBlackFFBF(while2branch _this) {
		Object[] result_pattern_while2branch_20_1_preparereturnvalue_binding = pattern_while2branch_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_while2branch_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_while2branch_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_while2branch_20_1_preparereturnvalue_black = pattern_while2branch_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_while2branch_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_while2branch_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_while2branch_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_while2branch_20_2_testcorematchandDECs_black_nac_0B(Branch c) {
		for (Graph __DEC_c_root_845256 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Graph.class, "root")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_20_2_testcorematchandDECs_black_nac_1BB(Branch c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_positive_592791 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_c_positive_592791)) {
					if (!n.equals(__DEC_c_positive_592791)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_20_2_testcorematchandDECs_black_nac_2BB(Branch c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_negative_644606 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_c_negative_644606)) {
					if (!n.equals(__DEC_c_negative_644606)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_20_2_testcorematchandDECs_black_nac_3B(Command d) {
		for (Graph __DEC_d_root_410386 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Graph.class, "root")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_20_2_testcorematchandDECs_black_nac_4BBB(Command d, Branch c,
			Node n) {
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				for (Branch __DEC_d_positive_312548 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(d, Branch.class, "positive")) {
					if (!c.equals(__DEC_d_positive_312548)) {
						if (!n.equals(__DEC_d_positive_312548)) {
							return new Object[] { d, c, n };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_20_2_testcorematchandDECs_black_nac_5BBB(Command d, Branch c,
			Node n) {
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				for (Branch __DEC_d_negative_580631 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(d, Branch.class, "negative")) {
					if (!c.equals(__DEC_d_negative_580631)) {
						if (!n.equals(__DEC_d_negative_580631)) {
							return new Object[] { d, c, n };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_20_2_testcorematchandDECs_black_nac_6BB(Branch c, Command d) {
		if (d.equals(c.getPositive())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_20_2_testcorematchandDECs_black_nac_7BB(Branch c, Command d) {
		if (d.equals(c.getNegative())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_while2branch_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpD = _edge_next.getSrc();
		if (tmpD instanceof Command) {
			Command d = (Command) tmpD;
			EObject tmpC = _edge_next.getTrg();
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (c.equals(d.getNext())) {
					if (pattern_while2branch_20_2_testcorematchandDECs_black_nac_3B(d) == null) {
						if (pattern_while2branch_20_2_testcorematchandDECs_black_nac_0B(c) == null) {
							if (pattern_while2branch_20_2_testcorematchandDECs_black_nac_6BB(c, d) == null) {
								if (pattern_while2branch_20_2_testcorematchandDECs_black_nac_7BB(c, d) == null) {
									for (Node n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
											Node.class, "next")) {
										if (!c.equals(n)) {
											if (!d.equals(n)) {
												if (pattern_while2branch_20_2_testcorematchandDECs_black_nac_1BB(c,
														n) == null) {
													if (pattern_while2branch_20_2_testcorematchandDECs_black_nac_2BB(c,
															n) == null) {
														if (pattern_while2branch_20_2_testcorematchandDECs_black_nac_4BBB(
																d, c, n) == null) {
															if (pattern_while2branch_20_2_testcorematchandDECs_black_nac_5BBB(
																	d, c, n) == null) {
																_result.add(new Object[] { c, d, n, _edge_next });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_while2branch_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_while2branch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			while2branch _this, Match match, Branch c, Command d, Node n) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, c, d, n);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_while2branch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			while2branch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_while2branch_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_while2branch_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_while2branch_21_1_preparereturnvalue_bindingFB(while2branch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			while2branch _this) {
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

	public static final Object[] pattern_while2branch_21_1_preparereturnvalue_bindingAndBlackFFBF(while2branch _this) {
		Object[] result_pattern_while2branch_21_1_preparereturnvalue_binding = pattern_while2branch_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_while2branch_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_while2branch_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_while2branch_21_1_preparereturnvalue_black = pattern_while2branch_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_while2branch_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_while2branch_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_while2branch_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_while2branch_21_2_testcorematchandDECs_black_nac_0BB(Assignment b,
			Statement s) {
		if (!b.equals(s)) {
			for (Decision __DEC_b_positive_759026 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!s.equals(__DEC_b_positive_759026)) {
					return new Object[] { b, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_21_2_testcorematchandDECs_black_nac_1BB(Assignment b,
			Statement s) {
		if (!b.equals(s)) {
			for (Decision __DEC_b_negative_697545 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "negative")) {
				if (!s.equals(__DEC_b_negative_697545)) {
					return new Object[] { b, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_21_2_testcorematchandDECs_black_nac_2BBB(Assignment b, While a,
			Statement s) {
		if (!b.equals(s)) {
			if (!a.equals(s)) {
				for (While __DEC_b_first_300946 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
						While.class, "first")) {
					if (!a.equals(__DEC_b_first_300946)) {
						if (!s.equals(__DEC_b_first_300946)) {
							return new Object[] { b, a, s };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_21_2_testcorematchandDECs_black_nac_3BBB(Assignment b, While a,
			Statement s) {
		if (!b.equals(s)) {
			if (!a.equals(s)) {
				for (While __DEC_b_last_948004 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
						While.class, "last")) {
					if (!a.equals(__DEC_b_last_948004)) {
						if (!s.equals(__DEC_b_last_948004)) {
							return new Object[] { b, a, s };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_21_2_testcorematchandDECs_black_nac_4B(Assignment b) {
		for (Program __DEC_b_first_245977 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_21_2_testcorematchandDECs_black_nac_5BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_positive_424259 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "positive")) {
				if (!s.equals(__DEC_a_positive_424259)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_21_2_testcorematchandDECs_black_nac_6BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_negative_831390 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!s.equals(__DEC_a_negative_831390)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_21_2_testcorematchandDECs_black_nac_7BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_first_761023 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_761023)) {
					if (!s.equals(__DEC_a_first_761023)) {
						return new Object[] { a, s };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_21_2_testcorematchandDECs_black_nac_8BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_last_532177 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_532177)) {
					if (!s.equals(__DEC_a_last_532177)) {
						return new Object[] { a, s };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_21_2_testcorematchandDECs_black_nac_9B(While a) {
		for (Program __DEC_a_first_908401 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_21_2_testcorematchandDECs_black_nac_10BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_while2branch_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpA = _edge_last.getSrc();
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			EObject tmpB = _edge_last.getTrg();
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (b.equals(a.getLast())) {
					if (pattern_while2branch_21_2_testcorematchandDECs_black_nac_9B(a) == null) {
						if (pattern_while2branch_21_2_testcorematchandDECs_black_nac_4B(b) == null) {
							if (pattern_while2branch_21_2_testcorematchandDECs_black_nac_10BB(a, b) == null) {
								for (Statement s : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
										Statement.class, "next")) {
									if (!b.equals(s)) {
										if (!a.equals(s)) {
											if (pattern_while2branch_21_2_testcorematchandDECs_black_nac_0BB(b,
													s) == null) {
												if (pattern_while2branch_21_2_testcorematchandDECs_black_nac_1BB(b,
														s) == null) {
													if (pattern_while2branch_21_2_testcorematchandDECs_black_nac_2BBB(b,
															a, s) == null) {
														if (pattern_while2branch_21_2_testcorematchandDECs_black_nac_3BBB(
																b, a, s) == null) {
															if (pattern_while2branch_21_2_testcorematchandDECs_black_nac_5BB(
																	a, s) == null) {
																if (pattern_while2branch_21_2_testcorematchandDECs_black_nac_6BB(
																		a, s) == null) {
																	if (pattern_while2branch_21_2_testcorematchandDECs_black_nac_7BB(
																			a, s) == null) {
																		if (pattern_while2branch_21_2_testcorematchandDECs_black_nac_8BB(
																				a, s) == null) {
																			_result.add(new Object[] { b, a, s,
																					_edge_last });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_while2branch_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_while2branch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			while2branch _this, Match match, Assignment b, While a, Statement s) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, a, s);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_while2branch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			while2branch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_while2branch_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_while2branch_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_while2branch_24_1_prepare_blackB(while2branch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_while2branch_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_while2branch_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("c");
		EObject _localVariable_1 = targetMatch.getObject("d");
		EObject _localVariable_2 = sourceMatch.getObject("b");
		EObject _localVariable_3 = sourceMatch.getObject("a");
		EObject _localVariable_4 = sourceMatch.getObject("s");
		EObject _localVariable_5 = targetMatch.getObject("n");
		EObject tmpC = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpS = _localVariable_4;
		EObject tmpN = _localVariable_5;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpD instanceof Command) {
				Command d = (Command) tmpD;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpS instanceof Statement) {
							Statement s = (Statement) tmpS;
							if (tmpN instanceof Node) {
								Node n = (Node) tmpN;
								return new Object[] { c, d, b, a, s, n, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_24_2_matchsrctrgcontext_blackBBBBBBBB(Branch c, Command d,
			Assignment b, While a, Statement s, Node n, Match sourceMatch, Match targetMatch) {
		if (!c.equals(n)) {
			if (!d.equals(n)) {
				if (!b.equals(s)) {
					if (!a.equals(s)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { c, d, b, a, s, n, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_while2branch_24_2_matchsrctrgcontext_binding = pattern_while2branch_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_while2branch_24_2_matchsrctrgcontext_binding != null) {
			Branch c = (Branch) result_pattern_while2branch_24_2_matchsrctrgcontext_binding[0];
			Command d = (Command) result_pattern_while2branch_24_2_matchsrctrgcontext_binding[1];
			Assignment b = (Assignment) result_pattern_while2branch_24_2_matchsrctrgcontext_binding[2];
			While a = (While) result_pattern_while2branch_24_2_matchsrctrgcontext_binding[3];
			Statement s = (Statement) result_pattern_while2branch_24_2_matchsrctrgcontext_binding[4];
			Node n = (Node) result_pattern_while2branch_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_while2branch_24_2_matchsrctrgcontext_black = pattern_while2branch_24_2_matchsrctrgcontext_blackBBBBBBBB(
					c, d, b, a, s, n, sourceMatch, targetMatch);
			if (result_pattern_while2branch_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { c, d, b, a, s, n, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_24_3_solvecsp_bindingFBBBBBBBBB(while2branch _this, Branch c,
			Command d, Assignment b, While a, Statement s, Node n, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(c, d, b, a, s, n, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, c, d, b, a, s, n, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_while2branch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(while2branch _this,
			Branch c, Command d, Assignment b, While a, Statement s, Node n, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_while2branch_24_3_solvecsp_binding = pattern_while2branch_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, c, d, b, a, s, n, sourceMatch, targetMatch);
		if (result_pattern_while2branch_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_while2branch_24_3_solvecsp_binding[0];

			Object[] result_pattern_while2branch_24_3_solvecsp_black = pattern_while2branch_24_3_solvecsp_blackB(csp);
			if (result_pattern_while2branch_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, c, d, b, a, s, n, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_while2branch_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_while2branch_24_5_matchcorrcontext_blackFBBBB(Statement s, Node n,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s, S2N.class, "source")) {
				if (n.equals(s2n.getTarget())) {
					_result.add(new Object[] { s2n, s, n, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_while2branch_24_5_matchcorrcontext_greenBBBF(S2N s2n, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "while2branch";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(s2n);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { s2n, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_while2branch_24_6_createcorrespondence_blackBBBBBBB(Branch c, Command d,
			Assignment b, While a, Statement s, Node n, CCMatch ccMatch) {
		if (!c.equals(n)) {
			if (!d.equals(n)) {
				if (!b.equals(s)) {
					if (!a.equals(s)) {
						return new Object[] { c, d, b, a, s, n, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_24_6_createcorrespondence_greenBFBBFBB(Branch c, Command d,
			Assignment b, While a, CCMatch ccMatch) {
		S2B a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2c.setTarget(c);
		a2c.setSource(a);
		ccMatch.getCreateCorr().add(a2c);
		b2d.setTarget(d);
		b2d.setSource(b);
		ccMatch.getCreateCorr().add(b2d);
		return new Object[] { c, a2c, d, b, b2d, a, ccMatch };
	}

	public static final Object[] pattern_while2branch_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_while2branch_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "while2branch";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_while2branch_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_while2branch_27_1_matchtggpattern_black_nac_0BB(Assignment b, Statement s) {
		if (!b.equals(s)) {
			for (Decision __DEC_b_positive_733640 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!s.equals(__DEC_b_positive_733640)) {
					return new Object[] { b, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_27_1_matchtggpattern_black_nac_1BB(Assignment b, Statement s) {
		if (!b.equals(s)) {
			for (Decision __DEC_b_negative_821056 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "negative")) {
				if (!s.equals(__DEC_b_negative_821056)) {
					return new Object[] { b, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_27_1_matchtggpattern_black_nac_2BBB(Assignment b, While a,
			Statement s) {
		if (!b.equals(s)) {
			if (!a.equals(s)) {
				for (While __DEC_b_first_773088 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
						While.class, "first")) {
					if (!a.equals(__DEC_b_first_773088)) {
						if (!s.equals(__DEC_b_first_773088)) {
							return new Object[] { b, a, s };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_27_1_matchtggpattern_black_nac_3BBB(Assignment b, While a,
			Statement s) {
		if (!b.equals(s)) {
			if (!a.equals(s)) {
				for (While __DEC_b_last_624035 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
						While.class, "last")) {
					if (!a.equals(__DEC_b_last_624035)) {
						if (!s.equals(__DEC_b_last_624035)) {
							return new Object[] { b, a, s };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_27_1_matchtggpattern_black_nac_4B(Assignment b) {
		for (Program __DEC_b_first_514051 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_27_1_matchtggpattern_black_nac_5BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_positive_124587 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "positive")) {
				if (!s.equals(__DEC_a_positive_124587)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_27_1_matchtggpattern_black_nac_6BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_negative_237684 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!s.equals(__DEC_a_negative_237684)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_27_1_matchtggpattern_black_nac_7BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_first_172911 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_172911)) {
					if (!s.equals(__DEC_a_first_172911)) {
						return new Object[] { a, s };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_27_1_matchtggpattern_black_nac_8BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_last_528516 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_528516)) {
					if (!s.equals(__DEC_a_last_528516)) {
						return new Object[] { a, s };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_27_1_matchtggpattern_black_nac_9B(While a) {
		for (Program __DEC_a_first_979773 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_27_1_matchtggpattern_black_nac_10BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_27_1_matchtggpattern_blackBBB(Assignment b, While a,
			Statement s) {
		if (!b.equals(s)) {
			if (!a.equals(s)) {
				if (b.equals(a.getLast())) {
					if (a.equals(s.getNext())) {
						if (pattern_while2branch_27_1_matchtggpattern_black_nac_0BB(b, s) == null) {
							if (pattern_while2branch_27_1_matchtggpattern_black_nac_1BB(b, s) == null) {
								if (pattern_while2branch_27_1_matchtggpattern_black_nac_2BBB(b, a, s) == null) {
									if (pattern_while2branch_27_1_matchtggpattern_black_nac_3BBB(b, a, s) == null) {
										if (pattern_while2branch_27_1_matchtggpattern_black_nac_4B(b) == null) {
											if (pattern_while2branch_27_1_matchtggpattern_black_nac_5BB(a, s) == null) {
												if (pattern_while2branch_27_1_matchtggpattern_black_nac_6BB(a,
														s) == null) {
													if (pattern_while2branch_27_1_matchtggpattern_black_nac_7BB(a,
															s) == null) {
														if (pattern_while2branch_27_1_matchtggpattern_black_nac_8BB(a,
																s) == null) {
															if (pattern_while2branch_27_1_matchtggpattern_black_nac_9B(
																	a) == null) {
																if (pattern_while2branch_27_1_matchtggpattern_black_nac_10BB(
																		a, b) == null) {
																	return new Object[] { b, a, s };
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_while2branch_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_while2branch_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_while2branch_28_1_matchtggpattern_black_nac_0B(Branch c) {
		for (Graph __DEC_c_root_877454 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Graph.class, "root")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_28_1_matchtggpattern_black_nac_1BB(Branch c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_positive_396036 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_c_positive_396036)) {
					if (!n.equals(__DEC_c_positive_396036)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_28_1_matchtggpattern_black_nac_2BB(Branch c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_negative_414759 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_c_negative_414759)) {
					if (!n.equals(__DEC_c_negative_414759)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_28_1_matchtggpattern_black_nac_3B(Command d) {
		for (Graph __DEC_d_root_959283 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Graph.class, "root")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_28_1_matchtggpattern_black_nac_4BBB(Command d, Branch c, Node n) {
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				for (Branch __DEC_d_positive_33798 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(d, Branch.class, "positive")) {
					if (!c.equals(__DEC_d_positive_33798)) {
						if (!n.equals(__DEC_d_positive_33798)) {
							return new Object[] { d, c, n };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_28_1_matchtggpattern_black_nac_5BBB(Command d, Branch c, Node n) {
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				for (Branch __DEC_d_negative_172499 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(d, Branch.class, "negative")) {
					if (!c.equals(__DEC_d_negative_172499)) {
						if (!n.equals(__DEC_d_negative_172499)) {
							return new Object[] { d, c, n };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_while2branch_28_1_matchtggpattern_black_nac_6BB(Branch c, Command d) {
		if (d.equals(c.getPositive())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_28_1_matchtggpattern_black_nac_7BB(Branch c, Command d) {
		if (d.equals(c.getNegative())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_28_1_matchtggpattern_blackBBB(Branch c, Command d, Node n) {
		if (!c.equals(n)) {
			if (!d.equals(n)) {
				if (c.equals(d.getNext())) {
					if (c.equals(n.getNext())) {
						if (pattern_while2branch_28_1_matchtggpattern_black_nac_0B(c) == null) {
							if (pattern_while2branch_28_1_matchtggpattern_black_nac_1BB(c, n) == null) {
								if (pattern_while2branch_28_1_matchtggpattern_black_nac_2BB(c, n) == null) {
									if (pattern_while2branch_28_1_matchtggpattern_black_nac_3B(d) == null) {
										if (pattern_while2branch_28_1_matchtggpattern_black_nac_4BBB(d, c, n) == null) {
											if (pattern_while2branch_28_1_matchtggpattern_black_nac_5BBB(d, c,
													n) == null) {
												if (pattern_while2branch_28_1_matchtggpattern_black_nac_6BB(c,
														d) == null) {
													if (pattern_while2branch_28_1_matchtggpattern_black_nac_7BB(c,
															d) == null) {
														return new Object[] { c, d, n };
													}
												}
											}
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

	public static final boolean pattern_while2branch_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_while2branch_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_while2branch_29_1_createresult_blackB(while2branch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_while2branch_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_while2branch_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2N s2n) {
		if (ruleResult.getCorrObjects().contains(s2n)) {
			return new Object[] { ruleResult, s2n };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Statement s) {
		if (ruleResult.getSourceObjects().contains(s)) {
			return new Object[] { ruleResult, s };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Node n) {
		if (ruleResult.getTargetObjects().contains(n)) {
			return new Object[] { ruleResult, n };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_while2branch_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_while2branch_29_2_isapplicablecore_black_nac_0BB(ruleResult, s2n) == null) {
								if (pattern_while2branch_29_2_isapplicablecore_black_nac_1BB(ruleResult, s) == null) {
									if (pattern_while2branch_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											n) == null) {
										_result.add(
												new Object[] { s2nList, s2n, s, n, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_while2branch_29_3_solveCSP_bindingFBBBBBB(while2branch _this,
			IsApplicableMatch isApplicableMatch, S2N s2n, Statement s, Node n, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, s2n, s, n, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s2n, s, n, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_while2branch_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_while2branch_29_3_solveCSP_bindingAndBlackFBBBBBB(while2branch _this,
			IsApplicableMatch isApplicableMatch, S2N s2n, Statement s, Node n, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_while2branch_29_3_solveCSP_binding = pattern_while2branch_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, s2n, s, n, ruleResult);
		if (result_pattern_while2branch_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_while2branch_29_3_solveCSP_binding[0];

			Object[] result_pattern_while2branch_29_3_solveCSP_black = pattern_while2branch_29_3_solveCSP_blackB(csp);
			if (result_pattern_while2branch_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s2n, s, n, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_while2branch_29_4_checkCSP_expressionFBB(while2branch _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_while2branch_29_5_checknacs_blackBBB(S2N s2n, Statement s, Node n) {
		return new Object[] { s2n, s, n };
	}

	public static final Object[] pattern_while2branch_29_6_perform_blackBBBB(S2N s2n, Statement s, Node n,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { s2n, s, n, ruleResult };
	}

	public static final Object[] pattern_while2branch_29_6_perform_greenFFFFFFBBB(Statement s, Node n,
			ModelgeneratorRuleResult ruleResult) {
		Branch c = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command d = ControlflowFactory.eINSTANCE.createCommand();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		n.setNext(c);
		ruleResult.getTargetObjects().add(c);
		a2c.setTarget(c);
		ruleResult.getCorrObjects().add(a2c);
		d.setNext(c);
		ruleResult.getTargetObjects().add(d);
		ruleResult.getSourceObjects().add(b);
		b2d.setTarget(d);
		b2d.setSource(b);
		ruleResult.getCorrObjects().add(b2d);
		a2c.setSource(a);
		a.setLast(b);
		s.setNext(a);
		ruleResult.getSourceObjects().add(a);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c, a2c, d, b, b2d, a, s, n, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_while2branch_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //while2branchImpl
