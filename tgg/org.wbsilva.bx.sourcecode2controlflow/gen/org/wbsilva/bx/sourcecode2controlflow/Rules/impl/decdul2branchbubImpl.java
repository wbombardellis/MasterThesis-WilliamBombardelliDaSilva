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
import org.wbsilva.bx.sourcecode2controlflow.Rules.decdul2branchbub;

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
 * An implementation of the model object '<em><b>decdul2branchbub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class decdul2branchbubImpl extends AbstractRuleImpl implements decdul2branchbub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decdul2branchbubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdecdul2branchbub();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment l, Decision a, While b, Decision d) {

		Object[] result1_black = decdul2branchbubImpl.pattern_decdul2branchbub_0_1_initialbindings_blackBBBBBB(this,
				match, l, a, b, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[b] = " + b + ", "
					+ "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, l, a, b, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[b] = " + b + ", "
					+ "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdul2branchbubImpl.pattern_decdul2branchbub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decdul2branchbubImpl
					.pattern_decdul2branchbub_0_4_collectelementstobetranslated_blackBBBBB(match, l, a, b, d);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[l] = " + l + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
			}
			decdul2branchbubImpl.pattern_decdul2branchbub_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, l, a,
					b, d);
			//nothing EMoflonEdge b__l____first = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge b__l____last = (EMoflonEdge) result4_green[8];

			Object[] result5_black = decdul2branchbubImpl
					.pattern_decdul2branchbub_0_5_collectcontextelements_blackBBBBB(match, l, a, b, d);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[l] = " + l + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
			}
			decdul2branchbubImpl.pattern_decdul2branchbub_0_5_collectcontextelements_greenBB(match, d);

			// 
			decdul2branchbubImpl.pattern_decdul2branchbub_0_6_registerobjectstomatch_expressionBBBBBB(this, match, l, a,
					b, d);
			return decdul2branchbubImpl.pattern_decdul2branchbub_0_7_expressionF();
		} else {
			return decdul2branchbubImpl.pattern_decdul2branchbub_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment l = (Assignment) result1_bindingAndBlack[0];
		S2B d2c = (S2B) result1_bindingAndBlack[1];
		Decision a = (Decision) result1_bindingAndBlack[2];
		While b = (While) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		Branch c = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decdul2branchbubImpl
				.pattern_decdul2branchbub_1_1_performtransformation_greenBFBFBFFFFB(l, a, b, c);
		Branch x = (Branch) result1_green[1];
		S2N l2z = (S2N) result1_green[3];
		S2B a2x = (S2B) result1_green[5];
		Branch y = (Branch) result1_green[6];
		S2B b2y = (S2B) result1_green[7];
		Command z = (Command) result1_green[8];

		Object[] result2_black = decdul2branchbubImpl
				.pattern_decdul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBB(l, x, a, l2z, b, a2x, y, b2y, z);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", " + "[x] = " + x
					+ ", " + "[a] = " + a + ", " + "[l2z] = " + l2z + ", " + "[b] = " + b + ", " + "[a2x] = " + a2x
					+ ", " + "[y] = " + y + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z + ".");
		}
		Object[] result2_green = decdul2branchbubImpl
				.pattern_decdul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBB(l, x, a, l2z, b, a2x, y, b2y,
						z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdul2branchbubImpl
				.pattern_decdul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, l, x, d2c, a, l2z, b,
						d, a2x, y, b2y, z, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l] = " + l + ", " + "[x] = " + x + ", " + "[d2c] = " + d2c + ", " + "[a] = " + a + ", "
					+ "[l2z] = " + l2z + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a2x] = " + a2x + ", "
					+ "[y] = " + y + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[c] = " + c + ".");
		}
		decdul2branchbubImpl.pattern_decdul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, l, x, a, l2z, b, d, a2x, y, b2y, z, c);
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b__l____first = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[25];

		// 
		// 
		decdul2branchbubImpl.pattern_decdul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, l,
				x, d2c, a, l2z, b, d, a2x, y, b2y, z, c);
		return decdul2branchbubImpl.pattern_decdul2branchbub_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decdul2branchbubImpl
				.pattern_decdul2branchbub_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decdul2branchbubImpl.pattern_decdul2branchbub_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment l = (Assignment) result2_binding[0];
		Decision a = (Decision) result2_binding[1];
		While b = (While) result2_binding[2];
		Decision d = (Decision) result2_binding[3];
		for (Object[] result2_black : decdul2branchbubImpl.pattern_decdul2branchbub_2_2_corematch_blackBFBBBFB(l, a, b,
				d, match)) {
			S2B d2c = (S2B) result2_black[1];
			Branch c = (Branch) result2_black[5];
			// ForEach 
			for (Object[] result3_black : decdul2branchbubImpl.pattern_decdul2branchbub_2_3_findcontext_blackBBBBBB(l,
					d2c, a, b, d, c)) {
				Object[] result3_green = decdul2branchbubImpl
						.pattern_decdul2branchbub_2_3_findcontext_greenBBBBBBFFFFFFF(l, d2c, a, b, d, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge b__l____first = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = decdul2branchbubImpl
						.pattern_decdul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, l, d2c,
								a, b, d, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[l] = " + l + ", " + "[d2c] = "
							+ d2c + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[c] = "
							+ c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decdul2branchbubImpl.pattern_decdul2branchbub_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decdul2branchbubImpl
							.pattern_decdul2branchbub_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decdul2branchbubImpl.pattern_decdul2branchbub_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decdul2branchbubImpl.pattern_decdul2branchbub_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment l, Decision a, While b, Decision d) {
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
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment l, Decision a, While b, Decision d) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment l, S2B d2c, Decision a,
			While b, Decision d, Branch c) {// Create CSP
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject l, EObject x, EObject d2c, EObject a,
			EObject l2z, EObject b, EObject d, EObject a2x, EObject y, EObject b2y, EObject z, EObject c) {
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("z", z);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch x, Branch y, Command z, Branch c) {

		Object[] result1_black = decdul2branchbubImpl.pattern_decdul2branchbub_10_1_initialbindings_blackBBBBBB(this,
				match, x, y, z, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[z] = " + z + ", "
					+ "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, x, y, z, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[z] = " + z + ", "
					+ "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdul2branchbubImpl.pattern_decdul2branchbub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decdul2branchbubImpl
					.pattern_decdul2branchbub_10_4_collectelementstobetranslated_blackBBBBB(match, x, y, z, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[c] = " + c + ".");
			}
			decdul2branchbubImpl.pattern_decdul2branchbub_10_4_collectelementstobetranslated_greenBBBBBFFFF(match, x, y,
					z, c);
			//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge z__y____next = (EMoflonEdge) result4_green[8];

			Object[] result5_black = decdul2branchbubImpl
					.pattern_decdul2branchbub_10_5_collectcontextelements_blackBBBBB(match, x, y, z, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[c] = " + c + ".");
			}
			decdul2branchbubImpl.pattern_decdul2branchbub_10_5_collectcontextelements_greenBB(match, c);

			// 
			decdul2branchbubImpl.pattern_decdul2branchbub_10_6_registerobjectstomatch_expressionBBBBBB(this, match, x,
					y, z, c);
			return decdul2branchbubImpl.pattern_decdul2branchbub_10_7_expressionF();
		} else {
			return decdul2branchbubImpl.pattern_decdul2branchbub_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch x = (Branch) result1_bindingAndBlack[0];
		S2B d2c = (S2B) result1_bindingAndBlack[1];
		Decision d = (Decision) result1_bindingAndBlack[2];
		Branch y = (Branch) result1_bindingAndBlack[3];
		Command z = (Command) result1_bindingAndBlack[4];
		Branch c = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decdul2branchbubImpl
				.pattern_decdul2branchbub_11_1_performtransformation_greenFBFFFBFBFB(x, d, y, z);
		Assignment l = (Assignment) result1_green[0];
		Decision a = (Decision) result1_green[2];
		S2N l2z = (S2N) result1_green[3];
		While b = (While) result1_green[4];
		S2B a2x = (S2B) result1_green[6];
		S2B b2y = (S2B) result1_green[8];

		Object[] result2_black = decdul2branchbubImpl
				.pattern_decdul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBB(l, x, a, l2z, b, a2x, y, b2y,
						z);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", " + "[x] = " + x
					+ ", " + "[a] = " + a + ", " + "[l2z] = " + l2z + ", " + "[b] = " + b + ", " + "[a2x] = " + a2x
					+ ", " + "[y] = " + y + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z + ".");
		}
		Object[] result2_green = decdul2branchbubImpl
				.pattern_decdul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBB(l, x, a, l2z, b, a2x, y, b2y,
						z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdul2branchbubImpl
				.pattern_decdul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, l, x, d2c, a, l2z, b,
						d, a2x, y, b2y, z, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l] = " + l + ", " + "[x] = " + x + ", " + "[d2c] = " + d2c + ", " + "[a] = " + a + ", "
					+ "[l2z] = " + l2z + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a2x] = " + a2x + ", "
					+ "[y] = " + y + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[c] = " + c + ".");
		}
		decdul2branchbubImpl.pattern_decdul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, l, x, a, l2z, b, d, a2x, y, b2y, z, c);
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b__l____first = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[25];

		// 
		// 
		decdul2branchbubImpl.pattern_decdul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, l,
				x, d2c, a, l2z, b, d, a2x, y, b2y, z, c);
		return decdul2branchbubImpl.pattern_decdul2branchbub_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decdul2branchbubImpl
				.pattern_decdul2branchbub_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decdul2branchbubImpl.pattern_decdul2branchbub_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch x = (Branch) result2_binding[0];
		Branch y = (Branch) result2_binding[1];
		Command z = (Command) result2_binding[2];
		Branch c = (Branch) result2_binding[3];
		for (Object[] result2_black : decdul2branchbubImpl.pattern_decdul2branchbub_12_2_corematch_blackBFFBBBB(x, y, z,
				c, match)) {
			S2B d2c = (S2B) result2_black[1];
			Decision d = (Decision) result2_black[2];
			// ForEach 
			for (Object[] result3_black : decdul2branchbubImpl.pattern_decdul2branchbub_12_3_findcontext_blackBBBBBB(x,
					d2c, d, y, z, c)) {
				Object[] result3_green = decdul2branchbubImpl
						.pattern_decdul2branchbub_12_3_findcontext_greenBBBBBBFFFFFFF(x, d2c, d, y, z, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = decdul2branchbubImpl
						.pattern_decdul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, x,
								d2c, d, y, z, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[x] = " + x + ", " + "[d2c] = "
							+ d2c + ", " + "[d] = " + d + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[c] = "
							+ c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decdul2branchbubImpl.pattern_decdul2branchbub_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decdul2branchbubImpl
							.pattern_decdul2branchbub_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decdul2branchbubImpl.pattern_decdul2branchbub_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decdul2branchbubImpl.pattern_decdul2branchbub_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch x, Branch y, Command z, Branch c) {
		match.registerObject("x", x);
		match.registerObject("y", y);
		match.registerObject("z", z);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch x, Branch y, Command z, Branch c) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch x, S2B d2c, Decision d, Branch y,
			Command z, Branch c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("z", z);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject l, EObject x, EObject d2c, EObject a,
			EObject l2z, EObject b, EObject d, EObject a2x, EObject y, EObject b2y, EObject z, EObject c) {
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("z", z);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_65(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decdul2branchbubImpl.pattern_decdul2branchbub_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decdul2branchbubImpl
				.pattern_decdul2branchbub_20_2_testcorematchandDECs_blackFFFFB(_edge_positive)) {
			Branch x = (Branch) result2_black[0];
			Branch y = (Branch) result2_black[1];
			Command z = (Command) result2_black[2];
			Branch c = (Branch) result2_black[3];
			Object[] result2_green = decdul2branchbubImpl
					.pattern_decdul2branchbub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdul2branchbubImpl
					.pattern_decdul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, x, y, z, c)) {
				// 
				if (decdul2branchbubImpl
						.pattern_decdul2branchbub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decdul2branchbubImpl
							.pattern_decdul2branchbub_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decdul2branchbubImpl.pattern_decdul2branchbub_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decdul2branchbubImpl.pattern_decdul2branchbub_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_71(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decdul2branchbubImpl.pattern_decdul2branchbub_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decdul2branchbubImpl
				.pattern_decdul2branchbub_21_2_testcorematchandDECs_blackFFFFB(_edge_first)) {
			Assignment l = (Assignment) result2_black[0];
			Decision a = (Decision) result2_black[1];
			While b = (While) result2_black[2];
			Decision d = (Decision) result2_black[3];
			Object[] result2_green = decdul2branchbubImpl
					.pattern_decdul2branchbub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdul2branchbubImpl
					.pattern_decdul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, l, a, b, d)) {
				// 
				if (decdul2branchbubImpl
						.pattern_decdul2branchbub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decdul2branchbubImpl
							.pattern_decdul2branchbub_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decdul2branchbubImpl.pattern_decdul2branchbub_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decdul2branchbubImpl.pattern_decdul2branchbub_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("decdul2branchbub");
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
		ruleResult.setRule("decdul2branchbub");
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

		Object[] result1_black = decdul2branchbubImpl.pattern_decdul2branchbub_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decdul2branchbubImpl.pattern_decdul2branchbub_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Assignment l = (Assignment) result2_bindingAndBlack[0];
		Branch x = (Branch) result2_bindingAndBlack[1];
		Decision a = (Decision) result2_bindingAndBlack[2];
		While b = (While) result2_bindingAndBlack[3];
		Decision d = (Decision) result2_bindingAndBlack[4];
		Branch y = (Branch) result2_bindingAndBlack[5];
		Command z = (Command) result2_bindingAndBlack[6];
		Branch c = (Branch) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, l, x, a, b, d, y, z, c,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[l] = " + l + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = "
					+ d + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decdul2branchbubImpl.pattern_decdul2branchbub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decdul2branchbubImpl
					.pattern_decdul2branchbub_24_5_matchcorrcontext_blackFBBBB(d, c, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[0];
				Object[] result5_green = decdul2branchbubImpl
						.pattern_decdul2branchbub_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decdul2branchbubImpl
						.pattern_decdul2branchbub_24_6_createcorrespondence_blackBBBBBBBBB(l, x, a, b, d, y, z, c,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", "
							+ "[x] = " + x + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ", "
							+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decdul2branchbubImpl.pattern_decdul2branchbub_24_6_createcorrespondence_greenBBBFBFBFBB(l, x, a, b, y,
						z, ccMatch);
				//nothing S2N l2z = (S2N) result6_green[3];
				//nothing S2B a2x = (S2B) result6_green[5];
				//nothing S2B b2y = (S2B) result6_green[7];

				Object[] result7_black = decdul2branchbubImpl
						.pattern_decdul2branchbub_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decdul2branchbubImpl.pattern_decdul2branchbub_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return decdul2branchbubImpl.pattern_decdul2branchbub_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Assignment l, Branch x, Decision a, While b, Decision d, Branch y, Command z,
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
	public boolean checkDEC_FWD(Assignment l, Decision a, While b, Decision d) {// 
		Object[] result1_black = decdul2branchbubImpl.pattern_decdul2branchbub_27_1_matchtggpattern_blackBBBB(l, a, b,
				d);
		if (result1_black != null) {
			return decdul2branchbubImpl.pattern_decdul2branchbub_27_2_expressionF();
		} else {
			return decdul2branchbubImpl.pattern_decdul2branchbub_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch x, Branch y, Command z, Branch c) {// 
		Object[] result1_black = decdul2branchbubImpl.pattern_decdul2branchbub_28_1_matchtggpattern_blackBBBB(x, y, z,
				c);
		if (result1_black != null) {
			return decdul2branchbubImpl.pattern_decdul2branchbub_28_2_expressionF();
		} else {
			return decdul2branchbubImpl.pattern_decdul2branchbub_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = decdul2branchbubImpl.pattern_decdul2branchbub_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decdul2branchbubImpl.pattern_decdul2branchbub_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : decdul2branchbubImpl
				.pattern_decdul2branchbub_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			S2B d2c = (S2B) result2_black[1];
			Decision d = (Decision) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = decdul2branchbubImpl
					.pattern_decdul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d2c, d, c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[d] = " + d
						+ ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decdul2branchbubImpl.pattern_decdul2branchbub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decdul2branchbubImpl.pattern_decdul2branchbub_29_5_checknacs_blackBBB(d2c, d,
						c);
				if (result5_black != null) {

					Object[] result6_black = decdul2branchbubImpl.pattern_decdul2branchbub_29_6_perform_blackBBBB(d2c,
							d, c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2c] = " + d2c + ", "
								+ "[d] = " + d + ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decdul2branchbubImpl.pattern_decdul2branchbub_29_6_perform_greenFFFFFBFFFFBB(d, c, ruleResult);
					//nothing Assignment l = (Assignment) result6_green[0];
					//nothing Branch x = (Branch) result6_green[1];
					//nothing Decision a = (Decision) result6_green[2];
					//nothing S2N l2z = (S2N) result6_green[3];
					//nothing While b = (While) result6_green[4];
					//nothing S2B a2x = (S2B) result6_green[6];
					//nothing Branch y = (Branch) result6_green[7];
					//nothing S2B b2y = (S2B) result6_green[8];
					//nothing Command z = (Command) result6_green[9];

				} else {
				}

			} else {
			}

		}
		return decdul2branchbubImpl.pattern_decdul2branchbub_29_7_expressionFB(ruleResult);
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
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_DECISION_WHILE_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECDUL2BRANCHBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_DECISION_WHILE_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4));
			return null;
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_DECISION_WHILE_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_S2B_DECISION_WHILE_DECISION_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(S2B) arguments.get(2), (Decision) arguments.get(3), (While) arguments.get(4),
					(Decision) arguments.get(5), (Branch) arguments.get(6));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECDUL2BRANCHBUB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECDUL2BRANCHBUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_DECISION_BRANCH_COMMAND_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Decision) arguments.get(3), (Branch) arguments.get(4),
					(Command) arguments.get(5), (Branch) arguments.get(6));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECDUL2BRANCHBUB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_65__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_65((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_71__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_71((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_BRANCH_DECISION_WHILE_DECISION_BRANCH_COMMAND_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Branch) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(Branch) arguments.get(5), (Command) arguments.get(6), (Branch) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___CHECK_DEC_FWD__ASSIGNMENT_DECISION_WHILE_DECISION:
			return checkDEC_FWD((Assignment) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3));
		case RulesPackage.DECDUL2BRANCHBUB___CHECK_DEC_BWD__BRANCH_BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.DECDUL2BRANCHBUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECDUL2BRANCHBUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_DECISION_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Decision) arguments.get(2), (Branch) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECDUL2BRANCHBUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decdul2branchbub_0_1_initialbindings_blackBBBBBB(decdul2branchbub _this,
			Match match, Assignment l, Decision a, While b, Decision d) {
		if (!a.equals(d)) {
			return new Object[] { _this, match, l, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_0_2_SolveCSP_bindingFBBBBBB(decdul2branchbub _this,
			Match match, Assignment l, Decision a, While b, Decision d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, l, a, b, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, l, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBB(decdul2branchbub _this,
			Match match, Assignment l, Decision a, While b, Decision d) {
		Object[] result_pattern_decdul2branchbub_0_2_SolveCSP_binding = pattern_decdul2branchbub_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, l, a, b, d);
		if (result_pattern_decdul2branchbub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decdul2branchbub_0_2_SolveCSP_black = pattern_decdul2branchbub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdul2branchbub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, l, a, b, d };
			}
		}
		return null;
	}

	public static final boolean pattern_decdul2branchbub_0_3_CheckCSP_expressionFBB(decdul2branchbub _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Assignment l, Decision a, While b, Decision d) {
		if (!a.equals(d)) {
			return new Object[] { match, l, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_0_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Assignment l, Decision a, While b, Decision d) {
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		String b__l____first_name_prime = "first";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String b__l____last_name_prime = "last";
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		match.getToBeTranslatedEdges().add(b__l____first);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(b__l____last);
		b__l____first.setName(b__l____first_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		return new Object[] { match, l, a, b, d, b__l____first, d__b____negative, d__a____positive, b__l____last };
	}

	public static final Object[] pattern_decdul2branchbub_0_5_collectcontextelements_blackBBBBB(Match match,
			Assignment l, Decision a, While b, Decision d) {
		if (!a.equals(d)) {
			return new Object[] { match, l, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decdul2branchbub_0_6_registerobjectstomatch_expressionBBBBBB(
			decdul2branchbub _this, Match match, Assignment l, Decision a, While b, Decision d) {
		_this.registerObjectsToMatch_FWD(match, l, a, b, d);

	}

	public static final boolean pattern_decdul2branchbub_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdul2branchbub_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_1_1_performtransformation_bindingFFFFFFB(
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
				if (tmpA instanceof Decision) {
					Decision a = (Decision) tmpA;
					if (tmpB instanceof While) {
						While b = (While) tmpB;
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

	public static final Object[] pattern_decdul2branchbub_1_1_performtransformation_blackBBBBBBFBB(Assignment l,
			S2B d2c, Decision a, While b, Decision d, Branch c, decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(d)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { l, d2c, a, b, d, c, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decdul2branchbub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decdul2branchbub_1_1_performtransformation_binding = pattern_decdul2branchbub_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decdul2branchbub_1_1_performtransformation_binding != null) {
			Assignment l = (Assignment) result_pattern_decdul2branchbub_1_1_performtransformation_binding[0];
			S2B d2c = (S2B) result_pattern_decdul2branchbub_1_1_performtransformation_binding[1];
			Decision a = (Decision) result_pattern_decdul2branchbub_1_1_performtransformation_binding[2];
			While b = (While) result_pattern_decdul2branchbub_1_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decdul2branchbub_1_1_performtransformation_binding[4];
			Branch c = (Branch) result_pattern_decdul2branchbub_1_1_performtransformation_binding[5];

			Object[] result_pattern_decdul2branchbub_1_1_performtransformation_black = pattern_decdul2branchbub_1_1_performtransformation_blackBBBBBBFBB(
					l, d2c, a, b, d, c, _this, isApplicableMatch);
			if (result_pattern_decdul2branchbub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdul2branchbub_1_1_performtransformation_black[6];

				return new Object[] { l, d2c, a, b, d, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_1_1_performtransformation_greenBFBFBFFFFB(Assignment l,
			Decision a, While b, Branch c) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		c.setPositive(x);
		l2z.setSource(l);
		a2x.setTarget(x);
		a2x.setSource(a);
		c.setNegative(y);
		b2y.setTarget(y);
		b2y.setSource(b);
		y.setPositive(z);
		l2z.setTarget(z);
		z.setNext(y);
		return new Object[] { l, x, a, l2z, b, a2x, y, b2y, z, c };
	}

	public static final Object[] pattern_decdul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBB(Assignment l,
			Branch x, Decision a, S2N l2z, While b, S2B a2x, Branch y, S2B b2y, Command z) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				return new Object[] { l, x, a, l2z, b, a2x, y, b2y, z };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBB(Assignment l,
			Branch x, Decision a, S2N l2z, While b, S2B a2x, Branch y, S2B b2y, Command z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(z);
		return new Object[] { ruleresult, l, x, a, l2z, b, a2x, y, b2y, z };
	}

	public static final Object[] pattern_decdul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l, EObject x, EObject d2c, EObject a, EObject l2z, EObject b,
			EObject d, EObject a2x, EObject y, EObject b2y, EObject z, EObject c) {
		if (!l.equals(x)) {
			if (!l.equals(l2z)) {
				if (!l.equals(y)) {
					if (!l.equals(z)) {
						if (!x.equals(y)) {
							if (!x.equals(z)) {
								if (!d2c.equals(l)) {
									if (!d2c.equals(x)) {
										if (!d2c.equals(l2z)) {
											if (!d2c.equals(y)) {
												if (!d2c.equals(z)) {
													if (!a.equals(l)) {
														if (!a.equals(x)) {
															if (!a.equals(d2c)) {
																if (!a.equals(l2z)) {
																	if (!a.equals(b)) {
																		if (!a.equals(d)) {
																			if (!a.equals(a2x)) {
																				if (!a.equals(y)) {
																					if (!a.equals(b2y)) {
																						if (!a.equals(z)) {
																							if (!a.equals(c)) {
																								if (!l2z.equals(x)) {
																									if (!l2z.equals(
																											y)) {
																										if (!l2z.equals(
																												z)) {
																											if (!b.equals(
																													l)) {
																												if (!b.equals(
																														x)) {
																													if (!b.equals(
																															d2c)) {
																														if (!b.equals(
																																l2z)) {
																															if (!b.equals(
																																	d)) {
																																if (!b.equals(
																																		y)) {
																																	if (!b.equals(
																																			b2y)) {
																																		if (!b.equals(
																																				z)) {
																																			if (!b.equals(
																																					c)) {
																																				if (!d.equals(
																																						l)) {
																																					if (!d.equals(
																																							x)) {
																																						if (!d.equals(
																																								d2c)) {
																																							if (!d.equals(
																																									l2z)) {
																																								if (!d.equals(
																																										y)) {
																																									if (!d.equals(
																																											z)) {
																																										if (!a2x.equals(
																																												l)) {
																																											if (!a2x.equals(
																																													x)) {
																																												if (!a2x.equals(
																																														d2c)) {
																																													if (!a2x.equals(
																																															l2z)) {
																																														if (!a2x.equals(
																																																b)) {
																																															if (!a2x.equals(
																																																	d)) {
																																																if (!a2x.equals(
																																																		y)) {
																																																	if (!a2x.equals(
																																																			b2y)) {
																																																		if (!a2x.equals(
																																																				z)) {
																																																			if (!a2x.equals(
																																																					c)) {
																																																				if (!y.equals(
																																																						z)) {
																																																					if (!b2y.equals(
																																																							l)) {
																																																						if (!b2y.equals(
																																																								x)) {
																																																							if (!b2y.equals(
																																																									d2c)) {
																																																								if (!b2y.equals(
																																																										l2z)) {
																																																									if (!b2y.equals(
																																																											d)) {
																																																										if (!b2y.equals(
																																																												y)) {
																																																											if (!b2y.equals(
																																																													z)) {
																																																												if (!b2y.equals(
																																																														c)) {
																																																													if (!c.equals(
																																																															l)) {
																																																														if (!c.equals(
																																																																x)) {
																																																															if (!c.equals(
																																																																	d2c)) {
																																																																if (!c.equals(
																																																																		l2z)) {
																																																																	if (!c.equals(
																																																																			d)) {
																																																																		if (!c.equals(
																																																																				y)) {
																																																																			if (!c.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						l,
																																																																						x,
																																																																						d2c,
																																																																						a,
																																																																						l2z,
																																																																						b,
																																																																						d,
																																																																						a2x,
																																																																						y,
																																																																						b2y,
																																																																						z,
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

	public static final Object[] pattern_decdul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l, EObject x, EObject a, EObject l2z, EObject b, EObject d,
			EObject a2x, EObject y, EObject b2y, EObject z, EObject c) {
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdul2branchbub";
		String l2z__l____source_name_prime = "source";
		String b__l____first_name_prime = "first";
		String d__b____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String b__l____last_name_prime = "last";
		String y__z____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String l2z__z____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String z__y____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String a2x__a____source_name_prime = "source";
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		ruleresult.getTranslatedEdges().add(b__l____first);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(b__l____last);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		ruleresult.getCreatedEdges().add(y__z____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(z__y____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		b__l____first.setName(b__l____first_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		return new Object[] { ruleresult, l, x, a, l2z, b, d, a2x, y, b2y, z, c, l2z__l____source, b__l____first,
				d__b____negative, a2x__x____target, d__a____positive, b__l____last, y__z____positive, b2y__y____target,
				l2z__z____target, c__x____positive, c__y____negative, z__y____next, b2y__b____source,
				a2x__a____source };
	}

	public static final void pattern_decdul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decdul2branchbub _this, PerformRuleResult ruleresult, EObject l, EObject x, EObject d2c, EObject a,
			EObject l2z, EObject b, EObject d, EObject a2x, EObject y, EObject b2y, EObject z, EObject c) {
		_this.registerObjects_FWD(ruleresult, l, x, d2c, a, l2z, b, d, a2x, y, b2y, z, c);

	}

	public static final PerformRuleResult pattern_decdul2branchbub_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_2_1_preparereturnvalue_bindingFB(decdul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_2_1_preparereturnvalue_blackFBB(EClass eClass,
			decdul2branchbub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_2_1_preparereturnvalue_bindingAndBlackFFB(
			decdul2branchbub _this) {
		Object[] result_pattern_decdul2branchbub_2_1_preparereturnvalue_binding = pattern_decdul2branchbub_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdul2branchbub_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decdul2branchbub_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdul2branchbub_2_1_preparereturnvalue_black = pattern_decdul2branchbub_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decdul2branchbub_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decdul2branchbub_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decdul2branchbub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decdul2branchbub_2_2_corematch_bindingFFFFB(Match match) {
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
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (tmpB instanceof While) {
					While b = (While) tmpB;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						return new Object[] { l, a, b, d, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_2_2_corematch_blackBFBBBFB(Assignment l, Decision a,
			While b, Decision d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { l, d2c, a, b, d, c, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_2_3_findcontext_blackBBBBBB(Assignment l, S2B d2c,
			Decision a, While b, Decision d, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			if (d.equals(d2c.getSource())) {
				if (l.equals(b.getFirst())) {
					if (b.equals(d.getNegative())) {
						if (a.equals(d.getPositive())) {
							if (l.equals(b.getLast())) {
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

	public static final Object[] pattern_decdul2branchbub_2_3_findcontext_greenBBBBBBFFFFFFF(Assignment l, S2B d2c,
			Decision a, While b, Decision d, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__d____source_name_prime = "source";
		String b__l____first_name_prime = "first";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		String b__l____last_name_prime = "last";
		String d2c__c____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(c);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		isApplicableMatch.getAllContextElements().add(b__l____first);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(b__l____last);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setName(d2c__d____source_name_prime);
		b__l____first.setName(b__l____first_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		return new Object[] { l, d2c, a, b, d, c, isApplicableMatch, d2c__d____source, b__l____first, d__b____negative,
				d__a____positive, b__l____last, d2c__c____target };
	}

	public static final Object[] pattern_decdul2branchbub_2_4_solveCSP_bindingFBBBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Assignment l, S2B d2c, Decision a, While b, Decision d, Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, l, d2c, a, b, d, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, l, d2c, a, b, d, c };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Assignment l, S2B d2c, Decision a, While b, Decision d, Branch c) {
		Object[] result_pattern_decdul2branchbub_2_4_solveCSP_binding = pattern_decdul2branchbub_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, l, d2c, a, b, d, c);
		if (result_pattern_decdul2branchbub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_2_4_solveCSP_binding[0];

			Object[] result_pattern_decdul2branchbub_2_4_solveCSP_black = pattern_decdul2branchbub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdul2branchbub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, l, d2c, a, b, d, c };
			}
		}
		return null;
	}

	public static final boolean pattern_decdul2branchbub_2_5_checkCSP_expressionFBB(decdul2branchbub _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decdul2branchbub_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decdul2branchbub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decdul2branchbub_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_10_1_initialbindings_blackBBBBBB(decdul2branchbub _this,
			Match match, Branch x, Branch y, Command z, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					return new Object[] { _this, match, x, y, z, c };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_10_2_SolveCSP_bindingFBBBBBB(decdul2branchbub _this,
			Match match, Branch x, Branch y, Command z, Branch c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, y, z, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, y, z, c };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBB(decdul2branchbub _this,
			Match match, Branch x, Branch y, Command z, Branch c) {
		Object[] result_pattern_decdul2branchbub_10_2_SolveCSP_binding = pattern_decdul2branchbub_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, x, y, z, c);
		if (result_pattern_decdul2branchbub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decdul2branchbub_10_2_SolveCSP_black = pattern_decdul2branchbub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdul2branchbub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, y, z, c };
			}
		}
		return null;
	}

	public static final boolean pattern_decdul2branchbub_10_3_CheckCSP_expressionFBB(decdul2branchbub _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Branch x, Branch y, Command z, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					return new Object[] { match, x, y, z, c };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_10_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Branch x, Branch y, Command z, Branch c) {
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		String y__z____positive_name_prime = "positive";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String z__y____next_name_prime = "next";
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		match.getToBeTranslatedEdges().add(y__z____positive);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(z__y____next);
		y__z____positive.setName(y__z____positive_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		return new Object[] { match, x, y, z, c, y__z____positive, c__x____positive, c__y____negative, z__y____next };
	}

	public static final Object[] pattern_decdul2branchbub_10_5_collectcontextelements_blackBBBBB(Match match, Branch x,
			Branch y, Command z, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					return new Object[] { match, x, y, z, c };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decdul2branchbub_10_6_registerobjectstomatch_expressionBBBBBB(
			decdul2branchbub _this, Match match, Branch x, Branch y, Command z, Branch c) {
		_this.registerObjectsToMatch_BWD(match, x, y, z, c);

	}

	public static final boolean pattern_decdul2branchbub_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdul2branchbub_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("x");
		EObject _localVariable_1 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("d");
		EObject _localVariable_3 = isApplicableMatch.getObject("y");
		EObject _localVariable_4 = isApplicableMatch.getObject("z");
		EObject _localVariable_5 = isApplicableMatch.getObject("c");
		EObject tmpX = _localVariable_0;
		EObject tmpD2c = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpC = _localVariable_5;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpD2c instanceof S2B) {
				S2B d2c = (S2B) tmpD2c;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					if (tmpY instanceof Branch) {
						Branch y = (Branch) tmpY;
						if (tmpZ instanceof Command) {
							Command z = (Command) tmpZ;
							if (tmpC instanceof Branch) {
								Branch c = (Branch) tmpC;
								return new Object[] { x, d2c, d, y, z, c, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_11_1_performtransformation_blackBBBBBBFBB(Branch x, S2B d2c,
			Decision d, Branch y, Command z, Branch c, decdul2branchbub _this, IsApplicableMatch isApplicableMatch) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { x, d2c, d, y, z, c, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decdul2branchbub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decdul2branchbub_11_1_performtransformation_binding = pattern_decdul2branchbub_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decdul2branchbub_11_1_performtransformation_binding != null) {
			Branch x = (Branch) result_pattern_decdul2branchbub_11_1_performtransformation_binding[0];
			S2B d2c = (S2B) result_pattern_decdul2branchbub_11_1_performtransformation_binding[1];
			Decision d = (Decision) result_pattern_decdul2branchbub_11_1_performtransformation_binding[2];
			Branch y = (Branch) result_pattern_decdul2branchbub_11_1_performtransformation_binding[3];
			Command z = (Command) result_pattern_decdul2branchbub_11_1_performtransformation_binding[4];
			Branch c = (Branch) result_pattern_decdul2branchbub_11_1_performtransformation_binding[5];

			Object[] result_pattern_decdul2branchbub_11_1_performtransformation_black = pattern_decdul2branchbub_11_1_performtransformation_blackBBBBBBFBB(
					x, d2c, d, y, z, c, _this, isApplicableMatch);
			if (result_pattern_decdul2branchbub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdul2branchbub_11_1_performtransformation_black[6];

				return new Object[] { x, d2c, d, y, z, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_11_1_performtransformation_greenFBFFFBFBFB(Branch x,
			Decision d, Branch y, Command z) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		d.setPositive(a);
		l2z.setSource(l);
		l2z.setTarget(z);
		b.setFirst(l);
		d.setNegative(b);
		b.setLast(l);
		a2x.setTarget(x);
		a2x.setSource(a);
		b2y.setTarget(y);
		b2y.setSource(b);
		return new Object[] { l, x, a, l2z, b, d, a2x, y, b2y, z };
	}

	public static final Object[] pattern_decdul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBB(Assignment l,
			Branch x, Decision a, S2N l2z, While b, S2B a2x, Branch y, S2B b2y, Command z) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				return new Object[] { l, x, a, l2z, b, a2x, y, b2y, z };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBB(Assignment l,
			Branch x, Decision a, S2N l2z, While b, S2B a2x, Branch y, S2B b2y, Command z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(l);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(z);
		return new Object[] { ruleresult, l, x, a, l2z, b, a2x, y, b2y, z };
	}

	public static final Object[] pattern_decdul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l, EObject x, EObject d2c, EObject a, EObject l2z, EObject b,
			EObject d, EObject a2x, EObject y, EObject b2y, EObject z, EObject c) {
		if (!l.equals(x)) {
			if (!l.equals(l2z)) {
				if (!l.equals(y)) {
					if (!l.equals(z)) {
						if (!x.equals(y)) {
							if (!x.equals(z)) {
								if (!d2c.equals(l)) {
									if (!d2c.equals(x)) {
										if (!d2c.equals(l2z)) {
											if (!d2c.equals(y)) {
												if (!d2c.equals(z)) {
													if (!a.equals(l)) {
														if (!a.equals(x)) {
															if (!a.equals(d2c)) {
																if (!a.equals(l2z)) {
																	if (!a.equals(b)) {
																		if (!a.equals(d)) {
																			if (!a.equals(a2x)) {
																				if (!a.equals(y)) {
																					if (!a.equals(b2y)) {
																						if (!a.equals(z)) {
																							if (!a.equals(c)) {
																								if (!l2z.equals(x)) {
																									if (!l2z.equals(
																											y)) {
																										if (!l2z.equals(
																												z)) {
																											if (!b.equals(
																													l)) {
																												if (!b.equals(
																														x)) {
																													if (!b.equals(
																															d2c)) {
																														if (!b.equals(
																																l2z)) {
																															if (!b.equals(
																																	d)) {
																																if (!b.equals(
																																		y)) {
																																	if (!b.equals(
																																			b2y)) {
																																		if (!b.equals(
																																				z)) {
																																			if (!b.equals(
																																					c)) {
																																				if (!d.equals(
																																						l)) {
																																					if (!d.equals(
																																							x)) {
																																						if (!d.equals(
																																								d2c)) {
																																							if (!d.equals(
																																									l2z)) {
																																								if (!d.equals(
																																										y)) {
																																									if (!d.equals(
																																											z)) {
																																										if (!a2x.equals(
																																												l)) {
																																											if (!a2x.equals(
																																													x)) {
																																												if (!a2x.equals(
																																														d2c)) {
																																													if (!a2x.equals(
																																															l2z)) {
																																														if (!a2x.equals(
																																																b)) {
																																															if (!a2x.equals(
																																																	d)) {
																																																if (!a2x.equals(
																																																		y)) {
																																																	if (!a2x.equals(
																																																			b2y)) {
																																																		if (!a2x.equals(
																																																				z)) {
																																																			if (!a2x.equals(
																																																					c)) {
																																																				if (!y.equals(
																																																						z)) {
																																																					if (!b2y.equals(
																																																							l)) {
																																																						if (!b2y.equals(
																																																								x)) {
																																																							if (!b2y.equals(
																																																									d2c)) {
																																																								if (!b2y.equals(
																																																										l2z)) {
																																																									if (!b2y.equals(
																																																											d)) {
																																																										if (!b2y.equals(
																																																												y)) {
																																																											if (!b2y.equals(
																																																													z)) {
																																																												if (!b2y.equals(
																																																														c)) {
																																																													if (!c.equals(
																																																															l)) {
																																																														if (!c.equals(
																																																																x)) {
																																																															if (!c.equals(
																																																																	d2c)) {
																																																																if (!c.equals(
																																																																		l2z)) {
																																																																	if (!c.equals(
																																																																			d)) {
																																																																		if (!c.equals(
																																																																				y)) {
																																																																			if (!c.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						l,
																																																																						x,
																																																																						d2c,
																																																																						a,
																																																																						l2z,
																																																																						b,
																																																																						d,
																																																																						a2x,
																																																																						y,
																																																																						b2y,
																																																																						z,
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

	public static final Object[] pattern_decdul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l, EObject x, EObject a, EObject l2z, EObject b, EObject d,
			EObject a2x, EObject y, EObject b2y, EObject z, EObject c) {
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdul2branchbub";
		String l2z__l____source_name_prime = "source";
		String b__l____first_name_prime = "first";
		String d__b____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String b__l____last_name_prime = "last";
		String y__z____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String l2z__z____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String z__y____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String a2x__a____source_name_prime = "source";
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		ruleresult.getCreatedEdges().add(b__l____first);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(b__l____last);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		ruleresult.getTranslatedEdges().add(y__z____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(z__y____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		b__l____first.setName(b__l____first_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		return new Object[] { ruleresult, l, x, a, l2z, b, d, a2x, y, b2y, z, c, l2z__l____source, b__l____first,
				d__b____negative, a2x__x____target, d__a____positive, b__l____last, y__z____positive, b2y__y____target,
				l2z__z____target, c__x____positive, c__y____negative, z__y____next, b2y__b____source,
				a2x__a____source };
	}

	public static final void pattern_decdul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decdul2branchbub _this, PerformRuleResult ruleresult, EObject l, EObject x, EObject d2c, EObject a,
			EObject l2z, EObject b, EObject d, EObject a2x, EObject y, EObject b2y, EObject z, EObject c) {
		_this.registerObjects_BWD(ruleresult, l, x, d2c, a, l2z, b, d, a2x, y, b2y, z, c);

	}

	public static final PerformRuleResult pattern_decdul2branchbub_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_12_1_preparereturnvalue_bindingFB(decdul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_12_1_preparereturnvalue_blackFBB(EClass eClass,
			decdul2branchbub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_12_1_preparereturnvalue_bindingAndBlackFFB(
			decdul2branchbub _this) {
		Object[] result_pattern_decdul2branchbub_12_1_preparereturnvalue_binding = pattern_decdul2branchbub_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdul2branchbub_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decdul2branchbub_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdul2branchbub_12_1_preparereturnvalue_black = pattern_decdul2branchbub_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decdul2branchbub_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decdul2branchbub_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decdul2branchbub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decdul2branchbub_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("y");
		EObject _localVariable_2 = match.getObject("z");
		EObject _localVariable_3 = match.getObject("c");
		EObject tmpX = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpY instanceof Branch) {
				Branch y = (Branch) tmpY;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						return new Object[] { x, y, z, c, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_12_2_corematch_blackBFFBBBB(Branch x, Branch y,
			Command z, Branch c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
							"target")) {
						Statement tmpD = d2c.getSource();
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							_result.add(new Object[] { x, d2c, d, y, z, c, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_12_3_findcontext_blackBBBBBB(Branch x, S2B d2c,
			Decision d, Branch y, Command z, Branch c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (d.equals(d2c.getSource())) {
						if (z.equals(y.getPositive())) {
							if (c.equals(d2c.getTarget())) {
								if (x.equals(c.getPositive())) {
									if (y.equals(c.getNegative())) {
										if (y.equals(z.getNext())) {
											_result.add(new Object[] { x, d2c, d, y, z, c });
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

	public static final Object[] pattern_decdul2branchbub_12_3_findcontext_greenBBBBBBFFFFFFF(Branch x, S2B d2c,
			Decision d, Branch y, Command z, Branch c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__d____source_name_prime = "source";
		String y__z____positive_name_prime = "positive";
		String d2c__c____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String z__y____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(c);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		isApplicableMatch.getAllContextElements().add(y__z____positive);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(z__y____next);
		d2c__d____source.setName(d2c__d____source_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		return new Object[] { x, d2c, d, y, z, c, isApplicableMatch, d2c__d____source, y__z____positive,
				d2c__c____target, c__x____positive, c__y____negative, z__y____next };
	}

	public static final Object[] pattern_decdul2branchbub_12_4_solveCSP_bindingFBBBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Branch x, S2B d2c, Decision d, Branch y, Command z, Branch c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, x, d2c, d, y, z, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, x, d2c, d, y, z, c };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Branch x, S2B d2c, Decision d, Branch y, Command z, Branch c) {
		Object[] result_pattern_decdul2branchbub_12_4_solveCSP_binding = pattern_decdul2branchbub_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, x, d2c, d, y, z, c);
		if (result_pattern_decdul2branchbub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_12_4_solveCSP_binding[0];

			Object[] result_pattern_decdul2branchbub_12_4_solveCSP_black = pattern_decdul2branchbub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdul2branchbub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, x, d2c, d, y, z, c };
			}
		}
		return null;
	}

	public static final boolean pattern_decdul2branchbub_12_5_checkCSP_expressionFBB(decdul2branchbub _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decdul2branchbub_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decdul2branchbub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decdul2branchbub_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_20_1_preparereturnvalue_bindingFB(decdul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decdul2branchbub _this) {
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

	public static final Object[] pattern_decdul2branchbub_20_1_preparereturnvalue_bindingAndBlackFFBF(
			decdul2branchbub _this) {
		Object[] result_pattern_decdul2branchbub_20_1_preparereturnvalue_binding = pattern_decdul2branchbub_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdul2branchbub_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decdul2branchbub_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdul2branchbub_20_1_preparereturnvalue_black = pattern_decdul2branchbub_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decdul2branchbub_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decdul2branchbub_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decdul2branchbub_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_317879 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_1BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_948832 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_948832)) {
							if (!y.equals(__DEC_x_positive_948832)) {
								if (!c.equals(__DEC_x_positive_948832)) {
									return new Object[] { x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_2BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_82195 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_82195)) {
							if (!y.equals(__DEC_x_negative_82195)) {
								if (!c.equals(__DEC_x_negative_82195)) {
									return new Object[] { x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_207707 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_4BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_906910 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_906910)) {
							if (!x.equals(__DEC_y_positive_906910)) {
								if (!c.equals(__DEC_y_positive_906910)) {
									return new Object[] { y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_5BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_587648 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_587648)) {
							if (!x.equals(__DEC_y_negative_587648)) {
								if (!c.equals(__DEC_y_negative_587648)) {
									return new Object[] { y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_563822 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_7BBBB(Command z, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_positive_513131 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!x.equals(__DEC_z_positive_513131)) {
							if (!y.equals(__DEC_z_positive_513131)) {
								if (!c.equals(__DEC_z_positive_513131)) {
									return new Object[] { z, x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_8BBBB(Command z, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_negative_61798 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!x.equals(__DEC_z_negative_61798)) {
							if (!y.equals(__DEC_z_negative_61798)) {
								if (!c.equals(__DEC_z_negative_61798)) {
									return new Object[] { z, x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_9BB(Branch x, Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_10BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_11BB(Branch x,
			Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(Branch c,
			Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(Branch y,
			Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(Branch c,
			Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpY = _edge_positive.getSrc();
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			EObject tmpZ = _edge_positive.getTrg();
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (z.equals(y.getPositive())) {
					if (y.equals(z.getNext())) {
						if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_3B(y) == null) {
							if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_6B(z) == null) {
								if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(y, z) == null) {
									for (Branch c : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(y, Branch.class, "negative")) {
										if (!c.equals(y)) {
											Node tmpX = c.getPositive();
											if (tmpX instanceof Branch) {
												Branch x = (Branch) tmpX;
												if (!x.equals(y)) {
													if (!c.equals(x)) {
														if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(
																c, z) == null) {
															if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(
																	c, z) == null) {
																if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_0B(
																		x) == null) {
																	if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_1BBB(
																			x, y, c) == null) {
																		if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_2BBB(
																				x, y, c) == null) {
																			if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_4BBB(
																					y, x, c) == null) {
																				if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_5BBB(
																						y, x, c) == null) {
																					if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_7BBBB(
																							z, x, y, c) == null) {
																						if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_8BBBB(
																								z, x, y, c) == null) {
																							if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_9BB(
																									x, y) == null) {
																								if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_10BB(
																										x, y) == null) {
																									if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_11BB(
																											x,
																											z) == null) {
																										if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(
																												x,
																												z) == null) {
																											_result.add(
																													new Object[] {
																															x,
																															y,
																															z,
																															c,
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

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decdul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decdul2branchbub _this, Match match, Branch x, Branch y, Command z, Branch c) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, y, z, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decdul2branchbub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decdul2branchbub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decdul2branchbub_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_21_1_preparereturnvalue_bindingFB(decdul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decdul2branchbub _this) {
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

	public static final Object[] pattern_decdul2branchbub_21_1_preparereturnvalue_bindingAndBlackFFBF(
			decdul2branchbub _this) {
		Object[] result_pattern_decdul2branchbub_21_1_preparereturnvalue_binding = pattern_decdul2branchbub_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdul2branchbub_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decdul2branchbub_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdul2branchbub_21_1_preparereturnvalue_black = pattern_decdul2branchbub_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decdul2branchbub_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decdul2branchbub_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decdul2branchbub_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_0BBB(Assignment l,
			Decision a, Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_positive_89932 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
					Decision.class, "positive")) {
				if (!a.equals(__DEC_l_positive_89932)) {
					if (!d.equals(__DEC_l_positive_89932)) {
						return new Object[] { l, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_1BBB(Assignment l,
			Decision a, Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_negative_593751 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "negative")) {
				if (!a.equals(__DEC_l_negative_593751)) {
					if (!d.equals(__DEC_l_negative_593751)) {
						return new Object[] { l, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_2BB(Assignment l,
			While b) {
		for (While __DEC_l_last_607305 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_607305)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_361984 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_4BB(Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_532886 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_532886)) {
					if (!d.equals(__DEC_a_negative_532886)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_5BB(Decision a, While b) {
		for (While __DEC_a_first_421189 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_421189)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_6BB(Decision a, While b) {
		for (While __DEC_a_last_983644 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_983644)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_7B(Decision a) {
		for (Program __DEC_a_first_330184 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_8BBB(While b, Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_b_positive_690597 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!a.equals(__DEC_b_positive_690597)) {
					if (!d.equals(__DEC_b_positive_690597)) {
						return new Object[] { b, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_9B(While b) {
		for (While __DEC_b_first_837816 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_837816)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_10B(While b) {
		for (While __DEC_b_last_317630 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_317630)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_11B(While b) {
		for (Program __DEC_b_first_74575 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_12BB(Decision a,
			Assignment l) {
		if (l.equals(a.getPositive())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(Decision a,
			Assignment l) {
		if (l.equals(a.getNegative())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_15BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_16BB(While b,
			Decision a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(While b,
			Decision a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(Decision a,
			While b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(Decision d,
			While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpB = _edge_first.getSrc();
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			EObject tmpL = _edge_first.getTrg();
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (l.equals(b.getFirst())) {
					if (l.equals(b.getLast())) {
						if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_9B(b) == null) {
							if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_10B(b) == null) {
								if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_11B(b) == null) {
									if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_2BB(l,
											b) == null) {
										if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_3B(
												l) == null) {
											for (Decision d : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(b, Decision.class, "negative")) {
												Statement tmpA = d.getPositive();
												if (tmpA instanceof Decision) {
													Decision a = (Decision) tmpA;
													if (!a.equals(d)) {
														if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(
																d, l) == null) {
															if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_15BB(
																	d, l) == null) {
																if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(
																		d, b) == null) {
																	if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_0BBB(
																			l, a, d) == null) {
																		if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_1BBB(
																				l, a, d) == null) {
																			if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_4BB(
																					a, d) == null) {
																				if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_5BB(
																						a, b) == null) {
																					if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_6BB(
																							a, b) == null) {
																						if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_7B(
																								a) == null) {
																							if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_8BBB(
																									b, a, d) == null) {
																								if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_12BB(
																										a, l) == null) {
																									if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(
																											a,
																											l) == null) {
																										if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_16BB(
																												b,
																												a) == null) {
																											if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(
																													b,
																													a) == null) {
																												if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(
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
			}

		}

		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decdul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decdul2branchbub _this, Match match, Assignment l, Decision a, While b, Decision d) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, l, a, b, d);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decdul2branchbub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decdul2branchbub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decdul2branchbub_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_24_1_prepare_blackB(decdul2branchbub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decdul2branchbub_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_decdul2branchbub_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("l");
		EObject _localVariable_1 = targetMatch.getObject("x");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = sourceMatch.getObject("b");
		EObject _localVariable_4 = sourceMatch.getObject("d");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject _localVariable_6 = targetMatch.getObject("z");
		EObject _localVariable_7 = targetMatch.getObject("c");
		EObject tmpL = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpZ = _localVariable_6;
		EObject tmpC = _localVariable_7;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpA instanceof Decision) {
					Decision a = (Decision) tmpA;
					if (tmpB instanceof While) {
						While b = (While) tmpB;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpY instanceof Branch) {
								Branch y = (Branch) tmpY;
								if (tmpZ instanceof Command) {
									Command z = (Command) tmpZ;
									if (tmpC instanceof Branch) {
										Branch c = (Branch) tmpC;
										return new Object[] { l, x, a, b, d, y, z, c, sourceMatch, targetMatch };
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

	public static final Object[] pattern_decdul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Assignment l,
			Branch x, Decision a, While b, Decision d, Branch y, Command z, Branch c, Match sourceMatch,
			Match targetMatch) {
		if (!x.equals(y)) {
			if (!a.equals(d)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { l, x, a, b, d, y, z, c, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding = pattern_decdul2branchbub_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding != null) {
			Assignment l = (Assignment) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[0];
			Branch x = (Branch) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[1];
			Decision a = (Decision) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[2];
			While b = (While) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[3];
			Decision d = (Decision) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[4];
			Branch y = (Branch) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[5];
			Command z = (Command) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[6];
			Branch c = (Branch) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_black = pattern_decdul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					l, x, a, b, d, y, z, c, sourceMatch, targetMatch);
			if (result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { l, x, a, b, d, y, z, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBB(decdul2branchbub _this,
			Assignment l, Branch x, Decision a, While b, Decision d, Branch y, Command z, Branch c, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(l, x, a, b, d, y, z, c, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, l, x, a, b, d, y, z, c, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			decdul2branchbub _this, Assignment l, Branch x, Decision a, While b, Decision d, Branch y, Command z,
			Branch c, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decdul2branchbub_24_3_solvecsp_binding = pattern_decdul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, l, x, a, b, d, y, z, c, sourceMatch, targetMatch);
		if (result_pattern_decdul2branchbub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_24_3_solvecsp_binding[0];

			Object[] result_pattern_decdul2branchbub_24_3_solvecsp_black = pattern_decdul2branchbub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decdul2branchbub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, l, x, a, b, d, y, z, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decdul2branchbub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_24_5_matchcorrcontext_blackFBBBB(Decision d,
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

	public static final Object[] pattern_decdul2branchbub_24_5_matchcorrcontext_greenBBBF(S2B d2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "decdul2branchbub";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_decdul2branchbub_24_6_createcorrespondence_blackBBBBBBBBB(Assignment l,
			Branch x, Decision a, While b, Decision d, Branch y, Command z, Branch c, CCMatch ccMatch) {
		if (!x.equals(y)) {
			if (!a.equals(d)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						return new Object[] { l, x, a, b, d, y, z, c, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_24_6_createcorrespondence_greenBBBFBFBFBB(Assignment l,
			Branch x, Decision a, While b, Branch y, Command z, CCMatch ccMatch) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { l, x, a, l2z, b, a2x, y, b2y, z, ccMatch };
	}

	public static final Object[] pattern_decdul2branchbub_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_decdul2branchbub_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "decdul2branchbub";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_decdul2branchbub_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_0BBB(Assignment l, Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_positive_569137 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "positive")) {
				if (!a.equals(__DEC_l_positive_569137)) {
					if (!d.equals(__DEC_l_positive_569137)) {
						return new Object[] { l, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_1BBB(Assignment l, Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_negative_525307 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "negative")) {
				if (!a.equals(__DEC_l_negative_525307)) {
					if (!d.equals(__DEC_l_negative_525307)) {
						return new Object[] { l, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_2BB(Assignment l, While b) {
		for (While __DEC_l_last_922589 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_922589)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_87039 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_4BB(Decision a, Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_486155 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_486155)) {
					if (!d.equals(__DEC_a_negative_486155)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_5BB(Decision a, While b) {
		for (While __DEC_a_first_189563 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_189563)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_6BB(Decision a, While b) {
		for (While __DEC_a_last_268862 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_268862)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_7B(Decision a) {
		for (Program __DEC_a_first_785309 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_8BBB(While b, Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_b_positive_748140 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!a.equals(__DEC_b_positive_748140)) {
					if (!d.equals(__DEC_b_positive_748140)) {
						return new Object[] { b, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_9B(While b) {
		for (While __DEC_b_first_663064 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_663064)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_10B(While b) {
		for (While __DEC_b_last_869746 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_869746)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_11B(While b) {
		for (Program __DEC_b_first_934323 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_12BB(Decision a,
			Assignment l) {
		if (l.equals(a.getPositive())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_13BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_14BB(Decision a,
			Assignment l) {
		if (l.equals(a.getNegative())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_15BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_16BB(While b, Decision a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_17BB(While b, Decision a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_18BB(Decision a, While b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_19BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_blackBBBB(Assignment l, Decision a,
			While b, Decision d) {
		if (!a.equals(d)) {
			if (l.equals(b.getFirst())) {
				if (b.equals(d.getNegative())) {
					if (a.equals(d.getPositive())) {
						if (l.equals(b.getLast())) {
							if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_0BBB(l, a, d) == null) {
								if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_1BBB(l, a, d) == null) {
									if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_2BB(l, b) == null) {
										if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_3B(l) == null) {
											if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_4BB(a,
													d) == null) {
												if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_5BB(a,
														b) == null) {
													if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_6BB(a,
															b) == null) {
														if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_7B(
																a) == null) {
															if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_8BBB(
																	b, a, d) == null) {
																if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_9B(
																		b) == null) {
																	if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_10B(
																			b) == null) {
																		if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_11B(
																				b) == null) {
																			if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_12BB(
																					a, l) == null) {
																				if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_13BB(
																						d, l) == null) {
																					if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_14BB(
																							a, l) == null) {
																						if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_15BB(
																								d, l) == null) {
																							if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_16BB(
																									b, a) == null) {
																								if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_17BB(
																										b, a) == null) {
																									if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_18BB(
																											a,
																											b) == null) {
																										if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_19BB(
																												d,
																												b) == null) {
																											return new Object[] {
																													l,
																													a,
																													b,
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
		return null;
	}

	public static final boolean pattern_decdul2branchbub_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdul2branchbub_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_597347 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_1BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_247579 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_247579)) {
							if (!y.equals(__DEC_x_positive_247579)) {
								if (!c.equals(__DEC_x_positive_247579)) {
									return new Object[] { x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_2BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_42277 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_42277)) {
							if (!y.equals(__DEC_x_negative_42277)) {
								if (!c.equals(__DEC_x_negative_42277)) {
									return new Object[] { x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_3B(Branch y) {
		for (Graph __DEC_y_root_474138 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_4BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_283925 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_283925)) {
							if (!x.equals(__DEC_y_positive_283925)) {
								if (!c.equals(__DEC_y_positive_283925)) {
									return new Object[] { y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_5BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_783394 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_783394)) {
							if (!x.equals(__DEC_y_negative_783394)) {
								if (!c.equals(__DEC_y_negative_783394)) {
									return new Object[] { y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_717283 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_7BBBB(Command z, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_positive_942167 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!x.equals(__DEC_z_positive_942167)) {
							if (!y.equals(__DEC_z_positive_942167)) {
								if (!c.equals(__DEC_z_positive_942167)) {
									return new Object[] { z, x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_8BBBB(Command z, Branch x,
			Branch y, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_negative_582569 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!x.equals(__DEC_z_negative_582569)) {
							if (!y.equals(__DEC_z_negative_582569)) {
								if (!c.equals(__DEC_z_negative_582569)) {
									return new Object[] { z, x, y, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_9BB(Branch x, Branch y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_10BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_11BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_13BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_14BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_15BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_blackBBBB(Branch x, Branch y, Command z,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (z.equals(y.getPositive())) {
						if (x.equals(c.getPositive())) {
							if (y.equals(c.getNegative())) {
								if (y.equals(z.getNext())) {
									if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_0B(x) == null) {
										if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_1BBB(x, y,
												c) == null) {
											if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_2BBB(x, y,
													c) == null) {
												if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_3B(
														y) == null) {
													if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_4BBB(y,
															x, c) == null) {
														if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_5BBB(
																y, x, c) == null) {
															if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_6B(
																	z) == null) {
																if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_7BBBB(
																		z, x, y, c) == null) {
																	if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_8BBBB(
																			z, x, y, c) == null) {
																		if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_9BB(
																				x, y) == null) {
																			if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_10BB(
																					x, y) == null) {
																				if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_11BB(
																						x, z) == null) {
																					if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_12BB(
																							c, z) == null) {
																						if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_13BB(
																								x, z) == null) {
																							if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_14BB(
																									y, z) == null) {
																								if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_15BB(
																										c, z) == null) {
																									return new Object[] {
																											x, y, z,
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
		return null;
	}

	public static final boolean pattern_decdul2branchbub_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdul2branchbub_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_29_1_createresult_blackB(decdul2branchbub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decdul2branchbub_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_decdul2branchbub_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_decdul2branchbub_29_2_isapplicablecore_black_nac_0BB(ruleResult, d2c) == null) {
								if (pattern_decdul2branchbub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										d) == null) {
									if (pattern_decdul2branchbub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_decdul2branchbub_29_3_solveCSP_bindingFBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Decision d, Branch c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d2c, d, c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, d, c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Decision d, Branch c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decdul2branchbub_29_3_solveCSP_binding = pattern_decdul2branchbub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d2c, d, c, ruleResult);
		if (result_pattern_decdul2branchbub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_29_3_solveCSP_binding[0];

			Object[] result_pattern_decdul2branchbub_29_3_solveCSP_black = pattern_decdul2branchbub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decdul2branchbub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, d, c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decdul2branchbub_29_4_checkCSP_expressionFBB(decdul2branchbub _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_29_5_checknacs_blackBBB(S2B d2c, Decision d, Branch c) {
		return new Object[] { d2c, d, c };
	}

	public static final Object[] pattern_decdul2branchbub_29_6_perform_blackBBBB(S2B d2c, Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d2c, d, c, ruleResult };
	}

	public static final Object[] pattern_decdul2branchbub_29_6_perform_greenFFFFFBFFFFBB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(l);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		l2z.setSource(l);
		ruleResult.getCorrObjects().add(l2z);
		b.setFirst(l);
		d.setNegative(b);
		b.setLast(l);
		ruleResult.getSourceObjects().add(b);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		b2y.setTarget(y);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		y.setPositive(z);
		l2z.setTarget(z);
		z.setNext(y);
		ruleResult.getTargetObjects().add(z);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { l, x, a, l2z, b, d, a2x, y, b2y, z, c, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decdul2branchbub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decdul2branchbubImpl
