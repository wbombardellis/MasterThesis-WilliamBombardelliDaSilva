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
	public boolean isAppropriate_FWD(Match match, Assignment l, While a, Assignment b, Decision d) {

		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_0_1_initialbindings_blackBBBBBB(this,
				match, l, a, b, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[b] = " + b + ", "
					+ "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, l, a, b, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[b] = " + b + ", "
					+ "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decula2branchubcImpl.pattern_decula2branchubc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decula2branchubcImpl
					.pattern_decula2branchubc_0_4_collectelementstobetranslated_blackBBBBB(match, l, a, b, d);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[l] = " + l + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
			}
			decula2branchubcImpl.pattern_decula2branchubc_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, l, a,
					b, d);
			//nothing EMoflonEdge a__l____first = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge a__l____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[8];

			Object[] result5_black = decula2branchubcImpl
					.pattern_decula2branchubc_0_5_collectcontextelements_blackBBBBB(match, l, a, b, d);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[l] = " + l + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
			}
			decula2branchubcImpl.pattern_decula2branchubc_0_5_collectcontextelements_greenBB(match, d);

			// 
			decula2branchubcImpl.pattern_decula2branchubc_0_6_registerobjectstomatch_expressionBBBBBB(this, match, l, a,
					b, d);
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
		Assignment l = (Assignment) result1_bindingAndBlack[0];
		S2B d2c = (S2B) result1_bindingAndBlack[1];
		While a = (While) result1_bindingAndBlack[2];
		Assignment b = (Assignment) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		Branch c = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decula2branchubcImpl
				.pattern_decula2branchubc_1_1_performtransformation_greenFBFBFFBFFB(l, a, b, c);
		S2N l2z = (S2N) result1_green[0];
		S2N b2y = (S2N) result1_green[2];
		Branch x = (Branch) result1_green[4];
		Command z = (Command) result1_green[5];
		Command y = (Command) result1_green[7];
		S2B a2x = (S2B) result1_green[8];

		Object[] result2_black = decula2branchubcImpl
				.pattern_decula2branchubc_1_2_collecttranslatedelements_blackBBBBBBBBB(l2z, l, b2y, a, x, z, b, y, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l2z] = " + l2z + ", " + "[l] = "
					+ l + ", " + "[b2y] = " + b2y + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[z] = " + z
					+ ", " + "[b] = " + b + ", " + "[y] = " + y + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = decula2branchubcImpl
				.pattern_decula2branchubc_1_2_collecttranslatedelements_greenFBBBBBBBBB(l2z, l, b2y, a, x, z, b, y,
						a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decula2branchubcImpl
				.pattern_decula2branchubc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, l2z, l, b2y, d2c, a, x,
						z, b, y, d, a2x, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l2z] = " + l2z + ", " + "[l] = " + l + ", " + "[b2y] = " + b2y + ", " + "[d2c] = " + d2c
					+ ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[b] = " + b + ", "
					+ "[y] = " + y + ", " + "[d] = " + d + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c + ".");
		}
		decula2branchubcImpl.pattern_decula2branchubc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, l2z, l, b2y, a, x, z, b, y, d, a2x, c);
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[25];

		// 
		// 
		decula2branchubcImpl.pattern_decula2branchubc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				l2z, l, b2y, d2c, a, x, z, b, y, d, a2x, c);
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
		Assignment l = (Assignment) result2_binding[0];
		While a = (While) result2_binding[1];
		Assignment b = (Assignment) result2_binding[2];
		Decision d = (Decision) result2_binding[3];
		for (Object[] result2_black : decula2branchubcImpl.pattern_decula2branchubc_2_2_corematch_blackBFBBBFB(l, a, b,
				d, match)) {
			S2B d2c = (S2B) result2_black[1];
			Branch c = (Branch) result2_black[5];
			// ForEach 
			for (Object[] result3_black : decula2branchubcImpl.pattern_decula2branchubc_2_3_findcontext_blackBBBBBB(l,
					d2c, a, b, d, c)) {
				Object[] result3_green = decula2branchubcImpl
						.pattern_decula2branchubc_2_3_findcontext_greenBBBBBBFFFFFFF(l, d2c, a, b, d, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = decula2branchubcImpl
						.pattern_decula2branchubc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, l, d2c,
								a, b, d, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[l] = " + l + ", " + "[d2c] = "
							+ d2c + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[c] = "
							+ c + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Assignment l, While a, Assignment b, Decision d) {
		match.registerObject("l", l);
		match.registerObject("a", a);
		match.registerObject("b", b);
		match.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment l, While a, Assignment b, Decision d) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment l, S2B d2c, While a,
			Assignment b, Decision d, Branch c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject l2z, EObject l, EObject b2y, EObject d2c,
			EObject a, EObject x, EObject z, EObject b, EObject y, EObject d, EObject a2x, EObject c) {
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("c", c);

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
	public boolean isAppropriate_BWD(Match match, Branch x, Command z, Command y, Branch c) {

		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_10_1_initialbindings_blackBBBBBB(this,
				match, x, z, y, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[y] = " + y + ", "
					+ "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, x, z, y, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[y] = " + y + ", "
					+ "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decula2branchubcImpl.pattern_decula2branchubc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decula2branchubcImpl
					.pattern_decula2branchubc_10_4_collectelementstobetranslated_blackBBBBB(match, x, z, y, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[c] = " + c + ".");
			}
			decula2branchubcImpl.pattern_decula2branchubc_10_4_collectelementstobetranslated_greenBBBBBFFFF(match, x, z,
					y, c);
			//nothing EMoflonEdge z__x____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[8];

			Object[] result5_black = decula2branchubcImpl
					.pattern_decula2branchubc_10_5_collectcontextelements_blackBBBBB(match, x, z, y, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[c] = " + c + ".");
			}
			decula2branchubcImpl.pattern_decula2branchubc_10_5_collectcontextelements_greenBB(match, c);

			// 
			decula2branchubcImpl.pattern_decula2branchubc_10_6_registerobjectstomatch_expressionBBBBBB(this, match, x,
					z, y, c);
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
		S2B d2c = (S2B) result1_bindingAndBlack[0];
		Branch x = (Branch) result1_bindingAndBlack[1];
		Command z = (Command) result1_bindingAndBlack[2];
		Command y = (Command) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		Branch c = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decula2branchubcImpl
				.pattern_decula2branchubc_11_1_performtransformation_greenFFFFBBFBBF(x, z, y, d);
		S2N l2z = (S2N) result1_green[0];
		Assignment l = (Assignment) result1_green[1];
		S2N b2y = (S2N) result1_green[2];
		While a = (While) result1_green[3];
		Assignment b = (Assignment) result1_green[6];
		S2B a2x = (S2B) result1_green[9];

		Object[] result2_black = decula2branchubcImpl
				.pattern_decula2branchubc_11_2_collecttranslatedelements_blackBBBBBBBBB(l2z, l, b2y, a, x, z, b, y,
						a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l2z] = " + l2z + ", " + "[l] = "
					+ l + ", " + "[b2y] = " + b2y + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[z] = " + z
					+ ", " + "[b] = " + b + ", " + "[y] = " + y + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = decula2branchubcImpl
				.pattern_decula2branchubc_11_2_collecttranslatedelements_greenFBBBBBBBBB(l2z, l, b2y, a, x, z, b, y,
						a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decula2branchubcImpl
				.pattern_decula2branchubc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, l2z, l, b2y, d2c, a,
						x, z, b, y, d, a2x, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l2z] = " + l2z + ", " + "[l] = " + l + ", " + "[b2y] = " + b2y + ", " + "[d2c] = " + d2c
					+ ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[b] = " + b + ", "
					+ "[y] = " + y + ", " + "[d] = " + d + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c + ".");
		}
		decula2branchubcImpl.pattern_decula2branchubc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, l2z, l, b2y, a, x, z, b, y, d, a2x, c);
		//nothing EMoflonEdge a__l____first = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__l____last = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[25];

		// 
		// 
		decula2branchubcImpl.pattern_decula2branchubc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				l2z, l, b2y, d2c, a, x, z, b, y, d, a2x, c);
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
		Branch x = (Branch) result2_binding[0];
		Command z = (Command) result2_binding[1];
		Command y = (Command) result2_binding[2];
		Branch c = (Branch) result2_binding[3];
		for (Object[] result2_black : decula2branchubcImpl.pattern_decula2branchubc_12_2_corematch_blackFBBBFBB(x, z, y,
				c, match)) {
			S2B d2c = (S2B) result2_black[0];
			Decision d = (Decision) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decula2branchubcImpl
					.pattern_decula2branchubc_12_3_findcontext_blackBBBBBB(d2c, x, z, y, d, c)) {
				Object[] result3_green = decula2branchubcImpl
						.pattern_decula2branchubc_12_3_findcontext_greenBBBBBBFFFFFFF(d2c, x, z, y, d, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge z__x____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge x__z____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = decula2branchubcImpl
						.pattern_decula2branchubc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d2c,
								x, z, y, d, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[x] = "
							+ x + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[d] = " + d + ", " + "[c] = " + c
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
	public void registerObjectsToMatch_BWD(Match match, Branch x, Command z, Command y, Branch c) {
		match.registerObject("x", x);
		match.registerObject("z", z);
		match.registerObject("y", y);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch x, Command z, Command y, Branch c) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B d2c, Branch x, Command z, Command y,
			Decision d, Branch c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject l2z, EObject l, EObject b2y, EObject d2c,
			EObject a, EObject x, EObject z, EObject b, EObject y, EObject d, EObject a2x, EObject c) {
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("c", c);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_69(EMoflonEdge _edge_next) {

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
				.pattern_decula2branchubc_20_2_testcorematchandDECs_blackFFFFB(_edge_next)) {
			Branch x = (Branch) result2_black[0];
			Command z = (Command) result2_black[1];
			Command y = (Command) result2_black[2];
			Branch c = (Branch) result2_black[3];
			Object[] result2_green = decula2branchubcImpl
					.pattern_decula2branchubc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decula2branchubcImpl
					.pattern_decula2branchubc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, x, z, y, c)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_75(EMoflonEdge _edge_first) {

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
				.pattern_decula2branchubc_21_2_testcorematchandDECs_blackFFFFB(_edge_first)) {
			Assignment l = (Assignment) result2_black[0];
			While a = (While) result2_black[1];
			Assignment b = (Assignment) result2_black[2];
			Decision d = (Decision) result2_black[3];
			Object[] result2_green = decula2branchubcImpl
					.pattern_decula2branchubc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decula2branchubcImpl
					.pattern_decula2branchubc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, l, a, b, d)) {
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
		Assignment l = (Assignment) result2_bindingAndBlack[0];
		While a = (While) result2_bindingAndBlack[1];
		Branch x = (Branch) result2_bindingAndBlack[2];
		Command z = (Command) result2_bindingAndBlack[3];
		Assignment b = (Assignment) result2_bindingAndBlack[4];
		Command y = (Command) result2_bindingAndBlack[5];
		Decision d = (Decision) result2_bindingAndBlack[6];
		Branch c = (Branch) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decula2branchubcImpl
				.pattern_decula2branchubc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, l, a, x, z, b, y, d, c,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[l] = " + l + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[b] = "
					+ b + ", " + "[y] = " + y + ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decula2branchubcImpl.pattern_decula2branchubc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decula2branchubcImpl
					.pattern_decula2branchubc_24_5_matchcorrcontext_blackFBBBB(d, c, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[0];
				Object[] result5_green = decula2branchubcImpl
						.pattern_decula2branchubc_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decula2branchubcImpl
						.pattern_decula2branchubc_24_6_createcorrespondence_blackBBBBBBBBB(l, a, x, z, b, y, d, c,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", "
							+ "[a] = " + a + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[b] = " + b + ", "
							+ "[y] = " + y + ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decula2branchubcImpl.pattern_decula2branchubc_24_6_createcorrespondence_greenFBFBBBBBFB(l, a, x, z, b,
						y, ccMatch);
				//nothing S2N l2z = (S2N) result6_green[0];
				//nothing S2N b2y = (S2N) result6_green[2];
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
	public CSP isApplicable_solveCsp_CC(Assignment l, While a, Branch x, Command z, Assignment b, Command y, Decision d,
			Branch c, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment l, While a, Assignment b, Decision d) {// 
		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_27_1_matchtggpattern_blackBBBB(l, a, b,
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
	public boolean checkDEC_BWD(Branch x, Command z, Command y, Branch c) {// 
		Object[] result1_black = decula2branchubcImpl.pattern_decula2branchubc_28_1_matchtggpattern_blackBBBB(x, z, y,
				c);
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
			S2B d2c = (S2B) result2_black[1];
			Decision d = (Decision) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = decula2branchubcImpl
					.pattern_decula2branchubc_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d2c, d, c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d
						+ ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decula2branchubcImpl.pattern_decula2branchubc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decula2branchubcImpl.pattern_decula2branchubc_29_5_checknacs_blackBBB(d2c, d,
						c);
				if (result5_black != null) {

					Object[] result6_black = decula2branchubcImpl.pattern_decula2branchubc_29_6_perform_blackBBBB(d2c,
							d, c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2c] = " + d2c + ", "
								+ "[d] = " + d + ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decula2branchubcImpl.pattern_decula2branchubc_29_6_perform_greenFFFFFFFFBFBB(d, c, ruleResult);
					//nothing S2N l2z = (S2N) result6_green[0];
					//nothing Assignment l = (Assignment) result6_green[1];
					//nothing S2N b2y = (S2N) result6_green[2];
					//nothing While a = (While) result6_green[3];
					//nothing Branch x = (Branch) result6_green[4];
					//nothing Command z = (Command) result6_green[5];
					//nothing Assignment b = (Assignment) result6_green[6];
					//nothing Command y = (Command) result6_green[7];
					//nothing S2B a2x = (S2B) result6_green[9];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B d2c, Decision d, Branch c,
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
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("c", c);
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
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_S2B_WHILE_ASSIGNMENT_DECISION_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(S2B) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(Decision) arguments.get(5), (Branch) arguments.get(6));
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
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_COMMAND_COMMAND_DECISION_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Command) arguments.get(4),
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
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_69__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_69((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_75__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_75((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_WHILE_BRANCH_COMMAND_ASSIGNMENT_COMMAND_DECISION_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Assignment) arguments.get(4),
					(Command) arguments.get(5), (Decision) arguments.get(6), (Branch) arguments.get(7),
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
		case RulesPackage.DECULA2BRANCHUBC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_DECISION_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Decision) arguments.get(2), (Branch) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECULA2BRANCHUBC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decula2branchubc_0_1_initialbindings_blackBBBBBB(decula2branchubc _this,
			Match match, Assignment l, While a, Assignment b, Decision d) {
		if (!b.equals(l)) {
			return new Object[] { _this, match, l, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_0_2_SolveCSP_bindingFBBBBBB(decula2branchubc _this,
			Match match, Assignment l, While a, Assignment b, Decision d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, l, a, b, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, l, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_0_2_SolveCSP_bindingAndBlackFBBBBBB(decula2branchubc _this,
			Match match, Assignment l, While a, Assignment b, Decision d) {
		Object[] result_pattern_decula2branchubc_0_2_SolveCSP_binding = pattern_decula2branchubc_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, l, a, b, d);
		if (result_pattern_decula2branchubc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_0_2_SolveCSP_black = pattern_decula2branchubc_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, l, a, b, d };
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
			Assignment l, While a, Assignment b, Decision d) {
		if (!b.equals(l)) {
			return new Object[] { match, l, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_0_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Assignment l, While a, Assignment b, Decision d) {
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		String a__l____first_name_prime = "first";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____first);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		a__l____first.setName(a__l____first_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { match, l, a, b, d, a__l____first, a__l____last, d__b____negative, d__a____positive };
	}

	public static final Object[] pattern_decula2branchubc_0_5_collectcontextelements_blackBBBBB(Match match,
			Assignment l, While a, Assignment b, Decision d) {
		if (!b.equals(l)) {
			return new Object[] { match, l, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decula2branchubc_0_6_registerobjectstomatch_expressionBBBBBB(
			decula2branchubc _this, Match match, Assignment l, While a, Assignment b, Decision d) {
		_this.registerObjectsToMatch_FWD(match, l, a, b, d);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("l");
		EObject _localVariable_1 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("b");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject _localVariable_5 = isApplicableMatch.getObject("c");
		EObject tmpL = _localVariable_0;
		EObject tmpD2c = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpC = _localVariable_5;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpD2c instanceof S2B) {
				S2B d2c = (S2B) tmpD2c;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpC instanceof Branch) {
								Branch c = (Branch) tmpC;
								return new Object[] { l, d2c, a, b, d, c, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_1_1_performtransformation_blackBBBBBBFBB(Assignment l,
			S2B d2c, While a, Assignment b, Decision d, Branch c, decula2branchubc _this,
			IsApplicableMatch isApplicableMatch) {
		if (!b.equals(l)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { l, d2c, a, b, d, c, csp, _this, isApplicableMatch };
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
			Assignment l = (Assignment) result_pattern_decula2branchubc_1_1_performtransformation_binding[0];
			S2B d2c = (S2B) result_pattern_decula2branchubc_1_1_performtransformation_binding[1];
			While a = (While) result_pattern_decula2branchubc_1_1_performtransformation_binding[2];
			Assignment b = (Assignment) result_pattern_decula2branchubc_1_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decula2branchubc_1_1_performtransformation_binding[4];
			Branch c = (Branch) result_pattern_decula2branchubc_1_1_performtransformation_binding[5];

			Object[] result_pattern_decula2branchubc_1_1_performtransformation_black = pattern_decula2branchubc_1_1_performtransformation_blackBBBBBBFBB(
					l, d2c, a, b, d, c, _this, isApplicableMatch);
			if (result_pattern_decula2branchubc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decula2branchubc_1_1_performtransformation_black[6];

				return new Object[] { l, d2c, a, b, d, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_1_1_performtransformation_greenFBFBFFBFFB(Assignment l,
			While a, Assignment b, Branch c) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setSource(l);
		b2y.setSource(b);
		c.setPositive(x);
		l2z.setTarget(z);
		z.setNext(x);
		x.setPositive(z);
		b2y.setTarget(y);
		c.setNegative(y);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { l2z, l, b2y, a, x, z, b, y, a2x, c };
	}

	public static final Object[] pattern_decula2branchubc_1_2_collecttranslatedelements_blackBBBBBBBBB(S2N l2z,
			Assignment l, S2N b2y, While a, Branch x, Command z, Assignment b, Command y, S2B a2x) {
		if (!b2y.equals(l2z)) {
			if (!b.equals(l)) {
				if (!y.equals(z)) {
					return new Object[] { l2z, l, b2y, a, x, z, b, y, a2x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_1_2_collecttranslatedelements_greenFBBBBBBBBB(S2N l2z,
			Assignment l, S2N b2y, While a, Branch x, Command z, Assignment b, Command y, S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, l2z, l, b2y, a, x, z, b, y, a2x };
	}

	public static final Object[] pattern_decula2branchubc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l2z, EObject l, EObject b2y, EObject d2c, EObject a, EObject x,
			EObject z, EObject b, EObject y, EObject d, EObject a2x, EObject c) {
		if (!l2z.equals(x)) {
			if (!l2z.equals(z)) {
				if (!l2z.equals(y)) {
					if (!l.equals(l2z)) {
						if (!l.equals(x)) {
							if (!l.equals(z)) {
								if (!l.equals(y)) {
									if (!b2y.equals(l2z)) {
										if (!b2y.equals(l)) {
											if (!b2y.equals(d2c)) {
												if (!b2y.equals(x)) {
													if (!b2y.equals(z)) {
														if (!b2y.equals(y)) {
															if (!b2y.equals(d)) {
																if (!b2y.equals(c)) {
																	if (!d2c.equals(l2z)) {
																		if (!d2c.equals(l)) {
																			if (!d2c.equals(x)) {
																				if (!d2c.equals(z)) {
																					if (!d2c.equals(y)) {
																						if (!a.equals(l2z)) {
																							if (!a.equals(l)) {
																								if (!a.equals(b2y)) {
																									if (!a.equals(
																											d2c)) {
																										if (!a.equals(
																												x)) {
																											if (!a.equals(
																													z)) {
																												if (!a.equals(
																														b)) {
																													if (!a.equals(
																															y)) {
																														if (!a.equals(
																																d)) {
																															if (!a.equals(
																																	a2x)) {
																																if (!a.equals(
																																		c)) {
																																	if (!x.equals(
																																			z)) {
																																		if (!x.equals(
																																				y)) {
																																			if (!b.equals(
																																					l2z)) {
																																				if (!b.equals(
																																						l)) {
																																					if (!b.equals(
																																							b2y)) {
																																						if (!b.equals(
																																								d2c)) {
																																							if (!b.equals(
																																									x)) {
																																								if (!b.equals(
																																										z)) {
																																									if (!b.equals(
																																											y)) {
																																										if (!b.equals(
																																												d)) {
																																											if (!b.equals(
																																													c)) {
																																												if (!y.equals(
																																														z)) {
																																													if (!d.equals(
																																															l2z)) {
																																														if (!d.equals(
																																																l)) {
																																															if (!d.equals(
																																																	d2c)) {
																																																if (!d.equals(
																																																		x)) {
																																																	if (!d.equals(
																																																			z)) {
																																																		if (!d.equals(
																																																				y)) {
																																																			if (!a2x.equals(
																																																					l2z)) {
																																																				if (!a2x.equals(
																																																						l)) {
																																																					if (!a2x.equals(
																																																							b2y)) {
																																																						if (!a2x.equals(
																																																								d2c)) {
																																																							if (!a2x.equals(
																																																									x)) {
																																																								if (!a2x.equals(
																																																										z)) {
																																																									if (!a2x.equals(
																																																											b)) {
																																																										if (!a2x.equals(
																																																												y)) {
																																																											if (!a2x.equals(
																																																													d)) {
																																																												if (!a2x.equals(
																																																														c)) {
																																																													if (!c.equals(
																																																															l2z)) {
																																																														if (!c.equals(
																																																																l)) {
																																																															if (!c.equals(
																																																																	d2c)) {
																																																																if (!c.equals(
																																																																		x)) {
																																																																	if (!c.equals(
																																																																			z)) {
																																																																		if (!c.equals(
																																																																				y)) {
																																																																			if (!c.equals(
																																																																					d)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						l2z,
																																																																						l,
																																																																						b2y,
																																																																						d2c,
																																																																						a,
																																																																						x,
																																																																						z,
																																																																						b,
																																																																						y,
																																																																						d,
																																																																						a2x,
																																																																						c };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject l2z, EObject l, EObject b2y, EObject a, EObject x, EObject z,
			EObject b, EObject y, EObject d, EObject a2x, EObject c) {
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decula2branchubc";
		String a__l____first_name_prime = "first";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a__l____last_name_prime = "last";
		String z__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String x__z____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____first);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(a__l____last);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(z__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getCreatedEdges().add(x__z____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a__l____first.setName(a__l____first_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		return new Object[] { ruleresult, l2z, l, b2y, a, x, z, b, y, d, a2x, c, a__l____first, l2z__l____source,
				l2z__z____target, b2y__b____source, a__l____last, z__x____next, b2y__y____target, d__b____negative,
				d__a____positive, a2x__a____source, a2x__x____target, x__z____positive, c__y____negative,
				c__x____positive };
	}

	public static final void pattern_decula2branchubc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decula2branchubc _this, PerformRuleResult ruleresult, EObject l2z, EObject l, EObject b2y, EObject d2c,
			EObject a, EObject x, EObject z, EObject b, EObject y, EObject d, EObject a2x, EObject c) {
		_this.registerObjects_FWD(ruleresult, l2z, l, b2y, d2c, a, x, z, b, y, d, a2x, c);

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
		EObject _localVariable_0 = match.getObject("l");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("b");
		EObject _localVariable_3 = match.getObject("d");
		EObject tmpL = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpD = _localVariable_3;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						return new Object[] { l, a, b, d, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_2_2_corematch_blackBFBBBFB(Assignment l, While a,
			Assignment b, Decision d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(l)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { l, d2c, a, b, d, c, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_2_3_findcontext_blackBBBBBB(Assignment l, S2B d2c,
			While a, Assignment b, Decision d, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(l)) {
			if (l.equals(a.getFirst())) {
				if (l.equals(a.getLast())) {
					if (b.equals(d.getNegative())) {
						if (d.equals(d2c.getSource())) {
							if (a.equals(d.getPositive())) {
								if (c.equals(d2c.getTarget())) {
									_result.add(new Object[] { l, d2c, a, b, d, c });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_2_3_findcontext_greenBBBBBBFFFFFFF(Assignment l, S2B d2c,
			While a, Assignment b, Decision d, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String a__l____first_name_prime = "first";
		String a__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		String d2c__c____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(c);
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____first);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(a__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		a__l____first.setName(a__l____first_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		return new Object[] { l, d2c, a, b, d, c, isApplicableMatch, a__l____first, a__l____last, d__b____negative,
				d2c__d____source, d__a____positive, d2c__c____target };
	}

	public static final Object[] pattern_decula2branchubc_2_4_solveCSP_bindingFBBBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Assignment l, S2B d2c, While a, Assignment b, Decision d, Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, l, d2c, a, b, d, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, l, d2c, a, b, d, c };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Assignment l, S2B d2c, While a, Assignment b, Decision d, Branch c) {
		Object[] result_pattern_decula2branchubc_2_4_solveCSP_binding = pattern_decula2branchubc_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, l, d2c, a, b, d, c);
		if (result_pattern_decula2branchubc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_2_4_solveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_2_4_solveCSP_black = pattern_decula2branchubc_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, l, d2c, a, b, d, c };
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
			Match match, Branch x, Command z, Command y, Branch c) {
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				return new Object[] { _this, match, x, z, y, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_10_2_SolveCSP_bindingFBBBBBB(decula2branchubc _this,
			Match match, Branch x, Command z, Command y, Branch c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, z, y, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, z, y, c };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_10_2_SolveCSP_bindingAndBlackFBBBBBB(decula2branchubc _this,
			Match match, Branch x, Command z, Command y, Branch c) {
		Object[] result_pattern_decula2branchubc_10_2_SolveCSP_binding = pattern_decula2branchubc_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, x, z, y, c);
		if (result_pattern_decula2branchubc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_10_2_SolveCSP_black = pattern_decula2branchubc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, z, y, c };
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
			Branch x, Command z, Command y, Branch c) {
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				return new Object[] { match, x, z, y, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_10_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Branch x, Command z, Command y, Branch c) {
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		String z__x____next_name_prime = "next";
		String x__z____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(z__x____next);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		match.getToBeTranslatedEdges().add(x__z____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		z__x____next.setName(z__x____next_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		return new Object[] { match, x, z, y, c, z__x____next, x__z____positive, c__y____negative, c__x____positive };
	}

	public static final Object[] pattern_decula2branchubc_10_5_collectcontextelements_blackBBBBB(Match match, Branch x,
			Command z, Command y, Branch c) {
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				return new Object[] { match, x, z, y, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decula2branchubc_10_6_registerobjectstomatch_expressionBBBBBB(
			decula2branchubc _this, Match match, Branch x, Command z, Command y, Branch c) {
		_this.registerObjectsToMatch_BWD(match, x, z, y, c);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("z");
		EObject _localVariable_3 = isApplicableMatch.getObject("y");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject _localVariable_5 = isApplicableMatch.getObject("c");
		EObject tmpD2c = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpC = _localVariable_5;
		if (tmpD2c instanceof S2B) {
			S2B d2c = (S2B) tmpD2c;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpC instanceof Branch) {
								Branch c = (Branch) tmpC;
								return new Object[] { d2c, x, z, y, d, c, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_11_1_performtransformation_blackBBBBBBFBB(S2B d2c, Branch x,
			Command z, Command y, Decision d, Branch c, decula2branchubc _this, IsApplicableMatch isApplicableMatch) {
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { d2c, x, z, y, d, c, csp, _this, isApplicableMatch };
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
			S2B d2c = (S2B) result_pattern_decula2branchubc_11_1_performtransformation_binding[0];
			Branch x = (Branch) result_pattern_decula2branchubc_11_1_performtransformation_binding[1];
			Command z = (Command) result_pattern_decula2branchubc_11_1_performtransformation_binding[2];
			Command y = (Command) result_pattern_decula2branchubc_11_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decula2branchubc_11_1_performtransformation_binding[4];
			Branch c = (Branch) result_pattern_decula2branchubc_11_1_performtransformation_binding[5];

			Object[] result_pattern_decula2branchubc_11_1_performtransformation_black = pattern_decula2branchubc_11_1_performtransformation_blackBBBBBBFBB(
					d2c, x, z, y, d, c, _this, isApplicableMatch);
			if (result_pattern_decula2branchubc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decula2branchubc_11_1_performtransformation_black[6];

				return new Object[] { d2c, x, z, y, d, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_11_1_performtransformation_greenFFFFBBFBBF(Branch x,
			Command z, Command y, Decision d) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setTarget(z);
		l2z.setSource(l);
		b2y.setTarget(y);
		a.setFirst(l);
		a.setLast(l);
		d.setPositive(a);
		b2y.setSource(b);
		d.setNegative(b);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { l2z, l, b2y, a, x, z, b, y, d, a2x };
	}

	public static final Object[] pattern_decula2branchubc_11_2_collecttranslatedelements_blackBBBBBBBBB(S2N l2z,
			Assignment l, S2N b2y, While a, Branch x, Command z, Assignment b, Command y, S2B a2x) {
		if (!b2y.equals(l2z)) {
			if (!b.equals(l)) {
				if (!y.equals(z)) {
					return new Object[] { l2z, l, b2y, a, x, z, b, y, a2x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_11_2_collecttranslatedelements_greenFBBBBBBBBB(S2N l2z,
			Assignment l, S2N b2y, While a, Branch x, Command z, Assignment b, Command y, S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, l2z, l, b2y, a, x, z, b, y, a2x };
	}

	public static final Object[] pattern_decula2branchubc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l2z, EObject l, EObject b2y, EObject d2c, EObject a, EObject x,
			EObject z, EObject b, EObject y, EObject d, EObject a2x, EObject c) {
		if (!l2z.equals(x)) {
			if (!l2z.equals(z)) {
				if (!l2z.equals(y)) {
					if (!l.equals(l2z)) {
						if (!l.equals(x)) {
							if (!l.equals(z)) {
								if (!l.equals(y)) {
									if (!b2y.equals(l2z)) {
										if (!b2y.equals(l)) {
											if (!b2y.equals(d2c)) {
												if (!b2y.equals(x)) {
													if (!b2y.equals(z)) {
														if (!b2y.equals(y)) {
															if (!b2y.equals(d)) {
																if (!b2y.equals(c)) {
																	if (!d2c.equals(l2z)) {
																		if (!d2c.equals(l)) {
																			if (!d2c.equals(x)) {
																				if (!d2c.equals(z)) {
																					if (!d2c.equals(y)) {
																						if (!a.equals(l2z)) {
																							if (!a.equals(l)) {
																								if (!a.equals(b2y)) {
																									if (!a.equals(
																											d2c)) {
																										if (!a.equals(
																												x)) {
																											if (!a.equals(
																													z)) {
																												if (!a.equals(
																														b)) {
																													if (!a.equals(
																															y)) {
																														if (!a.equals(
																																d)) {
																															if (!a.equals(
																																	a2x)) {
																																if (!a.equals(
																																		c)) {
																																	if (!x.equals(
																																			z)) {
																																		if (!x.equals(
																																				y)) {
																																			if (!b.equals(
																																					l2z)) {
																																				if (!b.equals(
																																						l)) {
																																					if (!b.equals(
																																							b2y)) {
																																						if (!b.equals(
																																								d2c)) {
																																							if (!b.equals(
																																									x)) {
																																								if (!b.equals(
																																										z)) {
																																									if (!b.equals(
																																											y)) {
																																										if (!b.equals(
																																												d)) {
																																											if (!b.equals(
																																													c)) {
																																												if (!y.equals(
																																														z)) {
																																													if (!d.equals(
																																															l2z)) {
																																														if (!d.equals(
																																																l)) {
																																															if (!d.equals(
																																																	d2c)) {
																																																if (!d.equals(
																																																		x)) {
																																																	if (!d.equals(
																																																			z)) {
																																																		if (!d.equals(
																																																				y)) {
																																																			if (!a2x.equals(
																																																					l2z)) {
																																																				if (!a2x.equals(
																																																						l)) {
																																																					if (!a2x.equals(
																																																							b2y)) {
																																																						if (!a2x.equals(
																																																								d2c)) {
																																																							if (!a2x.equals(
																																																									x)) {
																																																								if (!a2x.equals(
																																																										z)) {
																																																									if (!a2x.equals(
																																																											b)) {
																																																										if (!a2x.equals(
																																																												y)) {
																																																											if (!a2x.equals(
																																																													d)) {
																																																												if (!a2x.equals(
																																																														c)) {
																																																													if (!c.equals(
																																																															l2z)) {
																																																														if (!c.equals(
																																																																l)) {
																																																															if (!c.equals(
																																																																	d2c)) {
																																																																if (!c.equals(
																																																																		x)) {
																																																																	if (!c.equals(
																																																																			z)) {
																																																																		if (!c.equals(
																																																																				y)) {
																																																																			if (!c.equals(
																																																																					d)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						l2z,
																																																																						l,
																																																																						b2y,
																																																																						d2c,
																																																																						a,
																																																																						x,
																																																																						z,
																																																																						b,
																																																																						y,
																																																																						d,
																																																																						a2x,
																																																																						c };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject l2z, EObject l, EObject b2y, EObject a, EObject x, EObject z,
			EObject b, EObject y, EObject d, EObject a2x, EObject c) {
		EMoflonEdge a__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decula2branchubc";
		String a__l____first_name_prime = "first";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a__l____last_name_prime = "last";
		String z__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String x__z____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		a__l____first.setSrc(a);
		a__l____first.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____first);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__l____last.setSrc(a);
		a__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(a__l____last);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(z__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		ruleresult.getTranslatedEdges().add(x__z____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a__l____first.setName(a__l____first_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__l____last.setName(a__l____last_name_prime);
		z__x____next.setName(z__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		return new Object[] { ruleresult, l2z, l, b2y, a, x, z, b, y, d, a2x, c, a__l____first, l2z__l____source,
				l2z__z____target, b2y__b____source, a__l____last, z__x____next, b2y__y____target, d__b____negative,
				d__a____positive, a2x__a____source, a2x__x____target, x__z____positive, c__y____negative,
				c__x____positive };
	}

	public static final void pattern_decula2branchubc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decula2branchubc _this, PerformRuleResult ruleresult, EObject l2z, EObject l, EObject b2y, EObject d2c,
			EObject a, EObject x, EObject z, EObject b, EObject y, EObject d, EObject a2x, EObject c) {
		_this.registerObjects_BWD(ruleresult, l2z, l, b2y, d2c, a, x, z, b, y, d, a2x, c);

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
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("z");
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("c");
		EObject tmpX = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						return new Object[] { x, z, y, c, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_12_2_corematch_blackFBBBFBB(Branch x, Command z,
			Command y, Branch c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
						"target")) {
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						_result.add(new Object[] { d2c, x, z, y, d, c, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_12_3_findcontext_blackBBBBBB(S2B d2c, Branch x,
			Command z, Command y, Decision d, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				if (x.equals(z.getNext())) {
					if (d.equals(d2c.getSource())) {
						if (z.equals(x.getPositive())) {
							if (y.equals(c.getNegative())) {
								if (x.equals(c.getPositive())) {
									if (c.equals(d2c.getTarget())) {
										_result.add(new Object[] { d2c, x, z, y, d, c });
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

	public static final Object[] pattern_decula2branchubc_12_3_findcontext_greenBBBBBBFFFFFFF(S2B d2c, Branch x,
			Command z, Command y, Decision d, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge z__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String z__x____next_name_prime = "next";
		String d2c__d____source_name_prime = "source";
		String x__z____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String d2c__c____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(c);
		z__x____next.setSrc(z);
		z__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(z__x____next);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		x__z____positive.setSrc(x);
		x__z____positive.setTrg(z);
		isApplicableMatch.getAllContextElements().add(x__z____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		z__x____next.setName(z__x____next_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		x__z____positive.setName(x__z____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		return new Object[] { d2c, x, z, y, d, c, isApplicableMatch, z__x____next, d2c__d____source, x__z____positive,
				c__y____negative, c__x____positive, d2c__c____target };
	}

	public static final Object[] pattern_decula2branchubc_12_4_solveCSP_bindingFBBBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch x, Command z, Command y, Decision d, Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, d2c, x, z, y, d, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, x, z, y, d, c };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch x, Command z, Command y, Decision d, Branch c) {
		Object[] result_pattern_decula2branchubc_12_4_solveCSP_binding = pattern_decula2branchubc_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d2c, x, z, y, d, c);
		if (result_pattern_decula2branchubc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_12_4_solveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_12_4_solveCSP_black = pattern_decula2branchubc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, x, z, y, d, c };
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

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_819773 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_1BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_211236 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_211236)) {
					if (!c.equals(__DEC_x_positive_211236)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_2BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_253323 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_253323)) {
					if (!c.equals(__DEC_x_negative_253323)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_383942 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_4BBB(Command z, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_positive_730300 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_z_positive_730300)) {
					if (!c.equals(__DEC_z_positive_730300)) {
						return new Object[] { z, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_5BBB(Command z, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_negative_346666 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_z_negative_346666)) {
					if (!c.equals(__DEC_z_negative_346666)) {
						return new Object[] { z, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_436007 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_7BBB(Command y, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_449043 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_y_positive_449043)) {
					if (!c.equals(__DEC_y_positive_449043)) {
						return new Object[] { y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_8BBB(Command y, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_702970 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_y_negative_702970)) {
					if (!c.equals(__DEC_y_negative_702970)) {
						return new Object[] { y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_9BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_10BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_11BB(Branch c,
			Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_12BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_13BB(Branch c,
			Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpZ = _edge_next.getSrc();
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			EObject tmpX = _edge_next.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (x.equals(z.getNext())) {
					if (z.equals(x.getPositive())) {
						if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_3B(z) == null) {
							if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
								if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_10BB(x, z) == null) {
									for (Branch c : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!c.equals(x)) {
											Node tmpY = c.getNegative();
											if (tmpY instanceof Command) {
												Command y = (Command) tmpY;
												if (!y.equals(z)) {
													if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_1BB(
															x, c) == null) {
														if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_2BB(
																x, c) == null) {
															if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_4BBB(
																	z, x, c) == null) {
																if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_5BBB(
																		z, x, c) == null) {
																	if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_9BB(
																			c, z) == null) {
																		if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_11BB(
																				c, z) == null) {
																			if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_6B(
																					y) == null) {
																				if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_7BBB(
																						y, x, c) == null) {
																					if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_8BBB(
																							y, x, c) == null) {
																						if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_12BB(
																								x, y) == null) {
																							if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_13BB(
																									c, y) == null) {
																								if (pattern_decula2branchubc_20_2_testcorematchandDECs_black_nac_14BB(
																										x, y) == null) {
																									_result.add(
																											new Object[] {
																													x,
																													z,
																													y,
																													c,
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
			decula2branchubc _this, Match match, Branch x, Command z, Command y, Branch c) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, z, y, c);
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
		for (Decision __DEC_l_positive_713403 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_713403)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_1BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_991895 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_991895)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_2BB(Assignment l,
			While a) {
		for (While __DEC_l_last_770105 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_770105)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_764509 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_512396 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_512396)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_5B(While a) {
		for (While __DEC_a_first_801596 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_801596)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_6B(While a) {
		for (While __DEC_a_last_888919 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_888919)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_7B(While a) {
		for (Program __DEC_a_first_111380 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_8BB(Assignment b,
			Decision d) {
		for (Decision __DEC_b_positive_754824 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_754824)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_9BB(Assignment b,
			While a) {
		for (While __DEC_b_first_229046 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_229046)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_10BB(Assignment b,
			While a) {
		for (While __DEC_b_last_887301 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_887301)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_11B(Assignment b) {
		for (Program __DEC_b_first_758105 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
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
			While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_15BB(Decision d,
			Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_16BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_17BB(While a,
			Assignment b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpA = _edge_first.getSrc();
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			EObject tmpL = _edge_first.getTrg();
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (l.equals(a.getFirst())) {
					if (l.equals(a.getLast())) {
						if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_5B(a) == null) {
							if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_6B(a) == null) {
								if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_7B(a) == null) {
									if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_2BB(l,
											a) == null) {
										if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_3B(
												l) == null) {
											for (Decision d : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(a, Decision.class, "positive")) {
												Statement tmpB = d.getNegative();
												if (tmpB instanceof Assignment) {
													Assignment b = (Assignment) tmpB;
													if (!b.equals(l)) {
														if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_0BB(
																l, d) == null) {
															if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_1BB(
																	l, d) == null) {
																if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_4BB(
																		a, d) == null) {
																	if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_12BB(
																			d, l) == null) {
																		if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_13BB(
																				d, l) == null) {
																			if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_14BB(
																					d, a) == null) {
																				if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_8BB(
																						b, d) == null) {
																					if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_9BB(
																							b, a) == null) {
																						if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_10BB(
																								b, a) == null) {
																							if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_11B(
																									b) == null) {
																								if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_15BB(
																										d, b) == null) {
																									if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_16BB(
																											a,
																											b) == null) {
																										if (pattern_decula2branchubc_21_2_testcorematchandDECs_black_nac_17BB(
																												a,
																												b) == null) {
																											_result.add(
																													new Object[] {
																															l,
																															a,
																															b,
																															d,
																															_edge_first });
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}

											}
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
			decula2branchubc _this, Match match, Assignment l, While a, Assignment b, Decision d) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, l, a, b, d);
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
		EObject _localVariable_0 = sourceMatch.getObject("l");
		EObject _localVariable_1 = sourceMatch.getObject("a");
		EObject _localVariable_2 = targetMatch.getObject("x");
		EObject _localVariable_3 = targetMatch.getObject("z");
		EObject _localVariable_4 = sourceMatch.getObject("b");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject _localVariable_6 = sourceMatch.getObject("d");
		EObject _localVariable_7 = targetMatch.getObject("c");
		EObject tmpL = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpD = _localVariable_6;
		EObject tmpC = _localVariable_7;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								if (tmpD instanceof Decision) {
									Decision d = (Decision) tmpD;
									if (tmpC instanceof Branch) {
										Branch c = (Branch) tmpC;
										return new Object[] { l, a, x, z, b, y, d, c, sourceMatch, targetMatch };
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

	public static final Object[] pattern_decula2branchubc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Assignment l, While a,
			Branch x, Command z, Assignment b, Command y, Decision d, Branch c, Match sourceMatch, Match targetMatch) {
		if (!b.equals(l)) {
			if (!y.equals(z)) {
				if (!c.equals(x)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { l, a, x, z, b, y, d, c, sourceMatch, targetMatch };
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
			Assignment l = (Assignment) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[0];
			While a = (While) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[1];
			Branch x = (Branch) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[2];
			Command z = (Command) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[3];
			Assignment b = (Assignment) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[4];
			Command y = (Command) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[5];
			Decision d = (Decision) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[6];
			Branch c = (Branch) result_pattern_decula2branchubc_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decula2branchubc_24_2_matchsrctrgcontext_black = pattern_decula2branchubc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					l, a, x, z, b, y, d, c, sourceMatch, targetMatch);
			if (result_pattern_decula2branchubc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { l, a, x, z, b, y, d, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_24_3_solvecsp_bindingFBBBBBBBBBBB(decula2branchubc _this,
			Assignment l, While a, Branch x, Command z, Assignment b, Command y, Decision d, Branch c,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(l, a, x, z, b, y, d, c, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, l, a, x, z, b, y, d, c, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			decula2branchubc _this, Assignment l, While a, Branch x, Command z, Assignment b, Command y, Decision d,
			Branch c, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decula2branchubc_24_3_solvecsp_binding = pattern_decula2branchubc_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, l, a, x, z, b, y, d, c, sourceMatch, targetMatch);
		if (result_pattern_decula2branchubc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_24_3_solvecsp_binding[0];

			Object[] result_pattern_decula2branchubc_24_3_solvecsp_black = pattern_decula2branchubc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decula2branchubc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, l, a, x, z, b, y, d, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decula2branchubc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decula2branchubc_24_5_matchcorrcontext_blackFBBBB(Decision d,
			Branch c, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				if (c.equals(d2c.getTarget())) {
					_result.add(new Object[] { d2c, d, c, sourceMatch, targetMatch });
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

	public static final Object[] pattern_decula2branchubc_24_6_createcorrespondence_blackBBBBBBBBB(Assignment l,
			While a, Branch x, Command z, Assignment b, Command y, Decision d, Branch c, CCMatch ccMatch) {
		if (!b.equals(l)) {
			if (!y.equals(z)) {
				if (!c.equals(x)) {
					return new Object[] { l, a, x, z, b, y, d, c, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_24_6_createcorrespondence_greenFBFBBBBBFB(Assignment l,
			While a, Branch x, Command z, Assignment b, Command y, CCMatch ccMatch) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { l2z, l, b2y, a, x, z, b, y, a2x, ccMatch };
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
		for (Decision __DEC_l_positive_496589 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_496589)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_1BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_729883 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_729883)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_2BB(Assignment l, While a) {
		for (While __DEC_l_last_38991 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!a.equals(__DEC_l_last_38991)) {
				return new Object[] { l, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_626246 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_4BB(While a, Decision d) {
		for (Decision __DEC_a_negative_858096 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_858096)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_5B(While a) {
		for (While __DEC_a_first_595475 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!a.equals(__DEC_a_first_595475)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_6B(While a) {
		for (While __DEC_a_last_193641 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!a.equals(__DEC_a_last_193641)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_7B(While a) {
		for (Program __DEC_a_first_354772 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_8BB(Assignment b, Decision d) {
		for (Decision __DEC_b_positive_762343 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_762343)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_9BB(Assignment b, While a) {
		for (While __DEC_b_first_192162 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!a.equals(__DEC_b_first_192162)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_10BB(Assignment b, While a) {
		for (While __DEC_b_last_796526 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!a.equals(__DEC_b_last_796526)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_11B(Assignment b) {
		for (Program __DEC_b_first_415085 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
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

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_14BB(Decision d, While a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_15BB(Decision d,
			Assignment b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_16BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_black_nac_17BB(While a, Assignment b) {
		if (b.equals(a.getLast())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_27_1_matchtggpattern_blackBBBB(Assignment l, While a,
			Assignment b, Decision d) {
		if (!b.equals(l)) {
			if (l.equals(a.getFirst())) {
				if (l.equals(a.getLast())) {
					if (b.equals(d.getNegative())) {
						if (a.equals(d.getPositive())) {
							if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_0BB(l, d) == null) {
								if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_1BB(l, d) == null) {
									if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_2BB(l, a) == null) {
										if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_3B(l) == null) {
											if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_4BB(a,
													d) == null) {
												if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_5B(
														a) == null) {
													if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_6B(
															a) == null) {
														if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_7B(
																a) == null) {
															if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_8BB(
																	b, d) == null) {
																if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_9BB(
																		b, a) == null) {
																	if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_10BB(
																			b, a) == null) {
																		if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_11B(
																				b) == null) {
																			if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_12BB(
																					d, l) == null) {
																				if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_13BB(
																						d, l) == null) {
																					if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_14BB(
																							d, a) == null) {
																						if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_15BB(
																								d, b) == null) {
																							if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_16BB(
																									a, b) == null) {
																								if (pattern_decula2branchubc_27_1_matchtggpattern_black_nac_17BB(
																										a, b) == null) {
																									return new Object[] {
																											l, a, b,
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

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_42608 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_1BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_positive_135932 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_135932)) {
					if (!c.equals(__DEC_x_positive_135932)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_2BB(Branch x, Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_x_negative_763654 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_763654)) {
					if (!c.equals(__DEC_x_negative_763654)) {
						return new Object[] { x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_766771 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_4BBB(Command z, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_positive_352842 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_z_positive_352842)) {
					if (!c.equals(__DEC_z_positive_352842)) {
						return new Object[] { z, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_5BBB(Command z, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_z_negative_912202 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_z_negative_912202)) {
					if (!c.equals(__DEC_z_negative_912202)) {
						return new Object[] { z, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_48101 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_7BBB(Command y, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_positive_762660 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_y_positive_762660)) {
					if (!c.equals(__DEC_y_positive_762660)) {
						return new Object[] { y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_8BBB(Command y, Branch x,
			Branch c) {
		if (!c.equals(x)) {
			for (Branch __DEC_y_negative_935710 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_y_negative_935710)) {
					if (!c.equals(__DEC_y_negative_935710)) {
						return new Object[] { y, x, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_9BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_10BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_11BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_12BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_13BB(Branch c, Command y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_black_nac_14BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_28_1_matchtggpattern_blackBBBB(Branch x, Command z, Command y,
			Branch c) {
		if (!y.equals(z)) {
			if (!c.equals(x)) {
				if (x.equals(z.getNext())) {
					if (z.equals(x.getPositive())) {
						if (y.equals(c.getNegative())) {
							if (x.equals(c.getPositive())) {
								if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_0B(x) == null) {
									if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_1BB(x, c) == null) {
										if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_2BB(x, c) == null) {
											if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_3B(z) == null) {
												if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_4BBB(z, x,
														c) == null) {
													if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_5BBB(z,
															x, c) == null) {
														if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_6B(
																y) == null) {
															if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_7BBB(
																	y, x, c) == null) {
																if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_8BBB(
																		y, x, c) == null) {
																	if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_9BB(
																			c, z) == null) {
																		if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_10BB(
																				x, z) == null) {
																			if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_11BB(
																					c, z) == null) {
																				if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_12BB(
																						x, y) == null) {
																					if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_13BB(
																							c, y) == null) {
																						if (pattern_decula2branchubc_28_1_matchtggpattern_black_nac_14BB(
																								x, y) == null) {
																							return new Object[] { x, z,
																									y, c };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
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
							if (pattern_decula2branchubc_29_2_isapplicablecore_black_nac_0BB(ruleResult, d2c) == null) {
								if (pattern_decula2branchubc_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										d) == null) {
									if (pattern_decula2branchubc_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											c) == null) {
										_result.add(
												new Object[] { d2cList, d2c, d, c, ruleEntryContainer, ruleResult });
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
			IsApplicableMatch isApplicableMatch, S2B d2c, Decision d, Branch c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d2c, d, c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, d, c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decula2branchubc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decula2branchubc_29_3_solveCSP_bindingAndBlackFBBBBBB(decula2branchubc _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Decision d, Branch c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decula2branchubc_29_3_solveCSP_binding = pattern_decula2branchubc_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d2c, d, c, ruleResult);
		if (result_pattern_decula2branchubc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decula2branchubc_29_3_solveCSP_binding[0];

			Object[] result_pattern_decula2branchubc_29_3_solveCSP_black = pattern_decula2branchubc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decula2branchubc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, d, c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decula2branchubc_29_4_checkCSP_expressionFBB(decula2branchubc _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decula2branchubc_29_5_checknacs_blackBBB(S2B d2c, Decision d, Branch c) {
		return new Object[] { d2c, d, c };
	}

	public static final Object[] pattern_decula2branchubc_29_6_perform_blackBBBB(S2B d2c, Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d2c, d, c, ruleResult };
	}

	public static final Object[] pattern_decula2branchubc_29_6_perform_greenFFFFFFFFBFBB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(l2z);
		l2z.setSource(l);
		ruleResult.getSourceObjects().add(l);
		ruleResult.getCorrObjects().add(b2y);
		a.setFirst(l);
		a.setLast(l);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		l2z.setTarget(z);
		z.setNext(x);
		x.setPositive(z);
		ruleResult.getTargetObjects().add(z);
		b2y.setSource(b);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		b2y.setTarget(y);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		a2x.setSource(a);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { l2z, l, b2y, a, x, z, b, y, d, a2x, c, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decula2branchubc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decula2branchubcImpl
