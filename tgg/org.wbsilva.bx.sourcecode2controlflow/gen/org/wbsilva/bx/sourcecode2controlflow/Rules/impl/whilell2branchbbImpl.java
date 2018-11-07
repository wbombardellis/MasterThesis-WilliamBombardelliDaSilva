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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whilell2branchbb;

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
 * An implementation of the model object '<em><b>whilell2branchbb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whilell2branchbbImpl extends AbstractRuleImpl implements whilell2branchbb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whilell2branchbbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhilell2branchbb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment b, While c, While w, Assignment d, While a) {

		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_0_1_initialbindings_blackBBBBBBB(this,
				match, b, c, w, d, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[d] = " + d + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, b, c, w, d, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[d] = " + d + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilell2branchbbImpl.pattern_whilell2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_0_4_collectelementstobetranslated_blackBBBBBB(match, b, c, w, d, a);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[b] = " + b + ", "
								+ "[c] = " + c + ", " + "[w] = " + w + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(match, b, c,
					w, d, a);
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__d____last = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[9];

			Object[] result5_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_0_5_collectcontextelements_blackBBBBBB(match, b, c, w, d, a);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[b] = " + b + ", "
								+ "[c] = " + c + ", " + "[w] = " + w + ", " + "[d] = " + d + ", " + "[a] = " + a + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whilell2branchbbImpl.pattern_whilell2branchbb_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, b,
					c, w, d, a);
			return whilell2branchbbImpl.pattern_whilell2branchbb_0_7_expressionF();
		} else {
			return whilell2branchbbImpl.pattern_whilell2branchbb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment b = (Assignment) result1_bindingAndBlack[0];
		While c = (While) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		Branch i = (Branch) result1_bindingAndBlack[3];
		While w = (While) result1_bindingAndBlack[4];
		Assignment d = (Assignment) result1_bindingAndBlack[5];
		While a = (While) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_1_performtransformation_greenFFFBBBFFBBFFF(b, c, i, d, a);
		S2N d2v = (S2N) result1_green[0];
		S2B a2x = (S2B) result1_green[1];
		Branch z = (Branch) result1_green[2];
		Command y = (Command) result1_green[6];
		Command v = (Command) result1_green[7];
		S2B c2z = (S2B) result1_green[10];
		S2N b2y = (S2N) result1_green[11];
		Branch x = (Branch) result1_green[12];

		Object[] result2_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(d2v, a2x, z, b, c, y, v, d, a,
						c2z, b2y, x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2v] = " + d2v + ", "
					+ "[a2x] = " + a2x + ", " + "[z] = " + z + ", " + "[b] = " + b + ", " + "[c] = " + c + ", "
					+ "[y] = " + y + ", " + "[v] = " + v + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[c2z] = "
					+ c2z + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(d2v, a2x, z, b, c, y, v, d,
						a, c2z, b2y, x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, d2v, a2x, z, b, c,
						w2i, i, w, y, v, d, a, c2z, b2y, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d2v] = " + d2v + ", " + "[a2x] = " + a2x + ", " + "[z] = " + z + ", " + "[b] = " + b
					+ ", " + "[c] = " + c + ", " + "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[w] = " + w + ", "
					+ "[y] = " + y + ", " + "[v] = " + v + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[c2z] = "
					+ c2z + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ".");
		}
		whilell2branchbbImpl.pattern_whilell2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, d2v, a2x, z, b, c, i, w, y, v, d, a, c2z, b2y, x);
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[30];

		// 
		// 
		whilell2branchbbImpl.pattern_whilell2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				d2v, a2x, z, b, c, w2i, i, w, y, v, d, a, c2z, b2y, x);
		return whilell2branchbbImpl.pattern_whilell2branchbb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whilell2branchbbImpl.pattern_whilell2branchbb_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment b = (Assignment) result2_binding[0];
		While c = (While) result2_binding[1];
		While w = (While) result2_binding[2];
		Assignment d = (Assignment) result2_binding[3];
		While a = (While) result2_binding[4];
		for (Object[] result2_black : whilell2branchbbImpl.pattern_whilell2branchbb_2_2_corematch_blackBBFFBBBB(b, c, w,
				d, a, match)) {
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whilell2branchbbImpl.pattern_whilell2branchbb_2_3_findcontext_blackBBBBBBB(b,
					c, w2i, i, w, d, a)) {
				Object[] result3_green = whilell2branchbbImpl
						.pattern_whilell2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(b, c, w2i, i, w, d, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = whilell2branchbbImpl
						.pattern_whilell2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, b, c,
								w2i, i, w, d, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[b] = " + b + ", " + "[c] = " + c
							+ ", " + "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[w] = " + w + ", " + "[d] = " + d
							+ ", " + "[a] = " + a + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whilell2branchbbImpl.pattern_whilell2branchbb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whilell2branchbbImpl
							.pattern_whilell2branchbb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whilell2branchbbImpl.pattern_whilell2branchbb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whilell2branchbbImpl.pattern_whilell2branchbb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment b, While c, While w, Assignment d, While a) {
		match.registerObject("b", b);
		match.registerObject("c", c);
		match.registerObject("w", w);
		match.registerObject("d", d);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment b, While c, While w, Assignment d, While a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment b, While c, S2B w2i, Branch i,
			While w, Assignment d, While a) {// Create CSP
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
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject d2v, EObject a2x, EObject z, EObject b,
			EObject c, EObject w2i, EObject i, EObject w, EObject y, EObject v, EObject d, EObject a, EObject c2z,
			EObject b2y, EObject x) {
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b2y", b2y);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch z, Branch i, Command y, Command v, Branch x) {

		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_10_1_initialbindings_blackBBBBBBB(this,
				match, z, i, y, v, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[i] = " + i + ", " + "[y] = " + y + ", "
					+ "[v] = " + v + ", " + "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, z, i, y, v, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[i] = " + i + ", " + "[y] = " + y + ", "
					+ "[v] = " + v + ", " + "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilell2branchbbImpl.pattern_whilell2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_10_4_collectelementstobetranslated_blackBBBBBB(match, z, i, y, v, x);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[i] = " + i + ", " + "[y] = " + y + ", " + "[v] = " + v + ", " + "[x] = " + x + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(match, z,
					i, y, v, x);
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge v__z____next = (EMoflonEdge) result4_green[9];

			Object[] result5_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_10_5_collectcontextelements_blackBBBBBB(match, z, i, y, v, x);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[i] = " + i + ", " + "[y] = " + y + ", " + "[v] = " + v + ", " + "[x] = " + x + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whilell2branchbbImpl.pattern_whilell2branchbb_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, z,
					i, y, v, x);
			return whilell2branchbbImpl.pattern_whilell2branchbb_10_7_expressionF();
		} else {
			return whilell2branchbbImpl.pattern_whilell2branchbb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch z = (Branch) result1_bindingAndBlack[0];
		S2B w2i = (S2B) result1_bindingAndBlack[1];
		Branch i = (Branch) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		Command y = (Command) result1_bindingAndBlack[4];
		Command v = (Command) result1_bindingAndBlack[5];
		Branch x = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_1_performtransformation_greenFFBFFBBBFFFFB(z, w, y, v, x);
		S2N d2v = (S2N) result1_green[0];
		S2B a2x = (S2B) result1_green[1];
		Assignment b = (Assignment) result1_green[3];
		While c = (While) result1_green[4];
		Assignment d = (Assignment) result1_green[8];
		While a = (While) result1_green[9];
		S2B c2z = (S2B) result1_green[10];
		S2N b2y = (S2N) result1_green[11];

		Object[] result2_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(d2v, a2x, z, b, c, y, v, d,
						a, c2z, b2y, x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2v] = " + d2v + ", "
					+ "[a2x] = " + a2x + ", " + "[z] = " + z + ", " + "[b] = " + b + ", " + "[c] = " + c + ", "
					+ "[y] = " + y + ", " + "[v] = " + v + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[c2z] = "
					+ c2z + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(d2v, a2x, z, b, c, y, v, d,
						a, c2z, b2y, x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, d2v, a2x, z, b, c,
						w2i, i, w, y, v, d, a, c2z, b2y, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d2v] = " + d2v + ", " + "[a2x] = " + a2x + ", " + "[z] = " + z + ", " + "[b] = " + b
					+ ", " + "[c] = " + c + ", " + "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[w] = " + w + ", "
					+ "[y] = " + y + ", " + "[v] = " + v + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[c2z] = "
					+ c2z + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ".");
		}
		whilell2branchbbImpl.pattern_whilell2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, d2v, a2x, z, b, c, i, w, y, v, d, a, c2z, b2y, x);
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[30];

		// 
		// 
		whilell2branchbbImpl.pattern_whilell2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				d2v, a2x, z, b, c, w2i, i, w, y, v, d, a, c2z, b2y, x);
		return whilell2branchbbImpl.pattern_whilell2branchbb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whilell2branchbbImpl.pattern_whilell2branchbb_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch z = (Branch) result2_binding[0];
		Branch i = (Branch) result2_binding[1];
		Command y = (Command) result2_binding[2];
		Command v = (Command) result2_binding[3];
		Branch x = (Branch) result2_binding[4];
		for (Object[] result2_black : whilell2branchbbImpl.pattern_whilell2branchbb_12_2_corematch_blackBFBFBBBB(z, i,
				y, v, x, match)) {
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whilell2branchbbImpl.pattern_whilell2branchbb_12_3_findcontext_blackBBBBBBB(z,
					w2i, i, w, y, v, x)) {
				Object[] result3_green = whilell2branchbbImpl
						.pattern_whilell2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(z, w2i, i, w, y, v, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = whilell2branchbbImpl
						.pattern_whilell2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, z,
								w2i, i, w, y, v, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[z] = " + z + ", " + "[w2i] = "
							+ w2i + ", " + "[i] = " + i + ", " + "[w] = " + w + ", " + "[y] = " + y + ", " + "[v] = "
							+ v + ", " + "[x] = " + x + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whilell2branchbbImpl.pattern_whilell2branchbb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whilell2branchbbImpl
							.pattern_whilell2branchbb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whilell2branchbbImpl.pattern_whilell2branchbb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whilell2branchbbImpl.pattern_whilell2branchbb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch z, Branch i, Command y, Command v, Branch x) {
		match.registerObject("z", z);
		match.registerObject("i", i);
		match.registerObject("y", y);
		match.registerObject("v", v);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch z, Branch i, Command y, Command v, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch z, S2B w2i, Branch i, While w,
			Command y, Command v, Branch x) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("v", v);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject d2v, EObject a2x, EObject z, EObject b,
			EObject c, EObject w2i, EObject i, EObject w, EObject y, EObject v, EObject d, EObject a, EObject c2z,
			EObject b2y, EObject x) {
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("v").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_92(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whilell2branchbbImpl.pattern_whilell2branchbb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whilell2branchbbImpl
				.pattern_whilell2branchbb_20_2_testcorematchandDECs_blackFFFFFB(_edge_positive)) {
			Branch z = (Branch) result2_black[0];
			Branch i = (Branch) result2_black[1];
			Command y = (Command) result2_black[2];
			Command v = (Command) result2_black[3];
			Branch x = (Branch) result2_black[4];
			Object[] result2_green = whilell2branchbbImpl
					.pattern_whilell2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilell2branchbbImpl
					.pattern_whilell2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, z, i, y, v, x)) {
				// 
				if (whilell2branchbbImpl
						.pattern_whilell2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whilell2branchbbImpl
							.pattern_whilell2branchbb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whilell2branchbbImpl.pattern_whilell2branchbb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whilell2branchbbImpl.pattern_whilell2branchbb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_98(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whilell2branchbbImpl.pattern_whilell2branchbb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whilell2branchbbImpl
				.pattern_whilell2branchbb_21_2_testcorematchandDECs_blackFFFFFB(_edge_first)) {
			Assignment b = (Assignment) result2_black[0];
			While c = (While) result2_black[1];
			While w = (While) result2_black[2];
			Assignment d = (Assignment) result2_black[3];
			While a = (While) result2_black[4];
			Object[] result2_green = whilell2branchbbImpl
					.pattern_whilell2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilell2branchbbImpl
					.pattern_whilell2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, b, c, w, d, a)) {
				// 
				if (whilell2branchbbImpl
						.pattern_whilell2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whilell2branchbbImpl
							.pattern_whilell2branchbb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whilell2branchbbImpl.pattern_whilell2branchbb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whilell2branchbbImpl.pattern_whilell2branchbb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whilell2branchbb");
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
		ruleResult.setRule("whilell2branchbb");
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

		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whilell2branchbbImpl.pattern_whilell2branchbb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Branch z = (Branch) result2_bindingAndBlack[0];
		Assignment b = (Assignment) result2_bindingAndBlack[1];
		While c = (While) result2_bindingAndBlack[2];
		Branch i = (Branch) result2_bindingAndBlack[3];
		While w = (While) result2_bindingAndBlack[4];
		Command y = (Command) result2_bindingAndBlack[5];
		Command v = (Command) result2_bindingAndBlack[6];
		Assignment d = (Assignment) result2_bindingAndBlack[7];
		While a = (While) result2_bindingAndBlack[8];
		Branch x = (Branch) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, z, b, c, i, w, y, v, d, a,
						x, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[z] = " + z + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[i] = " + i + ", " + "[w] = "
					+ w + ", " + "[y] = " + y + ", " + "[v] = " + v + ", " + "[d] = " + d + ", " + "[a] = " + a + ", "
					+ "[x] = " + x + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whilell2branchbbImpl.pattern_whilell2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whilell2branchbbImpl
					.pattern_whilell2branchbb_24_5_matchcorrcontext_blackFBBBB(i, w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[0];
				Object[] result5_green = whilell2branchbbImpl
						.pattern_whilell2branchbb_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whilell2branchbbImpl
						.pattern_whilell2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(z, b, c, i, w, y, v, d, a,
								x, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", "
							+ "[b] = " + b + ", " + "[c] = " + c + ", " + "[i] = " + i + ", " + "[w] = " + w + ", "
							+ "[y] = " + y + ", " + "[v] = " + v + ", " + "[d] = " + d + ", " + "[a] = " + a + ", "
							+ "[x] = " + x + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilell2branchbbImpl.pattern_whilell2branchbb_24_6_createcorrespondence_greenFFBBBBBBBFFBB(z, b, c, y,
						v, d, a, x, ccMatch);
				//nothing S2N d2v = (S2N) result6_green[0];
				//nothing S2B a2x = (S2B) result6_green[1];
				//nothing S2B c2z = (S2B) result6_green[9];
				//nothing S2N b2y = (S2N) result6_green[10];

				Object[] result7_black = whilell2branchbbImpl
						.pattern_whilell2branchbb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilell2branchbbImpl.pattern_whilell2branchbb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whilell2branchbbImpl.pattern_whilell2branchbb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Branch z, Assignment b, While c, Branch i, While w, Command y, Command v,
			Assignment d, While a, Branch x, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment b, While c, While w, Assignment d, While a) {// 
		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_27_1_matchtggpattern_blackBBBBB(b, c, w,
				d, a);
		if (result1_black != null) {
			return whilell2branchbbImpl.pattern_whilell2branchbb_27_2_expressionF();
		} else {
			return whilell2branchbbImpl.pattern_whilell2branchbb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch z, Branch i, Command y, Command v, Branch x) {// 
		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_28_1_matchtggpattern_blackBBBBB(z, i, y,
				v, x);
		if (result1_black != null) {
			return whilell2branchbbImpl.pattern_whilell2branchbb_28_2_expressionF();
		} else {
			return whilell2branchbbImpl.pattern_whilell2branchbb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whilell2branchbbImpl.pattern_whilell2branchbb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whilell2branchbbImpl
				.pattern_whilell2branchbb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whilell2branchbbImpl
					.pattern_whilell2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w2i, i, w,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[i] = " + i
						+ ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whilell2branchbbImpl.pattern_whilell2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whilell2branchbbImpl.pattern_whilell2branchbb_29_5_checknacs_blackBBB(w2i, i,
						w);
				if (result5_black != null) {

					Object[] result6_black = whilell2branchbbImpl.pattern_whilell2branchbb_29_6_perform_blackBBBB(w2i,
							i, w, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w2i] = " + w2i + ", "
								+ "[i] = " + i + ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whilell2branchbbImpl.pattern_whilell2branchbb_29_6_perform_greenFFFFFBBFFFFFFFB(i, w, ruleResult);
					//nothing S2N d2v = (S2N) result6_green[0];
					//nothing S2B a2x = (S2B) result6_green[1];
					//nothing Branch z = (Branch) result6_green[2];
					//nothing Assignment b = (Assignment) result6_green[3];
					//nothing While c = (While) result6_green[4];
					//nothing Command y = (Command) result6_green[7];
					//nothing Command v = (Command) result6_green[8];
					//nothing Assignment d = (Assignment) result6_green[9];
					//nothing While a = (While) result6_green[10];
					//nothing S2B c2z = (S2B) result6_green[11];
					//nothing S2N b2y = (S2N) result6_green[12];
					//nothing Branch x = (Branch) result6_green[13];

				} else {
				}

			} else {
			}

		}
		return whilell2branchbbImpl.pattern_whilell2branchbb_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w", w);
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
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_WHILE_ASSIGNMENT_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4), (While) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_WHILE_ASSIGNMENT_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5));
			return null;
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_WHILE_ASSIGNMENT_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_WHILE_S2B_BRANCH_WHILE_ASSIGNMENT_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (S2B) arguments.get(3), (Branch) arguments.get(4),
					(While) arguments.get(5), (Assignment) arguments.get(6), (While) arguments.get(7));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.WHILELL2BRANCHBB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_BRANCH_WHILE_COMMAND_COMMAND_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (While) arguments.get(4),
					(Command) arguments.get(5), (Command) arguments.get(6), (Branch) arguments.get(7));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.WHILELL2BRANCHBB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_92__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_92((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_98__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_98((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_ASSIGNMENT_WHILE_BRANCH_WHILE_COMMAND_COMMAND_ASSIGNMENT_WHILE_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (While) arguments.get(4),
					(Command) arguments.get(5), (Command) arguments.get(6), (Assignment) arguments.get(7),
					(While) arguments.get(8), (Branch) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_DEC_FWD__ASSIGNMENT_WHILE_WHILE_ASSIGNMENT_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_DEC_BWD__BRANCH_BRANCH_COMMAND_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILELL2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILELL2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_WHILE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILELL2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whilell2branchbb_0_1_initialbindings_blackBBBBBBB(whilell2branchbb _this,
			Match match, Assignment b, While c, While w, Assignment d, While a) {
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						return new Object[] { _this, match, b, c, w, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_0_2_SolveCSP_bindingFBBBBBBB(whilell2branchbb _this,
			Match match, Assignment b, While c, While w, Assignment d, While a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, c, w, d, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, c, w, d, a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(whilell2branchbb _this,
			Match match, Assignment b, While c, While w, Assignment d, While a) {
		Object[] result_pattern_whilell2branchbb_0_2_SolveCSP_binding = pattern_whilell2branchbb_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, b, c, w, d, a);
		if (result_pattern_whilell2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_0_2_SolveCSP_black = pattern_whilell2branchbb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, c, w, d, a };
			}
		}
		return null;
	}

	public static final boolean pattern_whilell2branchbb_0_3_CheckCSP_expressionFBB(whilell2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			Assignment b, While c, While w, Assignment d, While a) {
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						return new Object[] { match, b, c, w, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(Match match,
			Assignment b, While c, While w, Assignment d, While a) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(d);
		match.getToBeTranslatedNodes().add(a);
		String w__a____first_name_prime = "first";
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String w__c____next_name_prime = "next";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____last);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		w__a____first.setName(w__a____first_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { match, b, c, w, d, a, w__a____first, c__d____last, a__b____last, w__c____next };
	}

	public static final Object[] pattern_whilell2branchbb_0_5_collectcontextelements_blackBBBBBB(Match match,
			Assignment b, While c, While w, Assignment d, While a) {
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						return new Object[] { match, b, c, w, d, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whilell2branchbb_0_6_registerobjectstomatch_expressionBBBBBBB(
			whilell2branchbb _this, Match match, Assignment b, While c, While w, Assignment d, While a) {
		_this.registerObjectsToMatch_FWD(match, b, c, w, d, a);

	}

	public static final boolean pattern_whilell2branchbb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilell2branchbb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("b");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("i");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject _localVariable_6 = isApplicableMatch.getObject("a");
		EObject tmpB = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpD = _localVariable_5;
		EObject tmpA = _localVariable_6;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpC instanceof While) {
				While c = (While) tmpC;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpD instanceof Assignment) {
								Assignment d = (Assignment) tmpD;
								if (tmpA instanceof While) {
									While a = (While) tmpA;
									return new Object[] { b, c, w2i, i, w, d, a, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_1_1_performtransformation_blackBBBBBBBFBB(Assignment b,
			While c, S2B w2i, Branch i, While w, Assignment d, While a, whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { b, c, w2i, i, w, d, a, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			whilell2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whilell2branchbb_1_1_performtransformation_binding = pattern_whilell2branchbb_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whilell2branchbb_1_1_performtransformation_binding != null) {
			Assignment b = (Assignment) result_pattern_whilell2branchbb_1_1_performtransformation_binding[0];
			While c = (While) result_pattern_whilell2branchbb_1_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whilell2branchbb_1_1_performtransformation_binding[2];
			Branch i = (Branch) result_pattern_whilell2branchbb_1_1_performtransformation_binding[3];
			While w = (While) result_pattern_whilell2branchbb_1_1_performtransformation_binding[4];
			Assignment d = (Assignment) result_pattern_whilell2branchbb_1_1_performtransformation_binding[5];
			While a = (While) result_pattern_whilell2branchbb_1_1_performtransformation_binding[6];

			Object[] result_pattern_whilell2branchbb_1_1_performtransformation_black = pattern_whilell2branchbb_1_1_performtransformation_blackBBBBBBBFBB(
					b, c, w2i, i, w, d, a, _this, isApplicableMatch);
			if (result_pattern_whilell2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilell2branchbb_1_1_performtransformation_black[7];

				return new Object[] { b, c, w2i, i, w, d, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_1_1_performtransformation_greenFFFBBBFFBBFFF(Assignment b,
			While c, Branch i, Assignment d, While a) {
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		d2v.setSource(d);
		a2x.setSource(a);
		i.setNegative(z);
		v.setNext(z);
		d2v.setTarget(v);
		c2z.setTarget(z);
		c2z.setSource(c);
		b2y.setSource(b);
		b2y.setTarget(y);
		i.setPositive(x);
		y.setNext(x);
		a2x.setTarget(x);
		return new Object[] { d2v, a2x, z, b, c, i, y, v, d, a, c2z, b2y, x };
	}

	public static final Object[] pattern_whilell2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2N d2v,
			S2B a2x, Branch z, Assignment b, While c, Command y, Command v, Assignment d, While a, S2B c2z, S2N b2y,
			Branch x) {
		if (!a2x.equals(c2z)) {
			if (!b.equals(d)) {
				if (!v.equals(y)) {
					if (!a.equals(c)) {
						if (!b2y.equals(d2v)) {
							if (!x.equals(z)) {
								return new Object[] { d2v, a2x, z, b, c, y, v, d, a, c2z, b2y, x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2N d2v,
			S2B a2x, Branch z, Assignment b, While c, Command y, Command v, Assignment d, While a, S2B c2z, S2N b2y,
			Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedElements().add(v);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(x);
		return new Object[] { ruleresult, d2v, a2x, z, b, c, y, v, d, a, c2z, b2y, x };
	}

	public static final Object[] pattern_whilell2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d2v, EObject a2x, EObject z, EObject b, EObject c, EObject w2i,
			EObject i, EObject w, EObject y, EObject v, EObject d, EObject a, EObject c2z, EObject b2y, EObject x) {
		if (!d2v.equals(z)) {
			if (!d2v.equals(w2i)) {
				if (!d2v.equals(i)) {
					if (!d2v.equals(w)) {
						if (!d2v.equals(y)) {
							if (!d2v.equals(v)) {
								if (!d2v.equals(x)) {
									if (!a2x.equals(d2v)) {
										if (!a2x.equals(z)) {
											if (!a2x.equals(b)) {
												if (!a2x.equals(c)) {
													if (!a2x.equals(w2i)) {
														if (!a2x.equals(i)) {
															if (!a2x.equals(w)) {
																if (!a2x.equals(y)) {
																	if (!a2x.equals(v)) {
																		if (!a2x.equals(d)) {
																			if (!a2x.equals(c2z)) {
																				if (!a2x.equals(b2y)) {
																					if (!a2x.equals(x)) {
																						if (!b.equals(d2v)) {
																							if (!b.equals(z)) {
																								if (!b.equals(c)) {
																									if (!b.equals(
																											w2i)) {
																										if (!b.equals(
																												i)) {
																											if (!b.equals(
																													w)) {
																												if (!b.equals(
																														y)) {
																													if (!b.equals(
																															v)) {
																														if (!b.equals(
																																d)) {
																															if (!b.equals(
																																	c2z)) {
																																if (!b.equals(
																																		b2y)) {
																																	if (!b.equals(
																																			x)) {
																																		if (!c.equals(
																																				d2v)) {
																																			if (!c.equals(
																																					z)) {
																																				if (!c.equals(
																																						w2i)) {
																																					if (!c.equals(
																																							i)) {
																																						if (!c.equals(
																																								w)) {
																																							if (!c.equals(
																																									y)) {
																																								if (!c.equals(
																																										v)) {
																																									if (!c.equals(
																																											d)) {
																																										if (!c.equals(
																																												c2z)) {
																																											if (!c.equals(
																																													x)) {
																																												if (!w2i.equals(
																																														z)) {
																																													if (!w2i.equals(
																																															y)) {
																																														if (!w2i.equals(
																																																x)) {
																																															if (!i.equals(
																																																	z)) {
																																																if (!i.equals(
																																																		w2i)) {
																																																	if (!i.equals(
																																																			w)) {
																																																		if (!i.equals(
																																																				y)) {
																																																			if (!i.equals(
																																																					v)) {
																																																				if (!i.equals(
																																																						x)) {
																																																					if (!w.equals(
																																																							z)) {
																																																						if (!w.equals(
																																																								w2i)) {
																																																							if (!w.equals(
																																																									y)) {
																																																								if (!w.equals(
																																																										x)) {
																																																									if (!y.equals(
																																																											z)) {
																																																										if (!v.equals(
																																																												z)) {
																																																											if (!v.equals(
																																																													w2i)) {
																																																												if (!v.equals(
																																																														w)) {
																																																													if (!v.equals(
																																																															y)) {
																																																														if (!v.equals(
																																																																x)) {
																																																															if (!d.equals(
																																																																	d2v)) {
																																																																if (!d.equals(
																																																																		z)) {
																																																																	if (!d.equals(
																																																																			w2i)) {
																																																																		if (!d.equals(
																																																																				i)) {
																																																																			if (!d.equals(
																																																																					w)) {
																																																																				if (!d.equals(
																																																																						y)) {
																																																																					if (!d.equals(
																																																																							v)) {
																																																																						if (!d.equals(
																																																																								x)) {
																																																																							if (!a.equals(
																																																																									d2v)) {
																																																																								if (!a.equals(
																																																																										a2x)) {
																																																																									if (!a.equals(
																																																																											z)) {
																																																																										if (!a.equals(
																																																																												b)) {
																																																																											if (!a.equals(
																																																																													c)) {
																																																																												if (!a.equals(
																																																																														w2i)) {
																																																																													if (!a.equals(
																																																																															i)) {
																																																																														if (!a.equals(
																																																																																w)) {
																																																																															if (!a.equals(
																																																																																	y)) {
																																																																																if (!a.equals(
																																																																																		v)) {
																																																																																	if (!a.equals(
																																																																																			d)) {
																																																																																		if (!a.equals(
																																																																																				c2z)) {
																																																																																			if (!a.equals(
																																																																																					b2y)) {
																																																																																				if (!a.equals(
																																																																																						x)) {
																																																																																					if (!c2z.equals(
																																																																																							d2v)) {
																																																																																						if (!c2z.equals(
																																																																																								z)) {
																																																																																							if (!c2z.equals(
																																																																																									w2i)) {
																																																																																								if (!c2z.equals(
																																																																																										i)) {
																																																																																									if (!c2z.equals(
																																																																																											w)) {
																																																																																										if (!c2z.equals(
																																																																																												y)) {
																																																																																											if (!c2z.equals(
																																																																																													v)) {
																																																																																												if (!c2z.equals(
																																																																																														d)) {
																																																																																													if (!c2z.equals(
																																																																																															x)) {
																																																																																														if (!b2y.equals(
																																																																																																d2v)) {
																																																																																															if (!b2y.equals(
																																																																																																	z)) {
																																																																																																if (!b2y.equals(
																																																																																																		c)) {
																																																																																																	if (!b2y.equals(
																																																																																																			w2i)) {
																																																																																																		if (!b2y.equals(
																																																																																																				i)) {
																																																																																																			if (!b2y.equals(
																																																																																																					w)) {
																																																																																																				if (!b2y.equals(
																																																																																																						y)) {
																																																																																																					if (!b2y.equals(
																																																																																																							v)) {
																																																																																																						if (!b2y.equals(
																																																																																																								d)) {
																																																																																																							if (!b2y.equals(
																																																																																																									c2z)) {
																																																																																																								if (!b2y.equals(
																																																																																																										x)) {
																																																																																																									if (!x.equals(
																																																																																																											z)) {
																																																																																																										if (!x.equals(
																																																																																																												y)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													d2v,
																																																																																																													a2x,
																																																																																																													z,
																																																																																																													b,
																																																																																																													c,
																																																																																																													w2i,
																																																																																																													i,
																																																																																																													w,
																																																																																																													y,
																																																																																																													v,
																																																																																																													d,
																																																																																																													a,
																																																																																																													c2z,
																																																																																																													b2y,
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
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilell2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject d2v, EObject a2x, EObject z, EObject b, EObject c, EObject i,
			EObject w, EObject y, EObject v, EObject d, EObject a, EObject c2z, EObject b2y, EObject x) {
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilell2branchbb";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String w__a____first_name_prime = "first";
		String y__x____next_name_prime = "next";
		String v__z____next_name_prime = "next";
		String d2v__v____target_name_prime = "target";
		String d2v__d____source_name_prime = "source";
		String a2x__a____source_name_prime = "source";
		String c__d____last_name_prime = "last";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String a__b____last_name_prime = "last";
		String w__c____next_name_prime = "next";
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(v__z____next);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____last);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { ruleresult, d2v, a2x, z, b, c, i, w, y, v, d, a, c2z, b2y, x, i__x____positive,
				i__z____negative, w__a____first, y__x____next, v__z____next, d2v__v____target, d2v__d____source,
				a2x__a____source, c__d____last, c2z__z____target, c2z__c____source, b2y__b____source, b2y__y____target,
				a2x__x____target, a__b____last, w__c____next };
	}

	public static final void pattern_whilell2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whilell2branchbb _this, PerformRuleResult ruleresult, EObject d2v, EObject a2x, EObject z, EObject b,
			EObject c, EObject w2i, EObject i, EObject w, EObject y, EObject v, EObject d, EObject a, EObject c2z,
			EObject b2y, EObject x) {
		_this.registerObjects_FWD(ruleresult, d2v, a2x, z, b, c, w2i, i, w, y, v, d, a, c2z, b2y, x);

	}

	public static final PerformRuleResult pattern_whilell2branchbb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_2_1_preparereturnvalue_bindingFB(whilell2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whilell2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(
			whilell2branchbb _this) {
		Object[] result_pattern_whilell2branchbb_2_1_preparereturnvalue_binding = pattern_whilell2branchbb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilell2branchbb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whilell2branchbb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilell2branchbb_2_1_preparereturnvalue_black = pattern_whilell2branchbb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whilell2branchbb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whilell2branchbb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whilell2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whilell2branchbb_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("w");
		EObject _localVariable_3 = match.getObject("d");
		EObject _localVariable_4 = match.getObject("a");
		EObject tmpB = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpA = _localVariable_4;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpC instanceof While) {
				While c = (While) tmpC;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpD instanceof Assignment) {
						Assignment d = (Assignment) tmpD;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							return new Object[] { b, c, w, d, a, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_2_2_corematch_blackBBFFBBBB(Assignment b, While c,
			While w, Assignment d, While a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
								"source")) {
							Branch i = w2i.getTarget();
							if (i != null) {
								_result.add(new Object[] { b, c, w2i, i, w, d, a, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_2_3_findcontext_blackBBBBBBB(Assignment b, While c,
			S2B w2i, Branch i, While w, Assignment d, While a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						if (w.equals(w2i.getSource())) {
							if (a.equals(w.getFirst())) {
								if (i.equals(w2i.getTarget())) {
									if (d.equals(c.getLast())) {
										if (b.equals(a.getLast())) {
											if (c.equals(w.getNext())) {
												_result.add(new Object[] { b, c, w2i, i, w, d, a });
											}
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

	public static final Object[] pattern_whilell2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(Assignment b, While c,
			S2B w2i, Branch i, While w, Assignment d, While a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__w____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String w2i__i____target_name_prime = "target";
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String w__c____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(a);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____last);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { b, c, w2i, i, w, d, a, isApplicableMatch, w2i__w____source, w__a____first,
				w2i__i____target, c__d____last, a__b____last, w__c____next };
	}

	public static final Object[] pattern_whilell2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, Assignment b, While c, S2B w2i, Branch i, While w, Assignment d,
			While a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, b, c, w2i, i, w, d, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, b, c, w2i, i, w, d, a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, Assignment b, While c, S2B w2i, Branch i, While w, Assignment d,
			While a) {
		Object[] result_pattern_whilell2branchbb_2_4_solveCSP_binding = pattern_whilell2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, b, c, w2i, i, w, d, a);
		if (result_pattern_whilell2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_2_4_solveCSP_black = pattern_whilell2branchbb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, b, c, w2i, i, w, d, a };
			}
		}
		return null;
	}

	public static final boolean pattern_whilell2branchbb_2_5_checkCSP_expressionFBB(whilell2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whilell2branchbb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whilell2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whilell2branchbb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_10_1_initialbindings_blackBBBBBBB(whilell2branchbb _this,
			Match match, Branch z, Branch i, Command y, Command v, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!v.equals(y)) {
					if (!x.equals(z)) {
						return new Object[] { _this, match, z, i, y, v, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_10_2_SolveCSP_bindingFBBBBBBB(whilell2branchbb _this,
			Match match, Branch z, Branch i, Command y, Command v, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, i, y, v, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, i, y, v, x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(whilell2branchbb _this,
			Match match, Branch z, Branch i, Command y, Command v, Branch x) {
		Object[] result_pattern_whilell2branchbb_10_2_SolveCSP_binding = pattern_whilell2branchbb_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, z, i, y, v, x);
		if (result_pattern_whilell2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_10_2_SolveCSP_black = pattern_whilell2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, i, y, v, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whilell2branchbb_10_3_CheckCSP_expressionFBB(whilell2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_10_4_collectelementstobetranslated_blackBBBBBB(Match match,
			Branch z, Branch i, Command y, Command v, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!v.equals(y)) {
					if (!x.equals(z)) {
						return new Object[] { match, z, i, y, v, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(
			Match match, Branch z, Branch i, Command y, Command v, Branch x) {
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(v);
		match.getToBeTranslatedNodes().add(x);
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String y__x____next_name_prime = "next";
		String v__z____next_name_prime = "next";
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(v__z____next);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		return new Object[] { match, z, i, y, v, x, i__x____positive, i__z____negative, y__x____next, v__z____next };
	}

	public static final Object[] pattern_whilell2branchbb_10_5_collectcontextelements_blackBBBBBB(Match match, Branch z,
			Branch i, Command y, Command v, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!v.equals(y)) {
					if (!x.equals(z)) {
						return new Object[] { match, z, i, y, v, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whilell2branchbb_10_6_registerobjectstomatch_expressionBBBBBBB(
			whilell2branchbb _this, Match match, Branch z, Branch i, Command y, Command v, Branch x) {
		_this.registerObjectsToMatch_BWD(match, z, i, y, v, x);

	}

	public static final boolean pattern_whilell2branchbb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilell2branchbb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("z");
		EObject _localVariable_1 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_2 = isApplicableMatch.getObject("i");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("y");
		EObject _localVariable_5 = isApplicableMatch.getObject("v");
		EObject _localVariable_6 = isApplicableMatch.getObject("x");
		EObject tmpZ = _localVariable_0;
		EObject tmpW2i = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpY = _localVariable_4;
		EObject tmpV = _localVariable_5;
		EObject tmpX = _localVariable_6;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpW2i instanceof S2B) {
				S2B w2i = (S2B) tmpW2i;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpY instanceof Command) {
							Command y = (Command) tmpY;
							if (tmpV instanceof Command) {
								Command v = (Command) tmpV;
								if (tmpX instanceof Branch) {
									Branch x = (Branch) tmpX;
									return new Object[] { z, w2i, i, w, y, v, x, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_11_1_performtransformation_blackBBBBBBBFBB(Branch z, S2B w2i,
			Branch i, While w, Command y, Command v, Branch x, whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!v.equals(y)) {
					if (!x.equals(z)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { z, w2i, i, w, y, v, x, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			whilell2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whilell2branchbb_11_1_performtransformation_binding = pattern_whilell2branchbb_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whilell2branchbb_11_1_performtransformation_binding != null) {
			Branch z = (Branch) result_pattern_whilell2branchbb_11_1_performtransformation_binding[0];
			S2B w2i = (S2B) result_pattern_whilell2branchbb_11_1_performtransformation_binding[1];
			Branch i = (Branch) result_pattern_whilell2branchbb_11_1_performtransformation_binding[2];
			While w = (While) result_pattern_whilell2branchbb_11_1_performtransformation_binding[3];
			Command y = (Command) result_pattern_whilell2branchbb_11_1_performtransformation_binding[4];
			Command v = (Command) result_pattern_whilell2branchbb_11_1_performtransformation_binding[5];
			Branch x = (Branch) result_pattern_whilell2branchbb_11_1_performtransformation_binding[6];

			Object[] result_pattern_whilell2branchbb_11_1_performtransformation_black = pattern_whilell2branchbb_11_1_performtransformation_blackBBBBBBBFBB(
					z, w2i, i, w, y, v, x, _this, isApplicableMatch);
			if (result_pattern_whilell2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilell2branchbb_11_1_performtransformation_black[7];

				return new Object[] { z, w2i, i, w, y, v, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_11_1_performtransformation_greenFFBFFBBBFFFFB(Branch z,
			While w, Command y, Command v, Branch x) {
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		d2v.setTarget(v);
		a2x.setTarget(x);
		w.setNext(c);
		d2v.setSource(d);
		c.setLast(d);
		w.setFirst(a);
		a2x.setSource(a);
		a.setLast(b);
		c2z.setTarget(z);
		c2z.setSource(c);
		b2y.setSource(b);
		b2y.setTarget(y);
		return new Object[] { d2v, a2x, z, b, c, w, y, v, d, a, c2z, b2y, x };
	}

	public static final Object[] pattern_whilell2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2N d2v,
			S2B a2x, Branch z, Assignment b, While c, Command y, Command v, Assignment d, While a, S2B c2z, S2N b2y,
			Branch x) {
		if (!a2x.equals(c2z)) {
			if (!b.equals(d)) {
				if (!v.equals(y)) {
					if (!a.equals(c)) {
						if (!b2y.equals(d2v)) {
							if (!x.equals(z)) {
								return new Object[] { d2v, a2x, z, b, c, y, v, d, a, c2z, b2y, x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2N d2v,
			S2B a2x, Branch z, Assignment b, While c, Command y, Command v, Assignment d, While a, S2B c2z, S2N b2y,
			Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getTranslatedElements().add(v);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(x);
		return new Object[] { ruleresult, d2v, a2x, z, b, c, y, v, d, a, c2z, b2y, x };
	}

	public static final Object[] pattern_whilell2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d2v, EObject a2x, EObject z, EObject b, EObject c, EObject w2i,
			EObject i, EObject w, EObject y, EObject v, EObject d, EObject a, EObject c2z, EObject b2y, EObject x) {
		if (!d2v.equals(z)) {
			if (!d2v.equals(w2i)) {
				if (!d2v.equals(i)) {
					if (!d2v.equals(w)) {
						if (!d2v.equals(y)) {
							if (!d2v.equals(v)) {
								if (!d2v.equals(x)) {
									if (!a2x.equals(d2v)) {
										if (!a2x.equals(z)) {
											if (!a2x.equals(b)) {
												if (!a2x.equals(c)) {
													if (!a2x.equals(w2i)) {
														if (!a2x.equals(i)) {
															if (!a2x.equals(w)) {
																if (!a2x.equals(y)) {
																	if (!a2x.equals(v)) {
																		if (!a2x.equals(d)) {
																			if (!a2x.equals(c2z)) {
																				if (!a2x.equals(b2y)) {
																					if (!a2x.equals(x)) {
																						if (!b.equals(d2v)) {
																							if (!b.equals(z)) {
																								if (!b.equals(c)) {
																									if (!b.equals(
																											w2i)) {
																										if (!b.equals(
																												i)) {
																											if (!b.equals(
																													w)) {
																												if (!b.equals(
																														y)) {
																													if (!b.equals(
																															v)) {
																														if (!b.equals(
																																d)) {
																															if (!b.equals(
																																	c2z)) {
																																if (!b.equals(
																																		b2y)) {
																																	if (!b.equals(
																																			x)) {
																																		if (!c.equals(
																																				d2v)) {
																																			if (!c.equals(
																																					z)) {
																																				if (!c.equals(
																																						w2i)) {
																																					if (!c.equals(
																																							i)) {
																																						if (!c.equals(
																																								w)) {
																																							if (!c.equals(
																																									y)) {
																																								if (!c.equals(
																																										v)) {
																																									if (!c.equals(
																																											d)) {
																																										if (!c.equals(
																																												c2z)) {
																																											if (!c.equals(
																																													x)) {
																																												if (!w2i.equals(
																																														z)) {
																																													if (!w2i.equals(
																																															y)) {
																																														if (!w2i.equals(
																																																x)) {
																																															if (!i.equals(
																																																	z)) {
																																																if (!i.equals(
																																																		w2i)) {
																																																	if (!i.equals(
																																																			w)) {
																																																		if (!i.equals(
																																																				y)) {
																																																			if (!i.equals(
																																																					v)) {
																																																				if (!i.equals(
																																																						x)) {
																																																					if (!w.equals(
																																																							z)) {
																																																						if (!w.equals(
																																																								w2i)) {
																																																							if (!w.equals(
																																																									y)) {
																																																								if (!w.equals(
																																																										x)) {
																																																									if (!y.equals(
																																																											z)) {
																																																										if (!v.equals(
																																																												z)) {
																																																											if (!v.equals(
																																																													w2i)) {
																																																												if (!v.equals(
																																																														w)) {
																																																													if (!v.equals(
																																																															y)) {
																																																														if (!v.equals(
																																																																x)) {
																																																															if (!d.equals(
																																																																	d2v)) {
																																																																if (!d.equals(
																																																																		z)) {
																																																																	if (!d.equals(
																																																																			w2i)) {
																																																																		if (!d.equals(
																																																																				i)) {
																																																																			if (!d.equals(
																																																																					w)) {
																																																																				if (!d.equals(
																																																																						y)) {
																																																																					if (!d.equals(
																																																																							v)) {
																																																																						if (!d.equals(
																																																																								x)) {
																																																																							if (!a.equals(
																																																																									d2v)) {
																																																																								if (!a.equals(
																																																																										a2x)) {
																																																																									if (!a.equals(
																																																																											z)) {
																																																																										if (!a.equals(
																																																																												b)) {
																																																																											if (!a.equals(
																																																																													c)) {
																																																																												if (!a.equals(
																																																																														w2i)) {
																																																																													if (!a.equals(
																																																																															i)) {
																																																																														if (!a.equals(
																																																																																w)) {
																																																																															if (!a.equals(
																																																																																	y)) {
																																																																																if (!a.equals(
																																																																																		v)) {
																																																																																	if (!a.equals(
																																																																																			d)) {
																																																																																		if (!a.equals(
																																																																																				c2z)) {
																																																																																			if (!a.equals(
																																																																																					b2y)) {
																																																																																				if (!a.equals(
																																																																																						x)) {
																																																																																					if (!c2z.equals(
																																																																																							d2v)) {
																																																																																						if (!c2z.equals(
																																																																																								z)) {
																																																																																							if (!c2z.equals(
																																																																																									w2i)) {
																																																																																								if (!c2z.equals(
																																																																																										i)) {
																																																																																									if (!c2z.equals(
																																																																																											w)) {
																																																																																										if (!c2z.equals(
																																																																																												y)) {
																																																																																											if (!c2z.equals(
																																																																																													v)) {
																																																																																												if (!c2z.equals(
																																																																																														d)) {
																																																																																													if (!c2z.equals(
																																																																																															x)) {
																																																																																														if (!b2y.equals(
																																																																																																d2v)) {
																																																																																															if (!b2y.equals(
																																																																																																	z)) {
																																																																																																if (!b2y.equals(
																																																																																																		c)) {
																																																																																																	if (!b2y.equals(
																																																																																																			w2i)) {
																																																																																																		if (!b2y.equals(
																																																																																																				i)) {
																																																																																																			if (!b2y.equals(
																																																																																																					w)) {
																																																																																																				if (!b2y.equals(
																																																																																																						y)) {
																																																																																																					if (!b2y.equals(
																																																																																																							v)) {
																																																																																																						if (!b2y.equals(
																																																																																																								d)) {
																																																																																																							if (!b2y.equals(
																																																																																																									c2z)) {
																																																																																																								if (!b2y.equals(
																																																																																																										x)) {
																																																																																																									if (!x.equals(
																																																																																																											z)) {
																																																																																																										if (!x.equals(
																																																																																																												y)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													d2v,
																																																																																																													a2x,
																																																																																																													z,
																																																																																																													b,
																																																																																																													c,
																																																																																																													w2i,
																																																																																																													i,
																																																																																																													w,
																																																																																																													y,
																																																																																																													v,
																																																																																																													d,
																																																																																																													a,
																																																																																																													c2z,
																																																																																																													b2y,
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
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilell2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject d2v, EObject a2x, EObject z, EObject b, EObject c, EObject i,
			EObject w, EObject y, EObject v, EObject d, EObject a, EObject c2z, EObject b2y, EObject x) {
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilell2branchbb";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String w__a____first_name_prime = "first";
		String y__x____next_name_prime = "next";
		String v__z____next_name_prime = "next";
		String d2v__v____target_name_prime = "target";
		String d2v__d____source_name_prime = "source";
		String a2x__a____source_name_prime = "source";
		String c__d____last_name_prime = "last";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String a__b____last_name_prime = "last";
		String w__c____next_name_prime = "next";
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(v__z____next);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____last);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { ruleresult, d2v, a2x, z, b, c, i, w, y, v, d, a, c2z, b2y, x, i__x____positive,
				i__z____negative, w__a____first, y__x____next, v__z____next, d2v__v____target, d2v__d____source,
				a2x__a____source, c__d____last, c2z__z____target, c2z__c____source, b2y__b____source, b2y__y____target,
				a2x__x____target, a__b____last, w__c____next };
	}

	public static final void pattern_whilell2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whilell2branchbb _this, PerformRuleResult ruleresult, EObject d2v, EObject a2x, EObject z, EObject b,
			EObject c, EObject w2i, EObject i, EObject w, EObject y, EObject v, EObject d, EObject a, EObject c2z,
			EObject b2y, EObject x) {
		_this.registerObjects_BWD(ruleresult, d2v, a2x, z, b, c, w2i, i, w, y, v, d, a, c2z, b2y, x);

	}

	public static final PerformRuleResult pattern_whilell2branchbb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_12_1_preparereturnvalue_bindingFB(whilell2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whilell2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(
			whilell2branchbb _this) {
		Object[] result_pattern_whilell2branchbb_12_1_preparereturnvalue_binding = pattern_whilell2branchbb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilell2branchbb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whilell2branchbb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilell2branchbb_12_1_preparereturnvalue_black = pattern_whilell2branchbb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whilell2branchbb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whilell2branchbb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whilell2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whilell2branchbb_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("z");
		EObject _localVariable_1 = match.getObject("i");
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("v");
		EObject _localVariable_4 = match.getObject("x");
		EObject tmpZ = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpV = _localVariable_3;
		EObject tmpX = _localVariable_4;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpV instanceof Command) {
						Command v = (Command) tmpV;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							return new Object[] { z, i, y, v, x, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_12_2_corematch_blackBFBFBBBB(Branch z, Branch i,
			Command y, Command v, Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!v.equals(y)) {
					if (!x.equals(z)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
								"target")) {
							Statement tmpW = w2i.getSource();
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								_result.add(new Object[] { z, w2i, i, w, y, v, x, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_12_3_findcontext_blackBBBBBBB(Branch z, S2B w2i,
			Branch i, While w, Command y, Command v, Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!v.equals(y)) {
					if (!x.equals(z)) {
						if (x.equals(i.getPositive())) {
							if (z.equals(i.getNegative())) {
								if (w.equals(w2i.getSource())) {
									if (x.equals(y.getNext())) {
										if (z.equals(v.getNext())) {
											if (i.equals(w2i.getTarget())) {
												_result.add(new Object[] { z, w2i, i, w, y, v, x });
											}
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

	public static final Object[] pattern_whilell2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(Branch z, S2B w2i,
			Branch i, While w, Command y, Command v, Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String w2i__w____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String v__z____next_name_prime = "next";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(v);
		isApplicableMatch.getAllContextElements().add(x);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(v__z____next);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { z, w2i, i, w, y, v, x, isApplicableMatch, i__x____positive, i__z____negative,
				w2i__w____source, y__x____next, v__z____next, w2i__i____target };
	}

	public static final Object[] pattern_whilell2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch z, S2B w2i, Branch i, While w, Command y, Command v, Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, z, w2i, i, w, y, v, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, z, w2i, i, w, y, v, x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whilell2branchbb _this, IsApplicableMatch isApplicableMatch, Branch z, S2B w2i, Branch i, While w,
			Command y, Command v, Branch x) {
		Object[] result_pattern_whilell2branchbb_12_4_solveCSP_binding = pattern_whilell2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, z, w2i, i, w, y, v, x);
		if (result_pattern_whilell2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_12_4_solveCSP_black = pattern_whilell2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, z, w2i, i, w, y, v, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whilell2branchbb_12_5_checkCSP_expressionFBB(whilell2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whilell2branchbb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whilell2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whilell2branchbb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_20_1_preparereturnvalue_bindingFB(whilell2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whilell2branchbb _this) {
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

	public static final Object[] pattern_whilell2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whilell2branchbb _this) {
		Object[] result_pattern_whilell2branchbb_20_1_preparereturnvalue_binding = pattern_whilell2branchbb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilell2branchbb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whilell2branchbb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilell2branchbb_20_1_preparereturnvalue_black = pattern_whilell2branchbb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whilell2branchbb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whilell2branchbb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whilell2branchbb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_746975 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_495261 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_495261)) {
							if (!i.equals(__DEC_z_positive_495261)) {
								if (!x.equals(__DEC_z_positive_495261)) {
									return new Object[] { z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_791729 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_791729)) {
							if (!i.equals(__DEC_z_negative_791729)) {
								if (!x.equals(__DEC_z_negative_791729)) {
									return new Object[] { z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_948356 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_106635 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_106635)) {
							if (!i.equals(__DEC_y_positive_106635)) {
								if (!x.equals(__DEC_y_positive_106635)) {
									return new Object[] { y, z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_997639 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_997639)) {
							if (!i.equals(__DEC_y_negative_997639)) {
								if (!x.equals(__DEC_y_negative_997639)) {
									return new Object[] { y, z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_6B(Command v) {
		for (Graph __DEC_v_root_761098 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_7BBBB(Command v, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_positive_863562 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!z.equals(__DEC_v_positive_863562)) {
							if (!i.equals(__DEC_v_positive_863562)) {
								if (!x.equals(__DEC_v_positive_863562)) {
									return new Object[] { v, z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_8BBBB(Command v, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_negative_140810 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!z.equals(__DEC_v_negative_140810)) {
							if (!i.equals(__DEC_v_negative_140810)) {
								if (!x.equals(__DEC_v_negative_140810)) {
									return new Object[] { v, z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_9B(Branch x) {
		for (Graph __DEC_x_root_646247 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_10BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_258482 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_258482)) {
							if (!z.equals(__DEC_x_positive_258482)) {
								if (!i.equals(__DEC_x_positive_258482)) {
									return new Object[] { x, z, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_11BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_434448 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_434448)) {
							if (!z.equals(__DEC_x_negative_434448)) {
								if (!i.equals(__DEC_x_negative_434448)) {
									return new Object[] { x, z, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_12BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_13BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_15BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_16BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_17BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_18BB(Branch z,
			Command v) {
		if (v.equals(z.getPositive())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_19BB(Branch i,
			Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_20BB(Branch x,
			Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_21BB(Branch z,
			Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_22BB(Branch i,
			Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_23BB(Branch x,
			Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_24BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_25BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_26BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpI = _edge_positive.getSrc();
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			EObject tmpX = _edge_positive.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (!i.equals(x)) {
					if (x.equals(i.getPositive())) {
						Node tmpZ = i.getNegative();
						if (tmpZ instanceof Branch) {
							Branch z = (Branch) tmpZ;
							if (!i.equals(z)) {
								if (!x.equals(z)) {
									if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_9B(x) == null) {
										if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_26BB(i,
												x) == null) {
											if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_0B(
													z) == null) {
												if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(z,
														i, x) == null) {
													if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(
															z, i, x) == null) {
														if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_10BBB(
																x, z, i) == null) {
															if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_11BBB(
																	x, z, i) == null) {
																if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_24BB(
																		z, x) == null) {
																	if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_25BB(
																			z, x) == null) {
																		for (Node tmpY : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(x,
																						Node.class, "next")) {
																			if (tmpY instanceof Command) {
																				Command y = (Command) tmpY;
																				if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_3B(
																						y) == null) {
																					if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(
																							y, z, i, x) == null) {
																						if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(
																								y, z, i, x) == null) {
																							if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_12BB(
																									z, y) == null) {
																								if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_13BB(
																										i, y) == null) {
																									if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_14BB(
																											x,
																											y) == null) {
																										if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																												z,
																												y) == null) {
																											if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_16BB(
																													i,
																													y) == null) {
																												if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_17BB(
																														x,
																														y) == null) {
																													for (Node tmpV : org.moflon.core.utilities.eMoflonEMFUtil
																															.getOppositeReferenceTyped(
																																	z,
																																	Node.class,
																																	"next")) {
																														if (tmpV instanceof Command) {
																															Command v = (Command) tmpV;
																															if (!v.equals(
																																	y)) {
																																if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_6B(
																																		v) == null) {
																																	if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_7BBBB(
																																			v,
																																			z,
																																			i,
																																			x) == null) {
																																		if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_8BBBB(
																																				v,
																																				z,
																																				i,
																																				x) == null) {
																																			if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_18BB(
																																					z,
																																					v) == null) {
																																				if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_19BB(
																																						i,
																																						v) == null) {
																																					if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_20BB(
																																							x,
																																							v) == null) {
																																						if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_21BB(
																																								z,
																																								v) == null) {
																																							if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_22BB(
																																									i,
																																									v) == null) {
																																								if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_23BB(
																																										x,
																																										v) == null) {
																																									_result.add(
																																											new Object[] {
																																													z,
																																													i,
																																													y,
																																													v,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whilell2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			whilell2branchbb _this, Match match, Branch z, Branch i, Command y, Command v, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, i, y, v, x);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whilell2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whilell2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whilell2branchbb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_21_1_preparereturnvalue_bindingFB(whilell2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whilell2branchbb _this) {
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

	public static final Object[] pattern_whilell2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whilell2branchbb _this) {
		Object[] result_pattern_whilell2branchbb_21_1_preparereturnvalue_binding = pattern_whilell2branchbb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilell2branchbb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whilell2branchbb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilell2branchbb_21_1_preparereturnvalue_black = pattern_whilell2branchbb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whilell2branchbb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whilell2branchbb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whilell2branchbb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_0B(Assignment b) {
		for (Decision __DEC_b_positive_672623 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_1B(Assignment b) {
		for (Decision __DEC_b_negative_77576 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_2BBBB(Assignment b,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_first_549938 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "first")) {
						if (!c.equals(__DEC_b_first_549938)) {
							if (!w.equals(__DEC_b_first_549938)) {
								if (!a.equals(__DEC_b_first_549938)) {
									return new Object[] { b, c, w, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_3BBBB(Assignment b,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_last_523879 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!c.equals(__DEC_b_last_523879)) {
							if (!w.equals(__DEC_b_last_523879)) {
								if (!a.equals(__DEC_b_last_523879)) {
									return new Object[] { b, c, w, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_4B(Assignment b) {
		for (Program __DEC_b_first_968565 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_5B(While c) {
		for (Decision __DEC_c_positive_425988 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_6B(While c) {
		for (Decision __DEC_c_negative_333131 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_640739 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_640739)) {
							if (!w.equals(__DEC_c_first_640739)) {
								if (!a.equals(__DEC_c_first_640739)) {
									return new Object[] { c, w, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_8BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_799371 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_799371)) {
							if (!w.equals(__DEC_c_last_799371)) {
								if (!a.equals(__DEC_c_last_799371)) {
									return new Object[] { c, w, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_9B(While c) {
		for (Program __DEC_c_first_434581 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_10B(Assignment d) {
		for (Decision __DEC_d_positive_739939 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_11B(Assignment d) {
		for (Decision __DEC_d_negative_494995 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_12BBBB(Assignment d,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_first_410261 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!c.equals(__DEC_d_first_410261)) {
							if (!w.equals(__DEC_d_first_410261)) {
								if (!a.equals(__DEC_d_first_410261)) {
									return new Object[] { d, c, w, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_13BBBB(Assignment d,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_last_647649 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!c.equals(__DEC_d_last_647649)) {
							if (!w.equals(__DEC_d_last_647649)) {
								if (!a.equals(__DEC_d_last_647649)) {
									return new Object[] { d, c, w, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_14B(Assignment d) {
		for (Program __DEC_d_first_767595 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_15B(While a) {
		for (Decision __DEC_a_positive_980065 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_16B(While a) {
		for (Decision __DEC_a_negative_453795 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_17BBB(While a, While c,
			While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_819208 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_819208)) {
							if (!c.equals(__DEC_a_last_819208)) {
								if (!w.equals(__DEC_a_last_819208)) {
									return new Object[] { a, c, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_18B(While a) {
		for (Program __DEC_a_first_847533 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_19BB(While c,
			Assignment b) {
		if (b.equals(c.getFirst())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_20BB(While w,
			Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_21BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_22BB(While c,
			Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_23BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_24BB(While c,
			Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_25BB(While w,
			Assignment d) {
		if (d.equals(w.getFirst())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_26BB(While a,
			Assignment d) {
		if (d.equals(a.getFirst())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_27BB(While w,
			Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_28BB(While a,
			Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_29BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_30BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_first.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpA = _edge_first.getTrg();
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (!a.equals(w)) {
					if (a.equals(w.getFirst())) {
						Statement tmpC = w.getNext();
						if (tmpC instanceof While) {
							While c = (While) tmpC;
							if (!c.equals(w)) {
								if (!a.equals(c)) {
									Statement tmpB = a.getLast();
									if (tmpB instanceof Assignment) {
										Assignment b = (Assignment) tmpB;
										Statement tmpD = c.getLast();
										if (tmpD instanceof Assignment) {
											Assignment d = (Assignment) tmpD;
											if (!b.equals(d)) {
												if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_15B(
														a) == null) {
													if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_16B(
															a) == null) {
														if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_18B(
																a) == null) {
															if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_30BB(
																	w, a) == null) {
																if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_5B(
																		c) == null) {
																	if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_6B(
																			c) == null) {
																		if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(
																				c, w, a) == null) {
																			if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_8BBB(
																					c, w, a) == null) {
																				if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_9B(
																						c) == null) {
																					if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_17BBB(
																							a, c, w) == null) {
																						if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_29BB(
																								c, a) == null) {
																							if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_0B(
																									b) == null) {
																								if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_1B(
																										b) == null) {
																									if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_2BBBB(
																											b, c, w,
																											a) == null) {
																										if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_3BBBB(
																												b, c, w,
																												a) == null) {
																											if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_4B(
																													b) == null) {
																												if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																														c,
																														b) == null) {
																													if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_20BB(
																															w,
																															b) == null) {
																														if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																																a,
																																b) == null) {
																															if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_22BB(
																																	c,
																																	b) == null) {
																																if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_23BB(
																																		w,
																																		b) == null) {
																																	if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_10B(
																																			d) == null) {
																																		if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_11B(
																																				d) == null) {
																																			if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_12BBBB(
																																					d,
																																					c,
																																					w,
																																					a) == null) {
																																				if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_13BBBB(
																																						d,
																																						c,
																																						w,
																																						a) == null) {
																																					if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_14B(
																																							d) == null) {
																																						if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_24BB(
																																								c,
																																								d) == null) {
																																							if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_25BB(
																																									w,
																																									d) == null) {
																																								if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_26BB(
																																										a,
																																										d) == null) {
																																									if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_27BB(
																																											w,
																																											d) == null) {
																																										if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_28BB(
																																												a,
																																												d) == null) {
																																											_result.add(
																																													new Object[] {
																																															b,
																																															c,
																																															w,
																																															d,
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
														}
													}
												}
											}
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whilell2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			whilell2branchbb _this, Match match, Assignment b, While c, While w, Assignment d, While a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, c, w, d, a);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whilell2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whilell2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whilell2branchbb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_24_1_prepare_blackB(whilell2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whilell2branchbb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whilell2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("z");
		EObject _localVariable_1 = sourceMatch.getObject("b");
		EObject _localVariable_2 = sourceMatch.getObject("c");
		EObject _localVariable_3 = targetMatch.getObject("i");
		EObject _localVariable_4 = sourceMatch.getObject("w");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject _localVariable_6 = targetMatch.getObject("v");
		EObject _localVariable_7 = sourceMatch.getObject("d");
		EObject _localVariable_8 = sourceMatch.getObject("a");
		EObject _localVariable_9 = targetMatch.getObject("x");
		EObject tmpZ = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpV = _localVariable_6;
		EObject tmpD = _localVariable_7;
		EObject tmpA = _localVariable_8;
		EObject tmpX = _localVariable_9;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpC instanceof While) {
					While c = (While) tmpC;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								if (tmpV instanceof Command) {
									Command v = (Command) tmpV;
									if (tmpD instanceof Assignment) {
										Assignment d = (Assignment) tmpD;
										if (tmpA instanceof While) {
											While a = (While) tmpA;
											if (tmpX instanceof Branch) {
												Branch x = (Branch) tmpX;
												return new Object[] { z, b, c, i, w, y, v, d, a, x, targetMatch,
														sourceMatch };
											}
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

	public static final Object[] pattern_whilell2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Branch z,
			Assignment b, While c, Branch i, While w, Command y, Command v, Assignment d, While a, Branch x,
			Match sourceMatch, Match targetMatch) {
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						if (!v.equals(y)) {
							if (!a.equals(c)) {
								if (!a.equals(w)) {
									if (!x.equals(z)) {
										if (!sourceMatch.equals(targetMatch)) {
											return new Object[] { z, b, c, i, w, y, v, d, a, x, sourceMatch,
													targetMatch };
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

	public static final Object[] pattern_whilell2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding = pattern_whilell2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding != null) {
			Branch z = (Branch) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[0];
			Assignment b = (Assignment) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[1];
			While c = (While) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[2];
			Branch i = (Branch) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[3];
			While w = (While) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[4];
			Command y = (Command) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[5];
			Command v = (Command) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[6];
			Assignment d = (Assignment) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[7];
			While a = (While) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[8];
			Branch x = (Branch) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_black = pattern_whilell2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					z, b, c, i, w, y, v, d, a, x, sourceMatch, targetMatch);
			if (result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { z, b, c, i, w, y, v, d, a, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(whilell2branchbb _this,
			Branch z, Assignment b, While c, Branch i, While w, Command y, Command v, Assignment d, While a, Branch x,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(z, b, c, i, w, y, v, d, a, x, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, z, b, c, i, w, y, v, d, a, x, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			whilell2branchbb _this, Branch z, Assignment b, While c, Branch i, While w, Command y, Command v,
			Assignment d, While a, Branch x, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilell2branchbb_24_3_solvecsp_binding = pattern_whilell2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, z, b, c, i, w, y, v, d, a, x, sourceMatch, targetMatch);
		if (result_pattern_whilell2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whilell2branchbb_24_3_solvecsp_black = pattern_whilell2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whilell2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, z, b, c, i, w, y, v, d, a, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whilell2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_24_5_matchcorrcontext_blackFBBBB(Branch i, While w,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				if (i.equals(w2i.getTarget())) {
					_result.add(new Object[] { w2i, i, w, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whilell2branchbb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whilell2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(Branch z,
			Assignment b, While c, Branch i, While w, Command y, Command v, Assignment d, While a, Branch x,
			CCMatch ccMatch) {
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						if (!v.equals(y)) {
							if (!a.equals(c)) {
								if (!a.equals(w)) {
									if (!x.equals(z)) {
										return new Object[] { z, b, c, i, w, y, v, d, a, x, ccMatch };
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

	public static final Object[] pattern_whilell2branchbb_24_6_createcorrespondence_greenFFBBBBBBBFFBB(Branch z,
			Assignment b, While c, Command y, Command v, Assignment d, While a, Branch x, CCMatch ccMatch) {
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		d2v.setTarget(v);
		d2v.setSource(d);
		ccMatch.getCreateCorr().add(d2v);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { d2v, a2x, z, b, c, y, v, d, a, c2z, b2y, x, ccMatch };
	}

	public static final Object[] pattern_whilell2branchbb_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whilell2branchbb_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whilell2branchbb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whilell2branchbb_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_0B(Assignment b) {
		for (Decision __DEC_b_positive_508473 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_1B(Assignment b) {
		for (Decision __DEC_b_negative_422245 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_2BBBB(Assignment b, While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_first_546931 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "first")) {
						if (!c.equals(__DEC_b_first_546931)) {
							if (!w.equals(__DEC_b_first_546931)) {
								if (!a.equals(__DEC_b_first_546931)) {
									return new Object[] { b, c, w, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_3BBBB(Assignment b, While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_last_677134 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!c.equals(__DEC_b_last_677134)) {
							if (!w.equals(__DEC_b_last_677134)) {
								if (!a.equals(__DEC_b_last_677134)) {
									return new Object[] { b, c, w, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_4B(Assignment b) {
		for (Program __DEC_b_first_952137 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_5B(While c) {
		for (Decision __DEC_c_positive_33183 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_6B(While c) {
		for (Decision __DEC_c_negative_254582 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_7BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_848895 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_848895)) {
							if (!w.equals(__DEC_c_first_848895)) {
								if (!a.equals(__DEC_c_first_848895)) {
									return new Object[] { c, w, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_8BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_679147 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_679147)) {
							if (!w.equals(__DEC_c_last_679147)) {
								if (!a.equals(__DEC_c_last_679147)) {
									return new Object[] { c, w, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_9B(While c) {
		for (Program __DEC_c_first_141464 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_10B(Assignment d) {
		for (Decision __DEC_d_positive_346360 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_11B(Assignment d) {
		for (Decision __DEC_d_negative_282971 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_12BBBB(Assignment d, While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_first_68674 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!c.equals(__DEC_d_first_68674)) {
							if (!w.equals(__DEC_d_first_68674)) {
								if (!a.equals(__DEC_d_first_68674)) {
									return new Object[] { d, c, w, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_13BBBB(Assignment d, While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_last_957828 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!c.equals(__DEC_d_last_957828)) {
							if (!w.equals(__DEC_d_last_957828)) {
								if (!a.equals(__DEC_d_last_957828)) {
									return new Object[] { d, c, w, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_14B(Assignment d) {
		for (Program __DEC_d_first_698620 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_15B(While a) {
		for (Decision __DEC_a_positive_24719 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_16B(While a) {
		for (Decision __DEC_a_negative_835206 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_17BBB(While a, While c,
			While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_657507 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_657507)) {
							if (!c.equals(__DEC_a_last_657507)) {
								if (!w.equals(__DEC_a_last_657507)) {
									return new Object[] { a, c, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_18B(While a) {
		for (Program __DEC_a_first_274834 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_19BB(While c, Assignment b) {
		if (b.equals(c.getFirst())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_20BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_21BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_22BB(While c, Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_23BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_24BB(While c, Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_25BB(While w, Assignment d) {
		if (d.equals(w.getFirst())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_26BB(While a, Assignment d) {
		if (d.equals(a.getFirst())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_27BB(While w, Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_28BB(While a, Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_29BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_30BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_blackBBBBB(Assignment b, While c,
			While w, Assignment d, While a) {
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						if (a.equals(w.getFirst())) {
							if (d.equals(c.getLast())) {
								if (b.equals(a.getLast())) {
									if (c.equals(w.getNext())) {
										if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_0B(b) == null) {
											if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_1B(b) == null) {
												if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_2BBBB(b, c,
														w, a) == null) {
													if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_3BBBB(b,
															c, w, a) == null) {
														if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_4B(
																b) == null) {
															if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_5B(
																	c) == null) {
																if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_6B(
																		c) == null) {
																	if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_7BBB(
																			c, w, a) == null) {
																		if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_8BBB(
																				c, w, a) == null) {
																			if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_9B(
																					c) == null) {
																				if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_10B(
																						d) == null) {
																					if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_11B(
																							d) == null) {
																						if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_12BBBB(
																								d, c, w, a) == null) {
																							if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_13BBBB(
																									d, c, w,
																									a) == null) {
																								if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_14B(
																										d) == null) {
																									if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_15B(
																											a) == null) {
																										if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_16B(
																												a) == null) {
																											if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_17BBB(
																													a,
																													c,
																													w) == null) {
																												if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_18B(
																														a) == null) {
																													if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_19BB(
																															c,
																															b) == null) {
																														if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_20BB(
																																w,
																																b) == null) {
																															if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_21BB(
																																	a,
																																	b) == null) {
																																if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_22BB(
																																		c,
																																		b) == null) {
																																	if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_23BB(
																																			w,
																																			b) == null) {
																																		if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_24BB(
																																				c,
																																				d) == null) {
																																			if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_25BB(
																																					w,
																																					d) == null) {
																																				if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_26BB(
																																						a,
																																						d) == null) {
																																					if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_27BB(
																																							w,
																																							d) == null) {
																																						if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_28BB(
																																								a,
																																								d) == null) {
																																							if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_29BB(
																																									c,
																																									a) == null) {
																																								if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_30BB(
																																										w,
																																										a) == null) {
																																									return new Object[] {
																																											b,
																																											c,
																																											w,
																																											d,
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
		return null;
	}

	public static final boolean pattern_whilell2branchbb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilell2branchbb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_732565 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_1BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_76373 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_76373)) {
							if (!i.equals(__DEC_z_positive_76373)) {
								if (!x.equals(__DEC_z_positive_76373)) {
									return new Object[] { z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_2BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_534403 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_534403)) {
							if (!i.equals(__DEC_z_negative_534403)) {
								if (!x.equals(__DEC_z_negative_534403)) {
									return new Object[] { z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_185217 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_4BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_257074 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_257074)) {
							if (!i.equals(__DEC_y_positive_257074)) {
								if (!x.equals(__DEC_y_positive_257074)) {
									return new Object[] { y, z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_5BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_682325 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_682325)) {
							if (!i.equals(__DEC_y_negative_682325)) {
								if (!x.equals(__DEC_y_negative_682325)) {
									return new Object[] { y, z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_6B(Command v) {
		for (Graph __DEC_v_root_666558 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_7BBBB(Command v, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_positive_361074 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!z.equals(__DEC_v_positive_361074)) {
							if (!i.equals(__DEC_v_positive_361074)) {
								if (!x.equals(__DEC_v_positive_361074)) {
									return new Object[] { v, z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_8BBBB(Command v, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_negative_480239 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!z.equals(__DEC_v_negative_480239)) {
							if (!i.equals(__DEC_v_negative_480239)) {
								if (!x.equals(__DEC_v_negative_480239)) {
									return new Object[] { v, z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_9B(Branch x) {
		for (Graph __DEC_x_root_222641 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_10BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_225774 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_225774)) {
							if (!z.equals(__DEC_x_positive_225774)) {
								if (!i.equals(__DEC_x_positive_225774)) {
									return new Object[] { x, z, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_11BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_870532 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_870532)) {
							if (!z.equals(__DEC_x_negative_870532)) {
								if (!i.equals(__DEC_x_negative_870532)) {
									return new Object[] { x, z, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_12BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_13BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_14BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_15BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_16BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_17BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_18BB(Branch z, Command v) {
		if (v.equals(z.getPositive())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_19BB(Branch i, Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_20BB(Branch x, Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_21BB(Branch z, Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_22BB(Branch i, Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_23BB(Branch x, Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_24BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_25BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_26BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_blackBBBBB(Branch z, Branch i, Command y,
			Command v, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!v.equals(y)) {
					if (!x.equals(z)) {
						if (x.equals(i.getPositive())) {
							if (z.equals(i.getNegative())) {
								if (x.equals(y.getNext())) {
									if (z.equals(v.getNext())) {
										if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_0B(z) == null) {
											if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_1BBB(z, i,
													x) == null) {
												if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_2BBB(z, i,
														x) == null) {
													if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_3B(
															y) == null) {
														if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_4BBBB(
																y, z, i, x) == null) {
															if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_5BBBB(
																	y, z, i, x) == null) {
																if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_6B(
																		v) == null) {
																	if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_7BBBB(
																			v, z, i, x) == null) {
																		if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_8BBBB(
																				v, z, i, x) == null) {
																			if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_9B(
																					x) == null) {
																				if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_10BBB(
																						x, z, i) == null) {
																					if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_11BBB(
																							x, z, i) == null) {
																						if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_12BB(
																								z, y) == null) {
																							if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_13BB(
																									i, y) == null) {
																								if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_14BB(
																										x, y) == null) {
																									if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_15BB(
																											z,
																											y) == null) {
																										if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_16BB(
																												i,
																												y) == null) {
																											if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_17BB(
																													x,
																													y) == null) {
																												if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_18BB(
																														z,
																														v) == null) {
																													if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_19BB(
																															i,
																															v) == null) {
																														if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_20BB(
																																x,
																																v) == null) {
																															if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_21BB(
																																	z,
																																	v) == null) {
																																if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_22BB(
																																		i,
																																		v) == null) {
																																	if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_23BB(
																																			x,
																																			v) == null) {
																																		if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_24BB(
																																				z,
																																				x) == null) {
																																			if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_25BB(
																																					z,
																																					x) == null) {
																																				if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_26BB(
																																						i,
																																						x) == null) {
																																					return new Object[] {
																																							z,
																																							i,
																																							y,
																																							v,
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
		return null;
	}

	public static final boolean pattern_whilell2branchbb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilell2branchbb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_29_1_createresult_blackB(whilell2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whilell2branchbb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList w2iList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpW2i : w2iList.getEntryObjects()) {
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					Statement tmpW = w2i.getSource();
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						Branch i = w2i.getTarget();
						if (i != null) {
							if (pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult, w2i) == null) {
								if (pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										w) == null) {
									if (pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											i) == null) {
										_result.add(
												new Object[] { w2iList, w2i, w, i, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_whilell2branchbb_29_3_solveCSP_bindingFBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, While w, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w2i, i, w, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, i, w, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, While w, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whilell2branchbb_29_3_solveCSP_binding = pattern_whilell2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w2i, i, w, ruleResult);
		if (result_pattern_whilell2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_29_3_solveCSP_black = pattern_whilell2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, i, w, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whilell2branchbb_29_4_checkCSP_expressionFBB(whilell2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_29_5_checknacs_blackBBB(S2B w2i, Branch i, While w) {
		return new Object[] { w2i, i, w };
	}

	public static final Object[] pattern_whilell2branchbb_29_6_perform_blackBBBB(S2B w2i, Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w2i, i, w, ruleResult };
	}

	public static final Object[] pattern_whilell2branchbb_29_6_perform_greenFFFFFBBFFFFFFFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(d2v);
		ruleResult.getCorrObjects().add(a2x);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		ruleResult.getSourceObjects().add(b);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		ruleResult.getTargetObjects().add(y);
		v.setNext(z);
		d2v.setTarget(v);
		ruleResult.getTargetObjects().add(v);
		d2v.setSource(d);
		c.setLast(d);
		ruleResult.getSourceObjects().add(d);
		w.setFirst(a);
		a2x.setSource(a);
		a.setLast(b);
		ruleResult.getSourceObjects().add(a);
		c2z.setTarget(z);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		b2y.setSource(b);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		i.setPositive(x);
		y.setNext(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { d2v, a2x, z, b, c, i, w, y, v, d, a, c2z, b2y, x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whilell2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whilell2branchbbImpl
