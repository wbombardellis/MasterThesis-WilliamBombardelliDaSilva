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
	public boolean isAppropriate_FWD(Match match, While c, While w, Assignment b, While a, Assignment d) {

		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_0_1_initialbindings_blackBBBBBBB(this,
				match, c, w, b, a, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
					+ "[a] = " + a + ", " + "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, c, w, b, a, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
					+ "[a] = " + a + ", " + "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilell2branchbbImpl.pattern_whilell2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_0_4_collectelementstobetranslated_blackBBBBBB(match, c, w, b, a, d);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[c] = " + c + ", "
								+ "[w] = " + w + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(match, c, w,
					b, a, d);
			//nothing EMoflonEdge c__d____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[9];

			Object[] result5_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_0_5_collectcontextelements_blackBBBBBB(match, c, w, b, a, d);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[c] = " + c + ", "
								+ "[w] = " + w + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whilell2branchbbImpl.pattern_whilell2branchbb_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, c,
					w, b, a, d);
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
		Assignment b = (Assignment) result1_bindingAndBlack[2];
		While a = (While) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		Assignment d = (Assignment) result1_bindingAndBlack[5];
		Branch i = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_1_performtransformation_greenBFFFFFFBBFBBF(c, b, a, d, i);
		Branch x = (Branch) result1_green[1];
		Command y = (Command) result1_green[2];
		S2N d2v = (S2N) result1_green[3];
		S2N b2y = (S2N) result1_green[4];
		Command v = (Command) result1_green[5];
		S2B c2z = (S2B) result1_green[6];
		Branch z = (Branch) result1_green[9];
		S2B a2x = (S2B) result1_green[12];

		Object[] result2_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(c, x, y, d2v, b2y, v, c2z, b,
						a, z, d, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[x] = " + x
					+ ", " + "[y] = " + y + ", " + "[d2v] = " + d2v + ", " + "[b2y] = " + b2y + ", " + "[v] = " + v
					+ ", " + "[c2z] = " + c2z + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[z] = " + z + ", "
					+ "[d] = " + d + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(c, x, y, d2v, b2y, v, c2z, b,
						a, z, d, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, c, x, y, d2v, b2y,
						v, w, c2z, b, a, w2i, z, d, i, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[d2v] = " + d2v + ", "
					+ "[b2y] = " + b2y + ", " + "[v] = " + v + ", " + "[w] = " + w + ", " + "[c2z] = " + c2z + ", "
					+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[w2i] = " + w2i + ", " + "[z] = " + z + ", "
					+ "[d] = " + d + ", " + "[i] = " + i + ", " + "[a2x] = " + a2x + ".");
		}
		whilell2branchbbImpl.pattern_whilell2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, c, x, y, d2v, b2y, v, w, c2z, b, a, z, d, i, a2x);
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[30];

		// 
		// 
		whilell2branchbbImpl.pattern_whilell2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				c, x, y, d2v, b2y, v, w, c2z, b, a, w2i, z, d, i, a2x);
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
		Assignment b = (Assignment) result2_binding[2];
		While a = (While) result2_binding[3];
		Assignment d = (Assignment) result2_binding[4];
		for (Object[] result2_black : whilell2branchbbImpl.pattern_whilell2branchbb_2_2_corematch_blackBBBBFBFB(c, w, b,
				a, d, match)) {
			S2B w2i = (S2B) result2_black[4];
			Branch i = (Branch) result2_black[6];
			// ForEach 
			for (Object[] result3_black : whilell2branchbbImpl.pattern_whilell2branchbb_2_3_findcontext_blackBBBBBBB(c,
					w, b, a, w2i, d, i)) {
				Object[] result3_green = whilell2branchbbImpl
						.pattern_whilell2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(c, w, b, a, w2i, d, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = whilell2branchbbImpl
						.pattern_whilell2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, c, w,
								b, a, w2i, d, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[w] = " + w
							+ ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[w2i] = " + w2i + ", " + "[d] = " + d
							+ ", " + "[i] = " + i + ".");
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
	public void registerObjectsToMatch_FWD(Match match, While c, While w, Assignment b, While a, Assignment d) {
		match.registerObject("c", c);
		match.registerObject("w", w);
		match.registerObject("b", b);
		match.registerObject("a", a);
		match.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While c, While w, Assignment b, While a, Assignment d) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While c, While w, Assignment b, While a,
			S2B w2i, Assignment d, Branch i) {// Create CSP
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
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("i", i);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c, EObject x, EObject y, EObject d2v,
			EObject b2y, EObject v, EObject w, EObject c2z, EObject b, EObject a, EObject w2i, EObject z, EObject d,
			EObject i, EObject a2x) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("a2x", a2x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch x, Command y, Command v, Branch z, Branch i) {

		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_10_1_initialbindings_blackBBBBBBB(this,
				match, x, y, v, z, i);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[v] = " + v + ", "
					+ "[z] = " + z + ", " + "[i] = " + i + ".");
		}

		Object[] result2_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, x, y, v, z, i);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[v] = " + v + ", "
					+ "[z] = " + z + ", " + "[i] = " + i + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilell2branchbbImpl.pattern_whilell2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_10_4_collectelementstobetranslated_blackBBBBBB(match, x, y, v, z, i);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[x] = " + x + ", "
								+ "[y] = " + y + ", " + "[v] = " + v + ", " + "[z] = " + z + ", " + "[i] = " + i + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(match, x,
					y, v, z, i);
			//nothing EMoflonEdge v__z____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[9];

			Object[] result5_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_10_5_collectcontextelements_blackBBBBBB(match, x, y, v, z, i);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[x] = " + x + ", "
								+ "[y] = " + y + ", " + "[v] = " + v + ", " + "[z] = " + z + ", " + "[i] = " + i + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whilell2branchbbImpl.pattern_whilell2branchbb_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, x,
					y, v, z, i);
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
		Branch x = (Branch) result1_bindingAndBlack[0];
		Command y = (Command) result1_bindingAndBlack[1];
		Command v = (Command) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		Branch z = (Branch) result1_bindingAndBlack[5];
		Branch i = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_1_performtransformation_greenFBBFFBBFFFBFF(x, y, v, w, z);
		While c = (While) result1_green[0];
		S2N d2v = (S2N) result1_green[3];
		S2N b2y = (S2N) result1_green[4];
		S2B c2z = (S2B) result1_green[7];
		Assignment b = (Assignment) result1_green[8];
		While a = (While) result1_green[9];
		Assignment d = (Assignment) result1_green[11];
		S2B a2x = (S2B) result1_green[12];

		Object[] result2_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(c, x, y, d2v, b2y, v, c2z, b,
						a, z, d, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[x] = " + x
					+ ", " + "[y] = " + y + ", " + "[d2v] = " + d2v + ", " + "[b2y] = " + b2y + ", " + "[v] = " + v
					+ ", " + "[c2z] = " + c2z + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[z] = " + z + ", "
					+ "[d] = " + d + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(c, x, y, d2v, b2y, v, c2z,
						b, a, z, d, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, c, x, y, d2v, b2y,
						v, w, c2z, b, a, w2i, z, d, i, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[d2v] = " + d2v + ", "
					+ "[b2y] = " + b2y + ", " + "[v] = " + v + ", " + "[w] = " + w + ", " + "[c2z] = " + c2z + ", "
					+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[w2i] = " + w2i + ", " + "[z] = " + z + ", "
					+ "[d] = " + d + ", " + "[i] = " + i + ", " + "[a2x] = " + a2x + ".");
		}
		whilell2branchbbImpl.pattern_whilell2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, c, x, y, d2v, b2y, v, w, c2z, b, a, z, d, i, a2x);
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[30];

		// 
		// 
		whilell2branchbbImpl.pattern_whilell2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				c, x, y, d2v, b2y, v, w, c2z, b, a, w2i, z, d, i, a2x);
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
		Branch x = (Branch) result2_binding[0];
		Command y = (Command) result2_binding[1];
		Command v = (Command) result2_binding[2];
		Branch z = (Branch) result2_binding[3];
		Branch i = (Branch) result2_binding[4];
		for (Object[] result2_black : whilell2branchbbImpl.pattern_whilell2branchbb_12_2_corematch_blackBBBFFBBB(x, y,
				v, z, i, match)) {
			While w = (While) result2_black[3];
			S2B w2i = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whilell2branchbbImpl.pattern_whilell2branchbb_12_3_findcontext_blackBBBBBBB(x,
					y, v, w, w2i, z, i)) {
				Object[] result3_green = whilell2branchbbImpl
						.pattern_whilell2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(x, y, v, w, w2i, z, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = whilell2branchbbImpl
						.pattern_whilell2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, x, y,
								v, w, w2i, z, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[x] = " + x + ", " + "[y] = " + y
							+ ", " + "[v] = " + v + ", " + "[w] = " + w + ", " + "[w2i] = " + w2i + ", " + "[z] = " + z
							+ ", " + "[i] = " + i + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch x, Command y, Command v, Branch z, Branch i) {
		match.registerObject("x", x);
		match.registerObject("y", y);
		match.registerObject("v", v);
		match.registerObject("z", z);
		match.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch x, Command y, Command v, Branch z, Branch i) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch x, Command y, Command v, While w,
			S2B w2i, Branch z, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("v", v);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("i", i);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c, EObject x, EObject y, EObject d2v,
			EObject b2y, EObject v, EObject w, EObject c2z, EObject b, EObject a, EObject w2i, EObject z, EObject d,
			EObject i, EObject a2x) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("a2x", a2x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("v").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_37(EMoflonEdge _edge_next) {

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
				.pattern_whilell2branchbb_20_2_testcorematchandDECs_blackFFFFFB(_edge_next)) {
			Branch x = (Branch) result2_black[0];
			Command y = (Command) result2_black[1];
			Command v = (Command) result2_black[2];
			Branch z = (Branch) result2_black[3];
			Branch i = (Branch) result2_black[4];
			Object[] result2_green = whilell2branchbbImpl
					.pattern_whilell2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilell2branchbbImpl
					.pattern_whilell2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, x, y, v, z, i)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_37(EMoflonEdge _edge_last) {

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
				.pattern_whilell2branchbb_21_2_testcorematchandDECs_blackFFFFFB(_edge_last)) {
			While c = (While) result2_black[0];
			While w = (While) result2_black[1];
			Assignment b = (Assignment) result2_black[2];
			While a = (While) result2_black[3];
			Assignment d = (Assignment) result2_black[4];
			Object[] result2_green = whilell2branchbbImpl
					.pattern_whilell2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilell2branchbbImpl
					.pattern_whilell2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, c, w, b, a, d)) {
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
		Branch x = (Branch) result2_bindingAndBlack[1];
		Command y = (Command) result2_bindingAndBlack[2];
		Command v = (Command) result2_bindingAndBlack[3];
		While w = (While) result2_bindingAndBlack[4];
		Assignment b = (Assignment) result2_bindingAndBlack[5];
		While a = (While) result2_bindingAndBlack[6];
		Branch z = (Branch) result2_bindingAndBlack[7];
		Assignment d = (Assignment) result2_bindingAndBlack[8];
		Branch i = (Branch) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, c, x, y, v, w, b, a, z, d,
						i, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[c] = " + c + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[v] = " + v + ", " + "[w] = "
					+ w + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[d] = " + d + ", "
					+ "[i] = " + i + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
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
						.pattern_whilell2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(c, x, y, v, w, b, a, z, d,
								i, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
							+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[v] = " + v + ", " + "[w] = " + w + ", "
							+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[d] = " + d + ", "
							+ "[i] = " + i + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilell2branchbbImpl.pattern_whilell2branchbb_24_6_createcorrespondence_greenBBBFFBFBBBBFB(c, x, y, v,
						b, a, z, d, ccMatch);
				//nothing S2N d2v = (S2N) result6_green[3];
				//nothing S2N b2y = (S2N) result6_green[4];
				//nothing S2B c2z = (S2B) result6_green[6];
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
	public CSP isApplicable_solveCsp_CC(While c, Branch x, Command y, Command v, While w, Assignment b, While a,
			Branch z, Assignment d, Branch i, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While c, While w, Assignment b, While a, Assignment d) {// 
		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_27_1_matchtggpattern_blackBBBBB(c, w, b,
				a, d);
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
	public boolean checkDEC_BWD(Branch x, Command y, Command v, Branch z, Branch i) {// 
		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_28_1_matchtggpattern_blackBBBBB(x, y, v,
				z, i);
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
					whilell2branchbbImpl.pattern_whilell2branchbb_29_6_perform_greenFFFFFFBFFFFFBFB(w, i, ruleResult);
					//nothing While c = (While) result6_green[0];
					//nothing Branch x = (Branch) result6_green[1];
					//nothing Command y = (Command) result6_green[2];
					//nothing S2N d2v = (S2N) result6_green[3];
					//nothing S2N b2y = (S2N) result6_green[4];
					//nothing Command v = (Command) result6_green[5];
					//nothing S2B c2z = (S2B) result6_green[7];
					//nothing Assignment b = (Assignment) result6_green[8];
					//nothing While a = (While) result6_green[9];
					//nothing Branch z = (Branch) result6_green[10];
					//nothing Assignment d = (Assignment) result6_green[11];
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
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_WHILE_ASSIGNMENT_WHILE_S2B_ASSIGNMENT_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(S2B) arguments.get(5), (Assignment) arguments.get(6), (Branch) arguments.get(7));
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
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_COMMAND_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_COMMAND_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_COMMAND_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_COMMAND_COMMAND_WHILE_S2B_BRANCH_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Command) arguments.get(3), (While) arguments.get(4),
					(S2B) arguments.get(5), (Branch) arguments.get(6), (Branch) arguments.get(7));
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
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_37((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_37((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_BRANCH_COMMAND_COMMAND_WHILE_ASSIGNMENT_WHILE_BRANCH_ASSIGNMENT_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Command) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5), (While) arguments.get(6), (Branch) arguments.get(7),
					(Assignment) arguments.get(8), (Branch) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_DEC_FWD__WHILE_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			return checkDEC_FWD((While) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_DEC_BWD__BRANCH_COMMAND_COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
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
			Match match, While c, While w, Assignment b, While a, Assignment d) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						return new Object[] { _this, match, c, w, b, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_0_2_SolveCSP_bindingFBBBBBBB(whilell2branchbb _this,
			Match match, While c, While w, Assignment b, While a, Assignment d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, c, w, b, a, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, w, b, a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(whilell2branchbb _this,
			Match match, While c, While w, Assignment b, While a, Assignment d) {
		Object[] result_pattern_whilell2branchbb_0_2_SolveCSP_binding = pattern_whilell2branchbb_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, c, w, b, a, d);
		if (result_pattern_whilell2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_0_2_SolveCSP_black = pattern_whilell2branchbb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, w, b, a, d };
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
			While c, While w, Assignment b, While a, Assignment d) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						return new Object[] { match, c, w, b, a, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(Match match,
			While c, While w, Assignment b, While a, Assignment d) {
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(d);
		String c__d____last_name_prime = "last";
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____last);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		c__d____last.setName(c__d____last_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { match, c, w, b, a, d, c__d____last, w__c____next, w__a____first, a__b____last };
	}

	public static final Object[] pattern_whilell2branchbb_0_5_collectcontextelements_blackBBBBBB(Match match, While c,
			While w, Assignment b, While a, Assignment d) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						return new Object[] { match, c, w, b, a, d };
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
			whilell2branchbb _this, Match match, While c, While w, Assignment b, While a, Assignment d) {
		_this.registerObjectsToMatch_FWD(match, c, w, b, a, d);

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
		EObject _localVariable_2 = isApplicableMatch.getObject("b");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject _localVariable_6 = isApplicableMatch.getObject("i");
		EObject tmpC = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		EObject tmpD = _localVariable_5;
		EObject tmpI = _localVariable_6;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							if (tmpD instanceof Assignment) {
								Assignment d = (Assignment) tmpD;
								if (tmpI instanceof Branch) {
									Branch i = (Branch) tmpI;
									return new Object[] { c, w, b, a, w2i, d, i, isApplicableMatch };
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
			Assignment b, While a, S2B w2i, Assignment d, Branch i, whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { c, w, b, a, w2i, d, i, csp, _this, isApplicableMatch };
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
			Assignment b = (Assignment) result_pattern_whilell2branchbb_1_1_performtransformation_binding[2];
			While a = (While) result_pattern_whilell2branchbb_1_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whilell2branchbb_1_1_performtransformation_binding[4];
			Assignment d = (Assignment) result_pattern_whilell2branchbb_1_1_performtransformation_binding[5];
			Branch i = (Branch) result_pattern_whilell2branchbb_1_1_performtransformation_binding[6];

			Object[] result_pattern_whilell2branchbb_1_1_performtransformation_black = pattern_whilell2branchbb_1_1_performtransformation_blackBBBBBBBFBB(
					c, w, b, a, w2i, d, i, _this, isApplicableMatch);
			if (result_pattern_whilell2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilell2branchbb_1_1_performtransformation_black[7];

				return new Object[] { c, w, b, a, w2i, d, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_1_1_performtransformation_greenBFFFFFFBBFBBF(While c,
			Assignment b, While a, Assignment d, Branch i) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		i.setPositive(x);
		y.setNext(x);
		d2v.setSource(d);
		b2y.setTarget(y);
		b2y.setSource(b);
		d2v.setTarget(v);
		c2z.setSource(c);
		v.setNext(z);
		c2z.setTarget(z);
		i.setNegative(z);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { c, x, y, d2v, b2y, v, c2z, b, a, z, d, i, a2x };
	}

	public static final Object[] pattern_whilell2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(While c,
			Branch x, Command y, S2N d2v, S2N b2y, Command v, S2B c2z, Assignment b, While a, Branch z, Assignment d,
			S2B a2x) {
		if (!x.equals(z)) {
			if (!b2y.equals(d2v)) {
				if (!v.equals(y)) {
					if (!b.equals(d)) {
						if (!a.equals(c)) {
							if (!a2x.equals(c2z)) {
								return new Object[] { c, x, y, d2v, b2y, v, c2z, b, a, z, d, a2x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(While c,
			Branch x, Command y, S2N d2v, S2N b2y, Command v, S2B c2z, Assignment b, While a, Branch z, Assignment d,
			S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, c, x, y, d2v, b2y, v, c2z, b, a, z, d, a2x };
	}

	public static final Object[] pattern_whilell2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject x, EObject y, EObject d2v, EObject b2y, EObject v,
			EObject w, EObject c2z, EObject b, EObject a, EObject w2i, EObject z, EObject d, EObject i, EObject a2x) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!c.equals(d2v)) {
					if (!c.equals(v)) {
						if (!c.equals(w)) {
							if (!c.equals(c2z)) {
								if (!c.equals(w2i)) {
									if (!c.equals(z)) {
										if (!c.equals(d)) {
											if (!c.equals(i)) {
												if (!x.equals(y)) {
													if (!x.equals(z)) {
														if (!y.equals(z)) {
															if (!d2v.equals(x)) {
																if (!d2v.equals(y)) {
																	if (!d2v.equals(v)) {
																		if (!d2v.equals(w)) {
																			if (!d2v.equals(w2i)) {
																				if (!d2v.equals(z)) {
																					if (!d2v.equals(i)) {
																						if (!b2y.equals(c)) {
																							if (!b2y.equals(x)) {
																								if (!b2y.equals(y)) {
																									if (!b2y.equals(
																											d2v)) {
																										if (!b2y.equals(
																												v)) {
																											if (!b2y.equals(
																													w)) {
																												if (!b2y.equals(
																														c2z)) {
																													if (!b2y.equals(
																															w2i)) {
																														if (!b2y.equals(
																																z)) {
																															if (!b2y.equals(
																																	d)) {
																																if (!b2y.equals(
																																		i)) {
																																	if (!v.equals(
																																			x)) {
																																		if (!v.equals(
																																				y)) {
																																			if (!v.equals(
																																					w)) {
																																				if (!v.equals(
																																						w2i)) {
																																					if (!v.equals(
																																							z)) {
																																						if (!w.equals(
																																								x)) {
																																							if (!w.equals(
																																									y)) {
																																								if (!w.equals(
																																										w2i)) {
																																									if (!w.equals(
																																											z)) {
																																										if (!c2z.equals(
																																												x)) {
																																											if (!c2z.equals(
																																													y)) {
																																												if (!c2z.equals(
																																														d2v)) {
																																													if (!c2z.equals(
																																															v)) {
																																														if (!c2z.equals(
																																																w)) {
																																															if (!c2z.equals(
																																																	w2i)) {
																																																if (!c2z.equals(
																																																		z)) {
																																																	if (!c2z.equals(
																																																			d)) {
																																																		if (!c2z.equals(
																																																				i)) {
																																																			if (!b.equals(
																																																					c)) {
																																																				if (!b.equals(
																																																						x)) {
																																																					if (!b.equals(
																																																							y)) {
																																																						if (!b.equals(
																																																								d2v)) {
																																																							if (!b.equals(
																																																									b2y)) {
																																																								if (!b.equals(
																																																										v)) {
																																																									if (!b.equals(
																																																											w)) {
																																																										if (!b.equals(
																																																												c2z)) {
																																																											if (!b.equals(
																																																													w2i)) {
																																																												if (!b.equals(
																																																														z)) {
																																																													if (!b.equals(
																																																															d)) {
																																																														if (!b.equals(
																																																																i)) {
																																																															if (!a.equals(
																																																																	c)) {
																																																																if (!a.equals(
																																																																		x)) {
																																																																	if (!a.equals(
																																																																			y)) {
																																																																		if (!a.equals(
																																																																				d2v)) {
																																																																			if (!a.equals(
																																																																					b2y)) {
																																																																				if (!a.equals(
																																																																						v)) {
																																																																					if (!a.equals(
																																																																							w)) {
																																																																						if (!a.equals(
																																																																								c2z)) {
																																																																							if (!a.equals(
																																																																									b)) {
																																																																								if (!a.equals(
																																																																										w2i)) {
																																																																									if (!a.equals(
																																																																											z)) {
																																																																										if (!a.equals(
																																																																												d)) {
																																																																											if (!a.equals(
																																																																													i)) {
																																																																												if (!a.equals(
																																																																														a2x)) {
																																																																													if (!w2i.equals(
																																																																															x)) {
																																																																														if (!w2i.equals(
																																																																																y)) {
																																																																															if (!w2i.equals(
																																																																																	z)) {
																																																																																if (!d.equals(
																																																																																		x)) {
																																																																																	if (!d.equals(
																																																																																			y)) {
																																																																																		if (!d.equals(
																																																																																				d2v)) {
																																																																																			if (!d.equals(
																																																																																					v)) {
																																																																																				if (!d.equals(
																																																																																						w)) {
																																																																																					if (!d.equals(
																																																																																							w2i)) {
																																																																																						if (!d.equals(
																																																																																								z)) {
																																																																																							if (!d.equals(
																																																																																									i)) {
																																																																																								if (!i.equals(
																																																																																										x)) {
																																																																																									if (!i.equals(
																																																																																											y)) {
																																																																																										if (!i.equals(
																																																																																												v)) {
																																																																																											if (!i.equals(
																																																																																													w)) {
																																																																																												if (!i.equals(
																																																																																														w2i)) {
																																																																																													if (!i.equals(
																																																																																															z)) {
																																																																																														if (!a2x.equals(
																																																																																																c)) {
																																																																																															if (!a2x.equals(
																																																																																																	x)) {
																																																																																																if (!a2x.equals(
																																																																																																		y)) {
																																																																																																	if (!a2x.equals(
																																																																																																			d2v)) {
																																																																																																		if (!a2x.equals(
																																																																																																				b2y)) {
																																																																																																			if (!a2x.equals(
																																																																																																					v)) {
																																																																																																				if (!a2x.equals(
																																																																																																						w)) {
																																																																																																					if (!a2x.equals(
																																																																																																							c2z)) {
																																																																																																						if (!a2x.equals(
																																																																																																								b)) {
																																																																																																							if (!a2x.equals(
																																																																																																									w2i)) {
																																																																																																								if (!a2x.equals(
																																																																																																										z)) {
																																																																																																									if (!a2x.equals(
																																																																																																											d)) {
																																																																																																										if (!a2x.equals(
																																																																																																												i)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													c,
																																																																																																													x,
																																																																																																													y,
																																																																																																													d2v,
																																																																																																													b2y,
																																																																																																													v,
																																																																																																													w,
																																																																																																													c2z,
																																																																																																													b,
																																																																																																													a,
																																																																																																													w2i,
																																																																																																													z,
																																																																																																													d,
																																																																																																													i,
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
			PerformRuleResult ruleresult, EObject c, EObject x, EObject y, EObject d2v, EObject b2y, EObject v,
			EObject w, EObject c2z, EObject b, EObject a, EObject z, EObject d, EObject i, EObject a2x) {
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilell2branchbb";
		String b2y__y____target_name_prime = "target";
		String d2v__v____target_name_prime = "target";
		String v__z____next_name_prime = "next";
		String c__d____last_name_prime = "last";
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String b2y__b____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String d2v__d____source_name_prime = "source";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(v__z____next);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____last);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { ruleresult, c, x, y, d2v, b2y, v, w, c2z, b, a, z, d, i, a2x, b2y__y____target,
				d2v__v____target, v__z____next, c__d____last, w__c____next, w__a____first, b2y__b____source,
				a__b____last, d2v__d____source, c2z__c____source, c2z__z____target, i__z____negative, i__x____positive,
				a2x__x____target, a2x__a____source, y__x____next };
	}

	public static final void pattern_whilell2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whilell2branchbb _this, PerformRuleResult ruleresult, EObject c, EObject x, EObject y, EObject d2v,
			EObject b2y, EObject v, EObject w, EObject c2z, EObject b, EObject a, EObject w2i, EObject z, EObject d,
			EObject i, EObject a2x) {
		_this.registerObjects_FWD(ruleresult, c, x, y, d2v, b2y, v, w, c2z, b, a, w2i, z, d, i, a2x);

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
		EObject _localVariable_2 = match.getObject("b");
		EObject _localVariable_3 = match.getObject("a");
		EObject _localVariable_4 = match.getObject("d");
		EObject tmpC = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpD = _localVariable_4;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpD instanceof Assignment) {
							Assignment d = (Assignment) tmpD;
							return new Object[] { c, w, b, a, d, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_2_2_corematch_blackBBBBFBFB(While c, While w,
			Assignment b, While a, Assignment d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
								"source")) {
							Branch i = w2i.getTarget();
							if (i != null) {
								_result.add(new Object[] { c, w, b, a, w2i, d, i, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_2_3_findcontext_blackBBBBBBB(While c, While w,
			Assignment b, While a, S2B w2i, Assignment d, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						if (d.equals(c.getLast())) {
							if (c.equals(w.getNext())) {
								if (a.equals(w.getFirst())) {
									if (b.equals(a.getLast())) {
										if (w.equals(w2i.getSource())) {
											if (i.equals(w2i.getTarget())) {
												_result.add(new Object[] { c, w, b, a, w2i, d, i });
											}
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
			Assignment b, While a, S2B w2i, Assignment d, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__d____last_name_prime = "last";
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(i);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____last);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		c__d____last.setName(c__d____last_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { c, w, b, a, w2i, d, i, isApplicableMatch, c__d____last, w__c____next, w__a____first,
				a__b____last, w2i__w____source, w2i__i____target };
	}

	public static final Object[] pattern_whilell2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, While c, While w, Assignment b, While a, S2B w2i, Assignment d,
			Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, w, b, a, w2i, d, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, w, b, a, w2i, d, i };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, While c, While w, Assignment b, While a, S2B w2i, Assignment d,
			Branch i) {
		Object[] result_pattern_whilell2branchbb_2_4_solveCSP_binding = pattern_whilell2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, c, w, b, a, w2i, d, i);
		if (result_pattern_whilell2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_2_4_solveCSP_black = pattern_whilell2branchbb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, w, b, a, w2i, d, i };
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
			Match match, Branch x, Command y, Command v, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						return new Object[] { _this, match, x, y, v, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_10_2_SolveCSP_bindingFBBBBBBB(whilell2branchbb _this,
			Match match, Branch x, Command y, Command v, Branch z, Branch i) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, y, v, z, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, y, v, z, i };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(whilell2branchbb _this,
			Match match, Branch x, Command y, Command v, Branch z, Branch i) {
		Object[] result_pattern_whilell2branchbb_10_2_SolveCSP_binding = pattern_whilell2branchbb_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, x, y, v, z, i);
		if (result_pattern_whilell2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_10_2_SolveCSP_black = pattern_whilell2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, y, v, z, i };
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
			Branch x, Command y, Command v, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						return new Object[] { match, x, y, v, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(
			Match match, Branch x, Command y, Command v, Branch z, Branch i) {
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(v);
		match.getToBeTranslatedNodes().add(z);
		String v__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(v__z____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		v__z____next.setName(v__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { match, x, y, v, z, i, v__z____next, i__z____negative, i__x____positive, y__x____next };
	}

	public static final Object[] pattern_whilell2branchbb_10_5_collectcontextelements_blackBBBBBB(Match match, Branch x,
			Command y, Command v, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						return new Object[] { match, x, y, v, z, i };
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
			whilell2branchbb _this, Match match, Branch x, Command y, Command v, Branch z, Branch i) {
		_this.registerObjectsToMatch_BWD(match, x, y, v, z, i);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("x");
		EObject _localVariable_1 = isApplicableMatch.getObject("y");
		EObject _localVariable_2 = isApplicableMatch.getObject("v");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_5 = isApplicableMatch.getObject("z");
		EObject _localVariable_6 = isApplicableMatch.getObject("i");
		EObject tmpX = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpV = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		EObject tmpI = _localVariable_6;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpV instanceof Command) {
					Command v = (Command) tmpV;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							if (tmpZ instanceof Branch) {
								Branch z = (Branch) tmpZ;
								if (tmpI instanceof Branch) {
									Branch i = (Branch) tmpI;
									return new Object[] { x, y, v, w, w2i, z, i, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_11_1_performtransformation_blackBBBBBBBFBB(Branch x,
			Command y, Command v, While w, S2B w2i, Branch z, Branch i, whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { x, y, v, w, w2i, z, i, csp, _this, isApplicableMatch };
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
			Branch x = (Branch) result_pattern_whilell2branchbb_11_1_performtransformation_binding[0];
			Command y = (Command) result_pattern_whilell2branchbb_11_1_performtransformation_binding[1];
			Command v = (Command) result_pattern_whilell2branchbb_11_1_performtransformation_binding[2];
			While w = (While) result_pattern_whilell2branchbb_11_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whilell2branchbb_11_1_performtransformation_binding[4];
			Branch z = (Branch) result_pattern_whilell2branchbb_11_1_performtransformation_binding[5];
			Branch i = (Branch) result_pattern_whilell2branchbb_11_1_performtransformation_binding[6];

			Object[] result_pattern_whilell2branchbb_11_1_performtransformation_black = pattern_whilell2branchbb_11_1_performtransformation_blackBBBBBBBFBB(
					x, y, v, w, w2i, z, i, _this, isApplicableMatch);
			if (result_pattern_whilell2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilell2branchbb_11_1_performtransformation_black[7];

				return new Object[] { x, y, v, w, w2i, z, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_11_1_performtransformation_greenFBBFFBBFFFBFF(Branch x,
			Command y, Command v, While w, Branch z) {
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		w.setNext(c);
		d2v.setTarget(v);
		b2y.setTarget(y);
		c2z.setSource(c);
		c2z.setTarget(z);
		b2y.setSource(b);
		w.setFirst(a);
		a.setLast(b);
		c.setLast(d);
		d2v.setSource(d);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { c, x, y, d2v, b2y, v, w, c2z, b, a, z, d, a2x };
	}

	public static final Object[] pattern_whilell2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(While c,
			Branch x, Command y, S2N d2v, S2N b2y, Command v, S2B c2z, Assignment b, While a, Branch z, Assignment d,
			S2B a2x) {
		if (!x.equals(z)) {
			if (!b2y.equals(d2v)) {
				if (!v.equals(y)) {
					if (!b.equals(d)) {
						if (!a.equals(c)) {
							if (!a2x.equals(c2z)) {
								return new Object[] { c, x, y, d2v, b2y, v, c2z, b, a, z, d, a2x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(While c,
			Branch x, Command y, S2N d2v, S2N b2y, Command v, S2B c2z, Assignment b, While a, Branch z, Assignment d,
			S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(c);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, c, x, y, d2v, b2y, v, c2z, b, a, z, d, a2x };
	}

	public static final Object[] pattern_whilell2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject x, EObject y, EObject d2v, EObject b2y, EObject v,
			EObject w, EObject c2z, EObject b, EObject a, EObject w2i, EObject z, EObject d, EObject i, EObject a2x) {
		if (!c.equals(x)) {
			if (!c.equals(y)) {
				if (!c.equals(d2v)) {
					if (!c.equals(v)) {
						if (!c.equals(w)) {
							if (!c.equals(c2z)) {
								if (!c.equals(w2i)) {
									if (!c.equals(z)) {
										if (!c.equals(d)) {
											if (!c.equals(i)) {
												if (!x.equals(y)) {
													if (!x.equals(z)) {
														if (!y.equals(z)) {
															if (!d2v.equals(x)) {
																if (!d2v.equals(y)) {
																	if (!d2v.equals(v)) {
																		if (!d2v.equals(w)) {
																			if (!d2v.equals(w2i)) {
																				if (!d2v.equals(z)) {
																					if (!d2v.equals(i)) {
																						if (!b2y.equals(c)) {
																							if (!b2y.equals(x)) {
																								if (!b2y.equals(y)) {
																									if (!b2y.equals(
																											d2v)) {
																										if (!b2y.equals(
																												v)) {
																											if (!b2y.equals(
																													w)) {
																												if (!b2y.equals(
																														c2z)) {
																													if (!b2y.equals(
																															w2i)) {
																														if (!b2y.equals(
																																z)) {
																															if (!b2y.equals(
																																	d)) {
																																if (!b2y.equals(
																																		i)) {
																																	if (!v.equals(
																																			x)) {
																																		if (!v.equals(
																																				y)) {
																																			if (!v.equals(
																																					w)) {
																																				if (!v.equals(
																																						w2i)) {
																																					if (!v.equals(
																																							z)) {
																																						if (!w.equals(
																																								x)) {
																																							if (!w.equals(
																																									y)) {
																																								if (!w.equals(
																																										w2i)) {
																																									if (!w.equals(
																																											z)) {
																																										if (!c2z.equals(
																																												x)) {
																																											if (!c2z.equals(
																																													y)) {
																																												if (!c2z.equals(
																																														d2v)) {
																																													if (!c2z.equals(
																																															v)) {
																																														if (!c2z.equals(
																																																w)) {
																																															if (!c2z.equals(
																																																	w2i)) {
																																																if (!c2z.equals(
																																																		z)) {
																																																	if (!c2z.equals(
																																																			d)) {
																																																		if (!c2z.equals(
																																																				i)) {
																																																			if (!b.equals(
																																																					c)) {
																																																				if (!b.equals(
																																																						x)) {
																																																					if (!b.equals(
																																																							y)) {
																																																						if (!b.equals(
																																																								d2v)) {
																																																							if (!b.equals(
																																																									b2y)) {
																																																								if (!b.equals(
																																																										v)) {
																																																									if (!b.equals(
																																																											w)) {
																																																										if (!b.equals(
																																																												c2z)) {
																																																											if (!b.equals(
																																																													w2i)) {
																																																												if (!b.equals(
																																																														z)) {
																																																													if (!b.equals(
																																																															d)) {
																																																														if (!b.equals(
																																																																i)) {
																																																															if (!a.equals(
																																																																	c)) {
																																																																if (!a.equals(
																																																																		x)) {
																																																																	if (!a.equals(
																																																																			y)) {
																																																																		if (!a.equals(
																																																																				d2v)) {
																																																																			if (!a.equals(
																																																																					b2y)) {
																																																																				if (!a.equals(
																																																																						v)) {
																																																																					if (!a.equals(
																																																																							w)) {
																																																																						if (!a.equals(
																																																																								c2z)) {
																																																																							if (!a.equals(
																																																																									b)) {
																																																																								if (!a.equals(
																																																																										w2i)) {
																																																																									if (!a.equals(
																																																																											z)) {
																																																																										if (!a.equals(
																																																																												d)) {
																																																																											if (!a.equals(
																																																																													i)) {
																																																																												if (!a.equals(
																																																																														a2x)) {
																																																																													if (!w2i.equals(
																																																																															x)) {
																																																																														if (!w2i.equals(
																																																																																y)) {
																																																																															if (!w2i.equals(
																																																																																	z)) {
																																																																																if (!d.equals(
																																																																																		x)) {
																																																																																	if (!d.equals(
																																																																																			y)) {
																																																																																		if (!d.equals(
																																																																																				d2v)) {
																																																																																			if (!d.equals(
																																																																																					v)) {
																																																																																				if (!d.equals(
																																																																																						w)) {
																																																																																					if (!d.equals(
																																																																																							w2i)) {
																																																																																						if (!d.equals(
																																																																																								z)) {
																																																																																							if (!d.equals(
																																																																																									i)) {
																																																																																								if (!i.equals(
																																																																																										x)) {
																																																																																									if (!i.equals(
																																																																																											y)) {
																																																																																										if (!i.equals(
																																																																																												v)) {
																																																																																											if (!i.equals(
																																																																																													w)) {
																																																																																												if (!i.equals(
																																																																																														w2i)) {
																																																																																													if (!i.equals(
																																																																																															z)) {
																																																																																														if (!a2x.equals(
																																																																																																c)) {
																																																																																															if (!a2x.equals(
																																																																																																	x)) {
																																																																																																if (!a2x.equals(
																																																																																																		y)) {
																																																																																																	if (!a2x.equals(
																																																																																																			d2v)) {
																																																																																																		if (!a2x.equals(
																																																																																																				b2y)) {
																																																																																																			if (!a2x.equals(
																																																																																																					v)) {
																																																																																																				if (!a2x.equals(
																																																																																																						w)) {
																																																																																																					if (!a2x.equals(
																																																																																																							c2z)) {
																																																																																																						if (!a2x.equals(
																																																																																																								b)) {
																																																																																																							if (!a2x.equals(
																																																																																																									w2i)) {
																																																																																																								if (!a2x.equals(
																																																																																																										z)) {
																																																																																																									if (!a2x.equals(
																																																																																																											d)) {
																																																																																																										if (!a2x.equals(
																																																																																																												i)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													c,
																																																																																																													x,
																																																																																																													y,
																																																																																																													d2v,
																																																																																																													b2y,
																																																																																																													v,
																																																																																																													w,
																																																																																																													c2z,
																																																																																																													b,
																																																																																																													a,
																																																																																																													w2i,
																																																																																																													z,
																																																																																																													d,
																																																																																																													i,
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
			PerformRuleResult ruleresult, EObject c, EObject x, EObject y, EObject d2v, EObject b2y, EObject v,
			EObject w, EObject c2z, EObject b, EObject a, EObject z, EObject d, EObject i, EObject a2x) {
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilell2branchbb";
		String b2y__y____target_name_prime = "target";
		String d2v__v____target_name_prime = "target";
		String v__z____next_name_prime = "next";
		String c__d____last_name_prime = "last";
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String b2y__b____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String d2v__d____source_name_prime = "source";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(v__z____next);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____last);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { ruleresult, c, x, y, d2v, b2y, v, w, c2z, b, a, z, d, i, a2x, b2y__y____target,
				d2v__v____target, v__z____next, c__d____last, w__c____next, w__a____first, b2y__b____source,
				a__b____last, d2v__d____source, c2z__c____source, c2z__z____target, i__z____negative, i__x____positive,
				a2x__x____target, a2x__a____source, y__x____next };
	}

	public static final void pattern_whilell2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whilell2branchbb _this, PerformRuleResult ruleresult, EObject c, EObject x, EObject y, EObject d2v,
			EObject b2y, EObject v, EObject w, EObject c2z, EObject b, EObject a, EObject w2i, EObject z, EObject d,
			EObject i, EObject a2x) {
		_this.registerObjects_BWD(ruleresult, c, x, y, d2v, b2y, v, w, c2z, b, a, w2i, z, d, i, a2x);

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
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("y");
		EObject _localVariable_2 = match.getObject("v");
		EObject _localVariable_3 = match.getObject("z");
		EObject _localVariable_4 = match.getObject("i");
		EObject tmpX = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpV = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpI = _localVariable_4;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpV instanceof Command) {
					Command v = (Command) tmpV;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							return new Object[] { x, y, v, z, i, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_12_2_corematch_blackBBBFFBBB(Branch x, Command y,
			Command v, Branch z, Branch i, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
								"target")) {
							Statement tmpW = w2i.getSource();
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								_result.add(new Object[] { x, y, v, w, w2i, z, i, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_12_3_findcontext_blackBBBBBBB(Branch x, Command y,
			Command v, While w, S2B w2i, Branch z, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						if (z.equals(v.getNext())) {
							if (w.equals(w2i.getSource())) {
								if (i.equals(w2i.getTarget())) {
									if (z.equals(i.getNegative())) {
										if (x.equals(i.getPositive())) {
											if (x.equals(y.getNext())) {
												_result.add(new Object[] { x, y, v, w, w2i, z, i });
											}
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

	public static final Object[] pattern_whilell2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(Branch x, Command y,
			Command v, While w, S2B w2i, Branch z, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String v__z____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(v);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(i);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(v__z____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		v__z____next.setName(v__z____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { x, y, v, w, w2i, z, i, isApplicableMatch, v__z____next, w2i__w____source,
				w2i__i____target, i__z____negative, i__x____positive, y__x____next };
	}

	public static final Object[] pattern_whilell2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch x, Command y, Command v, While w, S2B w2i, Branch z, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, x, y, v, w, w2i, z, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, x, y, v, w, w2i, z, i };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whilell2branchbb _this, IsApplicableMatch isApplicableMatch, Branch x, Command y, Command v, While w,
			S2B w2i, Branch z, Branch i) {
		Object[] result_pattern_whilell2branchbb_12_4_solveCSP_binding = pattern_whilell2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, x, y, v, w, w2i, z, i);
		if (result_pattern_whilell2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_12_4_solveCSP_black = pattern_whilell2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, x, y, v, w, w2i, z, i };
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

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_945407 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_554102 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_554102)) {
							if (!z.equals(__DEC_x_positive_554102)) {
								if (!i.equals(__DEC_x_positive_554102)) {
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

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_353499 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_353499)) {
							if (!z.equals(__DEC_x_negative_353499)) {
								if (!i.equals(__DEC_x_negative_353499)) {
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

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_267213 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(Command y, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_positive_956062 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_956062)) {
							if (!z.equals(__DEC_y_positive_956062)) {
								if (!i.equals(__DEC_y_positive_956062)) {
									return new Object[] { y, x, z, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(Command y, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_negative_230444 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_230444)) {
							if (!z.equals(__DEC_y_negative_230444)) {
								if (!i.equals(__DEC_y_negative_230444)) {
									return new Object[] { y, x, z, i };
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
		for (Graph __DEC_v_root_997247 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_7BBBB(Command v, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_positive_144053 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!x.equals(__DEC_v_positive_144053)) {
							if (!z.equals(__DEC_v_positive_144053)) {
								if (!i.equals(__DEC_v_positive_144053)) {
									return new Object[] { v, x, z, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_8BBBB(Command v, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_negative_226683 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!x.equals(__DEC_v_negative_226683)) {
							if (!z.equals(__DEC_v_negative_226683)) {
								if (!i.equals(__DEC_v_negative_226683)) {
									return new Object[] { v, x, z, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_9B(Branch z) {
		for (Graph __DEC_z_root_347550 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_10BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_802472 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_802472)) {
							if (!x.equals(__DEC_z_positive_802472)) {
								if (!i.equals(__DEC_z_positive_802472)) {
									return new Object[] { z, x, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_11BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_213226 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_213226)) {
							if (!x.equals(__DEC_z_negative_213226)) {
								if (!i.equals(__DEC_z_negative_213226)) {
									return new Object[] { z, x, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_12BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_13BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_14BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_15BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_16BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_17BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_18BB(Branch x,
			Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_19BB(Branch z,
			Command v) {
		if (v.equals(z.getPositive())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_20BB(Branch i,
			Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_21BB(Branch x,
			Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_22BB(Branch z,
			Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_23BB(Branch i,
			Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_24BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_25BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpV = _edge_next.getSrc();
		if (tmpV instanceof Command) {
			Command v = (Command) tmpV;
			EObject tmpZ = _edge_next.getTrg();
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (z.equals(v.getNext())) {
					if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_6B(v) == null) {
						if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_9B(z) == null) {
							if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_19BB(z, v) == null) {
								if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_22BB(z, v) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(z, Branch.class, "negative")) {
										if (!i.equals(z)) {
											Node tmpX = i.getPositive();
											if (tmpX instanceof Branch) {
												Branch x = (Branch) tmpX;
												if (!x.equals(z)) {
													if (!i.equals(x)) {
														if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_20BB(
																i, v) == null) {
															if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_23BB(
																	i, v) == null) {
																if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_0B(
																		x) == null) {
																	if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(
																			x, z, i) == null) {
																		if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(
																				x, z, i) == null) {
																			if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_7BBBB(
																					v, x, z, i) == null) {
																				if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_8BBBB(
																						v, x, z, i) == null) {
																					if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_10BBB(
																							z, x, i) == null) {
																						if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_11BBB(
																								z, x, i) == null) {
																							if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_18BB(
																									x, v) == null) {
																								if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_21BB(
																										x, v) == null) {
																									if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_24BB(
																											x,
																											z) == null) {
																										if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_25BB(
																												x,
																												z) == null) {
																											for (Node tmpY : org.moflon.core.utilities.eMoflonEMFUtil
																													.getOppositeReferenceTyped(
																															x,
																															Node.class,
																															"next")) {
																												if (tmpY instanceof Command) {
																													Command y = (Command) tmpY;
																													if (!v.equals(
																															y)) {
																														if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_3B(
																																y) == null) {
																															if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(
																																	y,
																																	x,
																																	z,
																																	i) == null) {
																																if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(
																																		y,
																																		x,
																																		z,
																																		i) == null) {
																																	if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_12BB(
																																			x,
																																			y) == null) {
																																		if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_13BB(
																																				z,
																																				y) == null) {
																																			if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_14BB(
																																					i,
																																					y) == null) {
																																				if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																																						x,
																																						y) == null) {
																																					if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_16BB(
																																							z,
																																							y) == null) {
																																						if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_17BB(
																																								i,
																																								y) == null) {
																																							_result.add(
																																									new Object[] {
																																											x,
																																											y,
																																											v,
																																											z,
																																											i,
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
			whilell2branchbb _this, Match match, Branch x, Command y, Command v, Branch z, Branch i) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, y, v, z, i);
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
		for (Decision __DEC_c_positive_924110 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_477844 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
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
					for (While __DEC_c_first_230215 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_230215)) {
							if (!w.equals(__DEC_c_first_230215)) {
								if (!a.equals(__DEC_c_first_230215)) {
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
					for (While __DEC_c_last_666764 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_666764)) {
							if (!w.equals(__DEC_c_last_666764)) {
								if (!a.equals(__DEC_c_last_666764)) {
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
		for (Program __DEC_c_first_355562 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_positive_986799 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_6B(Assignment b) {
		for (Decision __DEC_b_negative_421873 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_7BBBB(Assignment b,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_first_865224 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "first")) {
						if (!c.equals(__DEC_b_first_865224)) {
							if (!w.equals(__DEC_b_first_865224)) {
								if (!a.equals(__DEC_b_first_865224)) {
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_8BBBB(Assignment b,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_last_973248 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!c.equals(__DEC_b_last_973248)) {
							if (!w.equals(__DEC_b_last_973248)) {
								if (!a.equals(__DEC_b_last_973248)) {
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_9B(Assignment b) {
		for (Program __DEC_b_first_663951 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_10B(While a) {
		for (Decision __DEC_a_positive_723942 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_11B(While a) {
		for (Decision __DEC_a_negative_703804 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
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
					for (While __DEC_a_last_538682 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_538682)) {
							if (!c.equals(__DEC_a_last_538682)) {
								if (!w.equals(__DEC_a_last_538682)) {
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
		for (Program __DEC_a_first_593763 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_14B(Assignment d) {
		for (Decision __DEC_d_positive_522544 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_15B(Assignment d) {
		for (Decision __DEC_d_negative_628896 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_16BBBB(Assignment d,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_first_992977 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!c.equals(__DEC_d_first_992977)) {
							if (!w.equals(__DEC_d_first_992977)) {
								if (!a.equals(__DEC_d_first_992977)) {
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_17BBBB(Assignment d,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_last_721817 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!c.equals(__DEC_d_last_721817)) {
							if (!w.equals(__DEC_d_last_721817)) {
								if (!a.equals(__DEC_d_last_721817)) {
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_18B(Assignment d) {
		for (Program __DEC_d_first_658472 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
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
			Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_27BB(While w,
			Assignment d) {
		if (d.equals(w.getFirst())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_28BB(While a,
			Assignment d) {
		if (d.equals(a.getFirst())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_29BB(While w,
			Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_30BB(While a,
			Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_last.getSrc();
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			EObject tmpD = _edge_last.getTrg();
			if (tmpD instanceof Assignment) {
				Assignment d = (Assignment) tmpD;
				if (d.equals(c.getLast())) {
					if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_0B(c) == null) {
						if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_1B(c) == null) {
							if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_4B(c) == null) {
								if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_14B(d) == null) {
									if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_15B(d) == null) {
										if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_18B(
												d) == null) {
											if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_26BB(c,
													d) == null) {
												for (Statement tmpW : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(c, Statement.class, "next")) {
													if (tmpW instanceof While) {
														While w = (While) tmpW;
														if (!c.equals(w)) {
															Statement tmpA = w.getFirst();
															if (tmpA instanceof While) {
																While a = (While) tmpA;
																if (!a.equals(c)) {
																	if (!a.equals(w)) {
																		Statement tmpB = a.getLast();
																		if (tmpB instanceof Assignment) {
																			Assignment b = (Assignment) tmpB;
																			if (!b.equals(d)) {
																				if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_27BB(
																						w, d) == null) {
																					if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_29BB(
																							w, d) == null) {
																						if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(
																								c, w, a) == null) {
																							if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(
																									c, w, a) == null) {
																								if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_10B(
																										a) == null) {
																									if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_11B(
																											a) == null) {
																										if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_12BBB(
																												a, c,
																												w) == null) {
																											if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_13B(
																													a) == null) {
																												if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_16BBBB(
																														d,
																														c,
																														w,
																														a) == null) {
																													if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_17BBBB(
																															d,
																															c,
																															w,
																															a) == null) {
																														if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_24BB(
																																c,
																																a) == null) {
																															if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_25BB(
																																	w,
																																	a) == null) {
																																if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_28BB(
																																		a,
																																		d) == null) {
																																	if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_30BB(
																																			a,
																																			d) == null) {
																																		if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_5B(
																																				b) == null) {
																																			if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_6B(
																																					b) == null) {
																																				if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_7BBBB(
																																						b,
																																						c,
																																						w,
																																						a) == null) {
																																					if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_8BBBB(
																																							b,
																																							c,
																																							w,
																																							a) == null) {
																																						if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_9B(
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
																																												_result.add(
																																														new Object[] {
																																																c,
																																																w,
																																																b,
																																																a,
																																																d,
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
																}
															}

														}
													}
												}
											}
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
			whilell2branchbb _this, Match match, While c, While w, Assignment b, While a, Assignment d) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, c, w, b, a, d);
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
		EObject _localVariable_1 = targetMatch.getObject("x");
		EObject _localVariable_2 = targetMatch.getObject("y");
		EObject _localVariable_3 = targetMatch.getObject("v");
		EObject _localVariable_4 = sourceMatch.getObject("w");
		EObject _localVariable_5 = sourceMatch.getObject("b");
		EObject _localVariable_6 = sourceMatch.getObject("a");
		EObject _localVariable_7 = targetMatch.getObject("z");
		EObject _localVariable_8 = sourceMatch.getObject("d");
		EObject _localVariable_9 = targetMatch.getObject("i");
		EObject tmpC = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpV = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpB = _localVariable_5;
		EObject tmpA = _localVariable_6;
		EObject tmpZ = _localVariable_7;
		EObject tmpD = _localVariable_8;
		EObject tmpI = _localVariable_9;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpV instanceof Command) {
						Command v = (Command) tmpV;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								if (tmpA instanceof While) {
									While a = (While) tmpA;
									if (tmpZ instanceof Branch) {
										Branch z = (Branch) tmpZ;
										if (tmpD instanceof Assignment) {
											Assignment d = (Assignment) tmpD;
											if (tmpI instanceof Branch) {
												Branch i = (Branch) tmpI;
												return new Object[] { c, x, y, v, w, b, a, z, d, i, sourceMatch,
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

	public static final Object[] pattern_whilell2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(While c, Branch x,
			Command y, Command v, While w, Assignment b, While a, Branch z, Assignment d, Branch i, Match sourceMatch,
			Match targetMatch) {
		if (!c.equals(w)) {
			if (!x.equals(z)) {
				if (!v.equals(y)) {
					if (!b.equals(d)) {
						if (!a.equals(c)) {
							if (!a.equals(w)) {
								if (!i.equals(x)) {
									if (!i.equals(z)) {
										if (!sourceMatch.equals(targetMatch)) {
											return new Object[] { c, x, y, v, w, b, a, z, d, i, sourceMatch,
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
			Branch x = (Branch) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[1];
			Command y = (Command) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[2];
			Command v = (Command) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[3];
			While w = (While) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[4];
			Assignment b = (Assignment) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[5];
			While a = (While) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[6];
			Branch z = (Branch) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[7];
			Assignment d = (Assignment) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[8];
			Branch i = (Branch) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_black = pattern_whilell2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					c, x, y, v, w, b, a, z, d, i, sourceMatch, targetMatch);
			if (result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { c, x, y, v, w, b, a, z, d, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(whilell2branchbb _this,
			While c, Branch x, Command y, Command v, While w, Assignment b, While a, Branch z, Assignment d, Branch i,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(c, x, y, v, w, b, a, z, d, i, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, c, x, y, v, w, b, a, z, d, i, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			whilell2branchbb _this, While c, Branch x, Command y, Command v, While w, Assignment b, While a, Branch z,
			Assignment d, Branch i, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilell2branchbb_24_3_solvecsp_binding = pattern_whilell2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, c, x, y, v, w, b, a, z, d, i, sourceMatch, targetMatch);
		if (result_pattern_whilell2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whilell2branchbb_24_3_solvecsp_black = pattern_whilell2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whilell2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, c, x, y, v, w, b, a, z, d, i, sourceMatch, targetMatch };
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
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				if (i.equals(w2i.getTarget())) {
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

	public static final Object[] pattern_whilell2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(While c, Branch x,
			Command y, Command v, While w, Assignment b, While a, Branch z, Assignment d, Branch i, CCMatch ccMatch) {
		if (!c.equals(w)) {
			if (!x.equals(z)) {
				if (!v.equals(y)) {
					if (!b.equals(d)) {
						if (!a.equals(c)) {
							if (!a.equals(w)) {
								if (!i.equals(x)) {
									if (!i.equals(z)) {
										return new Object[] { c, x, y, v, w, b, a, z, d, i, ccMatch };
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

	public static final Object[] pattern_whilell2branchbb_24_6_createcorrespondence_greenBBBFFBFBBBBFB(While c,
			Branch x, Command y, Command v, Assignment b, While a, Branch z, Assignment d, CCMatch ccMatch) {
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		d2v.setTarget(v);
		d2v.setSource(d);
		ccMatch.getCreateCorr().add(d2v);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { c, x, y, d2v, b2y, v, c2z, b, a, z, d, a2x, ccMatch };
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
		for (Decision __DEC_c_positive_607512 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_62433 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
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
					for (While __DEC_c_first_828963 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_828963)) {
							if (!w.equals(__DEC_c_first_828963)) {
								if (!a.equals(__DEC_c_first_828963)) {
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
					for (While __DEC_c_last_956090 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_956090)) {
							if (!w.equals(__DEC_c_last_956090)) {
								if (!a.equals(__DEC_c_last_956090)) {
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
		for (Program __DEC_c_first_834931 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_positive_562794 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_6B(Assignment b) {
		for (Decision __DEC_b_negative_356461 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_7BBBB(Assignment b, While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_first_921840 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "first")) {
						if (!c.equals(__DEC_b_first_921840)) {
							if (!w.equals(__DEC_b_first_921840)) {
								if (!a.equals(__DEC_b_first_921840)) {
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_8BBBB(Assignment b, While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_last_367079 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!c.equals(__DEC_b_last_367079)) {
							if (!w.equals(__DEC_b_last_367079)) {
								if (!a.equals(__DEC_b_last_367079)) {
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_9B(Assignment b) {
		for (Program __DEC_b_first_834332 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_10B(While a) {
		for (Decision __DEC_a_positive_662838 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_11B(While a) {
		for (Decision __DEC_a_negative_875951 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
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
					for (While __DEC_a_last_196718 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_196718)) {
							if (!c.equals(__DEC_a_last_196718)) {
								if (!w.equals(__DEC_a_last_196718)) {
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
		for (Program __DEC_a_first_365189 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_14B(Assignment d) {
		for (Decision __DEC_d_positive_57592 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_15B(Assignment d) {
		for (Decision __DEC_d_negative_185014 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_16BBBB(Assignment d, While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_first_715469 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!c.equals(__DEC_d_first_715469)) {
							if (!w.equals(__DEC_d_first_715469)) {
								if (!a.equals(__DEC_d_first_715469)) {
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_17BBBB(Assignment d, While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_last_830555 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!c.equals(__DEC_d_last_830555)) {
							if (!w.equals(__DEC_d_last_830555)) {
								if (!a.equals(__DEC_d_last_830555)) {
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_18B(Assignment d) {
		for (Program __DEC_d_first_917553 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_26BB(While c, Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_27BB(While w, Assignment d) {
		if (d.equals(w.getFirst())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_28BB(While a, Assignment d) {
		if (d.equals(a.getFirst())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_29BB(While w, Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_30BB(While a, Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_blackBBBBB(While c, While w,
			Assignment b, While a, Assignment d) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						if (d.equals(c.getLast())) {
							if (c.equals(w.getNext())) {
								if (a.equals(w.getFirst())) {
									if (b.equals(a.getLast())) {
										if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_0B(c) == null) {
											if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_1B(c) == null) {
												if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_2BBB(c, w,
														a) == null) {
													if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_3BBB(c,
															w, a) == null) {
														if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_4B(
																c) == null) {
															if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_5B(
																	b) == null) {
																if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_6B(
																		b) == null) {
																	if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_7BBBB(
																			b, c, w, a) == null) {
																		if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_8BBBB(
																				b, c, w, a) == null) {
																			if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_9B(
																					b) == null) {
																				if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_10B(
																						a) == null) {
																					if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_11B(
																							a) == null) {
																						if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_12BBB(
																								a, c, w) == null) {
																							if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_13B(
																									a) == null) {
																								if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_14B(
																										d) == null) {
																									if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_15B(
																											d) == null) {
																										if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_16BBBB(
																												d, c, w,
																												a) == null) {
																											if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_17BBBB(
																													d,
																													c,
																													w,
																													a) == null) {
																												if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_18B(
																														d) == null) {
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
																																				a) == null) {
																																			if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_25BB(
																																					w,
																																					a) == null) {
																																				if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_26BB(
																																						c,
																																						d) == null) {
																																					if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_27BB(
																																							w,
																																							d) == null) {
																																						if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_28BB(
																																								a,
																																								d) == null) {
																																							if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_29BB(
																																									w,
																																									d) == null) {
																																								if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_30BB(
																																										a,
																																										d) == null) {
																																									return new Object[] {
																																											c,
																																											w,
																																											b,
																																											a,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_973839 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_1BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_399136 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_399136)) {
							if (!z.equals(__DEC_x_positive_399136)) {
								if (!i.equals(__DEC_x_positive_399136)) {
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

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_2BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_160962 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_160962)) {
							if (!z.equals(__DEC_x_negative_160962)) {
								if (!i.equals(__DEC_x_negative_160962)) {
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

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_870477 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_4BBBB(Command y, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_positive_89744 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_89744)) {
							if (!z.equals(__DEC_y_positive_89744)) {
								if (!i.equals(__DEC_y_positive_89744)) {
									return new Object[] { y, x, z, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_5BBBB(Command y, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_negative_822158 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_822158)) {
							if (!z.equals(__DEC_y_negative_822158)) {
								if (!i.equals(__DEC_y_negative_822158)) {
									return new Object[] { y, x, z, i };
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
		for (Graph __DEC_v_root_750103 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_7BBBB(Command v, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_positive_839280 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!x.equals(__DEC_v_positive_839280)) {
							if (!z.equals(__DEC_v_positive_839280)) {
								if (!i.equals(__DEC_v_positive_839280)) {
									return new Object[] { v, x, z, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_8BBBB(Command v, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_negative_678927 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!x.equals(__DEC_v_negative_678927)) {
							if (!z.equals(__DEC_v_negative_678927)) {
								if (!i.equals(__DEC_v_negative_678927)) {
									return new Object[] { v, x, z, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_9B(Branch z) {
		for (Graph __DEC_z_root_876959 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_10BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_710435 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_710435)) {
							if (!x.equals(__DEC_z_positive_710435)) {
								if (!i.equals(__DEC_z_positive_710435)) {
									return new Object[] { z, x, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_11BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_389578 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_389578)) {
							if (!x.equals(__DEC_z_negative_389578)) {
								if (!i.equals(__DEC_z_negative_389578)) {
									return new Object[] { z, x, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_12BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_13BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_14BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_15BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_16BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_17BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_18BB(Branch x, Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_19BB(Branch z, Command v) {
		if (v.equals(z.getPositive())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_20BB(Branch i, Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_21BB(Branch x, Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_22BB(Branch z, Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_23BB(Branch i, Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_24BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_25BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_blackBBBBB(Branch x, Command y,
			Command v, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						if (z.equals(v.getNext())) {
							if (z.equals(i.getNegative())) {
								if (x.equals(i.getPositive())) {
									if (x.equals(y.getNext())) {
										if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_0B(x) == null) {
											if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_1BBB(x, z,
													i) == null) {
												if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_2BBB(x, z,
														i) == null) {
													if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_3B(
															y) == null) {
														if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_4BBBB(
																y, x, z, i) == null) {
															if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_5BBBB(
																	y, x, z, i) == null) {
																if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_6B(
																		v) == null) {
																	if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_7BBBB(
																			v, x, z, i) == null) {
																		if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_8BBBB(
																				v, x, z, i) == null) {
																			if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_9B(
																					z) == null) {
																				if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_10BBB(
																						z, x, i) == null) {
																					if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_11BBB(
																							z, x, i) == null) {
																						if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_12BB(
																								x, y) == null) {
																							if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_13BB(
																									z, y) == null) {
																								if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_14BB(
																										i, y) == null) {
																									if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_15BB(
																											x,
																											y) == null) {
																										if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_16BB(
																												z,
																												y) == null) {
																											if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_17BB(
																													i,
																													y) == null) {
																												if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_18BB(
																														x,
																														v) == null) {
																													if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_19BB(
																															z,
																															v) == null) {
																														if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_20BB(
																																i,
																																v) == null) {
																															if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_21BB(
																																	x,
																																	v) == null) {
																																if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_22BB(
																																		z,
																																		v) == null) {
																																	if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_23BB(
																																			i,
																																			v) == null) {
																																		if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_24BB(
																																				x,
																																				z) == null) {
																																			if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_25BB(
																																					x,
																																					z) == null) {
																																				return new Object[] {
																																						x,
																																						y,
																																						v,
																																						z,
																																						i };
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilell2branchbb_29_6_perform_greenFFFFFFBFFFFFBFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		y.setNext(x);
		ruleResult.getTargetObjects().add(y);
		ruleResult.getCorrObjects().add(d2v);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		d2v.setTarget(v);
		ruleResult.getTargetObjects().add(v);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		w.setFirst(a);
		a.setLast(b);
		ruleResult.getSourceObjects().add(a);
		v.setNext(z);
		c2z.setTarget(z);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		c.setLast(d);
		d2v.setSource(d);
		ruleResult.getSourceObjects().add(d);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c, x, y, d2v, b2y, v, w, c2z, b, a, z, d, i, a2x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whilell2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whilell2branchbbImpl
