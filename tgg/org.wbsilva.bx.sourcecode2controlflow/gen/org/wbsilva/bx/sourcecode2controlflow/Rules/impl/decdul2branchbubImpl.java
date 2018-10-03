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
	public boolean isAppropriate_FWD(Match match, Decision d, While b, Assignment l, Decision a) {

		Object[] result1_black = decdul2branchbubImpl.pattern_decdul2branchbub_0_1_initialbindings_blackBBBBBB(this,
				match, d, b, l, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[l] = " + l + ", "
					+ "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, d, b, l, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[l] = " + l + ", "
					+ "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdul2branchbubImpl.pattern_decdul2branchbub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decdul2branchbubImpl
					.pattern_decdul2branchbub_0_4_collectelementstobetranslated_blackBBBBB(match, d, b, l, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[a] = " + a + ".");
			}
			decdul2branchbubImpl.pattern_decdul2branchbub_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, d, b,
					l, a);
			//nothing EMoflonEdge b__l____first = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge b__l____last = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[8];

			Object[] result5_black = decdul2branchbubImpl
					.pattern_decdul2branchbub_0_5_collectcontextelements_blackBBBBB(match, d, b, l, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[b] = " + b + ", " + "[l] = " + l + ", " + "[a] = " + a + ".");
			}
			decdul2branchbubImpl.pattern_decdul2branchbub_0_5_collectcontextelements_greenBB(match, d);

			// 
			decdul2branchbubImpl.pattern_decdul2branchbub_0_6_registerobjectstomatch_expressionBBBBBB(this, match, d, b,
					l, a);
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
		Decision d = (Decision) result1_bindingAndBlack[0];
		While b = (While) result1_bindingAndBlack[1];
		Branch c = (Branch) result1_bindingAndBlack[2];
		Assignment l = (Assignment) result1_bindingAndBlack[3];
		S2B d2c = (S2B) result1_bindingAndBlack[4];
		Decision a = (Decision) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decdul2branchbubImpl
				.pattern_decdul2branchbub_1_1_performtransformation_greenFBFBBFFFFB(b, c, l, a);
		Branch x = (Branch) result1_green[0];
		S2B b2y = (S2B) result1_green[2];
		S2B a2x = (S2B) result1_green[5];
		Branch y = (Branch) result1_green[6];
		S2N l2z = (S2N) result1_green[7];
		Command z = (Command) result1_green[8];

		Object[] result2_black = decdul2branchbubImpl
				.pattern_decdul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBB(x, b, b2y, l, a2x, y, l2z, z, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[b] = " + b
					+ ", " + "[b2y] = " + b2y + ", " + "[l] = " + l + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y
					+ ", " + "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = decdul2branchbubImpl
				.pattern_decdul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBB(x, b, b2y, l, a2x, y, l2z, z,
						a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdul2branchbubImpl
				.pattern_decdul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, d, x, b, b2y, c, l,
						a2x, d2c, y, l2z, z, a);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[b2y] = " + b2y + ", "
					+ "[c] = " + c + ", " + "[l] = " + l + ", " + "[a2x] = " + a2x + ", " + "[d2c] = " + d2c + ", "
					+ "[y] = " + y + ", " + "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[a] = " + a + ".");
		}
		decdul2branchbubImpl.pattern_decdul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, d, x, b, b2y, c, l, a2x, y, l2z, z, a);
		//nothing EMoflonEdge b__l____first = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[25];

		// 
		// 
		decdul2branchbubImpl.pattern_decdul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, d,
				x, b, b2y, c, l, a2x, d2c, y, l2z, z, a);
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
		Decision d = (Decision) result2_binding[0];
		While b = (While) result2_binding[1];
		Assignment l = (Assignment) result2_binding[2];
		Decision a = (Decision) result2_binding[3];
		for (Object[] result2_black : decdul2branchbubImpl.pattern_decdul2branchbub_2_2_corematch_blackBBFBFBB(d, b, l,
				a, match)) {
			Branch c = (Branch) result2_black[2];
			S2B d2c = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decdul2branchbubImpl.pattern_decdul2branchbub_2_3_findcontext_blackBBBBBB(d,
					b, c, l, d2c, a)) {
				Object[] result3_green = decdul2branchbubImpl
						.pattern_decdul2branchbub_2_3_findcontext_greenBBBBBBFFFFFFF(d, b, c, l, d2c, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge b__l____first = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = decdul2branchbubImpl
						.pattern_decdul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d, b,
								c, l, d2c, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[b] = " + b
							+ ", " + "[c] = " + c + ", " + "[l] = " + l + ", " + "[d2c] = " + d2c + ", " + "[a] = " + a
							+ ".");
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
	public void registerObjectsToMatch_FWD(Match match, Decision d, While b, Assignment l, Decision a) {
		match.registerObject("d", d);
		match.registerObject("b", b);
		match.registerObject("l", l);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision d, While b, Assignment l, Decision a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Decision d, While b, Branch c,
			Assignment l, S2B d2c, Decision a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("l", l);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject d, EObject x, EObject b, EObject b2y,
			EObject c, EObject l, EObject a2x, EObject d2c, EObject y, EObject l2z, EObject z, EObject a) {
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch x, Branch c, Branch y, Command z) {

		Object[] result1_black = decdul2branchbubImpl.pattern_decdul2branchbub_10_1_initialbindings_blackBBBBBB(this,
				match, x, c, y, z);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[y] = " + y + ", "
					+ "[z] = " + z + ".");
		}

		Object[] result2_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, x, c, y, z);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[y] = " + y + ", "
					+ "[z] = " + z + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdul2branchbubImpl.pattern_decdul2branchbub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decdul2branchbubImpl
					.pattern_decdul2branchbub_10_4_collectelementstobetranslated_blackBBBBB(match, x, c, y, z);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ".");
			}
			decdul2branchbubImpl.pattern_decdul2branchbub_10_4_collectelementstobetranslated_greenBBBBBFFFF(match, x, c,
					y, z);
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge z__y____next = (EMoflonEdge) result4_green[8];

			Object[] result5_black = decdul2branchbubImpl
					.pattern_decdul2branchbub_10_5_collectcontextelements_blackBBBBB(match, x, c, y, z);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ".");
			}
			decdul2branchbubImpl.pattern_decdul2branchbub_10_5_collectcontextelements_greenBB(match, c);

			// 
			decdul2branchbubImpl.pattern_decdul2branchbub_10_6_registerobjectstomatch_expressionBBBBBB(this, match, x,
					c, y, z);
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
		Decision d = (Decision) result1_bindingAndBlack[0];
		Branch x = (Branch) result1_bindingAndBlack[1];
		Branch c = (Branch) result1_bindingAndBlack[2];
		S2B d2c = (S2B) result1_bindingAndBlack[3];
		Branch y = (Branch) result1_bindingAndBlack[4];
		Command z = (Command) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decdul2branchbubImpl
				.pattern_decdul2branchbub_11_1_performtransformation_greenBBFFFFBFBF(d, x, y, z);
		While b = (While) result1_green[2];
		S2B b2y = (S2B) result1_green[3];
		Assignment l = (Assignment) result1_green[4];
		S2B a2x = (S2B) result1_green[5];
		S2N l2z = (S2N) result1_green[7];
		Decision a = (Decision) result1_green[9];

		Object[] result2_black = decdul2branchbubImpl
				.pattern_decdul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBB(x, b, b2y, l, a2x, y, l2z, z,
						a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[b] = " + b
					+ ", " + "[b2y] = " + b2y + ", " + "[l] = " + l + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y
					+ ", " + "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = decdul2branchbubImpl
				.pattern_decdul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBB(x, b, b2y, l, a2x, y, l2z, z,
						a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdul2branchbubImpl
				.pattern_decdul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, d, x, b, b2y, c, l,
						a2x, d2c, y, l2z, z, a);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[b2y] = " + b2y + ", "
					+ "[c] = " + c + ", " + "[l] = " + l + ", " + "[a2x] = " + a2x + ", " + "[d2c] = " + d2c + ", "
					+ "[y] = " + y + ", " + "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[a] = " + a + ".");
		}
		decdul2branchbubImpl.pattern_decdul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, d, x, b, b2y, c, l, a2x, y, l2z, z, a);
		//nothing EMoflonEdge b__l____first = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[25];

		// 
		// 
		decdul2branchbubImpl.pattern_decdul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, d,
				x, b, b2y, c, l, a2x, d2c, y, l2z, z, a);
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
		Branch c = (Branch) result2_binding[1];
		Branch y = (Branch) result2_binding[2];
		Command z = (Command) result2_binding[3];
		for (Object[] result2_black : decdul2branchbubImpl.pattern_decdul2branchbub_12_2_corematch_blackFBBFBBB(x, c, y,
				z, match)) {
			Decision d = (Decision) result2_black[0];
			S2B d2c = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : decdul2branchbubImpl.pattern_decdul2branchbub_12_3_findcontext_blackBBBBBB(d,
					x, c, d2c, y, z)) {
				Object[] result3_green = decdul2branchbubImpl
						.pattern_decdul2branchbub_12_3_findcontext_greenBBBBBBFFFFFFF(d, x, c, d2c, y, z);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = decdul2branchbubImpl
						.pattern_decdul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d, x,
								c, d2c, y, z);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[x] = " + x
							+ ", " + "[c] = " + c + ", " + "[d2c] = " + d2c + ", " + "[y] = " + y + ", " + "[z] = " + z
							+ ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch x, Branch c, Branch y, Command z) {
		match.registerObject("x", x);
		match.registerObject("c", c);
		match.registerObject("y", y);
		match.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch x, Branch c, Branch y, Command z) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Decision d, Branch x, Branch c, S2B d2c,
			Branch y, Command z) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("y", y);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject d, EObject x, EObject b, EObject b2y,
			EObject c, EObject l, EObject a2x, EObject d2c, EObject y, EObject l2z, EObject z, EObject a) {
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a", a);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_10(EMoflonEdge _edge_positive) {

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
			Branch c = (Branch) result2_black[1];
			Branch y = (Branch) result2_black[2];
			Command z = (Command) result2_black[3];
			Object[] result2_green = decdul2branchbubImpl
					.pattern_decdul2branchbub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdul2branchbubImpl
					.pattern_decdul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, x, c, y, z)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_11(EMoflonEdge _edge_first) {

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
			Decision d = (Decision) result2_black[0];
			While b = (While) result2_black[1];
			Assignment l = (Assignment) result2_black[2];
			Decision a = (Decision) result2_black[3];
			Object[] result2_green = decdul2branchbubImpl
					.pattern_decdul2branchbub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdul2branchbubImpl
					.pattern_decdul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, d, b, l, a)) {
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
		Decision d = (Decision) result2_bindingAndBlack[0];
		Branch x = (Branch) result2_bindingAndBlack[1];
		While b = (While) result2_bindingAndBlack[2];
		Branch c = (Branch) result2_bindingAndBlack[3];
		Assignment l = (Assignment) result2_bindingAndBlack[4];
		Branch y = (Branch) result2_bindingAndBlack[5];
		Command z = (Command) result2_bindingAndBlack[6];
		Decision a = (Decision) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, d, x, b, c, l, y, z, a,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[d] = " + d + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[l] = "
					+ l + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decdul2branchbubImpl.pattern_decdul2branchbub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decdul2branchbubImpl
					.pattern_decdul2branchbub_24_5_matchcorrcontext_blackBBFBB(d, c, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[2];
				Object[] result5_green = decdul2branchbubImpl
						.pattern_decdul2branchbub_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decdul2branchbubImpl
						.pattern_decdul2branchbub_24_6_createcorrespondence_blackBBBBBBBBB(d, x, b, c, l, y, z, a,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
							+ "[x] = " + x + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[l] = " + l + ", "
							+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decdul2branchbubImpl.pattern_decdul2branchbub_24_6_createcorrespondence_greenBBFBFBFBBB(x, b, l, y, z,
						a, ccMatch);
				//nothing S2B b2y = (S2B) result6_green[2];
				//nothing S2B a2x = (S2B) result6_green[4];
				//nothing S2N l2z = (S2N) result6_green[6];

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
	public CSP isApplicable_solveCsp_CC(Decision d, Branch x, While b, Branch c, Assignment l, Branch y, Command z,
			Decision a, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Decision d, While b, Assignment l, Decision a) {// 
		Object[] result1_black = decdul2branchbubImpl.pattern_decdul2branchbub_27_1_matchtggpattern_blackBBBB(d, b, l,
				a);
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
	public boolean checkDEC_BWD(Branch x, Branch c, Branch y, Command z) {// 
		Object[] result1_black = decdul2branchbubImpl.pattern_decdul2branchbub_28_1_matchtggpattern_blackBBBB(x, c, y,
				z);
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
			Decision d = (Decision) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = decdul2branchbubImpl
					.pattern_decdul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d, c, d2c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[c] = " + c
						+ ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decdul2branchbubImpl.pattern_decdul2branchbub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decdul2branchbubImpl.pattern_decdul2branchbub_29_5_checknacs_blackBBB(d, c,
						d2c);
				if (result5_black != null) {

					Object[] result6_black = decdul2branchbubImpl.pattern_decdul2branchbub_29_6_perform_blackBBBB(d, c,
							d2c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
								+ "[c] = " + c + ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decdul2branchbubImpl.pattern_decdul2branchbub_29_6_perform_greenBFFFBFFFFFFB(d, c, ruleResult);
					//nothing Branch x = (Branch) result6_green[1];
					//nothing While b = (While) result6_green[2];
					//nothing S2B b2y = (S2B) result6_green[3];
					//nothing Assignment l = (Assignment) result6_green[5];
					//nothing S2B a2x = (S2B) result6_green[6];
					//nothing Branch y = (Branch) result6_green[7];
					//nothing S2N l2z = (S2N) result6_green[8];
					//nothing Command z = (Command) result6_green[9];
					//nothing Decision a = (Decision) result6_green[10];

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
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_FWD__MATCH_DECISION_WHILE_ASSIGNMENT_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECDUL2BRANCHBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_WHILE_ASSIGNMENT_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Decision) arguments.get(4));
			return null;
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_WHILE_ASSIGNMENT_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DECISION_WHILE_BRANCH_ASSIGNMENT_S2B_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (Assignment) arguments.get(4),
					(S2B) arguments.get(5), (Decision) arguments.get(6));
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
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECDUL2BRANCHBUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
			return null;
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_BRANCH_BRANCH_S2B_BRANCH_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (S2B) arguments.get(4),
					(Branch) arguments.get(5), (Command) arguments.get(6));
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
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_10((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_11((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_CC__DECISION_BRANCH_WHILE_BRANCH_ASSIGNMENT_BRANCH_COMMAND_DECISION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Decision) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (Assignment) arguments.get(4),
					(Branch) arguments.get(5), (Command) arguments.get(6), (Decision) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___CHECK_DEC_FWD__DECISION_WHILE_ASSIGNMENT_DECISION:
			return checkDEC_FWD((Decision) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Decision) arguments.get(3));
		case RulesPackage.DECDUL2BRANCHBUB___CHECK_DEC_BWD__BRANCH_BRANCH_BRANCH_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.DECDUL2BRANCHBUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECDUL2BRANCHBUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_BRANCH_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECDUL2BRANCHBUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decdul2branchbub_0_1_initialbindings_blackBBBBBB(decdul2branchbub _this,
			Match match, Decision d, While b, Assignment l, Decision a) {
		if (!a.equals(d)) {
			return new Object[] { _this, match, d, b, l, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_0_2_SolveCSP_bindingFBBBBBB(decdul2branchbub _this,
			Match match, Decision d, While b, Assignment l, Decision a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, d, b, l, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, d, b, l, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBB(decdul2branchbub _this,
			Match match, Decision d, While b, Assignment l, Decision a) {
		Object[] result_pattern_decdul2branchbub_0_2_SolveCSP_binding = pattern_decdul2branchbub_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, d, b, l, a);
		if (result_pattern_decdul2branchbub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decdul2branchbub_0_2_SolveCSP_black = pattern_decdul2branchbub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdul2branchbub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, d, b, l, a };
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
			Decision d, While b, Assignment l, Decision a) {
		if (!a.equals(d)) {
			return new Object[] { match, d, b, l, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_0_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Decision d, While b, Assignment l, Decision a) {
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(a);
		String b__l____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String b__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		match.getToBeTranslatedEdges().add(b__l____first);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(b__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		b__l____first.setName(b__l____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { match, d, b, l, a, b__l____first, d__a____positive, b__l____last, d__b____negative };
	}

	public static final Object[] pattern_decdul2branchbub_0_5_collectcontextelements_blackBBBBB(Match match, Decision d,
			While b, Assignment l, Decision a) {
		if (!a.equals(d)) {
			return new Object[] { match, d, b, l, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decdul2branchbub_0_6_registerobjectstomatch_expressionBBBBBB(
			decdul2branchbub _this, Match match, Decision d, While b, Assignment l, Decision a) {
		_this.registerObjectsToMatch_FWD(match, d, b, l, a);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("l");
		EObject _localVariable_4 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("a");
		EObject tmpD = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpL = _localVariable_3;
		EObject tmpD2c = _localVariable_4;
		EObject tmpA = _localVariable_5;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						if (tmpD2c instanceof S2B) {
							S2B d2c = (S2B) tmpD2c;
							if (tmpA instanceof Decision) {
								Decision a = (Decision) tmpA;
								return new Object[] { d, b, c, l, d2c, a, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_1_1_performtransformation_blackBBBBBBFBB(Decision d, While b,
			Branch c, Assignment l, S2B d2c, Decision a, decdul2branchbub _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(d)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { d, b, c, l, d2c, a, csp, _this, isApplicableMatch };
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
			Decision d = (Decision) result_pattern_decdul2branchbub_1_1_performtransformation_binding[0];
			While b = (While) result_pattern_decdul2branchbub_1_1_performtransformation_binding[1];
			Branch c = (Branch) result_pattern_decdul2branchbub_1_1_performtransformation_binding[2];
			Assignment l = (Assignment) result_pattern_decdul2branchbub_1_1_performtransformation_binding[3];
			S2B d2c = (S2B) result_pattern_decdul2branchbub_1_1_performtransformation_binding[4];
			Decision a = (Decision) result_pattern_decdul2branchbub_1_1_performtransformation_binding[5];

			Object[] result_pattern_decdul2branchbub_1_1_performtransformation_black = pattern_decdul2branchbub_1_1_performtransformation_blackBBBBBBFBB(
					d, b, c, l, d2c, a, _this, isApplicableMatch);
			if (result_pattern_decdul2branchbub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdul2branchbub_1_1_performtransformation_black[6];

				return new Object[] { d, b, c, l, d2c, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_1_1_performtransformation_greenFBFBBFFFFB(While b, Branch c,
			Assignment l, Decision a) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		c.setPositive(x);
		b2y.setSource(b);
		a2x.setTarget(x);
		a2x.setSource(a);
		c.setNegative(y);
		b2y.setTarget(y);
		l2z.setSource(l);
		y.setPositive(z);
		z.setNext(y);
		l2z.setTarget(z);
		return new Object[] { x, b, b2y, c, l, a2x, y, l2z, z, a };
	}

	public static final Object[] pattern_decdul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBB(Branch x,
			While b, S2B b2y, Assignment l, S2B a2x, Branch y, S2N l2z, Command z, Decision a) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				return new Object[] { x, b, b2y, l, a2x, y, l2z, z, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBB(Branch x,
			While b, S2B b2y, Assignment l, S2B a2x, Branch y, S2N l2z, Command z, Decision a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(a);
		return new Object[] { ruleresult, x, b, b2y, l, a2x, y, l2z, z, a };
	}

	public static final Object[] pattern_decdul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d, EObject x, EObject b, EObject b2y, EObject c, EObject l,
			EObject a2x, EObject d2c, EObject y, EObject l2z, EObject z, EObject a) {
		if (!d.equals(x)) {
			if (!d.equals(l)) {
				if (!d.equals(d2c)) {
					if (!d.equals(y)) {
						if (!d.equals(l2z)) {
							if (!d.equals(z)) {
								if (!x.equals(y)) {
									if (!x.equals(z)) {
										if (!b.equals(d)) {
											if (!b.equals(x)) {
												if (!b.equals(b2y)) {
													if (!b.equals(c)) {
														if (!b.equals(l)) {
															if (!b.equals(d2c)) {
																if (!b.equals(y)) {
																	if (!b.equals(l2z)) {
																		if (!b.equals(z)) {
																			if (!b2y.equals(d)) {
																				if (!b2y.equals(x)) {
																					if (!b2y.equals(c)) {
																						if (!b2y.equals(l)) {
																							if (!b2y.equals(d2c)) {
																								if (!b2y.equals(y)) {
																									if (!b2y.equals(
																											l2z)) {
																										if (!b2y.equals(
																												z)) {
																											if (!c.equals(
																													d)) {
																												if (!c.equals(
																														x)) {
																													if (!c.equals(
																															l)) {
																														if (!c.equals(
																																d2c)) {
																															if (!c.equals(
																																	y)) {
																																if (!c.equals(
																																		l2z)) {
																																	if (!c.equals(
																																			z)) {
																																		if (!l.equals(
																																				x)) {
																																			if (!l.equals(
																																					y)) {
																																				if (!l.equals(
																																						l2z)) {
																																					if (!l.equals(
																																							z)) {
																																						if (!a2x.equals(
																																								d)) {
																																							if (!a2x.equals(
																																									x)) {
																																								if (!a2x.equals(
																																										b)) {
																																									if (!a2x.equals(
																																											b2y)) {
																																										if (!a2x.equals(
																																												c)) {
																																											if (!a2x.equals(
																																													l)) {
																																												if (!a2x.equals(
																																														d2c)) {
																																													if (!a2x.equals(
																																															y)) {
																																														if (!a2x.equals(
																																																l2z)) {
																																															if (!a2x.equals(
																																																	z)) {
																																																if (!d2c.equals(
																																																		x)) {
																																																	if (!d2c.equals(
																																																			l)) {
																																																		if (!d2c.equals(
																																																				y)) {
																																																			if (!d2c.equals(
																																																					l2z)) {
																																																				if (!d2c.equals(
																																																						z)) {
																																																					if (!y.equals(
																																																							z)) {
																																																						if (!l2z.equals(
																																																								x)) {
																																																							if (!l2z.equals(
																																																									y)) {
																																																								if (!l2z.equals(
																																																										z)) {
																																																									if (!a.equals(
																																																											d)) {
																																																										if (!a.equals(
																																																												x)) {
																																																											if (!a.equals(
																																																													b)) {
																																																												if (!a.equals(
																																																														b2y)) {
																																																													if (!a.equals(
																																																															c)) {
																																																														if (!a.equals(
																																																																l)) {
																																																															if (!a.equals(
																																																																	a2x)) {
																																																																if (!a.equals(
																																																																		d2c)) {
																																																																	if (!a.equals(
																																																																			y)) {
																																																																		if (!a.equals(
																																																																				l2z)) {
																																																																			if (!a.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						d,
																																																																						x,
																																																																						b,
																																																																						b2y,
																																																																						c,
																																																																						l,
																																																																						a2x,
																																																																						d2c,
																																																																						y,
																																																																						l2z,
																																																																						z,
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
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject d, EObject x, EObject b, EObject b2y, EObject c, EObject l,
			EObject a2x, EObject y, EObject l2z, EObject z, EObject a) {
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdul2branchbub";
		String b__l____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String c__x____positive_name_prime = "positive";
		String b__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String c__y____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String l2z__l____source_name_prime = "source";
		String y__z____positive_name_prime = "positive";
		String z__y____next_name_prime = "next";
		String a2x__a____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		ruleresult.getTranslatedEdges().add(b__l____first);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(b__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		ruleresult.getCreatedEdges().add(y__z____positive);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(z__y____next);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b__l____first.setName(b__l____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		return new Object[] { ruleresult, d, x, b, b2y, c, l, a2x, y, l2z, z, a, b__l____first, d__a____positive,
				c__x____positive, b__l____last, d__b____negative, c__y____negative, a2x__x____target, b2y__b____source,
				b2y__y____target, l2z__l____source, y__z____positive, z__y____next, a2x__a____source,
				l2z__z____target };
	}

	public static final void pattern_decdul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decdul2branchbub _this, PerformRuleResult ruleresult, EObject d, EObject x, EObject b, EObject b2y,
			EObject c, EObject l, EObject a2x, EObject d2c, EObject y, EObject l2z, EObject z, EObject a) {
		_this.registerObjects_FWD(ruleresult, d, x, b, b2y, c, l, a2x, d2c, y, l2z, z, a);

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
		EObject _localVariable_0 = match.getObject("d");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("l");
		EObject _localVariable_3 = match.getObject("a");
		EObject tmpD = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpL = _localVariable_2;
		EObject tmpA = _localVariable_3;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpL instanceof Assignment) {
					Assignment l = (Assignment) tmpL;
					if (tmpA instanceof Decision) {
						Decision a = (Decision) tmpA;
						return new Object[] { d, b, l, a, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_2_2_corematch_blackBBFBFBB(Decision d, While b,
			Assignment l, Decision a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { d, b, c, l, d2c, a, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_2_3_findcontext_blackBBBBBB(Decision d, While b,
			Branch c, Assignment l, S2B d2c, Decision a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			if (l.equals(b.getFirst())) {
				if (a.equals(d.getPositive())) {
					if (l.equals(b.getLast())) {
						if (b.equals(d.getNegative())) {
							if (c.equals(d2c.getTarget())) {
								if (d.equals(d2c.getSource())) {
									_result.add(new Object[] { d, b, c, l, d2c, a });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_2_3_findcontext_greenBBBBBBFFFFFFF(Decision d, While b,
			Branch c, Assignment l, S2B d2c, Decision a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String b__l____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String b__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(a);
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		isApplicableMatch.getAllContextElements().add(b__l____first);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(b__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		b__l____first.setName(b__l____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { d, b, c, l, d2c, a, isApplicableMatch, b__l____first, d__a____positive, b__l____last,
				d__b____negative, d2c__c____target, d2c__d____source };
	}

	public static final Object[] pattern_decdul2branchbub_2_4_solveCSP_bindingFBBBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Decision d, While b, Branch c, Assignment l, S2B d2c, Decision a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, d, b, c, l, d2c, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, b, c, l, d2c, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Decision d, While b, Branch c, Assignment l, S2B d2c, Decision a) {
		Object[] result_pattern_decdul2branchbub_2_4_solveCSP_binding = pattern_decdul2branchbub_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d, b, c, l, d2c, a);
		if (result_pattern_decdul2branchbub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_2_4_solveCSP_binding[0];

			Object[] result_pattern_decdul2branchbub_2_4_solveCSP_black = pattern_decdul2branchbub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdul2branchbub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, b, c, l, d2c, a };
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
			Match match, Branch x, Branch c, Branch y, Command z) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					return new Object[] { _this, match, x, c, y, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_10_2_SolveCSP_bindingFBBBBBB(decdul2branchbub _this,
			Match match, Branch x, Branch c, Branch y, Command z) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, c, y, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, c, y, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBB(decdul2branchbub _this,
			Match match, Branch x, Branch c, Branch y, Command z) {
		Object[] result_pattern_decdul2branchbub_10_2_SolveCSP_binding = pattern_decdul2branchbub_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, x, c, y, z);
		if (result_pattern_decdul2branchbub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decdul2branchbub_10_2_SolveCSP_black = pattern_decdul2branchbub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdul2branchbub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, c, y, z };
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
			Branch x, Branch c, Branch y, Command z) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					return new Object[] { match, x, c, y, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_10_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Branch x, Branch c, Branch y, Command z) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String y__z____positive_name_prime = "positive";
		String z__y____next_name_prime = "next";
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		match.getToBeTranslatedEdges().add(y__z____positive);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(z__y____next);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		return new Object[] { match, x, c, y, z, c__x____positive, c__y____negative, y__z____positive, z__y____next };
	}

	public static final Object[] pattern_decdul2branchbub_10_5_collectcontextelements_blackBBBBB(Match match, Branch x,
			Branch c, Branch y, Command z) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					return new Object[] { match, x, c, y, z };
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
			decdul2branchbub _this, Match match, Branch x, Branch c, Branch y, Command z) {
		_this.registerObjectsToMatch_BWD(match, x, c, y, z);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("y");
		EObject _localVariable_5 = isApplicableMatch.getObject("z");
		EObject tmpD = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpD2c = _localVariable_3;
		EObject tmpY = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpD2c instanceof S2B) {
						S2B d2c = (S2B) tmpD2c;
						if (tmpY instanceof Branch) {
							Branch y = (Branch) tmpY;
							if (tmpZ instanceof Command) {
								Command z = (Command) tmpZ;
								return new Object[] { d, x, c, d2c, y, z, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_11_1_performtransformation_blackBBBBBBFBB(Decision d,
			Branch x, Branch c, S2B d2c, Branch y, Command z, decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { d, x, c, d2c, y, z, csp, _this, isApplicableMatch };
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
			Decision d = (Decision) result_pattern_decdul2branchbub_11_1_performtransformation_binding[0];
			Branch x = (Branch) result_pattern_decdul2branchbub_11_1_performtransformation_binding[1];
			Branch c = (Branch) result_pattern_decdul2branchbub_11_1_performtransformation_binding[2];
			S2B d2c = (S2B) result_pattern_decdul2branchbub_11_1_performtransformation_binding[3];
			Branch y = (Branch) result_pattern_decdul2branchbub_11_1_performtransformation_binding[4];
			Command z = (Command) result_pattern_decdul2branchbub_11_1_performtransformation_binding[5];

			Object[] result_pattern_decdul2branchbub_11_1_performtransformation_black = pattern_decdul2branchbub_11_1_performtransformation_blackBBBBBBFBB(
					d, x, c, d2c, y, z, _this, isApplicableMatch);
			if (result_pattern_decdul2branchbub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdul2branchbub_11_1_performtransformation_black[6];

				return new Object[] { d, x, c, d2c, y, z, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_11_1_performtransformation_greenBBFFFFBFBF(Decision d,
			Branch x, Branch y, Command z) {
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		d.setNegative(b);
		b2y.setSource(b);
		b2y.setTarget(y);
		b.setFirst(l);
		b.setLast(l);
		a2x.setTarget(x);
		l2z.setSource(l);
		l2z.setTarget(z);
		d.setPositive(a);
		a2x.setSource(a);
		return new Object[] { d, x, b, b2y, l, a2x, y, l2z, z, a };
	}

	public static final Object[] pattern_decdul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBB(Branch x,
			While b, S2B b2y, Assignment l, S2B a2x, Branch y, S2N l2z, Command z, Decision a) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				return new Object[] { x, b, b2y, l, a2x, y, l2z, z, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBB(Branch x,
			While b, S2B b2y, Assignment l, S2B a2x, Branch y, S2N l2z, Command z, Decision a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(a);
		return new Object[] { ruleresult, x, b, b2y, l, a2x, y, l2z, z, a };
	}

	public static final Object[] pattern_decdul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d, EObject x, EObject b, EObject b2y, EObject c, EObject l,
			EObject a2x, EObject d2c, EObject y, EObject l2z, EObject z, EObject a) {
		if (!d.equals(x)) {
			if (!d.equals(l)) {
				if (!d.equals(d2c)) {
					if (!d.equals(y)) {
						if (!d.equals(l2z)) {
							if (!d.equals(z)) {
								if (!x.equals(y)) {
									if (!x.equals(z)) {
										if (!b.equals(d)) {
											if (!b.equals(x)) {
												if (!b.equals(b2y)) {
													if (!b.equals(c)) {
														if (!b.equals(l)) {
															if (!b.equals(d2c)) {
																if (!b.equals(y)) {
																	if (!b.equals(l2z)) {
																		if (!b.equals(z)) {
																			if (!b2y.equals(d)) {
																				if (!b2y.equals(x)) {
																					if (!b2y.equals(c)) {
																						if (!b2y.equals(l)) {
																							if (!b2y.equals(d2c)) {
																								if (!b2y.equals(y)) {
																									if (!b2y.equals(
																											l2z)) {
																										if (!b2y.equals(
																												z)) {
																											if (!c.equals(
																													d)) {
																												if (!c.equals(
																														x)) {
																													if (!c.equals(
																															l)) {
																														if (!c.equals(
																																d2c)) {
																															if (!c.equals(
																																	y)) {
																																if (!c.equals(
																																		l2z)) {
																																	if (!c.equals(
																																			z)) {
																																		if (!l.equals(
																																				x)) {
																																			if (!l.equals(
																																					y)) {
																																				if (!l.equals(
																																						l2z)) {
																																					if (!l.equals(
																																							z)) {
																																						if (!a2x.equals(
																																								d)) {
																																							if (!a2x.equals(
																																									x)) {
																																								if (!a2x.equals(
																																										b)) {
																																									if (!a2x.equals(
																																											b2y)) {
																																										if (!a2x.equals(
																																												c)) {
																																											if (!a2x.equals(
																																													l)) {
																																												if (!a2x.equals(
																																														d2c)) {
																																													if (!a2x.equals(
																																															y)) {
																																														if (!a2x.equals(
																																																l2z)) {
																																															if (!a2x.equals(
																																																	z)) {
																																																if (!d2c.equals(
																																																		x)) {
																																																	if (!d2c.equals(
																																																			l)) {
																																																		if (!d2c.equals(
																																																				y)) {
																																																			if (!d2c.equals(
																																																					l2z)) {
																																																				if (!d2c.equals(
																																																						z)) {
																																																					if (!y.equals(
																																																							z)) {
																																																						if (!l2z.equals(
																																																								x)) {
																																																							if (!l2z.equals(
																																																									y)) {
																																																								if (!l2z.equals(
																																																										z)) {
																																																									if (!a.equals(
																																																											d)) {
																																																										if (!a.equals(
																																																												x)) {
																																																											if (!a.equals(
																																																													b)) {
																																																												if (!a.equals(
																																																														b2y)) {
																																																													if (!a.equals(
																																																															c)) {
																																																														if (!a.equals(
																																																																l)) {
																																																															if (!a.equals(
																																																																	a2x)) {
																																																																if (!a.equals(
																																																																		d2c)) {
																																																																	if (!a.equals(
																																																																			y)) {
																																																																		if (!a.equals(
																																																																				l2z)) {
																																																																			if (!a.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						d,
																																																																						x,
																																																																						b,
																																																																						b2y,
																																																																						c,
																																																																						l,
																																																																						a2x,
																																																																						d2c,
																																																																						y,
																																																																						l2z,
																																																																						z,
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
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject d, EObject x, EObject b, EObject b2y, EObject c, EObject l,
			EObject a2x, EObject y, EObject l2z, EObject z, EObject a) {
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdul2branchbub";
		String b__l____first_name_prime = "first";
		String d__a____positive_name_prime = "positive";
		String c__x____positive_name_prime = "positive";
		String b__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String c__y____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String l2z__l____source_name_prime = "source";
		String y__z____positive_name_prime = "positive";
		String z__y____next_name_prime = "next";
		String a2x__a____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		ruleresult.getCreatedEdges().add(b__l____first);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(b__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		ruleresult.getTranslatedEdges().add(y__z____positive);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(z__y____next);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b__l____first.setName(b__l____first_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		return new Object[] { ruleresult, d, x, b, b2y, c, l, a2x, y, l2z, z, a, b__l____first, d__a____positive,
				c__x____positive, b__l____last, d__b____negative, c__y____negative, a2x__x____target, b2y__b____source,
				b2y__y____target, l2z__l____source, y__z____positive, z__y____next, a2x__a____source,
				l2z__z____target };
	}

	public static final void pattern_decdul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decdul2branchbub _this, PerformRuleResult ruleresult, EObject d, EObject x, EObject b, EObject b2y,
			EObject c, EObject l, EObject a2x, EObject d2c, EObject y, EObject l2z, EObject z, EObject a) {
		_this.registerObjects_BWD(ruleresult, d, x, b, b2y, c, l, a2x, d2c, y, l2z, z, a);

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
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("z");
		EObject tmpX = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpY instanceof Branch) {
					Branch y = (Branch) tmpY;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						return new Object[] { x, c, y, z, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_12_2_corematch_blackFBBFBBB(Branch x, Branch c,
			Branch y, Command z, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
							"target")) {
						Statement tmpD = d2c.getSource();
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							_result.add(new Object[] { d, x, c, d2c, y, z, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_12_3_findcontext_blackBBBBBB(Decision d, Branch x,
			Branch c, S2B d2c, Branch y, Command z) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (x.equals(c.getPositive())) {
						if (y.equals(c.getNegative())) {
							if (c.equals(d2c.getTarget())) {
								if (z.equals(y.getPositive())) {
									if (y.equals(z.getNext())) {
										if (d.equals(d2c.getSource())) {
											_result.add(new Object[] { d, x, c, d2c, y, z });
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

	public static final Object[] pattern_decdul2branchbub_12_3_findcontext_greenBBBBBBFFFFFFF(Decision d, Branch x,
			Branch c, S2B d2c, Branch y, Command z) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String d2c__c____target_name_prime = "target";
		String y__z____positive_name_prime = "positive";
		String z__y____next_name_prime = "next";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(z);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		isApplicableMatch.getAllContextElements().add(y__z____positive);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(z__y____next);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { d, x, c, d2c, y, z, isApplicableMatch, c__x____positive, c__y____negative,
				d2c__c____target, y__z____positive, z__y____next, d2c__d____source };
	}

	public static final Object[] pattern_decdul2branchbub_12_4_solveCSP_bindingFBBBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch x, Branch c, S2B d2c, Branch y, Command z) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, d, x, c, d2c, y, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, x, c, d2c, y, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch x, Branch c, S2B d2c, Branch y, Command z) {
		Object[] result_pattern_decdul2branchbub_12_4_solveCSP_binding = pattern_decdul2branchbub_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d, x, c, d2c, y, z);
		if (result_pattern_decdul2branchbub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_12_4_solveCSP_binding[0];

			Object[] result_pattern_decdul2branchbub_12_4_solveCSP_black = pattern_decdul2branchbub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdul2branchbub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, x, c, d2c, y, z };
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
		for (Graph __DEC_x_root_100320 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_1BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_170055 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_170055)) {
							if (!c.equals(__DEC_x_positive_170055)) {
								if (!y.equals(__DEC_x_positive_170055)) {
									return new Object[] { x, c, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_2BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_916956 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_916956)) {
							if (!c.equals(__DEC_x_negative_916956)) {
								if (!y.equals(__DEC_x_negative_916956)) {
									return new Object[] { x, c, y };
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
		for (Graph __DEC_y_root_431271 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
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
					for (Branch __DEC_y_positive_280658 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_280658)) {
							if (!x.equals(__DEC_y_positive_280658)) {
								if (!c.equals(__DEC_y_positive_280658)) {
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
					for (Branch __DEC_y_negative_213116 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_213116)) {
							if (!x.equals(__DEC_y_negative_213116)) {
								if (!c.equals(__DEC_y_negative_213116)) {
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
		for (Graph __DEC_z_root_75130 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_7BBBB(Command z, Branch x,
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_positive_467375 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!x.equals(__DEC_z_positive_467375)) {
							if (!c.equals(__DEC_z_positive_467375)) {
								if (!y.equals(__DEC_z_positive_467375)) {
									return new Object[] { z, x, c, y };
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
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_negative_33808 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!x.equals(__DEC_z_negative_33808)) {
							if (!c.equals(__DEC_z_negative_33808)) {
								if (!y.equals(__DEC_z_negative_33808)) {
									return new Object[] { z, x, c, y };
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

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_10BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_11BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(Branch x,
			Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(Branch c,
			Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
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

	public static final Object[] pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(Branch y,
			Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_20_2_testcorematchandDECs_blackFFFFB(
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
						if (tmpY instanceof Branch) {
							Branch y = (Branch) tmpY;
							if (!x.equals(y)) {
								if (!c.equals(y)) {
									Node tmpZ = y.getPositive();
									if (tmpZ instanceof Command) {
										Command z = (Command) tmpZ;
										if (y.equals(z.getNext())) {
											if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_0B(
													x) == null) {
												if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_1BBB(x,
														c, y) == null) {
													if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_2BBB(
															x, c, y) == null) {
														if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_3B(
																y) == null) {
															if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_4BBB(
																	y, x, c) == null) {
																if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_5BBB(
																		y, x, c) == null) {
																	if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_9BB(
																			x, y) == null) {
																		if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_10BB(
																				c, y) == null) {
																			if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_11BB(
																					x, y) == null) {
																				if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_6B(
																						z) == null) {
																					if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_7BBBB(
																							z, x, c, y) == null) {
																						if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_8BBBB(
																								z, x, c, y) == null) {
																							if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(
																									x, z) == null) {
																								if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(
																										c, z) == null) {
																									if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(
																											x,
																											z) == null) {
																										if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(
																												c,
																												z) == null) {
																											if (pattern_decdul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(
																													y,
																													z) == null) {
																												_result.add(
																														new Object[] {
																																x,
																																c,
																																y,
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
			decdul2branchbub _this, Match match, Branch x, Branch c, Branch y, Command z) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, c, y, z);
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

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_0BBB(While b, Decision d,
			Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_b_positive_710305 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!d.equals(__DEC_b_positive_710305)) {
					if (!a.equals(__DEC_b_positive_710305)) {
						return new Object[] { b, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_1B(While b) {
		for (While __DEC_b_first_523477 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_523477)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_2B(While b) {
		for (While __DEC_b_last_731638 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_731638)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_3B(While b) {
		for (Program __DEC_b_first_606258 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_4BBB(Assignment l,
			Decision d, Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_positive_646523 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "positive")) {
				if (!d.equals(__DEC_l_positive_646523)) {
					if (!a.equals(__DEC_l_positive_646523)) {
						return new Object[] { l, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_5BBB(Assignment l,
			Decision d, Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_negative_630980 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "negative")) {
				if (!d.equals(__DEC_l_negative_630980)) {
					if (!a.equals(__DEC_l_negative_630980)) {
						return new Object[] { l, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_6BB(Assignment l,
			While b) {
		for (While __DEC_l_last_434083 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_434083)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_7B(Assignment l) {
		for (Program __DEC_l_first_127899 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_8BB(Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_479831 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_479831)) {
					if (!d.equals(__DEC_a_negative_479831)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_9BB(Decision a, While b) {
		for (While __DEC_a_first_498137 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_498137)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_10BB(Decision a,
			While b) {
		for (While __DEC_a_last_572980 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_572980)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_11B(Decision a) {
		for (Program __DEC_a_first_583734 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_12BB(Decision d,
			While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(Decision a,
			While b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_15BB(Decision a,
			Assignment l) {
		if (l.equals(a.getPositive())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_16BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(Decision a,
			Assignment l) {
		if (l.equals(a.getNegative())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(Decision d,
			Decision a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(While b,
			Decision a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(While b,
			Decision a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
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
						if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_1B(b) == null) {
							if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_2B(b) == null) {
								if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_3B(b) == null) {
									if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_6BB(l,
											b) == null) {
										if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_7B(
												l) == null) {
											for (Decision d : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(b, Decision.class, "negative")) {
												Statement tmpA = d.getPositive();
												if (tmpA instanceof Decision) {
													Decision a = (Decision) tmpA;
													if (!a.equals(d)) {
														if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_12BB(
																d, b) == null) {
															if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(
																	d, l) == null) {
																if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_16BB(
																		d, l) == null) {
																	if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_0BBB(
																			b, d, a) == null) {
																		if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_4BBB(
																				l, d, a) == null) {
																			if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_5BBB(
																					l, d, a) == null) {
																				if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_8BB(
																						a, d) == null) {
																					if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_9BB(
																							a, b) == null) {
																						if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_10BB(
																								a, b) == null) {
																							if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_11B(
																									a) == null) {
																								if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(
																										a, b) == null) {
																									if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_15BB(
																											a,
																											l) == null) {
																										if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(
																												a,
																												l) == null) {
																											if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(
																													d,
																													a) == null) {
																												if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(
																														b,
																														a) == null) {
																													if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(
																															b,
																															a) == null) {
																														_result.add(
																																new Object[] {
																																		d,
																																		b,
																																		l,
																																		a,
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
			decdul2branchbub _this, Match match, Decision d, While b, Assignment l, Decision a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, d, b, l, a);
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
		EObject _localVariable_0 = sourceMatch.getObject("d");
		EObject _localVariable_1 = targetMatch.getObject("x");
		EObject _localVariable_2 = sourceMatch.getObject("b");
		EObject _localVariable_3 = targetMatch.getObject("c");
		EObject _localVariable_4 = sourceMatch.getObject("l");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject _localVariable_6 = targetMatch.getObject("z");
		EObject _localVariable_7 = sourceMatch.getObject("a");
		EObject tmpD = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpL = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpZ = _localVariable_6;
		EObject tmpA = _localVariable_7;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpB instanceof While) {
					While b = (While) tmpB;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpL instanceof Assignment) {
							Assignment l = (Assignment) tmpL;
							if (tmpY instanceof Branch) {
								Branch y = (Branch) tmpY;
								if (tmpZ instanceof Command) {
									Command z = (Command) tmpZ;
									if (tmpA instanceof Decision) {
										Decision a = (Decision) tmpA;
										return new Object[] { d, x, b, c, l, y, z, a, sourceMatch, targetMatch };
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

	public static final Object[] pattern_decdul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Decision d, Branch x,
			While b, Branch c, Assignment l, Branch y, Command z, Decision a, Match sourceMatch, Match targetMatch) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!a.equals(d)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { d, x, b, c, l, y, z, a, sourceMatch, targetMatch };
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
			Decision d = (Decision) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[0];
			Branch x = (Branch) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[1];
			While b = (While) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[2];
			Branch c = (Branch) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[3];
			Assignment l = (Assignment) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[4];
			Branch y = (Branch) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[5];
			Command z = (Command) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[6];
			Decision a = (Decision) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_black = pattern_decdul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					d, x, b, c, l, y, z, a, sourceMatch, targetMatch);
			if (result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { d, x, b, c, l, y, z, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBB(decdul2branchbub _this,
			Decision d, Branch x, While b, Branch c, Assignment l, Branch y, Command z, Decision a, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(d, x, b, c, l, y, z, a, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, d, x, b, c, l, y, z, a, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			decdul2branchbub _this, Decision d, Branch x, While b, Branch c, Assignment l, Branch y, Command z,
			Decision a, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decdul2branchbub_24_3_solvecsp_binding = pattern_decdul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, d, x, b, c, l, y, z, a, sourceMatch, targetMatch);
		if (result_pattern_decdul2branchbub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_24_3_solvecsp_binding[0];

			Object[] result_pattern_decdul2branchbub_24_3_solvecsp_black = pattern_decdul2branchbub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decdul2branchbub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, d, x, b, c, l, y, z, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decdul2branchbub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_24_5_matchcorrcontext_blackBBFBB(Decision d,
			Branch c, Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_decdul2branchbub_24_6_createcorrespondence_blackBBBBBBBBB(Decision d, Branch x,
			While b, Branch c, Assignment l, Branch y, Command z, Decision a, CCMatch ccMatch) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (!a.equals(d)) {
						return new Object[] { d, x, b, c, l, y, z, a, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_24_6_createcorrespondence_greenBBFBFBFBBB(Branch x, While b,
			Assignment l, Branch y, Command z, Decision a, CCMatch ccMatch) {
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		return new Object[] { x, b, b2y, l, a2x, y, l2z, z, a, ccMatch };
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

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_0BBB(While b, Decision d,
			Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_b_positive_951989 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!d.equals(__DEC_b_positive_951989)) {
					if (!a.equals(__DEC_b_positive_951989)) {
						return new Object[] { b, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_1B(While b) {
		for (While __DEC_b_first_414647 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_414647)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_2B(While b) {
		for (While __DEC_b_last_786638 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_786638)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_3B(While b) {
		for (Program __DEC_b_first_900327 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_4BBB(Assignment l, Decision d,
			Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_positive_316800 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "positive")) {
				if (!d.equals(__DEC_l_positive_316800)) {
					if (!a.equals(__DEC_l_positive_316800)) {
						return new Object[] { l, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_5BBB(Assignment l, Decision d,
			Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_negative_789984 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "negative")) {
				if (!d.equals(__DEC_l_negative_789984)) {
					if (!a.equals(__DEC_l_negative_789984)) {
						return new Object[] { l, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_6BB(Assignment l, While b) {
		for (While __DEC_l_last_342103 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_342103)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_7B(Assignment l) {
		for (Program __DEC_l_first_196926 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_8BB(Decision a, Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_154587 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_154587)) {
					if (!d.equals(__DEC_a_negative_154587)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_9BB(Decision a, While b) {
		for (While __DEC_a_first_457119 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_457119)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_10BB(Decision a, While b) {
		for (While __DEC_a_last_869619 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_869619)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_11B(Decision a) {
		for (Program __DEC_a_first_590084 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_12BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_13BB(Decision a, While b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_14BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_15BB(Decision a,
			Assignment l) {
		if (l.equals(a.getPositive())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_16BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_17BB(Decision a,
			Assignment l) {
		if (l.equals(a.getNegative())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_18BB(Decision d, Decision a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_19BB(While b, Decision a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_20BB(While b, Decision a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_blackBBBB(Decision d, While b,
			Assignment l, Decision a) {
		if (!a.equals(d)) {
			if (l.equals(b.getFirst())) {
				if (a.equals(d.getPositive())) {
					if (l.equals(b.getLast())) {
						if (b.equals(d.getNegative())) {
							if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_0BBB(b, d, a) == null) {
								if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_1B(b) == null) {
									if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_2B(b) == null) {
										if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_3B(b) == null) {
											if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_4BBB(l, d,
													a) == null) {
												if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_5BBB(l, d,
														a) == null) {
													if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_6BB(l,
															b) == null) {
														if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_7B(
																l) == null) {
															if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_8BB(
																	a, d) == null) {
																if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_9BB(
																		a, b) == null) {
																	if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_10BB(
																			a, b) == null) {
																		if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_11B(
																				a) == null) {
																			if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_12BB(
																					d, b) == null) {
																				if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_13BB(
																						a, b) == null) {
																					if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_14BB(
																							d, l) == null) {
																						if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_15BB(
																								a, l) == null) {
																							if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_16BB(
																									d, l) == null) {
																								if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_17BB(
																										a, l) == null) {
																									if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_18BB(
																											d,
																											a) == null) {
																										if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_19BB(
																												b,
																												a) == null) {
																											if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_20BB(
																													b,
																													a) == null) {
																												return new Object[] {
																														d,
																														b,
																														l,
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
		for (Graph __DEC_x_root_397170 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_1BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_912029 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_912029)) {
							if (!c.equals(__DEC_x_positive_912029)) {
								if (!y.equals(__DEC_x_positive_912029)) {
									return new Object[] { x, c, y };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_2BBB(Branch x, Branch c,
			Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_451483 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_451483)) {
							if (!c.equals(__DEC_x_negative_451483)) {
								if (!y.equals(__DEC_x_negative_451483)) {
									return new Object[] { x, c, y };
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
		for (Graph __DEC_y_root_60166 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
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
					for (Branch __DEC_y_positive_225019 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_225019)) {
							if (!x.equals(__DEC_y_positive_225019)) {
								if (!c.equals(__DEC_y_positive_225019)) {
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
					for (Branch __DEC_y_negative_902238 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_902238)) {
							if (!x.equals(__DEC_y_negative_902238)) {
								if (!c.equals(__DEC_y_negative_902238)) {
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
		for (Graph __DEC_z_root_490619 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_7BBBB(Command z, Branch x,
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_positive_749406 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!x.equals(__DEC_z_positive_749406)) {
							if (!c.equals(__DEC_z_positive_749406)) {
								if (!y.equals(__DEC_z_positive_749406)) {
									return new Object[] { z, x, c, y };
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
			Branch c, Branch y) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_z_negative_991972 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!x.equals(__DEC_z_negative_991972)) {
							if (!c.equals(__DEC_z_negative_991972)) {
								if (!y.equals(__DEC_z_negative_991972)) {
									return new Object[] { z, x, c, y };
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

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_10BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_11BB(Branch x, Branch y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_12BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_13BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_14BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_15BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_16BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_28_1_matchtggpattern_blackBBBB(Branch x, Branch c, Branch y,
			Command z) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					if (x.equals(c.getPositive())) {
						if (y.equals(c.getNegative())) {
							if (z.equals(y.getPositive())) {
								if (y.equals(z.getNext())) {
									if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_0B(x) == null) {
										if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_1BBB(x, c,
												y) == null) {
											if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_2BBB(x, c,
													y) == null) {
												if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_3B(
														y) == null) {
													if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_4BBB(y,
															x, c) == null) {
														if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_5BBB(
																y, x, c) == null) {
															if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_6B(
																	z) == null) {
																if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_7BBBB(
																		z, x, c, y) == null) {
																	if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_8BBBB(
																			z, x, c, y) == null) {
																		if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_9BB(
																				x, y) == null) {
																			if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_10BB(
																					c, y) == null) {
																				if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_11BB(
																						x, y) == null) {
																					if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_12BB(
																							x, z) == null) {
																						if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_13BB(
																								c, z) == null) {
																							if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_14BB(
																									x, z) == null) {
																								if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_15BB(
																										c, z) == null) {
																									if (pattern_decdul2branchbub_28_1_matchtggpattern_black_nac_16BB(
																											y,
																											z) == null) {
																										return new Object[] {
																												x, c, y,
																												z };
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
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
							if (pattern_decdul2branchbub_29_2_isapplicablecore_black_nac_1BB(ruleResult, d2c) == null) {
								if (pattern_decdul2branchbub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										d) == null) {
									if (pattern_decdul2branchbub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_decdul2branchbub_29_3_solveCSP_bindingFBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d, c, d2c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decdul2branchbub_29_3_solveCSP_binding = pattern_decdul2branchbub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d, c, d2c, ruleResult);
		if (result_pattern_decdul2branchbub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_29_3_solveCSP_binding[0];

			Object[] result_pattern_decdul2branchbub_29_3_solveCSP_black = pattern_decdul2branchbub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decdul2branchbub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decdul2branchbub_29_4_checkCSP_expressionFBB(decdul2branchbub _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_29_5_checknacs_blackBBB(Decision d, Branch c, S2B d2c) {
		return new Object[] { d, c, d2c };
	}

	public static final Object[] pattern_decdul2branchbub_29_6_perform_blackBBBB(Decision d, Branch c, S2B d2c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d, c, d2c, ruleResult };
	}

	public static final Object[] pattern_decdul2branchbub_29_6_perform_greenBFFFBFFFFFFB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		b.setFirst(l);
		b.setLast(l);
		ruleResult.getSourceObjects().add(l);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		c.setNegative(y);
		b2y.setTarget(y);
		ruleResult.getTargetObjects().add(y);
		l2z.setSource(l);
		ruleResult.getCorrObjects().add(l2z);
		y.setPositive(z);
		z.setNext(y);
		l2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		d.setPositive(a);
		a2x.setSource(a);
		ruleResult.getSourceObjects().add(a);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { d, x, b, b2y, c, l, a2x, y, l2z, z, a, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decdul2branchbub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decdul2branchbubImpl
