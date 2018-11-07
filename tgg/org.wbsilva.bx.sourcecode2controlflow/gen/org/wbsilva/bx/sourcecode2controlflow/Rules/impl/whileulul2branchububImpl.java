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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whileulul2branchubub;

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
 * An implementation of the model object '<em><b>whileulul2branchubub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whileulul2branchububImpl extends AbstractRuleImpl implements whileulul2branchubub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whileulul2branchububImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhileulul2branchubub();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, While a, Assignment d, While w, Assignment b, While c) {

		Object[] result1_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_0_1_initialbindings_blackBBBBBBB(this, match, a, d, w, b, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[w] = " + w + ", "
					+ "[b] = " + b + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, a, d, w, b, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[d] = " + d + ", " + "[w] = " + w + ", "
					+ "[b] = " + b + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileulul2branchububImpl.pattern_whileulul2branchubub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileulul2branchububImpl
					.pattern_whileulul2branchubub_0_4_collectelementstobetranslated_blackBBBBBB(match, a, d, w, b, c);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[a] = " + a + ", "
								+ "[d] = " + d + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
			}
			whileulul2branchububImpl.pattern_whileulul2branchubub_0_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
					match, a, d, w, b, c);
			//nothing EMoflonEdge a__b____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge c__d____last = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge c__d____first = (EMoflonEdge) result4_green[11];

			Object[] result5_black = whileulul2branchububImpl
					.pattern_whileulul2branchubub_0_5_collectcontextelements_blackBBBBBB(match, a, d, w, b, c);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[a] = " + a + ", "
								+ "[d] = " + d + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
			}
			whileulul2branchububImpl.pattern_whileulul2branchubub_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileulul2branchububImpl.pattern_whileulul2branchubub_0_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, a, d, w, b, c);
			return whileulul2branchububImpl.pattern_whileulul2branchubub_0_7_expressionF();
		} else {
			return whileulul2branchububImpl.pattern_whileulul2branchubub_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		While a = (While) result1_bindingAndBlack[0];
		Assignment d = (Assignment) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		Assignment b = (Assignment) result1_bindingAndBlack[4];
		While c = (While) result1_bindingAndBlack[5];
		Branch i = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_1_performtransformation_greenBFFBFFFFFFBBB(a, d, b, c, i);
		S2B c2z = (S2B) result1_green[1];
		Command v = (Command) result1_green[2];
		S2N d2v = (S2N) result1_green[4];
		Branch x = (Branch) result1_green[5];
		Branch z = (Branch) result1_green[6];
		S2N b2y = (S2N) result1_green[7];
		Command y = (Command) result1_green[8];
		S2B a2x = (S2B) result1_green[9];

		Object[] result2_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(a, c2z, v, d, d2v, x, z,
						b2y, y, a2x, b, c);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[c2z] = "
					+ c2z + ", " + "[v] = " + v + ", " + "[d] = " + d + ", " + "[d2v] = " + d2v + ", " + "[x] = " + x
					+ ", " + "[z] = " + z + ", " + "[b2y] = " + b2y + ", " + "[y] = " + y + ", " + "[a2x] = " + a2x
					+ ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
		}
		Object[] result2_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(a, c2z, v, d, d2v, x, z,
						b2y, y, a2x, b, c);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, a, c2z, v, d,
						d2v, x, z, w2i, b2y, y, w, a2x, b, c, i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[c2z] = " + c2z + ", " + "[v] = " + v + ", " + "[d] = " + d + ", "
					+ "[d2v] = " + d2v + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[w2i] = " + w2i + ", "
					+ "[b2y] = " + b2y + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[a2x] = " + a2x + ", "
					+ "[b] = " + b + ", " + "[c] = " + c + ", " + "[i] = " + i + ".");
		}
		whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, a, c2z, v, d, d2v, x, z, b2y, y, w, a2x, b, c, i);
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[34];

		// 
		// 
		whileulul2branchububImpl.pattern_whileulul2branchubub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, a, c2z, v, d, d2v, x, z, w2i, b2y, y, w, a2x, b, c, i);
		return whileulul2branchububImpl.pattern_whileulul2branchubub_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileulul2branchububImpl
				.pattern_whileulul2branchubub_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		While a = (While) result2_binding[0];
		Assignment d = (Assignment) result2_binding[1];
		While w = (While) result2_binding[2];
		Assignment b = (Assignment) result2_binding[3];
		While c = (While) result2_binding[4];
		for (Object[] result2_black : whileulul2branchububImpl
				.pattern_whileulul2branchubub_2_2_corematch_blackBBFBBBFB(a, d, w, b, c, match)) {
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[6];
			// ForEach 
			for (Object[] result3_black : whileulul2branchububImpl
					.pattern_whileulul2branchubub_2_3_findcontext_blackBBBBBBB(a, d, w2i, w, b, c, i)) {
				Object[] result3_green = whileulul2branchububImpl
						.pattern_whileulul2branchubub_2_3_findcontext_greenBBBBBBBFFFFFFFFF(a, d, w2i, w, b, c, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = whileulul2branchububImpl
						.pattern_whileulul2branchubub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, a,
								d, w2i, w, b, c, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[d] = " + d
							+ ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c
							+ ", " + "[i] = " + i + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileulul2branchububImpl.pattern_whileulul2branchubub_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileulul2branchububImpl
							.pattern_whileulul2branchubub_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileulul2branchububImpl.pattern_whileulul2branchubub_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileulul2branchububImpl.pattern_whileulul2branchubub_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, While a, Assignment d, While w, Assignment b, While c) {
		match.registerObject("a", a);
		match.registerObject("d", d);
		match.registerObject("w", w);
		match.registerObject("b", b);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While a, Assignment d, While w, Assignment b, While c) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While a, Assignment d, S2B w2i, While w,
			Assignment b, While c, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a, EObject c2z, EObject v, EObject d,
			EObject d2v, EObject x, EObject z, EObject w2i, EObject b2y, EObject y, EObject w, EObject a2x, EObject b,
			EObject c, EObject i) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command v, Branch x, Branch z, Command y, Branch i) {

		Object[] result1_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_10_1_initialbindings_blackBBBBBBB(this, match, v, x, z, y, i);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[v] = " + v + ", " + "[x] = " + x + ", " + "[z] = " + z + ", "
					+ "[y] = " + y + ", " + "[i] = " + i + ".");
		}

		Object[] result2_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, v, x, z, y, i);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[v] = " + v + ", " + "[x] = " + x + ", " + "[z] = " + z + ", "
					+ "[y] = " + y + ", " + "[i] = " + i + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileulul2branchububImpl.pattern_whileulul2branchubub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileulul2branchububImpl
					.pattern_whileulul2branchubub_10_4_collectelementstobetranslated_blackBBBBBB(match, v, x, z, y, i);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[v] = " + v + ", "
								+ "[x] = " + x + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[i] = " + i + ".");
			}
			whileulul2branchububImpl.pattern_whileulul2branchubub_10_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
					match, v, x, z, y, i);
			//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge v__z____next = (EMoflonEdge) result4_green[11];

			Object[] result5_black = whileulul2branchububImpl
					.pattern_whileulul2branchubub_10_5_collectcontextelements_blackBBBBBB(match, v, x, z, y, i);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[v] = " + v + ", "
								+ "[x] = " + x + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[i] = " + i + ".");
			}
			whileulul2branchububImpl.pattern_whileulul2branchubub_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileulul2branchububImpl.pattern_whileulul2branchubub_10_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, v, x, z, y, i);
			return whileulul2branchububImpl.pattern_whileulul2branchubub_10_7_expressionF();
		} else {
			return whileulul2branchububImpl.pattern_whileulul2branchubub_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Command v = (Command) result1_bindingAndBlack[0];
		Branch x = (Branch) result1_bindingAndBlack[1];
		Branch z = (Branch) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		Command y = (Command) result1_bindingAndBlack[4];
		While w = (While) result1_bindingAndBlack[5];
		Branch i = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_1_performtransformation_greenFFBFFBBFBBFFF(v, x, z, y, w);
		While a = (While) result1_green[0];
		S2B c2z = (S2B) result1_green[1];
		Assignment d = (Assignment) result1_green[3];
		S2N d2v = (S2N) result1_green[4];
		S2N b2y = (S2N) result1_green[7];
		S2B a2x = (S2B) result1_green[10];
		Assignment b = (Assignment) result1_green[11];
		While c = (While) result1_green[12];

		Object[] result2_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(a, c2z, v, d, d2v, x, z,
						b2y, y, a2x, b, c);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[c2z] = "
					+ c2z + ", " + "[v] = " + v + ", " + "[d] = " + d + ", " + "[d2v] = " + d2v + ", " + "[x] = " + x
					+ ", " + "[z] = " + z + ", " + "[b2y] = " + b2y + ", " + "[y] = " + y + ", " + "[a2x] = " + a2x
					+ ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
		}
		Object[] result2_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(a, c2z, v, d, d2v, x, z,
						b2y, y, a2x, b, c);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, a, c2z, v, d,
						d2v, x, z, w2i, b2y, y, w, a2x, b, c, i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[c2z] = " + c2z + ", " + "[v] = " + v + ", " + "[d] = " + d + ", "
					+ "[d2v] = " + d2v + ", " + "[x] = " + x + ", " + "[z] = " + z + ", " + "[w2i] = " + w2i + ", "
					+ "[b2y] = " + b2y + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[a2x] = " + a2x + ", "
					+ "[b] = " + b + ", " + "[c] = " + c + ", " + "[i] = " + i + ".");
		}
		whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, a, c2z, v, d, d2v, x, z, b2y, y, w, a2x, b, c, i);
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[34];

		// 
		// 
		whileulul2branchububImpl.pattern_whileulul2branchubub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, a, c2z, v, d, d2v, x, z, w2i, b2y, y, w, a2x, b, c, i);
		return whileulul2branchububImpl.pattern_whileulul2branchubub_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileulul2branchububImpl
				.pattern_whileulul2branchubub_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command v = (Command) result2_binding[0];
		Branch x = (Branch) result2_binding[1];
		Branch z = (Branch) result2_binding[2];
		Command y = (Command) result2_binding[3];
		Branch i = (Branch) result2_binding[4];
		for (Object[] result2_black : whileulul2branchububImpl
				.pattern_whileulul2branchubub_12_2_corematch_blackBBBFBFBB(v, x, z, y, i, match)) {
			S2B w2i = (S2B) result2_black[3];
			While w = (While) result2_black[5];
			// ForEach 
			for (Object[] result3_black : whileulul2branchububImpl
					.pattern_whileulul2branchubub_12_3_findcontext_blackBBBBBBB(v, x, z, w2i, y, w, i)) {
				Object[] result3_green = whileulul2branchububImpl
						.pattern_whileulul2branchubub_12_3_findcontext_greenBBBBBBBFFFFFFFFF(v, x, z, w2i, y, w, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = whileulul2branchububImpl
						.pattern_whileulul2branchubub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								v, x, z, w2i, y, w, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[v] = " + v + ", " + "[x] = " + x
							+ ", " + "[z] = " + z + ", " + "[w2i] = " + w2i + ", " + "[y] = " + y + ", " + "[w] = " + w
							+ ", " + "[i] = " + i + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileulul2branchububImpl.pattern_whileulul2branchubub_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileulul2branchububImpl
							.pattern_whileulul2branchubub_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileulul2branchububImpl.pattern_whileulul2branchubub_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileulul2branchububImpl.pattern_whileulul2branchubub_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command v, Branch x, Branch z, Command y, Branch i) {
		match.registerObject("v", v);
		match.registerObject("x", x);
		match.registerObject("z", z);
		match.registerObject("y", y);
		match.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command v, Branch x, Branch z, Command y, Branch i) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command v, Branch x, Branch z, S2B w2i,
			Command y, While w, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("v", v);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a, EObject c2z, EObject v, EObject d,
			EObject d2v, EObject x, EObject z, EObject w2i, EObject b2y, EObject y, EObject w, EObject a2x, EObject b,
			EObject c, EObject i) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("v").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_82(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileulul2branchububImpl.pattern_whileulul2branchubub_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileulul2branchububImpl
				.pattern_whileulul2branchubub_20_2_testcorematchandDECs_blackFFFFFB(_edge_positive)) {
			Command v = (Command) result2_black[0];
			Branch x = (Branch) result2_black[1];
			Branch z = (Branch) result2_black[2];
			Command y = (Command) result2_black[3];
			Branch i = (Branch) result2_black[4];
			Object[] result2_green = whileulul2branchububImpl
					.pattern_whileulul2branchubub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileulul2branchububImpl
					.pattern_whileulul2branchubub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, v, x, z, y, i)) {
				// 
				if (whileulul2branchububImpl
						.pattern_whileulul2branchubub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whileulul2branchububImpl
							.pattern_whileulul2branchubub_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileulul2branchububImpl.pattern_whileulul2branchubub_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileulul2branchububImpl.pattern_whileulul2branchubub_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_88(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileulul2branchububImpl.pattern_whileulul2branchubub_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileulul2branchububImpl
				.pattern_whileulul2branchubub_21_2_testcorematchandDECs_blackFFFFFB(_edge_first)) {
			While a = (While) result2_black[0];
			Assignment d = (Assignment) result2_black[1];
			While w = (While) result2_black[2];
			Assignment b = (Assignment) result2_black[3];
			While c = (While) result2_black[4];
			Object[] result2_green = whileulul2branchububImpl
					.pattern_whileulul2branchubub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileulul2branchububImpl
					.pattern_whileulul2branchubub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, a, d, w, b, c)) {
				// 
				if (whileulul2branchububImpl
						.pattern_whileulul2branchubub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whileulul2branchububImpl
							.pattern_whileulul2branchubub_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileulul2branchububImpl.pattern_whileulul2branchubub_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileulul2branchububImpl.pattern_whileulul2branchubub_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whileulul2branchubub");
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
		ruleResult.setRule("whileulul2branchubub");
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

		Object[] result1_black = whileulul2branchububImpl.pattern_whileulul2branchubub_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileulul2branchububImpl.pattern_whileulul2branchubub_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		While a = (While) result2_bindingAndBlack[0];
		Command v = (Command) result2_bindingAndBlack[1];
		Assignment d = (Assignment) result2_bindingAndBlack[2];
		Branch x = (Branch) result2_bindingAndBlack[3];
		Branch z = (Branch) result2_bindingAndBlack[4];
		Command y = (Command) result2_bindingAndBlack[5];
		While w = (While) result2_bindingAndBlack[6];
		Assignment b = (Assignment) result2_bindingAndBlack[7];
		While c = (While) result2_bindingAndBlack[8];
		Branch i = (Branch) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, a, v, d, x, z, y, w, b,
						c, i, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[a] = " + a + ", " + "[v] = " + v + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[z] = "
					+ z + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c + ", "
					+ "[i] = " + i + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileulul2branchububImpl.pattern_whileulul2branchubub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileulul2branchububImpl
					.pattern_whileulul2branchubub_24_5_matchcorrcontext_blackFBBBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[0];
				Object[] result5_green = whileulul2branchububImpl
						.pattern_whileulul2branchubub_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileulul2branchububImpl
						.pattern_whileulul2branchubub_24_6_createcorrespondence_blackBBBBBBBBBBB(a, v, d, x, z, y, w, b,
								c, i, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", "
							+ "[v] = " + v + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[z] = " + z + ", "
							+ "[y] = " + y + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c + ", "
							+ "[i] = " + i + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileulul2branchububImpl.pattern_whileulul2branchubub_24_6_createcorrespondence_greenBFBBFBBFBFBBB(a, v,
						d, x, z, y, b, c, ccMatch);
				//nothing S2B c2z = (S2B) result6_green[1];
				//nothing S2N d2v = (S2N) result6_green[4];
				//nothing S2N b2y = (S2N) result6_green[7];
				//nothing S2B a2x = (S2B) result6_green[9];

				Object[] result7_black = whileulul2branchububImpl
						.pattern_whileulul2branchubub_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileulul2branchububImpl.pattern_whileulul2branchubub_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whileulul2branchububImpl.pattern_whileulul2branchubub_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(While a, Command v, Assignment d, Branch x, Branch z, Command y, While w,
			Assignment b, While c, Branch i, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While a, Assignment d, While w, Assignment b, While c) {// 
		Object[] result1_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_27_1_matchtggpattern_blackBBBBB(a, d, w, b, c);
		if (result1_black != null) {
			return whileulul2branchububImpl.pattern_whileulul2branchubub_27_2_expressionF();
		} else {
			return whileulul2branchububImpl.pattern_whileulul2branchubub_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command v, Branch x, Branch z, Command y, Branch i) {// 
		Object[] result1_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_28_1_matchtggpattern_blackBBBBB(v, x, z, y, i);
		if (result1_black != null) {
			return whileulul2branchububImpl.pattern_whileulul2branchubub_28_2_expressionF();
		} else {
			return whileulul2branchububImpl.pattern_whileulul2branchubub_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whileulul2branchububImpl.pattern_whileulul2branchubub_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileulul2branchububImpl.pattern_whileulul2branchubub_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whileulul2branchububImpl
				.pattern_whileulul2branchubub_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whileulul2branchububImpl
					.pattern_whileulul2branchubub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w2i, w,
							i, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w
						+ ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileulul2branchububImpl.pattern_whileulul2branchubub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileulul2branchububImpl
						.pattern_whileulul2branchubub_29_5_checknacs_blackBBB(w2i, w, i);
				if (result5_black != null) {

					Object[] result6_black = whileulul2branchububImpl
							.pattern_whileulul2branchubub_29_6_perform_blackBBBB(w2i, w, i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w2i] = " + w2i + ", "
								+ "[w] = " + w + ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileulul2branchububImpl.pattern_whileulul2branchubub_29_6_perform_greenFFFFFFFFFBFFFBB(w, i,
							ruleResult);
					//nothing While a = (While) result6_green[0];
					//nothing S2B c2z = (S2B) result6_green[1];
					//nothing Command v = (Command) result6_green[2];
					//nothing Assignment d = (Assignment) result6_green[3];
					//nothing S2N d2v = (S2N) result6_green[4];
					//nothing Branch x = (Branch) result6_green[5];
					//nothing Branch z = (Branch) result6_green[6];
					//nothing S2N b2y = (S2N) result6_green[7];
					//nothing Command y = (Command) result6_green[8];
					//nothing S2B a2x = (S2B) result6_green[10];
					//nothing Assignment b = (Assignment) result6_green[11];
					//nothing While c = (While) result6_green[12];

				} else {
				}

			} else {
			}

		}
		return whileulul2branchububImpl.pattern_whileulul2branchubub_29_7_expressionFB(ruleResult);
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
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_FWD__MATCH_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4), (While) arguments.get(5));
		case RulesPackage.WHILEULUL2BRANCHUBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5));
			return null;
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_ASSIGNMENT_S2B_WHILE_ASSIGNMENT_WHILE_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (S2B) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5), (While) arguments.get(6), (Branch) arguments.get(7));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.WHILEULUL2BRANCHUBUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_BRANCH_BRANCH_S2B_COMMAND_WHILE_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (S2B) arguments.get(4),
					(Command) arguments.get(5), (While) arguments.get(6), (Branch) arguments.get(7));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_82__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_82((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_88__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_88((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_COMMAND_ASSIGNMENT_BRANCH_BRANCH_COMMAND_WHILE_ASSIGNMENT_WHILE_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Command) arguments.get(1),
					(Assignment) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Command) arguments.get(5), (While) arguments.get(6), (Assignment) arguments.get(7),
					(While) arguments.get(8), (Branch) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_DEC_FWD__WHILE_ASSIGNMENT_WHILE_ASSIGNMENT_WHILE:
			return checkDEC_FWD((While) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEULUL2BRANCHUBUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEULUL2BRANCHUBUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_WHILE_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEULUL2BRANCHUBUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileulul2branchubub_0_1_initialbindings_blackBBBBBBB(
			whileulul2branchubub _this, Match match, While a, Assignment d, While w, Assignment b, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						return new Object[] { _this, match, a, d, w, b, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_0_2_SolveCSP_bindingFBBBBBBB(whileulul2branchubub _this,
			Match match, While a, Assignment d, While w, Assignment b, While c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, d, w, b, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, d, w, b, c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whileulul2branchubub _this, Match match, While a, Assignment d, While w, Assignment b, While c) {
		Object[] result_pattern_whileulul2branchubub_0_2_SolveCSP_binding = pattern_whileulul2branchubub_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, a, d, w, b, c);
		if (result_pattern_whileulul2branchubub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_0_2_SolveCSP_black = pattern_whileulul2branchubub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, d, w, b, c };
			}
		}
		return null;
	}

	public static final boolean pattern_whileulul2branchubub_0_3_CheckCSP_expressionFBB(whileulul2branchubub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			While a, Assignment d, While w, Assignment b, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						return new Object[] { match, a, d, w, b, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_0_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
			Match match, While a, Assignment d, While w, Assignment b, While c) {
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(d);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(c);
		String a__b____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String c__d____last_name_prime = "last";
		String c__d____first_name_prime = "first";
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____last);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____first);
		a__b____first.setName(a__b____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		return new Object[] { match, a, d, w, b, c, a__b____first, w__a____first, w__c____next, a__b____last,
				c__d____last, c__d____first };
	}

	public static final Object[] pattern_whileulul2branchubub_0_5_collectcontextelements_blackBBBBBB(Match match,
			While a, Assignment d, While w, Assignment b, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						return new Object[] { match, a, d, w, b, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileulul2branchubub_0_6_registerobjectstomatch_expressionBBBBBBB(
			whileulul2branchubub _this, Match match, While a, Assignment d, While w, Assignment b, While c) {
		_this.registerObjectsToMatch_FWD(match, a, d, w, b, c);

	}

	public static final boolean pattern_whileulul2branchubub_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileulul2branchubub_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("a");
		EObject _localVariable_1 = isApplicableMatch.getObject("d");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("b");
		EObject _localVariable_5 = isApplicableMatch.getObject("c");
		EObject _localVariable_6 = isApplicableMatch.getObject("i");
		EObject tmpA = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpC = _localVariable_5;
		EObject tmpI = _localVariable_6;
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			if (tmpD instanceof Assignment) {
				Assignment d = (Assignment) tmpD;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (tmpC instanceof While) {
								While c = (While) tmpC;
								if (tmpI instanceof Branch) {
									Branch i = (Branch) tmpI;
									return new Object[] { a, d, w2i, w, b, c, i, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_1_1_performtransformation_blackBBBBBBBFBB(While a,
			Assignment d, S2B w2i, While w, Assignment b, While c, Branch i, whileulul2branchubub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { a, d, w2i, w, b, c, i, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileulul2branchubub_1_1_performtransformation_binding = pattern_whileulul2branchubub_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileulul2branchubub_1_1_performtransformation_binding != null) {
			While a = (While) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[0];
			Assignment d = (Assignment) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[2];
			While w = (While) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[3];
			Assignment b = (Assignment) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[4];
			While c = (While) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[5];
			Branch i = (Branch) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[6];

			Object[] result_pattern_whileulul2branchubub_1_1_performtransformation_black = pattern_whileulul2branchubub_1_1_performtransformation_blackBBBBBBBFBB(
					a, d, w2i, w, b, c, i, _this, isApplicableMatch);
			if (result_pattern_whileulul2branchubub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileulul2branchubub_1_1_performtransformation_black[7];

				return new Object[] { a, d, w2i, w, b, c, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_1_1_performtransformation_greenBFFBFFFFFFBBB(While a,
			Assignment d, Assignment b, While c, Branch i) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		c2z.setSource(c);
		d2v.setSource(d);
		d2v.setTarget(v);
		i.setPositive(x);
		c2z.setTarget(z);
		z.setPositive(v);
		i.setNegative(z);
		v.setNext(z);
		b2y.setSource(b);
		x.setPositive(y);
		b2y.setTarget(y);
		y.setNext(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { a, c2z, v, d, d2v, x, z, b2y, y, a2x, b, c, i };
	}

	public static final Object[] pattern_whileulul2branchubub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(While a,
			S2B c2z, Command v, Assignment d, S2N d2v, Branch x, Branch z, S2N b2y, Command y, S2B a2x, Assignment b,
			While c) {
		if (!a.equals(c)) {
			if (!v.equals(y)) {
				if (!x.equals(z)) {
					if (!b2y.equals(d2v)) {
						if (!a2x.equals(c2z)) {
							if (!b.equals(d)) {
								return new Object[] { a, c2z, v, d, d2v, x, z, b2y, y, a2x, b, c };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(While a,
			S2B c2z, Command v, Assignment d, S2N d2v, Branch x, Branch z, S2N b2y, Command y, S2B a2x, Assignment b,
			While c) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(v);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(c);
		return new Object[] { ruleresult, a, c2z, v, d, d2v, x, z, b2y, y, a2x, b, c };
	}

	public static final Object[] pattern_whileulul2branchubub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a, EObject c2z, EObject v, EObject d, EObject d2v, EObject x,
			EObject z, EObject w2i, EObject b2y, EObject y, EObject w, EObject a2x, EObject b, EObject c, EObject i) {
		if (!a.equals(c2z)) {
			if (!a.equals(v)) {
				if (!a.equals(d)) {
					if (!a.equals(d2v)) {
						if (!a.equals(x)) {
							if (!a.equals(z)) {
								if (!a.equals(w2i)) {
									if (!a.equals(b2y)) {
										if (!a.equals(y)) {
											if (!a.equals(w)) {
												if (!a.equals(a2x)) {
													if (!a.equals(b)) {
														if (!a.equals(c)) {
															if (!a.equals(i)) {
																if (!c2z.equals(v)) {
																	if (!c2z.equals(d)) {
																		if (!c2z.equals(d2v)) {
																			if (!c2z.equals(x)) {
																				if (!c2z.equals(z)) {
																					if (!c2z.equals(w2i)) {
																						if (!c2z.equals(y)) {
																							if (!c2z.equals(w)) {
																								if (!c2z.equals(i)) {
																									if (!v.equals(x)) {
																										if (!v.equals(
																												z)) {
																											if (!v.equals(
																													w2i)) {
																												if (!v.equals(
																														y)) {
																													if (!v.equals(
																															w)) {
																														if (!d.equals(
																																v)) {
																															if (!d.equals(
																																	d2v)) {
																																if (!d.equals(
																																		x)) {
																																	if (!d.equals(
																																			z)) {
																																		if (!d.equals(
																																				w2i)) {
																																			if (!d.equals(
																																					y)) {
																																				if (!d.equals(
																																						w)) {
																																					if (!d.equals(
																																							i)) {
																																						if (!d2v.equals(
																																								v)) {
																																							if (!d2v.equals(
																																									x)) {
																																								if (!d2v.equals(
																																										z)) {
																																									if (!d2v.equals(
																																											w2i)) {
																																										if (!d2v.equals(
																																												y)) {
																																											if (!d2v.equals(
																																													w)) {
																																												if (!d2v.equals(
																																														i)) {
																																													if (!x.equals(
																																															z)) {
																																														if (!x.equals(
																																																y)) {
																																															if (!w2i.equals(
																																																	x)) {
																																																if (!w2i.equals(
																																																		z)) {
																																																	if (!w2i.equals(
																																																			y)) {
																																																		if (!b2y.equals(
																																																				c2z)) {
																																																			if (!b2y.equals(
																																																					v)) {
																																																				if (!b2y.equals(
																																																						d)) {
																																																					if (!b2y.equals(
																																																							d2v)) {
																																																						if (!b2y.equals(
																																																								x)) {
																																																							if (!b2y.equals(
																																																									z)) {
																																																								if (!b2y.equals(
																																																										w2i)) {
																																																									if (!b2y.equals(
																																																											y)) {
																																																										if (!b2y.equals(
																																																												w)) {
																																																											if (!b2y.equals(
																																																													c)) {
																																																												if (!b2y.equals(
																																																														i)) {
																																																													if (!y.equals(
																																																															z)) {
																																																														if (!w.equals(
																																																																x)) {
																																																															if (!w.equals(
																																																																	z)) {
																																																																if (!w.equals(
																																																																		w2i)) {
																																																																	if (!w.equals(
																																																																			y)) {
																																																																		if (!a2x.equals(
																																																																				c2z)) {
																																																																			if (!a2x.equals(
																																																																					v)) {
																																																																				if (!a2x.equals(
																																																																						d)) {
																																																																					if (!a2x.equals(
																																																																							d2v)) {
																																																																						if (!a2x.equals(
																																																																								x)) {
																																																																							if (!a2x.equals(
																																																																									z)) {
																																																																								if (!a2x.equals(
																																																																										w2i)) {
																																																																									if (!a2x.equals(
																																																																											b2y)) {
																																																																										if (!a2x.equals(
																																																																												y)) {
																																																																											if (!a2x.equals(
																																																																													w)) {
																																																																												if (!a2x.equals(
																																																																														b)) {
																																																																													if (!a2x.equals(
																																																																															c)) {
																																																																														if (!a2x.equals(
																																																																																i)) {
																																																																															if (!b.equals(
																																																																																	c2z)) {
																																																																																if (!b.equals(
																																																																																		v)) {
																																																																																	if (!b.equals(
																																																																																			d)) {
																																																																																		if (!b.equals(
																																																																																				d2v)) {
																																																																																			if (!b.equals(
																																																																																					x)) {
																																																																																				if (!b.equals(
																																																																																						z)) {
																																																																																					if (!b.equals(
																																																																																							w2i)) {
																																																																																						if (!b.equals(
																																																																																								b2y)) {
																																																																																							if (!b.equals(
																																																																																									y)) {
																																																																																								if (!b.equals(
																																																																																										w)) {
																																																																																									if (!b.equals(
																																																																																											c)) {
																																																																																										if (!b.equals(
																																																																																												i)) {
																																																																																											if (!c.equals(
																																																																																													c2z)) {
																																																																																												if (!c.equals(
																																																																																														v)) {
																																																																																													if (!c.equals(
																																																																																															d)) {
																																																																																														if (!c.equals(
																																																																																																d2v)) {
																																																																																															if (!c.equals(
																																																																																																	x)) {
																																																																																																if (!c.equals(
																																																																																																		z)) {
																																																																																																	if (!c.equals(
																																																																																																			w2i)) {
																																																																																																		if (!c.equals(
																																																																																																				y)) {
																																																																																																			if (!c.equals(
																																																																																																					w)) {
																																																																																																				if (!c.equals(
																																																																																																						i)) {
																																																																																																					if (!i.equals(
																																																																																																							v)) {
																																																																																																						if (!i.equals(
																																																																																																								x)) {
																																																																																																							if (!i.equals(
																																																																																																									z)) {
																																																																																																								if (!i.equals(
																																																																																																										w2i)) {
																																																																																																									if (!i.equals(
																																																																																																											y)) {
																																																																																																										if (!i.equals(
																																																																																																												w)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													a,
																																																																																																													c2z,
																																																																																																													v,
																																																																																																													d,
																																																																																																													d2v,
																																																																																																													x,
																																																																																																													z,
																																																																																																													w2i,
																																																																																																													b2y,
																																																																																																													y,
																																																																																																													w,
																																																																																																													a2x,
																																																																																																													b,
																																																																																																													c,
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
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whileulul2branchubub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject a, EObject c2z, EObject v, EObject d, EObject d2v, EObject x,
			EObject z, EObject b2y, EObject y, EObject w, EObject a2x, EObject b, EObject c, EObject i) {
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileulul2branchubub";
		String a__b____first_name_prime = "first";
		String d2v__d____source_name_prime = "source";
		String d2v__v____target_name_prime = "target";
		String x__y____positive_name_prime = "positive";
		String c2z__z____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String z__v____positive_name_prime = "positive";
		String c2z__c____source_name_prime = "source";
		String c__d____last_name_prime = "last";
		String c__d____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String v__z____next_name_prime = "next";
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____first);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(x__y____positive);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		ruleresult.getCreatedEdges().add(z__v____positive);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____last);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(v__z____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a__b____first.setName(a__b____first_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		return new Object[] { ruleresult, a, c2z, v, d, d2v, x, z, b2y, y, w, a2x, b, c, i, a__b____first,
				d2v__d____source, d2v__v____target, x__y____positive, c2z__z____target, b2y__y____target, y__x____next,
				w__a____first, w__c____next, a__b____last, a2x__x____target, a2x__a____source, b2y__b____source,
				z__v____positive, c2z__c____source, c__d____last, c__d____first, i__x____positive, i__z____negative,
				v__z____next };
	}

	public static final void pattern_whileulul2branchubub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whileulul2branchubub _this, PerformRuleResult ruleresult, EObject a, EObject c2z, EObject v, EObject d,
			EObject d2v, EObject x, EObject z, EObject w2i, EObject b2y, EObject y, EObject w, EObject a2x, EObject b,
			EObject c, EObject i) {
		_this.registerObjects_FWD(ruleresult, a, c2z, v, d, d2v, x, z, w2i, b2y, y, w, a2x, b, c, i);

	}

	public static final PerformRuleResult pattern_whileulul2branchubub_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_2_1_preparereturnvalue_bindingFB(
			whileulul2branchubub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whileulul2branchubub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_2_1_preparereturnvalue_bindingAndBlackFFB(
			whileulul2branchubub _this) {
		Object[] result_pattern_whileulul2branchubub_2_1_preparereturnvalue_binding = pattern_whileulul2branchubub_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileulul2branchubub_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileulul2branchubub_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileulul2branchubub_2_1_preparereturnvalue_black = pattern_whileulul2branchubub_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileulul2branchubub_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileulul2branchubub_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileulul2branchubub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileulul2branchubub_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("a");
		EObject _localVariable_1 = match.getObject("d");
		EObject _localVariable_2 = match.getObject("w");
		EObject _localVariable_3 = match.getObject("b");
		EObject _localVariable_4 = match.getObject("c");
		EObject tmpA = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpC = _localVariable_4;
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			if (tmpD instanceof Assignment) {
				Assignment d = (Assignment) tmpD;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpC instanceof While) {
							While c = (While) tmpC;
							return new Object[] { a, d, w, b, c, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_2_2_corematch_blackBBFBBBFB(While a,
			Assignment d, While w, Assignment b, While c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
								"source")) {
							Branch i = w2i.getTarget();
							if (i != null) {
								_result.add(new Object[] { a, d, w2i, w, b, c, i, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_2_3_findcontext_blackBBBBBBB(While a,
			Assignment d, S2B w2i, While w, Assignment b, While c, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						if (b.equals(a.getFirst())) {
							if (a.equals(w.getFirst())) {
								if (c.equals(w.getNext())) {
									if (w.equals(w2i.getSource())) {
										if (b.equals(a.getLast())) {
											if (d.equals(c.getLast())) {
												if (d.equals(c.getFirst())) {
													if (i.equals(w2i.getTarget())) {
														_result.add(new Object[] { a, d, w2i, w, b, c, i });
													}
												}
											}
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

	public static final Object[] pattern_whileulul2branchubub_2_3_findcontext_greenBBBBBBBFFFFFFFFF(While a,
			Assignment d, S2B w2i, While w, Assignment b, While c, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String a__b____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String c__d____last_name_prime = "last";
		String c__d____first_name_prime = "first";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(i);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____last);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____first);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		a__b____first.setName(a__b____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { a, d, w2i, w, b, c, i, isApplicableMatch, a__b____first, w__a____first, w__c____next,
				w2i__w____source, a__b____last, c__d____last, c__d____first, w2i__i____target };
	}

	public static final Object[] pattern_whileulul2branchubub_2_4_solveCSP_bindingFBBBBBBBBB(whileulul2branchubub _this,
			IsApplicableMatch isApplicableMatch, While a, Assignment d, S2B w2i, While w, Assignment b, While c,
			Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, a, d, w2i, w, b, c, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, d, w2i, w, b, c, i };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch, While a, Assignment d, S2B w2i, While w,
			Assignment b, While c, Branch i) {
		Object[] result_pattern_whileulul2branchubub_2_4_solveCSP_binding = pattern_whileulul2branchubub_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, a, d, w2i, w, b, c, i);
		if (result_pattern_whileulul2branchubub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_2_4_solveCSP_black = pattern_whileulul2branchubub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, d, w2i, w, b, c, i };
			}
		}
		return null;
	}

	public static final boolean pattern_whileulul2branchubub_2_5_checkCSP_expressionFBB(whileulul2branchubub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileulul2branchubub_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileulul2branchubub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileulul2branchubub_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_10_1_initialbindings_blackBBBBBBB(
			whileulul2branchubub _this, Match match, Command v, Branch x, Branch z, Command y, Branch i) {
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						return new Object[] { _this, match, v, x, z, y, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_10_2_SolveCSP_bindingFBBBBBBB(whileulul2branchubub _this,
			Match match, Command v, Branch x, Branch z, Command y, Branch i) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, v, x, z, y, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, v, x, z, y, i };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whileulul2branchubub _this, Match match, Command v, Branch x, Branch z, Command y, Branch i) {
		Object[] result_pattern_whileulul2branchubub_10_2_SolveCSP_binding = pattern_whileulul2branchubub_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, v, x, z, y, i);
		if (result_pattern_whileulul2branchubub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_10_2_SolveCSP_black = pattern_whileulul2branchubub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, v, x, z, y, i };
			}
		}
		return null;
	}

	public static final boolean pattern_whileulul2branchubub_10_3_CheckCSP_expressionFBB(whileulul2branchubub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_10_4_collectelementstobetranslated_blackBBBBBB(
			Match match, Command v, Branch x, Branch z, Command y, Branch i) {
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						return new Object[] { match, v, x, z, y, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_10_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
			Match match, Command v, Branch x, Branch z, Command y, Branch i) {
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(v);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		String x__y____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		String z__v____positive_name_prime = "positive";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String v__z____next_name_prime = "next";
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(x__y____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		match.getToBeTranslatedEdges().add(z__v____positive);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(v__z____next);
		x__y____positive.setName(x__y____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		return new Object[] { match, v, x, z, y, i, x__y____positive, y__x____next, z__v____positive, i__x____positive,
				i__z____negative, v__z____next };
	}

	public static final Object[] pattern_whileulul2branchubub_10_5_collectcontextelements_blackBBBBBB(Match match,
			Command v, Branch x, Branch z, Command y, Branch i) {
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						return new Object[] { match, v, x, z, y, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_10_5_collectcontextelements_greenBB(Match match,
			Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whileulul2branchubub_10_6_registerobjectstomatch_expressionBBBBBBB(
			whileulul2branchubub _this, Match match, Command v, Branch x, Branch z, Command y, Branch i) {
		_this.registerObjectsToMatch_BWD(match, v, x, z, y, i);

	}

	public static final boolean pattern_whileulul2branchubub_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileulul2branchubub_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("v");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("z");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("y");
		EObject _localVariable_5 = isApplicableMatch.getObject("w");
		EObject _localVariable_6 = isApplicableMatch.getObject("i");
		EObject tmpV = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpY = _localVariable_4;
		EObject tmpW = _localVariable_5;
		EObject tmpI = _localVariable_6;
		if (tmpV instanceof Command) {
			Command v = (Command) tmpV;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpY instanceof Command) {
							Command y = (Command) tmpY;
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								if (tmpI instanceof Branch) {
									Branch i = (Branch) tmpI;
									return new Object[] { v, x, z, w2i, y, w, i, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_11_1_performtransformation_blackBBBBBBBFBB(Command v,
			Branch x, Branch z, S2B w2i, Command y, While w, Branch i, whileulul2branchubub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { v, x, z, w2i, y, w, i, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileulul2branchubub_11_1_performtransformation_binding = pattern_whileulul2branchubub_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileulul2branchubub_11_1_performtransformation_binding != null) {
			Command v = (Command) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[0];
			Branch x = (Branch) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[1];
			Branch z = (Branch) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[3];
			Command y = (Command) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[4];
			While w = (While) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[5];
			Branch i = (Branch) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[6];

			Object[] result_pattern_whileulul2branchubub_11_1_performtransformation_black = pattern_whileulul2branchubub_11_1_performtransformation_blackBBBBBBBFBB(
					v, x, z, w2i, y, w, i, _this, isApplicableMatch);
			if (result_pattern_whileulul2branchubub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileulul2branchubub_11_1_performtransformation_black[7];

				return new Object[] { v, x, z, w2i, y, w, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_11_1_performtransformation_greenFFBFFBBFBBFFF(Command v,
			Branch x, Branch z, Command y, While w) {
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		w.setFirst(a);
		c2z.setTarget(z);
		d2v.setSource(d);
		d2v.setTarget(v);
		b2y.setTarget(y);
		a2x.setTarget(x);
		a2x.setSource(a);
		a.setFirst(b);
		a.setLast(b);
		b2y.setSource(b);
		w.setNext(c);
		c2z.setSource(c);
		c.setLast(d);
		c.setFirst(d);
		return new Object[] { a, c2z, v, d, d2v, x, z, b2y, y, w, a2x, b, c };
	}

	public static final Object[] pattern_whileulul2branchubub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(While a,
			S2B c2z, Command v, Assignment d, S2N d2v, Branch x, Branch z, S2N b2y, Command y, S2B a2x, Assignment b,
			While c) {
		if (!a.equals(c)) {
			if (!v.equals(y)) {
				if (!x.equals(z)) {
					if (!b2y.equals(d2v)) {
						if (!a2x.equals(c2z)) {
							if (!b.equals(d)) {
								return new Object[] { a, c2z, v, d, d2v, x, z, b2y, y, a2x, b, c };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(While a,
			S2B c2z, Command v, Assignment d, S2N d2v, Branch x, Branch z, S2N b2y, Command y, S2B a2x, Assignment b,
			While c) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(v);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(c);
		return new Object[] { ruleresult, a, c2z, v, d, d2v, x, z, b2y, y, a2x, b, c };
	}

	public static final Object[] pattern_whileulul2branchubub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a, EObject c2z, EObject v, EObject d, EObject d2v, EObject x,
			EObject z, EObject w2i, EObject b2y, EObject y, EObject w, EObject a2x, EObject b, EObject c, EObject i) {
		if (!a.equals(c2z)) {
			if (!a.equals(v)) {
				if (!a.equals(d)) {
					if (!a.equals(d2v)) {
						if (!a.equals(x)) {
							if (!a.equals(z)) {
								if (!a.equals(w2i)) {
									if (!a.equals(b2y)) {
										if (!a.equals(y)) {
											if (!a.equals(w)) {
												if (!a.equals(a2x)) {
													if (!a.equals(b)) {
														if (!a.equals(c)) {
															if (!a.equals(i)) {
																if (!c2z.equals(v)) {
																	if (!c2z.equals(d)) {
																		if (!c2z.equals(d2v)) {
																			if (!c2z.equals(x)) {
																				if (!c2z.equals(z)) {
																					if (!c2z.equals(w2i)) {
																						if (!c2z.equals(y)) {
																							if (!c2z.equals(w)) {
																								if (!c2z.equals(i)) {
																									if (!v.equals(x)) {
																										if (!v.equals(
																												z)) {
																											if (!v.equals(
																													w2i)) {
																												if (!v.equals(
																														y)) {
																													if (!v.equals(
																															w)) {
																														if (!d.equals(
																																v)) {
																															if (!d.equals(
																																	d2v)) {
																																if (!d.equals(
																																		x)) {
																																	if (!d.equals(
																																			z)) {
																																		if (!d.equals(
																																				w2i)) {
																																			if (!d.equals(
																																					y)) {
																																				if (!d.equals(
																																						w)) {
																																					if (!d.equals(
																																							i)) {
																																						if (!d2v.equals(
																																								v)) {
																																							if (!d2v.equals(
																																									x)) {
																																								if (!d2v.equals(
																																										z)) {
																																									if (!d2v.equals(
																																											w2i)) {
																																										if (!d2v.equals(
																																												y)) {
																																											if (!d2v.equals(
																																													w)) {
																																												if (!d2v.equals(
																																														i)) {
																																													if (!x.equals(
																																															z)) {
																																														if (!x.equals(
																																																y)) {
																																															if (!w2i.equals(
																																																	x)) {
																																																if (!w2i.equals(
																																																		z)) {
																																																	if (!w2i.equals(
																																																			y)) {
																																																		if (!b2y.equals(
																																																				c2z)) {
																																																			if (!b2y.equals(
																																																					v)) {
																																																				if (!b2y.equals(
																																																						d)) {
																																																					if (!b2y.equals(
																																																							d2v)) {
																																																						if (!b2y.equals(
																																																								x)) {
																																																							if (!b2y.equals(
																																																									z)) {
																																																								if (!b2y.equals(
																																																										w2i)) {
																																																									if (!b2y.equals(
																																																											y)) {
																																																										if (!b2y.equals(
																																																												w)) {
																																																											if (!b2y.equals(
																																																													c)) {
																																																												if (!b2y.equals(
																																																														i)) {
																																																													if (!y.equals(
																																																															z)) {
																																																														if (!w.equals(
																																																																x)) {
																																																															if (!w.equals(
																																																																	z)) {
																																																																if (!w.equals(
																																																																		w2i)) {
																																																																	if (!w.equals(
																																																																			y)) {
																																																																		if (!a2x.equals(
																																																																				c2z)) {
																																																																			if (!a2x.equals(
																																																																					v)) {
																																																																				if (!a2x.equals(
																																																																						d)) {
																																																																					if (!a2x.equals(
																																																																							d2v)) {
																																																																						if (!a2x.equals(
																																																																								x)) {
																																																																							if (!a2x.equals(
																																																																									z)) {
																																																																								if (!a2x.equals(
																																																																										w2i)) {
																																																																									if (!a2x.equals(
																																																																											b2y)) {
																																																																										if (!a2x.equals(
																																																																												y)) {
																																																																											if (!a2x.equals(
																																																																													w)) {
																																																																												if (!a2x.equals(
																																																																														b)) {
																																																																													if (!a2x.equals(
																																																																															c)) {
																																																																														if (!a2x.equals(
																																																																																i)) {
																																																																															if (!b.equals(
																																																																																	c2z)) {
																																																																																if (!b.equals(
																																																																																		v)) {
																																																																																	if (!b.equals(
																																																																																			d)) {
																																																																																		if (!b.equals(
																																																																																				d2v)) {
																																																																																			if (!b.equals(
																																																																																					x)) {
																																																																																				if (!b.equals(
																																																																																						z)) {
																																																																																					if (!b.equals(
																																																																																							w2i)) {
																																																																																						if (!b.equals(
																																																																																								b2y)) {
																																																																																							if (!b.equals(
																																																																																									y)) {
																																																																																								if (!b.equals(
																																																																																										w)) {
																																																																																									if (!b.equals(
																																																																																											c)) {
																																																																																										if (!b.equals(
																																																																																												i)) {
																																																																																											if (!c.equals(
																																																																																													c2z)) {
																																																																																												if (!c.equals(
																																																																																														v)) {
																																																																																													if (!c.equals(
																																																																																															d)) {
																																																																																														if (!c.equals(
																																																																																																d2v)) {
																																																																																															if (!c.equals(
																																																																																																	x)) {
																																																																																																if (!c.equals(
																																																																																																		z)) {
																																																																																																	if (!c.equals(
																																																																																																			w2i)) {
																																																																																																		if (!c.equals(
																																																																																																				y)) {
																																																																																																			if (!c.equals(
																																																																																																					w)) {
																																																																																																				if (!c.equals(
																																																																																																						i)) {
																																																																																																					if (!i.equals(
																																																																																																							v)) {
																																																																																																						if (!i.equals(
																																																																																																								x)) {
																																																																																																							if (!i.equals(
																																																																																																									z)) {
																																																																																																								if (!i.equals(
																																																																																																										w2i)) {
																																																																																																									if (!i.equals(
																																																																																																											y)) {
																																																																																																										if (!i.equals(
																																																																																																												w)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													a,
																																																																																																													c2z,
																																																																																																													v,
																																																																																																													d,
																																																																																																													d2v,
																																																																																																													x,
																																																																																																													z,
																																																																																																													w2i,
																																																																																																													b2y,
																																																																																																													y,
																																																																																																													w,
																																																																																																													a2x,
																																																																																																													b,
																																																																																																													c,
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
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whileulul2branchubub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject a, EObject c2z, EObject v, EObject d, EObject d2v, EObject x,
			EObject z, EObject b2y, EObject y, EObject w, EObject a2x, EObject b, EObject c, EObject i) {
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileulul2branchubub";
		String a__b____first_name_prime = "first";
		String d2v__d____source_name_prime = "source";
		String d2v__v____target_name_prime = "target";
		String x__y____positive_name_prime = "positive";
		String c2z__z____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String a2x__x____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String z__v____positive_name_prime = "positive";
		String c2z__c____source_name_prime = "source";
		String c__d____last_name_prime = "last";
		String c__d____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String v__z____next_name_prime = "next";
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____first);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(x__y____positive);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		ruleresult.getTranslatedEdges().add(z__v____positive);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____last);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(v__z____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a__b____first.setName(a__b____first_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		return new Object[] { ruleresult, a, c2z, v, d, d2v, x, z, b2y, y, w, a2x, b, c, i, a__b____first,
				d2v__d____source, d2v__v____target, x__y____positive, c2z__z____target, b2y__y____target, y__x____next,
				w__a____first, w__c____next, a__b____last, a2x__x____target, a2x__a____source, b2y__b____source,
				z__v____positive, c2z__c____source, c__d____last, c__d____first, i__x____positive, i__z____negative,
				v__z____next };
	}

	public static final void pattern_whileulul2branchubub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whileulul2branchubub _this, PerformRuleResult ruleresult, EObject a, EObject c2z, EObject v, EObject d,
			EObject d2v, EObject x, EObject z, EObject w2i, EObject b2y, EObject y, EObject w, EObject a2x, EObject b,
			EObject c, EObject i) {
		_this.registerObjects_BWD(ruleresult, a, c2z, v, d, d2v, x, z, w2i, b2y, y, w, a2x, b, c, i);

	}

	public static final PerformRuleResult pattern_whileulul2branchubub_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_12_1_preparereturnvalue_bindingFB(
			whileulul2branchubub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whileulul2branchubub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_12_1_preparereturnvalue_bindingAndBlackFFB(
			whileulul2branchubub _this) {
		Object[] result_pattern_whileulul2branchubub_12_1_preparereturnvalue_binding = pattern_whileulul2branchubub_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileulul2branchubub_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileulul2branchubub_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileulul2branchubub_12_1_preparereturnvalue_black = pattern_whileulul2branchubub_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileulul2branchubub_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileulul2branchubub_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileulul2branchubub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileulul2branchubub_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("v");
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("z");
		EObject _localVariable_3 = match.getObject("y");
		EObject _localVariable_4 = match.getObject("i");
		EObject tmpV = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpI = _localVariable_4;
		if (tmpV instanceof Command) {
			Command v = (Command) tmpV;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							return new Object[] { v, x, z, y, i, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_12_2_corematch_blackBBBFBFBB(Command v,
			Branch x, Branch z, Command y, Branch i, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
								"target")) {
							Statement tmpW = w2i.getSource();
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								_result.add(new Object[] { v, x, z, w2i, y, w, i, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_12_3_findcontext_blackBBBBBBB(Command v,
			Branch x, Branch z, S2B w2i, Command y, While w, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						if (y.equals(x.getPositive())) {
							if (x.equals(y.getNext())) {
								if (w.equals(w2i.getSource())) {
									if (v.equals(z.getPositive())) {
										if (x.equals(i.getPositive())) {
											if (i.equals(w2i.getTarget())) {
												if (z.equals(i.getNegative())) {
													if (z.equals(v.getNext())) {
														_result.add(new Object[] { v, x, z, w2i, y, w, i });
													}
												}
											}
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

	public static final Object[] pattern_whileulul2branchubub_12_3_findcontext_greenBBBBBBBFFFFFFFFF(Command v,
			Branch x, Branch z, S2B w2i, Command y, While w, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String x__y____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		String z__v____positive_name_prime = "positive";
		String i__x____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		String i__z____negative_name_prime = "negative";
		String v__z____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(v);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(i);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(x__y____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		isApplicableMatch.getAllContextElements().add(z__v____positive);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(v__z____next);
		x__y____positive.setName(x__y____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		return new Object[] { v, x, z, w2i, y, w, i, isApplicableMatch, x__y____positive, y__x____next,
				w2i__w____source, z__v____positive, i__x____positive, w2i__i____target, i__z____negative,
				v__z____next };
	}

	public static final Object[] pattern_whileulul2branchubub_12_4_solveCSP_bindingFBBBBBBBBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch, Command v, Branch x, Branch z, S2B w2i,
			Command y, While w, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, v, x, z, w2i, y, w, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, v, x, z, w2i, y, w, i };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch, Command v, Branch x, Branch z, S2B w2i,
			Command y, While w, Branch i) {
		Object[] result_pattern_whileulul2branchubub_12_4_solveCSP_binding = pattern_whileulul2branchubub_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, v, x, z, w2i, y, w, i);
		if (result_pattern_whileulul2branchubub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_12_4_solveCSP_black = pattern_whileulul2branchubub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, v, x, z, w2i, y, w, i };
			}
		}
		return null;
	}

	public static final boolean pattern_whileulul2branchubub_12_5_checkCSP_expressionFBB(whileulul2branchubub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileulul2branchubub_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileulul2branchubub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileulul2branchubub_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_20_1_preparereturnvalue_bindingFB(
			whileulul2branchubub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileulul2branchubub _this) {
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

	public static final Object[] pattern_whileulul2branchubub_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whileulul2branchubub _this) {
		Object[] result_pattern_whileulul2branchubub_20_1_preparereturnvalue_binding = pattern_whileulul2branchubub_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileulul2branchubub_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileulul2branchubub_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileulul2branchubub_20_1_preparereturnvalue_black = pattern_whileulul2branchubub_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileulul2branchubub_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileulul2branchubub_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileulul2branchubub_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_0B(Command v) {
		for (Graph __DEC_v_root_219595 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_1BBBB(Command v,
			Branch x, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_positive_761631 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!x.equals(__DEC_v_positive_761631)) {
							if (!z.equals(__DEC_v_positive_761631)) {
								if (!i.equals(__DEC_v_positive_761631)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_2BBBB(Command v,
			Branch x, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_negative_988398 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!x.equals(__DEC_v_negative_988398)) {
							if (!z.equals(__DEC_v_negative_988398)) {
								if (!i.equals(__DEC_v_negative_988398)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_116280 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_4BBB(Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_601103 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_601103)) {
							if (!z.equals(__DEC_x_positive_601103)) {
								if (!i.equals(__DEC_x_positive_601103)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_5BBB(Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_530735 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_530735)) {
							if (!z.equals(__DEC_x_negative_530735)) {
								if (!i.equals(__DEC_x_negative_530735)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_213759 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_7BBB(Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_658928 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_658928)) {
							if (!x.equals(__DEC_z_positive_658928)) {
								if (!i.equals(__DEC_z_positive_658928)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_8BBB(Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_349543 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_349543)) {
							if (!x.equals(__DEC_z_negative_349543)) {
								if (!i.equals(__DEC_z_negative_349543)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_9B(Command y) {
		for (Graph __DEC_y_root_308730 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_10BBBB(Command y,
			Branch x, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_positive_679683 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_679683)) {
							if (!z.equals(__DEC_y_positive_679683)) {
								if (!i.equals(__DEC_y_positive_679683)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_11BBBB(Command y,
			Branch x, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_negative_360165 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_360165)) {
							if (!z.equals(__DEC_y_negative_360165)) {
								if (!i.equals(__DEC_y_negative_360165)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_12BB(Branch x,
			Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_13BB(Branch i,
			Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_15BB(Branch z,
			Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_16BB(Branch i,
			Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_17BB(Branch x,
			Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_18BB(Branch x,
			Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_19BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_20BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_21BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_22BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_23BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_20_2_testcorematchandDECs_blackFFFFFB(
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
						if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_3B(x) == null) {
							if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_9B(y) == null) {
								if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_21BB(x,
										y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!i.equals(x)) {
											Node tmpZ = i.getNegative();
											if (tmpZ instanceof Branch) {
												Branch z = (Branch) tmpZ;
												if (!x.equals(z)) {
													if (!i.equals(z)) {
														Node tmpV = z.getPositive();
														if (tmpV instanceof Command) {
															Command v = (Command) tmpV;
															if (!v.equals(y)) {
																if (z.equals(v.getNext())) {
																	if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_20BB(
																			i, y) == null) {
																		if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_23BB(
																				i, y) == null) {
																			if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_4BBB(
																					x, z, i) == null) {
																				if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_5BBB(
																						x, z, i) == null) {
																					if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_6B(
																							z) == null) {
																						if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_7BBB(
																								z, x, i) == null) {
																							if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_8BBB(
																									z, x, i) == null) {
																								if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_10BBBB(
																										y, x, z,
																										i) == null) {
																									if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_11BBBB(
																											y, x, z,
																											i) == null) {
																										if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_17BB(
																												x,
																												z) == null) {
																											if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_18BB(
																													x,
																													z) == null) {
																												if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_19BB(
																														z,
																														y) == null) {
																													if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_22BB(
																															z,
																															y) == null) {
																														if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_0B(
																																v) == null) {
																															if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_1BBBB(
																																	v,
																																	x,
																																	z,
																																	i) == null) {
																																if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_2BBBB(
																																		v,
																																		x,
																																		z,
																																		i) == null) {
																																	if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_12BB(
																																			x,
																																			v) == null) {
																																		if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_13BB(
																																				i,
																																				v) == null) {
																																			if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_14BB(
																																					x,
																																					v) == null) {
																																				if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_15BB(
																																						z,
																																						v) == null) {
																																					if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_16BB(
																																							i,
																																							v) == null) {
																																						_result.add(
																																								new Object[] {
																																										v,
																																										x,
																																										z,
																																										y,
																																										i,
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

		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileulul2branchubub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			whileulul2branchubub _this, Match match, Command v, Branch x, Branch z, Command y, Branch i) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, v, x, z, y, i);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileulul2branchubub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileulul2branchubub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileulul2branchubub_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_21_1_preparereturnvalue_bindingFB(
			whileulul2branchubub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileulul2branchubub _this) {
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

	public static final Object[] pattern_whileulul2branchubub_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whileulul2branchubub _this) {
		Object[] result_pattern_whileulul2branchubub_21_1_preparereturnvalue_binding = pattern_whileulul2branchubub_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileulul2branchubub_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileulul2branchubub_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileulul2branchubub_21_1_preparereturnvalue_black = pattern_whileulul2branchubub_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileulul2branchubub_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileulul2branchubub_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileulul2branchubub_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_0B(While a) {
		for (Decision __DEC_a_positive_67559 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_1B(While a) {
		for (Decision __DEC_a_negative_237931 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_2BBB(While a, While w,
			While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_728485 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_728485)) {
							if (!w.equals(__DEC_a_last_728485)) {
								if (!c.equals(__DEC_a_last_728485)) {
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_3B(While a) {
		for (Program __DEC_a_first_753311 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_4B(Assignment d) {
		for (Decision __DEC_d_positive_839502 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_5B(Assignment d) {
		for (Decision __DEC_d_negative_213730 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_6BBBB(Assignment d,
			While a, While w, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_d_last_82207 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!a.equals(__DEC_d_last_82207)) {
							if (!w.equals(__DEC_d_last_82207)) {
								if (!c.equals(__DEC_d_last_82207)) {
									return new Object[] { d, a, w, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_7B(Assignment d) {
		for (Program __DEC_d_first_285793 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_8B(Assignment b) {
		for (Decision __DEC_b_positive_777039 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_9B(Assignment b) {
		for (Decision __DEC_b_negative_972324 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_10BBBB(Assignment b,
			While a, While w, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_b_last_592456 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!a.equals(__DEC_b_last_592456)) {
							if (!w.equals(__DEC_b_last_592456)) {
								if (!c.equals(__DEC_b_last_592456)) {
									return new Object[] { b, a, w, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_11B(Assignment b) {
		for (Program __DEC_b_first_974953 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_12B(While c) {
		for (Decision __DEC_c_positive_477630 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_13B(While c) {
		for (Decision __DEC_c_negative_568382 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_14BBB(While c,
			While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_795508 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_795508)) {
							if (!a.equals(__DEC_c_first_795508)) {
								if (!w.equals(__DEC_c_first_795508)) {
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_15BBB(While c,
			While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_773229 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_773229)) {
							if (!a.equals(__DEC_c_last_773229)) {
								if (!w.equals(__DEC_c_last_773229)) {
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_16B(While c) {
		for (Program __DEC_c_first_274696 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_17BB(While a,
			Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_18BB(While w,
			Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_19BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_20BB(While c,
			Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_21BB(While a,
			While c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_22BB(While w,
			While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_23BB(While a,
			While c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_24BB(While w,
			While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpA = _edge_first.getSrc();
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			EObject tmpB = _edge_first.getTrg();
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (b.equals(a.getFirst())) {
					if (b.equals(a.getLast())) {
						if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_0B(a) == null) {
							if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_1B(a) == null) {
								if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_3B(a) == null) {
									if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_8B(
											b) == null) {
										if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_9B(
												b) == null) {
											if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_11B(
													b) == null) {
												for (While w : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(a, While.class, "first")) {
													if (!a.equals(w)) {
														Statement tmpC = w.getNext();
														if (tmpC instanceof While) {
															While c = (While) tmpC;
															if (!a.equals(c)) {
																if (!c.equals(w)) {
																	Statement tmpD = c.getLast();
																	if (tmpD instanceof Assignment) {
																		Assignment d = (Assignment) tmpD;
																		if (!b.equals(d)) {
																			if (d.equals(c.getFirst())) {
																				if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_19BB(
																						w, b) == null) {
																					if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_2BBB(
																							a, w, c) == null) {
																						if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_10BBBB(
																								b, a, w, c) == null) {
																							if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_12B(
																									c) == null) {
																								if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_13B(
																										c) == null) {
																									if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_14BBB(
																											c, a,
																											w) == null) {
																										if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_15BBB(
																												c, a,
																												w) == null) {
																											if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_16B(
																													c) == null) {
																												if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_20BB(
																														c,
																														b) == null) {
																													if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_21BB(
																															a,
																															c) == null) {
																														if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_22BB(
																																w,
																																c) == null) {
																															if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_23BB(
																																	a,
																																	c) == null) {
																																if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_24BB(
																																		w,
																																		c) == null) {
																																	if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_4B(
																																			d) == null) {
																																		if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_5B(
																																				d) == null) {
																																			if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_6BBBB(
																																					d,
																																					a,
																																					w,
																																					c) == null) {
																																				if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_7B(
																																						d) == null) {
																																					if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_17BB(
																																							a,
																																							d) == null) {
																																						if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_18BB(
																																								w,
																																								d) == null) {
																																							_result.add(
																																									new Object[] {
																																											a,
																																											d,
																																											w,
																																											b,
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

		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileulul2branchubub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			whileulul2branchubub _this, Match match, While a, Assignment d, While w, Assignment b, While c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, d, w, b, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileulul2branchubub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileulul2branchubub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileulul2branchubub_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_24_1_prepare_blackB(whileulul2branchubub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileulul2branchubub_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whileulul2branchubub_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("a");
		EObject _localVariable_1 = targetMatch.getObject("v");
		EObject _localVariable_2 = sourceMatch.getObject("d");
		EObject _localVariable_3 = targetMatch.getObject("x");
		EObject _localVariable_4 = targetMatch.getObject("z");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject _localVariable_6 = sourceMatch.getObject("w");
		EObject _localVariable_7 = sourceMatch.getObject("b");
		EObject _localVariable_8 = sourceMatch.getObject("c");
		EObject _localVariable_9 = targetMatch.getObject("i");
		EObject tmpA = _localVariable_0;
		EObject tmpV = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpW = _localVariable_6;
		EObject tmpB = _localVariable_7;
		EObject tmpC = _localVariable_8;
		EObject tmpI = _localVariable_9;
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			if (tmpV instanceof Command) {
				Command v = (Command) tmpV;
				if (tmpD instanceof Assignment) {
					Assignment d = (Assignment) tmpD;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpZ instanceof Branch) {
							Branch z = (Branch) tmpZ;
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								if (tmpW instanceof While) {
									While w = (While) tmpW;
									if (tmpB instanceof Assignment) {
										Assignment b = (Assignment) tmpB;
										if (tmpC instanceof While) {
											While c = (While) tmpC;
											if (tmpI instanceof Branch) {
												Branch i = (Branch) tmpI;
												return new Object[] { a, v, d, x, z, y, w, b, c, i, sourceMatch,
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

	public static final Object[] pattern_whileulul2branchubub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(While a,
			Command v, Assignment d, Branch x, Branch z, Command y, While w, Assignment b, While c, Branch i,
			Match sourceMatch, Match targetMatch) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!v.equals(y)) {
					if (!x.equals(z)) {
						if (!b.equals(d)) {
							if (!c.equals(w)) {
								if (!i.equals(x)) {
									if (!i.equals(z)) {
										if (!sourceMatch.equals(targetMatch)) {
											return new Object[] { a, v, d, x, z, y, w, b, c, i, sourceMatch,
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

	public static final Object[] pattern_whileulul2branchubub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding = pattern_whileulul2branchubub_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding != null) {
			While a = (While) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[0];
			Command v = (Command) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[1];
			Assignment d = (Assignment) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[2];
			Branch x = (Branch) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[3];
			Branch z = (Branch) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[4];
			Command y = (Command) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[5];
			While w = (While) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[6];
			Assignment b = (Assignment) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[7];
			While c = (While) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[8];
			Branch i = (Branch) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_black = pattern_whileulul2branchubub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					a, v, d, x, z, y, w, b, c, i, sourceMatch, targetMatch);
			if (result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { a, v, d, x, z, y, w, b, c, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			whileulul2branchubub _this, While a, Command v, Assignment d, Branch x, Branch z, Command y, While w,
			Assignment b, While c, Branch i, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(a, v, d, x, z, y, w, b, c, i, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, a, v, d, x, z, y, w, b, c, i, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			whileulul2branchubub _this, While a, Command v, Assignment d, Branch x, Branch z, Command y, While w,
			Assignment b, While c, Branch i, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileulul2branchubub_24_3_solvecsp_binding = pattern_whileulul2branchubub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, a, v, d, x, z, y, w, b, c, i, sourceMatch, targetMatch);
		if (result_pattern_whileulul2branchubub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileulul2branchubub_24_3_solvecsp_black = pattern_whileulul2branchubub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, a, v, d, x, z, y, w, b, c, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileulul2branchubub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_24_5_matchcorrcontext_blackFBBBB(While w,
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

	public static final Object[] pattern_whileulul2branchubub_24_5_matchcorrcontext_greenBBBF(S2B w2i,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whileulul2branchubub";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whileulul2branchubub_24_6_createcorrespondence_blackBBBBBBBBBBB(While a,
			Command v, Assignment d, Branch x, Branch z, Command y, While w, Assignment b, While c, Branch i,
			CCMatch ccMatch) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!v.equals(y)) {
					if (!x.equals(z)) {
						if (!b.equals(d)) {
							if (!c.equals(w)) {
								if (!i.equals(x)) {
									if (!i.equals(z)) {
										return new Object[] { a, v, d, x, z, y, w, b, c, i, ccMatch };
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

	public static final Object[] pattern_whileulul2branchubub_24_6_createcorrespondence_greenBFBBFBBFBFBBB(While a,
			Command v, Assignment d, Branch x, Branch z, Command y, Assignment b, While c, CCMatch ccMatch) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		d2v.setSource(d);
		d2v.setTarget(v);
		ccMatch.getCreateCorr().add(d2v);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { a, c2z, v, d, d2v, x, z, b2y, y, a2x, b, c, ccMatch };
	}

	public static final Object[] pattern_whileulul2branchubub_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whileulul2branchubub_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whileulul2branchubub";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whileulul2branchubub_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_0B(While a) {
		for (Decision __DEC_a_positive_97567 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_1B(While a) {
		for (Decision __DEC_a_negative_117839 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_2BBB(While a, While w,
			While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_694890 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_694890)) {
							if (!w.equals(__DEC_a_last_694890)) {
								if (!c.equals(__DEC_a_last_694890)) {
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_3B(While a) {
		for (Program __DEC_a_first_494394 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_4B(Assignment d) {
		for (Decision __DEC_d_positive_383060 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_5B(Assignment d) {
		for (Decision __DEC_d_negative_603415 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_6BBBB(Assignment d,
			While a, While w, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_d_last_595237 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!a.equals(__DEC_d_last_595237)) {
							if (!w.equals(__DEC_d_last_595237)) {
								if (!c.equals(__DEC_d_last_595237)) {
									return new Object[] { d, a, w, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_7B(Assignment d) {
		for (Program __DEC_d_first_25593 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_8B(Assignment b) {
		for (Decision __DEC_b_positive_354703 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_9B(Assignment b) {
		for (Decision __DEC_b_negative_38251 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_10BBBB(Assignment b,
			While a, While w, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_b_last_655829 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!a.equals(__DEC_b_last_655829)) {
							if (!w.equals(__DEC_b_last_655829)) {
								if (!c.equals(__DEC_b_last_655829)) {
									return new Object[] { b, a, w, c };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_11B(Assignment b) {
		for (Program __DEC_b_first_15970 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_12B(While c) {
		for (Decision __DEC_c_positive_236394 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_13B(While c) {
		for (Decision __DEC_c_negative_121887 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_14BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_76487 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_76487)) {
							if (!a.equals(__DEC_c_first_76487)) {
								if (!w.equals(__DEC_c_first_76487)) {
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_15BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_177908 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_177908)) {
							if (!a.equals(__DEC_c_last_177908)) {
								if (!w.equals(__DEC_c_last_177908)) {
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_16B(While c) {
		for (Program __DEC_c_first_306722 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_17BB(While a,
			Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_18BB(While w,
			Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_19BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_20BB(While c,
			Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_21BB(While a, While c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_22BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_23BB(While a, While c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_24BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_blackBBBBB(While a, Assignment d,
			While w, Assignment b, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!b.equals(d)) {
					if (!c.equals(w)) {
						if (b.equals(a.getFirst())) {
							if (a.equals(w.getFirst())) {
								if (c.equals(w.getNext())) {
									if (b.equals(a.getLast())) {
										if (d.equals(c.getLast())) {
											if (d.equals(c.getFirst())) {
												if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_0B(
														a) == null) {
													if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_1B(
															a) == null) {
														if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_2BBB(
																a, w, c) == null) {
															if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_3B(
																	a) == null) {
																if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_4B(
																		d) == null) {
																	if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_5B(
																			d) == null) {
																		if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_6BBBB(
																				d, a, w, c) == null) {
																			if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_7B(
																					d) == null) {
																				if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_8B(
																						b) == null) {
																					if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_9B(
																							b) == null) {
																						if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_10BBBB(
																								b, a, w, c) == null) {
																							if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_11B(
																									b) == null) {
																								if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_12B(
																										c) == null) {
																									if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_13B(
																											c) == null) {
																										if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_14BBB(
																												c, a,
																												w) == null) {
																											if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_15BBB(
																													c,
																													a,
																													w) == null) {
																												if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_16B(
																														c) == null) {
																													if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_17BB(
																															a,
																															d) == null) {
																														if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_18BB(
																																w,
																																d) == null) {
																															if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_19BB(
																																	w,
																																	b) == null) {
																																if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_20BB(
																																		c,
																																		b) == null) {
																																	if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_21BB(
																																			a,
																																			c) == null) {
																																		if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_22BB(
																																				w,
																																				c) == null) {
																																			if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_23BB(
																																					a,
																																					c) == null) {
																																				if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_24BB(
																																						w,
																																						c) == null) {
																																					return new Object[] {
																																							a,
																																							d,
																																							w,
																																							b,
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
		return null;
	}

	public static final boolean pattern_whileulul2branchubub_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileulul2branchubub_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_0B(Command v) {
		for (Graph __DEC_v_root_709515 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_1BBBB(Command v, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_positive_497976 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!x.equals(__DEC_v_positive_497976)) {
							if (!z.equals(__DEC_v_positive_497976)) {
								if (!i.equals(__DEC_v_positive_497976)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_2BBBB(Command v, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_negative_579849 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!x.equals(__DEC_v_negative_579849)) {
							if (!z.equals(__DEC_v_negative_579849)) {
								if (!i.equals(__DEC_v_negative_579849)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_966921 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_4BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_78075 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_78075)) {
							if (!z.equals(__DEC_x_positive_78075)) {
								if (!i.equals(__DEC_x_positive_78075)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_5BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_837639 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_837639)) {
							if (!z.equals(__DEC_x_negative_837639)) {
								if (!i.equals(__DEC_x_negative_837639)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_794019 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_7BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_111399 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_111399)) {
							if (!x.equals(__DEC_z_positive_111399)) {
								if (!i.equals(__DEC_z_positive_111399)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_8BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_595689 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_595689)) {
							if (!x.equals(__DEC_z_negative_595689)) {
								if (!i.equals(__DEC_z_negative_595689)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_9B(Command y) {
		for (Graph __DEC_y_root_16864 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_10BBBB(Command y, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_positive_795157 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_795157)) {
							if (!z.equals(__DEC_y_positive_795157)) {
								if (!i.equals(__DEC_y_positive_795157)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_11BBBB(Command y, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_negative_934692 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_934692)) {
							if (!z.equals(__DEC_y_negative_934692)) {
								if (!i.equals(__DEC_y_negative_934692)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_12BB(Branch x, Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_13BB(Branch i, Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_14BB(Branch x, Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_15BB(Branch z, Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_16BB(Branch i, Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_17BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_18BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_19BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_20BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_21BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_22BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_23BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_blackBBBBB(Command v, Branch x,
			Branch z, Command y, Branch i) {
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						if (y.equals(x.getPositive())) {
							if (x.equals(y.getNext())) {
								if (v.equals(z.getPositive())) {
									if (x.equals(i.getPositive())) {
										if (z.equals(i.getNegative())) {
											if (z.equals(v.getNext())) {
												if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_0B(
														v) == null) {
													if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_1BBBB(
															v, x, z, i) == null) {
														if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_2BBBB(
																v, x, z, i) == null) {
															if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_3B(
																	x) == null) {
																if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_4BBB(
																		x, z, i) == null) {
																	if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_5BBB(
																			x, z, i) == null) {
																		if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_6B(
																				z) == null) {
																			if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_7BBB(
																					z, x, i) == null) {
																				if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_8BBB(
																						z, x, i) == null) {
																					if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_9B(
																							y) == null) {
																						if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_10BBBB(
																								y, x, z, i) == null) {
																							if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_11BBBB(
																									y, x, z,
																									i) == null) {
																								if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_12BB(
																										x, v) == null) {
																									if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_13BB(
																											i,
																											v) == null) {
																										if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_14BB(
																												x,
																												v) == null) {
																											if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_15BB(
																													z,
																													v) == null) {
																												if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_16BB(
																														i,
																														v) == null) {
																													if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_17BB(
																															x,
																															z) == null) {
																														if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_18BB(
																																x,
																																z) == null) {
																															if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_19BB(
																																	z,
																																	y) == null) {
																																if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_20BB(
																																		i,
																																		y) == null) {
																																	if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_21BB(
																																			x,
																																			y) == null) {
																																		if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_22BB(
																																				z,
																																				y) == null) {
																																			if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_23BB(
																																					i,
																																					y) == null) {
																																				return new Object[] {
																																						v,
																																						x,
																																						z,
																																						y,
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

	public static final boolean pattern_whileulul2branchubub_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileulul2branchubub_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_29_1_createresult_blackB(whileulul2branchubub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileulul2branchubub_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									w2i) == null) {
								if (pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										w) == null) {
									if (pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileulul2branchubub_29_3_solveCSP_bindingFBBBBBB(whileulul2branchubub _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w2i, w, i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileulul2branchubub_29_3_solveCSP_binding = pattern_whileulul2branchubub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w2i, w, i, ruleResult);
		if (result_pattern_whileulul2branchubub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_29_3_solveCSP_black = pattern_whileulul2branchubub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whileulul2branchubub_29_4_checkCSP_expressionFBB(whileulul2branchubub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileulul2branchubub_29_5_checknacs_blackBBB(S2B w2i, While w, Branch i) {
		return new Object[] { w2i, w, i };
	}

	public static final Object[] pattern_whileulul2branchubub_29_6_perform_blackBBBB(S2B w2i, While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w2i, w, i, ruleResult };
	}

	public static final Object[] pattern_whileulul2branchubub_29_6_perform_greenFFFFFFFFFBFFFBB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		ruleResult.getCorrObjects().add(c2z);
		ruleResult.getTargetObjects().add(v);
		ruleResult.getSourceObjects().add(d);
		d2v.setSource(d);
		d2v.setTarget(v);
		ruleResult.getCorrObjects().add(d2v);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		c2z.setTarget(z);
		z.setPositive(v);
		i.setNegative(z);
		v.setNext(z);
		ruleResult.getTargetObjects().add(z);
		ruleResult.getCorrObjects().add(b2y);
		x.setPositive(y);
		b2y.setTarget(y);
		y.setNext(x);
		ruleResult.getTargetObjects().add(y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		a.setFirst(b);
		a.setLast(b);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		w.setNext(c);
		c2z.setSource(c);
		c.setLast(d);
		c.setFirst(d);
		ruleResult.getSourceObjects().add(c);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a, c2z, v, d, d2v, x, z, b2y, y, w, a2x, b, c, i, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileulul2branchubub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileulul2branchububImpl
