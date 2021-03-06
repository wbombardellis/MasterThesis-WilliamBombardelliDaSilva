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
import org.wbsilva.bx.sourcecode2controlflow.Rules.decal2branchcb;

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
 * An implementation of the model object '<em><b>decal2branchcb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class decal2branchcbImpl extends AbstractRuleImpl implements decal2branchcb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decal2branchcbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdecal2branchcb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Decision d, Assignment a, Assignment l, While b) {

		Object[] result1_black = decal2branchcbImpl.pattern_decal2branchcb_0_1_initialbindings_blackBBBBBB(this, match,
				d, a, l, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[l] = " + l + ", "
					+ "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = decal2branchcbImpl
				.pattern_decal2branchcb_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, d, a, l, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[l] = " + l + ", "
					+ "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decal2branchcbImpl.pattern_decal2branchcb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decal2branchcbImpl
					.pattern_decal2branchcb_0_4_collectelementstobetranslated_blackBBBBB(match, d, a, l, b);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[b] = " + b + ".");
			}
			decal2branchcbImpl.pattern_decal2branchcb_0_4_collectelementstobetranslated_greenBBBBBFFF(match, d, a, l,
					b);
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge b__l____last = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decal2branchcbImpl
					.pattern_decal2branchcb_0_5_collectcontextelements_blackBBBBB(match, d, a, l, b);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[a] = " + a + ", " + "[l] = " + l + ", " + "[b] = " + b + ".");
			}
			decal2branchcbImpl.pattern_decal2branchcb_0_5_collectcontextelements_greenBB(match, d);

			// 
			decal2branchcbImpl.pattern_decal2branchcb_0_6_registerobjectstomatch_expressionBBBBBB(this, match, d, a, l,
					b);
			return decal2branchcbImpl.pattern_decal2branchcb_0_7_expressionF();
		} else {
			return decal2branchcbImpl.pattern_decal2branchcb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decal2branchcbImpl
				.pattern_decal2branchcb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Decision d = (Decision) result1_bindingAndBlack[0];
		Assignment a = (Assignment) result1_bindingAndBlack[1];
		Branch c = (Branch) result1_bindingAndBlack[2];
		Assignment l = (Assignment) result1_bindingAndBlack[3];
		S2B d2c = (S2B) result1_bindingAndBlack[4];
		While b = (While) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decal2branchcbImpl.pattern_decal2branchcb_1_1_performtransformation_greenFFBBFFBFBF(a,
				c, l, b);
		Command x = (Command) result1_green[0];
		S2N l2z = (S2N) result1_green[1];
		Command z = (Command) result1_green[4];
		Branch y = (Branch) result1_green[5];
		S2B b2y = (S2B) result1_green[7];
		S2N a2x = (S2N) result1_green[9];

		Object[] result2_black = decal2branchcbImpl
				.pattern_decal2branchcb_1_2_collecttranslatedelements_blackBBBBBBBBB(x, l2z, a, z, y, l, b2y, b, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[l2z] = "
					+ l2z + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[l] = " + l + ", "
					+ "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = decal2branchcbImpl
				.pattern_decal2branchcb_1_2_collecttranslatedelements_greenFBBBBBBBBB(x, l2z, a, z, y, l, b2y, b, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decal2branchcbImpl.pattern_decal2branchcb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, d, x, l2z, a, c, z, y, l, d2c, b2y, b, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[l2z] = " + l2z + ", " + "[a] = " + a + ", "
					+ "[c] = " + c + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[l] = " + l + ", " + "[d2c] = "
					+ d2c + ", " + "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[a2x] = " + a2x + ".");
		}
		decal2branchcbImpl.pattern_decal2branchcb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, d,
				x, l2z, a, c, z, y, l, b2y, b, a2x);
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[23];

		// 
		// 
		decal2branchcbImpl.pattern_decal2branchcb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, d, x,
				l2z, a, c, z, y, l, d2c, b2y, b, a2x);
		return decal2branchcbImpl.pattern_decal2branchcb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = decal2branchcbImpl
				.pattern_decal2branchcb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decal2branchcbImpl
				.pattern_decal2branchcb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decal2branchcbImpl.pattern_decal2branchcb_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Decision d = (Decision) result2_binding[0];
		Assignment a = (Assignment) result2_binding[1];
		Assignment l = (Assignment) result2_binding[2];
		While b = (While) result2_binding[3];
		for (Object[] result2_black : decal2branchcbImpl.pattern_decal2branchcb_2_2_corematch_blackBBFBFBB(d, a, l, b,
				match)) {
			Branch c = (Branch) result2_black[2];
			S2B d2c = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decal2branchcbImpl.pattern_decal2branchcb_2_3_findcontext_blackBBBBBB(d, a, c,
					l, d2c, b)) {
				Object[] result3_green = decal2branchcbImpl.pattern_decal2branchcb_2_3_findcontext_greenBBBBBBFFFFFF(d,
						a, c, l, d2c, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decal2branchcbImpl
						.pattern_decal2branchcb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d, a, c,
								l, d2c, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[a] = " + a
							+ ", " + "[c] = " + c + ", " + "[l] = " + l + ", " + "[d2c] = " + d2c + ", " + "[b] = " + b
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decal2branchcbImpl.pattern_decal2branchcb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decal2branchcbImpl
							.pattern_decal2branchcb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decal2branchcbImpl.pattern_decal2branchcb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decal2branchcbImpl.pattern_decal2branchcb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Decision d, Assignment a, Assignment l, While b) {
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
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision d, Assignment a, Assignment l, While b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Decision d, Assignment a, Branch c,
			Assignment l, S2B d2c, While b) {// Create CSP
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject d, EObject x, EObject l2z, EObject a,
			EObject c, EObject z, EObject y, EObject l, EObject d2c, EObject b2y, EObject b, EObject a2x) {
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a2x", a2x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command x, Branch c, Command z, Branch y) {

		Object[] result1_black = decal2branchcbImpl.pattern_decal2branchcb_10_1_initialbindings_blackBBBBBB(this, match,
				x, c, z, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[z] = " + z + ", "
					+ "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = decal2branchcbImpl
				.pattern_decal2branchcb_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, x, c, z, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[z] = " + z + ", "
					+ "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decal2branchcbImpl.pattern_decal2branchcb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decal2branchcbImpl
					.pattern_decal2branchcb_10_4_collectelementstobetranslated_blackBBBBB(match, x, c, z, y);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[c] = " + c + ", " + "[z] = " + z + ", " + "[y] = " + y + ".");
			}
			decal2branchcbImpl.pattern_decal2branchcb_10_4_collectelementstobetranslated_greenBBBBBFFF(match, x, c, z,
					y);
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge z__y____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decal2branchcbImpl
					.pattern_decal2branchcb_10_5_collectcontextelements_blackBBBBB(match, x, c, z, y);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[c] = " + c + ", " + "[z] = " + z + ", " + "[y] = " + y + ".");
			}
			decal2branchcbImpl.pattern_decal2branchcb_10_5_collectcontextelements_greenBB(match, c);

			// 
			decal2branchcbImpl.pattern_decal2branchcb_10_6_registerobjectstomatch_expressionBBBBBB(this, match, x, c, z,
					y);
			return decal2branchcbImpl.pattern_decal2branchcb_10_7_expressionF();
		} else {
			return decal2branchcbImpl.pattern_decal2branchcb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decal2branchcbImpl
				.pattern_decal2branchcb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Decision d = (Decision) result1_bindingAndBlack[0];
		Command x = (Command) result1_bindingAndBlack[1];
		Branch c = (Branch) result1_bindingAndBlack[2];
		Command z = (Command) result1_bindingAndBlack[3];
		Branch y = (Branch) result1_bindingAndBlack[4];
		S2B d2c = (S2B) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decal2branchcbImpl.pattern_decal2branchcb_11_1_performtransformation_greenBBFFBBFFFF(d,
				x, z, y);
		S2N l2z = (S2N) result1_green[2];
		Assignment a = (Assignment) result1_green[3];
		Assignment l = (Assignment) result1_green[6];
		S2B b2y = (S2B) result1_green[7];
		While b = (While) result1_green[8];
		S2N a2x = (S2N) result1_green[9];

		Object[] result2_black = decal2branchcbImpl
				.pattern_decal2branchcb_11_2_collecttranslatedelements_blackBBBBBBBBB(x, l2z, a, z, y, l, b2y, b, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[l2z] = "
					+ l2z + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[l] = " + l + ", "
					+ "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = decal2branchcbImpl
				.pattern_decal2branchcb_11_2_collecttranslatedelements_greenFBBBBBBBBB(x, l2z, a, z, y, l, b2y, b, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decal2branchcbImpl.pattern_decal2branchcb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, d, x, l2z, a, c, z, y, l, d2c, b2y, b, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[l2z] = " + l2z + ", " + "[a] = " + a + ", "
					+ "[c] = " + c + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[l] = " + l + ", " + "[d2c] = "
					+ d2c + ", " + "[b2y] = " + b2y + ", " + "[b] = " + b + ", " + "[a2x] = " + a2x + ".");
		}
		decal2branchcbImpl.pattern_decal2branchcb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, d,
				x, l2z, a, c, z, y, l, b2y, b, a2x);
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[23];

		// 
		// 
		decal2branchcbImpl.pattern_decal2branchcb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, d, x,
				l2z, a, c, z, y, l, d2c, b2y, b, a2x);
		return decal2branchcbImpl.pattern_decal2branchcb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = decal2branchcbImpl
				.pattern_decal2branchcb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decal2branchcbImpl
				.pattern_decal2branchcb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decal2branchcbImpl.pattern_decal2branchcb_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command x = (Command) result2_binding[0];
		Branch c = (Branch) result2_binding[1];
		Command z = (Command) result2_binding[2];
		Branch y = (Branch) result2_binding[3];
		for (Object[] result2_black : decal2branchcbImpl.pattern_decal2branchcb_12_2_corematch_blackFBBBBFB(x, c, z, y,
				match)) {
			Decision d = (Decision) result2_black[0];
			S2B d2c = (S2B) result2_black[5];
			// ForEach 
			for (Object[] result3_black : decal2branchcbImpl.pattern_decal2branchcb_12_3_findcontext_blackBBBBBB(d, x,
					c, z, y, d2c)) {
				Object[] result3_green = decal2branchcbImpl.pattern_decal2branchcb_12_3_findcontext_greenBBBBBBFFFFFF(d,
						x, c, z, y, d2c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decal2branchcbImpl
						.pattern_decal2branchcb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, d, x, c,
								z, y, d2c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[x] = " + x
							+ ", " + "[c] = " + c + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[d2c] = " + d2c
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decal2branchcbImpl.pattern_decal2branchcb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decal2branchcbImpl
							.pattern_decal2branchcb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decal2branchcbImpl.pattern_decal2branchcb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decal2branchcbImpl.pattern_decal2branchcb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command x, Branch c, Command z, Branch y) {
		match.registerObject("x", x);
		match.registerObject("c", c);
		match.registerObject("z", z);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command x, Branch c, Command z, Branch y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Decision d, Command x, Branch c,
			Command z, Branch y, S2B d2c) {// Create CSP
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
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("d2c", d2c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject d, EObject x, EObject l2z, EObject a,
			EObject c, EObject z, EObject y, EObject l, EObject d2c, EObject b2y, EObject b, EObject a2x) {
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a2x", a2x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_87(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = decal2branchcbImpl
				.pattern_decal2branchcb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decal2branchcbImpl.pattern_decal2branchcb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decal2branchcbImpl
				.pattern_decal2branchcb_20_2_testcorematchandDECs_blackFFFFB(_edge_positive)) {
			Command x = (Command) result2_black[0];
			Branch c = (Branch) result2_black[1];
			Command z = (Command) result2_black[2];
			Branch y = (Branch) result2_black[3];
			Object[] result2_green = decal2branchcbImpl
					.pattern_decal2branchcb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decal2branchcbImpl
					.pattern_decal2branchcb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, x, c, z, y)) {
				// 
				if (decal2branchcbImpl
						.pattern_decal2branchcb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decal2branchcbImpl
							.pattern_decal2branchcb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decal2branchcbImpl.pattern_decal2branchcb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decal2branchcbImpl.pattern_decal2branchcb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_93(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = decal2branchcbImpl
				.pattern_decal2branchcb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decal2branchcbImpl.pattern_decal2branchcb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decal2branchcbImpl
				.pattern_decal2branchcb_21_2_testcorematchandDECs_blackFFFFB(_edge_positive)) {
			Decision d = (Decision) result2_black[0];
			Assignment a = (Assignment) result2_black[1];
			Assignment l = (Assignment) result2_black[2];
			While b = (While) result2_black[3];
			Object[] result2_green = decal2branchcbImpl
					.pattern_decal2branchcb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decal2branchcbImpl
					.pattern_decal2branchcb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, d, a, l, b)) {
				// 
				if (decal2branchcbImpl
						.pattern_decal2branchcb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decal2branchcbImpl
							.pattern_decal2branchcb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decal2branchcbImpl.pattern_decal2branchcb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decal2branchcbImpl.pattern_decal2branchcb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("decal2branchcb");
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
		ruleResult.setRule("decal2branchcb");
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

		Object[] result1_black = decal2branchcbImpl.pattern_decal2branchcb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decal2branchcbImpl.pattern_decal2branchcb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = decal2branchcbImpl
				.pattern_decal2branchcb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Decision d = (Decision) result2_bindingAndBlack[0];
		Command x = (Command) result2_bindingAndBlack[1];
		Assignment a = (Assignment) result2_bindingAndBlack[2];
		Branch c = (Branch) result2_bindingAndBlack[3];
		Command z = (Command) result2_bindingAndBlack[4];
		Branch y = (Branch) result2_bindingAndBlack[5];
		Assignment l = (Assignment) result2_bindingAndBlack[6];
		While b = (While) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decal2branchcbImpl
				.pattern_decal2branchcb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, d, x, a, c, z, y, l, b,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[d] = " + d + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[z] = "
					+ z + ", " + "[y] = " + y + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decal2branchcbImpl.pattern_decal2branchcb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decal2branchcbImpl.pattern_decal2branchcb_24_5_matchcorrcontext_blackBBFBB(d,
					c, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[2];
				Object[] result5_green = decal2branchcbImpl.pattern_decal2branchcb_24_5_matchcorrcontext_greenBBBF(d2c,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decal2branchcbImpl
						.pattern_decal2branchcb_24_6_createcorrespondence_blackBBBBBBBBB(d, x, a, c, z, y, l, b,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
							+ "[x] = " + x + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[z] = " + z + ", "
							+ "[y] = " + y + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decal2branchcbImpl.pattern_decal2branchcb_24_6_createcorrespondence_greenBFBBBBFBFB(x, a, z, y, l, b,
						ccMatch);
				//nothing S2N l2z = (S2N) result6_green[1];
				//nothing S2B b2y = (S2B) result6_green[6];
				//nothing S2N a2x = (S2N) result6_green[8];

				Object[] result7_black = decal2branchcbImpl
						.pattern_decal2branchcb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decal2branchcbImpl.pattern_decal2branchcb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return decal2branchcbImpl.pattern_decal2branchcb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Decision d, Command x, Assignment a, Branch c, Command z, Branch y,
			Assignment l, While b, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Decision d, Assignment a, Assignment l, While b) {// 
		Object[] result1_black = decal2branchcbImpl.pattern_decal2branchcb_27_1_matchtggpattern_blackBBBB(d, a, l, b);
		if (result1_black != null) {
			return decal2branchcbImpl.pattern_decal2branchcb_27_2_expressionF();
		} else {
			return decal2branchcbImpl.pattern_decal2branchcb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command x, Branch c, Command z, Branch y) {// 
		Object[] result1_black = decal2branchcbImpl.pattern_decal2branchcb_28_1_matchtggpattern_blackBBBB(x, c, z, y);
		if (result1_black != null) {
			return decal2branchcbImpl.pattern_decal2branchcb_28_2_expressionF();
		} else {
			return decal2branchcbImpl.pattern_decal2branchcb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = decal2branchcbImpl.pattern_decal2branchcb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decal2branchcbImpl.pattern_decal2branchcb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : decal2branchcbImpl
				.pattern_decal2branchcb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			Decision d = (Decision) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Branch c = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = decal2branchcbImpl
					.pattern_decal2branchcb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d, c, d2c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[c] = " + c
						+ ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decal2branchcbImpl.pattern_decal2branchcb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decal2branchcbImpl.pattern_decal2branchcb_29_5_checknacs_blackBBB(d, c, d2c);
				if (result5_black != null) {

					Object[] result6_black = decal2branchcbImpl.pattern_decal2branchcb_29_6_perform_blackBBBB(d, c, d2c,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
								+ "[c] = " + c + ", " + "[d2c] = " + d2c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decal2branchcbImpl.pattern_decal2branchcb_29_6_perform_greenBFFFBFFFFFFB(d, c, ruleResult);
					//nothing Command x = (Command) result6_green[1];
					//nothing S2N l2z = (S2N) result6_green[2];
					//nothing Assignment a = (Assignment) result6_green[3];
					//nothing Command z = (Command) result6_green[5];
					//nothing Branch y = (Branch) result6_green[6];
					//nothing Assignment l = (Assignment) result6_green[7];
					//nothing S2B b2y = (S2B) result6_green[8];
					//nothing While b = (While) result6_green[9];
					//nothing S2N a2x = (S2N) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return decal2branchcbImpl.pattern_decal2branchcb_29_7_expressionFB(ruleResult);
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
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_FWD__MATCH_DECISION_ASSIGNMENT_ASSIGNMENT_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.DECAL2BRANCHCB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_ASSIGNMENT_ASSIGNMENT_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4));
			return null;
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_ASSIGNMENT_ASSIGNMENT_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_DECISION_ASSIGNMENT_BRANCH_ASSIGNMENT_S2B_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Branch) arguments.get(3), (Assignment) arguments.get(4),
					(S2B) arguments.get(5), (While) arguments.get(6));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECAL2BRANCHCB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECAL2BRANCHCB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_COMMAND_BRANCH_COMMAND_BRANCH_S2B:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5), (S2B) arguments.get(6));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECAL2BRANCHCB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_87__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_87((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_93__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_93((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_SOLVE_CSP_CC__DECISION_COMMAND_ASSIGNMENT_BRANCH_COMMAND_BRANCH_ASSIGNMENT_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Decision) arguments.get(0), (Command) arguments.get(1),
					(Assignment) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5), (Assignment) arguments.get(6), (While) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___CHECK_DEC_FWD__DECISION_ASSIGNMENT_ASSIGNMENT_WHILE:
			return checkDEC_FWD((Decision) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3));
		case RulesPackage.DECAL2BRANCHCB___CHECK_DEC_BWD__COMMAND_BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.DECAL2BRANCHCB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECAL2BRANCHCB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DECISION_BRANCH_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Decision) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECAL2BRANCHCB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decal2branchcb_0_1_initialbindings_blackBBBBBB(decal2branchcb _this,
			Match match, Decision d, Assignment a, Assignment l, While b) {
		if (!a.equals(l)) {
			return new Object[] { _this, match, d, a, l, b };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_0_2_SolveCSP_bindingFBBBBBB(decal2branchcb _this, Match match,
			Decision d, Assignment a, Assignment l, While b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, d, a, l, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, d, a, l, b };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decal2branchcb_0_2_SolveCSP_bindingAndBlackFBBBBBB(decal2branchcb _this,
			Match match, Decision d, Assignment a, Assignment l, While b) {
		Object[] result_pattern_decal2branchcb_0_2_SolveCSP_binding = pattern_decal2branchcb_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, d, a, l, b);
		if (result_pattern_decal2branchcb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decal2branchcb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decal2branchcb_0_2_SolveCSP_black = pattern_decal2branchcb_0_2_SolveCSP_blackB(csp);
			if (result_pattern_decal2branchcb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, d, a, l, b };
			}
		}
		return null;
	}

	public static final boolean pattern_decal2branchcb_0_3_CheckCSP_expressionFBB(decal2branchcb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Decision d, Assignment a, Assignment l, While b) {
		if (!a.equals(l)) {
			return new Object[] { match, d, a, l, b };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Decision d, Assignment a, Assignment l, While b) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(b);
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String b__l____last_name_prime = "last";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(b__l____last);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		return new Object[] { match, d, a, l, b, d__a____positive, d__b____negative, b__l____last };
	}

	public static final Object[] pattern_decal2branchcb_0_5_collectcontextelements_blackBBBBB(Match match, Decision d,
			Assignment a, Assignment l, While b) {
		if (!a.equals(l)) {
			return new Object[] { match, d, a, l, b };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decal2branchcb_0_6_registerobjectstomatch_expressionBBBBBB(decal2branchcb _this,
			Match match, Decision d, Assignment a, Assignment l, While b) {
		_this.registerObjectsToMatch_FWD(match, d, a, l, b);

	}

	public static final boolean pattern_decal2branchcb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decal2branchcb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_1_1_performtransformation_bindingFFFFFFB(
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
			if (tmpA instanceof Assignment) {
				Assignment a = (Assignment) tmpA;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						if (tmpD2c instanceof S2B) {
							S2B d2c = (S2B) tmpD2c;
							if (tmpB instanceof While) {
								While b = (While) tmpB;
								return new Object[] { d, a, c, l, d2c, b, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_1_1_performtransformation_blackBBBBBBFBB(Decision d,
			Assignment a, Branch c, Assignment l, S2B d2c, While b, decal2branchcb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(l)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { d, a, c, l, d2c, b, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decal2branchcb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decal2branchcb_1_1_performtransformation_binding = pattern_decal2branchcb_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decal2branchcb_1_1_performtransformation_binding != null) {
			Decision d = (Decision) result_pattern_decal2branchcb_1_1_performtransformation_binding[0];
			Assignment a = (Assignment) result_pattern_decal2branchcb_1_1_performtransformation_binding[1];
			Branch c = (Branch) result_pattern_decal2branchcb_1_1_performtransformation_binding[2];
			Assignment l = (Assignment) result_pattern_decal2branchcb_1_1_performtransformation_binding[3];
			S2B d2c = (S2B) result_pattern_decal2branchcb_1_1_performtransformation_binding[4];
			While b = (While) result_pattern_decal2branchcb_1_1_performtransformation_binding[5];

			Object[] result_pattern_decal2branchcb_1_1_performtransformation_black = pattern_decal2branchcb_1_1_performtransformation_blackBBBBBBFBB(
					d, a, c, l, d2c, b, _this, isApplicableMatch);
			if (result_pattern_decal2branchcb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decal2branchcb_1_1_performtransformation_black[6];

				return new Object[] { d, a, c, l, d2c, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_1_1_performtransformation_greenFFBBFFBFBF(Assignment a,
			Branch c, Assignment l, While b) {
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		c.setPositive(x);
		l2z.setSource(l);
		l2z.setTarget(z);
		z.setNext(y);
		c.setNegative(y);
		b2y.setTarget(y);
		b2y.setSource(b);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { x, l2z, a, c, z, y, l, b2y, b, a2x };
	}

	public static final Object[] pattern_decal2branchcb_1_2_collecttranslatedelements_blackBBBBBBBBB(Command x, S2N l2z,
			Assignment a, Command z, Branch y, Assignment l, S2B b2y, While b, S2N a2x) {
		if (!x.equals(z)) {
			if (!a.equals(l)) {
				if (!a2x.equals(l2z)) {
					return new Object[] { x, l2z, a, z, y, l, b2y, b, a2x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_1_2_collecttranslatedelements_greenFBBBBBBBBB(Command x,
			S2N l2z, Assignment a, Command z, Branch y, Assignment l, S2B b2y, While b, S2N a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, x, l2z, a, z, y, l, b2y, b, a2x };
	}

	public static final Object[] pattern_decal2branchcb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d, EObject x, EObject l2z, EObject a, EObject c, EObject z, EObject y,
			EObject l, EObject d2c, EObject b2y, EObject b, EObject a2x) {
		if (!d.equals(x)) {
			if (!d.equals(l2z)) {
				if (!d.equals(z)) {
					if (!d.equals(y)) {
						if (!d.equals(l)) {
							if (!d.equals(d2c)) {
								if (!x.equals(z)) {
									if (!x.equals(y)) {
										if (!l2z.equals(x)) {
											if (!l2z.equals(z)) {
												if (!l2z.equals(y)) {
													if (!a.equals(d)) {
														if (!a.equals(x)) {
															if (!a.equals(l2z)) {
																if (!a.equals(c)) {
																	if (!a.equals(z)) {
																		if (!a.equals(y)) {
																			if (!a.equals(l)) {
																				if (!a.equals(d2c)) {
																					if (!a.equals(b2y)) {
																						if (!a.equals(b)) {
																							if (!a.equals(a2x)) {
																								if (!c.equals(d)) {
																									if (!c.equals(x)) {
																										if (!c.equals(
																												l2z)) {
																											if (!c.equals(
																													z)) {
																												if (!c.equals(
																														y)) {
																													if (!c.equals(
																															l)) {
																														if (!c.equals(
																																d2c)) {
																															if (!y.equals(
																																	z)) {
																																if (!l.equals(
																																		x)) {
																																	if (!l.equals(
																																			l2z)) {
																																		if (!l.equals(
																																				z)) {
																																			if (!l.equals(
																																					y)) {
																																				if (!d2c.equals(
																																						x)) {
																																					if (!d2c.equals(
																																							l2z)) {
																																						if (!d2c.equals(
																																								z)) {
																																							if (!d2c.equals(
																																									y)) {
																																								if (!d2c.equals(
																																										l)) {
																																									if (!b2y.equals(
																																											d)) {
																																										if (!b2y.equals(
																																												x)) {
																																											if (!b2y.equals(
																																													l2z)) {
																																												if (!b2y.equals(
																																														c)) {
																																													if (!b2y.equals(
																																															z)) {
																																														if (!b2y.equals(
																																																y)) {
																																															if (!b2y.equals(
																																																	l)) {
																																																if (!b2y.equals(
																																																		d2c)) {
																																																	if (!b.equals(
																																																			d)) {
																																																		if (!b.equals(
																																																				x)) {
																																																			if (!b.equals(
																																																					l2z)) {
																																																				if (!b.equals(
																																																						c)) {
																																																					if (!b.equals(
																																																							z)) {
																																																						if (!b.equals(
																																																								y)) {
																																																							if (!b.equals(
																																																									l)) {
																																																								if (!b.equals(
																																																										d2c)) {
																																																									if (!b.equals(
																																																											b2y)) {
																																																										if (!a2x.equals(
																																																												d)) {
																																																											if (!a2x.equals(
																																																													x)) {
																																																												if (!a2x.equals(
																																																														l2z)) {
																																																													if (!a2x.equals(
																																																															c)) {
																																																														if (!a2x.equals(
																																																																z)) {
																																																															if (!a2x.equals(
																																																																	y)) {
																																																																if (!a2x.equals(
																																																																		l)) {
																																																																	if (!a2x.equals(
																																																																			d2c)) {
																																																																		if (!a2x.equals(
																																																																				b2y)) {
																																																																			if (!a2x.equals(
																																																																					b)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						d,
																																																																						x,
																																																																						l2z,
																																																																						a,
																																																																						c,
																																																																						z,
																																																																						y,
																																																																						l,
																																																																						d2c,
																																																																						b2y,
																																																																						b,
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

	public static final Object[] pattern_decal2branchcb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject d, EObject x, EObject l2z, EObject a, EObject c, EObject z, EObject y,
			EObject l, EObject b2y, EObject b, EObject a2x) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decal2branchcb";
		String d__a____positive_name_prime = "positive";
		String l2z__z____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String z__y____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		String l2z__l____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String b__l____last_name_prime = "last";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(z__y____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(b__l____last);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		return new Object[] { ruleresult, d, x, l2z, a, c, z, y, l, b2y, b, a2x, d__a____positive, l2z__z____target,
				c__x____positive, z__y____next, c__y____negative, l2z__l____source, d__b____negative, b2y__y____target,
				b2y__b____source, b__l____last, a2x__x____target, a2x__a____source };
	}

	public static final void pattern_decal2branchcb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(decal2branchcb _this,
			PerformRuleResult ruleresult, EObject d, EObject x, EObject l2z, EObject a, EObject c, EObject z, EObject y,
			EObject l, EObject d2c, EObject b2y, EObject b, EObject a2x) {
		_this.registerObjects_FWD(ruleresult, d, x, l2z, a, c, z, y, l, d2c, b2y, b, a2x);

	}

	public static final PerformRuleResult pattern_decal2branchcb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_2_1_preparereturnvalue_bindingFB(decal2branchcb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			decal2branchcb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_2_1_preparereturnvalue_bindingAndBlackFFB(
			decal2branchcb _this) {
		Object[] result_pattern_decal2branchcb_2_1_preparereturnvalue_binding = pattern_decal2branchcb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decal2branchcb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decal2branchcb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decal2branchcb_2_1_preparereturnvalue_black = pattern_decal2branchcb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decal2branchcb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decal2branchcb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decal2branchcb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decal2branchcb_2_2_corematch_bindingFFFFB(Match match) {
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
			if (tmpA instanceof Assignment) {
				Assignment a = (Assignment) tmpA;
				if (tmpL instanceof Assignment) {
					Assignment l = (Assignment) tmpL;
					if (tmpB instanceof While) {
						While b = (While) tmpB;
						return new Object[] { d, a, l, b, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_2_2_corematch_blackBBFBFBB(Decision d, Assignment a,
			Assignment l, While b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(l)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { d, a, c, l, d2c, b, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_2_3_findcontext_blackBBBBBB(Decision d, Assignment a,
			Branch c, Assignment l, S2B d2c, While b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(l)) {
			if (a.equals(d.getPositive())) {
				if (b.equals(d.getNegative())) {
					if (d.equals(d2c.getSource())) {
						if (c.equals(d2c.getTarget())) {
							if (l.equals(b.getLast())) {
								_result.add(new Object[] { d, a, c, l, d2c, b });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_2_3_findcontext_greenBBBBBBFFFFFF(Decision d, Assignment a,
			Branch c, Assignment l, S2B d2c, While b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		String d2c__c____target_name_prime = "target";
		String b__l____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(b);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(b__l____last);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		return new Object[] { d, a, c, l, d2c, b, isApplicableMatch, d__a____positive, d__b____negative,
				d2c__d____source, d2c__c____target, b__l____last };
	}

	public static final Object[] pattern_decal2branchcb_2_4_solveCSP_bindingFBBBBBBBB(decal2branchcb _this,
			IsApplicableMatch isApplicableMatch, Decision d, Assignment a, Branch c, Assignment l, S2B d2c, While b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, d, a, c, l, d2c, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, a, c, l, d2c, b };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decal2branchcb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decal2branchcb _this,
			IsApplicableMatch isApplicableMatch, Decision d, Assignment a, Branch c, Assignment l, S2B d2c, While b) {
		Object[] result_pattern_decal2branchcb_2_4_solveCSP_binding = pattern_decal2branchcb_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d, a, c, l, d2c, b);
		if (result_pattern_decal2branchcb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decal2branchcb_2_4_solveCSP_binding[0];

			Object[] result_pattern_decal2branchcb_2_4_solveCSP_black = pattern_decal2branchcb_2_4_solveCSP_blackB(csp);
			if (result_pattern_decal2branchcb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, a, c, l, d2c, b };
			}
		}
		return null;
	}

	public static final boolean pattern_decal2branchcb_2_5_checkCSP_expressionFBB(decal2branchcb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decal2branchcb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decal2branchcb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decal2branchcb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_10_1_initialbindings_blackBBBBBB(decal2branchcb _this,
			Match match, Command x, Branch c, Command z, Branch y) {
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				return new Object[] { _this, match, x, c, z, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_10_2_SolveCSP_bindingFBBBBBB(decal2branchcb _this, Match match,
			Command x, Branch c, Command z, Branch y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, c, z, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, c, z, y };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decal2branchcb_10_2_SolveCSP_bindingAndBlackFBBBBBB(decal2branchcb _this,
			Match match, Command x, Branch c, Command z, Branch y) {
		Object[] result_pattern_decal2branchcb_10_2_SolveCSP_binding = pattern_decal2branchcb_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, x, c, z, y);
		if (result_pattern_decal2branchcb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decal2branchcb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decal2branchcb_10_2_SolveCSP_black = pattern_decal2branchcb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decal2branchcb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, c, z, y };
			}
		}
		return null;
	}

	public static final boolean pattern_decal2branchcb_10_3_CheckCSP_expressionFBB(decal2branchcb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Command x, Branch c, Command z, Branch y) {
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				return new Object[] { match, x, c, z, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_10_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Command x, Branch c, Command z, Branch y) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		String c__x____positive_name_prime = "positive";
		String z__y____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(z__y____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		c__x____positive.setName(c__x____positive_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		return new Object[] { match, x, c, z, y, c__x____positive, z__y____next, c__y____negative };
	}

	public static final Object[] pattern_decal2branchcb_10_5_collectcontextelements_blackBBBBB(Match match, Command x,
			Branch c, Command z, Branch y) {
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				return new Object[] { match, x, c, z, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decal2branchcb_10_6_registerobjectstomatch_expressionBBBBBB(decal2branchcb _this,
			Match match, Command x, Branch c, Command z, Branch y) {
		_this.registerObjectsToMatch_BWD(match, x, c, z, y);

	}

	public static final boolean pattern_decal2branchcb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decal2branchcb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("z");
		EObject _localVariable_4 = isApplicableMatch.getObject("y");
		EObject _localVariable_5 = isApplicableMatch.getObject("d2c");
		EObject tmpD = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpY = _localVariable_4;
		EObject tmpD2c = _localVariable_5;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpX instanceof Command) {
				Command x = (Command) tmpX;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						if (tmpY instanceof Branch) {
							Branch y = (Branch) tmpY;
							if (tmpD2c instanceof S2B) {
								S2B d2c = (S2B) tmpD2c;
								return new Object[] { d, x, c, z, y, d2c, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_11_1_performtransformation_blackBBBBBBFBB(Decision d, Command x,
			Branch c, Command z, Branch y, S2B d2c, decal2branchcb _this, IsApplicableMatch isApplicableMatch) {
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { d, x, c, z, y, d2c, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decal2branchcb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decal2branchcb_11_1_performtransformation_binding = pattern_decal2branchcb_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decal2branchcb_11_1_performtransformation_binding != null) {
			Decision d = (Decision) result_pattern_decal2branchcb_11_1_performtransformation_binding[0];
			Command x = (Command) result_pattern_decal2branchcb_11_1_performtransformation_binding[1];
			Branch c = (Branch) result_pattern_decal2branchcb_11_1_performtransformation_binding[2];
			Command z = (Command) result_pattern_decal2branchcb_11_1_performtransformation_binding[3];
			Branch y = (Branch) result_pattern_decal2branchcb_11_1_performtransformation_binding[4];
			S2B d2c = (S2B) result_pattern_decal2branchcb_11_1_performtransformation_binding[5];

			Object[] result_pattern_decal2branchcb_11_1_performtransformation_black = pattern_decal2branchcb_11_1_performtransformation_blackBBBBBBFBB(
					d, x, c, z, y, d2c, _this, isApplicableMatch);
			if (result_pattern_decal2branchcb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decal2branchcb_11_1_performtransformation_black[6];

				return new Object[] { d, x, c, z, y, d2c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_11_1_performtransformation_greenBBFFBBFFFF(Decision d,
			Command x, Command z, Branch y) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		l2z.setTarget(z);
		d.setPositive(a);
		l2z.setSource(l);
		b2y.setTarget(y);
		d.setNegative(b);
		b2y.setSource(b);
		b.setLast(l);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { d, x, l2z, a, z, y, l, b2y, b, a2x };
	}

	public static final Object[] pattern_decal2branchcb_11_2_collecttranslatedelements_blackBBBBBBBBB(Command x,
			S2N l2z, Assignment a, Command z, Branch y, Assignment l, S2B b2y, While b, S2N a2x) {
		if (!x.equals(z)) {
			if (!a.equals(l)) {
				if (!a2x.equals(l2z)) {
					return new Object[] { x, l2z, a, z, y, l, b2y, b, a2x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_11_2_collecttranslatedelements_greenFBBBBBBBBB(Command x,
			S2N l2z, Assignment a, Command z, Branch y, Assignment l, S2B b2y, While b, S2N a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, x, l2z, a, z, y, l, b2y, b, a2x };
	}

	public static final Object[] pattern_decal2branchcb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d, EObject x, EObject l2z, EObject a, EObject c, EObject z, EObject y,
			EObject l, EObject d2c, EObject b2y, EObject b, EObject a2x) {
		if (!d.equals(x)) {
			if (!d.equals(l2z)) {
				if (!d.equals(z)) {
					if (!d.equals(y)) {
						if (!d.equals(l)) {
							if (!d.equals(d2c)) {
								if (!x.equals(z)) {
									if (!x.equals(y)) {
										if (!l2z.equals(x)) {
											if (!l2z.equals(z)) {
												if (!l2z.equals(y)) {
													if (!a.equals(d)) {
														if (!a.equals(x)) {
															if (!a.equals(l2z)) {
																if (!a.equals(c)) {
																	if (!a.equals(z)) {
																		if (!a.equals(y)) {
																			if (!a.equals(l)) {
																				if (!a.equals(d2c)) {
																					if (!a.equals(b2y)) {
																						if (!a.equals(b)) {
																							if (!a.equals(a2x)) {
																								if (!c.equals(d)) {
																									if (!c.equals(x)) {
																										if (!c.equals(
																												l2z)) {
																											if (!c.equals(
																													z)) {
																												if (!c.equals(
																														y)) {
																													if (!c.equals(
																															l)) {
																														if (!c.equals(
																																d2c)) {
																															if (!y.equals(
																																	z)) {
																																if (!l.equals(
																																		x)) {
																																	if (!l.equals(
																																			l2z)) {
																																		if (!l.equals(
																																				z)) {
																																			if (!l.equals(
																																					y)) {
																																				if (!d2c.equals(
																																						x)) {
																																					if (!d2c.equals(
																																							l2z)) {
																																						if (!d2c.equals(
																																								z)) {
																																							if (!d2c.equals(
																																									y)) {
																																								if (!d2c.equals(
																																										l)) {
																																									if (!b2y.equals(
																																											d)) {
																																										if (!b2y.equals(
																																												x)) {
																																											if (!b2y.equals(
																																													l2z)) {
																																												if (!b2y.equals(
																																														c)) {
																																													if (!b2y.equals(
																																															z)) {
																																														if (!b2y.equals(
																																																y)) {
																																															if (!b2y.equals(
																																																	l)) {
																																																if (!b2y.equals(
																																																		d2c)) {
																																																	if (!b.equals(
																																																			d)) {
																																																		if (!b.equals(
																																																				x)) {
																																																			if (!b.equals(
																																																					l2z)) {
																																																				if (!b.equals(
																																																						c)) {
																																																					if (!b.equals(
																																																							z)) {
																																																						if (!b.equals(
																																																								y)) {
																																																							if (!b.equals(
																																																									l)) {
																																																								if (!b.equals(
																																																										d2c)) {
																																																									if (!b.equals(
																																																											b2y)) {
																																																										if (!a2x.equals(
																																																												d)) {
																																																											if (!a2x.equals(
																																																													x)) {
																																																												if (!a2x.equals(
																																																														l2z)) {
																																																													if (!a2x.equals(
																																																															c)) {
																																																														if (!a2x.equals(
																																																																z)) {
																																																															if (!a2x.equals(
																																																																	y)) {
																																																																if (!a2x.equals(
																																																																		l)) {
																																																																	if (!a2x.equals(
																																																																			d2c)) {
																																																																		if (!a2x.equals(
																																																																				b2y)) {
																																																																			if (!a2x.equals(
																																																																					b)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						d,
																																																																						x,
																																																																						l2z,
																																																																						a,
																																																																						c,
																																																																						z,
																																																																						y,
																																																																						l,
																																																																						d2c,
																																																																						b2y,
																																																																						b,
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

	public static final Object[] pattern_decal2branchcb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject d, EObject x, EObject l2z, EObject a, EObject c, EObject z, EObject y,
			EObject l, EObject b2y, EObject b, EObject a2x) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decal2branchcb";
		String d__a____positive_name_prime = "positive";
		String l2z__z____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String z__y____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		String l2z__l____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String b__l____last_name_prime = "last";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(z__y____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(b__l____last);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		return new Object[] { ruleresult, d, x, l2z, a, c, z, y, l, b2y, b, a2x, d__a____positive, l2z__z____target,
				c__x____positive, z__y____next, c__y____negative, l2z__l____source, d__b____negative, b2y__y____target,
				b2y__b____source, b__l____last, a2x__x____target, a2x__a____source };
	}

	public static final void pattern_decal2branchcb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(decal2branchcb _this,
			PerformRuleResult ruleresult, EObject d, EObject x, EObject l2z, EObject a, EObject c, EObject z, EObject y,
			EObject l, EObject d2c, EObject b2y, EObject b, EObject a2x) {
		_this.registerObjects_BWD(ruleresult, d, x, l2z, a, c, z, y, l, d2c, b2y, b, a2x);

	}

	public static final PerformRuleResult pattern_decal2branchcb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_12_1_preparereturnvalue_bindingFB(decal2branchcb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			decal2branchcb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_12_1_preparereturnvalue_bindingAndBlackFFB(
			decal2branchcb _this) {
		Object[] result_pattern_decal2branchcb_12_1_preparereturnvalue_binding = pattern_decal2branchcb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decal2branchcb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decal2branchcb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decal2branchcb_12_1_preparereturnvalue_black = pattern_decal2branchcb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decal2branchcb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decal2branchcb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decal2branchcb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decal2branchcb_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("z");
		EObject _localVariable_3 = match.getObject("y");
		EObject tmpX = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpY = _localVariable_3;
		if (tmpX instanceof Command) {
			Command x = (Command) tmpX;
			if (tmpC instanceof Branch) {
				Branch c = (Branch) tmpC;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpY instanceof Branch) {
						Branch y = (Branch) tmpY;
						return new Object[] { x, c, z, y, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_12_2_corematch_blackFBBBBFB(Command x, Branch c,
			Command z, Branch y, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
						"target")) {
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						_result.add(new Object[] { d, x, c, z, y, d2c, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_12_3_findcontext_blackBBBBBB(Decision d, Command x,
			Branch c, Command z, Branch y, S2B d2c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				if (x.equals(c.getPositive())) {
					if (y.equals(z.getNext())) {
						if (y.equals(c.getNegative())) {
							if (d.equals(d2c.getSource())) {
								if (c.equals(d2c.getTarget())) {
									_result.add(new Object[] { d, x, c, z, y, d2c });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_12_3_findcontext_greenBBBBBBFFFFFF(Decision d, Command x,
			Branch c, Command z, Branch y, S2B d2c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__x____positive_name_prime = "positive";
		String z__y____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		String d2c__c____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(d2c);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(z__y____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		c__x____positive.setName(c__x____positive_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		return new Object[] { d, x, c, z, y, d2c, isApplicableMatch, c__x____positive, z__y____next, c__y____negative,
				d2c__d____source, d2c__c____target };
	}

	public static final Object[] pattern_decal2branchcb_12_4_solveCSP_bindingFBBBBBBBB(decal2branchcb _this,
			IsApplicableMatch isApplicableMatch, Decision d, Command x, Branch c, Command z, Branch y, S2B d2c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, d, x, c, z, y, d2c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, x, c, z, y, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decal2branchcb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(decal2branchcb _this,
			IsApplicableMatch isApplicableMatch, Decision d, Command x, Branch c, Command z, Branch y, S2B d2c) {
		Object[] result_pattern_decal2branchcb_12_4_solveCSP_binding = pattern_decal2branchcb_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, d, x, c, z, y, d2c);
		if (result_pattern_decal2branchcb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decal2branchcb_12_4_solveCSP_binding[0];

			Object[] result_pattern_decal2branchcb_12_4_solveCSP_black = pattern_decal2branchcb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decal2branchcb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, x, c, z, y, d2c };
			}
		}
		return null;
	}

	public static final boolean pattern_decal2branchcb_12_5_checkCSP_expressionFBB(decal2branchcb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decal2branchcb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decal2branchcb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decal2branchcb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_20_1_preparereturnvalue_bindingFB(decal2branchcb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decal2branchcb _this) {
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

	public static final Object[] pattern_decal2branchcb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			decal2branchcb _this) {
		Object[] result_pattern_decal2branchcb_20_1_preparereturnvalue_binding = pattern_decal2branchcb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decal2branchcb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decal2branchcb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decal2branchcb_20_1_preparereturnvalue_black = pattern_decal2branchcb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decal2branchcb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decal2branchcb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decal2branchcb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_0B(Command x) {
		for (Graph __DEC_x_root_548987 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_1BBB(Command x, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_positive_680101 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_x_positive_680101)) {
					if (!y.equals(__DEC_x_positive_680101)) {
						return new Object[] { x, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_2BBB(Command x, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_negative_667262 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_x_negative_667262)) {
					if (!y.equals(__DEC_x_negative_667262)) {
						return new Object[] { x, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_515823 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_4BBB(Command z, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_z_positive_789830 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_z_positive_789830)) {
					if (!y.equals(__DEC_z_positive_789830)) {
						return new Object[] { z, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_5BBB(Command z, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_z_negative_660081 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_z_negative_660081)) {
					if (!y.equals(__DEC_z_negative_660081)) {
						return new Object[] { z, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_6B(Branch y) {
		for (Graph __DEC_y_root_904653 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_7BB(Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_positive_964492 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_y_positive_964492)) {
					if (!c.equals(__DEC_y_positive_964492)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_8BB(Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_negative_109206 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_y_negative_109206)) {
					if (!c.equals(__DEC_y_negative_109206)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_9BB(Branch y, Command x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_10BB(Branch c, Command x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_11BB(Branch y, Command x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_13BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_14BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_15BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_16BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_positive.getSrc();
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			EObject tmpX = _edge_positive.getTrg();
			if (tmpX instanceof Command) {
				Command x = (Command) tmpX;
				if (x.equals(c.getPositive())) {
					Node tmpY = c.getNegative();
					if (tmpY instanceof Branch) {
						Branch y = (Branch) tmpY;
						if (!c.equals(y)) {
							if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
								if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_10BB(c, x) == null) {
									if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_1BBB(x, c,
											y) == null) {
										if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_2BBB(x, c,
												y) == null) {
											if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_6B(
													y) == null) {
												if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_7BB(y,
														c) == null) {
													if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_8BB(
															y, c) == null) {
														if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_9BB(
																y, x) == null) {
															if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_11BB(
																	y, x) == null) {
																if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_16BB(
																		c, y) == null) {
																	for (Node tmpZ : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(y, Node.class,
																					"next")) {
																		if (tmpZ instanceof Command) {
																			Command z = (Command) tmpZ;
																			if (!x.equals(z)) {
																				if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_3B(
																						z) == null) {
																					if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_4BBB(
																							z, c, y) == null) {
																						if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_5BBB(
																								z, c, y) == null) {
																							if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_12BB(
																									c, z) == null) {
																								if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_13BB(
																										y, z) == null) {
																									if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_14BB(
																											c,
																											z) == null) {
																										if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_15BB(
																												y,
																												z) == null) {
																											_result.add(
																													new Object[] {
																															x,
																															c,
																															z,
																															y,
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

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decal2branchcb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decal2branchcb _this, Match match, Command x, Branch c, Command z, Branch y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, c, z, y);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decal2branchcb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decal2branchcb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decal2branchcb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_21_1_preparereturnvalue_bindingFB(decal2branchcb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decal2branchcb _this) {
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

	public static final Object[] pattern_decal2branchcb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			decal2branchcb _this) {
		Object[] result_pattern_decal2branchcb_21_1_preparereturnvalue_binding = pattern_decal2branchcb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decal2branchcb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decal2branchcb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decal2branchcb_21_1_preparereturnvalue_black = pattern_decal2branchcb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decal2branchcb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decal2branchcb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decal2branchcb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_0BB(Assignment a,
			Decision d) {
		for (Decision __DEC_a_negative_724737 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_724737)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_1BB(Assignment a, While b) {
		for (While __DEC_a_first_489800 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_489800)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_2BB(Assignment a, While b) {
		for (While __DEC_a_last_480140 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_480140)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_3B(Assignment a) {
		for (Program __DEC_a_first_451448 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_4BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_165035 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_165035)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_5BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_552711 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_552711)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_6BB(Assignment l, While b) {
		for (While __DEC_l_first_676479 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!b.equals(__DEC_l_first_676479)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_7BB(Assignment l, While b) {
		for (While __DEC_l_last_625391 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_625391)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_8B(Assignment l) {
		for (Program __DEC_l_first_134875 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_9BB(While b, Decision d) {
		for (Decision __DEC_b_positive_726967 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_726967)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_10B(While b) {
		for (While __DEC_b_first_487498 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_487498)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_11B(While b) {
		for (While __DEC_b_last_179902 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_179902)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_12B(While b) {
		for (Program __DEC_b_first_528433 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_13BB(Decision d,
			Assignment a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_14BB(While b,
			Assignment a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_15BB(While b,
			Assignment a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_16BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_17BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_18BB(While b,
			Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_19BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpD = _edge_positive.getSrc();
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			EObject tmpA = _edge_positive.getTrg();
			if (tmpA instanceof Assignment) {
				Assignment a = (Assignment) tmpA;
				if (a.equals(d.getPositive())) {
					Statement tmpB = d.getNegative();
					if (tmpB instanceof While) {
						While b = (While) tmpB;
						Statement tmpL = b.getLast();
						if (tmpL instanceof Assignment) {
							Assignment l = (Assignment) tmpL;
							if (!a.equals(l)) {
								if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_0BB(a, d) == null) {
									if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_3B(a) == null) {
										if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_13BB(d,
												a) == null) {
											if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_1BB(a,
													b) == null) {
												if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_2BB(a,
														b) == null) {
													if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_9BB(
															b, d) == null) {
														if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_10B(
																b) == null) {
															if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_11B(
																	b) == null) {
																if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_12B(
																		b) == null) {
																	if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_14BB(
																			b, a) == null) {
																		if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_15BB(
																				b, a) == null) {
																			if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_19BB(
																					d, b) == null) {
																				if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_4BB(
																						l, d) == null) {
																					if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_5BB(
																							l, d) == null) {
																						if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_6BB(
																								l, b) == null) {
																							if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_7BB(
																									l, b) == null) {
																								if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_8B(
																										l) == null) {
																									if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_16BB(
																											d,
																											l) == null) {
																										if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_17BB(
																												d,
																												l) == null) {
																											if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_18BB(
																													b,
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

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decal2branchcb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decal2branchcb _this, Match match, Decision d, Assignment a, Assignment l, While b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, d, a, l, b);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decal2branchcb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decal2branchcb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decal2branchcb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_24_1_prepare_blackB(decal2branchcb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decal2branchcb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_decal2branchcb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("d");
		EObject _localVariable_1 = targetMatch.getObject("x");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = targetMatch.getObject("c");
		EObject _localVariable_4 = targetMatch.getObject("z");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject _localVariable_6 = sourceMatch.getObject("l");
		EObject _localVariable_7 = sourceMatch.getObject("b");
		EObject tmpD = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpL = _localVariable_6;
		EObject tmpB = _localVariable_7;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpX instanceof Command) {
				Command x = (Command) tmpX;
				if (tmpA instanceof Assignment) {
					Assignment a = (Assignment) tmpA;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpZ instanceof Command) {
							Command z = (Command) tmpZ;
							if (tmpY instanceof Branch) {
								Branch y = (Branch) tmpY;
								if (tmpL instanceof Assignment) {
									Assignment l = (Assignment) tmpL;
									if (tmpB instanceof While) {
										While b = (While) tmpB;
										return new Object[] { d, x, a, c, z, y, l, b, sourceMatch, targetMatch };
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

	public static final Object[] pattern_decal2branchcb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Decision d, Command x,
			Assignment a, Branch c, Command z, Branch y, Assignment l, While b, Match sourceMatch, Match targetMatch) {
		if (!x.equals(z)) {
			if (!a.equals(l)) {
				if (!c.equals(y)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { d, x, a, c, z, y, l, b, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding = pattern_decal2branchcb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding != null) {
			Decision d = (Decision) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[0];
			Command x = (Command) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[1];
			Assignment a = (Assignment) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[2];
			Branch c = (Branch) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[3];
			Command z = (Command) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[4];
			Branch y = (Branch) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[5];
			Assignment l = (Assignment) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[6];
			While b = (While) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decal2branchcb_24_2_matchsrctrgcontext_black = pattern_decal2branchcb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					d, x, a, c, z, y, l, b, sourceMatch, targetMatch);
			if (result_pattern_decal2branchcb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { d, x, a, c, z, y, l, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_24_3_solvecsp_bindingFBBBBBBBBBBB(decal2branchcb _this,
			Decision d, Command x, Assignment a, Branch c, Command z, Branch y, Assignment l, While b,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(d, x, a, c, z, y, l, b, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, d, x, a, c, z, y, l, b, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decal2branchcb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(decal2branchcb _this,
			Decision d, Command x, Assignment a, Branch c, Command z, Branch y, Assignment l, While b,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decal2branchcb_24_3_solvecsp_binding = pattern_decal2branchcb_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, d, x, a, c, z, y, l, b, sourceMatch, targetMatch);
		if (result_pattern_decal2branchcb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decal2branchcb_24_3_solvecsp_binding[0];

			Object[] result_pattern_decal2branchcb_24_3_solvecsp_black = pattern_decal2branchcb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decal2branchcb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, d, x, a, c, z, y, l, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decal2branchcb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_24_5_matchcorrcontext_blackBBFBB(Decision d, Branch c,
			Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_decal2branchcb_24_5_matchcorrcontext_greenBBBF(S2B d2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "decal2branchcb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_decal2branchcb_24_6_createcorrespondence_blackBBBBBBBBB(Decision d, Command x,
			Assignment a, Branch c, Command z, Branch y, Assignment l, While b, CCMatch ccMatch) {
		if (!x.equals(z)) {
			if (!a.equals(l)) {
				if (!c.equals(y)) {
					return new Object[] { d, x, a, c, z, y, l, b, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_24_6_createcorrespondence_greenBFBBBBFBFB(Command x,
			Assignment a, Command z, Branch y, Assignment l, While b, CCMatch ccMatch) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		l2z.setTarget(z);
		l2z.setSource(l);
		ccMatch.getCreateCorr().add(l2z);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { x, l2z, a, z, y, l, b2y, b, a2x, ccMatch };
	}

	public static final Object[] pattern_decal2branchcb_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_decal2branchcb_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "decal2branchcb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_decal2branchcb_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_0BB(Assignment a, Decision d) {
		for (Decision __DEC_a_negative_187949 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_187949)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_1BB(Assignment a, While b) {
		for (While __DEC_a_first_868380 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_868380)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_2BB(Assignment a, While b) {
		for (While __DEC_a_last_601634 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_601634)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_3B(Assignment a) {
		for (Program __DEC_a_first_246009 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_4BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_606525 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_606525)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_5BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_984657 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_984657)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_6BB(Assignment l, While b) {
		for (While __DEC_l_first_901145 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!b.equals(__DEC_l_first_901145)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_7BB(Assignment l, While b) {
		for (While __DEC_l_last_332723 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_332723)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_8B(Assignment l) {
		for (Program __DEC_l_first_628600 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_9BB(While b, Decision d) {
		for (Decision __DEC_b_positive_686514 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_686514)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_10B(While b) {
		for (While __DEC_b_first_754452 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_754452)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_11B(While b) {
		for (While __DEC_b_last_150417 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_150417)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_12B(While b) {
		for (Program __DEC_b_first_673953 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_13BB(Decision d, Assignment a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_14BB(While b, Assignment a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_15BB(While b, Assignment a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_16BB(Decision d, Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_17BB(Decision d, Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_18BB(While b, Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_19BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_blackBBBB(Decision d, Assignment a,
			Assignment l, While b) {
		if (!a.equals(l)) {
			if (a.equals(d.getPositive())) {
				if (b.equals(d.getNegative())) {
					if (l.equals(b.getLast())) {
						if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_0BB(a, d) == null) {
							if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_1BB(a, b) == null) {
								if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_2BB(a, b) == null) {
									if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_3B(a) == null) {
										if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_4BB(l, d) == null) {
											if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_5BB(l,
													d) == null) {
												if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_6BB(l,
														b) == null) {
													if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_7BB(l,
															b) == null) {
														if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_8B(
																l) == null) {
															if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_9BB(
																	b, d) == null) {
																if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_10B(
																		b) == null) {
																	if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_11B(
																			b) == null) {
																		if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_12B(
																				b) == null) {
																			if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_13BB(
																					d, a) == null) {
																				if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_14BB(
																						b, a) == null) {
																					if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_15BB(
																							b, a) == null) {
																						if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_16BB(
																								d, l) == null) {
																							if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_17BB(
																									d, l) == null) {
																								if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_18BB(
																										b, l) == null) {
																									if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_19BB(
																											d,
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

	public static final boolean pattern_decal2branchcb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decal2branchcb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_0B(Command x) {
		for (Graph __DEC_x_root_170599 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_1BBB(Command x, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_positive_381840 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_x_positive_381840)) {
					if (!y.equals(__DEC_x_positive_381840)) {
						return new Object[] { x, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_2BBB(Command x, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_negative_752592 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_x_negative_752592)) {
					if (!y.equals(__DEC_x_negative_752592)) {
						return new Object[] { x, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_775982 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_4BBB(Command z, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_z_positive_233492 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_z_positive_233492)) {
					if (!y.equals(__DEC_z_positive_233492)) {
						return new Object[] { z, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_5BBB(Command z, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_z_negative_610837 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_z_negative_610837)) {
					if (!y.equals(__DEC_z_negative_610837)) {
						return new Object[] { z, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_6B(Branch y) {
		for (Graph __DEC_y_root_139584 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_7BB(Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_positive_182995 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_y_positive_182995)) {
					if (!c.equals(__DEC_y_positive_182995)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_8BB(Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_negative_899008 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_y_negative_899008)) {
					if (!c.equals(__DEC_y_negative_899008)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_9BB(Branch y, Command x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_10BB(Branch c, Command x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_11BB(Branch y, Command x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_13BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_14BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_15BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_16BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_blackBBBB(Command x, Branch c, Command z,
			Branch y) {
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				if (x.equals(c.getPositive())) {
					if (y.equals(z.getNext())) {
						if (y.equals(c.getNegative())) {
							if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_0B(x) == null) {
								if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_1BBB(x, c, y) == null) {
									if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_2BBB(x, c, y) == null) {
										if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_3B(z) == null) {
											if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_4BBB(z, c,
													y) == null) {
												if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_5BBB(z, c,
														y) == null) {
													if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_6B(
															y) == null) {
														if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_7BB(y,
																c) == null) {
															if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_8BB(
																	y, c) == null) {
																if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_9BB(
																		y, x) == null) {
																	if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_10BB(
																			c, x) == null) {
																		if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_11BB(
																				y, x) == null) {
																			if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_12BB(
																					c, z) == null) {
																				if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_13BB(
																						y, z) == null) {
																					if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_14BB(
																							c, z) == null) {
																						if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_15BB(
																								y, z) == null) {
																							if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_16BB(
																									c, y) == null) {
																								return new Object[] { x,
																										c, z, y };
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_decal2branchcb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decal2branchcb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_29_1_createresult_blackB(decal2branchcb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decal2branchcb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_decal2branchcb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_decal2branchcb_29_2_isapplicablecore_black_nac_1BB(ruleResult, d2c) == null) {
								if (pattern_decal2branchcb_29_2_isapplicablecore_black_nac_0BB(ruleResult, d) == null) {
									if (pattern_decal2branchcb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_decal2branchcb_29_3_solveCSP_bindingFBBBBBB(decal2branchcb _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d, c, d2c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decal2branchcb_29_3_solveCSP_bindingAndBlackFBBBBBB(decal2branchcb _this,
			IsApplicableMatch isApplicableMatch, Decision d, Branch c, S2B d2c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decal2branchcb_29_3_solveCSP_binding = pattern_decal2branchcb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d, c, d2c, ruleResult);
		if (result_pattern_decal2branchcb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decal2branchcb_29_3_solveCSP_binding[0];

			Object[] result_pattern_decal2branchcb_29_3_solveCSP_black = pattern_decal2branchcb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decal2branchcb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, c, d2c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decal2branchcb_29_4_checkCSP_expressionFBB(decal2branchcb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_29_5_checknacs_blackBBB(Decision d, Branch c, S2B d2c) {
		return new Object[] { d, c, d2c };
	}

	public static final Object[] pattern_decal2branchcb_29_6_perform_blackBBBB(Decision d, Branch c, S2B d2c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d, c, d2c, ruleResult };
	}

	public static final Object[] pattern_decal2branchcb_29_6_perform_greenBFFFBFFFFFFB(Decision d, Branch c,
			ModelgeneratorRuleResult ruleResult) {
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.getCorrObjects().add(l2z);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		l2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		z.setNext(y);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		l2z.setSource(l);
		ruleResult.getSourceObjects().add(l);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		d.setNegative(b);
		b2y.setSource(b);
		b.setLast(l);
		ruleResult.getSourceObjects().add(b);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { d, x, l2z, a, c, z, y, l, b2y, b, a2x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decal2branchcb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decal2branchcbImpl
