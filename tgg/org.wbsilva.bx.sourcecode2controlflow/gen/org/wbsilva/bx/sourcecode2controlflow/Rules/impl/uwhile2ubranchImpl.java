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
import org.wbsilva.bx.sourcecode2controlflow.Rules.uwhile2ubranch;

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
 * An implementation of the model object '<em><b>uwhile2ubranch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class uwhile2ubranchImpl extends AbstractRuleImpl implements uwhile2ubranch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected uwhile2ubranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getuwhile2ubranch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Statement s, While a, Assignment b) {

		Object[] result1_black = uwhile2ubranchImpl.pattern_uwhile2ubranch_0_1_initialbindings_blackBBBBB(this, match,
				s, a, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[s] = " + s + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, s, a, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[s] = " + s + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (uwhile2ubranchImpl.pattern_uwhile2ubranch_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = uwhile2ubranchImpl
					.pattern_uwhile2ubranch_0_4_collectelementstobetranslated_blackBBBB(match, s, a, b);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[s] = " + s + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
			}
			uwhile2ubranchImpl.pattern_uwhile2ubranch_0_4_collectelementstobetranslated_greenBBBBFFF(match, s, a, b);
			//nothing EMoflonEdge s__a____next = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge a__b____first = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[6];

			Object[] result5_black = uwhile2ubranchImpl
					.pattern_uwhile2ubranch_0_5_collectcontextelements_blackBBBB(match, s, a, b);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[s] = " + s + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
			}
			uwhile2ubranchImpl.pattern_uwhile2ubranch_0_5_collectcontextelements_greenBB(match, s);

			// 
			uwhile2ubranchImpl.pattern_uwhile2ubranch_0_6_registerobjectstomatch_expressionBBBBB(this, match, s, a, b);
			return uwhile2ubranchImpl.pattern_uwhile2ubranch_0_7_expressionF();
		} else {
			return uwhile2ubranchImpl.pattern_uwhile2ubranch_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Node n = (Node) result1_bindingAndBlack[0];
		Statement s = (Statement) result1_bindingAndBlack[1];
		S2N s2n = (S2N) result1_bindingAndBlack[2];
		While a = (While) result1_bindingAndBlack[3];
		Assignment b = (Assignment) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = uwhile2ubranchImpl.pattern_uwhile2ubranch_1_1_performtransformation_greenBFFBFBF(n, a,
				b);
		S2B a2c = (S2B) result1_green[1];
		Command d = (Command) result1_green[2];
		Branch c = (Branch) result1_green[4];
		S2N b2d = (S2N) result1_green[6];

		Object[] result2_black = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_1_2_collecttranslatedelements_blackBBBBBB(a2c, d, a, c, b, b2d);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[a2c] = " + a2c + ", " + "[d] = " + d + ", "
							+ "[a] = " + a + ", " + "[c] = " + c + ", " + "[b] = " + b + ", " + "[b2d] = " + b2d + ".");
		}
		Object[] result2_green = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_1_2_collecttranslatedelements_greenFBBBBBB(a2c, d, a, c, b, b2d);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = uwhile2ubranchImpl.pattern_uwhile2ubranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, n, s, a2c, d, s2n, a, c, b, b2d);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[n] = " + n + ", " + "[s] = " + s + ", " + "[a2c] = " + a2c + ", " + "[d] = " + d + ", "
					+ "[s2n] = " + s2n + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[b] = " + b + ", "
					+ "[b2d] = " + b2d + ".");
		}
		uwhile2ubranchImpl.pattern_uwhile2ubranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(ruleresult, n, s,
				a2c, d, a, c, b, b2d);
		//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge a2c__a____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge c__d____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge d__c____next = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2d__b____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b2d__d____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[18];

		// 
		// 
		uwhile2ubranchImpl.pattern_uwhile2ubranch_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, n, s, a2c,
				d, s2n, a, c, b, b2d);
		return uwhile2ubranchImpl.pattern_uwhile2ubranch_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = uwhile2ubranchImpl.pattern_uwhile2ubranch_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Statement s = (Statement) result2_binding[0];
		While a = (While) result2_binding[1];
		Assignment b = (Assignment) result2_binding[2];
		for (Object[] result2_black : uwhile2ubranchImpl.pattern_uwhile2ubranch_2_2_corematch_blackFBFBBB(s, a, b,
				match)) {
			Node n = (Node) result2_black[0];
			S2N s2n = (S2N) result2_black[2];
			// ForEach 
			for (Object[] result3_black : uwhile2ubranchImpl.pattern_uwhile2ubranch_2_3_findcontext_blackBBBBB(n, s,
					s2n, a, b)) {
				Object[] result3_green = uwhile2ubranchImpl.pattern_uwhile2ubranch_2_3_findcontext_greenBBBBBFFFFFF(n,
						s, s2n, a, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = uwhile2ubranchImpl
						.pattern_uwhile2ubranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, n, s, s2n,
								a, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ", " + "[s] = " + s
							+ ", " + "[s2n] = " + s2n + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (uwhile2ubranchImpl.pattern_uwhile2ubranch_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = uwhile2ubranchImpl
							.pattern_uwhile2ubranch_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					uwhile2ubranchImpl.pattern_uwhile2ubranch_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return uwhile2ubranchImpl.pattern_uwhile2ubranch_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Statement s, While a, Assignment b) {
		match.registerObject("s", s);
		match.registerObject("a", a);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Statement s, While a, Assignment b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Node n, Statement s, S2N s2n, While a,
			Assignment b) {// Create CSP
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
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("b", b);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject n, EObject s, EObject a2c, EObject d,
			EObject s2n, EObject a, EObject c, EObject b, EObject b2d) {
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2d", b2d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Node n, Command d, Branch c) {

		Object[] result1_black = uwhile2ubranchImpl.pattern_uwhile2ubranch_10_1_initialbindings_blackBBBBB(this, match,
				n, d, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[n] = " + n + ", " + "[d] = " + d + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, n, d, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[n] = " + n + ", " + "[d] = " + d + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (uwhile2ubranchImpl.pattern_uwhile2ubranch_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = uwhile2ubranchImpl
					.pattern_uwhile2ubranch_10_4_collectelementstobetranslated_blackBBBB(match, n, d, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[n] = " + n + ", " + "[d] = " + d + ", " + "[c] = " + c + ".");
			}
			uwhile2ubranchImpl.pattern_uwhile2ubranch_10_4_collectelementstobetranslated_greenBBBBFFF(match, n, d, c);
			//nothing EMoflonEdge c__d____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge d__c____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge n__c____next = (EMoflonEdge) result4_green[6];

			Object[] result5_black = uwhile2ubranchImpl
					.pattern_uwhile2ubranch_10_5_collectcontextelements_blackBBBB(match, n, d, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[n] = " + n + ", " + "[d] = " + d + ", " + "[c] = " + c + ".");
			}
			uwhile2ubranchImpl.pattern_uwhile2ubranch_10_5_collectcontextelements_greenBB(match, n);

			// 
			uwhile2ubranchImpl.pattern_uwhile2ubranch_10_6_registerobjectstomatch_expressionBBBBB(this, match, n, d, c);
			return uwhile2ubranchImpl.pattern_uwhile2ubranch_10_7_expressionF();
		} else {
			return uwhile2ubranchImpl.pattern_uwhile2ubranch_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Node n = (Node) result1_bindingAndBlack[0];
		Statement s = (Statement) result1_bindingAndBlack[1];
		Command d = (Command) result1_bindingAndBlack[2];
		S2N s2n = (S2N) result1_bindingAndBlack[3];
		Branch c = (Branch) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = uwhile2ubranchImpl.pattern_uwhile2ubranch_11_1_performtransformation_greenBFBFBFF(s, d,
				c);
		S2B a2c = (S2B) result1_green[1];
		While a = (While) result1_green[3];
		Assignment b = (Assignment) result1_green[5];
		S2N b2d = (S2N) result1_green[6];

		Object[] result2_black = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_11_2_collecttranslatedelements_blackBBBBBB(a2c, d, a, c, b, b2d);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[a2c] = " + a2c + ", " + "[d] = " + d + ", "
							+ "[a] = " + a + ", " + "[c] = " + c + ", " + "[b] = " + b + ", " + "[b2d] = " + b2d + ".");
		}
		Object[] result2_green = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_11_2_collecttranslatedelements_greenFBBBBBB(a2c, d, a, c, b, b2d);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = uwhile2ubranchImpl.pattern_uwhile2ubranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, n, s, a2c, d, s2n, a, c, b, b2d);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[n] = " + n + ", " + "[s] = " + s + ", " + "[a2c] = " + a2c + ", " + "[d] = " + d + ", "
					+ "[s2n] = " + s2n + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[b] = " + b + ", "
					+ "[b2d] = " + b2d + ".");
		}
		uwhile2ubranchImpl.pattern_uwhile2ubranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(ruleresult, n, s,
				a2c, d, a, c, b, b2d);
		//nothing EMoflonEdge s__a____next = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge a2c__a____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge c__d____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2c__c____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge d__c____next = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2d__b____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b2d__d____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[18];

		// 
		// 
		uwhile2ubranchImpl.pattern_uwhile2ubranch_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, n, s,
				a2c, d, s2n, a, c, b, b2d);
		return uwhile2ubranchImpl.pattern_uwhile2ubranch_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = uwhile2ubranchImpl.pattern_uwhile2ubranch_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Node n = (Node) result2_binding[0];
		Command d = (Command) result2_binding[1];
		Branch c = (Branch) result2_binding[2];
		for (Object[] result2_black : uwhile2ubranchImpl.pattern_uwhile2ubranch_12_2_corematch_blackBFBFBB(n, d, c,
				match)) {
			Statement s = (Statement) result2_black[1];
			S2N s2n = (S2N) result2_black[3];
			// ForEach 
			for (Object[] result3_black : uwhile2ubranchImpl.pattern_uwhile2ubranch_12_3_findcontext_blackBBBBB(n, s, d,
					s2n, c)) {
				Object[] result3_green = uwhile2ubranchImpl.pattern_uwhile2ubranch_12_3_findcontext_greenBBBBBFFFFFF(n,
						s, d, s2n, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge s2n__n____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge c__d____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge s2n__s____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__c____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge n__c____next = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = uwhile2ubranchImpl
						.pattern_uwhile2ubranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, n, s, d,
								s2n, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ", " + "[s] = " + s
							+ ", " + "[d] = " + d + ", " + "[s2n] = " + s2n + ", " + "[c] = " + c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (uwhile2ubranchImpl.pattern_uwhile2ubranch_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = uwhile2ubranchImpl
							.pattern_uwhile2ubranch_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					uwhile2ubranchImpl.pattern_uwhile2ubranch_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return uwhile2ubranchImpl.pattern_uwhile2ubranch_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Node n, Command d, Branch c) {
		match.registerObject("n", n);
		match.registerObject("d", d);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Node n, Command d, Branch c) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Node n, Statement s, Command d, S2N s2n,
			Branch c) {// Create CSP
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
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject n, EObject s, EObject a2c, EObject d,
			EObject s2n, EObject a, EObject c, EObject b, EObject b2d) {
		ruleresult.registerObject("n", n);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("s2n", s2n);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2d", b2d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_110(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = uwhile2ubranchImpl.pattern_uwhile2ubranch_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : uwhile2ubranchImpl
				.pattern_uwhile2ubranch_20_2_testcorematchandDECs_blackFFFB(_edge_positive)) {
			Node n = (Node) result2_black[0];
			Command d = (Command) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Object[] result2_green = uwhile2ubranchImpl
					.pattern_uwhile2ubranch_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (uwhile2ubranchImpl
					.pattern_uwhile2ubranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							n, d, c)) {
				// 
				if (uwhile2ubranchImpl
						.pattern_uwhile2ubranch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = uwhile2ubranchImpl
							.pattern_uwhile2ubranch_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					uwhile2ubranchImpl.pattern_uwhile2ubranch_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return uwhile2ubranchImpl.pattern_uwhile2ubranch_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_110(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = uwhile2ubranchImpl.pattern_uwhile2ubranch_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : uwhile2ubranchImpl
				.pattern_uwhile2ubranch_21_2_testcorematchandDECs_blackFFFB(_edge_next)) {
			Statement s = (Statement) result2_black[0];
			While a = (While) result2_black[1];
			Assignment b = (Assignment) result2_black[2];
			Object[] result2_green = uwhile2ubranchImpl
					.pattern_uwhile2ubranch_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (uwhile2ubranchImpl
					.pattern_uwhile2ubranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							s, a, b)) {
				// 
				if (uwhile2ubranchImpl
						.pattern_uwhile2ubranch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = uwhile2ubranchImpl
							.pattern_uwhile2ubranch_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					uwhile2ubranchImpl.pattern_uwhile2ubranch_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return uwhile2ubranchImpl.pattern_uwhile2ubranch_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("uwhile2ubranch");
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
		ruleResult.setRule("uwhile2ubranch");
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

		Object[] result1_black = uwhile2ubranchImpl.pattern_uwhile2ubranch_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = uwhile2ubranchImpl.pattern_uwhile2ubranch_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Node n = (Node) result2_bindingAndBlack[0];
		Statement s = (Statement) result2_bindingAndBlack[1];
		Command d = (Command) result2_bindingAndBlack[2];
		While a = (While) result2_bindingAndBlack[3];
		Branch c = (Branch) result2_bindingAndBlack[4];
		Assignment b = (Assignment) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = uwhile2ubranchImpl
				.pattern_uwhile2ubranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, n, s, d, a, c, b, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[n] = " + n + ", " + "[s] = " + s + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[c] = "
					+ c + ", " + "[b] = " + b + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (uwhile2ubranchImpl.pattern_uwhile2ubranch_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : uwhile2ubranchImpl.pattern_uwhile2ubranch_24_5_matchcorrcontext_blackBBFBB(n,
					s, sourceMatch, targetMatch)) {
				S2N s2n = (S2N) result5_black[2];
				Object[] result5_green = uwhile2ubranchImpl.pattern_uwhile2ubranch_24_5_matchcorrcontext_greenBBBF(s2n,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = uwhile2ubranchImpl
						.pattern_uwhile2ubranch_24_6_createcorrespondence_blackBBBBBBB(n, s, d, a, c, b, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[n] = " + n + ", "
							+ "[s] = " + s + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[c] = " + c + ", "
							+ "[b] = " + b + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				uwhile2ubranchImpl.pattern_uwhile2ubranch_24_6_createcorrespondence_greenFBBBBFB(d, a, c, b, ccMatch);
				//nothing S2B a2c = (S2B) result6_green[0];
				//nothing S2N b2d = (S2N) result6_green[5];

				Object[] result7_black = uwhile2ubranchImpl
						.pattern_uwhile2ubranch_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				uwhile2ubranchImpl.pattern_uwhile2ubranch_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return uwhile2ubranchImpl.pattern_uwhile2ubranch_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Node n, Statement s, Command d, While a, Branch c, Assignment b,
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
	public boolean checkDEC_FWD(Statement s, While a, Assignment b) {// 
		Object[] result1_black = uwhile2ubranchImpl.pattern_uwhile2ubranch_27_1_matchtggpattern_blackBBB(s, a, b);
		if (result1_black != null) {
			return uwhile2ubranchImpl.pattern_uwhile2ubranch_27_2_expressionF();
		} else {
			return uwhile2ubranchImpl.pattern_uwhile2ubranch_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Node n, Command d, Branch c) {// 
		Object[] result1_black = uwhile2ubranchImpl.pattern_uwhile2ubranch_28_1_matchtggpattern_blackBBB(n, d, c);
		if (result1_black != null) {
			return uwhile2ubranchImpl.pattern_uwhile2ubranch_28_2_expressionF();
		} else {
			return uwhile2ubranchImpl.pattern_uwhile2ubranch_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2N s2nParameter) {

		Object[] result1_black = uwhile2ubranchImpl.pattern_uwhile2ubranch_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = uwhile2ubranchImpl.pattern_uwhile2ubranch_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : uwhile2ubranchImpl
				.pattern_uwhile2ubranch_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList s2nList = (RuleEntryList) result2_black[0];
			Node n = (Node) result2_black[1];
			S2N s2n = (S2N) result2_black[2];
			Statement s = (Statement) result2_black[3];

			Object[] result3_bindingAndBlack = uwhile2ubranchImpl
					.pattern_uwhile2ubranch_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, n, s, s2n,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[n] = " + n + ", " + "[s] = " + s
						+ ", " + "[s2n] = " + s2n + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (uwhile2ubranchImpl.pattern_uwhile2ubranch_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = uwhile2ubranchImpl.pattern_uwhile2ubranch_29_5_checknacs_blackBBB(n, s, s2n);
				if (result5_black != null) {

					Object[] result6_black = uwhile2ubranchImpl.pattern_uwhile2ubranch_29_6_perform_blackBBBB(n, s, s2n,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[n] = " + n + ", "
								+ "[s] = " + s + ", " + "[s2n] = " + s2n + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					uwhile2ubranchImpl.pattern_uwhile2ubranch_29_6_perform_greenBBFFFFFFB(n, s, ruleResult);
					//nothing S2B a2c = (S2B) result6_green[2];
					//nothing Command d = (Command) result6_green[3];
					//nothing While a = (While) result6_green[4];
					//nothing Branch c = (Branch) result6_green[5];
					//nothing Assignment b = (Assignment) result6_green[6];
					//nothing S2N b2d = (S2N) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return uwhile2ubranchImpl.pattern_uwhile2ubranch_29_7_expressionFB(ruleResult);
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
		case RulesPackage.UWHILE2UBRANCH___IS_APPROPRIATE_FWD__MATCH_STATEMENT_WHILE_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Statement) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.UWHILE2UBRANCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_STATEMENT_WHILE_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Statement) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3));
			return null;
		case RulesPackage.UWHILE2UBRANCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_STATEMENT_WHILE_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Statement) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3));
		case RulesPackage.UWHILE2UBRANCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_NODE_STATEMENT_S2N_WHILE_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Node) arguments.get(1),
					(Statement) arguments.get(2), (S2N) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5));
		case RulesPackage.UWHILE2UBRANCH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.UWHILE2UBRANCH___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___IS_APPROPRIATE_BWD__MATCH_NODE_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Node) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.UWHILE2UBRANCH___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NODE_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Node) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
			return null;
		case RulesPackage.UWHILE2UBRANCH___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NODE_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Node) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3));
		case RulesPackage.UWHILE2UBRANCH___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NODE_STATEMENT_COMMAND_S2N_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Node) arguments.get(1),
					(Statement) arguments.get(2), (Command) arguments.get(3), (S2N) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.UWHILE2UBRANCH___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.UWHILE2UBRANCH___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___IS_APPROPRIATE_BWD_EMOFLON_EDGE_110__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_110((EMoflonEdge) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_110__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_110((EMoflonEdge) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.UWHILE2UBRANCH___IS_APPLICABLE_SOLVE_CSP_CC__NODE_STATEMENT_COMMAND_WHILE_BRANCH_ASSIGNMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Node) arguments.get(0), (Statement) arguments.get(1),
					(Command) arguments.get(2), (While) arguments.get(3), (Branch) arguments.get(4),
					(Assignment) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.UWHILE2UBRANCH___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.UWHILE2UBRANCH___CHECK_DEC_FWD__STATEMENT_WHILE_ASSIGNMENT:
			return checkDEC_FWD((Statement) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2));
		case RulesPackage.UWHILE2UBRANCH___CHECK_DEC_BWD__NODE_COMMAND_BRANCH:
			return checkDEC_BWD((Node) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.UWHILE2UBRANCH___GENERATE_MODEL__RULEENTRYCONTAINER_S2N:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2N) arguments.get(1));
		case RulesPackage.UWHILE2UBRANCH___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NODE_STATEMENT_S2N_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Node) arguments.get(1),
					(Statement) arguments.get(2), (S2N) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.UWHILE2UBRANCH___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_uwhile2ubranch_0_1_initialbindings_blackBBBBB(uwhile2ubranch _this,
			Match match, Statement s, While a, Assignment b) {
		if (!a.equals(s)) {
			if (!b.equals(s)) {
				return new Object[] { _this, match, s, a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_0_2_SolveCSP_bindingFBBBBB(uwhile2ubranch _this, Match match,
			Statement s, While a, Assignment b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, s, a, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, s, a, b };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_uwhile2ubranch_0_2_SolveCSP_bindingAndBlackFBBBBB(uwhile2ubranch _this,
			Match match, Statement s, While a, Assignment b) {
		Object[] result_pattern_uwhile2ubranch_0_2_SolveCSP_binding = pattern_uwhile2ubranch_0_2_SolveCSP_bindingFBBBBB(
				_this, match, s, a, b);
		if (result_pattern_uwhile2ubranch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_uwhile2ubranch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_uwhile2ubranch_0_2_SolveCSP_black = pattern_uwhile2ubranch_0_2_SolveCSP_blackB(csp);
			if (result_pattern_uwhile2ubranch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, s, a, b };
			}
		}
		return null;
	}

	public static final boolean pattern_uwhile2ubranch_0_3_CheckCSP_expressionFBB(uwhile2ubranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Statement s, While a, Assignment b) {
		if (!a.equals(s)) {
			if (!b.equals(s)) {
				return new Object[] { match, s, a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_0_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			Statement s, While a, Assignment b) {
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		String s__a____next_name_prime = "next";
		String a__b____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		match.getToBeTranslatedEdges().add(s__a____next);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		s__a____next.setName(s__a____next_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { match, s, a, b, s__a____next, a__b____first, a__b____last };
	}

	public static final Object[] pattern_uwhile2ubranch_0_5_collectcontextelements_blackBBBB(Match match, Statement s,
			While a, Assignment b) {
		if (!a.equals(s)) {
			if (!b.equals(s)) {
				return new Object[] { match, s, a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_0_5_collectcontextelements_greenBB(Match match, Statement s) {
		match.getContextNodes().add(s);
		return new Object[] { match, s };
	}

	public static final void pattern_uwhile2ubranch_0_6_registerobjectstomatch_expressionBBBBB(uwhile2ubranch _this,
			Match match, Statement s, While a, Assignment b) {
		_this.registerObjectsToMatch_FWD(match, s, a, b);

	}

	public static final boolean pattern_uwhile2ubranch_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_uwhile2ubranch_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("n");
		EObject _localVariable_1 = isApplicableMatch.getObject("s");
		EObject _localVariable_2 = isApplicableMatch.getObject("s2n");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject _localVariable_4 = isApplicableMatch.getObject("b");
		EObject tmpN = _localVariable_0;
		EObject tmpS = _localVariable_1;
		EObject tmpS2n = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpB = _localVariable_4;
		if (tmpN instanceof Node) {
			Node n = (Node) tmpN;
			if (tmpS instanceof Statement) {
				Statement s = (Statement) tmpS;
				if (tmpS2n instanceof S2N) {
					S2N s2n = (S2N) tmpS2n;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							return new Object[] { n, s, s2n, a, b, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_1_1_performtransformation_blackBBBBBFBB(Node n, Statement s,
			S2N s2n, While a, Assignment b, uwhile2ubranch _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(s)) {
			if (!b.equals(s)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { n, s, s2n, a, b, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			uwhile2ubranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_uwhile2ubranch_1_1_performtransformation_binding = pattern_uwhile2ubranch_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_uwhile2ubranch_1_1_performtransformation_binding != null) {
			Node n = (Node) result_pattern_uwhile2ubranch_1_1_performtransformation_binding[0];
			Statement s = (Statement) result_pattern_uwhile2ubranch_1_1_performtransformation_binding[1];
			S2N s2n = (S2N) result_pattern_uwhile2ubranch_1_1_performtransformation_binding[2];
			While a = (While) result_pattern_uwhile2ubranch_1_1_performtransformation_binding[3];
			Assignment b = (Assignment) result_pattern_uwhile2ubranch_1_1_performtransformation_binding[4];

			Object[] result_pattern_uwhile2ubranch_1_1_performtransformation_black = pattern_uwhile2ubranch_1_1_performtransformation_blackBBBBBFBB(
					n, s, s2n, a, b, _this, isApplicableMatch);
			if (result_pattern_uwhile2ubranch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_uwhile2ubranch_1_1_performtransformation_black[5];

				return new Object[] { n, s, s2n, a, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_1_1_performtransformation_greenBFFBFBF(Node n, While a,
			Assignment b) {
		S2B a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command d = ControlflowFactory.eINSTANCE.createCommand();
		Branch c = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2c.setSource(a);
		c.setPositive(d);
		a2c.setTarget(c);
		d.setNext(c);
		n.setNext(c);
		b2d.setSource(b);
		b2d.setTarget(d);
		return new Object[] { n, a2c, d, a, c, b, b2d };
	}

	public static final Object[] pattern_uwhile2ubranch_1_2_collecttranslatedelements_blackBBBBBB(S2B a2c, Command d,
			While a, Branch c, Assignment b, S2N b2d) {
		return new Object[] { a2c, d, a, c, b, b2d };
	}

	public static final Object[] pattern_uwhile2ubranch_1_2_collecttranslatedelements_greenFBBBBBB(S2B a2c, Command d,
			While a, Branch c, Assignment b, S2N b2d) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2c);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2d);
		return new Object[] { ruleresult, a2c, d, a, c, b, b2d };
	}

	public static final Object[] pattern_uwhile2ubranch_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject n, EObject s, EObject a2c, EObject d, EObject s2n, EObject a,
			EObject c, EObject b, EObject b2d) {
		if (!n.equals(s)) {
			if (!n.equals(s2n)) {
				if (!s.equals(s2n)) {
					if (!a2c.equals(n)) {
						if (!a2c.equals(s)) {
							if (!a2c.equals(d)) {
								if (!a2c.equals(s2n)) {
									if (!a2c.equals(c)) {
										if (!a2c.equals(b)) {
											if (!a2c.equals(b2d)) {
												if (!d.equals(n)) {
													if (!d.equals(s)) {
														if (!d.equals(s2n)) {
															if (!a.equals(n)) {
																if (!a.equals(s)) {
																	if (!a.equals(a2c)) {
																		if (!a.equals(d)) {
																			if (!a.equals(s2n)) {
																				if (!a.equals(c)) {
																					if (!a.equals(b)) {
																						if (!a.equals(b2d)) {
																							if (!c.equals(n)) {
																								if (!c.equals(s)) {
																									if (!c.equals(d)) {
																										if (!c.equals(
																												s2n)) {
																											if (!b.equals(
																													n)) {
																												if (!b.equals(
																														s)) {
																													if (!b.equals(
																															d)) {
																														if (!b.equals(
																																s2n)) {
																															if (!b.equals(
																																	c)) {
																																if (!b.equals(
																																		b2d)) {
																																	if (!b2d.equals(
																																			n)) {
																																		if (!b2d.equals(
																																				s)) {
																																			if (!b2d.equals(
																																					d)) {
																																				if (!b2d.equals(
																																						s2n)) {
																																					if (!b2d.equals(
																																							c)) {
																																						return new Object[] {
																																								ruleresult,
																																								n,
																																								s,
																																								a2c,
																																								d,
																																								s2n,
																																								a,
																																								c,
																																								b,
																																								b2d };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_uwhile2ubranch_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject n, EObject s, EObject a2c, EObject d, EObject a, EObject c, EObject b,
			EObject b2d) {
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2d__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2d__d____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "uwhile2ubranch";
		String s__a____next_name_prime = "next";
		String a__b____first_name_prime = "first";
		String a2c__a____source_name_prime = "source";
		String c__d____positive_name_prime = "positive";
		String a2c__c____target_name_prime = "target";
		String d__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String b2d__b____source_name_prime = "source";
		String b2d__d____target_name_prime = "target";
		String n__c____next_name_prime = "next";
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		ruleresult.getTranslatedEdges().add(s__a____next);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____first);
		a2c__a____source.setSrc(a2c);
		a2c__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2c__a____source);
		c__d____positive.setSrc(c);
		c__d____positive.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____positive);
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		ruleresult.getCreatedEdges().add(a2c__c____target);
		d__c____next.setSrc(d);
		d__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(d__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		b2d__b____source.setSrc(b2d);
		b2d__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2d__b____source);
		b2d__d____target.setSrc(b2d);
		b2d__d____target.setTrg(d);
		ruleresult.getCreatedEdges().add(b2d__d____target);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(n__c____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		s__a____next.setName(s__a____next_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		a2c__a____source.setName(a2c__a____source_name_prime);
		c__d____positive.setName(c__d____positive_name_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		d__c____next.setName(d__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		b2d__b____source.setName(b2d__b____source_name_prime);
		b2d__d____target.setName(b2d__d____target_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { ruleresult, n, s, a2c, d, a, c, b, b2d, s__a____next, a__b____first, a2c__a____source,
				c__d____positive, a2c__c____target, d__c____next, a__b____last, b2d__b____source, b2d__d____target,
				n__c____next };
	}

	public static final void pattern_uwhile2ubranch_1_5_registerobjects_expressionBBBBBBBBBBB(uwhile2ubranch _this,
			PerformRuleResult ruleresult, EObject n, EObject s, EObject a2c, EObject d, EObject s2n, EObject a,
			EObject c, EObject b, EObject b2d) {
		_this.registerObjects_FWD(ruleresult, n, s, a2c, d, s2n, a, c, b, b2d);

	}

	public static final PerformRuleResult pattern_uwhile2ubranch_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_2_1_preparereturnvalue_bindingFB(uwhile2ubranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_2_1_preparereturnvalue_blackFBB(EClass eClass,
			uwhile2ubranch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_2_1_preparereturnvalue_bindingAndBlackFFB(
			uwhile2ubranch _this) {
		Object[] result_pattern_uwhile2ubranch_2_1_preparereturnvalue_binding = pattern_uwhile2ubranch_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_uwhile2ubranch_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_uwhile2ubranch_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_uwhile2ubranch_2_1_preparereturnvalue_black = pattern_uwhile2ubranch_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_uwhile2ubranch_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_uwhile2ubranch_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "uwhile2ubranch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_uwhile2ubranch_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("s");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("b");
		EObject tmpS = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpB = _localVariable_2;
		if (tmpS instanceof Statement) {
			Statement s = (Statement) tmpS;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					return new Object[] { s, a, b, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_uwhile2ubranch_2_2_corematch_blackFBFBBB(Statement s, While a,
			Assignment b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(s)) {
			if (!b.equals(s)) {
				for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(s, S2N.class,
						"source")) {
					Node n = s2n.getTarget();
					if (n != null) {
						_result.add(new Object[] { n, s, s2n, a, b, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_uwhile2ubranch_2_3_findcontext_blackBBBBB(Node n, Statement s,
			S2N s2n, While a, Assignment b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(s)) {
			if (!b.equals(s)) {
				if (a.equals(s.getNext())) {
					if (n.equals(s2n.getTarget())) {
						if (b.equals(a.getFirst())) {
							if (s.equals(s2n.getSource())) {
								if (b.equals(a.getLast())) {
									_result.add(new Object[] { n, s, s2n, a, b });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_2_3_findcontext_greenBBBBBFFFFFF(Node n, Statement s, S2N s2n,
			While a, Assignment b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String s__a____next_name_prime = "next";
		String s2n__n____target_name_prime = "target";
		String a__b____first_name_prime = "first";
		String s2n__s____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(s2n);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(b);
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		isApplicableMatch.getAllContextElements().add(s__a____next);
		s2n__n____target.setSrc(s2n);
		s2n__n____target.setTrg(n);
		isApplicableMatch.getAllContextElements().add(s2n__n____target);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____first);
		s2n__s____source.setSrc(s2n);
		s2n__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2n__s____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		s__a____next.setName(s__a____next_name_prime);
		s2n__n____target.setName(s2n__n____target_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		s2n__s____source.setName(s2n__s____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { n, s, s2n, a, b, isApplicableMatch, s__a____next, s2n__n____target, a__b____first,
				s2n__s____source, a__b____last };
	}

	public static final Object[] pattern_uwhile2ubranch_2_4_solveCSP_bindingFBBBBBBB(uwhile2ubranch _this,
			IsApplicableMatch isApplicableMatch, Node n, Statement s, S2N s2n, While a, Assignment b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, n, s, s2n, a, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n, s, s2n, a, b };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_uwhile2ubranch_2_4_solveCSP_bindingAndBlackFBBBBBBB(uwhile2ubranch _this,
			IsApplicableMatch isApplicableMatch, Node n, Statement s, S2N s2n, While a, Assignment b) {
		Object[] result_pattern_uwhile2ubranch_2_4_solveCSP_binding = pattern_uwhile2ubranch_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, n, s, s2n, a, b);
		if (result_pattern_uwhile2ubranch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_uwhile2ubranch_2_4_solveCSP_binding[0];

			Object[] result_pattern_uwhile2ubranch_2_4_solveCSP_black = pattern_uwhile2ubranch_2_4_solveCSP_blackB(csp);
			if (result_pattern_uwhile2ubranch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n, s, s2n, a, b };
			}
		}
		return null;
	}

	public static final boolean pattern_uwhile2ubranch_2_5_checkCSP_expressionFBB(uwhile2ubranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_uwhile2ubranch_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "uwhile2ubranch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_uwhile2ubranch_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_10_1_initialbindings_blackBBBBB(uwhile2ubranch _this,
			Match match, Node n, Command d, Branch c) {
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				return new Object[] { _this, match, n, d, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_10_2_SolveCSP_bindingFBBBBB(uwhile2ubranch _this, Match match,
			Node n, Command d, Branch c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, n, d, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, n, d, c };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_uwhile2ubranch_10_2_SolveCSP_bindingAndBlackFBBBBB(uwhile2ubranch _this,
			Match match, Node n, Command d, Branch c) {
		Object[] result_pattern_uwhile2ubranch_10_2_SolveCSP_binding = pattern_uwhile2ubranch_10_2_SolveCSP_bindingFBBBBB(
				_this, match, n, d, c);
		if (result_pattern_uwhile2ubranch_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_uwhile2ubranch_10_2_SolveCSP_binding[0];

			Object[] result_pattern_uwhile2ubranch_10_2_SolveCSP_black = pattern_uwhile2ubranch_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_uwhile2ubranch_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, n, d, c };
			}
		}
		return null;
	}

	public static final boolean pattern_uwhile2ubranch_10_3_CheckCSP_expressionFBB(uwhile2ubranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_10_4_collectelementstobetranslated_blackBBBB(Match match,
			Node n, Command d, Branch c) {
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				return new Object[] { match, n, d, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_10_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			Node n, Command d, Branch c) {
		EMoflonEdge c__d____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(d);
		match.getToBeTranslatedNodes().add(c);
		String c__d____positive_name_prime = "positive";
		String d__c____next_name_prime = "next";
		String n__c____next_name_prime = "next";
		c__d____positive.setSrc(c);
		c__d____positive.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____positive);
		d__c____next.setSrc(d);
		d__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(d__c____next);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(n__c____next);
		c__d____positive.setName(c__d____positive_name_prime);
		d__c____next.setName(d__c____next_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { match, n, d, c, c__d____positive, d__c____next, n__c____next };
	}

	public static final Object[] pattern_uwhile2ubranch_10_5_collectcontextelements_blackBBBB(Match match, Node n,
			Command d, Branch c) {
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				return new Object[] { match, n, d, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_10_5_collectcontextelements_greenBB(Match match, Node n) {
		match.getContextNodes().add(n);
		return new Object[] { match, n };
	}

	public static final void pattern_uwhile2ubranch_10_6_registerobjectstomatch_expressionBBBBB(uwhile2ubranch _this,
			Match match, Node n, Command d, Branch c) {
		_this.registerObjectsToMatch_BWD(match, n, d, c);

	}

	public static final boolean pattern_uwhile2ubranch_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_uwhile2ubranch_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("n");
		EObject _localVariable_1 = isApplicableMatch.getObject("s");
		EObject _localVariable_2 = isApplicableMatch.getObject("d");
		EObject _localVariable_3 = isApplicableMatch.getObject("s2n");
		EObject _localVariable_4 = isApplicableMatch.getObject("c");
		EObject tmpN = _localVariable_0;
		EObject tmpS = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpS2n = _localVariable_3;
		EObject tmpC = _localVariable_4;
		if (tmpN instanceof Node) {
			Node n = (Node) tmpN;
			if (tmpS instanceof Statement) {
				Statement s = (Statement) tmpS;
				if (tmpD instanceof Command) {
					Command d = (Command) tmpD;
					if (tmpS2n instanceof S2N) {
						S2N s2n = (S2N) tmpS2n;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							return new Object[] { n, s, d, s2n, c, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_11_1_performtransformation_blackBBBBBFBB(Node n, Statement s,
			Command d, S2N s2n, Branch c, uwhile2ubranch _this, IsApplicableMatch isApplicableMatch) {
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { n, s, d, s2n, c, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			uwhile2ubranch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_uwhile2ubranch_11_1_performtransformation_binding = pattern_uwhile2ubranch_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_uwhile2ubranch_11_1_performtransformation_binding != null) {
			Node n = (Node) result_pattern_uwhile2ubranch_11_1_performtransformation_binding[0];
			Statement s = (Statement) result_pattern_uwhile2ubranch_11_1_performtransformation_binding[1];
			Command d = (Command) result_pattern_uwhile2ubranch_11_1_performtransformation_binding[2];
			S2N s2n = (S2N) result_pattern_uwhile2ubranch_11_1_performtransformation_binding[3];
			Branch c = (Branch) result_pattern_uwhile2ubranch_11_1_performtransformation_binding[4];

			Object[] result_pattern_uwhile2ubranch_11_1_performtransformation_black = pattern_uwhile2ubranch_11_1_performtransformation_blackBBBBBFBB(
					n, s, d, s2n, c, _this, isApplicableMatch);
			if (result_pattern_uwhile2ubranch_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_uwhile2ubranch_11_1_performtransformation_black[5];

				return new Object[] { n, s, d, s2n, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_11_1_performtransformation_greenBFBFBFF(Statement s, Command d,
			Branch c) {
		S2B a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2c.setTarget(c);
		s.setNext(a);
		a2c.setSource(a);
		a.setFirst(b);
		a.setLast(b);
		b2d.setSource(b);
		b2d.setTarget(d);
		return new Object[] { s, a2c, d, a, c, b, b2d };
	}

	public static final Object[] pattern_uwhile2ubranch_11_2_collecttranslatedelements_blackBBBBBB(S2B a2c, Command d,
			While a, Branch c, Assignment b, S2N b2d) {
		return new Object[] { a2c, d, a, c, b, b2d };
	}

	public static final Object[] pattern_uwhile2ubranch_11_2_collecttranslatedelements_greenFBBBBBB(S2B a2c, Command d,
			While a, Branch c, Assignment b, S2N b2d) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2c);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2d);
		return new Object[] { ruleresult, a2c, d, a, c, b, b2d };
	}

	public static final Object[] pattern_uwhile2ubranch_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject n, EObject s, EObject a2c, EObject d, EObject s2n, EObject a,
			EObject c, EObject b, EObject b2d) {
		if (!n.equals(s)) {
			if (!n.equals(s2n)) {
				if (!s.equals(s2n)) {
					if (!a2c.equals(n)) {
						if (!a2c.equals(s)) {
							if (!a2c.equals(d)) {
								if (!a2c.equals(s2n)) {
									if (!a2c.equals(c)) {
										if (!a2c.equals(b)) {
											if (!a2c.equals(b2d)) {
												if (!d.equals(n)) {
													if (!d.equals(s)) {
														if (!d.equals(s2n)) {
															if (!a.equals(n)) {
																if (!a.equals(s)) {
																	if (!a.equals(a2c)) {
																		if (!a.equals(d)) {
																			if (!a.equals(s2n)) {
																				if (!a.equals(c)) {
																					if (!a.equals(b)) {
																						if (!a.equals(b2d)) {
																							if (!c.equals(n)) {
																								if (!c.equals(s)) {
																									if (!c.equals(d)) {
																										if (!c.equals(
																												s2n)) {
																											if (!b.equals(
																													n)) {
																												if (!b.equals(
																														s)) {
																													if (!b.equals(
																															d)) {
																														if (!b.equals(
																																s2n)) {
																															if (!b.equals(
																																	c)) {
																																if (!b.equals(
																																		b2d)) {
																																	if (!b2d.equals(
																																			n)) {
																																		if (!b2d.equals(
																																				s)) {
																																			if (!b2d.equals(
																																					d)) {
																																				if (!b2d.equals(
																																						s2n)) {
																																					if (!b2d.equals(
																																							c)) {
																																						return new Object[] {
																																								ruleresult,
																																								n,
																																								s,
																																								a2c,
																																								d,
																																								s2n,
																																								a,
																																								c,
																																								b,
																																								b2d };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_uwhile2ubranch_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject n, EObject s, EObject a2c, EObject d, EObject a, EObject c, EObject b,
			EObject b2d) {
		EMoflonEdge s__a____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2d__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2d__d____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "uwhile2ubranch";
		String s__a____next_name_prime = "next";
		String a__b____first_name_prime = "first";
		String a2c__a____source_name_prime = "source";
		String c__d____positive_name_prime = "positive";
		String a2c__c____target_name_prime = "target";
		String d__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String b2d__b____source_name_prime = "source";
		String b2d__d____target_name_prime = "target";
		String n__c____next_name_prime = "next";
		s__a____next.setSrc(s);
		s__a____next.setTrg(a);
		ruleresult.getCreatedEdges().add(s__a____next);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____first);
		a2c__a____source.setSrc(a2c);
		a2c__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2c__a____source);
		c__d____positive.setSrc(c);
		c__d____positive.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____positive);
		a2c__c____target.setSrc(a2c);
		a2c__c____target.setTrg(c);
		ruleresult.getCreatedEdges().add(a2c__c____target);
		d__c____next.setSrc(d);
		d__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(d__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		b2d__b____source.setSrc(b2d);
		b2d__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2d__b____source);
		b2d__d____target.setSrc(b2d);
		b2d__d____target.setTrg(d);
		ruleresult.getCreatedEdges().add(b2d__d____target);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(n__c____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		s__a____next.setName(s__a____next_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		a2c__a____source.setName(a2c__a____source_name_prime);
		c__d____positive.setName(c__d____positive_name_prime);
		a2c__c____target.setName(a2c__c____target_name_prime);
		d__c____next.setName(d__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		b2d__b____source.setName(b2d__b____source_name_prime);
		b2d__d____target.setName(b2d__d____target_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { ruleresult, n, s, a2c, d, a, c, b, b2d, s__a____next, a__b____first, a2c__a____source,
				c__d____positive, a2c__c____target, d__c____next, a__b____last, b2d__b____source, b2d__d____target,
				n__c____next };
	}

	public static final void pattern_uwhile2ubranch_11_5_registerobjects_expressionBBBBBBBBBBB(uwhile2ubranch _this,
			PerformRuleResult ruleresult, EObject n, EObject s, EObject a2c, EObject d, EObject s2n, EObject a,
			EObject c, EObject b, EObject b2d) {
		_this.registerObjects_BWD(ruleresult, n, s, a2c, d, s2n, a, c, b, b2d);

	}

	public static final PerformRuleResult pattern_uwhile2ubranch_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_12_1_preparereturnvalue_bindingFB(uwhile2ubranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_12_1_preparereturnvalue_blackFBB(EClass eClass,
			uwhile2ubranch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_12_1_preparereturnvalue_bindingAndBlackFFB(
			uwhile2ubranch _this) {
		Object[] result_pattern_uwhile2ubranch_12_1_preparereturnvalue_binding = pattern_uwhile2ubranch_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_uwhile2ubranch_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_uwhile2ubranch_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_uwhile2ubranch_12_1_preparereturnvalue_black = pattern_uwhile2ubranch_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_uwhile2ubranch_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_uwhile2ubranch_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "uwhile2ubranch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_uwhile2ubranch_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("n");
		EObject _localVariable_1 = match.getObject("d");
		EObject _localVariable_2 = match.getObject("c");
		EObject tmpN = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpC = _localVariable_2;
		if (tmpN instanceof Node) {
			Node n = (Node) tmpN;
			if (tmpD instanceof Command) {
				Command d = (Command) tmpD;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					return new Object[] { n, d, c, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_uwhile2ubranch_12_2_corematch_blackBFBFBB(Node n, Command d,
			Branch c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n, S2N.class,
						"target")) {
					Statement s = s2n.getSource();
					if (s != null) {
						_result.add(new Object[] { n, s, d, s2n, c, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_uwhile2ubranch_12_3_findcontext_blackBBBBB(Node n, Statement s,
			Command d, S2N s2n, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				if (n.equals(s2n.getTarget())) {
					if (d.equals(c.getPositive())) {
						if (s.equals(s2n.getSource())) {
							if (c.equals(d.getNext())) {
								if (c.equals(n.getNext())) {
									_result.add(new Object[] { n, s, d, s2n, c });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_12_3_findcontext_greenBBBBBFFFFFF(Node n, Statement s,
			Command d, S2N s2n, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge s2n__n____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2n__s____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String s2n__n____target_name_prime = "target";
		String c__d____positive_name_prime = "positive";
		String s2n__s____source_name_prime = "source";
		String d__c____next_name_prime = "next";
		String n__c____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(n);
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(s2n);
		isApplicableMatch.getAllContextElements().add(c);
		s2n__n____target.setSrc(s2n);
		s2n__n____target.setTrg(n);
		isApplicableMatch.getAllContextElements().add(s2n__n____target);
		c__d____positive.setSrc(c);
		c__d____positive.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____positive);
		s2n__s____source.setSrc(s2n);
		s2n__s____source.setTrg(s);
		isApplicableMatch.getAllContextElements().add(s2n__s____source);
		d__c____next.setSrc(d);
		d__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d__c____next);
		n__c____next.setSrc(n);
		n__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(n__c____next);
		s2n__n____target.setName(s2n__n____target_name_prime);
		c__d____positive.setName(c__d____positive_name_prime);
		s2n__s____source.setName(s2n__s____source_name_prime);
		d__c____next.setName(d__c____next_name_prime);
		n__c____next.setName(n__c____next_name_prime);
		return new Object[] { n, s, d, s2n, c, isApplicableMatch, s2n__n____target, c__d____positive, s2n__s____source,
				d__c____next, n__c____next };
	}

	public static final Object[] pattern_uwhile2ubranch_12_4_solveCSP_bindingFBBBBBBB(uwhile2ubranch _this,
			IsApplicableMatch isApplicableMatch, Node n, Statement s, Command d, S2N s2n, Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, n, s, d, s2n, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n, s, d, s2n, c };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_uwhile2ubranch_12_4_solveCSP_bindingAndBlackFBBBBBBB(uwhile2ubranch _this,
			IsApplicableMatch isApplicableMatch, Node n, Statement s, Command d, S2N s2n, Branch c) {
		Object[] result_pattern_uwhile2ubranch_12_4_solveCSP_binding = pattern_uwhile2ubranch_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, n, s, d, s2n, c);
		if (result_pattern_uwhile2ubranch_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_uwhile2ubranch_12_4_solveCSP_binding[0];

			Object[] result_pattern_uwhile2ubranch_12_4_solveCSP_black = pattern_uwhile2ubranch_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_uwhile2ubranch_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n, s, d, s2n, c };
			}
		}
		return null;
	}

	public static final boolean pattern_uwhile2ubranch_12_5_checkCSP_expressionFBB(uwhile2ubranch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_uwhile2ubranch_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "uwhile2ubranch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_uwhile2ubranch_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_20_1_preparereturnvalue_bindingFB(uwhile2ubranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			uwhile2ubranch _this) {
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

	public static final Object[] pattern_uwhile2ubranch_20_1_preparereturnvalue_bindingAndBlackFFBF(
			uwhile2ubranch _this) {
		Object[] result_pattern_uwhile2ubranch_20_1_preparereturnvalue_binding = pattern_uwhile2ubranch_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_uwhile2ubranch_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_uwhile2ubranch_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_uwhile2ubranch_20_1_preparereturnvalue_black = pattern_uwhile2ubranch_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_uwhile2ubranch_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_uwhile2ubranch_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_uwhile2ubranch_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_0B(Command d) {
		for (Graph __DEC_d_root_781920 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Graph.class, "root")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_1BBB(Command d, Node n,
			Branch c) {
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				for (Branch __DEC_d_positive_326915 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(d, Branch.class, "positive")) {
					if (!n.equals(__DEC_d_positive_326915)) {
						if (!c.equals(__DEC_d_positive_326915)) {
							return new Object[] { d, n, c };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_2BBB(Command d, Node n,
			Branch c) {
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				for (Branch __DEC_d_negative_106326 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(d, Branch.class, "negative")) {
					if (!n.equals(__DEC_d_negative_106326)) {
						if (!c.equals(__DEC_d_negative_106326)) {
							return new Object[] { d, n, c };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_3B(Branch c) {
		for (Graph __DEC_c_root_690675 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Graph.class, "root")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_4BB(Branch c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_positive_625297 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_c_positive_625297)) {
					if (!n.equals(__DEC_c_positive_625297)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_5BB(Branch c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_negative_314526 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_c_negative_314526)) {
					if (!n.equals(__DEC_c_negative_314526)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_6BB(Branch c, Command d) {
		if (d.equals(c.getNegative())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_uwhile2ubranch_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_positive.getSrc();
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			EObject tmpD = _edge_positive.getTrg();
			if (tmpD instanceof Command) {
				Command d = (Command) tmpD;
				if (d.equals(c.getPositive())) {
					if (c.equals(d.getNext())) {
						if (pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_3B(c) == null) {
							if (pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_0B(d) == null) {
								if (pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_6BB(c, d) == null) {
									for (Node n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
											Node.class, "next")) {
										if (!d.equals(n)) {
											if (!c.equals(n)) {
												if (pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_1BBB(d,
														n, c) == null) {
													if (pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_2BBB(
															d, n, c) == null) {
														if (pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_4BB(
																c, n) == null) {
															if (pattern_uwhile2ubranch_20_2_testcorematchandDECs_black_nac_5BB(
																	c, n) == null) {
																_result.add(new Object[] { n, d, c, _edge_positive });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_uwhile2ubranch_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_uwhile2ubranch_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			uwhile2ubranch _this, Match match, Node n, Command d, Branch c) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, n, d, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_uwhile2ubranch_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			uwhile2ubranch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_uwhile2ubranch_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_21_1_preparereturnvalue_bindingFB(uwhile2ubranch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			uwhile2ubranch _this) {
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

	public static final Object[] pattern_uwhile2ubranch_21_1_preparereturnvalue_bindingAndBlackFFBF(
			uwhile2ubranch _this) {
		Object[] result_pattern_uwhile2ubranch_21_1_preparereturnvalue_binding = pattern_uwhile2ubranch_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_uwhile2ubranch_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_uwhile2ubranch_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_uwhile2ubranch_21_1_preparereturnvalue_black = pattern_uwhile2ubranch_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_uwhile2ubranch_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_uwhile2ubranch_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_uwhile2ubranch_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_0BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_positive_810786 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "positive")) {
				if (!s.equals(__DEC_a_positive_810786)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_1BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_negative_75380 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					Decision.class, "negative")) {
				if (!s.equals(__DEC_a_negative_75380)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_2BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_first_331887 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_331887)) {
					if (!s.equals(__DEC_a_first_331887)) {
						return new Object[] { a, s };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_3BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_last_614435 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_614435)) {
					if (!s.equals(__DEC_a_last_614435)) {
						return new Object[] { a, s };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_4B(While a) {
		for (Program __DEC_a_first_860825 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_5BB(Assignment b,
			Statement s) {
		if (!b.equals(s)) {
			for (Decision __DEC_b_positive_185143 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!s.equals(__DEC_b_positive_185143)) {
					return new Object[] { b, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_6BB(Assignment b,
			Statement s) {
		if (!b.equals(s)) {
			for (Decision __DEC_b_negative_706927 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "negative")) {
				if (!s.equals(__DEC_b_negative_706927)) {
					return new Object[] { b, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_7BBB(Assignment b,
			Statement s, While a) {
		if (!b.equals(s)) {
			if (!a.equals(s)) {
				for (While __DEC_b_last_760078 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
						While.class, "last")) {
					if (!s.equals(__DEC_b_last_760078)) {
						if (!a.equals(__DEC_b_last_760078)) {
							return new Object[] { b, s, a };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_8B(Assignment b) {
		for (Program __DEC_b_first_592434 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_uwhile2ubranch_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpS = _edge_next.getSrc();
		if (tmpS instanceof Statement) {
			Statement s = (Statement) tmpS;
			EObject tmpA = _edge_next.getTrg();
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (!a.equals(s)) {
					if (a.equals(s.getNext())) {
						Statement tmpB = a.getFirst();
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (!b.equals(s)) {
								if (b.equals(a.getLast())) {
									if (pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_0BB(a, s) == null) {
										if (pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_1BB(a,
												s) == null) {
											if (pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_2BB(a,
													s) == null) {
												if (pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_3BB(a,
														s) == null) {
													if (pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_4B(
															a) == null) {
														if (pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_5BB(
																b, s) == null) {
															if (pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_6BB(
																	b, s) == null) {
																if (pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_7BBB(
																		b, s, a) == null) {
																	if (pattern_uwhile2ubranch_21_2_testcorematchandDECs_black_nac_8B(
																			b) == null) {
																		_result.add(
																				new Object[] { s, a, b, _edge_next });
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_uwhile2ubranch_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_uwhile2ubranch_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			uwhile2ubranch _this, Match match, Statement s, While a, Assignment b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, s, a, b);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_uwhile2ubranch_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			uwhile2ubranch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_uwhile2ubranch_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_24_1_prepare_blackB(uwhile2ubranch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_uwhile2ubranch_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_uwhile2ubranch_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("n");
		EObject _localVariable_1 = sourceMatch.getObject("s");
		EObject _localVariable_2 = targetMatch.getObject("d");
		EObject _localVariable_3 = sourceMatch.getObject("a");
		EObject _localVariable_4 = targetMatch.getObject("c");
		EObject _localVariable_5 = sourceMatch.getObject("b");
		EObject tmpN = _localVariable_0;
		EObject tmpS = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpB = _localVariable_5;
		if (tmpN instanceof Node) {
			Node n = (Node) tmpN;
			if (tmpS instanceof Statement) {
				Statement s = (Statement) tmpS;
				if (tmpD instanceof Command) {
					Command d = (Command) tmpD;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								return new Object[] { n, s, d, a, c, b, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_24_2_matchsrctrgcontext_blackBBBBBBBB(Node n, Statement s,
			Command d, While a, Branch c, Assignment b, Match sourceMatch, Match targetMatch) {
		if (!d.equals(n)) {
			if (!a.equals(s)) {
				if (!c.equals(n)) {
					if (!b.equals(s)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { n, s, d, a, c, b, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_uwhile2ubranch_24_2_matchsrctrgcontext_binding = pattern_uwhile2ubranch_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_uwhile2ubranch_24_2_matchsrctrgcontext_binding != null) {
			Node n = (Node) result_pattern_uwhile2ubranch_24_2_matchsrctrgcontext_binding[0];
			Statement s = (Statement) result_pattern_uwhile2ubranch_24_2_matchsrctrgcontext_binding[1];
			Command d = (Command) result_pattern_uwhile2ubranch_24_2_matchsrctrgcontext_binding[2];
			While a = (While) result_pattern_uwhile2ubranch_24_2_matchsrctrgcontext_binding[3];
			Branch c = (Branch) result_pattern_uwhile2ubranch_24_2_matchsrctrgcontext_binding[4];
			Assignment b = (Assignment) result_pattern_uwhile2ubranch_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_uwhile2ubranch_24_2_matchsrctrgcontext_black = pattern_uwhile2ubranch_24_2_matchsrctrgcontext_blackBBBBBBBB(
					n, s, d, a, c, b, sourceMatch, targetMatch);
			if (result_pattern_uwhile2ubranch_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { n, s, d, a, c, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_24_3_solvecsp_bindingFBBBBBBBBB(uwhile2ubranch _this, Node n,
			Statement s, Command d, While a, Branch c, Assignment b, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(n, s, d, a, c, b, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, n, s, d, a, c, b, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_uwhile2ubranch_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(uwhile2ubranch _this,
			Node n, Statement s, Command d, While a, Branch c, Assignment b, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_uwhile2ubranch_24_3_solvecsp_binding = pattern_uwhile2ubranch_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, n, s, d, a, c, b, sourceMatch, targetMatch);
		if (result_pattern_uwhile2ubranch_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_uwhile2ubranch_24_3_solvecsp_binding[0];

			Object[] result_pattern_uwhile2ubranch_24_3_solvecsp_black = pattern_uwhile2ubranch_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_uwhile2ubranch_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, n, s, d, a, c, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_uwhile2ubranch_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_uwhile2ubranch_24_5_matchcorrcontext_blackBBFBB(Node n, Statement s,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2N s2n : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(n, S2N.class, "target")) {
				if (s.equals(s2n.getSource())) {
					_result.add(new Object[] { n, s, s2n, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_24_5_matchcorrcontext_greenBBBF(S2N s2n, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "uwhile2ubranch";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(s2n);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { s2n, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_uwhile2ubranch_24_6_createcorrespondence_blackBBBBBBB(Node n, Statement s,
			Command d, While a, Branch c, Assignment b, CCMatch ccMatch) {
		if (!d.equals(n)) {
			if (!a.equals(s)) {
				if (!c.equals(n)) {
					if (!b.equals(s)) {
						return new Object[] { n, s, d, a, c, b, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_24_6_createcorrespondence_greenFBBBBFB(Command d, While a,
			Branch c, Assignment b, CCMatch ccMatch) {
		S2B a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2c.setSource(a);
		a2c.setTarget(c);
		ccMatch.getCreateCorr().add(a2c);
		b2d.setSource(b);
		b2d.setTarget(d);
		ccMatch.getCreateCorr().add(b2d);
		return new Object[] { a2c, d, a, c, b, b2d, ccMatch };
	}

	public static final Object[] pattern_uwhile2ubranch_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_uwhile2ubranch_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "uwhile2ubranch";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_uwhile2ubranch_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_0BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_positive_708960 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "positive")) {
				if (!s.equals(__DEC_a_positive_708960)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_1BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (Decision __DEC_a_negative_982090 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!s.equals(__DEC_a_negative_982090)) {
					return new Object[] { a, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_2BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_first_406847 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "first")) {
				if (!a.equals(__DEC_a_first_406847)) {
					if (!s.equals(__DEC_a_first_406847)) {
						return new Object[] { a, s };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_3BB(While a, Statement s) {
		if (!a.equals(s)) {
			for (While __DEC_a_last_598190 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_598190)) {
					if (!s.equals(__DEC_a_last_598190)) {
						return new Object[] { a, s };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_4B(While a) {
		for (Program __DEC_a_first_721239 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_5BB(Assignment b, Statement s) {
		if (!b.equals(s)) {
			for (Decision __DEC_b_positive_135327 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!s.equals(__DEC_b_positive_135327)) {
					return new Object[] { b, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_6BB(Assignment b, Statement s) {
		if (!b.equals(s)) {
			for (Decision __DEC_b_negative_260073 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "negative")) {
				if (!s.equals(__DEC_b_negative_260073)) {
					return new Object[] { b, s };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_7BBB(Assignment b, Statement s,
			While a) {
		if (!b.equals(s)) {
			if (!a.equals(s)) {
				for (While __DEC_b_last_758824 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
						While.class, "last")) {
					if (!s.equals(__DEC_b_last_758824)) {
						if (!a.equals(__DEC_b_last_758824)) {
							return new Object[] { b, s, a };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_8B(Assignment b) {
		for (Program __DEC_b_first_407559 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_27_1_matchtggpattern_blackBBB(Statement s, While a,
			Assignment b) {
		if (!a.equals(s)) {
			if (!b.equals(s)) {
				if (a.equals(s.getNext())) {
					if (b.equals(a.getFirst())) {
						if (b.equals(a.getLast())) {
							if (pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_0BB(a, s) == null) {
								if (pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_1BB(a, s) == null) {
									if (pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_2BB(a, s) == null) {
										if (pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_3BB(a, s) == null) {
											if (pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_4B(a) == null) {
												if (pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_5BB(b,
														s) == null) {
													if (pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_6BB(b,
															s) == null) {
														if (pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_7BBB(
																b, s, a) == null) {
															if (pattern_uwhile2ubranch_27_1_matchtggpattern_black_nac_8B(
																	b) == null) {
																return new Object[] { s, a, b };
															}
														}
													}
												}
											}
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

	public static final boolean pattern_uwhile2ubranch_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_uwhile2ubranch_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_0B(Command d) {
		for (Graph __DEC_d_root_690330 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Graph.class, "root")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_1BBB(Command d, Node n,
			Branch c) {
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				for (Branch __DEC_d_positive_389113 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(d, Branch.class, "positive")) {
					if (!n.equals(__DEC_d_positive_389113)) {
						if (!c.equals(__DEC_d_positive_389113)) {
							return new Object[] { d, n, c };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_2BBB(Command d, Node n,
			Branch c) {
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				for (Branch __DEC_d_negative_20816 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(d, Branch.class, "negative")) {
					if (!n.equals(__DEC_d_negative_20816)) {
						if (!c.equals(__DEC_d_negative_20816)) {
							return new Object[] { d, n, c };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_3B(Branch c) {
		for (Graph __DEC_c_root_903772 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Graph.class, "root")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_4BB(Branch c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_positive_721171 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_c_positive_721171)) {
					if (!n.equals(__DEC_c_positive_721171)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_5BB(Branch c, Node n) {
		if (!c.equals(n)) {
			for (Branch __DEC_c_negative_958554 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_c_negative_958554)) {
					if (!n.equals(__DEC_c_negative_958554)) {
						return new Object[] { c, n };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_6BB(Branch c, Command d) {
		if (d.equals(c.getNegative())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_28_1_matchtggpattern_blackBBB(Node n, Command d, Branch c) {
		if (!d.equals(n)) {
			if (!c.equals(n)) {
				if (d.equals(c.getPositive())) {
					if (c.equals(d.getNext())) {
						if (c.equals(n.getNext())) {
							if (pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_0B(d) == null) {
								if (pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_1BBB(d, n, c) == null) {
									if (pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_2BBB(d, n, c) == null) {
										if (pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_3B(c) == null) {
											if (pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_4BB(c,
													n) == null) {
												if (pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_5BB(c,
														n) == null) {
													if (pattern_uwhile2ubranch_28_1_matchtggpattern_black_nac_6BB(c,
															d) == null) {
														return new Object[] { n, d, c };
													}
												}
											}
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

	public static final boolean pattern_uwhile2ubranch_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_uwhile2ubranch_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_29_1_createresult_blackB(uwhile2ubranch _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_uwhile2ubranch_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_uwhile2ubranch_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Node n) {
		if (ruleResult.getTargetObjects().contains(n)) {
			return new Object[] { ruleResult, n };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2N s2n) {
		if (ruleResult.getCorrObjects().contains(s2n)) {
			return new Object[] { ruleResult, s2n };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Statement s) {
		if (ruleResult.getSourceObjects().contains(s)) {
			return new Object[] { ruleResult, s };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_uwhile2ubranch_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_uwhile2ubranch_29_2_isapplicablecore_black_nac_1BB(ruleResult, s2n) == null) {
								if (pattern_uwhile2ubranch_29_2_isapplicablecore_black_nac_0BB(ruleResult, n) == null) {
									if (pattern_uwhile2ubranch_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_uwhile2ubranch_29_3_solveCSP_bindingFBBBBBB(uwhile2ubranch _this,
			IsApplicableMatch isApplicableMatch, Node n, Statement s, S2N s2n, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, n, s, s2n, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, n, s, s2n, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_uwhile2ubranch_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_uwhile2ubranch_29_3_solveCSP_bindingAndBlackFBBBBBB(uwhile2ubranch _this,
			IsApplicableMatch isApplicableMatch, Node n, Statement s, S2N s2n, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_uwhile2ubranch_29_3_solveCSP_binding = pattern_uwhile2ubranch_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, n, s, s2n, ruleResult);
		if (result_pattern_uwhile2ubranch_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_uwhile2ubranch_29_3_solveCSP_binding[0];

			Object[] result_pattern_uwhile2ubranch_29_3_solveCSP_black = pattern_uwhile2ubranch_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_uwhile2ubranch_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, n, s, s2n, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_uwhile2ubranch_29_4_checkCSP_expressionFBB(uwhile2ubranch _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_uwhile2ubranch_29_5_checknacs_blackBBB(Node n, Statement s, S2N s2n) {
		return new Object[] { n, s, s2n };
	}

	public static final Object[] pattern_uwhile2ubranch_29_6_perform_blackBBBB(Node n, Statement s, S2N s2n,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { n, s, s2n, ruleResult };
	}

	public static final Object[] pattern_uwhile2ubranch_29_6_perform_greenBBFFFFFFB(Node n, Statement s,
			ModelgeneratorRuleResult ruleResult) {
		S2B a2c = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command d = ControlflowFactory.eINSTANCE.createCommand();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Branch c = ControlflowFactory.eINSTANCE.createBranch();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2d = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2c);
		ruleResult.getTargetObjects().add(d);
		s.setNext(a);
		a2c.setSource(a);
		ruleResult.getSourceObjects().add(a);
		c.setPositive(d);
		a2c.setTarget(c);
		d.setNext(c);
		n.setNext(c);
		ruleResult.getTargetObjects().add(c);
		a.setFirst(b);
		a.setLast(b);
		ruleResult.getSourceObjects().add(b);
		b2d.setSource(b);
		b2d.setTarget(d);
		ruleResult.getCorrObjects().add(b2d);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { n, s, a2c, d, a, c, b, b2d, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_uwhile2ubranch_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //uwhile2ubranchImpl
