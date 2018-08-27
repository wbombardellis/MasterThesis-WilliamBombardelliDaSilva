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
	public boolean isAppropriate_FWD(Match match, While b, Decision d, Assignment a, Assignment l) {

		Object[] result1_black = decal2branchcbImpl.pattern_decal2branchcb_0_1_initialbindings_blackBBBBBB(this, match,
				b, d, a, l);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ", "
					+ "[l] = " + l + ".");
		}

		Object[] result2_bindingAndBlack = decal2branchcbImpl
				.pattern_decal2branchcb_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, b, d, a, l);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ", "
					+ "[l] = " + l + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decal2branchcbImpl.pattern_decal2branchcb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decal2branchcbImpl
					.pattern_decal2branchcb_0_4_collectelementstobetranslated_blackBBBBB(match, b, d, a, l);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[l] = " + l + ".");
			}
			decal2branchcbImpl.pattern_decal2branchcb_0_4_collectelementstobetranslated_greenBBBBBFFF(match, b, d, a,
					l);
			//nothing EMoflonEdge b__l____last = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decal2branchcbImpl
					.pattern_decal2branchcb_0_5_collectcontextelements_blackBBBBB(match, b, d, a, l);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[l] = " + l + ".");
			}
			decal2branchcbImpl.pattern_decal2branchcb_0_5_collectcontextelements_greenBB(match, d);

			// 
			decal2branchcbImpl.pattern_decal2branchcb_0_6_registerobjectstomatch_expressionBBBBBB(this, match, b, d, a,
					l);
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
		Branch c = (Branch) result1_bindingAndBlack[0];
		S2B d2c = (S2B) result1_bindingAndBlack[1];
		While b = (While) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		Assignment a = (Assignment) result1_bindingAndBlack[4];
		Assignment l = (Assignment) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decal2branchcbImpl.pattern_decal2branchcb_1_1_performtransformation_greenBFFBBFFFBF(c,
				b, a, l);
		S2N a2x = (S2N) result1_green[1];
		Branch y = (Branch) result1_green[2];
		Command z = (Command) result1_green[5];
		S2B b2y = (S2B) result1_green[6];
		S2N l2z = (S2N) result1_green[7];
		Command x = (Command) result1_green[9];

		Object[] result2_black = decal2branchcbImpl
				.pattern_decal2branchcb_1_2_collecttranslatedelements_blackBBBBBBBBB(a2x, y, b, a, z, b2y, l2z, l, x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[y] = "
					+ y + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[b2y] = " + b2y
					+ ", " + "[l2z] = " + l2z + ", " + "[l] = " + l + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = decal2branchcbImpl
				.pattern_decal2branchcb_1_2_collecttranslatedelements_greenFBBBBBBBBB(a2x, y, b, a, z, b2y, l2z, l, x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decal2branchcbImpl.pattern_decal2branchcb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, c, a2x, y, d2c, b, d, a, z, b2y, l2z, l, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[d2c] = " + d2c
					+ ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[z] = " + z + ", "
					+ "[b2y] = " + b2y + ", " + "[l2z] = " + l2z + ", " + "[l] = " + l + ", " + "[x] = " + x + ".");
		}
		decal2branchcbImpl.pattern_decal2branchcb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, c,
				a2x, y, b, d, a, z, b2y, l2z, l, x);
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[23];

		// 
		// 
		decal2branchcbImpl.pattern_decal2branchcb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, c, a2x,
				y, d2c, b, d, a, z, b2y, l2z, l, x);
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
		While b = (While) result2_binding[0];
		Decision d = (Decision) result2_binding[1];
		Assignment a = (Assignment) result2_binding[2];
		Assignment l = (Assignment) result2_binding[3];
		for (Object[] result2_black : decal2branchcbImpl.pattern_decal2branchcb_2_2_corematch_blackFFBBBBB(b, d, a, l,
				match)) {
			Branch c = (Branch) result2_black[0];
			S2B d2c = (S2B) result2_black[1];
			// ForEach 
			for (Object[] result3_black : decal2branchcbImpl.pattern_decal2branchcb_2_3_findcontext_blackBBBBBB(c, d2c,
					b, d, a, l)) {
				Object[] result3_green = decal2branchcbImpl.pattern_decal2branchcb_2_3_findcontext_greenBBBBBBFFFFFF(c,
						d2c, b, d, a, l);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decal2branchcbImpl
						.pattern_decal2branchcb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, c, d2c,
								b, d, a, l);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d2c] = "
							+ d2c + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[l] = "
							+ l + ".");
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
	public void registerObjectsToMatch_FWD(Match match, While b, Decision d, Assignment a, Assignment l) {
		match.registerObject("b", b);
		match.registerObject("d", d);
		match.registerObject("a", a);
		match.registerObject("l", l);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While b, Decision d, Assignment a, Assignment l) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, While b, Decision d,
			Assignment a, Assignment l) {// Create CSP
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
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("a", a);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c, EObject a2x, EObject y, EObject d2c,
			EObject b, EObject d, EObject a, EObject z, EObject b2y, EObject l2z, EObject l, EObject x) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch c, Branch y, Command z, Command x) {

		Object[] result1_black = decal2branchcbImpl.pattern_decal2branchcb_10_1_initialbindings_blackBBBBBB(this, match,
				c, y, z, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", "
					+ "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = decal2branchcbImpl
				.pattern_decal2branchcb_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, c, y, z, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", "
					+ "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decal2branchcbImpl.pattern_decal2branchcb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decal2branchcbImpl
					.pattern_decal2branchcb_10_4_collectelementstobetranslated_blackBBBBB(match, c, y, z, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			decal2branchcbImpl.pattern_decal2branchcb_10_4_collectelementstobetranslated_greenBBBBBFFF(match, c, y, z,
					x);
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge z__y____next = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decal2branchcbImpl
					.pattern_decal2branchcb_10_5_collectcontextelements_blackBBBBB(match, c, y, z, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			decal2branchcbImpl.pattern_decal2branchcb_10_5_collectcontextelements_greenBB(match, c);

			// 
			decal2branchcbImpl.pattern_decal2branchcb_10_6_registerobjectstomatch_expressionBBBBBB(this, match, c, y, z,
					x);
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
		Branch c = (Branch) result1_bindingAndBlack[0];
		Branch y = (Branch) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		Decision d = (Decision) result1_bindingAndBlack[3];
		Command z = (Command) result1_bindingAndBlack[4];
		Command x = (Command) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decal2branchcbImpl.pattern_decal2branchcb_11_1_performtransformation_greenFBFBFBFFFB(y,
				d, z, x);
		S2N a2x = (S2N) result1_green[0];
		While b = (While) result1_green[2];
		Assignment a = (Assignment) result1_green[4];
		S2B b2y = (S2B) result1_green[6];
		S2N l2z = (S2N) result1_green[7];
		Assignment l = (Assignment) result1_green[8];

		Object[] result2_black = decal2branchcbImpl
				.pattern_decal2branchcb_11_2_collecttranslatedelements_blackBBBBBBBBB(a2x, y, b, a, z, b2y, l2z, l, x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[y] = "
					+ y + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[b2y] = " + b2y
					+ ", " + "[l2z] = " + l2z + ", " + "[l] = " + l + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = decal2branchcbImpl
				.pattern_decal2branchcb_11_2_collecttranslatedelements_greenFBBBBBBBBB(a2x, y, b, a, z, b2y, l2z, l, x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decal2branchcbImpl.pattern_decal2branchcb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, c, a2x, y, d2c, b, d, a, z, b2y, l2z, l, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[d2c] = " + d2c
					+ ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[z] = " + z + ", "
					+ "[b2y] = " + b2y + ", " + "[l2z] = " + l2z + ", " + "[l] = " + l + ", " + "[x] = " + x + ".");
		}
		decal2branchcbImpl.pattern_decal2branchcb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, c,
				a2x, y, b, d, a, z, b2y, l2z, l, x);
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[23];

		// 
		// 
		decal2branchcbImpl.pattern_decal2branchcb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, c,
				a2x, y, d2c, b, d, a, z, b2y, l2z, l, x);
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
		Branch c = (Branch) result2_binding[0];
		Branch y = (Branch) result2_binding[1];
		Command z = (Command) result2_binding[2];
		Command x = (Command) result2_binding[3];
		for (Object[] result2_black : decal2branchcbImpl.pattern_decal2branchcb_12_2_corematch_blackBBFFBBB(c, y, z, x,
				match)) {
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[3];
			// ForEach 
			for (Object[] result3_black : decal2branchcbImpl.pattern_decal2branchcb_12_3_findcontext_blackBBBBBB(c, y,
					d2c, d, z, x)) {
				Object[] result3_green = decal2branchcbImpl.pattern_decal2branchcb_12_3_findcontext_greenBBBBBBFFFFFF(c,
						y, d2c, d, z, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decal2branchcbImpl
						.pattern_decal2branchcb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, c, y,
								d2c, d, z, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[y] = " + y
							+ ", " + "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[z] = " + z + ", " + "[x] = " + x
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
	public void registerObjectsToMatch_BWD(Match match, Branch c, Branch y, Command z, Command x) {
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
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch c, Branch y, Command z, Command x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch c, Branch y, S2B d2c, Decision d,
			Command z, Command x) {// Create CSP
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
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("z", z);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c, EObject a2x, EObject y, EObject d2c,
			EObject b, EObject d, EObject a, EObject z, EObject b2y, EObject l2z, EObject l, EObject x) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_32(EMoflonEdge _edge_positive) {

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
			Branch c = (Branch) result2_black[0];
			Branch y = (Branch) result2_black[1];
			Command z = (Command) result2_black[2];
			Command x = (Command) result2_black[3];
			Object[] result2_green = decal2branchcbImpl
					.pattern_decal2branchcb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decal2branchcbImpl
					.pattern_decal2branchcb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, c, y, z, x)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_32(EMoflonEdge _edge_last) {

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
				.pattern_decal2branchcb_21_2_testcorematchandDECs_blackFFFFB(_edge_last)) {
			While b = (While) result2_black[0];
			Decision d = (Decision) result2_black[1];
			Assignment a = (Assignment) result2_black[2];
			Assignment l = (Assignment) result2_black[3];
			Object[] result2_green = decal2branchcbImpl
					.pattern_decal2branchcb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decal2branchcbImpl
					.pattern_decal2branchcb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, b, d, a, l)) {
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
		Branch c = (Branch) result2_bindingAndBlack[0];
		Branch y = (Branch) result2_bindingAndBlack[1];
		While b = (While) result2_bindingAndBlack[2];
		Decision d = (Decision) result2_bindingAndBlack[3];
		Assignment a = (Assignment) result2_bindingAndBlack[4];
		Command z = (Command) result2_bindingAndBlack[5];
		Assignment l = (Assignment) result2_bindingAndBlack[6];
		Command x = (Command) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decal2branchcbImpl
				.pattern_decal2branchcb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, c, y, b, d, a, z, l, x,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = "
					+ a + ", " + "[z] = " + z + ", " + "[l] = " + l + ", " + "[x] = " + x + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decal2branchcbImpl.pattern_decal2branchcb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decal2branchcbImpl.pattern_decal2branchcb_24_5_matchcorrcontext_blackBFBBB(c,
					d, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[1];
				Object[] result5_green = decal2branchcbImpl.pattern_decal2branchcb_24_5_matchcorrcontext_greenBBBF(d2c,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decal2branchcbImpl
						.pattern_decal2branchcb_24_6_createcorrespondence_blackBBBBBBBBB(c, y, b, d, a, z, l, x,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
							+ "[y] = " + y + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[a] = " + a + ", "
							+ "[z] = " + z + ", " + "[l] = " + l + ", " + "[x] = " + x + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decal2branchcbImpl.pattern_decal2branchcb_24_6_createcorrespondence_greenFBBBBFFBBB(y, b, a, z, l, x,
						ccMatch);
				//nothing S2N a2x = (S2N) result6_green[0];
				//nothing S2B b2y = (S2B) result6_green[5];
				//nothing S2N l2z = (S2N) result6_green[6];

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
	public CSP isApplicable_solveCsp_CC(Branch c, Branch y, While b, Decision d, Assignment a, Command z, Assignment l,
			Command x, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While b, Decision d, Assignment a, Assignment l) {// 
		Object[] result1_black = decal2branchcbImpl.pattern_decal2branchcb_27_1_matchtggpattern_blackBBBB(b, d, a, l);
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
	public boolean checkDEC_BWD(Branch c, Branch y, Command z, Command x) {// 
		Object[] result1_black = decal2branchcbImpl.pattern_decal2branchcb_28_1_matchtggpattern_blackBBBB(c, y, z, x);
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
			Branch c = (Branch) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = decal2branchcbImpl
					.pattern_decal2branchcb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, c, d2c, d,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d2c] = " + d2c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decal2branchcbImpl.pattern_decal2branchcb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decal2branchcbImpl.pattern_decal2branchcb_29_5_checknacs_blackBBB(c, d2c, d);
				if (result5_black != null) {

					Object[] result6_black = decal2branchcbImpl.pattern_decal2branchcb_29_6_perform_blackBBBB(c, d2c, d,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
								+ "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decal2branchcbImpl.pattern_decal2branchcb_29_6_perform_greenBFFFBFFFFFFB(c, d, ruleResult);
					//nothing S2N a2x = (S2N) result6_green[1];
					//nothing Branch y = (Branch) result6_green[2];
					//nothing While b = (While) result6_green[3];
					//nothing Assignment a = (Assignment) result6_green[5];
					//nothing Command z = (Command) result6_green[6];
					//nothing S2B b2y = (S2B) result6_green[7];
					//nothing S2N l2z = (S2N) result6_green[8];
					//nothing Assignment l = (Assignment) result6_green[9];
					//nothing Command x = (Command) result6_green[10];

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
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_FWD__MATCH_WHILE_DECISION_ASSIGNMENT_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2),
					(Assignment) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.DECAL2BRANCHCB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_DECISION_ASSIGNMENT_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2),
					(Assignment) arguments.get(3), (Assignment) arguments.get(4));
			return null;
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_DECISION_ASSIGNMENT_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Decision) arguments.get(2), (Assignment) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_S2B_WHILE_DECISION_ASSIGNMENT_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(Assignment) arguments.get(5), (Assignment) arguments.get(6));
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
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECAL2BRANCHCB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Command) arguments.get(4));
			return null;
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_BRANCH_S2B_DECISION_COMMAND_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (Decision) arguments.get(4),
					(Command) arguments.get(5), (Command) arguments.get(6));
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
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_32__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_32((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_32__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_32((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_BRANCH_WHILE_DECISION_ASSIGNMENT_COMMAND_ASSIGNMENT_COMMAND_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3), (Assignment) arguments.get(4),
					(Command) arguments.get(5), (Assignment) arguments.get(6), (Command) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECAL2BRANCHCB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECAL2BRANCHCB___CHECK_DEC_FWD__WHILE_DECISION_ASSIGNMENT_ASSIGNMENT:
			return checkDEC_FWD((While) arguments.get(0), (Decision) arguments.get(1), (Assignment) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.DECAL2BRANCHCB___CHECK_DEC_BWD__BRANCH_BRANCH_COMMAND_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.DECAL2BRANCHCB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECAL2BRANCHCB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Decision) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECAL2BRANCHCB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decal2branchcb_0_1_initialbindings_blackBBBBBB(decal2branchcb _this,
			Match match, While b, Decision d, Assignment a, Assignment l) {
		if (!a.equals(l)) {
			return new Object[] { _this, match, b, d, a, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_0_2_SolveCSP_bindingFBBBBBB(decal2branchcb _this, Match match,
			While b, Decision d, Assignment a, Assignment l) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, d, a, l);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, d, a, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decal2branchcb_0_2_SolveCSP_bindingAndBlackFBBBBBB(decal2branchcb _this,
			Match match, While b, Decision d, Assignment a, Assignment l) {
		Object[] result_pattern_decal2branchcb_0_2_SolveCSP_binding = pattern_decal2branchcb_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, b, d, a, l);
		if (result_pattern_decal2branchcb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decal2branchcb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decal2branchcb_0_2_SolveCSP_black = pattern_decal2branchcb_0_2_SolveCSP_blackB(csp);
			if (result_pattern_decal2branchcb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, d, a, l };
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
			While b, Decision d, Assignment a, Assignment l) {
		if (!a.equals(l)) {
			return new Object[] { match, b, d, a, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			While b, Decision d, Assignment a, Assignment l) {
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(l);
		String b__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String d__a____positive_name_prime = "positive";
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(b__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		b__l____last.setName(b__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { match, b, d, a, l, b__l____last, d__b____negative, d__a____positive };
	}

	public static final Object[] pattern_decal2branchcb_0_5_collectcontextelements_blackBBBBB(Match match, While b,
			Decision d, Assignment a, Assignment l) {
		if (!a.equals(l)) {
			return new Object[] { match, b, d, a, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decal2branchcb_0_6_registerobjectstomatch_expressionBBBBBB(decal2branchcb _this,
			Match match, While b, Decision d, Assignment a, Assignment l) {
		_this.registerObjectsToMatch_FWD(match, b, d, a, l);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("b");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("a");
		EObject _localVariable_5 = isApplicableMatch.getObject("l");
		EObject tmpC = _localVariable_0;
		EObject tmpD2c = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpL = _localVariable_5;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpD2c instanceof S2B) {
				S2B d2c = (S2B) tmpD2c;
				if (tmpB instanceof While) {
					While b = (While) tmpB;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpA instanceof Assignment) {
							Assignment a = (Assignment) tmpA;
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								return new Object[] { c, d2c, b, d, a, l, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_1_1_performtransformation_blackBBBBBBFBB(Branch c, S2B d2c,
			While b, Decision d, Assignment a, Assignment l, decal2branchcb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(l)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { c, d2c, b, d, a, l, csp, _this, isApplicableMatch };
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
			Branch c = (Branch) result_pattern_decal2branchcb_1_1_performtransformation_binding[0];
			S2B d2c = (S2B) result_pattern_decal2branchcb_1_1_performtransformation_binding[1];
			While b = (While) result_pattern_decal2branchcb_1_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_decal2branchcb_1_1_performtransformation_binding[3];
			Assignment a = (Assignment) result_pattern_decal2branchcb_1_1_performtransformation_binding[4];
			Assignment l = (Assignment) result_pattern_decal2branchcb_1_1_performtransformation_binding[5];

			Object[] result_pattern_decal2branchcb_1_1_performtransformation_black = pattern_decal2branchcb_1_1_performtransformation_blackBBBBBBFBB(
					c, d2c, b, d, a, l, _this, isApplicableMatch);
			if (result_pattern_decal2branchcb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decal2branchcb_1_1_performtransformation_black[6];

				return new Object[] { c, d2c, b, d, a, l, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_1_1_performtransformation_greenBFFBBFFFBF(Branch c, While b,
			Assignment a, Assignment l) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		a2x.setSource(a);
		c.setNegative(y);
		z.setNext(y);
		b2y.setTarget(y);
		b2y.setSource(b);
		l2z.setTarget(z);
		l2z.setSource(l);
		c.setPositive(x);
		a2x.setTarget(x);
		return new Object[] { c, a2x, y, b, a, z, b2y, l2z, l, x };
	}

	public static final Object[] pattern_decal2branchcb_1_2_collecttranslatedelements_blackBBBBBBBBB(S2N a2x, Branch y,
			While b, Assignment a, Command z, S2B b2y, S2N l2z, Assignment l, Command x) {
		if (!a2x.equals(l2z)) {
			if (!a.equals(l)) {
				if (!x.equals(z)) {
					return new Object[] { a2x, y, b, a, z, b2y, l2z, l, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_1_2_collecttranslatedelements_greenFBBBBBBBBB(S2N a2x, Branch y,
			While b, Assignment a, Command z, S2B b2y, S2N l2z, Assignment l, Command x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedElements().add(x);
		return new Object[] { ruleresult, a2x, y, b, a, z, b2y, l2z, l, x };
	}

	public static final Object[] pattern_decal2branchcb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject y, EObject d2c, EObject b, EObject d,
			EObject a, EObject z, EObject b2y, EObject l2z, EObject l, EObject x) {
		if (!c.equals(y)) {
			if (!c.equals(d2c)) {
				if (!c.equals(d)) {
					if (!c.equals(z)) {
						if (!c.equals(l2z)) {
							if (!c.equals(l)) {
								if (!c.equals(x)) {
									if (!a2x.equals(c)) {
										if (!a2x.equals(y)) {
											if (!a2x.equals(d2c)) {
												if (!a2x.equals(b)) {
													if (!a2x.equals(d)) {
														if (!a2x.equals(z)) {
															if (!a2x.equals(b2y)) {
																if (!a2x.equals(l2z)) {
																	if (!a2x.equals(l)) {
																		if (!a2x.equals(x)) {
																			if (!y.equals(z)) {
																				if (!d2c.equals(y)) {
																					if (!d2c.equals(z)) {
																						if (!d2c.equals(l2z)) {
																							if (!d2c.equals(l)) {
																								if (!d2c.equals(x)) {
																									if (!b.equals(c)) {
																										if (!b.equals(
																												y)) {
																											if (!b.equals(
																													d2c)) {
																												if (!b.equals(
																														d)) {
																													if (!b.equals(
																															z)) {
																														if (!b.equals(
																																b2y)) {
																															if (!b.equals(
																																	l2z)) {
																																if (!b.equals(
																																		l)) {
																																	if (!b.equals(
																																			x)) {
																																		if (!d.equals(
																																				y)) {
																																			if (!d.equals(
																																					d2c)) {
																																				if (!d.equals(
																																						z)) {
																																					if (!d.equals(
																																							l2z)) {
																																						if (!d.equals(
																																								l)) {
																																							if (!d.equals(
																																									x)) {
																																								if (!a.equals(
																																										c)) {
																																									if (!a.equals(
																																											a2x)) {
																																										if (!a.equals(
																																												y)) {
																																											if (!a.equals(
																																													d2c)) {
																																												if (!a.equals(
																																														b)) {
																																													if (!a.equals(
																																															d)) {
																																														if (!a.equals(
																																																z)) {
																																															if (!a.equals(
																																																	b2y)) {
																																																if (!a.equals(
																																																		l2z)) {
																																																	if (!a.equals(
																																																			l)) {
																																																		if (!a.equals(
																																																				x)) {
																																																			if (!b2y.equals(
																																																					c)) {
																																																				if (!b2y.equals(
																																																						y)) {
																																																					if (!b2y.equals(
																																																							d2c)) {
																																																						if (!b2y.equals(
																																																								d)) {
																																																							if (!b2y.equals(
																																																									z)) {
																																																								if (!b2y.equals(
																																																										l2z)) {
																																																									if (!b2y.equals(
																																																											l)) {
																																																										if (!b2y.equals(
																																																												x)) {
																																																											if (!l2z.equals(
																																																													y)) {
																																																												if (!l2z.equals(
																																																														z)) {
																																																													if (!l2z.equals(
																																																															x)) {
																																																														if (!l.equals(
																																																																y)) {
																																																															if (!l.equals(
																																																																	z)) {
																																																																if (!l.equals(
																																																																		l2z)) {
																																																																	if (!l.equals(
																																																																			x)) {
																																																																		if (!x.equals(
																																																																				y)) {
																																																																			if (!x.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						c,
																																																																						a2x,
																																																																						y,
																																																																						d2c,
																																																																						b,
																																																																						d,
																																																																						a,
																																																																						z,
																																																																						b2y,
																																																																						l2z,
																																																																						l,
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

	public static final Object[] pattern_decal2branchcb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject y, EObject b, EObject d, EObject a, EObject z,
			EObject b2y, EObject l2z, EObject l, EObject x) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decal2branchcb";
		String c__x____positive_name_prime = "positive";
		String b__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String c__y____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String z__y____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String l2z__l____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
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
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(z__y____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, c, a2x, y, b, d, a, z, b2y, l2z, l, x, c__x____positive, b__l____last,
				d__b____negative, c__y____negative, a2x__a____source, z__y____next, b2y__y____target, b2y__b____source,
				l2z__z____target, d__a____positive, l2z__l____source, a2x__x____target };
	}

	public static final void pattern_decal2branchcb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(decal2branchcb _this,
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject y, EObject d2c, EObject b, EObject d,
			EObject a, EObject z, EObject b2y, EObject l2z, EObject l, EObject x) {
		_this.registerObjects_FWD(ruleresult, c, a2x, y, d2c, b, d, a, z, b2y, l2z, l, x);

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
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("d");
		EObject _localVariable_2 = match.getObject("a");
		EObject _localVariable_3 = match.getObject("l");
		EObject tmpB = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpL = _localVariable_3;
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			if (tmpD instanceof Decision) {
				Decision d = (Decision) tmpD;
				if (tmpA instanceof Assignment) {
					Assignment a = (Assignment) tmpA;
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						return new Object[] { b, d, a, l, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_2_2_corematch_blackFFBBBBB(While b, Decision d,
			Assignment a, Assignment l, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(l)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { c, d2c, b, d, a, l, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_2_3_findcontext_blackBBBBBB(Branch c, S2B d2c,
			While b, Decision d, Assignment a, Assignment l) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(l)) {
			if (c.equals(d2c.getTarget())) {
				if (l.equals(b.getLast())) {
					if (b.equals(d.getNegative())) {
						if (d.equals(d2c.getSource())) {
							if (a.equals(d.getPositive())) {
								_result.add(new Object[] { c, d2c, b, d, a, l });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_2_3_findcontext_greenBBBBBBFFFFFF(Branch c, S2B d2c, While b,
			Decision d, Assignment a, Assignment l) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String b__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		String d__a____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(l);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(b__l____last);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__c____target.setName(d2c__c____target_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		return new Object[] { c, d2c, b, d, a, l, isApplicableMatch, d2c__c____target, b__l____last, d__b____negative,
				d2c__d____source, d__a____positive };
	}

	public static final Object[] pattern_decal2branchcb_2_4_solveCSP_bindingFBBBBBBBB(decal2branchcb _this,
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, While b, Decision d, Assignment a, Assignment l) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, d2c, b, d, a, l);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d2c, b, d, a, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decal2branchcb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decal2branchcb _this,
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, While b, Decision d, Assignment a, Assignment l) {
		Object[] result_pattern_decal2branchcb_2_4_solveCSP_binding = pattern_decal2branchcb_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, c, d2c, b, d, a, l);
		if (result_pattern_decal2branchcb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decal2branchcb_2_4_solveCSP_binding[0];

			Object[] result_pattern_decal2branchcb_2_4_solveCSP_black = pattern_decal2branchcb_2_4_solveCSP_blackB(csp);
			if (result_pattern_decal2branchcb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d2c, b, d, a, l };
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
			Match match, Branch c, Branch y, Command z, Command x) {
		if (!c.equals(y)) {
			if (!x.equals(z)) {
				return new Object[] { _this, match, c, y, z, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_10_2_SolveCSP_bindingFBBBBBB(decal2branchcb _this, Match match,
			Branch c, Branch y, Command z, Command x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, c, y, z, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, y, z, x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decal2branchcb_10_2_SolveCSP_bindingAndBlackFBBBBBB(decal2branchcb _this,
			Match match, Branch c, Branch y, Command z, Command x) {
		Object[] result_pattern_decal2branchcb_10_2_SolveCSP_binding = pattern_decal2branchcb_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, c, y, z, x);
		if (result_pattern_decal2branchcb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decal2branchcb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decal2branchcb_10_2_SolveCSP_black = pattern_decal2branchcb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decal2branchcb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, y, z, x };
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
			Branch c, Branch y, Command z, Command x) {
		if (!c.equals(y)) {
			if (!x.equals(z)) {
				return new Object[] { match, c, y, z, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_10_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Branch c, Branch y, Command z, Command x) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String z__y____next_name_prime = "next";
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(z__y____next);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		return new Object[] { match, c, y, z, x, c__x____positive, c__y____negative, z__y____next };
	}

	public static final Object[] pattern_decal2branchcb_10_5_collectcontextelements_blackBBBBB(Match match, Branch c,
			Branch y, Command z, Command x) {
		if (!c.equals(y)) {
			if (!x.equals(z)) {
				return new Object[] { match, c, y, z, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decal2branchcb_10_6_registerobjectstomatch_expressionBBBBBB(decal2branchcb _this,
			Match match, Branch c, Branch y, Command z, Command x) {
		_this.registerObjectsToMatch_BWD(match, c, y, z, x);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("y");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("z");
		EObject _localVariable_5 = isApplicableMatch.getObject("x");
		EObject tmpC = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpX = _localVariable_5;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpY instanceof Branch) {
				Branch y = (Branch) tmpY;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpZ instanceof Command) {
							Command z = (Command) tmpZ;
							if (tmpX instanceof Command) {
								Command x = (Command) tmpX;
								return new Object[] { c, y, d2c, d, z, x, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_11_1_performtransformation_blackBBBBBBFBB(Branch c, Branch y,
			S2B d2c, Decision d, Command z, Command x, decal2branchcb _this, IsApplicableMatch isApplicableMatch) {
		if (!c.equals(y)) {
			if (!x.equals(z)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { c, y, d2c, d, z, x, csp, _this, isApplicableMatch };
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
			Branch c = (Branch) result_pattern_decal2branchcb_11_1_performtransformation_binding[0];
			Branch y = (Branch) result_pattern_decal2branchcb_11_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_decal2branchcb_11_1_performtransformation_binding[2];
			Decision d = (Decision) result_pattern_decal2branchcb_11_1_performtransformation_binding[3];
			Command z = (Command) result_pattern_decal2branchcb_11_1_performtransformation_binding[4];
			Command x = (Command) result_pattern_decal2branchcb_11_1_performtransformation_binding[5];

			Object[] result_pattern_decal2branchcb_11_1_performtransformation_black = pattern_decal2branchcb_11_1_performtransformation_blackBBBBBBFBB(
					c, y, d2c, d, z, x, _this, isApplicableMatch);
			if (result_pattern_decal2branchcb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decal2branchcb_11_1_performtransformation_black[6];

				return new Object[] { c, y, d2c, d, z, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_11_1_performtransformation_greenFBFBFBFFFB(Branch y, Decision d,
			Command z, Command x) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		a2x.setTarget(x);
		d.setNegative(b);
		a2x.setSource(a);
		d.setPositive(a);
		b2y.setTarget(y);
		b2y.setSource(b);
		l2z.setTarget(z);
		b.setLast(l);
		l2z.setSource(l);
		return new Object[] { a2x, y, b, d, a, z, b2y, l2z, l, x };
	}

	public static final Object[] pattern_decal2branchcb_11_2_collecttranslatedelements_blackBBBBBBBBB(S2N a2x, Branch y,
			While b, Assignment a, Command z, S2B b2y, S2N l2z, Assignment l, Command x) {
		if (!a2x.equals(l2z)) {
			if (!a.equals(l)) {
				if (!x.equals(z)) {
					return new Object[] { a2x, y, b, a, z, b2y, l2z, l, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_11_2_collecttranslatedelements_greenFBBBBBBBBB(S2N a2x,
			Branch y, While b, Assignment a, Command z, S2B b2y, S2N l2z, Assignment l, Command x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getTranslatedElements().add(x);
		return new Object[] { ruleresult, a2x, y, b, a, z, b2y, l2z, l, x };
	}

	public static final Object[] pattern_decal2branchcb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject y, EObject d2c, EObject b, EObject d,
			EObject a, EObject z, EObject b2y, EObject l2z, EObject l, EObject x) {
		if (!c.equals(y)) {
			if (!c.equals(d2c)) {
				if (!c.equals(d)) {
					if (!c.equals(z)) {
						if (!c.equals(l2z)) {
							if (!c.equals(l)) {
								if (!c.equals(x)) {
									if (!a2x.equals(c)) {
										if (!a2x.equals(y)) {
											if (!a2x.equals(d2c)) {
												if (!a2x.equals(b)) {
													if (!a2x.equals(d)) {
														if (!a2x.equals(z)) {
															if (!a2x.equals(b2y)) {
																if (!a2x.equals(l2z)) {
																	if (!a2x.equals(l)) {
																		if (!a2x.equals(x)) {
																			if (!y.equals(z)) {
																				if (!d2c.equals(y)) {
																					if (!d2c.equals(z)) {
																						if (!d2c.equals(l2z)) {
																							if (!d2c.equals(l)) {
																								if (!d2c.equals(x)) {
																									if (!b.equals(c)) {
																										if (!b.equals(
																												y)) {
																											if (!b.equals(
																													d2c)) {
																												if (!b.equals(
																														d)) {
																													if (!b.equals(
																															z)) {
																														if (!b.equals(
																																b2y)) {
																															if (!b.equals(
																																	l2z)) {
																																if (!b.equals(
																																		l)) {
																																	if (!b.equals(
																																			x)) {
																																		if (!d.equals(
																																				y)) {
																																			if (!d.equals(
																																					d2c)) {
																																				if (!d.equals(
																																						z)) {
																																					if (!d.equals(
																																							l2z)) {
																																						if (!d.equals(
																																								l)) {
																																							if (!d.equals(
																																									x)) {
																																								if (!a.equals(
																																										c)) {
																																									if (!a.equals(
																																											a2x)) {
																																										if (!a.equals(
																																												y)) {
																																											if (!a.equals(
																																													d2c)) {
																																												if (!a.equals(
																																														b)) {
																																													if (!a.equals(
																																															d)) {
																																														if (!a.equals(
																																																z)) {
																																															if (!a.equals(
																																																	b2y)) {
																																																if (!a.equals(
																																																		l2z)) {
																																																	if (!a.equals(
																																																			l)) {
																																																		if (!a.equals(
																																																				x)) {
																																																			if (!b2y.equals(
																																																					c)) {
																																																				if (!b2y.equals(
																																																						y)) {
																																																					if (!b2y.equals(
																																																							d2c)) {
																																																						if (!b2y.equals(
																																																								d)) {
																																																							if (!b2y.equals(
																																																									z)) {
																																																								if (!b2y.equals(
																																																										l2z)) {
																																																									if (!b2y.equals(
																																																											l)) {
																																																										if (!b2y.equals(
																																																												x)) {
																																																											if (!l2z.equals(
																																																													y)) {
																																																												if (!l2z.equals(
																																																														z)) {
																																																													if (!l2z.equals(
																																																															x)) {
																																																														if (!l.equals(
																																																																y)) {
																																																															if (!l.equals(
																																																																	z)) {
																																																																if (!l.equals(
																																																																		l2z)) {
																																																																	if (!l.equals(
																																																																			x)) {
																																																																		if (!x.equals(
																																																																				y)) {
																																																																			if (!x.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						c,
																																																																						a2x,
																																																																						y,
																																																																						d2c,
																																																																						b,
																																																																						d,
																																																																						a,
																																																																						z,
																																																																						b2y,
																																																																						l2z,
																																																																						l,
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

	public static final Object[] pattern_decal2branchcb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject y, EObject b, EObject d, EObject a, EObject z,
			EObject b2y, EObject l2z, EObject l, EObject x) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decal2branchcb";
		String c__x____positive_name_prime = "positive";
		String b__l____last_name_prime = "last";
		String d__b____negative_name_prime = "negative";
		String c__y____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String z__y____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String l2z__l____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
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
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(z__y____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, c, a2x, y, b, d, a, z, b2y, l2z, l, x, c__x____positive, b__l____last,
				d__b____negative, c__y____negative, a2x__a____source, z__y____next, b2y__y____target, b2y__b____source,
				l2z__z____target, d__a____positive, l2z__l____source, a2x__x____target };
	}

	public static final void pattern_decal2branchcb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(decal2branchcb _this,
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject y, EObject d2c, EObject b, EObject d,
			EObject a, EObject z, EObject b2y, EObject l2z, EObject l, EObject x) {
		_this.registerObjects_BWD(ruleresult, c, a2x, y, d2c, b, d, a, z, b2y, l2z, l, x);

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
			if (tmpY instanceof Branch) {
				Branch y = (Branch) tmpY;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpX instanceof Command) {
						Command x = (Command) tmpX;
						return new Object[] { c, y, z, x, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_12_2_corematch_blackBBFFBBB(Branch c, Branch y,
			Command z, Command x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(y)) {
			if (!x.equals(z)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
						"target")) {
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						_result.add(new Object[] { c, y, d2c, d, z, x, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_12_3_findcontext_blackBBBBBB(Branch c, Branch y,
			S2B d2c, Decision d, Command z, Command x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(y)) {
			if (!x.equals(z)) {
				if (c.equals(d2c.getTarget())) {
					if (x.equals(c.getPositive())) {
						if (y.equals(c.getNegative())) {
							if (d.equals(d2c.getSource())) {
								if (y.equals(z.getNext())) {
									_result.add(new Object[] { c, y, d2c, d, z, x });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_12_3_findcontext_greenBBBBBBFFFFFF(Branch c, Branch y, S2B d2c,
			Decision d, Command z, Command x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String c__x____positive_name_prime = "positive";
		String c__y____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		String z__y____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(x);
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
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(z__y____next);
		d2c__c____target.setName(d2c__c____target_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		return new Object[] { c, y, d2c, d, z, x, isApplicableMatch, d2c__c____target, c__x____positive,
				c__y____negative, d2c__d____source, z__y____next };
	}

	public static final Object[] pattern_decal2branchcb_12_4_solveCSP_bindingFBBBBBBBB(decal2branchcb _this,
			IsApplicableMatch isApplicableMatch, Branch c, Branch y, S2B d2c, Decision d, Command z, Command x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, c, y, d2c, d, z, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, y, d2c, d, z, x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decal2branchcb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(decal2branchcb _this,
			IsApplicableMatch isApplicableMatch, Branch c, Branch y, S2B d2c, Decision d, Command z, Command x) {
		Object[] result_pattern_decal2branchcb_12_4_solveCSP_binding = pattern_decal2branchcb_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, c, y, d2c, d, z, x);
		if (result_pattern_decal2branchcb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decal2branchcb_12_4_solveCSP_binding[0];

			Object[] result_pattern_decal2branchcb_12_4_solveCSP_black = pattern_decal2branchcb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decal2branchcb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, y, d2c, d, z, x };
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

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_0B(Branch y) {
		for (Graph __DEC_y_root_996858 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_1BB(Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_positive_588037 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_y_positive_588037)) {
					if (!c.equals(__DEC_y_positive_588037)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_2BB(Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_negative_89361 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_y_negative_89361)) {
					if (!c.equals(__DEC_y_negative_89361)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_532587 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_4BBB(Command z, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_z_positive_4608 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_z_positive_4608)) {
					if (!y.equals(__DEC_z_positive_4608)) {
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
			for (Branch __DEC_z_negative_856907 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_z_negative_856907)) {
					if (!y.equals(__DEC_z_negative_856907)) {
						return new Object[] { z, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_6B(Command x) {
		for (Graph __DEC_x_root_707613 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_7BBB(Command x, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_positive_515432 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_x_positive_515432)) {
					if (!y.equals(__DEC_x_positive_515432)) {
						return new Object[] { x, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_8BBB(Command x, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_negative_32437 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_x_negative_32437)) {
					if (!y.equals(__DEC_x_negative_32437)) {
						return new Object[] { x, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_9BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_10BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_11BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_13BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_14BB(Branch y, Command x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_15BB(Branch c, Command x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_16BB(Branch y, Command x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
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
							if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_6B(x) == null) {
								if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_15BB(c, x) == null) {
									if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_0B(y) == null) {
										if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_1BB(y,
												c) == null) {
											if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_2BB(y,
													c) == null) {
												if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_7BBB(x,
														c, y) == null) {
													if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_8BBB(
															x, c, y) == null) {
														if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_9BB(
																c, y) == null) {
															if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_14BB(
																	y, x) == null) {
																if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_16BB(
																		y, x) == null) {
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
																							if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_10BB(
																									c, z) == null) {
																								if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_11BB(
																										y, z) == null) {
																									if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_12BB(
																											c,
																											z) == null) {
																										if (pattern_decal2branchcb_20_2_testcorematchandDECs_black_nac_13BB(
																												y,
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
			decal2branchcb _this, Match match, Branch c, Branch y, Command z, Command x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, c, y, z, x);
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

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_0BB(While b, Decision d) {
		for (Decision __DEC_b_positive_857147 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_857147)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_1B(While b) {
		for (While __DEC_b_first_879961 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_879961)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_2B(While b) {
		for (While __DEC_b_last_377408 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_377408)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_3B(While b) {
		for (Program __DEC_b_first_735146 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_4BB(Assignment a,
			Decision d) {
		for (Decision __DEC_a_negative_384209 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_384209)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_5BB(Assignment a, While b) {
		for (While __DEC_a_first_964153 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_964153)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_6BB(Assignment a, While b) {
		for (While __DEC_a_last_490312 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_490312)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_7B(Assignment a) {
		for (Program __DEC_a_first_23942 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_8BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_287147 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_287147)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_9BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_114593 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_114593)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_10BB(Assignment l,
			While b) {
		for (While __DEC_l_first_105074 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!b.equals(__DEC_l_first_105074)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_11BB(Assignment l,
			While b) {
		for (While __DEC_l_last_692902 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_692902)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_12B(Assignment l) {
		for (Program __DEC_l_first_6908 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_13BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_14BB(Decision d,
			Assignment a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_15BB(While b,
			Assignment a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_16BB(While b,
			Assignment a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_17BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_18BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_19BB(While b,
			Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpB = _edge_last.getSrc();
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			EObject tmpL = _edge_last.getTrg();
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (l.equals(b.getLast())) {
					if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_1B(b) == null) {
						if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_2B(b) == null) {
							if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_3B(b) == null) {
								if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_10BB(l, b) == null) {
									if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_11BB(l, b) == null) {
										if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_12B(l) == null) {
											if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_19BB(b,
													l) == null) {
												for (Decision d : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(b, Decision.class, "negative")) {
													Statement tmpA = d.getPositive();
													if (tmpA instanceof Assignment) {
														Assignment a = (Assignment) tmpA;
														if (!a.equals(l)) {
															if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_0BB(
																	b, d) == null) {
																if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_8BB(
																		l, d) == null) {
																	if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_9BB(
																			l, d) == null) {
																		if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_13BB(
																				d, b) == null) {
																			if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_17BB(
																					d, l) == null) {
																				if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_18BB(
																						d, l) == null) {
																					if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_4BB(
																							a, d) == null) {
																						if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_5BB(
																								a, b) == null) {
																							if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_6BB(
																									a, b) == null) {
																								if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_7B(
																										a) == null) {
																									if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_14BB(
																											d,
																											a) == null) {
																										if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_15BB(
																												b,
																												a) == null) {
																											if (pattern_decal2branchcb_21_2_testcorematchandDECs_black_nac_16BB(
																													b,
																													a) == null) {
																												_result.add(
																														new Object[] {
																																b,
																																d,
																																a,
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
			decal2branchcb _this, Match match, While b, Decision d, Assignment a, Assignment l) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, d, a, l);
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

	public static final Object[] pattern_decal2branchcb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("c");
		EObject _localVariable_1 = targetMatch.getObject("y");
		EObject _localVariable_2 = sourceMatch.getObject("b");
		EObject _localVariable_3 = sourceMatch.getObject("d");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = targetMatch.getObject("z");
		EObject _localVariable_6 = sourceMatch.getObject("l");
		EObject _localVariable_7 = targetMatch.getObject("x");
		EObject tmpC = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		EObject tmpL = _localVariable_6;
		EObject tmpX = _localVariable_7;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpY instanceof Branch) {
				Branch y = (Branch) tmpY;
				if (tmpB instanceof While) {
					While b = (While) tmpB;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						if (tmpA instanceof Assignment) {
							Assignment a = (Assignment) tmpA;
							if (tmpZ instanceof Command) {
								Command z = (Command) tmpZ;
								if (tmpL instanceof Assignment) {
									Assignment l = (Assignment) tmpL;
									if (tmpX instanceof Command) {
										Command x = (Command) tmpX;
										return new Object[] { c, y, b, d, a, z, l, x, targetMatch, sourceMatch };
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

	public static final Object[] pattern_decal2branchcb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Branch c, Branch y,
			While b, Decision d, Assignment a, Command z, Assignment l, Command x, Match sourceMatch,
			Match targetMatch) {
		if (!c.equals(y)) {
			if (!a.equals(l)) {
				if (!x.equals(z)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { c, y, b, d, a, z, l, x, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding = pattern_decal2branchcb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding != null) {
			Branch c = (Branch) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[0];
			Branch y = (Branch) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[1];
			While b = (While) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[2];
			Decision d = (Decision) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[3];
			Assignment a = (Assignment) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[4];
			Command z = (Command) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[5];
			Assignment l = (Assignment) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[6];
			Command x = (Command) result_pattern_decal2branchcb_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decal2branchcb_24_2_matchsrctrgcontext_black = pattern_decal2branchcb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					c, y, b, d, a, z, l, x, sourceMatch, targetMatch);
			if (result_pattern_decal2branchcb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { c, y, b, d, a, z, l, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_24_3_solvecsp_bindingFBBBBBBBBBBB(decal2branchcb _this,
			Branch c, Branch y, While b, Decision d, Assignment a, Command z, Assignment l, Command x,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(c, y, b, d, a, z, l, x, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, c, y, b, d, a, z, l, x, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decal2branchcb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(decal2branchcb _this,
			Branch c, Branch y, While b, Decision d, Assignment a, Command z, Assignment l, Command x,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decal2branchcb_24_3_solvecsp_binding = pattern_decal2branchcb_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, c, y, b, d, a, z, l, x, sourceMatch, targetMatch);
		if (result_pattern_decal2branchcb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decal2branchcb_24_3_solvecsp_binding[0];

			Object[] result_pattern_decal2branchcb_24_3_solvecsp_black = pattern_decal2branchcb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decal2branchcb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, c, y, b, d, a, z, l, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decal2branchcb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decal2branchcb_24_5_matchcorrcontext_blackBFBBB(Branch c, Decision d,
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

	public static final Object[] pattern_decal2branchcb_24_6_createcorrespondence_blackBBBBBBBBB(Branch c, Branch y,
			While b, Decision d, Assignment a, Command z, Assignment l, Command x, CCMatch ccMatch) {
		if (!c.equals(y)) {
			if (!a.equals(l)) {
				if (!x.equals(z)) {
					return new Object[] { c, y, b, d, a, z, l, x, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_24_6_createcorrespondence_greenFBBBBFFBBB(Branch y, While b,
			Assignment a, Command z, Assignment l, Command x, CCMatch ccMatch) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		l2z.setTarget(z);
		l2z.setSource(l);
		ccMatch.getCreateCorr().add(l2z);
		return new Object[] { a2x, y, b, a, z, b2y, l2z, l, x, ccMatch };
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

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_0BB(While b, Decision d) {
		for (Decision __DEC_b_positive_220369 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_220369)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_1B(While b) {
		for (While __DEC_b_first_788350 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_788350)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_2B(While b) {
		for (While __DEC_b_last_257792 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_257792)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_3B(While b) {
		for (Program __DEC_b_first_21128 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_4BB(Assignment a, Decision d) {
		for (Decision __DEC_a_negative_404739 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_404739)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_5BB(Assignment a, While b) {
		for (While __DEC_a_first_726968 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_726968)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_6BB(Assignment a, While b) {
		for (While __DEC_a_last_252642 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_252642)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_7B(Assignment a) {
		for (Program __DEC_a_first_352690 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_8BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_149315 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_149315)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_9BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_788138 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_788138)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_10BB(Assignment l, While b) {
		for (While __DEC_l_first_616761 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!b.equals(__DEC_l_first_616761)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_11BB(Assignment l, While b) {
		for (While __DEC_l_last_622004 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_622004)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_12B(Assignment l) {
		for (Program __DEC_l_first_684685 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_13BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_14BB(Decision d, Assignment a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_15BB(While b, Assignment a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_16BB(While b, Assignment a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_17BB(Decision d, Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_18BB(Decision d, Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_black_nac_19BB(While b, Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_27_1_matchtggpattern_blackBBBB(While b, Decision d,
			Assignment a, Assignment l) {
		if (!a.equals(l)) {
			if (l.equals(b.getLast())) {
				if (b.equals(d.getNegative())) {
					if (a.equals(d.getPositive())) {
						if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_0BB(b, d) == null) {
							if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_1B(b) == null) {
								if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_2B(b) == null) {
									if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_3B(b) == null) {
										if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_4BB(a, d) == null) {
											if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_5BB(a,
													b) == null) {
												if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_6BB(a,
														b) == null) {
													if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_7B(
															a) == null) {
														if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_8BB(l,
																d) == null) {
															if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_9BB(
																	l, d) == null) {
																if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_10BB(
																		l, b) == null) {
																	if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_11BB(
																			l, b) == null) {
																		if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_12B(
																				l) == null) {
																			if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_13BB(
																					d, b) == null) {
																				if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_14BB(
																						d, a) == null) {
																					if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_15BB(
																							b, a) == null) {
																						if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_16BB(
																								b, a) == null) {
																							if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_17BB(
																									d, l) == null) {
																								if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_18BB(
																										d, l) == null) {
																									if (pattern_decal2branchcb_27_1_matchtggpattern_black_nac_19BB(
																											b,
																											l) == null) {
																										return new Object[] {
																												b, d, a,
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

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_0B(Branch y) {
		for (Graph __DEC_y_root_658396 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_1BB(Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_positive_700189 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_y_positive_700189)) {
					if (!c.equals(__DEC_y_positive_700189)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_2BB(Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_negative_762462 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_y_negative_762462)) {
					if (!c.equals(__DEC_y_negative_762462)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_190338 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_4BBB(Command z, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_z_positive_462124 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_z_positive_462124)) {
					if (!y.equals(__DEC_z_positive_462124)) {
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
			for (Branch __DEC_z_negative_309600 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_z_negative_309600)) {
					if (!y.equals(__DEC_z_negative_309600)) {
						return new Object[] { z, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_6B(Command x) {
		for (Graph __DEC_x_root_595595 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_7BBB(Command x, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_positive_432287 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!c.equals(__DEC_x_positive_432287)) {
					if (!y.equals(__DEC_x_positive_432287)) {
						return new Object[] { x, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_8BBB(Command x, Branch c,
			Branch y) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_negative_208899 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!c.equals(__DEC_x_negative_208899)) {
					if (!y.equals(__DEC_x_negative_208899)) {
						return new Object[] { x, c, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_9BB(Branch c, Branch y) {
		if (y.equals(c.getPositive())) {
			return new Object[] { c, y };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_10BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_11BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_13BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_14BB(Branch y, Command x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_15BB(Branch c, Command x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_black_nac_16BB(Branch y, Command x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_28_1_matchtggpattern_blackBBBB(Branch c, Branch y, Command z,
			Command x) {
		if (!c.equals(y)) {
			if (!x.equals(z)) {
				if (x.equals(c.getPositive())) {
					if (y.equals(c.getNegative())) {
						if (y.equals(z.getNext())) {
							if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_0B(y) == null) {
								if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_1BB(y, c) == null) {
									if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_2BB(y, c) == null) {
										if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_3B(z) == null) {
											if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_4BBB(z, c,
													y) == null) {
												if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_5BBB(z, c,
														y) == null) {
													if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_6B(
															x) == null) {
														if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_7BBB(
																x, c, y) == null) {
															if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_8BBB(
																	x, c, y) == null) {
																if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_9BB(
																		c, y) == null) {
																	if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_10BB(
																			c, z) == null) {
																		if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_11BB(
																				y, z) == null) {
																			if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_12BB(
																					c, z) == null) {
																				if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_13BB(
																						y, z) == null) {
																					if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_14BB(
																							y, x) == null) {
																						if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_15BB(
																								c, x) == null) {
																							if (pattern_decal2branchcb_28_1_matchtggpattern_black_nac_16BB(
																									y, x) == null) {
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
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
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
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
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
					Branch c = d2c.getTarget();
					if (c != null) {
						Statement tmpD = d2c.getSource();
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (pattern_decal2branchcb_29_2_isapplicablecore_black_nac_1BB(ruleResult, d2c) == null) {
								if (pattern_decal2branchcb_29_2_isapplicablecore_black_nac_0BB(ruleResult, c) == null) {
									if (pattern_decal2branchcb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_decal2branchcb_29_3_solveCSP_bindingFBBBBBB(decal2branchcb _this,
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, c, d2c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decal2branchcb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decal2branchcb_29_3_solveCSP_bindingAndBlackFBBBBBB(decal2branchcb _this,
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decal2branchcb_29_3_solveCSP_binding = pattern_decal2branchcb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, c, d2c, d, ruleResult);
		if (result_pattern_decal2branchcb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decal2branchcb_29_3_solveCSP_binding[0];

			Object[] result_pattern_decal2branchcb_29_3_solveCSP_black = pattern_decal2branchcb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decal2branchcb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decal2branchcb_29_4_checkCSP_expressionFBB(decal2branchcb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decal2branchcb_29_5_checknacs_blackBBB(Branch c, S2B d2c, Decision d) {
		return new Object[] { c, d2c, d };
	}

	public static final Object[] pattern_decal2branchcb_29_6_perform_blackBBBB(Branch c, S2B d2c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { c, d2c, d, ruleResult };
	}

	public static final Object[] pattern_decal2branchcb_29_6_perform_greenBFFFBFFFFFFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2x);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		a2x.setSource(a);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		z.setNext(y);
		ruleResult.getTargetObjects().add(z);
		b2y.setTarget(y);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		l2z.setTarget(z);
		ruleResult.getCorrObjects().add(l2z);
		b.setLast(l);
		l2z.setSource(l);
		ruleResult.getSourceObjects().add(l);
		c.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c, a2x, y, b, d, a, z, b2y, l2z, l, x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decal2branchcb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decal2branchcbImpl
