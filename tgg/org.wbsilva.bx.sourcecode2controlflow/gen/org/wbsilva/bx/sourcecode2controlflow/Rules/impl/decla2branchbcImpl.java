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
import org.wbsilva.bx.sourcecode2controlflow.Rules.decla2branchbc;

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
 * An implementation of the model object '<em><b>decla2branchbc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class decla2branchbcImpl extends AbstractRuleImpl implements decla2branchbc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decla2branchbcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdecla2branchbc();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Decision d, While a, Assignment l, Assignment b) {

		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_0_1_initialbindings_blackBBBBBB(this, match,
				d, a, l, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[l] = " + l + ", "
					+ "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, d, a, l, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[l] = " + l + ", "
					+ "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decla2branchbcImpl.pattern_decla2branchbc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decla2branchbcImpl
					.pattern_decla2branchbc_0_4_collectelementstobetranslated_blackBBBBB(match, d, a, l, b);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[b] = " + b + ".");
			}
			decla2branchbcImpl.pattern_decla2branchbc_0_4_collectelementstobetranslated_greenBBBBBFFF(match, d, a, l,
					b);
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decla2branchbcImpl
					.pattern_decla2branchbc_0_5_collectcontextelements_blackBBBBB(match, d, a, l, b);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[b] = " + b + ".");
			}
			decla2branchbcImpl.pattern_decla2branchbc_0_5_collectcontextelements_greenBB(match, d);

			// 
			decla2branchbcImpl.pattern_decla2branchbc_0_6_registerobjectstomatch_expressionBBBBBB(this, match, d, a, l,
					b);
			return decla2branchbcImpl.pattern_decla2branchbc_0_7_expressionF();
		} else {
			return decla2branchbcImpl.pattern_decla2branchbc_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Decision d = (Decision) result1_bindingAndBlack[0];
		While a = (While) result1_bindingAndBlack[1];
		Branch c = (Branch) result1_bindingAndBlack[2];
		Assignment l = (Assignment) result1_bindingAndBlack[3];
		S2B d2c = (S2B) result1_bindingAndBlack[4];
		Assignment b = (Assignment) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decla2branchbcImpl.pattern_decla2branchbc_1_1_performtransformation_greenFBBBFFFFBF(a,
				c, l, b);
		S2N l2z = (S2N) result1_green[0];
		Branch x = (Branch) result1_green[4];
		Command z = (Command) result1_green[5];
		S2B a2x = (S2B) result1_green[6];
		S2N b2y = (S2N) result1_green[7];
		Command y = (Command) result1_green[9];

		Object[] result2_black = decla2branchbcImpl
				.pattern_decla2branchbc_1_2_collecttranslatedelements_blackBBBBBBBBB(l2z, a, l, x, z, a2x, b2y, b, y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l2z] = " + l2z + ", " + "[a] = "
					+ a + ", " + "[l] = " + l + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x
					+ ", " + "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = decla2branchbcImpl
				.pattern_decla2branchbc_1_2_collecttranslatedelements_greenFBBBBBBBBB(l2z, a, l, x, z, a2x, b2y, b, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decla2branchbcImpl.pattern_decla2branchbc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, d, l2z, a, c, l, x, z, a2x, d2c, b2y, b, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d] = " + d + ", " + "[l2z] = " + l2z + ", " + "[a] = " + a + ", " + "[c] = " + c + ", "
					+ "[l] = " + l + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", "
					+ "[d2c] = " + d2c + ", " + "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[y] = " + y + ".");
		}
		decla2branchbcImpl.pattern_decla2branchbc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, d,
				l2z, a, c, l, x, z, a2x, b2y, b, y);
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[23];

		// 
		// 
		decla2branchbcImpl.pattern_decla2branchbc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, d, l2z,
				a, c, l, x, z, a2x, d2c, b2y, b, y);
		return decla2branchbcImpl.pattern_decla2branchbc_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decla2branchbcImpl
				.pattern_decla2branchbc_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decla2branchbcImpl.pattern_decla2branchbc_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Decision d = (Decision) result2_binding[0];
		While a = (While) result2_binding[1];
		Assignment l = (Assignment) result2_binding[2];
		Assignment b = (Assignment) result2_binding[3];
		for (Object[] result2_black : decla2branchbcImpl.pattern_decla2branchbc_2_2_corematch_blackBBFBFBB(d, a, l, b,
				match)) {
			Branch c = (Branch) result2_black[2];
			S2B d2c = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decla2branchbcImpl.pattern_decla2branchbc_2_3_findcontext_blackBBBBBB(d, a, c,
					l, d2c, b)) {
				Object[] result3_green = decla2branchbcImpl.pattern_decla2branchbc_2_3_findcontext_greenBBBBBBFFFFFF(d,
						a, c, l, d2c, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decla2branchbcImpl
						.pattern_decla2branchbc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d, a, c,
								l, d2c, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[a] = " + a
							+ ", " + "[c] = " + c + ", " + "[l] = " + l + ", " + "[d2c] = " + d2c + ", " + "[b] = " + b
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decla2branchbcImpl.pattern_decla2branchbc_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decla2branchbcImpl
							.pattern_decla2branchbc_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decla2branchbcImpl.pattern_decla2branchbc_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decla2branchbcImpl.pattern_decla2branchbc_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Decision d, While a, Assignment l, Assignment b) {
		match.registerObject("d", d);
		match.registerObject("a", a);
		match.registerObject("l", l);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision d, While a, Assignment l, Assignment b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Decision d, While a, Branch c,
			Assignment l, S2B d2c, Assignment b) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("d2c", d2c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject d, EObject l2z, EObject a, EObject c,
			EObject l, EObject x, EObject z, EObject a2x, EObject d2c, EObject b2y, EObject b, EObject y) {
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch c, Branch x, Command z, Command y) {

		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_10_1_initialbindings_blackBBBBBB(this, match,
				c, x, z, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[z] = " + z + ", "
					+ "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, c, x, z, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[z] = " + z + ", "
					+ "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decla2branchbcImpl.pattern_decla2branchbc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decla2branchbcImpl
					.pattern_decla2branchbc_10_4_collectelementstobetranslated_blackBBBBB(match, c, x, z, y);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[y] = " + y + ".");
			}
			decla2branchbcImpl.pattern_decla2branchbc_10_4_collectelementstobetranslated_greenBBBBBFFF(match, c, x, z,
					y);
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decla2branchbcImpl
					.pattern_decla2branchbc_10_5_collectcontextelements_blackBBBBB(match, c, x, z, y);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[y] = " + y + ".");
			}
			decla2branchbcImpl.pattern_decla2branchbc_10_5_collectcontextelements_greenBB(match, c);

			// 
			decla2branchbcImpl.pattern_decla2branchbc_10_6_registerobjectstomatch_expressionBBBBBB(this, match, c, x, z,
					y);
			return decla2branchbcImpl.pattern_decla2branchbc_10_7_expressionF();
		} else {
			return decla2branchbcImpl.pattern_decla2branchbc_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Decision d = (Decision) result1_bindingAndBlack[0];
		Branch c = (Branch) result1_bindingAndBlack[1];
		Branch x = (Branch) result1_bindingAndBlack[2];
		Command z = (Command) result1_bindingAndBlack[3];
		S2B d2c = (S2B) result1_bindingAndBlack[4];
		Command y = (Command) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decla2branchbcImpl.pattern_decla2branchbc_11_1_performtransformation_greenBFFFBBFFFB(d,
				x, z, y);
		S2N l2z = (S2N) result1_green[1];
		While a = (While) result1_green[2];
		Assignment l = (Assignment) result1_green[3];
		S2B a2x = (S2B) result1_green[6];
		S2N b2y = (S2N) result1_green[7];
		Assignment b = (Assignment) result1_green[8];

		Object[] result2_black = decla2branchbcImpl
				.pattern_decla2branchbc_11_2_collecttranslatedelements_blackBBBBBBBBB(l2z, a, l, x, z, a2x, b2y, b, y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l2z] = " + l2z + ", " + "[a] = "
					+ a + ", " + "[l] = " + l + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x
					+ ", " + "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = decla2branchbcImpl
				.pattern_decla2branchbc_11_2_collecttranslatedelements_greenFBBBBBBBBB(l2z, a, l, x, z, a2x, b2y, b, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decla2branchbcImpl.pattern_decla2branchbc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, d, l2z, a, c, l, x, z, a2x, d2c, b2y, b, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d] = " + d + ", " + "[l2z] = " + l2z + ", " + "[a] = " + a + ", " + "[c] = " + c + ", "
					+ "[l] = " + l + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", "
					+ "[d2c] = " + d2c + ", " + "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[y] = " + y + ".");
		}
		decla2branchbcImpl.pattern_decla2branchbc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, d,
				l2z, a, c, l, x, z, a2x, b2y, b, y);
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[23];

		// 
		// 
		decla2branchbcImpl.pattern_decla2branchbc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, d,
				l2z, a, c, l, x, z, a2x, d2c, b2y, b, y);
		return decla2branchbcImpl.pattern_decla2branchbc_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decla2branchbcImpl
				.pattern_decla2branchbc_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decla2branchbcImpl.pattern_decla2branchbc_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch c = (Branch) result2_binding[0];
		Branch x = (Branch) result2_binding[1];
		Command z = (Command) result2_binding[2];
		Command y = (Command) result2_binding[3];
		for (Object[] result2_black : decla2branchbcImpl.pattern_decla2branchbc_12_2_corematch_blackFBBBFBB(c, x, z, y,
				match)) {
			Decision d = (Decision) result2_black[0];
			S2B d2c = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decla2branchbcImpl.pattern_decla2branchbc_12_3_findcontext_blackBBBBBB(d, c,
					x, z, d2c, y)) {
				Object[] result3_green = decla2branchbcImpl.pattern_decla2branchbc_12_3_findcontext_greenBBBBBBFFFFFF(d,
						c, x, z, d2c, y);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decla2branchbcImpl
						.pattern_decla2branchbc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d, c, x,
								z, d2c, y);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[c] = " + c
							+ ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[d2c] = " + d2c + ", " + "[y] = " + y
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decla2branchbcImpl.pattern_decla2branchbc_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decla2branchbcImpl
							.pattern_decla2branchbc_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decla2branchbcImpl.pattern_decla2branchbc_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decla2branchbcImpl.pattern_decla2branchbc_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch c, Branch x, Command z, Command y) {
		match.registerObject("c", c);
		match.registerObject("x", x);
		match.registerObject("z", z);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch c, Branch x, Command z, Command y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Decision d, Branch c, Branch x, Command z,
			S2B d2c, Command y) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("y", y);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject d, EObject l2z, EObject a, EObject c,
			EObject l, EObject x, EObject z, EObject a2x, EObject d2c, EObject b2y, EObject b, EObject y) {
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_92(EMoflonEdge _edge_negative) {

		Object[] result1_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decla2branchbcImpl.pattern_decla2branchbc_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decla2branchbcImpl
				.pattern_decla2branchbc_20_2_testcorematchandDECs_blackFFFFB(_edge_negative)) {
			Branch c = (Branch) result2_black[0];
			Branch x = (Branch) result2_black[1];
			Command z = (Command) result2_black[2];
			Command y = (Command) result2_black[3];
			Object[] result2_green = decla2branchbcImpl
					.pattern_decla2branchbc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decla2branchbcImpl
					.pattern_decla2branchbc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, c, x, z, y)) {
				// 
				if (decla2branchbcImpl
						.pattern_decla2branchbc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decla2branchbcImpl
							.pattern_decla2branchbc_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decla2branchbcImpl.pattern_decla2branchbc_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decla2branchbcImpl.pattern_decla2branchbc_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_92(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decla2branchbcImpl.pattern_decla2branchbc_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decla2branchbcImpl
				.pattern_decla2branchbc_21_2_testcorematchandDECs_blackFFFFB(_edge_positive)) {
			Decision d = (Decision) result2_black[0];
			While a = (While) result2_black[1];
			Assignment l = (Assignment) result2_black[2];
			Assignment b = (Assignment) result2_black[3];
			Object[] result2_green = decla2branchbcImpl
					.pattern_decla2branchbc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decla2branchbcImpl
					.pattern_decla2branchbc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, d, a, l, b)) {
				// 
				if (decla2branchbcImpl
						.pattern_decla2branchbc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decla2branchbcImpl
							.pattern_decla2branchbc_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decla2branchbcImpl.pattern_decla2branchbc_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decla2branchbcImpl.pattern_decla2branchbc_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("decla2branchbc");
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
		ruleResult.setRule("decla2branchbc");
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

		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decla2branchbcImpl.pattern_decla2branchbc_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Decision d = (Decision) result2_bindingAndBlack[0];
		While a = (While) result2_bindingAndBlack[1];
		Branch c = (Branch) result2_bindingAndBlack[2];
		Assignment l = (Assignment) result2_bindingAndBlack[3];
		Branch x = (Branch) result2_bindingAndBlack[4];
		Command z = (Command) result2_bindingAndBlack[5];
		Assignment b = (Assignment) result2_bindingAndBlack[6];
		Command y = (Command) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, d, a, c, l, x, z, b, y,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[d] = " + d + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[l] = " + l + ", " + "[x] = "
					+ x + ", " + "[z] = " + z + ", " + "[b] = " + b + ", " + "[y] = " + y + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decla2branchbcImpl.pattern_decla2branchbc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decla2branchbcImpl.pattern_decla2branchbc_24_5_matchcorrcontext_blackBBFBB(d,
					c, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[2];
				Object[] result5_green = decla2branchbcImpl.pattern_decla2branchbc_24_5_matchcorrcontext_greenBBBF(d2c,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decla2branchbcImpl
						.pattern_decla2branchbc_24_6_createcorrespondence_blackBBBBBBBBB(d, a, c, l, x, z, b, y,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
							+ "[a] = " + a + ", " + "[c] = " + c + ", " + "[l] = " + l + ", " + "[x] = " + x + ", "
							+ "[z] = " + z + ", " + "[b] = " + b + ", " + "[y] = " + y + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decla2branchbcImpl.pattern_decla2branchbc_24_6_createcorrespondence_greenFBBBBFFBBB(a, l, x, z, b, y,
						ccMatch);
				//nothing S2N l2z = (S2N) result6_green[0];
				//nothing S2B a2x = (S2B) result6_green[5];
				//nothing S2N b2y = (S2N) result6_green[6];

				Object[] result7_black = decla2branchbcImpl
						.pattern_decla2branchbc_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decla2branchbcImpl.pattern_decla2branchbc_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return decla2branchbcImpl.pattern_decla2branchbc_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Decision d, While a, Branch c, Assignment l, Branch x, Command z, Assignment b,
			Command y, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Decision d, While a, Assignment l, Assignment b) {// 
		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_27_1_matchtggpattern_blackBBBB(d, a, l, b);
		if (result1_black != null) {
			return decla2branchbcImpl.pattern_decla2branchbc_27_2_expressionF();
		} else {
			return decla2branchbcImpl.pattern_decla2branchbc_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch c, Branch x, Command z, Command y) {// 
		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_28_1_matchtggpattern_blackBBBB(c, x, z, y);
		if (result1_black != null) {
			return decla2branchbcImpl.pattern_decla2branchbc_28_2_expressionF();
		} else {
			return decla2branchbcImpl.pattern_decla2branchbc_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decla2branchbcImpl.pattern_decla2branchbc_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : decla2branchbcImpl
				.pattern_decla2branchbc_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			Decision d = (Decision) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = decla2branchbcImpl
					.pattern_decla2branchbc_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d, c, d2c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[c] = " + c
						+ ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decla2branchbcImpl.pattern_decla2branchbc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decla2branchbcImpl.pattern_decla2branchbc_29_5_checknacs_blackBBB(d, c, d2c);
				if (result5_black != null) {

					Object[] result6_black = decla2branchbcImpl.pattern_decla2branchbc_29_6_perform_blackBBBB(d, c, d2c,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
								+ "[c] = " + c + ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decla2branchbcImpl.pattern_decla2branchbc_29_6_perform_greenBFFBFFFFFFFB(d, c, ruleResult);
					//nothing S2N l2z = (S2N) result6_green[1];
					//nothing While a = (While) result6_green[2];
					//nothing Assignment l = (Assignment) result6_green[4];
					//nothing Branch x = (Branch) result6_green[5];
					//nothing Command z = (Command) result6_green[6];
					//nothing S2B a2x = (S2B) result6_green[7];
					//nothing S2N b2y = (S2N) result6_green[8];
					//nothing Assignment b = (Assignment) result6_green[9];
					//nothing Command y = (Command) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return decla2branchbcImpl.pattern_decla2branchbc_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
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
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_FWD__MATCH_DECISION_WHILE_ASSIGNMENT_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_WHILE_ASSIGNMENT_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Assignment) arguments.get(4));
			return null;
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_WHILE_ASSIGNMENT_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DECISION_WHILE_BRANCH_ASSIGNMENT_S2B_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (Assignment) arguments.get(4),
					(S2B) arguments.get(5), (Assignment) arguments.get(6));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECLA2BRANCHBC___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Command) arguments.get(4));
			return null;
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_BRANCH_BRANCH_COMMAND_S2B_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(S2B) arguments.get(5), (Command) arguments.get(6));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECLA2BRANCHBC___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_92__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_92((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_92__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_92((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_CC__DECISION_WHILE_BRANCH_ASSIGNMENT_BRANCH_COMMAND_ASSIGNMENT_COMMAND_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Decision) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (Assignment) arguments.get(3), (Branch) arguments.get(4),
					(Command) arguments.get(5), (Assignment) arguments.get(6), (Command) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___CHECK_DEC_FWD__DECISION_WHILE_ASSIGNMENT_ASSIGNMENT:
			return checkDEC_FWD((Decision) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.DECLA2BRANCHBC___CHECK_DEC_BWD__BRANCH_BRANCH_COMMAND_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.DECLA2BRANCHBC___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECLA2BRANCHBC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_BRANCH_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decla2branchbc_0_1_initialbindings_blackBBBBBB(decla2branchbc _this,
			Match match, Decision d, While a, Assignment l, Assignment b) {
		if (!b.equals(l)) {
			return new Object[] { _this, match, d, a, l, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_0_2_SolveCSP_bindingFBBBBBB(decla2branchbc _this, Match match,
			Decision d, While a, Assignment l, Assignment b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, d, a, l, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, d, a, l, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_0_2_SolveCSP_bindingAndBlackFBBBBBB(decla2branchbc _this,
			Match match, Decision d, While a, Assignment l, Assignment b) {
		Object[] result_pattern_decla2branchbc_0_2_SolveCSP_binding = pattern_decla2branchbc_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, d, a, l, b);
		if (result_pattern_decla2branchbc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_0_2_SolveCSP_black = pattern_decla2branchbc_0_2_SolveCSP_blackB(csp);
			if (result_pattern_decla2branchbc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, d, a, l, b };
			}
		}
		return null;
	}

	public static final boolean pattern_decla2branchbc_0_3_CheckCSP_expressionFBB(decla2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Decision d, While a, Assignment l, Assignment b) {
		if (!b.equals(l)) {
			return new Object[] { match, d, a, l, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Decision d, While a, Assignment l, Assignment b) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(b);
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { match, d, a, l, b, d__a____positive, a__l____last, d__b____negative };
	}

	public static final Object[] pattern_decla2branchbc_0_5_collectcontextelements_blackBBBBB(Match match, Decision d,
			While a, Assignment l, Assignment b) {
		if (!b.equals(l)) {
			return new Object[] { match, d, a, l, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decla2branchbc_0_6_registerobjectstomatch_expressionBBBBBB(decla2branchbc _this,
			Match match, Decision d, While a, Assignment l, Assignment b) {
		_this.registerObjectsToMatch_FWD(match, d, a, l, b);

	}

	public static final boolean pattern_decla2branchbc_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decla2branchbc_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("a");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("l");
		EObject _localVariable_4 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("b");
		EObject tmpD = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpL = _localVariable_3;
		EObject tmpD2c = _localVariable_4;
		EObject tmpB = _localVariable_5;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						if (tmpD2c instanceof S2B) {
							S2B d2c = (S2B) tmpD2c;
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								return new Object[] { d, a, c, l, d2c, b, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_1_1_performtransformation_blackBBBBBBFBB(Decision d, While a,
			Branch c, Assignment l, S2B d2c, Assignment b, decla2branchbc _this, IsApplicableMatch isApplicableMatch) {
		if (!b.equals(l)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { d, a, c, l, d2c, b, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decla2branchbc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decla2branchbc_1_1_performtransformation_binding = pattern_decla2branchbc_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decla2branchbc_1_1_performtransformation_binding != null) {
			Decision d = (Decision) result_pattern_decla2branchbc_1_1_performtransformation_binding[0];
			While a = (While) result_pattern_decla2branchbc_1_1_performtransformation_binding[1];
			Branch c = (Branch) result_pattern_decla2branchbc_1_1_performtransformation_binding[2];
			Assignment l = (Assignment) result_pattern_decla2branchbc_1_1_performtransformation_binding[3];
			S2B d2c = (S2B) result_pattern_decla2branchbc_1_1_performtransformation_binding[4];
			Assignment b = (Assignment) result_pattern_decla2branchbc_1_1_performtransformation_binding[5];

			Object[] result_pattern_decla2branchbc_1_1_performtransformation_black = pattern_decla2branchbc_1_1_performtransformation_blackBBBBBBFBB(
					d, a, c, l, d2c, b, _this, isApplicableMatch);
			if (result_pattern_decla2branchbc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decla2branchbc_1_1_performtransformation_black[6];

				return new Object[] { d, a, c, l, d2c, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_1_1_performtransformation_greenFBBBFFFFBF(While a, Branch c,
			Assignment l, Assignment b) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		l2z.setSource(l);
		c.setPositive(x);
		z.setNext(x);
		l2z.setTarget(z);
		a2x.setSource(a);
		a2x.setTarget(x);
		b2y.setSource(b);
		c.setNegative(y);
		b2y.setTarget(y);
		return new Object[] { l2z, a, c, l, x, z, a2x, b2y, b, y };
	}

	public static final Object[] pattern_decla2branchbc_1_2_collecttranslatedelements_blackBBBBBBBBB(S2N l2z, While a,
			Assignment l, Branch x, Command z, S2B a2x, S2N b2y, Assignment b, Command y) {
		if (!b2y.equals(l2z)) {
			if (!b.equals(l)) {
				if (!y.equals(z)) {
					return new Object[] { l2z, a, l, x, z, a2x, b2y, b, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_1_2_collecttranslatedelements_greenFBBBBBBBBB(S2N l2z, While a,
			Assignment l, Branch x, Command z, S2B a2x, S2N b2y, Assignment b, Command y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(y);
		return new Object[] { ruleresult, l2z, a, l, x, z, a2x, b2y, b, y };
	}

	public static final Object[] pattern_decla2branchbc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d, EObject l2z, EObject a, EObject c, EObject l, EObject x, EObject z,
			EObject a2x, EObject d2c, EObject b2y, EObject b, EObject y) {
		if (!d.equals(l2z)) {
			if (!d.equals(l)) {
				if (!d.equals(x)) {
					if (!d.equals(z)) {
						if (!d.equals(d2c)) {
							if (!d.equals(y)) {
								if (!l2z.equals(x)) {
									if (!l2z.equals(z)) {
										if (!l2z.equals(y)) {
											if (!a.equals(d)) {
												if (!a.equals(l2z)) {
													if (!a.equals(c)) {
														if (!a.equals(l)) {
															if (!a.equals(x)) {
																if (!a.equals(z)) {
																	if (!a.equals(a2x)) {
																		if (!a.equals(d2c)) {
																			if (!a.equals(b2y)) {
																				if (!a.equals(b)) {
																					if (!a.equals(y)) {
																						if (!c.equals(d)) {
																							if (!c.equals(l2z)) {
																								if (!c.equals(l)) {
																									if (!c.equals(x)) {
																										if (!c.equals(
																												z)) {
																											if (!c.equals(
																													d2c)) {
																												if (!c.equals(
																														y)) {
																													if (!l.equals(
																															l2z)) {
																														if (!l.equals(
																																x)) {
																															if (!l.equals(
																																	z)) {
																																if (!l.equals(
																																		y)) {
																																	if (!x.equals(
																																			z)) {
																																		if (!x.equals(
																																				y)) {
																																			if (!a2x.equals(
																																					d)) {
																																				if (!a2x.equals(
																																						l2z)) {
																																					if (!a2x.equals(
																																							c)) {
																																						if (!a2x.equals(
																																								l)) {
																																							if (!a2x.equals(
																																									x)) {
																																								if (!a2x.equals(
																																										z)) {
																																									if (!a2x.equals(
																																											d2c)) {
																																										if (!a2x.equals(
																																												b2y)) {
																																											if (!a2x.equals(
																																													b)) {
																																												if (!a2x.equals(
																																														y)) {
																																													if (!d2c.equals(
																																															l2z)) {
																																														if (!d2c.equals(
																																																l)) {
																																															if (!d2c.equals(
																																																	x)) {
																																																if (!d2c.equals(
																																																		z)) {
																																																	if (!d2c.equals(
																																																			y)) {
																																																		if (!b2y.equals(
																																																				d)) {
																																																			if (!b2y.equals(
																																																					l2z)) {
																																																				if (!b2y.equals(
																																																						c)) {
																																																					if (!b2y.equals(
																																																							l)) {
																																																						if (!b2y.equals(
																																																								x)) {
																																																							if (!b2y.equals(
																																																									z)) {
																																																								if (!b2y.equals(
																																																										d2c)) {
																																																									if (!b2y.equals(
																																																											y)) {
																																																										if (!b.equals(
																																																												d)) {
																																																											if (!b.equals(
																																																													l2z)) {
																																																												if (!b.equals(
																																																														c)) {
																																																													if (!b.equals(
																																																															l)) {
																																																														if (!b.equals(
																																																																x)) {
																																																															if (!b.equals(
																																																																	z)) {
																																																																if (!b.equals(
																																																																		d2c)) {
																																																																	if (!b.equals(
																																																																			b2y)) {
																																																																		if (!b.equals(
																																																																				y)) {
																																																																			if (!y.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						d,
																																																																						l2z,
																																																																						a,
																																																																						c,
																																																																						l,
																																																																						x,
																																																																						z,
																																																																						a2x,
																																																																						d2c,
																																																																						b2y,
																																																																						b,
																																																																						y };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decla2branchbc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject d, EObject l2z, EObject a, EObject c, EObject l, EObject x, EObject z,
			EObject a2x, EObject b2y, EObject b, EObject y) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decla2branchbc";
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String c__y____negative_name_prime = "negative";
		String l2z__l____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		String z__x____next_name_prime = "next";
		String l2z__z____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String d__b____negative_name_prime = "negative";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		return new Object[] { ruleresult, d, l2z, a, c, l, x, z, a2x, b2y, b, y, d__a____positive, a__l____last,
				c__y____negative, l2z__l____source, c__x____positive, z__x____next, l2z__z____target, a2x__a____source,
				a2x__x____target, d__b____negative, b2y__b____source, b2y__y____target };
	}

	public static final void pattern_decla2branchbc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(decla2branchbc _this,
			PerformRuleResult ruleresult, EObject d, EObject l2z, EObject a, EObject c, EObject l, EObject x, EObject z,
			EObject a2x, EObject d2c, EObject b2y, EObject b, EObject y) {
		_this.registerObjects_FWD(ruleresult, d, l2z, a, c, l, x, z, a2x, d2c, b2y, b, y);

	}

	public static final PerformRuleResult pattern_decla2branchbc_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_2_1_preparereturnvalue_bindingFB(decla2branchbc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_2_1_preparereturnvalue_blackFBB(EClass eClass,
			decla2branchbc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_2_1_preparereturnvalue_bindingAndBlackFFB(
			decla2branchbc _this) {
		Object[] result_pattern_decla2branchbc_2_1_preparereturnvalue_binding = pattern_decla2branchbc_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decla2branchbc_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decla2branchbc_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decla2branchbc_2_1_preparereturnvalue_black = pattern_decla2branchbc_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decla2branchbc_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decla2branchbc_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decla2branchbc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decla2branchbc_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("d");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("l");
		EObject _localVariable_3 = match.getObject("b");
		EObject tmpD = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpL = _localVariable_2;
		EObject tmpB = _localVariable_3;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpL instanceof Assignment) {
					Assignment l = (Assignment) tmpL;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						return new Object[] { d, a, l, b, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_2_2_corematch_blackBBFBFBB(Decision d, While a,
			Assignment l, Assignment b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(l)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { d, a, c, l, d2c, b, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_2_3_findcontext_blackBBBBBB(Decision d, While a,
			Branch c, Assignment l, S2B d2c, Assignment b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(l)) {
			if (a.equals(d.getPositive())) {
				if (l.equals(a.getLast())) {
					if (b.equals(d.getNegative())) {
						if (c.equals(d2c.getTarget())) {
							if (d.equals(d2c.getSource())) {
								_result.add(new Object[] { d, a, c, l, d2c, b });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_2_3_findcontext_greenBBBBBBFFFFFF(Decision d, While a, Branch c,
			Assignment l, S2B d2c, Assignment b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(b);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { d, a, c, l, d2c, b, isApplicableMatch, d__a____positive, a__l____last, d__b____negative,
				d2c__c____target, d2c__d____source };
	}

	public static final Object[] pattern_decla2branchbc_2_4_solveCSP_bindingFBBBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, Decision d, While a, Branch c, Assignment l, S2B d2c, Assignment b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, d, a, c, l, d2c, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, a, c, l, d2c, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, Decision d, While a, Branch c, Assignment l, S2B d2c, Assignment b) {
		Object[] result_pattern_decla2branchbc_2_4_solveCSP_binding = pattern_decla2branchbc_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d, a, c, l, d2c, b);
		if (result_pattern_decla2branchbc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_2_4_solveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_2_4_solveCSP_black = pattern_decla2branchbc_2_4_solveCSP_blackB(csp);
			if (result_pattern_decla2branchbc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, a, c, l, d2c, b };
			}
		}
		return null;
	}

	public static final boolean pattern_decla2branchbc_2_5_checkCSP_expressionFBB(decla2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decla2branchbc_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decla2branchbc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decla2branchbc_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_10_1_initialbindings_blackBBBBBB(decla2branchbc _this,
			Match match, Branch c, Branch x, Command z, Command y) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { _this, match, c, x, z, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_10_2_SolveCSP_bindingFBBBBBB(decla2branchbc _this, Match match,
			Branch c, Branch x, Command z, Command y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, c, x, z, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, x, z, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_10_2_SolveCSP_bindingAndBlackFBBBBBB(decla2branchbc _this,
			Match match, Branch c, Branch x, Command z, Command y) {
		Object[] result_pattern_decla2branchbc_10_2_SolveCSP_binding = pattern_decla2branchbc_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, c, x, z, y);
		if (result_pattern_decla2branchbc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_10_2_SolveCSP_black = pattern_decla2branchbc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decla2branchbc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, x, z, y };
			}
		}
		return null;
	}

	public static final boolean pattern_decla2branchbc_10_3_CheckCSP_expressionFBB(decla2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Branch c, Branch x, Command z, Command y) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, c, x, z, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_10_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Branch c, Branch x, Command z, Command y) {
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String z__x____next_name_prime = "next";
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		return new Object[] { match, c, x, z, y, c__y____negative, c__x____positive, z__x____next };
	}

	public static final Object[] pattern_decla2branchbc_10_5_collectcontextelements_blackBBBBB(Match match, Branch c,
			Branch x, Command z, Command y) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, c, x, z, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decla2branchbc_10_6_registerobjectstomatch_expressionBBBBBB(decla2branchbc _this,
			Match match, Branch c, Branch x, Command z, Command y) {
		_this.registerObjectsToMatch_BWD(match, c, x, z, y);

	}

	public static final boolean pattern_decla2branchbc_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decla2branchbc_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("x");
		EObject _localVariable_3 = isApplicableMatch.getObject("z");
		EObject _localVariable_4 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("y");
		EObject tmpD = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpD2c = _localVariable_4;
		EObject tmpY = _localVariable_5;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						if (tmpD2c instanceof S2B) {
							S2B d2c = (S2B) tmpD2c;
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								return new Object[] { d, c, x, z, d2c, y, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_11_1_performtransformation_blackBBBBBBFBB(Decision d, Branch c,
			Branch x, Command z, S2B d2c, Command y, decla2branchbc _this, IsApplicableMatch isApplicableMatch) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { d, c, x, z, d2c, y, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decla2branchbc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decla2branchbc_11_1_performtransformation_binding = pattern_decla2branchbc_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decla2branchbc_11_1_performtransformation_binding != null) {
			Decision d = (Decision) result_pattern_decla2branchbc_11_1_performtransformation_binding[0];
			Branch c = (Branch) result_pattern_decla2branchbc_11_1_performtransformation_binding[1];
			Branch x = (Branch) result_pattern_decla2branchbc_11_1_performtransformation_binding[2];
			Command z = (Command) result_pattern_decla2branchbc_11_1_performtransformation_binding[3];
			S2B d2c = (S2B) result_pattern_decla2branchbc_11_1_performtransformation_binding[4];
			Command y = (Command) result_pattern_decla2branchbc_11_1_performtransformation_binding[5];

			Object[] result_pattern_decla2branchbc_11_1_performtransformation_black = pattern_decla2branchbc_11_1_performtransformation_blackBBBBBBFBB(
					d, c, x, z, d2c, y, _this, isApplicableMatch);
			if (result_pattern_decla2branchbc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decla2branchbc_11_1_performtransformation_black[6];

				return new Object[] { d, c, x, z, d2c, y, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_11_1_performtransformation_greenBFFFBBFFFB(Decision d, Branch x,
			Command z, Command y) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		l2z.setTarget(z);
		d.setPositive(a);
		a.setLast(l);
		l2z.setSource(l);
		a2x.setSource(a);
		a2x.setTarget(x);
		b2y.setTarget(y);
		d.setNegative(b);
		b2y.setSource(b);
		return new Object[] { d, l2z, a, l, x, z, a2x, b2y, b, y };
	}

	public static final Object[] pattern_decla2branchbc_11_2_collecttranslatedelements_blackBBBBBBBBB(S2N l2z, While a,
			Assignment l, Branch x, Command z, S2B a2x, S2N b2y, Assignment b, Command y) {
		if (!b2y.equals(l2z)) {
			if (!b.equals(l)) {
				if (!y.equals(z)) {
					return new Object[] { l2z, a, l, x, z, a2x, b2y, b, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_11_2_collecttranslatedelements_greenFBBBBBBBBB(S2N l2z, While a,
			Assignment l, Branch x, Command z, S2B a2x, S2N b2y, Assignment b, Command y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(y);
		return new Object[] { ruleresult, l2z, a, l, x, z, a2x, b2y, b, y };
	}

	public static final Object[] pattern_decla2branchbc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d, EObject l2z, EObject a, EObject c, EObject l, EObject x, EObject z,
			EObject a2x, EObject d2c, EObject b2y, EObject b, EObject y) {
		if (!d.equals(l2z)) {
			if (!d.equals(l)) {
				if (!d.equals(x)) {
					if (!d.equals(z)) {
						if (!d.equals(d2c)) {
							if (!d.equals(y)) {
								if (!l2z.equals(x)) {
									if (!l2z.equals(z)) {
										if (!l2z.equals(y)) {
											if (!a.equals(d)) {
												if (!a.equals(l2z)) {
													if (!a.equals(c)) {
														if (!a.equals(l)) {
															if (!a.equals(x)) {
																if (!a.equals(z)) {
																	if (!a.equals(a2x)) {
																		if (!a.equals(d2c)) {
																			if (!a.equals(b2y)) {
																				if (!a.equals(b)) {
																					if (!a.equals(y)) {
																						if (!c.equals(d)) {
																							if (!c.equals(l2z)) {
																								if (!c.equals(l)) {
																									if (!c.equals(x)) {
																										if (!c.equals(
																												z)) {
																											if (!c.equals(
																													d2c)) {
																												if (!c.equals(
																														y)) {
																													if (!l.equals(
																															l2z)) {
																														if (!l.equals(
																																x)) {
																															if (!l.equals(
																																	z)) {
																																if (!l.equals(
																																		y)) {
																																	if (!x.equals(
																																			z)) {
																																		if (!x.equals(
																																				y)) {
																																			if (!a2x.equals(
																																					d)) {
																																				if (!a2x.equals(
																																						l2z)) {
																																					if (!a2x.equals(
																																							c)) {
																																						if (!a2x.equals(
																																								l)) {
																																							if (!a2x.equals(
																																									x)) {
																																								if (!a2x.equals(
																																										z)) {
																																									if (!a2x.equals(
																																											d2c)) {
																																										if (!a2x.equals(
																																												b2y)) {
																																											if (!a2x.equals(
																																													b)) {
																																												if (!a2x.equals(
																																														y)) {
																																													if (!d2c.equals(
																																															l2z)) {
																																														if (!d2c.equals(
																																																l)) {
																																															if (!d2c.equals(
																																																	x)) {
																																																if (!d2c.equals(
																																																		z)) {
																																																	if (!d2c.equals(
																																																			y)) {
																																																		if (!b2y.equals(
																																																				d)) {
																																																			if (!b2y.equals(
																																																					l2z)) {
																																																				if (!b2y.equals(
																																																						c)) {
																																																					if (!b2y.equals(
																																																							l)) {
																																																						if (!b2y.equals(
																																																								x)) {
																																																							if (!b2y.equals(
																																																									z)) {
																																																								if (!b2y.equals(
																																																										d2c)) {
																																																									if (!b2y.equals(
																																																											y)) {
																																																										if (!b.equals(
																																																												d)) {
																																																											if (!b.equals(
																																																													l2z)) {
																																																												if (!b.equals(
																																																														c)) {
																																																													if (!b.equals(
																																																															l)) {
																																																														if (!b.equals(
																																																																x)) {
																																																															if (!b.equals(
																																																																	z)) {
																																																																if (!b.equals(
																																																																		d2c)) {
																																																																	if (!b.equals(
																																																																			b2y)) {
																																																																		if (!b.equals(
																																																																				y)) {
																																																																			if (!y.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						d,
																																																																						l2z,
																																																																						a,
																																																																						c,
																																																																						l,
																																																																						x,
																																																																						z,
																																																																						a2x,
																																																																						d2c,
																																																																						b2y,
																																																																						b,
																																																																						y };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decla2branchbc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject d, EObject l2z, EObject a, EObject c, EObject l, EObject x, EObject z,
			EObject a2x, EObject b2y, EObject b, EObject y) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decla2branchbc";
		String d__a____positive_name_prime = "positive";
		String a__l____last_name_prime = "last";
		String c__y____negative_name_prime = "negative";
		String l2z__l____source_name_prime = "source";
		String c__x____positive_name_prime = "positive";
		String z__x____next_name_prime = "next";
		String l2z__z____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String d__b____negative_name_prime = "negative";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		return new Object[] { ruleresult, d, l2z, a, c, l, x, z, a2x, b2y, b, y, d__a____positive, a__l____last,
				c__y____negative, l2z__l____source, c__x____positive, z__x____next, l2z__z____target, a2x__a____source,
				a2x__x____target, d__b____negative, b2y__b____source, b2y__y____target };
	}

	public static final void pattern_decla2branchbc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(decla2branchbc _this,
			PerformRuleResult ruleresult, EObject d, EObject l2z, EObject a, EObject c, EObject l, EObject x, EObject z,
			EObject a2x, EObject d2c, EObject b2y, EObject b, EObject y) {
		_this.registerObjects_BWD(ruleresult, d, l2z, a, c, l, x, z, a2x, d2c, b2y, b, y);

	}

	public static final PerformRuleResult pattern_decla2branchbc_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_12_1_preparereturnvalue_bindingFB(decla2branchbc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_12_1_preparereturnvalue_blackFBB(EClass eClass,
			decla2branchbc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_12_1_preparereturnvalue_bindingAndBlackFFB(
			decla2branchbc _this) {
		Object[] result_pattern_decla2branchbc_12_1_preparereturnvalue_binding = pattern_decla2branchbc_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decla2branchbc_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decla2branchbc_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decla2branchbc_12_1_preparereturnvalue_black = pattern_decla2branchbc_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decla2branchbc_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decla2branchbc_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decla2branchbc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decla2branchbc_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("z");
		EObject _localVariable_3 = match.getObject("y");
		EObject tmpC = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpY = _localVariable_3;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						return new Object[] { c, x, z, y, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_12_2_corematch_blackFBBBFBB(Branch c, Branch x,
			Command z, Command y, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
						"target")) {
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						_result.add(new Object[] { d, c, x, z, d2c, y, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_12_3_findcontext_blackBBBBBB(Decision d, Branch c,
			Branch x, Command z, S2B d2c, Command y) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				if (y.equals(c.getNegative())) {
					if (x.equals(c.getPositive())) {
						if (x.equals(z.getNext())) {
							if (c.equals(d2c.getTarget())) {
								if (d.equals(d2c.getSource())) {
									_result.add(new Object[] { d, c, x, z, d2c, y });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_12_3_findcontext_greenBBBBBBFFFFFF(Decision d, Branch c,
			Branch x, Command z, S2B d2c, Command y) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String z__x____next_name_prime = "next";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(y);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { d, c, x, z, d2c, y, isApplicableMatch, c__y____negative, c__x____positive, z__x____next,
				d2c__c____target, d2c__d____source };
	}

	public static final Object[] pattern_decla2branchbc_12_4_solveCSP_bindingFBBBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch c, Branch x, Command z, S2B d2c, Command y) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, d, c, x, z, d2c, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, c, x, z, d2c, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch c, Branch x, Command z, S2B d2c, Command y) {
		Object[] result_pattern_decla2branchbc_12_4_solveCSP_binding = pattern_decla2branchbc_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d, c, x, z, d2c, y);
		if (result_pattern_decla2branchbc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_12_4_solveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_12_4_solveCSP_black = pattern_decla2branchbc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decla2branchbc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, c, x, z, d2c, y };
			}
		}
		return null;
	}

	public static final boolean pattern_decla2branchbc_12_5_checkCSP_expressionFBB(decla2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decla2branchbc_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decla2branchbc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decla2branchbc_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_20_1_preparereturnvalue_bindingFB(decla2branchbc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decla2branchbc _this) {
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

	public static final Object[] pattern_decla2branchbc_20_1_preparereturnvalue_bindingAndBlackFFBF(
			decla2branchbc _this) {
		Object[] result_pattern_decla2branchbc_20_1_preparereturnvalue_binding = pattern_decla2branchbc_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decla2branchbc_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decla2branchbc_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decla2branchbc_20_1_preparereturnvalue_black = pattern_decla2branchbc_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decla2branchbc_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decla2branchbc_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decla2branchbc_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_501845 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_1BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_918357 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_918357)) {
					if (!c.equals(__DEC_x_positive_918357)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_2BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_506184 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_506184)) {
					if (!c.equals(__DEC_x_negative_506184)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_62230 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_4BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_positive_598236 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_z_positive_598236)) {
					if (!x.equals(__DEC_z_positive_598236)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_5BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_negative_569589 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_z_negative_569589)) {
					if (!x.equals(__DEC_z_negative_569589)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_218342 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_7BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_468361 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_y_positive_468361)) {
					if (!x.equals(__DEC_y_positive_468361)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_8BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_378762 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_y_negative_378762)) {
					if (!x.equals(__DEC_y_negative_378762)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_9BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_10BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_11BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_13BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_14BB(Branch c, Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_15BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_16BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_negative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_negative.getSrc();
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			EObject tmpY = _edge_negative.getTrg();
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (y.equals(c.getNegative())) {
					Node tmpX = c.getPositive();
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (!c.equals(x)) {
							if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_6B(y) == null) {
								if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_14BB(c, y) == null) {
									if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
										if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_1BB(x,
												c) == null) {
											if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_2BB(x,
													c) == null) {
												if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_7BBB(y,
														c, x) == null) {
													if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_8BBB(
															y, c, x) == null) {
														if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_9BB(
																c, x) == null) {
															if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_15BB(
																	x, y) == null) {
																if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_16BB(
																		x, y) == null) {
																	for (Node tmpZ : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(x, Node.class,
																					"next")) {
																		if (tmpZ instanceof Command) {
																			Command z = (Command) tmpZ;
																			if (!y.equals(z)) {
																				if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_3B(
																						z) == null) {
																					if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_4BBB(
																							z, c, x) == null) {
																						if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_5BBB(
																								z, c, x) == null) {
																							if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_10BB(
																									c, z) == null) {
																								if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_11BB(
																										x, z) == null) {
																									if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_12BB(
																											c,
																											z) == null) {
																										if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_13BB(
																												x,
																												z) == null) {
																											_result.add(
																													new Object[] {
																															c,
																															x,
																															z,
																															y,
																															_edge_negative });
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decla2branchbc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decla2branchbc _this, Match match, Branch c, Branch x, Command z, Command y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, c, x, z, y);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decla2branchbc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decla2branchbc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decla2branchbc_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_21_1_preparereturnvalue_bindingFB(decla2branchbc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decla2branchbc _this) {
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

	public static final Object[] pattern_decla2branchbc_21_1_preparereturnvalue_bindingAndBlackFFBF(
			decla2branchbc _this) {
		Object[] result_pattern_decla2branchbc_21_1_preparereturnvalue_binding = pattern_decla2branchbc_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decla2branchbc_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decla2branchbc_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decla2branchbc_21_1_preparereturnvalue_black = pattern_decla2branchbc_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decla2branchbc_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decla2branchbc_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decla2branchbc_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_0BB(While a, Decision d) {
		for (Decision __DEC_a_negative_349424 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_349424)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_1B(While a) {
		for (While __DEC_a_first_796750 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_796750)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_2B(While a) {
		for (While __DEC_a_last_256804 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_256804)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_3B(While a) {
		for (Program __DEC_a_first_617306 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_4BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_161570 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_161570)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_5BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_641712 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_641712)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_6BB(Assignment l, While a) {
		for (While __DEC_l_first_439395 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!a.equals(__DEC_l_first_439395)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_7BB(Assignment l, While a) {
		for (While __DEC_l_last_508199 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_508199)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_8B(Assignment l) {
		for (Program __DEC_l_first_50961 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_9BB(Assignment b,
			Decision d) {
		for (Decision __DEC_b_positive_427266 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_427266)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_10BB(Assignment b,
			While a) {
		for (While __DEC_b_first_186967 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_186967)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_11BB(Assignment b,
			While a) {
		for (While __DEC_b_last_946587 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_946587)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_692028 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_13BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_14BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_15BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_16BB(While a,
			Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_17BB(Decision d,
			Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_18BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_19BB(While a,
			Assignment b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpD = _edge_positive.getSrc();
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			EObject tmpA = _edge_positive.getTrg();
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (a.equals(d.getPositive())) {
					Statement tmpB = d.getNegative();
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						Statement tmpL = a.getLast();
						if (tmpL instanceof Assignment) {
							Assignment l = (Assignment) tmpL;
							if (!b.equals(l)) {
								if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_0BB(a, d) == null) {
									if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_1B(a) == null) {
										if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_2B(a) == null) {
											if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_3B(
													a) == null) {
												if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_13BB(d,
														a) == null) {
													if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_9BB(
															b, d) == null) {
														if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_10BB(
																b, a) == null) {
															if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_11BB(
																	b, a) == null) {
																if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_12B(
																		b) == null) {
																	if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_17BB(
																			d, b) == null) {
																		if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_18BB(
																				a, b) == null) {
																			if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_19BB(
																					a, b) == null) {
																				if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_4BB(
																						l, d) == null) {
																					if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_5BB(
																							l, d) == null) {
																						if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_6BB(
																								l, a) == null) {
																							if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_7BB(
																									l, a) == null) {
																								if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_8B(
																										l) == null) {
																									if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_14BB(
																											d,
																											l) == null) {
																										if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_15BB(
																												d,
																												l) == null) {
																											if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_16BB(
																													a,
																													l) == null) {
																												_result.add(
																														new Object[] {
																																d,
																																a,
																																l,
																																b,
																																_edge_positive });
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decla2branchbc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decla2branchbc _this, Match match, Decision d, While a, Assignment l, Assignment b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, d, a, l, b);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decla2branchbc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decla2branchbc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decla2branchbc_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_24_1_prepare_blackB(decla2branchbc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decla2branchbc_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_decla2branchbc_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("d");
		EObject _localVariable_1 = sourceMatch.getObject("a");
		EObject _localVariable_2 = targetMatch.getObject("c");
		EObject _localVariable_3 = sourceMatch.getObject("l");
		EObject _localVariable_4 = targetMatch.getObject("x");
		EObject _localVariable_5 = targetMatch.getObject("z");
		EObject _localVariable_6 = sourceMatch.getObject("b");
		EObject _localVariable_7 = targetMatch.getObject("y");
		EObject tmpD = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpL = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		EObject tmpB = _localVariable_6;
		EObject tmpY = _localVariable_7;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpZ instanceof Command) {
								Command z = (Command) tmpZ;
								if (tmpB instanceof Assignment) {
									Assignment b = (Assignment) tmpB;
									if (tmpY instanceof Command) {
										Command y = (Command) tmpY;
										return new Object[] { d, a, c, l, x, z, b, y, sourceMatch, targetMatch };
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

	public static final Object[] pattern_decla2branchbc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Decision d, While a,
			Branch c, Assignment l, Branch x, Command z, Assignment b, Command y, Match sourceMatch,
			Match targetMatch) {
		if (!c.equals(x)) {
			if (!b.equals(l)) {
				if (!y.equals(z)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { d, a, c, l, x, z, b, y, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding = pattern_decla2branchbc_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding != null) {
			Decision d = (Decision) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[0];
			While a = (While) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[1];
			Branch c = (Branch) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[2];
			Assignment l = (Assignment) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[3];
			Branch x = (Branch) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[4];
			Command z = (Command) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[5];
			Assignment b = (Assignment) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[6];
			Command y = (Command) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decla2branchbc_24_2_matchsrctrgcontext_black = pattern_decla2branchbc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					d, a, c, l, x, z, b, y, sourceMatch, targetMatch);
			if (result_pattern_decla2branchbc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { d, a, c, l, x, z, b, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_24_3_solvecsp_bindingFBBBBBBBBBBB(decla2branchbc _this,
			Decision d, While a, Branch c, Assignment l, Branch x, Command z, Assignment b, Command y,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(d, a, c, l, x, z, b, y, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, d, a, c, l, x, z, b, y, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(decla2branchbc _this,
			Decision d, While a, Branch c, Assignment l, Branch x, Command z, Assignment b, Command y,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decla2branchbc_24_3_solvecsp_binding = pattern_decla2branchbc_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, d, a, c, l, x, z, b, y, sourceMatch, targetMatch);
		if (result_pattern_decla2branchbc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_24_3_solvecsp_binding[0];

			Object[] result_pattern_decla2branchbc_24_3_solvecsp_black = pattern_decla2branchbc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decla2branchbc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, d, a, c, l, x, z, b, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decla2branchbc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_24_5_matchcorrcontext_blackBBFBB(Decision d, Branch c,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				if (d.equals(d2c.getSource())) {
					_result.add(new Object[] { d, c, d2c, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_24_5_matchcorrcontext_greenBBBF(S2B d2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "decla2branchbc";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_decla2branchbc_24_6_createcorrespondence_blackBBBBBBBBB(Decision d, While a,
			Branch c, Assignment l, Branch x, Command z, Assignment b, Command y, CCMatch ccMatch) {
		if (!c.equals(x)) {
			if (!b.equals(l)) {
				if (!y.equals(z)) {
					return new Object[] { d, a, c, l, x, z, b, y, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_24_6_createcorrespondence_greenFBBBBFFBBB(While a, Assignment l,
			Branch x, Command z, Assignment b, Command y, CCMatch ccMatch) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { l2z, a, l, x, z, a2x, b2y, b, y, ccMatch };
	}

	public static final Object[] pattern_decla2branchbc_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_decla2branchbc_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "decla2branchbc";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_decla2branchbc_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_0BB(While a, Decision d) {
		for (Decision __DEC_a_negative_820145 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_820145)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_1B(While a) {
		for (While __DEC_a_first_377070 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_377070)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_2B(While a) {
		for (While __DEC_a_last_871098 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_871098)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_3B(While a) {
		for (Program __DEC_a_first_233903 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_4BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_600975 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_600975)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_5BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_961937 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_961937)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_6BB(Assignment l, While a) {
		for (While __DEC_l_first_174281 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!a.equals(__DEC_l_first_174281)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_7BB(Assignment l, While a) {
		for (While __DEC_l_last_529564 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_529564)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_8B(Assignment l) {
		for (Program __DEC_l_first_561228 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_9BB(Assignment b, Decision d) {
		for (Decision __DEC_b_positive_770952 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_770952)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_10BB(Assignment b, While a) {
		for (While __DEC_b_first_91247 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_91247)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_11BB(Assignment b, While a) {
		for (While __DEC_b_last_767845 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_767845)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_91357 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_13BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_14BB(Decision d, Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_15BB(Decision d, Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_16BB(While a, Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_17BB(Decision d, Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_18BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_19BB(While a, Assignment b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_blackBBBB(Decision d, While a,
			Assignment l, Assignment b) {
		if (!b.equals(l)) {
			if (a.equals(d.getPositive())) {
				if (l.equals(a.getLast())) {
					if (b.equals(d.getNegative())) {
						if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_0BB(a, d) == null) {
							if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_1B(a) == null) {
								if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_2B(a) == null) {
									if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_3B(a) == null) {
										if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_4BB(l, d) == null) {
											if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_5BB(l,
													d) == null) {
												if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_6BB(l,
														a) == null) {
													if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_7BB(l,
															a) == null) {
														if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_8B(
																l) == null) {
															if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_9BB(
																	b, d) == null) {
																if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_10BB(
																		b, a) == null) {
																	if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_11BB(
																			b, a) == null) {
																		if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_12B(
																				b) == null) {
																			if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_13BB(
																					d, a) == null) {
																				if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_14BB(
																						d, l) == null) {
																					if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_15BB(
																							d, l) == null) {
																						if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_16BB(
																								a, l) == null) {
																							if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_17BB(
																									d, b) == null) {
																								if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_18BB(
																										a, b) == null) {
																									if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_19BB(
																											a,
																											b) == null) {
																										return new Object[] {
																												d, a, l,
																												b };
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_decla2branchbc_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decla2branchbc_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_494436 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_1BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_464459 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_464459)) {
					if (!c.equals(__DEC_x_positive_464459)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_2BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_942060 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_942060)) {
					if (!c.equals(__DEC_x_negative_942060)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_324446 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_4BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_positive_756392 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_z_positive_756392)) {
					if (!x.equals(__DEC_z_positive_756392)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_5BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_negative_317914 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_z_negative_317914)) {
					if (!x.equals(__DEC_z_negative_317914)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_251009 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_7BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_277138 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_y_positive_277138)) {
					if (!x.equals(__DEC_y_positive_277138)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_8BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_360031 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_y_negative_360031)) {
					if (!x.equals(__DEC_y_negative_360031)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_9BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_10BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_11BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_13BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_14BB(Branch c, Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_15BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_16BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_blackBBBB(Branch c, Branch x, Command z,
			Command y) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				if (y.equals(c.getNegative())) {
					if (x.equals(c.getPositive())) {
						if (x.equals(z.getNext())) {
							if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_0B(x) == null) {
								if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_1BB(x, c) == null) {
									if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_2BB(x, c) == null) {
										if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_3B(z) == null) {
											if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_4BBB(z, c,
													x) == null) {
												if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_5BBB(z, c,
														x) == null) {
													if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_6B(
															y) == null) {
														if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_7BBB(
																y, c, x) == null) {
															if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_8BBB(
																	y, c, x) == null) {
																if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_9BB(
																		c, x) == null) {
																	if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_10BB(
																			c, z) == null) {
																		if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_11BB(
																				x, z) == null) {
																			if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_12BB(
																					c, z) == null) {
																				if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_13BB(
																						x, z) == null) {
																					if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_14BB(
																							c, y) == null) {
																						if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_15BB(
																								x, y) == null) {
																							if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_16BB(
																									x, y) == null) {
																								return new Object[] { c,
																										x, z, y };
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_decla2branchbc_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decla2branchbc_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_29_1_createresult_blackB(decla2branchbc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decla2branchbc_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_decla2branchbc_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList d2cList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpD2c : d2cList.getEntryObjects()) {
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						Branch c = d2c.getTarget();
						if (c != null) {
							if (pattern_decla2branchbc_29_2_isapplicablecore_black_nac_1BB(ruleResult, d2c) == null) {
								if (pattern_decla2branchbc_29_2_isapplicablecore_black_nac_0BB(ruleResult, d) == null) {
									if (pattern_decla2branchbc_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											c) == null) {
										_result.add(
												new Object[] { d2cList, d, d2c, c, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_decla2branchbc_29_3_solveCSP_bindingFBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d, c, d2c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_29_3_solveCSP_bindingAndBlackFBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decla2branchbc_29_3_solveCSP_binding = pattern_decla2branchbc_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d, c, d2c, ruleResult);
		if (result_pattern_decla2branchbc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_29_3_solveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_29_3_solveCSP_black = pattern_decla2branchbc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decla2branchbc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decla2branchbc_29_4_checkCSP_expressionFBB(decla2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_29_5_checknacs_blackBBB(Decision d, Branch c, S2B d2c) {
		return new Object[] { d, c, d2c };
	}

	public static final Object[] pattern_decla2branchbc_29_6_perform_blackBBBB(Decision d, Branch c, S2B d2c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d, c, d2c, ruleResult };
	}

	public static final Object[] pattern_decla2branchbc_29_6_perform_greenBFFBFFFFFFFB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(l2z);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		a.setLast(l);
		l2z.setSource(l);
		ruleResult.getSourceObjects().add(l);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		z.setNext(x);
		l2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		a2x.setSource(a);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.getCorrObjects().add(b2y);
		d.setNegative(b);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		c.setNegative(y);
		b2y.setTarget(y);
		ruleResult.getTargetObjects().add(y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { d, l2z, a, c, l, x, z, a2x, b2y, b, y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decla2branchbc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decla2branchbcImpl
