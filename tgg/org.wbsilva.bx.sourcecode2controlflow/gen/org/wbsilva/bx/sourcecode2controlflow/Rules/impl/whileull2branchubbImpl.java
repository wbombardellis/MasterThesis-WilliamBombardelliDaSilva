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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whileull2branchubb;

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
 * An implementation of the model object '<em><b>whileull2branchubb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whileull2branchubbImpl extends AbstractRuleImpl implements whileull2branchubb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whileull2branchubbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhileull2branchubb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, While w, While a, Assignment b, Assignment d, While c) {

		Object[] result1_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_0_1_initialbindings_blackBBBBBBB(this, match, w, a, b, d, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", "
					+ "[d] = " + d + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, w, a, b, d, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", "
					+ "[d] = " + d + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileull2branchubbImpl.pattern_whileull2branchubb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileull2branchubbImpl
					.pattern_whileull2branchubb_0_4_collectelementstobetranslated_blackBBBBBB(match, w, a, b, d, c);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[w] = " + w + ", "
								+ "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[c] = " + c + ".");
			}
			whileull2branchubbImpl.pattern_whileull2branchubb_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(match,
					w, a, b, d, c);
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a__b____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge c__d____last = (EMoflonEdge) result4_green[10];

			Object[] result5_black = whileull2branchubbImpl
					.pattern_whileull2branchubb_0_5_collectcontextelements_blackBBBBBB(match, w, a, b, d, c);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[w] = " + w + ", "
								+ "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[c] = " + c + ".");
			}
			whileull2branchubbImpl.pattern_whileull2branchubb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileull2branchubbImpl.pattern_whileull2branchubb_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					w, a, b, d, c);
			return whileull2branchubbImpl.pattern_whileull2branchubb_0_7_expressionF();
		} else {
			return whileull2branchubbImpl.pattern_whileull2branchubb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		While w = (While) result1_bindingAndBlack[0];
		Branch i = (Branch) result1_bindingAndBlack[1];
		While a = (While) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		Assignment b = (Assignment) result1_bindingAndBlack[4];
		Assignment d = (Assignment) result1_bindingAndBlack[5];
		While c = (While) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_1_1_performtransformation_greenFFBBFFFFFBBBF(i, a, b, d, c);
		Command y = (Command) result1_green[0];
		Branch x = (Branch) result1_green[1];
		S2B c2z = (S2B) result1_green[4];
		Branch z = (Branch) result1_green[5];
		S2N b2y = (S2N) result1_green[6];
		Command v = (Command) result1_green[7];
		S2N d2v = (S2N) result1_green[8];
		S2B a2x = (S2B) result1_green[12];

		Object[] result2_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(y, x, a, c2z, z, b2y, v,
						d2v, b, d, c, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[x] = " + x
					+ ", " + "[a] = " + a + ", " + "[c2z] = " + c2z + ", " + "[z] = " + z + ", " + "[b2y] = " + b2y
					+ ", " + "[v] = " + v + ", " + "[d2v] = " + d2v + ", " + "[b] = " + b + ", " + "[d] = " + d + ", "
					+ "[c] = " + c + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(y, x, a, c2z, z, b2y, v,
						d2v, b, d, c, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, y, x, w, i, a,
						c2z, z, b2y, v, w2i, d2v, b, d, c, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[i] = " + i + ", "
					+ "[a] = " + a + ", " + "[c2z] = " + c2z + ", " + "[z] = " + z + ", " + "[b2y] = " + b2y + ", "
					+ "[v] = " + v + ", " + "[w2i] = " + w2i + ", " + "[d2v] = " + d2v + ", " + "[b] = " + b + ", "
					+ "[d] = " + d + ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ".");
		}
		whileull2branchubbImpl
				.pattern_whileull2branchubb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(ruleresult,
						y, x, w, i, a, c2z, z, b2y, v, d2v, b, d, c, a2x);
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[32];

		// 
		// 
		whileull2branchubbImpl.pattern_whileull2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, y, x, w, i, a, c2z, z, b2y, v, w2i, d2v, b, d, c, a2x);
		return whileull2branchubbImpl.pattern_whileull2branchubb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileull2branchubbImpl.pattern_whileull2branchubb_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		While w = (While) result2_binding[0];
		While a = (While) result2_binding[1];
		Assignment b = (Assignment) result2_binding[2];
		Assignment d = (Assignment) result2_binding[3];
		While c = (While) result2_binding[4];
		for (Object[] result2_black : whileull2branchubbImpl.pattern_whileull2branchubb_2_2_corematch_blackBFBFBBBB(w,
				a, b, d, c, match)) {
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whileull2branchubbImpl
					.pattern_whileull2branchubb_2_3_findcontext_blackBBBBBBB(w, i, a, w2i, b, d, c)) {
				Object[] result3_green = whileull2branchubbImpl
						.pattern_whileull2branchubb_2_3_findcontext_greenBBBBBBBFFFFFFFF(w, i, a, w2i, b, d, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = whileull2branchubbImpl
						.pattern_whileull2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, w,
								i, a, w2i, b, d, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[i] = " + i
							+ ", " + "[a] = " + a + ", " + "[w2i] = " + w2i + ", " + "[b] = " + b + ", " + "[d] = " + d
							+ ", " + "[c] = " + c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileull2branchubbImpl.pattern_whileull2branchubb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileull2branchubbImpl
							.pattern_whileull2branchubb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileull2branchubbImpl.pattern_whileull2branchubb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileull2branchubbImpl.pattern_whileull2branchubb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, While w, While a, Assignment b, Assignment d, While c) {
		match.registerObject("w", w);
		match.registerObject("a", a);
		match.registerObject("b", b);
		match.registerObject("d", d);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While w, While a, Assignment b, Assignment d, While c) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While w, Branch i, While a, S2B w2i,
			Assignment b, Assignment d, While c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("w2i", w2i);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject y, EObject x, EObject w, EObject i, EObject a,
			EObject c2z, EObject z, EObject b2y, EObject v, EObject w2i, EObject d2v, EObject b, EObject d, EObject c,
			EObject a2x) {
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command y, Branch x, Branch i, Branch z, Command v) {

		Object[] result1_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_10_1_initialbindings_blackBBBBBBB(this, match, y, x, i, z, v);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[i] = " + i + ", "
					+ "[z] = " + z + ", " + "[v] = " + v + ".");
		}

		Object[] result2_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, y, x, i, z, v);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[i] = " + i + ", "
					+ "[z] = " + z + ", " + "[v] = " + v + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileull2branchubbImpl.pattern_whileull2branchubb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileull2branchubbImpl
					.pattern_whileull2branchubb_10_4_collectelementstobetranslated_blackBBBBBB(match, y, x, i, z, v);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[y] = " + y + ", "
								+ "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[v] = " + v + ".");
			}
			whileull2branchubbImpl.pattern_whileull2branchubb_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(match,
					y, x, i, z, v);
			//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge v__z____next = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[10];

			Object[] result5_black = whileull2branchubbImpl
					.pattern_whileull2branchubb_10_5_collectcontextelements_blackBBBBBB(match, y, x, i, z, v);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[y] = " + y + ", "
								+ "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[v] = " + v + ".");
			}
			whileull2branchubbImpl.pattern_whileull2branchubb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileull2branchubbImpl.pattern_whileull2branchubb_10_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					y, x, i, z, v);
			return whileull2branchubbImpl.pattern_whileull2branchubb_10_7_expressionF();
		} else {
			return whileull2branchubbImpl.pattern_whileull2branchubb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Command y = (Command) result1_bindingAndBlack[0];
		Branch x = (Branch) result1_bindingAndBlack[1];
		While w = (While) result1_bindingAndBlack[2];
		Branch i = (Branch) result1_bindingAndBlack[3];
		Branch z = (Branch) result1_bindingAndBlack[4];
		Command v = (Command) result1_bindingAndBlack[5];
		S2B w2i = (S2B) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_11_1_performtransformation_greenBBBFFBFBFFFFF(y, x, w, z, v);
		While a = (While) result1_green[3];
		S2B c2z = (S2B) result1_green[4];
		S2N b2y = (S2N) result1_green[6];
		S2N d2v = (S2N) result1_green[8];
		Assignment b = (Assignment) result1_green[9];
		Assignment d = (Assignment) result1_green[10];
		While c = (While) result1_green[11];
		S2B a2x = (S2B) result1_green[12];

		Object[] result2_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(y, x, a, c2z, z, b2y, v,
						d2v, b, d, c, a2x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[x] = " + x
					+ ", " + "[a] = " + a + ", " + "[c2z] = " + c2z + ", " + "[z] = " + z + ", " + "[b2y] = " + b2y
					+ ", " + "[v] = " + v + ", " + "[d2v] = " + d2v + ", " + "[b] = " + b + ", " + "[d] = " + d + ", "
					+ "[c] = " + c + ", " + "[a2x] = " + a2x + ".");
		}
		Object[] result2_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(y, x, a, c2z, z, b2y, v,
						d2v, b, d, c, a2x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, y, x, w, i, a,
						c2z, z, b2y, v, w2i, d2v, b, d, c, a2x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[i] = " + i + ", "
					+ "[a] = " + a + ", " + "[c2z] = " + c2z + ", " + "[z] = " + z + ", " + "[b2y] = " + b2y + ", "
					+ "[v] = " + v + ", " + "[w2i] = " + w2i + ", " + "[d2v] = " + d2v + ", " + "[b] = " + b + ", "
					+ "[d] = " + d + ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ".");
		}
		whileull2branchubbImpl
				.pattern_whileull2branchubb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(ruleresult,
						y, x, w, i, a, c2z, z, b2y, v, d2v, b, d, c, a2x);
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[32];

		// 
		// 
		whileull2branchubbImpl.pattern_whileull2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, y, x, w, i, a, c2z, z, b2y, v, w2i, d2v, b, d, c, a2x);
		return whileull2branchubbImpl.pattern_whileull2branchubb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileull2branchubbImpl
				.pattern_whileull2branchubb_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command y = (Command) result2_binding[0];
		Branch x = (Branch) result2_binding[1];
		Branch i = (Branch) result2_binding[2];
		Branch z = (Branch) result2_binding[3];
		Command v = (Command) result2_binding[4];
		for (Object[] result2_black : whileull2branchubbImpl.pattern_whileull2branchubb_12_2_corematch_blackBBFBBBFB(y,
				x, i, z, v, match)) {
			While w = (While) result2_black[2];
			S2B w2i = (S2B) result2_black[6];
			// ForEach 
			for (Object[] result3_black : whileull2branchubbImpl
					.pattern_whileull2branchubb_12_3_findcontext_blackBBBBBBB(y, x, w, i, z, v, w2i)) {
				Object[] result3_green = whileull2branchubbImpl
						.pattern_whileull2branchubb_12_3_findcontext_greenBBBBBBBFFFFFFFF(y, x, w, i, z, v, w2i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = whileull2branchubbImpl
						.pattern_whileull2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, y,
								x, w, i, z, v, w2i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[y] = " + y + ", " + "[x] = " + x
							+ ", " + "[w] = " + w + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[v] = " + v
							+ ", " + "[w2i] = " + w2i + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileull2branchubbImpl.pattern_whileull2branchubb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileull2branchubbImpl
							.pattern_whileull2branchubb_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileull2branchubbImpl.pattern_whileull2branchubb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileull2branchubbImpl.pattern_whileull2branchubb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command y, Branch x, Branch i, Branch z, Command v) {
		match.registerObject("y", y);
		match.registerObject("x", x);
		match.registerObject("i", i);
		match.registerObject("z", z);
		match.registerObject("v", v);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command y, Branch x, Branch i, Branch z, Command v) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command y, Branch x, While w, Branch i,
			Branch z, Command v, S2B w2i) {// Create CSP
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
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("v", v);
		isApplicableMatch.registerObject("w2i", w2i);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject y, EObject x, EObject w, EObject i, EObject a,
			EObject c2z, EObject z, EObject b2y, EObject v, EObject w2i, EObject d2v, EObject b, EObject d, EObject c,
			EObject a2x) {
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("c", c);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_143(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileull2branchubbImpl.pattern_whileull2branchubb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileull2branchubbImpl
				.pattern_whileull2branchubb_20_2_testcorematchandDECs_blackFFFFFB(_edge_positive)) {
			Command y = (Command) result2_black[0];
			Branch x = (Branch) result2_black[1];
			Branch i = (Branch) result2_black[2];
			Branch z = (Branch) result2_black[3];
			Command v = (Command) result2_black[4];
			Object[] result2_green = whileull2branchubbImpl
					.pattern_whileull2branchubb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileull2branchubbImpl
					.pattern_whileull2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, y, x, i, z, v)) {
				// 
				if (whileull2branchubbImpl
						.pattern_whileull2branchubb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whileull2branchubbImpl
							.pattern_whileull2branchubb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileull2branchubbImpl.pattern_whileull2branchubb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileull2branchubbImpl.pattern_whileull2branchubb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_143(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileull2branchubbImpl.pattern_whileull2branchubb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileull2branchubbImpl
				.pattern_whileull2branchubb_21_2_testcorematchandDECs_blackFFFFFB(_edge_first)) {
			While w = (While) result2_black[0];
			While a = (While) result2_black[1];
			Assignment b = (Assignment) result2_black[2];
			Assignment d = (Assignment) result2_black[3];
			While c = (While) result2_black[4];
			Object[] result2_green = whileull2branchubbImpl
					.pattern_whileull2branchubb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileull2branchubbImpl
					.pattern_whileull2branchubb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, w, a, b, d, c)) {
				// 
				if (whileull2branchubbImpl
						.pattern_whileull2branchubb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whileull2branchubbImpl
							.pattern_whileull2branchubb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileull2branchubbImpl.pattern_whileull2branchubb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileull2branchubbImpl.pattern_whileull2branchubb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whileull2branchubb");
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
		ruleResult.setRule("whileull2branchubb");
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

		Object[] result1_black = whileull2branchubbImpl.pattern_whileull2branchubb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileull2branchubbImpl.pattern_whileull2branchubb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Command y = (Command) result2_bindingAndBlack[0];
		Branch x = (Branch) result2_bindingAndBlack[1];
		While w = (While) result2_bindingAndBlack[2];
		Branch i = (Branch) result2_bindingAndBlack[3];
		While a = (While) result2_bindingAndBlack[4];
		Branch z = (Branch) result2_bindingAndBlack[5];
		Command v = (Command) result2_bindingAndBlack[6];
		Assignment b = (Assignment) result2_bindingAndBlack[7];
		Assignment d = (Assignment) result2_bindingAndBlack[8];
		While c = (While) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, y, x, w, i, a, z, v, b, d,
						c, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[i] = " + i + ", " + "[a] = "
					+ a + ", " + "[z] = " + z + ", " + "[v] = " + v + ", " + "[b] = " + b + ", " + "[d] = " + d + ", "
					+ "[c] = " + c + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileull2branchubbImpl.pattern_whileull2branchubb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileull2branchubbImpl
					.pattern_whileull2branchubb_24_5_matchcorrcontext_blackBBFBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[2];
				Object[] result5_green = whileull2branchubbImpl
						.pattern_whileull2branchubb_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileull2branchubbImpl
						.pattern_whileull2branchubb_24_6_createcorrespondence_blackBBBBBBBBBBB(y, x, w, i, a, z, v, b,
								d, c, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", "
							+ "[x] = " + x + ", " + "[w] = " + w + ", " + "[i] = " + i + ", " + "[a] = " + a + ", "
							+ "[z] = " + z + ", " + "[v] = " + v + ", " + "[b] = " + b + ", " + "[d] = " + d + ", "
							+ "[c] = " + c + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileull2branchubbImpl.pattern_whileull2branchubb_24_6_createcorrespondence_greenBBBFBFBFBBBFB(y, x, a,
						z, v, b, d, c, ccMatch);
				//nothing S2B c2z = (S2B) result6_green[3];
				//nothing S2N b2y = (S2N) result6_green[5];
				//nothing S2N d2v = (S2N) result6_green[7];
				//nothing S2B a2x = (S2B) result6_green[11];

				Object[] result7_black = whileull2branchubbImpl
						.pattern_whileull2branchubb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileull2branchubbImpl.pattern_whileull2branchubb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whileull2branchubbImpl.pattern_whileull2branchubb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Command y, Branch x, While w, Branch i, While a, Branch z, Command v,
			Assignment b, Assignment d, While c, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While w, While a, Assignment b, Assignment d, While c) {// 
		Object[] result1_black = whileull2branchubbImpl.pattern_whileull2branchubb_27_1_matchtggpattern_blackBBBBB(w, a,
				b, d, c);
		if (result1_black != null) {
			return whileull2branchubbImpl.pattern_whileull2branchubb_27_2_expressionF();
		} else {
			return whileull2branchubbImpl.pattern_whileull2branchubb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command y, Branch x, Branch i, Branch z, Command v) {// 
		Object[] result1_black = whileull2branchubbImpl.pattern_whileull2branchubb_28_1_matchtggpattern_blackBBBBB(y, x,
				i, z, v);
		if (result1_black != null) {
			return whileull2branchubbImpl.pattern_whileull2branchubb_28_2_expressionF();
		} else {
			return whileull2branchubbImpl.pattern_whileull2branchubb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whileull2branchubbImpl.pattern_whileull2branchubb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileull2branchubbImpl.pattern_whileull2branchubb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whileull2branchubbImpl
				.pattern_whileull2branchubb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whileull2branchubbImpl
					.pattern_whileull2branchubb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w, i, w2i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[i] = " + i
						+ ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileull2branchubbImpl.pattern_whileull2branchubb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileull2branchubbImpl.pattern_whileull2branchubb_29_5_checknacs_blackBBB(w, i,
						w2i);
				if (result5_black != null) {

					Object[] result6_black = whileull2branchubbImpl.pattern_whileull2branchubb_29_6_perform_blackBBBB(w,
							i, w2i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
								+ "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileull2branchubbImpl.pattern_whileull2branchubb_29_6_perform_greenFFBBFFFFFFFFFFB(w, i,
							ruleResult);
					//nothing Command y = (Command) result6_green[0];
					//nothing Branch x = (Branch) result6_green[1];
					//nothing While a = (While) result6_green[4];
					//nothing S2B c2z = (S2B) result6_green[5];
					//nothing Branch z = (Branch) result6_green[6];
					//nothing S2N b2y = (S2N) result6_green[7];
					//nothing Command v = (Command) result6_green[8];
					//nothing S2N d2v = (S2N) result6_green[9];
					//nothing Assignment b = (Assignment) result6_green[10];
					//nothing Assignment d = (Assignment) result6_green[11];
					//nothing While c = (While) result6_green[12];
					//nothing S2B a2x = (S2B) result6_green[13];

				} else {
				}

			} else {
			}

		}
		return whileull2branchubbImpl.pattern_whileull2branchubb_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i,
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
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
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
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Assignment) arguments.get(4), (While) arguments.get(5));
		case RulesPackage.WHILEULL2BRANCHUBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Assignment) arguments.get(4), (While) arguments.get(5));
			return null;
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_BRANCH_WHILE_S2B_ASSIGNMENT_ASSIGNMENT_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (S2B) arguments.get(4),
					(Assignment) arguments.get(5), (Assignment) arguments.get(6), (While) arguments.get(7));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4), (Command) arguments.get(5));
		case RulesPackage.WHILEULL2BRANCHUBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4), (Command) arguments.get(5));
			return null;
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Command) arguments.get(5));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_BRANCH_WHILE_BRANCH_BRANCH_COMMAND_S2B:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5), (Command) arguments.get(6), (S2B) arguments.get(7));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_143__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_143((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_143__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_143((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_CC__COMMAND_BRANCH_WHILE_BRANCH_WHILE_BRANCH_COMMAND_ASSIGNMENT_ASSIGNMENT_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Command) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5), (Command) arguments.get(6), (Assignment) arguments.get(7),
					(Assignment) arguments.get(8), (While) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_DEC_FWD__WHILE_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE:
			return checkDEC_FWD((While) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH_BRANCH_COMMAND:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.WHILEULL2BRANCHUBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEULL2BRANCHUBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_BRANCH_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEULL2BRANCHUBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileull2branchubb_0_1_initialbindings_blackBBBBBBB(whileull2branchubb _this,
			Match match, While w, While a, Assignment b, Assignment d, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						return new Object[] { _this, match, w, a, b, d, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_0_2_SolveCSP_bindingFBBBBBBB(whileull2branchubb _this,
			Match match, While w, While a, Assignment b, Assignment d, While c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, w, a, b, d, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, a, b, d, c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whileull2branchubb _this, Match match, While w, While a, Assignment b, Assignment d, While c) {
		Object[] result_pattern_whileull2branchubb_0_2_SolveCSP_binding = pattern_whileull2branchubb_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, w, a, b, d, c);
		if (result_pattern_whileull2branchubb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_0_2_SolveCSP_black = pattern_whileull2branchubb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, a, b, d, c };
			}
		}
		return null;
	}

	public static final boolean pattern_whileull2branchubb_0_3_CheckCSP_expressionFBB(whileull2branchubb _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			While w, While a, Assignment b, Assignment d, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						return new Object[] { match, w, a, b, d, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, While w, While a, Assignment b, Assignment d, While c) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(d);
		match.getToBeTranslatedNodes().add(c);
		String w__a____first_name_prime = "first";
		String a__b____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String c__d____last_name_prime = "last";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____last);
		w__a____first.setName(w__a____first_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		return new Object[] { match, w, a, b, d, c, w__a____first, a__b____first, w__c____next, a__b____last,
				c__d____last };
	}

	public static final Object[] pattern_whileull2branchubb_0_5_collectcontextelements_blackBBBBBB(Match match, While w,
			While a, Assignment b, Assignment d, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						return new Object[] { match, w, a, b, d, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileull2branchubb_0_6_registerobjectstomatch_expressionBBBBBBB(
			whileull2branchubb _this, Match match, While w, While a, Assignment b, Assignment d, While c) {
		_this.registerObjectsToMatch_FWD(match, w, a, b, d, c);

	}

	public static final boolean pattern_whileull2branchubb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileull2branchubb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("b");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject _localVariable_6 = isApplicableMatch.getObject("c");
		EObject tmpW = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpD = _localVariable_5;
		EObject tmpC = _localVariable_6;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (tmpD instanceof Assignment) {
								Assignment d = (Assignment) tmpD;
								if (tmpC instanceof While) {
									While c = (While) tmpC;
									return new Object[] { w, i, a, w2i, b, d, c, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_1_1_performtransformation_blackBBBBBBBFBB(While w, Branch i,
			While a, S2B w2i, Assignment b, Assignment d, While c, whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { w, i, a, w2i, b, d, c, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			whileull2branchubb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileull2branchubb_1_1_performtransformation_binding = pattern_whileull2branchubb_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileull2branchubb_1_1_performtransformation_binding != null) {
			While w = (While) result_pattern_whileull2branchubb_1_1_performtransformation_binding[0];
			Branch i = (Branch) result_pattern_whileull2branchubb_1_1_performtransformation_binding[1];
			While a = (While) result_pattern_whileull2branchubb_1_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whileull2branchubb_1_1_performtransformation_binding[3];
			Assignment b = (Assignment) result_pattern_whileull2branchubb_1_1_performtransformation_binding[4];
			Assignment d = (Assignment) result_pattern_whileull2branchubb_1_1_performtransformation_binding[5];
			While c = (While) result_pattern_whileull2branchubb_1_1_performtransformation_binding[6];

			Object[] result_pattern_whileull2branchubb_1_1_performtransformation_black = pattern_whileull2branchubb_1_1_performtransformation_blackBBBBBBBFBB(
					w, i, a, w2i, b, d, c, _this, isApplicableMatch);
			if (result_pattern_whileull2branchubb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileull2branchubb_1_1_performtransformation_black[7];

				return new Object[] { w, i, a, w2i, b, d, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_1_1_performtransformation_greenFFBBFFFFFBBBF(Branch i,
			While a, Assignment b, Assignment d, While c) {
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		x.setPositive(y);
		i.setPositive(x);
		y.setNext(x);
		c2z.setSource(c);
		c2z.setTarget(z);
		i.setNegative(z);
		b2y.setTarget(y);
		b2y.setSource(b);
		v.setNext(z);
		d2v.setTarget(v);
		d2v.setSource(d);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { y, x, i, a, c2z, z, b2y, v, d2v, b, d, c, a2x };
	}

	public static final Object[] pattern_whileull2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(Command y,
			Branch x, While a, S2B c2z, Branch z, S2N b2y, Command v, S2N d2v, Assignment b, Assignment d, While c,
			S2B a2x) {
		if (!x.equals(z)) {
			if (!a.equals(c)) {
				if (!b2y.equals(d2v)) {
					if (!v.equals(y)) {
						if (!b.equals(d)) {
							if (!a2x.equals(c2z)) {
								return new Object[] { y, x, a, c2z, z, b2y, v, d2v, b, d, c, a2x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(Command y,
			Branch x, While a, S2B c2z, Branch z, S2N b2y, Command v, S2N d2v, Assignment b, Assignment d, While c,
			S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, y, x, a, c2z, z, b2y, v, d2v, b, d, c, a2x };
	}

	public static final Object[] pattern_whileull2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject y, EObject x, EObject w, EObject i, EObject a, EObject c2z, EObject z,
			EObject b2y, EObject v, EObject w2i, EObject d2v, EObject b, EObject d, EObject c, EObject a2x) {
		if (!y.equals(z)) {
			if (!x.equals(y)) {
				if (!x.equals(z)) {
					if (!w.equals(y)) {
						if (!w.equals(x)) {
							if (!w.equals(z)) {
								if (!w.equals(w2i)) {
									if (!i.equals(y)) {
										if (!i.equals(x)) {
											if (!i.equals(w)) {
												if (!i.equals(z)) {
													if (!i.equals(v)) {
														if (!i.equals(w2i)) {
															if (!a.equals(y)) {
																if (!a.equals(x)) {
																	if (!a.equals(w)) {
																		if (!a.equals(i)) {
																			if (!a.equals(c2z)) {
																				if (!a.equals(z)) {
																					if (!a.equals(b2y)) {
																						if (!a.equals(v)) {
																							if (!a.equals(w2i)) {
																								if (!a.equals(d2v)) {
																									if (!a.equals(b)) {
																										if (!a.equals(
																												d)) {
																											if (!a.equals(
																													c)) {
																												if (!a.equals(
																														a2x)) {
																													if (!c2z.equals(
																															y)) {
																														if (!c2z.equals(
																																x)) {
																															if (!c2z.equals(
																																	w)) {
																																if (!c2z.equals(
																																		i)) {
																																	if (!c2z.equals(
																																			z)) {
																																		if (!c2z.equals(
																																				v)) {
																																			if (!c2z.equals(
																																					w2i)) {
																																				if (!c2z.equals(
																																						d2v)) {
																																					if (!c2z.equals(
																																							d)) {
																																						if (!b2y.equals(
																																								y)) {
																																							if (!b2y.equals(
																																									x)) {
																																								if (!b2y.equals(
																																										w)) {
																																									if (!b2y.equals(
																																											i)) {
																																										if (!b2y.equals(
																																												c2z)) {
																																											if (!b2y.equals(
																																													z)) {
																																												if (!b2y.equals(
																																														v)) {
																																													if (!b2y.equals(
																																															w2i)) {
																																														if (!b2y.equals(
																																																d2v)) {
																																															if (!b2y.equals(
																																																	d)) {
																																																if (!b2y.equals(
																																																		c)) {
																																																	if (!v.equals(
																																																			y)) {
																																																		if (!v.equals(
																																																				x)) {
																																																			if (!v.equals(
																																																					w)) {
																																																				if (!v.equals(
																																																						z)) {
																																																					if (!v.equals(
																																																							w2i)) {
																																																						if (!w2i.equals(
																																																								y)) {
																																																							if (!w2i.equals(
																																																									x)) {
																																																								if (!w2i.equals(
																																																										z)) {
																																																									if (!d2v.equals(
																																																											y)) {
																																																										if (!d2v.equals(
																																																												x)) {
																																																											if (!d2v.equals(
																																																													w)) {
																																																												if (!d2v.equals(
																																																														i)) {
																																																													if (!d2v.equals(
																																																															z)) {
																																																														if (!d2v.equals(
																																																																v)) {
																																																															if (!d2v.equals(
																																																																	w2i)) {
																																																																if (!b.equals(
																																																																		y)) {
																																																																	if (!b.equals(
																																																																			x)) {
																																																																		if (!b.equals(
																																																																				w)) {
																																																																			if (!b.equals(
																																																																					i)) {
																																																																				if (!b.equals(
																																																																						c2z)) {
																																																																					if (!b.equals(
																																																																							z)) {
																																																																						if (!b.equals(
																																																																								b2y)) {
																																																																							if (!b.equals(
																																																																									v)) {
																																																																								if (!b.equals(
																																																																										w2i)) {
																																																																									if (!b.equals(
																																																																											d2v)) {
																																																																										if (!b.equals(
																																																																												d)) {
																																																																											if (!b.equals(
																																																																													c)) {
																																																																												if (!d.equals(
																																																																														y)) {
																																																																													if (!d.equals(
																																																																															x)) {
																																																																														if (!d.equals(
																																																																																w)) {
																																																																															if (!d.equals(
																																																																																	i)) {
																																																																																if (!d.equals(
																																																																																		z)) {
																																																																																	if (!d.equals(
																																																																																			v)) {
																																																																																		if (!d.equals(
																																																																																				w2i)) {
																																																																																			if (!d.equals(
																																																																																					d2v)) {
																																																																																				if (!c.equals(
																																																																																						y)) {
																																																																																					if (!c.equals(
																																																																																							x)) {
																																																																																						if (!c.equals(
																																																																																								w)) {
																																																																																							if (!c.equals(
																																																																																									i)) {
																																																																																								if (!c.equals(
																																																																																										c2z)) {
																																																																																									if (!c.equals(
																																																																																											z)) {
																																																																																										if (!c.equals(
																																																																																												v)) {
																																																																																											if (!c.equals(
																																																																																													w2i)) {
																																																																																												if (!c.equals(
																																																																																														d2v)) {
																																																																																													if (!c.equals(
																																																																																															d)) {
																																																																																														if (!a2x.equals(
																																																																																																y)) {
																																																																																															if (!a2x.equals(
																																																																																																	x)) {
																																																																																																if (!a2x.equals(
																																																																																																		w)) {
																																																																																																	if (!a2x.equals(
																																																																																																			i)) {
																																																																																																		if (!a2x.equals(
																																																																																																				c2z)) {
																																																																																																			if (!a2x.equals(
																																																																																																					z)) {
																																																																																																				if (!a2x.equals(
																																																																																																						b2y)) {
																																																																																																					if (!a2x.equals(
																																																																																																							v)) {
																																																																																																						if (!a2x.equals(
																																																																																																								w2i)) {
																																																																																																							if (!a2x.equals(
																																																																																																									d2v)) {
																																																																																																								if (!a2x.equals(
																																																																																																										b)) {
																																																																																																									if (!a2x.equals(
																																																																																																											d)) {
																																																																																																										if (!a2x.equals(
																																																																																																												c)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													y,
																																																																																																													x,
																																																																																																													w,
																																																																																																													i,
																																																																																																													a,
																																																																																																													c2z,
																																																																																																													z,
																																																																																																													b2y,
																																																																																																													v,
																																																																																																													w2i,
																																																																																																													d2v,
																																																																																																													b,
																																																																																																													d,
																																																																																																													c,
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

	public static final Object[] pattern_whileull2branchubb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject y, EObject x, EObject w, EObject i, EObject a, EObject c2z, EObject z,
			EObject b2y, EObject v, EObject d2v, EObject b, EObject d, EObject c, EObject a2x) {
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileull2branchubb";
		String x__y____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String a__b____first_name_prime = "first";
		String c2z__z____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String v__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String a__b____last_name_prime = "last";
		String d2v__v____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String d2v__d____source_name_prime = "source";
		String c2z__c____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String c__d____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(x__y____positive);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____first);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(v__z____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, y, x, w, i, a, c2z, z, b2y, v, d2v, b, d, c, a2x, x__y____positive,
				w__a____first, i__x____positive, a__b____first, c2z__z____target, b2y__y____target, w__c____next,
				v__z____next, i__z____negative, a__b____last, d2v__v____target, b2y__b____source, d2v__d____source,
				c2z__c____source, y__x____next, c__d____last, a2x__a____source, a2x__x____target };
	}

	public static final void pattern_whileull2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whileull2branchubb _this, PerformRuleResult ruleresult, EObject y, EObject x, EObject w, EObject i,
			EObject a, EObject c2z, EObject z, EObject b2y, EObject v, EObject w2i, EObject d2v, EObject b, EObject d,
			EObject c, EObject a2x) {
		_this.registerObjects_FWD(ruleresult, y, x, w, i, a, c2z, z, b2y, v, w2i, d2v, b, d, c, a2x);

	}

	public static final PerformRuleResult pattern_whileull2branchubb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_2_1_preparereturnvalue_bindingFB(whileull2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whileull2branchubb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_2_1_preparereturnvalue_bindingAndBlackFFB(
			whileull2branchubb _this) {
		Object[] result_pattern_whileull2branchubb_2_1_preparereturnvalue_binding = pattern_whileull2branchubb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileull2branchubb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileull2branchubb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileull2branchubb_2_1_preparereturnvalue_black = pattern_whileull2branchubb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileull2branchubb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileull2branchubb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileull2branchubb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileull2branchubb_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("w");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("b");
		EObject _localVariable_3 = match.getObject("d");
		EObject _localVariable_4 = match.getObject("c");
		EObject tmpW = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpC = _localVariable_4;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpD instanceof Assignment) {
						Assignment d = (Assignment) tmpD;
						if (tmpC instanceof While) {
							While c = (While) tmpC;
							return new Object[] { w, a, b, d, c, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_2_2_corematch_blackBFBFBBBB(While w, While a,
			Assignment b, Assignment d, While c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
								"source")) {
							Branch i = w2i.getTarget();
							if (i != null) {
								_result.add(new Object[] { w, i, a, w2i, b, d, c, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_2_3_findcontext_blackBBBBBBB(While w, Branch i,
			While a, S2B w2i, Assignment b, Assignment d, While c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						if (a.equals(w.getFirst())) {
							if (b.equals(a.getFirst())) {
								if (c.equals(w.getNext())) {
									if (w.equals(w2i.getSource())) {
										if (i.equals(w2i.getTarget())) {
											if (b.equals(a.getLast())) {
												if (d.equals(c.getLast())) {
													_result.add(new Object[] { w, i, a, w2i, b, d, c });
												}
											}
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

	public static final Object[] pattern_whileull2branchubb_2_3_findcontext_greenBBBBBBBFFFFFFFF(While w, Branch i,
			While a, S2B w2i, Assignment b, Assignment d, While c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__a____first_name_prime = "first";
		String a__b____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		String a__b____last_name_prime = "last";
		String c__d____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(c);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____last);
		w__a____first.setName(w__a____first_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		return new Object[] { w, i, a, w2i, b, d, c, isApplicableMatch, w__a____first, a__b____first, w__c____next,
				w2i__w____source, w2i__i____target, a__b____last, c__d____last };
	}

	public static final Object[] pattern_whileull2branchubb_2_4_solveCSP_bindingFBBBBBBBBB(whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, While a, S2B w2i, Assignment b, Assignment d,
			While c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, w, i, a, w2i, b, d, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, i, a, w2i, b, d, c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whileull2branchubb _this, IsApplicableMatch isApplicableMatch, While w, Branch i, While a, S2B w2i,
			Assignment b, Assignment d, While c) {
		Object[] result_pattern_whileull2branchubb_2_4_solveCSP_binding = pattern_whileull2branchubb_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, w, i, a, w2i, b, d, c);
		if (result_pattern_whileull2branchubb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_2_4_solveCSP_black = pattern_whileull2branchubb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, i, a, w2i, b, d, c };
			}
		}
		return null;
	}

	public static final boolean pattern_whileull2branchubb_2_5_checkCSP_expressionFBB(whileull2branchubb _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileull2branchubb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileull2branchubb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileull2branchubb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_10_1_initialbindings_blackBBBBBBB(whileull2branchubb _this,
			Match match, Command y, Branch x, Branch i, Branch z, Command v) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!v.equals(y)) {
						return new Object[] { _this, match, y, x, i, z, v };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_10_2_SolveCSP_bindingFBBBBBBB(whileull2branchubb _this,
			Match match, Command y, Branch x, Branch i, Branch z, Command v) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, x, i, z, v);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, x, i, z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whileull2branchubb _this, Match match, Command y, Branch x, Branch i, Branch z, Command v) {
		Object[] result_pattern_whileull2branchubb_10_2_SolveCSP_binding = pattern_whileull2branchubb_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, y, x, i, z, v);
		if (result_pattern_whileull2branchubb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_10_2_SolveCSP_black = pattern_whileull2branchubb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, x, i, z, v };
			}
		}
		return null;
	}

	public static final boolean pattern_whileull2branchubb_10_3_CheckCSP_expressionFBB(whileull2branchubb _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_10_4_collectelementstobetranslated_blackBBBBBB(Match match,
			Command y, Branch x, Branch i, Branch z, Command v) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!v.equals(y)) {
						return new Object[] { match, y, x, i, z, v };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Command y, Branch x, Branch i, Branch z, Command v) {
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(v);
		String x__y____positive_name_prime = "positive";
		String i__x____positive_name_prime = "positive";
		String v__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String y__x____next_name_prime = "next";
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(x__y____positive);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(v__z____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		x__y____positive.setName(x__y____positive_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { match, y, x, i, z, v, x__y____positive, i__x____positive, v__z____next, i__z____negative,
				y__x____next };
	}

	public static final Object[] pattern_whileull2branchubb_10_5_collectcontextelements_blackBBBBBB(Match match,
			Command y, Branch x, Branch i, Branch z, Command v) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!v.equals(y)) {
						return new Object[] { match, y, x, i, z, v };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whileull2branchubb_10_6_registerobjectstomatch_expressionBBBBBBB(
			whileull2branchubb _this, Match match, Command y, Branch x, Branch i, Branch z, Command v) {
		_this.registerObjectsToMatch_BWD(match, y, x, i, z, v);

	}

	public static final boolean pattern_whileull2branchubb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileull2branchubb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("y");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("w");
		EObject _localVariable_3 = isApplicableMatch.getObject("i");
		EObject _localVariable_4 = isApplicableMatch.getObject("z");
		EObject _localVariable_5 = isApplicableMatch.getObject("v");
		EObject _localVariable_6 = isApplicableMatch.getObject("w2i");
		EObject tmpY = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpV = _localVariable_5;
		EObject tmpW2i = _localVariable_6;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpZ instanceof Branch) {
							Branch z = (Branch) tmpZ;
							if (tmpV instanceof Command) {
								Command v = (Command) tmpV;
								if (tmpW2i instanceof S2B) {
									S2B w2i = (S2B) tmpW2i;
									return new Object[] { y, x, w, i, z, v, w2i, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_11_1_performtransformation_blackBBBBBBBFBB(Command y,
			Branch x, While w, Branch i, Branch z, Command v, S2B w2i, whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!v.equals(y)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { y, x, w, i, z, v, w2i, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			whileull2branchubb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileull2branchubb_11_1_performtransformation_binding = pattern_whileull2branchubb_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileull2branchubb_11_1_performtransformation_binding != null) {
			Command y = (Command) result_pattern_whileull2branchubb_11_1_performtransformation_binding[0];
			Branch x = (Branch) result_pattern_whileull2branchubb_11_1_performtransformation_binding[1];
			While w = (While) result_pattern_whileull2branchubb_11_1_performtransformation_binding[2];
			Branch i = (Branch) result_pattern_whileull2branchubb_11_1_performtransformation_binding[3];
			Branch z = (Branch) result_pattern_whileull2branchubb_11_1_performtransformation_binding[4];
			Command v = (Command) result_pattern_whileull2branchubb_11_1_performtransformation_binding[5];
			S2B w2i = (S2B) result_pattern_whileull2branchubb_11_1_performtransformation_binding[6];

			Object[] result_pattern_whileull2branchubb_11_1_performtransformation_black = pattern_whileull2branchubb_11_1_performtransformation_blackBBBBBBBFBB(
					y, x, w, i, z, v, w2i, _this, isApplicableMatch);
			if (result_pattern_whileull2branchubb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileull2branchubb_11_1_performtransformation_black[7];

				return new Object[] { y, x, w, i, z, v, w2i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_11_1_performtransformation_greenBBBFFBFBFFFFF(Command y,
			Branch x, While w, Branch z, Command v) {
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		w.setFirst(a);
		c2z.setTarget(z);
		b2y.setTarget(y);
		d2v.setTarget(v);
		a.setFirst(b);
		a.setLast(b);
		b2y.setSource(b);
		d2v.setSource(d);
		w.setNext(c);
		c2z.setSource(c);
		c.setLast(d);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { y, x, w, a, c2z, z, b2y, v, d2v, b, d, c, a2x };
	}

	public static final Object[] pattern_whileull2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(Command y,
			Branch x, While a, S2B c2z, Branch z, S2N b2y, Command v, S2N d2v, Assignment b, Assignment d, While c,
			S2B a2x) {
		if (!x.equals(z)) {
			if (!a.equals(c)) {
				if (!b2y.equals(d2v)) {
					if (!v.equals(y)) {
						if (!b.equals(d)) {
							if (!a2x.equals(c2z)) {
								return new Object[] { y, x, a, c2z, z, b2y, v, d2v, b, d, c, a2x };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(Command y,
			Branch x, While a, S2B c2z, Branch z, S2N b2y, Command v, S2N d2v, Assignment b, Assignment d, While c,
			S2B a2x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2x);
		return new Object[] { ruleresult, y, x, a, c2z, z, b2y, v, d2v, b, d, c, a2x };
	}

	public static final Object[] pattern_whileull2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject y, EObject x, EObject w, EObject i, EObject a, EObject c2z, EObject z,
			EObject b2y, EObject v, EObject w2i, EObject d2v, EObject b, EObject d, EObject c, EObject a2x) {
		if (!y.equals(z)) {
			if (!x.equals(y)) {
				if (!x.equals(z)) {
					if (!w.equals(y)) {
						if (!w.equals(x)) {
							if (!w.equals(z)) {
								if (!w.equals(w2i)) {
									if (!i.equals(y)) {
										if (!i.equals(x)) {
											if (!i.equals(w)) {
												if (!i.equals(z)) {
													if (!i.equals(v)) {
														if (!i.equals(w2i)) {
															if (!a.equals(y)) {
																if (!a.equals(x)) {
																	if (!a.equals(w)) {
																		if (!a.equals(i)) {
																			if (!a.equals(c2z)) {
																				if (!a.equals(z)) {
																					if (!a.equals(b2y)) {
																						if (!a.equals(v)) {
																							if (!a.equals(w2i)) {
																								if (!a.equals(d2v)) {
																									if (!a.equals(b)) {
																										if (!a.equals(
																												d)) {
																											if (!a.equals(
																													c)) {
																												if (!a.equals(
																														a2x)) {
																													if (!c2z.equals(
																															y)) {
																														if (!c2z.equals(
																																x)) {
																															if (!c2z.equals(
																																	w)) {
																																if (!c2z.equals(
																																		i)) {
																																	if (!c2z.equals(
																																			z)) {
																																		if (!c2z.equals(
																																				v)) {
																																			if (!c2z.equals(
																																					w2i)) {
																																				if (!c2z.equals(
																																						d2v)) {
																																					if (!c2z.equals(
																																							d)) {
																																						if (!b2y.equals(
																																								y)) {
																																							if (!b2y.equals(
																																									x)) {
																																								if (!b2y.equals(
																																										w)) {
																																									if (!b2y.equals(
																																											i)) {
																																										if (!b2y.equals(
																																												c2z)) {
																																											if (!b2y.equals(
																																													z)) {
																																												if (!b2y.equals(
																																														v)) {
																																													if (!b2y.equals(
																																															w2i)) {
																																														if (!b2y.equals(
																																																d2v)) {
																																															if (!b2y.equals(
																																																	d)) {
																																																if (!b2y.equals(
																																																		c)) {
																																																	if (!v.equals(
																																																			y)) {
																																																		if (!v.equals(
																																																				x)) {
																																																			if (!v.equals(
																																																					w)) {
																																																				if (!v.equals(
																																																						z)) {
																																																					if (!v.equals(
																																																							w2i)) {
																																																						if (!w2i.equals(
																																																								y)) {
																																																							if (!w2i.equals(
																																																									x)) {
																																																								if (!w2i.equals(
																																																										z)) {
																																																									if (!d2v.equals(
																																																											y)) {
																																																										if (!d2v.equals(
																																																												x)) {
																																																											if (!d2v.equals(
																																																													w)) {
																																																												if (!d2v.equals(
																																																														i)) {
																																																													if (!d2v.equals(
																																																															z)) {
																																																														if (!d2v.equals(
																																																																v)) {
																																																															if (!d2v.equals(
																																																																	w2i)) {
																																																																if (!b.equals(
																																																																		y)) {
																																																																	if (!b.equals(
																																																																			x)) {
																																																																		if (!b.equals(
																																																																				w)) {
																																																																			if (!b.equals(
																																																																					i)) {
																																																																				if (!b.equals(
																																																																						c2z)) {
																																																																					if (!b.equals(
																																																																							z)) {
																																																																						if (!b.equals(
																																																																								b2y)) {
																																																																							if (!b.equals(
																																																																									v)) {
																																																																								if (!b.equals(
																																																																										w2i)) {
																																																																									if (!b.equals(
																																																																											d2v)) {
																																																																										if (!b.equals(
																																																																												d)) {
																																																																											if (!b.equals(
																																																																													c)) {
																																																																												if (!d.equals(
																																																																														y)) {
																																																																													if (!d.equals(
																																																																															x)) {
																																																																														if (!d.equals(
																																																																																w)) {
																																																																															if (!d.equals(
																																																																																	i)) {
																																																																																if (!d.equals(
																																																																																		z)) {
																																																																																	if (!d.equals(
																																																																																			v)) {
																																																																																		if (!d.equals(
																																																																																				w2i)) {
																																																																																			if (!d.equals(
																																																																																					d2v)) {
																																																																																				if (!c.equals(
																																																																																						y)) {
																																																																																					if (!c.equals(
																																																																																							x)) {
																																																																																						if (!c.equals(
																																																																																								w)) {
																																																																																							if (!c.equals(
																																																																																									i)) {
																																																																																								if (!c.equals(
																																																																																										c2z)) {
																																																																																									if (!c.equals(
																																																																																											z)) {
																																																																																										if (!c.equals(
																																																																																												v)) {
																																																																																											if (!c.equals(
																																																																																													w2i)) {
																																																																																												if (!c.equals(
																																																																																														d2v)) {
																																																																																													if (!c.equals(
																																																																																															d)) {
																																																																																														if (!a2x.equals(
																																																																																																y)) {
																																																																																															if (!a2x.equals(
																																																																																																	x)) {
																																																																																																if (!a2x.equals(
																																																																																																		w)) {
																																																																																																	if (!a2x.equals(
																																																																																																			i)) {
																																																																																																		if (!a2x.equals(
																																																																																																				c2z)) {
																																																																																																			if (!a2x.equals(
																																																																																																					z)) {
																																																																																																				if (!a2x.equals(
																																																																																																						b2y)) {
																																																																																																					if (!a2x.equals(
																																																																																																							v)) {
																																																																																																						if (!a2x.equals(
																																																																																																								w2i)) {
																																																																																																							if (!a2x.equals(
																																																																																																									d2v)) {
																																																																																																								if (!a2x.equals(
																																																																																																										b)) {
																																																																																																									if (!a2x.equals(
																																																																																																											d)) {
																																																																																																										if (!a2x.equals(
																																																																																																												c)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													y,
																																																																																																													x,
																																																																																																													w,
																																																																																																													i,
																																																																																																													a,
																																																																																																													c2z,
																																																																																																													z,
																																																																																																													b2y,
																																																																																																													v,
																																																																																																													w2i,
																																																																																																													d2v,
																																																																																																													b,
																																																																																																													d,
																																																																																																													c,
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

	public static final Object[] pattern_whileull2branchubb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject y, EObject x, EObject w, EObject i, EObject a, EObject c2z, EObject z,
			EObject b2y, EObject v, EObject d2v, EObject b, EObject d, EObject c, EObject a2x) {
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileull2branchubb";
		String x__y____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String a__b____first_name_prime = "first";
		String c2z__z____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String v__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String a__b____last_name_prime = "last";
		String d2v__v____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String d2v__d____source_name_prime = "source";
		String c2z__c____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String c__d____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(x__y____positive);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____first);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(v__z____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, y, x, w, i, a, c2z, z, b2y, v, d2v, b, d, c, a2x, x__y____positive,
				w__a____first, i__x____positive, a__b____first, c2z__z____target, b2y__y____target, w__c____next,
				v__z____next, i__z____negative, a__b____last, d2v__v____target, b2y__b____source, d2v__d____source,
				c2z__c____source, y__x____next, c__d____last, a2x__a____source, a2x__x____target };
	}

	public static final void pattern_whileull2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whileull2branchubb _this, PerformRuleResult ruleresult, EObject y, EObject x, EObject w, EObject i,
			EObject a, EObject c2z, EObject z, EObject b2y, EObject v, EObject w2i, EObject d2v, EObject b, EObject d,
			EObject c, EObject a2x) {
		_this.registerObjects_BWD(ruleresult, y, x, w, i, a, c2z, z, b2y, v, w2i, d2v, b, d, c, a2x);

	}

	public static final PerformRuleResult pattern_whileull2branchubb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_12_1_preparereturnvalue_bindingFB(
			whileull2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whileull2branchubb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_12_1_preparereturnvalue_bindingAndBlackFFB(
			whileull2branchubb _this) {
		Object[] result_pattern_whileull2branchubb_12_1_preparereturnvalue_binding = pattern_whileull2branchubb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileull2branchubb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileull2branchubb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileull2branchubb_12_1_preparereturnvalue_black = pattern_whileull2branchubb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileull2branchubb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileull2branchubb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileull2branchubb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileull2branchubb_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("i");
		EObject _localVariable_3 = match.getObject("z");
		EObject _localVariable_4 = match.getObject("v");
		EObject tmpY = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpV = _localVariable_4;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (tmpV instanceof Command) {
							Command v = (Command) tmpV;
							return new Object[] { y, x, i, z, v, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_12_2_corematch_blackBBFBBBFB(Command y, Branch x,
			Branch i, Branch z, Command v, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!v.equals(y)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
								"target")) {
							Statement tmpW = w2i.getSource();
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								_result.add(new Object[] { y, x, w, i, z, v, w2i, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_12_3_findcontext_blackBBBBBBB(Command y, Branch x,
			While w, Branch i, Branch z, Command v, S2B w2i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!v.equals(y)) {
						if (y.equals(x.getPositive())) {
							if (x.equals(i.getPositive())) {
								if (z.equals(v.getNext())) {
									if (w.equals(w2i.getSource())) {
										if (i.equals(w2i.getTarget())) {
											if (z.equals(i.getNegative())) {
												if (x.equals(y.getNext())) {
													_result.add(new Object[] { y, x, w, i, z, v, w2i });
												}
											}
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

	public static final Object[] pattern_whileull2branchubb_12_3_findcontext_greenBBBBBBBFFFFFFFF(Command y, Branch x,
			While w, Branch i, Branch z, Command v, S2B w2i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String x__y____positive_name_prime = "positive";
		String i__x____positive_name_prime = "positive";
		String v__z____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		String i__z____negative_name_prime = "negative";
		String y__x____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(v);
		isApplicableMatch.getAllContextElements().add(w2i);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(x__y____positive);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
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
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		x__y____positive.setName(x__y____positive_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { y, x, w, i, z, v, w2i, isApplicableMatch, x__y____positive, i__x____positive,
				v__z____next, w2i__w____source, w2i__i____target, i__z____negative, y__x____next };
	}

	public static final Object[] pattern_whileull2branchubb_12_4_solveCSP_bindingFBBBBBBBBB(whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch, Command y, Branch x, While w, Branch i, Branch z, Command v, S2B w2i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, y, x, w, i, z, v, w2i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, y, x, w, i, z, v, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whileull2branchubb _this, IsApplicableMatch isApplicableMatch, Command y, Branch x, While w, Branch i,
			Branch z, Command v, S2B w2i) {
		Object[] result_pattern_whileull2branchubb_12_4_solveCSP_binding = pattern_whileull2branchubb_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, y, x, w, i, z, v, w2i);
		if (result_pattern_whileull2branchubb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_12_4_solveCSP_black = pattern_whileull2branchubb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, y, x, w, i, z, v, w2i };
			}
		}
		return null;
	}

	public static final boolean pattern_whileull2branchubb_12_5_checkCSP_expressionFBB(whileull2branchubb _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileull2branchubb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileull2branchubb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileull2branchubb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_20_1_preparereturnvalue_bindingFB(
			whileull2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileull2branchubb _this) {
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

	public static final Object[] pattern_whileull2branchubb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whileull2branchubb _this) {
		Object[] result_pattern_whileull2branchubb_20_1_preparereturnvalue_binding = pattern_whileull2branchubb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileull2branchubb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileull2branchubb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileull2branchubb_20_1_preparereturnvalue_black = pattern_whileull2branchubb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileull2branchubb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileull2branchubb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileull2branchubb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_503021 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_1BBBB(Command y,
			Branch x, Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_positive_91139 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_91139)) {
							if (!i.equals(__DEC_y_positive_91139)) {
								if (!z.equals(__DEC_y_positive_91139)) {
									return new Object[] { y, x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_2BBBB(Command y,
			Branch x, Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_negative_284233 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_284233)) {
							if (!i.equals(__DEC_y_negative_284233)) {
								if (!z.equals(__DEC_y_negative_284233)) {
									return new Object[] { y, x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_606416 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_4BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_366530 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_366530)) {
							if (!i.equals(__DEC_x_positive_366530)) {
								if (!z.equals(__DEC_x_positive_366530)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_5BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_626791 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_626791)) {
							if (!i.equals(__DEC_x_negative_626791)) {
								if (!z.equals(__DEC_x_negative_626791)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_692156 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_7BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_139839 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_139839)) {
							if (!x.equals(__DEC_z_positive_139839)) {
								if (!i.equals(__DEC_z_positive_139839)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_8BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_505651 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_505651)) {
							if (!x.equals(__DEC_z_negative_505651)) {
								if (!i.equals(__DEC_z_negative_505651)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_9B(Command v) {
		for (Graph __DEC_v_root_972892 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_10BBBB(Command v,
			Branch x, Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_positive_896897 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!x.equals(__DEC_v_positive_896897)) {
							if (!i.equals(__DEC_v_positive_896897)) {
								if (!z.equals(__DEC_v_positive_896897)) {
									return new Object[] { v, x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_11BBBB(Command v,
			Branch x, Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_negative_582230 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!x.equals(__DEC_v_negative_582230)) {
							if (!i.equals(__DEC_v_negative_582230)) {
								if (!z.equals(__DEC_v_negative_582230)) {
									return new Object[] { v, x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_12BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_13BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_15BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_16BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_17BB(Branch x,
			Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_18BB(Branch i,
			Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_19BB(Branch x,
			Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_20BB(Branch x,
			Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_21BB(Branch i,
			Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_22BB(Branch z,
			Command v) {
		if (v.equals(z.getPositive())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_23BB(Branch x,
			Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_24BB(Branch i,
			Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_25BB(Branch z,
			Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpX = _edge_positive.getSrc();
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			EObject tmpY = _edge_positive.getTrg();
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (y.equals(x.getPositive())) {
					if (x.equals(y.getNext())) {
						if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_3B(x) == null) {
							if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_0B(y) == null) {
								if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_14BB(x, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!i.equals(x)) {
											Node tmpZ = i.getNegative();
											if (tmpZ instanceof Branch) {
												Branch z = (Branch) tmpZ;
												if (!x.equals(z)) {
													if (!i.equals(z)) {
														if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_12BB(
																i, y) == null) {
															if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_15BB(
																	i, y) == null) {
																if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_1BBBB(
																		y, x, i, z) == null) {
																	if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_2BBBB(
																			y, x, i, z) == null) {
																		if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_4BBB(
																				x, i, z) == null) {
																			if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_5BBB(
																					x, i, z) == null) {
																				if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_6B(
																						z) == null) {
																					if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_7BBB(
																							z, x, i) == null) {
																						if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_8BBB(
																								z, x, i) == null) {
																							if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_13BB(
																									z, y) == null) {
																								if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_16BB(
																										z, y) == null) {
																									if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_17BB(
																											x,
																											z) == null) {
																										if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_18BB(
																												i,
																												z) == null) {
																											if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_19BB(
																													x,
																													z) == null) {
																												for (Node tmpV : org.moflon.core.utilities.eMoflonEMFUtil
																														.getOppositeReferenceTyped(
																																z,
																																Node.class,
																																"next")) {
																													if (tmpV instanceof Command) {
																														Command v = (Command) tmpV;
																														if (!v.equals(
																																y)) {
																															if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_9B(
																																	v) == null) {
																																if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_10BBBB(
																																		v,
																																		x,
																																		i,
																																		z) == null) {
																																	if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_11BBBB(
																																			v,
																																			x,
																																			i,
																																			z) == null) {
																																		if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_20BB(
																																				x,
																																				v) == null) {
																																			if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_21BB(
																																					i,
																																					v) == null) {
																																				if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_22BB(
																																						z,
																																						v) == null) {
																																					if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_23BB(
																																							x,
																																							v) == null) {
																																						if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_24BB(
																																								i,
																																								v) == null) {
																																							if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_25BB(
																																									z,
																																									v) == null) {
																																								_result.add(
																																										new Object[] {
																																												y,
																																												x,
																																												i,
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

		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileull2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			whileull2branchubb _this, Match match, Command y, Branch x, Branch i, Branch z, Command v) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, x, i, z, v);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileull2branchubb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileull2branchubb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileull2branchubb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_21_1_preparereturnvalue_bindingFB(
			whileull2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileull2branchubb _this) {
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

	public static final Object[] pattern_whileull2branchubb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whileull2branchubb _this) {
		Object[] result_pattern_whileull2branchubb_21_1_preparereturnvalue_binding = pattern_whileull2branchubb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileull2branchubb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileull2branchubb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileull2branchubb_21_1_preparereturnvalue_black = pattern_whileull2branchubb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileull2branchubb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileull2branchubb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileull2branchubb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_0B(While a) {
		for (Decision __DEC_a_positive_1058 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_1B(While a) {
		for (Decision __DEC_a_negative_198666 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_2BBB(While a, While w,
			While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_174808 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_174808)) {
							if (!w.equals(__DEC_a_last_174808)) {
								if (!c.equals(__DEC_a_last_174808)) {
									return new Object[] { a, w, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_3B(While a) {
		for (Program __DEC_a_first_149954 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_4B(Assignment b) {
		for (Decision __DEC_b_positive_809065 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_negative_724111 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_6BBBB(Assignment b,
			While w, While a, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_b_last_500729 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!w.equals(__DEC_b_last_500729)) {
							if (!a.equals(__DEC_b_last_500729)) {
								if (!c.equals(__DEC_b_last_500729)) {
									return new Object[] { b, w, a, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_633221 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_8B(Assignment d) {
		for (Decision __DEC_d_positive_882794 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_9B(Assignment d) {
		for (Decision __DEC_d_negative_293436 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_10BBBB(Assignment d,
			While w, While a, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_d_first_309714 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!w.equals(__DEC_d_first_309714)) {
							if (!a.equals(__DEC_d_first_309714)) {
								if (!c.equals(__DEC_d_first_309714)) {
									return new Object[] { d, w, a, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_11BBBB(Assignment d,
			While w, While a, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_d_last_868744 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!w.equals(__DEC_d_last_868744)) {
							if (!a.equals(__DEC_d_last_868744)) {
								if (!c.equals(__DEC_d_last_868744)) {
									return new Object[] { d, w, a, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_12B(Assignment d) {
		for (Program __DEC_d_first_353090 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_13B(While c) {
		for (Decision __DEC_c_positive_311632 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_14B(While c) {
		for (Decision __DEC_c_negative_251530 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_15BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_239534 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_239534)) {
							if (!w.equals(__DEC_c_first_239534)) {
								if (!a.equals(__DEC_c_first_239534)) {
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_16BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_434496 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_434496)) {
							if (!w.equals(__DEC_c_last_434496)) {
								if (!a.equals(__DEC_c_last_434496)) {
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_17B(While c) {
		for (Program __DEC_c_first_449246 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_18BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_19BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_20BB(While c,
			Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_21BB(While w,
			Assignment d) {
		if (d.equals(w.getFirst())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_22BB(While a,
			Assignment d) {
		if (d.equals(a.getFirst())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_23BB(While c,
			Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_24BB(While w,
			Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_25BB(While a,
			Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_26BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_27BB(While a, While c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_28BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_29BB(While a, While c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_21_2_testcorematchandDECs_blackFFFFFB(
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
							if (!a.equals(c)) {
								if (!c.equals(w)) {
									Statement tmpB = a.getFirst();
									if (tmpB instanceof Assignment) {
										Assignment b = (Assignment) tmpB;
										if (b.equals(a.getLast())) {
											Statement tmpD = c.getLast();
											if (tmpD instanceof Assignment) {
												Assignment d = (Assignment) tmpD;
												if (!b.equals(d)) {
													if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_0B(
															a) == null) {
														if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_1B(
																a) == null) {
															if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_3B(
																	a) == null) {
																if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_18BB(
																		w, a) == null) {
																	if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_2BBB(
																			a, w, c) == null) {
																		if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_13B(
																				c) == null) {
																			if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_14B(
																					c) == null) {
																				if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_15BBB(
																						c, w, a) == null) {
																					if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_16BBB(
																							c, w, a) == null) {
																						if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_17B(
																								c) == null) {
																							if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_26BB(
																									w, c) == null) {
																								if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_27BB(
																										a, c) == null) {
																									if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_28BB(
																											w,
																											c) == null) {
																										if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_29BB(
																												a,
																												c) == null) {
																											if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_4B(
																													b) == null) {
																												if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_5B(
																														b) == null) {
																													if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_6BBBB(
																															b,
																															w,
																															a,
																															c) == null) {
																														if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_7B(
																																b) == null) {
																															if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_19BB(
																																	w,
																																	b) == null) {
																																if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_20BB(
																																		c,
																																		b) == null) {
																																	if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_8B(
																																			d) == null) {
																																		if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_9B(
																																				d) == null) {
																																			if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_10BBBB(
																																					d,
																																					w,
																																					a,
																																					c) == null) {
																																				if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_11BBBB(
																																						d,
																																						w,
																																						a,
																																						c) == null) {
																																					if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_12B(
																																							d) == null) {
																																						if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_21BB(
																																								w,
																																								d) == null) {
																																							if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_22BB(
																																									a,
																																									d) == null) {
																																								if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_23BB(
																																										c,
																																										d) == null) {
																																									if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_24BB(
																																											w,
																																											d) == null) {
																																										if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_25BB(
																																												a,
																																												d) == null) {
																																											_result.add(
																																													new Object[] {
																																															w,
																																															a,
																																															b,
																																															d,
																																															c,
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileull2branchubb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			whileull2branchubb _this, Match match, While w, While a, Assignment b, Assignment d, While c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, w, a, b, d, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileull2branchubb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileull2branchubb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileull2branchubb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_24_1_prepare_blackB(whileull2branchubb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileull2branchubb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whileull2branchubb_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("y");
		EObject _localVariable_1 = targetMatch.getObject("x");
		EObject _localVariable_2 = sourceMatch.getObject("w");
		EObject _localVariable_3 = targetMatch.getObject("i");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = targetMatch.getObject("z");
		EObject _localVariable_6 = targetMatch.getObject("v");
		EObject _localVariable_7 = sourceMatch.getObject("b");
		EObject _localVariable_8 = sourceMatch.getObject("d");
		EObject _localVariable_9 = sourceMatch.getObject("c");
		EObject tmpY = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		EObject tmpV = _localVariable_6;
		EObject tmpB = _localVariable_7;
		EObject tmpD = _localVariable_8;
		EObject tmpC = _localVariable_9;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpZ instanceof Branch) {
								Branch z = (Branch) tmpZ;
								if (tmpV instanceof Command) {
									Command v = (Command) tmpV;
									if (tmpB instanceof Assignment) {
										Assignment b = (Assignment) tmpB;
										if (tmpD instanceof Assignment) {
											Assignment d = (Assignment) tmpD;
											if (tmpC instanceof While) {
												While c = (While) tmpC;
												return new Object[] { y, x, w, i, a, z, v, b, d, c, targetMatch,
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

	public static final Object[] pattern_whileull2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Command y,
			Branch x, While w, Branch i, While a, Branch z, Command v, Assignment b, Assignment d, While c,
			Match sourceMatch, Match targetMatch) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!a.equals(w)) {
						if (!a.equals(c)) {
							if (!v.equals(y)) {
								if (!b.equals(d)) {
									if (!c.equals(w)) {
										if (!sourceMatch.equals(targetMatch)) {
											return new Object[] { y, x, w, i, a, z, v, b, d, c, sourceMatch,
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

	public static final Object[] pattern_whileull2branchubb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding = pattern_whileull2branchubb_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding != null) {
			Command y = (Command) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[0];
			Branch x = (Branch) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[1];
			While w = (While) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[2];
			Branch i = (Branch) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[3];
			While a = (While) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[4];
			Branch z = (Branch) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[5];
			Command v = (Command) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[6];
			Assignment b = (Assignment) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[7];
			Assignment d = (Assignment) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[8];
			While c = (While) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_black = pattern_whileull2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					y, x, w, i, a, z, v, b, d, c, sourceMatch, targetMatch);
			if (result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { y, x, w, i, a, z, v, b, d, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			whileull2branchubb _this, Command y, Branch x, While w, Branch i, While a, Branch z, Command v,
			Assignment b, Assignment d, While c, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(y, x, w, i, a, z, v, b, d, c, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, y, x, w, i, a, z, v, b, d, c, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			whileull2branchubb _this, Command y, Branch x, While w, Branch i, While a, Branch z, Command v,
			Assignment b, Assignment d, While c, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileull2branchubb_24_3_solvecsp_binding = pattern_whileull2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, y, x, w, i, a, z, v, b, d, c, sourceMatch, targetMatch);
		if (result_pattern_whileull2branchubb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileull2branchubb_24_3_solvecsp_black = pattern_whileull2branchubb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileull2branchubb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, y, x, w, i, a, z, v, b, d, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileull2branchubb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_24_5_matchcorrcontext_blackBBFBB(While w,
			Branch i, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				if (i.equals(w2i.getTarget())) {
					_result.add(new Object[] { w, i, w2i, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whileull2branchubb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whileull2branchubb_24_6_createcorrespondence_blackBBBBBBBBBBB(Command y,
			Branch x, While w, Branch i, While a, Branch z, Command v, Assignment b, Assignment d, While c,
			CCMatch ccMatch) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!a.equals(w)) {
						if (!a.equals(c)) {
							if (!v.equals(y)) {
								if (!b.equals(d)) {
									if (!c.equals(w)) {
										return new Object[] { y, x, w, i, a, z, v, b, d, c, ccMatch };
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

	public static final Object[] pattern_whileull2branchubb_24_6_createcorrespondence_greenBBBFBFBFBBBFB(Command y,
			Branch x, While a, Branch z, Command v, Assignment b, Assignment d, While c, CCMatch ccMatch) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		d2v.setTarget(v);
		d2v.setSource(d);
		ccMatch.getCreateCorr().add(d2v);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { y, x, a, c2z, z, b2y, v, d2v, b, d, c, a2x, ccMatch };
	}

	public static final Object[] pattern_whileull2branchubb_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whileull2branchubb_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whileull2branchubb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whileull2branchubb_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_0B(While a) {
		for (Decision __DEC_a_positive_672949 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_1B(While a) {
		for (Decision __DEC_a_negative_195337 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_2BBB(While a, While w,
			While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_64501 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_64501)) {
							if (!w.equals(__DEC_a_last_64501)) {
								if (!c.equals(__DEC_a_last_64501)) {
									return new Object[] { a, w, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_3B(While a) {
		for (Program __DEC_a_first_793206 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_4B(Assignment b) {
		for (Decision __DEC_b_positive_250184 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_negative_913918 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_6BBBB(Assignment b, While w,
			While a, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_b_last_89590 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!w.equals(__DEC_b_last_89590)) {
							if (!a.equals(__DEC_b_last_89590)) {
								if (!c.equals(__DEC_b_last_89590)) {
									return new Object[] { b, w, a, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_464659 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_8B(Assignment d) {
		for (Decision __DEC_d_positive_716378 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_9B(Assignment d) {
		for (Decision __DEC_d_negative_243742 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_10BBBB(Assignment d, While w,
			While a, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_d_first_938062 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!w.equals(__DEC_d_first_938062)) {
							if (!a.equals(__DEC_d_first_938062)) {
								if (!c.equals(__DEC_d_first_938062)) {
									return new Object[] { d, w, a, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_11BBBB(Assignment d, While w,
			While a, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_d_last_678906 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!w.equals(__DEC_d_last_678906)) {
							if (!a.equals(__DEC_d_last_678906)) {
								if (!c.equals(__DEC_d_last_678906)) {
									return new Object[] { d, w, a, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_12B(Assignment d) {
		for (Program __DEC_d_first_116779 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_13B(While c) {
		for (Decision __DEC_c_positive_303468 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_14B(While c) {
		for (Decision __DEC_c_negative_173740 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_15BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_350874 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_350874)) {
							if (!w.equals(__DEC_c_first_350874)) {
								if (!a.equals(__DEC_c_first_350874)) {
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

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_16BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_321259 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_321259)) {
							if (!w.equals(__DEC_c_last_321259)) {
								if (!a.equals(__DEC_c_last_321259)) {
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

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_17B(While c) {
		for (Program __DEC_c_first_285407 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_18BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_19BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_20BB(While c, Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_21BB(While w, Assignment d) {
		if (d.equals(w.getFirst())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_22BB(While a, Assignment d) {
		if (d.equals(a.getFirst())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_23BB(While c, Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_24BB(While w, Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_25BB(While a, Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_26BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_27BB(While a, While c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_28BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_29BB(While a, While c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_blackBBBBB(While w, While a,
			Assignment b, Assignment d, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						if (a.equals(w.getFirst())) {
							if (b.equals(a.getFirst())) {
								if (c.equals(w.getNext())) {
									if (b.equals(a.getLast())) {
										if (d.equals(c.getLast())) {
											if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_0B(
													a) == null) {
												if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_1B(
														a) == null) {
													if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_2BBB(
															a, w, c) == null) {
														if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_3B(
																a) == null) {
															if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_4B(
																	b) == null) {
																if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_5B(
																		b) == null) {
																	if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_6BBBB(
																			b, w, a, c) == null) {
																		if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_7B(
																				b) == null) {
																			if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_8B(
																					d) == null) {
																				if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_9B(
																						d) == null) {
																					if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_10BBBB(
																							d, w, a, c) == null) {
																						if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_11BBBB(
																								d, w, a, c) == null) {
																							if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_12B(
																									d) == null) {
																								if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_13B(
																										c) == null) {
																									if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_14B(
																											c) == null) {
																										if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_15BBB(
																												c, w,
																												a) == null) {
																											if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_16BBB(
																													c,
																													w,
																													a) == null) {
																												if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_17B(
																														c) == null) {
																													if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_18BB(
																															w,
																															a) == null) {
																														if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_19BB(
																																w,
																																b) == null) {
																															if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_20BB(
																																	c,
																																	b) == null) {
																																if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_21BB(
																																		w,
																																		d) == null) {
																																	if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_22BB(
																																			a,
																																			d) == null) {
																																		if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_23BB(
																																				c,
																																				d) == null) {
																																			if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_24BB(
																																					w,
																																					d) == null) {
																																				if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_25BB(
																																						a,
																																						d) == null) {
																																					if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_26BB(
																																							w,
																																							c) == null) {
																																						if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_27BB(
																																								a,
																																								c) == null) {
																																							if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_28BB(
																																									w,
																																									c) == null) {
																																								if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_29BB(
																																										a,
																																										c) == null) {
																																									return new Object[] {
																																											w,
																																											a,
																																											b,
																																											d,
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
		return null;
	}

	public static final boolean pattern_whileull2branchubb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileull2branchubb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_382585 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_1BBBB(Command y, Branch x,
			Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_positive_304160 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_304160)) {
							if (!i.equals(__DEC_y_positive_304160)) {
								if (!z.equals(__DEC_y_positive_304160)) {
									return new Object[] { y, x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_2BBBB(Command y, Branch x,
			Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_negative_756869 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_756869)) {
							if (!i.equals(__DEC_y_negative_756869)) {
								if (!z.equals(__DEC_y_negative_756869)) {
									return new Object[] { y, x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_121130 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_4BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_948105 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_948105)) {
							if (!i.equals(__DEC_x_positive_948105)) {
								if (!z.equals(__DEC_x_positive_948105)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_5BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_159887 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_159887)) {
							if (!i.equals(__DEC_x_negative_159887)) {
								if (!z.equals(__DEC_x_negative_159887)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_154413 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_7BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_571282 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_571282)) {
							if (!x.equals(__DEC_z_positive_571282)) {
								if (!i.equals(__DEC_z_positive_571282)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_8BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_337700 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_337700)) {
							if (!x.equals(__DEC_z_negative_337700)) {
								if (!i.equals(__DEC_z_negative_337700)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_9B(Command v) {
		for (Graph __DEC_v_root_894849 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_10BBBB(Command v, Branch x,
			Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_positive_921302 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!x.equals(__DEC_v_positive_921302)) {
							if (!i.equals(__DEC_v_positive_921302)) {
								if (!z.equals(__DEC_v_positive_921302)) {
									return new Object[] { v, x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_11BBBB(Command v, Branch x,
			Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_negative_287601 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!x.equals(__DEC_v_negative_287601)) {
							if (!i.equals(__DEC_v_negative_287601)) {
								if (!z.equals(__DEC_v_negative_287601)) {
									return new Object[] { v, x, i, z };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_12BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_13BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_14BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_15BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_16BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_17BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_18BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_19BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_20BB(Branch x, Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_21BB(Branch i, Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_22BB(Branch z, Command v) {
		if (v.equals(z.getPositive())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_23BB(Branch x, Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_24BB(Branch i, Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_25BB(Branch z, Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_blackBBBBB(Command y, Branch x,
			Branch i, Branch z, Command v) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!v.equals(y)) {
						if (y.equals(x.getPositive())) {
							if (x.equals(i.getPositive())) {
								if (z.equals(v.getNext())) {
									if (z.equals(i.getNegative())) {
										if (x.equals(y.getNext())) {
											if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_0B(
													y) == null) {
												if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_1BBBB(y,
														x, i, z) == null) {
													if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_2BBBB(
															y, x, i, z) == null) {
														if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_3B(
																x) == null) {
															if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_4BBB(
																	x, i, z) == null) {
																if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_5BBB(
																		x, i, z) == null) {
																	if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_6B(
																			z) == null) {
																		if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_7BBB(
																				z, x, i) == null) {
																			if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_8BBB(
																					z, x, i) == null) {
																				if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_9B(
																						v) == null) {
																					if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_10BBBB(
																							v, x, i, z) == null) {
																						if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_11BBBB(
																								v, x, i, z) == null) {
																							if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_12BB(
																									i, y) == null) {
																								if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_13BB(
																										z, y) == null) {
																									if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_14BB(
																											x,
																											y) == null) {
																										if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_15BB(
																												i,
																												y) == null) {
																											if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_16BB(
																													z,
																													y) == null) {
																												if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_17BB(
																														x,
																														z) == null) {
																													if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_18BB(
																															i,
																															z) == null) {
																														if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_19BB(
																																x,
																																z) == null) {
																															if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_20BB(
																																	x,
																																	v) == null) {
																																if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_21BB(
																																		i,
																																		v) == null) {
																																	if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_22BB(
																																			z,
																																			v) == null) {
																																		if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_23BB(
																																				x,
																																				v) == null) {
																																			if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_24BB(
																																					i,
																																					v) == null) {
																																				if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_25BB(
																																						z,
																																						v) == null) {
																																					return new Object[] {
																																							y,
																																							x,
																																							i,
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
		return null;
	}

	public static final boolean pattern_whileull2branchubb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileull2branchubb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_29_1_createresult_blackB(whileull2branchubb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileull2branchubb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whileull2branchubb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whileull2branchubb_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									w2i) == null) {
								if (pattern_whileull2branchubb_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										w) == null) {
									if (pattern_whileull2branchubb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileull2branchubb_29_3_solveCSP_bindingFBBBBBB(whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w, i, w2i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whileull2branchubb _this, IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileull2branchubb_29_3_solveCSP_binding = pattern_whileull2branchubb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w, i, w2i, ruleResult);
		if (result_pattern_whileull2branchubb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_29_3_solveCSP_black = pattern_whileull2branchubb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whileull2branchubb_29_4_checkCSP_expressionFBB(whileull2branchubb _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileull2branchubb_29_5_checknacs_blackBBB(While w, Branch i, S2B w2i) {
		return new Object[] { w, i, w2i };
	}

	public static final Object[] pattern_whileull2branchubb_29_6_perform_blackBBBB(While w, Branch i, S2B w2i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w, i, w2i, ruleResult };
	}

	public static final Object[] pattern_whileull2branchubb_29_6_perform_greenFFBBFFFFFFFFFFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(y);
		x.setPositive(y);
		i.setPositive(x);
		y.setNext(x);
		ruleResult.getTargetObjects().add(x);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		ruleResult.getCorrObjects().add(c2z);
		c2z.setTarget(z);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		v.setNext(z);
		ruleResult.getTargetObjects().add(v);
		d2v.setTarget(v);
		ruleResult.getCorrObjects().add(d2v);
		a.setFirst(b);
		a.setLast(b);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		d2v.setSource(d);
		ruleResult.getSourceObjects().add(d);
		w.setNext(c);
		c2z.setSource(c);
		c.setLast(d);
		ruleResult.getSourceObjects().add(c);
		a2x.setSource(a);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { y, x, w, i, a, c2z, z, b2y, v, d2v, b, d, c, a2x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileull2branchubb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileull2branchubbImpl
