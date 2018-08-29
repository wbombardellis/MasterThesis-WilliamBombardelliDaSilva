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
	public boolean isAppropriate_FWD(Match match, While c, While w, Assignment d, While a, Assignment b) {

		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_0_1_initialbindings_blackBBBBBBB(this,
				match, c, w, d, a, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[d] = " + d + ", "
					+ "[a] = " + a + ", " + "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, c, w, d, a, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[d] = " + d + ", "
					+ "[a] = " + a + ", " + "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilell2branchbbImpl.pattern_whilell2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_0_4_collectelementstobetranslated_blackBBBBBB(match, c, w, d, a, b);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[c] = " + c + ", "
								+ "[w] = " + w + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(match, c, w,
					d, a, b);
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge c__d____last = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[9];

			Object[] result5_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_0_5_collectcontextelements_blackBBBBBB(match, c, w, d, a, b);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[c] = " + c + ", "
								+ "[w] = " + w + ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whilell2branchbbImpl.pattern_whilell2branchbb_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, c,
					w, d, a, b);
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
		While c = (While) result1_bindingAndBlack[0];
		While w = (While) result1_bindingAndBlack[1];
		Assignment d = (Assignment) result1_bindingAndBlack[2];
		While a = (While) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		Assignment b = (Assignment) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_1_performtransformation_greenBBFFFFBBBFFFF(c, d, a, i, b);
		S2B c2z = (S2B) result1_green[2];
		S2N b2y = (S2N) result1_green[3];
		S2N d2v = (S2N) result1_green[4];
		Command y = (Command) result1_green[5];
		Branch x = (Branch) result1_green[9];
		Branch z = (Branch) result1_green[10];
		Command v = (Command) result1_green[11];
		S2B a2x = (S2B) result1_green[12];

		Object[] result2_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(c, d, c2z, b2y, d2v, y, a, b,
						x, z, v, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[d] = " + d
					+ ", " + "[c2z] = " + c2z + ", " + "[b2y] = " + b2y + ", " + "[d2v] = " + d2v + ", " + "[y] = " + y
					+ ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[z] = " + z + ", "
					+ "[v] = " + v + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(c, d, c2z, b2y, d2v, y, a, b,
						x, z, v, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, c, w, d, c2z, b2y,
						d2v, y, a, w2i, i, b, x, z, v, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[d] = " + d + ", " + "[c2z] = " + c2z + ", "
					+ "[b2y] = " + b2y + ", " + "[d2v] = " + d2v + ", " + "[y] = " + y + ", " + "[a] = " + a + ", "
					+ "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[b] = " + b + ", " + "[x] = " + x + ", "
					+ "[z] = " + z + ", " + "[v] = " + v + ", " + "[a2x] = " + a2x + ".");
		}
		whilell2branchbbImpl.pattern_whilell2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, c, w, d, c2z, b2y, d2v, y, a, i, b, x, z, v, a2x);
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[30];

		// 
		// 
		whilell2branchbbImpl.pattern_whilell2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				c, w, d, c2z, b2y, d2v, y, a, w2i, i, b, x, z, v, a2x);
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
		While c = (While) result2_binding[0];
		While w = (While) result2_binding[1];
		Assignment d = (Assignment) result2_binding[2];
		While a = (While) result2_binding[3];
		Assignment b = (Assignment) result2_binding[4];
		for (Object[] result2_black : whilell2branchbbImpl.pattern_whilell2branchbb_2_2_corematch_blackBBBBFFBB(c, w, d,
				a, b, match)) {
			S2B w2i = (S2B) result2_black[4];
			Branch i = (Branch) result2_black[5];
			// ForEach 
			for (Object[] result3_black : whilell2branchbbImpl.pattern_whilell2branchbb_2_3_findcontext_blackBBBBBBB(c,
					w, d, a, w2i, i, b)) {
				Object[] result3_green = whilell2branchbbImpl
						.pattern_whilell2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(c, w, d, a, w2i, i, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = whilell2branchbbImpl
						.pattern_whilell2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, c, w,
								d, a, w2i, i, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[w] = " + w
							+ ", " + "[d] = " + d + ", " + "[a] = " + a + ", " + "[w2i] = " + w2i + ", " + "[i] = " + i
							+ ", " + "[b] = " + b + ".");
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
	public void registerObjectsToMatch_FWD(Match match, While c, While w, Assignment d, While a, Assignment b) {
		match.registerObject("c", c);
		match.registerObject("w", w);
		match.registerObject("d", d);
		match.registerObject("a", a);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While c, While w, Assignment d, While a, Assignment b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While c, While w, Assignment d, While a,
			S2B w2i, Branch i, Assignment b) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("i", i);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c, EObject w, EObject d, EObject c2z,
			EObject b2y, EObject d2v, EObject y, EObject a, EObject w2i, EObject i, EObject b, EObject x, EObject z,
			EObject v, EObject a2x) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("a2x", a2x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command y, Branch i, Branch x, Branch z, Command v) {

		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_10_1_initialbindings_blackBBBBBBB(this,
				match, y, i, x, z, v);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[x] = " + x + ", "
					+ "[z] = " + z + ", " + "[v] = " + v + ".");
		}

		Object[] result2_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, y, i, x, z, v);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[x] = " + x + ", "
					+ "[z] = " + z + ", " + "[v] = " + v + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilell2branchbbImpl.pattern_whilell2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_10_4_collectelementstobetranslated_blackBBBBBB(match, y, i, x, z, v);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[y] = " + y + ", "
								+ "[i] = " + i + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[v] = " + v + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(match, y,
					i, x, z, v);
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge v__z____next = (EMoflonEdge) result4_green[9];

			Object[] result5_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_10_5_collectcontextelements_blackBBBBBB(match, y, i, x, z, v);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[y] = " + y + ", "
								+ "[i] = " + i + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[v] = " + v + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whilell2branchbbImpl.pattern_whilell2branchbb_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, y,
					i, x, z, v);
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
		While w = (While) result1_bindingAndBlack[0];
		Command y = (Command) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		Branch i = (Branch) result1_bindingAndBlack[3];
		Branch x = (Branch) result1_bindingAndBlack[4];
		Branch z = (Branch) result1_bindingAndBlack[5];
		Command v = (Command) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_1_performtransformation_greenFBFFFFBFFBBBF(w, y, x, z, v);
		While c = (While) result1_green[0];
		Assignment d = (Assignment) result1_green[2];
		S2B c2z = (S2B) result1_green[3];
		S2N b2y = (S2N) result1_green[4];
		S2N d2v = (S2N) result1_green[5];
		While a = (While) result1_green[7];
		Assignment b = (Assignment) result1_green[8];
		S2B a2x = (S2B) result1_green[12];

		Object[] result2_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(c, d, c2z, b2y, d2v, y, a, b,
						x, z, v, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[d] = " + d
					+ ", " + "[c2z] = " + c2z + ", " + "[b2y] = " + b2y + ", " + "[d2v] = " + d2v + ", " + "[y] = " + y
					+ ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[z] = " + z + ", "
					+ "[v] = " + v + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(c, d, c2z, b2y, d2v, y, a,
						b, x, z, v, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, c, w, d, c2z, b2y,
						d2v, y, a, w2i, i, b, x, z, v, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[d] = " + d + ", " + "[c2z] = " + c2z + ", "
					+ "[b2y] = " + b2y + ", " + "[d2v] = " + d2v + ", " + "[y] = " + y + ", " + "[a] = " + a + ", "
					+ "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[b] = " + b + ", " + "[x] = " + x + ", "
					+ "[z] = " + z + ", " + "[v] = " + v + ", " + "[a2x] = " + a2x + ".");
		}
		whilell2branchbbImpl.pattern_whilell2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, c, w, d, c2z, b2y, d2v, y, a, i, b, x, z, v, a2x);
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[30];

		// 
		// 
		whilell2branchbbImpl.pattern_whilell2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				c, w, d, c2z, b2y, d2v, y, a, w2i, i, b, x, z, v, a2x);
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
		Command y = (Command) result2_binding[0];
		Branch i = (Branch) result2_binding[1];
		Branch x = (Branch) result2_binding[2];
		Branch z = (Branch) result2_binding[3];
		Command v = (Command) result2_binding[4];
		for (Object[] result2_black : whilell2branchbbImpl.pattern_whilell2branchbb_12_2_corematch_blackFBFBBBBB(y, i,
				x, z, v, match)) {
			While w = (While) result2_black[0];
			S2B w2i = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : whilell2branchbbImpl.pattern_whilell2branchbb_12_3_findcontext_blackBBBBBBB(w,
					y, w2i, i, x, z, v)) {
				Object[] result3_green = whilell2branchbbImpl
						.pattern_whilell2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(w, y, w2i, i, x, z, v);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = whilell2branchbbImpl
						.pattern_whilell2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, w, y,
								w2i, i, x, z, v);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[y] = " + y
							+ ", " + "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[z] = " + z
							+ ", " + "[v] = " + v + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Command y, Branch i, Branch x, Branch z, Command v) {
		match.registerObject("y", y);
		match.registerObject("i", i);
		match.registerObject("x", x);
		match.registerObject("z", z);
		match.registerObject("v", v);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command y, Branch i, Branch x, Branch z, Command v) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, Command y, S2B w2i, Branch i,
			Branch x, Branch z, Command v) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("v", v);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c, EObject w, EObject d, EObject c2z,
			EObject b2y, EObject d2v, EObject y, EObject a, EObject w2i, EObject i, EObject b, EObject x, EObject z,
			EObject v, EObject a2x) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("v", v);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("v").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_61(EMoflonEdge _edge_positive) {

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
			Command y = (Command) result2_black[0];
			Branch i = (Branch) result2_black[1];
			Branch x = (Branch) result2_black[2];
			Branch z = (Branch) result2_black[3];
			Command v = (Command) result2_black[4];
			Object[] result2_green = whilell2branchbbImpl
					.pattern_whilell2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilell2branchbbImpl
					.pattern_whilell2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, y, i, x, z, v)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_61(EMoflonEdge _edge_next) {

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
				.pattern_whilell2branchbb_21_2_testcorematchandDECs_blackFFFFFB(_edge_next)) {
			While c = (While) result2_black[0];
			While w = (While) result2_black[1];
			Assignment d = (Assignment) result2_black[2];
			While a = (While) result2_black[3];
			Assignment b = (Assignment) result2_black[4];
			Object[] result2_green = whilell2branchbbImpl
					.pattern_whilell2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilell2branchbbImpl
					.pattern_whilell2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, c, w, d, a, b)) {
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
		While c = (While) result2_bindingAndBlack[0];
		While w = (While) result2_bindingAndBlack[1];
		Assignment d = (Assignment) result2_bindingAndBlack[2];
		Command y = (Command) result2_bindingAndBlack[3];
		While a = (While) result2_bindingAndBlack[4];
		Branch i = (Branch) result2_bindingAndBlack[5];
		Assignment b = (Assignment) result2_bindingAndBlack[6];
		Branch x = (Branch) result2_bindingAndBlack[7];
		Branch z = (Branch) result2_bindingAndBlack[8];
		Command v = (Command) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, c, w, d, y, a, i, b, x, z,
						v, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[c] = " + c + ", " + "[w] = " + w + ", " + "[d] = " + d + ", " + "[y] = " + y + ", " + "[a] = "
					+ a + ", " + "[i] = " + i + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[z] = " + z + ", "
					+ "[v] = " + v + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whilell2branchbbImpl.pattern_whilell2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whilell2branchbbImpl
					.pattern_whilell2branchbb_24_5_matchcorrcontext_blackBFBBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[1];
				Object[] result5_green = whilell2branchbbImpl
						.pattern_whilell2branchbb_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whilell2branchbbImpl
						.pattern_whilell2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(c, w, d, y, a, i, b, x, z,
								v, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
							+ "[w] = " + w + ", " + "[d] = " + d + ", " + "[y] = " + y + ", " + "[a] = " + a + ", "
							+ "[i] = " + i + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[z] = " + z + ", "
							+ "[v] = " + v + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilell2branchbbImpl.pattern_whilell2branchbb_24_6_createcorrespondence_greenBBFFFBBBBBBFB(c, d, y, a,
						b, x, z, v, ccMatch);
				//nothing S2B c2z = (S2B) result6_green[2];
				//nothing S2N b2y = (S2N) result6_green[3];
				//nothing S2N d2v = (S2N) result6_green[4];
				//nothing S2B a2x = (S2B) result6_green[11];

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
	public CSP isApplicable_solveCsp_CC(While c, While w, Assignment d, Command y, While a, Branch i, Assignment b,
			Branch x, Branch z, Command v, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While c, While w, Assignment d, While a, Assignment b) {// 
		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_27_1_matchtggpattern_blackBBBBB(c, w, d,
				a, b);
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
	public boolean checkDEC_BWD(Command y, Branch i, Branch x, Branch z, Command v) {// 
		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_28_1_matchtggpattern_blackBBBBB(y, i, x,
				z, v);
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
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whilell2branchbbImpl
					.pattern_whilell2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w, w2i, i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[w2i] = " + w2i
						+ ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whilell2branchbbImpl.pattern_whilell2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whilell2branchbbImpl.pattern_whilell2branchbb_29_5_checknacs_blackBBB(w, w2i,
						i);
				if (result5_black != null) {

					Object[] result6_black = whilell2branchbbImpl.pattern_whilell2branchbb_29_6_perform_blackBBBB(w,
							w2i, i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
								+ "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whilell2branchbbImpl.pattern_whilell2branchbb_29_6_perform_greenFBFFFFFFBFFFFFB(w, i, ruleResult);
					//nothing While c = (While) result6_green[0];
					//nothing Assignment d = (Assignment) result6_green[2];
					//nothing S2B c2z = (S2B) result6_green[3];
					//nothing S2N b2y = (S2N) result6_green[4];
					//nothing S2N d2v = (S2N) result6_green[5];
					//nothing Command y = (Command) result6_green[6];
					//nothing While a = (While) result6_green[7];
					//nothing Assignment b = (Assignment) result6_green[9];
					//nothing Branch x = (Branch) result6_green[10];
					//nothing Branch z = (Branch) result6_green[11];
					//nothing Command v = (Command) result6_green[12];
					//nothing S2B a2x = (S2B) result6_green[13];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch i,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("i", i);
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
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4), (Assignment) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4), (Assignment) arguments.get(5));
			return null;
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_WHILE_ASSIGNMENT_WHILE_S2B_BRANCH_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(S2B) arguments.get(5), (Branch) arguments.get(6), (Assignment) arguments.get(7));
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
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4), (Command) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4), (Command) arguments.get(5));
			return null;
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Command) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_COMMAND_S2B_BRANCH_BRANCH_BRANCH_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Command) arguments.get(2), (S2B) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5), (Branch) arguments.get(6), (Command) arguments.get(7));
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
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_61__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_61((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_61__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_61((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_WHILE_ASSIGNMENT_COMMAND_WHILE_BRANCH_ASSIGNMENT_BRANCH_BRANCH_COMMAND_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (Command) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5), (Assignment) arguments.get(6), (Branch) arguments.get(7),
					(Branch) arguments.get(8), (Command) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_DEC_FWD__WHILE_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			return checkDEC_FWD((While) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH_BRANCH_COMMAND:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.WHILELL2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILELL2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_S2B_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILELL2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whilell2branchbb_0_1_initialbindings_blackBBBBBBB(whilell2branchbb _this,
			Match match, While c, While w, Assignment d, While a, Assignment b) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						return new Object[] { _this, match, c, w, d, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_0_2_SolveCSP_bindingFBBBBBBB(whilell2branchbb _this,
			Match match, While c, While w, Assignment d, While a, Assignment b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, c, w, d, a, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, w, d, a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(whilell2branchbb _this,
			Match match, While c, While w, Assignment d, While a, Assignment b) {
		Object[] result_pattern_whilell2branchbb_0_2_SolveCSP_binding = pattern_whilell2branchbb_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, c, w, d, a, b);
		if (result_pattern_whilell2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_0_2_SolveCSP_black = pattern_whilell2branchbb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, w, d, a, b };
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
			While c, While w, Assignment d, While a, Assignment b) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						return new Object[] { match, c, w, d, a, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(Match match,
			While c, While w, Assignment d, While a, Assignment b) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(d);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String c__d____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { match, c, w, d, a, b, w__c____next, a__b____last, c__d____last, w__a____first };
	}

	public static final Object[] pattern_whilell2branchbb_0_5_collectcontextelements_blackBBBBBB(Match match, While c,
			While w, Assignment d, While a, Assignment b) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						return new Object[] { match, c, w, d, a, b };
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
			whilell2branchbb _this, Match match, While c, While w, Assignment d, While a, Assignment b) {
		_this.registerObjectsToMatch_FWD(match, c, w, d, a, b);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("d");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject _localVariable_6 = isApplicableMatch.getObject("b");
		EObject tmpC = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		EObject tmpI = _localVariable_5;
		EObject tmpB = _localVariable_6;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpD instanceof Assignment) {
					Assignment d = (Assignment) tmpD;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								if (tmpB instanceof Assignment) {
									Assignment b = (Assignment) tmpB;
									return new Object[] { c, w, d, a, w2i, i, b, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_1_1_performtransformation_blackBBBBBBBFBB(While c, While w,
			Assignment d, While a, S2B w2i, Branch i, Assignment b, whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { c, w, d, a, w2i, i, b, csp, _this, isApplicableMatch };
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
			While c = (While) result_pattern_whilell2branchbb_1_1_performtransformation_binding[0];
			While w = (While) result_pattern_whilell2branchbb_1_1_performtransformation_binding[1];
			Assignment d = (Assignment) result_pattern_whilell2branchbb_1_1_performtransformation_binding[2];
			While a = (While) result_pattern_whilell2branchbb_1_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whilell2branchbb_1_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whilell2branchbb_1_1_performtransformation_binding[5];
			Assignment b = (Assignment) result_pattern_whilell2branchbb_1_1_performtransformation_binding[6];

			Object[] result_pattern_whilell2branchbb_1_1_performtransformation_black = pattern_whilell2branchbb_1_1_performtransformation_blackBBBBBBBFBB(
					c, w, d, a, w2i, i, b, _this, isApplicableMatch);
			if (result_pattern_whilell2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilell2branchbb_1_1_performtransformation_black[7];

				return new Object[] { c, w, d, a, w2i, i, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_1_1_performtransformation_greenBBFFFFBBBFFFF(While c,
			Assignment d, While a, Branch i, Assignment b) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		c2z.setSource(c);
		b2y.setSource(b);
		d2v.setSource(d);
		b2y.setTarget(y);
		i.setPositive(x);
		y.setNext(x);
		c2z.setTarget(z);
		i.setNegative(z);
		d2v.setTarget(v);
		v.setNext(z);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { c, d, c2z, b2y, d2v, y, a, i, b, x, z, v, a2x };
	}

	public static final Object[] pattern_whilell2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(While c,
			Assignment d, S2B c2z, S2N b2y, S2N d2v, Command y, While a, Assignment b, Branch x, Branch z, Command v,
			S2B a2x) {
		if (!b2y.equals(d2v)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!x.equals(z)) {
						if (!v.equals(y)) {
							if (!a2x.equals(c2z)) {
								return new Object[] { c, d, c2z, b2y, d2v, y, a, b, x, z, v, a2x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(While c,
			Assignment d, S2B c2z, S2N b2y, S2N d2v, Command y, While a, Assignment b, Branch x, Branch z, Command v,
			S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, c, d, c2z, b2y, d2v, y, a, b, x, z, v, a2x };
	}

	public static final Object[] pattern_whilell2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject w, EObject d, EObject c2z, EObject b2y, EObject d2v,
			EObject y, EObject a, EObject w2i, EObject i, EObject b, EObject x, EObject z, EObject v, EObject a2x) {
		if (!c.equals(w)) {
			if (!c.equals(d)) {
				if (!c.equals(c2z)) {
					if (!c.equals(d2v)) {
						if (!c.equals(y)) {
							if (!c.equals(w2i)) {
								if (!c.equals(i)) {
									if (!c.equals(x)) {
										if (!c.equals(z)) {
											if (!c.equals(v)) {
												if (!w.equals(y)) {
													if (!w.equals(w2i)) {
														if (!w.equals(x)) {
															if (!w.equals(z)) {
																if (!d.equals(w)) {
																	if (!d.equals(d2v)) {
																		if (!d.equals(y)) {
																			if (!d.equals(w2i)) {
																				if (!d.equals(i)) {
																					if (!d.equals(x)) {
																						if (!d.equals(z)) {
																							if (!d.equals(v)) {
																								if (!c2z.equals(w)) {
																									if (!c2z.equals(
																											d)) {
																										if (!c2z.equals(
																												d2v)) {
																											if (!c2z.equals(
																													y)) {
																												if (!c2z.equals(
																														w2i)) {
																													if (!c2z.equals(
																															i)) {
																														if (!c2z.equals(
																																x)) {
																															if (!c2z.equals(
																																	z)) {
																																if (!c2z.equals(
																																		v)) {
																																	if (!b2y.equals(
																																			c)) {
																																		if (!b2y.equals(
																																				w)) {
																																			if (!b2y.equals(
																																					d)) {
																																				if (!b2y.equals(
																																						c2z)) {
																																					if (!b2y.equals(
																																							d2v)) {
																																						if (!b2y.equals(
																																								y)) {
																																							if (!b2y.equals(
																																									w2i)) {
																																								if (!b2y.equals(
																																										i)) {
																																									if (!b2y.equals(
																																											x)) {
																																										if (!b2y.equals(
																																												z)) {
																																											if (!b2y.equals(
																																													v)) {
																																												if (!d2v.equals(
																																														w)) {
																																													if (!d2v.equals(
																																															y)) {
																																														if (!d2v.equals(
																																																w2i)) {
																																															if (!d2v.equals(
																																																	i)) {
																																																if (!d2v.equals(
																																																		x)) {
																																																	if (!d2v.equals(
																																																			z)) {
																																																		if (!d2v.equals(
																																																				v)) {
																																																			if (!y.equals(
																																																					z)) {
																																																				if (!a.equals(
																																																						c)) {
																																																					if (!a.equals(
																																																							w)) {
																																																						if (!a.equals(
																																																								d)) {
																																																							if (!a.equals(
																																																									c2z)) {
																																																								if (!a.equals(
																																																										b2y)) {
																																																									if (!a.equals(
																																																											d2v)) {
																																																										if (!a.equals(
																																																												y)) {
																																																											if (!a.equals(
																																																													w2i)) {
																																																												if (!a.equals(
																																																														i)) {
																																																													if (!a.equals(
																																																															b)) {
																																																														if (!a.equals(
																																																																x)) {
																																																															if (!a.equals(
																																																																	z)) {
																																																																if (!a.equals(
																																																																		v)) {
																																																																	if (!a.equals(
																																																																			a2x)) {
																																																																		if (!w2i.equals(
																																																																				y)) {
																																																																			if (!w2i.equals(
																																																																					x)) {
																																																																				if (!w2i.equals(
																																																																						z)) {
																																																																					if (!i.equals(
																																																																							w)) {
																																																																						if (!i.equals(
																																																																								y)) {
																																																																							if (!i.equals(
																																																																									w2i)) {
																																																																								if (!i.equals(
																																																																										x)) {
																																																																									if (!i.equals(
																																																																											z)) {
																																																																										if (!i.equals(
																																																																												v)) {
																																																																											if (!b.equals(
																																																																													c)) {
																																																																												if (!b.equals(
																																																																														w)) {
																																																																													if (!b.equals(
																																																																															d)) {
																																																																														if (!b.equals(
																																																																																c2z)) {
																																																																															if (!b.equals(
																																																																																	b2y)) {
																																																																																if (!b.equals(
																																																																																		d2v)) {
																																																																																	if (!b.equals(
																																																																																			y)) {
																																																																																		if (!b.equals(
																																																																																				w2i)) {
																																																																																			if (!b.equals(
																																																																																					i)) {
																																																																																				if (!b.equals(
																																																																																						x)) {
																																																																																					if (!b.equals(
																																																																																							z)) {
																																																																																						if (!b.equals(
																																																																																								v)) {
																																																																																							if (!x.equals(
																																																																																									y)) {
																																																																																								if (!x.equals(
																																																																																										z)) {
																																																																																									if (!v.equals(
																																																																																											w)) {
																																																																																										if (!v.equals(
																																																																																												y)) {
																																																																																											if (!v.equals(
																																																																																													w2i)) {
																																																																																												if (!v.equals(
																																																																																														x)) {
																																																																																													if (!v.equals(
																																																																																															z)) {
																																																																																														if (!a2x.equals(
																																																																																																c)) {
																																																																																															if (!a2x.equals(
																																																																																																	w)) {
																																																																																																if (!a2x.equals(
																																																																																																		d)) {
																																																																																																	if (!a2x.equals(
																																																																																																			c2z)) {
																																																																																																		if (!a2x.equals(
																																																																																																				b2y)) {
																																																																																																			if (!a2x.equals(
																																																																																																					d2v)) {
																																																																																																				if (!a2x.equals(
																																																																																																						y)) {
																																																																																																					if (!a2x.equals(
																																																																																																							w2i)) {
																																																																																																						if (!a2x.equals(
																																																																																																								i)) {
																																																																																																							if (!a2x.equals(
																																																																																																									b)) {
																																																																																																								if (!a2x.equals(
																																																																																																										x)) {
																																																																																																									if (!a2x.equals(
																																																																																																											z)) {
																																																																																																										if (!a2x.equals(
																																																																																																												v)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													c,
																																																																																																													w,
																																																																																																													d,
																																																																																																													c2z,
																																																																																																													b2y,
																																																																																																													d2v,
																																																																																																													y,
																																																																																																													a,
																																																																																																													w2i,
																																																																																																													i,
																																																																																																													b,
																																																																																																													x,
																																																																																																													z,
																																																																																																													v,
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
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject c, EObject w, EObject d, EObject c2z, EObject b2y, EObject d2v,
			EObject y, EObject a, EObject i, EObject b, EObject x, EObject z, EObject v, EObject a2x) {
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilell2branchbb";
		String c2z__c____source_name_prime = "source";
		String d2v__d____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String i__x____positive_name_prime = "positive";
		String b2y__b____source_name_prime = "source";
		String c__d____last_name_prime = "last";
		String y__x____next_name_prime = "next";
		String d2v__v____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String i__z____negative_name_prime = "negative";
		String v__z____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____last);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(v__z____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, c, w, d, c2z, b2y, d2v, y, a, i, b, x, z, v, a2x, c2z__c____source,
				d2v__d____source, b2y__y____target, w__c____next, a__b____last, i__x____positive, b2y__b____source,
				c__d____last, y__x____next, d2v__v____target, c2z__z____target, i__z____negative, v__z____next,
				w__a____first, a2x__a____source, a2x__x____target };
	}

	public static final void pattern_whilell2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whilell2branchbb _this, PerformRuleResult ruleresult, EObject c, EObject w, EObject d, EObject c2z,
			EObject b2y, EObject d2v, EObject y, EObject a, EObject w2i, EObject i, EObject b, EObject x, EObject z,
			EObject v, EObject a2x) {
		_this.registerObjects_FWD(ruleresult, c, w, d, c2z, b2y, d2v, y, a, w2i, i, b, x, z, v, a2x);

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
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("w");
		EObject _localVariable_2 = match.getObject("d");
		EObject _localVariable_3 = match.getObject("a");
		EObject _localVariable_4 = match.getObject("b");
		EObject tmpC = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpB = _localVariable_4;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpD instanceof Assignment) {
					Assignment d = (Assignment) tmpD;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							return new Object[] { c, w, d, a, b, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_2_2_corematch_blackBBBBFFBB(While c, While w,
			Assignment d, While a, Assignment b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
								"source")) {
							Branch i = w2i.getTarget();
							if (i != null) {
								_result.add(new Object[] { c, w, d, a, w2i, i, b, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_2_3_findcontext_blackBBBBBBB(While c, While w,
			Assignment d, While a, S2B w2i, Branch i, Assignment b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						if (c.equals(w.getNext())) {
							if (b.equals(a.getLast())) {
								if (i.equals(w2i.getTarget())) {
									if (d.equals(c.getLast())) {
										if (w.equals(w2i.getSource())) {
											if (a.equals(w.getFirst())) {
												_result.add(new Object[] { c, w, d, a, w2i, i, b });
											}
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

	public static final Object[] pattern_whilell2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(While c, While w,
			Assignment d, While a, S2B w2i, Branch i, Assignment b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String w2i__i____target_name_prime = "target";
		String c__d____last_name_prime = "last";
		String w2i__w____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(b);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____last);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { c, w, d, a, w2i, i, b, isApplicableMatch, w__c____next, a__b____last, w2i__i____target,
				c__d____last, w2i__w____source, w__a____first };
	}

	public static final Object[] pattern_whilell2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, While c, While w, Assignment d, While a, S2B w2i, Branch i,
			Assignment b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, w, d, a, w2i, i, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, w, d, a, w2i, i, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, While c, While w, Assignment d, While a, S2B w2i, Branch i,
			Assignment b) {
		Object[] result_pattern_whilell2branchbb_2_4_solveCSP_binding = pattern_whilell2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, c, w, d, a, w2i, i, b);
		if (result_pattern_whilell2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_2_4_solveCSP_black = pattern_whilell2branchbb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, w, d, a, w2i, i, b };
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
			Match match, Command y, Branch i, Branch x, Branch z, Command v) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (!v.equals(y)) {
						return new Object[] { _this, match, y, i, x, z, v };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_10_2_SolveCSP_bindingFBBBBBBB(whilell2branchbb _this,
			Match match, Command y, Branch i, Branch x, Branch z, Command v) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, i, x, z, v);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, i, x, z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(whilell2branchbb _this,
			Match match, Command y, Branch i, Branch x, Branch z, Command v) {
		Object[] result_pattern_whilell2branchbb_10_2_SolveCSP_binding = pattern_whilell2branchbb_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, y, i, x, z, v);
		if (result_pattern_whilell2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_10_2_SolveCSP_black = pattern_whilell2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, i, x, z, v };
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
			Command y, Branch i, Branch x, Branch z, Command v) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (!v.equals(y)) {
						return new Object[] { match, y, i, x, z, v };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(
			Match match, Command y, Branch i, Branch x, Branch z, Command v) {
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(v);
		String i__x____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String v__z____next_name_prime = "next";
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(v__z____next);
		i__x____positive.setName(i__x____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		return new Object[] { match, y, i, x, z, v, i__x____positive, y__x____next, i__z____negative, v__z____next };
	}

	public static final Object[] pattern_whilell2branchbb_10_5_collectcontextelements_blackBBBBBB(Match match,
			Command y, Branch i, Branch x, Branch z, Command v) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (!v.equals(y)) {
						return new Object[] { match, y, i, x, z, v };
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
			whilell2branchbb _this, Match match, Command y, Branch i, Branch x, Branch z, Command v) {
		_this.registerObjectsToMatch_BWD(match, y, i, x, z, v);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("y");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("i");
		EObject _localVariable_4 = isApplicableMatch.getObject("x");
		EObject _localVariable_5 = isApplicableMatch.getObject("z");
		EObject _localVariable_6 = isApplicableMatch.getObject("v");
		EObject tmpW = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		EObject tmpV = _localVariable_6;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpZ instanceof Branch) {
								Branch z = (Branch) tmpZ;
								if (tmpV instanceof Command) {
									Command v = (Command) tmpV;
									return new Object[] { w, y, w2i, i, x, z, v, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_11_1_performtransformation_blackBBBBBBBFBB(While w, Command y,
			S2B w2i, Branch i, Branch x, Branch z, Command v, whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (!v.equals(y)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { w, y, w2i, i, x, z, v, csp, _this, isApplicableMatch };
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
			While w = (While) result_pattern_whilell2branchbb_11_1_performtransformation_binding[0];
			Command y = (Command) result_pattern_whilell2branchbb_11_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whilell2branchbb_11_1_performtransformation_binding[2];
			Branch i = (Branch) result_pattern_whilell2branchbb_11_1_performtransformation_binding[3];
			Branch x = (Branch) result_pattern_whilell2branchbb_11_1_performtransformation_binding[4];
			Branch z = (Branch) result_pattern_whilell2branchbb_11_1_performtransformation_binding[5];
			Command v = (Command) result_pattern_whilell2branchbb_11_1_performtransformation_binding[6];

			Object[] result_pattern_whilell2branchbb_11_1_performtransformation_black = pattern_whilell2branchbb_11_1_performtransformation_blackBBBBBBBFBB(
					w, y, w2i, i, x, z, v, _this, isApplicableMatch);
			if (result_pattern_whilell2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilell2branchbb_11_1_performtransformation_black[7];

				return new Object[] { w, y, w2i, i, x, z, v, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_11_1_performtransformation_greenFBFFFFBFFBBBF(While w,
			Command y, Branch x, Branch z, Command v) {
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		w.setNext(c);
		c.setLast(d);
		c2z.setSource(c);
		c2z.setTarget(z);
		b2y.setTarget(y);
		d2v.setSource(d);
		d2v.setTarget(v);
		w.setFirst(a);
		a.setLast(b);
		b2y.setSource(b);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { c, w, d, c2z, b2y, d2v, y, a, b, x, z, v, a2x };
	}

	public static final Object[] pattern_whilell2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(While c,
			Assignment d, S2B c2z, S2N b2y, S2N d2v, Command y, While a, Assignment b, Branch x, Branch z, Command v,
			S2B a2x) {
		if (!b2y.equals(d2v)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!x.equals(z)) {
						if (!v.equals(y)) {
							if (!a2x.equals(c2z)) {
								return new Object[] { c, d, c2z, b2y, d2v, y, a, b, x, z, v, a2x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(While c,
			Assignment d, S2B c2z, S2N b2y, S2N d2v, Command y, While a, Assignment b, Branch x, Branch z, Command v,
			S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getTranslatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, c, d, c2z, b2y, d2v, y, a, b, x, z, v, a2x };
	}

	public static final Object[] pattern_whilell2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject w, EObject d, EObject c2z, EObject b2y, EObject d2v,
			EObject y, EObject a, EObject w2i, EObject i, EObject b, EObject x, EObject z, EObject v, EObject a2x) {
		if (!c.equals(w)) {
			if (!c.equals(d)) {
				if (!c.equals(c2z)) {
					if (!c.equals(d2v)) {
						if (!c.equals(y)) {
							if (!c.equals(w2i)) {
								if (!c.equals(i)) {
									if (!c.equals(x)) {
										if (!c.equals(z)) {
											if (!c.equals(v)) {
												if (!w.equals(y)) {
													if (!w.equals(w2i)) {
														if (!w.equals(x)) {
															if (!w.equals(z)) {
																if (!d.equals(w)) {
																	if (!d.equals(d2v)) {
																		if (!d.equals(y)) {
																			if (!d.equals(w2i)) {
																				if (!d.equals(i)) {
																					if (!d.equals(x)) {
																						if (!d.equals(z)) {
																							if (!d.equals(v)) {
																								if (!c2z.equals(w)) {
																									if (!c2z.equals(
																											d)) {
																										if (!c2z.equals(
																												d2v)) {
																											if (!c2z.equals(
																													y)) {
																												if (!c2z.equals(
																														w2i)) {
																													if (!c2z.equals(
																															i)) {
																														if (!c2z.equals(
																																x)) {
																															if (!c2z.equals(
																																	z)) {
																																if (!c2z.equals(
																																		v)) {
																																	if (!b2y.equals(
																																			c)) {
																																		if (!b2y.equals(
																																				w)) {
																																			if (!b2y.equals(
																																					d)) {
																																				if (!b2y.equals(
																																						c2z)) {
																																					if (!b2y.equals(
																																							d2v)) {
																																						if (!b2y.equals(
																																								y)) {
																																							if (!b2y.equals(
																																									w2i)) {
																																								if (!b2y.equals(
																																										i)) {
																																									if (!b2y.equals(
																																											x)) {
																																										if (!b2y.equals(
																																												z)) {
																																											if (!b2y.equals(
																																													v)) {
																																												if (!d2v.equals(
																																														w)) {
																																													if (!d2v.equals(
																																															y)) {
																																														if (!d2v.equals(
																																																w2i)) {
																																															if (!d2v.equals(
																																																	i)) {
																																																if (!d2v.equals(
																																																		x)) {
																																																	if (!d2v.equals(
																																																			z)) {
																																																		if (!d2v.equals(
																																																				v)) {
																																																			if (!y.equals(
																																																					z)) {
																																																				if (!a.equals(
																																																						c)) {
																																																					if (!a.equals(
																																																							w)) {
																																																						if (!a.equals(
																																																								d)) {
																																																							if (!a.equals(
																																																									c2z)) {
																																																								if (!a.equals(
																																																										b2y)) {
																																																									if (!a.equals(
																																																											d2v)) {
																																																										if (!a.equals(
																																																												y)) {
																																																											if (!a.equals(
																																																													w2i)) {
																																																												if (!a.equals(
																																																														i)) {
																																																													if (!a.equals(
																																																															b)) {
																																																														if (!a.equals(
																																																																x)) {
																																																															if (!a.equals(
																																																																	z)) {
																																																																if (!a.equals(
																																																																		v)) {
																																																																	if (!a.equals(
																																																																			a2x)) {
																																																																		if (!w2i.equals(
																																																																				y)) {
																																																																			if (!w2i.equals(
																																																																					x)) {
																																																																				if (!w2i.equals(
																																																																						z)) {
																																																																					if (!i.equals(
																																																																							w)) {
																																																																						if (!i.equals(
																																																																								y)) {
																																																																							if (!i.equals(
																																																																									w2i)) {
																																																																								if (!i.equals(
																																																																										x)) {
																																																																									if (!i.equals(
																																																																											z)) {
																																																																										if (!i.equals(
																																																																												v)) {
																																																																											if (!b.equals(
																																																																													c)) {
																																																																												if (!b.equals(
																																																																														w)) {
																																																																													if (!b.equals(
																																																																															d)) {
																																																																														if (!b.equals(
																																																																																c2z)) {
																																																																															if (!b.equals(
																																																																																	b2y)) {
																																																																																if (!b.equals(
																																																																																		d2v)) {
																																																																																	if (!b.equals(
																																																																																			y)) {
																																																																																		if (!b.equals(
																																																																																				w2i)) {
																																																																																			if (!b.equals(
																																																																																					i)) {
																																																																																				if (!b.equals(
																																																																																						x)) {
																																																																																					if (!b.equals(
																																																																																							z)) {
																																																																																						if (!b.equals(
																																																																																								v)) {
																																																																																							if (!x.equals(
																																																																																									y)) {
																																																																																								if (!x.equals(
																																																																																										z)) {
																																																																																									if (!v.equals(
																																																																																											w)) {
																																																																																										if (!v.equals(
																																																																																												y)) {
																																																																																											if (!v.equals(
																																																																																													w2i)) {
																																																																																												if (!v.equals(
																																																																																														x)) {
																																																																																													if (!v.equals(
																																																																																															z)) {
																																																																																														if (!a2x.equals(
																																																																																																c)) {
																																																																																															if (!a2x.equals(
																																																																																																	w)) {
																																																																																																if (!a2x.equals(
																																																																																																		d)) {
																																																																																																	if (!a2x.equals(
																																																																																																			c2z)) {
																																																																																																		if (!a2x.equals(
																																																																																																				b2y)) {
																																																																																																			if (!a2x.equals(
																																																																																																					d2v)) {
																																																																																																				if (!a2x.equals(
																																																																																																						y)) {
																																																																																																					if (!a2x.equals(
																																																																																																							w2i)) {
																																																																																																						if (!a2x.equals(
																																																																																																								i)) {
																																																																																																							if (!a2x.equals(
																																																																																																									b)) {
																																																																																																								if (!a2x.equals(
																																																																																																										x)) {
																																																																																																									if (!a2x.equals(
																																																																																																											z)) {
																																																																																																										if (!a2x.equals(
																																																																																																												v)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													c,
																																																																																																													w,
																																																																																																													d,
																																																																																																													c2z,
																																																																																																													b2y,
																																																																																																													d2v,
																																																																																																													y,
																																																																																																													a,
																																																																																																													w2i,
																																																																																																													i,
																																																																																																													b,
																																																																																																													x,
																																																																																																													z,
																																																																																																													v,
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
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject c, EObject w, EObject d, EObject c2z, EObject b2y, EObject d2v,
			EObject y, EObject a, EObject i, EObject b, EObject x, EObject z, EObject v, EObject a2x) {
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilell2branchbb";
		String c2z__c____source_name_prime = "source";
		String d2v__d____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String i__x____positive_name_prime = "positive";
		String b2y__b____source_name_prime = "source";
		String c__d____last_name_prime = "last";
		String y__x____next_name_prime = "next";
		String d2v__v____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String i__z____negative_name_prime = "negative";
		String v__z____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____last);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(v__z____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, c, w, d, c2z, b2y, d2v, y, a, i, b, x, z, v, a2x, c2z__c____source,
				d2v__d____source, b2y__y____target, w__c____next, a__b____last, i__x____positive, b2y__b____source,
				c__d____last, y__x____next, d2v__v____target, c2z__z____target, i__z____negative, v__z____next,
				w__a____first, a2x__a____source, a2x__x____target };
	}

	public static final void pattern_whilell2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whilell2branchbb _this, PerformRuleResult ruleresult, EObject c, EObject w, EObject d, EObject c2z,
			EObject b2y, EObject d2v, EObject y, EObject a, EObject w2i, EObject i, EObject b, EObject x, EObject z,
			EObject v, EObject a2x) {
		_this.registerObjects_BWD(ruleresult, c, w, d, c2z, b2y, d2v, y, a, w2i, i, b, x, z, v, a2x);

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
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("i");
		EObject _localVariable_2 = match.getObject("x");
		EObject _localVariable_3 = match.getObject("z");
		EObject _localVariable_4 = match.getObject("v");
		EObject tmpY = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpV = _localVariable_4;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (tmpV instanceof Command) {
							Command v = (Command) tmpV;
							return new Object[] { y, i, x, z, v, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_12_2_corematch_blackFBFBBBBB(Command y, Branch i,
			Branch x, Branch z, Command v, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (!v.equals(y)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
								"target")) {
							Statement tmpW = w2i.getSource();
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								_result.add(new Object[] { w, y, w2i, i, x, z, v, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_12_3_findcontext_blackBBBBBBB(While w, Command y,
			S2B w2i, Branch i, Branch x, Branch z, Command v) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (!v.equals(y)) {
						if (x.equals(i.getPositive())) {
							if (i.equals(w2i.getTarget())) {
								if (x.equals(y.getNext())) {
									if (z.equals(i.getNegative())) {
										if (w.equals(w2i.getSource())) {
											if (z.equals(v.getNext())) {
												_result.add(new Object[] { w, y, w2i, i, x, z, v });
											}
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

	public static final Object[] pattern_whilell2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(While w, Command y,
			S2B w2i, Branch i, Branch x, Branch z, Command v) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__x____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String w2i__w____source_name_prime = "source";
		String v__z____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(v);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(v__z____next);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		return new Object[] { w, y, w2i, i, x, z, v, isApplicableMatch, i__x____positive, w2i__i____target,
				y__x____next, i__z____negative, w2i__w____source, v__z____next };
	}

	public static final Object[] pattern_whilell2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, While w, Command y, S2B w2i, Branch i, Branch x, Branch z, Command v) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, w, y, w2i, i, x, z, v);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, y, w2i, i, x, z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whilell2branchbb _this, IsApplicableMatch isApplicableMatch, While w, Command y, S2B w2i, Branch i,
			Branch x, Branch z, Command v) {
		Object[] result_pattern_whilell2branchbb_12_4_solveCSP_binding = pattern_whilell2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, w, y, w2i, i, x, z, v);
		if (result_pattern_whilell2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_12_4_solveCSP_black = pattern_whilell2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, y, w2i, i, x, z, v };
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

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_296902 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_1BBBB(Command y, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_224667 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!i.equals(__DEC_y_positive_224667)) {
							if (!x.equals(__DEC_y_positive_224667)) {
								if (!z.equals(__DEC_y_positive_224667)) {
									return new Object[] { y, i, x, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_2BBBB(Command y, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_597956 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!i.equals(__DEC_y_negative_597956)) {
							if (!x.equals(__DEC_y_negative_597956)) {
								if (!z.equals(__DEC_y_negative_597956)) {
									return new Object[] { y, i, x, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_442531 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_517696 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_517696)) {
							if (!i.equals(__DEC_x_positive_517696)) {
								if (!z.equals(__DEC_x_positive_517696)) {
									return new Object[] { x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_33885 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_33885)) {
							if (!i.equals(__DEC_x_negative_33885)) {
								if (!z.equals(__DEC_x_negative_33885)) {
									return new Object[] { x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_425982 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_52103 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_52103)) {
							if (!i.equals(__DEC_z_positive_52103)) {
								if (!x.equals(__DEC_z_positive_52103)) {
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

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_745639 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_745639)) {
							if (!i.equals(__DEC_z_negative_745639)) {
								if (!x.equals(__DEC_z_negative_745639)) {
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

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_9B(Command v) {
		for (Graph __DEC_v_root_548137 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_10BBBB(Command v,
			Branch i, Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_positive_632211 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!i.equals(__DEC_v_positive_632211)) {
							if (!x.equals(__DEC_v_positive_632211)) {
								if (!z.equals(__DEC_v_positive_632211)) {
									return new Object[] { v, i, x, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_11BBBB(Command v,
			Branch i, Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_negative_126638 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!i.equals(__DEC_v_negative_126638)) {
							if (!x.equals(__DEC_v_negative_126638)) {
								if (!z.equals(__DEC_v_negative_126638)) {
									return new Object[] { v, i, x, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_12BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_13BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_14BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_15BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_16BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_17BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_18BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_19BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_20BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_21BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_22BB(Branch i,
			Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_23BB(Branch x,
			Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_24BB(Branch z,
			Command v) {
		if (v.equals(z.getPositive())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_25BB(Branch i,
			Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_26BB(Branch x,
			Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_27BB(Branch z,
			Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
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
									if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_3B(x) == null) {
										if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_18BB(i,
												x) == null) {
											if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(x, i,
													z) == null) {
												if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(x,
														i, z) == null) {
													if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_6B(
															z) == null) {
														if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(
																z, i, x) == null) {
															if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(
																	z, i, x) == null) {
																if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_19BB(
																		i, z) == null) {
																	if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_20BB(
																			x, z) == null) {
																		if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_21BB(
																				x, z) == null) {
																			for (Node tmpY : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(x,
																							Node.class, "next")) {
																				if (tmpY instanceof Command) {
																					Command y = (Command) tmpY;
																					if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_0B(
																							y) == null) {
																						if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_1BBBB(
																								y, i, x, z) == null) {
																							if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_2BBBB(
																									y, i, x,
																									z) == null) {
																								if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_12BB(
																										i, y) == null) {
																									if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_13BB(
																											x,
																											y) == null) {
																										if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_14BB(
																												z,
																												y) == null) {
																											if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																													i,
																													y) == null) {
																												if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_16BB(
																														x,
																														y) == null) {
																													if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_17BB(
																															z,
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
																																	if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_9B(
																																			v) == null) {
																																		if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_10BBBB(
																																				v,
																																				i,
																																				x,
																																				z) == null) {
																																			if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_11BBBB(
																																					v,
																																					i,
																																					x,
																																					z) == null) {
																																				if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_22BB(
																																						i,
																																						v) == null) {
																																					if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_23BB(
																																							x,
																																							v) == null) {
																																						if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_24BB(
																																								z,
																																								v) == null) {
																																							if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_25BB(
																																									i,
																																									v) == null) {
																																								if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_26BB(
																																										x,
																																										v) == null) {
																																									if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_27BB(
																																											z,
																																											v) == null) {
																																										_result.add(
																																												new Object[] {
																																														y,
																																														i,
																																														x,
																																														z,
																																														v,
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
			whilell2branchbb _this, Match match, Command y, Branch i, Branch x, Branch z, Command v) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, i, x, z, v);
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_0B(While c) {
		for (Decision __DEC_c_positive_734976 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_998068 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_862048 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_862048)) {
							if (!w.equals(__DEC_c_first_862048)) {
								if (!a.equals(__DEC_c_first_862048)) {
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_144335 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_144335)) {
							if (!w.equals(__DEC_c_last_144335)) {
								if (!a.equals(__DEC_c_last_144335)) {
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_4B(While c) {
		for (Program __DEC_c_first_103362 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_5B(Assignment d) {
		for (Decision __DEC_d_positive_37261 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_6B(Assignment d) {
		for (Decision __DEC_d_negative_400386 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_7BBBB(Assignment d,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_first_721521 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!c.equals(__DEC_d_first_721521)) {
							if (!w.equals(__DEC_d_first_721521)) {
								if (!a.equals(__DEC_d_first_721521)) {
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_8BBBB(Assignment d,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_last_249439 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!c.equals(__DEC_d_last_249439)) {
							if (!w.equals(__DEC_d_last_249439)) {
								if (!a.equals(__DEC_d_last_249439)) {
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_9B(Assignment d) {
		for (Program __DEC_d_first_325316 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_10B(While a) {
		for (Decision __DEC_a_positive_582251 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_11B(While a) {
		for (Decision __DEC_a_negative_697673 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_12BBB(While a, While c,
			While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_221430 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_221430)) {
							if (!c.equals(__DEC_a_last_221430)) {
								if (!w.equals(__DEC_a_last_221430)) {
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_13B(While a) {
		for (Program __DEC_a_first_769401 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_14B(Assignment b) {
		for (Decision __DEC_b_positive_228200 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_15B(Assignment b) {
		for (Decision __DEC_b_negative_902544 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_16BBBB(Assignment b,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_first_424187 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "first")) {
						if (!c.equals(__DEC_b_first_424187)) {
							if (!w.equals(__DEC_b_first_424187)) {
								if (!a.equals(__DEC_b_first_424187)) {
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_17BBBB(Assignment b,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_last_673299 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!c.equals(__DEC_b_last_673299)) {
							if (!w.equals(__DEC_b_last_673299)) {
								if (!a.equals(__DEC_b_last_673299)) {
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_18B(Assignment b) {
		for (Program __DEC_b_first_466327 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_19BB(While c,
			Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_20BB(While w,
			Assignment d) {
		if (d.equals(w.getFirst())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_21BB(While a,
			Assignment d) {
		if (d.equals(a.getFirst())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_22BB(While w,
			Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_23BB(While a,
			Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_24BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_25BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_26BB(While c,
			Assignment b) {
		if (b.equals(c.getFirst())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_27BB(While w,
			Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_28BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_29BB(While c,
			Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_30BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_next.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpC = _edge_next.getTrg();
			if (tmpC instanceof While) {
				While c = (While) tmpC;
				if (!c.equals(w)) {
					if (c.equals(w.getNext())) {
						Statement tmpA = w.getFirst();
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (!a.equals(c)) {
								if (!a.equals(w)) {
									Statement tmpD = c.getLast();
									if (tmpD instanceof Assignment) {
										Assignment d = (Assignment) tmpD;
										Statement tmpB = a.getLast();
										if (tmpB instanceof Assignment) {
											Assignment b = (Assignment) tmpB;
											if (!b.equals(d)) {
												if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_0B(
														c) == null) {
													if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_1B(
															c) == null) {
														if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_4B(
																c) == null) {
															if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(
																	c, w, a) == null) {
																if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(
																		c, w, a) == null) {
																	if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_10B(
																			a) == null) {
																		if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_11B(
																				a) == null) {
																			if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_12BBB(
																					a, c, w) == null) {
																				if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_13B(
																						a) == null) {
																					if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_24BB(
																							c, a) == null) {
																						if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_25BB(
																								w, a) == null) {
																							if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_5B(
																									d) == null) {
																								if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_6B(
																										d) == null) {
																									if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_7BBBB(
																											d, c, w,
																											a) == null) {
																										if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_8BBBB(
																												d, c, w,
																												a) == null) {
																											if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_9B(
																													d) == null) {
																												if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																														c,
																														d) == null) {
																													if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_20BB(
																															w,
																															d) == null) {
																														if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																																a,
																																d) == null) {
																															if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_22BB(
																																	w,
																																	d) == null) {
																																if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_23BB(
																																		a,
																																		d) == null) {
																																	if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_14B(
																																			b) == null) {
																																		if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_15B(
																																				b) == null) {
																																			if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_16BBBB(
																																					b,
																																					c,
																																					w,
																																					a) == null) {
																																				if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_17BBBB(
																																						b,
																																						c,
																																						w,
																																						a) == null) {
																																					if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_18B(
																																							b) == null) {
																																						if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_26BB(
																																								c,
																																								b) == null) {
																																							if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_27BB(
																																									w,
																																									b) == null) {
																																								if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_28BB(
																																										a,
																																										b) == null) {
																																									if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_29BB(
																																											c,
																																											b) == null) {
																																										if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_30BB(
																																												w,
																																												b) == null) {
																																											_result.add(
																																													new Object[] {
																																															c,
																																															w,
																																															d,
																																															a,
																																															b,
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
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			whilell2branchbb _this, Match match, While c, While w, Assignment d, While a, Assignment b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, c, w, d, a, b);
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

	public static final Object[] pattern_whilell2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("c");
		EObject _localVariable_1 = sourceMatch.getObject("w");
		EObject _localVariable_2 = sourceMatch.getObject("d");
		EObject _localVariable_3 = targetMatch.getObject("y");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = targetMatch.getObject("i");
		EObject _localVariable_6 = sourceMatch.getObject("b");
		EObject _localVariable_7 = targetMatch.getObject("x");
		EObject _localVariable_8 = targetMatch.getObject("z");
		EObject _localVariable_9 = targetMatch.getObject("v");
		EObject tmpC = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpI = _localVariable_5;
		EObject tmpB = _localVariable_6;
		EObject tmpX = _localVariable_7;
		EObject tmpZ = _localVariable_8;
		EObject tmpV = _localVariable_9;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpD instanceof Assignment) {
					Assignment d = (Assignment) tmpD;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								if (tmpB instanceof Assignment) {
									Assignment b = (Assignment) tmpB;
									if (tmpX instanceof Branch) {
										Branch x = (Branch) tmpX;
										if (tmpZ instanceof Branch) {
											Branch z = (Branch) tmpZ;
											if (tmpV instanceof Command) {
												Command v = (Command) tmpV;
												return new Object[] { c, w, d, y, a, i, b, x, z, v, sourceMatch,
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
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(While c, While w,
			Assignment d, Command y, While a, Branch i, Assignment b, Branch x, Branch z, Command v, Match sourceMatch,
			Match targetMatch) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!i.equals(x)) {
						if (!i.equals(z)) {
							if (!b.equals(d)) {
								if (!x.equals(z)) {
									if (!v.equals(y)) {
										if (!sourceMatch.equals(targetMatch)) {
											return new Object[] { c, w, d, y, a, i, b, x, z, v, sourceMatch,
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
				sourceMatch, targetMatch);
		if (result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding != null) {
			While c = (While) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[0];
			While w = (While) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[1];
			Assignment d = (Assignment) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[2];
			Command y = (Command) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[3];
			While a = (While) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[4];
			Branch i = (Branch) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[5];
			Assignment b = (Assignment) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[6];
			Branch x = (Branch) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[7];
			Branch z = (Branch) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[8];
			Command v = (Command) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_black = pattern_whilell2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					c, w, d, y, a, i, b, x, z, v, sourceMatch, targetMatch);
			if (result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { c, w, d, y, a, i, b, x, z, v, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(whilell2branchbb _this,
			While c, While w, Assignment d, Command y, While a, Branch i, Assignment b, Branch x, Branch z, Command v,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(c, w, d, y, a, i, b, x, z, v, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, c, w, d, y, a, i, b, x, z, v, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			whilell2branchbb _this, While c, While w, Assignment d, Command y, While a, Branch i, Assignment b,
			Branch x, Branch z, Command v, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilell2branchbb_24_3_solvecsp_binding = pattern_whilell2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, c, w, d, y, a, i, b, x, z, v, sourceMatch, targetMatch);
		if (result_pattern_whilell2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whilell2branchbb_24_3_solvecsp_black = pattern_whilell2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whilell2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, c, w, d, y, a, i, b, x, z, v, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whilell2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_24_5_matchcorrcontext_blackBFBBB(While w, Branch i,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				if (w.equals(w2i.getSource())) {
					_result.add(new Object[] { w, w2i, i, sourceMatch, targetMatch });
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

	public static final Object[] pattern_whilell2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(While c, While w,
			Assignment d, Command y, While a, Branch i, Assignment b, Branch x, Branch z, Command v, CCMatch ccMatch) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!i.equals(x)) {
						if (!i.equals(z)) {
							if (!b.equals(d)) {
								if (!x.equals(z)) {
									if (!v.equals(y)) {
										return new Object[] { c, w, d, y, a, i, b, x, z, v, ccMatch };
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

	public static final Object[] pattern_whilell2branchbb_24_6_createcorrespondence_greenBBFFFBBBBBBFB(While c,
			Assignment d, Command y, While a, Assignment b, Branch x, Branch z, Command v, CCMatch ccMatch) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		d2v.setSource(d);
		d2v.setTarget(v);
		ccMatch.getCreateCorr().add(d2v);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { c, d, c2z, b2y, d2v, y, a, b, x, z, v, a2x, ccMatch };
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_0B(While c) {
		for (Decision __DEC_c_positive_763188 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_379035 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_2BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_524268 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_524268)) {
							if (!w.equals(__DEC_c_first_524268)) {
								if (!a.equals(__DEC_c_first_524268)) {
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_3BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_974595 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_974595)) {
							if (!w.equals(__DEC_c_last_974595)) {
								if (!a.equals(__DEC_c_last_974595)) {
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_4B(While c) {
		for (Program __DEC_c_first_816290 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_5B(Assignment d) {
		for (Decision __DEC_d_positive_590653 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_6B(Assignment d) {
		for (Decision __DEC_d_negative_938187 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_7BBBB(Assignment d, While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_first_317759 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!c.equals(__DEC_d_first_317759)) {
							if (!w.equals(__DEC_d_first_317759)) {
								if (!a.equals(__DEC_d_first_317759)) {
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_8BBBB(Assignment d, While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_last_425208 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!c.equals(__DEC_d_last_425208)) {
							if (!w.equals(__DEC_d_last_425208)) {
								if (!a.equals(__DEC_d_last_425208)) {
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_9B(Assignment d) {
		for (Program __DEC_d_first_500468 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_10B(While a) {
		for (Decision __DEC_a_positive_355717 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_11B(While a) {
		for (Decision __DEC_a_negative_672366 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_12BBB(While a, While c,
			While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_974987 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_974987)) {
							if (!c.equals(__DEC_a_last_974987)) {
								if (!w.equals(__DEC_a_last_974987)) {
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_13B(While a) {
		for (Program __DEC_a_first_603745 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_14B(Assignment b) {
		for (Decision __DEC_b_positive_642602 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_15B(Assignment b) {
		for (Decision __DEC_b_negative_616129 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_16BBBB(Assignment b, While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_first_510452 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "first")) {
						if (!c.equals(__DEC_b_first_510452)) {
							if (!w.equals(__DEC_b_first_510452)) {
								if (!a.equals(__DEC_b_first_510452)) {
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_17BBBB(Assignment b, While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_last_287681 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!c.equals(__DEC_b_last_287681)) {
							if (!w.equals(__DEC_b_last_287681)) {
								if (!a.equals(__DEC_b_last_287681)) {
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_18B(Assignment b) {
		for (Program __DEC_b_first_995101 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_19BB(While c, Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_20BB(While w, Assignment d) {
		if (d.equals(w.getFirst())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_21BB(While a, Assignment d) {
		if (d.equals(a.getFirst())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_22BB(While w, Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_23BB(While a, Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_24BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_25BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_26BB(While c, Assignment b) {
		if (b.equals(c.getFirst())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_27BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_28BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_29BB(While c, Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_30BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_blackBBBBB(While c, While w,
			Assignment d, While a, Assignment b) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						if (c.equals(w.getNext())) {
							if (b.equals(a.getLast())) {
								if (d.equals(c.getLast())) {
									if (a.equals(w.getFirst())) {
										if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_0B(c) == null) {
											if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_1B(c) == null) {
												if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_2BBB(c, w,
														a) == null) {
													if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_3BBB(c,
															w, a) == null) {
														if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_4B(
																c) == null) {
															if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_5B(
																	d) == null) {
																if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_6B(
																		d) == null) {
																	if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_7BBBB(
																			d, c, w, a) == null) {
																		if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_8BBBB(
																				d, c, w, a) == null) {
																			if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_9B(
																					d) == null) {
																				if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_10B(
																						a) == null) {
																					if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_11B(
																							a) == null) {
																						if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_12BBB(
																								a, c, w) == null) {
																							if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_13B(
																									a) == null) {
																								if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_14B(
																										b) == null) {
																									if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_15B(
																											b) == null) {
																										if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_16BBBB(
																												b, c, w,
																												a) == null) {
																											if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_17BBBB(
																													b,
																													c,
																													w,
																													a) == null) {
																												if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_18B(
																														b) == null) {
																													if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_19BB(
																															c,
																															d) == null) {
																														if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_20BB(
																																w,
																																d) == null) {
																															if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_21BB(
																																	a,
																																	d) == null) {
																																if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_22BB(
																																		w,
																																		d) == null) {
																																	if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_23BB(
																																			a,
																																			d) == null) {
																																		if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_24BB(
																																				c,
																																				a) == null) {
																																			if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_25BB(
																																					w,
																																					a) == null) {
																																				if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_26BB(
																																						c,
																																						b) == null) {
																																					if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_27BB(
																																							w,
																																							b) == null) {
																																						if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_28BB(
																																								a,
																																								b) == null) {
																																							if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_29BB(
																																									c,
																																									b) == null) {
																																								if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_30BB(
																																										w,
																																										b) == null) {
																																									return new Object[] {
																																											c,
																																											w,
																																											d,
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
													}
												}
											}
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

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_972538 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_1BBBB(Command y, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_983359 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!i.equals(__DEC_y_positive_983359)) {
							if (!x.equals(__DEC_y_positive_983359)) {
								if (!z.equals(__DEC_y_positive_983359)) {
									return new Object[] { y, i, x, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_2BBBB(Command y, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_686302 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!i.equals(__DEC_y_negative_686302)) {
							if (!x.equals(__DEC_y_negative_686302)) {
								if (!z.equals(__DEC_y_negative_686302)) {
									return new Object[] { y, i, x, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_905892 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_4BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_135768 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_135768)) {
							if (!i.equals(__DEC_x_positive_135768)) {
								if (!z.equals(__DEC_x_positive_135768)) {
									return new Object[] { x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_5BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_823656 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_823656)) {
							if (!i.equals(__DEC_x_negative_823656)) {
								if (!z.equals(__DEC_x_negative_823656)) {
									return new Object[] { x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_275872 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_7BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_629755 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_629755)) {
							if (!i.equals(__DEC_z_positive_629755)) {
								if (!x.equals(__DEC_z_positive_629755)) {
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

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_8BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_308494 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_308494)) {
							if (!i.equals(__DEC_z_negative_308494)) {
								if (!x.equals(__DEC_z_negative_308494)) {
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

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_9B(Command v) {
		for (Graph __DEC_v_root_399335 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_10BBBB(Command v, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_positive_559742 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!i.equals(__DEC_v_positive_559742)) {
							if (!x.equals(__DEC_v_positive_559742)) {
								if (!z.equals(__DEC_v_positive_559742)) {
									return new Object[] { v, i, x, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_11BBBB(Command v, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_negative_987448 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!i.equals(__DEC_v_negative_987448)) {
							if (!x.equals(__DEC_v_negative_987448)) {
								if (!z.equals(__DEC_v_negative_987448)) {
									return new Object[] { v, i, x, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_12BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_13BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_14BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_15BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_16BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_17BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_18BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_19BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_20BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_21BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_22BB(Branch i, Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_23BB(Branch x, Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_24BB(Branch z, Command v) {
		if (v.equals(z.getPositive())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_25BB(Branch i, Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_26BB(Branch x, Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_27BB(Branch z, Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_blackBBBBB(Command y, Branch i, Branch x,
			Branch z, Command v) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (!v.equals(y)) {
						if (x.equals(i.getPositive())) {
							if (x.equals(y.getNext())) {
								if (z.equals(i.getNegative())) {
									if (z.equals(v.getNext())) {
										if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_0B(y) == null) {
											if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_1BBBB(y, i, x,
													z) == null) {
												if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_2BBBB(y, i,
														x, z) == null) {
													if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_3B(
															x) == null) {
														if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_4BBB(
																x, i, z) == null) {
															if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_5BBB(
																	x, i, z) == null) {
																if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_6B(
																		z) == null) {
																	if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_7BBB(
																			z, i, x) == null) {
																		if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_8BBB(
																				z, i, x) == null) {
																			if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_9B(
																					v) == null) {
																				if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_10BBBB(
																						v, i, x, z) == null) {
																					if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_11BBBB(
																							v, i, x, z) == null) {
																						if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_12BB(
																								i, y) == null) {
																							if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_13BB(
																									x, y) == null) {
																								if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_14BB(
																										z, y) == null) {
																									if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_15BB(
																											i,
																											y) == null) {
																										if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_16BB(
																												x,
																												y) == null) {
																											if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_17BB(
																													z,
																													y) == null) {
																												if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_18BB(
																														i,
																														x) == null) {
																													if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_19BB(
																															i,
																															z) == null) {
																														if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_20BB(
																																x,
																																z) == null) {
																															if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_21BB(
																																	x,
																																	z) == null) {
																																if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_22BB(
																																		i,
																																		v) == null) {
																																	if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_23BB(
																																			x,
																																			v) == null) {
																																		if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_24BB(
																																				z,
																																				v) == null) {
																																			if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_25BB(
																																					i,
																																					v) == null) {
																																				if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_26BB(
																																						x,
																																						v) == null) {
																																					if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_27BB(
																																							z,
																																							v) == null) {
																																						return new Object[] {
																																								y,
																																								i,
																																								x,
																																								z,
																																								v };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
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
							if (pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										w) == null) {
									if (pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											i) == null) {
										_result.add(
												new Object[] { w2iList, w, w2i, i, ruleEntryContainer, ruleResult });
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
			IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w, w2i, i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, w2i, i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch i, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whilell2branchbb_29_3_solveCSP_binding = pattern_whilell2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w, w2i, i, ruleResult);
		if (result_pattern_whilell2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_29_3_solveCSP_black = pattern_whilell2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, w2i, i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whilell2branchbb_29_4_checkCSP_expressionFBB(whilell2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilell2branchbb_29_5_checknacs_blackBBB(While w, S2B w2i, Branch i) {
		return new Object[] { w, w2i, i };
	}

	public static final Object[] pattern_whilell2branchbb_29_6_perform_blackBBBB(While w, S2B w2i, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w, w2i, i, ruleResult };
	}

	public static final Object[] pattern_whilell2branchbb_29_6_perform_greenFBFFFFFFBFFFFFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		c.setLast(d);
		ruleResult.getSourceObjects().add(d);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		ruleResult.getCorrObjects().add(b2y);
		d2v.setSource(d);
		ruleResult.getCorrObjects().add(d2v);
		b2y.setTarget(y);
		ruleResult.getTargetObjects().add(y);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		a.setLast(b);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		i.setPositive(x);
		y.setNext(x);
		ruleResult.getTargetObjects().add(x);
		c2z.setTarget(z);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		d2v.setTarget(v);
		v.setNext(z);
		ruleResult.getTargetObjects().add(v);
		a2x.setSource(a);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c, w, d, c2z, b2y, d2v, y, a, i, b, x, z, v, a2x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whilell2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whilell2branchbbImpl
