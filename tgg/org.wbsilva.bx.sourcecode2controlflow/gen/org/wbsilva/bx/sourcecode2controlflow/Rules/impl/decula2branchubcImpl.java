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
	public boolean isAppropriate_FWD(Match match, Decision d, Assignment l, Assignment b, While a) {

		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_0_1_initialbindings_blackBBBBBB(this,
				match, d, l, b, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[l] = " + l + ", " + "[b] = " + b + ", "
					+ "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, d, l, b, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[l] = " + l + ", " + "[b] = " + b + ", "
					+ "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decula2branchubcImpl.pattern_decula2branchubc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decula2branchubcImpl
					.pattern_decula2branchubc_0_4_collectelementstobetranslated_blackBBBBB(match, d, l, b, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
			}
			decula2branchubcImpl.pattern_decula2branchubc_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, d, l,
					b, a);
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge a__l____first = (EMoflonEdge) result4_green[8];

			Object[] result5_black = decula2branchubcImpl
					.pattern_decula2branchubc_0_5_collectcontextelements_blackBBBBB(match, d, l, b, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
			}
			decula2branchubcImpl.pattern_decula2branchubc_0_5_collectcontextelements_greenBB(match, d);

			// 
			decula2branchubcImpl.pattern_decula2branchubc_0_6_registerobjectstomatch_expressionBBBBBB(this, match, d, l,
					b, a);
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
		Decision d = (Decision) result1_bindingAndBlack[0];
		Assignment l = (Assignment) result1_bindingAndBlack[1];
		Assignment b = (Assignment) result1_bindingAndBlack[2];
		Branch c = (Branch) result1_bindingAndBlack[3];
		S2B d2c = (S2B) result1_bindingAndBlack[4];
		While a = (While) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decula2branchubcImpl
				.pattern_decula2branchubc_1_1_performtransformation_greenFFBBFFBBFF(l, b, c, a);
		S2N b2y = (S2N) result1_green[0];
		Command y = (Command) result1_green[1];
		S2N l2z = (S2N) result1_green[4];
		Branch x = (Branch) result1_green[5];
		Command z = (Command) result1_green[8];
		S2B a2x = (S2B) result1_green[9];

		Object[] result2_black = decula2branchubcImpl
				.pattern_decula2branchubc_1_2_collecttranslatedelements_blackBBBBBBBBB(b2y, y, l, b, l2z, x, a, z, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b2y] = " + b2y + ", " + "[y] = "
					+ y + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[l2z] = " + l2z + ", " + "[x] = " + x
					+ ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = decula2branchubcImpl
				.pattern_decula2branchubc_1_2_collecttranslatedelements_greenFBBBBBBBBB(b2y, y, l, b, l2z, x, a, z,
						a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decula2branchubcImpl
				.pattern_decula2branchubc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, b2y, d, y, l, b, l2z,
						x, c, d2c, a, z, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2y] = " + b2y + ", " + "[d] = " + d + ", " + "[y] = " + y + ", " + "[l] = " + l + ", "
					+ "[b] = " + b + ", " + "[l2z] = " + l2z + ", " + "[x] = " + x + ", " + "[c] = " + c + ", "
					+ "[d2c] = " + d2c + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ".");
		}
		decula2branchubcImpl.pattern_decula2branchubc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, b2y, d, y, l, b, l2z, x, c, a, z, a2x);
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[25];

		// 
		// 
		decula2branchubcImpl.pattern_decula2branchubc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				b2y, d, y, l, b, l2z, x, c, d2c, a, z, a2x);
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
		Decision d = (Decision) result2_binding[0];
		Assignment l = (Assignment) result2_binding[1];
		Assignment b = (Assignment) result2_binding[2];
		While a = (While) result2_binding[3];
		for (Object[] result2_black : decula2branchubcImpl.pattern_decula2branchubc_2_2_corematch_blackBBBFFBB(d, l, b,
				a, match)) {
			Branch c = (Branch) result2_black[3];
			S2B d2c = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decula2branchubcImpl.pattern_decula2branchubc_2_3_findcontext_blackBBBBBB(d,
					l, b, c, d2c, a)) {
				Object[] result3_green = decula2branchubcImpl
						.pattern_decula2branchubc_2_3_findcontext_greenBBBBBBFFFFFFF(d, l, b, c, d2c, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = decula2branchubcImpl
						.pattern_decula2branchubc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d, l,
								b, c, d2c, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[l] = " + l
							+ ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[d2c] = " + d2c + ", " + "[a] = " + a
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
	public void registerObjectsToMatch_FWD(Match match, Decision d, Assignment l, Assignment b, While a) {
		match.registerObject("d", d);
		match.registerObject("l", l);
		match.registerObject("b", b);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision d, Assignment l, Assignment b, While a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Decision d, Assignment l, Assignment b,
			Branch c, S2B d2c, While a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject b2y, EObject d, EObject y, EObject l,
			EObject b, EObject l2z, EObject x, EObject c, EObject d2c, EObject a, EObject z, EObject a2x) {
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command y, Branch x, Branch c, Command z) {

		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_10_1_initialbindings_blackBBBBBB(this,
				match, y, x, c, z);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", "
					+ "[z] = " + z + ".");
		}

		Object[] result2_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, y, x, c, z);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", "
					+ "[z] = " + z + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decula2branchubcImpl.pattern_decula2branchubc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decula2branchubcImpl
					.pattern_decula2branchubc_10_4_collectelementstobetranslated_blackBBBBB(match, y, x, c, z);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[z] = " + z + ".");
			}
			decula2branchubcImpl.pattern_decula2branchubc_10_4_collectelementstobetranslated_greenBBBBBFFFF(match, y, x,
					c, z);
			//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[8];

			Object[] result5_black = decula2branchubcImpl
					.pattern_decula2branchubc_10_5_collectcontextelements_blackBBBBB(match, y, x, c, z);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[z] = " + z + ".");
			}
			decula2branchubcImpl.pattern_decula2branchubc_10_5_collectcontextelements_greenBB(match, c);

			// 
			decula2branchubcImpl.pattern_decula2branchubc_10_6_registerobjectstomatch_expressionBBBBBB(this, match, y,
					x, c, z);
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
		Decision d = (Decision) result1_bindingAndBlack[0];
		Command y = (Command) result1_bindingAndBlack[1];
		Branch x = (Branch) result1_bindingAndBlack[2];
		Branch c = (Branch) result1_bindingAndBlack[3];
		S2B d2c = (S2B) result1_bindingAndBlack[4];
		Command z = (Command) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decula2branchubcImpl
				.pattern_decula2branchubc_11_1_performtransformation_greenFBBFFFBFBF(d, y, x, z);
		S2N b2y = (S2N) result1_green[0];
		Assignment l = (Assignment) result1_green[3];
		Assignment b = (Assignment) result1_green[4];
		S2N l2z = (S2N) result1_green[5];
		While a = (While) result1_green[7];
		S2B a2x = (S2B) result1_green[9];

		Object[] result2_black = decula2branchubcImpl
				.pattern_decula2branchubc_11_2_collecttranslatedelements_blackBBBBBBBBB(b2y, y, l, b, l2z, x, a, z,
						a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b2y] = " + b2y + ", " + "[y] = "
					+ y + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[l2z] = " + l2z + ", " + "[x] = " + x
					+ ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = decula2branchubcImpl
				.pattern_decula2branchubc_11_2_collecttranslatedelements_greenFBBBBBBBBB(b2y, y, l, b, l2z, x, a, z,
						a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decula2branchubcImpl
				.pattern_decula2branchubc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, b2y, d, y, l, b, l2z,
						x, c, d2c, a, z, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2y] = " + b2y + ", " + "[d] = " + d + ", " + "[y] = " + y + ", " + "[l] = " + l + ", "
					+ "[b] = " + b + ", " + "[l2z] = " + l2z + ", " + "[x] = " + x + ", " + "[c] = " + c + ", "
					+ "[d2c] = " + d2c + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ".");
		}
		decula2branchubcImpl.pattern_decula2branchubc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, b2y, d, y, l, b, l2z, x, c, a, z, a2x);
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[25];

		// 
		// 
		decula2branchubcImpl.pattern_decula2branchubc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				b2y, d, y, l, b, l2z, x, c, d2c, a, z, a2x);
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
		Command y = (Command) result2_binding[0];
		Branch x = (Branch) result2_binding[1];
		Branch c = (Branch) result2_binding[2];
		Command z = (Command) result2_binding[3];
		for (Object[] result2_black : decula2branchubcImpl.pattern_decula2branchubc_12_2_corematch_blackFBBBFBB(y, x, c,
				z, match)) {
			Decision d = (Decision) result2_black[0];
			S2B d2c = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decula2branchubcImpl.pattern_decula2branchubc_12_3_findcontext_blackBBBBBB(d,
					y, x, c, d2c, z)) {
				Object[] result3_green = decula2branchubcImpl
						.pattern_decula2branchubc_12_3_findcontext_greenBBBBBBFFFFFFF(d, y, x, c, d2c, z);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = decula2branchubcImpl
						.pattern_decula2branchubc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d, y,
								x, c, d2c, z);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[y] = " + y
							+ ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[d2c] = " + d2c + ", " + "[z] = " + z
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
	public void registerObjectsToMatch_BWD(Match match, Command y, Branch x, Branch c, Command z) {
		match.registerObject("y", y);
		match.registerObject("x", x);
		match.registerObject("c", c);
		match.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command y, Branch x, Branch c, Command z) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Decision d, Command y, Branch x, Branch c,
			S2B d2c, Command z) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("z", z);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject b2y, EObject d, EObject y, EObject l,
			EObject b, EObject l2z, EObject x, EObject c, EObject d2c, EObject a, EObject z, EObject a2x) {
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_20(EMoflonEdge _edge_positive) {

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
			Command y = (Command) result2_black[0];
			Branch x = (Branch) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Command z = (Command) result2_black[3];
			Object[] result2_green = decula2branchubcImpl
					.pattern_decula2branchubc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decula2branchubcImpl
					.pattern_decula2branchubc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, y, x, c, z)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_21(EMoflonEdge _edge_positive) {

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
				.pattern_decula2branchubc_21_2_testcorematchandDECs_blackFFFFB(_edge_positive)) {
			Decision d = (Decision) result2_black[0];
			Assignment l = (Assignment) result2_black[1];
			Assignment b = (Assignment) result2_black[2];
			While a = (While) result2_black[3];
			Object[] result2_green = decula2branchubcImpl
					.pattern_decula2branchubc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decula2branchubcImpl
					.pattern_decula2branchubc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, d, l, b, a)) {
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
		Decision d = (Decision) result2_bindingAndBlack[0];
		Command y = (Command) result2_bindingAndBlack[1];
		Assignment l = (Assignment) result2_bindingAndBlack[2];
		Assignment b = (Assignment) result2_bindingAndBlack[3];
		Branch x = (Branch) result2_bindingAndBlack[4];
		Branch c = (Branch) result2_bindingAndBlack[5];
		While a = (While) result2_bindingAndBlack[6];
		Command z = (Command) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, d, y, l, b, x, c, a, z,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[d] = " + d + ", " + "[y] = " + y + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[x] = "
					+ x + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decula2branchubcImpl.pattern_decula2branchubc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decula2branchubcImpl
					.pattern_decula2branchubc_24_5_matchcorrcontext_blackBBFBB(d, c, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[2];
				Object[] result5_green = decula2branchubcImpl
						.pattern_decula2branchubc_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decula2branchubcImpl
						.pattern_decula2branchubc_24_6_createcorrespondence_blackBBBBBBBBB(d, y, l, b, x, c, a, z,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
							+ "[y] = " + y + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[x] = " + x + ", "
							+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decula2branchubcImpl.pattern_decula2branchubc_24_6_createcorrespondence_greenFBBBFBBBFB(y, l, b, x, a,
						z, ccMatch);
				//nothing S2N b2y = (S2N) result6_green[0];
				//nothing S2N l2z = (S2N) result6_green[4];
				//nothing S2B a2x = (S2B) result6_green[8];

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
	public CSP isApplicable_solveCsp_CC(Decision d, Command y, Assignment l, Assignment b, Branch x, Branch c, While a,
			Command z, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Decision d, Assignment l, Assignment b, While a) {// 
		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_27_1_matchtggpattern_blackBBBB(d, l, b,
				a);
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
	public boolean checkDEC_BWD(Command y, Branch x, Branch c, Command z) {// 
		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_28_1_matchtggpattern_blackBBBB(y, x, c,
				z);
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
			Decision d = (Decision) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = decula2branchubcImpl
					.pattern_decula2branchubc_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d, c, d2c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[c] = " + c
						+ ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decula2branchubcImpl.pattern_decula2branchubc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decula2branchubcImpl.pattern_decula2branchubc_29_5_checknacs_blackBBB(d, c,
						d2c);
				if (result5_black != null) {

					Object[] result6_black = decula2branchubcImpl.pattern_decula2branchubc_29_6_perform_blackBBBB(d, c,
							d2c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
								+ "[c] = " + c + ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decula2branchubcImpl.pattern_decula2branchubc_29_6_perform_greenFBFFFFFBFFFB(d, c, ruleResult);
					//nothing S2N b2y = (S2N) result6_green[0];
					//nothing Command y = (Command) result6_green[2];
					//nothing Assignment l = (Assignment) result6_green[3];
					//nothing Assignment b = (Assignment) result6_green[4];
					//nothing S2N l2z = (S2N) result6_green[5];
					//nothing Branch x = (Branch) result6_green[6];
					//nothing While a = (While) result6_green[8];
					//nothing Command z = (Command) result6_green[9];
					//nothing S2B a2x = (S2B) result6_green[10];

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
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_FWD__MATCH_DECISION_ASSIGNMENT_ASSIGNMENT_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.DECULA2BRANCHUBC___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_ASSIGNMENT_ASSIGNMENT_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4));
			return null;
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_ASSIGNMENT_ASSIGNMENT_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DECISION_ASSIGNMENT_ASSIGNMENT_BRANCH_S2B_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (Branch) arguments.get(4),
					(S2B) arguments.get(5), (While) arguments.get(6));
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
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECULA2BRANCHUBC___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
			return null;
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_COMMAND_BRANCH_BRANCH_S2B_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(S2B) arguments.get(5), (Command) arguments.get(6));
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
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_20__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_20((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_21__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_21((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_CC__DECISION_COMMAND_ASSIGNMENT_ASSIGNMENT_BRANCH_BRANCH_WHILE_COMMAND_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Decision) arguments.get(0), (Command) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5), (While) arguments.get(6), (Command) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___CHECK_DEC_FWD__DECISION_ASSIGNMENT_ASSIGNMENT_WHILE:
			return checkDEC_FWD((Decision) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3));
		case RulesPackage.DECULA2BRANCHUBC___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH_COMMAND:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.DECULA2BRANCHUBC___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECULA2BRANCHUBC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_BRANCH_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECULA2BRANCHUBC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decula2branchubc_0_1_initialbindings_blackBBBBBB(decula2branchubc _this,
			Match match, Decision d, Assignment l, Assignment b, While a) {
		if (!b.equals(l)) {
			return new Object[] { _this, match, d, l, b, a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_0_2_SolveCSP_bindingFBBBBBB(decula2branchubc _this,
			Match match, Decision d, Assignment l, Assignment b, While a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, d, l, b, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, d, l, b, a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_0_2_SolveCSP_bindingAndBlackFBBBBBB(decula2branchubc _this,
			Match match, Decision d, Assignment l, Assignment b, While a) {
		Object[] result_pattern_decula2branchubc_0_2_SolveCSP_binding = pattern_decula2branchubc_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, d, l, b, a);
		if (result_pattern_decula2branchubc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_0_2_SolveCSP_black = pattern_decula2branchubc_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, d, l, b, a };
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
			Decision d, Assignment l, Assignment b, While a) {
		if (!b.equals(l)) {
			return new Object[] { match, d, l, b, a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_0_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Decision d, Assignment l, Assignment b, While a) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String a__l____last_name_prime = "last";
		String a__l____first_name_prime = "first";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____first);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		return new Object[] { match, d, l, b, a, d__a____positive, d__b____negative, a__l____last, a__l____first };
	}

	public static final Object[] pattern_decula2branchubc_0_5_collectcontextelements_blackBBBBB(Match match, Decision d,
			Assignment l, Assignment b, While a) {
		if (!b.equals(l)) {
			return new Object[] { match, d, l, b, a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decula2branchubc_0_6_registerobjectstomatch_expressionBBBBBB(
			decula2branchubc _this, Match match, Decision d, Assignment l, Assignment b, While a) {
		_this.registerObjectsToMatch_FWD(match, d, l, b, a);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("l");
		EObject _localVariable_2 = isApplicableMatch.getObject("b");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("a");
		EObject tmpD = _localVariable_0;
		EObject tmpL = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpD2c = _localVariable_4;
		EObject tmpA = _localVariable_5;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpD2c instanceof S2B) {
							S2B d2c = (S2B) tmpD2c;
							if (tmpA instanceof While) {
								While a = (While) tmpA;
								return new Object[] { d, l, b, c, d2c, a, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_1_1_performtransformation_blackBBBBBBFBB(Decision d,
			Assignment l, Assignment b, Branch c, S2B d2c, While a, decula2branchubc _this,
			IsApplicableMatch isApplicableMatch) {
		if (!b.equals(l)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { d, l, b, c, d2c, a, csp, _this, isApplicableMatch };
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
			Decision d = (Decision) result_pattern_decula2branchubc_1_1_performtransformation_binding[0];
			Assignment l = (Assignment) result_pattern_decula2branchubc_1_1_performtransformation_binding[1];
			Assignment b = (Assignment) result_pattern_decula2branchubc_1_1_performtransformation_binding[2];
			Branch c = (Branch) result_pattern_decula2branchubc_1_1_performtransformation_binding[3];
			S2B d2c = (S2B) result_pattern_decula2branchubc_1_1_performtransformation_binding[4];
			While a = (While) result_pattern_decula2branchubc_1_1_performtransformation_binding[5];

			Object[] result_pattern_decula2branchubc_1_1_performtransformation_black = pattern_decula2branchubc_1_1_performtransformation_blackBBBBBBFBB(
					d, l, b, c, d2c, a, _this, isApplicableMatch);
			if (result_pattern_decula2branchubc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decula2branchubc_1_1_performtransformation_black[6];

				return new Object[] { d, l, b, c, d2c, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_1_1_performtransformation_greenFFBBFFBBFF(Assignment l,
			Assignment b, Branch c, While a) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setSource(b);
		b2y.setTarget(y);
		c.setNegative(y);
		l2z.setSource(l);
		c.setPositive(x);
		x.setPositive(z);
		l2z.setTarget(z);
		z.setNext(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { b2y, y, l, b, l2z, x, c, a, z, a2x };
	}

	public static final Object[] pattern_decula2branchubc_1_2_collecttranslatedelements_blackBBBBBBBBB(S2N b2y,
			Command y, Assignment l, Assignment b, S2N l2z, Branch x, While a, Command z, S2B a2x) {
		if (!b2y.equals(l2z)) {
			if (!y.equals(z)) {
				if (!b.equals(l)) {
					return new Object[] { b2y, y, l, b, l2z, x, a, z, a2x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_1_2_collecttranslatedelements_greenFBBBBBBBBB(S2N b2y,
			Command y, Assignment l, Assignment b, S2N l2z, Branch x, While a, Command z, S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, b2y, y, l, b, l2z, x, a, z, a2x };
	}

	public static final Object[] pattern_decula2branchubc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2y, EObject d, EObject y, EObject l, EObject b, EObject l2z,
			EObject x, EObject c, EObject d2c, EObject a, EObject z, EObject a2x) {
		if (!b2y.equals(d)) {
			if (!b2y.equals(y)) {
				if (!b2y.equals(l)) {
					if (!b2y.equals(l2z)) {
						if (!b2y.equals(x)) {
							if (!b2y.equals(c)) {
								if (!b2y.equals(d2c)) {
									if (!b2y.equals(z)) {
										if (!d.equals(y)) {
											if (!d.equals(l)) {
												if (!d.equals(l2z)) {
													if (!d.equals(x)) {
														if (!d.equals(d2c)) {
															if (!d.equals(z)) {
																if (!y.equals(z)) {
																	if (!l.equals(y)) {
																		if (!l.equals(l2z)) {
																			if (!l.equals(x)) {
																				if (!l.equals(z)) {
																					if (!b.equals(b2y)) {
																						if (!b.equals(d)) {
																							if (!b.equals(y)) {
																								if (!b.equals(l)) {
																									if (!b.equals(
																											l2z)) {
																										if (!b.equals(
																												x)) {
																											if (!b.equals(
																													c)) {
																												if (!b.equals(
																														d2c)) {
																													if (!b.equals(
																															z)) {
																														if (!l2z.equals(
																																y)) {
																															if (!l2z.equals(
																																	x)) {
																																if (!l2z.equals(
																																		z)) {
																																	if (!x.equals(
																																			y)) {
																																		if (!x.equals(
																																				z)) {
																																			if (!c.equals(
																																					d)) {
																																				if (!c.equals(
																																						y)) {
																																					if (!c.equals(
																																							l)) {
																																						if (!c.equals(
																																								l2z)) {
																																							if (!c.equals(
																																									x)) {
																																								if (!c.equals(
																																										d2c)) {
																																									if (!c.equals(
																																											z)) {
																																										if (!d2c.equals(
																																												y)) {
																																											if (!d2c.equals(
																																													l)) {
																																												if (!d2c.equals(
																																														l2z)) {
																																													if (!d2c.equals(
																																															x)) {
																																														if (!d2c.equals(
																																																z)) {
																																															if (!a.equals(
																																																	b2y)) {
																																																if (!a.equals(
																																																		d)) {
																																																	if (!a.equals(
																																																			y)) {
																																																		if (!a.equals(
																																																				l)) {
																																																			if (!a.equals(
																																																					b)) {
																																																				if (!a.equals(
																																																						l2z)) {
																																																					if (!a.equals(
																																																							x)) {
																																																						if (!a.equals(
																																																								c)) {
																																																							if (!a.equals(
																																																									d2c)) {
																																																								if (!a.equals(
																																																										z)) {
																																																									if (!a.equals(
																																																											a2x)) {
																																																										if (!a2x.equals(
																																																												b2y)) {
																																																											if (!a2x.equals(
																																																													d)) {
																																																												if (!a2x.equals(
																																																														y)) {
																																																													if (!a2x.equals(
																																																															l)) {
																																																														if (!a2x.equals(
																																																																b)) {
																																																															if (!a2x.equals(
																																																																	l2z)) {
																																																																if (!a2x.equals(
																																																																		x)) {
																																																																	if (!a2x.equals(
																																																																			c)) {
																																																																		if (!a2x.equals(
																																																																				d2c)) {
																																																																			if (!a2x.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						b2y,
																																																																						d,
																																																																						y,
																																																																						l,
																																																																						b,
																																																																						l2z,
																																																																						x,
																																																																						c,
																																																																						d2c,
																																																																						a,
																																																																						z,
																																																																						a2x };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject b2y, EObject d, EObject y, EObject l, EObject b, EObject l2z,
			EObject x, EObject c, EObject a, EObject z, EObject a2x) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decula2branchubc";
		String d__a____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String l2z__l____source_name_prime = "source";
		String x__z____positive_name_prime = "positive";
		String b2y__b____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String a__l____last_name_prime = "last";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String a__l____first_name_prime = "first";
		String l2z__z____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getCreatedEdges().add(x__z____positive);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____first);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		return new Object[] { ruleresult, b2y, d, y, l, b, l2z, x, c, a, z, a2x, d__a____positive, b2y__y____target,
				l2z__l____source, x__z____positive, b2y__b____source, d__b____negative, a__l____last, c__y____negative,
				c__x____positive, a__l____first, l2z__z____target, z__x____next, a2x__x____target, a2x__a____source };
	}

	public static final void pattern_decula2branchubc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decula2branchubc _this, PerformRuleResult ruleresult, EObject b2y, EObject d, EObject y, EObject l,
			EObject b, EObject l2z, EObject x, EObject c, EObject d2c, EObject a, EObject z, EObject a2x) {
		_this.registerObjects_FWD(ruleresult, b2y, d, y, l, b, l2z, x, c, d2c, a, z, a2x);

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
		EObject _localVariable_0 = match.getObject("d");
		EObject _localVariable_1 = match.getObject("l");
		EObject _localVariable_2 = match.getObject("b");
		EObject _localVariable_3 = match.getObject("a");
		EObject tmpD = _localVariable_0;
		EObject tmpL = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpA = _localVariable_3;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						return new Object[] { d, l, b, a, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_2_2_corematch_blackBBBFFBB(Decision d, Assignment l,
			Assignment b, While a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(l)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { d, l, b, c, d2c, a, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_2_3_findcontext_blackBBBBBB(Decision d,
			Assignment l, Assignment b, Branch c, S2B d2c, While a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(l)) {
			if (a.equals(d.getPositive())) {
				if (d.equals(d2c.getSource())) {
					if (b.equals(d.getNegative())) {
						if (l.equals(a.getLast())) {
							if (l.equals(a.getFirst())) {
								if (c.equals(d2c.getTarget())) {
									_result.add(new Object[] { d, l, b, c, d2c, a });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_2_3_findcontext_greenBBBBBBFFFFFFF(Decision d, Assignment l,
			Assignment b, Branch c, S2B d2c, While a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d__a____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String a__l____last_name_prime = "last";
		String a__l____first_name_prime = "first";
		String d2c__c____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(a);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____first);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		return new Object[] { d, l, b, c, d2c, a, isApplicableMatch, d__a____positive, d2c__d____source,
				d__b____negative, a__l____last, a__l____first, d2c__c____target };
	}

	public static final Object[] pattern_decula2branchubc_2_4_solveCSP_bindingFBBBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Decision d, Assignment l, Assignment b, Branch c, S2B d2c, While a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, d, l, b, c, d2c, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, l, b, c, d2c, a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Decision d, Assignment l, Assignment b, Branch c, S2B d2c, While a) {
		Object[] result_pattern_decula2branchubc_2_4_solveCSP_binding = pattern_decula2branchubc_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d, l, b, c, d2c, a);
		if (result_pattern_decula2branchubc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_2_4_solveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_2_4_solveCSP_black = pattern_decula2branchubc_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, l, b, c, d2c, a };
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
			Match match, Command y, Branch x, Branch c, Command z) {
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				return new Object[] { _this, match, y, x, c, z };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_10_2_SolveCSP_bindingFBBBBBB(decula2branchubc _this,
			Match match, Command y, Branch x, Branch c, Command z) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, x, c, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, x, c, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_10_2_SolveCSP_bindingAndBlackFBBBBBB(decula2branchubc _this,
			Match match, Command y, Branch x, Branch c, Command z) {
		Object[] result_pattern_decula2branchubc_10_2_SolveCSP_binding = pattern_decula2branchubc_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, y, x, c, z);
		if (result_pattern_decula2branchubc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_10_2_SolveCSP_black = pattern_decula2branchubc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, x, c, z };
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
			Command y, Branch x, Branch c, Command z) {
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				return new Object[] { match, y, x, c, z };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_10_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Command y, Branch x, Branch c, Command z) {
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
		String x__z____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String z__x____next_name_prime = "next";
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		match.getToBeTranslatedEdges().add(x__z____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		x__z____positive.setName(x__z____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		return new Object[] { match, y, x, c, z, x__z____positive, c__y____negative, c__x____positive, z__x____next };
	}

	public static final Object[] pattern_decula2branchubc_10_5_collectcontextelements_blackBBBBB(Match match, Command y,
			Branch x, Branch c, Command z) {
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				return new Object[] { match, y, x, c, z };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decula2branchubc_10_6_registerobjectstomatch_expressionBBBBBB(
			decula2branchubc _this, Match match, Command y, Branch x, Branch c, Command z) {
		_this.registerObjectsToMatch_BWD(match, y, x, c, z);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("y");
		EObject _localVariable_2 = isApplicableMatch.getObject("x");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("z");
		EObject tmpD = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpD2c = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpD2c instanceof S2B) {
							S2B d2c = (S2B) tmpD2c;
							if (tmpZ instanceof Command) {
								Command z = (Command) tmpZ;
								return new Object[] { d, y, x, c, d2c, z, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_11_1_performtransformation_blackBBBBBBFBB(Decision d,
			Command y, Branch x, Branch c, S2B d2c, Command z, decula2branchubc _this,
			IsApplicableMatch isApplicableMatch) {
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { d, y, x, c, d2c, z, csp, _this, isApplicableMatch };
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
			Decision d = (Decision) result_pattern_decula2branchubc_11_1_performtransformation_binding[0];
			Command y = (Command) result_pattern_decula2branchubc_11_1_performtransformation_binding[1];
			Branch x = (Branch) result_pattern_decula2branchubc_11_1_performtransformation_binding[2];
			Branch c = (Branch) result_pattern_decula2branchubc_11_1_performtransformation_binding[3];
			S2B d2c = (S2B) result_pattern_decula2branchubc_11_1_performtransformation_binding[4];
			Command z = (Command) result_pattern_decula2branchubc_11_1_performtransformation_binding[5];

			Object[] result_pattern_decula2branchubc_11_1_performtransformation_black = pattern_decula2branchubc_11_1_performtransformation_blackBBBBBBFBB(
					d, y, x, c, d2c, z, _this, isApplicableMatch);
			if (result_pattern_decula2branchubc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decula2branchubc_11_1_performtransformation_black[6];

				return new Object[] { d, y, x, c, d2c, z, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_11_1_performtransformation_greenFBBFFFBFBF(Decision d,
			Command y, Branch x, Command z) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		d.setNegative(b);
		l2z.setSource(l);
		l2z.setTarget(z);
		d.setPositive(a);
		a.setLast(l);
		a.setFirst(l);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { b2y, d, y, l, b, l2z, x, a, z, a2x };
	}

	public static final Object[] pattern_decula2branchubc_11_2_collecttranslatedelements_blackBBBBBBBBB(S2N b2y,
			Command y, Assignment l, Assignment b, S2N l2z, Branch x, While a, Command z, S2B a2x) {
		if (!b2y.equals(l2z)) {
			if (!y.equals(z)) {
				if (!b.equals(l)) {
					return new Object[] { b2y, y, l, b, l2z, x, a, z, a2x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_11_2_collecttranslatedelements_greenFBBBBBBBBB(S2N b2y,
			Command y, Assignment l, Assignment b, S2N l2z, Branch x, While a, Command z, S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, b2y, y, l, b, l2z, x, a, z, a2x };
	}

	public static final Object[] pattern_decula2branchubc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2y, EObject d, EObject y, EObject l, EObject b, EObject l2z,
			EObject x, EObject c, EObject d2c, EObject a, EObject z, EObject a2x) {
		if (!b2y.equals(d)) {
			if (!b2y.equals(y)) {
				if (!b2y.equals(l)) {
					if (!b2y.equals(l2z)) {
						if (!b2y.equals(x)) {
							if (!b2y.equals(c)) {
								if (!b2y.equals(d2c)) {
									if (!b2y.equals(z)) {
										if (!d.equals(y)) {
											if (!d.equals(l)) {
												if (!d.equals(l2z)) {
													if (!d.equals(x)) {
														if (!d.equals(d2c)) {
															if (!d.equals(z)) {
																if (!y.equals(z)) {
																	if (!l.equals(y)) {
																		if (!l.equals(l2z)) {
																			if (!l.equals(x)) {
																				if (!l.equals(z)) {
																					if (!b.equals(b2y)) {
																						if (!b.equals(d)) {
																							if (!b.equals(y)) {
																								if (!b.equals(l)) {
																									if (!b.equals(
																											l2z)) {
																										if (!b.equals(
																												x)) {
																											if (!b.equals(
																													c)) {
																												if (!b.equals(
																														d2c)) {
																													if (!b.equals(
																															z)) {
																														if (!l2z.equals(
																																y)) {
																															if (!l2z.equals(
																																	x)) {
																																if (!l2z.equals(
																																		z)) {
																																	if (!x.equals(
																																			y)) {
																																		if (!x.equals(
																																				z)) {
																																			if (!c.equals(
																																					d)) {
																																				if (!c.equals(
																																						y)) {
																																					if (!c.equals(
																																							l)) {
																																						if (!c.equals(
																																								l2z)) {
																																							if (!c.equals(
																																									x)) {
																																								if (!c.equals(
																																										d2c)) {
																																									if (!c.equals(
																																											z)) {
																																										if (!d2c.equals(
																																												y)) {
																																											if (!d2c.equals(
																																													l)) {
																																												if (!d2c.equals(
																																														l2z)) {
																																													if (!d2c.equals(
																																															x)) {
																																														if (!d2c.equals(
																																																z)) {
																																															if (!a.equals(
																																																	b2y)) {
																																																if (!a.equals(
																																																		d)) {
																																																	if (!a.equals(
																																																			y)) {
																																																		if (!a.equals(
																																																				l)) {
																																																			if (!a.equals(
																																																					b)) {
																																																				if (!a.equals(
																																																						l2z)) {
																																																					if (!a.equals(
																																																							x)) {
																																																						if (!a.equals(
																																																								c)) {
																																																							if (!a.equals(
																																																									d2c)) {
																																																								if (!a.equals(
																																																										z)) {
																																																									if (!a.equals(
																																																											a2x)) {
																																																										if (!a2x.equals(
																																																												b2y)) {
																																																											if (!a2x.equals(
																																																													d)) {
																																																												if (!a2x.equals(
																																																														y)) {
																																																													if (!a2x.equals(
																																																															l)) {
																																																														if (!a2x.equals(
																																																																b)) {
																																																															if (!a2x.equals(
																																																																	l2z)) {
																																																																if (!a2x.equals(
																																																																		x)) {
																																																																	if (!a2x.equals(
																																																																			c)) {
																																																																		if (!a2x.equals(
																																																																				d2c)) {
																																																																			if (!a2x.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						b2y,
																																																																						d,
																																																																						y,
																																																																						l,
																																																																						b,
																																																																						l2z,
																																																																						x,
																																																																						c,
																																																																						d2c,
																																																																						a,
																																																																						z,
																																																																						a2x };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject b2y, EObject d, EObject y, EObject l, EObject b, EObject l2z,
			EObject x, EObject c, EObject a, EObject z, EObject a2x) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decula2branchubc";
		String d__a____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String l2z__l____source_name_prime = "source";
		String x__z____positive_name_prime = "positive";
		String b2y__b____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String a__l____last_name_prime = "last";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String a__l____first_name_prime = "first";
		String l2z__z____target_name_prime = "target";
		String z__x____next_name_prime = "next";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getTranslatedEdges().add(x__z____positive);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____first);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		a__l____first.setName(a__l____first_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		return new Object[] { ruleresult, b2y, d, y, l, b, l2z, x, c, a, z, a2x, d__a____positive, b2y__y____target,
				l2z__l____source, x__z____positive, b2y__b____source, d__b____negative, a__l____last, c__y____negative,
				c__x____positive, a__l____first, l2z__z____target, z__x____next, a2x__x____target, a2x__a____source };
	}

	public static final void pattern_decula2branchubc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decula2branchubc _this, PerformRuleResult ruleresult, EObject b2y, EObject d, EObject y, EObject l,
			EObject b, EObject l2z, EObject x, EObject c, EObject d2c, EObject a, EObject z, EObject a2x) {
		_this.registerObjects_BWD(ruleresult, b2y, d, y, l, b, l2z, x, c, d2c, a, z, a2x);

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
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("c");
		EObject _localVariable_3 = match.getObject("z");
		EObject tmpY = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						return new Object[] { y, x, c, z, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_12_2_corematch_blackFBBBFBB(Command y, Branch x,
			Branch c, Command z, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
						"target")) {
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						_result.add(new Object[] { d, y, x, c, d2c, z, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_12_3_findcontext_blackBBBBBB(Decision d, Command y,
			Branch x, Branch c, S2B d2c, Command z) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				if (z.equals(x.getPositive())) {
					if (d.equals(d2c.getSource())) {
						if (y.equals(c.getNegative())) {
							if (x.equals(c.getPositive())) {
								if (x.equals(z.getNext())) {
									if (c.equals(d2c.getTarget())) {
										_result.add(new Object[] { d, y, x, c, d2c, z });
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

	public static final Object[] pattern_decula2branchubc_12_3_findcontext_greenBBBBBBFFFFFFF(Decision d, Command y,
			Branch x, Branch c, S2B d2c, Command z) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String x__z____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String z__x____next_name_prime = "next";
		String d2c__c____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(z);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		isApplicableMatch.getAllContextElements().add(x__z____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
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
		x__z____positive.setName(x__z____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		return new Object[] { d, y, x, c, d2c, z, isApplicableMatch, x__z____positive, d2c__d____source,
				c__y____negative, c__x____positive, z__x____next, d2c__c____target };
	}

	public static final Object[] pattern_decula2branchubc_12_4_solveCSP_bindingFBBBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Decision d, Command y, Branch x, Branch c, S2B d2c, Command z) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, d, y, x, c, d2c, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, y, x, c, d2c, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Decision d, Command y, Branch x, Branch c, S2B d2c, Command z) {
		Object[] result_pattern_decula2branchubc_12_4_solveCSP_binding = pattern_decula2branchubc_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d, y, x, c, d2c, z);
		if (result_pattern_decula2branchubc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_12_4_solveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_12_4_solveCSP_black = pattern_decula2branchubc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, y, x, c, d2c, z };
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
		for (Graph __DEC_y_root_931333 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_1BBB(Command y, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_130665 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_y_positive_130665)) {
					if (!c.equals(__DEC_y_positive_130665)) {
						return new Object[] { y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_2BBB(Command y, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_417686 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_y_negative_417686)) {
					if (!c.equals(__DEC_y_negative_417686)) {
						return new Object[] { y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_844441 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_4BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_177937 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_177937)) {
					if (!c.equals(__DEC_x_positive_177937)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_5BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_939761 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_939761)) {
					if (!c.equals(__DEC_x_negative_939761)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_810797 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_7BBB(Command z, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_positive_896436 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_z_positive_896436)) {
					if (!c.equals(__DEC_z_positive_896436)) {
						return new Object[] { z, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_8BBB(Command z, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_negative_903964 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_z_negative_903964)) {
					if (!c.equals(__DEC_z_negative_903964)) {
						return new Object[] { z, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_9BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_10BB(Branch c,
			Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
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

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_13BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_14BB(Branch c,
			Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpX = _edge_positive.getSrc();
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			EObject tmpZ = _edge_positive.getTrg();
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (z.equals(x.getPositive())) {
					if (x.equals(z.getNext())) {
						if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_3B(x) == null) {
							if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_6B(z) == null) {
								if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_13BB(x, z) == null) {
									for (Branch c : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!c.equals(x)) {
											Node tmpY = c.getNegative();
											if (tmpY instanceof Command) {
												Command y = (Command) tmpY;
												if (!y.equals(z)) {
													if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_4BB(
															x, c) == null) {
														if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_5BB(
																x, c) == null) {
															if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_7BBB(
																	z, x, c) == null) {
																if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_8BBB(
																		z, x, c) == null) {
																	if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_12BB(
																			c, z) == null) {
																		if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_14BB(
																				c, z) == null) {
																			if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_0B(
																					y) == null) {
																				if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_1BBB(
																						y, x, c) == null) {
																					if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_2BBB(
																							y, x, c) == null) {
																						if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_9BB(
																								x, y) == null) {
																							if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_10BB(
																									c, y) == null) {
																								if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_11BB(
																										x, y) == null) {
																									_result.add(
																											new Object[] {
																													y,
																													x,
																													c,
																													z,
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
			decula2branchubc _this, Match match, Command y, Branch x, Branch c, Command z) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, x, c, z);
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

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_0BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_788454 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_788454)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_1BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_304297 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_304297)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_2BB(Assignment l,
			While a) {
		for (While __DEC_l_last_951191 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_951191)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_717735 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_4BB(Assignment b,
			Decision d) {
		for (Decision __DEC_b_positive_971882 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_971882)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_5BB(Assignment b,
			While a) {
		for (While __DEC_b_first_92888 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_92888)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_6BB(Assignment b,
			While a) {
		for (While __DEC_b_last_560721 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_560721)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_717579 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_8BB(While a, Decision d) {
		for (Decision __DEC_a_negative_825470 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_825470)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_9B(While a) {
		for (While __DEC_a_first_109816 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_109816)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_10B(While a) {
		for (While __DEC_a_last_120327 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_120327)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_11B(While a) {
		for (Program __DEC_a_first_399853 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_12BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_13BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_14BB(Decision d,
			Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_15BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_16BB(While a,
			Assignment b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_17BB(Decision d,
			While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_21_2_testcorematchandDECs_blackFFFFB(
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
								if (l.equals(a.getFirst())) {
									if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_8BB(a,
											d) == null) {
										if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_9B(
												a) == null) {
											if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_10B(
													a) == null) {
												if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_11B(
														a) == null) {
													if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_17BB(
															d, a) == null) {
														if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_4BB(
																b, d) == null) {
															if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_5BB(
																	b, a) == null) {
																if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_6BB(
																		b, a) == null) {
																	if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_7B(
																			b) == null) {
																		if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_14BB(
																				d, b) == null) {
																			if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_15BB(
																					a, b) == null) {
																				if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_16BB(
																						a, b) == null) {
																					if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_0BB(
																							l, d) == null) {
																						if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_1BB(
																								l, d) == null) {
																							if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_2BB(
																									l, a) == null) {
																								if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_3B(
																										l) == null) {
																									if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_12BB(
																											d,
																											l) == null) {
																										if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_13BB(
																												d,
																												l) == null) {
																											_result.add(
																													new Object[] {
																															d,
																															l,
																															b,
																															a,
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
			decula2branchubc _this, Match match, Decision d, Assignment l, Assignment b, While a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, d, l, b, a);
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
		EObject _localVariable_0 = sourceMatch.getObject("d");
		EObject _localVariable_1 = targetMatch.getObject("y");
		EObject _localVariable_2 = sourceMatch.getObject("l");
		EObject _localVariable_3 = sourceMatch.getObject("b");
		EObject _localVariable_4 = targetMatch.getObject("x");
		EObject _localVariable_5 = targetMatch.getObject("c");
		EObject _localVariable_6 = sourceMatch.getObject("a");
		EObject _localVariable_7 = targetMatch.getObject("z");
		EObject tmpD = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpL = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpC = _localVariable_5;
		EObject tmpA = _localVariable_6;
		EObject tmpZ = _localVariable_7;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpL instanceof Assignment) {
					Assignment l = (Assignment) tmpL;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpC instanceof Branch) {
								Branch c = (Branch) tmpC;
								if (tmpA instanceof While) {
									While a = (While) tmpA;
									if (tmpZ instanceof Command) {
										Command z = (Command) tmpZ;
										return new Object[] { d, y, l, b, x, c, a, z, sourceMatch, targetMatch };
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

	public static final Object[] pattern_decula2branchubc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Decision d, Command y,
			Assignment l, Assignment b, Branch x, Branch c, While a, Command z, Match sourceMatch, Match targetMatch) {
		if (!y.equals(z)) {
			if (!b.equals(l)) {
				if (!c.equals(x)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { d, y, l, b, x, c, a, z, sourceMatch, targetMatch };
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
			Decision d = (Decision) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[0];
			Command y = (Command) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[1];
			Assignment l = (Assignment) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[2];
			Assignment b = (Assignment) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[3];
			Branch x = (Branch) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[4];
			Branch c = (Branch) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[5];
			While a = (While) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[6];
			Command z = (Command) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decula2branchubc_24_2_matchsrctrgcontext_black = pattern_decula2branchubc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					d, y, l, b, x, c, a, z, sourceMatch, targetMatch);
			if (result_pattern_decula2branchubc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { d, y, l, b, x, c, a, z, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_24_3_solvecsp_bindingFBBBBBBBBBBB(decula2branchubc _this,
			Decision d, Command y, Assignment l, Assignment b, Branch x, Branch c, While a, Command z,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(d, y, l, b, x, c, a, z, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, d, y, l, b, x, c, a, z, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			decula2branchubc _this, Decision d, Command y, Assignment l, Assignment b, Branch x, Branch c, While a,
			Command z, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decula2branchubc_24_3_solvecsp_binding = pattern_decula2branchubc_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, d, y, l, b, x, c, a, z, sourceMatch, targetMatch);
		if (result_pattern_decula2branchubc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_24_3_solvecsp_binding[0];

			Object[] result_pattern_decula2branchubc_24_3_solvecsp_black = pattern_decula2branchubc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decula2branchubc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, d, y, l, b, x, c, a, z, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decula2branchubc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_24_5_matchcorrcontext_blackBBFBB(Decision d,
			Branch c, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				if (c.equals(d2c.getTarget())) {
					_result.add(new Object[] { d, c, d2c, sourceMatch, targetMatch });
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

	public static final Object[] pattern_decula2branchubc_24_6_createcorrespondence_blackBBBBBBBBB(Decision d,
			Command y, Assignment l, Assignment b, Branch x, Branch c, While a, Command z, CCMatch ccMatch) {
		if (!y.equals(z)) {
			if (!b.equals(l)) {
				if (!c.equals(x)) {
					return new Object[] { d, y, l, b, x, c, a, z, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_24_6_createcorrespondence_greenFBBBFBBBFB(Command y,
			Assignment l, Assignment b, Branch x, While a, Command z, CCMatch ccMatch) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { b2y, y, l, b, l2z, x, a, z, a2x, ccMatch };
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

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_0BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_826455 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_826455)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_1BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_880972 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_880972)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_2BB(Assignment l, While a) {
		for (While __DEC_l_last_870561 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_870561)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_457654 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_4BB(Assignment b, Decision d) {
		for (Decision __DEC_b_positive_773019 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_773019)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_5BB(Assignment b, While a) {
		for (While __DEC_b_first_657640 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_657640)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_6BB(Assignment b, While a) {
		for (While __DEC_b_last_405956 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_405956)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_129182 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_8BB(While a, Decision d) {
		for (Decision __DEC_a_negative_940110 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_940110)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_9B(While a) {
		for (While __DEC_a_first_983625 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_983625)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_10B(While a) {
		for (While __DEC_a_last_593016 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_593016)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_11B(While a) {
		for (Program __DEC_a_first_780708 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_12BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_13BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_14BB(Decision d,
			Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_15BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_16BB(While a, Assignment b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_17BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_blackBBBB(Decision d, Assignment l,
			Assignment b, While a) {
		if (!b.equals(l)) {
			if (a.equals(d.getPositive())) {
				if (b.equals(d.getNegative())) {
					if (l.equals(a.getLast())) {
						if (l.equals(a.getFirst())) {
							if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_0BB(l, d) == null) {
								if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_1BB(l, d) == null) {
									if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_2BB(l, a) == null) {
										if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_3B(l) == null) {
											if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_4BB(b,
													d) == null) {
												if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_5BB(b,
														a) == null) {
													if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_6BB(b,
															a) == null) {
														if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_7B(
																b) == null) {
															if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_8BB(
																	a, d) == null) {
																if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_9B(
																		a) == null) {
																	if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_10B(
																			a) == null) {
																		if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_11B(
																				a) == null) {
																			if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_12BB(
																					d, l) == null) {
																				if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_13BB(
																						d, l) == null) {
																					if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_14BB(
																							d, b) == null) {
																						if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_15BB(
																								a, b) == null) {
																							if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_16BB(
																									a, b) == null) {
																								if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_17BB(
																										d, a) == null) {
																									return new Object[] {
																											d, l, b,
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
		for (Graph __DEC_y_root_636436 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_1BBB(Command y, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_994727 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_y_positive_994727)) {
					if (!c.equals(__DEC_y_positive_994727)) {
						return new Object[] { y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_2BBB(Command y, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_247411 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_y_negative_247411)) {
					if (!c.equals(__DEC_y_negative_247411)) {
						return new Object[] { y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_817510 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_4BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_793468 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_793468)) {
					if (!c.equals(__DEC_x_positive_793468)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_5BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_592833 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_592833)) {
					if (!c.equals(__DEC_x_negative_592833)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_262047 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_7BBB(Command z, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_positive_672798 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_z_positive_672798)) {
					if (!c.equals(__DEC_z_positive_672798)) {
						return new Object[] { z, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_8BBB(Command z, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_negative_74891 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_z_negative_74891)) {
					if (!c.equals(__DEC_z_negative_74891)) {
						return new Object[] { z, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_9BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_10BB(Branch c, Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
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

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_13BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_14BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_blackBBBB(Command y, Branch x, Branch c,
			Command z) {
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				if (z.equals(x.getPositive())) {
					if (y.equals(c.getNegative())) {
						if (x.equals(c.getPositive())) {
							if (x.equals(z.getNext())) {
								if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_0B(y) == null) {
									if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_1BBB(y, x, c) == null) {
										if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_2BBB(y, x,
												c) == null) {
											if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_3B(x) == null) {
												if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_4BB(x,
														c) == null) {
													if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_5BB(x,
															c) == null) {
														if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_6B(
																z) == null) {
															if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_7BBB(
																	z, x, c) == null) {
																if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_8BBB(
																		z, x, c) == null) {
																	if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_9BB(
																			x, y) == null) {
																		if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_10BB(
																				c, y) == null) {
																			if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_11BB(
																					x, y) == null) {
																				if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_12BB(
																						c, z) == null) {
																					if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_13BB(
																							x, z) == null) {
																						if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_14BB(
																								c, z) == null) {
																							return new Object[] { y, x,
																									c, z };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
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
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
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
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						Branch c = d2c.getTarget();
						if (c != null) {
							if (pattern_decula2branchubc_29_2_isapplicablecore_black_nac_1BB(ruleResult, d2c) == null) {
								if (pattern_decula2branchubc_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										d) == null) {
									if (pattern_decula2branchubc_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_decula2branchubc_29_3_solveCSP_bindingFBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d, c, d2c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_29_3_solveCSP_bindingAndBlackFBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decula2branchubc_29_3_solveCSP_binding = pattern_decula2branchubc_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d, c, d2c, ruleResult);
		if (result_pattern_decula2branchubc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_29_3_solveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_29_3_solveCSP_black = pattern_decula2branchubc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decula2branchubc_29_4_checkCSP_expressionFBB(decula2branchubc _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_29_5_checknacs_blackBBB(Decision d, Branch c, S2B d2c) {
		return new Object[] { d, c, d2c };
	}

	public static final Object[] pattern_decula2branchubc_29_6_perform_blackBBBB(Decision d, Branch c, S2B d2c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d, c, d2c, ruleResult };
	}

	public static final Object[] pattern_decula2branchubc_29_6_perform_greenFBFFFFFBFFFB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(b2y);
		b2y.setTarget(y);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		ruleResult.getSourceObjects().add(l);
		b2y.setSource(b);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		l2z.setSource(l);
		ruleResult.getCorrObjects().add(l2z);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		d.setPositive(a);
		a.setLast(l);
		a.setFirst(l);
		ruleResult.getSourceObjects().add(a);
		x.setPositive(z);
		l2z.setTarget(z);
		z.setNext(x);
		ruleResult.getTargetObjects().add(z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { b2y, d, y, l, b, l2z, x, c, a, z, a2x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decula2branchubc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decula2branchubcImpl
