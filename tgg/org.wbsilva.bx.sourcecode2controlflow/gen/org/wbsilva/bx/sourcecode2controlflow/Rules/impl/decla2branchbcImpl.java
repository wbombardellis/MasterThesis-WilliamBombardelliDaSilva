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
	public boolean isAppropriate_FWD(Match match, Assignment b, While a, Assignment l, Decision d) {

		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_0_1_initialbindings_blackBBBBBB(this, match,
				b, a, l, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[l] = " + l + ", "
					+ "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, b, a, l, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[l] = " + l + ", "
					+ "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decla2branchbcImpl.pattern_decla2branchbc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decla2branchbcImpl
					.pattern_decla2branchbc_0_4_collectelementstobetranslated_blackBBBBB(match, b, a, l, d);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[d] = " + d + ".");
			}
			decla2branchbcImpl.pattern_decla2branchbc_0_4_collectelementstobetranslated_greenBBBBBFFF(match, b, a, l,
					d);
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decla2branchbcImpl
					.pattern_decla2branchbc_0_5_collectcontextelements_blackBBBBB(match, b, a, l, d);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[d] = " + d + ".");
			}
			decla2branchbcImpl.pattern_decla2branchbc_0_5_collectcontextelements_greenBB(match, d);

			// 
			decla2branchbcImpl.pattern_decla2branchbc_0_6_registerobjectstomatch_expressionBBBBBB(this, match, b, a, l,
					d);
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
		Branch c = (Branch) result1_bindingAndBlack[0];
		Assignment b = (Assignment) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		While a = (While) result1_bindingAndBlack[3];
		Assignment l = (Assignment) result1_bindingAndBlack[4];
		Decision d = (Decision) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decla2branchbcImpl.pattern_decla2branchbc_1_1_performtransformation_greenFBFFBFBFBF(c,
				b, a, l);
		Command z = (Command) result1_green[0];
		S2N l2z = (S2N) result1_green[2];
		Command y = (Command) result1_green[3];
		S2B a2x = (S2B) result1_green[5];
		S2N b2y = (S2N) result1_green[7];
		Branch x = (Branch) result1_green[9];

		Object[] result2_black = decla2branchbcImpl
				.pattern_decla2branchbc_1_2_collecttranslatedelements_blackBBBBBBBBB(z, l2z, y, b, a2x, a, b2y, l, x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", " + "[l2z] = "
					+ l2z + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[a2x] = " + a2x + ", " + "[a] = " + a
					+ ", " + "[b2y] = " + b2y + ", " + "[l] = " + l + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = decla2branchbcImpl
				.pattern_decla2branchbc_1_2_collecttranslatedelements_greenFBBBBBBBBB(z, l2z, y, b, a2x, a, b2y, l, x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decla2branchbcImpl.pattern_decla2branchbc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, z, c, l2z, y, b, a2x, d2c, a, b2y, l, x, d);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[l2z] = " + l2z + ", " + "[y] = " + y + ", "
					+ "[b] = " + b + ", " + "[a2x] = " + a2x + ", " + "[d2c] = " + d2c + ", " + "[a] = " + a + ", "
					+ "[b2y] = " + b2y + ", " + "[l] = " + l + ", " + "[x] = " + x + ", " + "[d] = " + d + ".");
		}
		decla2branchbcImpl.pattern_decla2branchbc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, z,
				c, l2z, y, b, a2x, a, b2y, l, x, d);
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[23];

		// 
		// 
		decla2branchbcImpl.pattern_decla2branchbc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, z, c,
				l2z, y, b, a2x, d2c, a, b2y, l, x, d);
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
		Assignment b = (Assignment) result2_binding[0];
		While a = (While) result2_binding[1];
		Assignment l = (Assignment) result2_binding[2];
		Decision d = (Decision) result2_binding[3];
		for (Object[] result2_black : decla2branchbcImpl.pattern_decla2branchbc_2_2_corematch_blackFBFBBBB(b, a, l, d,
				match)) {
			Branch c = (Branch) result2_black[0];
			S2B d2c = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : decla2branchbcImpl.pattern_decla2branchbc_2_3_findcontext_blackBBBBBB(c, b,
					d2c, a, l, d)) {
				Object[] result3_green = decla2branchbcImpl.pattern_decla2branchbc_2_3_findcontext_greenBBBBBBFFFFFF(c,
						b, d2c, a, l, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decla2branchbcImpl
						.pattern_decla2branchbc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, c, b,
								d2c, a, l, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[b] = " + b
							+ ", " + "[d2c] = " + d2c + ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[d] = " + d
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
	public void registerObjectsToMatch_FWD(Match match, Assignment b, While a, Assignment l, Decision d) {
		match.registerObject("b", b);
		match.registerObject("a", a);
		match.registerObject("l", l);
		match.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment b, While a, Assignment l, Decision d) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch c, Assignment b, S2B d2c, While a,
			Assignment l, Decision d) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject z, EObject c, EObject l2z, EObject y,
			EObject b, EObject a2x, EObject d2c, EObject a, EObject b2y, EObject l, EObject x, EObject d) {
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command z, Branch c, Command y, Branch x) {

		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_10_1_initialbindings_blackBBBBBB(this, match,
				z, c, y, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[y] = " + y + ", "
					+ "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, z, c, y, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[y] = " + y + ", "
					+ "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decla2branchbcImpl.pattern_decla2branchbc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decla2branchbcImpl
					.pattern_decla2branchbc_10_4_collectelementstobetranslated_blackBBBBB(match, z, c, y, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
			}
			decla2branchbcImpl.pattern_decla2branchbc_10_4_collectelementstobetranslated_greenBBBBBFFF(match, z, c, y,
					x);
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decla2branchbcImpl
					.pattern_decla2branchbc_10_5_collectcontextelements_blackBBBBB(match, z, c, y, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
			}
			decla2branchbcImpl.pattern_decla2branchbc_10_5_collectcontextelements_greenBB(match, c);

			// 
			decla2branchbcImpl.pattern_decla2branchbc_10_6_registerobjectstomatch_expressionBBBBBB(this, match, z, c, y,
					x);
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
		Command z = (Command) result1_bindingAndBlack[0];
		Branch c = (Branch) result1_bindingAndBlack[1];
		Command y = (Command) result1_bindingAndBlack[2];
		S2B d2c = (S2B) result1_bindingAndBlack[3];
		Branch x = (Branch) result1_bindingAndBlack[4];
		Decision d = (Decision) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decla2branchbcImpl.pattern_decla2branchbc_11_1_performtransformation_greenBFBFFFFFBB(z,
				y, x, d);
		S2N l2z = (S2N) result1_green[1];
		Assignment b = (Assignment) result1_green[3];
		S2B a2x = (S2B) result1_green[4];
		While a = (While) result1_green[5];
		S2N b2y = (S2N) result1_green[6];
		Assignment l = (Assignment) result1_green[7];

		Object[] result2_black = decla2branchbcImpl
				.pattern_decla2branchbc_11_2_collecttranslatedelements_blackBBBBBBBBB(z, l2z, y, b, a2x, a, b2y, l, x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", " + "[l2z] = "
					+ l2z + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[a2x] = " + a2x + ", " + "[a] = " + a
					+ ", " + "[b2y] = " + b2y + ", " + "[l] = " + l + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = decla2branchbcImpl
				.pattern_decla2branchbc_11_2_collecttranslatedelements_greenFBBBBBBBBB(z, l2z, y, b, a2x, a, b2y, l, x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decla2branchbcImpl.pattern_decla2branchbc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, z, c, l2z, y, b, a2x, d2c, a, b2y, l, x, d);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[l2z] = " + l2z + ", " + "[y] = " + y + ", "
					+ "[b] = " + b + ", " + "[a2x] = " + a2x + ", " + "[d2c] = " + d2c + ", " + "[a] = " + a + ", "
					+ "[b2y] = " + b2y + ", " + "[l] = " + l + ", " + "[x] = " + x + ", " + "[d] = " + d + ".");
		}
		decla2branchbcImpl.pattern_decla2branchbc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, z,
				c, l2z, y, b, a2x, a, b2y, l, x, d);
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[23];

		// 
		// 
		decla2branchbcImpl.pattern_decla2branchbc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, z, c,
				l2z, y, b, a2x, d2c, a, b2y, l, x, d);
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
		Command y = (Command) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		for (Object[] result2_black : decla2branchbcImpl.pattern_decla2branchbc_12_2_corematch_blackBBBFBFB(z, c, y, x,
				match)) {
			S2B d2c = (S2B) result2_black[3];
			Decision d = (Decision) result2_black[5];
			// ForEach 
			for (Object[] result3_black : decla2branchbcImpl.pattern_decla2branchbc_12_3_findcontext_blackBBBBBB(z, c,
					y, d2c, x, d)) {
				Object[] result3_green = decla2branchbcImpl.pattern_decla2branchbc_12_3_findcontext_greenBBBBBBFFFFFF(z,
						c, y, d2c, x, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decla2branchbcImpl
						.pattern_decla2branchbc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, z, c, y,
								d2c, x, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[z] = " + z + ", " + "[c] = " + c
							+ ", " + "[y] = " + y + ", " + "[d2c] = " + d2c + ", " + "[x] = " + x + ", " + "[d] = " + d
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
	public void registerObjectsToMatch_BWD(Match match, Command z, Branch c, Command y, Branch x) {
		match.registerObject("z", z);
		match.registerObject("c", c);
		match.registerObject("y", y);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command z, Branch c, Command y, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command z, Branch c, Command y, S2B d2c,
			Branch x, Decision d) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject z, EObject c, EObject l2z, EObject y,
			EObject b, EObject a2x, EObject d2c, EObject a, EObject b2y, EObject l, EObject x, EObject d) {
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_43(EMoflonEdge _edge_next) {

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
			Command y = (Command) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Object[] result2_green = decla2branchbcImpl
					.pattern_decla2branchbc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decla2branchbcImpl
					.pattern_decla2branchbc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, z, c, y, x)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_43(EMoflonEdge _edge_negative) {

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
				.pattern_decla2branchbc_21_2_testcorematchandDECs_blackFFFFB(_edge_negative)) {
			Assignment b = (Assignment) result2_black[0];
			While a = (While) result2_black[1];
			Assignment l = (Assignment) result2_black[2];
			Decision d = (Decision) result2_black[3];
			Object[] result2_green = decla2branchbcImpl
					.pattern_decla2branchbc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decla2branchbcImpl
					.pattern_decla2branchbc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, b, a, l, d)) {
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
		Command y = (Command) result2_bindingAndBlack[2];
		Assignment b = (Assignment) result2_bindingAndBlack[3];
		While a = (While) result2_bindingAndBlack[4];
		Assignment l = (Assignment) result2_bindingAndBlack[5];
		Branch x = (Branch) result2_bindingAndBlack[6];
		Decision d = (Decision) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decla2branchbcImpl
				.pattern_decla2branchbc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, z, c, y, b, a, l, x, d,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[a] = "
					+ a + ", " + "[l] = " + l + ", " + "[x] = " + x + ", " + "[d] = " + d + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decla2branchbcImpl.pattern_decla2branchbc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decla2branchbcImpl.pattern_decla2branchbc_24_5_matchcorrcontext_blackBFBBB(c,
					d, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[1];
				Object[] result5_green = decla2branchbcImpl.pattern_decla2branchbc_24_5_matchcorrcontext_greenBBBF(d2c,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decla2branchbcImpl
						.pattern_decla2branchbc_24_6_createcorrespondence_blackBBBBBBBBB(z, c, y, b, a, l, x, d,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", "
							+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
							+ "[l] = " + l + ", " + "[x] = " + x + ", " + "[d] = " + d + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decla2branchbcImpl.pattern_decla2branchbc_24_6_createcorrespondence_greenBFBBFBFBBB(z, y, b, a, l, x,
						ccMatch);
				//nothing S2N l2z = (S2N) result6_green[1];
				//nothing S2B a2x = (S2B) result6_green[4];
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
	public CSP isApplicable_solveCsp_CC(Command z, Branch c, Command y, Assignment b, While a, Assignment l, Branch x,
			Decision d, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment b, While a, Assignment l, Decision d) {// 
		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_27_1_matchtggpattern_blackBBBB(b, a, l, d);
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
	public boolean checkDEC_BWD(Command z, Branch c, Command y, Branch x) {// 
		Object[] result1_black = decla2branchbcImpl.pattern_decla2branchbc_28_1_matchtggpattern_blackBBBB(z, c, y, x);
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
			Branch c = (Branch) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = decla2branchbcImpl
					.pattern_decla2branchbc_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, c, d2c, d,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d2c] = " + d2c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decla2branchbcImpl.pattern_decla2branchbc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decla2branchbcImpl.pattern_decla2branchbc_29_5_checknacs_blackBBB(c, d2c, d);
				if (result5_black != null) {

					Object[] result6_black = decla2branchbcImpl.pattern_decla2branchbc_29_6_perform_blackBBBB(c, d2c, d,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
								+ "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decla2branchbcImpl.pattern_decla2branchbc_29_6_perform_greenFBFFFFFFFFBB(c, d, ruleResult);
					//nothing Command z = (Command) result6_green[0];
					//nothing S2N l2z = (S2N) result6_green[2];
					//nothing Command y = (Command) result6_green[3];
					//nothing Assignment b = (Assignment) result6_green[4];
					//nothing S2B a2x = (S2B) result6_green[5];
					//nothing While a = (While) result6_green[6];
					//nothing S2N b2y = (S2N) result6_green[7];
					//nothing Assignment l = (Assignment) result6_green[8];
					//nothing Branch x = (Branch) result6_green[9];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
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
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4));
			return null;
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_ASSIGNMENT_S2B_WHILE_ASSIGNMENT_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Assignment) arguments.get(2), (S2B) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5), (Decision) arguments.get(6));
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
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_BRANCH_COMMAND_S2B_BRANCH_DECISION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (S2B) arguments.get(4),
					(Branch) arguments.get(5), (Decision) arguments.get(6));
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
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_43__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_43((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_43__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_43((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_CC__COMMAND_BRANCH_COMMAND_ASSIGNMENT_WHILE_ASSIGNMENT_BRANCH_DECISION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Command) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5), (Branch) arguments.get(6), (Decision) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECLA2BRANCHBC___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECLA2BRANCHBC___CHECK_DEC_FWD__ASSIGNMENT_WHILE_ASSIGNMENT_DECISION:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Decision) arguments.get(3));
		case RulesPackage.DECLA2BRANCHBC___CHECK_DEC_BWD__COMMAND_BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.DECLA2BRANCHBC___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECLA2BRANCHBC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Decision) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECLA2BRANCHBC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decla2branchbc_0_1_initialbindings_blackBBBBBB(decla2branchbc _this,
			Match match, Assignment b, While a, Assignment l, Decision d) {
		if (!b.equals(l)) {
			return new Object[] { _this, match, b, a, l, d };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_0_2_SolveCSP_bindingFBBBBBB(decla2branchbc _this, Match match,
			Assignment b, While a, Assignment l, Decision d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, a, l, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, a, l, d };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_0_2_SolveCSP_bindingAndBlackFBBBBBB(decla2branchbc _this,
			Match match, Assignment b, While a, Assignment l, Decision d) {
		Object[] result_pattern_decla2branchbc_0_2_SolveCSP_binding = pattern_decla2branchbc_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, b, a, l, d);
		if (result_pattern_decla2branchbc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_0_2_SolveCSP_black = pattern_decla2branchbc_0_2_SolveCSP_blackB(csp);
			if (result_pattern_decla2branchbc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, a, l, d };
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
			Assignment b, While a, Assignment l, Decision d) {
		if (!b.equals(l)) {
			return new Object[] { match, b, a, l, d };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Assignment b, While a, Assignment l, Decision d) {
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(l);
		String d__b____negative_name_prime = "negative";
		String a__l____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		d__b____negative.setName(d__b____negative_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { match, b, a, l, d, d__b____negative, a__l____last, d__a____positive };
	}

	public static final Object[] pattern_decla2branchbc_0_5_collectcontextelements_blackBBBBB(Match match, Assignment b,
			While a, Assignment l, Decision d) {
		if (!b.equals(l)) {
			return new Object[] { match, b, a, l, d };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decla2branchbc_0_6_registerobjectstomatch_expressionBBBBBB(decla2branchbc _this,
			Match match, Assignment b, While a, Assignment l, Decision d) {
		_this.registerObjectsToMatch_FWD(match, b, a, l, d);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject _localVariable_4 = isApplicableMatch.getObject("l");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject tmpC = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpL = _localVariable_4;
		EObject tmpD = _localVariable_5;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpL instanceof Assignment) {
							Assignment l = (Assignment) tmpL;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								return new Object[] { c, b, d2c, a, l, d, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_1_1_performtransformation_blackBBBBBBFBB(Branch c, Assignment b,
			S2B d2c, While a, Assignment l, Decision d, decla2branchbc _this, IsApplicableMatch isApplicableMatch) {
		if (!b.equals(l)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { c, b, d2c, a, l, d, csp, _this, isApplicableMatch };
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
			Branch c = (Branch) result_pattern_decla2branchbc_1_1_performtransformation_binding[0];
			Assignment b = (Assignment) result_pattern_decla2branchbc_1_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_decla2branchbc_1_1_performtransformation_binding[2];
			While a = (While) result_pattern_decla2branchbc_1_1_performtransformation_binding[3];
			Assignment l = (Assignment) result_pattern_decla2branchbc_1_1_performtransformation_binding[4];
			Decision d = (Decision) result_pattern_decla2branchbc_1_1_performtransformation_binding[5];

			Object[] result_pattern_decla2branchbc_1_1_performtransformation_black = pattern_decla2branchbc_1_1_performtransformation_blackBBBBBBFBB(
					c, b, d2c, a, l, d, _this, isApplicableMatch);
			if (result_pattern_decla2branchbc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decla2branchbc_1_1_performtransformation_black[6];

				return new Object[] { c, b, d2c, a, l, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_1_1_performtransformation_greenFBFFBFBFBF(Branch c,
			Assignment b, While a, Assignment l) {
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		l2z.setTarget(z);
		l2z.setSource(l);
		c.setNegative(y);
		a2x.setSource(a);
		b2y.setTarget(y);
		b2y.setSource(b);
		z.setNext(x);
		c.setPositive(x);
		a2x.setTarget(x);
		return new Object[] { z, c, l2z, y, b, a2x, a, b2y, l, x };
	}

	public static final Object[] pattern_decla2branchbc_1_2_collecttranslatedelements_blackBBBBBBBBB(Command z, S2N l2z,
			Command y, Assignment b, S2B a2x, While a, S2N b2y, Assignment l, Branch x) {
		if (!y.equals(z)) {
			if (!b.equals(l)) {
				if (!b2y.equals(l2z)) {
					return new Object[] { z, l2z, y, b, a2x, a, b2y, l, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_1_2_collecttranslatedelements_greenFBBBBBBBBB(Command z,
			S2N l2z, Command y, Assignment b, S2B a2x, While a, S2N b2y, Assignment l, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedElements().add(x);
		return new Object[] { ruleresult, z, l2z, y, b, a2x, a, b2y, l, x };
	}

	public static final Object[] pattern_decla2branchbc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject z, EObject c, EObject l2z, EObject y, EObject b, EObject a2x,
			EObject d2c, EObject a, EObject b2y, EObject l, EObject x, EObject d) {
		if (!c.equals(z)) {
			if (!c.equals(l2z)) {
				if (!c.equals(y)) {
					if (!c.equals(d2c)) {
						if (!c.equals(l)) {
							if (!c.equals(x)) {
								if (!c.equals(d)) {
									if (!l2z.equals(z)) {
										if (!l2z.equals(y)) {
											if (!l2z.equals(x)) {
												if (!y.equals(z)) {
													if (!b.equals(z)) {
														if (!b.equals(c)) {
															if (!b.equals(l2z)) {
																if (!b.equals(y)) {
																	if (!b.equals(d2c)) {
																		if (!b.equals(b2y)) {
																			if (!b.equals(l)) {
																				if (!b.equals(x)) {
																					if (!b.equals(d)) {
																						if (!a2x.equals(z)) {
																							if (!a2x.equals(c)) {
																								if (!a2x.equals(l2z)) {
																									if (!a2x.equals(
																											y)) {
																										if (!a2x.equals(
																												b)) {
																											if (!a2x.equals(
																													d2c)) {
																												if (!a2x.equals(
																														b2y)) {
																													if (!a2x.equals(
																															l)) {
																														if (!a2x.equals(
																																x)) {
																															if (!a2x.equals(
																																	d)) {
																																if (!d2c.equals(
																																		z)) {
																																	if (!d2c.equals(
																																			l2z)) {
																																		if (!d2c.equals(
																																				y)) {
																																			if (!d2c.equals(
																																					l)) {
																																				if (!d2c.equals(
																																						x)) {
																																					if (!a.equals(
																																							z)) {
																																						if (!a.equals(
																																								c)) {
																																							if (!a.equals(
																																									l2z)) {
																																								if (!a.equals(
																																										y)) {
																																									if (!a.equals(
																																											b)) {
																																										if (!a.equals(
																																												a2x)) {
																																											if (!a.equals(
																																													d2c)) {
																																												if (!a.equals(
																																														b2y)) {
																																													if (!a.equals(
																																															l)) {
																																														if (!a.equals(
																																																x)) {
																																															if (!a.equals(
																																																	d)) {
																																																if (!b2y.equals(
																																																		z)) {
																																																	if (!b2y.equals(
																																																			c)) {
																																																		if (!b2y.equals(
																																																				l2z)) {
																																																			if (!b2y.equals(
																																																					y)) {
																																																				if (!b2y.equals(
																																																						d2c)) {
																																																					if (!b2y.equals(
																																																							l)) {
																																																						if (!b2y.equals(
																																																								x)) {
																																																							if (!b2y.equals(
																																																									d)) {
																																																								if (!l.equals(
																																																										z)) {
																																																									if (!l.equals(
																																																											l2z)) {
																																																										if (!l.equals(
																																																												y)) {
																																																											if (!l.equals(
																																																													x)) {
																																																												if (!x.equals(
																																																														z)) {
																																																													if (!x.equals(
																																																															y)) {
																																																														if (!d.equals(
																																																																z)) {
																																																															if (!d.equals(
																																																																	l2z)) {
																																																																if (!d.equals(
																																																																		y)) {
																																																																	if (!d.equals(
																																																																			d2c)) {
																																																																		if (!d.equals(
																																																																				l)) {
																																																																			if (!d.equals(
																																																																					x)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						z,
																																																																						c,
																																																																						l2z,
																																																																						y,
																																																																						b,
																																																																						a2x,
																																																																						d2c,
																																																																						a,
																																																																						b2y,
																																																																						l,
																																																																						x,
																																																																						d };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject z, EObject c, EObject l2z, EObject y, EObject b, EObject a2x,
			EObject a, EObject b2y, EObject l, EObject x, EObject d) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decla2branchbc";
		String z__x____next_name_prime = "next";
		String c__x____positive_name_prime = "positive";
		String l2z__z____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String b2y__b____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String l2z__l____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String a__l____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		z__x____next.setName(z__x____next_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { ruleresult, z, c, l2z, y, b, a2x, a, b2y, l, x, d, z__x____next, c__x____positive,
				l2z__z____target, a2x__a____source, b2y__y____target, c__y____negative, b2y__b____source,
				a2x__x____target, l2z__l____source, d__b____negative, a__l____last, d__a____positive };
	}

	public static final void pattern_decla2branchbc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(decla2branchbc _this,
			PerformRuleResult ruleresult, EObject z, EObject c, EObject l2z, EObject y, EObject b, EObject a2x,
			EObject d2c, EObject a, EObject b2y, EObject l, EObject x, EObject d) {
		_this.registerObjects_FWD(ruleresult, z, c, l2z, y, b, a2x, d2c, a, b2y, l, x, d);

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
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("l");
		EObject _localVariable_3 = match.getObject("d");
		EObject tmpB = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpL = _localVariable_2;
		EObject tmpD = _localVariable_3;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpL instanceof Assignment) {
					Assignment l = (Assignment) tmpL;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						return new Object[] { b, a, l, d, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_2_2_corematch_blackFBFBBBB(Assignment b, While a,
			Assignment l, Decision d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(l)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { c, b, d2c, a, l, d, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_2_3_findcontext_blackBBBBBB(Branch c, Assignment b,
			S2B d2c, While a, Assignment l, Decision d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(l)) {
			if (c.equals(d2c.getTarget())) {
				if (b.equals(d.getNegative())) {
					if (d.equals(d2c.getSource())) {
						if (l.equals(a.getLast())) {
							if (a.equals(d.getPositive())) {
								_result.add(new Object[] { c, b, d2c, a, l, d });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_2_3_findcontext_greenBBBBBBFFFFFF(Branch c, Assignment b,
			S2B d2c, While a, Assignment l, Decision d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String d__b____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		String a__l____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(d);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { c, b, d2c, a, l, d, isApplicableMatch, d2c__c____target, d__b____negative,
				d2c__d____source, a__l____last, d__a____positive };
	}

	public static final Object[] pattern_decla2branchbc_2_4_solveCSP_bindingFBBBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, Branch c, Assignment b, S2B d2c, While a, Assignment l, Decision d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, b, d2c, a, l, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, b, d2c, a, l, d };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, Branch c, Assignment b, S2B d2c, While a, Assignment l, Decision d) {
		Object[] result_pattern_decla2branchbc_2_4_solveCSP_binding = pattern_decla2branchbc_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, c, b, d2c, a, l, d);
		if (result_pattern_decla2branchbc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_2_4_solveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_2_4_solveCSP_black = pattern_decla2branchbc_2_4_solveCSP_blackB(csp);
			if (result_pattern_decla2branchbc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, b, d2c, a, l, d };
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
			Match match, Command z, Branch c, Command y, Branch x) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { _this, match, z, c, y, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_10_2_SolveCSP_bindingFBBBBBB(decla2branchbc _this, Match match,
			Command z, Branch c, Command y, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, c, y, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, c, y, x };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_10_2_SolveCSP_bindingAndBlackFBBBBBB(decla2branchbc _this,
			Match match, Command z, Branch c, Command y, Branch x) {
		Object[] result_pattern_decla2branchbc_10_2_SolveCSP_binding = pattern_decla2branchbc_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, z, c, y, x);
		if (result_pattern_decla2branchbc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_10_2_SolveCSP_black = pattern_decla2branchbc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decla2branchbc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, c, y, x };
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
			Command z, Branch c, Command y, Branch x) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, z, c, y, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_10_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Command z, Branch c, Command y, Branch x) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
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
		return new Object[] { match, z, c, y, x, z__x____next, c__x____positive, c__y____negative };
	}

	public static final Object[] pattern_decla2branchbc_10_5_collectcontextelements_blackBBBBB(Match match, Command z,
			Branch c, Command y, Branch x) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, z, c, y, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decla2branchbc_10_6_registerobjectstomatch_expressionBBBBBB(decla2branchbc _this,
			Match match, Command z, Branch c, Command y, Branch x) {
		_this.registerObjectsToMatch_BWD(match, z, c, y, x);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("z");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("y");
		EObject _localVariable_3 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("x");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject tmpZ = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpD2c = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpD = _localVariable_5;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpD2c instanceof S2B) {
						S2B d2c = (S2B) tmpD2c;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								return new Object[] { z, c, y, d2c, x, d, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_11_1_performtransformation_blackBBBBBBFBB(Command z, Branch c,
			Command y, S2B d2c, Branch x, Decision d, decla2branchbc _this, IsApplicableMatch isApplicableMatch) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { z, c, y, d2c, x, d, csp, _this, isApplicableMatch };
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
			Command z = (Command) result_pattern_decla2branchbc_11_1_performtransformation_binding[0];
			Branch c = (Branch) result_pattern_decla2branchbc_11_1_performtransformation_binding[1];
			Command y = (Command) result_pattern_decla2branchbc_11_1_performtransformation_binding[2];
			S2B d2c = (S2B) result_pattern_decla2branchbc_11_1_performtransformation_binding[3];
			Branch x = (Branch) result_pattern_decla2branchbc_11_1_performtransformation_binding[4];
			Decision d = (Decision) result_pattern_decla2branchbc_11_1_performtransformation_binding[5];

			Object[] result_pattern_decla2branchbc_11_1_performtransformation_black = pattern_decla2branchbc_11_1_performtransformation_blackBBBBBBFBB(
					z, c, y, d2c, x, d, _this, isApplicableMatch);
			if (result_pattern_decla2branchbc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decla2branchbc_11_1_performtransformation_black[6];

				return new Object[] { z, c, y, d2c, x, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_11_1_performtransformation_greenBFBFFFFFBB(Command z, Command y,
			Branch x, Decision d) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		l2z.setTarget(z);
		d.setNegative(b);
		a2x.setTarget(x);
		a2x.setSource(a);
		d.setPositive(a);
		b2y.setTarget(y);
		b2y.setSource(b);
		l2z.setSource(l);
		a.setLast(l);
		return new Object[] { z, l2z, y, b, a2x, a, b2y, l, x, d };
	}

	public static final Object[] pattern_decla2branchbc_11_2_collecttranslatedelements_blackBBBBBBBBB(Command z,
			S2N l2z, Command y, Assignment b, S2B a2x, While a, S2N b2y, Assignment l, Branch x) {
		if (!y.equals(z)) {
			if (!b.equals(l)) {
				if (!b2y.equals(l2z)) {
					return new Object[] { z, l2z, y, b, a2x, a, b2y, l, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_11_2_collecttranslatedelements_greenFBBBBBBBBB(Command z,
			S2N l2z, Command y, Assignment b, S2B a2x, While a, S2N b2y, Assignment l, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getTranslatedElements().add(x);
		return new Object[] { ruleresult, z, l2z, y, b, a2x, a, b2y, l, x };
	}

	public static final Object[] pattern_decla2branchbc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject z, EObject c, EObject l2z, EObject y, EObject b, EObject a2x,
			EObject d2c, EObject a, EObject b2y, EObject l, EObject x, EObject d) {
		if (!c.equals(z)) {
			if (!c.equals(l2z)) {
				if (!c.equals(y)) {
					if (!c.equals(d2c)) {
						if (!c.equals(l)) {
							if (!c.equals(x)) {
								if (!c.equals(d)) {
									if (!l2z.equals(z)) {
										if (!l2z.equals(y)) {
											if (!l2z.equals(x)) {
												if (!y.equals(z)) {
													if (!b.equals(z)) {
														if (!b.equals(c)) {
															if (!b.equals(l2z)) {
																if (!b.equals(y)) {
																	if (!b.equals(d2c)) {
																		if (!b.equals(b2y)) {
																			if (!b.equals(l)) {
																				if (!b.equals(x)) {
																					if (!b.equals(d)) {
																						if (!a2x.equals(z)) {
																							if (!a2x.equals(c)) {
																								if (!a2x.equals(l2z)) {
																									if (!a2x.equals(
																											y)) {
																										if (!a2x.equals(
																												b)) {
																											if (!a2x.equals(
																													d2c)) {
																												if (!a2x.equals(
																														b2y)) {
																													if (!a2x.equals(
																															l)) {
																														if (!a2x.equals(
																																x)) {
																															if (!a2x.equals(
																																	d)) {
																																if (!d2c.equals(
																																		z)) {
																																	if (!d2c.equals(
																																			l2z)) {
																																		if (!d2c.equals(
																																				y)) {
																																			if (!d2c.equals(
																																					l)) {
																																				if (!d2c.equals(
																																						x)) {
																																					if (!a.equals(
																																							z)) {
																																						if (!a.equals(
																																								c)) {
																																							if (!a.equals(
																																									l2z)) {
																																								if (!a.equals(
																																										y)) {
																																									if (!a.equals(
																																											b)) {
																																										if (!a.equals(
																																												a2x)) {
																																											if (!a.equals(
																																													d2c)) {
																																												if (!a.equals(
																																														b2y)) {
																																													if (!a.equals(
																																															l)) {
																																														if (!a.equals(
																																																x)) {
																																															if (!a.equals(
																																																	d)) {
																																																if (!b2y.equals(
																																																		z)) {
																																																	if (!b2y.equals(
																																																			c)) {
																																																		if (!b2y.equals(
																																																				l2z)) {
																																																			if (!b2y.equals(
																																																					y)) {
																																																				if (!b2y.equals(
																																																						d2c)) {
																																																					if (!b2y.equals(
																																																							l)) {
																																																						if (!b2y.equals(
																																																								x)) {
																																																							if (!b2y.equals(
																																																									d)) {
																																																								if (!l.equals(
																																																										z)) {
																																																									if (!l.equals(
																																																											l2z)) {
																																																										if (!l.equals(
																																																												y)) {
																																																											if (!l.equals(
																																																													x)) {
																																																												if (!x.equals(
																																																														z)) {
																																																													if (!x.equals(
																																																															y)) {
																																																														if (!d.equals(
																																																																z)) {
																																																															if (!d.equals(
																																																																	l2z)) {
																																																																if (!d.equals(
																																																																		y)) {
																																																																	if (!d.equals(
																																																																			d2c)) {
																																																																		if (!d.equals(
																																																																				l)) {
																																																																			if (!d.equals(
																																																																					x)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						z,
																																																																						c,
																																																																						l2z,
																																																																						y,
																																																																						b,
																																																																						a2x,
																																																																						d2c,
																																																																						a,
																																																																						b2y,
																																																																						l,
																																																																						x,
																																																																						d };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject z, EObject c, EObject l2z, EObject y, EObject b, EObject a2x,
			EObject a, EObject b2y, EObject l, EObject x, EObject d) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decla2branchbc";
		String z__x____next_name_prime = "next";
		String c__x____positive_name_prime = "positive";
		String l2z__z____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String b2y__b____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String l2z__l____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String a__l____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		z__x____next.setName(z__x____next_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { ruleresult, z, c, l2z, y, b, a2x, a, b2y, l, x, d, z__x____next, c__x____positive,
				l2z__z____target, a2x__a____source, b2y__y____target, c__y____negative, b2y__b____source,
				a2x__x____target, l2z__l____source, d__b____negative, a__l____last, d__a____positive };
	}

	public static final void pattern_decla2branchbc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(decla2branchbc _this,
			PerformRuleResult ruleresult, EObject z, EObject c, EObject l2z, EObject y, EObject b, EObject a2x,
			EObject d2c, EObject a, EObject b2y, EObject l, EObject x, EObject d) {
		_this.registerObjects_BWD(ruleresult, z, c, l2z, y, b, a2x, d2c, a, b2y, l, x, d);

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
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("x");
		EObject tmpZ = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpX = _localVariable_3;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						return new Object[] { z, c, y, x, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_12_2_corematch_blackBBBFBFB(Command z, Branch c,
			Command y, Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
						"target")) {
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						_result.add(new Object[] { z, c, y, d2c, x, d, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_12_3_findcontext_blackBBBBBB(Command z, Branch c,
			Command y, S2B d2c, Branch x, Decision d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				if (x.equals(z.getNext())) {
					if (x.equals(c.getPositive())) {
						if (c.equals(d2c.getTarget())) {
							if (y.equals(c.getNegative())) {
								if (d.equals(d2c.getSource())) {
									_result.add(new Object[] { z, c, y, d2c, x, d });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_12_3_findcontext_greenBBBBBBFFFFFF(Command z, Branch c,
			Command y, S2B d2c, Branch x, Decision d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String z__x____next_name_prime = "next";
		String c__x____positive_name_prime = "positive";
		String d2c__c____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(d);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		z__x____next.setName(z__x____next_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { z, c, y, d2c, x, d, isApplicableMatch, z__x____next, c__x____positive, d2c__c____target,
				c__y____negative, d2c__d____source };
	}

	public static final Object[] pattern_decla2branchbc_12_4_solveCSP_bindingFBBBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, Command z, Branch c, Command y, S2B d2c, Branch x, Decision d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, z, c, y, d2c, x, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, z, c, y, d2c, x, d };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, Command z, Branch c, Command y, S2B d2c, Branch x, Decision d) {
		Object[] result_pattern_decla2branchbc_12_4_solveCSP_binding = pattern_decla2branchbc_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, z, c, y, d2c, x, d);
		if (result_pattern_decla2branchbc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_12_4_solveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_12_4_solveCSP_black = pattern_decla2branchbc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decla2branchbc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, z, c, y, d2c, x, d };
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
		for (Graph __DEC_z_root_983317 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_1BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_positive_25631 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_z_positive_25631)) {
					if (!x.equals(__DEC_z_positive_25631)) {
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
			for (Branch __DEC_z_negative_792685 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_z_negative_792685)) {
					if (!x.equals(__DEC_z_negative_792685)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_279669 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_4BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_166257 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_y_positive_166257)) {
					if (!x.equals(__DEC_y_positive_166257)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_5BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_848713 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_y_negative_848713)) {
					if (!x.equals(__DEC_y_negative_848713)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_392973 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_7BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_178432 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_178432)) {
					if (!c.equals(__DEC_x_positive_178432)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_8BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_873407 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_873407)) {
					if (!c.equals(__DEC_x_negative_873407)) {
						return new Object[] { x, c };
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

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_13BB(Branch c, Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_14BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_15BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_16BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
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
						if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_6B(x) == null) {
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
															if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_7BB(
																	x, c) == null) {
																if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_8BB(
																		x, c) == null) {
																	if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_9BB(
																			c, z) == null) {
																		if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_11BB(
																				c, z) == null) {
																			if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_16BB(
																					c, x) == null) {
																				if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_3B(
																						y) == null) {
																					if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_4BBB(
																							y, c, x) == null) {
																						if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_5BBB(
																								y, c, x) == null) {
																							if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_13BB(
																									c, y) == null) {
																								if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_14BB(
																										x, y) == null) {
																									if (pattern_decla2branchbc_20_2_testcorematchandDECs_black_nac_15BB(
																											x,
																											y) == null) {
																										_result.add(
																												new Object[] {
																														z,
																														c,
																														y,
																														x,
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
			decla2branchbc _this, Match match, Command z, Branch c, Command y, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, c, y, x);
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

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_0BB(Assignment b,
			Decision d) {
		for (Decision __DEC_b_positive_840678 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_840678)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_1BB(Assignment b, While a) {
		for (While __DEC_b_first_578950 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_578950)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_2BB(Assignment b, While a) {
		for (While __DEC_b_last_5783 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_5783)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_3B(Assignment b) {
		for (Program __DEC_b_first_501577 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_827200 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_827200)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_5B(While a) {
		for (While __DEC_a_first_464427 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_464427)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_6B(While a) {
		for (While __DEC_a_last_405697 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_405697)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_7B(While a) {
		for (Program __DEC_a_first_91265 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_8BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_434813 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_434813)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_9BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_896494 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_896494)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_10BB(Assignment l,
			While a) {
		for (While __DEC_l_first_749142 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!a.equals(__DEC_l_first_749142)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_11BB(Assignment l,
			While a) {
		for (While __DEC_l_last_413625 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_413625)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_12B(Assignment l) {
		for (Program __DEC_l_first_740043 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_13BB(Decision d,
			Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_14BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_15BB(While a,
			Assignment b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
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
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_18BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_19BB(While a,
			Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_negative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpD = _edge_negative.getSrc();
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			EObject tmpB = _edge_negative.getTrg();
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (b.equals(d.getNegative())) {
					Statement tmpA = d.getPositive();
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						Statement tmpL = a.getLast();
						if (tmpL instanceof Assignment) {
							Assignment l = (Assignment) tmpL;
							if (!b.equals(l)) {
								if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_0BB(b, d) == null) {
									if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_3B(b) == null) {
										if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_13BB(d,
												b) == null) {
											if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_1BB(b,
													a) == null) {
												if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_2BB(b,
														a) == null) {
													if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_4BB(
															a, d) == null) {
														if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_5B(
																a) == null) {
															if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_6B(
																	a) == null) {
																if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_7B(
																		a) == null) {
																	if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_14BB(
																			a, b) == null) {
																		if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_15BB(
																				a, b) == null) {
																			if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_16BB(
																					d, a) == null) {
																				if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_8BB(
																						l, d) == null) {
																					if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_9BB(
																							l, d) == null) {
																						if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_10BB(
																								l, a) == null) {
																							if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_11BB(
																									l, a) == null) {
																								if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_12B(
																										l) == null) {
																									if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_17BB(
																											d,
																											l) == null) {
																										if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_18BB(
																												d,
																												l) == null) {
																											if (pattern_decla2branchbc_21_2_testcorematchandDECs_black_nac_19BB(
																													a,
																													l) == null) {
																												_result.add(
																														new Object[] {
																																b,
																																a,
																																l,
																																d,
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
			decla2branchbc _this, Match match, Assignment b, While a, Assignment l, Decision d) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, a, l, d);
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
		EObject _localVariable_2 = targetMatch.getObject("y");
		EObject _localVariable_3 = sourceMatch.getObject("b");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = sourceMatch.getObject("l");
		EObject _localVariable_6 = targetMatch.getObject("x");
		EObject _localVariable_7 = sourceMatch.getObject("d");
		EObject tmpZ = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpL = _localVariable_5;
		EObject tmpX = _localVariable_6;
		EObject tmpD = _localVariable_7;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								if (tmpX instanceof Branch) {
									Branch x = (Branch) tmpX;
									if (tmpD instanceof Decision) {
										Decision d = (Decision) tmpD;
										return new Object[] { z, c, y, b, a, l, x, d, targetMatch, sourceMatch };
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
			Command y, Assignment b, While a, Assignment l, Branch x, Decision d, Match sourceMatch,
			Match targetMatch) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				if (!b.equals(l)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { z, c, y, b, a, l, x, d, sourceMatch, targetMatch };
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
			Command y = (Command) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[2];
			Assignment b = (Assignment) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[3];
			While a = (While) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[4];
			Assignment l = (Assignment) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[5];
			Branch x = (Branch) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[6];
			Decision d = (Decision) result_pattern_decla2branchbc_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decla2branchbc_24_2_matchsrctrgcontext_black = pattern_decla2branchbc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					z, c, y, b, a, l, x, d, sourceMatch, targetMatch);
			if (result_pattern_decla2branchbc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { z, c, y, b, a, l, x, d, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_24_3_solvecsp_bindingFBBBBBBBBBBB(decla2branchbc _this,
			Command z, Branch c, Command y, Assignment b, While a, Assignment l, Branch x, Decision d,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(z, c, y, b, a, l, x, d, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, z, c, y, b, a, l, x, d, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(decla2branchbc _this,
			Command z, Branch c, Command y, Assignment b, While a, Assignment l, Branch x, Decision d,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decla2branchbc_24_3_solvecsp_binding = pattern_decla2branchbc_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, z, c, y, b, a, l, x, d, sourceMatch, targetMatch);
		if (result_pattern_decla2branchbc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_24_3_solvecsp_binding[0];

			Object[] result_pattern_decla2branchbc_24_3_solvecsp_black = pattern_decla2branchbc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decla2branchbc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, z, c, y, b, a, l, x, d, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decla2branchbc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decla2branchbc_24_5_matchcorrcontext_blackBFBBB(Branch c, Decision d,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				if (d.equals(d2c.getSource())) {
					_result.add(new Object[] { c, d2c, d, sourceMatch, targetMatch });
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
			Command y, Assignment b, While a, Assignment l, Branch x, Decision d, CCMatch ccMatch) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				if (!b.equals(l)) {
					return new Object[] { z, c, y, b, a, l, x, d, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_24_6_createcorrespondence_greenBFBBFBFBBB(Command z, Command y,
			Assignment b, While a, Assignment l, Branch x, CCMatch ccMatch) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		l2z.setTarget(z);
		l2z.setSource(l);
		ccMatch.getCreateCorr().add(l2z);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { z, l2z, y, b, a2x, a, b2y, l, x, ccMatch };
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

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_0BB(Assignment b, Decision d) {
		for (Decision __DEC_b_positive_915989 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_915989)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_1BB(Assignment b, While a) {
		for (While __DEC_b_first_91941 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_91941)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_2BB(Assignment b, While a) {
		for (While __DEC_b_last_744445 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_744445)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_3B(Assignment b) {
		for (Program __DEC_b_first_907122 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_551620 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_551620)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_5B(While a) {
		for (While __DEC_a_first_519201 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_519201)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_6B(While a) {
		for (While __DEC_a_last_231834 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_231834)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_7B(While a) {
		for (Program __DEC_a_first_997202 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_8BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_68445 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_68445)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_9BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_993230 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_993230)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_10BB(Assignment l, While a) {
		for (While __DEC_l_first_673888 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!a.equals(__DEC_l_first_673888)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_11BB(Assignment l, While a) {
		for (While __DEC_l_last_397573 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_397573)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_12B(Assignment l) {
		for (Program __DEC_l_first_667563 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_13BB(Decision d, Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_14BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_15BB(While a, Assignment b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_16BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_17BB(Decision d, Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_18BB(Decision d, Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_black_nac_19BB(While a, Assignment l) {
		if (l.equals(a.getFirst())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_27_1_matchtggpattern_blackBBBB(Assignment b, While a,
			Assignment l, Decision d) {
		if (!b.equals(l)) {
			if (b.equals(d.getNegative())) {
				if (l.equals(a.getLast())) {
					if (a.equals(d.getPositive())) {
						if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_0BB(b, d) == null) {
							if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_1BB(b, a) == null) {
								if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_2BB(b, a) == null) {
									if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_3B(b) == null) {
										if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_4BB(a, d) == null) {
											if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_5B(a) == null) {
												if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_6B(
														a) == null) {
													if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_7B(
															a) == null) {
														if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_8BB(l,
																d) == null) {
															if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_9BB(
																	l, d) == null) {
																if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_10BB(
																		l, a) == null) {
																	if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_11BB(
																			l, a) == null) {
																		if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_12B(
																				l) == null) {
																			if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_13BB(
																					d, b) == null) {
																				if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_14BB(
																						a, b) == null) {
																					if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_15BB(
																							a, b) == null) {
																						if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_16BB(
																								d, a) == null) {
																							if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_17BB(
																									d, l) == null) {
																								if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_18BB(
																										d, l) == null) {
																									if (pattern_decla2branchbc_27_1_matchtggpattern_black_nac_19BB(
																											a,
																											l) == null) {
																										return new Object[] {
																												b, a, l,
																												d };
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
		for (Graph __DEC_z_root_502820 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_1BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_positive_738294 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_z_positive_738294)) {
					if (!x.equals(__DEC_z_positive_738294)) {
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
			for (Branch __DEC_z_negative_597312 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_z_negative_597312)) {
					if (!x.equals(__DEC_z_negative_597312)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_195294 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_4BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_557287 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_y_positive_557287)) {
					if (!x.equals(__DEC_y_positive_557287)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_5BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_915644 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_y_negative_915644)) {
					if (!x.equals(__DEC_y_negative_915644)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_720234 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_7BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_29244 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_29244)) {
					if (!c.equals(__DEC_x_positive_29244)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_8BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_232851 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_232851)) {
					if (!c.equals(__DEC_x_negative_232851)) {
						return new Object[] { x, c };
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

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_13BB(Branch c, Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_14BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_15BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_black_nac_16BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_28_1_matchtggpattern_blackBBBB(Command z, Branch c, Command y,
			Branch x) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				if (x.equals(z.getNext())) {
					if (x.equals(c.getPositive())) {
						if (y.equals(c.getNegative())) {
							if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_0B(z) == null) {
								if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_1BBB(z, c, x) == null) {
									if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_2BBB(z, c, x) == null) {
										if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_3B(y) == null) {
											if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_4BBB(y, c,
													x) == null) {
												if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_5BBB(y, c,
														x) == null) {
													if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_6B(
															x) == null) {
														if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_7BB(x,
																c) == null) {
															if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_8BB(
																	x, c) == null) {
																if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_9BB(
																		c, z) == null) {
																	if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_10BB(
																			x, z) == null) {
																		if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_11BB(
																				c, z) == null) {
																			if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_12BB(
																					x, z) == null) {
																				if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_13BB(
																						c, y) == null) {
																					if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_14BB(
																							x, y) == null) {
																						if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_15BB(
																								x, y) == null) {
																							if (pattern_decla2branchbc_28_1_matchtggpattern_black_nac_16BB(
																									c, x) == null) {
																								return new Object[] { z,
																										c, y, x };
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
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
							if (pattern_decla2branchbc_29_2_isapplicablecore_black_nac_1BB(ruleResult, d2c) == null) {
								if (pattern_decla2branchbc_29_2_isapplicablecore_black_nac_0BB(ruleResult, c) == null) {
									if (pattern_decla2branchbc_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											d) == null) {
										_result.add(
												new Object[] { d2cList, c, d2c, d, ruleEntryContainer, ruleResult });
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
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, c, d2c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decla2branchbc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decla2branchbc_29_3_solveCSP_bindingAndBlackFBBBBBB(decla2branchbc _this,
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decla2branchbc_29_3_solveCSP_binding = pattern_decla2branchbc_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, c, d2c, d, ruleResult);
		if (result_pattern_decla2branchbc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decla2branchbc_29_3_solveCSP_binding[0];

			Object[] result_pattern_decla2branchbc_29_3_solveCSP_black = pattern_decla2branchbc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decla2branchbc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decla2branchbc_29_4_checkCSP_expressionFBB(decla2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decla2branchbc_29_5_checknacs_blackBBB(Branch c, S2B d2c, Decision d) {
		return new Object[] { c, d2c, d };
	}

	public static final Object[] pattern_decla2branchbc_29_6_perform_blackBBBB(Branch c, S2B d2c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { c, d2c, d, ruleResult };
	}

	public static final Object[] pattern_decla2branchbc_29_6_perform_greenFBFFFFFFFFBB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(z);
		l2z.setTarget(z);
		ruleResult.getCorrObjects().add(l2z);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		ruleResult.getCorrObjects().add(a2x);
		a2x.setSource(a);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		b2y.setTarget(y);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		l2z.setSource(l);
		a.setLast(l);
		ruleResult.getSourceObjects().add(l);
		z.setNext(x);
		c.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { z, c, l2z, y, b, a2x, a, b2y, l, x, d, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decla2branchbc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decla2branchbcImpl
