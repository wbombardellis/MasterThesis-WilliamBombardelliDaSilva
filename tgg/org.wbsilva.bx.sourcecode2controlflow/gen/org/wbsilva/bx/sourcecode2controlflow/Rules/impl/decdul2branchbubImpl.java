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
	public boolean isAppropriate_FWD(Match match, Decision a, While b, Decision d, Assignment l) {

		Object[] result1_black = decdul2branchbubImpl.pattern_decdul2branchbub_0_1_initialbindings_blackBBBBBB(this,
				match, a, b, d, l);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ", "
					+ "[l] = " + l + ".");
		}

		Object[] result2_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, a, b, d, l);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ", "
					+ "[l] = " + l + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdul2branchbubImpl.pattern_decdul2branchbub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decdul2branchbubImpl
					.pattern_decdul2branchbub_0_4_collectelementstobetranslated_blackBBBBB(match, a, b, d, l);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[l] = " + l + ".");
			}
			decdul2branchbubImpl.pattern_decdul2branchbub_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, a, b,
					d, l);
			//nothing EMoflonEdge b__l____last = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge b__l____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[8];

			Object[] result5_black = decdul2branchbubImpl
					.pattern_decdul2branchbub_0_5_collectcontextelements_blackBBBBB(match, a, b, d, l);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[l] = " + l + ".");
			}
			decdul2branchbubImpl.pattern_decdul2branchbub_0_5_collectcontextelements_greenBB(match, d);

			// 
			decdul2branchbubImpl.pattern_decdul2branchbub_0_6_registerobjectstomatch_expressionBBBBBB(this, match, a, b,
					d, l);
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
		Decision a = (Decision) result1_bindingAndBlack[0];
		While b = (While) result1_bindingAndBlack[1];
		Decision d = (Decision) result1_bindingAndBlack[2];
		Branch c = (Branch) result1_bindingAndBlack[3];
		S2B d2c = (S2B) result1_bindingAndBlack[4];
		Assignment l = (Assignment) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decdul2branchbubImpl
				.pattern_decdul2branchbub_1_1_performtransformation_greenFBBFFFBFBF(a, b, c, l);
		S2B b2y = (S2B) result1_green[0];
		Branch x = (Branch) result1_green[3];
		S2N l2z = (S2N) result1_green[4];
		S2B a2x = (S2B) result1_green[5];
		Branch y = (Branch) result1_green[7];
		Command z = (Command) result1_green[9];

		Object[] result2_black = decdul2branchbubImpl
				.pattern_decdul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBB(b2y, a, b, x, l2z, a2x, y, l, z);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b2y] = " + b2y + ", " + "[a] = "
					+ a + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[l2z] = " + l2z + ", " + "[a2x] = " + a2x
					+ ", " + "[y] = " + y + ", " + "[l] = " + l + ", " + "[z] = " + z + ".");
		}
		Object[] result2_green = decdul2branchbubImpl
				.pattern_decdul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBB(b2y, a, b, x, l2z, a2x, y, l,
						z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdul2branchbubImpl
				.pattern_decdul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, b2y, a, b, d, x, l2z,
						a2x, c, d2c, y, l, z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2y] = " + b2y + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ", "
					+ "[x] = " + x + ", " + "[l2z] = " + l2z + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c + ", "
					+ "[d2c] = " + d2c + ", " + "[y] = " + y + ", " + "[l] = " + l + ", " + "[z] = " + z + ".");
		}
		decdul2branchbubImpl.pattern_decdul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, b2y, a, b, d, x, l2z, a2x, c, y, l, z);
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b__l____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[25];

		// 
		// 
		decdul2branchbubImpl.pattern_decdul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				b2y, a, b, d, x, l2z, a2x, c, d2c, y, l, z);
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
		Decision a = (Decision) result2_binding[0];
		While b = (While) result2_binding[1];
		Decision d = (Decision) result2_binding[2];
		Assignment l = (Assignment) result2_binding[3];
		for (Object[] result2_black : decdul2branchbubImpl.pattern_decdul2branchbub_2_2_corematch_blackBBBFFBB(a, b, d,
				l, match)) {
			Branch c = (Branch) result2_black[3];
			S2B d2c = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decdul2branchbubImpl.pattern_decdul2branchbub_2_3_findcontext_blackBBBBBB(a,
					b, d, c, d2c, l)) {
				Object[] result3_green = decdul2branchbubImpl
						.pattern_decdul2branchbub_2_3_findcontext_greenBBBBBBFFFFFFF(a, b, d, c, d2c, l);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge b__l____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = decdul2branchbubImpl
						.pattern_decdul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, a, b,
								d, c, d2c, l);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[b] = " + b
							+ ", " + "[d] = " + d + ", " + "[c] = " + c + ", " + "[d2c] = " + d2c + ", " + "[l] = " + l
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
	public void registerObjectsToMatch_FWD(Match match, Decision a, While b, Decision d, Assignment l) {
		match.registerObject("a", a);
		match.registerObject("b", b);
		match.registerObject("d", d);
		match.registerObject("l", l);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision a, While b, Decision d, Assignment l) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Decision a, While b, Decision d, Branch c,
			S2B d2c, Assignment l) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("l", l);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject b2y, EObject a, EObject b, EObject d,
			EObject x, EObject l2z, EObject a2x, EObject c, EObject d2c, EObject y, EObject l, EObject z) {
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass())
						.equals("sourcecode.Assignment.");
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
				.pattern_decdul2branchbub_11_1_performtransformation_greenFFFBBFFBFB(d, x, y, z);
		S2B b2y = (S2B) result1_green[0];
		Decision a = (Decision) result1_green[1];
		While b = (While) result1_green[2];
		S2N l2z = (S2N) result1_green[5];
		S2B a2x = (S2B) result1_green[6];
		Assignment l = (Assignment) result1_green[8];

		Object[] result2_black = decdul2branchbubImpl
				.pattern_decdul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBB(b2y, a, b, x, l2z, a2x, y, l,
						z);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b2y] = " + b2y + ", " + "[a] = "
					+ a + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[l2z] = " + l2z + ", " + "[a2x] = " + a2x
					+ ", " + "[y] = " + y + ", " + "[l] = " + l + ", " + "[z] = " + z + ".");
		}
		Object[] result2_green = decdul2branchbubImpl
				.pattern_decdul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBB(b2y, a, b, x, l2z, a2x, y, l,
						z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdul2branchbubImpl
				.pattern_decdul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, b2y, a, b, d, x, l2z,
						a2x, c, d2c, y, l, z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2y] = " + b2y + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ", "
					+ "[x] = " + x + ", " + "[l2z] = " + l2z + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c + ", "
					+ "[d2c] = " + d2c + ", " + "[y] = " + y + ", " + "[l] = " + l + ", " + "[z] = " + z + ".");
		}
		decdul2branchbubImpl.pattern_decdul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, b2y, a, b, d, x, l2z, a2x, c, y, l, z);
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b__l____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[25];

		// 
		// 
		decdul2branchbubImpl.pattern_decdul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				b2y, a, b, d, x, l2z, a2x, c, d2c, y, l, z);
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
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[12];

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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject b2y, EObject a, EObject b, EObject d,
			EObject x, EObject l2z, EObject a2x, EObject c, EObject d2c, EObject y, EObject l, EObject z) {
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("z", z);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_91(EMoflonEdge _edge_positive) {

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_97(EMoflonEdge _edge_last) {

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
				.pattern_decdul2branchbub_21_2_testcorematchandDECs_blackFFFFB(_edge_last)) {
			Decision a = (Decision) result2_black[0];
			While b = (While) result2_black[1];
			Decision d = (Decision) result2_black[2];
			Assignment l = (Assignment) result2_black[3];
			Object[] result2_green = decdul2branchbubImpl
					.pattern_decdul2branchbub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdul2branchbubImpl
					.pattern_decdul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, a, b, d, l)) {
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
		Decision a = (Decision) result2_bindingAndBlack[0];
		While b = (While) result2_bindingAndBlack[1];
		Decision d = (Decision) result2_bindingAndBlack[2];
		Branch x = (Branch) result2_bindingAndBlack[3];
		Branch c = (Branch) result2_bindingAndBlack[4];
		Branch y = (Branch) result2_bindingAndBlack[5];
		Assignment l = (Assignment) result2_bindingAndBlack[6];
		Command z = (Command) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decdul2branchbubImpl
				.pattern_decdul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, a, b, d, x, c, y, l, z,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[c] = "
					+ c + ", " + "[y] = " + y + ", " + "[l] = " + l + ", " + "[z] = " + z + ", " + "[sourceMatch] = "
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
						.pattern_decdul2branchbub_24_6_createcorrespondence_blackBBBBBBBBB(a, b, d, x, c, y, l, z,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", "
							+ "[b] = " + b + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[c] = " + c + ", "
							+ "[y] = " + y + ", " + "[l] = " + l + ", " + "[z] = " + z + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decdul2branchbubImpl.pattern_decdul2branchbub_24_6_createcorrespondence_greenFBBBFFBBBB(a, b, x, y, l,
						z, ccMatch);
				//nothing S2B b2y = (S2B) result6_green[0];
				//nothing S2N l2z = (S2N) result6_green[4];
				//nothing S2B a2x = (S2B) result6_green[5];

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
	public CSP isApplicable_solveCsp_CC(Decision a, While b, Decision d, Branch x, Branch c, Branch y, Assignment l,
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
	public boolean checkDEC_FWD(Decision a, While b, Decision d, Assignment l) {// 
		Object[] result1_black = decdul2branchbubImpl.pattern_decdul2branchbub_27_1_matchtggpattern_blackBBBB(a, b, d,
				l);
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
					decdul2branchbubImpl.pattern_decdul2branchbub_29_6_perform_greenFFFBFFFBFFFB(d, c, ruleResult);
					//nothing S2B b2y = (S2B) result6_green[0];
					//nothing Decision a = (Decision) result6_green[1];
					//nothing While b = (While) result6_green[2];
					//nothing Branch x = (Branch) result6_green[4];
					//nothing S2N l2z = (S2N) result6_green[5];
					//nothing S2B a2x = (S2B) result6_green[6];
					//nothing Branch y = (Branch) result6_green[8];
					//nothing Assignment l = (Assignment) result6_green[9];
					//nothing Command z = (Command) result6_green[10];

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
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_FWD__MATCH_DECISION_WHILE_DECISION_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.DECDUL2BRANCHBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_WHILE_DECISION_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3), (Assignment) arguments.get(4));
			return null;
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_WHILE_DECISION_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DECISION_WHILE_DECISION_BRANCH_S2B_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3), (Branch) arguments.get(4),
					(S2B) arguments.get(5), (Assignment) arguments.get(6));
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
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_91__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_91((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_97__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_97((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_CC__DECISION_WHILE_DECISION_BRANCH_BRANCH_BRANCH_ASSIGNMENT_COMMAND_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Decision) arguments.get(0), (While) arguments.get(1),
					(Decision) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5), (Assignment) arguments.get(6), (Command) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECDUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECDUL2BRANCHBUB___CHECK_DEC_FWD__DECISION_WHILE_DECISION_ASSIGNMENT:
			return checkDEC_FWD((Decision) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2),
					(Assignment) arguments.get(3));
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
			Match match, Decision a, While b, Decision d, Assignment l) {
		if (!a.equals(d)) {
			return new Object[] { _this, match, a, b, d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_0_2_SolveCSP_bindingFBBBBBB(decdul2branchbub _this,
			Match match, Decision a, While b, Decision d, Assignment l) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, b, d, l);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, b, d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBB(decdul2branchbub _this,
			Match match, Decision a, While b, Decision d, Assignment l) {
		Object[] result_pattern_decdul2branchbub_0_2_SolveCSP_binding = pattern_decdul2branchbub_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, a, b, d, l);
		if (result_pattern_decdul2branchbub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decdul2branchbub_0_2_SolveCSP_black = pattern_decdul2branchbub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdul2branchbub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, b, d, l };
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
			Decision a, While b, Decision d, Assignment l) {
		if (!a.equals(d)) {
			return new Object[] { match, a, b, d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_0_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Decision a, While b, Decision d, Assignment l) {
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(l);
		String b__l____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		String b__l____first_name_prime = "first";
		String d__b____negative_name_prime = "negative";
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(b__l____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		match.getToBeTranslatedEdges().add(b__l____first);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		b__l____last.setName(b__l____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__l____first.setName(b__l____first_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { match, a, b, d, l, b__l____last, d__a____positive, b__l____first, d__b____negative };
	}

	public static final Object[] pattern_decdul2branchbub_0_5_collectcontextelements_blackBBBBB(Match match, Decision a,
			While b, Decision d, Assignment l) {
		if (!a.equals(d)) {
			return new Object[] { match, a, b, d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decdul2branchbub_0_6_registerobjectstomatch_expressionBBBBBB(
			decdul2branchbub _this, Match match, Decision a, While b, Decision d, Assignment l) {
		_this.registerObjectsToMatch_FWD(match, a, b, d, l);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("a");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("d");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("l");
		EObject tmpA = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpD2c = _localVariable_4;
		EObject tmpL = _localVariable_5;
		if (tmpA instanceof Decision) {
			Decision a = (Decision) tmpA;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpD2c instanceof S2B) {
							S2B d2c = (S2B) tmpD2c;
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								return new Object[] { a, b, d, c, d2c, l, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_1_1_performtransformation_blackBBBBBBFBB(Decision a, While b,
			Decision d, Branch c, S2B d2c, Assignment l, decdul2branchbub _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(d)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { a, b, d, c, d2c, l, csp, _this, isApplicableMatch };
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
			Decision a = (Decision) result_pattern_decdul2branchbub_1_1_performtransformation_binding[0];
			While b = (While) result_pattern_decdul2branchbub_1_1_performtransformation_binding[1];
			Decision d = (Decision) result_pattern_decdul2branchbub_1_1_performtransformation_binding[2];
			Branch c = (Branch) result_pattern_decdul2branchbub_1_1_performtransformation_binding[3];
			S2B d2c = (S2B) result_pattern_decdul2branchbub_1_1_performtransformation_binding[4];
			Assignment l = (Assignment) result_pattern_decdul2branchbub_1_1_performtransformation_binding[5];

			Object[] result_pattern_decdul2branchbub_1_1_performtransformation_black = pattern_decdul2branchbub_1_1_performtransformation_blackBBBBBBFBB(
					a, b, d, c, d2c, l, _this, isApplicableMatch);
			if (result_pattern_decdul2branchbub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdul2branchbub_1_1_performtransformation_black[6];

				return new Object[] { a, b, d, c, d2c, l, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_1_1_performtransformation_greenFBBFFFBFBF(Decision a, While b,
			Branch c, Assignment l) {
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		b2y.setSource(b);
		c.setPositive(x);
		l2z.setSource(l);
		a2x.setSource(a);
		a2x.setTarget(x);
		c.setNegative(y);
		b2y.setTarget(y);
		y.setPositive(z);
		l2z.setTarget(z);
		z.setNext(y);
		return new Object[] { b2y, a, b, x, l2z, a2x, c, y, l, z };
	}

	public static final Object[] pattern_decdul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBB(S2B b2y,
			Decision a, While b, Branch x, S2N l2z, S2B a2x, Branch y, Assignment l, Command z) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				return new Object[] { b2y, a, b, x, l2z, a2x, y, l, z };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBB(S2B b2y,
			Decision a, While b, Branch x, S2N l2z, S2B a2x, Branch y, Assignment l, Command z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedElements().add(z);
		return new Object[] { ruleresult, b2y, a, b, x, l2z, a2x, y, l, z };
	}

	public static final Object[] pattern_decdul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2y, EObject a, EObject b, EObject d, EObject x, EObject l2z,
			EObject a2x, EObject c, EObject d2c, EObject y, EObject l, EObject z) {
		if (!b2y.equals(d)) {
			if (!b2y.equals(x)) {
				if (!b2y.equals(l2z)) {
					if (!b2y.equals(c)) {
						if (!b2y.equals(d2c)) {
							if (!b2y.equals(y)) {
								if (!b2y.equals(l)) {
									if (!b2y.equals(z)) {
										if (!a.equals(b2y)) {
											if (!a.equals(b)) {
												if (!a.equals(d)) {
													if (!a.equals(x)) {
														if (!a.equals(l2z)) {
															if (!a.equals(a2x)) {
																if (!a.equals(c)) {
																	if (!a.equals(d2c)) {
																		if (!a.equals(y)) {
																			if (!a.equals(l)) {
																				if (!a.equals(z)) {
																					if (!b.equals(b2y)) {
																						if (!b.equals(d)) {
																							if (!b.equals(x)) {
																								if (!b.equals(l2z)) {
																									if (!b.equals(c)) {
																										if (!b.equals(
																												d2c)) {
																											if (!b.equals(
																													y)) {
																												if (!b.equals(
																														l)) {
																													if (!b.equals(
																															z)) {
																														if (!d.equals(
																																x)) {
																															if (!d.equals(
																																	l2z)) {
																																if (!d.equals(
																																		d2c)) {
																																	if (!d.equals(
																																			y)) {
																																		if (!d.equals(
																																				l)) {
																																			if (!d.equals(
																																					z)) {
																																				if (!x.equals(
																																						y)) {
																																					if (!x.equals(
																																							z)) {
																																						if (!l2z.equals(
																																								x)) {
																																							if (!l2z.equals(
																																									y)) {
																																								if (!l2z.equals(
																																										z)) {
																																									if (!a2x.equals(
																																											b2y)) {
																																										if (!a2x.equals(
																																												b)) {
																																											if (!a2x.equals(
																																													d)) {
																																												if (!a2x.equals(
																																														x)) {
																																													if (!a2x.equals(
																																															l2z)) {
																																														if (!a2x.equals(
																																																c)) {
																																															if (!a2x.equals(
																																																	d2c)) {
																																																if (!a2x.equals(
																																																		y)) {
																																																	if (!a2x.equals(
																																																			l)) {
																																																		if (!a2x.equals(
																																																				z)) {
																																																			if (!c.equals(
																																																					d)) {
																																																				if (!c.equals(
																																																						x)) {
																																																					if (!c.equals(
																																																							l2z)) {
																																																						if (!c.equals(
																																																								d2c)) {
																																																							if (!c.equals(
																																																									y)) {
																																																								if (!c.equals(
																																																										l)) {
																																																									if (!c.equals(
																																																											z)) {
																																																										if (!d2c.equals(
																																																												x)) {
																																																											if (!d2c.equals(
																																																													l2z)) {
																																																												if (!d2c.equals(
																																																														y)) {
																																																													if (!d2c.equals(
																																																															l)) {
																																																														if (!d2c.equals(
																																																																z)) {
																																																															if (!y.equals(
																																																																	z)) {
																																																																if (!l.equals(
																																																																		x)) {
																																																																	if (!l.equals(
																																																																			l2z)) {
																																																																		if (!l.equals(
																																																																				y)) {
																																																																			if (!l.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						b2y,
																																																																						a,
																																																																						b,
																																																																						d,
																																																																						x,
																																																																						l2z,
																																																																						a2x,
																																																																						c,
																																																																						d2c,
																																																																						y,
																																																																						l,
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
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject b2y, EObject a, EObject b, EObject d, EObject x, EObject l2z,
			EObject a2x, EObject c, EObject y, EObject l, EObject z) {
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdul2branchbub";
		String b__l____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		String b__l____first_name_prime = "first";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String y__z____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String z__y____next_name_prime = "next";
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(b__l____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		ruleresult.getTranslatedEdges().add(b__l____first);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		ruleresult.getCreatedEdges().add(y__z____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(z__y____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b__l____last.setName(b__l____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__l____first.setName(b__l____first_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		return new Object[] { ruleresult, b2y, a, b, d, x, l2z, a2x, c, y, l, z, b__l____last, d__a____positive,
				b__l____first, a2x__a____source, b2y__b____source, d__b____negative, c__x____positive, c__y____negative,
				y__z____positive, b2y__y____target, a2x__x____target, l2z__l____source, l2z__z____target,
				z__y____next };
	}

	public static final void pattern_decdul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decdul2branchbub _this, PerformRuleResult ruleresult, EObject b2y, EObject a, EObject b, EObject d,
			EObject x, EObject l2z, EObject a2x, EObject c, EObject d2c, EObject y, EObject l, EObject z) {
		_this.registerObjects_FWD(ruleresult, b2y, a, b, d, x, l2z, a2x, c, d2c, y, l, z);

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
		EObject _localVariable_0 = match.getObject("a");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("d");
		EObject _localVariable_3 = match.getObject("l");
		EObject tmpA = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpL = _localVariable_3;
		if (tmpA instanceof Decision) {
			Decision a = (Decision) tmpA;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						return new Object[] { a, b, d, l, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_2_2_corematch_blackBBBFFBB(Decision a, While b,
			Decision d, Assignment l, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { a, b, d, c, d2c, l, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_2_3_findcontext_blackBBBBBB(Decision a, While b,
			Decision d, Branch c, S2B d2c, Assignment l) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			if (l.equals(b.getLast())) {
				if (a.equals(d.getPositive())) {
					if (l.equals(b.getFirst())) {
						if (b.equals(d.getNegative())) {
							if (c.equals(d2c.getTarget())) {
								if (d.equals(d2c.getSource())) {
									_result.add(new Object[] { a, b, d, c, d2c, l });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdul2branchbub_2_3_findcontext_greenBBBBBBFFFFFFF(Decision a, While b,
			Decision d, Branch c, S2B d2c, Assignment l) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String b__l____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		String b__l____first_name_prime = "first";
		String d__b____negative_name_prime = "negative";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(l);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(b__l____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		isApplicableMatch.getAllContextElements().add(b__l____first);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		b__l____last.setName(b__l____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__l____first.setName(b__l____first_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { a, b, d, c, d2c, l, isApplicableMatch, b__l____last, d__a____positive, b__l____first,
				d__b____negative, d2c__c____target, d2c__d____source };
	}

	public static final Object[] pattern_decdul2branchbub_2_4_solveCSP_bindingFBBBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Decision a, While b, Decision d, Branch c, S2B d2c, Assignment l) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, a, b, d, c, d2c, l);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, b, d, c, d2c, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decdul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Decision a, While b, Decision d, Branch c, S2B d2c, Assignment l) {
		Object[] result_pattern_decdul2branchbub_2_4_solveCSP_binding = pattern_decdul2branchbub_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, a, b, d, c, d2c, l);
		if (result_pattern_decdul2branchbub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_2_4_solveCSP_binding[0];

			Object[] result_pattern_decdul2branchbub_2_4_solveCSP_black = pattern_decdul2branchbub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdul2branchbub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, b, d, c, d2c, l };
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

	public static final Object[] pattern_decdul2branchbub_11_1_performtransformation_greenFFFBBFFBFB(Decision d,
			Branch x, Branch y, Command z) {
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		b2y.setTarget(y);
		d.setPositive(a);
		b2y.setSource(b);
		d.setNegative(b);
		l2z.setTarget(z);
		a2x.setSource(a);
		a2x.setTarget(x);
		b.setLast(l);
		b.setFirst(l);
		l2z.setSource(l);
		return new Object[] { b2y, a, b, d, x, l2z, a2x, y, l, z };
	}

	public static final Object[] pattern_decdul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBB(S2B b2y,
			Decision a, While b, Branch x, S2N l2z, S2B a2x, Branch y, Assignment l, Command z) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				return new Object[] { b2y, a, b, x, l2z, a2x, y, l, z };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBB(S2B b2y,
			Decision a, While b, Branch x, S2N l2z, S2B a2x, Branch y, Assignment l, Command z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getTranslatedElements().add(z);
		return new Object[] { ruleresult, b2y, a, b, x, l2z, a2x, y, l, z };
	}

	public static final Object[] pattern_decdul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2y, EObject a, EObject b, EObject d, EObject x, EObject l2z,
			EObject a2x, EObject c, EObject d2c, EObject y, EObject l, EObject z) {
		if (!b2y.equals(d)) {
			if (!b2y.equals(x)) {
				if (!b2y.equals(l2z)) {
					if (!b2y.equals(c)) {
						if (!b2y.equals(d2c)) {
							if (!b2y.equals(y)) {
								if (!b2y.equals(l)) {
									if (!b2y.equals(z)) {
										if (!a.equals(b2y)) {
											if (!a.equals(b)) {
												if (!a.equals(d)) {
													if (!a.equals(x)) {
														if (!a.equals(l2z)) {
															if (!a.equals(a2x)) {
																if (!a.equals(c)) {
																	if (!a.equals(d2c)) {
																		if (!a.equals(y)) {
																			if (!a.equals(l)) {
																				if (!a.equals(z)) {
																					if (!b.equals(b2y)) {
																						if (!b.equals(d)) {
																							if (!b.equals(x)) {
																								if (!b.equals(l2z)) {
																									if (!b.equals(c)) {
																										if (!b.equals(
																												d2c)) {
																											if (!b.equals(
																													y)) {
																												if (!b.equals(
																														l)) {
																													if (!b.equals(
																															z)) {
																														if (!d.equals(
																																x)) {
																															if (!d.equals(
																																	l2z)) {
																																if (!d.equals(
																																		d2c)) {
																																	if (!d.equals(
																																			y)) {
																																		if (!d.equals(
																																				l)) {
																																			if (!d.equals(
																																					z)) {
																																				if (!x.equals(
																																						y)) {
																																					if (!x.equals(
																																							z)) {
																																						if (!l2z.equals(
																																								x)) {
																																							if (!l2z.equals(
																																									y)) {
																																								if (!l2z.equals(
																																										z)) {
																																									if (!a2x.equals(
																																											b2y)) {
																																										if (!a2x.equals(
																																												b)) {
																																											if (!a2x.equals(
																																													d)) {
																																												if (!a2x.equals(
																																														x)) {
																																													if (!a2x.equals(
																																															l2z)) {
																																														if (!a2x.equals(
																																																c)) {
																																															if (!a2x.equals(
																																																	d2c)) {
																																																if (!a2x.equals(
																																																		y)) {
																																																	if (!a2x.equals(
																																																			l)) {
																																																		if (!a2x.equals(
																																																				z)) {
																																																			if (!c.equals(
																																																					d)) {
																																																				if (!c.equals(
																																																						x)) {
																																																					if (!c.equals(
																																																							l2z)) {
																																																						if (!c.equals(
																																																								d2c)) {
																																																							if (!c.equals(
																																																									y)) {
																																																								if (!c.equals(
																																																										l)) {
																																																									if (!c.equals(
																																																											z)) {
																																																										if (!d2c.equals(
																																																												x)) {
																																																											if (!d2c.equals(
																																																													l2z)) {
																																																												if (!d2c.equals(
																																																														y)) {
																																																													if (!d2c.equals(
																																																															l)) {
																																																														if (!d2c.equals(
																																																																z)) {
																																																															if (!y.equals(
																																																																	z)) {
																																																																if (!l.equals(
																																																																		x)) {
																																																																	if (!l.equals(
																																																																			l2z)) {
																																																																		if (!l.equals(
																																																																				y)) {
																																																																			if (!l.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						b2y,
																																																																						a,
																																																																						b,
																																																																						d,
																																																																						x,
																																																																						l2z,
																																																																						a2x,
																																																																						c,
																																																																						d2c,
																																																																						y,
																																																																						l,
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
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject b2y, EObject a, EObject b, EObject d, EObject x, EObject l2z,
			EObject a2x, EObject c, EObject y, EObject l, EObject z) {
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdul2branchbub";
		String b__l____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		String b__l____first_name_prime = "first";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String y__z____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String l2z__l____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String z__y____next_name_prime = "next";
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(b__l____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		ruleresult.getCreatedEdges().add(b__l____first);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		ruleresult.getTranslatedEdges().add(y__z____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(z__y____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b__l____last.setName(b__l____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		b__l____first.setName(b__l____first_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		return new Object[] { ruleresult, b2y, a, b, d, x, l2z, a2x, c, y, l, z, b__l____last, d__a____positive,
				b__l____first, a2x__a____source, b2y__b____source, d__b____negative, c__x____positive, c__y____negative,
				y__z____positive, b2y__y____target, a2x__x____target, l2z__l____source, l2z__z____target,
				z__y____next };
	}

	public static final void pattern_decdul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decdul2branchbub _this, PerformRuleResult ruleresult, EObject b2y, EObject a, EObject b, EObject d,
			EObject x, EObject l2z, EObject a2x, EObject c, EObject d2c, EObject y, EObject l, EObject z) {
		_this.registerObjects_BWD(ruleresult, b2y, a, b, d, x, l2z, a2x, c, d2c, y, l, z);

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
								if (d.equals(d2c.getSource())) {
									if (z.equals(y.getPositive())) {
										if (y.equals(z.getNext())) {
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
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String d2c__c____target_name_prime = "target";
		String d2c__d____source_name_prime = "source";
		String y__z____positive_name_prime = "positive";
		String z__y____next_name_prime = "next";
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
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		isApplicableMatch.getAllContextElements().add(y__z____positive);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(z__y____next);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		return new Object[] { d, x, c, d2c, y, z, isApplicableMatch, c__x____positive, c__y____negative,
				d2c__c____target, d2c__d____source, y__z____positive, z__y____next };
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
		for (Graph __DEC_x_root_99378 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_816334 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_816334)) {
							if (!c.equals(__DEC_x_positive_816334)) {
								if (!y.equals(__DEC_x_positive_816334)) {
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
					for (Branch __DEC_x_negative_532331 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_532331)) {
							if (!c.equals(__DEC_x_negative_532331)) {
								if (!y.equals(__DEC_x_negative_532331)) {
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
		for (Graph __DEC_y_root_28441 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
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
					for (Branch __DEC_y_positive_445280 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_445280)) {
							if (!x.equals(__DEC_y_positive_445280)) {
								if (!c.equals(__DEC_y_positive_445280)) {
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
					for (Branch __DEC_y_negative_718902 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_718902)) {
							if (!x.equals(__DEC_y_negative_718902)) {
								if (!c.equals(__DEC_y_negative_718902)) {
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
		for (Graph __DEC_z_root_197730 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
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
					for (Branch __DEC_z_positive_490925 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!x.equals(__DEC_z_positive_490925)) {
							if (!c.equals(__DEC_z_positive_490925)) {
								if (!y.equals(__DEC_z_positive_490925)) {
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
					for (Branch __DEC_z_negative_381795 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!x.equals(__DEC_z_negative_381795)) {
							if (!c.equals(__DEC_z_negative_381795)) {
								if (!y.equals(__DEC_z_negative_381795)) {
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

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_0BB(Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_796972 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_796972)) {
					if (!d.equals(__DEC_a_negative_796972)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_1BB(Decision a, While b) {
		for (While __DEC_a_first_219023 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_219023)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_2BB(Decision a, While b) {
		for (While __DEC_a_last_492933 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_492933)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_3B(Decision a) {
		for (Program __DEC_a_first_880421 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_4BBB(While b, Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_b_positive_278821 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!a.equals(__DEC_b_positive_278821)) {
					if (!d.equals(__DEC_b_positive_278821)) {
						return new Object[] { b, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_5B(While b) {
		for (While __DEC_b_first_103646 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_103646)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_6B(While b) {
		for (While __DEC_b_last_882799 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_882799)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_7B(While b) {
		for (Program __DEC_b_first_759230 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_8BBB(Assignment l,
			Decision a, Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_positive_165491 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "positive")) {
				if (!a.equals(__DEC_l_positive_165491)) {
					if (!d.equals(__DEC_l_positive_165491)) {
						return new Object[] { l, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_9BBB(Assignment l,
			Decision a, Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_negative_109435 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "negative")) {
				if (!a.equals(__DEC_l_negative_109435)) {
					if (!d.equals(__DEC_l_negative_109435)) {
						return new Object[] { l, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_10BB(Assignment l,
			While b) {
		for (While __DEC_l_last_309507 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_309507)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_11B(Assignment l) {
		for (Program __DEC_l_first_466469 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_12BB(While b,
			Decision a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(While b,
			Decision a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(Decision a,
			While b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_15BB(Decision d,
			While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_16BB(Decision a,
			Assignment l) {
		if (l.equals(a.getPositive())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(Decision a,
			Assignment l) {
		if (l.equals(a.getNegative())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdul2branchbub_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpB = _edge_last.getSrc();
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			EObject tmpL = _edge_last.getTrg();
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (l.equals(b.getLast())) {
					if (l.equals(b.getFirst())) {
						if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_5B(b) == null) {
							if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_6B(b) == null) {
								if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_7B(b) == null) {
									if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_10BB(l,
											b) == null) {
										if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_11B(
												l) == null) {
											for (Decision d : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(b, Decision.class, "negative")) {
												Statement tmpA = d.getPositive();
												if (tmpA instanceof Decision) {
													Decision a = (Decision) tmpA;
													if (!a.equals(d)) {
														if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_15BB(
																d, b) == null) {
															if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(
																	d, l) == null) {
																if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(
																		d, l) == null) {
																	if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_0BB(
																			a, d) == null) {
																		if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_1BB(
																				a, b) == null) {
																			if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_2BB(
																					a, b) == null) {
																				if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_3B(
																						a) == null) {
																					if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_4BBB(
																							b, a, d) == null) {
																						if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_8BBB(
																								l, a, d) == null) {
																							if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_9BBB(
																									l, a, d) == null) {
																								if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_12BB(
																										b, a) == null) {
																									if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(
																											b,
																											a) == null) {
																										if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(
																												a,
																												b) == null) {
																											if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_16BB(
																													a,
																													l) == null) {
																												if (pattern_decdul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(
																														a,
																														l) == null) {
																													_result.add(
																															new Object[] {
																																	a,
																																	b,
																																	d,
																																	l,
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
			decdul2branchbub _this, Match match, Decision a, While b, Decision d, Assignment l) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, b, d, l);
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
		EObject _localVariable_0 = sourceMatch.getObject("a");
		EObject _localVariable_1 = sourceMatch.getObject("b");
		EObject _localVariable_2 = sourceMatch.getObject("d");
		EObject _localVariable_3 = targetMatch.getObject("x");
		EObject _localVariable_4 = targetMatch.getObject("c");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject _localVariable_6 = sourceMatch.getObject("l");
		EObject _localVariable_7 = targetMatch.getObject("z");
		EObject tmpA = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpL = _localVariable_6;
		EObject tmpZ = _localVariable_7;
		if (tmpA instanceof Decision) {
			Decision a = (Decision) tmpA;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							if (tmpY instanceof Branch) {
								Branch y = (Branch) tmpY;
								if (tmpL instanceof Assignment) {
									Assignment l = (Assignment) tmpL;
									if (tmpZ instanceof Command) {
										Command z = (Command) tmpZ;
										return new Object[] { a, b, d, x, c, y, l, z, sourceMatch, targetMatch };
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

	public static final Object[] pattern_decdul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Decision a, While b,
			Decision d, Branch x, Branch c, Branch y, Assignment l, Command z, Match sourceMatch, Match targetMatch) {
		if (!a.equals(d)) {
			if (!x.equals(y)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { a, b, d, x, c, y, l, z, sourceMatch, targetMatch };
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
			Decision a = (Decision) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[0];
			While b = (While) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[1];
			Decision d = (Decision) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[2];
			Branch x = (Branch) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[3];
			Branch c = (Branch) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[4];
			Branch y = (Branch) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[5];
			Assignment l = (Assignment) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[6];
			Command z = (Command) result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_black = pattern_decdul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					a, b, d, x, c, y, l, z, sourceMatch, targetMatch);
			if (result_pattern_decdul2branchbub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { a, b, d, x, c, y, l, z, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBB(decdul2branchbub _this,
			Decision a, While b, Decision d, Branch x, Branch c, Branch y, Assignment l, Command z, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(a, b, d, x, c, y, l, z, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, a, b, d, x, c, y, l, z, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			decdul2branchbub _this, Decision a, While b, Decision d, Branch x, Branch c, Branch y, Assignment l,
			Command z, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decdul2branchbub_24_3_solvecsp_binding = pattern_decdul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, a, b, d, x, c, y, l, z, sourceMatch, targetMatch);
		if (result_pattern_decdul2branchbub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decdul2branchbub_24_3_solvecsp_binding[0];

			Object[] result_pattern_decdul2branchbub_24_3_solvecsp_black = pattern_decdul2branchbub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decdul2branchbub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, a, b, d, x, c, y, l, z, sourceMatch, targetMatch };
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

	public static final Object[] pattern_decdul2branchbub_24_6_createcorrespondence_blackBBBBBBBBB(Decision a, While b,
			Decision d, Branch x, Branch c, Branch y, Assignment l, Command z, CCMatch ccMatch) {
		if (!a.equals(d)) {
			if (!x.equals(y)) {
				if (!c.equals(x)) {
					if (!c.equals(y)) {
						return new Object[] { a, b, d, x, c, y, l, z, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_24_6_createcorrespondence_greenFBBBFFBBBB(Decision a, While b,
			Branch x, Branch y, Assignment l, Command z, CCMatch ccMatch) {
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { b2y, a, b, x, l2z, a2x, y, l, z, ccMatch };
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

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_0BB(Decision a, Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_369559 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_369559)) {
					if (!d.equals(__DEC_a_negative_369559)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_1BB(Decision a, While b) {
		for (While __DEC_a_first_233731 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_233731)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_2BB(Decision a, While b) {
		for (While __DEC_a_last_347920 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_347920)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_3B(Decision a) {
		for (Program __DEC_a_first_94336 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_4BBB(While b, Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_b_positive_473745 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!a.equals(__DEC_b_positive_473745)) {
					if (!d.equals(__DEC_b_positive_473745)) {
						return new Object[] { b, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_5B(While b) {
		for (While __DEC_b_first_605583 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_605583)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_6B(While b) {
		for (While __DEC_b_last_365877 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_365877)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_7B(While b) {
		for (Program __DEC_b_first_873633 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_8BBB(Assignment l, Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_positive_731756 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "positive")) {
				if (!a.equals(__DEC_l_positive_731756)) {
					if (!d.equals(__DEC_l_positive_731756)) {
						return new Object[] { l, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_9BBB(Assignment l, Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_negative_586761 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "negative")) {
				if (!a.equals(__DEC_l_negative_586761)) {
					if (!d.equals(__DEC_l_negative_586761)) {
						return new Object[] { l, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_10BB(Assignment l, While b) {
		for (While __DEC_l_last_203573 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_203573)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_11B(Assignment l) {
		for (Program __DEC_l_first_4725 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_12BB(While b, Decision a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_13BB(While b, Decision a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_14BB(Decision a, While b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_15BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_16BB(Decision a,
			Assignment l) {
		if (l.equals(a.getPositive())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_17BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_18BB(Decision a,
			Assignment l) {
		if (l.equals(a.getNegative())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_19BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdul2branchbub_27_1_matchtggpattern_blackBBBB(Decision a, While b,
			Decision d, Assignment l) {
		if (!a.equals(d)) {
			if (l.equals(b.getLast())) {
				if (a.equals(d.getPositive())) {
					if (l.equals(b.getFirst())) {
						if (b.equals(d.getNegative())) {
							if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_0BB(a, d) == null) {
								if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_1BB(a, b) == null) {
									if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_2BB(a, b) == null) {
										if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_3B(a) == null) {
											if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_4BBB(b, a,
													d) == null) {
												if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_5B(
														b) == null) {
													if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_6B(
															b) == null) {
														if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_7B(
																b) == null) {
															if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_8BBB(
																	l, a, d) == null) {
																if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_9BBB(
																		l, a, d) == null) {
																	if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_10BB(
																			l, b) == null) {
																		if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_11B(
																				l) == null) {
																			if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_12BB(
																					b, a) == null) {
																				if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_13BB(
																						b, a) == null) {
																					if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_14BB(
																							a, b) == null) {
																						if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_15BB(
																								d, b) == null) {
																							if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_16BB(
																									a, l) == null) {
																								if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_17BB(
																										d, l) == null) {
																									if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_18BB(
																											a,
																											l) == null) {
																										if (pattern_decdul2branchbub_27_1_matchtggpattern_black_nac_19BB(
																												d,
																												l) == null) {
																											return new Object[] {
																													a,
																													b,
																													d,
																													l };
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
		for (Graph __DEC_x_root_886893 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_533832 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_533832)) {
							if (!c.equals(__DEC_x_positive_533832)) {
								if (!y.equals(__DEC_x_positive_533832)) {
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
					for (Branch __DEC_x_negative_389213 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_389213)) {
							if (!c.equals(__DEC_x_negative_389213)) {
								if (!y.equals(__DEC_x_negative_389213)) {
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
		for (Graph __DEC_y_root_673972 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
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
					for (Branch __DEC_y_positive_239025 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_239025)) {
							if (!x.equals(__DEC_y_positive_239025)) {
								if (!c.equals(__DEC_y_positive_239025)) {
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
					for (Branch __DEC_y_negative_487367 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_487367)) {
							if (!x.equals(__DEC_y_negative_487367)) {
								if (!c.equals(__DEC_y_negative_487367)) {
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
		for (Graph __DEC_z_root_248605 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
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
					for (Branch __DEC_z_positive_463613 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!x.equals(__DEC_z_positive_463613)) {
							if (!c.equals(__DEC_z_positive_463613)) {
								if (!y.equals(__DEC_z_positive_463613)) {
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
					for (Branch __DEC_z_negative_118567 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!x.equals(__DEC_z_negative_118567)) {
							if (!c.equals(__DEC_z_negative_118567)) {
								if (!y.equals(__DEC_z_negative_118567)) {
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

	public static final Object[] pattern_decdul2branchbub_29_6_perform_greenFFFBFFFBFFFB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(b2y);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		b2y.setSource(b);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.getCorrObjects().add(l2z);
		a2x.setSource(a);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		c.setNegative(y);
		b2y.setTarget(y);
		ruleResult.getTargetObjects().add(y);
		b.setLast(l);
		b.setFirst(l);
		l2z.setSource(l);
		ruleResult.getSourceObjects().add(l);
		y.setPositive(z);
		l2z.setTarget(z);
		z.setNext(y);
		ruleResult.getTargetObjects().add(z);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { b2y, a, b, d, x, l2z, a2x, c, y, l, z, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decdul2branchbub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decdul2branchbubImpl
