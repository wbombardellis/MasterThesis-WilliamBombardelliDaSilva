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
	public boolean isAppropriate_FWD(Match match, While c, While a, Assignment d, Assignment b, While w) {

		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_0_1_initialbindings_blackBBBBBBB(this,
				match, c, a, d, b, w);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[d] = " + d + ", "
					+ "[b] = " + b + ", " + "[w] = " + w + ".");
		}

		Object[] result2_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, c, a, d, b, w);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[d] = " + d + ", "
					+ "[b] = " + b + ", " + "[w] = " + w + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilell2branchbbImpl.pattern_whilell2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_0_4_collectelementstobetranslated_blackBBBBBB(match, c, a, d, b, w);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[c] = " + c + ", "
								+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[w] = " + w + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(match, c, a,
					d, b, w);
			//nothing EMoflonEdge c__d____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[9];

			Object[] result5_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_0_5_collectcontextelements_blackBBBBBB(match, c, a, d, b, w);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[c] = " + c + ", "
								+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[w] = " + w + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whilell2branchbbImpl.pattern_whilell2branchbb_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, c,
					a, d, b, w);
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
		While a = (While) result1_bindingAndBlack[1];
		Assignment d = (Assignment) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		Branch i = (Branch) result1_bindingAndBlack[4];
		Assignment b = (Assignment) result1_bindingAndBlack[5];
		While w = (While) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_1_performtransformation_greenBFBBFFFBFBFFF(c, a, d, i, b);
		Command y = (Command) result1_green[1];
		S2N d2v = (S2N) result1_green[4];
		Branch z = (Branch) result1_green[5];
		Command v = (Command) result1_green[6];
		Branch x = (Branch) result1_green[8];
		S2B c2z = (S2B) result1_green[10];
		S2B a2x = (S2B) result1_green[11];
		S2N b2y = (S2N) result1_green[12];

		Object[] result2_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(c, y, a, d, d2v, z, v, x, b,
						c2z, a2x, b2y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[y] = " + y
					+ ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[d2v] = " + d2v + ", " + "[z] = " + z + ", "
					+ "[v] = " + v + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[c2z] = " + c2z + ", "
					+ "[a2x] = " + a2x + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(c, y, a, d, d2v, z, v, x, b,
						c2z, a2x, b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, c, y, a, d, d2v, z,
						w2i, v, i, x, b, c2z, a2x, w, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[a] = " + a + ", " + "[d] = " + d + ", "
					+ "[d2v] = " + d2v + ", " + "[z] = " + z + ", " + "[w2i] = " + w2i + ", " + "[v] = " + v + ", "
					+ "[i] = " + i + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[c2z] = " + c2z + ", "
					+ "[a2x] = " + a2x + ", " + "[w] = " + w + ", " + "[b2y] = " + b2y + ".");
		}
		whilell2branchbbImpl.pattern_whilell2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, c, y, a, d, d2v, z, v, i, x, b, c2z, a2x, w, b2y);
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[30];

		// 
		// 
		whilell2branchbbImpl.pattern_whilell2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				c, y, a, d, d2v, z, w2i, v, i, x, b, c2z, a2x, w, b2y);
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
		While a = (While) result2_binding[1];
		Assignment d = (Assignment) result2_binding[2];
		Assignment b = (Assignment) result2_binding[3];
		While w = (While) result2_binding[4];
		for (Object[] result2_black : whilell2branchbbImpl.pattern_whilell2branchbb_2_2_corematch_blackBBBFFBBB(c, a, d,
				b, w, match)) {
			S2B w2i = (S2B) result2_black[3];
			Branch i = (Branch) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whilell2branchbbImpl.pattern_whilell2branchbb_2_3_findcontext_blackBBBBBBB(c,
					a, d, w2i, i, b, w)) {
				Object[] result3_green = whilell2branchbbImpl
						.pattern_whilell2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(c, a, d, w2i, i, b, w);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = whilell2branchbbImpl
						.pattern_whilell2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, c, a,
								d, w2i, i, b, w);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[a] = " + a
							+ ", " + "[d] = " + d + ", " + "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[b] = " + b
							+ ", " + "[w] = " + w + ".");
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
	public void registerObjectsToMatch_FWD(Match match, While c, While a, Assignment d, Assignment b, While w) {
		match.registerObject("c", c);
		match.registerObject("a", a);
		match.registerObject("d", d);
		match.registerObject("b", b);
		match.registerObject("w", w);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While c, While a, Assignment d, Assignment b, While w) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While c, While a, Assignment d, S2B w2i,
			Branch i, Assignment b, While w) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c, EObject y, EObject a, EObject d,
			EObject d2v, EObject z, EObject w2i, EObject v, EObject i, EObject x, EObject b, EObject c2z, EObject a2x,
			EObject w, EObject b2y) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b2y", b2y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command y, Branch z, Command v, Branch i, Branch x) {

		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_10_1_initialbindings_blackBBBBBBB(this,
				match, y, z, v, i, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[v] = " + v + ", "
					+ "[i] = " + i + ", " + "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, y, z, v, i, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[v] = " + v + ", "
					+ "[i] = " + i + ", " + "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilell2branchbbImpl.pattern_whilell2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_10_4_collectelementstobetranslated_blackBBBBBB(match, y, z, v, i, x);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[y] = " + y + ", "
								+ "[z] = " + z + ", " + "[v] = " + v + ", " + "[i] = " + i + ", " + "[x] = " + x + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(match, y,
					z, v, i, x);
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge v__z____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[9];

			Object[] result5_black = whilell2branchbbImpl
					.pattern_whilell2branchbb_10_5_collectcontextelements_blackBBBBBB(match, y, z, v, i, x);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[y] = " + y + ", "
								+ "[z] = " + z + ", " + "[v] = " + v + ", " + "[i] = " + i + ", " + "[x] = " + x + ".");
			}
			whilell2branchbbImpl.pattern_whilell2branchbb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whilell2branchbbImpl.pattern_whilell2branchbb_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, y,
					z, v, i, x);
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
		Command y = (Command) result1_bindingAndBlack[0];
		Branch z = (Branch) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		Command v = (Command) result1_bindingAndBlack[3];
		Branch i = (Branch) result1_bindingAndBlack[4];
		Branch x = (Branch) result1_bindingAndBlack[5];
		While w = (While) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_1_performtransformation_greenFBFFFBBBFFFBF(y, z, v, x, w);
		While c = (While) result1_green[0];
		While a = (While) result1_green[2];
		Assignment d = (Assignment) result1_green[3];
		S2N d2v = (S2N) result1_green[4];
		Assignment b = (Assignment) result1_green[8];
		S2B c2z = (S2B) result1_green[9];
		S2B a2x = (S2B) result1_green[10];
		S2N b2y = (S2N) result1_green[12];

		Object[] result2_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(c, y, a, d, d2v, z, v, x, b,
						c2z, a2x, b2y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[y] = " + y
					+ ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[d2v] = " + d2v + ", " + "[z] = " + z + ", "
					+ "[v] = " + v + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[c2z] = " + c2z + ", "
					+ "[a2x] = " + a2x + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(c, y, a, d, d2v, z, v, x, b,
						c2z, a2x, b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilell2branchbbImpl
				.pattern_whilell2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, c, y, a, d, d2v, z,
						w2i, v, i, x, b, c2z, a2x, w, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[a] = " + a + ", " + "[d] = " + d + ", "
					+ "[d2v] = " + d2v + ", " + "[z] = " + z + ", " + "[w2i] = " + w2i + ", " + "[v] = " + v + ", "
					+ "[i] = " + i + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[c2z] = " + c2z + ", "
					+ "[a2x] = " + a2x + ", " + "[w] = " + w + ", " + "[b2y] = " + b2y + ".");
		}
		whilell2branchbbImpl.pattern_whilell2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, c, y, a, d, d2v, z, v, i, x, b, c2z, a2x, w, b2y);
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[30];

		// 
		// 
		whilell2branchbbImpl.pattern_whilell2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				c, y, a, d, d2v, z, w2i, v, i, x, b, c2z, a2x, w, b2y);
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
		Branch z = (Branch) result2_binding[1];
		Command v = (Command) result2_binding[2];
		Branch i = (Branch) result2_binding[3];
		Branch x = (Branch) result2_binding[4];
		for (Object[] result2_black : whilell2branchbbImpl.pattern_whilell2branchbb_12_2_corematch_blackBBFBBBFB(y, z,
				v, i, x, match)) {
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[6];
			// ForEach 
			for (Object[] result3_black : whilell2branchbbImpl.pattern_whilell2branchbb_12_3_findcontext_blackBBBBBBB(y,
					z, w2i, v, i, x, w)) {
				Object[] result3_green = whilell2branchbbImpl
						.pattern_whilell2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(y, z, w2i, v, i, x, w);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = whilell2branchbbImpl
						.pattern_whilell2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, y, z,
								w2i, v, i, x, w);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[y] = " + y + ", " + "[z] = " + z
							+ ", " + "[w2i] = " + w2i + ", " + "[v] = " + v + ", " + "[i] = " + i + ", " + "[x] = " + x
							+ ", " + "[w] = " + w + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Command y, Branch z, Command v, Branch i, Branch x) {
		match.registerObject("y", y);
		match.registerObject("z", z);
		match.registerObject("v", v);
		match.registerObject("i", i);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command y, Branch z, Command v, Branch i, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command y, Branch z, S2B w2i, Command v,
			Branch i, Branch x, While w) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("v", v);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c, EObject y, EObject a, EObject d,
			EObject d2v, EObject z, EObject w2i, EObject v, EObject i, EObject x, EObject b, EObject c2z, EObject a2x,
			EObject w, EObject b2y) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b2y", b2y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("v").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_146(EMoflonEdge _edge_next) {

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
			Command y = (Command) result2_black[0];
			Branch z = (Branch) result2_black[1];
			Command v = (Command) result2_black[2];
			Branch i = (Branch) result2_black[3];
			Branch x = (Branch) result2_black[4];
			Object[] result2_green = whilell2branchbbImpl
					.pattern_whilell2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilell2branchbbImpl
					.pattern_whilell2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, y, z, v, i, x)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_146(EMoflonEdge _edge_last) {

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
			While a = (While) result2_black[1];
			Assignment d = (Assignment) result2_black[2];
			Assignment b = (Assignment) result2_black[3];
			While w = (While) result2_black[4];
			Object[] result2_green = whilell2branchbbImpl
					.pattern_whilell2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilell2branchbbImpl
					.pattern_whilell2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, c, a, d, b, w)) {
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
		Command y = (Command) result2_bindingAndBlack[1];
		While a = (While) result2_bindingAndBlack[2];
		Assignment d = (Assignment) result2_bindingAndBlack[3];
		Branch z = (Branch) result2_bindingAndBlack[4];
		Command v = (Command) result2_bindingAndBlack[5];
		Branch i = (Branch) result2_bindingAndBlack[6];
		Branch x = (Branch) result2_bindingAndBlack[7];
		Assignment b = (Assignment) result2_bindingAndBlack[8];
		While w = (While) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = whilell2branchbbImpl
				.pattern_whilell2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, c, y, a, d, z, v, i, x, b,
						w, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[z] = "
					+ z + ", " + "[v] = " + v + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[b] = " + b + ", "
					+ "[w] = " + w + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
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
						.pattern_whilell2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(c, y, a, d, z, v, i, x, b,
								w, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
							+ "[y] = " + y + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[z] = " + z + ", "
							+ "[v] = " + v + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[b] = " + b + ", "
							+ "[w] = " + w + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilell2branchbbImpl.pattern_whilell2branchbb_24_6_createcorrespondence_greenBBBBFBBBBFFFB(c, y, a, d,
						z, v, x, b, ccMatch);
				//nothing S2N d2v = (S2N) result6_green[4];
				//nothing S2B c2z = (S2B) result6_green[9];
				//nothing S2B a2x = (S2B) result6_green[10];
				//nothing S2N b2y = (S2N) result6_green[11];

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
	public CSP isApplicable_solveCsp_CC(While c, Command y, While a, Assignment d, Branch z, Command v, Branch i,
			Branch x, Assignment b, While w, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While c, While a, Assignment d, Assignment b, While w) {// 
		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_27_1_matchtggpattern_blackBBBBB(c, a, d,
				b, w);
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
	public boolean checkDEC_BWD(Command y, Branch z, Command v, Branch i, Branch x) {// 
		Object[] result1_black = whilell2branchbbImpl.pattern_whilell2branchbb_28_1_matchtggpattern_blackBBBBB(y, z, v,
				i, x);
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
			Branch i = (Branch) result2_black[2];
			While w = (While) result2_black[3];

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
					whilell2branchbbImpl.pattern_whilell2branchbb_29_6_perform_greenFFFFFFFBFFFFBFB(i, w, ruleResult);
					//nothing While c = (While) result6_green[0];
					//nothing Command y = (Command) result6_green[1];
					//nothing While a = (While) result6_green[2];
					//nothing Assignment d = (Assignment) result6_green[3];
					//nothing S2N d2v = (S2N) result6_green[4];
					//nothing Branch z = (Branch) result6_green[5];
					//nothing Command v = (Command) result6_green[6];
					//nothing Branch x = (Branch) result6_green[8];
					//nothing Assignment b = (Assignment) result6_green[9];
					//nothing S2B c2z = (S2B) result6_green[10];
					//nothing S2B a2x = (S2B) result6_green[11];
					//nothing S2N b2y = (S2N) result6_green[13];

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
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Assignment) arguments.get(4), (While) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Assignment) arguments.get(4), (While) arguments.get(5));
			return null;
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_WHILE_ASSIGNMENT_S2B_BRANCH_ASSIGNMENT_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (S2B) arguments.get(4),
					(Branch) arguments.get(5), (Assignment) arguments.get(6), (While) arguments.get(7));
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
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_BRANCH_S2B_COMMAND_BRANCH_BRANCH_WHILE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5), (Branch) arguments.get(6), (While) arguments.get(7));
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
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_146__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_146((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_146__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_146((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_COMMAND_WHILE_ASSIGNMENT_BRANCH_COMMAND_BRANCH_BRANCH_ASSIGNMENT_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Command) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Branch) arguments.get(4),
					(Command) arguments.get(5), (Branch) arguments.get(6), (Branch) arguments.get(7),
					(Assignment) arguments.get(8), (While) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.WHILELL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_DEC_FWD__WHILE_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE:
			return checkDEC_FWD((While) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILELL2BRANCHBB___CHECK_DEC_BWD__COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
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
			Match match, While c, While a, Assignment d, Assignment b, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						return new Object[] { _this, match, c, a, d, b, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_0_2_SolveCSP_bindingFBBBBBBB(whilell2branchbb _this,
			Match match, While c, While a, Assignment d, Assignment b, While w) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, c, a, d, b, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, a, d, b, w };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(whilell2branchbb _this,
			Match match, While c, While a, Assignment d, Assignment b, While w) {
		Object[] result_pattern_whilell2branchbb_0_2_SolveCSP_binding = pattern_whilell2branchbb_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, c, a, d, b, w);
		if (result_pattern_whilell2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_0_2_SolveCSP_black = pattern_whilell2branchbb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, a, d, b, w };
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
			While c, While a, Assignment d, Assignment b, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						return new Object[] { match, c, a, d, b, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_0_4_collectelementstobetranslated_greenBBBBBBFFFF(Match match,
			While c, While a, Assignment d, Assignment b, While w) {
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(d);
		match.getToBeTranslatedNodes().add(b);
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____last);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { match, c, a, d, b, w, c__d____last, a__b____last, w__a____first, w__c____next };
	}

	public static final Object[] pattern_whilell2branchbb_0_5_collectcontextelements_blackBBBBBB(Match match, While c,
			While a, Assignment d, Assignment b, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						return new Object[] { match, c, a, d, b, w };
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
			whilell2branchbb _this, Match match, While c, While a, Assignment d, Assignment b, While w) {
		_this.registerObjectsToMatch_FWD(match, c, a, d, b, w);

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
		EObject _localVariable_1 = isApplicableMatch.getObject("a");
		EObject _localVariable_2 = isApplicableMatch.getObject("d");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("i");
		EObject _localVariable_5 = isApplicableMatch.getObject("b");
		EObject _localVariable_6 = isApplicableMatch.getObject("w");
		EObject tmpC = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpI = _localVariable_4;
		EObject tmpB = _localVariable_5;
		EObject tmpW = _localVariable_6;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpD instanceof Assignment) {
					Assignment d = (Assignment) tmpD;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								if (tmpW instanceof While) {
									While w = (While) tmpW;
									return new Object[] { c, a, d, w2i, i, b, w, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_1_1_performtransformation_blackBBBBBBBFBB(While c, While a,
			Assignment d, S2B w2i, Branch i, Assignment b, While w, whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { c, a, d, w2i, i, b, w, csp, _this, isApplicableMatch };
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
			While a = (While) result_pattern_whilell2branchbb_1_1_performtransformation_binding[1];
			Assignment d = (Assignment) result_pattern_whilell2branchbb_1_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whilell2branchbb_1_1_performtransformation_binding[3];
			Branch i = (Branch) result_pattern_whilell2branchbb_1_1_performtransformation_binding[4];
			Assignment b = (Assignment) result_pattern_whilell2branchbb_1_1_performtransformation_binding[5];
			While w = (While) result_pattern_whilell2branchbb_1_1_performtransformation_binding[6];

			Object[] result_pattern_whilell2branchbb_1_1_performtransformation_black = pattern_whilell2branchbb_1_1_performtransformation_blackBBBBBBBFBB(
					c, a, d, w2i, i, b, w, _this, isApplicableMatch);
			if (result_pattern_whilell2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilell2branchbb_1_1_performtransformation_black[7];

				return new Object[] { c, a, d, w2i, i, b, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_1_1_performtransformation_greenBFBBFFFBFBFFF(While c, While a,
			Assignment d, Branch i, Assignment b) {
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		d2v.setSource(d);
		i.setNegative(z);
		d2v.setTarget(v);
		v.setNext(z);
		y.setNext(x);
		i.setPositive(x);
		c2z.setTarget(z);
		c2z.setSource(c);
		a2x.setTarget(x);
		a2x.setSource(a);
		b2y.setTarget(y);
		b2y.setSource(b);
		return new Object[] { c, y, a, d, d2v, z, v, i, x, b, c2z, a2x, b2y };
	}

	public static final Object[] pattern_whilell2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(While c,
			Command y, While a, Assignment d, S2N d2v, Branch z, Command v, Branch x, Assignment b, S2B c2z, S2B a2x,
			S2N b2y) {
		if (!a.equals(c)) {
			if (!v.equals(y)) {
				if (!x.equals(z)) {
					if (!b.equals(d)) {
						if (!a2x.equals(c2z)) {
							if (!b2y.equals(d2v)) {
								return new Object[] { c, y, a, d, d2v, z, v, x, b, c2z, a2x, b2y };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(While c,
			Command y, While a, Assignment d, S2N d2v, Branch z, Command v, Branch x, Assignment b, S2B c2z, S2B a2x,
			S2N b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedElements().add(v);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, c, y, a, d, d2v, z, v, x, b, c2z, a2x, b2y };
	}

	public static final Object[] pattern_whilell2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject y, EObject a, EObject d, EObject d2v, EObject z,
			EObject w2i, EObject v, EObject i, EObject x, EObject b, EObject c2z, EObject a2x, EObject w, EObject b2y) {
		if (!c.equals(y)) {
			if (!c.equals(d)) {
				if (!c.equals(d2v)) {
					if (!c.equals(z)) {
						if (!c.equals(w2i)) {
							if (!c.equals(v)) {
								if (!c.equals(i)) {
									if (!c.equals(x)) {
										if (!c.equals(c2z)) {
											if (!c.equals(w)) {
												if (!y.equals(z)) {
													if (!a.equals(c)) {
														if (!a.equals(y)) {
															if (!a.equals(d)) {
																if (!a.equals(d2v)) {
																	if (!a.equals(z)) {
																		if (!a.equals(w2i)) {
																			if (!a.equals(v)) {
																				if (!a.equals(i)) {
																					if (!a.equals(x)) {
																						if (!a.equals(b)) {
																							if (!a.equals(c2z)) {
																								if (!a.equals(a2x)) {
																									if (!a.equals(w)) {
																										if (!a.equals(
																												b2y)) {
																											if (!d.equals(
																													y)) {
																												if (!d.equals(
																														d2v)) {
																													if (!d.equals(
																															z)) {
																														if (!d.equals(
																																w2i)) {
																															if (!d.equals(
																																	v)) {
																																if (!d.equals(
																																		i)) {
																																	if (!d.equals(
																																			x)) {
																																		if (!d.equals(
																																				w)) {
																																			if (!d2v.equals(
																																					y)) {
																																				if (!d2v.equals(
																																						z)) {
																																					if (!d2v.equals(
																																							w2i)) {
																																						if (!d2v.equals(
																																								v)) {
																																							if (!d2v.equals(
																																									i)) {
																																								if (!d2v.equals(
																																										x)) {
																																									if (!d2v.equals(
																																											w)) {
																																										if (!w2i.equals(
																																												y)) {
																																											if (!w2i.equals(
																																													z)) {
																																												if (!w2i.equals(
																																														x)) {
																																													if (!v.equals(
																																															y)) {
																																														if (!v.equals(
																																																z)) {
																																															if (!v.equals(
																																																	w2i)) {
																																																if (!v.equals(
																																																		x)) {
																																																	if (!v.equals(
																																																			w)) {
																																																		if (!i.equals(
																																																				y)) {
																																																			if (!i.equals(
																																																					z)) {
																																																				if (!i.equals(
																																																						w2i)) {
																																																					if (!i.equals(
																																																							v)) {
																																																						if (!i.equals(
																																																								x)) {
																																																							if (!i.equals(
																																																									w)) {
																																																								if (!x.equals(
																																																										y)) {
																																																									if (!x.equals(
																																																											z)) {
																																																										if (!b.equals(
																																																												c)) {
																																																											if (!b.equals(
																																																													y)) {
																																																												if (!b.equals(
																																																														d)) {
																																																													if (!b.equals(
																																																															d2v)) {
																																																														if (!b.equals(
																																																																z)) {
																																																															if (!b.equals(
																																																																	w2i)) {
																																																																if (!b.equals(
																																																																		v)) {
																																																																	if (!b.equals(
																																																																			i)) {
																																																																		if (!b.equals(
																																																																				x)) {
																																																																			if (!b.equals(
																																																																					c2z)) {
																																																																				if (!b.equals(
																																																																						w)) {
																																																																					if (!b.equals(
																																																																							b2y)) {
																																																																						if (!c2z.equals(
																																																																								y)) {
																																																																							if (!c2z.equals(
																																																																									d)) {
																																																																								if (!c2z.equals(
																																																																										d2v)) {
																																																																									if (!c2z.equals(
																																																																											z)) {
																																																																										if (!c2z.equals(
																																																																												w2i)) {
																																																																											if (!c2z.equals(
																																																																													v)) {
																																																																												if (!c2z.equals(
																																																																														i)) {
																																																																													if (!c2z.equals(
																																																																															x)) {
																																																																														if (!c2z.equals(
																																																																																w)) {
																																																																															if (!a2x.equals(
																																																																																	c)) {
																																																																																if (!a2x.equals(
																																																																																		y)) {
																																																																																	if (!a2x.equals(
																																																																																			d)) {
																																																																																		if (!a2x.equals(
																																																																																				d2v)) {
																																																																																			if (!a2x.equals(
																																																																																					z)) {
																																																																																				if (!a2x.equals(
																																																																																						w2i)) {
																																																																																					if (!a2x.equals(
																																																																																							v)) {
																																																																																						if (!a2x.equals(
																																																																																								i)) {
																																																																																							if (!a2x.equals(
																																																																																									x)) {
																																																																																								if (!a2x.equals(
																																																																																										b)) {
																																																																																									if (!a2x.equals(
																																																																																											c2z)) {
																																																																																										if (!a2x.equals(
																																																																																												w)) {
																																																																																											if (!a2x.equals(
																																																																																													b2y)) {
																																																																																												if (!w.equals(
																																																																																														y)) {
																																																																																													if (!w.equals(
																																																																																															z)) {
																																																																																														if (!w.equals(
																																																																																																w2i)) {
																																																																																															if (!w.equals(
																																																																																																	x)) {
																																																																																																if (!b2y.equals(
																																																																																																		c)) {
																																																																																																	if (!b2y.equals(
																																																																																																			y)) {
																																																																																																		if (!b2y.equals(
																																																																																																				d)) {
																																																																																																			if (!b2y.equals(
																																																																																																					d2v)) {
																																																																																																				if (!b2y.equals(
																																																																																																						z)) {
																																																																																																					if (!b2y.equals(
																																																																																																							w2i)) {
																																																																																																						if (!b2y.equals(
																																																																																																								v)) {
																																																																																																							if (!b2y.equals(
																																																																																																									i)) {
																																																																																																								if (!b2y.equals(
																																																																																																										x)) {
																																																																																																									if (!b2y.equals(
																																																																																																											c2z)) {
																																																																																																										if (!b2y.equals(
																																																																																																												w)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													c,
																																																																																																													y,
																																																																																																													a,
																																																																																																													d,
																																																																																																													d2v,
																																																																																																													z,
																																																																																																													w2i,
																																																																																																													v,
																																																																																																													i,
																																																																																																													x,
																																																																																																													b,
																																																																																																													c2z,
																																																																																																													a2x,
																																																																																																													w,
																																																																																																													b2y };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject c, EObject y, EObject a, EObject d, EObject d2v, EObject z, EObject v,
			EObject i, EObject x, EObject b, EObject c2z, EObject a2x, EObject w, EObject b2y) {
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilell2branchbb";
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String d2v__d____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String d2v__v____target_name_prime = "target";
		String v__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____last);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(v__z____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, c, y, a, d, d2v, z, v, i, x, b, c2z, a2x, w, b2y, c__d____last, a__b____last,
				d2v__d____source, y__x____next, d2v__v____target, v__z____next, i__z____negative, i__x____positive,
				c2z__z____target, c2z__c____source, a2x__x____target, a2x__a____source, w__a____first, w__c____next,
				b2y__y____target, b2y__b____source };
	}

	public static final void pattern_whilell2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whilell2branchbb _this, PerformRuleResult ruleresult, EObject c, EObject y, EObject a, EObject d,
			EObject d2v, EObject z, EObject w2i, EObject v, EObject i, EObject x, EObject b, EObject c2z, EObject a2x,
			EObject w, EObject b2y) {
		_this.registerObjects_FWD(ruleresult, c, y, a, d, d2v, z, w2i, v, i, x, b, c2z, a2x, w, b2y);

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
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("d");
		EObject _localVariable_3 = match.getObject("b");
		EObject _localVariable_4 = match.getObject("w");
		EObject tmpC = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpW = _localVariable_4;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpD instanceof Assignment) {
					Assignment d = (Assignment) tmpD;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							return new Object[] { c, a, d, b, w, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_2_2_corematch_blackBBBFFBBB(While c, While a,
			Assignment d, Assignment b, While w, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
								"source")) {
							Branch i = w2i.getTarget();
							if (i != null) {
								_result.add(new Object[] { c, a, d, w2i, i, b, w, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_2_3_findcontext_blackBBBBBBB(While c, While a,
			Assignment d, S2B w2i, Branch i, Assignment b, While w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						if (d.equals(c.getLast())) {
							if (b.equals(a.getLast())) {
								if (i.equals(w2i.getTarget())) {
									if (a.equals(w.getFirst())) {
										if (c.equals(w.getNext())) {
											if (w.equals(w2i.getSource())) {
												_result.add(new Object[] { c, a, d, w2i, i, b, w });
											}
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

	public static final Object[] pattern_whilell2branchbb_2_3_findcontext_greenBBBBBBBFFFFFFF(While c, While a,
			Assignment d, S2B w2i, Branch i, Assignment b, While w) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String w2i__i____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(w);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____last);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { c, a, d, w2i, i, b, w, isApplicableMatch, c__d____last, a__b____last, w2i__i____target,
				w__a____first, w__c____next, w2i__w____source };
	}

	public static final Object[] pattern_whilell2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, While c, While a, Assignment d, S2B w2i, Branch i, Assignment b,
			While w) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, a, d, w2i, i, b, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, a, d, w2i, i, b, w };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, While c, While a, Assignment d, S2B w2i, Branch i, Assignment b,
			While w) {
		Object[] result_pattern_whilell2branchbb_2_4_solveCSP_binding = pattern_whilell2branchbb_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, c, a, d, w2i, i, b, w);
		if (result_pattern_whilell2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_2_4_solveCSP_black = pattern_whilell2branchbb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, a, d, w2i, i, b, w };
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
			Match match, Command y, Branch z, Command v, Branch i, Branch x) {
		if (!v.equals(y)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!x.equals(z)) {
						return new Object[] { _this, match, y, z, v, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_10_2_SolveCSP_bindingFBBBBBBB(whilell2branchbb _this,
			Match match, Command y, Branch z, Command v, Branch i, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, z, v, i, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, z, v, i, x };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(whilell2branchbb _this,
			Match match, Command y, Branch z, Command v, Branch i, Branch x) {
		Object[] result_pattern_whilell2branchbb_10_2_SolveCSP_binding = pattern_whilell2branchbb_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, y, z, v, i, x);
		if (result_pattern_whilell2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_10_2_SolveCSP_black = pattern_whilell2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, z, v, i, x };
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
			Command y, Branch z, Command v, Branch i, Branch x) {
		if (!v.equals(y)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!x.equals(z)) {
						return new Object[] { match, y, z, v, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_10_4_collectelementstobetranslated_greenBBBBBBFFFF(
			Match match, Command y, Branch z, Command v, Branch i, Branch x) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(v);
		match.getToBeTranslatedNodes().add(x);
		String y__x____next_name_prime = "next";
		String v__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(v__z____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		y__x____next.setName(y__x____next_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { match, y, z, v, i, x, y__x____next, v__z____next, i__z____negative, i__x____positive };
	}

	public static final Object[] pattern_whilell2branchbb_10_5_collectcontextelements_blackBBBBBB(Match match,
			Command y, Branch z, Command v, Branch i, Branch x) {
		if (!v.equals(y)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!x.equals(z)) {
						return new Object[] { match, y, z, v, i, x };
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
			whilell2branchbb _this, Match match, Command y, Branch z, Command v, Branch i, Branch x) {
		_this.registerObjectsToMatch_BWD(match, y, z, v, i, x);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("y");
		EObject _localVariable_1 = isApplicableMatch.getObject("z");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("v");
		EObject _localVariable_4 = isApplicableMatch.getObject("i");
		EObject _localVariable_5 = isApplicableMatch.getObject("x");
		EObject _localVariable_6 = isApplicableMatch.getObject("w");
		EObject tmpY = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpV = _localVariable_3;
		EObject tmpI = _localVariable_4;
		EObject tmpX = _localVariable_5;
		EObject tmpW = _localVariable_6;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpV instanceof Command) {
						Command v = (Command) tmpV;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								if (tmpW instanceof While) {
									While w = (While) tmpW;
									return new Object[] { y, z, w2i, v, i, x, w, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_11_1_performtransformation_blackBBBBBBBFBB(Command y,
			Branch z, S2B w2i, Command v, Branch i, Branch x, While w, whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!v.equals(y)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!x.equals(z)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { y, z, w2i, v, i, x, w, csp, _this, isApplicableMatch };
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
			Command y = (Command) result_pattern_whilell2branchbb_11_1_performtransformation_binding[0];
			Branch z = (Branch) result_pattern_whilell2branchbb_11_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whilell2branchbb_11_1_performtransformation_binding[2];
			Command v = (Command) result_pattern_whilell2branchbb_11_1_performtransformation_binding[3];
			Branch i = (Branch) result_pattern_whilell2branchbb_11_1_performtransformation_binding[4];
			Branch x = (Branch) result_pattern_whilell2branchbb_11_1_performtransformation_binding[5];
			While w = (While) result_pattern_whilell2branchbb_11_1_performtransformation_binding[6];

			Object[] result_pattern_whilell2branchbb_11_1_performtransformation_black = pattern_whilell2branchbb_11_1_performtransformation_blackBBBBBBBFBB(
					y, z, w2i, v, i, x, w, _this, isApplicableMatch);
			if (result_pattern_whilell2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilell2branchbb_11_1_performtransformation_black[7];

				return new Object[] { y, z, w2i, v, i, x, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_11_1_performtransformation_greenFBFFFBBBFFFBF(Command y,
			Branch z, Command v, Branch x, While w) {
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		w.setNext(c);
		w.setFirst(a);
		c.setLast(d);
		d2v.setSource(d);
		d2v.setTarget(v);
		a.setLast(b);
		c2z.setTarget(z);
		c2z.setSource(c);
		a2x.setTarget(x);
		a2x.setSource(a);
		b2y.setTarget(y);
		b2y.setSource(b);
		return new Object[] { c, y, a, d, d2v, z, v, x, b, c2z, a2x, w, b2y };
	}

	public static final Object[] pattern_whilell2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(While c,
			Command y, While a, Assignment d, S2N d2v, Branch z, Command v, Branch x, Assignment b, S2B c2z, S2B a2x,
			S2N b2y) {
		if (!a.equals(c)) {
			if (!v.equals(y)) {
				if (!x.equals(z)) {
					if (!b.equals(d)) {
						if (!a2x.equals(c2z)) {
							if (!b2y.equals(d2v)) {
								return new Object[] { c, y, a, d, d2v, z, v, x, b, c2z, a2x, b2y };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(While c,
			Command y, While a, Assignment d, S2N d2v, Branch z, Command v, Branch x, Assignment b, S2B c2z, S2B a2x,
			S2N b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(c);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getTranslatedElements().add(v);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, c, y, a, d, d2v, z, v, x, b, c2z, a2x, b2y };
	}

	public static final Object[] pattern_whilell2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject y, EObject a, EObject d, EObject d2v, EObject z,
			EObject w2i, EObject v, EObject i, EObject x, EObject b, EObject c2z, EObject a2x, EObject w, EObject b2y) {
		if (!c.equals(y)) {
			if (!c.equals(d)) {
				if (!c.equals(d2v)) {
					if (!c.equals(z)) {
						if (!c.equals(w2i)) {
							if (!c.equals(v)) {
								if (!c.equals(i)) {
									if (!c.equals(x)) {
										if (!c.equals(c2z)) {
											if (!c.equals(w)) {
												if (!y.equals(z)) {
													if (!a.equals(c)) {
														if (!a.equals(y)) {
															if (!a.equals(d)) {
																if (!a.equals(d2v)) {
																	if (!a.equals(z)) {
																		if (!a.equals(w2i)) {
																			if (!a.equals(v)) {
																				if (!a.equals(i)) {
																					if (!a.equals(x)) {
																						if (!a.equals(b)) {
																							if (!a.equals(c2z)) {
																								if (!a.equals(a2x)) {
																									if (!a.equals(w)) {
																										if (!a.equals(
																												b2y)) {
																											if (!d.equals(
																													y)) {
																												if (!d.equals(
																														d2v)) {
																													if (!d.equals(
																															z)) {
																														if (!d.equals(
																																w2i)) {
																															if (!d.equals(
																																	v)) {
																																if (!d.equals(
																																		i)) {
																																	if (!d.equals(
																																			x)) {
																																		if (!d.equals(
																																				w)) {
																																			if (!d2v.equals(
																																					y)) {
																																				if (!d2v.equals(
																																						z)) {
																																					if (!d2v.equals(
																																							w2i)) {
																																						if (!d2v.equals(
																																								v)) {
																																							if (!d2v.equals(
																																									i)) {
																																								if (!d2v.equals(
																																										x)) {
																																									if (!d2v.equals(
																																											w)) {
																																										if (!w2i.equals(
																																												y)) {
																																											if (!w2i.equals(
																																													z)) {
																																												if (!w2i.equals(
																																														x)) {
																																													if (!v.equals(
																																															y)) {
																																														if (!v.equals(
																																																z)) {
																																															if (!v.equals(
																																																	w2i)) {
																																																if (!v.equals(
																																																		x)) {
																																																	if (!v.equals(
																																																			w)) {
																																																		if (!i.equals(
																																																				y)) {
																																																			if (!i.equals(
																																																					z)) {
																																																				if (!i.equals(
																																																						w2i)) {
																																																					if (!i.equals(
																																																							v)) {
																																																						if (!i.equals(
																																																								x)) {
																																																							if (!i.equals(
																																																									w)) {
																																																								if (!x.equals(
																																																										y)) {
																																																									if (!x.equals(
																																																											z)) {
																																																										if (!b.equals(
																																																												c)) {
																																																											if (!b.equals(
																																																													y)) {
																																																												if (!b.equals(
																																																														d)) {
																																																													if (!b.equals(
																																																															d2v)) {
																																																														if (!b.equals(
																																																																z)) {
																																																															if (!b.equals(
																																																																	w2i)) {
																																																																if (!b.equals(
																																																																		v)) {
																																																																	if (!b.equals(
																																																																			i)) {
																																																																		if (!b.equals(
																																																																				x)) {
																																																																			if (!b.equals(
																																																																					c2z)) {
																																																																				if (!b.equals(
																																																																						w)) {
																																																																					if (!b.equals(
																																																																							b2y)) {
																																																																						if (!c2z.equals(
																																																																								y)) {
																																																																							if (!c2z.equals(
																																																																									d)) {
																																																																								if (!c2z.equals(
																																																																										d2v)) {
																																																																									if (!c2z.equals(
																																																																											z)) {
																																																																										if (!c2z.equals(
																																																																												w2i)) {
																																																																											if (!c2z.equals(
																																																																													v)) {
																																																																												if (!c2z.equals(
																																																																														i)) {
																																																																													if (!c2z.equals(
																																																																															x)) {
																																																																														if (!c2z.equals(
																																																																																w)) {
																																																																															if (!a2x.equals(
																																																																																	c)) {
																																																																																if (!a2x.equals(
																																																																																		y)) {
																																																																																	if (!a2x.equals(
																																																																																			d)) {
																																																																																		if (!a2x.equals(
																																																																																				d2v)) {
																																																																																			if (!a2x.equals(
																																																																																					z)) {
																																																																																				if (!a2x.equals(
																																																																																						w2i)) {
																																																																																					if (!a2x.equals(
																																																																																							v)) {
																																																																																						if (!a2x.equals(
																																																																																								i)) {
																																																																																							if (!a2x.equals(
																																																																																									x)) {
																																																																																								if (!a2x.equals(
																																																																																										b)) {
																																																																																									if (!a2x.equals(
																																																																																											c2z)) {
																																																																																										if (!a2x.equals(
																																																																																												w)) {
																																																																																											if (!a2x.equals(
																																																																																													b2y)) {
																																																																																												if (!w.equals(
																																																																																														y)) {
																																																																																													if (!w.equals(
																																																																																															z)) {
																																																																																														if (!w.equals(
																																																																																																w2i)) {
																																																																																															if (!w.equals(
																																																																																																	x)) {
																																																																																																if (!b2y.equals(
																																																																																																		c)) {
																																																																																																	if (!b2y.equals(
																																																																																																			y)) {
																																																																																																		if (!b2y.equals(
																																																																																																				d)) {
																																																																																																			if (!b2y.equals(
																																																																																																					d2v)) {
																																																																																																				if (!b2y.equals(
																																																																																																						z)) {
																																																																																																					if (!b2y.equals(
																																																																																																							w2i)) {
																																																																																																						if (!b2y.equals(
																																																																																																								v)) {
																																																																																																							if (!b2y.equals(
																																																																																																									i)) {
																																																																																																								if (!b2y.equals(
																																																																																																										x)) {
																																																																																																									if (!b2y.equals(
																																																																																																											c2z)) {
																																																																																																										if (!b2y.equals(
																																																																																																												w)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													c,
																																																																																																													y,
																																																																																																													a,
																																																																																																													d,
																																																																																																													d2v,
																																																																																																													z,
																																																																																																													w2i,
																																																																																																													v,
																																																																																																													i,
																																																																																																													x,
																																																																																																													b,
																																																																																																													c2z,
																																																																																																													a2x,
																																																																																																													w,
																																																																																																													b2y };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject c, EObject y, EObject a, EObject d, EObject d2v, EObject z, EObject v,
			EObject i, EObject x, EObject b, EObject c2z, EObject a2x, EObject w, EObject b2y) {
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilell2branchbb";
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String d2v__d____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String d2v__v____target_name_prime = "target";
		String v__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____last);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(v__z____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, c, y, a, d, d2v, z, v, i, x, b, c2z, a2x, w, b2y, c__d____last, a__b____last,
				d2v__d____source, y__x____next, d2v__v____target, v__z____next, i__z____negative, i__x____positive,
				c2z__z____target, c2z__c____source, a2x__x____target, a2x__a____source, w__a____first, w__c____next,
				b2y__y____target, b2y__b____source };
	}

	public static final void pattern_whilell2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whilell2branchbb _this, PerformRuleResult ruleresult, EObject c, EObject y, EObject a, EObject d,
			EObject d2v, EObject z, EObject w2i, EObject v, EObject i, EObject x, EObject b, EObject c2z, EObject a2x,
			EObject w, EObject b2y) {
		_this.registerObjects_BWD(ruleresult, c, y, a, d, d2v, z, w2i, v, i, x, b, c2z, a2x, w, b2y);

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
		EObject _localVariable_1 = match.getObject("z");
		EObject _localVariable_2 = match.getObject("v");
		EObject _localVariable_3 = match.getObject("i");
		EObject _localVariable_4 = match.getObject("x");
		EObject tmpY = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpV = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpX = _localVariable_4;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (tmpV instanceof Command) {
					Command v = (Command) tmpV;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							return new Object[] { y, z, v, i, x, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_12_2_corematch_blackBBFBBBFB(Command y, Branch z,
			Command v, Branch i, Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!v.equals(y)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!x.equals(z)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
								"target")) {
							Statement tmpW = w2i.getSource();
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								_result.add(new Object[] { y, z, w2i, v, i, x, w, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilell2branchbb_12_3_findcontext_blackBBBBBBB(Command y, Branch z,
			S2B w2i, Command v, Branch i, Branch x, While w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!v.equals(y)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!x.equals(z)) {
						if (x.equals(y.getNext())) {
							if (z.equals(v.getNext())) {
								if (z.equals(i.getNegative())) {
									if (x.equals(i.getPositive())) {
										if (i.equals(w2i.getTarget())) {
											if (w.equals(w2i.getSource())) {
												_result.add(new Object[] { y, z, w2i, v, i, x, w });
											}
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

	public static final Object[] pattern_whilell2branchbb_12_3_findcontext_greenBBBBBBBFFFFFFF(Command y, Branch z,
			S2B w2i, Command v, Branch i, Branch x, While w) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String y__x____next_name_prime = "next";
		String v__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(v);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(v__z____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		y__x____next.setName(y__x____next_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { y, z, w2i, v, i, x, w, isApplicableMatch, y__x____next, v__z____next, i__z____negative,
				i__x____positive, w2i__i____target, w2i__w____source };
	}

	public static final Object[] pattern_whilell2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(whilell2branchbb _this,
			IsApplicableMatch isApplicableMatch, Command y, Branch z, S2B w2i, Command v, Branch i, Branch x, While w) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, y, z, w2i, v, i, x, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, y, z, w2i, v, i, x, w };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whilell2branchbb _this, IsApplicableMatch isApplicableMatch, Command y, Branch z, S2B w2i, Command v,
			Branch i, Branch x, While w) {
		Object[] result_pattern_whilell2branchbb_12_4_solveCSP_binding = pattern_whilell2branchbb_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, y, z, w2i, v, i, x, w);
		if (result_pattern_whilell2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whilell2branchbb_12_4_solveCSP_black = pattern_whilell2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilell2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, y, z, w2i, v, i, x, w };
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
		for (Graph __DEC_y_root_746602 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_1BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_117256 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_117256)) {
							if (!i.equals(__DEC_y_positive_117256)) {
								if (!x.equals(__DEC_y_positive_117256)) {
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

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_2BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_851565 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_851565)) {
							if (!i.equals(__DEC_y_negative_851565)) {
								if (!x.equals(__DEC_y_negative_851565)) {
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

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_449527 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_436082 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_436082)) {
							if (!i.equals(__DEC_z_positive_436082)) {
								if (!x.equals(__DEC_z_positive_436082)) {
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

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_882675 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_882675)) {
							if (!i.equals(__DEC_z_negative_882675)) {
								if (!x.equals(__DEC_z_negative_882675)) {
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

	public static final Object[] pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_6B(Command v) {
		for (Graph __DEC_v_root_915981 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
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
					for (Branch __DEC_v_positive_826140 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!z.equals(__DEC_v_positive_826140)) {
							if (!i.equals(__DEC_v_positive_826140)) {
								if (!x.equals(__DEC_v_positive_826140)) {
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
					for (Branch __DEC_v_negative_998093 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!z.equals(__DEC_v_negative_998093)) {
							if (!i.equals(__DEC_v_negative_998093)) {
								if (!x.equals(__DEC_v_negative_998093)) {
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
		for (Graph __DEC_x_root_865652 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_969397 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_969397)) {
							if (!z.equals(__DEC_x_positive_969397)) {
								if (!i.equals(__DEC_x_positive_969397)) {
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
					for (Branch __DEC_x_negative_728070 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_728070)) {
							if (!z.equals(__DEC_x_negative_728070)) {
								if (!i.equals(__DEC_x_negative_728070)) {
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
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpY = _edge_next.getSrc();
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			EObject tmpX = _edge_next.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (x.equals(y.getNext())) {
					if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_0B(y) == null) {
						if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_9B(x) == null) {
							if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_14BB(x, y) == null) {
								if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_17BB(x, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!i.equals(x)) {
											Node tmpZ = i.getNegative();
											if (tmpZ instanceof Branch) {
												Branch z = (Branch) tmpZ;
												if (!i.equals(z)) {
													if (!x.equals(z)) {
														if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_13BB(
																i, y) == null) {
															if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_16BB(
																	i, y) == null) {
																if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_26BB(
																		i, x) == null) {
																	if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_1BBBB(
																			y, z, i, x) == null) {
																		if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_2BBBB(
																				y, z, i, x) == null) {
																			if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_3B(
																					z) == null) {
																				if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(
																						z, i, x) == null) {
																					if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(
																							z, i, x) == null) {
																						if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_10BBB(
																								x, z, i) == null) {
																							if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_11BBB(
																									x, z, i) == null) {
																								if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_12BB(
																										z, y) == null) {
																									if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																											z,
																											y) == null) {
																										if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_24BB(
																												z,
																												x) == null) {
																											if (pattern_whilell2branchbb_20_2_testcorematchandDECs_black_nac_25BB(
																													z,
																													x) == null) {
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
																																												y,
																																												z,
																																												v,
																																												i,
																																												x,
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
			whilell2branchbb _this, Match match, Command y, Branch z, Command v, Branch i, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, z, v, i, x);
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
		for (Decision __DEC_c_positive_233414 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_777266 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_839502 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_839502)) {
							if (!a.equals(__DEC_c_first_839502)) {
								if (!w.equals(__DEC_c_first_839502)) {
									return new Object[] { c, a, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_22446 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_22446)) {
							if (!a.equals(__DEC_c_last_22446)) {
								if (!w.equals(__DEC_c_last_22446)) {
									return new Object[] { c, a, w };
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
		for (Program __DEC_c_first_481845 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_5B(While a) {
		for (Decision __DEC_a_positive_48044 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_6B(While a) {
		for (Decision __DEC_a_negative_77131 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(While a, While c,
			While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_974254 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_974254)) {
							if (!c.equals(__DEC_a_last_974254)) {
								if (!w.equals(__DEC_a_last_974254)) {
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_8B(While a) {
		for (Program __DEC_a_first_629496 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_9B(Assignment d) {
		for (Decision __DEC_d_positive_595773 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_10B(Assignment d) {
		for (Decision __DEC_d_negative_403795 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_11BBBB(Assignment d,
			While c, While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_first_251470 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!c.equals(__DEC_d_first_251470)) {
							if (!a.equals(__DEC_d_first_251470)) {
								if (!w.equals(__DEC_d_first_251470)) {
									return new Object[] { d, c, a, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_12BBBB(Assignment d,
			While c, While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_last_229550 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!c.equals(__DEC_d_last_229550)) {
							if (!a.equals(__DEC_d_last_229550)) {
								if (!w.equals(__DEC_d_last_229550)) {
									return new Object[] { d, c, a, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_13B(Assignment d) {
		for (Program __DEC_d_first_891752 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_14B(Assignment b) {
		for (Decision __DEC_b_positive_387728 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_15B(Assignment b) {
		for (Decision __DEC_b_negative_883382 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_16BBBB(Assignment b,
			While c, While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_first_40432 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "first")) {
						if (!c.equals(__DEC_b_first_40432)) {
							if (!a.equals(__DEC_b_first_40432)) {
								if (!w.equals(__DEC_b_first_40432)) {
									return new Object[] { b, c, a, w };
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
			While c, While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_last_625330 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!c.equals(__DEC_b_last_625330)) {
							if (!a.equals(__DEC_b_last_625330)) {
								if (!w.equals(__DEC_b_last_625330)) {
									return new Object[] { b, c, a, w };
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
		for (Program __DEC_b_first_745974 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_19BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_20BB(While c,
			Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
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
		if (d.equals(w.getFirst())) {
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_24BB(While w,
			Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_25BB(While c,
			Assignment b) {
		if (b.equals(c.getFirst())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_26BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
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

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_28BB(While c,
			Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_29BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
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
								if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_9B(d) == null) {
									if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_10B(d) == null) {
										if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_13B(
												d) == null) {
											if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_20BB(c,
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
																				if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_22BB(
																						w, d) == null) {
																					if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_24BB(
																							w, d) == null) {
																						if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(
																								c, a, w) == null) {
																							if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(
																									c, a, w) == null) {
																								if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_5B(
																										a) == null) {
																									if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_6B(
																											a) == null) {
																										if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(
																												a, c,
																												w) == null) {
																											if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_8B(
																													a) == null) {
																												if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_11BBBB(
																														d,
																														c,
																														a,
																														w) == null) {
																													if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_12BBBB(
																															d,
																															c,
																															a,
																															w) == null) {
																														if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																																c,
																																a) == null) {
																															if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																																	a,
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
																																					a,
																																					w) == null) {
																																				if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_17BBBB(
																																						b,
																																						c,
																																						a,
																																						w) == null) {
																																					if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_18B(
																																							b) == null) {
																																						if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_25BB(
																																								c,
																																								b) == null) {
																																							if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_26BB(
																																									a,
																																									b) == null) {
																																								if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_27BB(
																																										w,
																																										b) == null) {
																																									if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_28BB(
																																											c,
																																											b) == null) {
																																										if (pattern_whilell2branchbb_21_2_testcorematchandDECs_black_nac_29BB(
																																												w,
																																												b) == null) {
																																											_result.add(
																																													new Object[] {
																																															c,
																																															a,
																																															d,
																																															b,
																																															w,
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
			whilell2branchbb _this, Match match, While c, While a, Assignment d, Assignment b, While w) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, c, a, d, b, w);
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
		EObject _localVariable_1 = targetMatch.getObject("y");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = sourceMatch.getObject("d");
		EObject _localVariable_4 = targetMatch.getObject("z");
		EObject _localVariable_5 = targetMatch.getObject("v");
		EObject _localVariable_6 = targetMatch.getObject("i");
		EObject _localVariable_7 = targetMatch.getObject("x");
		EObject _localVariable_8 = sourceMatch.getObject("b");
		EObject _localVariable_9 = sourceMatch.getObject("w");
		EObject tmpC = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpV = _localVariable_5;
		EObject tmpI = _localVariable_6;
		EObject tmpX = _localVariable_7;
		EObject tmpB = _localVariable_8;
		EObject tmpW = _localVariable_9;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpD instanceof Assignment) {
						Assignment d = (Assignment) tmpD;
						if (tmpZ instanceof Branch) {
							Branch z = (Branch) tmpZ;
							if (tmpV instanceof Command) {
								Command v = (Command) tmpV;
								if (tmpI instanceof Branch) {
									Branch i = (Branch) tmpI;
									if (tmpX instanceof Branch) {
										Branch x = (Branch) tmpX;
										if (tmpB instanceof Assignment) {
											Assignment b = (Assignment) tmpB;
											if (tmpW instanceof While) {
												While w = (While) tmpW;
												return new Object[] { c, y, a, d, z, v, i, x, b, w, sourceMatch,
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

	public static final Object[] pattern_whilell2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(While c, Command y,
			While a, Assignment d, Branch z, Command v, Branch i, Branch x, Assignment b, While w, Match sourceMatch,
			Match targetMatch) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!v.equals(y)) {
						if (!i.equals(z)) {
							if (!i.equals(x)) {
								if (!x.equals(z)) {
									if (!b.equals(d)) {
										if (!sourceMatch.equals(targetMatch)) {
											return new Object[] { c, y, a, d, z, v, i, x, b, w, sourceMatch,
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
			Command y = (Command) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[1];
			While a = (While) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[2];
			Assignment d = (Assignment) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[3];
			Branch z = (Branch) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[4];
			Command v = (Command) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[5];
			Branch i = (Branch) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[6];
			Branch x = (Branch) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[7];
			Assignment b = (Assignment) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[8];
			While w = (While) result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_black = pattern_whilell2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					c, y, a, d, z, v, i, x, b, w, sourceMatch, targetMatch);
			if (result_pattern_whilell2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { c, y, a, d, z, v, i, x, b, w, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(whilell2branchbb _this,
			While c, Command y, While a, Assignment d, Branch z, Command v, Branch i, Branch x, Assignment b, While w,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(c, y, a, d, z, v, i, x, b, w, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, c, y, a, d, z, v, i, x, b, w, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilell2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			whilell2branchbb _this, While c, Command y, While a, Assignment d, Branch z, Command v, Branch i, Branch x,
			Assignment b, While w, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilell2branchbb_24_3_solvecsp_binding = pattern_whilell2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, c, y, a, d, z, v, i, x, b, w, sourceMatch, targetMatch);
		if (result_pattern_whilell2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whilell2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whilell2branchbb_24_3_solvecsp_black = pattern_whilell2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whilell2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, c, y, a, d, z, v, i, x, b, w, sourceMatch, targetMatch };
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
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				if (w.equals(w2i.getSource())) {
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

	public static final Object[] pattern_whilell2branchbb_24_6_createcorrespondence_blackBBBBBBBBBBB(While c, Command y,
			While a, Assignment d, Branch z, Command v, Branch i, Branch x, Assignment b, While w, CCMatch ccMatch) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!v.equals(y)) {
						if (!i.equals(z)) {
							if (!i.equals(x)) {
								if (!x.equals(z)) {
									if (!b.equals(d)) {
										return new Object[] { c, y, a, d, z, v, i, x, b, w, ccMatch };
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

	public static final Object[] pattern_whilell2branchbb_24_6_createcorrespondence_greenBBBBFBBBBFFFB(While c,
			Command y, While a, Assignment d, Branch z, Command v, Branch x, Assignment b, CCMatch ccMatch) {
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		d2v.setSource(d);
		d2v.setTarget(v);
		ccMatch.getCreateCorr().add(d2v);
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { c, y, a, d, d2v, z, v, x, b, c2z, a2x, b2y, ccMatch };
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
		for (Decision __DEC_c_positive_1918 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_23402 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_2BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_708984 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_708984)) {
							if (!a.equals(__DEC_c_first_708984)) {
								if (!w.equals(__DEC_c_first_708984)) {
									return new Object[] { c, a, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_3BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_190854 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_190854)) {
							if (!a.equals(__DEC_c_last_190854)) {
								if (!w.equals(__DEC_c_last_190854)) {
									return new Object[] { c, a, w };
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
		for (Program __DEC_c_first_386818 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_5B(While a) {
		for (Decision __DEC_a_positive_839896 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_6B(While a) {
		for (Decision __DEC_a_negative_497555 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_7BBB(While a, While c,
			While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_403615 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_403615)) {
							if (!c.equals(__DEC_a_last_403615)) {
								if (!w.equals(__DEC_a_last_403615)) {
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_8B(While a) {
		for (Program __DEC_a_first_228357 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_9B(Assignment d) {
		for (Decision __DEC_d_positive_112411 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_10B(Assignment d) {
		for (Decision __DEC_d_negative_234881 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_11BBBB(Assignment d, While c,
			While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_first_616965 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!c.equals(__DEC_d_first_616965)) {
							if (!a.equals(__DEC_d_first_616965)) {
								if (!w.equals(__DEC_d_first_616965)) {
									return new Object[] { d, c, a, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_12BBBB(Assignment d, While c,
			While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_last_800060 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!c.equals(__DEC_d_last_800060)) {
							if (!a.equals(__DEC_d_last_800060)) {
								if (!w.equals(__DEC_d_last_800060)) {
									return new Object[] { d, c, a, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_13B(Assignment d) {
		for (Program __DEC_d_first_668212 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_14B(Assignment b) {
		for (Decision __DEC_b_positive_914923 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_15B(Assignment b) {
		for (Decision __DEC_b_negative_724563 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_16BBBB(Assignment b, While c,
			While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_first_911240 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "first")) {
						if (!c.equals(__DEC_b_first_911240)) {
							if (!a.equals(__DEC_b_first_911240)) {
								if (!w.equals(__DEC_b_first_911240)) {
									return new Object[] { b, c, a, w };
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
			While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_last_408646 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!c.equals(__DEC_b_last_408646)) {
							if (!a.equals(__DEC_b_last_408646)) {
								if (!w.equals(__DEC_b_last_408646)) {
									return new Object[] { b, c, a, w };
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
		for (Program __DEC_b_first_74499 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_19BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_20BB(While c, Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
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
		if (d.equals(w.getFirst())) {
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

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_24BB(While w, Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_25BB(While c, Assignment b) {
		if (b.equals(c.getFirst())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_26BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_27BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_28BB(While c, Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_29BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_27_1_matchtggpattern_blackBBBBB(While c, While a,
			Assignment d, Assignment b, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						if (d.equals(c.getLast())) {
							if (b.equals(a.getLast())) {
								if (a.equals(w.getFirst())) {
									if (c.equals(w.getNext())) {
										if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_0B(c) == null) {
											if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_1B(c) == null) {
												if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_2BBB(c, a,
														w) == null) {
													if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_3BBB(c,
															a, w) == null) {
														if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_4B(
																c) == null) {
															if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_5B(
																	a) == null) {
																if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_6B(
																		a) == null) {
																	if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_7BBB(
																			a, c, w) == null) {
																		if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_8B(
																				a) == null) {
																			if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_9B(
																					d) == null) {
																				if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_10B(
																						d) == null) {
																					if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_11BBBB(
																							d, c, a, w) == null) {
																						if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_12BBBB(
																								d, c, a, w) == null) {
																							if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_13B(
																									d) == null) {
																								if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_14B(
																										b) == null) {
																									if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_15B(
																											b) == null) {
																										if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_16BBBB(
																												b, c, a,
																												w) == null) {
																											if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_17BBBB(
																													b,
																													c,
																													a,
																													w) == null) {
																												if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_18B(
																														b) == null) {
																													if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_19BB(
																															c,
																															a) == null) {
																														if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_20BB(
																																c,
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
																																				w,
																																				d) == null) {
																																			if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_25BB(
																																					c,
																																					b) == null) {
																																				if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_26BB(
																																						a,
																																						b) == null) {
																																					if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_27BB(
																																							w,
																																							b) == null) {
																																						if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_28BB(
																																								c,
																																								b) == null) {
																																							if (pattern_whilell2branchbb_27_1_matchtggpattern_black_nac_29BB(
																																									w,
																																									b) == null) {
																																								return new Object[] {
																																										c,
																																										a,
																																										d,
																																										b,
																																										w };
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
		for (Graph __DEC_y_root_257040 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_1BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_496445 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_496445)) {
							if (!i.equals(__DEC_y_positive_496445)) {
								if (!x.equals(__DEC_y_positive_496445)) {
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

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_2BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_123347 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_123347)) {
							if (!i.equals(__DEC_y_negative_123347)) {
								if (!x.equals(__DEC_y_negative_123347)) {
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

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_98764 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_4BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_412672 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_412672)) {
							if (!i.equals(__DEC_z_positive_412672)) {
								if (!x.equals(__DEC_z_positive_412672)) {
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

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_5BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_786169 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_786169)) {
							if (!i.equals(__DEC_z_negative_786169)) {
								if (!x.equals(__DEC_z_negative_786169)) {
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

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_6B(Command v) {
		for (Graph __DEC_v_root_376869 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
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
					for (Branch __DEC_v_positive_533922 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!z.equals(__DEC_v_positive_533922)) {
							if (!i.equals(__DEC_v_positive_533922)) {
								if (!x.equals(__DEC_v_positive_533922)) {
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
					for (Branch __DEC_v_negative_396137 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!z.equals(__DEC_v_negative_396137)) {
							if (!i.equals(__DEC_v_negative_396137)) {
								if (!x.equals(__DEC_v_negative_396137)) {
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
		for (Graph __DEC_x_root_550684 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_252806 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_252806)) {
							if (!z.equals(__DEC_x_positive_252806)) {
								if (!i.equals(__DEC_x_positive_252806)) {
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
					for (Branch __DEC_x_negative_604623 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_604623)) {
							if (!z.equals(__DEC_x_negative_604623)) {
								if (!i.equals(__DEC_x_negative_604623)) {
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

	public static final Object[] pattern_whilell2branchbb_28_1_matchtggpattern_blackBBBBB(Command y, Branch z,
			Command v, Branch i, Branch x) {
		if (!v.equals(y)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!x.equals(z)) {
						if (x.equals(y.getNext())) {
							if (z.equals(v.getNext())) {
								if (z.equals(i.getNegative())) {
									if (x.equals(i.getPositive())) {
										if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_0B(y) == null) {
											if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_1BBBB(y, z, i,
													x) == null) {
												if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_2BBBB(y, z,
														i, x) == null) {
													if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_3B(
															z) == null) {
														if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_4BBB(
																z, i, x) == null) {
															if (pattern_whilell2branchbb_28_1_matchtggpattern_black_nac_5BBB(
																	z, i, x) == null) {
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
																																							y,
																																							z,
																																							v,
																																							i,
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
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Object[] pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
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
					Branch i = w2i.getTarget();
					if (i != null) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult, w2i) == null) {
								if (pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										i) == null) {
									if (pattern_whilell2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											w) == null) {
										_result.add(
												new Object[] { w2iList, w2i, i, w, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_whilell2branchbb_29_6_perform_greenFFFFFFFBFFFFBFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		ruleResult.getTargetObjects().add(y);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		c.setLast(d);
		ruleResult.getSourceObjects().add(d);
		d2v.setSource(d);
		ruleResult.getCorrObjects().add(d2v);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		d2v.setTarget(v);
		v.setNext(z);
		ruleResult.getTargetObjects().add(v);
		y.setNext(x);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		a.setLast(b);
		ruleResult.getSourceObjects().add(b);
		c2z.setTarget(z);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c, y, a, d, d2v, z, v, i, x, b, c2z, a2x, w, b2y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whilell2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whilell2branchbbImpl
