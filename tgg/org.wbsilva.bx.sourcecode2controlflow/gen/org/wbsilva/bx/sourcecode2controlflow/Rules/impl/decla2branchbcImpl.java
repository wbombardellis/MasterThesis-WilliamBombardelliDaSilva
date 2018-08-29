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
	public boolean isAppropriate_FWD(Match match, Assignment l, While a, Decision d, Assignment b) {

		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_0_1_initialbindings_blackBBBBBB(this, match,
				l, a, d, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = " + d + ", "
					+ "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, l, a, d, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = " + d + ", "
					+ "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decla2branchbcImpl.pattern_decla2branchbc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decla2branchbcImpl
					.pattern_decla2branchbc_0_4_collectelementstobetranslated_blackBBBBB(match, l, a, d, b);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
			}
			decla2branchbcImpl.pattern_decla2branchbc_0_4_collectelementstobetranslated_greenBBBBBFFF(match, l, a, d,
					b);
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decla2branchbcImpl
					.pattern_decla2branchbc_0_5_collectcontextelements_blackBBBBB(match, l, a, d, b);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ".");
			}
			decla2branchbcImpl.pattern_decla2branchbc_0_5_collectcontextelements_greenBB(match, d);

			// 
			decla2branchbcImpl.pattern_decla2branchbc_0_6_registerobjectstomatch_expressionBBBBBB(this, match, l, a, d,
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
		S2B d2c = (S2B) result1_bindingAndBlack[0];
		Branch c = (Branch) result1_bindingAndBlack[1];
		Assignment l = (Assignment) result1_bindingAndBlack[2];
		While a = (While) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		Assignment b = (Assignment) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decla2branchbcImpl.pattern_decla2branchbc_1_1_performtransformation_greenFBBBFFFFFB(c,
				l, a, b);
		Command z = (Command) result1_green[0];
		Branch x = (Branch) result1_green[4];
		Command y = (Command) result1_green[5];
		S2N l2z = (S2N) result1_green[6];
		S2N b2y = (S2N) result1_green[7];
		S2B a2x = (S2B) result1_green[8];

		Object[] result2_black = decla2branchbcImpl
				.pattern_decla2branchbc_1_2_collecttranslatedelements_blackBBBBBBBBB(z, l, a, x, y, l2z, b2y, a2x, b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", " + "[l] = " + l
					+ ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[l2z] = " + l2z + ", "
					+ "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = decla2branchbcImpl
				.pattern_decla2branchbc_1_2_collecttranslatedelements_greenFBBBBBBBBB(z, l, a, x, y, l2z, b2y, a2x, b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decla2branchbcImpl.pattern_decla2branchbc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, d2c, z, c, l, a, x, d, y, l2z, b2y, a2x, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d2c] = " + d2c + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[l] = " + l + ", "
					+ "[a] = " + a + ", " + "[x] = " + x + ", " + "[d] = " + d + ", " + "[y] = " + y + ", " + "[l2z] = "
					+ l2z + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ".");
		}
		decla2branchbcImpl.pattern_decla2branchbc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, z,
				c, l, a, x, d, y, l2z, b2y, a2x, b);
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[23];

		// 
		// 
		decla2branchbcImpl.pattern_decla2branchbc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, d2c, z,
				c, l, a, x, d, y, l2z, b2y, a2x, b);
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
		Assignment l = (Assignment) result2_binding[0];
		While a = (While) result2_binding[1];
		Decision d = (Decision) result2_binding[2];
		Assignment b = (Assignment) result2_binding[3];
		for (Object[] result2_black : decla2branchbcImpl.pattern_decla2branchbc_2_2_corematch_blackFFBBBBB(l, a, d, b,
				match)) {
			S2B d2c = (S2B) result2_black[0];
			Branch c = (Branch) result2_black[1];
			// ForEach 
			for (Object[] result3_black : decla2branchbcImpl.pattern_decla2branchbc_2_3_findcontext_blackBBBBBB(d2c, c,
					l, a, d, b)) {
				Object[] result3_green = decla2branchbcImpl
						.pattern_decla2branchbc_2_3_findcontext_greenBBBBBBFFFFFF(d2c, c, l, a, d, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decla2branchbcImpl
						.pattern_decla2branchbc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d2c, c,
								l, a, d, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[c] = "
							+ c + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b
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
	public void registerObjectsToMatch_FWD(Match match, Assignment l, While a, Decision d, Assignment b) {
		match.registerObject("l", l);
		match.registerObject("a", a);
		match.registerObject("d", d);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment l, While a, Decision d, Assignment b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Assignment l, While a,
			Decision d, Assignment b) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject d2c, EObject z, EObject c, EObject l,
			EObject a, EObject x, EObject d, EObject y, EObject l2z, EObject b2y, EObject a2x, EObject b) {
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command z, Branch c, Branch x, Command y) {

		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_10_1_initialbindings_blackBBBBBB(this, match,
				z, c, x, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", "
					+ "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, z, c, x, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", "
					+ "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decla2branchbcImpl.pattern_decla2branchbc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decla2branchbcImpl
					.pattern_decla2branchbc_10_4_collectelementstobetranslated_blackBBBBB(match, z, c, x, y);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			decla2branchbcImpl.pattern_decla2branchbc_10_4_collectelementstobetranslated_greenBBBBBFFF(match, z, c, x,
					y);
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decla2branchbcImpl
					.pattern_decla2branchbc_10_5_collectcontextelements_blackBBBBB(match, z, c, x, y);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			decla2branchbcImpl.pattern_decla2branchbc_10_5_collectcontextelements_greenBB(match, c);

			// 
			decla2branchbcImpl.pattern_decla2branchbc_10_6_registerobjectstomatch_expressionBBBBBB(this, match, z, c, x,
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
		S2B d2c = (S2B) result1_bindingAndBlack[0];
		Command z = (Command) result1_bindingAndBlack[1];
		Branch c = (Branch) result1_bindingAndBlack[2];
		Branch x = (Branch) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		Command y = (Command) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decla2branchbcImpl.pattern_decla2branchbc_11_1_performtransformation_greenBFFBBBFFFF(z,
				x, d, y);
		Assignment l = (Assignment) result1_green[1];
		While a = (While) result1_green[2];
		S2N l2z = (S2N) result1_green[6];
		S2N b2y = (S2N) result1_green[7];
		S2B a2x = (S2B) result1_green[8];
		Assignment b = (Assignment) result1_green[9];

		Object[] result2_black = decla2branchbcImpl
				.pattern_decla2branchbc_11_2_collecttranslatedelements_blackBBBBBBBBB(z, l, a, x, y, l2z, b2y, a2x, b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", " + "[l] = " + l
					+ ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[l2z] = " + l2z + ", "
					+ "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = decla2branchbcImpl
				.pattern_decla2branchbc_11_2_collecttranslatedelements_greenFBBBBBBBBB(z, l, a, x, y, l2z, b2y, a2x, b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decla2branchbcImpl.pattern_decla2branchbc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, d2c, z, c, l, a, x, d, y, l2z, b2y, a2x, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d2c] = " + d2c + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[l] = " + l + ", "
					+ "[a] = " + a + ", " + "[x] = " + x + ", " + "[d] = " + d + ", " + "[y] = " + y + ", " + "[l2z] = "
					+ l2z + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ".");
		}
		decla2branchbcImpl.pattern_decla2branchbc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, z,
				c, l, a, x, d, y, l2z, b2y, a2x, b);
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[23];

		// 
		// 
		decla2branchbcImpl.pattern_decla2branchbc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, d2c,
				z, c, l, a, x, d, y, l2z, b2y, a2x, b);
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
		Command z = (Command) result2_binding[0];
		Branch c = (Branch) result2_binding[1];
		Branch x = (Branch) result2_binding[2];
		Command y = (Command) result2_binding[3];
		for (Object[] result2_black : decla2branchbcImpl.pattern_decla2branchbc_12_2_corematch_blackFBBBFBB(z, c, x, y,
				match)) {
			S2B d2c = (S2B) result2_black[0];
			Decision d = (Decision) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decla2branchbcImpl.pattern_decla2branchbc_12_3_findcontext_blackBBBBBB(d2c, z,
					c, x, d, y)) {
				Object[] result3_green = decla2branchbcImpl
						.pattern_decla2branchbc_12_3_findcontext_greenBBBBBBFFFFFF(d2c, z, c, x, d, y);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decla2branchbcImpl
						.pattern_decla2branchbc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d2c, z,
								c, x, d, y);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[z] = "
							+ z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[d] = " + d + ", " + "[y] = " + y
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
	public void registerObjectsToMatch_BWD(Match match, Command z, Branch c, Branch x, Command y) {
		match.registerObject("z", z);
		match.registerObject("c", c);
		match.registerObject("x", x);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command z, Branch c, Branch x, Command y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B d2c, Command z, Branch c, Branch x,
			Decision d, Command y) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject d2c, EObject z, EObject c, EObject l,
			EObject a, EObject x, EObject d, EObject y, EObject l2z, EObject b2y, EObject a2x, EObject b) {
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_102(EMoflonEdge _edge_next) {

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
				.pattern_decla2branchbc_20_2_testcorematchandDECs_blackFFFFB(_edge_next)) {
			Command z = (Command) result2_black[0];
			Branch c = (Branch) result2_black[1];
			Branch x = (Branch) result2_black[2];
			Command y = (Command) result2_black[3];
			Object[] result2_green = decla2branchbcImpl
					.pattern_decla2branchbc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decla2branchbcImpl
					.pattern_decla2branchbc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, z, c, x, y)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_102(EMoflonEdge _edge_last) {

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
				.pattern_decla2branchbc_21_2_testcorematchandDECs_blackFFFFB(_edge_last)) {
			Assignment l = (Assignment) result2_black[0];
			While a = (While) result2_black[1];
			Decision d = (Decision) result2_black[2];
			Assignment b = (Assignment) result2_black[3];
			Object[] result2_green = decla2branchbcImpl
					.pattern_decla2branchbc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decla2branchbcImpl
					.pattern_decla2branchbc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, l, a, d, b)) {
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
		Command z = (Command) result2_bindingAndBlack[0];
		Branch c = (Branch) result2_bindingAndBlack[1];
		Assignment l = (Assignment) result2_bindingAndBlack[2];
		While a = (While) result2_bindingAndBlack[3];
		Branch x = (Branch) result2_bindingAndBlack[4];
		Decision d = (Decision) result2_bindingAndBlack[5];
		Command y = (Command) result2_bindingAndBlack[6];
		Assignment b = (Assignment) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, z, c, l, a, x, d, y, b,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[x] = "
					+ x + ", " + "[d] = " + d + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decla2branchbcImpl.pattern_decla2branchbc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decla2branchbcImpl.pattern_decla2branchbc_24_5_matchcorrcontext_blackFBBBB(c,
					d, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[0];
				Object[] result5_green = decla2branchbcImpl.pattern_decla2branchbc_24_5_matchcorrcontext_greenBBBF(d2c,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decla2branchbcImpl
						.pattern_decla2branchbc_24_6_createcorrespondence_blackBBBBBBBBB(z, c, l, a, x, d, y, b,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", "
							+ "[c] = " + c + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[x] = " + x + ", "
							+ "[d] = " + d + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decla2branchbcImpl.pattern_decla2branchbc_24_6_createcorrespondence_greenBBBBBFFFBB(z, l, a, x, y, b,
						ccMatch);
				//nothing S2N l2z = (S2N) result6_green[5];
				//nothing S2N b2y = (S2N) result6_green[6];
				//nothing S2B a2x = (S2B) result6_green[7];

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
	public CSP isApplicable_solveCsp_CC(Command z, Branch c, Assignment l, While a, Branch x, Decision d, Command y,
			Assignment b, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment l, While a, Decision d, Assignment b) {// 
		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_27_1_matchtggpattern_blackBBBB(l, a, d, b);
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
	public boolean checkDEC_BWD(Command z, Branch c, Branch x, Command y) {// 
		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_28_1_matchtggpattern_blackBBBB(z, c, x, y);
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
			S2B d2c = (S2B) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = decla2branchbcImpl
					.pattern_decla2branchbc_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d2c, c, d,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decla2branchbcImpl.pattern_decla2branchbc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decla2branchbcImpl.pattern_decla2branchbc_29_5_checknacs_blackBBB(d2c, c, d);
				if (result5_black != null) {

					Object[] result6_black = decla2branchbcImpl.pattern_decla2branchbc_29_6_perform_blackBBBB(d2c, c, d,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2c] = " + d2c + ", "
								+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decla2branchbcImpl.pattern_decla2branchbc_29_6_perform_greenFBFFFBFFFFFB(c, d, ruleResult);
					//nothing Command z = (Command) result6_green[0];
					//nothing Assignment l = (Assignment) result6_green[2];
					//nothing While a = (While) result6_green[3];
					//nothing Branch x = (Branch) result6_green[4];
					//nothing Command y = (Command) result6_green[6];
					//nothing S2N l2z = (S2N) result6_green[7];
					//nothing S2N b2y = (S2N) result6_green[8];
					//nothing S2B a2x = (S2B) result6_green[9];
					//nothing Assignment b = (Assignment) result6_green[10];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d", d);
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
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_DECISION_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_DECISION_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3), (Assignment) arguments.get(4));
			return null;
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_DECISION_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2B_BRANCH_ASSIGNMENT_WHILE_DECISION_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(Decision) arguments.get(5), (Assignment) arguments.get(6));
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
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
			return null;
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_COMMAND_BRANCH_BRANCH_DECISION_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Decision) arguments.get(5), (Command) arguments.get(6));
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
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_102__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_102((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_102__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_102((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_CC__COMMAND_BRANCH_ASSIGNMENT_WHILE_BRANCH_DECISION_COMMAND_ASSIGNMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Command) arguments.get(0), (Branch) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Branch) arguments.get(4),
					(Decision) arguments.get(5), (Command) arguments.get(6), (Assignment) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___CHECK_DEC_FWD__ASSIGNMENT_WHILE_DECISION_ASSIGNMENT:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.DECLA2BRANCHBC___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH_COMMAND:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.DECLA2BRANCHBC___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECLA2BRANCHBC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (Decision) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decla2branchbc_0_1_initialbindings_blackBBBBBB(decla2branchbc _this,
			Match match, Assignment l, While a, Decision d, Assignment b) {
		if (!b.equals(l)) {
			return new Object[] { _this, match, l, a, d, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_0_2_SolveCSP_bindingFBBBBBB(decla2branchbc _this, Match match,
			Assignment l, While a, Decision d, Assignment b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, l, a, d, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, l, a, d, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_0_2_SolveCSP_bindingAndBlackFBBBBBB(decla2branchbc _this,
			Match match, Assignment l, While a, Decision d, Assignment b) {
		Object[] result_pattern_decla2branchbc_0_2_SolveCSP_binding = pattern_decla2branchbc_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, l, a, d, b);
		if (result_pattern_decla2branchbc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_0_2_SolveCSP_black = pattern_decla2branchbc_0_2_SolveCSP_blackB(csp);
			if (result_pattern_decla2branchbc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, l, a, d, b };
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
			Assignment l, While a, Decision d, Assignment b) {
		if (!b.equals(l)) {
			return new Object[] { match, l, a, d, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Assignment l, While a, Decision d, Assignment b) {
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { match, l, a, d, b, a__l____last, d__b____negative, d__a____positive };
	}

	public static final Object[] pattern_decla2branchbc_0_5_collectcontextelements_blackBBBBB(Match match, Assignment l,
			While a, Decision d, Assignment b) {
		if (!b.equals(l)) {
			return new Object[] { match, l, a, d, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decla2branchbc_0_6_registerobjectstomatch_expressionBBBBBB(decla2branchbc _this,
			Match match, Assignment l, While a, Decision d, Assignment b) {
		_this.registerObjectsToMatch_FWD(match, l, a, d, b);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("l");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject _localVariable_5 = isApplicableMatch.getObject("b");
		EObject tmpD2c = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpL = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpB = _localVariable_5;
		if (tmpD2c instanceof S2B) {
			S2B d2c = (S2B) tmpD2c;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpL instanceof Assignment) {
					Assignment l = (Assignment) tmpL;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								return new Object[] { d2c, c, l, a, d, b, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_1_1_performtransformation_blackBBBBBBFBB(S2B d2c, Branch c,
			Assignment l, While a, Decision d, Assignment b, decla2branchbc _this,
			IsApplicableMatch isApplicableMatch) {
		if (!b.equals(l)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { d2c, c, l, a, d, b, csp, _this, isApplicableMatch };
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
			S2B d2c = (S2B) result_pattern_decla2branchbc_1_1_performtransformation_binding[0];
			Branch c = (Branch) result_pattern_decla2branchbc_1_1_performtransformation_binding[1];
			Assignment l = (Assignment) result_pattern_decla2branchbc_1_1_performtransformation_binding[2];
			While a = (While) result_pattern_decla2branchbc_1_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decla2branchbc_1_1_performtransformation_binding[4];
			Assignment b = (Assignment) result_pattern_decla2branchbc_1_1_performtransformation_binding[5];

			Object[] result_pattern_decla2branchbc_1_1_performtransformation_black = pattern_decla2branchbc_1_1_performtransformation_blackBBBBBBFBB(
					d2c, c, l, a, d, b, _this, isApplicableMatch);
			if (result_pattern_decla2branchbc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decla2branchbc_1_1_performtransformation_black[6];

				return new Object[] { d2c, c, l, a, d, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_1_1_performtransformation_greenFBBBFFFFFB(Branch c,
			Assignment l, While a, Assignment b) {
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		z.setNext(x);
		c.setPositive(x);
		c.setNegative(y);
		l2z.setSource(l);
		l2z.setTarget(z);
		b2y.setTarget(y);
		b2y.setSource(b);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { z, c, l, a, x, y, l2z, b2y, a2x, b };
	}

	public static final Object[] pattern_decla2branchbc_1_2_collecttranslatedelements_blackBBBBBBBBB(Command z,
			Assignment l, While a, Branch x, Command y, S2N l2z, S2N b2y, S2B a2x, Assignment b) {
		if (!y.equals(z)) {
			if (!b2y.equals(l2z)) {
				if (!b.equals(l)) {
					return new Object[] { z, l, a, x, y, l2z, b2y, a2x, b };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_1_2_collecttranslatedelements_greenFBBBBBBBBB(Command z,
			Assignment l, While a, Branch x, Command y, S2N l2z, S2N b2y, S2B a2x, Assignment b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(b);
		return new Object[] { ruleresult, z, l, a, x, y, l2z, b2y, a2x, b };
	}

	public static final Object[] pattern_decla2branchbc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d2c, EObject z, EObject c, EObject l, EObject a, EObject x, EObject d,
			EObject y, EObject l2z, EObject b2y, EObject a2x, EObject b) {
		if (!d2c.equals(z)) {
			if (!d2c.equals(l)) {
				if (!d2c.equals(x)) {
					if (!d2c.equals(y)) {
						if (!d2c.equals(l2z)) {
							if (!c.equals(d2c)) {
								if (!c.equals(z)) {
									if (!c.equals(l)) {
										if (!c.equals(x)) {
											if (!c.equals(d)) {
												if (!c.equals(y)) {
													if (!c.equals(l2z)) {
														if (!l.equals(z)) {
															if (!l.equals(x)) {
																if (!l.equals(y)) {
																	if (!l.equals(l2z)) {
																		if (!a.equals(d2c)) {
																			if (!a.equals(z)) {
																				if (!a.equals(c)) {
																					if (!a.equals(l)) {
																						if (!a.equals(x)) {
																							if (!a.equals(d)) {
																								if (!a.equals(y)) {
																									if (!a.equals(
																											l2z)) {
																										if (!a.equals(
																												b2y)) {
																											if (!a.equals(
																													a2x)) {
																												if (!a.equals(
																														b)) {
																													if (!x.equals(
																															z)) {
																														if (!x.equals(
																																y)) {
																															if (!d.equals(
																																	d2c)) {
																																if (!d.equals(
																																		z)) {
																																	if (!d.equals(
																																			l)) {
																																		if (!d.equals(
																																				x)) {
																																			if (!d.equals(
																																					y)) {
																																				if (!d.equals(
																																						l2z)) {
																																					if (!y.equals(
																																							z)) {
																																						if (!l2z.equals(
																																								z)) {
																																							if (!l2z.equals(
																																									x)) {
																																								if (!l2z.equals(
																																										y)) {
																																									if (!b2y.equals(
																																											d2c)) {
																																										if (!b2y.equals(
																																												z)) {
																																											if (!b2y.equals(
																																													c)) {
																																												if (!b2y.equals(
																																														l)) {
																																													if (!b2y.equals(
																																															x)) {
																																														if (!b2y.equals(
																																																d)) {
																																															if (!b2y.equals(
																																																	y)) {
																																																if (!b2y.equals(
																																																		l2z)) {
																																																	if (!a2x.equals(
																																																			d2c)) {
																																																		if (!a2x.equals(
																																																				z)) {
																																																			if (!a2x.equals(
																																																					c)) {
																																																				if (!a2x.equals(
																																																						l)) {
																																																					if (!a2x.equals(
																																																							x)) {
																																																						if (!a2x.equals(
																																																								d)) {
																																																							if (!a2x.equals(
																																																									y)) {
																																																								if (!a2x.equals(
																																																										l2z)) {
																																																									if (!a2x.equals(
																																																											b2y)) {
																																																										if (!a2x.equals(
																																																												b)) {
																																																											if (!b.equals(
																																																													d2c)) {
																																																												if (!b.equals(
																																																														z)) {
																																																													if (!b.equals(
																																																															c)) {
																																																														if (!b.equals(
																																																																l)) {
																																																															if (!b.equals(
																																																																	x)) {
																																																																if (!b.equals(
																																																																		d)) {
																																																																	if (!b.equals(
																																																																			y)) {
																																																																		if (!b.equals(
																																																																				l2z)) {
																																																																			if (!b.equals(
																																																																					b2y)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						d2c,
																																																																						z,
																																																																						c,
																																																																						l,
																																																																						a,
																																																																						x,
																																																																						d,
																																																																						y,
																																																																						l2z,
																																																																						b2y,
																																																																						a2x,
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
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject z, EObject c, EObject l, EObject a, EObject x, EObject d, EObject y,
			EObject l2z, EObject b2y, EObject a2x, EObject b) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decla2branchbc";
		String z__x____next_name_prime = "next";
		String a__l____last_name_prime = "last";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		z__x____next.setName(z__x____next_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, z, c, l, a, x, d, y, l2z, b2y, a2x, b, z__x____next, a__l____last,
				c__x____positive, c__y____negative, d__b____negative, d__a____positive, l2z__l____source,
				l2z__z____target, b2y__y____target, a2x__x____target, a2x__a____source, b2y__b____source };
	}

	public static final void pattern_decla2branchbc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(decla2branchbc _this,
			PerformRuleResult ruleresult, EObject d2c, EObject z, EObject c, EObject l, EObject a, EObject x, EObject d,
			EObject y, EObject l2z, EObject b2y, EObject a2x, EObject b) {
		_this.registerObjects_FWD(ruleresult, d2c, z, c, l, a, x, d, y, l2z, b2y, a2x, b);

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
		EObject _localVariable_0 = match.getObject("l");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("d");
		EObject _localVariable_3 = match.getObject("b");
		EObject tmpL = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpB = _localVariable_3;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						return new Object[] { l, a, d, b, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_2_2_corematch_blackFFBBBBB(Assignment l, While a,
			Decision d, Assignment b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(l)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { d2c, c, l, a, d, b, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_2_3_findcontext_blackBBBBBB(S2B d2c, Branch c,
			Assignment l, While a, Decision d, Assignment b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(l)) {
			if (c.equals(d2c.getTarget())) {
				if (l.equals(a.getLast())) {
					if (b.equals(d.getNegative())) {
						if (a.equals(d.getPositive())) {
							if (d.equals(d2c.getSource())) {
								_result.add(new Object[] { d2c, c, l, a, d, b });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_2_3_findcontext_greenBBBBBBFFFFFF(S2B d2c, Branch c,
			Assignment l, While a, Decision d, Assignment b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(b);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d2c__c____target.setName(d2c__c____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { d2c, c, l, a, d, b, isApplicableMatch, d2c__c____target, a__l____last, d__b____negative,
				d__a____positive, d2c__d____source };
	}

	public static final Object[] pattern_decla2branchbc_2_4_solveCSP_bindingFBBBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Assignment l, While a, Decision d, Assignment b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, d2c, c, l, a, d, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, c, l, a, d, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Assignment l, While a, Decision d, Assignment b) {
		Object[] result_pattern_decla2branchbc_2_4_solveCSP_binding = pattern_decla2branchbc_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d2c, c, l, a, d, b);
		if (result_pattern_decla2branchbc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_2_4_solveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_2_4_solveCSP_black = pattern_decla2branchbc_2_4_solveCSP_blackB(csp);
			if (result_pattern_decla2branchbc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, c, l, a, d, b };
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
			Match match, Command z, Branch c, Branch x, Command y) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { _this, match, z, c, x, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_10_2_SolveCSP_bindingFBBBBBB(decla2branchbc _this, Match match,
			Command z, Branch c, Branch x, Command y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, c, x, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, c, x, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_10_2_SolveCSP_bindingAndBlackFBBBBBB(decla2branchbc _this,
			Match match, Command z, Branch c, Branch x, Command y) {
		Object[] result_pattern_decla2branchbc_10_2_SolveCSP_binding = pattern_decla2branchbc_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, z, c, x, y);
		if (result_pattern_decla2branchbc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_10_2_SolveCSP_black = pattern_decla2branchbc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decla2branchbc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, c, x, y };
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
			Command z, Branch c, Branch x, Command y) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, z, c, x, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_10_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Command z, Branch c, Branch x, Command y) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		String z__x____next_name_prime = "next";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		z__x____next.setName(z__x____next_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { match, z, c, x, y, z__x____next, c__x____positive, c__y____negative };
	}

	public static final Object[] pattern_decla2branchbc_10_5_collectcontextelements_blackBBBBB(Match match, Command z,
			Branch c, Branch x, Command y) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, z, c, x, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decla2branchbc_10_6_registerobjectstomatch_expressionBBBBBB(decla2branchbc _this,
			Match match, Command z, Branch c, Branch x, Command y) {
		_this.registerObjectsToMatch_BWD(match, z, c, x, y);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_1 = isApplicableMatch.getObject("z");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("x");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject _localVariable_5 = isApplicableMatch.getObject("y");
		EObject tmpD2c = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpY = _localVariable_5;
		if (tmpD2c instanceof S2B) {
			S2B d2c = (S2B) tmpD2c;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								return new Object[] { d2c, z, c, x, d, y, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_11_1_performtransformation_blackBBBBBBFBB(S2B d2c, Command z,
			Branch c, Branch x, Decision d, Command y, decla2branchbc _this, IsApplicableMatch isApplicableMatch) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { d2c, z, c, x, d, y, csp, _this, isApplicableMatch };
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
			S2B d2c = (S2B) result_pattern_decla2branchbc_11_1_performtransformation_binding[0];
			Command z = (Command) result_pattern_decla2branchbc_11_1_performtransformation_binding[1];
			Branch c = (Branch) result_pattern_decla2branchbc_11_1_performtransformation_binding[2];
			Branch x = (Branch) result_pattern_decla2branchbc_11_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decla2branchbc_11_1_performtransformation_binding[4];
			Command y = (Command) result_pattern_decla2branchbc_11_1_performtransformation_binding[5];

			Object[] result_pattern_decla2branchbc_11_1_performtransformation_black = pattern_decla2branchbc_11_1_performtransformation_blackBBBBBBFBB(
					d2c, z, c, x, d, y, _this, isApplicableMatch);
			if (result_pattern_decla2branchbc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decla2branchbc_11_1_performtransformation_black[6];

				return new Object[] { d2c, z, c, x, d, y, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_11_1_performtransformation_greenBFFBBBFFFF(Command z, Branch x,
			Decision d, Command y) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		a.setLast(l);
		d.setPositive(a);
		l2z.setSource(l);
		l2z.setTarget(z);
		b2y.setTarget(y);
		a2x.setTarget(x);
		a2x.setSource(a);
		d.setNegative(b);
		b2y.setSource(b);
		return new Object[] { z, l, a, x, d, y, l2z, b2y, a2x, b };
	}

	public static final Object[] pattern_decla2branchbc_11_2_collecttranslatedelements_blackBBBBBBBBB(Command z,
			Assignment l, While a, Branch x, Command y, S2N l2z, S2N b2y, S2B a2x, Assignment b) {
		if (!y.equals(z)) {
			if (!b2y.equals(l2z)) {
				if (!b.equals(l)) {
					return new Object[] { z, l, a, x, y, l2z, b2y, a2x, b };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_11_2_collecttranslatedelements_greenFBBBBBBBBB(Command z,
			Assignment l, While a, Branch x, Command y, S2N l2z, S2N b2y, S2B a2x, Assignment b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(b);
		return new Object[] { ruleresult, z, l, a, x, y, l2z, b2y, a2x, b };
	}

	public static final Object[] pattern_decla2branchbc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d2c, EObject z, EObject c, EObject l, EObject a, EObject x, EObject d,
			EObject y, EObject l2z, EObject b2y, EObject a2x, EObject b) {
		if (!d2c.equals(z)) {
			if (!d2c.equals(l)) {
				if (!d2c.equals(x)) {
					if (!d2c.equals(y)) {
						if (!d2c.equals(l2z)) {
							if (!c.equals(d2c)) {
								if (!c.equals(z)) {
									if (!c.equals(l)) {
										if (!c.equals(x)) {
											if (!c.equals(d)) {
												if (!c.equals(y)) {
													if (!c.equals(l2z)) {
														if (!l.equals(z)) {
															if (!l.equals(x)) {
																if (!l.equals(y)) {
																	if (!l.equals(l2z)) {
																		if (!a.equals(d2c)) {
																			if (!a.equals(z)) {
																				if (!a.equals(c)) {
																					if (!a.equals(l)) {
																						if (!a.equals(x)) {
																							if (!a.equals(d)) {
																								if (!a.equals(y)) {
																									if (!a.equals(
																											l2z)) {
																										if (!a.equals(
																												b2y)) {
																											if (!a.equals(
																													a2x)) {
																												if (!a.equals(
																														b)) {
																													if (!x.equals(
																															z)) {
																														if (!x.equals(
																																y)) {
																															if (!d.equals(
																																	d2c)) {
																																if (!d.equals(
																																		z)) {
																																	if (!d.equals(
																																			l)) {
																																		if (!d.equals(
																																				x)) {
																																			if (!d.equals(
																																					y)) {
																																				if (!d.equals(
																																						l2z)) {
																																					if (!y.equals(
																																							z)) {
																																						if (!l2z.equals(
																																								z)) {
																																							if (!l2z.equals(
																																									x)) {
																																								if (!l2z.equals(
																																										y)) {
																																									if (!b2y.equals(
																																											d2c)) {
																																										if (!b2y.equals(
																																												z)) {
																																											if (!b2y.equals(
																																													c)) {
																																												if (!b2y.equals(
																																														l)) {
																																													if (!b2y.equals(
																																															x)) {
																																														if (!b2y.equals(
																																																d)) {
																																															if (!b2y.equals(
																																																	y)) {
																																																if (!b2y.equals(
																																																		l2z)) {
																																																	if (!a2x.equals(
																																																			d2c)) {
																																																		if (!a2x.equals(
																																																				z)) {
																																																			if (!a2x.equals(
																																																					c)) {
																																																				if (!a2x.equals(
																																																						l)) {
																																																					if (!a2x.equals(
																																																							x)) {
																																																						if (!a2x.equals(
																																																								d)) {
																																																							if (!a2x.equals(
																																																									y)) {
																																																								if (!a2x.equals(
																																																										l2z)) {
																																																									if (!a2x.equals(
																																																											b2y)) {
																																																										if (!a2x.equals(
																																																												b)) {
																																																											if (!b.equals(
																																																													d2c)) {
																																																												if (!b.equals(
																																																														z)) {
																																																													if (!b.equals(
																																																															c)) {
																																																														if (!b.equals(
																																																																l)) {
																																																															if (!b.equals(
																																																																	x)) {
																																																																if (!b.equals(
																																																																		d)) {
																																																																	if (!b.equals(
																																																																			y)) {
																																																																		if (!b.equals(
																																																																				l2z)) {
																																																																			if (!b.equals(
																																																																					b2y)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						d2c,
																																																																						z,
																																																																						c,
																																																																						l,
																																																																						a,
																																																																						x,
																																																																						d,
																																																																						y,
																																																																						l2z,
																																																																						b2y,
																																																																						a2x,
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
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject z, EObject c, EObject l, EObject a, EObject x, EObject d, EObject y,
			EObject l2z, EObject b2y, EObject a2x, EObject b) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decla2branchbc";
		String z__x____next_name_prime = "next";
		String a__l____last_name_prime = "last";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		z__x____next.setName(z__x____next_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, z, c, l, a, x, d, y, l2z, b2y, a2x, b, z__x____next, a__l____last,
				c__x____positive, c__y____negative, d__b____negative, d__a____positive, l2z__l____source,
				l2z__z____target, b2y__y____target, a2x__x____target, a2x__a____source, b2y__b____source };
	}

	public static final void pattern_decla2branchbc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(decla2branchbc _this,
			PerformRuleResult ruleresult, EObject d2c, EObject z, EObject c, EObject l, EObject a, EObject x, EObject d,
			EObject y, EObject l2z, EObject b2y, EObject a2x, EObject b) {
		_this.registerObjects_BWD(ruleresult, d2c, z, c, l, a, x, d, y, l2z, b2y, a2x, b);

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
		EObject _localVariable_0 = match.getObject("z");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("x");
		EObject _localVariable_3 = match.getObject("y");
		EObject tmpZ = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpY = _localVariable_3;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						return new Object[] { z, c, x, y, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_12_2_corematch_blackFBBBFBB(Command z, Branch c,
			Branch x, Command y, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
						"target")) {
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						_result.add(new Object[] { d2c, z, c, x, d, y, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_12_3_findcontext_blackBBBBBB(S2B d2c, Command z,
			Branch c, Branch x, Decision d, Command y) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				if (x.equals(z.getNext())) {
					if (c.equals(d2c.getTarget())) {
						if (x.equals(c.getPositive())) {
							if (y.equals(c.getNegative())) {
								if (d.equals(d2c.getSource())) {
									_result.add(new Object[] { d2c, z, c, x, d, y });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_12_3_findcontext_greenBBBBBBFFFFFF(S2B d2c, Command z, Branch c,
			Branch x, Decision d, Command y) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String z__x____next_name_prime = "next";
		String d2c__c____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(y);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		z__x____next.setName(z__x____next_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { d2c, z, c, x, d, y, isApplicableMatch, z__x____next, d2c__c____target, c__x____positive,
				c__y____negative, d2c__d____source };
	}

	public static final Object[] pattern_decla2branchbc_12_4_solveCSP_bindingFBBBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Command z, Branch c, Branch x, Decision d, Command y) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, d2c, z, c, x, d, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, z, c, x, d, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Command z, Branch c, Branch x, Decision d, Command y) {
		Object[] result_pattern_decla2branchbc_12_4_solveCSP_binding = pattern_decla2branchbc_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d2c, z, c, x, d, y);
		if (result_pattern_decla2branchbc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_12_4_solveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_12_4_solveCSP_black = pattern_decla2branchbc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decla2branchbc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, z, c, x, d, y };
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

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_382586 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_1BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_positive_371648 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_z_positive_371648)) {
					if (!x.equals(__DEC_z_positive_371648)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_2BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_negative_72542 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_z_negative_72542)) {
					if (!x.equals(__DEC_z_negative_72542)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_943068 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_4BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_504086 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_504086)) {
					if (!c.equals(__DEC_x_positive_504086)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_5BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_393219 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_393219)) {
					if (!c.equals(__DEC_x_negative_393219)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_839581 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_7BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_749634 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_y_positive_749634)) {
					if (!x.equals(__DEC_y_positive_749634)) {
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
			for (Branch __DEC_y_negative_501150 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_y_negative_501150)) {
					if (!x.equals(__DEC_y_negative_501150)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_9BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_10BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_11BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_12BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_13BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
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
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpZ = _edge_next.getSrc();
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			EObject tmpX = _edge_next.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (x.equals(z.getNext())) {
					if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_0B(z) == null) {
						if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_3B(x) == null) {
							if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_10BB(x, z) == null) {
								if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_12BB(x, z) == null) {
									for (Branch c : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!c.equals(x)) {
											Node tmpY = c.getNegative();
											if (tmpY instanceof Command) {
												Command y = (Command) tmpY;
												if (!y.equals(z)) {
													if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_1BBB(
															z, c, x) == null) {
														if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_2BBB(
																z, c, x) == null) {
															if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_4BB(
																	x, c) == null) {
																if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_5BB(
																		x, c) == null) {
																	if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_9BB(
																			c, z) == null) {
																		if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_11BB(
																				c, z) == null) {
																			if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_13BB(
																					c, x) == null) {
																				if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_6B(
																						y) == null) {
																					if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_7BBB(
																							y, c, x) == null) {
																						if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_8BBB(
																								y, c, x) == null) {
																							if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_14BB(
																									c, y) == null) {
																								if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_15BB(
																										x, y) == null) {
																									if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_16BB(
																											x,
																											y) == null) {
																										_result.add(
																												new Object[] {
																														z,
																														c,
																														x,
																														y,
																														_edge_next });
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}

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
			decla2branchbc _this, Match match, Command z, Branch c, Branch x, Command y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, c, x, y);
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

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_0BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_979327 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_979327)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_1BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_145489 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_145489)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_2BB(Assignment l, While a) {
		for (While __DEC_l_first_984567 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!a.equals(__DEC_l_first_984567)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_3BB(Assignment l, While a) {
		for (While __DEC_l_last_52399 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_52399)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_4B(Assignment l) {
		for (Program __DEC_l_first_763166 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_5BB(While a, Decision d) {
		for (Decision __DEC_a_negative_428833 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_428833)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_6B(While a) {
		for (While __DEC_a_first_769463 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_769463)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_7B(While a) {
		for (While __DEC_a_last_340771 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_340771)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_8B(While a) {
		for (Program __DEC_a_first_911591 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_9BB(Assignment b,
			Decision d) {
		for (Decision __DEC_b_positive_22491 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_22491)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_10BB(Assignment b,
			While a) {
		for (While __DEC_b_first_897279 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_897279)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_11BB(Assignment b,
			While a) {
		for (While __DEC_b_last_522341 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_522341)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_16751 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_13BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_14BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_15BB(While a,
			Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_16BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
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
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpA = _edge_last.getSrc();
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			EObject tmpL = _edge_last.getTrg();
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (l.equals(a.getLast())) {
					if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_6B(a) == null) {
						if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_7B(a) == null) {
							if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_8B(a) == null) {
								if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_2BB(l, a) == null) {
									if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_3BB(l, a) == null) {
										if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_4B(l) == null) {
											if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_15BB(a,
													l) == null) {
												for (Decision d : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(a, Decision.class, "positive")) {
													Statement tmpB = d.getNegative();
													if (tmpB instanceof Assignment) {
														Assignment b = (Assignment) tmpB;
														if (!b.equals(l)) {
															if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_0BB(
																	l, d) == null) {
																if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_1BB(
																		l, d) == null) {
																	if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_5BB(
																			a, d) == null) {
																		if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_13BB(
																				d, l) == null) {
																			if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_14BB(
																					d, l) == null) {
																				if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_16BB(
																						d, a) == null) {
																					if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_9BB(
																							b, d) == null) {
																						if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_10BB(
																								b, a) == null) {
																							if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_11BB(
																									b, a) == null) {
																								if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_12B(
																										b) == null) {
																									if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_17BB(
																											d,
																											b) == null) {
																										if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_18BB(
																												a,
																												b) == null) {
																											if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_19BB(
																													a,
																													b) == null) {
																												_result.add(
																														new Object[] {
																																l,
																																a,
																																d,
																																b,
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
			decla2branchbc _this, Match match, Assignment l, While a, Decision d, Assignment b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, l, a, d, b);
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

	public static final Object[] pattern_decla2branchbc_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("z");
		EObject _localVariable_1 = targetMatch.getObject("c");
		EObject _localVariable_2 = sourceMatch.getObject("l");
		EObject _localVariable_3 = sourceMatch.getObject("a");
		EObject _localVariable_4 = targetMatch.getObject("x");
		EObject _localVariable_5 = sourceMatch.getObject("d");
		EObject _localVariable_6 = targetMatch.getObject("y");
		EObject _localVariable_7 = sourceMatch.getObject("b");
		EObject tmpZ = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpL = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpD = _localVariable_5;
		EObject tmpY = _localVariable_6;
		EObject tmpB = _localVariable_7;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpL instanceof Assignment) {
					Assignment l = (Assignment) tmpL;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								if (tmpY instanceof Command) {
									Command y = (Command) tmpY;
									if (tmpB instanceof Assignment) {
										Assignment b = (Assignment) tmpB;
										return new Object[] { z, c, l, a, x, d, y, b, targetMatch, sourceMatch };
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

	public static final Object[] pattern_decla2branchbc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Command z, Branch c,
			Assignment l, While a, Branch x, Decision d, Command y, Assignment b, Match sourceMatch,
			Match targetMatch) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				if (!b.equals(l)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { z, c, l, a, x, d, y, b, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding = pattern_decla2branchbc_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding != null) {
			Command z = (Command) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[0];
			Branch c = (Branch) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[1];
			Assignment l = (Assignment) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[2];
			While a = (While) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[3];
			Branch x = (Branch) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[4];
			Decision d = (Decision) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[5];
			Command y = (Command) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[6];
			Assignment b = (Assignment) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decla2branchbc_24_2_matchsrctrgcontext_black = pattern_decla2branchbc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					z, c, l, a, x, d, y, b, sourceMatch, targetMatch);
			if (result_pattern_decla2branchbc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { z, c, l, a, x, d, y, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_24_3_solvecsp_bindingFBBBBBBBBBBB(decla2branchbc _this,
			Command z, Branch c, Assignment l, While a, Branch x, Decision d, Command y, Assignment b,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(z, c, l, a, x, d, y, b, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, z, c, l, a, x, d, y, b, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(decla2branchbc _this,
			Command z, Branch c, Assignment l, While a, Branch x, Decision d, Command y, Assignment b,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decla2branchbc_24_3_solvecsp_binding = pattern_decla2branchbc_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, z, c, l, a, x, d, y, b, sourceMatch, targetMatch);
		if (result_pattern_decla2branchbc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_24_3_solvecsp_binding[0];

			Object[] result_pattern_decla2branchbc_24_3_solvecsp_black = pattern_decla2branchbc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decla2branchbc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, z, c, l, a, x, d, y, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decla2branchbc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_24_5_matchcorrcontext_blackFBBBB(Branch c, Decision d,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				if (d.equals(d2c.getSource())) {
					_result.add(new Object[] { d2c, c, d, sourceMatch, targetMatch });
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

	public static final Object[] pattern_decla2branchbc_24_6_createcorrespondence_blackBBBBBBBBB(Command z, Branch c,
			Assignment l, While a, Branch x, Decision d, Command y, Assignment b, CCMatch ccMatch) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				if (!b.equals(l)) {
					return new Object[] { z, c, l, a, x, d, y, b, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_24_6_createcorrespondence_greenBBBBBFFFBB(Command z,
			Assignment l, While a, Branch x, Command y, Assignment b, CCMatch ccMatch) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { z, l, a, x, y, l2z, b2y, a2x, b, ccMatch };
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

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_0BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_428127 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_428127)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_1BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_505234 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_505234)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_2BB(Assignment l, While a) {
		for (While __DEC_l_first_685760 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!a.equals(__DEC_l_first_685760)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_3BB(Assignment l, While a) {
		for (While __DEC_l_last_433255 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_433255)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_4B(Assignment l) {
		for (Program __DEC_l_first_970052 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_5BB(While a, Decision d) {
		for (Decision __DEC_a_negative_243804 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_243804)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_6B(While a) {
		for (While __DEC_a_first_315674 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_315674)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_7B(While a) {
		for (While __DEC_a_last_700740 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_700740)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_8B(While a) {
		for (Program __DEC_a_first_118813 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_9BB(Assignment b, Decision d) {
		for (Decision __DEC_b_positive_796307 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_796307)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_10BB(Assignment b, While a) {
		for (While __DEC_b_first_633759 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_633759)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_11BB(Assignment b, While a) {
		for (While __DEC_b_last_84814 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_84814)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_285248 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_13BB(Decision d, Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_14BB(Decision d, Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_15BB(While a, Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_16BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
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

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_blackBBBB(Assignment l, While a,
			Decision d, Assignment b) {
		if (!b.equals(l)) {
			if (l.equals(a.getLast())) {
				if (b.equals(d.getNegative())) {
					if (a.equals(d.getPositive())) {
						if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_0BB(l, d) == null) {
							if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_1BB(l, d) == null) {
								if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_2BB(l, a) == null) {
									if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_3BB(l, a) == null) {
										if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_4B(l) == null) {
											if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_5BB(a,
													d) == null) {
												if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_6B(
														a) == null) {
													if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_7B(
															a) == null) {
														if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_8B(
																a) == null) {
															if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_9BB(
																	b, d) == null) {
																if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_10BB(
																		b, a) == null) {
																	if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_11BB(
																			b, a) == null) {
																		if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_12B(
																				b) == null) {
																			if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_13BB(
																					d, l) == null) {
																				if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_14BB(
																						d, l) == null) {
																					if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_15BB(
																							a, l) == null) {
																						if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_16BB(
																								d, a) == null) {
																							if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_17BB(
																									d, b) == null) {
																								if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_18BB(
																										a, b) == null) {
																									if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_19BB(
																											a,
																											b) == null) {
																										return new Object[] {
																												l, a, d,
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

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_631838 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_1BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_positive_682549 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_z_positive_682549)) {
					if (!x.equals(__DEC_z_positive_682549)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_2BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_negative_172140 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_z_negative_172140)) {
					if (!x.equals(__DEC_z_negative_172140)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_720814 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_4BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_441072 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_441072)) {
					if (!c.equals(__DEC_x_positive_441072)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_5BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_350196 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_350196)) {
					if (!c.equals(__DEC_x_negative_350196)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_186242 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_7BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_93888 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_y_positive_93888)) {
					if (!x.equals(__DEC_y_positive_93888)) {
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
			for (Branch __DEC_y_negative_665638 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_y_negative_665638)) {
					if (!x.equals(__DEC_y_negative_665638)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_9BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_10BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_11BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_12BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_13BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
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

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_blackBBBB(Command z, Branch c, Branch x,
			Command y) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				if (x.equals(z.getNext())) {
					if (x.equals(c.getPositive())) {
						if (y.equals(c.getNegative())) {
							if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_0B(z) == null) {
								if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_1BBB(z, c, x) == null) {
									if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_2BBB(z, c, x) == null) {
										if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_3B(x) == null) {
											if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_4BB(x,
													c) == null) {
												if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_5BB(x,
														c) == null) {
													if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_6B(
															y) == null) {
														if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_7BBB(
																y, c, x) == null) {
															if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_8BBB(
																	y, c, x) == null) {
																if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_9BB(
																		c, z) == null) {
																	if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_10BB(
																			x, z) == null) {
																		if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_11BB(
																				c, z) == null) {
																			if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_12BB(
																					x, z) == null) {
																				if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_13BB(
																						c, x) == null) {
																					if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_14BB(
																							c, y) == null) {
																						if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_15BB(
																								x, y) == null) {
																							if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_16BB(
																									x, y) == null) {
																								return new Object[] { z,
																										c, x, y };
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
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
					Branch c = d2c.getTarget();
					if (c != null) {
						Statement tmpD = d2c.getSource();
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (pattern_decla2branchbc_29_2_isapplicablecore_black_nac_0BB(ruleResult, d2c) == null) {
								if (pattern_decla2branchbc_29_2_isapplicablecore_black_nac_1BB(ruleResult, c) == null) {
									if (pattern_decla2branchbc_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											d) == null) {
										_result.add(
												new Object[] { d2cList, d2c, c, d, ruleEntryContainer, ruleResult });
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
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d2c, c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_29_3_solveCSP_bindingAndBlackFBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decla2branchbc_29_3_solveCSP_binding = pattern_decla2branchbc_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d2c, c, d, ruleResult);
		if (result_pattern_decla2branchbc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_29_3_solveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_29_3_solveCSP_black = pattern_decla2branchbc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decla2branchbc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decla2branchbc_29_4_checkCSP_expressionFBB(decla2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_29_5_checknacs_blackBBB(S2B d2c, Branch c, Decision d) {
		return new Object[] { d2c, c, d };
	}

	public static final Object[] pattern_decla2branchbc_29_6_perform_blackBBBB(S2B d2c, Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d2c, c, d, ruleResult };
	}

	public static final Object[] pattern_decla2branchbc_29_6_perform_greenFBFFFBFFFFFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(z);
		ruleResult.getSourceObjects().add(l);
		a.setLast(l);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		z.setNext(x);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		l2z.setSource(l);
		l2z.setTarget(z);
		ruleResult.getCorrObjects().add(l2z);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		d.setNegative(b);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { z, c, l, a, x, d, y, l2z, b2y, a2x, b, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decla2branchbc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decla2branchbcImpl
