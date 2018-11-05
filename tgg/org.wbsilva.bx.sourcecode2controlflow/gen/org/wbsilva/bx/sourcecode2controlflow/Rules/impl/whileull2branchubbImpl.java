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
	public boolean isAppropriate_FWD(Match match, While w, While c, While a, Assignment b, Assignment d) {

		Object[] result1_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_0_1_initialbindings_blackBBBBBBB(this, match, w, c, a, b, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
					+ "[b] = " + b + ", " + "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, w, c, a, b, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
					+ "[b] = " + b + ", " + "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileull2branchubbImpl.pattern_whileull2branchubb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileull2branchubbImpl
					.pattern_whileull2branchubb_0_4_collectelementstobetranslated_blackBBBBBB(match, w, c, a, b, d);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[w] = " + w + ", "
								+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
			}
			whileull2branchubbImpl.pattern_whileull2branchubb_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(match,
					w, c, a, b, d);
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__d____last = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge a__b____first = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[10];

			Object[] result5_black = whileull2branchubbImpl
					.pattern_whileull2branchubb_0_5_collectcontextelements_blackBBBBBB(match, w, c, a, b, d);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[w] = " + w + ", "
								+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d + ".");
			}
			whileull2branchubbImpl.pattern_whileull2branchubb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileull2branchubbImpl.pattern_whileull2branchubb_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					w, c, a, b, d);
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
		S2B w2i = (S2B) result1_bindingAndBlack[0];
		While w = (While) result1_bindingAndBlack[1];
		While c = (While) result1_bindingAndBlack[2];
		While a = (While) result1_bindingAndBlack[3];
		Assignment b = (Assignment) result1_bindingAndBlack[4];
		Assignment d = (Assignment) result1_bindingAndBlack[5];
		Branch i = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_1_1_performtransformation_greenFFFFBBFFFBBBF(c, a, b, d, i);
		Branch x = (Branch) result1_green[0];
		S2B c2z = (S2B) result1_green[1];
		S2N d2v = (S2N) result1_green[2];
		Command v = (Command) result1_green[3];
		Branch z = (Branch) result1_green[6];
		S2N b2y = (S2N) result1_green[7];
		S2B a2x = (S2B) result1_green[8];
		Command y = (Command) result1_green[12];

		Object[] result2_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(x, c2z, d2v, v, c, a, z,
						b2y, a2x, b, d, y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[c2z] = "
					+ c2z + ", " + "[d2v] = " + d2v + ", " + "[v] = " + v + ", " + "[c] = " + c + ", " + "[a] = " + a
					+ ", " + "[z] = " + z + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b
					+ ", " + "[d] = " + d + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(x, c2z, d2v, v, c, a, z,
						b2y, a2x, b, d, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, x, w2i, c2z, d2v,
						v, w, c, a, z, b2y, a2x, b, d, i, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[x] = " + x + ", " + "[w2i] = " + w2i + ", " + "[c2z] = " + c2z + ", " + "[d2v] = " + d2v
					+ ", " + "[v] = " + v + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
					+ "[z] = " + z + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ", "
					+ "[d] = " + d + ", " + "[i] = " + i + ", " + "[y] = " + y + ".");
		}
		whileull2branchubbImpl
				.pattern_whileull2branchubb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(ruleresult,
						x, c2z, d2v, v, w, c, a, z, b2y, a2x, b, d, i, y);
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[32];

		// 
		// 
		whileull2branchubbImpl.pattern_whileull2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, x, w2i, c2z, d2v, v, w, c, a, z, b2y, a2x, b, d, i, y);
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
		While a = (While) result2_binding[2];
		Assignment b = (Assignment) result2_binding[3];
		Assignment d = (Assignment) result2_binding[4];
		for (Object[] result2_black : whileull2branchubbImpl.pattern_whileull2branchubb_2_2_corematch_blackFBBBBBFB(w,
				c, a, b, d, match)) {
			S2B w2i = (S2B) result2_black[0];
			Branch i = (Branch) result2_black[6];
			// ForEach 
			for (Object[] result3_black : whileull2branchubbImpl
					.pattern_whileull2branchubb_2_3_findcontext_blackBBBBBBB(w2i, w, c, a, b, d, i)) {
				Object[] result3_green = whileull2branchubbImpl
						.pattern_whileull2branchubb_2_3_findcontext_greenBBBBBBBFFFFFFFF(w2i, w, c, a, b, d, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = whileull2branchubbImpl
						.pattern_whileull2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, w2i,
								w, c, a, b, d, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[w] = "
							+ w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[d] = " + d
							+ ", " + "[i] = " + i + ".");
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
	public void registerObjectsToMatch_FWD(Match match, While w, While c, While a, Assignment b, Assignment d) {
		match.registerObject("w", w);
		match.registerObject("c", c);
		match.registerObject("a", a);
		match.registerObject("b", b);
		match.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While w, While c, While a, Assignment b, Assignment d) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, S2B w2i, While w, While c, While a,
			Assignment b, Assignment d, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("b", b);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject x, EObject w2i, EObject c2z, EObject d2v,
			EObject v, EObject w, EObject c, EObject a, EObject z, EObject b2y, EObject a2x, EObject b, EObject d,
			EObject i, EObject y) {
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch x, Command v, Branch z, Branch i, Command y) {

		Object[] result1_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_10_1_initialbindings_blackBBBBBBB(this, match, x, v, z, i, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[v] = " + v + ", " + "[z] = " + z + ", "
					+ "[i] = " + i + ", " + "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, x, v, z, i, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[v] = " + v + ", " + "[z] = " + z + ", "
					+ "[i] = " + i + ", " + "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileull2branchubbImpl.pattern_whileull2branchubb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileull2branchubbImpl
					.pattern_whileull2branchubb_10_4_collectelementstobetranslated_blackBBBBBB(match, x, v, z, i, y);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[x] = " + x + ", "
								+ "[v] = " + v + ", " + "[z] = " + z + ", " + "[i] = " + i + ", " + "[y] = " + y + ".");
			}
			whileull2branchubbImpl.pattern_whileull2branchubb_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(match,
					x, v, z, i, y);
			//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge v__z____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[10];

			Object[] result5_black = whileull2branchubbImpl
					.pattern_whileull2branchubb_10_5_collectcontextelements_blackBBBBBB(match, x, v, z, i, y);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[x] = " + x + ", "
								+ "[v] = " + v + ", " + "[z] = " + z + ", " + "[i] = " + i + ", " + "[y] = " + y + ".");
			}
			whileull2branchubbImpl.pattern_whileull2branchubb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileull2branchubbImpl.pattern_whileull2branchubb_10_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					x, v, z, i, y);
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
		Branch x = (Branch) result1_bindingAndBlack[0];
		S2B w2i = (S2B) result1_bindingAndBlack[1];
		Command v = (Command) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		Branch z = (Branch) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		Command y = (Command) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_11_1_performtransformation_greenBFFBBFFBFFFFB(x, v, w, z, y);
		S2B c2z = (S2B) result1_green[1];
		S2N d2v = (S2N) result1_green[2];
		While c = (While) result1_green[5];
		While a = (While) result1_green[6];
		S2N b2y = (S2N) result1_green[8];
		S2B a2x = (S2B) result1_green[9];
		Assignment b = (Assignment) result1_green[10];
		Assignment d = (Assignment) result1_green[11];

		Object[] result2_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(x, c2z, d2v, v, c, a, z,
						b2y, a2x, b, d, y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[c2z] = "
					+ c2z + ", " + "[d2v] = " + d2v + ", " + "[v] = " + v + ", " + "[c] = " + c + ", " + "[a] = " + a
					+ ", " + "[z] = " + z + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b
					+ ", " + "[d] = " + d + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = whileull2branchubbImpl
				.pattern_whileull2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(x, c2z, d2v, v, c, a, z,
						b2y, a2x, b, d, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileull2branchubbImpl
				.pattern_whileull2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, x, w2i, c2z, d2v,
						v, w, c, a, z, b2y, a2x, b, d, i, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[x] = " + x + ", " + "[w2i] = " + w2i + ", " + "[c2z] = " + c2z + ", " + "[d2v] = " + d2v
					+ ", " + "[v] = " + v + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
					+ "[z] = " + z + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ", "
					+ "[d] = " + d + ", " + "[i] = " + i + ", " + "[y] = " + y + ".");
		}
		whileull2branchubbImpl
				.pattern_whileull2branchubb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(ruleresult,
						x, c2z, d2v, v, w, c, a, z, b2y, a2x, b, d, i, y);
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[32];

		// 
		// 
		whileull2branchubbImpl.pattern_whileull2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, x, w2i, c2z, d2v, v, w, c, a, z, b2y, a2x, b, d, i, y);
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
		Branch x = (Branch) result2_binding[0];
		Command v = (Command) result2_binding[1];
		Branch z = (Branch) result2_binding[2];
		Branch i = (Branch) result2_binding[3];
		Command y = (Command) result2_binding[4];
		for (Object[] result2_black : whileull2branchubbImpl.pattern_whileull2branchubb_12_2_corematch_blackBFBFBBBB(x,
				v, z, i, y, match)) {
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whileull2branchubbImpl
					.pattern_whileull2branchubb_12_3_findcontext_blackBBBBBBB(x, w2i, v, w, z, i, y)) {
				Object[] result3_green = whileull2branchubbImpl
						.pattern_whileull2branchubb_12_3_findcontext_greenBBBBBBBFFFFFFFF(x, w2i, v, w, z, i, y);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = whileull2branchubbImpl
						.pattern_whileull2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, x,
								w2i, v, w, z, i, y);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[x] = " + x + ", " + "[w2i] = "
							+ w2i + ", " + "[v] = " + v + ", " + "[w] = " + w + ", " + "[z] = " + z + ", " + "[i] = "
							+ i + ", " + "[y] = " + y + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch x, Command v, Branch z, Branch i, Command y) {
		match.registerObject("x", x);
		match.registerObject("v", v);
		match.registerObject("z", z);
		match.registerObject("i", i);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch x, Command v, Branch z, Branch i, Command y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch x, S2B w2i, Command v, While w,
			Branch z, Branch i, Command y) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("v", v);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("y", y);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject x, EObject w2i, EObject c2z, EObject d2v,
			EObject v, EObject w, EObject c, EObject a, EObject z, EObject b2y, EObject a2x, EObject b, EObject d,
			EObject i, EObject y) {
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("v").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_262(EMoflonEdge _edge_positive) {

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
			Branch x = (Branch) result2_black[0];
			Command v = (Command) result2_black[1];
			Branch z = (Branch) result2_black[2];
			Branch i = (Branch) result2_black[3];
			Command y = (Command) result2_black[4];
			Object[] result2_green = whileull2branchubbImpl
					.pattern_whileull2branchubb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileull2branchubbImpl
					.pattern_whileull2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, x, v, z, i, y)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_270(EMoflonEdge _edge_first) {

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
			While c = (While) result2_black[1];
			While a = (While) result2_black[2];
			Assignment b = (Assignment) result2_black[3];
			Assignment d = (Assignment) result2_black[4];
			Object[] result2_green = whileull2branchubbImpl
					.pattern_whileull2branchubb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileull2branchubbImpl
					.pattern_whileull2branchubb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, w, c, a, b, d)) {
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
		Branch x = (Branch) result2_bindingAndBlack[0];
		Command v = (Command) result2_bindingAndBlack[1];
		While w = (While) result2_bindingAndBlack[2];
		While c = (While) result2_bindingAndBlack[3];
		While a = (While) result2_bindingAndBlack[4];
		Branch z = (Branch) result2_bindingAndBlack[5];
		Assignment b = (Assignment) result2_bindingAndBlack[6];
		Assignment d = (Assignment) result2_bindingAndBlack[7];
		Branch i = (Branch) result2_bindingAndBlack[8];
		Command y = (Command) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = whileull2branchubbImpl
				.pattern_whileull2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, x, v, w, c, a, z, b, d, i,
						y, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[x] = " + x + ", " + "[v] = " + v + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = "
					+ a + ", " + "[z] = " + z + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[i] = " + i + ", "
					+ "[y] = " + y + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileull2branchubbImpl.pattern_whileull2branchubb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileull2branchubbImpl
					.pattern_whileull2branchubb_24_5_matchcorrcontext_blackFBBBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[0];
				Object[] result5_green = whileull2branchubbImpl
						.pattern_whileull2branchubb_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileull2branchubbImpl
						.pattern_whileull2branchubb_24_6_createcorrespondence_blackBBBBBBBBBBB(x, v, w, c, a, z, b, d,
								i, y, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", "
							+ "[v] = " + v + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
							+ "[z] = " + z + ", " + "[b] = " + b + ", " + "[d] = " + d + ", " + "[i] = " + i + ", "
							+ "[y] = " + y + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileull2branchubbImpl.pattern_whileull2branchubb_24_6_createcorrespondence_greenBFFBBBBFFBBBB(x, v, c,
						a, z, b, d, y, ccMatch);
				//nothing S2B c2z = (S2B) result6_green[1];
				//nothing S2N d2v = (S2N) result6_green[2];
				//nothing S2N b2y = (S2N) result6_green[7];
				//nothing S2B a2x = (S2B) result6_green[8];

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
	public CSP isApplicable_solveCsp_CC(Branch x, Command v, While w, While c, While a, Branch z, Assignment b,
			Assignment d, Branch i, Command y, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While w, While c, While a, Assignment b, Assignment d) {// 
		Object[] result1_black = whileull2branchubbImpl.pattern_whileull2branchubb_27_1_matchtggpattern_blackBBBBB(w, c,
				a, b, d);
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
	public boolean checkDEC_BWD(Branch x, Command v, Branch z, Branch i, Command y) {// 
		Object[] result1_black = whileull2branchubbImpl.pattern_whileull2branchubb_28_1_matchtggpattern_blackBBBBB(x, v,
				z, i, y);
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
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whileull2branchubbImpl
					.pattern_whileull2branchubb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w2i, w, i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w
						+ ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileull2branchubbImpl.pattern_whileull2branchubb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileull2branchubbImpl.pattern_whileull2branchubb_29_5_checknacs_blackBBB(w2i,
						w, i);
				if (result5_black != null) {

					Object[] result6_black = whileull2branchubbImpl
							.pattern_whileull2branchubb_29_6_perform_blackBBBB(w2i, w, i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w2i] = " + w2i + ", "
								+ "[w] = " + w + ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileull2branchubbImpl.pattern_whileull2branchubb_29_6_perform_greenFFFFBFFFFFFFBFB(w, i,
							ruleResult);
					//nothing Branch x = (Branch) result6_green[0];
					//nothing S2B c2z = (S2B) result6_green[1];
					//nothing S2N d2v = (S2N) result6_green[2];
					//nothing Command v = (Command) result6_green[3];
					//nothing While c = (While) result6_green[5];
					//nothing While a = (While) result6_green[6];
					//nothing Branch z = (Branch) result6_green[7];
					//nothing S2N b2y = (S2N) result6_green[8];
					//nothing S2B a2x = (S2B) result6_green[9];
					//nothing Assignment b = (Assignment) result6_green[10];
					//nothing Assignment d = (Assignment) result6_green[11];
					//nothing Command y = (Command) result6_green[13];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i,
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
		isApplicableMatch.registerObject("w", w);
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
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_FWD__MATCH_WHILE_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4), (Assignment) arguments.get(5));
		case RulesPackage.WHILEULL2BRANCHUBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4), (Assignment) arguments.get(5));
			return null;
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(Assignment) arguments.get(5));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2B_WHILE_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5), (Assignment) arguments.get(6), (Branch) arguments.get(7));
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
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_BRANCH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4), (Command) arguments.get(5));
		case RulesPackage.WHILEULL2BRANCHUBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_BRANCH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4), (Command) arguments.get(5));
			return null;
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_BRANCH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Command) arguments.get(5));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_COMMAND_WHILE_BRANCH_BRANCH_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Command) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5), (Branch) arguments.get(6), (Command) arguments.get(7));
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
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_262__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_262((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_270__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_270((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_COMMAND_WHILE_WHILE_WHILE_BRANCH_ASSIGNMENT_ASSIGNMENT_BRANCH_COMMAND_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Command) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5), (Assignment) arguments.get(6), (Assignment) arguments.get(7),
					(Branch) arguments.get(8), (Command) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.WHILEULL2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_DEC_FWD__WHILE_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT:
			return checkDEC_FWD((While) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILEULL2BRANCHUBB___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH_BRANCH_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.WHILEULL2BRANCHUBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEULL2BRANCHUBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_WHILE_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEULL2BRANCHUBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileull2branchubb_0_1_initialbindings_blackBBBBBBB(whileull2branchubb _this,
			Match match, While w, While c, While a, Assignment b, Assignment d) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					if (!b.equals(d)) {
						return new Object[] { _this, match, w, c, a, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_0_2_SolveCSP_bindingFBBBBBBB(whileull2branchubb _this,
			Match match, While w, While c, While a, Assignment b, Assignment d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, w, c, a, b, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, c, a, b, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whileull2branchubb _this, Match match, While w, While c, While a, Assignment b, Assignment d) {
		Object[] result_pattern_whileull2branchubb_0_2_SolveCSP_binding = pattern_whileull2branchubb_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, w, c, a, b, d);
		if (result_pattern_whileull2branchubb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_0_2_SolveCSP_black = pattern_whileull2branchubb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, c, a, b, d };
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
			While w, While c, While a, Assignment b, Assignment d) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					if (!b.equals(d)) {
						return new Object[] { match, w, c, a, b, d };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, While w, While c, While a, Assignment b, Assignment d) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(d);
		String w__a____first_name_prime = "first";
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
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
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		w__a____first.setName(w__a____first_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { match, w, c, a, b, d, w__a____first, c__d____last, a__b____last, a__b____first,
				w__c____next };
	}

	public static final Object[] pattern_whileull2branchubb_0_5_collectcontextelements_blackBBBBBB(Match match, While w,
			While c, While a, Assignment b, Assignment d) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					if (!b.equals(d)) {
						return new Object[] { match, w, c, a, b, d };
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
			whileull2branchubb _this, Match match, While w, While c, While a, Assignment b, Assignment d) {
		_this.registerObjectsToMatch_FWD(match, w, c, a, b, d);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("a");
		EObject _localVariable_4 = isApplicableMatch.getObject("b");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject _localVariable_6 = isApplicableMatch.getObject("i");
		EObject tmpW2i = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpD = _localVariable_5;
		EObject tmpI = _localVariable_6;
		if (tmpW2i instanceof S2B) {
			S2B w2i = (S2B) tmpW2i;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpC instanceof While) {
					While c = (While) tmpC;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (tmpD instanceof Assignment) {
								Assignment d = (Assignment) tmpD;
								if (tmpI instanceof Branch) {
									Branch i = (Branch) tmpI;
									return new Object[] { w2i, w, c, a, b, d, i, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_1_1_performtransformation_blackBBBBBBBFBB(S2B w2i, While w,
			While c, While a, Assignment b, Assignment d, Branch i, whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					if (!b.equals(d)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { w2i, w, c, a, b, d, i, csp, _this, isApplicableMatch };
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
			S2B w2i = (S2B) result_pattern_whileull2branchubb_1_1_performtransformation_binding[0];
			While w = (While) result_pattern_whileull2branchubb_1_1_performtransformation_binding[1];
			While c = (While) result_pattern_whileull2branchubb_1_1_performtransformation_binding[2];
			While a = (While) result_pattern_whileull2branchubb_1_1_performtransformation_binding[3];
			Assignment b = (Assignment) result_pattern_whileull2branchubb_1_1_performtransformation_binding[4];
			Assignment d = (Assignment) result_pattern_whileull2branchubb_1_1_performtransformation_binding[5];
			Branch i = (Branch) result_pattern_whileull2branchubb_1_1_performtransformation_binding[6];

			Object[] result_pattern_whileull2branchubb_1_1_performtransformation_black = pattern_whileull2branchubb_1_1_performtransformation_blackBBBBBBBFBB(
					w2i, w, c, a, b, d, i, _this, isApplicableMatch);
			if (result_pattern_whileull2branchubb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileull2branchubb_1_1_performtransformation_black[7];

				return new Object[] { w2i, w, c, a, b, d, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_1_1_performtransformation_greenFFFFBBFFFBBBF(While c,
			While a, Assignment b, Assignment d, Branch i) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		i.setPositive(x);
		c2z.setSource(c);
		d2v.setSource(d);
		d2v.setTarget(v);
		c2z.setTarget(z);
		v.setNext(z);
		i.setNegative(z);
		b2y.setSource(b);
		a2x.setSource(a);
		a2x.setTarget(x);
		x.setPositive(y);
		b2y.setTarget(y);
		y.setNext(x);
		return new Object[] { x, c2z, d2v, v, c, a, z, b2y, a2x, b, d, i, y };
	}

	public static final Object[] pattern_whileull2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(Branch x,
			S2B c2z, S2N d2v, Command v, While c, While a, Branch z, S2N b2y, S2B a2x, Assignment b, Assignment d,
			Command y) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!a.equals(c)) {
					if (!b2y.equals(d2v)) {
						if (!a2x.equals(c2z)) {
							if (!b.equals(d)) {
								return new Object[] { x, c2z, d2v, v, c, a, z, b2y, a2x, b, d, y };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(Branch x,
			S2B c2z, S2N d2v, Command v, While c, While a, Branch z, S2N b2y, S2B a2x, Assignment b, Assignment d,
			Command y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedElements().add(v);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getCreatedElements().add(y);
		return new Object[] { ruleresult, x, c2z, d2v, v, c, a, z, b2y, a2x, b, d, y };
	}

	public static final Object[] pattern_whileull2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject x, EObject w2i, EObject c2z, EObject d2v, EObject v, EObject w,
			EObject c, EObject a, EObject z, EObject b2y, EObject a2x, EObject b, EObject d, EObject i, EObject y) {
		if (!x.equals(z)) {
			if (!x.equals(y)) {
				if (!w2i.equals(x)) {
					if (!w2i.equals(z)) {
						if (!w2i.equals(y)) {
							if (!c2z.equals(x)) {
								if (!c2z.equals(w2i)) {
									if (!c2z.equals(d2v)) {
										if (!c2z.equals(v)) {
											if (!c2z.equals(w)) {
												if (!c2z.equals(z)) {
													if (!c2z.equals(d)) {
														if (!c2z.equals(i)) {
															if (!c2z.equals(y)) {
																if (!d2v.equals(x)) {
																	if (!d2v.equals(w2i)) {
																		if (!d2v.equals(v)) {
																			if (!d2v.equals(w)) {
																				if (!d2v.equals(z)) {
																					if (!d2v.equals(i)) {
																						if (!d2v.equals(y)) {
																							if (!v.equals(x)) {
																								if (!v.equals(w2i)) {
																									if (!v.equals(w)) {
																										if (!v.equals(
																												z)) {
																											if (!v.equals(
																													y)) {
																												if (!w.equals(
																														x)) {
																													if (!w.equals(
																															w2i)) {
																														if (!w.equals(
																																z)) {
																															if (!w.equals(
																																	y)) {
																																if (!c.equals(
																																		x)) {
																																	if (!c.equals(
																																			w2i)) {
																																		if (!c.equals(
																																				c2z)) {
																																			if (!c.equals(
																																					d2v)) {
																																				if (!c.equals(
																																						v)) {
																																					if (!c.equals(
																																							w)) {
																																						if (!c.equals(
																																								z)) {
																																							if (!c.equals(
																																									d)) {
																																								if (!c.equals(
																																										i)) {
																																									if (!c.equals(
																																											y)) {
																																										if (!a.equals(
																																												x)) {
																																											if (!a.equals(
																																													w2i)) {
																																												if (!a.equals(
																																														c2z)) {
																																													if (!a.equals(
																																															d2v)) {
																																														if (!a.equals(
																																																v)) {
																																															if (!a.equals(
																																																	w)) {
																																																if (!a.equals(
																																																		c)) {
																																																	if (!a.equals(
																																																			z)) {
																																																		if (!a.equals(
																																																				b2y)) {
																																																			if (!a.equals(
																																																					a2x)) {
																																																				if (!a.equals(
																																																						b)) {
																																																					if (!a.equals(
																																																							d)) {
																																																						if (!a.equals(
																																																								i)) {
																																																							if (!a.equals(
																																																									y)) {
																																																								if (!b2y.equals(
																																																										x)) {
																																																									if (!b2y.equals(
																																																											w2i)) {
																																																										if (!b2y.equals(
																																																												c2z)) {
																																																											if (!b2y.equals(
																																																													d2v)) {
																																																												if (!b2y.equals(
																																																														v)) {
																																																													if (!b2y.equals(
																																																															w)) {
																																																														if (!b2y.equals(
																																																																c)) {
																																																															if (!b2y.equals(
																																																																	z)) {
																																																																if (!b2y.equals(
																																																																		d)) {
																																																																	if (!b2y.equals(
																																																																			i)) {
																																																																		if (!b2y.equals(
																																																																				y)) {
																																																																			if (!a2x.equals(
																																																																					x)) {
																																																																				if (!a2x.equals(
																																																																						w2i)) {
																																																																					if (!a2x.equals(
																																																																							c2z)) {
																																																																						if (!a2x.equals(
																																																																								d2v)) {
																																																																							if (!a2x.equals(
																																																																									v)) {
																																																																								if (!a2x.equals(
																																																																										w)) {
																																																																									if (!a2x.equals(
																																																																											c)) {
																																																																										if (!a2x.equals(
																																																																												z)) {
																																																																											if (!a2x.equals(
																																																																													b2y)) {
																																																																												if (!a2x.equals(
																																																																														b)) {
																																																																													if (!a2x.equals(
																																																																															d)) {
																																																																														if (!a2x.equals(
																																																																																i)) {
																																																																															if (!a2x.equals(
																																																																																	y)) {
																																																																																if (!b.equals(
																																																																																		x)) {
																																																																																	if (!b.equals(
																																																																																			w2i)) {
																																																																																		if (!b.equals(
																																																																																				c2z)) {
																																																																																			if (!b.equals(
																																																																																					d2v)) {
																																																																																				if (!b.equals(
																																																																																						v)) {
																																																																																					if (!b.equals(
																																																																																							w)) {
																																																																																						if (!b.equals(
																																																																																								c)) {
																																																																																							if (!b.equals(
																																																																																									z)) {
																																																																																								if (!b.equals(
																																																																																										b2y)) {
																																																																																									if (!b.equals(
																																																																																											d)) {
																																																																																										if (!b.equals(
																																																																																												i)) {
																																																																																											if (!b.equals(
																																																																																													y)) {
																																																																																												if (!d.equals(
																																																																																														x)) {
																																																																																													if (!d.equals(
																																																																																															w2i)) {
																																																																																														if (!d.equals(
																																																																																																d2v)) {
																																																																																															if (!d.equals(
																																																																																																	v)) {
																																																																																																if (!d.equals(
																																																																																																		w)) {
																																																																																																	if (!d.equals(
																																																																																																			z)) {
																																																																																																		if (!d.equals(
																																																																																																				i)) {
																																																																																																			if (!d.equals(
																																																																																																					y)) {
																																																																																																				if (!i.equals(
																																																																																																						x)) {
																																																																																																					if (!i.equals(
																																																																																																							w2i)) {
																																																																																																						if (!i.equals(
																																																																																																								v)) {
																																																																																																							if (!i.equals(
																																																																																																									w)) {
																																																																																																								if (!i.equals(
																																																																																																										z)) {
																																																																																																									if (!i.equals(
																																																																																																											y)) {
																																																																																																										if (!y.equals(
																																																																																																												z)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													x,
																																																																																																													w2i,
																																																																																																													c2z,
																																																																																																													d2v,
																																																																																																													v,
																																																																																																													w,
																																																																																																													c,
																																																																																																													a,
																																																																																																													z,
																																																																																																													b2y,
																																																																																																													a2x,
																																																																																																													b,
																																																																																																													d,
																																																																																																													i,
																																																																																																													y };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject x, EObject c2z, EObject d2v, EObject v, EObject w, EObject c,
			EObject a, EObject z, EObject b2y, EObject a2x, EObject b, EObject d, EObject i, EObject y) {
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileull2branchubb";
		String d2v__v____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		String c2z__c____source_name_prime = "source";
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String x__y____positive_name_prime = "positive";
		String c2z__z____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String a__b____first_name_prime = "first";
		String a2x__x____target_name_prime = "target";
		String v__z____next_name_prime = "next";
		String d2v__d____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String w__c____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____last);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(x__y____positive);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____first);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(v__z____next);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { ruleresult, x, c2z, d2v, v, w, c, a, z, b2y, a2x, b, d, i, y, d2v__v____target,
				w__a____first, c2z__c____source, c__d____last, a__b____last, x__y____positive, c2z__z____target,
				a2x__a____source, b2y__b____source, a__b____first, a2x__x____target, v__z____next, d2v__d____source,
				i__z____negative, i__x____positive, w__c____next, b2y__y____target, y__x____next };
	}

	public static final void pattern_whileull2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whileull2branchubb _this, PerformRuleResult ruleresult, EObject x, EObject w2i, EObject c2z, EObject d2v,
			EObject v, EObject w, EObject c, EObject a, EObject z, EObject b2y, EObject a2x, EObject b, EObject d,
			EObject i, EObject y) {
		_this.registerObjects_FWD(ruleresult, x, w2i, c2z, d2v, v, w, c, a, z, b2y, a2x, b, d, i, y);

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
		EObject _localVariable_2 = match.getObject("a");
		EObject _localVariable_3 = match.getObject("b");
		EObject _localVariable_4 = match.getObject("d");
		EObject tmpW = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpD = _localVariable_4;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpC instanceof While) {
				While c = (While) tmpC;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpD instanceof Assignment) {
							Assignment d = (Assignment) tmpD;
							return new Object[] { w, c, a, b, d, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_2_2_corematch_blackFBBBBBFB(While w, While c,
			While a, Assignment b, Assignment d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					if (!b.equals(d)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
								"source")) {
							Branch i = w2i.getTarget();
							if (i != null) {
								_result.add(new Object[] { w2i, w, c, a, b, d, i, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_2_3_findcontext_blackBBBBBBB(S2B w2i, While w,
			While c, While a, Assignment b, Assignment d, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					if (!b.equals(d)) {
						if (a.equals(w.getFirst())) {
							if (d.equals(c.getLast())) {
								if (b.equals(a.getLast())) {
									if (w.equals(w2i.getSource())) {
										if (b.equals(a.getFirst())) {
											if (c.equals(w.getNext())) {
												if (i.equals(w2i.getTarget())) {
													_result.add(new Object[] { w2i, w, c, a, b, d, i });
												}
											}
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

	public static final Object[] pattern_whileull2branchubb_2_3_findcontext_greenBBBBBBBFFFFFFFF(S2B w2i, While w,
			While c, While a, Assignment b, Assignment d, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__a____first_name_prime = "first";
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String w2i__w____source_name_prime = "source";
		String a__b____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(i);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____last);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w__a____first.setName(w__a____first_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { w2i, w, c, a, b, d, i, isApplicableMatch, w__a____first, c__d____last, a__b____last,
				w2i__w____source, a__b____first, w__c____next, w2i__i____target };
	}

	public static final Object[] pattern_whileull2branchubb_2_4_solveCSP_bindingFBBBBBBBBB(whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, While w, While c, While a, Assignment b, Assignment d,
			Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, w2i, w, c, a, b, d, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, w, c, a, b, d, i };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whileull2branchubb _this, IsApplicableMatch isApplicableMatch, S2B w2i, While w, While c, While a,
			Assignment b, Assignment d, Branch i) {
		Object[] result_pattern_whileull2branchubb_2_4_solveCSP_binding = pattern_whileull2branchubb_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, w2i, w, c, a, b, d, i);
		if (result_pattern_whileull2branchubb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_2_4_solveCSP_black = pattern_whileull2branchubb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, w, c, a, b, d, i };
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
			Match match, Branch x, Command v, Branch z, Branch i, Command y) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						return new Object[] { _this, match, x, v, z, i, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_10_2_SolveCSP_bindingFBBBBBBB(whileull2branchubb _this,
			Match match, Branch x, Command v, Branch z, Branch i, Command y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, v, z, i, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, v, z, i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whileull2branchubb _this, Match match, Branch x, Command v, Branch z, Branch i, Command y) {
		Object[] result_pattern_whileull2branchubb_10_2_SolveCSP_binding = pattern_whileull2branchubb_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, x, v, z, i, y);
		if (result_pattern_whileull2branchubb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_10_2_SolveCSP_black = pattern_whileull2branchubb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, v, z, i, y };
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
			Branch x, Command v, Branch z, Branch i, Command y) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						return new Object[] { match, x, v, z, i, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Branch x, Command v, Branch z, Branch i, Command y) {
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(v);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		String x__y____positive_name_prime = "positive";
		String v__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(x__y____positive);
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
		x__y____positive.setName(x__y____positive_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { match, x, v, z, i, y, x__y____positive, v__z____next, i__z____negative, i__x____positive,
				y__x____next };
	}

	public static final Object[] pattern_whileull2branchubb_10_5_collectcontextelements_blackBBBBBB(Match match,
			Branch x, Command v, Branch z, Branch i, Command y) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						return new Object[] { match, x, v, z, i, y };
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
			whileull2branchubb _this, Match match, Branch x, Command v, Branch z, Branch i, Command y) {
		_this.registerObjectsToMatch_BWD(match, x, v, z, i, y);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("x");
		EObject _localVariable_1 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_2 = isApplicableMatch.getObject("v");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("z");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject _localVariable_6 = isApplicableMatch.getObject("y");
		EObject tmpX = _localVariable_0;
		EObject tmpW2i = _localVariable_1;
		EObject tmpV = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpI = _localVariable_5;
		EObject tmpY = _localVariable_6;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpW2i instanceof S2B) {
				S2B w2i = (S2B) tmpW2i;
				if (tmpV instanceof Command) {
					Command v = (Command) tmpV;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpZ instanceof Branch) {
							Branch z = (Branch) tmpZ;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								if (tmpY instanceof Command) {
									Command y = (Command) tmpY;
									return new Object[] { x, w2i, v, w, z, i, y, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_11_1_performtransformation_blackBBBBBBBFBB(Branch x,
			S2B w2i, Command v, While w, Branch z, Branch i, Command y, whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { x, w2i, v, w, z, i, y, csp, _this, isApplicableMatch };
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
			Branch x = (Branch) result_pattern_whileull2branchubb_11_1_performtransformation_binding[0];
			S2B w2i = (S2B) result_pattern_whileull2branchubb_11_1_performtransformation_binding[1];
			Command v = (Command) result_pattern_whileull2branchubb_11_1_performtransformation_binding[2];
			While w = (While) result_pattern_whileull2branchubb_11_1_performtransformation_binding[3];
			Branch z = (Branch) result_pattern_whileull2branchubb_11_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whileull2branchubb_11_1_performtransformation_binding[5];
			Command y = (Command) result_pattern_whileull2branchubb_11_1_performtransformation_binding[6];

			Object[] result_pattern_whileull2branchubb_11_1_performtransformation_black = pattern_whileull2branchubb_11_1_performtransformation_blackBBBBBBBFBB(
					x, w2i, v, w, z, i, y, _this, isApplicableMatch);
			if (result_pattern_whileull2branchubb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileull2branchubb_11_1_performtransformation_black[7];

				return new Object[] { x, w2i, v, w, z, i, y, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_11_1_performtransformation_greenBFFBBFFBFFFFB(Branch x,
			Command v, While w, Branch z, Command y) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		c2z.setTarget(z);
		d2v.setTarget(v);
		c2z.setSource(c);
		w.setNext(c);
		w.setFirst(a);
		b2y.setTarget(y);
		a2x.setSource(a);
		a2x.setTarget(x);
		a.setLast(b);
		b2y.setSource(b);
		a.setFirst(b);
		c.setLast(d);
		d2v.setSource(d);
		return new Object[] { x, c2z, d2v, v, w, c, a, z, b2y, a2x, b, d, y };
	}

	public static final Object[] pattern_whileull2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(Branch x,
			S2B c2z, S2N d2v, Command v, While c, While a, Branch z, S2N b2y, S2B a2x, Assignment b, Assignment d,
			Command y) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!a.equals(c)) {
					if (!b2y.equals(d2v)) {
						if (!a2x.equals(c2z)) {
							if (!b.equals(d)) {
								return new Object[] { x, c2z, d2v, v, c, a, z, b2y, a2x, b, d, y };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(Branch x,
			S2B c2z, S2N d2v, Command v, While c, While a, Branch z, S2N b2y, S2B a2x, Assignment b, Assignment d,
			Command y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getTranslatedElements().add(v);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getTranslatedElements().add(y);
		return new Object[] { ruleresult, x, c2z, d2v, v, c, a, z, b2y, a2x, b, d, y };
	}

	public static final Object[] pattern_whileull2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject x, EObject w2i, EObject c2z, EObject d2v, EObject v, EObject w,
			EObject c, EObject a, EObject z, EObject b2y, EObject a2x, EObject b, EObject d, EObject i, EObject y) {
		if (!x.equals(z)) {
			if (!x.equals(y)) {
				if (!w2i.equals(x)) {
					if (!w2i.equals(z)) {
						if (!w2i.equals(y)) {
							if (!c2z.equals(x)) {
								if (!c2z.equals(w2i)) {
									if (!c2z.equals(d2v)) {
										if (!c2z.equals(v)) {
											if (!c2z.equals(w)) {
												if (!c2z.equals(z)) {
													if (!c2z.equals(d)) {
														if (!c2z.equals(i)) {
															if (!c2z.equals(y)) {
																if (!d2v.equals(x)) {
																	if (!d2v.equals(w2i)) {
																		if (!d2v.equals(v)) {
																			if (!d2v.equals(w)) {
																				if (!d2v.equals(z)) {
																					if (!d2v.equals(i)) {
																						if (!d2v.equals(y)) {
																							if (!v.equals(x)) {
																								if (!v.equals(w2i)) {
																									if (!v.equals(w)) {
																										if (!v.equals(
																												z)) {
																											if (!v.equals(
																													y)) {
																												if (!w.equals(
																														x)) {
																													if (!w.equals(
																															w2i)) {
																														if (!w.equals(
																																z)) {
																															if (!w.equals(
																																	y)) {
																																if (!c.equals(
																																		x)) {
																																	if (!c.equals(
																																			w2i)) {
																																		if (!c.equals(
																																				c2z)) {
																																			if (!c.equals(
																																					d2v)) {
																																				if (!c.equals(
																																						v)) {
																																					if (!c.equals(
																																							w)) {
																																						if (!c.equals(
																																								z)) {
																																							if (!c.equals(
																																									d)) {
																																								if (!c.equals(
																																										i)) {
																																									if (!c.equals(
																																											y)) {
																																										if (!a.equals(
																																												x)) {
																																											if (!a.equals(
																																													w2i)) {
																																												if (!a.equals(
																																														c2z)) {
																																													if (!a.equals(
																																															d2v)) {
																																														if (!a.equals(
																																																v)) {
																																															if (!a.equals(
																																																	w)) {
																																																if (!a.equals(
																																																		c)) {
																																																	if (!a.equals(
																																																			z)) {
																																																		if (!a.equals(
																																																				b2y)) {
																																																			if (!a.equals(
																																																					a2x)) {
																																																				if (!a.equals(
																																																						b)) {
																																																					if (!a.equals(
																																																							d)) {
																																																						if (!a.equals(
																																																								i)) {
																																																							if (!a.equals(
																																																									y)) {
																																																								if (!b2y.equals(
																																																										x)) {
																																																									if (!b2y.equals(
																																																											w2i)) {
																																																										if (!b2y.equals(
																																																												c2z)) {
																																																											if (!b2y.equals(
																																																													d2v)) {
																																																												if (!b2y.equals(
																																																														v)) {
																																																													if (!b2y.equals(
																																																															w)) {
																																																														if (!b2y.equals(
																																																																c)) {
																																																															if (!b2y.equals(
																																																																	z)) {
																																																																if (!b2y.equals(
																																																																		d)) {
																																																																	if (!b2y.equals(
																																																																			i)) {
																																																																		if (!b2y.equals(
																																																																				y)) {
																																																																			if (!a2x.equals(
																																																																					x)) {
																																																																				if (!a2x.equals(
																																																																						w2i)) {
																																																																					if (!a2x.equals(
																																																																							c2z)) {
																																																																						if (!a2x.equals(
																																																																								d2v)) {
																																																																							if (!a2x.equals(
																																																																									v)) {
																																																																								if (!a2x.equals(
																																																																										w)) {
																																																																									if (!a2x.equals(
																																																																											c)) {
																																																																										if (!a2x.equals(
																																																																												z)) {
																																																																											if (!a2x.equals(
																																																																													b2y)) {
																																																																												if (!a2x.equals(
																																																																														b)) {
																																																																													if (!a2x.equals(
																																																																															d)) {
																																																																														if (!a2x.equals(
																																																																																i)) {
																																																																															if (!a2x.equals(
																																																																																	y)) {
																																																																																if (!b.equals(
																																																																																		x)) {
																																																																																	if (!b.equals(
																																																																																			w2i)) {
																																																																																		if (!b.equals(
																																																																																				c2z)) {
																																																																																			if (!b.equals(
																																																																																					d2v)) {
																																																																																				if (!b.equals(
																																																																																						v)) {
																																																																																					if (!b.equals(
																																																																																							w)) {
																																																																																						if (!b.equals(
																																																																																								c)) {
																																																																																							if (!b.equals(
																																																																																									z)) {
																																																																																								if (!b.equals(
																																																																																										b2y)) {
																																																																																									if (!b.equals(
																																																																																											d)) {
																																																																																										if (!b.equals(
																																																																																												i)) {
																																																																																											if (!b.equals(
																																																																																													y)) {
																																																																																												if (!d.equals(
																																																																																														x)) {
																																																																																													if (!d.equals(
																																																																																															w2i)) {
																																																																																														if (!d.equals(
																																																																																																d2v)) {
																																																																																															if (!d.equals(
																																																																																																	v)) {
																																																																																																if (!d.equals(
																																																																																																		w)) {
																																																																																																	if (!d.equals(
																																																																																																			z)) {
																																																																																																		if (!d.equals(
																																																																																																				i)) {
																																																																																																			if (!d.equals(
																																																																																																					y)) {
																																																																																																				if (!i.equals(
																																																																																																						x)) {
																																																																																																					if (!i.equals(
																																																																																																							w2i)) {
																																																																																																						if (!i.equals(
																																																																																																								v)) {
																																																																																																							if (!i.equals(
																																																																																																									w)) {
																																																																																																								if (!i.equals(
																																																																																																										z)) {
																																																																																																									if (!i.equals(
																																																																																																											y)) {
																																																																																																										if (!y.equals(
																																																																																																												z)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													x,
																																																																																																													w2i,
																																																																																																													c2z,
																																																																																																													d2v,
																																																																																																													v,
																																																																																																													w,
																																																																																																													c,
																																																																																																													a,
																																																																																																													z,
																																																																																																													b2y,
																																																																																																													a2x,
																																																																																																													b,
																																																																																																													d,
																																																																																																													i,
																																																																																																													y };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject x, EObject c2z, EObject d2v, EObject v, EObject w, EObject c,
			EObject a, EObject z, EObject b2y, EObject a2x, EObject b, EObject d, EObject i, EObject y) {
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileull2branchubb";
		String d2v__v____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		String c2z__c____source_name_prime = "source";
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String x__y____positive_name_prime = "positive";
		String c2z__z____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String a__b____first_name_prime = "first";
		String a2x__x____target_name_prime = "target";
		String v__z____next_name_prime = "next";
		String d2v__d____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String w__c____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____last);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(x__y____positive);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____first);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(v__z____next);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { ruleresult, x, c2z, d2v, v, w, c, a, z, b2y, a2x, b, d, i, y, d2v__v____target,
				w__a____first, c2z__c____source, c__d____last, a__b____last, x__y____positive, c2z__z____target,
				a2x__a____source, b2y__b____source, a__b____first, a2x__x____target, v__z____next, d2v__d____source,
				i__z____negative, i__x____positive, w__c____next, b2y__y____target, y__x____next };
	}

	public static final void pattern_whileull2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whileull2branchubb _this, PerformRuleResult ruleresult, EObject x, EObject w2i, EObject c2z, EObject d2v,
			EObject v, EObject w, EObject c, EObject a, EObject z, EObject b2y, EObject a2x, EObject b, EObject d,
			EObject i, EObject y) {
		_this.registerObjects_BWD(ruleresult, x, w2i, c2z, d2v, v, w, c, a, z, b2y, a2x, b, d, i, y);

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
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("v");
		EObject _localVariable_2 = match.getObject("z");
		EObject _localVariable_3 = match.getObject("i");
		EObject _localVariable_4 = match.getObject("y");
		EObject tmpX = _localVariable_0;
		EObject tmpV = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpY = _localVariable_4;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpV instanceof Command) {
				Command v = (Command) tmpV;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpY instanceof Command) {
							Command y = (Command) tmpY;
							return new Object[] { x, v, z, i, y, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_12_2_corematch_blackBFBFBBBB(Branch x, Command v,
			Branch z, Branch i, Command y, Match match) {
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
								_result.add(new Object[] { x, w2i, v, w, z, i, y, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_12_3_findcontext_blackBBBBBBB(Branch x, S2B w2i,
			Command v, While w, Branch z, Branch i, Command y) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						if (y.equals(x.getPositive())) {
							if (w.equals(w2i.getSource())) {
								if (z.equals(v.getNext())) {
									if (z.equals(i.getNegative())) {
										if (x.equals(i.getPositive())) {
											if (i.equals(w2i.getTarget())) {
												if (x.equals(y.getNext())) {
													_result.add(new Object[] { x, w2i, v, w, z, i, y });
												}
											}
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

	public static final Object[] pattern_whileull2branchubb_12_3_findcontext_greenBBBBBBBFFFFFFFF(Branch x, S2B w2i,
			Command v, While w, Branch z, Branch i, Command y) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String x__y____positive_name_prime = "positive";
		String w2i__w____source_name_prime = "source";
		String v__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(v);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(y);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(x__y____positive);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
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
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		x__y____positive.setName(x__y____positive_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { x, w2i, v, w, z, i, y, isApplicableMatch, x__y____positive, w2i__w____source,
				v__z____next, i__z____negative, i__x____positive, w2i__i____target, y__x____next };
	}

	public static final Object[] pattern_whileull2branchubb_12_4_solveCSP_bindingFBBBBBBBBB(whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch, Branch x, S2B w2i, Command v, While w, Branch z, Branch i, Command y) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, x, w2i, v, w, z, i, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, x, w2i, v, w, z, i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whileull2branchubb _this, IsApplicableMatch isApplicableMatch, Branch x, S2B w2i, Command v, While w,
			Branch z, Branch i, Command y) {
		Object[] result_pattern_whileull2branchubb_12_4_solveCSP_binding = pattern_whileull2branchubb_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, x, w2i, v, w, z, i, y);
		if (result_pattern_whileull2branchubb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_12_4_solveCSP_black = pattern_whileull2branchubb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, x, w2i, v, w, z, i, y };
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_627745 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_1BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_886979 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_886979)) {
							if (!z.equals(__DEC_x_positive_886979)) {
								if (!i.equals(__DEC_x_positive_886979)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_2BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_895082 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_895082)) {
							if (!z.equals(__DEC_x_negative_895082)) {
								if (!i.equals(__DEC_x_negative_895082)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_3B(Command v) {
		for (Graph __DEC_v_root_580660 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_4BBBB(Command v,
			Branch x, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_positive_516520 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!x.equals(__DEC_v_positive_516520)) {
							if (!z.equals(__DEC_v_positive_516520)) {
								if (!i.equals(__DEC_v_positive_516520)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_5BBBB(Command v,
			Branch x, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_negative_650413 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!x.equals(__DEC_v_negative_650413)) {
							if (!z.equals(__DEC_v_negative_650413)) {
								if (!i.equals(__DEC_v_negative_650413)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_575426 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
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
					for (Branch __DEC_z_positive_896671 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_896671)) {
							if (!x.equals(__DEC_z_positive_896671)) {
								if (!i.equals(__DEC_z_positive_896671)) {
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
					for (Branch __DEC_z_negative_57941 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_57941)) {
							if (!x.equals(__DEC_z_negative_57941)) {
								if (!i.equals(__DEC_z_negative_57941)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_9B(Command y) {
		for (Graph __DEC_y_root_961663 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_10BBBB(Command y,
			Branch x, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_positive_983146 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_983146)) {
							if (!z.equals(__DEC_y_positive_983146)) {
								if (!i.equals(__DEC_y_positive_983146)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_11BBBB(Command y,
			Branch x, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_negative_162646 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_162646)) {
							if (!z.equals(__DEC_y_negative_162646)) {
								if (!i.equals(__DEC_y_negative_162646)) {
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_12BB(Branch x,
			Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_13BB(Branch z,
			Command v) {
		if (v.equals(z.getPositive())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_14BB(Branch i,
			Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_15BB(Branch x,
			Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_16BB(Branch z,
			Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_17BB(Branch i,
			Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_18BB(Branch x,
			Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
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

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_20BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_21BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_22BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_23BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_24BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
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
						if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
							if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_9B(y) == null) {
								if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_22BB(x, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!i.equals(x)) {
											Node tmpZ = i.getNegative();
											if (tmpZ instanceof Branch) {
												Branch z = (Branch) tmpZ;
												if (!x.equals(z)) {
													if (!i.equals(z)) {
														if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_21BB(
																i, y) == null) {
															if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_24BB(
																	i, y) == null) {
																if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_1BBB(
																		x, z, i) == null) {
																	if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_2BBB(
																			x, z, i) == null) {
																		if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_6B(
																				z) == null) {
																			if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_7BBB(
																					z, x, i) == null) {
																				if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_8BBB(
																						z, x, i) == null) {
																					if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_10BBBB(
																							y, x, z, i) == null) {
																						if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_11BBBB(
																								y, x, z, i) == null) {
																							if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_18BB(
																									x, z) == null) {
																								if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_19BB(
																										x, z) == null) {
																									if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_20BB(
																											z,
																											y) == null) {
																										if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_23BB(
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
																														if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_3B(
																																v) == null) {
																															if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_4BBBB(
																																	v,
																																	x,
																																	z,
																																	i) == null) {
																																if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_5BBBB(
																																		v,
																																		x,
																																		z,
																																		i) == null) {
																																	if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_12BB(
																																			x,
																																			v) == null) {
																																		if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_13BB(
																																				z,
																																				v) == null) {
																																			if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_14BB(
																																					i,
																																					v) == null) {
																																				if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_15BB(
																																						x,
																																						v) == null) {
																																					if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_16BB(
																																							z,
																																							v) == null) {
																																						if (pattern_whileull2branchubb_20_2_testcorematchandDECs_black_nac_17BB(
																																								i,
																																								v) == null) {
																																							_result.add(
																																									new Object[] {
																																											x,
																																											v,
																																											z,
																																											i,
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
													}
												}
											}

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
			whileull2branchubb _this, Match match, Branch x, Command v, Branch z, Branch i, Command y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, v, z, i, y);
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
		for (Decision __DEC_c_positive_631407 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_619787 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
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
					for (While __DEC_c_first_131942 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_131942)) {
							if (!w.equals(__DEC_c_first_131942)) {
								if (!a.equals(__DEC_c_first_131942)) {
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
					for (While __DEC_c_last_416192 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_416192)) {
							if (!w.equals(__DEC_c_last_416192)) {
								if (!a.equals(__DEC_c_last_416192)) {
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
		for (Program __DEC_c_first_375152 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_5B(While a) {
		for (Decision __DEC_a_positive_766122 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_6B(While a) {
		for (Decision __DEC_a_negative_531463 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_7BBB(While a, While w,
			While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_181630 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_181630)) {
							if (!w.equals(__DEC_a_last_181630)) {
								if (!c.equals(__DEC_a_last_181630)) {
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_8B(While a) {
		for (Program __DEC_a_first_624998 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_9B(Assignment b) {
		for (Decision __DEC_b_positive_901532 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_10B(Assignment b) {
		for (Decision __DEC_b_negative_313054 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_11BBBB(Assignment b,
			While w, While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_b_last_643678 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!w.equals(__DEC_b_last_643678)) {
							if (!c.equals(__DEC_b_last_643678)) {
								if (!a.equals(__DEC_b_last_643678)) {
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_232723 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_13B(Assignment d) {
		for (Decision __DEC_d_positive_392720 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_14B(Assignment d) {
		for (Decision __DEC_d_negative_313874 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_15BBBB(Assignment d,
			While w, While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_d_first_613539 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!w.equals(__DEC_d_first_613539)) {
							if (!c.equals(__DEC_d_first_613539)) {
								if (!a.equals(__DEC_d_first_613539)) {
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_16BBBB(Assignment d,
			While w, While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_d_last_278550 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!w.equals(__DEC_d_last_278550)) {
							if (!c.equals(__DEC_d_last_278550)) {
								if (!a.equals(__DEC_d_last_278550)) {
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_17B(Assignment d) {
		for (Program __DEC_d_first_887345 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
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

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_20BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_21BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_22BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_23BB(While c,
			Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_24BB(While w,
			Assignment d) {
		if (d.equals(w.getFirst())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_25BB(While c,
			Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_26BB(While a,
			Assignment d) {
		if (d.equals(a.getFirst())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_27BB(While w,
			Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_28BB(While a,
			Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
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
							if (!c.equals(w)) {
								if (!a.equals(c)) {
									Statement tmpB = a.getLast();
									if (tmpB instanceof Assignment) {
										Assignment b = (Assignment) tmpB;
										if (b.equals(a.getFirst())) {
											Statement tmpD = c.getLast();
											if (tmpD instanceof Assignment) {
												Assignment d = (Assignment) tmpD;
												if (!b.equals(d)) {
													if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_5B(
															a) == null) {
														if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_6B(
																a) == null) {
															if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_8B(
																	a) == null) {
																if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_20BB(
																		w, a) == null) {
																	if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_0B(
																			c) == null) {
																		if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_1B(
																				c) == null) {
																			if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_2BBB(
																					c, w, a) == null) {
																				if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_3BBB(
																						c, w, a) == null) {
																					if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_4B(
																							c) == null) {
																						if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_7BBB(
																								a, w, c) == null) {
																							if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_18BB(
																									w, c) == null) {
																								if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_19BB(
																										w, c) == null) {
																									if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_21BB(
																											c,
																											a) == null) {
																										if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_9B(
																												b) == null) {
																											if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_10B(
																													b) == null) {
																												if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_11BBBB(
																														b,
																														w,
																														c,
																														a) == null) {
																													if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_12B(
																															b) == null) {
																														if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_22BB(
																																w,
																																b) == null) {
																															if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_23BB(
																																	c,
																																	b) == null) {
																																if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_13B(
																																		d) == null) {
																																	if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_14B(
																																			d) == null) {
																																		if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_15BBBB(
																																				d,
																																				w,
																																				c,
																																				a) == null) {
																																			if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_16BBBB(
																																					d,
																																					w,
																																					c,
																																					a) == null) {
																																				if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_17B(
																																						d) == null) {
																																					if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_24BB(
																																							w,
																																							d) == null) {
																																						if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_25BB(
																																								c,
																																								d) == null) {
																																							if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_26BB(
																																									a,
																																									d) == null) {
																																								if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_27BB(
																																										w,
																																										d) == null) {
																																									if (pattern_whileull2branchubb_21_2_testcorematchandDECs_black_nac_28BB(
																																											a,
																																											d) == null) {
																																										_result.add(
																																												new Object[] {
																																														w,
																																														c,
																																														a,
																																														b,
																																														d,
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
			whileull2branchubb _this, Match match, While w, While c, While a, Assignment b, Assignment d) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, w, c, a, b, d);
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
		EObject _localVariable_0 = targetMatch.getObject("x");
		EObject _localVariable_1 = targetMatch.getObject("v");
		EObject _localVariable_2 = sourceMatch.getObject("w");
		EObject _localVariable_3 = sourceMatch.getObject("c");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = targetMatch.getObject("z");
		EObject _localVariable_6 = sourceMatch.getObject("b");
		EObject _localVariable_7 = sourceMatch.getObject("d");
		EObject _localVariable_8 = targetMatch.getObject("i");
		EObject _localVariable_9 = targetMatch.getObject("y");
		EObject tmpX = _localVariable_0;
		EObject tmpV = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		EObject tmpB = _localVariable_6;
		EObject tmpD = _localVariable_7;
		EObject tmpI = _localVariable_8;
		EObject tmpY = _localVariable_9;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpV instanceof Command) {
				Command v = (Command) tmpV;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpC instanceof While) {
						While c = (While) tmpC;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpZ instanceof Branch) {
								Branch z = (Branch) tmpZ;
								if (tmpB instanceof Assignment) {
									Assignment b = (Assignment) tmpB;
									if (tmpD instanceof Assignment) {
										Assignment d = (Assignment) tmpD;
										if (tmpI instanceof Branch) {
											Branch i = (Branch) tmpI;
											if (tmpY instanceof Command) {
												Command y = (Command) tmpY;
												return new Object[] { x, v, w, c, a, z, b, d, i, y, targetMatch,
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

	public static final Object[] pattern_whileull2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Branch x,
			Command v, While w, While c, While a, Branch z, Assignment b, Assignment d, Branch i, Command y,
			Match sourceMatch, Match targetMatch) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!c.equals(w)) {
					if (!a.equals(w)) {
						if (!a.equals(c)) {
							if (!b.equals(d)) {
								if (!i.equals(x)) {
									if (!i.equals(z)) {
										if (!sourceMatch.equals(targetMatch)) {
											return new Object[] { x, v, w, c, a, z, b, d, i, y, sourceMatch,
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
			Branch x = (Branch) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[0];
			Command v = (Command) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[1];
			While w = (While) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[2];
			While c = (While) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[3];
			While a = (While) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[4];
			Branch z = (Branch) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[5];
			Assignment b = (Assignment) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[6];
			Assignment d = (Assignment) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[7];
			Branch i = (Branch) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[8];
			Command y = (Command) result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_black = pattern_whileull2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					x, v, w, c, a, z, b, d, i, y, sourceMatch, targetMatch);
			if (result_pattern_whileull2branchubb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { x, v, w, c, a, z, b, d, i, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			whileull2branchubb _this, Branch x, Command v, While w, While c, While a, Branch z, Assignment b,
			Assignment d, Branch i, Command y, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(x, v, w, c, a, z, b, d, i, y, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, x, v, w, c, a, z, b, d, i, y, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			whileull2branchubb _this, Branch x, Command v, While w, While c, While a, Branch z, Assignment b,
			Assignment d, Branch i, Command y, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileull2branchubb_24_3_solvecsp_binding = pattern_whileull2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, x, v, w, c, a, z, b, d, i, y, sourceMatch, targetMatch);
		if (result_pattern_whileull2branchubb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileull2branchubb_24_3_solvecsp_black = pattern_whileull2branchubb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileull2branchubb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, x, v, w, c, a, z, b, d, i, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileull2branchubb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileull2branchubb_24_5_matchcorrcontext_blackFBBBB(While w,
			Branch i, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				if (i.equals(w2i.getTarget())) {
					_result.add(new Object[] { w2i, w, i, sourceMatch, targetMatch });
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

	public static final Object[] pattern_whileull2branchubb_24_6_createcorrespondence_blackBBBBBBBBBBB(Branch x,
			Command v, While w, While c, While a, Branch z, Assignment b, Assignment d, Branch i, Command y,
			CCMatch ccMatch) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!c.equals(w)) {
					if (!a.equals(w)) {
						if (!a.equals(c)) {
							if (!b.equals(d)) {
								if (!i.equals(x)) {
									if (!i.equals(z)) {
										return new Object[] { x, v, w, c, a, z, b, d, i, y, ccMatch };
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

	public static final Object[] pattern_whileull2branchubb_24_6_createcorrespondence_greenBFFBBBBFFBBBB(Branch x,
			Command v, While c, While a, Branch z, Assignment b, Assignment d, Command y, CCMatch ccMatch) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		d2v.setTarget(v);
		d2v.setSource(d);
		ccMatch.getCreateCorr().add(d2v);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { x, c2z, d2v, v, c, a, z, b2y, a2x, b, d, y, ccMatch };
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
		for (Decision __DEC_c_positive_148698 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_953615 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
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
					for (While __DEC_c_first_990533 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_990533)) {
							if (!w.equals(__DEC_c_first_990533)) {
								if (!a.equals(__DEC_c_first_990533)) {
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
					for (While __DEC_c_last_390911 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_390911)) {
							if (!w.equals(__DEC_c_last_390911)) {
								if (!a.equals(__DEC_c_last_390911)) {
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
		for (Program __DEC_c_first_485471 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_5B(While a) {
		for (Decision __DEC_a_positive_866042 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_6B(While a) {
		for (Decision __DEC_a_negative_218397 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_7BBB(While a, While w,
			While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_237771 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_237771)) {
							if (!w.equals(__DEC_a_last_237771)) {
								if (!c.equals(__DEC_a_last_237771)) {
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

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_8B(While a) {
		for (Program __DEC_a_first_739062 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_9B(Assignment b) {
		for (Decision __DEC_b_positive_562010 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_10B(Assignment b) {
		for (Decision __DEC_b_negative_496102 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_11BBBB(Assignment b, While w,
			While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_b_last_676835 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!w.equals(__DEC_b_last_676835)) {
							if (!c.equals(__DEC_b_last_676835)) {
								if (!a.equals(__DEC_b_last_676835)) {
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

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_449288 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_13B(Assignment d) {
		for (Decision __DEC_d_positive_882153 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_14B(Assignment d) {
		for (Decision __DEC_d_negative_284724 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_15BBBB(Assignment d, While w,
			While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_d_first_595504 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "first")) {
						if (!w.equals(__DEC_d_first_595504)) {
							if (!c.equals(__DEC_d_first_595504)) {
								if (!a.equals(__DEC_d_first_595504)) {
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

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_16BBBB(Assignment d, While w,
			While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_d_last_855560 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!w.equals(__DEC_d_last_855560)) {
							if (!c.equals(__DEC_d_last_855560)) {
								if (!a.equals(__DEC_d_last_855560)) {
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

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_17B(Assignment d) {
		for (Program __DEC_d_first_552439 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
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

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_20BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_21BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_22BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_23BB(While c, Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_24BB(While w, Assignment d) {
		if (d.equals(w.getFirst())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_25BB(While c, Assignment d) {
		if (d.equals(c.getFirst())) {
			return new Object[] { c, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_26BB(While a, Assignment d) {
		if (d.equals(a.getFirst())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_27BB(While w, Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_28BB(While a, Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_27_1_matchtggpattern_blackBBBBB(While w, While c, While a,
			Assignment b, Assignment d) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					if (!b.equals(d)) {
						if (a.equals(w.getFirst())) {
							if (d.equals(c.getLast())) {
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
																		a) == null) {
																	if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_6B(
																			a) == null) {
																		if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_7BBB(
																				a, w, c) == null) {
																			if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_8B(
																					a) == null) {
																				if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_9B(
																						b) == null) {
																					if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_10B(
																							b) == null) {
																						if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_11BBBB(
																								b, w, c, a) == null) {
																							if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_12B(
																									b) == null) {
																								if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_13B(
																										d) == null) {
																									if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_14B(
																											d) == null) {
																										if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_15BBBB(
																												d, w, c,
																												a) == null) {
																											if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_16BBBB(
																													d,
																													w,
																													c,
																													a) == null) {
																												if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_17B(
																														d) == null) {
																													if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_18BB(
																															w,
																															c) == null) {
																														if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_19BB(
																																w,
																																c) == null) {
																															if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_20BB(
																																	w,
																																	a) == null) {
																																if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_21BB(
																																		c,
																																		a) == null) {
																																	if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_22BB(
																																			w,
																																			b) == null) {
																																		if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_23BB(
																																				c,
																																				b) == null) {
																																			if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_24BB(
																																					w,
																																					d) == null) {
																																				if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_25BB(
																																						c,
																																						d) == null) {
																																					if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_26BB(
																																							a,
																																							d) == null) {
																																						if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_27BB(
																																								w,
																																								d) == null) {
																																							if (pattern_whileull2branchubb_27_1_matchtggpattern_black_nac_28BB(
																																									a,
																																									d) == null) {
																																								return new Object[] {
																																										w,
																																										c,
																																										a,
																																										b,
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_285795 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_1BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_274276 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_274276)) {
							if (!z.equals(__DEC_x_positive_274276)) {
								if (!i.equals(__DEC_x_positive_274276)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_2BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_467466 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_467466)) {
							if (!z.equals(__DEC_x_negative_467466)) {
								if (!i.equals(__DEC_x_negative_467466)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_3B(Command v) {
		for (Graph __DEC_v_root_484612 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_4BBBB(Command v, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_positive_327733 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!x.equals(__DEC_v_positive_327733)) {
							if (!z.equals(__DEC_v_positive_327733)) {
								if (!i.equals(__DEC_v_positive_327733)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_5BBBB(Command v, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_negative_396355 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!x.equals(__DEC_v_negative_396355)) {
							if (!z.equals(__DEC_v_negative_396355)) {
								if (!i.equals(__DEC_v_negative_396355)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_883803 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
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
					for (Branch __DEC_z_positive_181397 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_181397)) {
							if (!x.equals(__DEC_z_positive_181397)) {
								if (!i.equals(__DEC_z_positive_181397)) {
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
					for (Branch __DEC_z_negative_397455 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_397455)) {
							if (!x.equals(__DEC_z_negative_397455)) {
								if (!i.equals(__DEC_z_negative_397455)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_9B(Command y) {
		for (Graph __DEC_y_root_984179 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_10BBBB(Command y, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_positive_810033 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_810033)) {
							if (!z.equals(__DEC_y_positive_810033)) {
								if (!i.equals(__DEC_y_positive_810033)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_11BBBB(Command y, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_negative_947631 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_947631)) {
							if (!z.equals(__DEC_y_negative_947631)) {
								if (!i.equals(__DEC_y_negative_947631)) {
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

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_12BB(Branch x, Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_13BB(Branch z, Command v) {
		if (v.equals(z.getPositive())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_14BB(Branch i, Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_15BB(Branch x, Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_16BB(Branch z, Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_17BB(Branch i, Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_18BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_19BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_20BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_21BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_22BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_23BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_24BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_28_1_matchtggpattern_blackBBBBB(Branch x, Command v,
			Branch z, Branch i, Command y) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						if (y.equals(x.getPositive())) {
							if (z.equals(v.getNext())) {
								if (z.equals(i.getNegative())) {
									if (x.equals(i.getPositive())) {
										if (x.equals(y.getNext())) {
											if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_0B(
													x) == null) {
												if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_1BBB(x, z,
														i) == null) {
													if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_2BBB(
															x, z, i) == null) {
														if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_3B(
																v) == null) {
															if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_4BBBB(
																	v, x, z, i) == null) {
																if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_5BBBB(
																		v, x, z, i) == null) {
																	if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_6B(
																			z) == null) {
																		if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_7BBB(
																				z, x, i) == null) {
																			if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_8BBB(
																					z, x, i) == null) {
																				if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_9B(
																						y) == null) {
																					if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_10BBBB(
																							y, x, z, i) == null) {
																						if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_11BBBB(
																								y, x, z, i) == null) {
																							if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_12BB(
																									x, v) == null) {
																								if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_13BB(
																										z, v) == null) {
																									if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_14BB(
																											i,
																											v) == null) {
																										if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_15BB(
																												x,
																												v) == null) {
																											if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_16BB(
																													z,
																													v) == null) {
																												if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_17BB(
																														i,
																														v) == null) {
																													if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_18BB(
																															x,
																															z) == null) {
																														if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_19BB(
																																x,
																																z) == null) {
																															if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_20BB(
																																	z,
																																	y) == null) {
																																if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_21BB(
																																		i,
																																		y) == null) {
																																	if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_22BB(
																																			x,
																																			y) == null) {
																																		if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_23BB(
																																				z,
																																				y) == null) {
																																			if (pattern_whileull2branchubb_28_1_matchtggpattern_black_nac_24BB(
																																					i,
																																					y) == null) {
																																				return new Object[] {
																																						x,
																																						v,
																																						z,
																																						i,
																																						y };
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
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
							if (pattern_whileull2branchubb_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									w2i) == null) {
								if (pattern_whileull2branchubb_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										w) == null) {
									if (pattern_whileull2branchubb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileull2branchubb_29_3_solveCSP_bindingFBBBBBB(whileull2branchubb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w2i, w, i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileull2branchubb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileull2branchubb_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whileull2branchubb _this, IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileull2branchubb_29_3_solveCSP_binding = pattern_whileull2branchubb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w2i, w, i, ruleResult);
		if (result_pattern_whileull2branchubb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileull2branchubb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileull2branchubb_29_3_solveCSP_black = pattern_whileull2branchubb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileull2branchubb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
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

	public static final Object[] pattern_whileull2branchubb_29_5_checknacs_blackBBB(S2B w2i, While w, Branch i) {
		return new Object[] { w2i, w, i };
	}

	public static final Object[] pattern_whileull2branchubb_29_6_perform_blackBBBB(S2B w2i, While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w2i, w, i, ruleResult };
	}

	public static final Object[] pattern_whileull2branchubb_29_6_perform_greenFFFFBFFFFFFFBFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.getCorrObjects().add(c2z);
		ruleResult.getCorrObjects().add(d2v);
		d2v.setTarget(v);
		ruleResult.getTargetObjects().add(v);
		c2z.setSource(c);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		c2z.setTarget(z);
		v.setNext(z);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		ruleResult.getCorrObjects().add(b2y);
		a2x.setSource(a);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		a.setLast(b);
		b2y.setSource(b);
		a.setFirst(b);
		ruleResult.getSourceObjects().add(b);
		c.setLast(d);
		d2v.setSource(d);
		ruleResult.getSourceObjects().add(d);
		x.setPositive(y);
		b2y.setTarget(y);
		y.setNext(x);
		ruleResult.getTargetObjects().add(y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { x, c2z, d2v, v, w, c, a, z, b2y, a2x, b, d, i, y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileull2branchubb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileull2branchubbImpl
