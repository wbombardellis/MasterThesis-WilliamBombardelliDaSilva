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
import org.wbsilva.bx.sourcecode2controlflow.Rules.decdl2branchbb;

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
 * An implementation of the model object '<em><b>decdl2branchbb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class decdl2branchbbImpl extends AbstractRuleImpl implements decdl2branchbb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decdl2branchbbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdecdl2branchbb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Decision d, Assignment l, Decision a, While b) {

		Object[] result1_black = decdl2branchbbImpl.pattern_decdl2branchbb_0_1_initialbindings_blackBBBBBB(this, match,
				d, l, a, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[l] = " + l + ", " + "[a] = " + a + ", "
					+ "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = decdl2branchbbImpl
				.pattern_decdl2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, d, l, a, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[l] = " + l + ", " + "[a] = " + a + ", "
					+ "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdl2branchbbImpl.pattern_decdl2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decdl2branchbbImpl
					.pattern_decdl2branchbb_0_4_collectelementstobetranslated_blackBBBBB(match, d, l, a, b);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
			}
			decdl2branchbbImpl.pattern_decdl2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(match, d, l, a,
					b);
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge b__l____last = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decdl2branchbbImpl
					.pattern_decdl2branchbb_0_5_collectcontextelements_blackBBBBB(match, d, l, a, b);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[d] = " + d + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
			}
			decdl2branchbbImpl.pattern_decdl2branchbb_0_5_collectcontextelements_greenBB(match, d);

			// 
			decdl2branchbbImpl.pattern_decdl2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(this, match, d, l, a,
					b);
			return decdl2branchbbImpl.pattern_decdl2branchbb_0_7_expressionF();
		} else {
			return decdl2branchbbImpl.pattern_decdl2branchbb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decdl2branchbbImpl
				.pattern_decdl2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch c = (Branch) result1_bindingAndBlack[0];
		S2B d2c = (S2B) result1_bindingAndBlack[1];
		Decision d = (Decision) result1_bindingAndBlack[2];
		Assignment l = (Assignment) result1_bindingAndBlack[3];
		Decision a = (Decision) result1_bindingAndBlack[4];
		While b = (While) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decdl2branchbbImpl.pattern_decdl2branchbb_1_1_performtransformation_greenFFFBFFBBFB(c,
				l, a, b);
		Branch y = (Branch) result1_green[0];
		S2B b2y = (S2B) result1_green[1];
		Branch x = (Branch) result1_green[2];
		S2N l2z = (S2N) result1_green[4];
		Command z = (Command) result1_green[5];
		S2B a2x = (S2B) result1_green[8];

		Object[] result2_black = decdl2branchbbImpl
				.pattern_decdl2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(y, b2y, x, l2z, z, l, a, a2x, b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[b2y] = "
					+ b2y + ", " + "[x] = " + x + ", " + "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[l] = " + l
					+ ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = decdl2branchbbImpl
				.pattern_decdl2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(y, b2y, x, l2z, z, l, a, a2x, b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdl2branchbbImpl.pattern_decdl2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, y, b2y, x, c, d2c, l2z, z, d, l, a, a2x, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[y] = " + y + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", "
					+ "[d2c] = " + d2c + ", " + "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[d] = " + d + ", "
					+ "[l] = " + l + ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ".");
		}
		decdl2branchbbImpl.pattern_decdl2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, y,
				b2y, x, c, l2z, z, d, l, a, a2x, b);
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[23];

		// 
		// 
		decdl2branchbbImpl.pattern_decdl2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, y, b2y,
				x, c, d2c, l2z, z, d, l, a, a2x, b);
		return decdl2branchbbImpl.pattern_decdl2branchbb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = decdl2branchbbImpl
				.pattern_decdl2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decdl2branchbbImpl
				.pattern_decdl2branchbb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decdl2branchbbImpl.pattern_decdl2branchbb_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Decision d = (Decision) result2_binding[0];
		Assignment l = (Assignment) result2_binding[1];
		Decision a = (Decision) result2_binding[2];
		While b = (While) result2_binding[3];
		for (Object[] result2_black : decdl2branchbbImpl.pattern_decdl2branchbb_2_2_corematch_blackFFBBBBB(d, l, a, b,
				match)) {
			Branch c = (Branch) result2_black[0];
			S2B d2c = (S2B) result2_black[1];
			// ForEach 
			for (Object[] result3_black : decdl2branchbbImpl.pattern_decdl2branchbb_2_3_findcontext_blackBBBBBB(c, d2c,
					d, l, a, b)) {
				Object[] result3_green = decdl2branchbbImpl.pattern_decdl2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(c,
						d2c, d, l, a, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decdl2branchbbImpl
						.pattern_decdl2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, c, d2c,
								d, l, a, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d2c] = "
							+ d2c + ", " + "[d] = " + d + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[b] = "
							+ b + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decdl2branchbbImpl.pattern_decdl2branchbb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decdl2branchbbImpl
							.pattern_decdl2branchbb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decdl2branchbbImpl.pattern_decdl2branchbb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decdl2branchbbImpl.pattern_decdl2branchbb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Decision d, Assignment l, Decision a, While b) {
		match.registerObject("d", d);
		match.registerObject("l", l);
		match.registerObject("a", a);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision d, Assignment l, Decision a, While b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d,
			Assignment l, Decision a, While b) {// Create CSP
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
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("a", a);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject y, EObject b2y, EObject x, EObject c,
			EObject d2c, EObject l2z, EObject z, EObject d, EObject l, EObject a, EObject a2x, EObject b) {
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("a", a);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch y, Branch x, Branch c, Command z) {

		Object[] result1_black = decdl2branchbbImpl.pattern_decdl2branchbb_10_1_initialbindings_blackBBBBBB(this, match,
				y, x, c, z);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", "
					+ "[z] = " + z + ".");
		}

		Object[] result2_bindingAndBlack = decdl2branchbbImpl
				.pattern_decdl2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, y, x, c, z);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", "
					+ "[z] = " + z + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decdl2branchbbImpl.pattern_decdl2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decdl2branchbbImpl
					.pattern_decdl2branchbb_10_4_collectelementstobetranslated_blackBBBBB(match, y, x, c, z);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[z] = " + z + ".");
			}
			decdl2branchbbImpl.pattern_decdl2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(match, y, x, c,
					z);
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge z__y____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[7];

			Object[] result5_black = decdl2branchbbImpl
					.pattern_decdl2branchbb_10_5_collectcontextelements_blackBBBBB(match, y, x, c, z);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[z] = " + z + ".");
			}
			decdl2branchbbImpl.pattern_decdl2branchbb_10_5_collectcontextelements_greenBB(match, c);

			// 
			decdl2branchbbImpl.pattern_decdl2branchbb_10_6_registerobjectstomatch_expressionBBBBBB(this, match, y, x, c,
					z);
			return decdl2branchbbImpl.pattern_decdl2branchbb_10_7_expressionF();
		} else {
			return decdl2branchbbImpl.pattern_decdl2branchbb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decdl2branchbbImpl
				.pattern_decdl2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch y = (Branch) result1_bindingAndBlack[0];
		Branch x = (Branch) result1_bindingAndBlack[1];
		Branch c = (Branch) result1_bindingAndBlack[2];
		S2B d2c = (S2B) result1_bindingAndBlack[3];
		Command z = (Command) result1_bindingAndBlack[4];
		Decision d = (Decision) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decdl2branchbbImpl.pattern_decdl2branchbb_11_1_performtransformation_greenBFBFBBFFFF(y,
				x, z, d);
		S2B b2y = (S2B) result1_green[1];
		S2N l2z = (S2N) result1_green[3];
		Assignment l = (Assignment) result1_green[6];
		Decision a = (Decision) result1_green[7];
		S2B a2x = (S2B) result1_green[8];
		While b = (While) result1_green[9];

		Object[] result2_black = decdl2branchbbImpl
				.pattern_decdl2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(y, b2y, x, l2z, z, l, a, a2x, b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[b2y] = "
					+ b2y + ", " + "[x] = " + x + ", " + "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[l] = " + l
					+ ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = decdl2branchbbImpl
				.pattern_decdl2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(y, b2y, x, l2z, z, l, a, a2x, b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decdl2branchbbImpl.pattern_decdl2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
				ruleresult, y, b2y, x, c, d2c, l2z, z, d, l, a, a2x, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[y] = " + y + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", "
					+ "[d2c] = " + d2c + ", " + "[l2z] = " + l2z + ", " + "[z] = " + z + ", " + "[d] = " + d + ", "
					+ "[l] = " + l + ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ".");
		}
		decdl2branchbbImpl.pattern_decdl2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, y,
				b2y, x, c, l2z, z, d, l, a, a2x, b);
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[23];

		// 
		// 
		decdl2branchbbImpl.pattern_decdl2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, y,
				b2y, x, c, d2c, l2z, z, d, l, a, a2x, b);
		return decdl2branchbbImpl.pattern_decdl2branchbb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = decdl2branchbbImpl
				.pattern_decdl2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decdl2branchbbImpl
				.pattern_decdl2branchbb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decdl2branchbbImpl.pattern_decdl2branchbb_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch y = (Branch) result2_binding[0];
		Branch x = (Branch) result2_binding[1];
		Branch c = (Branch) result2_binding[2];
		Command z = (Command) result2_binding[3];
		for (Object[] result2_black : decdl2branchbbImpl.pattern_decdl2branchbb_12_2_corematch_blackBBBFBFB(y, x, c, z,
				match)) {
			S2B d2c = (S2B) result2_black[3];
			Decision d = (Decision) result2_black[5];
			// ForEach 
			for (Object[] result3_black : decdl2branchbbImpl.pattern_decdl2branchbb_12_3_findcontext_blackBBBBBB(y, x,
					c, d2c, z, d)) {
				Object[] result3_green = decdl2branchbbImpl.pattern_decdl2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(y,
						x, c, d2c, z, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = decdl2branchbbImpl
						.pattern_decdl2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, y, x, c,
								d2c, z, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[y] = " + y + ", " + "[x] = " + x
							+ ", " + "[c] = " + c + ", " + "[d2c] = " + d2c + ", " + "[z] = " + z + ", " + "[d] = " + d
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decdl2branchbbImpl.pattern_decdl2branchbb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decdl2branchbbImpl
							.pattern_decdl2branchbb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decdl2branchbbImpl.pattern_decdl2branchbb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decdl2branchbbImpl.pattern_decdl2branchbb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch y, Branch x, Branch c, Command z) {
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
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch y, Branch x, Branch c, Command z) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch y, Branch x, Branch c, S2B d2c,
			Command z, Decision d) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("z", z);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject y, EObject b2y, EObject x, EObject c,
			EObject d2c, EObject l2z, EObject z, EObject d, EObject l, EObject a, EObject a2x, EObject b) {
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("a", a);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_95(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = decdl2branchbbImpl
				.pattern_decdl2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decdl2branchbbImpl.pattern_decdl2branchbb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decdl2branchbbImpl
				.pattern_decdl2branchbb_20_2_testcorematchandDECs_blackFFFFB(_edge_positive)) {
			Branch y = (Branch) result2_black[0];
			Branch x = (Branch) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Command z = (Command) result2_black[3];
			Object[] result2_green = decdl2branchbbImpl
					.pattern_decdl2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdl2branchbbImpl
					.pattern_decdl2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, y, x, c, z)) {
				// 
				if (decdl2branchbbImpl
						.pattern_decdl2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decdl2branchbbImpl
							.pattern_decdl2branchbb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decdl2branchbbImpl.pattern_decdl2branchbb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decdl2branchbbImpl.pattern_decdl2branchbb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_101(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = decdl2branchbbImpl
				.pattern_decdl2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decdl2branchbbImpl.pattern_decdl2branchbb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decdl2branchbbImpl
				.pattern_decdl2branchbb_21_2_testcorematchandDECs_blackFFFFB(_edge_positive)) {
			Decision d = (Decision) result2_black[0];
			Assignment l = (Assignment) result2_black[1];
			Decision a = (Decision) result2_black[2];
			While b = (While) result2_black[3];
			Object[] result2_green = decdl2branchbbImpl
					.pattern_decdl2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decdl2branchbbImpl
					.pattern_decdl2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, d, l, a, b)) {
				// 
				if (decdl2branchbbImpl
						.pattern_decdl2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decdl2branchbbImpl
							.pattern_decdl2branchbb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decdl2branchbbImpl.pattern_decdl2branchbb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decdl2branchbbImpl.pattern_decdl2branchbb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("decdl2branchbb");
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
		ruleResult.setRule("decdl2branchbb");
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

		Object[] result1_black = decdl2branchbbImpl.pattern_decdl2branchbb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decdl2branchbbImpl.pattern_decdl2branchbb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = decdl2branchbbImpl
				.pattern_decdl2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Branch y = (Branch) result2_bindingAndBlack[0];
		Branch x = (Branch) result2_bindingAndBlack[1];
		Branch c = (Branch) result2_bindingAndBlack[2];
		Command z = (Command) result2_bindingAndBlack[3];
		Decision d = (Decision) result2_bindingAndBlack[4];
		Assignment l = (Assignment) result2_bindingAndBlack[5];
		Decision a = (Decision) result2_bindingAndBlack[6];
		While b = (While) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decdl2branchbbImpl
				.pattern_decdl2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, y, x, c, z, d, l, a, b,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[z] = " + z + ", " + "[d] = "
					+ d + ", " + "[l] = " + l + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decdl2branchbbImpl.pattern_decdl2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decdl2branchbbImpl.pattern_decdl2branchbb_24_5_matchcorrcontext_blackBFBBB(c,
					d, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[1];
				Object[] result5_green = decdl2branchbbImpl.pattern_decdl2branchbb_24_5_matchcorrcontext_greenBBBF(d2c,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decdl2branchbbImpl
						.pattern_decdl2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(y, x, c, z, d, l, a, b,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", "
							+ "[x] = " + x + ", " + "[c] = " + c + ", " + "[z] = " + z + ", " + "[d] = " + d + ", "
							+ "[l] = " + l + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decdl2branchbbImpl.pattern_decdl2branchbb_24_6_createcorrespondence_greenBFBFBBBFBB(y, x, z, l, a, b,
						ccMatch);
				//nothing S2B b2y = (S2B) result6_green[1];
				//nothing S2N l2z = (S2N) result6_green[3];
				//nothing S2B a2x = (S2B) result6_green[7];

				Object[] result7_black = decdl2branchbbImpl
						.pattern_decdl2branchbb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decdl2branchbbImpl.pattern_decdl2branchbb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return decdl2branchbbImpl.pattern_decdl2branchbb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Branch y, Branch x, Branch c, Command z, Decision d, Assignment l, Decision a,
			While b, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Decision d, Assignment l, Decision a, While b) {// 
		Object[] result1_black = decdl2branchbbImpl.pattern_decdl2branchbb_27_1_matchtggpattern_blackBBBB(d, l, a, b);
		if (result1_black != null) {
			return decdl2branchbbImpl.pattern_decdl2branchbb_27_2_expressionF();
		} else {
			return decdl2branchbbImpl.pattern_decdl2branchbb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch y, Branch x, Branch c, Command z) {// 
		Object[] result1_black = decdl2branchbbImpl.pattern_decdl2branchbb_28_1_matchtggpattern_blackBBBB(y, x, c, z);
		if (result1_black != null) {
			return decdl2branchbbImpl.pattern_decdl2branchbb_28_2_expressionF();
		} else {
			return decdl2branchbbImpl.pattern_decdl2branchbb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = decdl2branchbbImpl.pattern_decdl2branchbb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decdl2branchbbImpl.pattern_decdl2branchbb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : decdl2branchbbImpl
				.pattern_decdl2branchbb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			Branch c = (Branch) result2_black[1];
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = decdl2branchbbImpl
					.pattern_decdl2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, c, d2c, d,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d2c] = " + d2c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decdl2branchbbImpl.pattern_decdl2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decdl2branchbbImpl.pattern_decdl2branchbb_29_5_checknacs_blackBBB(c, d2c, d);
				if (result5_black != null) {

					Object[] result6_black = decdl2branchbbImpl.pattern_decdl2branchbb_29_6_perform_blackBBBB(c, d2c, d,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
								+ "[d2c] = " + d2c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decdl2branchbbImpl.pattern_decdl2branchbb_29_6_perform_greenFFFBFFBFFFFB(c, d, ruleResult);
					//nothing Branch y = (Branch) result6_green[0];
					//nothing S2B b2y = (S2B) result6_green[1];
					//nothing Branch x = (Branch) result6_green[2];
					//nothing S2N l2z = (S2N) result6_green[4];
					//nothing Command z = (Command) result6_green[5];
					//nothing Assignment l = (Assignment) result6_green[7];
					//nothing Decision a = (Decision) result6_green[8];
					//nothing S2B a2x = (S2B) result6_green[9];
					//nothing While b = (While) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return decdl2branchbbImpl.pattern_decdl2branchbb_29_7_expressionFB(ruleResult);
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
		case RulesPackage.DECDL2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_DECISION_ASSIGNMENT_DECISION_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Decision) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.DECDL2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_ASSIGNMENT_DECISION_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Decision) arguments.get(3), (While) arguments.get(4));
			return null;
		case RulesPackage.DECDL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_ASSIGNMENT_DECISION_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Decision) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.DECDL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_S2B_DECISION_ASSIGNMENT_DECISION_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Decision) arguments.get(3), (Assignment) arguments.get(4),
					(Decision) arguments.get(5), (While) arguments.get(6));
		case RulesPackage.DECDL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECDL2BRANCHBB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECDL2BRANCHBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
			return null;
		case RulesPackage.DECDL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECDL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_BRANCH_BRANCH_S2B_COMMAND_DECISION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (S2B) arguments.get(4),
					(Command) arguments.get(5), (Decision) arguments.get(6));
		case RulesPackage.DECDL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECDL2BRANCHBB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_95__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_95((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_101__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_101((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECDL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_BRANCH_BRANCH_COMMAND_DECISION_ASSIGNMENT_DECISION_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Decision) arguments.get(4),
					(Assignment) arguments.get(5), (Decision) arguments.get(6), (While) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECDL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECDL2BRANCHBB___CHECK_DEC_FWD__DECISION_ASSIGNMENT_DECISION_WHILE:
			return checkDEC_FWD((Decision) arguments.get(0), (Assignment) arguments.get(1), (Decision) arguments.get(2),
					(While) arguments.get(3));
		case RulesPackage.DECDL2BRANCHBB___CHECK_DEC_BWD__BRANCH_BRANCH_BRANCH_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.DECDL2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECDL2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Decision) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECDL2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decdl2branchbb_0_1_initialbindings_blackBBBBBB(decdl2branchbb _this,
			Match match, Decision d, Assignment l, Decision a, While b) {
		if (!a.equals(d)) {
			return new Object[] { _this, match, d, l, a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_0_2_SolveCSP_bindingFBBBBBB(decdl2branchbb _this, Match match,
			Decision d, Assignment l, Decision a, While b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, d, l, a, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, d, l, a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdl2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(decdl2branchbb _this,
			Match match, Decision d, Assignment l, Decision a, While b) {
		Object[] result_pattern_decdl2branchbb_0_2_SolveCSP_binding = pattern_decdl2branchbb_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, d, l, a, b);
		if (result_pattern_decdl2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdl2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decdl2branchbb_0_2_SolveCSP_black = pattern_decdl2branchbb_0_2_SolveCSP_blackB(csp);
			if (result_pattern_decdl2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, d, l, a, b };
			}
		}
		return null;
	}

	public static final boolean pattern_decdl2branchbb_0_3_CheckCSP_expressionFBB(decdl2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Decision d, Assignment l, Decision a, While b) {
		if (!a.equals(d)) {
			return new Object[] { match, d, l, a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Decision d, Assignment l, Decision a, While b) {
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(a);
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
		return new Object[] { match, d, l, a, b, d__a____positive, d__b____negative, b__l____last };
	}

	public static final Object[] pattern_decdl2branchbb_0_5_collectcontextelements_blackBBBBB(Match match, Decision d,
			Assignment l, Decision a, While b) {
		if (!a.equals(d)) {
			return new Object[] { match, d, l, a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decdl2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(decdl2branchbb _this,
			Match match, Decision d, Assignment l, Decision a, While b) {
		_this.registerObjectsToMatch_FWD(match, d, l, a, b);

	}

	public static final boolean pattern_decdl2branchbb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdl2branchbb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("d");
		EObject _localVariable_3 = isApplicableMatch.getObject("l");
		EObject _localVariable_4 = isApplicableMatch.getObject("a");
		EObject _localVariable_5 = isApplicableMatch.getObject("b");
		EObject tmpC = _localVariable_0;
		EObject tmpD2c = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpL = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpB = _localVariable_5;
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			if (tmpD2c instanceof S2B) {
				S2B d2c = (S2B) tmpD2c;
				if (tmpD instanceof Decision) {
					Decision d = (Decision) tmpD;
					if (tmpL instanceof Assignment) {
						Assignment l = (Assignment) tmpL;
						if (tmpA instanceof Decision) {
							Decision a = (Decision) tmpA;
							if (tmpB instanceof While) {
								While b = (While) tmpB;
								return new Object[] { c, d2c, d, l, a, b, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_1_1_performtransformation_blackBBBBBBFBB(Branch c, S2B d2c,
			Decision d, Assignment l, Decision a, While b, decdl2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(d)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { c, d2c, d, l, a, b, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decdl2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decdl2branchbb_1_1_performtransformation_binding = pattern_decdl2branchbb_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decdl2branchbb_1_1_performtransformation_binding != null) {
			Branch c = (Branch) result_pattern_decdl2branchbb_1_1_performtransformation_binding[0];
			S2B d2c = (S2B) result_pattern_decdl2branchbb_1_1_performtransformation_binding[1];
			Decision d = (Decision) result_pattern_decdl2branchbb_1_1_performtransformation_binding[2];
			Assignment l = (Assignment) result_pattern_decdl2branchbb_1_1_performtransformation_binding[3];
			Decision a = (Decision) result_pattern_decdl2branchbb_1_1_performtransformation_binding[4];
			While b = (While) result_pattern_decdl2branchbb_1_1_performtransformation_binding[5];

			Object[] result_pattern_decdl2branchbb_1_1_performtransformation_black = pattern_decdl2branchbb_1_1_performtransformation_blackBBBBBBFBB(
					c, d2c, d, l, a, b, _this, isApplicableMatch);
			if (result_pattern_decdl2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdl2branchbb_1_1_performtransformation_black[6];

				return new Object[] { c, d2c, d, l, a, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_1_1_performtransformation_greenFFFBFFBBFB(Branch c,
			Assignment l, Decision a, While b) {
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		c.setNegative(y);
		b2y.setTarget(y);
		b2y.setSource(b);
		c.setPositive(x);
		l2z.setSource(l);
		l2z.setTarget(z);
		z.setNext(y);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { y, b2y, x, c, l2z, z, l, a, a2x, b };
	}

	public static final Object[] pattern_decdl2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(Branch y, S2B b2y,
			Branch x, S2N l2z, Command z, Assignment l, Decision a, S2B a2x, While b) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				return new Object[] { y, b2y, x, l2z, z, l, a, a2x, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(Branch y, S2B b2y,
			Branch x, S2N l2z, Command z, Assignment l, Decision a, S2B a2x, While b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(b);
		return new Object[] { ruleresult, y, b2y, x, l2z, z, l, a, a2x, b };
	}

	public static final Object[] pattern_decdl2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject y, EObject b2y, EObject x, EObject c, EObject d2c, EObject l2z,
			EObject z, EObject d, EObject l, EObject a, EObject a2x, EObject b) {
		if (!y.equals(z)) {
			if (!b2y.equals(y)) {
				if (!b2y.equals(x)) {
					if (!b2y.equals(c)) {
						if (!b2y.equals(d2c)) {
							if (!b2y.equals(l2z)) {
								if (!b2y.equals(z)) {
									if (!b2y.equals(d)) {
										if (!b2y.equals(l)) {
											if (!x.equals(y)) {
												if (!x.equals(z)) {
													if (!c.equals(y)) {
														if (!c.equals(x)) {
															if (!c.equals(d2c)) {
																if (!c.equals(l2z)) {
																	if (!c.equals(z)) {
																		if (!c.equals(d)) {
																			if (!c.equals(l)) {
																				if (!d2c.equals(y)) {
																					if (!d2c.equals(x)) {
																						if (!d2c.equals(l2z)) {
																							if (!d2c.equals(z)) {
																								if (!d2c.equals(l)) {
																									if (!l2z.equals(
																											y)) {
																										if (!l2z.equals(
																												x)) {
																											if (!l2z.equals(
																													z)) {
																												if (!d.equals(
																														y)) {
																													if (!d.equals(
																															x)) {
																														if (!d.equals(
																																d2c)) {
																															if (!d.equals(
																																	l2z)) {
																																if (!d.equals(
																																		z)) {
																																	if (!d.equals(
																																			l)) {
																																		if (!l.equals(
																																				y)) {
																																			if (!l.equals(
																																					x)) {
																																				if (!l.equals(
																																						l2z)) {
																																					if (!l.equals(
																																							z)) {
																																						if (!a.equals(
																																								y)) {
																																							if (!a.equals(
																																									b2y)) {
																																								if (!a.equals(
																																										x)) {
																																									if (!a.equals(
																																											c)) {
																																										if (!a.equals(
																																												d2c)) {
																																											if (!a.equals(
																																													l2z)) {
																																												if (!a.equals(
																																														z)) {
																																													if (!a.equals(
																																															d)) {
																																														if (!a.equals(
																																																l)) {
																																															if (!a.equals(
																																																	a2x)) {
																																																if (!a.equals(
																																																		b)) {
																																																	if (!a2x.equals(
																																																			y)) {
																																																		if (!a2x.equals(
																																																				b2y)) {
																																																			if (!a2x.equals(
																																																					x)) {
																																																				if (!a2x.equals(
																																																						c)) {
																																																					if (!a2x.equals(
																																																							d2c)) {
																																																						if (!a2x.equals(
																																																								l2z)) {
																																																							if (!a2x.equals(
																																																									z)) {
																																																								if (!a2x.equals(
																																																										d)) {
																																																									if (!a2x.equals(
																																																											l)) {
																																																										if (!a2x.equals(
																																																												b)) {
																																																											if (!b.equals(
																																																													y)) {
																																																												if (!b.equals(
																																																														b2y)) {
																																																													if (!b.equals(
																																																															x)) {
																																																														if (!b.equals(
																																																																c)) {
																																																															if (!b.equals(
																																																																	d2c)) {
																																																																if (!b.equals(
																																																																		l2z)) {
																																																																	if (!b.equals(
																																																																			z)) {
																																																																		if (!b.equals(
																																																																				d)) {
																																																																			if (!b.equals(
																																																																					l)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						y,
																																																																						b2y,
																																																																						x,
																																																																						c,
																																																																						d2c,
																																																																						l2z,
																																																																						z,
																																																																						d,
																																																																						l,
																																																																						a,
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

	public static final Object[] pattern_decdl2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject y, EObject b2y, EObject x, EObject c, EObject l2z, EObject z,
			EObject d, EObject l, EObject a, EObject a2x, EObject b) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdl2branchbb";
		String c__x____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String l2z__z____target_name_prime = "target";
		String z__y____next_name_prime = "next";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String c__y____negative_name_prime = "negative";
		String l2z__l____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String b__l____last_name_prime = "last";
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(z__y____next);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(b__l____last);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		return new Object[] { ruleresult, y, b2y, x, c, l2z, z, d, l, a, a2x, b, c__x____positive, b2y__y____target,
				l2z__z____target, z__y____next, d__a____positive, d__b____negative, c__y____negative, l2z__l____source,
				a2x__x____target, a2x__a____source, b2y__b____source, b__l____last };
	}

	public static final void pattern_decdl2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(decdl2branchbb _this,
			PerformRuleResult ruleresult, EObject y, EObject b2y, EObject x, EObject c, EObject d2c, EObject l2z,
			EObject z, EObject d, EObject l, EObject a, EObject a2x, EObject b) {
		_this.registerObjects_FWD(ruleresult, y, b2y, x, c, d2c, l2z, z, d, l, a, a2x, b);

	}

	public static final PerformRuleResult pattern_decdl2branchbb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_2_1_preparereturnvalue_bindingFB(decdl2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			decdl2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(
			decdl2branchbb _this) {
		Object[] result_pattern_decdl2branchbb_2_1_preparereturnvalue_binding = pattern_decdl2branchbb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdl2branchbb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decdl2branchbb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdl2branchbb_2_1_preparereturnvalue_black = pattern_decdl2branchbb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decdl2branchbb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decdl2branchbb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decdl2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decdl2branchbb_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("d");
		EObject _localVariable_1 = match.getObject("l");
		EObject _localVariable_2 = match.getObject("a");
		EObject _localVariable_3 = match.getObject("b");
		EObject tmpD = _localVariable_0;
		EObject tmpL = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpB = _localVariable_3;
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (tmpA instanceof Decision) {
					Decision a = (Decision) tmpA;
					if (tmpB instanceof While) {
						While b = (While) tmpB;
						return new Object[] { d, l, a, b, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdl2branchbb_2_2_corematch_blackFFBBBBB(Decision d, Assignment l,
			Decision a, While b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { c, d2c, d, l, a, b, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdl2branchbb_2_3_findcontext_blackBBBBBB(Branch c, S2B d2c,
			Decision d, Assignment l, Decision a, While b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(d)) {
			if (c.equals(d2c.getTarget())) {
				if (a.equals(d.getPositive())) {
					if (b.equals(d.getNegative())) {
						if (d.equals(d2c.getSource())) {
							if (l.equals(b.getLast())) {
								_result.add(new Object[] { c, d2c, d, l, a, b });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(Branch c, S2B d2c, Decision d,
			Assignment l, Decision a, While b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		String b__l____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(b);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(b__l____last);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		return new Object[] { c, d2c, d, l, a, b, isApplicableMatch, d2c__c____target, d__a____positive,
				d__b____negative, d2c__d____source, b__l____last };
	}

	public static final Object[] pattern_decdl2branchbb_2_4_solveCSP_bindingFBBBBBBBB(decdl2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d, Assignment l, Decision a, While b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, d2c, d, l, a, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, l, a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdl2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decdl2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d, Assignment l, Decision a, While b) {
		Object[] result_pattern_decdl2branchbb_2_4_solveCSP_binding = pattern_decdl2branchbb_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, c, d2c, d, l, a, b);
		if (result_pattern_decdl2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdl2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_decdl2branchbb_2_4_solveCSP_black = pattern_decdl2branchbb_2_4_solveCSP_blackB(csp);
			if (result_pattern_decdl2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, l, a, b };
			}
		}
		return null;
	}

	public static final boolean pattern_decdl2branchbb_2_5_checkCSP_expressionFBB(decdl2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decdl2branchbb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decdl2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decdl2branchbb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_10_1_initialbindings_blackBBBBBB(decdl2branchbb _this,
			Match match, Branch y, Branch x, Branch c, Command z) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					return new Object[] { _this, match, y, x, c, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_10_2_SolveCSP_bindingFBBBBBB(decdl2branchbb _this, Match match,
			Branch y, Branch x, Branch c, Command z) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, x, c, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, x, c, z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdl2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(decdl2branchbb _this,
			Match match, Branch y, Branch x, Branch c, Command z) {
		Object[] result_pattern_decdl2branchbb_10_2_SolveCSP_binding = pattern_decdl2branchbb_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, y, x, c, z);
		if (result_pattern_decdl2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdl2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decdl2branchbb_10_2_SolveCSP_black = pattern_decdl2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decdl2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, x, c, z };
			}
		}
		return null;
	}

	public static final boolean pattern_decdl2branchbb_10_3_CheckCSP_expressionFBB(decdl2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Branch y, Branch x, Branch c, Command z) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					return new Object[] { match, y, x, c, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Branch y, Branch x, Branch c, Command z) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
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
		return new Object[] { match, y, x, c, z, c__x____positive, z__y____next, c__y____negative };
	}

	public static final Object[] pattern_decdl2branchbb_10_5_collectcontextelements_blackBBBBB(Match match, Branch y,
			Branch x, Branch c, Command z) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					return new Object[] { match, y, x, c, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decdl2branchbb_10_6_registerobjectstomatch_expressionBBBBBB(decdl2branchbb _this,
			Match match, Branch y, Branch x, Branch c, Command z) {
		_this.registerObjectsToMatch_BWD(match, y, x, c, z);

	}

	public static final boolean pattern_decdl2branchbb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdl2branchbb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("y");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("z");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject tmpY = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpD2c = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpD = _localVariable_5;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpD2c instanceof S2B) {
						S2B d2c = (S2B) tmpD2c;
						if (tmpZ instanceof Command) {
							Command z = (Command) tmpZ;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								return new Object[] { y, x, c, d2c, z, d, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_11_1_performtransformation_blackBBBBBBFBB(Branch y, Branch x,
			Branch c, S2B d2c, Command z, Decision d, decdl2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { y, x, c, d2c, z, d, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decdl2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decdl2branchbb_11_1_performtransformation_binding = pattern_decdl2branchbb_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decdl2branchbb_11_1_performtransformation_binding != null) {
			Branch y = (Branch) result_pattern_decdl2branchbb_11_1_performtransformation_binding[0];
			Branch x = (Branch) result_pattern_decdl2branchbb_11_1_performtransformation_binding[1];
			Branch c = (Branch) result_pattern_decdl2branchbb_11_1_performtransformation_binding[2];
			S2B d2c = (S2B) result_pattern_decdl2branchbb_11_1_performtransformation_binding[3];
			Command z = (Command) result_pattern_decdl2branchbb_11_1_performtransformation_binding[4];
			Decision d = (Decision) result_pattern_decdl2branchbb_11_1_performtransformation_binding[5];

			Object[] result_pattern_decdl2branchbb_11_1_performtransformation_black = pattern_decdl2branchbb_11_1_performtransformation_blackBBBBBBFBB(
					y, x, c, d2c, z, d, _this, isApplicableMatch);
			if (result_pattern_decdl2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decdl2branchbb_11_1_performtransformation_black[6];

				return new Object[] { y, x, c, d2c, z, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_11_1_performtransformation_greenBFBFBBFFFF(Branch y, Branch x,
			Command z, Decision d) {
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		b2y.setTarget(y);
		l2z.setTarget(z);
		l2z.setSource(l);
		d.setPositive(a);
		a2x.setTarget(x);
		a2x.setSource(a);
		d.setNegative(b);
		b2y.setSource(b);
		b.setLast(l);
		return new Object[] { y, b2y, x, l2z, z, d, l, a, a2x, b };
	}

	public static final Object[] pattern_decdl2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(Branch y, S2B b2y,
			Branch x, S2N l2z, Command z, Assignment l, Decision a, S2B a2x, While b) {
		if (!x.equals(y)) {
			if (!a2x.equals(b2y)) {
				return new Object[] { y, b2y, x, l2z, z, l, a, a2x, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(Branch y,
			S2B b2y, Branch x, S2N l2z, Command z, Assignment l, Decision a, S2B a2x, While b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(l);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(b);
		return new Object[] { ruleresult, y, b2y, x, l2z, z, l, a, a2x, b };
	}

	public static final Object[] pattern_decdl2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject y, EObject b2y, EObject x, EObject c, EObject d2c, EObject l2z,
			EObject z, EObject d, EObject l, EObject a, EObject a2x, EObject b) {
		if (!y.equals(z)) {
			if (!b2y.equals(y)) {
				if (!b2y.equals(x)) {
					if (!b2y.equals(c)) {
						if (!b2y.equals(d2c)) {
							if (!b2y.equals(l2z)) {
								if (!b2y.equals(z)) {
									if (!b2y.equals(d)) {
										if (!b2y.equals(l)) {
											if (!x.equals(y)) {
												if (!x.equals(z)) {
													if (!c.equals(y)) {
														if (!c.equals(x)) {
															if (!c.equals(d2c)) {
																if (!c.equals(l2z)) {
																	if (!c.equals(z)) {
																		if (!c.equals(d)) {
																			if (!c.equals(l)) {
																				if (!d2c.equals(y)) {
																					if (!d2c.equals(x)) {
																						if (!d2c.equals(l2z)) {
																							if (!d2c.equals(z)) {
																								if (!d2c.equals(l)) {
																									if (!l2z.equals(
																											y)) {
																										if (!l2z.equals(
																												x)) {
																											if (!l2z.equals(
																													z)) {
																												if (!d.equals(
																														y)) {
																													if (!d.equals(
																															x)) {
																														if (!d.equals(
																																d2c)) {
																															if (!d.equals(
																																	l2z)) {
																																if (!d.equals(
																																		z)) {
																																	if (!d.equals(
																																			l)) {
																																		if (!l.equals(
																																				y)) {
																																			if (!l.equals(
																																					x)) {
																																				if (!l.equals(
																																						l2z)) {
																																					if (!l.equals(
																																							z)) {
																																						if (!a.equals(
																																								y)) {
																																							if (!a.equals(
																																									b2y)) {
																																								if (!a.equals(
																																										x)) {
																																									if (!a.equals(
																																											c)) {
																																										if (!a.equals(
																																												d2c)) {
																																											if (!a.equals(
																																													l2z)) {
																																												if (!a.equals(
																																														z)) {
																																													if (!a.equals(
																																															d)) {
																																														if (!a.equals(
																																																l)) {
																																															if (!a.equals(
																																																	a2x)) {
																																																if (!a.equals(
																																																		b)) {
																																																	if (!a2x.equals(
																																																			y)) {
																																																		if (!a2x.equals(
																																																				b2y)) {
																																																			if (!a2x.equals(
																																																					x)) {
																																																				if (!a2x.equals(
																																																						c)) {
																																																					if (!a2x.equals(
																																																							d2c)) {
																																																						if (!a2x.equals(
																																																								l2z)) {
																																																							if (!a2x.equals(
																																																									z)) {
																																																								if (!a2x.equals(
																																																										d)) {
																																																									if (!a2x.equals(
																																																											l)) {
																																																										if (!a2x.equals(
																																																												b)) {
																																																											if (!b.equals(
																																																													y)) {
																																																												if (!b.equals(
																																																														b2y)) {
																																																													if (!b.equals(
																																																															x)) {
																																																														if (!b.equals(
																																																																c)) {
																																																															if (!b.equals(
																																																																	d2c)) {
																																																																if (!b.equals(
																																																																		l2z)) {
																																																																	if (!b.equals(
																																																																			z)) {
																																																																		if (!b.equals(
																																																																				d)) {
																																																																			if (!b.equals(
																																																																					l)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						y,
																																																																						b2y,
																																																																						x,
																																																																						c,
																																																																						d2c,
																																																																						l2z,
																																																																						z,
																																																																						d,
																																																																						l,
																																																																						a,
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

	public static final Object[] pattern_decdl2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject y, EObject b2y, EObject x, EObject c, EObject l2z, EObject z,
			EObject d, EObject l, EObject a, EObject a2x, EObject b) {
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decdl2branchbb";
		String c__x____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String l2z__z____target_name_prime = "target";
		String z__y____next_name_prime = "next";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		String c__y____negative_name_prime = "negative";
		String l2z__l____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String b__l____last_name_prime = "last";
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(z__y____next);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(b__l____last);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		return new Object[] { ruleresult, y, b2y, x, c, l2z, z, d, l, a, a2x, b, c__x____positive, b2y__y____target,
				l2z__z____target, z__y____next, d__a____positive, d__b____negative, c__y____negative, l2z__l____source,
				a2x__x____target, a2x__a____source, b2y__b____source, b__l____last };
	}

	public static final void pattern_decdl2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(decdl2branchbb _this,
			PerformRuleResult ruleresult, EObject y, EObject b2y, EObject x, EObject c, EObject d2c, EObject l2z,
			EObject z, EObject d, EObject l, EObject a, EObject a2x, EObject b) {
		_this.registerObjects_BWD(ruleresult, y, b2y, x, c, d2c, l2z, z, d, l, a, a2x, b);

	}

	public static final PerformRuleResult pattern_decdl2branchbb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_12_1_preparereturnvalue_bindingFB(decdl2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			decdl2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(
			decdl2branchbb _this) {
		Object[] result_pattern_decdl2branchbb_12_1_preparereturnvalue_binding = pattern_decdl2branchbb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdl2branchbb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decdl2branchbb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdl2branchbb_12_1_preparereturnvalue_black = pattern_decdl2branchbb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decdl2branchbb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decdl2branchbb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decdl2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decdl2branchbb_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("c");
		EObject _localVariable_3 = match.getObject("z");
		EObject tmpY = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
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

	public static final Iterable<Object[]> pattern_decdl2branchbb_12_2_corematch_blackBBBFBFB(Branch y, Branch x,
			Branch c, Command z, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
							"target")) {
						Statement tmpD = d2c.getSource();
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							_result.add(new Object[] { y, x, c, d2c, z, d, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdl2branchbb_12_3_findcontext_blackBBBBBB(Branch y, Branch x,
			Branch c, S2B d2c, Command z, Decision d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					if (x.equals(c.getPositive())) {
						if (c.equals(d2c.getTarget())) {
							if (y.equals(z.getNext())) {
								if (y.equals(c.getNegative())) {
									if (d.equals(d2c.getSource())) {
										_result.add(new Object[] { y, x, c, d2c, z, d });
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

	public static final Object[] pattern_decdl2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(Branch y, Branch x, Branch c,
			S2B d2c, Command z, Decision d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__x____positive_name_prime = "positive";
		String d2c__c____target_name_prime = "target";
		String z__y____next_name_prime = "next";
		String c__y____negative_name_prime = "negative";
		String d2c__d____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(d);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(z__y____next);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		c__x____positive.setName(c__x____positive_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		return new Object[] { y, x, c, d2c, z, d, isApplicableMatch, c__x____positive, d2c__c____target, z__y____next,
				c__y____negative, d2c__d____source };
	}

	public static final Object[] pattern_decdl2branchbb_12_4_solveCSP_bindingFBBBBBBBB(decdl2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch y, Branch x, Branch c, S2B d2c, Command z, Decision d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, y, x, c, d2c, z, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, y, x, c, d2c, z, d };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdl2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(decdl2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch y, Branch x, Branch c, S2B d2c, Command z, Decision d) {
		Object[] result_pattern_decdl2branchbb_12_4_solveCSP_binding = pattern_decdl2branchbb_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, y, x, c, d2c, z, d);
		if (result_pattern_decdl2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdl2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_decdl2branchbb_12_4_solveCSP_black = pattern_decdl2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decdl2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, y, x, c, d2c, z, d };
			}
		}
		return null;
	}

	public static final boolean pattern_decdl2branchbb_12_5_checkCSP_expressionFBB(decdl2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decdl2branchbb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decdl2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decdl2branchbb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_20_1_preparereturnvalue_bindingFB(decdl2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decdl2branchbb _this) {
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

	public static final Object[] pattern_decdl2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			decdl2branchbb _this) {
		Object[] result_pattern_decdl2branchbb_20_1_preparereturnvalue_binding = pattern_decdl2branchbb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdl2branchbb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decdl2branchbb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdl2branchbb_20_1_preparereturnvalue_black = pattern_decdl2branchbb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decdl2branchbb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decdl2branchbb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decdl2branchbb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_0B(Branch y) {
		for (Graph __DEC_y_root_101088 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_598583 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_598583)) {
							if (!x.equals(__DEC_y_positive_598583)) {
								if (!c.equals(__DEC_y_positive_598583)) {
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

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_78922 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_78922)) {
							if (!x.equals(__DEC_y_negative_78922)) {
								if (!c.equals(__DEC_y_negative_78922)) {
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

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_400183 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_468904 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_468904)) {
							if (!y.equals(__DEC_x_positive_468904)) {
								if (!c.equals(__DEC_x_positive_468904)) {
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

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_70202 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_70202)) {
							if (!y.equals(__DEC_x_negative_70202)) {
								if (!c.equals(__DEC_x_negative_70202)) {
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

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_60870 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_7BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_positive_676980 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!y.equals(__DEC_z_positive_676980)) {
							if (!x.equals(__DEC_z_positive_676980)) {
								if (!c.equals(__DEC_z_positive_676980)) {
									return new Object[] { z, y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_8BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_negative_15828 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!y.equals(__DEC_z_negative_15828)) {
							if (!x.equals(__DEC_z_negative_15828)) {
								if (!c.equals(__DEC_z_negative_15828)) {
									return new Object[] { z, y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_9BB(Branch y, Branch x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_10BB(Branch y, Branch x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_11BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_12BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_13BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_14BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_15BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_16BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdl2branchbb_20_2_testcorematchandDECs_blackFFFFB(
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
									if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_3B(x) == null) {
										if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_0B(y) == null) {
											if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(y, x,
													c) == null) {
												if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(y,
														x, c) == null) {
													if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(
															x, y, c) == null) {
														if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(
																x, y, c) == null) {
															if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_9BB(
																	y, x) == null) {
																if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_10BB(
																		y, x) == null) {
																	for (Node tmpZ : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(y, Node.class,
																					"next")) {
																		if (tmpZ instanceof Command) {
																			Command z = (Command) tmpZ;
																			if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_6B(
																					z) == null) {
																				if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_7BBBB(
																						z, y, x, c) == null) {
																					if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_8BBBB(
																							z, y, x, c) == null) {
																						if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_11BB(
																								y, z) == null) {
																							if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_12BB(
																									x, z) == null) {
																								if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_13BB(
																										c, z) == null) {
																									if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_14BB(
																											y,
																											z) == null) {
																										if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																												x,
																												z) == null) {
																											if (pattern_decdl2branchbb_20_2_testcorematchandDECs_black_nac_16BB(
																													c,
																													z) == null) {
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
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decdl2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decdl2branchbb _this, Match match, Branch y, Branch x, Branch c, Command z) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, x, c, z);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decdl2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decdl2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decdl2branchbb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_21_1_preparereturnvalue_bindingFB(decdl2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decdl2branchbb _this) {
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

	public static final Object[] pattern_decdl2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			decdl2branchbb _this) {
		Object[] result_pattern_decdl2branchbb_21_1_preparereturnvalue_binding = pattern_decdl2branchbb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decdl2branchbb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decdl2branchbb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decdl2branchbb_21_1_preparereturnvalue_black = pattern_decdl2branchbb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decdl2branchbb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decdl2branchbb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decdl2branchbb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_0BBB(Assignment l,
			Decision d, Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_positive_156468 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "positive")) {
				if (!d.equals(__DEC_l_positive_156468)) {
					if (!a.equals(__DEC_l_positive_156468)) {
						return new Object[] { l, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_1BBB(Assignment l,
			Decision d, Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_negative_708821 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "negative")) {
				if (!d.equals(__DEC_l_negative_708821)) {
					if (!a.equals(__DEC_l_negative_708821)) {
						return new Object[] { l, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_2BB(Assignment l, While b) {
		for (While __DEC_l_first_19162 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!b.equals(__DEC_l_first_19162)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_3BB(Assignment l, While b) {
		for (While __DEC_l_last_885856 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_885856)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_4B(Assignment l) {
		for (Program __DEC_l_first_630412 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_5BB(Decision a,
			Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_723729 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_723729)) {
					if (!d.equals(__DEC_a_negative_723729)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_6BB(Decision a, While b) {
		for (While __DEC_a_first_721844 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_721844)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_7BB(Decision a, While b) {
		for (While __DEC_a_last_409335 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_409335)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_8B(Decision a) {
		for (Program __DEC_a_first_934264 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_9BBB(While b, Decision d,
			Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_b_positive_923214 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!d.equals(__DEC_b_positive_923214)) {
					if (!a.equals(__DEC_b_positive_923214)) {
						return new Object[] { b, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_10B(While b) {
		for (While __DEC_b_first_712868 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_712868)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_11B(While b) {
		for (While __DEC_b_last_235232 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_235232)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_12B(While b) {
		for (Program __DEC_b_first_978174 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_13BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_14BB(Decision a,
			Assignment l) {
		if (l.equals(a.getPositive())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_15BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_16BB(Decision a,
			Assignment l) {
		if (l.equals(a.getNegative())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_17BB(While b,
			Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_18BB(Decision d,
			Decision a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_19BB(While b, Decision a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_20BB(While b, Decision a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_21BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_22BB(Decision a, While b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdl2branchbb_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpD = _edge_positive.getSrc();
		if (tmpD instanceof Decision) {
			Decision d = (Decision) tmpD;
			EObject tmpA = _edge_positive.getTrg();
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (!a.equals(d)) {
					if (a.equals(d.getPositive())) {
						Statement tmpB = d.getNegative();
						if (tmpB instanceof While) {
							While b = (While) tmpB;
							Statement tmpL = b.getLast();
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_5BB(a, d) == null) {
									if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_8B(a) == null) {
										if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_18BB(d,
												a) == null) {
											if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_6BB(a,
													b) == null) {
												if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_7BB(a,
														b) == null) {
													if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_9BBB(
															b, d, a) == null) {
														if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_10B(
																b) == null) {
															if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_11B(
																	b) == null) {
																if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_12B(
																		b) == null) {
																	if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																			b, a) == null) {
																		if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_20BB(
																				b, a) == null) {
																			if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																					d, b) == null) {
																				if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_22BB(
																						a, b) == null) {
																					if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_0BBB(
																							l, d, a) == null) {
																						if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_1BBB(
																								l, d, a) == null) {
																							if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_2BB(
																									l, b) == null) {
																								if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_3BB(
																										l, b) == null) {
																									if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_4B(
																											l) == null) {
																										if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_13BB(
																												d,
																												l) == null) {
																											if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_14BB(
																													a,
																													l) == null) {
																												if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_15BB(
																														d,
																														l) == null) {
																													if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_16BB(
																															a,
																															l) == null) {
																														if (pattern_decdl2branchbb_21_2_testcorematchandDECs_black_nac_17BB(
																																b,
																																l) == null) {
																															_result.add(
																																	new Object[] {
																																			d,
																																			l,
																																			a,
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
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decdl2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decdl2branchbb _this, Match match, Decision d, Assignment l, Decision a, While b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, d, l, a, b);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decdl2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decdl2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decdl2branchbb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_24_1_prepare_blackB(decdl2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decdl2branchbb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_decdl2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("y");
		EObject _localVariable_1 = targetMatch.getObject("x");
		EObject _localVariable_2 = targetMatch.getObject("c");
		EObject _localVariable_3 = targetMatch.getObject("z");
		EObject _localVariable_4 = sourceMatch.getObject("d");
		EObject _localVariable_5 = sourceMatch.getObject("l");
		EObject _localVariable_6 = sourceMatch.getObject("a");
		EObject _localVariable_7 = sourceMatch.getObject("b");
		EObject tmpY = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpL = _localVariable_5;
		EObject tmpA = _localVariable_6;
		EObject tmpB = _localVariable_7;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpL instanceof Assignment) {
								Assignment l = (Assignment) tmpL;
								if (tmpA instanceof Decision) {
									Decision a = (Decision) tmpA;
									if (tmpB instanceof While) {
										While b = (While) tmpB;
										return new Object[] { y, x, c, z, d, l, a, b, targetMatch, sourceMatch };
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

	public static final Object[] pattern_decdl2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Branch y, Branch x,
			Branch c, Command z, Decision d, Assignment l, Decision a, While b, Match sourceMatch, Match targetMatch) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					if (!a.equals(d)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { y, x, c, z, d, l, a, b, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decdl2branchbb_24_2_matchsrctrgcontext_binding = pattern_decdl2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_decdl2branchbb_24_2_matchsrctrgcontext_binding != null) {
			Branch y = (Branch) result_pattern_decdl2branchbb_24_2_matchsrctrgcontext_binding[0];
			Branch x = (Branch) result_pattern_decdl2branchbb_24_2_matchsrctrgcontext_binding[1];
			Branch c = (Branch) result_pattern_decdl2branchbb_24_2_matchsrctrgcontext_binding[2];
			Command z = (Command) result_pattern_decdl2branchbb_24_2_matchsrctrgcontext_binding[3];
			Decision d = (Decision) result_pattern_decdl2branchbb_24_2_matchsrctrgcontext_binding[4];
			Assignment l = (Assignment) result_pattern_decdl2branchbb_24_2_matchsrctrgcontext_binding[5];
			Decision a = (Decision) result_pattern_decdl2branchbb_24_2_matchsrctrgcontext_binding[6];
			While b = (While) result_pattern_decdl2branchbb_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decdl2branchbb_24_2_matchsrctrgcontext_black = pattern_decdl2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					y, x, c, z, d, l, a, b, sourceMatch, targetMatch);
			if (result_pattern_decdl2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { y, x, c, z, d, l, a, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(decdl2branchbb _this,
			Branch y, Branch x, Branch c, Command z, Decision d, Assignment l, Decision a, While b, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(y, x, c, z, d, l, a, b, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, y, x, c, z, d, l, a, b, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdl2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(decdl2branchbb _this,
			Branch y, Branch x, Branch c, Command z, Decision d, Assignment l, Decision a, While b, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_decdl2branchbb_24_3_solvecsp_binding = pattern_decdl2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, y, x, c, z, d, l, a, b, sourceMatch, targetMatch);
		if (result_pattern_decdl2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decdl2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_decdl2branchbb_24_3_solvecsp_black = pattern_decdl2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decdl2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, y, x, c, z, d, l, a, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decdl2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decdl2branchbb_24_5_matchcorrcontext_blackBFBBB(Branch c, Decision d,
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

	public static final Object[] pattern_decdl2branchbb_24_5_matchcorrcontext_greenBBBF(S2B d2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "decdl2branchbb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_decdl2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(Branch y, Branch x,
			Branch c, Command z, Decision d, Assignment l, Decision a, While b, CCMatch ccMatch) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					if (!a.equals(d)) {
						return new Object[] { y, x, c, z, d, l, a, b, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_24_6_createcorrespondence_greenBFBFBBBFBB(Branch y, Branch x,
			Command z, Assignment l, Decision a, While b, CCMatch ccMatch) {
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		l2z.setTarget(z);
		l2z.setSource(l);
		ccMatch.getCreateCorr().add(l2z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { y, b2y, x, l2z, z, l, a, a2x, b, ccMatch };
	}

	public static final Object[] pattern_decdl2branchbb_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_decdl2branchbb_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "decdl2branchbb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_decdl2branchbb_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_0BBB(Assignment l, Decision d,
			Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_positive_405690 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "positive")) {
				if (!d.equals(__DEC_l_positive_405690)) {
					if (!a.equals(__DEC_l_positive_405690)) {
						return new Object[] { l, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_1BBB(Assignment l, Decision d,
			Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_l_negative_357138 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(l, Decision.class, "negative")) {
				if (!d.equals(__DEC_l_negative_357138)) {
					if (!a.equals(__DEC_l_negative_357138)) {
						return new Object[] { l, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_2BB(Assignment l, While b) {
		for (While __DEC_l_first_269834 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "first")) {
			if (!b.equals(__DEC_l_first_269834)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_3BB(Assignment l, While b) {
		for (While __DEC_l_last_495875 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_495875)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_4B(Assignment l) {
		for (Program __DEC_l_first_817586 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_5BB(Decision a, Decision d) {
		if (!a.equals(d)) {
			for (Decision __DEC_a_negative_708711 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(a, Decision.class, "negative")) {
				if (!a.equals(__DEC_a_negative_708711)) {
					if (!d.equals(__DEC_a_negative_708711)) {
						return new Object[] { a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_6BB(Decision a, While b) {
		for (While __DEC_a_first_630574 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_630574)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_7BB(Decision a, While b) {
		for (While __DEC_a_last_685166 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_685166)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_8B(Decision a) {
		for (Program __DEC_a_first_268190 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_9BBB(While b, Decision d,
			Decision a) {
		if (!a.equals(d)) {
			for (Decision __DEC_b_positive_299616 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(b, Decision.class, "positive")) {
				if (!d.equals(__DEC_b_positive_299616)) {
					if (!a.equals(__DEC_b_positive_299616)) {
						return new Object[] { b, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_10B(While b) {
		for (While __DEC_b_first_259278 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_259278)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_11B(While b) {
		for (While __DEC_b_last_262995 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_262995)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_12B(While b) {
		for (Program __DEC_b_first_192867 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_13BB(Decision d, Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_14BB(Decision a, Assignment l) {
		if (l.equals(a.getPositive())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_15BB(Decision d, Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_16BB(Decision a, Assignment l) {
		if (l.equals(a.getNegative())) {
			return new Object[] { a, l };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_17BB(While b, Assignment l) {
		if (l.equals(b.getFirst())) {
			return new Object[] { b, l };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_18BB(Decision d, Decision a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_19BB(While b, Decision a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_20BB(While b, Decision a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_21BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_22BB(Decision a, While b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_27_1_matchtggpattern_blackBBBB(Decision d, Assignment l,
			Decision a, While b) {
		if (!a.equals(d)) {
			if (a.equals(d.getPositive())) {
				if (b.equals(d.getNegative())) {
					if (l.equals(b.getLast())) {
						if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_0BBB(l, d, a) == null) {
							if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_1BBB(l, d, a) == null) {
								if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_2BB(l, b) == null) {
									if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_3BB(l, b) == null) {
										if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_4B(l) == null) {
											if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_5BB(a,
													d) == null) {
												if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_6BB(a,
														b) == null) {
													if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_7BB(a,
															b) == null) {
														if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_8B(
																a) == null) {
															if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_9BBB(
																	b, d, a) == null) {
																if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_10B(
																		b) == null) {
																	if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_11B(
																			b) == null) {
																		if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_12B(
																				b) == null) {
																			if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_13BB(
																					d, l) == null) {
																				if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_14BB(
																						a, l) == null) {
																					if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_15BB(
																							d, l) == null) {
																						if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_16BB(
																								a, l) == null) {
																							if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_17BB(
																									b, l) == null) {
																								if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_18BB(
																										d, a) == null) {
																									if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_19BB(
																											b,
																											a) == null) {
																										if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_20BB(
																												b,
																												a) == null) {
																											if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_21BB(
																													d,
																													b) == null) {
																												if (pattern_decdl2branchbb_27_1_matchtggpattern_black_nac_22BB(
																														a,
																														b) == null) {
																													return new Object[] {
																															d,
																															l,
																															a,
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
		return null;
	}

	public static final boolean pattern_decdl2branchbb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdl2branchbb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_0B(Branch y) {
		for (Graph __DEC_y_root_83813 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_1BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_positive_188332 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!y.equals(__DEC_y_positive_188332)) {
							if (!x.equals(__DEC_y_positive_188332)) {
								if (!c.equals(__DEC_y_positive_188332)) {
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

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_2BBB(Branch y, Branch x,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_y_negative_16872 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!y.equals(__DEC_y_negative_16872)) {
							if (!x.equals(__DEC_y_negative_16872)) {
								if (!c.equals(__DEC_y_negative_16872)) {
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

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_227445 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_4BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_positive_332562 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_332562)) {
							if (!y.equals(__DEC_x_positive_332562)) {
								if (!c.equals(__DEC_x_positive_332562)) {
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

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_5BBB(Branch x, Branch y,
			Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(x)) {
				if (!c.equals(y)) {
					for (Branch __DEC_x_negative_867485 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_867485)) {
							if (!y.equals(__DEC_x_negative_867485)) {
								if (!c.equals(__DEC_x_negative_867485)) {
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

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_926245 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_7BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_positive_937645 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!y.equals(__DEC_z_positive_937645)) {
							if (!x.equals(__DEC_z_positive_937645)) {
								if (!c.equals(__DEC_z_positive_937645)) {
									return new Object[] { z, y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_8BBBB(Command z, Branch y,
			Branch x, Branch c) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					for (Branch __DEC_z_negative_757290 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!y.equals(__DEC_z_negative_757290)) {
							if (!x.equals(__DEC_z_negative_757290)) {
								if (!c.equals(__DEC_z_negative_757290)) {
									return new Object[] { z, y, x, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_9BB(Branch y, Branch x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_10BB(Branch y, Branch x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_11BB(Branch y, Command z) {
		if (z.equals(y.getPositive())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_12BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_13BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_14BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_15BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_16BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_28_1_matchtggpattern_blackBBBB(Branch y, Branch x, Branch c,
			Command z) {
		if (!x.equals(y)) {
			if (!c.equals(y)) {
				if (!c.equals(x)) {
					if (x.equals(c.getPositive())) {
						if (y.equals(z.getNext())) {
							if (y.equals(c.getNegative())) {
								if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_0B(y) == null) {
									if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_1BBB(y, x, c) == null) {
										if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_2BBB(y, x,
												c) == null) {
											if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_3B(x) == null) {
												if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_4BBB(x, y,
														c) == null) {
													if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_5BBB(x, y,
															c) == null) {
														if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_6B(
																z) == null) {
															if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_7BBBB(
																	z, y, x, c) == null) {
																if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_8BBBB(
																		z, y, x, c) == null) {
																	if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_9BB(
																			y, x) == null) {
																		if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_10BB(
																				y, x) == null) {
																			if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_11BB(
																					y, z) == null) {
																				if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_12BB(
																						x, z) == null) {
																					if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_13BB(
																							c, z) == null) {
																						if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_14BB(
																								y, z) == null) {
																							if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_15BB(
																									x, z) == null) {
																								if (pattern_decdl2branchbb_28_1_matchtggpattern_black_nac_16BB(
																										c, z) == null) {
																									return new Object[] {
																											y, x, c,
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
		return null;
	}

	public static final boolean pattern_decdl2branchbb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decdl2branchbb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_29_1_createresult_blackB(decdl2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decdl2branchbb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_decdl2branchbb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decdl2branchbb_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_decdl2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult, d2c) == null) {
								if (pattern_decdl2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult, c) == null) {
									if (pattern_decdl2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_decdl2branchbb_29_3_solveCSP_bindingFBBBBBB(decdl2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, c, d2c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decdl2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decdl2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(decdl2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch c, S2B d2c, Decision d, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decdl2branchbb_29_3_solveCSP_binding = pattern_decdl2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, c, d2c, d, ruleResult);
		if (result_pattern_decdl2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decdl2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_decdl2branchbb_29_3_solveCSP_black = pattern_decdl2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decdl2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d2c, d, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decdl2branchbb_29_4_checkCSP_expressionFBB(decdl2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decdl2branchbb_29_5_checknacs_blackBBB(Branch c, S2B d2c, Decision d) {
		return new Object[] { c, d2c, d };
	}

	public static final Object[] pattern_decdl2branchbb_29_6_perform_blackBBBB(Branch c, S2B d2c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { c, d2c, d, ruleResult };
	}

	public static final Object[] pattern_decdl2branchbb_29_6_perform_greenFFFBFFBFFFFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.getCorrObjects().add(l2z);
		l2z.setTarget(z);
		z.setNext(y);
		ruleResult.getTargetObjects().add(z);
		l2z.setSource(l);
		ruleResult.getSourceObjects().add(l);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		d.setNegative(b);
		b2y.setSource(b);
		b.setLast(l);
		ruleResult.getSourceObjects().add(b);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { y, b2y, x, c, l2z, z, d, l, a, a2x, b, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decdl2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decdl2branchbbImpl
