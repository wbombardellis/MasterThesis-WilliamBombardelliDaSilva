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
import org.wbsilva.bx.sourcecode2controlflow.Rules.decula2branchubc;

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
 * An implementation of the model object '<em><b>decula2branchubc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class decula2branchubcImpl extends AbstractRuleImpl implements decula2branchubc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decula2branchubcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdecula2branchubc();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment b, While a, Assignment l, Decision d) {

		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_0_1_initialbindings_blackBBBBBB(this,
				match, b, a, l, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[l] = " + l + ", "
					+ "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, b, a, l, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[l] = " + l + ", "
					+ "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decula2branchubcImpl.pattern_decula2branchubc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decula2branchubcImpl
					.pattern_decula2branchubc_0_4_collectelementstobetranslated_blackBBBBB(match, b, a, l, d);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[d] = " + d + ".");
			}
			decula2branchubcImpl.pattern_decula2branchubc_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, b, a,
					l, d);
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge a__l____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[8];

			Object[] result5_black = decula2branchubcImpl
					.pattern_decula2branchubc_0_5_collectcontextelements_blackBBBBB(match, b, a, l, d);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[d] = " + d + ".");
			}
			decula2branchubcImpl.pattern_decula2branchubc_0_5_collectcontextelements_greenBB(match, d);

			// 
			decula2branchubcImpl.pattern_decula2branchubc_0_6_registerobjectstomatch_expressionBBBBBB(this, match, b, a,
					l, d);
			return decula2branchubcImpl.pattern_decula2branchubc_0_7_expressionF();
		} else {
			return decula2branchubcImpl.pattern_decula2branchubc_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment b = (Assignment) result1_bindingAndBlack[0];
		Branch c = (Branch) result1_bindingAndBlack[1];
		While a = (While) result1_bindingAndBlack[2];
		Assignment l = (Assignment) result1_bindingAndBlack[3];
		S2B d2c = (S2B) result1_bindingAndBlack[4];
		Decision d = (Decision) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decula2branchubcImpl
				.pattern_decula2branchubc_1_1_performtransformation_greenBFFBFFBBFF(b, c, a, l);
		S2N l2z = (S2N) result1_green[1];
		S2B a2x = (S2B) result1_green[2];
		Command y = (Command) result1_green[4];
		Command z = (Command) result1_green[5];
		S2N b2y = (S2N) result1_green[8];
		Branch x = (Branch) result1_green[9];

		Object[] result2_black = decula2branchubcImpl
				.pattern_decula2branchubc_1_2_collecttranslatedelements_blackBBBBBBBBB(b, l2z, a2x, y, z, a, l, b2y, x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b] = " + b + ", " + "[l2z] = "
					+ l2z + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[a] = " + a
					+ ", " + "[l] = " + l + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = decula2branchubcImpl
				.pattern_decula2branchubc_1_2_collecttranslatedelements_greenFBBBBBBBBB(b, l2z, a2x, y, z, a, l, b2y,
						x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decula2branchubcImpl
				.pattern_decula2branchubc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, b, l2z, a2x, c, y, z,
						a, l, d2c, b2y, d, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b] = " + b + ", " + "[l2z] = " + l2z + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c
					+ ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[l] = " + l + ", "
					+ "[d2c] = " + d2c + ", " + "[b2y] = " + b2y + ", " + "[d] = " + d + ", " + "[x] = " + x + ".");
		}
		decula2branchubcImpl.pattern_decula2branchubc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, b, l2z, a2x, c, y, z, a, l, b2y, d, x);
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[25];

		// 
		// 
		decula2branchubcImpl.pattern_decula2branchubc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, b,
				l2z, a2x, c, y, z, a, l, d2c, b2y, d, x);
		return decula2branchubcImpl.pattern_decula2branchubc_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decula2branchubcImpl
				.pattern_decula2branchubc_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decula2branchubcImpl.pattern_decula2branchubc_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment b = (Assignment) result2_binding[0];
		While a = (While) result2_binding[1];
		Assignment l = (Assignment) result2_binding[2];
		Decision d = (Decision) result2_binding[3];
		for (Object[] result2_black : decula2branchubcImpl.pattern_decula2branchubc_2_2_corematch_blackBFBBFBB(b, a, l,
				d, match)) {
			Branch c = (Branch) result2_black[1];
			S2B d2c = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decula2branchubcImpl.pattern_decula2branchubc_2_3_findcontext_blackBBBBBB(b,
					c, a, l, d2c, d)) {
				Object[] result3_green = decula2branchubcImpl
						.pattern_decula2branchubc_2_3_findcontext_greenBBBBBBFFFFFFF(b, c, a, l, d2c, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = decula2branchubcImpl
						.pattern_decula2branchubc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, b, c,
								a, l, d2c, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[b] = " + b + ", " + "[c] = " + c
							+ ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decula2branchubcImpl.pattern_decula2branchubc_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decula2branchubcImpl
							.pattern_decula2branchubc_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decula2branchubcImpl.pattern_decula2branchubc_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decula2branchubcImpl.pattern_decula2branchubc_2_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment b, Branch c, While a,
			Assignment l, S2B d2c, Decision d) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("d2c", d2c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject b, EObject l2z, EObject a2x, EObject c,
			EObject y, EObject z, EObject a, EObject l, EObject d2c, EObject b2y, EObject d, EObject x) {
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("x", x);

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
	public boolean isAppropriate_BWD(Match match, Branch c, Command y, Command z, Branch x) {

		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_10_1_initialbindings_blackBBBBBB(this,
				match, c, y, z, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", "
					+ "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, c, y, z, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", "
					+ "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decula2branchubcImpl.pattern_decula2branchubc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decula2branchubcImpl
					.pattern_decula2branchubc_10_4_collectelementstobetranslated_blackBBBBB(match, c, y, z, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			decula2branchubcImpl.pattern_decula2branchubc_10_4_collectelementstobetranslated_greenBBBBBFFFF(match, c, y,
					z, x);
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result4_green[8];

			Object[] result5_black = decula2branchubcImpl
					.pattern_decula2branchubc_10_5_collectcontextelements_blackBBBBB(match, c, y, z, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			decula2branchubcImpl.pattern_decula2branchubc_10_5_collectcontextelements_greenBB(match, c);

			// 
			decula2branchubcImpl.pattern_decula2branchubc_10_6_registerobjectstomatch_expressionBBBBBB(this, match, c,
					y, z, x);
			return decula2branchubcImpl.pattern_decula2branchubc_10_7_expressionF();
		} else {
			return decula2branchubcImpl.pattern_decula2branchubc_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch c = (Branch) result1_bindingAndBlack[0];
		Command y = (Command) result1_bindingAndBlack[1];
		Command z = (Command) result1_bindingAndBlack[2];
		S2B d2c = (S2B) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		Branch x = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decula2branchubcImpl
				.pattern_decula2branchubc_11_1_performtransformation_greenFFFBBFFFBB(y, z, d, x);
		Assignment b = (Assignment) result1_green[0];
		S2N l2z = (S2N) result1_green[1];
		S2B a2x = (S2B) result1_green[2];
		While a = (While) result1_green[5];
		Assignment l = (Assignment) result1_green[6];
		S2N b2y = (S2N) result1_green[7];

		Object[] result2_black = decula2branchubcImpl
				.pattern_decula2branchubc_11_2_collecttranslatedelements_blackBBBBBBBBB(b, l2z, a2x, y, z, a, l, b2y,
						x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b] = " + b + ", " + "[l2z] = "
					+ l2z + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[a] = " + a
					+ ", " + "[l] = " + l + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = decula2branchubcImpl
				.pattern_decula2branchubc_11_2_collecttranslatedelements_greenFBBBBBBBBB(b, l2z, a2x, y, z, a, l, b2y,
						x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decula2branchubcImpl
				.pattern_decula2branchubc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, b, l2z, a2x, c, y, z,
						a, l, d2c, b2y, d, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b] = " + b + ", " + "[l2z] = " + l2z + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c
					+ ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[l] = " + l + ", "
					+ "[d2c] = " + d2c + ", " + "[b2y] = " + b2y + ", " + "[d] = " + d + ", " + "[x] = " + x + ".");
		}
		decula2branchubcImpl.pattern_decula2branchubc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, b, l2z, a2x, c, y, z, a, l, b2y, d, x);
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[25];

		// 
		// 
		decula2branchubcImpl.pattern_decula2branchubc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, b,
				l2z, a2x, c, y, z, a, l, d2c, b2y, d, x);
		return decula2branchubcImpl.pattern_decula2branchubc_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decula2branchubcImpl
				.pattern_decula2branchubc_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decula2branchubcImpl.pattern_decula2branchubc_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch c = (Branch) result2_binding[0];
		Command y = (Command) result2_binding[1];
		Command z = (Command) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		for (Object[] result2_black : decula2branchubcImpl.pattern_decula2branchubc_12_2_corematch_blackBBBFFBB(c, y, z,
				x, match)) {
			S2B d2c = (S2B) result2_black[3];
			Decision d = (Decision) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decula2branchubcImpl.pattern_decula2branchubc_12_3_findcontext_blackBBBBBB(c,
					y, z, d2c, d, x)) {
				Object[] result3_green = decula2branchubcImpl
						.pattern_decula2branchubc_12_3_findcontext_greenBBBBBBFFFFFFF(c, y, z, d2c, d, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = decula2branchubcImpl
						.pattern_decula2branchubc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, c, y,
								z, d2c, d, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[y] = " + y
							+ ", " + "[z] = " + z + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[x] = " + x
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decula2branchubcImpl.pattern_decula2branchubc_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decula2branchubcImpl
							.pattern_decula2branchubc_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decula2branchubcImpl.pattern_decula2branchubc_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decula2branchubcImpl.pattern_decula2branchubc_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch c, Command y, Command z, Branch x) {
		match.registerObject("c", c);
		match.registerObject("y", y);
		match.registerObject("z", z);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch c, Command y, Command z, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch c, Command y, Command z, S2B d2c,
			Decision d, Branch x) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("x", x);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject b, EObject l2z, EObject a2x, EObject c,
			EObject y, EObject z, EObject a, EObject l, EObject d2c, EObject b2y, EObject d, EObject x) {
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_106(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decula2branchubcImpl.pattern_decula2branchubc_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decula2branchubcImpl
				.pattern_decula2branchubc_20_2_testcorematchandDECs_blackFFFFB(_edge_positive)) {
			Branch c = (Branch) result2_black[0];
			Command y = (Command) result2_black[1];
			Command z = (Command) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Object[] result2_green = decula2branchubcImpl
					.pattern_decula2branchubc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decula2branchubcImpl
					.pattern_decula2branchubc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, c, y, z, x)) {
				// 
				if (decula2branchubcImpl
						.pattern_decula2branchubc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decula2branchubcImpl
							.pattern_decula2branchubc_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decula2branchubcImpl.pattern_decula2branchubc_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decula2branchubcImpl.pattern_decula2branchubc_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_112(EMoflonEdge _edge_last) {

		Object[] result1_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decula2branchubcImpl.pattern_decula2branchubc_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decula2branchubcImpl
				.pattern_decula2branchubc_21_2_testcorematchandDECs_blackFFFFB(_edge_last)) {
			Assignment b = (Assignment) result2_black[0];
			While a = (While) result2_black[1];
			Assignment l = (Assignment) result2_black[2];
			Decision d = (Decision) result2_black[3];
			Object[] result2_green = decula2branchubcImpl
					.pattern_decula2branchubc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decula2branchubcImpl
					.pattern_decula2branchubc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, b, a, l, d)) {
				// 
				if (decula2branchubcImpl
						.pattern_decula2branchubc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decula2branchubcImpl
							.pattern_decula2branchubc_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decula2branchubcImpl.pattern_decula2branchubc_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decula2branchubcImpl.pattern_decula2branchubc_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("decula2branchubc");
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
		ruleResult.setRule("decula2branchubc");
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

		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decula2branchubcImpl.pattern_decula2branchubc_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Assignment b = (Assignment) result2_bindingAndBlack[0];
		Branch c = (Branch) result2_bindingAndBlack[1];
		Command y = (Command) result2_bindingAndBlack[2];
		Command z = (Command) result2_bindingAndBlack[3];
		While a = (While) result2_bindingAndBlack[4];
		Assignment l = (Assignment) result2_bindingAndBlack[5];
		Decision d = (Decision) result2_bindingAndBlack[6];
		Branch x = (Branch) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, b, c, y, z, a, l, d, x,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[b] = " + b + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[a] = "
					+ a + ", " + "[l] = " + l + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decula2branchubcImpl.pattern_decula2branchubc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decula2branchubcImpl
					.pattern_decula2branchubc_24_5_matchcorrcontext_blackBFBBB(c, d, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[1];
				Object[] result5_green = decula2branchubcImpl
						.pattern_decula2branchubc_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decula2branchubcImpl
						.pattern_decula2branchubc_24_6_createcorrespondence_blackBBBBBBBBB(b, c, y, z, a, l, d, x,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b] = " + b + ", "
							+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[a] = " + a + ", "
							+ "[l] = " + l + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decula2branchubcImpl.pattern_decula2branchubc_24_6_createcorrespondence_greenBFFBBBBFBB(b, y, z, a, l,
						x, ccMatch);
				//nothing S2N l2z = (S2N) result6_green[1];
				//nothing S2B a2x = (S2B) result6_green[2];
				//nothing S2N b2y = (S2N) result6_green[7];

				Object[] result7_black = decula2branchubcImpl
						.pattern_decula2branchubc_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decula2branchubcImpl.pattern_decula2branchubc_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return decula2branchubcImpl.pattern_decula2branchubc_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Assignment b, Branch c, Command y, Command z, While a, Assignment l, Decision d,
			Branch x, Match sourceMatch, Match targetMatch) {// Create CSP
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
		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_27_1_matchtggpattern_blackBBBB(b, a, l,
				d);
		if (result1_black != null) {
			return decula2branchubcImpl.pattern_decula2branchubc_27_2_expressionF();
		} else {
			return decula2branchubcImpl.pattern_decula2branchubc_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch c, Command y, Command z, Branch x) {// 
		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_28_1_matchtggpattern_blackBBBB(c, y, z,
				x);
		if (result1_black != null) {
			return decula2branchubcImpl.pattern_decula2branchubc_28_2_expressionF();
		} else {
			return decula2branchubcImpl.pattern_decula2branchubc_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decula2branchubcImpl.pattern_decula2branchubc_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : decula2branchubcImpl
				.pattern_decula2branchubc_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			Branch c = (Branch) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = decula2branchubcImpl
					.pattern_decula2branchubc_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, c, d2c, d,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d2c] = " + d2c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decula2branchubcImpl.pattern_decula2branchubc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decula2branchubcImpl.pattern_decula2branchubc_29_5_checknacs_blackBBB(c, d2c,
						d);
				if (result5_black != null) {

					Object[] result6_black = decula2branchubcImpl.pattern_decula2branchubc_29_6_perform_blackBBBB(c,
							d2c, d, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
								+ "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decula2branchubcImpl.pattern_decula2branchubc_29_6_perform_greenFFFBFFFFFBFB(c, d, ruleResult);
					//nothing Assignment b = (Assignment) result6_green[0];
					//nothing S2N l2z = (S2N) result6_green[1];
					//nothing S2B a2x = (S2B) result6_green[2];
					//nothing Command y = (Command) result6_green[4];
					//nothing Command z = (Command) result6_green[5];
					//nothing While a = (While) result6_green[6];
					//nothing Assignment l = (Assignment) result6_green[7];
					//nothing S2N b2y = (S2N) result6_green[8];
					//nothing Branch x = (Branch) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return decula2branchubcImpl.pattern_decula2branchubc_29_7_expressionFB(ruleResult);
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
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECULA2BRANCHUBC___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4));
			return null;
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_BRANCH_WHILE_ASSIGNMENT_S2B_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(S2B) arguments.get(5), (Decision) arguments.get(6));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECULA2BRANCHUBC___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECULA2BRANCHUBC___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_COMMAND_COMMAND_S2B_DECISION_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Command) arguments.get(3), (S2B) arguments.get(4),
					(Decision) arguments.get(5), (Branch) arguments.get(6));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECULA2BRANCHUBC___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_106__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_106((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_112__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_112((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_BRANCH_COMMAND_COMMAND_WHILE_ASSIGNMENT_DECISION_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Command) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5), (Decision) arguments.get(6), (Branch) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___CHECK_DEC_FWD__ASSIGNMENT_WHILE_ASSIGNMENT_DECISION:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Decision) arguments.get(3));
		case RulesPackage.DECULA2BRANCHUBC___CHECK_DEC_BWD__BRANCH_COMMAND_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.DECULA2BRANCHUBC___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECULA2BRANCHUBC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Decision) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECULA2BRANCHUBC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decula2branchubc_0_1_initialbindings_blackBBBBBB(decula2branchubc _this,
			Match match, Assignment b, While a, Assignment l, Decision d) {
		if (!b.equals(l)) {
			return new Object[] { _this, match, b, a, l, d };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_0_2_SolveCSP_bindingFBBBBBB(decula2branchubc _this,
			Match match, Assignment b, While a, Assignment l, Decision d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, a, l, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, a, l, d };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_0_2_SolveCSP_bindingAndBlackFBBBBBB(decula2branchubc _this,
			Match match, Assignment b, While a, Assignment l, Decision d) {
		Object[] result_pattern_decula2branchubc_0_2_SolveCSP_binding = pattern_decula2branchubc_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, b, a, l, d);
		if (result_pattern_decula2branchubc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_0_2_SolveCSP_black = pattern_decula2branchubc_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, a, l, d };
			}
		}
		return null;
	}

	public static final boolean pattern_decula2branchubc_0_3_CheckCSP_expressionFBB(decula2branchubc _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Assignment b, While a, Assignment l, Decision d) {
		if (!b.equals(l)) {
			return new Object[] { match, b, a, l, d };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_0_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Assignment b, While a, Assignment l, Decision d) {
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(l);
		String a__l____last_name_prime = "last";
		String a__l____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____first);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		a__l____last.setName(a__l____last_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { match, b, a, l, d, a__l____last, a__l____first, d__a____positive, d__b____negative };
	}

	public static final Object[] pattern_decula2branchubc_0_5_collectcontextelements_blackBBBBB(Match match,
			Assignment b, While a, Assignment l, Decision d) {
		if (!b.equals(l)) {
			return new Object[] { match, b, a, l, d };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decula2branchubc_0_6_registerobjectstomatch_expressionBBBBBB(
			decula2branchubc _this, Match match, Assignment b, While a, Assignment l, Decision d) {
		_this.registerObjectsToMatch_FWD(match, b, a, l, d);

	}

	public static final boolean pattern_decula2branchubc_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decula2branchubc_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("b");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("l");
		EObject _localVariable_4 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject tmpB = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpL = _localVariable_3;
		EObject tmpD2c = _localVariable_4;
		EObject tmpD = _localVariable_5;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						if (tmpD2c instanceof S2B) {
							S2B d2c = (S2B) tmpD2c;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								return new Object[] { b, c, a, l, d2c, d, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_1_1_performtransformation_blackBBBBBBFBB(Assignment b,
			Branch c, While a, Assignment l, S2B d2c, Decision d, decula2branchubc _this,
			IsApplicableMatch isApplicableMatch) {
		if (!b.equals(l)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { b, c, a, l, d2c, d, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decula2branchubc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decula2branchubc_1_1_performtransformation_binding = pattern_decula2branchubc_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decula2branchubc_1_1_performtransformation_binding != null) {
			Assignment b = (Assignment) result_pattern_decula2branchubc_1_1_performtransformation_binding[0];
			Branch c = (Branch) result_pattern_decula2branchubc_1_1_performtransformation_binding[1];
			While a = (While) result_pattern_decula2branchubc_1_1_performtransformation_binding[2];
			Assignment l = (Assignment) result_pattern_decula2branchubc_1_1_performtransformation_binding[3];
			S2B d2c = (S2B) result_pattern_decula2branchubc_1_1_performtransformation_binding[4];
			Decision d = (Decision) result_pattern_decula2branchubc_1_1_performtransformation_binding[5];

			Object[] result_pattern_decula2branchubc_1_1_performtransformation_black = pattern_decula2branchubc_1_1_performtransformation_blackBBBBBBFBB(
					b, c, a, l, d2c, d, _this, isApplicableMatch);
			if (result_pattern_decula2branchubc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decula2branchubc_1_1_performtransformation_black[6];

				return new Object[] { b, c, a, l, d2c, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_1_1_performtransformation_greenBFFBFFBBFF(Assignment b,
			Branch c, While a, Assignment l) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		l2z.setSource(l);
		a2x.setSource(a);
		c.setNegative(y);
		l2z.setTarget(z);
		b2y.setTarget(y);
		b2y.setSource(b);
		c.setPositive(x);
		z.setNext(x);
		a2x.setTarget(x);
		x.setPositive(z);
		return new Object[] { b, l2z, a2x, c, y, z, a, l, b2y, x };
	}

	public static final Object[] pattern_decula2branchubc_1_2_collecttranslatedelements_blackBBBBBBBBB(Assignment b,
			S2N l2z, S2B a2x, Command y, Command z, While a, Assignment l, S2N b2y, Branch x) {
		if (!b.equals(l)) {
			if (!y.equals(z)) {
				if (!b2y.equals(l2z)) {
					return new Object[] { b, l2z, a2x, y, z, a, l, b2y, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_1_2_collecttranslatedelements_greenFBBBBBBBBB(Assignment b,
			S2N l2z, S2B a2x, Command y, Command z, While a, Assignment l, S2N b2y, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(x);
		return new Object[] { ruleresult, b, l2z, a2x, y, z, a, l, b2y, x };
	}

	public static final Object[] pattern_decula2branchubc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b, EObject l2z, EObject a2x, EObject c, EObject y, EObject z,
			EObject a, EObject l, EObject d2c, EObject b2y, EObject d, EObject x) {
		if (!b.equals(l2z)) {
			if (!b.equals(c)) {
				if (!b.equals(y)) {
					if (!b.equals(z)) {
						if (!b.equals(l)) {
							if (!b.equals(d2c)) {
								if (!b.equals(b2y)) {
									if (!b.equals(d)) {
										if (!b.equals(x)) {
											if (!l2z.equals(y)) {
												if (!l2z.equals(z)) {
													if (!l2z.equals(x)) {
														if (!a2x.equals(b)) {
															if (!a2x.equals(l2z)) {
																if (!a2x.equals(c)) {
																	if (!a2x.equals(y)) {
																		if (!a2x.equals(z)) {
																			if (!a2x.equals(l)) {
																				if (!a2x.equals(d2c)) {
																					if (!a2x.equals(b2y)) {
																						if (!a2x.equals(d)) {
																							if (!a2x.equals(x)) {
																								if (!c.equals(l2z)) {
																									if (!c.equals(y)) {
																										if (!c.equals(
																												z)) {
																											if (!c.equals(
																													l)) {
																												if (!c.equals(
																														d2c)) {
																													if (!c.equals(
																															d)) {
																														if (!c.equals(
																																x)) {
																															if (!y.equals(
																																	z)) {
																																if (!a.equals(
																																		b)) {
																																	if (!a.equals(
																																			l2z)) {
																																		if (!a.equals(
																																				a2x)) {
																																			if (!a.equals(
																																					c)) {
																																				if (!a.equals(
																																						y)) {
																																					if (!a.equals(
																																							z)) {
																																						if (!a.equals(
																																								l)) {
																																							if (!a.equals(
																																									d2c)) {
																																								if (!a.equals(
																																										b2y)) {
																																									if (!a.equals(
																																											d)) {
																																										if (!a.equals(
																																												x)) {
																																											if (!l.equals(
																																													l2z)) {
																																												if (!l.equals(
																																														y)) {
																																													if (!l.equals(
																																															z)) {
																																														if (!l.equals(
																																																x)) {
																																															if (!d2c.equals(
																																																	l2z)) {
																																																if (!d2c.equals(
																																																		y)) {
																																																	if (!d2c.equals(
																																																			z)) {
																																																		if (!d2c.equals(
																																																				l)) {
																																																			if (!d2c.equals(
																																																					x)) {
																																																				if (!b2y.equals(
																																																						l2z)) {
																																																					if (!b2y.equals(
																																																							c)) {
																																																						if (!b2y.equals(
																																																								y)) {
																																																							if (!b2y.equals(
																																																									z)) {
																																																								if (!b2y.equals(
																																																										l)) {
																																																									if (!b2y.equals(
																																																											d2c)) {
																																																										if (!b2y.equals(
																																																												d)) {
																																																											if (!b2y.equals(
																																																													x)) {
																																																												if (!d.equals(
																																																														l2z)) {
																																																													if (!d.equals(
																																																															y)) {
																																																														if (!d.equals(
																																																																z)) {
																																																															if (!d.equals(
																																																																	l)) {
																																																																if (!d.equals(
																																																																		d2c)) {
																																																																	if (!d.equals(
																																																																			x)) {
																																																																		if (!x.equals(
																																																																				y)) {
																																																																			if (!x.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						b,
																																																																						l2z,
																																																																						a2x,
																																																																						c,
																																																																						y,
																																																																						z,
																																																																						a,
																																																																						l,
																																																																						d2c,
																																																																						b2y,
																																																																						d,
																																																																						x };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decula2branchubc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject b, EObject l2z, EObject a2x, EObject c, EObject y, EObject z,
			EObject a, EObject l, EObject b2y, EObject d, EObject x) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decula2branchubc";
		String c__x____positive_name_prime = "positive";
		String z__x____next_name_prime = "next";
		String l2z__z____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String l2z__l____source_name_prime = "source";
		String c__y____negative_name_prime = "negative";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a__l____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String x__z____positive_name_prime = "positive";
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____first);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getCreatedEdges().add(x__z____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		return new Object[] { ruleresult, b, l2z, a2x, c, y, z, a, l, b2y, d, x, c__x____positive, z__x____next,
				l2z__z____target, a__l____last, a2x__a____source, l2z__l____source, c__y____negative, b2y__y____target,
				b2y__b____source, a__l____first, d__a____positive, d__b____negative, a2x__x____target,
				x__z____positive };
	}

	public static final void pattern_decula2branchubc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decula2branchubc _this, PerformRuleResult ruleresult, EObject b, EObject l2z, EObject a2x, EObject c,
			EObject y, EObject z, EObject a, EObject l, EObject d2c, EObject b2y, EObject d, EObject x) {
		_this.registerObjects_FWD(ruleresult, b, l2z, a2x, c, y, z, a, l, d2c, b2y, d, x);

	}

	public static final PerformRuleResult pattern_decula2branchubc_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_2_1_preparereturnvalue_bindingFB(decula2branchubc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_2_1_preparereturnvalue_blackFBB(EClass eClass,
			decula2branchubc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_2_1_preparereturnvalue_bindingAndBlackFFB(
			decula2branchubc _this) {
		Object[] result_pattern_decula2branchubc_2_1_preparereturnvalue_binding = pattern_decula2branchubc_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decula2branchubc_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decula2branchubc_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decula2branchubc_2_1_preparereturnvalue_black = pattern_decula2branchubc_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decula2branchubc_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decula2branchubc_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decula2branchubc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decula2branchubc_2_2_corematch_bindingFFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_decula2branchubc_2_2_corematch_blackBFBBFBB(Assignment b, While a,
			Assignment l, Decision d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(l)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { b, c, a, l, d2c, d, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_2_3_findcontext_blackBBBBBB(Assignment b, Branch c,
			While a, Assignment l, S2B d2c, Decision d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(l)) {
			if (l.equals(a.getLast())) {
				if (l.equals(a.getFirst())) {
					if (a.equals(d.getPositive())) {
						if (b.equals(d.getNegative())) {
							if (c.equals(d2c.getTarget())) {
								if (d.equals(d2c.getSource())) {
									_result.add(new Object[] { b, c, a, l, d2c, d });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_2_3_findcontext_greenBBBBBBFFFFFFF(Assignment b, Branch c,
			While a, Assignment l, S2B d2c, Decision d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String a__l____last_name_prime = "last";
		String a__l____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____first);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		a__l____last.setName(a__l____last_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { b, c, a, l, d2c, d, isApplicableMatch, a__l____last, a__l____first, d__a____positive,
				d__b____negative, d2c__c____target, d2c__d____source };
	}

	public static final Object[] pattern_decula2branchubc_2_4_solveCSP_bindingFBBBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Assignment b, Branch c, While a, Assignment l, S2B d2c, Decision d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, b, c, a, l, d2c, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, b, c, a, l, d2c, d };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Assignment b, Branch c, While a, Assignment l, S2B d2c, Decision d) {
		Object[] result_pattern_decula2branchubc_2_4_solveCSP_binding = pattern_decula2branchubc_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, b, c, a, l, d2c, d);
		if (result_pattern_decula2branchubc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_2_4_solveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_2_4_solveCSP_black = pattern_decula2branchubc_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, b, c, a, l, d2c, d };
			}
		}
		return null;
	}

	public static final boolean pattern_decula2branchubc_2_5_checkCSP_expressionFBB(decula2branchubc _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decula2branchubc_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decula2branchubc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decula2branchubc_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_10_1_initialbindings_blackBBBBBB(decula2branchubc _this,
			Match match, Branch c, Command y, Command z, Branch x) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { _this, match, c, y, z, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_10_2_SolveCSP_bindingFBBBBBB(decula2branchubc _this,
			Match match, Branch c, Command y, Command z, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, c, y, z, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, y, z, x };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_10_2_SolveCSP_bindingAndBlackFBBBBBB(decula2branchubc _this,
			Match match, Branch c, Command y, Command z, Branch x) {
		Object[] result_pattern_decula2branchubc_10_2_SolveCSP_binding = pattern_decula2branchubc_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, c, y, z, x);
		if (result_pattern_decula2branchubc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_10_2_SolveCSP_black = pattern_decula2branchubc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, y, z, x };
			}
		}
		return null;
	}

	public static final boolean pattern_decula2branchubc_10_3_CheckCSP_expressionFBB(decula2branchubc _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Branch c, Command y, Command z, Branch x) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, c, y, z, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_10_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Branch c, Command y, Command z, Branch x) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		String c__x____positive_name_prime = "positive";
		String z__x____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		String x__z____positive_name_prime = "positive";
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		match.getToBeTranslatedEdges().add(x__z____positive);
		c__x____positive.setName(c__x____positive_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		return new Object[] { match, c, y, z, x, c__x____positive, z__x____next, c__y____negative, x__z____positive };
	}

	public static final Object[] pattern_decula2branchubc_10_5_collectcontextelements_blackBBBBB(Match match, Branch c,
			Command y, Command z, Branch x) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, c, y, z, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decula2branchubc_10_6_registerobjectstomatch_expressionBBBBBB(
			decula2branchubc _this, Match match, Branch c, Command y, Command z, Branch x) {
		_this.registerObjectsToMatch_BWD(match, c, y, z, x);

	}

	public static final boolean pattern_decula2branchubc_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decula2branchubc_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("y");
		EObject _localVariable_2 = isApplicableMatch.getObject("z");
		EObject _localVariable_3 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject _localVariable_5 = isApplicableMatch.getObject("x");
		EObject tmpC = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpD2c = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpX = _localVariable_5;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpD2c instanceof S2B) {
						S2B d2c = (S2B) tmpD2c;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								return new Object[] { c, y, z, d2c, d, x, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_11_1_performtransformation_blackBBBBBBFBB(Branch c, Command y,
			Command z, S2B d2c, Decision d, Branch x, decula2branchubc _this, IsApplicableMatch isApplicableMatch) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { c, y, z, d2c, d, x, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decula2branchubc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decula2branchubc_11_1_performtransformation_binding = pattern_decula2branchubc_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decula2branchubc_11_1_performtransformation_binding != null) {
			Branch c = (Branch) result_pattern_decula2branchubc_11_1_performtransformation_binding[0];
			Command y = (Command) result_pattern_decula2branchubc_11_1_performtransformation_binding[1];
			Command z = (Command) result_pattern_decula2branchubc_11_1_performtransformation_binding[2];
			S2B d2c = (S2B) result_pattern_decula2branchubc_11_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decula2branchubc_11_1_performtransformation_binding[4];
			Branch x = (Branch) result_pattern_decula2branchubc_11_1_performtransformation_binding[5];

			Object[] result_pattern_decula2branchubc_11_1_performtransformation_black = pattern_decula2branchubc_11_1_performtransformation_blackBBBBBBFBB(
					c, y, z, d2c, d, x, _this, isApplicableMatch);
			if (result_pattern_decula2branchubc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decula2branchubc_11_1_performtransformation_black[6];

				return new Object[] { c, y, z, d2c, d, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_11_1_performtransformation_greenFFFBBFFFBB(Command y,
			Command z, Decision d, Branch x) {
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		d.setNegative(b);
		l2z.setTarget(z);
		a2x.setTarget(x);
		a2x.setSource(a);
		d.setPositive(a);
		a.setLast(l);
		l2z.setSource(l);
		a.setFirst(l);
		b2y.setTarget(y);
		b2y.setSource(b);
		return new Object[] { b, l2z, a2x, y, z, a, l, b2y, d, x };
	}

	public static final Object[] pattern_decula2branchubc_11_2_collecttranslatedelements_blackBBBBBBBBB(Assignment b,
			S2N l2z, S2B a2x, Command y, Command z, While a, Assignment l, S2N b2y, Branch x) {
		if (!b.equals(l)) {
			if (!y.equals(z)) {
				if (!b2y.equals(l2z)) {
					return new Object[] { b, l2z, a2x, y, z, a, l, b2y, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_11_2_collecttranslatedelements_greenFBBBBBBBBB(Assignment b,
			S2N l2z, S2B a2x, Command y, Command z, While a, Assignment l, S2N b2y, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(x);
		return new Object[] { ruleresult, b, l2z, a2x, y, z, a, l, b2y, x };
	}

	public static final Object[] pattern_decula2branchubc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b, EObject l2z, EObject a2x, EObject c, EObject y, EObject z,
			EObject a, EObject l, EObject d2c, EObject b2y, EObject d, EObject x) {
		if (!b.equals(l2z)) {
			if (!b.equals(c)) {
				if (!b.equals(y)) {
					if (!b.equals(z)) {
						if (!b.equals(l)) {
							if (!b.equals(d2c)) {
								if (!b.equals(b2y)) {
									if (!b.equals(d)) {
										if (!b.equals(x)) {
											if (!l2z.equals(y)) {
												if (!l2z.equals(z)) {
													if (!l2z.equals(x)) {
														if (!a2x.equals(b)) {
															if (!a2x.equals(l2z)) {
																if (!a2x.equals(c)) {
																	if (!a2x.equals(y)) {
																		if (!a2x.equals(z)) {
																			if (!a2x.equals(l)) {
																				if (!a2x.equals(d2c)) {
																					if (!a2x.equals(b2y)) {
																						if (!a2x.equals(d)) {
																							if (!a2x.equals(x)) {
																								if (!c.equals(l2z)) {
																									if (!c.equals(y)) {
																										if (!c.equals(
																												z)) {
																											if (!c.equals(
																													l)) {
																												if (!c.equals(
																														d2c)) {
																													if (!c.equals(
																															d)) {
																														if (!c.equals(
																																x)) {
																															if (!y.equals(
																																	z)) {
																																if (!a.equals(
																																		b)) {
																																	if (!a.equals(
																																			l2z)) {
																																		if (!a.equals(
																																				a2x)) {
																																			if (!a.equals(
																																					c)) {
																																				if (!a.equals(
																																						y)) {
																																					if (!a.equals(
																																							z)) {
																																						if (!a.equals(
																																								l)) {
																																							if (!a.equals(
																																									d2c)) {
																																								if (!a.equals(
																																										b2y)) {
																																									if (!a.equals(
																																											d)) {
																																										if (!a.equals(
																																												x)) {
																																											if (!l.equals(
																																													l2z)) {
																																												if (!l.equals(
																																														y)) {
																																													if (!l.equals(
																																															z)) {
																																														if (!l.equals(
																																																x)) {
																																															if (!d2c.equals(
																																																	l2z)) {
																																																if (!d2c.equals(
																																																		y)) {
																																																	if (!d2c.equals(
																																																			z)) {
																																																		if (!d2c.equals(
																																																				l)) {
																																																			if (!d2c.equals(
																																																					x)) {
																																																				if (!b2y.equals(
																																																						l2z)) {
																																																					if (!b2y.equals(
																																																							c)) {
																																																						if (!b2y.equals(
																																																								y)) {
																																																							if (!b2y.equals(
																																																									z)) {
																																																								if (!b2y.equals(
																																																										l)) {
																																																									if (!b2y.equals(
																																																											d2c)) {
																																																										if (!b2y.equals(
																																																												d)) {
																																																											if (!b2y.equals(
																																																													x)) {
																																																												if (!d.equals(
																																																														l2z)) {
																																																													if (!d.equals(
																																																															y)) {
																																																														if (!d.equals(
																																																																z)) {
																																																															if (!d.equals(
																																																																	l)) {
																																																																if (!d.equals(
																																																																		d2c)) {
																																																																	if (!d.equals(
																																																																			x)) {
																																																																		if (!x.equals(
																																																																				y)) {
																																																																			if (!x.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						b,
																																																																						l2z,
																																																																						a2x,
																																																																						c,
																																																																						y,
																																																																						z,
																																																																						a,
																																																																						l,
																																																																						d2c,
																																																																						b2y,
																																																																						d,
																																																																						x };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decula2branchubc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject b, EObject l2z, EObject a2x, EObject c, EObject y, EObject z,
			EObject a, EObject l, EObject b2y, EObject d, EObject x) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decula2branchubc";
		String c__x____positive_name_prime = "positive";
		String z__x____next_name_prime = "next";
		String l2z__z____target_name_prime = "target";
		String a__l____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String l2z__l____source_name_prime = "source";
		String c__y____negative_name_prime = "negative";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a__l____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String x__z____positive_name_prime = "positive";
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____first);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getTranslatedEdges().add(x__z____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		return new Object[] { ruleresult, b, l2z, a2x, c, y, z, a, l, b2y, d, x, c__x____positive, z__x____next,
				l2z__z____target, a__l____last, a2x__a____source, l2z__l____source, c__y____negative, b2y__y____target,
				b2y__b____source, a__l____first, d__a____positive, d__b____negative, a2x__x____target,
				x__z____positive };
	}

	public static final void pattern_decula2branchubc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decula2branchubc _this, PerformRuleResult ruleresult, EObject b, EObject l2z, EObject a2x, EObject c,
			EObject y, EObject z, EObject a, EObject l, EObject d2c, EObject b2y, EObject d, EObject x) {
		_this.registerObjects_BWD(ruleresult, b, l2z, a2x, c, y, z, a, l, d2c, b2y, d, x);

	}

	public static final PerformRuleResult pattern_decula2branchubc_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_12_1_preparereturnvalue_bindingFB(decula2branchubc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_12_1_preparereturnvalue_blackFBB(EClass eClass,
			decula2branchubc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_12_1_preparereturnvalue_bindingAndBlackFFB(
			decula2branchubc _this) {
		Object[] result_pattern_decula2branchubc_12_1_preparereturnvalue_binding = pattern_decula2branchubc_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decula2branchubc_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decula2branchubc_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decula2branchubc_12_1_preparereturnvalue_black = pattern_decula2branchubc_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decula2branchubc_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decula2branchubc_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decula2branchubc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decula2branchubc_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("y");
		EObject _localVariable_2 = match.getObject("z");
		EObject _localVariable_3 = match.getObject("x");
		EObject tmpC = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpX = _localVariable_3;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						return new Object[] { c, y, z, x, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_12_2_corematch_blackBBBFFBB(Branch c, Command y,
			Command z, Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
						"target")) {
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						_result.add(new Object[] { c, y, z, d2c, d, x, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_12_3_findcontext_blackBBBBBB(Branch c, Command y,
			Command z, S2B d2c, Decision d, Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				if (x.equals(c.getPositive())) {
					if (x.equals(z.getNext())) {
						if (y.equals(c.getNegative())) {
							if (c.equals(d2c.getTarget())) {
								if (d.equals(d2c.getSource())) {
									if (z.equals(x.getPositive())) {
										_result.add(new Object[] { c, y, z, d2c, d, x });
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

	public static final Object[] pattern_decula2branchubc_12_3_findcontext_greenBBBBBBFFFFFFF(Branch c, Command y,
			Command z, S2B d2c, Decision d, Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__x____positive_name_prime = "positive";
		String z__x____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		String x__z____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(x);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		isApplicableMatch.getAllContextElements().add(x__z____positive);
		c__x____positive.setName(c__x____positive_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		return new Object[] { c, y, z, d2c, d, x, isApplicableMatch, c__x____positive, z__x____next, c__y____negative,
				d2c__c____target, d2c__d____source, x__z____positive };
	}

	public static final Object[] pattern_decula2branchubc_12_4_solveCSP_bindingFBBBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Branch c, Command y, Command z, S2B d2c, Decision d, Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, c, y, z, d2c, d, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, y, z, d2c, d, x };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Branch c, Command y, Command z, S2B d2c, Decision d, Branch x) {
		Object[] result_pattern_decula2branchubc_12_4_solveCSP_binding = pattern_decula2branchubc_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, c, y, z, d2c, d, x);
		if (result_pattern_decula2branchubc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_12_4_solveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_12_4_solveCSP_black = pattern_decula2branchubc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, y, z, d2c, d, x };
			}
		}
		return null;
	}

	public static final boolean pattern_decula2branchubc_12_5_checkCSP_expressionFBB(decula2branchubc _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decula2branchubc_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decula2branchubc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decula2branchubc_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_20_1_preparereturnvalue_bindingFB(decula2branchubc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decula2branchubc _this) {
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

	public static final Object[] pattern_decula2branchubc_20_1_preparereturnvalue_bindingAndBlackFFBF(
			decula2branchubc _this) {
		Object[] result_pattern_decula2branchubc_20_1_preparereturnvalue_binding = pattern_decula2branchubc_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decula2branchubc_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decula2branchubc_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decula2branchubc_20_1_preparereturnvalue_black = pattern_decula2branchubc_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decula2branchubc_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decula2branchubc_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decula2branchubc_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_928449 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_1BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_340823 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_y_positive_340823)) {
					if (!x.equals(__DEC_y_positive_340823)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_2BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_778750 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_y_negative_778750)) {
					if (!x.equals(__DEC_y_negative_778750)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_307505 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_4BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_positive_360563 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_z_positive_360563)) {
					if (!x.equals(__DEC_z_positive_360563)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_5BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_negative_636074 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_z_negative_636074)) {
					if (!x.equals(__DEC_z_negative_636074)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_700527 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_7BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_651656 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_651656)) {
					if (!c.equals(__DEC_x_positive_651656)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_8BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_893713 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_893713)) {
					if (!c.equals(__DEC_x_negative_893713)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_9BB(Branch c, Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_10BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_11BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_12BB(Branch c,
			Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_13BB(Branch c,
			Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_15BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_positive.getSrc();
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			EObject tmpX = _edge_positive.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (!c.equals(x)) {
					if (x.equals(c.getPositive())) {
						Node tmpY = c.getNegative();
						if (tmpY instanceof Command) {
							Command y = (Command) tmpY;
							Node tmpZ = x.getPositive();
							if (tmpZ instanceof Command) {
								Command z = (Command) tmpZ;
								if (!y.equals(z)) {
									if (x.equals(z.getNext())) {
										if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_6B(
												x) == null) {
											if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_7BB(x,
													c) == null) {
												if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_8BB(x,
														c) == null) {
													if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_15BB(
															c, x) == null) {
														if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_0B(
																y) == null) {
															if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_1BBB(
																	y, c, x) == null) {
																if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_2BBB(
																		y, c, x) == null) {
																	if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_9BB(
																			c, y) == null) {
																		if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_10BB(
																				x, y) == null) {
																			if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_11BB(
																					x, y) == null) {
																				if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_3B(
																						z) == null) {
																					if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_4BBB(
																							z, c, x) == null) {
																						if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_5BBB(
																								z, c, x) == null) {
																							if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_12BB(
																									c, z) == null) {
																								if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_13BB(
																										c, z) == null) {
																									if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_14BB(
																											x,
																											z) == null) {
																										_result.add(
																												new Object[] {
																														c,
																														y,
																														z,
																														x,
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

		return _result;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decula2branchubc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decula2branchubc _this, Match match, Branch c, Command y, Command z, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, c, y, z, x);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decula2branchubc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decula2branchubc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decula2branchubc_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_21_1_preparereturnvalue_bindingFB(decula2branchubc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decula2branchubc _this) {
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

	public static final Object[] pattern_decula2branchubc_21_1_preparereturnvalue_bindingAndBlackFFBF(
			decula2branchubc _this) {
		Object[] result_pattern_decula2branchubc_21_1_preparereturnvalue_binding = pattern_decula2branchubc_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decula2branchubc_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decula2branchubc_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decula2branchubc_21_1_preparereturnvalue_black = pattern_decula2branchubc_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decula2branchubc_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decula2branchubc_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decula2branchubc_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_0BB(Assignment b,
			Decision d) {
		for (Decision __DEC_b_positive_17496 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_17496)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_1BB(Assignment b,
			While a) {
		for (While __DEC_b_first_60590 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_60590)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_2BB(Assignment b,
			While a) {
		for (While __DEC_b_last_947233 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_947233)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_3B(Assignment b) {
		for (Program __DEC_b_first_839951 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_810117 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_810117)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_5B(While a) {
		for (While __DEC_a_first_46937 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_46937)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_6B(While a) {
		for (While __DEC_a_last_833060 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_833060)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_7B(While a) {
		for (Program __DEC_a_first_476688 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_8BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_727962 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_727962)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_9BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_587219 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_587219)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_10BB(Assignment l,
			While a) {
		for (While __DEC_l_last_194037 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_194037)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_11B(Assignment l) {
		for (Program __DEC_l_first_97094 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_12BB(Decision d,
			Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_13BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_14BB(While a,
			Assignment b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_15BB(Decision d,
			While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_16BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_17BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpA = _edge_last.getSrc();
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			EObject tmpL = _edge_last.getTrg();
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (l.equals(a.getLast())) {
					if (l.equals(a.getFirst())) {
						if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_5B(a) == null) {
							if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_6B(a) == null) {
								if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_7B(a) == null) {
									if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_10BB(l,
											a) == null) {
										if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_11B(
												l) == null) {
											for (Decision d : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(a, Decision.class, "positive")) {
												Statement tmpB = d.getNegative();
												if (tmpB instanceof Assignment) {
													Assignment b = (Assignment) tmpB;
													if (!b.equals(l)) {
														if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_4BB(
																a, d) == null) {
															if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_8BB(
																	l, d) == null) {
																if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_9BB(
																		l, d) == null) {
																	if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_15BB(
																			d, a) == null) {
																		if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_16BB(
																				d, l) == null) {
																			if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_17BB(
																					d, l) == null) {
																				if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_0BB(
																						b, d) == null) {
																					if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_1BB(
																							b, a) == null) {
																						if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_2BB(
																								b, a) == null) {
																							if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_3B(
																									b) == null) {
																								if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_12BB(
																										d, b) == null) {
																									if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_13BB(
																											a,
																											b) == null) {
																										if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_14BB(
																												a,
																												b) == null) {
																											_result.add(
																													new Object[] {
																															b,
																															a,
																															l,
																															d,
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

		return _result;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decula2branchubc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decula2branchubc _this, Match match, Assignment b, While a, Assignment l, Decision d) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, a, l, d);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decula2branchubc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decula2branchubc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decula2branchubc_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_24_1_prepare_blackB(decula2branchubc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decula2branchubc_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_decula2branchubc_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("b");
		EObject _localVariable_1 = targetMatch.getObject("c");
		EObject _localVariable_2 = targetMatch.getObject("y");
		EObject _localVariable_3 = targetMatch.getObject("z");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = sourceMatch.getObject("l");
		EObject _localVariable_6 = sourceMatch.getObject("d");
		EObject _localVariable_7 = targetMatch.getObject("x");
		EObject tmpB = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpL = _localVariable_5;
		EObject tmpD = _localVariable_6;
		EObject tmpX = _localVariable_7;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								if (tmpD instanceof Decision) {
									Decision d = (Decision) tmpD;
									if (tmpX instanceof Branch) {
										Branch x = (Branch) tmpX;
										return new Object[] { b, c, y, z, a, l, d, x, sourceMatch, targetMatch };
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

	public static final Object[] pattern_decula2branchubc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Assignment b,
			Branch c, Command y, Command z, While a, Assignment l, Decision d, Branch x, Match sourceMatch,
			Match targetMatch) {
		if (!b.equals(l)) {
			if (!c.equals(x)) {
				if (!y.equals(z)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { b, c, y, z, a, l, d, x, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding = pattern_decula2branchubc_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding != null) {
			Assignment b = (Assignment) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[0];
			Branch c = (Branch) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[1];
			Command y = (Command) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[2];
			Command z = (Command) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[3];
			While a = (While) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[4];
			Assignment l = (Assignment) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[5];
			Decision d = (Decision) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[6];
			Branch x = (Branch) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decula2branchubc_24_2_matchsrctrgcontext_black = pattern_decula2branchubc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					b, c, y, z, a, l, d, x, sourceMatch, targetMatch);
			if (result_pattern_decula2branchubc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { b, c, y, z, a, l, d, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_24_3_solvecsp_bindingFBBBBBBBBBBB(decula2branchubc _this,
			Assignment b, Branch c, Command y, Command z, While a, Assignment l, Decision d, Branch x,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(b, c, y, z, a, l, d, x, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, b, c, y, z, a, l, d, x, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			decula2branchubc _this, Assignment b, Branch c, Command y, Command z, While a, Assignment l, Decision d,
			Branch x, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decula2branchubc_24_3_solvecsp_binding = pattern_decula2branchubc_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, b, c, y, z, a, l, d, x, sourceMatch, targetMatch);
		if (result_pattern_decula2branchubc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_24_3_solvecsp_binding[0];

			Object[] result_pattern_decula2branchubc_24_3_solvecsp_black = pattern_decula2branchubc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decula2branchubc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, b, c, y, z, a, l, d, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decula2branchubc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_24_5_matchcorrcontext_blackBFBBB(Branch c,
			Decision d, Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_decula2branchubc_24_5_matchcorrcontext_greenBBBF(S2B d2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "decula2branchubc";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_decula2branchubc_24_6_createcorrespondence_blackBBBBBBBBB(Assignment b,
			Branch c, Command y, Command z, While a, Assignment l, Decision d, Branch x, CCMatch ccMatch) {
		if (!b.equals(l)) {
			if (!c.equals(x)) {
				if (!y.equals(z)) {
					return new Object[] { b, c, y, z, a, l, d, x, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_24_6_createcorrespondence_greenBFFBBBBFBB(Assignment b,
			Command y, Command z, While a, Assignment l, Branch x, CCMatch ccMatch) {
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
		return new Object[] { b, l2z, a2x, y, z, a, l, b2y, x, ccMatch };
	}

	public static final Object[] pattern_decula2branchubc_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_decula2branchubc_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "decula2branchubc";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_decula2branchubc_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_0BB(Assignment b, Decision d) {
		for (Decision __DEC_b_positive_573236 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_573236)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_1BB(Assignment b, While a) {
		for (While __DEC_b_first_34889 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_34889)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_2BB(Assignment b, While a) {
		for (While __DEC_b_last_521200 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_521200)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_3B(Assignment b) {
		for (Program __DEC_b_first_643732 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_638749 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_638749)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_5B(While a) {
		for (While __DEC_a_first_340190 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_340190)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_6B(While a) {
		for (While __DEC_a_last_763379 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_763379)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_7B(While a) {
		for (Program __DEC_a_first_622520 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_8BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_518752 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_518752)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_9BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_189658 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_189658)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_10BB(Assignment l, While a) {
		for (While __DEC_l_last_301454 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_301454)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_11B(Assignment l) {
		for (Program __DEC_l_first_623631 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_12BB(Decision d,
			Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_13BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_14BB(While a, Assignment b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_15BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_16BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_17BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_blackBBBB(Assignment b, While a,
			Assignment l, Decision d) {
		if (!b.equals(l)) {
			if (l.equals(a.getLast())) {
				if (l.equals(a.getFirst())) {
					if (a.equals(d.getPositive())) {
						if (b.equals(d.getNegative())) {
							if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_0BB(b, d) == null) {
								if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_1BB(b, a) == null) {
									if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_2BB(b, a) == null) {
										if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_3B(b) == null) {
											if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_4BB(a,
													d) == null) {
												if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_5B(
														a) == null) {
													if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_6B(
															a) == null) {
														if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_7B(
																a) == null) {
															if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_8BB(
																	l, d) == null) {
																if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_9BB(
																		l, d) == null) {
																	if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_10BB(
																			l, a) == null) {
																		if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_11B(
																				l) == null) {
																			if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_12BB(
																					d, b) == null) {
																				if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_13BB(
																						a, b) == null) {
																					if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_14BB(
																							a, b) == null) {
																						if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_15BB(
																								d, a) == null) {
																							if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_16BB(
																									d, l) == null) {
																								if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_17BB(
																										d, l) == null) {
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
		return null;
	}

	public static final boolean pattern_decula2branchubc_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decula2branchubc_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_214981 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_1BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_530783 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_y_positive_530783)) {
					if (!x.equals(__DEC_y_positive_530783)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_2BBB(Command y, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_632001 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_y_negative_632001)) {
					if (!x.equals(__DEC_y_negative_632001)) {
						return new Object[] { y, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_638983 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_4BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_positive_776161 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_z_positive_776161)) {
					if (!x.equals(__DEC_z_positive_776161)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_5BBB(Command z, Branch c,
			Branch x) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_negative_54657 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_z_negative_54657)) {
					if (!x.equals(__DEC_z_negative_54657)) {
						return new Object[] { z, c, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_68505 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_7BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_826081 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_826081)) {
					if (!c.equals(__DEC_x_positive_826081)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_8BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_13265 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_13265)) {
					if (!c.equals(__DEC_x_negative_13265)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_9BB(Branch c, Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_10BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_11BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_13BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_14BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_15BB(Branch c, Branch x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_blackBBBB(Branch c, Command y, Command z,
			Branch x) {
		if (!c.equals(x)) {
			if (!y.equals(z)) {
				if (x.equals(c.getPositive())) {
					if (x.equals(z.getNext())) {
						if (y.equals(c.getNegative())) {
							if (z.equals(x.getPositive())) {
								if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_0B(y) == null) {
									if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_1BBB(y, c, x) == null) {
										if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_2BBB(y, c,
												x) == null) {
											if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_3B(z) == null) {
												if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_4BBB(z, c,
														x) == null) {
													if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_5BBB(z,
															c, x) == null) {
														if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_6B(
																x) == null) {
															if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_7BB(
																	x, c) == null) {
																if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_8BB(
																		x, c) == null) {
																	if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_9BB(
																			c, y) == null) {
																		if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_10BB(
																				x, y) == null) {
																			if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_11BB(
																					x, y) == null) {
																				if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_12BB(
																						c, z) == null) {
																					if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_13BB(
																							c, z) == null) {
																						if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_14BB(
																								x, z) == null) {
																							if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_15BB(
																									c, x) == null) {
																								return new Object[] { c,
																										y, z, x };
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_decula2branchubc_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decula2branchubc_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_29_1_createresult_blackB(decula2branchubc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decula2branchubc_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_decula2branchubc_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_decula2branchubc_29_2_isapplicablecore_black_nac_1BB(ruleResult, d2c) == null) {
								if (pattern_decula2branchubc_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										c) == null) {
									if (pattern_decula2branchubc_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_decula2branchubc_29_3_solveCSP_bindingFBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, c, d2c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_29_3_solveCSP_bindingAndBlackFBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decula2branchubc_29_3_solveCSP_binding = pattern_decula2branchubc_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, c, d2c, d, ruleResult);
		if (result_pattern_decula2branchubc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_29_3_solveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_29_3_solveCSP_black = pattern_decula2branchubc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decula2branchubc_29_4_checkCSP_expressionFBB(decula2branchubc _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_29_5_checknacs_blackBBB(Branch c, S2B d2c, Decision d) {
		return new Object[] { c, d2c, d };
	}

	public static final Object[] pattern_decula2branchubc_29_6_perform_blackBBBB(Branch c, S2B d2c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { c, d2c, d, ruleResult };
	}

	public static final Object[] pattern_decula2branchubc_29_6_perform_greenFFFBFFFFFBFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		ruleResult.getCorrObjects().add(l2z);
		ruleResult.getCorrObjects().add(a2x);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		l2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		a2x.setSource(a);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		a.setLast(l);
		l2z.setSource(l);
		a.setFirst(l);
		ruleResult.getSourceObjects().add(l);
		b2y.setTarget(y);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		c.setPositive(x);
		z.setNext(x);
		a2x.setTarget(x);
		x.setPositive(z);
		ruleResult.getTargetObjects().add(x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { b, l2z, a2x, c, y, z, a, l, b2y, d, x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decula2branchubc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decula2branchubcImpl
