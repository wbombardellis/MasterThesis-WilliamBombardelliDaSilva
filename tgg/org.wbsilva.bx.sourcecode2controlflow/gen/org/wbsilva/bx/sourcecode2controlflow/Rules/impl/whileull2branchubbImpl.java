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
	public boolean isAppropriate_FWD(Match match, While w, While c, Assignment d, Assignment b, While a) {

		Object[] result1_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_0_1_initialbindings_blackBBBBBBB(this, match, w, c, d, b, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[d] = " + d + ", "
					+ "[b] = " + b + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, w, c, d, b, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[d] = " + d + ", "
					+ "[b] = " + b + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileull2branchubbImpl.pattern_whileull2branchubb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileull2branchubbImpl
					.pattern_whileull2branchubb_0_4_collectelementstobetranslated_blackBBBBBB(match, w, c, d, b, a);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[w] = " + w + ", "
								+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
			}
			whileull2branchubbImpl.pattern_whileull2branchubb_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(match,
					w, c, d, b, a);
			//nothing EMoflonEdge c__d____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge a__b____first = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[10];

			Object[] result5_black = whileull2branchubbImpl
					.pattern_whileull2branchubb_0_5_collectcontextelements_blackBBBBBB(match, w, c, d, b, a);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[w] = " + w + ", "
								+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
			}
			whileull2branchubbImpl.pattern_whileull2branchubb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileull2branchubbImpl.pattern_whileull2branchubb_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					w, c, d, b, a);
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
		While c = (While) result1_bindingAndBlack[2];
		Assignment d = (Assignment) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		Assignment b = (Assignment) result1_bindingAndBlack[5];
		While a = (While) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_1_1_performtransformation_greenFFFBFBFFBFBBF(i, c, d, b, a);
		S2N b2y = (S2N) result1_green[0];
		Command v = (Command) result1_green[1];
		S2N d2v = (S2N) result1_green[2];
		Command y = (Command) result1_green[4];
		S2B c2z = (S2B) result1_green[6];
		S2B a2x = (S2B) result1_green[7];
		Branch x = (Branch) result1_green[9];
		Branch z = (Branch) result1_green[12];

		Object[] result2_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(b2y, v, d2v, y, c, c2z, a2x,
						d, x, b, a, z);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b2y] = " + b2y + ", " + "[v] = "
					+ v + ", " + "[d2v] = " + d2v + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[c2z] = " + c2z
					+ ", " + "[a2x] = " + a2x + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[b] = " + b + ", "
					+ "[a] = " + a + ", " + "[z] = " + z + ".");
		}
		Object[] result2_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(b2y, v, d2v, y, c, c2z,
						a2x, d, x, b, a, z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, b2y, w, v, d2v, i,
						y, c, c2z, a2x, d, w2i, x, b, a, z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2y] = " + b2y + ", " + "[w] = " + w + ", " + "[v] = " + v + ", " + "[d2v] = " + d2v
					+ ", " + "[i] = " + i + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[c2z] = " + c2z + ", "
					+ "[a2x] = " + a2x + ", " + "[d] = " + d + ", " + "[w2i] = " + w2i + ", " + "[x] = " + x + ", "
					+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[z] = " + z + ".");
		}
		whileull2branchubbImpl
				.pattern_whileull2branchubb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(ruleresult,
						b2y, w, v, d2v, i, y, c, c2z, a2x, d, x, b, a, z);
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[32];

		// 
		// 
		whileull2branchubbImpl.pattern_whileull2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, b2y, w, v, d2v, i, y, c, c2z, a2x, d, w2i, x, b, a, z);
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
		While c = (While) result2_binding[1];
		Assignment d = (Assignment) result2_binding[2];
		Assignment b = (Assignment) result2_binding[3];
		While a = (While) result2_binding[4];
		for (Object[] result2_black : whileull2branchubbImpl.pattern_whileull2branchubb_2_2_corematch_blackBFBBFBBB(w,
				c, d, b, a, match)) {
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whileull2branchubbImpl
					.pattern_whileull2branchubb_2_3_findcontext_blackBBBBBBB(w, i, c, d, w2i, b, a)) {
				Object[] result3_green = whileull2branchubbImpl
						.pattern_whileull2branchubb_2_3_findcontext_greenBBBBBBBFFFFFFFF(w, i, c, d, w2i, b, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = whileull2branchubbImpl
						.pattern_whileull2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, w,
								i, c, d, w2i, b, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[i] = " + i
							+ ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[w2i] = " + w2i + ", " + "[b] = " + b
							+ ", " + "[a] = " + a + ".");
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
	public void registerObjectsToMatch_FWD(Match match, While w, While c, Assignment d, Assignment b, While a) {
		match.registerObject("w", w);
		match.registerObject("c", c);
		match.registerObject("d", d);
		match.registerObject("b", b);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While w, While c, Assignment d, Assignment b, While a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While w, Branch i, While c, Assignment d,
			S2B w2i, Assignment b, While a) {// Create CSP
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
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("b", b);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject b2y, EObject w, EObject v, EObject d2v,
			EObject i, EObject y, EObject c, EObject c2z, EObject a2x, EObject d, EObject w2i, EObject x, EObject b,
			EObject a, EObject z) {
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command v, Branch i, Command y, Branch x, Branch z) {

		Object[] result1_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_10_1_initialbindings_blackBBBBBBB(this, match, v, i, y, x, z);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[v] = " + v + ", " + "[i] = " + i + ", " + "[y] = " + y + ", "
					+ "[x] = " + x + ", " + "[z] = " + z + ".");
		}

		Object[] result2_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, v, i, y, x, z);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[v] = " + v + ", " + "[i] = " + i + ", " + "[y] = " + y + ", "
					+ "[x] = " + x + ", " + "[z] = " + z + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileull2branchubbImpl.pattern_whileull2branchubb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileull2branchubbImpl
					.pattern_whileull2branchubb_10_4_collectelementstobetranslated_blackBBBBBB(match, v, i, y, x, z);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[v] = " + v + ", "
								+ "[i] = " + i + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[z] = " + z + ".");
			}
			whileull2branchubbImpl.pattern_whileull2branchubb_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(match,
					v, i, y, x, z);
			//nothing EMoflonEdge v__z____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result4_green[10];

			Object[] result5_black = whileull2branchubbImpl
					.pattern_whileull2branchubb_10_5_collectcontextelements_blackBBBBBB(match, v, i, y, x, z);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[v] = " + v + ", "
								+ "[i] = " + i + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[z] = " + z + ".");
			}
			whileull2branchubbImpl.pattern_whileull2branchubb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileull2branchubbImpl.pattern_whileull2branchubb_10_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					v, i, y, x, z);
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
		While w = (While) result1_bindingAndBlack[0];
		Command v = (Command) result1_bindingAndBlack[1];
		Branch i = (Branch) result1_bindingAndBlack[2];
		Command y = (Command) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		Branch x = (Branch) result1_bindingAndBlack[5];
		Branch z = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_11_1_performtransformation_greenFBBFBFFFFBFFB(w, v, y, x, z);
		S2N b2y = (S2N) result1_green[0];
		S2N d2v = (S2N) result1_green[3];
		While c = (While) result1_green[5];
		S2B c2z = (S2B) result1_green[6];
		S2B a2x = (S2B) result1_green[7];
		Assignment d = (Assignment) result1_green[8];
		Assignment b = (Assignment) result1_green[10];
		While a = (While) result1_green[11];

		Object[] result2_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(b2y, v, d2v, y, c, c2z,
						a2x, d, x, b, a, z);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b2y] = " + b2y + ", " + "[v] = "
					+ v + ", " + "[d2v] = " + d2v + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[c2z] = " + c2z
					+ ", " + "[a2x] = " + a2x + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[b] = " + b + ", "
					+ "[a] = " + a + ", " + "[z] = " + z + ".");
		}
		Object[] result2_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(b2y, v, d2v, y, c, c2z,
						a2x, d, x, b, a, z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, b2y, w, v, d2v,
						i, y, c, c2z, a2x, d, w2i, x, b, a, z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2y] = " + b2y + ", " + "[w] = " + w + ", " + "[v] = " + v + ", " + "[d2v] = " + d2v
					+ ", " + "[i] = " + i + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[c2z] = " + c2z + ", "
					+ "[a2x] = " + a2x + ", " + "[d] = " + d + ", " + "[w2i] = " + w2i + ", " + "[x] = " + x + ", "
					+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[z] = " + z + ".");
		}
		whileull2branchubbImpl
				.pattern_whileull2branchubb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(ruleresult,
						b2y, w, v, d2v, i, y, c, c2z, a2x, d, x, b, a, z);
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[32];

		// 
		// 
		whileull2branchubbImpl.pattern_whileull2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, b2y, w, v, d2v, i, y, c, c2z, a2x, d, w2i, x, b, a, z);
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
		Command v = (Command) result2_binding[0];
		Branch i = (Branch) result2_binding[1];
		Command y = (Command) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		Branch z = (Branch) result2_binding[4];
		for (Object[] result2_black : whileull2branchubbImpl.pattern_whileull2branchubb_12_2_corematch_blackFBBBFBBB(v,
				i, y, x, z, match)) {
			While w = (While) result2_black[0];
			S2B w2i = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whileull2branchubbImpl
					.pattern_whileull2branchubb_12_3_findcontext_blackBBBBBBB(w, v, i, y, w2i, x, z)) {
				Object[] result3_green = whileull2branchubbImpl
						.pattern_whileull2branchubb_12_3_findcontext_greenBBBBBBBFFFFFFFF(w, v, i, y, w2i, x, z);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = whileull2branchubbImpl
						.pattern_whileull2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, w,
								v, i, y, w2i, x, z);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[v] = " + v
							+ ", " + "[i] = " + i + ", " + "[y] = " + y + ", " + "[w2i] = " + w2i + ", " + "[x] = " + x
							+ ", " + "[z] = " + z + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Command v, Branch i, Command y, Branch x, Branch z) {
		match.registerObject("v", v);
		match.registerObject("i", i);
		match.registerObject("y", y);
		match.registerObject("x", x);
		match.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command v, Branch i, Command y, Branch x, Branch z) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, Command v, Branch i, Command y,
			S2B w2i, Branch x, Branch z) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("v", v);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("x", x);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject b2y, EObject w, EObject v, EObject d2v,
			EObject i, EObject y, EObject c, EObject c2z, EObject a2x, EObject d, EObject w2i, EObject x, EObject b,
			EObject a, EObject z) {
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("v").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_83(EMoflonEdge _edge_next) {

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
				.pattern_whileull2branchubb_20_2_testcorematchandDECs_blackFFFFFB(_edge_next)) {
			Command v = (Command) result2_black[0];
			Branch i = (Branch) result2_black[1];
			Command y = (Command) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Branch z = (Branch) result2_black[4];
			Object[] result2_green = whileull2branchubbImpl
					.pattern_whileull2branchubb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileull2branchubbImpl
					.pattern_whileull2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, v, i, y, x, z)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_89(EMoflonEdge _edge_last) {

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
				.pattern_whileull2branchubb_21_2_testcorematchandDECs_blackFFFFFB(_edge_last)) {
			While w = (While) result2_black[0];
			While c = (While) result2_black[1];
			Assignment d = (Assignment) result2_black[2];
			Assignment b = (Assignment) result2_black[3];
			While a = (While) result2_black[4];
			Object[] result2_green = whileull2branchubbImpl
					.pattern_whileull2branchubb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileull2branchubbImpl
					.pattern_whileull2branchubb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, w, c, d, b, a)) {
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
		While w = (While) result2_bindingAndBlack[0];
		Command v = (Command) result2_bindingAndBlack[1];
		Branch i = (Branch) result2_bindingAndBlack[2];
		Command y = (Command) result2_bindingAndBlack[3];
		While c = (While) result2_bindingAndBlack[4];
		Assignment d = (Assignment) result2_bindingAndBlack[5];
		Branch x = (Branch) result2_bindingAndBlack[6];
		Assignment b = (Assignment) result2_bindingAndBlack[7];
		While a = (While) result2_bindingAndBlack[8];
		Branch z = (Branch) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, w, v, i, y, c, d, x, b, a,
						z, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[w] = " + w + ", " + "[v] = " + v + ", " + "[i] = " + i + ", " + "[y] = " + y + ", " + "[c] = "
					+ c + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[z] = " + z + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
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
						.pattern_whileull2branchubb_24_6_createcorrespondence_blackBBBBBBBBBBB(w, v, i, y, c, d, x, b,
								a, z, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
							+ "[v] = " + v + ", " + "[i] = " + i + ", " + "[y] = " + y + ", " + "[c] = " + c + ", "
							+ "[d] = " + d + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
							+ "[z] = " + z + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileull2branchubbImpl.pattern_whileull2branchubb_24_6_createcorrespondence_greenFBFBBFFBBBBBB(v, y, c,
						d, x, b, a, z, ccMatch);
				//nothing S2N b2y = (S2N) result6_green[0];
				//nothing S2N d2v = (S2N) result6_green[2];
				//nothing S2B c2z = (S2B) result6_green[5];
				//nothing S2B a2x = (S2B) result6_green[6];

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
	public CSP isApplicable_solveCsp_CC(While w, Command v, Branch i, Command y, While c, Assignment d, Branch x,
			Assignment b, While a, Branch z, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While w, While c, Assignment d, Assignment b, While a) {// 
		Object[] result1_black = whileull2branchubbImpl.pattern_whileull2branchubb_27_1_matchtggpattern_blackBBBBB(w, c,
				d, b, a);
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
	public boolean checkDEC_BWD(Command v, Branch i, Command y, Branch x, Branch z) {// 
		Object[] result1_black = whileull2branchubbImpl.pattern_whileull2branchubb_28_1_matchtggpattern_blackBBBBB(v, i,
				y, x, z);
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
					whileull2branchubbImpl.pattern_whileull2branchubb_29_6_perform_greenFBFFBFFFFFFFFFB(w, i,
							ruleResult);
					//nothing S2N b2y = (S2N) result6_green[0];
					//nothing Command v = (Command) result6_green[2];
					//nothing S2N d2v = (S2N) result6_green[3];
					//nothing Command y = (Command) result6_green[5];
					//nothing While c = (While) result6_green[6];
					//nothing S2B c2z = (S2B) result6_green[7];
					//nothing S2B a2x = (S2B) result6_green[8];
					//nothing Assignment d = (Assignment) result6_green[9];
					//nothing Branch x = (Branch) result6_green[10];
					//nothing Assignment b = (Assignment) result6_green[11];
					//nothing While a = (While) result6_green[12];
					//nothing Branch z = (Branch) result6_green[13];

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
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_BRANCH_WHILE_ASSIGNMENT_S2B_ASSIGNMENT_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(S2B) arguments.get(5), (Assignment) arguments.get(6), (While) arguments.get(7));
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
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.WHILEULL2BRANCHUBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_COMMAND_BRANCH_COMMAND_S2B_BRANCH_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(S2B) arguments.get(5), (Branch) arguments.get(6), (Branch) arguments.get(7));
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
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_83__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_83((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_89__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_89((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_COMMAND_BRANCH_COMMAND_WHILE_ASSIGNMENT_BRANCH_ASSIGNMENT_WHILE_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5), (Branch) arguments.get(6), (Assignment) arguments.get(7),
					(While) arguments.get(8), (Branch) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_DEC_FWD__WHILE_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE:
			return checkDEC_FWD((While) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_DEC_BWD__COMMAND_BRANCH_COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
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
			Match match, While w, While c, Assignment d, Assignment b, While a) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						return new Object[] { _this, match, w, c, d, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_0_2_SolveCSP_bindingFBBBBBBB(whileull2branchubb _this,
			Match match, While w, While c, Assignment d, Assignment b, While a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, w, c, d, b, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, c, d, b, a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whileull2branchubb _this, Match match, While w, While c, Assignment d, Assignment b, While a) {
		Object[] result_pattern_whileull2branchubb_0_2_SolveCSP_binding = pattern_whileull2branchubb_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, w, c, d, b, a);
		if (result_pattern_whileull2branchubb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_0_2_SolveCSP_black = pattern_whileull2branchubb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, c, d, b, a };
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
			While w, While c, Assignment d, Assignment b, While a) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						return new Object[] { match, w, c, d, b, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, While w, While c, Assignment d, Assignment b, While a) {
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(d);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		String c__d____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		c__d____last.setName(c__d____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { match, w, c, d, b, a, c__d____last, w__a____first, a__b____last, a__b____first,
				w__c____next };
	}

	public static final Object[] pattern_whileull2branchubb_0_5_collectcontextelements_blackBBBBBB(Match match, While w,
			While c, Assignment d, Assignment b, While a) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						return new Object[] { match, w, c, d, b, a };
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
			whileull2branchubb _this, Match match, While w, While c, Assignment d, Assignment b, While a) {
		_this.registerObjectsToMatch_FWD(match, w, c, d, b, a);

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
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("d");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_5 = isApplicableMatch.getObject("b");
		EObject _localVariable_6 = isApplicableMatch.getObject("a");
		EObject tmpW = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpD = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		EObject tmpB = _localVariable_5;
		EObject tmpA = _localVariable_6;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpC instanceof While) {
					While c = (While) tmpC;
					if (tmpD instanceof Assignment) {
						Assignment d = (Assignment) tmpD;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								if (tmpA instanceof While) {
									While a = (While) tmpA;
									return new Object[] { w, i, c, d, w2i, b, a, isApplicableMatch };
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
			While c, Assignment d, S2B w2i, Assignment b, While a, whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { w, i, c, d, w2i, b, a, csp, _this, isApplicableMatch };
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
			While c = (While) result_pattern_whileull2branchubb_1_1_performtransformation_binding[2];
			Assignment d = (Assignment) result_pattern_whileull2branchubb_1_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whileull2branchubb_1_1_performtransformation_binding[4];
			Assignment b = (Assignment) result_pattern_whileull2branchubb_1_1_performtransformation_binding[5];
			While a = (While) result_pattern_whileull2branchubb_1_1_performtransformation_binding[6];

			Object[] result_pattern_whileull2branchubb_1_1_performtransformation_black = pattern_whileull2branchubb_1_1_performtransformation_blackBBBBBBBFBB(
					w, i, c, d, w2i, b, a, _this, isApplicableMatch);
			if (result_pattern_whileull2branchubb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileull2branchubb_1_1_performtransformation_black[7];

				return new Object[] { w, i, c, d, w2i, b, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_1_1_performtransformation_greenFFFBFBFFBFBBF(Branch i,
			While c, Assignment d, Assignment b, While a) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		b2y.setSource(b);
		d2v.setTarget(v);
		d2v.setSource(d);
		b2y.setTarget(y);
		c2z.setSource(c);
		a2x.setSource(a);
		i.setPositive(x);
		y.setNext(x);
		x.setPositive(y);
		a2x.setTarget(x);
		v.setNext(z);
		i.setNegative(z);
		c2z.setTarget(z);
		return new Object[] { b2y, v, d2v, i, y, c, c2z, a2x, d, x, b, a, z };
	}

	public static final Object[] pattern_whileull2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2N b2y,
			Command v, S2N d2v, Command y, While c, S2B c2z, S2B a2x, Assignment d, Branch x, Assignment b, While a,
			Branch z) {
		if (!b2y.equals(d2v)) {
			if (!v.equals(y)) {
				if (!a2x.equals(c2z)) {
					if (!x.equals(z)) {
						if (!b.equals(d)) {
							if (!a.equals(c)) {
								return new Object[] { b2y, v, d2v, y, c, c2z, a2x, d, x, b, a, z };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2N b2y,
			Command v, S2N d2v, Command y, While c, S2B c2z, S2B a2x, Assignment d, Branch x, Assignment b, While a,
			Branch z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(z);
		return new Object[] { ruleresult, b2y, v, d2v, y, c, c2z, a2x, d, x, b, a, z };
	}

	public static final Object[] pattern_whileull2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2y, EObject w, EObject v, EObject d2v, EObject i, EObject y,
			EObject c, EObject c2z, EObject a2x, EObject d, EObject w2i, EObject x, EObject b, EObject a, EObject z) {
		if (!b2y.equals(w)) {
			if (!b2y.equals(v)) {
				if (!b2y.equals(d2v)) {
					if (!b2y.equals(i)) {
						if (!b2y.equals(y)) {
							if (!b2y.equals(c)) {
								if (!b2y.equals(c2z)) {
									if (!b2y.equals(d)) {
										if (!b2y.equals(w2i)) {
											if (!b2y.equals(x)) {
												if (!b2y.equals(z)) {
													if (!w.equals(y)) {
														if (!w.equals(w2i)) {
															if (!w.equals(x)) {
																if (!w.equals(z)) {
																	if (!v.equals(w)) {
																		if (!v.equals(y)) {
																			if (!v.equals(w2i)) {
																				if (!v.equals(x)) {
																					if (!v.equals(z)) {
																						if (!d2v.equals(w)) {
																							if (!d2v.equals(v)) {
																								if (!d2v.equals(i)) {
																									if (!d2v.equals(
																											y)) {
																										if (!d2v.equals(
																												w2i)) {
																											if (!d2v.equals(
																													x)) {
																												if (!d2v.equals(
																														z)) {
																													if (!i.equals(
																															w)) {
																														if (!i.equals(
																																v)) {
																															if (!i.equals(
																																	y)) {
																																if (!i.equals(
																																		w2i)) {
																																	if (!i.equals(
																																			x)) {
																																		if (!i.equals(
																																				z)) {
																																			if (!y.equals(
																																					z)) {
																																				if (!c.equals(
																																						w)) {
																																					if (!c.equals(
																																							v)) {
																																						if (!c.equals(
																																								d2v)) {
																																							if (!c.equals(
																																									i)) {
																																								if (!c.equals(
																																										y)) {
																																									if (!c.equals(
																																											c2z)) {
																																										if (!c.equals(
																																												d)) {
																																											if (!c.equals(
																																													w2i)) {
																																												if (!c.equals(
																																														x)) {
																																													if (!c.equals(
																																															z)) {
																																														if (!c2z.equals(
																																																w)) {
																																															if (!c2z.equals(
																																																	v)) {
																																																if (!c2z.equals(
																																																		d2v)) {
																																																	if (!c2z.equals(
																																																			i)) {
																																																		if (!c2z.equals(
																																																				y)) {
																																																			if (!c2z.equals(
																																																					d)) {
																																																				if (!c2z.equals(
																																																						w2i)) {
																																																					if (!c2z.equals(
																																																							x)) {
																																																						if (!c2z.equals(
																																																								z)) {
																																																							if (!a2x.equals(
																																																									b2y)) {
																																																								if (!a2x.equals(
																																																										w)) {
																																																									if (!a2x.equals(
																																																											v)) {
																																																										if (!a2x.equals(
																																																												d2v)) {
																																																											if (!a2x.equals(
																																																													i)) {
																																																												if (!a2x.equals(
																																																														y)) {
																																																													if (!a2x.equals(
																																																															c)) {
																																																														if (!a2x.equals(
																																																																c2z)) {
																																																															if (!a2x.equals(
																																																																	d)) {
																																																																if (!a2x.equals(
																																																																		w2i)) {
																																																																	if (!a2x.equals(
																																																																			x)) {
																																																																		if (!a2x.equals(
																																																																				b)) {
																																																																			if (!a2x.equals(
																																																																					z)) {
																																																																				if (!d.equals(
																																																																						w)) {
																																																																					if (!d.equals(
																																																																							v)) {
																																																																						if (!d.equals(
																																																																								d2v)) {
																																																																							if (!d.equals(
																																																																									i)) {
																																																																								if (!d.equals(
																																																																										y)) {
																																																																									if (!d.equals(
																																																																											w2i)) {
																																																																										if (!d.equals(
																																																																												x)) {
																																																																											if (!d.equals(
																																																																													z)) {
																																																																												if (!w2i.equals(
																																																																														y)) {
																																																																													if (!w2i.equals(
																																																																															x)) {
																																																																														if (!w2i.equals(
																																																																																z)) {
																																																																															if (!x.equals(
																																																																																	y)) {
																																																																																if (!x.equals(
																																																																																		z)) {
																																																																																	if (!b.equals(
																																																																																			b2y)) {
																																																																																		if (!b.equals(
																																																																																				w)) {
																																																																																			if (!b.equals(
																																																																																					v)) {
																																																																																				if (!b.equals(
																																																																																						d2v)) {
																																																																																					if (!b.equals(
																																																																																							i)) {
																																																																																						if (!b.equals(
																																																																																								y)) {
																																																																																							if (!b.equals(
																																																																																									c)) {
																																																																																								if (!b.equals(
																																																																																										c2z)) {
																																																																																									if (!b.equals(
																																																																																											d)) {
																																																																																										if (!b.equals(
																																																																																												w2i)) {
																																																																																											if (!b.equals(
																																																																																													x)) {
																																																																																												if (!b.equals(
																																																																																														z)) {
																																																																																													if (!a.equals(
																																																																																															b2y)) {
																																																																																														if (!a.equals(
																																																																																																w)) {
																																																																																															if (!a.equals(
																																																																																																	v)) {
																																																																																																if (!a.equals(
																																																																																																		d2v)) {
																																																																																																	if (!a.equals(
																																																																																																			i)) {
																																																																																																		if (!a.equals(
																																																																																																				y)) {
																																																																																																			if (!a.equals(
																																																																																																					c)) {
																																																																																																				if (!a.equals(
																																																																																																						c2z)) {
																																																																																																					if (!a.equals(
																																																																																																							a2x)) {
																																																																																																						if (!a.equals(
																																																																																																								d)) {
																																																																																																							if (!a.equals(
																																																																																																									w2i)) {
																																																																																																								if (!a.equals(
																																																																																																										x)) {
																																																																																																									if (!a.equals(
																																																																																																											b)) {
																																																																																																										if (!a.equals(
																																																																																																												z)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													b2y,
																																																																																																													w,
																																																																																																													v,
																																																																																																													d2v,
																																																																																																													i,
																																																																																																													y,
																																																																																																													c,
																																																																																																													c2z,
																																																																																																													a2x,
																																																																																																													d,
																																																																																																													w2i,
																																																																																																													x,
																																																																																																													b,
																																																																																																													a,
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
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject b2y, EObject w, EObject v, EObject d2v, EObject i, EObject y,
			EObject c, EObject c2z, EObject a2x, EObject d, EObject x, EObject b, EObject a, EObject z) {
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileull2branchubb";
		String v__z____next_name_prime = "next";
		String d2v__v____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String c__d____last_name_prime = "last";
		String c2z__c____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String d2v__d____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		String y__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String x__y____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String c2z__z____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(v__z____next);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____last);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(x__y____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____first);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		v__z____next.setName(v__z____next_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { ruleresult, b2y, w, v, d2v, i, y, c, c2z, a2x, d, x, b, a, z, v__z____next,
				d2v__v____target, i__x____positive, c__d____last, c2z__c____source, w__a____first, d2v__d____source,
				i__z____negative, y__x____next, b2y__y____target, x__y____positive, a2x__x____target, b2y__b____source,
				a__b____last, a__b____first, c2z__z____target, a2x__a____source, w__c____next };
	}

	public static final void pattern_whileull2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whileull2branchubb _this, PerformRuleResult ruleresult, EObject b2y, EObject w, EObject v, EObject d2v,
			EObject i, EObject y, EObject c, EObject c2z, EObject a2x, EObject d, EObject w2i, EObject x, EObject b,
			EObject a, EObject z) {
		_this.registerObjects_FWD(ruleresult, b2y, w, v, d2v, i, y, c, c2z, a2x, d, w2i, x, b, a, z);

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
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("d");
		EObject _localVariable_3 = match.getObject("b");
		EObject _localVariable_4 = match.getObject("a");
		EObject tmpW = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpA = _localVariable_4;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpC instanceof While) {
				While c = (While) tmpC;
				if (tmpD instanceof Assignment) {
					Assignment d = (Assignment) tmpD;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							return new Object[] { w, c, d, b, a, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_2_2_corematch_blackBFBBFBBB(While w, While c,
			Assignment d, Assignment b, While a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
								"source")) {
							Branch i = w2i.getTarget();
							if (i != null) {
								_result.add(new Object[] { w, i, c, d, w2i, b, a, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_2_3_findcontext_blackBBBBBBB(While w, Branch i,
			While c, Assignment d, S2B w2i, Assignment b, While a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						if (d.equals(c.getLast())) {
							if (a.equals(w.getFirst())) {
								if (w.equals(w2i.getSource())) {
									if (i.equals(w2i.getTarget())) {
										if (b.equals(a.getLast())) {
											if (b.equals(a.getFirst())) {
												if (c.equals(w.getNext())) {
													_result.add(new Object[] { w, i, c, d, w2i, b, a });
												}
											}
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
			While c, Assignment d, S2B w2i, Assignment b, While a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__d____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(a);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		c__d____last.setName(c__d____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { w, i, c, d, w2i, b, a, isApplicableMatch, c__d____last, w__a____first, w2i__w____source,
				w2i__i____target, a__b____last, a__b____first, w__c____next };
	}

	public static final Object[] pattern_whileull2branchubb_2_4_solveCSP_bindingFBBBBBBBBB(whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, While c, Assignment d, S2B w2i, Assignment b,
			While a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, w, i, c, d, w2i, b, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, i, c, d, w2i, b, a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whileull2branchubb _this, IsApplicableMatch isApplicableMatch, While w, Branch i, While c, Assignment d,
			S2B w2i, Assignment b, While a) {
		Object[] result_pattern_whileull2branchubb_2_4_solveCSP_binding = pattern_whileull2branchubb_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, w, i, c, d, w2i, b, a);
		if (result_pattern_whileull2branchubb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_2_4_solveCSP_black = pattern_whileull2branchubb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, i, c, d, w2i, b, a };
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
			Match match, Command v, Branch i, Command y, Branch x, Branch z) {
		if (!v.equals(y)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!x.equals(z)) {
						return new Object[] { _this, match, v, i, y, x, z };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_10_2_SolveCSP_bindingFBBBBBBB(whileull2branchubb _this,
			Match match, Command v, Branch i, Command y, Branch x, Branch z) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, v, i, y, x, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, v, i, y, x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whileull2branchubb _this, Match match, Command v, Branch i, Command y, Branch x, Branch z) {
		Object[] result_pattern_whileull2branchubb_10_2_SolveCSP_binding = pattern_whileull2branchubb_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, v, i, y, x, z);
		if (result_pattern_whileull2branchubb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_10_2_SolveCSP_black = pattern_whileull2branchubb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, v, i, y, x, z };
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
			Command v, Branch i, Command y, Branch x, Branch z) {
		if (!v.equals(y)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!x.equals(z)) {
						return new Object[] { match, v, i, y, x, z };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Command v, Branch i, Command y, Branch x, Branch z) {
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(v);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
		String v__z____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String y__x____next_name_prime = "next";
		String x__y____positive_name_prime = "positive";
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(v__z____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(x__y____positive);
		v__z____next.setName(v__z____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		return new Object[] { match, v, i, y, x, z, v__z____next, i__x____positive, i__z____negative, y__x____next,
				x__y____positive };
	}

	public static final Object[] pattern_whileull2branchubb_10_5_collectcontextelements_blackBBBBBB(Match match,
			Command v, Branch i, Command y, Branch x, Branch z) {
		if (!v.equals(y)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!x.equals(z)) {
						return new Object[] { match, v, i, y, x, z };
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
			whileull2branchubb _this, Match match, Command v, Branch i, Command y, Branch x, Branch z) {
		_this.registerObjectsToMatch_BWD(match, v, i, y, x, z);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("v");
		EObject _localVariable_2 = isApplicableMatch.getObject("i");
		EObject _localVariable_3 = isApplicableMatch.getObject("y");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_5 = isApplicableMatch.getObject("x");
		EObject _localVariable_6 = isApplicableMatch.getObject("z");
		EObject tmpW = _localVariable_0;
		EObject tmpV = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		EObject tmpX = _localVariable_5;
		EObject tmpZ = _localVariable_6;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpV instanceof Command) {
				Command v = (Command) tmpV;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								if (tmpZ instanceof Branch) {
									Branch z = (Branch) tmpZ;
									return new Object[] { w, v, i, y, w2i, x, z, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_11_1_performtransformation_blackBBBBBBBFBB(While w,
			Command v, Branch i, Command y, S2B w2i, Branch x, Branch z, whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!v.equals(y)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!x.equals(z)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { w, v, i, y, w2i, x, z, csp, _this, isApplicableMatch };
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
			While w = (While) result_pattern_whileull2branchubb_11_1_performtransformation_binding[0];
			Command v = (Command) result_pattern_whileull2branchubb_11_1_performtransformation_binding[1];
			Branch i = (Branch) result_pattern_whileull2branchubb_11_1_performtransformation_binding[2];
			Command y = (Command) result_pattern_whileull2branchubb_11_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whileull2branchubb_11_1_performtransformation_binding[4];
			Branch x = (Branch) result_pattern_whileull2branchubb_11_1_performtransformation_binding[5];
			Branch z = (Branch) result_pattern_whileull2branchubb_11_1_performtransformation_binding[6];

			Object[] result_pattern_whileull2branchubb_11_1_performtransformation_black = pattern_whileull2branchubb_11_1_performtransformation_blackBBBBBBBFBB(
					w, v, i, y, w2i, x, z, _this, isApplicableMatch);
			if (result_pattern_whileull2branchubb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileull2branchubb_11_1_performtransformation_black[7];

				return new Object[] { w, v, i, y, w2i, x, z, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_11_1_performtransformation_greenFBBFBFFFFBFFB(While w,
			Command v, Command y, Branch x, Branch z) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		b2y.setTarget(y);
		d2v.setTarget(v);
		w.setNext(c);
		c2z.setSource(c);
		c2z.setTarget(z);
		a2x.setTarget(x);
		c.setLast(d);
		d2v.setSource(d);
		b2y.setSource(b);
		w.setFirst(a);
		a.setLast(b);
		a.setFirst(b);
		a2x.setSource(a);
		return new Object[] { b2y, w, v, d2v, y, c, c2z, a2x, d, x, b, a, z };
	}

	public static final Object[] pattern_whileull2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2N b2y,
			Command v, S2N d2v, Command y, While c, S2B c2z, S2B a2x, Assignment d, Branch x, Assignment b, While a,
			Branch z) {
		if (!b2y.equals(d2v)) {
			if (!v.equals(y)) {
				if (!a2x.equals(c2z)) {
					if (!x.equals(z)) {
						if (!b.equals(d)) {
							if (!a.equals(c)) {
								return new Object[] { b2y, v, d2v, y, c, c2z, a2x, d, x, b, a, z };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2N b2y,
			Command v, S2N d2v, Command y, While c, S2B c2z, S2B a2x, Assignment d, Branch x, Assignment b, While a,
			Branch z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(z);
		return new Object[] { ruleresult, b2y, v, d2v, y, c, c2z, a2x, d, x, b, a, z };
	}

	public static final Object[] pattern_whileull2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2y, EObject w, EObject v, EObject d2v, EObject i, EObject y,
			EObject c, EObject c2z, EObject a2x, EObject d, EObject w2i, EObject x, EObject b, EObject a, EObject z) {
		if (!b2y.equals(w)) {
			if (!b2y.equals(v)) {
				if (!b2y.equals(d2v)) {
					if (!b2y.equals(i)) {
						if (!b2y.equals(y)) {
							if (!b2y.equals(c)) {
								if (!b2y.equals(c2z)) {
									if (!b2y.equals(d)) {
										if (!b2y.equals(w2i)) {
											if (!b2y.equals(x)) {
												if (!b2y.equals(z)) {
													if (!w.equals(y)) {
														if (!w.equals(w2i)) {
															if (!w.equals(x)) {
																if (!w.equals(z)) {
																	if (!v.equals(w)) {
																		if (!v.equals(y)) {
																			if (!v.equals(w2i)) {
																				if (!v.equals(x)) {
																					if (!v.equals(z)) {
																						if (!d2v.equals(w)) {
																							if (!d2v.equals(v)) {
																								if (!d2v.equals(i)) {
																									if (!d2v.equals(
																											y)) {
																										if (!d2v.equals(
																												w2i)) {
																											if (!d2v.equals(
																													x)) {
																												if (!d2v.equals(
																														z)) {
																													if (!i.equals(
																															w)) {
																														if (!i.equals(
																																v)) {
																															if (!i.equals(
																																	y)) {
																																if (!i.equals(
																																		w2i)) {
																																	if (!i.equals(
																																			x)) {
																																		if (!i.equals(
																																				z)) {
																																			if (!y.equals(
																																					z)) {
																																				if (!c.equals(
																																						w)) {
																																					if (!c.equals(
																																							v)) {
																																						if (!c.equals(
																																								d2v)) {
																																							if (!c.equals(
																																									i)) {
																																								if (!c.equals(
																																										y)) {
																																									if (!c.equals(
																																											c2z)) {
																																										if (!c.equals(
																																												d)) {
																																											if (!c.equals(
																																													w2i)) {
																																												if (!c.equals(
																																														x)) {
																																													if (!c.equals(
																																															z)) {
																																														if (!c2z.equals(
																																																w)) {
																																															if (!c2z.equals(
																																																	v)) {
																																																if (!c2z.equals(
																																																		d2v)) {
																																																	if (!c2z.equals(
																																																			i)) {
																																																		if (!c2z.equals(
																																																				y)) {
																																																			if (!c2z.equals(
																																																					d)) {
																																																				if (!c2z.equals(
																																																						w2i)) {
																																																					if (!c2z.equals(
																																																							x)) {
																																																						if (!c2z.equals(
																																																								z)) {
																																																							if (!a2x.equals(
																																																									b2y)) {
																																																								if (!a2x.equals(
																																																										w)) {
																																																									if (!a2x.equals(
																																																											v)) {
																																																										if (!a2x.equals(
																																																												d2v)) {
																																																											if (!a2x.equals(
																																																													i)) {
																																																												if (!a2x.equals(
																																																														y)) {
																																																													if (!a2x.equals(
																																																															c)) {
																																																														if (!a2x.equals(
																																																																c2z)) {
																																																															if (!a2x.equals(
																																																																	d)) {
																																																																if (!a2x.equals(
																																																																		w2i)) {
																																																																	if (!a2x.equals(
																																																																			x)) {
																																																																		if (!a2x.equals(
																																																																				b)) {
																																																																			if (!a2x.equals(
																																																																					z)) {
																																																																				if (!d.equals(
																																																																						w)) {
																																																																					if (!d.equals(
																																																																							v)) {
																																																																						if (!d.equals(
																																																																								d2v)) {
																																																																							if (!d.equals(
																																																																									i)) {
																																																																								if (!d.equals(
																																																																										y)) {
																																																																									if (!d.equals(
																																																																											w2i)) {
																																																																										if (!d.equals(
																																																																												x)) {
																																																																											if (!d.equals(
																																																																													z)) {
																																																																												if (!w2i.equals(
																																																																														y)) {
																																																																													if (!w2i.equals(
																																																																															x)) {
																																																																														if (!w2i.equals(
																																																																																z)) {
																																																																															if (!x.equals(
																																																																																	y)) {
																																																																																if (!x.equals(
																																																																																		z)) {
																																																																																	if (!b.equals(
																																																																																			b2y)) {
																																																																																		if (!b.equals(
																																																																																				w)) {
																																																																																			if (!b.equals(
																																																																																					v)) {
																																																																																				if (!b.equals(
																																																																																						d2v)) {
																																																																																					if (!b.equals(
																																																																																							i)) {
																																																																																						if (!b.equals(
																																																																																								y)) {
																																																																																							if (!b.equals(
																																																																																									c)) {
																																																																																								if (!b.equals(
																																																																																										c2z)) {
																																																																																									if (!b.equals(
																																																																																											d)) {
																																																																																										if (!b.equals(
																																																																																												w2i)) {
																																																																																											if (!b.equals(
																																																																																													x)) {
																																																																																												if (!b.equals(
																																																																																														z)) {
																																																																																													if (!a.equals(
																																																																																															b2y)) {
																																																																																														if (!a.equals(
																																																																																																w)) {
																																																																																															if (!a.equals(
																																																																																																	v)) {
																																																																																																if (!a.equals(
																																																																																																		d2v)) {
																																																																																																	if (!a.equals(
																																																																																																			i)) {
																																																																																																		if (!a.equals(
																																																																																																				y)) {
																																																																																																			if (!a.equals(
																																																																																																					c)) {
																																																																																																				if (!a.equals(
																																																																																																						c2z)) {
																																																																																																					if (!a.equals(
																																																																																																							a2x)) {
																																																																																																						if (!a.equals(
																																																																																																								d)) {
																																																																																																							if (!a.equals(
																																																																																																									w2i)) {
																																																																																																								if (!a.equals(
																																																																																																										x)) {
																																																																																																									if (!a.equals(
																																																																																																											b)) {
																																																																																																										if (!a.equals(
																																																																																																												z)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													b2y,
																																																																																																													w,
																																																																																																													v,
																																																																																																													d2v,
																																																																																																													i,
																																																																																																													y,
																																																																																																													c,
																																																																																																													c2z,
																																																																																																													a2x,
																																																																																																													d,
																																																																																																													w2i,
																																																																																																													x,
																																																																																																													b,
																																																																																																													a,
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
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject b2y, EObject w, EObject v, EObject d2v, EObject i, EObject y,
			EObject c, EObject c2z, EObject a2x, EObject d, EObject x, EObject b, EObject a, EObject z) {
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileull2branchubb";
		String v__z____next_name_prime = "next";
		String d2v__v____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String c__d____last_name_prime = "last";
		String c2z__c____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String d2v__d____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		String y__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String x__y____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String c2z__z____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(v__z____next);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____last);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(x__y____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____first);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		v__z____next.setName(v__z____next_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { ruleresult, b2y, w, v, d2v, i, y, c, c2z, a2x, d, x, b, a, z, v__z____next,
				d2v__v____target, i__x____positive, c__d____last, c2z__c____source, w__a____first, d2v__d____source,
				i__z____negative, y__x____next, b2y__y____target, x__y____positive, a2x__x____target, b2y__b____source,
				a__b____last, a__b____first, c2z__z____target, a2x__a____source, w__c____next };
	}

	public static final void pattern_whileull2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whileull2branchubb _this, PerformRuleResult ruleresult, EObject b2y, EObject w, EObject v, EObject d2v,
			EObject i, EObject y, EObject c, EObject c2z, EObject a2x, EObject d, EObject w2i, EObject x, EObject b,
			EObject a, EObject z) {
		_this.registerObjects_BWD(ruleresult, b2y, w, v, d2v, i, y, c, c2z, a2x, d, w2i, x, b, a, z);

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
		EObject _localVariable_0 = match.getObject("v");
		EObject _localVariable_1 = match.getObject("i");
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("x");
		EObject _localVariable_4 = match.getObject("z");
		EObject tmpV = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		if (tmpV instanceof Command) {
			Command v = (Command) tmpV;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpZ instanceof Branch) {
							Branch z = (Branch) tmpZ;
							return new Object[] { v, i, y, x, z, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_12_2_corematch_blackFBBBFBBB(Command v, Branch i,
			Command y, Branch x, Branch z, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!v.equals(y)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!x.equals(z)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
								"target")) {
							Statement tmpW = w2i.getSource();
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								_result.add(new Object[] { w, v, i, y, w2i, x, z, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_12_3_findcontext_blackBBBBBBB(While w, Command v,
			Branch i, Command y, S2B w2i, Branch x, Branch z) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!v.equals(y)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!x.equals(z)) {
						if (z.equals(v.getNext())) {
							if (x.equals(i.getPositive())) {
								if (w.equals(w2i.getSource())) {
									if (z.equals(i.getNegative())) {
										if (x.equals(y.getNext())) {
											if (i.equals(w2i.getTarget())) {
												if (y.equals(x.getPositive())) {
													_result.add(new Object[] { w, v, i, y, w2i, x, z });
												}
											}
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

	public static final Object[] pattern_whileull2branchubb_12_3_findcontext_greenBBBBBBBFFFFFFFF(While w, Command v,
			Branch i, Command y, S2B w2i, Branch x, Branch z) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String v__z____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String w2i__w____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		String y__x____next_name_prime = "next";
		String w2i__i____target_name_prime = "target";
		String x__y____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(v);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(z);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(v__z____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(x__y____positive);
		v__z____next.setName(v__z____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		return new Object[] { w, v, i, y, w2i, x, z, isApplicableMatch, v__z____next, i__x____positive,
				w2i__w____source, i__z____negative, y__x____next, w2i__i____target, x__y____positive };
	}

	public static final Object[] pattern_whileull2branchubb_12_4_solveCSP_bindingFBBBBBBBBB(whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch, While w, Command v, Branch i, Command y, S2B w2i, Branch x, Branch z) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, w, v, i, y, w2i, x, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, v, i, y, w2i, x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whileull2branchubb _this, IsApplicableMatch isApplicableMatch, While w, Command v, Branch i, Command y,
			S2B w2i, Branch x, Branch z) {
		Object[] result_pattern_whileull2branchubb_12_4_solveCSP_binding = pattern_whileull2branchubb_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, w, v, i, y, w2i, x, z);
		if (result_pattern_whileull2branchubb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_12_4_solveCSP_black = pattern_whileull2branchubb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, v, i, y, w2i, x, z };
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_0B(Command v) {
		for (Graph __DEC_v_root_723950 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_1BBBB(Command v,
			Branch i, Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_positive_477142 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!i.equals(__DEC_v_positive_477142)) {
							if (!x.equals(__DEC_v_positive_477142)) {
								if (!z.equals(__DEC_v_positive_477142)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_2BBBB(Command v,
			Branch i, Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_negative_86602 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!i.equals(__DEC_v_negative_86602)) {
							if (!x.equals(__DEC_v_negative_86602)) {
								if (!z.equals(__DEC_v_negative_86602)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_370007 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_4BBBB(Command y,
			Branch i, Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_12703 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!i.equals(__DEC_y_positive_12703)) {
							if (!x.equals(__DEC_y_positive_12703)) {
								if (!z.equals(__DEC_y_positive_12703)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_5BBBB(Command y,
			Branch i, Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_941017 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!i.equals(__DEC_y_negative_941017)) {
							if (!x.equals(__DEC_y_negative_941017)) {
								if (!z.equals(__DEC_y_negative_941017)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_735462 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_7BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_125343 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_125343)) {
							if (!i.equals(__DEC_x_positive_125343)) {
								if (!z.equals(__DEC_x_positive_125343)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_8BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_788654 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_788654)) {
							if (!i.equals(__DEC_x_negative_788654)) {
								if (!z.equals(__DEC_x_negative_788654)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_9B(Branch z) {
		for (Graph __DEC_z_root_729191 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_10BBB(Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_445743 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_445743)) {
							if (!i.equals(__DEC_z_positive_445743)) {
								if (!x.equals(__DEC_z_positive_445743)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_11BBB(Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_557026 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_557026)) {
							if (!i.equals(__DEC_z_negative_557026)) {
								if (!x.equals(__DEC_z_negative_557026)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_12BB(Branch i,
			Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_13BB(Branch x,
			Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_14BB(Branch z,
			Command v) {
		if (v.equals(z.getPositive())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_15BB(Branch i,
			Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_16BB(Branch x,
			Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_17BB(Branch z,
			Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_18BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_19BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_20BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_21BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_22BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_23BB(Branch i,
			Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_24BB(Branch i,
			Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_25BB(Branch x,
			Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_26BB(Branch x,
			Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpV = _edge_next.getSrc();
		if (tmpV instanceof Command) {
			Command v = (Command) tmpV;
			EObject tmpZ = _edge_next.getTrg();
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (z.equals(v.getNext())) {
					if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_0B(v) == null) {
						if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_9B(z) == null) {
							if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_14BB(z, v) == null) {
								if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_17BB(z, v) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(z, Branch.class, "negative")) {
										if (!i.equals(z)) {
											Node tmpX = i.getPositive();
											if (tmpX instanceof Branch) {
												Branch x = (Branch) tmpX;
												if (!i.equals(x)) {
													if (!x.equals(z)) {
														Node tmpY = x.getPositive();
														if (tmpY instanceof Command) {
															Command y = (Command) tmpY;
															if (!v.equals(y)) {
																if (x.equals(y.getNext())) {
																	if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_12BB(
																			i, v) == null) {
																		if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_15BB(
																				i, v) == null) {
																			if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_24BB(
																					i, z) == null) {
																				if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_1BBBB(
																						v, i, x, z) == null) {
																					if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_2BBBB(
																							v, i, x, z) == null) {
																						if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_6B(
																								x) == null) {
																							if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_7BBB(
																									x, i, z) == null) {
																								if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_8BBB(
																										x, i,
																										z) == null) {
																									if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_10BBB(
																											z, i,
																											x) == null) {
																										if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_11BBB(
																												z, i,
																												x) == null) {
																											if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_13BB(
																													x,
																													v) == null) {
																												if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_16BB(
																														x,
																														v) == null) {
																													if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_23BB(
																															i,
																															x) == null) {
																														if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_25BB(
																																x,
																																z) == null) {
																															if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_26BB(
																																	x,
																																	z) == null) {
																																if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_3B(
																																		y) == null) {
																																	if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_4BBBB(
																																			y,
																																			i,
																																			x,
																																			z) == null) {
																																		if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_5BBBB(
																																				y,
																																				i,
																																				x,
																																				z) == null) {
																																			if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_18BB(
																																					i,
																																					y) == null) {
																																				if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_19BB(
																																						z,
																																						y) == null) {
																																					if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_20BB(
																																							i,
																																							y) == null) {
																																						if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_21BB(
																																								x,
																																								y) == null) {
																																							if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_22BB(
																																									z,
																																									y) == null) {
																																								_result.add(
																																										new Object[] {
																																												v,
																																												i,
																																												y,
																																												x,
																																												z,
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileull2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			whileull2branchubb _this, Match match, Command v, Branch i, Command y, Branch x, Branch z) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, v, i, y, x, z);
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_0B(While c) {
		for (Decision __DEC_c_positive_574025 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_891439 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_2BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_164057 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_164057)) {
							if (!w.equals(__DEC_c_first_164057)) {
								if (!a.equals(__DEC_c_first_164057)) {
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_3BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_364386 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_364386)) {
							if (!w.equals(__DEC_c_last_364386)) {
								if (!a.equals(__DEC_c_last_364386)) {
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_4B(While c) {
		for (Program __DEC_c_first_100879 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_5B(Assignment d) {
		for (Decision __DEC_d_positive_213113 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_6B(Assignment d) {
		for (Decision __DEC_d_negative_232813 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_7BBBB(Assignment d,
			While w, While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_d_first_555298 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!w.equals(__DEC_d_first_555298)) {
							if (!c.equals(__DEC_d_first_555298)) {
								if (!a.equals(__DEC_d_first_555298)) {
									return new Object[] { d, w, c, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_8BBBB(Assignment d,
			While w, While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_d_last_980275 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!w.equals(__DEC_d_last_980275)) {
							if (!c.equals(__DEC_d_last_980275)) {
								if (!a.equals(__DEC_d_last_980275)) {
									return new Object[] { d, w, c, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_9B(Assignment d) {
		for (Program __DEC_d_first_146399 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_10B(Assignment b) {
		for (Decision __DEC_b_positive_215004 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_11B(Assignment b) {
		for (Decision __DEC_b_negative_889702 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_12BBBB(Assignment b,
			While w, While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_b_last_529114 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!w.equals(__DEC_b_last_529114)) {
							if (!c.equals(__DEC_b_last_529114)) {
								if (!a.equals(__DEC_b_last_529114)) {
									return new Object[] { b, w, c, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_13B(Assignment b) {
		for (Program __DEC_b_first_844395 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_14B(While a) {
		for (Decision __DEC_a_positive_94255 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_15B(While a) {
		for (Decision __DEC_a_negative_956145 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_16BBB(While a, While w,
			While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_814266 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_814266)) {
							if (!w.equals(__DEC_a_last_814266)) {
								if (!c.equals(__DEC_a_last_814266)) {
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_17B(While a) {
		for (Program __DEC_a_first_540386 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_18BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_19BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_20BB(While w,
			Assignment d) {
		if (d.equals(w.getFirst())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_21BB(While c,
			Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_23BB(While w,
			Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_24BB(While a,
			Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_25BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_26BB(While c,
			Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_27BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_28BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_last.getSrc();
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			EObject tmpD = _edge_last.getTrg();
			if (tmpD instanceof Assignment) {
				Assignment d = (Assignment) tmpD;
				if (d.equals(c.getLast())) {
					if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_0B(c) == null) {
						if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_1B(c) == null) {
							if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_4B(c) == null) {
								if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_5B(d) == null) {
									if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_6B(d) == null) {
										if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_9B(
												d) == null) {
											if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_21BB(c,
													d) == null) {
												for (Statement tmpW : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(c, Statement.class, "next")) {
													if (tmpW instanceof While) {
														While w = (While) tmpW;
														if (!c.equals(w)) {
															Statement tmpA = w.getFirst();
															if (tmpA instanceof While) {
																While a = (While) tmpA;
																if (!a.equals(w)) {
																	if (!a.equals(c)) {
																		Statement tmpB = a.getLast();
																		if (tmpB instanceof Assignment) {
																			Assignment b = (Assignment) tmpB;
																			if (!b.equals(d)) {
																				if (b.equals(a.getFirst())) {
																					if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_18BB(
																							w, c) == null) {
																						if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_19BB(
																								w, c) == null) {
																							if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_20BB(
																									w, d) == null) {
																								if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_23BB(
																										w, d) == null) {
																									if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_2BBB(
																											c, w,
																											a) == null) {
																										if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_3BBB(
																												c, w,
																												a) == null) {
																											if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_7BBBB(
																													d,
																													w,
																													c,
																													a) == null) {
																												if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_8BBBB(
																														d,
																														w,
																														c,
																														a) == null) {
																													if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_14B(
																															a) == null) {
																														if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_15B(
																																a) == null) {
																															if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_16BBB(
																																	a,
																																	w,
																																	c) == null) {
																																if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_17B(
																																		a) == null) {
																																	if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_22BB(
																																			a,
																																			d) == null) {
																																		if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_24BB(
																																				a,
																																				d) == null) {
																																			if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_27BB(
																																					w,
																																					a) == null) {
																																				if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_28BB(
																																						c,
																																						a) == null) {
																																					if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_10B(
																																							b) == null) {
																																						if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_11B(
																																								b) == null) {
																																							if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_12BBBB(
																																									b,
																																									w,
																																									c,
																																									a) == null) {
																																								if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_13B(
																																										b) == null) {
																																									if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_25BB(
																																											w,
																																											b) == null) {
																																										if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_26BB(
																																												c,
																																												b) == null) {
																																											_result.add(
																																													new Object[] {
																																															w,
																																															c,
																																															d,
																																															b,
																																															a,
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileull2branchubb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			whileull2branchubb _this, Match match, While w, While c, Assignment d, Assignment b, While a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, w, c, d, b, a);
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
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("w");
		EObject _localVariable_1 = targetMatch.getObject("v");
		EObject _localVariable_2 = targetMatch.getObject("i");
		EObject _localVariable_3 = targetMatch.getObject("y");
		EObject _localVariable_4 = sourceMatch.getObject("c");
		EObject _localVariable_5 = sourceMatch.getObject("d");
		EObject _localVariable_6 = targetMatch.getObject("x");
		EObject _localVariable_7 = sourceMatch.getObject("b");
		EObject _localVariable_8 = sourceMatch.getObject("a");
		EObject _localVariable_9 = targetMatch.getObject("z");
		EObject tmpW = _localVariable_0;
		EObject tmpV = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpD = _localVariable_5;
		EObject tmpX = _localVariable_6;
		EObject tmpB = _localVariable_7;
		EObject tmpA = _localVariable_8;
		EObject tmpZ = _localVariable_9;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpV instanceof Command) {
				Command v = (Command) tmpV;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						if (tmpC instanceof While) {
							While c = (While) tmpC;
							if (tmpD instanceof Assignment) {
								Assignment d = (Assignment) tmpD;
								if (tmpX instanceof Branch) {
									Branch x = (Branch) tmpX;
									if (tmpB instanceof Assignment) {
										Assignment b = (Assignment) tmpB;
										if (tmpA instanceof While) {
											While a = (While) tmpA;
											if (tmpZ instanceof Branch) {
												Branch z = (Branch) tmpZ;
												return new Object[] { w, v, i, y, c, d, x, b, a, z, sourceMatch,
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

	public static final Object[] pattern_whileull2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(While w,
			Command v, Branch i, Command y, While c, Assignment d, Branch x, Assignment b, While a, Branch z,
			Match sourceMatch, Match targetMatch) {
		if (!v.equals(y)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!c.equals(w)) {
						if (!x.equals(z)) {
							if (!b.equals(d)) {
								if (!a.equals(w)) {
									if (!a.equals(c)) {
										if (!sourceMatch.equals(targetMatch)) {
											return new Object[] { w, v, i, y, c, d, x, b, a, z, sourceMatch,
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
				sourceMatch, targetMatch);
		if (result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding != null) {
			While w = (While) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[0];
			Command v = (Command) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[1];
			Branch i = (Branch) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[2];
			Command y = (Command) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[3];
			While c = (While) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[4];
			Assignment d = (Assignment) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[5];
			Branch x = (Branch) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[6];
			Assignment b = (Assignment) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[7];
			While a = (While) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[8];
			Branch z = (Branch) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_black = pattern_whileull2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					w, v, i, y, c, d, x, b, a, z, sourceMatch, targetMatch);
			if (result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { w, v, i, y, c, d, x, b, a, z, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			whileull2branchubb _this, While w, Command v, Branch i, Command y, While c, Assignment d, Branch x,
			Assignment b, While a, Branch z, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(w, v, i, y, c, d, x, b, a, z, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, w, v, i, y, c, d, x, b, a, z, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			whileull2branchubb _this, While w, Command v, Branch i, Command y, While c, Assignment d, Branch x,
			Assignment b, While a, Branch z, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileull2branchubb_24_3_solvecsp_binding = pattern_whileull2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, w, v, i, y, c, d, x, b, a, z, sourceMatch, targetMatch);
		if (result_pattern_whileull2branchubb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileull2branchubb_24_3_solvecsp_black = pattern_whileull2branchubb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileull2branchubb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, w, v, i, y, c, d, x, b, a, z, sourceMatch, targetMatch };
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

	public static final Object[] pattern_whileull2branchubb_24_6_createcorrespondence_blackBBBBBBBBBBB(While w,
			Command v, Branch i, Command y, While c, Assignment d, Branch x, Assignment b, While a, Branch z,
			CCMatch ccMatch) {
		if (!v.equals(y)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!c.equals(w)) {
						if (!x.equals(z)) {
							if (!b.equals(d)) {
								if (!a.equals(w)) {
									if (!a.equals(c)) {
										return new Object[] { w, v, i, y, c, d, x, b, a, z, ccMatch };
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

	public static final Object[] pattern_whileull2branchubb_24_6_createcorrespondence_greenFBFBBFFBBBBBB(Command v,
			Command y, While c, Assignment d, Branch x, Assignment b, While a, Branch z, CCMatch ccMatch) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		d2v.setTarget(v);
		d2v.setSource(d);
		ccMatch.getCreateCorr().add(d2v);
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { b2y, v, d2v, y, c, c2z, a2x, d, x, b, a, z, ccMatch };
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

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_0B(While c) {
		for (Decision __DEC_c_positive_423609 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_347520 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_2BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_986018 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_986018)) {
							if (!w.equals(__DEC_c_first_986018)) {
								if (!a.equals(__DEC_c_first_986018)) {
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

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_3BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_583052 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_583052)) {
							if (!w.equals(__DEC_c_last_583052)) {
								if (!a.equals(__DEC_c_last_583052)) {
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

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_4B(While c) {
		for (Program __DEC_c_first_193346 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_5B(Assignment d) {
		for (Decision __DEC_d_positive_759503 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_6B(Assignment d) {
		for (Decision __DEC_d_negative_804514 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_7BBBB(Assignment d, While w,
			While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_d_first_864578 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!w.equals(__DEC_d_first_864578)) {
							if (!c.equals(__DEC_d_first_864578)) {
								if (!a.equals(__DEC_d_first_864578)) {
									return new Object[] { d, w, c, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_8BBBB(Assignment d, While w,
			While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_d_last_696355 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!w.equals(__DEC_d_last_696355)) {
							if (!c.equals(__DEC_d_last_696355)) {
								if (!a.equals(__DEC_d_last_696355)) {
									return new Object[] { d, w, c, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_9B(Assignment d) {
		for (Program __DEC_d_first_497853 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_10B(Assignment b) {
		for (Decision __DEC_b_positive_727699 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_11B(Assignment b) {
		for (Decision __DEC_b_negative_568704 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_12BBBB(Assignment b, While w,
			While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_b_last_499635 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!w.equals(__DEC_b_last_499635)) {
							if (!c.equals(__DEC_b_last_499635)) {
								if (!a.equals(__DEC_b_last_499635)) {
									return new Object[] { b, w, c, a };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_13B(Assignment b) {
		for (Program __DEC_b_first_395429 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_14B(While a) {
		for (Decision __DEC_a_positive_129431 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_15B(While a) {
		for (Decision __DEC_a_negative_814011 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_16BBB(While a, While w,
			While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_57844 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_57844)) {
							if (!w.equals(__DEC_a_last_57844)) {
								if (!c.equals(__DEC_a_last_57844)) {
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

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_17B(While a) {
		for (Program __DEC_a_first_335909 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_18BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_19BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_20BB(While w, Assignment d) {
		if (d.equals(w.getFirst())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_21BB(While c, Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_22BB(While a, Assignment d) {
		if (d.equals(a.getFirst())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_23BB(While w, Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_24BB(While a, Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_25BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_26BB(While c, Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_27BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_28BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_blackBBBBB(While w, While c,
			Assignment d, Assignment b, While a) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						if (d.equals(c.getLast())) {
							if (a.equals(w.getFirst())) {
								if (b.equals(a.getLast())) {
									if (b.equals(a.getFirst())) {
										if (c.equals(w.getNext())) {
											if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_0B(
													c) == null) {
												if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_1B(
														c) == null) {
													if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_2BBB(
															c, w, a) == null) {
														if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_3BBB(
																c, w, a) == null) {
															if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_4B(
																	c) == null) {
																if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_5B(
																		d) == null) {
																	if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_6B(
																			d) == null) {
																		if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_7BBBB(
																				d, w, c, a) == null) {
																			if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_8BBBB(
																					d, w, c, a) == null) {
																				if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_9B(
																						d) == null) {
																					if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_10B(
																							b) == null) {
																						if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_11B(
																								b) == null) {
																							if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_12BBBB(
																									b, w, c,
																									a) == null) {
																								if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_13B(
																										b) == null) {
																									if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_14B(
																											a) == null) {
																										if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_15B(
																												a) == null) {
																											if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_16BBB(
																													a,
																													w,
																													c) == null) {
																												if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_17B(
																														a) == null) {
																													if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_18BB(
																															w,
																															c) == null) {
																														if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_19BB(
																																w,
																																c) == null) {
																															if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_20BB(
																																	w,
																																	d) == null) {
																																if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_21BB(
																																		c,
																																		d) == null) {
																																	if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_22BB(
																																			a,
																																			d) == null) {
																																		if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_23BB(
																																				w,
																																				d) == null) {
																																			if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_24BB(
																																					a,
																																					d) == null) {
																																				if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_25BB(
																																						w,
																																						b) == null) {
																																					if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_26BB(
																																							c,
																																							b) == null) {
																																						if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_27BB(
																																								w,
																																								a) == null) {
																																							if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_28BB(
																																									c,
																																									a) == null) {
																																								return new Object[] {
																																										w,
																																										c,
																																										d,
																																										b,
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_0B(Command v) {
		for (Graph __DEC_v_root_371368 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_1BBBB(Command v, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_positive_242761 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!i.equals(__DEC_v_positive_242761)) {
							if (!x.equals(__DEC_v_positive_242761)) {
								if (!z.equals(__DEC_v_positive_242761)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_2BBBB(Command v, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_negative_330979 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!i.equals(__DEC_v_negative_330979)) {
							if (!x.equals(__DEC_v_negative_330979)) {
								if (!z.equals(__DEC_v_negative_330979)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_61939 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_4BBBB(Command y, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_711073 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!i.equals(__DEC_y_positive_711073)) {
							if (!x.equals(__DEC_y_positive_711073)) {
								if (!z.equals(__DEC_y_positive_711073)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_5BBBB(Command y, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_811202 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!i.equals(__DEC_y_negative_811202)) {
							if (!x.equals(__DEC_y_negative_811202)) {
								if (!z.equals(__DEC_y_negative_811202)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_136418 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_7BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_54542 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_54542)) {
							if (!i.equals(__DEC_x_positive_54542)) {
								if (!z.equals(__DEC_x_positive_54542)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_8BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_96353 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_96353)) {
							if (!i.equals(__DEC_x_negative_96353)) {
								if (!z.equals(__DEC_x_negative_96353)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_9B(Branch z) {
		for (Graph __DEC_z_root_386614 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_10BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_465089 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_465089)) {
							if (!i.equals(__DEC_z_positive_465089)) {
								if (!x.equals(__DEC_z_positive_465089)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_11BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_812406 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_812406)) {
							if (!i.equals(__DEC_z_negative_812406)) {
								if (!x.equals(__DEC_z_negative_812406)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_12BB(Branch i, Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_13BB(Branch x, Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_14BB(Branch z, Command v) {
		if (v.equals(z.getPositive())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_15BB(Branch i, Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_16BB(Branch x, Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_17BB(Branch z, Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_18BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_19BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_20BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_21BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_22BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_23BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_24BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_25BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_26BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_blackBBBBB(Command v, Branch i,
			Command y, Branch x, Branch z) {
		if (!v.equals(y)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!x.equals(z)) {
						if (z.equals(v.getNext())) {
							if (x.equals(i.getPositive())) {
								if (z.equals(i.getNegative())) {
									if (x.equals(y.getNext())) {
										if (y.equals(x.getPositive())) {
											if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_0B(
													v) == null) {
												if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_1BBBB(v,
														i, x, z) == null) {
													if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_2BBBB(
															v, i, x, z) == null) {
														if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_3B(
																y) == null) {
															if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_4BBBB(
																	y, i, x, z) == null) {
																if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_5BBBB(
																		y, i, x, z) == null) {
																	if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_6B(
																			x) == null) {
																		if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_7BBB(
																				x, i, z) == null) {
																			if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_8BBB(
																					x, i, z) == null) {
																				if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_9B(
																						z) == null) {
																					if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_10BBB(
																							z, i, x) == null) {
																						if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_11BBB(
																								z, i, x) == null) {
																							if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_12BB(
																									i, v) == null) {
																								if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_13BB(
																										x, v) == null) {
																									if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_14BB(
																											z,
																											v) == null) {
																										if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_15BB(
																												i,
																												v) == null) {
																											if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_16BB(
																													x,
																													v) == null) {
																												if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_17BB(
																														z,
																														v) == null) {
																													if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_18BB(
																															i,
																															y) == null) {
																														if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_19BB(
																																z,
																																y) == null) {
																															if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_20BB(
																																	i,
																																	y) == null) {
																																if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_21BB(
																																		x,
																																		y) == null) {
																																	if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_22BB(
																																			z,
																																			y) == null) {
																																		if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_23BB(
																																				i,
																																				x) == null) {
																																			if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_24BB(
																																					i,
																																					z) == null) {
																																				if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_25BB(
																																						x,
																																						z) == null) {
																																					if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_26BB(
																																							x,
																																							z) == null) {
																																						return new Object[] {
																																								v,
																																								i,
																																								y,
																																								x,
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

	public static final Object[] pattern_whileull2branchubb_29_6_perform_greenFBFFBFFFFFFFFFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(b2y);
		ruleResult.getTargetObjects().add(v);
		d2v.setTarget(v);
		ruleResult.getCorrObjects().add(d2v);
		b2y.setTarget(y);
		ruleResult.getTargetObjects().add(y);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		ruleResult.getCorrObjects().add(a2x);
		c.setLast(d);
		d2v.setSource(d);
		ruleResult.getSourceObjects().add(d);
		i.setPositive(x);
		y.setNext(x);
		x.setPositive(y);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		w.setFirst(a);
		a.setLast(b);
		a.setFirst(b);
		a2x.setSource(a);
		ruleResult.getSourceObjects().add(a);
		v.setNext(z);
		i.setNegative(z);
		c2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { b2y, w, v, d2v, i, y, c, c2z, a2x, d, x, b, a, z, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileull2branchubb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileull2branchubbImpl
